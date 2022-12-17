package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

public class ParamMatching extends AbstractProcessor<Graph>
{

	public ParamMatching()
	{
		super("GT Processor", "Param Matching");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!matchParams(item))
			return false;

		return true;
	}

	private boolean matchParams(Graph graph)
	{
		var list = graph.findNodesOfType(GraphNode.Type.InteractionParam);
		for (var elem : list)
		{
			GraphNode linkTo = findLinkedParam(graph, elem);
			GraphEdge edge = new GraphEdge(elem, linkTo, GraphEdge.Type.Param2ParamRet);
			graph.addEdge(edge);
		}

		return true;
	}

	private GraphNode findLinkedParam(Graph graph, GraphNode param)
	{
		var parentNode = param.getIns()
							  .stream()
							  .filter(e -> e.getType() == GraphEdge.Type.Interaction2Param)
							  .findFirst()
							  .orElseThrow()
							  .from();
		var nodeName =
				graph.findOutEdges(param, e -> e.getType() == GraphEdge.Type.Param2Interface)
					 .get(0).to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		// TODO: Change to switch case to counter CoreIA and other situations.
		switch (parentNode.getType())
		{
			case NodeDef:
				return parentNode.getOuts()
								 .stream()
								 .map(GraphEdge::to)
								 .filter(n -> n.getType() == GraphNode.Type.ParamInstance ||
											  n.getType() == GraphNode.Type.ReturnInstance)
								 .filter(n -> n.getMeta(GraphNode.MetaType.Name, String.class)
											   .orElseThrow()
											   .equals(nodeName))
								 .findFirst()
								 .orElseThrow();
//				case
		}
		// missing
		BetterLogger.error("GT Processor", String.format("Find Linked Param: %s not found", nodeName));
		System.exit(-1);
		return null;
	}
}
