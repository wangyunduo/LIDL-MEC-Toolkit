package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.List;
import java.util.stream.Collectors;

public class IdentifierCollapse extends AbstractProcessor<Graph>
{
	public IdentifierCollapse()
	{
		super("GT Processor", "Identifier Collapse");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		while (true)
		{
			List<GraphNode> unCollapseIdents =
					item.findNodesOfType(GraphNode.Type.Identifier)
					    .stream()
					    .filter(n -> !n.getMeta(GraphNode.MetaType.IdentCollapsed, Boolean.class).orElse(false))
					    .collect(Collectors.toList());

			if (unCollapseIdents.isEmpty())
				break;

			collapseSimilarIdent(item, unCollapseIdents.get(0));
		}

		return true;
	}

	private void collapseSimilarIdent(Graph graph, GraphNode node)
	{
		var iaDef = graph.findNodeInOriginalParents(
				node,
				n -> n.getType() == GraphNode.Type.InteractionDefinition
		);
		var similarIdents = graph.findNodesInChildren(
				iaDef,
				n -> n.getType() == GraphNode.Type.Identifier &&
				     !n.getId().equals(node.getId()) &&
				     !n.getMeta(GraphNode.MetaType.IdentCollapsed,
				                Boolean.class).orElse(false) &&
				     node.getMeta(GraphNode.MetaType.Name, String.class)
				         .orElseThrow()
				         .equals(n.getMeta(GraphNode.MetaType.Name, String.class)
				                  .orElseThrow())
		);

		for (var ident : similarIdents)
		{
			for (var edge : ident.getIns())
			{
				GraphEdge newEdge = new GraphEdge(edge.from(), node, edge.getType());
				newEdge.copyMeta(edge);
				graph.addEdge(newEdge);
			}

			for (var edge : ident.getOuts())
			{
				GraphEdge newEdge = new GraphEdge(node, edge.to(), edge.getType());
				newEdge.copyMeta(edge);
				graph.addEdge(newEdge);
			}

			graph.removeNode(ident);
		}

		node.addMeta(GraphNode.MetaType.IdentCollapsed, true);
	}
}
