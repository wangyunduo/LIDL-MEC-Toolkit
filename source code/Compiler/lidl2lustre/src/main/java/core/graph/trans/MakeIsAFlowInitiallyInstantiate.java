package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;

public class MakeIsAFlowInitiallyInstantiate extends AbstractProcessor<Graph>
{
	public MakeIsAFlowInitiallyInstantiate()
	{
		super("GT Processor", "Instantiate MakeIsAFlowInitially");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!instantiateMIAFI(item))
			return false;

		return true;
	}

	private boolean instantiateMIAFI(Graph graph)
	{
		var miafis = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.MAKE_IS_A_FLOW_INITIALLY)
		);

		for (var miafi : miafis)
		{
			BetterLogger.debug("MIAFI Instantiate", "current: " + miafi.getId());
			var idx0 = graph.findInEdges(
					miafi,
					e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest
			).stream().findFirst().orElseThrow().from();

			var idx1 = graph.findOutEdges(
					miafi,
					e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
						 e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
						  .orElseThrow() == 1
			).stream().findFirst().orElseThrow().to();

			var idx2 = graph.findOutEdges(
					miafi,
					e -> e.getType() == GraphEdge.Type.Expression2SubExpression &&
						 e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
						  .orElseThrow() == 2
			).stream().findFirst().orElseThrow().to();

			if (idx0.getType() != GraphNode.Type.ActiveSource)
			{
				BetterLogger.error("MIAFI Sematic", "Unsupported variable active flag");
				return false;
			}

			if (idx1.getType() != GraphNode.Type.Identifier)
			{
				BetterLogger.error("MIAFI Sematic", "Unsupported non-variable receiver");
				return false;
			}

			GraphEdge edge = new GraphEdge(idx2, idx1, GraphEdge.Type.DataFlowSource2Dest);
			edge.addMeta(GraphEdge.Meta.IsInitialValue, true);
			graph.addEdge(edge);
			graph.removeNode(idx0, miafi);
		}
		return true;
	}
}