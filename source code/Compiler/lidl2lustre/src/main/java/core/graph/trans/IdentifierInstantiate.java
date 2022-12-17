package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphNode;
import core.graph.util.LustreUtil;

public class IdentifierInstantiate extends AbstractProcessor<Graph>
{
	public IdentifierInstantiate()
	{
		super("GT Processor", "Instantiate Identifier");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!instantiateIdentifier(item))
			return false;
		return true;
	}

	private boolean instantiateIdentifier(Graph graph)
	{
		var idents = graph.findNodesOfType(GraphNode.Type.Identifier);

		for (var ident : idents)
		{
			String name = ident.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			GraphNode identIns = LustreUtil.generateLocalVariable(name);
			graph.addNode(identIns);
			identIns.copyMeta(ident);
			identIns.copyEdges(graph, ident);
			graph.removeNode(ident);
		}

		return true;
	}
}
