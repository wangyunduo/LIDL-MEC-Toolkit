package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;
import core.graph.util.LustreUtil;

public class IfThenElseInstantiate extends AbstractProcessor<Graph>
{
	public IfThenElseInstantiate()
	{
		super("GT Processor", "Instantiate IfThenElse");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!instantiateIfThenElse(item))
			return false;

		return true;
	}

	private boolean instantiateIfThenElse(Graph graph)
	{
		var ites = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				node -> node.getMeta(GraphNode.MetaType.Name, String.class)
							.orElseThrow()
							.equals(LidlUtil.Const.IF_THEN_ELSE)
		);

		for (var ite : ites)
		{
			instantiateIfThenElseSingle(graph, ite);
		}
		return true;
	}

	private void instantiateIfThenElseSingle(Graph graph, GraphNode ite)
	{
		BetterLogger.debug("Instantiate IfThenElse", ite.getId());
		var flag = graph.findInEdges(
				ite, e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
						   .orElseThrow() == 1).get(0);
		var expT = graph.findInEdges(
				ite, e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
						   .orElseThrow() == 2).get(0);
		var expF = graph.findInEdges(
				ite, e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
						   .orElseThrow() == 3).get(0);

		GraphNode call = LustreUtil.generateIfThenElseCall(graph, ite, flag, expT, expF);
		graph.addNode(call);
		GraphNode struct = LustreUtil.generateIfThenElseStruct(graph, ite, flag, expT, expF);
		if (struct != null)
			graph.addNode(struct);
		graph.removeNode(ite);
	}
}
