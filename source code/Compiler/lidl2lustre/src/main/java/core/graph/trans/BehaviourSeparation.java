package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;
import core.graph.util.LustreUtil;

import java.util.stream.Collectors;

public class BehaviourSeparation extends AbstractProcessor<Graph>
{
	public BehaviourSeparation()
	{
		super("GT Processor", "Behaviour Separation");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!behaviourSeparation(item))
			return false;

		return true;
	}

	private final int returnIdx = 1;
	private final int behaviourIdx = 1;

	private boolean behaviourSeparation(Graph graph)
	{
		var biaList = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				node -> node.getMeta(GraphNode.MetaType.Name, String.class)
				            .orElseThrow()
				            .equals(LidlUtil.Const.WITH_BEHAVIOUR)
		);

		for (var bia : biaList)
		{
			GraphNode parent = bia.parent();
			var retRaws = bia.getOuts()
			                 .stream()
			                 .filter(e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
			                              e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 1)
			                 .map(GraphEdge::to)
			                 .collect(Collectors.toList());
			if (retRaws.isEmpty())
			{
				BetterLogger.error("Separate Beh", "Missing param edge with fromIdx=1");
				System.exit(-1);
			}
			GraphNode exp = retRaws.get(0);

			var behRaws = bia.getOuts()
			                 .stream()
			                 .filter(e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
			                              e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 2)
			                 .map(GraphEdge::to)
			                 .collect(Collectors.toList());
			if (behRaws.isEmpty())
			{
				BetterLogger.error("Separate Beh", "Missing param edge with fromIdx=1");
				System.exit(-1);
			}
			GraphNode beh = behRaws.get(0);

			GraphEdge exp2ret = new GraphEdge(parent, exp, GraphEdge.Type.Interaction2Return);
			graph.addEdge(exp2ret);

			GraphNode as = LustreUtil.generateActiveSource();
			graph.addNode(as);
			GraphEdge as2beh = new GraphEdge(as, beh, GraphEdge.Type.DataFlowSource2Dest);
			as2beh.addMeta(GraphEdge.Meta.FromInf, "{theInterface:Activation-out}");
			as2beh.addMeta(GraphEdge.Meta.FromIndex, 0);
			as2beh.addMeta(GraphEdge.Meta.ToIndex, 0);
			graph.addEdge(as2beh);

//			GraphEdge parent2sentence = new GraphEdge(parent, beh, GraphEdge.Type.Node2Sentence);
//			graph.addEdge(parent2sentence);

			graph.removeNode(bia);
		}
		return true;
	}
}
