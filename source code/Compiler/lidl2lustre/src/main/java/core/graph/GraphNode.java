package core.graph;

import core.common.log.BetterLogger;

import java.util.*;

public class GraphNode
{
	protected List<GraphEdge> ins;
	protected List<GraphEdge> outs;
	protected Map<GraphEdge.Type, List<GraphEdge>> inMap;
	protected Map<GraphEdge.Type, List<GraphEdge>> outMap;

	protected Map<String, Object> meta;
	protected Type type;

	protected String id;

	public GraphNode(Type type)
	{
		ins = new ArrayList<>();
		outs = new ArrayList<>();
		inMap = new HashMap<>();
		outMap = new HashMap<>();
		meta = new HashMap<>();
		this.type = type;
	}

	public void clear()
	{
		ins = new ArrayList<>();
		outs = new ArrayList<>();
		inMap = new HashMap<>();
		outMap = new HashMap<>();
		meta = new HashMap<>();
	}

	public enum Type
	{
		// program root
		ProgramRoot,
		// submodule root, correspond to each lidl source file
		ModuleRoot,
		// lidl data def
		DataDefinition,
		DataType,
		DataTypeElem,
		// lidl interface def,
		InterfaceDefinition,
		InterfaceTypeElem,
		// lidl interaction def,
		InteractionDefinition,
		InteractionParam,
		// lidl expression,
		Expression,
		// lidl composite
		CompositionElement,
		// lidl ident
		Identifier,
		// lidl native function call
		FunctionCall,
		// lidl core interaction
		CoreInteraction,
		// code clips
		InterfaceInstance,
		ActiveSource,
		LocalVariable,
		Const,
		NodeVars,
		NodeDef,
		NodeBody,
		NodeCall,
		Node,
		ParamInstance,
		ReturnInstance,
		Assignment,
		InternalCallParam,
	}

	public enum EdgeDir
	{
		In, Out;
	}

	public enum MetaType
	{
		Name,
		Type,
		Package,
		Imports,
		Direction,
		SubType,
		ClassType,
		Value,
		// flag
		IdentCollapsed,
		InfExpanded,
		DataFlowSolved,
		VarFromSolved,
		VarToSolved,
		// code clip
		Code,
		InfTypes,
	}

	public static class MetaValue
	{
		public static final String Interaction = "interaction";
		public static final String Activation = "Activation";
		public static final String Number = "Number";
		public static final String Text = "Text";
		public static final String Boolean = "Boolean";
		public static final String Literal = "literal";
		public static final String Reference = "ref";
		public static final String Composition = "composition";
		public static final String Function = "func";
		public static final String CoreInteraction = "core_interaction";
		public static final String Identifier = "ident";
		public static final String InfDirIn = "in";
		public static final String InfDirOut = "out";
	}

	@Deprecated
	public GraphNode parent()
	{
		return ins.get(0).fromNode;
	}

	public List<GraphEdge> getIns()
	{
		return ins;
	}

	public List<GraphEdge> getOuts()
	{
		return outs;
	}

	public Optional<Object> getMeta(MetaType key)
	{
		return getMeta(key.toString());
	}

	private Optional<Object> getMeta(String key)
	{
		if (!meta.containsKey(key))
			return Optional.empty();
		return Optional.ofNullable(meta.get(key));
	}

	public <T> Optional<T> getMeta(MetaType key, Class<T> tClass)
	{
		return getMeta(key.toString(), tClass);
	}

	private <T> Optional<T> getMeta(String key, Class<T> tClass)
	{
		if (!meta.containsKey(key))
			return Optional.empty();
		if (tClass.isAssignableFrom(meta.get(key).getClass()))
			return Optional.ofNullable(tClass.cast(meta.get(key)));
		BetterLogger.error("GraphNode", "Meta cast error!");
		System.exit(-1);
		return Optional.empty();
	}

	public Type getType()
	{
		return type;
	}

	public String getId()
	{
		return id;
	}

	public void addEdge(EdgeDir dir, GraphEdge edge)
	{
		switch (dir)
		{
			case In:
				ins.add(edge);
				inMap.putIfAbsent(edge.type, new ArrayList<>());
				inMap.get(edge.type).add(edge);
				break;
			case Out:
				outs.add(edge);
				outMap.putIfAbsent(edge.type, new ArrayList<>());
				outMap.get(edge.type).add(edge);
				break;
		}
	}

	public void addMeta(MetaType metaKey, Object metaValue)
	{
		addMeta(metaKey.toString(), metaValue);
	}

	private void addMeta(String metaKey, Object metaValue)
	{
		meta.put(metaKey, metaValue);
	}

	public boolean hasMeta(MetaType metaKey)
	{
		return meta.containsKey(metaKey.toString());
	}

	public void copyIns(Graph graph, GraphNode node)
	{
//		if (!ins.isEmpty())
//			BetterLogger.warn("Edge Copy", "In edge set is not empty, information may lose");
//		ins.clear();
		for (int idx = 0; idx < node.getIns().size(); idx++)
		{
			var in = node.getIns().get(idx);
			GraphEdge e = new GraphEdge(in.fromNode, this, in.type);
			e.copyMeta(in);
			graph.addEdge(e);
		}
	}

	public void copyOuts(Graph graph, GraphNode node)
	{
//		if (!outs.isEmpty())
//			BetterLogger.warn("Edge Copy", "Out edge set is not empty, information may lose");
//		outs.clear();
		for (int idx = 0; idx < node.getOuts().size(); idx++)
		{
			var out = node.getOuts().get(idx);
			GraphEdge e = new GraphEdge(this, out.toNode, out.type);
			e.copyMeta(out);
			graph.addEdge(e);
		}
	}

	public void copyEdges(Graph graph, GraphNode node)
	{
		copyIns(graph, node);
		copyOuts(graph, node);
	}

	public void copyMeta(GraphNode node)
	{
		meta.putAll(node.meta);
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("GraphNode type=").append(type);
		if (hasMeta(MetaType.Name))
			sb.append(" name=").append(getMeta(MetaType.Name, String.class).orElseThrow());
		sb.append(" id='").append(id).append('\'');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (!(o instanceof GraphNode)) return false;
		GraphNode graphNode = (GraphNode) o;
		return Objects.equals(id, graphNode.id);
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}
}
