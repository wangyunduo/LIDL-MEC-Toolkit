package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LustreUtil;

import java.util.*;
import java.util.stream.Collectors;

public class NodeAssembleFlow extends AbstractProcessor<Graph>
{
	public NodeAssembleFlow()
	{
		super("GT Processor", "Node Assemble Flow");
//		addCallback(GraphCallbacks.outDigraph);
		init();
	}

	private final AssembleHandler[][] map = new AssembleHandler[GraphNode.Type.values().length][GraphNode.Type.values().length];

	private void init()
	{
		map[GraphNode.Type.NodeCall.ordinal()][GraphNode.Type.LocalVariable.ordinal()] = this::CallVarHandler;
		map[GraphNode.Type.NodeCall.ordinal()][GraphNode.Type.ReturnInstance.ordinal()] = this::CallReturnHandler;
		map[GraphNode.Type.NodeCall.ordinal()][GraphNode.Type.NodeCall.ordinal()] = this::CallCallHandler;
		map[GraphNode.Type.NodeDef.ordinal()][GraphNode.Type.ParamInstance.ordinal()] = this::emptyHandler;
		map[GraphNode.Type.ParamInstance.ordinal()][GraphNode.Type.LocalVariable.ordinal()] = this::ParamVarHandler;
		map[GraphNode.Type.ParamInstance.ordinal()][GraphNode.Type.NodeCall.ordinal()] = this::ParamCallHandler;
		map[GraphNode.Type.ParamInstance.ordinal()][GraphNode.Type.InternalCallParam.ordinal()] = this::ParamCallParamHandler;
		map[GraphNode.Type.ReturnInstance.ordinal()][GraphNode.Type.NodeDef.ordinal()] = this::emptyHandler;
		map[GraphNode.Type.LocalVariable.ordinal()][GraphNode.Type.NodeCall.ordinal()] = this::VarCallHandler;
		map[GraphNode.Type.LocalVariable.ordinal()][GraphNode.Type.ReturnInstance.ordinal()] = this::VarReturnHandler;
		map[GraphNode.Type.LocalVariable.ordinal()][GraphNode.Type.InternalCallParam.ordinal()] = this::VarCallParamHandler;
		map[GraphNode.Type.InternalCallParam.ordinal()][GraphNode.Type.NodeCall.ordinal()] = this::CallParamCallHandler;
		map[GraphNode.Type.Const.ordinal()][GraphNode.Type.ReturnInstance.ordinal()] = this::ConstReturnHandler;
		map[GraphNode.Type.Const.ordinal()][GraphNode.Type.NodeCall.ordinal()] = this::ConstCallHandler;
	}

	@Override
	protected boolean process(Graph item)
	{

		if (!collectVariables(item))
			return false;

		if (!generateCallArgs(item))
			return false;

		if (!generateCallRets(item))
			return false;

		if (!assembleFromNode(item))
			return false;

		if (!assembleFromConstant(item))
			return false;

		if (!assembleInit(item))
			return false;

		if (!assembleRest(item))
			return false;

		callAssembleCallbacks();

		if (!cleanCodeLink(item))
			return false;

		item.setStage(pNameSimple);
		return true;
	}

	private boolean cleanCodeLink(Graph graph)
	{
		var links = graph.findEdgesOfType(GraphEdge.Type.CodeSegmentLink);
		Set<String> set = new HashSet<>();
		List<GraphEdge> needRemove = new ArrayList<>();
		for (var link : links)
		{
			String from = link.from().getId();
			String to = link.to().getId();
			String id = from + "_" + to;
			if (set.contains(id))
			{
				needRemove.add(link);
			}
			else
			{
				set.add(id);
			}
		}
		for (var e : needRemove)
		{
			graph.removeEdgeSimple(e);
		}
		return true;
	}

	private boolean assembleRest(Graph graph)
	{

		return true;
	}

