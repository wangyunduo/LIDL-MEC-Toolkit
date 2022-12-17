package core.parser;

import core.common.ch.CharIter;
import core.common.log.BetterLogger;
import core.common.log.BetterToString;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.parser.token.Token;
import core.parser.token.TokenType;
import core.parser.token.TokenizeState;
import core.parser.token.Tokenizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Analyser
{
	private final Graph lidl = new Graph();
	private TokenizeState state;
	private List<File> srcs;

	private Token peekedToken = null;

	public Analyser()
	{
		reset();
	}

	public void reset()
	{
		state = TokenizeState.Normal;
		resetIter();
		srcs = new ArrayList<>();
	}

	public void resetIter()
	{
		tk = null;
		peekedToken = null;
	}


	private Tokenizer tk = null;

	public void analyse()
	{
		GraphNode root = new GraphNode(GraphNode.Type.ProgramRoot);
		lidl.addNode(root);

		for (var f : srcs)
		{
			try
			{
				tk = new Tokenizer(new CharIter(new Scanner(new FileInputStream(f))));
			} catch (FileNotFoundException e)
			{
				BetterLogger.error("Analyser", String.format("File <%s> not found", f.getName()));
				System.exit(-1);
			}
			GraphNode module = analyseSingle(f.getName());
			resetIter();
			lidl.addEdge(new GraphEdge(root, module, GraphEdge.Type.Root2Module));
		}

		lidl.setRoot(root);
	}

	private GraphNode analyseSingle(String fileName)
	{
		GraphNode module = new GraphNode(GraphNode.Type.ModuleRoot);
		lidl.addNode(module);

		module.addMeta(GraphNode.MetaType.Name, fileName);
		String pkg = analysePackage();
		module.addMeta(GraphNode.MetaType.Package, pkg);
		List<String> imports = analyseImports();
		module.addMeta(GraphNode.MetaType.Imports, imports);

		while (!isNext(TokenType.EOF))
		{
			GraphNode def = analyseDefinition();

			GraphEdge module2def = new GraphEdge(module, def, GraphEdge.Type.Module2Def);
			lidl.addEdge(module2def);
		}
		return module;
	}

	private String analysePackage()
	{
		if (!isNext(TokenType.KW_Package))
		{
			return "default";
		}
		getNext(TokenType.KW_Package);
		String pkg = (String) getNext(TokenType.ID_Qualified).getValue();
		BetterLogger.debug("Analyser", String.format("Package <%s>", pkg));
		getNext(TokenType.SemiColon);
		return pkg;
	}

	private List<String> analyseImports()
	{
		List<String> res = new ArrayList<>();
		while (isNext(TokenType.KW_Import))
		{
			getNext();
			String imt = (String) getNext(TokenType.ID_Qualified).getValue();
			BetterLogger.debug("Analyser", String.format("Import <%s>", imt));
			res.add(imt);
			getNext(TokenType.SemiColon);
		}
		return res;
	}

	private GraphNode analyseDefinition()
	{
		assertNext(TokenType.KW_Data, TokenType.KW_Interface, TokenType.KW_Interaction);
		Token t = peekNext();
		switch (t.getType())
		{
			case KW_Data:
				return analyseDataDefinition();
			case KW_Interface:
				return analyseInterfaceDefinition();
			case KW_Interaction:
				return analyseInteractionDefinition();
			default:
				unreachable("not a definition");
		}
		return null;
	}

	private GraphNode analyseDataDefinition()
	{
		GraphNode dd = new GraphNode(GraphNode.Type.DataDefinition);
		lidl.addNode(dd);

		// data
		getNext(TokenType.KW_Data);
		// [ID]
		String id = (String) getNext(TokenType.ID_Qualified).getValue();
		dd.addMeta(GraphNode.MetaType.Name, id);
		// with
		if (isNext(TokenType.KW_With))
		{
			getNext(TokenType.KW_With);
			while (isNext(TokenType.KW_Data))
			{
				GraphNode ndd = analyseDataDefinition();
				GraphEdge dd2ndd = new GraphEdge(dd, ndd, GraphEdge.Type.Data2NestData);
				lidl.addEdge(dd2ndd);
			}
		}
		// is
		getNext(TokenType.KW_Is);
		// [DEF]

		List<GraphNode> dtes = analyseDataTypeElements();
		for (var dte : dtes)
		{
			GraphEdge dt2dte = new GraphEdge(dd, dte, GraphEdge.Type.Data2DataTypeElem);
			lidl.addEdge(dt2dte);
		}

		return dd;
	}


	private List<GraphNode> analyseDataTypeElements()
	{
		List<GraphNode> dts = new ArrayList<>();

		if (isNext(TokenType.LBrace))
		{
			// composite data type
			// {
			getNext(TokenType.LBrace);
			// [elem]
			GraphNode dte = analyseDataTypeElement();
			dts.add(dte);
			while (isNext(TokenType.Comma))
			{
				// ,
				getNext(TokenType.Comma);
				// [elem]
				dte = analyseDataTypeElement();
				dts.add(dte);
			}
			// }
			getNext(TokenType.RBrace);
		}
		else
		{
			/*
			We take refDataType as another kind of compositeDataType which contains only one
			composite data type element named "theData"
			*/
			// reference data type | function data type
			GraphNode dte = new GraphNode(GraphNode.Type.DataTypeElem);
			lidl.addNode(dte);

			// [elem]
			// [type]
			String rdt = (String) getNext(TokenType.ID_Qualified).getValue();

			if (isNext(TokenType.RightArrow))
			{
				// ->
				getNext(TokenType.RightArrow);
				// [type]
				String rodt = (String) getNext(TokenType.ID_Qualified).getValue();
				rdt += "->" + rodt;
				dte.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Function);
			}
			else
			{
				dte.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Reference);
			}

			dte.addMeta(GraphNode.MetaType.Name, "theData");
			dte.addMeta(GraphNode.MetaType.SubType, rdt);
			dts.add(dte);
		}
		return dts;
	}

	private GraphNode analyseDataTypeElement()
	{
		GraphNode dte = new GraphNode(GraphNode.Type.DataTypeElem);
		lidl.addNode(dte);

		// [name]
		String name = (String) getNext(TokenType.ID_Qualified).getValue();
		// :
		getNext(TokenType.Colon);
		// [type]
		String rdt = (String) getNext(TokenType.ID_Qualified).getValue();

		dte.addMeta(GraphNode.MetaType.Name, name);
		dte.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Reference);
		dte.addMeta(GraphNode.MetaType.SubType, rdt);

		return dte;
	}

	private GraphNode analyseInterfaceDefinition()
	{
		GraphNode ifd = new GraphNode(GraphNode.Type.InterfaceDefinition);
		lidl.addNode(ifd);

		// interface
		getNext(TokenType.KW_Interface);
		// [ID]
		String id = (String) getNext(TokenType.ID_Qualified).getValue();
		ifd.addMeta(GraphNode.MetaType.Name, id);
		// with
		if (isNext(TokenType.KW_With))
		{
			getNext(TokenType.KW_With);
			while (isNext(TokenType.KW_Interface))
			{
				GraphNode nifd = analyseInterfaceDefinition();

				GraphEdge ifd2nifd = new GraphEdge(ifd, nifd, GraphEdge.Type.Interface2NestInterface);
				lidl.addEdge(ifd2nifd);
			}
		}
		// is
		getNext(TokenType.KW_Is);
		// [DEF]
		List<GraphNode> iftes = analyseInterfaceType();
		for (var ifte : iftes)
		{
			GraphEdge ifd2ifte = new GraphEdge(ifd, ifte, GraphEdge.Type.Interface2InterfaceTypeElem);
			lidl.addEdge(ifd2ifte);
		}
		return ifd;
	}

	private List<GraphNode> analyseInterfaceType()
	{
		List<GraphNode> ifts = new ArrayList<>();

		if (isNext(TokenType.LBrace))
		{
			// composite interface type
			// {
			getNext(TokenType.LBrace);
			// [elem]
			GraphNode ifte = analyseInterfaceTypeElement();
			ifts.add(ifte);
			while (isNext(TokenType.Comma))
			{
				// ,
				getNext(TokenType.Comma);
				// [elem]
				ifte = analyseInterfaceTypeElement();
				ifts.add(ifte);
			}
			// }
			getNext(TokenType.RBrace);
		}
		else
		{
			/*
			We take refInterfaceType & simpleInterfaceType as another kind of compositeInterfaceType which contains only one
			composite interface type element named "theInterface"
			*/
			// reference interface type | simple interface type | function interface type
			GraphNode ifte = new GraphNode(GraphNode.Type.InterfaceTypeElem);
			lidl.addNode(ifte);

			// [type] --> [elem]
			// [type]
			String rsift = (String) getNext(TokenType.ID_Qualified).getValue();
			if (isNext(TokenType.RightArrow))
			{
				// function data interface type
				// ->
				getNext(TokenType.RightArrow);
				// [type]
				String rodt = (String) getNext(TokenType.ID_Qualified).getValue();
				rsift += "->" + rodt;
				ifte.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Function);
			}
			else
			{
				ifte.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Reference);
			}

			if (isNext(TokenType.KW_DirIn, TokenType.KW_DirOut))
			{
				// simple data interface type
				String dir = (String) getNext().getValue();
				// ifte.addMeta("interfaceType", "simple");
				ifte.addMeta(GraphNode.MetaType.Direction, dir);
			}

			ifte.addMeta(GraphNode.MetaType.Name, "theInterface");
			ifte.addMeta(GraphNode.MetaType.SubType, rsift);
			ifts.add(ifte);
		}
		return ifts;
	}

	private GraphNode analyseInterfaceTypeElement()
	{
		GraphNode ifte = new GraphNode(GraphNode.Type.InterfaceTypeElem);
		lidl.addNode(ifte);

		// [name]
		String name = (String) getNext(TokenType.ID_Qualified).getValue();
		// :
		getNext(TokenType.Colon);
		// TODO: fix direct interface in param

		ifte.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Reference);
		// [interface type] | [data type] [dir]
		String rsift = (String) getNext(TokenType.ID_Qualified).getValue();

		if (isNext(TokenType.KW_DirIn, TokenType.KW_DirOut))
		{
			// simple interface type
			String dir = (String) getNext().getValue();
			// ifte.addMeta("interfaceType", "simple");
			ifte.addMeta(GraphNode.MetaType.Direction, dir);
		}
		ifte.addMeta(GraphNode.MetaType.Name, name);
		ifte.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Reference);
		ifte.addMeta(GraphNode.MetaType.SubType, rsift);

		return ifte;
	}

	private GraphNode analyseInteractionDefinition()
	{
		GraphNode iad = new GraphNode(GraphNode.Type.InteractionDefinition);
		lidl.addNode(iad);

		// interaction
		getNext(TokenType.KW_Interaction);
		// STATE CHANGE: Normal -> InteractionID
		// ([ID])
		state = TokenizeState.InteractionID;
		// (
		getNext(TokenType.LParen);
		// ID
		String iaID = (String) getNext(TokenType.ID_Qualified).getValue();
		iad.addMeta(GraphNode.MetaType.Name, iaID);
		// [Params*]
		List<GraphNode> params = analyseParams();
		for (int i = 0; i < params.size(); i++)
		{
			GraphEdge iad2p = new GraphEdge(iad, params.get(i), GraphEdge.Type.Interaction2Param);
			iad2p.addMeta(GraphEdge.Meta.FromIndex, i + 1);
			iad2p.addMeta(GraphEdge.Meta.ToIndex, 0);
			lidl.addEdge(iad2p);
		}
		// )
		getNext(TokenType.RParen);
		// STATE CHANGE: InteractionID -> Normal
		state = TokenizeState.Normal;
		// :
		getNext(TokenType.Colon);
		// [interface]
		GraphNode oif = new GraphNode(GraphNode.Type.InterfaceDefinition);
		lidl.addNode(oif);
		oif.addMeta(GraphNode.MetaType.Name, "theInterface");
		List<GraphNode> iftes = analyseInterfaceType();
		for (var ifte : iftes)
		{
			GraphEdge oif2ifte = new GraphEdge(oif, ifte, GraphEdge.Type.Interface2InterfaceTypeElem);
			lidl.addEdge(oif2ifte);
		}
		// LINK
		GraphEdge iad2oif = new GraphEdge(iad, oif, GraphEdge.Type.Interaction2OutInterface);
		lidl.addEdge(iad2oif);

		// with
		if (isNext(TokenType.KW_With))
		{
			getNext(TokenType.KW_With);
			while (isNext(TokenType.KW_Interaction))
			{
				GraphNode niad = analyseInteractionDefinition();

				GraphEdge iad2niad = new GraphEdge(iad, niad, GraphEdge.Type.Interaction2NestInteraction);
				lidl.addEdge(iad2niad);
			}
		}

		// is
		getNext(TokenType.KW_Is);

		// [DEF]
		GraphNode exp = analyseExpression();
		GraphEdge iad2def = new GraphEdge(iad, exp, GraphEdge.Type.Interaction2Expression);
		lidl.addEdge(iad2def);

		return iad;
	}

	private GraphNode analyseExpression()
	{
		GraphNode exp = new GraphNode(GraphNode.Type.Expression);
		lidl.addNode(exp);
		// STATE CHANGE: Normal -> LidlExpression
		state = TokenizeState.LidlExpression;
		// (
		getNext(TokenType.LParen);
		// [ID|COMPOSITION|LITERAL]
		if (isNext(TokenType.ID_Qualified))
		{
			String iaid = (String) getNext(TokenType.ID_Qualified).getValue();
			exp.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Reference);
			exp.addMeta(GraphNode.MetaType.Name, iaid);
			// [params]
			int index = 0;
			while (isNext(TokenType.LParen))
			{
				index++;
				GraphNode subexp = analyseExpression();
				// RECOVER STATE: Normal -> LidlExpression
				state = TokenizeState.LidlExpression;
				GraphEdge exp2subexp = new GraphEdge(exp, subexp, GraphEdge.Type.Expression2SubExpression);
				exp2subexp.addMeta(GraphEdge.Meta.FromIndex, index);
				exp2subexp.addMeta(GraphEdge.Meta.ToIndex, 0);
				lidl.addEdge(exp2subexp);
			}
		}
		// TODO: add composition analyse
		else if (isNext(TokenType.LBrace))
		{
			// composition
			// {
			getNext(TokenType.LBrace);
			exp.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Composition);
			List<GraphNode> ces = analyseCompositeElements();
			// RECOVER STATE: Normal -> LidlExpression
			for (GraphNode ce : ces)
			{
				GraphEdge c2ce = new GraphEdge(exp, ce, GraphEdge.Type.Composite2Element);
				lidl.addEdge(c2ce);
			}
			// }
			getNext(TokenType.RBrace);
			state = TokenizeState.LidlExpression;
		}
		else
		{
			// Literals
			exp.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Literal);
			switch (peekNext().getType())
			{
				case L_Activation:
					exp.addMeta(GraphNode.MetaType.SubType, GraphNode.MetaValue.Activation);
					exp.addMeta(GraphNode.MetaType.ClassType, String.class);
					exp.addMeta(GraphNode.MetaType.Value, getNext(TokenType.L_Activation).getValue());
					break;
				case L_Number:
					exp.addMeta(GraphNode.MetaType.SubType, GraphNode.MetaValue.Number);
					exp.addMeta(GraphNode.MetaType.ClassType, String.class);
					exp.addMeta(GraphNode.MetaType.Value, getNext(TokenType.L_Number).getValue());
					break;
				case L_String:
					exp.addMeta(GraphNode.MetaType.SubType, GraphNode.MetaValue.Text);
					exp.addMeta(GraphNode.MetaType.ClassType, String.class);
					exp.addMeta(GraphNode.MetaType.Value, getNext(TokenType.L_String).getValue());
					break;
				case L_Boolean:
					exp.addMeta(GraphNode.MetaType.SubType, GraphNode.MetaValue.Boolean);
					exp.addMeta(GraphNode.MetaType.ClassType, String.class);
					exp.addMeta(GraphNode.MetaType.Value, getNext(TokenType.L_Boolean).getValue());
					break;
				default:
					unreachable("not a literal");
			}
		}
		// )
		getNext(TokenType.RParen);
		// STATE CHANGE: LidlExpression -> Normal
		state = TokenizeState.Normal;
		return exp;
	}

	private List<GraphNode> analyseCompositeElements()
	{
		List<GraphNode> ces = new ArrayList<>();
		// RECOVER STATE: ANY -> Normal
		GraphNode ce = analyseCompositeElement();
		ces.add(ce);
		while (isNext(TokenType.Comma))
		{
			getNext(TokenType.Comma);
			ce = analyseCompositeElement();
			ces.add(ce);
		}
		return ces;
	}

	private GraphNode analyseCompositeElement()
	{
		GraphNode ce = new GraphNode(GraphNode.Type.CompositionElement);
		// ID
		String ceID = (String) getNext(TokenType.ID_Qualified).getValue();
		// :
		getNext(TokenType.Colon);
		// (Expr)
		GraphNode expr = analyseExpression();
		// RECOVER STATE: Normal -> LidlExpression
		state = TokenizeState.LidlExpression;
		GraphEdge ce2expr = new GraphEdge(ce, expr, GraphEdge.Type.CompositeElement2Expression);
		ce2expr.addMeta(GraphEdge.Meta.FromIndex, 1);
		ce2expr.addMeta(GraphEdge.Meta.ToIndex, 0);
		lidl.addEdge(ce2expr);

		ce.addMeta(GraphNode.MetaType.Name, ceID);
		lidl.addNode(ce);
		return ce;
	}

	private List<GraphNode> analyseParams()
	{
		List<GraphNode> ps = new ArrayList<>();
		while (isNext(TokenType.LParen))
		{
			GraphNode p = new GraphNode(GraphNode.Type.InteractionParam);
			lidl.addNode(p);
			ps.add(p);
			// (
			getNext(TokenType.LParen);
			// [interface]
			GraphNode ifte = analyseInterfaceTypeElement();
			GraphEdge p2ifte = new GraphEdge(p, ifte, GraphEdge.Type.Param2Interface);
			lidl.addEdge(p2ifte);
			// )
			getNext(TokenType.RParen);
		}

		return ps;
	}


	public Graph getGraph()
	{
		return lidl;
	}

	public void addSrc(File f)
	{
		BetterLogger.debug("Analyser", String.format("Add src file: %s", f.toString()));
		srcs.add(f);
	}

	public void addSrc(Collection<File> fs)
	{
		BetterLogger.debug("Analyser", String.format("Add src file: \n%s", BetterToString.str(fs)));
		srcs.addAll(fs);
	}


	private boolean isNext(TokenType tt)
	{
		return peekNext().getType() == tt;
	}

	private boolean isNext(TokenType... tts)
	{
		for (var tt : tts)
		{
			if (isNext(tt))
				return true;
		}
		return false;
	}

	private Token peekNext()
	{
		while (peekedToken == null || peekedToken.getType() == TokenType.Comment)
		{
			peekedToken = tk.getLexer(state).nextToken();
		}
		return peekedToken;
	}

	private Token getNext()
	{
		Token t = peekNext();
		peekedToken = null;
		return t;
	}

	private Token getNext(TokenType... tt)
	{
		assertNext(tt);
		return getNext();
	}

	private void assertNext(TokenType... tts)
	{
		Token t = peekNext();
		if (!isNext(tts))
		{
			BetterLogger.error("Analyser", String.format(
					"Expecting <%s> but got <%s> at <%s,%s>",
					Arrays.stream(tts).map(Enum::toString).reduce((x, y) -> x + ", " + y).orElse("[]"),
					t.getType(), t.getStart(), t.getEnd()
			));
			System.exit(-1);
		}
	}

	private void unreachable(String msg)
	{
		BetterLogger.fatal("Analyser", "Unreachable Code! " + msg);
		System.exit(-2);
	}
}
