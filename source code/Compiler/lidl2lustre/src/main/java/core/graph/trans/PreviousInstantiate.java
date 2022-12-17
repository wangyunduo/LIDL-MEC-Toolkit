package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;
import core.graph.util.LustreUtil;


public class PreviousInstantiate extends AbstractProcessor<Graph>
{
	public PreviousInstantiate()
	{
		super("GT Processor", "Instantiate Previous");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!instantiatePrevious(item))
			return false;

		return true;
	}

	private boolean instantiatePrevious(Graph graph)
	{
		var pres = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.PREVIOUS)
		);

		for (var pre : pres)
		{
			var prev = graph.findInEdges(pre).get(0);

			var right = graph.findOutEdges(
					pre, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
					           .orElseThrow() == 0).get(0);

			if (right.to().getType() == GraphNode.Type.NodeCall)
			{
//				var inf = right.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow();
//				var cinf = right.getMeta(GraphEdge.Meta.FromInf, String.class).orElseThrow();
				GraphNode tempVar = LustreUtil.generateLocalVariable(pre.getId() + "_" + right.getId());
				graph.addNode(tempVar);
				GraphEdge pre2var = new GraphEdge(pre, tempVar, GraphEdge.Type.DataFlowSource2Dest);
				GraphEdge var2right = new GraphEdge(tempVar, right.to(), GraphEdge.Type.DataFlowSource2Dest);
				pre2var.copyMeta(right);
				var2right.copyMeta(right);
				graph.addEdge(pre2var, var2right);
				graph.removeEdgeSimple(right);

				right = var2right;
			}

			GraphNode node = LustreUtil.generatePrevious(pre, prev.from());
			graph.addNode(node);
			node.copyEdges(graph, pre);
			graph.removeNode(pre);
		}

		return true;
	}
}
