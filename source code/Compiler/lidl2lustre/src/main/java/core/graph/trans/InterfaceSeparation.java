package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceSeparation extends AbstractProcessor<Graph>
{
	public InterfaceSeparation()
	{
		super("GT Processor", "Interface Separation");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!interfaceSeparation(item))
			return false;
		// replace edge by in/out

		return true;
	}

	private boolean interfaceSeparation(Graph graph)
	{
		while (true)
		{
			var infs = graph.findNodesOfType(
					GraphNode.Type.InterfaceDefinition,
					n -> !n.getMeta(GraphNode.MetaType.InfExpanded, Boolean.class)
					       .orElse(false)
			);
			if (infs.isEmpty())
				return true;

			interfaceSeparation(graph, infs.get(0));
		}
	}

	private void interfaceSeparation(Graph graph, GraphNode inf)
	{
		var list = inf.getOuts()
		              .stream()
		              .map(GraphEdge::to)
		              .filter(n -> !n.hasMeta(GraphNode.MetaType.Direction))
		              .collect(Collectors.toList());
		for (var n : list)
		{
			var expNodes = interfaceElementExpansion(graph, n);
			for (var expNode : expNodes)
			{
				GraphEdge e = new GraphEdge(inf, expNode, GraphEdge.Type.Interface2InterfaceTypeElem);
				graph.addEdge(e);
			}
			graph.removeNode(n);
		}
		inf.addMeta(GraphNode.MetaType.InfExpanded, true);
	}

	private List<GraphNode> interfaceElementExpansion(Graph graph, GraphNode elemNode)
	{
		String namePrefix = elemNode.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		var temp = elemNode.getOuts()
		                   .stream()
		                   .filter(e -> e.getType() == GraphEdge.Type.TypeRef2Def)
		                   .collect(Collectors.toList());
		if (temp.isEmpty())
		{
			BetterLogger.error("InfElemExp", String.format("Error: reference <%s> not solved!", namePrefix));
			System.exit(-1);
		}

		GraphNode refDef = temp.get(0).to();
		interfaceSeparation(graph, refDef);

		List<GraphNode> expElems = new ArrayList<>();

		refDef.getOuts()
		      .stream()
		      .map(GraphEdge::to)
		      .forEach(en -> {
			      String nameSuffix = en.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();

			      GraphNode newElem = new GraphNode(GraphNode.Type.InterfaceTypeElem);
			      graph.addNode(newElem);
			      newElem.copyMeta(en);
			      newElem.addMeta(GraphNode.MetaType.Name, namePrefix + "." + nameSuffix);
			      expElems.add(newElem);
		      });
		graph.removeEdgeSimple(temp.get(0));

		if (refDef.getIns().size() == 0)
			graph.removeNodeRecursively(refDef);

		return expElems;
	}
}
