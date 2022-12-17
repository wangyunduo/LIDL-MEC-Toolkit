package core.graph.util;

import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class LustreUtil
{
	private static final String STRUCT_PATTERN = """
			struct <:name:>
			{
			    <:attrs:>
			}""";

	private static final String NODE_PATTERN = """
			<:def_part:>
			<:var_part:>
			<:body_part:>""";

	private static final String NODE_DEF_PATTERN = """
			node <:name:>(<:node_params:>) returns (<:returns:>);""";

	private static final String NODE_VAR_PATTERN = """
			var 
			<:vars:>""";

	private static final String NODE_BODY_PATTERN = """
			let
			<:body:>
			tel""";

	private static final String NODE_CALL_PATTERN = """
			<:returns:> = <:name:>(<:call_params:>);""";

	private static final String APPLY_TO_AND_GET_DEF_PATTERN = """
			node ApplyToAndGet_<:name:>(active_flag: bool; <:node_params=0:>) returns (<:node_params=1:>);
			let
			    <:name=1:> = if (active_flag) then <:name:>(<:call_params:>) else <:value:>;
			tel""";

	//	private static final String APPLY_TO_AND_GET_PARAM_PATTERN =
	private static final String APPLY_TO_AND_GET_NAME_PATTERN = "ApplyToAndGet_<:name:>";

	private static final String ASSIGNMENT_DEF_PATTERN = """
			node Assignment_<:name:>(active_flag: bool; in: <:type:>) returns (out: <:type:>);
			let
				out = if (active_flag) then (in) else <:value:>;
			tel""";

	private static final String ASSIGNMENT_NAME_PATTERN = "Assignment_<:name:>";

	private static final String IF_THEN_ELSE_DEF_PATTERN = """
			node If_Then_Else_<:name:>(flag: bool; expT: <:type:>; expF: <:type:>) returns (out: <:type:>);
			let
				out = if (flag) then (expT) else (expF);
			tel""";
	private static final String IF_THEN_ELSE_NAME_PATTERN = "If_Then_Else_<:name:>";
	private static final String VAR_NAME_PATTERN = "ident_<:name:>";

//	private static final String PREVIOUS_PATTERN = """
//			pre(<:call_params:>)""";

	private static final String TEXT_CONSTANT_PATTERN = "Text { act = true; value = <:value:> }";
	private static final String TEXT_INACTIVE_PATTERN = "Text { act = false; value = string_default }";
	private static final String NUMBER_CONSTANT_PATTERN = "Number { act = true; value = <:value:> }";
	private static final String NUMBER_INACTIVE_PATTERN = "Number { act = false; value = 0.0 }";
	private static final String BOOLEAN_CONSTANT_PATTERN = "Boolean { act = true; value = <:value:> }";
	private static final String BOOLEAN_INACTIVE_PATTERN = "Boolean { act = false; value = false }";
	private static final String ACTIVATION_CONSTANT_PATTERN = "<:value:>";

	private static final String ACTIVATION_INACTIVE_PATTERN = "Activation { act = false }";

	private static final Map<String, String> LITERAL_PATTERN_MAP = new HashMap<>();

	static
	{
		LITERAL_PATTERN_MAP.put(GraphNode.MetaValue.Number, NUMBER_CONSTANT_PATTERN);
		LITERAL_PATTERN_MAP.put(GraphNode.MetaValue.Text, TEXT_CONSTANT_PATTERN);
		LITERAL_PATTERN_MAP.put(GraphNode.MetaValue.Boolean, BOOLEAN_CONSTANT_PATTERN);
		LITERAL_PATTERN_MAP.put(GraphNode.MetaValue.Activation, ACTIVATION_CONSTANT_PATTERN);
	}

	private static final String PARAM_RET_PATTERN = "<:name:>: <:type:>";

	private static final String ASSIGNMENT_PATTERN = "<:left:> = <:right:>;";

	public static GraphNode generateNodeBody(Graph graph, String code)
	{
		GraphNode body = generateCodeNode(GraphNode.Type.NodeBody, code);
		graph.addNode(body);
		return body;
	}

	public static GraphNode generateNodeStruct(Graph graph, GraphNode def, GraphNode vars, GraphNode body)
	{
		String codeDef = def.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String codeVars = vars != null ? vars.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow() : "";
		String codeBodyRaw = body.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();

		String codeBody = new CodeBuilder(NODE_BODY_PATTERN)
				.tag(Tag.Body, codeBodyRaw)
				.build();

		String code = new CodeBuilder(NODE_PATTERN)
				.tag(Tag.DefPart, codeDef)
				.tag(Tag.VarPart, codeVars)
				.tag(Tag.BodyPart, codeBody)
				.build();

		GraphNode node = generateCodeNode(GraphNode.Type.Node, code);
		graph.addNode(node);
		return node;
	}

	public static GraphNode generatePrevious(GraphNode pre, GraphNode ident)
	{
		String param = ident.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String code = new CodeBuilder(NODE_CALL_PATTERN)
				.tag(Tag.Name, "pre")
				.tag(Tag.CallParams, param)
				.build();
		return generateCodeNode(GraphNode.Type.NodeCall, code);
	}


	public enum Tag
	{
		Name("name"),
		Attrs("attrs"),
		CallParams("call_params"),
		NodeParams("node_params"),
		Returns("returns"),
		Vars("vars"),
		Body("body"),
		Type("type"),
		Value("value"),
		Left("left"),
		Right("right"),
		DefPart("def_part"),
		VarPart("var_part"),
		BodyPart("body_part");

		private final String value;

		Tag(String value)
		{
			this.value = value;
		}

		@Override
		public String toString()
		{
			return value;
		}

		public String toTag()
		{
			return String.format("<:%s:>", value);
		}

		public String toTag(int index)
		{
			return String.format("<:%s=%d:>", value, index);
		}

	}

	public static String generateStructFromInterface(Graph graph, GraphNode ifNode)
	{
		var rawList = graph.findNodesInDirectChildren(ifNode, n -> n.getType() == GraphNode.Type.InterfaceTypeElem);
		LustreStruct struct = new LustreStruct();
		struct.name = ifNode.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		for (var rawElem : rawList)
		{
			String rawName = rawElem.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			String rawTypeName = rawElem.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();
			String rawDir = rawElem.getMeta(GraphNode.MetaType.Direction, String.class).orElseThrow();

			String name = rawName;
			String typeName = rawTypeName;
			String dirName = rawDir;

			struct.elements.add(new LustreStruct.Element(name, typeName, dirName));
		}
		return struct.toString();
	}

//	public static GraphNode generateNodeCall(Graph graph, GraphNode iaNode)
//	{
//		String nodeName = generateNodeName(iaNode);
//		return generateNodeCall(graph, iaNode, nodeName);
//	}

	public static GraphNode generateNodeCall(Graph graph, GraphNode iaNode, String nodeName)
	{
		String code = new CodeBuilder(NODE_CALL_PATTERN)
				.tag(Tag.Name, nodeName)
				.build();
		GraphNode n = generateCodeNode(GraphNode.Type.NodeCall, code);
		graph.addNode(n);
		n.copyEdges(graph, iaNode);
		return n;
	}

	public static String generateNodeName(GraphNode node)
	{
		String nameRaw = node.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		return nameRaw.replace("$", "_arg_");
	}

	public static GraphNode generateNodeDefFromInteraction(GraphNode iaNode)
	{
		// interaction definition node
		String nameRaw = iaNode.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		String name = transformNonAlphabetic(nameRaw.replace("$", "_arg_"));

		String code = new CodeBuilder(NODE_DEF_PATTERN).tag(Tag.Name, name).build();
		GraphNode node = generateCodeNode(GraphNode.Type.NodeDef, code);
		return node;
	}

	public static GraphNode generateNodeCallFromInteraction(GraphNode iaNode)
	{
		// interaction definition node
		String nameRaw = iaNode.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		String name = transformNonAlphabetic(nameRaw.replace("$", "_arg_"));

		String code = new CodeBuilder(NODE_CALL_PATTERN)
				.tag(Tag.Name, name)
				.build();
		GraphNode node = generateCodeNode(GraphNode.Type.NodeCall, code);
		return node;
	}

	public static List<GraphNode> generateParamFromParams(Graph graph, GraphNode param)
	{
		return generateParamFromInterface(graph, param);
	}

	public static List<GraphNode> generateRetFromParams(Graph graph, GraphNode param)
	{
		return generateRetFromInterface(graph, param);
	}

	public static List<GraphNode> generateParamFromInterface(Graph graph, GraphNode infNode)
	{
		var inInfElemList = graph.findNodesInDirectChildren(
				infNode,
				n -> n.getType() == GraphNode.Type.InterfaceTypeElem &&
					 n.getMeta(GraphNode.MetaType.Direction, String.class)
					  .orElseThrow()
					  .equals("in")
		);
		List<GraphNode> list = new ArrayList<>();
		for (var infElem : inInfElemList)
		{
			String nameRaw = infElem.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			String typeRaw = infElem.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();

			String name = nameRaw;
			String type = typeRaw;

			String code = new CodeBuilder(PARAM_RET_PATTERN).tag(Tag.Name, name).tag(Tag.Type, type).build();
			GraphNode node = generateCodeNode(GraphNode.Type.ParamInstance, code);
			graph.addNode(node);
			node.copyMeta(infElem);
			list.add(node);
		}

		return list;
	}

	public static List<GraphNode> generateRetFromInterface(Graph graph, GraphNode infNode)
	{
		var outInfElemList = graph.findNodesInDirectChildren(
				infNode,
				n -> n.getType() == GraphNode.Type.InterfaceTypeElem &&
					 n.getMeta(GraphNode.MetaType.Direction, String.class)
					  .orElseThrow()
					  .equals("out")
		);
		List<GraphNode> list = new ArrayList<>();
		for (var infElem : outInfElemList)
		{
			String nameRaw = infElem.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			String typeRaw = infElem.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();

			String name = nameRaw;
			String type = typeRaw;

			String code = new CodeBuilder(PARAM_RET_PATTERN).tag(Tag.Name, name).tag(Tag.Type, type).build();
			GraphNode node = generateCodeNode(GraphNode.Type.ReturnInstance, code);
			graph.addNode(node);
			node.copyMeta(infElem);
			list.add(node);
		}

		return list;
	}

	public static GraphNode generateVariableDecls(Graph graph, List<GraphNode> vars)
	{
		for (var v : vars)
		{
			if (v.getType() != GraphNode.Type.LocalVariable)
				throw new RuntimeException("Recv non LocVar GraphNode");
		}

		var varsDecl = vars.stream()
						   .map(v -> v.getMeta(GraphNode.MetaType.Code, String.class)
									  .orElseThrow() +
									 ": " +
									 LustreUtil.findTypeFromInterface(
											 v.getOuts()
											  .stream()
											  .findFirst()
											  .orElseThrow()
											  .getMeta(GraphEdge.Meta.FromInf, String.class)
											  .orElseThrow()).get(0) +
									 ";")
						   .reduce((x, y) -> x + "\n" + y);
		if (varsDecl.isPresent())
		{
			String code = new CodeBuilder(NODE_VAR_PATTERN).tag(Tag.Vars, varsDecl.get()).build();
			GraphNode node = generateCodeNode(GraphNode.Type.NodeVars, code);
			graph.addNode(node);
			return node;
		}
		return null;
	}

	public static GraphNode generateLocalVariable(String name)
	{
		String code = new CodeBuilder(VAR_NAME_PATTERN).tag(Tag.Name, name).build();
		return generateCodeNode(GraphNode.Type.LocalVariable, code);
	}

	public static GraphNode generateConstant(String type, String value)
	{
		String code = new CodeBuilder(LITERAL_PATTERN_MAP.get(type)).tag(Tag.Value, value).build();
		return generateCodeNode(GraphNode.Type.Const, code);
	}

//	public static GraphNode generateApplyToAndGetCall(
//			Graph graph,
//			GraphNode node,
//			GraphEdge func,
//			GraphEdge active,
//			GraphEdge param,
//			GraphEdge ret)
//	{
//		String funcName = func.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
//		String paramName = param.from()
//								.getMeta(GraphNode.MetaType.Code,
//										 String.class)
//								.orElseThrow();
//		String retName = ret.to()
//							.getMeta(GraphNode.MetaType.Code,
//									 String.class)
//							.orElseThrow();
//		String code = new CodeBuilder(NODE_CALL_PATTERN)
//				.tag(Tag.Name, APPLY_TO_AND_GET_NAME_PATTERN)
//				.tag(Tag.Name, funcName)
//				.tag(Tag.CallParams, linkStr("true", paramName))
//				.tag(Tag.Returns, retName)
//				.build();
//
//		GraphNode n = generateCodeNode(GraphNode.Type.NodeCall, code);
//		graph.addNode(n);
//		n.copyEdges(graph, node);
//
//		return n;
//	}

	public static GraphNode generateApplyToAndGetCall(
			Graph graph,
			GraphNode node,
			GraphEdge func,
			GraphEdge active)
	{
		String funcName = func.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		String code = new CodeBuilder(NODE_CALL_PATTERN)
				.tag(Tag.Name, APPLY_TO_AND_GET_NAME_PATTERN)
				.tag(Tag.Name, funcName)
				.tag(Tag.CallParams, linkStr("true", Tag.CallParams.toTag()))
				.build();

		GraphNode n = generateCodeNode(GraphNode.Type.NodeCall, code);
		graph.addNode(n);
		n.copyEdges(graph, node);

		return n;
	}

	private static final Map<String, String> INACTIVE_MAP = new HashMap<>();

	static
	{
		INACTIVE_MAP.put("Number", NUMBER_INACTIVE_PATTERN);
		INACTIVE_MAP.put("Text", TEXT_INACTIVE_PATTERN);
		INACTIVE_MAP.put("Boolean", BOOLEAN_INACTIVE_PATTERN);
		INACTIVE_MAP.put("Activation", ACTIVATION_INACTIVE_PATTERN);
	}

	public static GraphNode generateApplyToAndGetStruct(
			Graph graph,
			GraphNode node,
			GraphEdge func,
			GraphEdge active,
			GraphEdge param,
			GraphEdge ret
	)
	{
		String funcName = func.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();

		String inInf = param.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow();
		List<String> inType = findTypeFromInterface(inInf);
		List<String> inArgs = new ArrayList<>();
		List<String> callParams = new ArrayList<>();
		for (int i = 0; i < inType.size(); i++)
		{
			String type = inType.get(i);
			String arg = String.format("arg%d: %s", i, type);
			inArgs.add(arg);
			callParams.add("arg" + i);
		}

		String outInf = ret.getMeta(GraphEdge.Meta.FromInf, String.class).orElseThrow();
		List<String> outType = findTypeFromInterface(outInf);
		List<String> outRets = new ArrayList<>();
		List<String> callRets = new ArrayList<>();
		for (int i = 0; i < outType.size(); i++)
		{
			String type = outType.get(i);
			String arg = String.format("ret%d: %s", i, type);
			outRets.add(arg);
			callRets.add("ret" + i);
		}
		String type = outType.get(0);
		String valueCode = INACTIVE_MAP.get(type);

		String name = new CodeBuilder(APPLY_TO_AND_GET_NAME_PATTERN).tag(Tag.Name, funcName).build();
		if (utilStruct.contains(name))
		{
			return null;
		}
		utilStruct.add(name);

		String code = new CodeBuilder(APPLY_TO_AND_GET_DEF_PATTERN)
				.tag(Tag.Name, funcName)
				.tag(Tag.NodeParams, 0, linkStr(";", inArgs))
				.tag(Tag.NodeParams, 1, linkStr(";", outRets))
				.tag(Tag.CallParams, linkStr(callParams))
				.tag(Tag.Name, 1, linkStr(callRets))
				.tag(Tag.Value, valueCode)
				.build();

		GraphNode n = generateCodeNode(GraphNode.Type.Node, code);
		graph.addNode(n);
		return n;
	}

	public static GraphNode generateIfThenElseCall(
			Graph graph,
			GraphNode ite,
			GraphEdge flag,
			GraphEdge expT,
			GraphEdge expF)
	{
//		String flagName;
//		if (flag.from().getType() == GraphNode.Type.ParamInstance)
//		{
//			flagName = flag.from()
//						   .getMeta(GraphNode.MetaType.Name, String.class)
//						   .orElseThrow();
//		}
//		else
//		{
//			flagName = flag.from()
//						   .getMeta(GraphNode.MetaType.Code, String.class)
//						   .orElseThrow();
//		}
//
//		String expTName;
//		if (expT.from().getType() == GraphNode.Type.ParamInstance)
//		{
//			expTName = expT.from()
//						   .getMeta(GraphNode.MetaType.Name, String.class)
//						   .orElseThrow();
//		}
//		else
//		{
//			expTName = expT.from()
//						   .getMeta(GraphNode.MetaType.Code, String.class)
//						   .orElseThrow();
//		}
//
//		String expFName;
//		if (expF.from().getType() == GraphNode.Type.ParamInstance)
//		{
//			expFName = expF.from()
//						   .getMeta(GraphNode.MetaType.Name, String.class)
//						   .orElseThrow();
//		}
//		else
//		{
//			expFName = expF.from()
//						   .getMeta(GraphNode.MetaType.Code, String.class)
//						   .orElseThrow();
//		}

		String type = findTypeFromInterface(expT.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow()).get(0);
		String code = new CodeBuilder(NODE_CALL_PATTERN)
				.tag(Tag.Name, IF_THEN_ELSE_NAME_PATTERN)
				.tag(Tag.Name, type)
//				.tag(Tag.CallParams, linkStr(flagName, expTName, expFName))
				.build();

		GraphNode n = generateCodeNode(GraphNode.Type.NodeCall, code);
		n.copyEdges(graph, ite);

		return n;
	}

	static Set<String> utilStruct = new HashSet<>();

	public static GraphNode generateIfThenElseStruct(
			Graph graph,
			GraphNode ite,
			GraphEdge flag,
			GraphEdge expT,
			GraphEdge expF)
	{
		String expTInf = expT.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow();
		String expTType = findTypeFromInterface(expTInf).get(0);

		String expFInf = expF.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow();
		String expFType = findTypeFromInterface(expFInf).get(0);

		if (!expTType.equals(expFType))
		{
			BetterLogger.error("Semantic Error", String.format("Mismatching LIDL IfThenElse Type: <%s> = <%s>", expTType, expFType));
			System.exit(-1);
		}

		String name = new CodeBuilder(IF_THEN_ELSE_NAME_PATTERN).tag(Tag.Name, expTType).build();
		if (utilStruct.contains(name))
		{
			return null;
		}
		utilStruct.add(name);

		String code = new CodeBuilder(IF_THEN_ELSE_DEF_PATTERN)
				.tag(Tag.Name, expTType)
				.tag(Tag.Type, linkStr(expFType))
				.build();


		return generateCodeNode(GraphNode.Type.Node, code);
	}

	public static GraphNode generateAssignmentCall(
			Graph graph,
			GraphNode node,
			GraphEdge active,
			GraphEdge left,
			GraphEdge right
	)
	{
		String activeName;
		if (active.from().getType() == GraphNode.Type.ActiveSource)
		{
			activeName = "true";
		}
		else
		{
			activeName = active.from()
							   .getMeta(GraphNode.MetaType.Name, String.class)
							   .orElseThrow();
		}

		String rightName = right.from()
								.getMeta(GraphNode.MetaType.Code, String.class)
								.orElseThrow();
//		String leftName = left.to()
//							  .getMeta(GraphNode.MetaType.Code, String.class)
//							  .orElseThrow();

		String type = findTypeFromInterface(right.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow()).get(0);
		String code = new CodeBuilder(NODE_CALL_PATTERN)
				.tag(Tag.Name, ASSIGNMENT_NAME_PATTERN)
				.tag(Tag.Name, type)
				.tag(Tag.CallParams, linkStr(activeName, rightName))
				.build();

		GraphNode n = generateCodeNode(GraphNode.Type.NodeCall, code);
		n.copyEdges(graph, node);

		return n;
	}


	public static GraphNode generateAssignmentStruct(
			Graph graph,
			GraphNode node,
			GraphEdge active,
			GraphEdge left,
			GraphEdge right
	)
	{
		String assignType = findTypeFromInterface(right.getMeta(GraphEdge.Meta.ToInf, String.class)
													   .orElseThrow()).get(0);

		String inInf = right.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow();
		String inType = findTypeFromInterface(inInf).get(0);

		String outInf = left.getMeta(GraphEdge.Meta.FromInf, String.class).orElseThrow();
		String outType = findTypeFromInterface(outInf).get(0);

		System.out.println(outType);
		String outCode = INACTIVE_MAP.get(outType);

		if (!inType.equals(outType))
		{
			BetterLogger.error("Semantic Error", String.format("Mismatching LIDL Assignment Type: <%s> = <%s>", inType, outType));
			System.exit(-1);
		}

		String name = new CodeBuilder(ASSIGNMENT_NAME_PATTERN).tag(Tag.Name, assignType).build();
		if (utilStruct.contains(name))
		{
			return null;
		}
		utilStruct.add(name);

		String code = new CodeBuilder(ASSIGNMENT_DEF_PATTERN)
				.tag(Tag.Name, assignType)
				.tag(Tag.Type, linkStr(outType))
				.tag(Tag.Value, outCode)
				.build();

		return generateCodeNode(GraphNode.Type.Node, code);
	}


//	public static GraphNode generateInteractionAssignment(
//			Graph graph,
//			GraphNode node,
//			GraphEdge flag,
//			GraphEdge left,
//			GraphEdge right
//	)
//	{
//
//	}


	public static GraphNode generateEmptyNode(String name, GraphEdge param, GraphEdge ret)
	{
		String inInf = param.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow();
		List<String> inType = findTypeFromInterface(inInf);
		List<String> inArgs = new ArrayList<>();
		for (int i = 0; i < inType.size(); i++)
		{
			String type = inType.get(i);
			String inParam = new CodeBuilder(PARAM_RET_PATTERN).tag(Tag.Name, "arg" + i).tag(Tag.Type, type).build();
			inArgs.add(inParam);
		}

		String outInf = ret.getMeta(GraphEdge.Meta.FromInf, String.class).orElseThrow();
		List<String> outType = findTypeFromInterface(outInf);
		String outRet = new CodeBuilder(PARAM_RET_PATTERN).tag(Tag.Name, "ret").tag(Tag.Type, linkStr(outType)).build();


		String code = new CodeBuilder(NODE_PATTERN)
				.tag(Tag.DefPart, NODE_DEF_PATTERN)
				.tag(Tag.Name, name)
				.tag(Tag.NodeParams, linkStr(";", inArgs))
				.tag(Tag.Returns, outRet)
				.tag(Tag.VarPart, "")
				.tag(Tag.BodyPart, NODE_BODY_PATTERN)
				.tag(Tag.Body, "")
				.build().replaceAll("[\n]+", "\n");
		GraphNode node = generateCodeNode(GraphNode.Type.Node, code);
		return node;
	}

	public static GraphNode generateApplyToAndGetStruct(
			Graph graph,
			GraphNode node,
			GraphEdge func,
			GraphEdge active
	)
	{
		String funcName = func.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		String code = new CodeBuilder(APPLY_TO_AND_GET_DEF_PATTERN)
				.tag(Tag.Name, funcName)
				.build();
		GraphNode n = generateCodeNode(GraphNode.Type.Node, code);
		graph.addNode(n);
		return n;
	}

	public static GraphNode generateAssignment(Graph graph, String left, String right)
	{
		String code = new CodeBuilder(ASSIGNMENT_PATTERN)
				.tag(Tag.Left, left)
				.tag(Tag.Right, right)
				.build();
		GraphNode node = generateCodeNode(GraphNode.Type.Assignment, code);
		graph.addNode(node);
		return node;
	}

	private static final String INF_RGX = "\\{[a-zA-Z]+:([a-zA-Z]+)-(in|out)}";

	public static List<String> findTypeFromInterface(String inf)
	{
		List<String> res = new ArrayList<>();
		Matcher m = Pattern.compile(INF_RGX).matcher(inf);
		while (m.find())
		{
			res.add(m.group(1));
		}
		return res;
	}

	private static GraphNode generateCodeNode(GraphNode.Type type, String code)
	{
		GraphNode node = new GraphNode(type);
		node.addMeta(GraphNode.MetaType.Code, code);
		return node;
	}

	public static GraphNode generateActiveSource()
	{
		return generateCodeNode(GraphNode.Type.ActiveSource, "<:arg=0:> = true;");
	}

	private static String linkStr(String split, List<String> items)
	{
		return linkStr(split, items.stream());
	}

	private static String linkStr(List<String> items)
	{
		return linkStr(", ", items);
	}

	private static String linkStr(String... items)
	{
		return linkStr(", ", Arrays.stream(items));
	}

	private static String linkStr(String split, Stream<String> items)
	{
		return items.reduce((x, y) -> x + split + y)
					.orElseThrow();
	}

	private static class LustreStruct
	{
		private String name;
		private final List<Element> elements = new ArrayList<>();

		@Override
		public String toString()
		{
			return STRUCT_PATTERN.replace("<name>", name)
								 .replace("<attrs>",
										  elements.stream()
												  .map(Element::toString)
												  .reduce((x, y) -> x + ",\n" + y)
												  .orElseThrow());
		}

		private static class Element
		{
			private final String name;
			private final String refType;
			private final String dir;

			public Element(String name, String refType, String dir)
			{
				this.name = name;
				this.refType = refType;
				this.dir = dir;
			}

			@Override
			public String toString()
			{
				return name.replace(".", "_r_") + "__dir_" + dir + ": " + refType;
			}
		}
	}

	public static class CodeBuilder
	{
		private String pattern;

		public CodeBuilder(String pattern)
		{
			this.pattern = pattern;
		}

		public String build()
		{
			return pattern;
		}

		public CodeBuilder tag(Tag tag, String content)
		{
			pattern = pattern.replace(String.format("<:%s:>", tag.toString()), content);
			return this;
		}

		public CodeBuilder tag(Tag tag, int idx, String content)
		{
			pattern = pattern.replace(String.format("<:%s=%d:>", tag.toString(), idx), content);
			return this;
		}
	}

	public static String transformNonAlphabetic(String str)
	{
		char[] arr = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char c : arr)
		{
			if (isLetterOrNumber(c))
				sb.append(c);
			else
				sb.append("Ox").append(Integer.toHexString(c));
		}
		return sb.toString();
	}

	public static boolean isLetterOrNumber(char c)
	{
		return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9') || c == '_';
	}

	public static String generateMultiArgPattern(List<Integer> indices)
	{
		List<String> args = new ArrayList<>();
		for (var index : indices)
		{
			args.add(Tag.CallParams.toTag(index));
		}
		return args.stream().reduce((x, y) -> x + ", " + y).orElseThrow();
	}

	public static String generateMultiRetPattern(List<Integer> indices)
	{
		List<String> args = new ArrayList<>();
		for (var index : indices)
		{
			args.add(Tag.Returns.toTag(index));
		}
		return args.stream().reduce((x, y) -> x + ", " + y).orElse("");
	}
}
