package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.List;

public class ModuleCollapse extends AbstractProcessor<Graph>
{

	public ModuleCollapse()
	{
		super("GT Processor", "Collapse Module");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph graph)
	{
		graph.setStage(pNameSimple);
		List<GraphNode> modules = graph.findNodes(node -> node.getType() == GraphNode.Type.ModuleRoot);
		GraphNode programRoot = graph.getRootNode();
		for (GraphNode module : modules)
		{
			for (GraphNode def : graph.findNodesInDirectChildren(module))
			{
				GraphEdge edge = new GraphEdge(programRoot, def, GraphEdge.Type.Root2Def);
				graph.addEdge(edge);
			}
			graph.removeNode(module);
		}

		return true;
	}
}