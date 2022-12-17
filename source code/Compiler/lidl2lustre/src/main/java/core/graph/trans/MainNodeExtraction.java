package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainNodeExtraction extends AbstractProcessor<Graph>
{
	public MainNodeExtraction()
	{
		super("GT Processor", "Extract Main Node");
//		addCallback(GraphCallbacks.outDigraph);
	}

	String entryName;

	private Predicate<GraphNode> typeFilter = node -> node.getType() == GraphNode.Type.InteractionDefinition;


	private Predicate<GraphNode> nameFilter = node -> node.getMeta(GraphNode.MetaType.Name, String.class)
	                                                      .orElseThrow()
	                                                      .equals(entryName);

	@Override
	protected boolean process(Graph item)
	{

		item.setStage(pNameSimple);

		entryName = item.getEntryName();
		List<GraphNode> entryNodeOrThrow = item.findNodes(typeFilter.and(nameFilter));
		if (entryNodeOrThrow.size() == 0)
		{
			BetterLogger.error("Extract Main", String.format("Main Interaction <%s> does not exists.", entryName));
			System.exit(-1);
		}
		GraphNode entry = entryNodeOrThrow.get(0);

		extractMainNodeTransformation(item, entry);

		return true;
	}

	private void extractMainNodeTransformation(Graph graph, GraphNode main)
	{
		GraphNode programRoot = graph.getRootNode();
		List<GraphNode> nodes = graph.findNodesInDirectChildren(programRoot, node -> !node.equals(main));
		nodes = nodes.stream()
		             .filter(node -> node.getIns()
		                                 .stream()
		                                 .filter(edge -> edge.getType() == GraphEdge.Type.TypeRef2Def)
		                                 .collect(Collectors.toList())
		                                 .size() == 0)
		             .collect(Collectors.toList());
		graph.removeNodeRecursively(nodes);

		graph.setRoot(main);
		graph.removeNode(programRoot);
	}

}
