package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;
import core.graph.util.LustreUtil;

import java.util.HashMap;
import java.util.Map;

public class InterfaceRename extends AbstractProcessor<Graph>
{
	private final Map<String, GraphNode> ifInstanceMap;

	public InterfaceRename()
	{
		super("GT Processor", "Interface Rename");
		ifInstanceMap = new HashMap<>();
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		// read interface def
		if (!readingNamedInterfaces(item))
			return false;

		// rename anonymous interfaces like out interface of an interaction
		if (!renameAnonymousInterfaces(item))
			return false;

		return true;
	}

	private boolean renameAnonymousInterfaces(Graph graph)
	{
		graph.findNodesOfType(
				     GraphNode.Type.InterfaceDefinition,
				     in -> in.getMeta(GraphNode.MetaType.Name, String.class)
				             .orElseThrow()
				             .equals("theInterface"))
		     .forEach(i -> {
			     String name = i.parent()
			                    .getMeta(GraphNode.MetaType.Name, String.class)
			                    .orElseThrow()
			                    .replaceAll("\\$", "_");
			     name = LustreUtil.transformNonAlphabetic(name.concat("__OutInterface"));
			     i.addMeta(GraphNode.MetaType.Name, name);
		     });
		return true;
	}

	private boolean readingNamedInterfaces(Graph graph)
	{
		var interfaces = graph.findNodesOfType(
				GraphNode.Type.InterfaceDefinition,
				in -> !in.getMeta(GraphNode.MetaType.Name, String.class)
				         .orElseThrow()
				         .equals("theInterface"));
		for (var ifn : interfaces)
		{
			String sig = LidlUtil.getInterfaceSignature(graph, ifn);
			BetterLogger.debug("Inf Rename", String.format("Find interface with signature: %s", sig));
			if (!ifInstanceMap.containsKey(sig))
			{
				ifInstanceMap.put(sig, ifn);
			}
		}
		return true;
	}
}
