package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

public class CompositionSeparation extends AbstractProcessor<Graph>
{
	public CompositionSeparation()
	{
		super("GT Processor", "Composition Separation");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!findCompositionsAndDisassemble(item))
			return false;

		return true;
	}

	private boolean findCompositionsAndDisassemble(Graph graph)
	{
		var comps = graph.findNodesOfType(
				GraphNode.Type.Expression,
				n -> n.getMeta(GraphNode.MetaType.Type, String.class)
				      .orElseThrow()
				      .equals(GraphNode.MetaValue.Composition));

		for (GraphNode comp : comps)
		{
			GraphNode parent = comp.getIns().get(0).from();
			GraphEdge parent2comp = comp.getIns().get(0);
			var elems = graph.findNodesInDirectChildren(
					comp,
					n -> n.getType() == GraphNode.Type.CompositionElement);

			for (GraphNode elem : elems)
			{
				GraphEdge p2e = new GraphEdge(parent, elem, GraphEdge.Type.Node2Sentence);
				p2e.copyMeta(parent2comp);
				graph.addEdge(p2e);
			}
			graph.removeNode(comp);
		}
		return true;
	}
}