	private boolean assembleInit(Graph graph)
	{
		var inits = graph.findEdgesOfType(
				GraphEdge.Type.DataFlowSource2Dest,
				e -> e.getMeta(GraphEdge.Meta.IsInitialValue, Boolean.class).orElse(false)
		);

		for (var init : inits)
		{
			var val = init.from();
			var ident = init.to();
			var call = graph.findInEdges(
					ident,
					e -> e.getType() == GraphEdge.Type.CodeSegmentLink
			).stream().findFirst().orElseThrow().from();
			var name = ident.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
			String value;
			if (val.getType() == GraphNode.Type.ParamInstance)
			{
				value = val.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			}
			else
			{
				value = val.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
			}

			String pat = String.format("%s =", name);
			String code = String.format("%s = %s ->", name, value);

			String prevCode = call.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
			String afterCode = prevCode.replaceAll(pat, code);
			call.addMeta(GraphNode.MetaType.Code, afterCode);
			graph.removeEdgeSimple(init);
		}

		return true;
	}

	int counter = 0;

	private boolean generateCallArgs(Graph graph)
	{
		var calls = graph.findNodesOfType(GraphNode.Type.NodeCall);
		for (var call : calls)
		{
			var param =
					graph.findInEdges(call)
					     .stream()
					     .map(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow())
					     .sorted(Integer::compareTo)
					     .collect(Collectors.toList());
			var pat = call.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
			String code = new LustreUtil.CodeBuilder(pat)
					.tag(
							LustreUtil.Tag.CallParams,
							LustreUtil.generateMultiArgPattern(param))
					.build();
			call.addMeta(GraphNode.MetaType.Code, code);
		}
		return true;
	}

	private boolean generateCallRets(Graph graph)
	{
		var calls = graph.findNodesOfType(GraphNode.Type.NodeCall);
		for (var call : calls)
		{
			BetterLogger.debug("GenerateCallRets", call.getId());
			var ret =
					graph.findOutEdges(call)
					     .stream()
					     .filter(e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest)
					     .map(e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow())
					     .sorted(Integer::compareTo)
					     .collect(Collectors.toList());
			var pat = call.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
			String code = new LustreUtil.CodeBuilder(pat)
					.tag(
							LustreUtil.Tag.Returns,
							LustreUtil.generateMultiRetPattern(ret))
					.build();
			call.addMeta(GraphNode.MetaType.Code, code);
		}
		return true;
	}

	private boolean assembleFromConstant(Graph graph)
	{
		var consts = graph.findNodesOfType(GraphNode.Type.Const);

		for (var cst : consts)
		{
			Queue<GraphEdge> queue = new ArrayDeque<>();
			Set<String> flag = new HashSet<>();
			queue.offer(cst.getOuts().stream().findFirst().orElseThrow());
			var def = findConstRegionNode(graph, cst);
			if (def != null)
			{
				GraphEdge edge = new GraphEdge(def, cst, GraphEdge.Type.CodeSegmentLink);
				graph.addEdge(edge);
			}

			while (!queue.isEmpty())
			{
				GraphEdge cur = queue.poll();
				BetterLogger.debug("AssembleFromCST", String.format("%s -> %s", cur.from().getId(), cur.to().getId()));
//				graph.setStage(pNameSimple + counter++);
				GraphNode anchor = findHandler(cur).apply(graph, cur) ? cur.to() : cur.from();
//				GraphCallbacks.outDigraph.apply(graph, workDir);
				graph.findOutEdges(
						     anchor,
						     e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest &&
						          !e.getMeta(GraphEdge.Meta.IsInitialValue, Boolean.class).orElse(false) &&
						          !flag.contains(e.getId()))
				     .forEach(e -> {
					     queue.offer(e);
					     flag.add(e.getId());
				     });
			}
		}
		return true;
	}

