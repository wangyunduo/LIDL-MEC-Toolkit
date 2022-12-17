package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LustreUtil;

import java.util.stream.Collectors;

public class InteractionInstantiate extends AbstractProcessor<Graph>
{
	public InteractionInstantiate()
	{
		super("GT Processor", "Interaction Instantiation");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!instantiateInteraction(item))
			return false;

		return true;
	}

	private boolean instantiateInteraction(Graph graph)
	{
		var iaList = graph.findNodesOfType(GraphNode.Type.InteractionDefinition);

		for (GraphNode ia : iaList)
		{
			GraphNode iaInf = graph.findNodesInDirectChildren(
					ia,
					n -> n.getType() == GraphNode.Type.InterfaceDefinition
			).get(0);

			GraphNode nodeDef = LustreUtil.generateNodeDefFromInteraction(ia);
			graph.addNode(nodeDef);
			nodeDef.copyEdges(graph, ia);

			var inInfList = LustreUtil.generateParamFromInterface(graph, iaInf);

			for (var in : inInfList)
			{
				GraphEdge edge = new GraphEdge(nodeDef, in, GraphEdge.Type.Node2Param);
				graph.addEdge(edge);
			}

			var outInfList = LustreUtil.generateRetFromInterface(graph, iaInf);

			for (var out : outInfList)
			{
				GraphEdge edge = new GraphEdge(nodeDef, out, GraphEdge.Type.Node2Return);
				graph.addEdge(edge);
			}

//			var params = graph.findNodesInDirectChildren(
//					ia,
//					n -> n.getType() == GraphNode.Type.InteractionParam
//			);

			var params = graph.findOutEdges(
					ia,
					e -> e.to().getType() == GraphNode.Type.InteractionParam
			).stream().sorted((x, y) -> {
				var x1 = x.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(Integer.MAX_VALUE);
				var y1 = y.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(Integer.MAX_VALUE);
				return x1 - y1;
			}).map(GraphEdge::to).collect(Collectors.toList());

			for (int i = 0; i < params.size(); i++)
			{
				var param = params.get(i);
				var inParamList = LustreUtil.generateParamFromParams(graph, param);

				for (var in : inParamList)
				{
					GraphEdge edge = new GraphEdge(nodeDef, in, GraphEdge.Type.Node2Param);
					edge.addMeta(GraphEdge.Meta.FromIndex, i);
					graph.addEdge(edge);
				}

				var outParamList = LustreUtil.generateRetFromParams(graph, param);

				for (var out : outParamList)
				{
					GraphEdge edge = new GraphEdge(nodeDef, out, GraphEdge.Type.Node2Return);
					edge.addMeta(GraphEdge.Meta.ToIndex, i);
					graph.addEdge(edge);
				}
			}

			var callEdges = graph.findInEdges(nodeDef, e -> e.getType() == GraphEdge.Type.TypeRef2Def);

			for (var callEdge : callEdges)
			{
				var call = callEdge.from();
				GraphNode nodeCall = LustreUtil.generateNodeCallFromInteraction(ia);
				graph.addNode(nodeCall);
				graph.removeEdgeSimple(callEdge);
				nodeCall.copyEdges(graph, call);
				graph.removeNode(call);

//				GraphEdge call2def = new GraphEdge(nodeCall, nodeDef, GraphEdge.Type.NodeCall2Def);
//				graph.addEdge(call2def);
			}

			graph.removeNode(ia);
		}

		return true;
	}
}
