package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.stream.Collectors;

/**
 * Collapse Simple Out Interface
 */
public class InterfaceCollapse extends AbstractProcessor<Graph>
{
	public InterfaceCollapse()
	{
		super("GT Processor", "Interface Collapse");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!collapseInterface(item))
			return false;

		return true;
	}

	private boolean collapseInterface(Graph graph)
	{
		var outInfs =
				graph.findEdgesOfType(GraphEdge.Type.Interaction2OutInterface)
					 .stream()
					 .map(GraphEdge::to)
					 .collect(Collectors.toList());

		var simpleInfs =
				outInfs.stream()
					   .filter(inf -> {
						   var list = graph.findNodesInDirectChildren(inf, n -> n.getType() == GraphNode.Type.InterfaceTypeElem);
						   if (list.size() != 1)
							   return false;
						   var elem = list.get(0);
						   var name = elem.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
						   if (name.equals("theInterface") && !elem.hasMeta(GraphNode.MetaType.Direction))
							   return true;
						   return false;
					   })
					   .collect(Collectors.toList());

		for (var inf : simpleInfs)
		{
			var name = inf.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			BetterLogger.debug("Collapse Interface", String.format("Collapsing [%s:%s]", inf.getId(), name));
			var ina = graph.findInEdges(inf, e -> e.getType() == GraphEdge.Type.Interaction2OutInterface).get(0).from();
			var elem = graph
					.findNodesInDirectChildren(inf, n -> n.getType() == GraphNode.Type.InterfaceTypeElem)
					.get(0);
			var ref = graph
					.findOutEdges(elem, e -> e.getType() == GraphEdge.Type.TypeRef2Def)
					.stream()
					.map(GraphEdge::to)
					.collect(Collectors.toList())
					.get(0);
			GraphEdge edge = new GraphEdge(ina, ref, GraphEdge.Type.Interaction2OutInterface);
			graph.addEdge(edge);
			graph.removeNodeRecursively(inf);
		}

		return true;
	}
}
