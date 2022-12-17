package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;
import core.graph.util.LustreLibCodeUtil;
import core.graph.util.LustreUtil;

public class ApplyToAndGetInstantiate extends AbstractProcessor<Graph>
{
	public ApplyToAndGetInstantiate()
	{
		super("GT Processor", "Instantiate ApplyToAndGet");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!instantiateApplyToAndGet(item))
			return false;

//		if (!assembleApplyToAndGet(item))
//			return false;

		return true;
	}

	private boolean instantiateApplyToAndGet(Graph graph)
	{
		var atags = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.APPLY_TO_AND_GET));

		for (var atag : atags)
		{
			var active = graph.findInEdges(
					atag, e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
								.orElseThrow() == 0).get(0);
			var func = graph.findOutEdges(
					atag, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
								.orElseThrow() == 1).get(0);
			var param = graph.findInEdges(
					atag, e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
								.orElseThrow() == 2).get(0);
			var ret = graph.findOutEdges(
					atag, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
								.orElseThrow() == 3).get(0);

//			if (active.from().getType() == GraphNode.Type.ActiveSource)

//			GraphNode call = LustreUtil.generateApplyToAndGetCall(graph, atag, func, active, param, ret);
			GraphNode call = LustreUtil.generateApplyToAndGetCall(graph, atag, func, active);
			GraphNode struct = LustreUtil.generateApplyToAndGetStruct(graph, atag, func, active, param, ret);
//			GraphNode struct = LustreUtil.generateApplyToAndGetStruct(graph, atag, func, active);

			// function call
			String name = func.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			LustreLibCodeUtil.CodeType lusName = LustreLibCodeUtil.CodeType.tryParse(name);

			if (lusName == null)
			{
				GraphNode node = LustreUtil.generateEmptyNode(name, param, ret);
				graph.addNode(node);
			}
			else
			{
				graph.addAppendix(lusName);
			}
			graph.removeNode(func.to());
			graph.removeNode(active.from());

			graph.removeNode(atag);
		}
		return true;
	}
}
