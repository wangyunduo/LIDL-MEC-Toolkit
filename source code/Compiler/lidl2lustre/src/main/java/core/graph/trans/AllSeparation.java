package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;
import core.graph.util.LustreUtil;

import java.util.stream.Collectors;

public class AllSeparation extends AbstractProcessor<Graph>
{
	public AllSeparation()
	{
		super("GT Processor", "All Separation");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!allSeparation(item))
			return false;

		return true;
	}

	private final int returnIdx = 1;
	private final int behaviourIdx = 1;

	private boolean allSeparation(Graph graph)
	{
		var allList = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				node -> node.getMeta(GraphNode.MetaType.Name, String.class)
							.orElseThrow()
							.equals(LidlUtil.Const.All2)
		);

		for (var all : allList)
		{
			GraphNode parent = all.parent();

			var beh1Raws = all.getOuts()
							  .stream()
							  .filter(e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
										   e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
											.orElseThrow() == 1)
							  .map(GraphEdge::to)
							  .collect(Collectors.toList());
			if (beh1Raws.isEmpty())
			{
				BetterLogger.error("Separate All", "Missing param edge with fromIdx=1");
				System.exit(-1);
			}
			GraphNode beh1 = beh1Raws.get(0);

			var beh2Raws = all.getOuts()
							  .stream()
							  .filter(e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
										   e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
											.orElseThrow() == 2)
							  .map(GraphEdge::to)
							  .collect(Collectors.toList());
			if (beh2Raws.isEmpty())
			{
				BetterLogger.error("Separate All", "Missing param edge with fromIdx=1");
				System.exit(-1);
			}

			// condition flag (eidx = 1)
			var flagRaws =
					all.getIns()
					   .stream()
					   .filter(e -> (e.getType() == GraphEdge.Type.Expression2SubExpression ||
									 e.getType() == GraphEdge.Type.DataFlowSource2Dest) &&
									e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() == 0)
					   .map(GraphEdge::from)
					   .collect(Collectors.toList());

			GraphNode as1;
			GraphNode as2;
			if (flagRaws.size() != 1)
			{
				as1 = LustreUtil.generateActiveSource();
				as2 = LustreUtil.generateActiveSource();
			}
			else
			{
				GraphNode flag = flagRaws.get(0);
				as1 = as2 = flag;
			}
			GraphNode beh2 = beh2Raws.get(0);
			graph.addNode(as1, as2);
			GraphEdge as12beh1 = new GraphEdge(as1, beh1, GraphEdge.Type.DataFlowSource2Dest);
			GraphEdge as22beh2 = new GraphEdge(as2, beh2, GraphEdge.Type.DataFlowSource2Dest);
			as12beh1.addMeta(GraphEdge.Meta.FromInf, "{theInterface:Activation-out}");
			as12beh1.addMeta(GraphEdge.Meta.FromIndex, 0);
			as12beh1.addMeta(GraphEdge.Meta.ToIndex, 0);
			as22beh2.addMeta(GraphEdge.Meta.FromInf, "{theInterface:Activation-out}");
			as22beh2.addMeta(GraphEdge.Meta.FromIndex, 0);
			as22beh2.addMeta(GraphEdge.Meta.ToIndex, 0);
			graph.addEdge(as12beh1, as22beh2);

//			GraphEdge parent2sentence = new GraphEdge(parent, beh, GraphEdge.Type.Node2Sentence);
//			graph.addEdge(parent2sentence);

			graph.removeNode(all);
		}
		return true;
	}
}
