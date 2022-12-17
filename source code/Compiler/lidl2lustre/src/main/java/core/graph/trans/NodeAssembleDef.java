package core.graph.trans;

import core.common.AbstractProcessor;
import core.graph.Graph;
import core.graph.GraphNode;
import core.graph.util.LustreUtil;

public class NodeAssembleDef extends AbstractProcessor<Graph>
{
	public NodeAssembleDef()
	{
		super("GT Processor", "Assemble Node Definition");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!assembleNodeDef(item))
			return false;

		return true;
	}

	private boolean assembleNodeDef(Graph graph)
	{
		var nodeDefs = graph.findNodesOfType(GraphNode.Type.NodeDef);
		for (var def : nodeDefs)
		{
			var params = graph.findNodesInDirectChildren(
					def, n -> n.getType() == GraphNode.Type.ParamInstance);
			String paramsCode = "";
			if (params.size() != 0)
			{
				paramsCode =
						params.stream()
							  .map(n -> n.getMeta(GraphNode.MetaType.Code, String.class)
										 .orElseThrow())
							  .reduce((x, y) -> x + "; " + y)
							  .orElseThrow();
			}

			var rets = graph.findNodesInDirectParents(
					def, n -> n.getType() == GraphNode.Type.ReturnInstance);

			String retsCode = "";
			if (rets.size() != 0)
			{
				retsCode = rets.stream()
							   .map(n -> n.getMeta(GraphNode.MetaType.Code, String.class)
										  .orElseThrow())
							   .reduce((x, y) -> x + "; " + y)
							   .orElseThrow();
			}

			String pat = def.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
			String code = new LustreUtil.CodeBuilder(pat)
					.tag(LustreUtil.Tag.NodeParams, paramsCode)
					.tag(LustreUtil.Tag.Returns, retsCode)
					.build();
			def.addMeta(GraphNode.MetaType.Code, code);
			params.forEach(n -> def.copyOuts(graph, n));
			rets.forEach(n -> def.copyIns(graph, n));
			graph.removeNode(params);
			graph.removeNode(rets);
		}
		return true;
	}
}