	private boolean assembleFromNode(Graph graph)
	{
		var nodeDefs = graph.findNodesOfType(GraphNode.Type.NodeDef);

		for (var nodeDef : nodeDefs)
		{
			Queue<GraphEdge> queue = new ArrayDeque<>();
			Set<String> flag = new HashSet<>();
			graph.findOutEdges(
					     nodeDef,
					     e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest &&
					          !e.getMeta(GraphEdge.Meta.IsInitialValue, Boolean.class).orElse(false) &&
					          !flag.contains(e.getId()))
			     .forEach(e -> {
				     queue.offer(e);
				     flag.add(e.getId());
			     });
			while (!queue.isEmpty())
			{
				GraphEdge cur = queue.poll();
				BetterLogger.debug("AssembleFromNode", String.format("%s -> %s", cur.from().getId(), cur.to().getId()));
//				graph.setStage(pNameSimple + counter++);
				GraphNode anchor = findHandler(cur).apply(graph, cur) ? cur.to() : cur.from();
//				GraphCallbacks.outDigraph.apply(graph, workDir);
				graph.findOutEdges(
						     anchor,
						     e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest &&
						          !e.getMeta(GraphEdge.Meta.IsInitialValue, Boolean.class).orElse(false) &&
						          !flag.contains(e.getId()))
				     .forEach(e -> {
					     queue.offer(e);
					     flag.add(e.getId());
				     });

			}
		}

		return true;
	}

	private boolean collectVariables(Graph graph)
	{
		var nodeDefs = graph.findNodesOfType(GraphNode.Type.NodeDef);

		for (var def : nodeDefs)
		{
			ArrayDeque<GraphNode> deque = new ArrayDeque<>();
			HashSet<String> flag = new HashSet<>();
			List<GraphNode> vars = new ArrayList<>();
			deque.offer(def);
			flag.add(def.getId());
			while (!deque.isEmpty())
			{
				GraphNode cur = deque.poll();
				if (cur.getType() == GraphNode.Type.LocalVariable)
					vars.add(cur);
				graph.findOutEdges(
						     cur,
						     e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest &&
//						          !e.getMeta(GraphEdge.Meta.IsInitialValue, Boolean.class).orElse(false) &&
						          !flag.contains(e.to().getId()))
				     .stream().map(GraphEdge::to)
				     .forEach(n -> {
					     flag.add(n.getId());
					     deque.offer(n);
				     });
			}
			GraphNode varsNode = LustreUtil.generateVariableDecls(graph, vars);
			if (varsNode != null)
			{
				GraphEdge def2var = new GraphEdge(def, varsNode, GraphEdge.Type.Node2Vars);
				graph.addEdge(def2var);
			}
		}
		return true;
	}

	private AssembleHandler findHandler(GraphEdge edge)
	{
		var from = edge.from().getType().ordinal();
		var to = edge.to().getType().ordinal();
		if (map[from][to] == null)
		{
			BetterLogger.error("Assemble Handler", String.format("Missing mapping of %s --> %s",
			                                                     edge.from().getType(),
			                                                     edge.to().getType()));
		}
		return map[from][to];
	}

	@FunctionalInterface
	private interface AssembleHandler
	{
		boolean apply(Graph graph, GraphEdge edge);
	}

	@FunctionalInterface
	private interface AssembleCallback
	{
		void apply();
	}

	private final List<AssembleCallback> assembleCallbacks = new ArrayList<>();

	private void callAssembleCallbacks()
	{
		for (var callback : assembleCallbacks)
		{
			callback.apply();
		}
	}

	private boolean ParamVarHandler(Graph graph, GraphEdge edge)
	{
		String right = edge.from().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		String left = edge.to().getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();

		GraphNode node = LustreUtil.generateAssignment(graph, left, right);
		GraphEdge e1 = new GraphEdge(edge.from(), node, GraphEdge.Type.CodeSegmentLink);
		GraphEdge e2 = new GraphEdge(node, edge.to(), GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e1, e2);

		assembleCallbacks.add(() -> {
			edge.from().copyOuts(graph, edge.to());
			graph.removeNode(edge.to());
		});
		graph.removeEdgeSimple(edge);
		return true;
	}

	private boolean VarReturnHandler(Graph graph, GraphEdge edge)
	{
		String right = edge.from().getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String left = edge.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();

		GraphNode node = LustreUtil.generateAssignment(graph, left, right);
		GraphEdge e1 = new GraphEdge(edge.from(), node, GraphEdge.Type.CodeSegmentLink);
		GraphEdge e2 = new GraphEdge(node, edge.to(), GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e1, e2);
		graph.removeEdgeSimple(edge);
		return true;
	}

