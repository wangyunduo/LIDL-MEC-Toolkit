package core.graph;

import core.common.log.BetterLogger;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GraphEdge
{
	protected GraphNode fromNode;
	protected GraphNode toNode;

	protected Map<String, Object> meta;
	protected Type type;

	protected String id;

	public GraphEdge(GraphNode from, GraphNode to, Type type)
	{
		fromNode = from;
		toNode = to;
		meta = new HashMap<>();
		this.type = type;
	}

	public enum Type
	{
		// Original edge types
		Root2Module,
		Module2Def,
		Data2NestData,
		//		Data2DataType,
//		DataType2DataTypeElem,
		Data2DataTypeElem,
		Interface2NestInterface,
		Interface2InterfaceTypeElem,
		Interaction2Param,
		Interaction2Return,
		Interaction2OutInterface,
		Interaction2Expression,
		Interaction2NestInteraction,
		Expression2SubExpression,
		Expression2FunctionCall,
		Expression2Return,
		FunctionCall2Other,
		Param2Interface,
		// Not Original edge types
		Root2Def,
		TypeRef2Def,
		Composite2Element,
		CompositeElement2Expression,
		Reference2Identifier,
		CompositeElement2ParamRet,
		Param2ParamRet,
		// Lustre
		DataFlowSource2Dest,
		CodeSegmentLink,
		Node2Sentence,
		Node2Return,
		Node2Param,
		Node2Vars,
		Node2Body,
		Var2DefaultValue,
//		NodeCall2Def,
	}

	public enum Meta
	{
		FromIndex,
		FromInf,
		ToIndex,
		ToInf,
		// flags
		DataFlowSolved,
		//		CodeSegSolved,
		IsInitialValue
	}

	public String getId()
	{
		return id;
	}

	public GraphNode from()
	{
		return fromNode;
	}

	public GraphNode to()
	{
		return toNode;
	}

	public Type getType()
	{
		return type;
	}

	public Optional<Object> getMeta(Meta key)
	{
		if (!hasMeta(key))
			return Optional.empty();
		return Optional.ofNullable(meta.get(key.toString()));
	}

	public void addMeta(Meta metaKey, Object metaValue)
	{
		addMeta(metaKey.toString(), metaValue);
	}

	private void addMeta(String metaKey, Object metaValue)
	{
		meta.put(metaKey, metaValue);
	}


	public <T> Optional<T> getMeta(Meta key, Class<T> tClass)
	{
		return getMeta(key.toString(), tClass);
	}

	private <T> Optional<T> getMeta(String key, Class<T> tClass)
	{
		if (!meta.containsKey(key))
			return Optional.empty();
		if (tClass.isAssignableFrom(meta.get(key).getClass()))
			return Optional.ofNullable(tClass.cast(meta.get(key)));
		BetterLogger.error("GraphEdge", "Meta cast error! :: " + meta.get(key).getClass() + " <-> " + tClass);
		System.exit(-1);
		return Optional.empty();
	}

	public boolean hasMeta(Meta key)
	{
		return meta.containsKey(key.toString());
	}

	public void copyMeta(GraphEdge edge)
	{
		this.meta = new HashMap<>(edge.meta);
	}
}
