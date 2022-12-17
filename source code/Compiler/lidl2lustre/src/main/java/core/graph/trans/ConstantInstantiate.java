package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphNode;
import core.graph.util.LustreUtil;

public class ConstantInstantiate extends AbstractProcessor<Graph>
{

	public ConstantInstantiate()
	{
		super("GT Processor", "Instantiate Constants");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!instantiateConstant(item))
			return false;
		return true;
	}

	private boolean instantiateConstant(Graph graph)
	{
		var consts = graph.findNodesOfType(
				GraphNode.Type.Expression,
				n -> n.getMeta(GraphNode.MetaType.Type, String.class)
					  .orElseThrow()
					  .equals(GraphNode.MetaValue.Literal)
		);

		for (var cst : consts)
		{
			String type = cst.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();
			String value = cst.getMeta(GraphNode.MetaType.Value, String.class).orElseThrow();
			GraphNode cstIns = LustreUtil.generateConstant(type, value);
			graph.addNode(cstIns);
			cstIns.copyMeta(cst);
			cstIns.copyEdges(graph, cst);
			graph.removeNode(cst);
		}

		return true;
	}
}
