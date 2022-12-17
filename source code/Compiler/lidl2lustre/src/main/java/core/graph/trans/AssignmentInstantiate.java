package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;
import core.graph.util.LustreUtil;

public class AssignmentInstantiate extends AbstractProcessor<Graph>
{
	public AssignmentInstantiate()
	{
		super("GT Processor", "Instantiate Assignment");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!instantiateAssignment(item))
			return false;

		return true;
	}

	private boolean instantiateAssignment(Graph graph)
	{
		var asgs = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.ASSIGNMENT));

		for (var asg : asgs)
		{
			BetterLogger.debug("Instantiate Assignment", asg.getId());
			var temp = graph.findInEdges(
					asg, e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
							   .orElseThrow() == 0);
			GraphEdge active;
			if (temp.size() == 0)
			{
				GraphNode as = LustreUtil.generateActiveSource();
				graph.addNode(as);
				GraphEdge as2beh = new GraphEdge(as, asg, GraphEdge.Type.DataFlowSource2Dest);
				as2beh.addMeta(GraphEdge.Meta.FromInf, "{theInterface:Activation-out}");
				as2beh.addMeta(GraphEdge.Meta.ToInf, "{theInterface:Activation-in}");
				as2beh.addMeta(GraphEdge.Meta.FromIndex, 0);
				as2beh.addMeta(GraphEdge.Meta.ToIndex, 0);
				graph.addEdge(as2beh);
				active = as2beh;
			}
			else
			{
				active = temp.get(0);
			}
			var left = graph.findOutEdges(
					asg, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
							   .orElseThrow() == 1).get(0);
			var right = graph.findInEdges(
					asg, e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
							   .orElseThrow() == 2).get(0);

			if (right.from().getType() == GraphNode.Type.NodeCall)
			{
//				var inf = right.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow();
//				var cinf = right.getMeta(GraphEdge.Meta.FromInf, String.class).orElseThrow();
				GraphNode tempVar = LustreUtil.generateLocalVariable(right.getId() + "_" + asg.getId());
				graph.addNode(tempVar);
				GraphEdge right2var = new GraphEdge(right.from(), tempVar, GraphEdge.Type.DataFlowSource2Dest);
				GraphEdge var2asg = new GraphEdge(tempVar, asg, GraphEdge.Type.DataFlowSource2Dest);
				right2var.copyMeta(right);
				var2asg.copyMeta(right);
				graph.addEdge(right2var, var2asg);
				graph.removeEdgeSimple(right);

				right = var2asg;
			}

			GraphNode call = LustreUtil.generateAssignmentCall(graph, asg, active, left, right);
			graph.addNode(call);
			GraphNode struct = LustreUtil.generateAssignmentStruct(graph, asg, active, left, right);
			if (struct != null)
				graph.addNode(struct);
			graph.removeNode(asg);
//			graph.setStage(asg.getId());
//			GraphCallbacks.outDigraph.apply(graph, workDir);
		}
		return true;
	}
}