package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GraphNodeRelabel extends AbstractProcessor<Graph>
{
	public GraphNodeRelabel()
	{
		super("GT Processor", "Relabel GraphNode");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		// Extract Native Function Call
		if (!extractFunction(item))
			return false;

		if (!extractCoreInteraction(item))
			return false;

		// executed after CoreInteraction Relabel
		if (!extractApplyToAndGetInternalCallParams(item))
			return false;

		return true;
	}

	private boolean extractApplyToAndGetInternalCallParams(Graph graph)
	{
		var atags = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.APPLY_TO_AND_GET)
		);

		for (var atag : atags)
		{
			var idents = graph.findOutEdges(
					atag,
					e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
						 e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 2
			).stream().map(GraphEdge::to).collect(Collectors.toList());

			if (idents.size() != 1)
			{
				BetterLogger.error("ATAG Param", "Extract ATAG Internal Call Params ERROR.");
				return false;
			}

			var ident = idents.get(0);
			List<GraphNode> identList = new ArrayList<>();
			var identNames =
					Arrays.stream(ident.getMeta(GraphNode.MetaType.Name, String.class)
									   .orElseThrow()
									   .split(","))
						  .map(String::trim)
						  .collect(Collectors.toList());

			GraphNode icp = new GraphNode(GraphNode.Type.InternalCallParam);
			graph.addNode(icp);
			GraphEdge atag2icp = new GraphEdge(atag, icp, GraphEdge.Type.Expression2SubExpression);
			atag2icp.addMeta(GraphEdge.Meta.FromIndex, 2);
			atag2icp.addMeta(GraphEdge.Meta.ToIndex, 0);
			graph.addEdge(atag2icp);
			for (int i = 0; i < identNames.size(); i++)
			{
				var name = identNames.get(i);
				GraphNode identNode = new GraphNode(GraphNode.Type.Expression);
				identNode.addMeta(GraphNode.MetaType.Name, name);
				identNode.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Reference);
				graph.addNode(identNode);
				GraphEdge icp2ident = new GraphEdge(icp, identNode, GraphEdge.Type.Expression2SubExpression);
				icp2ident.addMeta(GraphEdge.Meta.FromIndex, i + 1);
				icp2ident.addMeta(GraphEdge.Meta.ToIndex, 0);
				graph.addEdge(icp2ident);
			}
			graph.removeNode(ident);
		}
		return true;
	}

	private boolean extractCoreInteraction(Graph graph)
	{
		// find core interaction call node -> "e.g. (()with behaviour())"
		var coreIAList = graph.findNodes(
				node -> node.getType() == GraphNode.Type.Expression &&
						node.getMeta(GraphNode.MetaType.Type, String.class)
							.orElseThrow()
							.equals(GraphNode.MetaValue.Reference) &&
						LidlUtil.checkIfCoreIA(
								node.getMeta(GraphNode.MetaType.Name, String.class)
									.orElseThrow())
		);

		for (var coreIA : coreIAList)
		{
			GraphNode funcNode = new GraphNode(GraphNode.Type.CoreInteraction);
			graph.addNode(funcNode);
			// extract core ia name
			String coreIANameRaw = coreIA.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			String coreIAName = LidlUtil.translateCoreIA(coreIANameRaw);
			// Set function Node Meta
			funcNode.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.CoreInteraction);
			funcNode.addMeta(GraphNode.MetaType.Name, coreIAName);

			for (var edge : coreIA.getIns())
			{
				GraphEdge funcEdge = new GraphEdge(edge.from(), funcNode, edge.getType());
				if (edge.hasMeta(GraphEdge.Meta.FromIndex))
				{
					funcEdge.addMeta(GraphEdge.Meta.FromIndex,
									 edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
										 .orElseThrow());
				}
				if (edge.hasMeta(GraphEdge.Meta.ToIndex))
				{
					funcEdge.addMeta(GraphEdge.Meta.ToIndex,
									 edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
										 .orElseThrow());
				}
				graph.addEdge(funcEdge);
			}
			for (var edge : coreIA.getOuts())
			{
				GraphEdge funcEdge = new GraphEdge(funcNode, edge.to(), edge.getType());
				if (edge.hasMeta(GraphEdge.Meta.FromIndex))
				{
					funcEdge.addMeta(GraphEdge.Meta.FromIndex,
									 edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
										 .orElseThrow());
				}
				if (edge.hasMeta(GraphEdge.Meta.ToIndex))
				{
					funcEdge.addMeta(GraphEdge.Meta.ToIndex,
									 edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
										 .orElseThrow());
				}
				graph.addEdge(funcEdge);
			}
			graph.removeNode(coreIA);
		}
		return true;
	}

	private boolean extractFunction(Graph graph)
	{
		// find native function call node -> "e.g. (function addOne)"
		var funcList = graph.findNodes(
				node -> node.getType() == GraphNode.Type.Expression &&
						node.getMeta(GraphNode.MetaType.Type, String.class)
							.orElseThrow()
							.equals(GraphNode.MetaValue.Reference) &&
						node.getMeta(GraphNode.MetaType.Name, String.class)
							.orElseThrow()
							.startsWith(LidlUtil.Const.FUNC_PREFIX)
		);

		for (var func : funcList)
		{
			GraphNode funcNode = new GraphNode(GraphNode.Type.FunctionCall);
			graph.addNode(funcNode);
			// extract native function name
			String funcNameRaw = func.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			String funcName = funcNameRaw.replaceFirst("function_", "");
			// Set function Node Meta
			funcNode.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Function);
			funcNode.addMeta(GraphNode.MetaType.Name, funcName);

			for (var edge : func.getIns())
			{
				GraphEdge funcEdge = new GraphEdge(edge.from(), funcNode, GraphEdge.Type.Expression2FunctionCall);
				funcEdge.copyMeta(edge);
				graph.addEdge(funcEdge);
			}
			for (var edge : func.getOuts())
			{
				GraphEdge funcEdge = new GraphEdge(funcNode, edge.to(), GraphEdge.Type.FunctionCall2Other);
				funcEdge.copyMeta(edge);
				graph.addEdge(funcEdge);
			}
			graph.removeNode(func);
		}

		return true;
	}
}
