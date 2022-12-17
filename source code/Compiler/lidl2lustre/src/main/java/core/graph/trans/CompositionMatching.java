package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.List;
import java.util.stream.Collectors;

public class CompositionMatching extends AbstractProcessor<Graph>
{
	public CompositionMatching()
	{
		super("GT Processor", "Composition Matching");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!matchCompositionElements(item))
			return false;

		return true;
	}

	private boolean matchCompositionElements(Graph graph)
	{
		var list = graph.findNodesOfType(GraphNode.Type.CompositionElement);
		for (var elem : list)
		{
			var linkTos = findLinkedInterfaceElement(elem);
			for (var linkTo : linkTos)
			{
				GraphEdge edge = new GraphEdge(elem, linkTo, GraphEdge.Type.CompositeElement2ParamRet);
				graph.addEdge(edge);
			}
		}

		return true;
	}

	private List<GraphNode> findLinkedInterfaceElement(GraphNode node)
	{
		var parentNode = node.getIns().get(0).from();
		var nodeName = node.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		// TODO: Change to switch case to counter CoreIA and other situations.
		BetterLogger.debug(pNameSimple, String.format("Finding linked interface element of [%s:%s]", node.getId(), nodeName));
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
											   .startsWith(nodeName))
								 .collect(Collectors.toList());
//				case
		}
		// missing
		BetterLogger.error("GT Processor",
						   String.format("Find Linked Interface Element: [%s:%s] not found", node.getId(), nodeName));
		System.exit(-1);
		return null;
	}
}