	private GraphNode findConstRegionNode(Graph graph, GraphNode cst)
	{
		List<GraphNode> parents = new ArrayList<>();
		Set<String> set = new HashSet<>();

//		graph.setStage("ConstRegion" + cst.getId());
//		GraphCallbacks.outDigraph.apply(graph, workDir);

		Queue<GraphEdge> queue = new ArrayDeque<>();
		cst.getOuts()
		   .stream()
		   .filter(e -> (e.getType() == GraphEdge.Type.DataFlowSource2Dest ||
		                 e.getType() == GraphEdge.Type.CodeSegmentLink) &&
		                !set.contains(e.to().getId()))
		   .forEach(e -> {
			   set.add(e.to().getId());
			   queue.offer(e);
		   });

		while (!queue.isEmpty())
		{
			var cur = queue.poll();
			cur.to()
			   .getOuts()
			   .stream()
			   .filter(e -> (e.getType() == GraphEdge.Type.DataFlowSource2Dest ||
			                 e.getType() == GraphEdge.Type.CodeSegmentLink) &&
			                !set.contains(e.to().getId()))
			   .forEach(flag -> {
				   set.add(flag.to().getId());
				   queue.offer(flag);
			   });
			parents.add(cur.to());
		}

		return parents.stream()
		              .filter(n -> n.getType() == GraphNode.Type.NodeDef)
		              .findFirst()
		              .orElse(null);
	}

	private boolean ConstReturnHandler(Graph graph, GraphEdge edge)
	{
		String right = edge.from().getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String left = edge.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();

		GraphNode node = LustreUtil.generateAssignment(graph, left, right);
		GraphEdge e1 = new GraphEdge(edge.from(), node, GraphEdge.Type.CodeSegmentLink);
		GraphEdge e2 = new GraphEdge(node, edge.to(), GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e1, e2);

		assembleCallbacks.add(() -> {
			node.copyIns(graph, edge.from());
			graph.removeNode(edge.from());
		});
		graph.removeEdgeSimple(edge);
		return true;
	}

	private boolean CallReturnHandler(Graph graph, GraphEdge edge)
	{
		var call = edge.from();
		String ret = edge.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		String pat = call.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		int idx = edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
		String code = new LustreUtil.CodeBuilder(pat).tag(LustreUtil.Tag.Returns, idx, ret).build();
		call.addMeta(GraphNode.MetaType.Code, code);

		GraphEdge e = new GraphEdge(edge.from(), edge.to(), GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e);
		graph.removeEdgeSimple(edge);
		return true;
	}

	private boolean CallCallHandler(Graph graph, GraphEdge edge)
	{
		var call1 = edge.from();
		var call2 = edge.to();
		var tempVar = LustreUtil.generateLocalVariable(call1.getId() + "_" + call2.getId());
		graph.addNode(tempVar);
		GraphEdge e1 = new GraphEdge(call1, tempVar, GraphEdge.Type.DataFlowSource2Dest);
		GraphEdge e2 = new GraphEdge(tempVar, call2, GraphEdge.Type.DataFlowSource2Dest);
		GraphEdge ec = new GraphEdge(call1, call2, GraphEdge.Type.CodeSegmentLink);
		int idxFrom = edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
		int idxTo = edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
		e1.addMeta(GraphEdge.Meta.FromIndex, idxFrom);
		e1.addMeta(GraphEdge.Meta.ToIndex, 0);
		e2.addMeta(GraphEdge.Meta.FromIndex, 1);
		e2.addMeta(GraphEdge.Meta.ToIndex, idxTo);
		graph.addEdge(e1, e2, ec);
		graph.removeEdgeSimple(edge);
		return false;
	}

	private boolean ParamCallHandler(Graph graph, GraphEdge edge)
	{
		var call = edge.to();
		String param = edge.from().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		String pat = call.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		int idx = edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
		String code = new LustreUtil.CodeBuilder(pat).tag(LustreUtil.Tag.CallParams, idx, param).build();
		call.addMeta(GraphNode.MetaType.Code, code);

		GraphEdge e1 = new GraphEdge(edge.from(), edge.to(), GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e1);

		assembleCallbacks.add(() -> {
			call.copyIns(graph, edge.from());
		});
		graph.removeEdgeSimple(edge);
//		call.copyIns(graph, edge.from());
//		graph.removeNode(edge.from());
		return true;
	}

