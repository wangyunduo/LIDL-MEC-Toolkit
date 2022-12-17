package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphEdge;

public class DataflowCleanSweep extends AbstractProcessor<Graph>
{
	public DataflowCleanSweep()
	{
		super("GT Processor", "Dataflow Clean Sweep");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		var list = item.findEdges(
				e -> e.getType() != GraphEdge.Type.DataFlowSource2Dest &&
				     e.getType() != GraphEdge.Type.Expression2FunctionCall &&
//				     e.getType() != GraphEdge.Type.NodeCall2Def &&
				     e.getType() != GraphEdge.Type.FunctionCall2Other);
		for (var e : list)
		{
			item.removeEdgeSimple(e);
		}
		item.cleanNodes();

		return true;
	}
}
