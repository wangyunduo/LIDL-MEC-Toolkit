package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;

import java.util.stream.Collectors;

public class WhenThenSeparation extends AbstractProcessor<Graph>
{
	public WhenThenSeparation()
	{
		super("GT Processor", "WhenThen Separation");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!whenThenSeparation(item))
			return false;

		return true;
	}

	private final int returnIdx = 1;
	private final int behaviourIdx = 1;

	private boolean whenThenSeparation(Graph graph)
	{
		var wtiaList = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				node -> node.getMeta(GraphNode.MetaType.Name, String.class)
				            .orElseThrow()
				            .equals(LidlUtil.Const.WHEN_THEN)
		);

		for (var wtia : wtiaList)
		{
			// wtia: when(flag)then(beh)
			GraphNode parent = graph.findInEdges(wtia).stream().findFirst().orElseThrow().from();

			// condition flag (eidx = 1)
			var flagRaws =
					wtia.getOuts()
					    .stream()
					    .filter(e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
					                 e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 1)
					    .map(GraphEdge::to)
					    .collect(Collectors.toList());
			if (flagRaws.size() != 1)
			{
				BetterLogger.error("Separate WT",
				                   "Error param edge with fromIdx=1, edge list size: " + flagRaws.size());
				System.exit(-1);
			}
			GraphNode flag = flagRaws.get(0);

			// return beh (eidx = 2)
			var behRaws =
					wtia.getOuts()
					    .stream()
					    .filter(e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
					                 e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 2)
					    .map(GraphEdge::to)
					    .collect(Collectors.toList());
			if (behRaws.size() != 1)
			{
				BetterLogger.error("Separate WT", "Error param edge with fromIdx=2, edge list size: " + behRaws.size());
				System.exit(-1);
			}
			GraphNode beh = behRaws.get(0);

			GraphEdge flag2beh = new GraphEdge(flag, beh, GraphEdge.Type.DataFlowSource2Dest);
			flag2beh.addMeta(GraphEdge.Meta.FromInf, "{theInterface:Activation-out}");
			flag2beh.addMeta(GraphEdge.Meta.FromIndex, 0);
			flag2beh.addMeta(GraphEdge.Meta.ToIndex, 0);
			graph.addEdge(flag2beh);

//			GraphEdge parent2sentence = new GraphEdge(parent, beh, GraphEdge.Type.Node2Sentence);
//			graph.addEdge(parent2sentence);

			graph.removeNode(wtia);
		}
		return true;
	}
}
