package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LustreUtil;

import java.util.*;

public class NodeAssemble extends AbstractProcessor<Graph>
{
	public NodeAssemble()
	{
		super("GT Processor", "Assemble Node");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!assembleNodeBody(item))
			return false;

		if (!assembleNode(item))
			return false;

		return true;
	}

	private boolean assembleNodeBody(Graph graph)
	{
		var nodeDefs = graph.findNodesOfType(GraphNode.Type.NodeDef);
		for (var def : nodeDefs)
		{
			List<String> codeLines = new ArrayList<>();
			Queue<GraphNode> queue = new ArrayDeque<>();
			Set<String> flag = new HashSet<>();
			flag.add(def.getId());
			graph.findOutEdges(
						 def,
						 e -> e.getType() == GraphEdge.Type.CodeSegmentLink &&
						      !flag.contains(e.to().getId()))
				 .stream()
				 .map(GraphEdge::to)
				 .forEach(n -> {
					 if (!flag.contains(n.getId()))
					 {
						 queue.offer(n);
						 flag.add(n.getId());
					 }
				 });
			while (!queue.isEmpty())
			{
				GraphNode cur = queue.poll();
				BetterLogger.debug("CodeCollect", cur.getId());
				codeLines.add(cur.getMeta(GraphNode.MetaType.Code, String.class).orElseThrow());
				graph.findOutEdges(
							 cur,
							 e -> e.getType() == GraphEdge.Type.CodeSegmentLink &&
								  !flag.contains(e.to().getId()))
					 .stream()
					 .map(GraphEdge::to)
					 .forEach(n -> {
						 if (!flag.contains(n.getId()))
						 {
							 queue.offer(n);
							 flag.add(n.getId());
						 }
					 });
				graph.removeNode(cur);
			}
//			String code = codeLines.stream().reduce((x, y) -> x + "\n" + y).orElseThrow();
			var code = codeLines.stream().reduce((x, y) -> x + "\n" + y);
			if (code.isEmpty())
			{
				return false;
			}
			GraphNode body = LustreUtil.generateNodeBody(graph, code.get());
			GraphEdge def2body = new GraphEdge(def, body, GraphEdge.Type.Node2Body);
			graph.addEdge(def2body);
		}
		return true;
	}

	private boolean assembleNode(Graph graph)
	{
		var nodeDefs = graph.findNodesOfType(GraphNode.Type.NodeDef);
		for (var def : nodeDefs)
		{
			var vars =
					graph.findOutEdges(def, e -> e.getType() == GraphEdge.Type.Node2Vars)
						 .stream()
						 .map(GraphEdge::to)
						 .findFirst().orElse(null);
			var body =
					graph.findOutEdges(def, e -> e.getType() == GraphEdge.Type.Node2Body)
						 .stream()
						 .map(GraphEdge::to)
						 .findFirst().orElseThrow();

			GraphNode node = LustreUtil.generateNodeStruct(graph, def, vars, body);
			graph.removeNode(def, vars, body);
		}
		return true;
	}
}