	private boolean CallVarHandler(Graph graph, GraphEdge edge)
	{
		var call = edge.from();
		var v = edge.to();
		String var = edge.to().getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String pat = call.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		int idx = edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
		String code = new LustreUtil.CodeBuilder(pat).tag(LustreUtil.Tag.Returns, idx, var).build();
		call.addMeta(GraphNode.MetaType.Code, code);

		assembleCallbacks.add(() -> {
			call.copyOuts(graph, v);
			graph.removeNode(v);
		});
//		call.copyOuts(graph, edge.to());
//		graph.removeNode(edge.to());
		GraphEdge e = new GraphEdge(call, edge.to(), GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e);
		graph.removeEdgeSimple(edge);
		return true;
	}

	private boolean VarCallHandler(Graph graph, GraphEdge edge)
	{
		var call = edge.to();
		var v = edge.from();
		String var = edge.from().getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		int idx = edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
		String pat = call.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String code = new LustreUtil.CodeBuilder(pat).tag(LustreUtil.Tag.CallParams, idx, var).build();
		call.addMeta(GraphNode.MetaType.Code, code);

		assembleCallbacks.add(() -> {
			call.copyIns(graph, v);
			graph.removeNode(v);
		});
		graph.removeEdgeSimple(edge);
		GraphEdge e1 = new GraphEdge(edge.from(), call, GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e1);
//		call.copyIns(graph, edge.from());
//		graph.removeNode(edge.from());
		return true;
	}

	private boolean ConstCallHandler(Graph graph, GraphEdge edge)
	{
		var call = edge.to();
		String cst = edge.from().getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		int idx = edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
		String pat = call.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String code = new LustreUtil.CodeBuilder(pat)
				.tag(LustreUtil.Tag.CallParams, idx, cst)
				.build();
		call.addMeta(GraphNode.MetaType.Code, code);

		assembleCallbacks.add(() -> {
			call.copyIns(graph, edge.from());
			graph.removeNode(edge.from());
		});
		graph.removeEdgeSimple(edge);
		return true;
	}

	private boolean ParamCallParamHandler(Graph graph, GraphEdge edge)
	{
		var callParam = edge.to();
		var atag = callParam.getOuts().get(0).to();
		String param = edge.from().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
		String pat = atag.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String code = new LustreUtil.CodeBuilder(pat)
				.tag(LustreUtil.Tag.CallParams, 2, param + "," + LustreUtil.Tag.CallParams.toTag(2))
				.build();
		atag.addMeta(GraphNode.MetaType.Code, code);
		GraphEdge e1 = new GraphEdge(edge.from(), atag, GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e1);
		graph.removeEdgeSimple(edge);
		return true;
	}

	private boolean VarCallParamHandler(Graph graph, GraphEdge edge)
	{
		var callParam = edge.to();
		var atag = callParam.getOuts().get(0).to();
		String var = edge.from().getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String pat = atag.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
		String code = new LustreUtil.CodeBuilder(pat)
				.tag(LustreUtil.Tag.CallParams, 2, var + "," + LustreUtil.Tag.CallParams.toTag(2))
				.build();
		atag.addMeta(GraphNode.MetaType.Code, code);
		GraphEdge e1 = new GraphEdge(edge.from(), atag, GraphEdge.Type.CodeSegmentLink);
		graph.addEdge(e1);
		assembleCallbacks.add(() -> {
			atag.copyIns(graph, edge.from());
			graph.removeNode(edge.from());
		});
		graph.removeEdgeSimple(edge);
		return true;
	}

	private boolean CallParamCallHandler(Graph graph, GraphEdge edge)
	{
		var callParam = edge.from();
		var atag = edge.to();
		assembleCallbacks.add(() -> {
			String pat = atag.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow();
			String code = new LustreUtil.CodeBuilder(pat)
					.tag(LustreUtil.Tag.CallParams, 2, "")
					.build();
			code = code.replace(",)", ")");
			atag.addMeta(GraphNode.MetaType.Code, code);
		});
		graph.removeEdgeSimple(edge);
		return true;
	}

	private boolean emptyHandler(Graph graph, GraphEdge edge)
	{
		return true;
	}
}
