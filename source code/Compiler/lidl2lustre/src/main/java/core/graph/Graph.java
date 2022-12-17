package core.graph;

import core.common.IdGenerator;
import core.common.log.BetterLogger;
import core.graph.util.LustreLibCodeUtil;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class Graph //implements Cloneable
{
	protected List<GraphNode> nodes;
	protected List<GraphEdge> edges;
	protected Map<GraphNode.Type, List<GraphNode>> nodeMap;
	protected Map<GraphEdge.Type, List<GraphEdge>> edgeMap;

	protected List<String> infos;
	protected GraphNode rootNode;

	protected String currentStage = null;
	protected int step = 0;

	protected String entryName;

	protected String outFileName;

	public void setTargetStep(int targetStep)
	{
		this.targetStep = targetStep;
	}

	protected int targetStep = Integer.MAX_VALUE;

	protected HashSet<LustreLibCodeUtil.CodeType> appendices = new HashSet<>();

	public List<LustreLibCodeUtil.CodeType> getAppendices()
	{
		return new ArrayList<>(appendices);
	}

	public void addAppendix(LustreLibCodeUtil.CodeType type)
	{
		appendices.add(type);
	}

	//	@Override
//	protected Graph clone() throws CloneNotSupportedException
//	{
//		Graph ng = (Graph) super.clone();
//		ng.nodes = new ArrayList<>(nodes);
//		ng.edges = new ArrayList<>(edges);
//		ng.nodeMap = new HashMap<>(nodeMap);
//		ng.edgeMap = new HashMap<>(edgeMap);
//		ng.infos = new ArrayList<>(infos);
//		ng.rootNode = (Graph) rootNode.clone();
//	}
	public Graph(Collection<? extends GraphNode> nodes, Collection<? extends GraphEdge> edges)
	{
		this.nodes = new ArrayList<>();
		this.nodes.addAll(nodes);
		this.edges = new ArrayList<>();
		this.edges.addAll(edges);
		nodeMap = nodes.stream().reduce(
				new HashMap<>(),
				(map, node) ->
				{
					map.putIfAbsent(node.type, new ArrayList<>());
					map.get(node.type).add(node);
					return map;
				},
				(map1, map2) ->
				{
					map1.putAll(map2);
					return map1;
				}
		);
		edgeMap = edges.stream().reduce(
				new HashMap<>(),
				(map, edge) ->
				{
					map.putIfAbsent(edge.type, new ArrayList<>());
					map.get(edge.type).add(edge);
					return map;
				},
				(map1, map2) ->
				{
					map1.putAll(map2);
					return map1;
				}
		);
		init();
	}

	public Graph()
	{
		nodes = new ArrayList<>();
		edges = new ArrayList<>();
		nodeMap = new HashMap<>();
		edgeMap = new HashMap<>();
		init();
	}

	private void init()
	{
		addAppendix(LustreLibCodeUtil.CodeType.Lib);
	}

	public String getOutFileName()
	{
		return outFileName;
	}

	public void setOutFileName(String outFileName)
	{
		this.outFileName = outFileName;
	}

	public void setEntryName(String entryName)
	{
		this.entryName = entryName.replaceAll("\\(\\)", Matcher.quoteReplacement("$"))
								  .replaceAll("[\\s]*\\$[\\s]*", Matcher.quoteReplacement("$"))
								  .replaceAll("[\\s]+", "_");
	}

	public String getEntryName() {return entryName;}

	public void addNode(GraphNode... nodes)
	{
		for (var node : nodes)
		{
			addNode(node);
		}
	}

	public GraphNode addNode(GraphNode node)
	{
		node.id = IdGenerator.uniqueId("node_");
		nodes.add(node);
		nodeMap.putIfAbsent(node.type, new ArrayList<>());
		nodeMap.get(node.type).add(node);
		return node;
	}

	public void addEdge(GraphEdge... edges)
	{
		for (var edge : edges)
		{
			addEdge(edge);
		}
	}

	public void addEdge(GraphEdge edge)
	{
		edge.id = IdGenerator.uniqueId("edge_");
		edges.add(edge);
		edgeMap.putIfAbsent(edge.type, new ArrayList<>());
		edgeMap.get(edge.type).add(edge);

		edge.fromNode.addEdge(GraphNode.EdgeDir.Out, edge);
		edge.toNode.addEdge(GraphNode.EdgeDir.In, edge);
	}

	public void removeNode(GraphNode node)
	{
		if (node == null)
			return;
		nodes.remove(node);
		nodeMap.get(node.type).remove(node);
		for (var edge : node.getIns())
		{
			edge.fromNode.outs.remove(edge);
			edge.fromNode.outMap.get(edge.getType()).remove(edge);
			removeEdge(edge);
		}
		for (var edge : node.getOuts())
		{
			edge.toNode.ins.remove(edge);
			edge.toNode.inMap.get(edge.getType()).remove(edge);
			removeEdge(edge);
		}
		node.clear();
	}

	public void removeNode(GraphNode... nodeCollections)
	{
		Arrays.stream(nodeCollections).forEach(this::removeNode);
	}

	public void removeNode(Collection<GraphNode> nodeCollection)
	{
		nodeCollection.forEach(this::removeNode);
	}

	private void removeEdge(GraphEdge edge)
	{
		edges.remove(edge);
		edgeMap.get(edge.type).remove(edge);
	}

	public void removeEdgeSimple(GraphEdge edge)
	{
		edge.toNode.ins.remove(edge);
		edge.toNode.inMap.get(edge.type).remove(edge);
		edge.fromNode.outs.remove(edge);
		edge.fromNode.outMap.get(edge.type).remove(edge);
		edges.remove(edge);
		edgeMap.get(edge.type).remove(edge);
	}

	private void removeEdge(Collection<GraphEdge> edgeCollection)
	{
		edgeCollection.forEach(this::removeEdge);
	}

	/**
	 * Delete node and all its children (if the child node has no alive parent node)
	 *
	 * @param froms roots to be deleted
	 */
	public void removeNodeRecursively(Collection<GraphNode> froms)
	{
		List<GraphNode> children = new ArrayList<>();
		froms.forEach(fromNode -> children.addAll(findNodesInDirectChildren(fromNode, node -> true)));
		removeNode(froms);
		List<GraphNode> toBeDeleted = children.stream()
											  .filter(node -> node.ins.size() == 0)
											  .collect(Collectors.toList());
		if (toBeDeleted.size() != 0)
			removeNodeRecursively(toBeDeleted);
	}

	/**
	 * Delete node and all its children (if the child node has no alive parent node)
	 *
	 * @param from root to be deleted
	 */
	public void removeNodeRecursively(GraphNode from)
	{
		List<GraphNode> froms = Collections.singletonList(from);
		removeNodeRecursively(froms);
	}

	public List<GraphNode> getNodes()
	{
		return nodes;
	}

	public List<GraphEdge> getEdges()
	{
		return edges;
	}

	public void setStage(String stage)
	{
		currentStage = stage;
		step++;
	}

	public String getStage()
	{
		return currentStage;
	}

	public int getStep()
	{
		return step;
	}

	public void setRoot(GraphNode node)
	{
		if (!nodes.contains(node))
		{
			BetterLogger.warn("Analyser", "Target node not in the Graph");
		}
		rootNode = node;
	}

	public List<GraphEdge> findEdges(Predicate<GraphEdge> filter)
	{
		return edges.stream().filter(filter).collect(Collectors.toList());
	}

	public List<GraphEdge> findInEdges(GraphNode from)
	{
		return findInEdges(from, e -> true);
	}

	public List<GraphEdge> findInEdges(GraphNode from, Predicate<GraphEdge> filter)
	{
		return from.getIns().stream().filter(filter).collect(Collectors.toList());
	}

	public List<GraphEdge> findOutEdges(GraphNode from)
	{
		return findOutEdges(from, e -> true);
	}

	public List<GraphEdge> findOutEdges(GraphNode from, Predicate<GraphEdge> filter)
	{
		return from.getOuts().stream().filter(filter).collect(Collectors.toList());
	}

	public List<GraphNode> findNodes(Predicate<GraphNode> filter)
	{
		return nodes.stream().filter(filter).collect(Collectors.toList());
	}

	public List<GraphNode> findNodesOfType(GraphNode.Type type, Predicate<GraphNode> filter)
	{
		var list = nodeMap.get(type);
		if (list == null)
			return new ArrayList<>();
		return list.stream().filter(filter).collect(Collectors.toList());
	}

	public List<GraphNode> findNodesOfType(GraphNode.Type type)
	{
		return findNodesOfType(type, n -> true);
	}

	public List<GraphEdge> findEdgesOfType(GraphEdge.Type type, Predicate<GraphEdge> filter)
	{
		var list = edgeMap.get(type);
		if (list == null)
			return new ArrayList<>();
		return list.stream().filter(filter).collect(Collectors.toList());
	}

	public List<GraphEdge> findEdgesOfType(GraphEdge.Type type)
	{
		return findEdgesOfType(type, n -> true);
	}

	public List<GraphNode> findNodesInDirectChildren(GraphNode from)
	{
		return from.outs.stream().map(edge -> edge.toNode).collect(Collectors.toList());
	}

	public List<GraphNode> findNodesInDirectChildren(GraphNode from, Predicate<GraphNode> filter)
	{
		return from.outs.stream().map(edge -> edge.toNode).filter(filter).collect(Collectors.toList());
	}

	public List<GraphNode> findNodesInDirectParents(GraphNode from)
	{
		return from.ins.stream().map(edge -> edge.fromNode).collect(Collectors.toList());
	}

	public List<GraphNode> findNodesInDirectParents(GraphNode from, Predicate<GraphNode> filter)
	{
		return from.ins.stream().map(edge -> edge.fromNode).filter(filter).collect(Collectors.toList());
	}

	/**
	 * ONLY SCAN FOR INDEX 0 of Node's incoming edges (which represent dataflow upstream destination)
	 *
	 * @param from   startNode
	 * @param filter filter function applied on found list of parents
	 * @return first found parent meets filter
	 */
	public GraphNode findNodeInOriginalParents(GraphNode from, Predicate<GraphNode> filter)
	{
		return findNodesInOriginalParents(from, filter).get(0);
	}

	/**
	 * ONLY SCAN FOR INDEX 0 of Node's incoming edges (which represent dataflow upstream destination)
	 *
	 * @param from   startNode
	 * @param filter filter function applied on found list of parents
	 * @return all found parents that meet the filter
	 */
	public List<GraphNode> findNodesInOriginalParents(GraphNode from, Predicate<GraphNode> filter)
	{
		List<GraphNode> parents = new ArrayList<>();
		GraphNode temp = from;
		while (temp.ins.size() != 0)
		{
			temp = temp.parent();
			parents.add(temp);
		}
		return parents.stream().filter(filter).collect(Collectors.toList());
	}

	public List<GraphNode> findNodesInChildren(GraphNode from)
	{
		return findNodesInChildren(from, n -> true);
	}

	public List<GraphNode> findNodesInChildren(GraphNode from, Predicate<GraphNode> filter)
	{
		List<GraphNode> parents = new ArrayList<>();
		LinkedList<GraphNode> queue = new LinkedList<>();
		Set<String> set = new HashSet<>();
		queue.push(from);
		while (!queue.isEmpty())
		{
			var cur = queue.pop();
			var list = cur.getOuts().stream().map(edge -> edge.toNode);
			list.forEach(n -> {
				if (!set.contains(n.getId()))
				{
					set.add(n.getId());
					queue.push(n);
					parents.add(n);
				}
			});
		}
		return parents.stream().filter(filter).collect(Collectors.toList());
	}

	public void cleanNodes()
	{
		var list =
				nodes.stream()
					 .filter(n -> n.ins.size() + n.outs.size() == 0)
					 .collect(Collectors.toList());
		removeNode(list);
	}
//	public GraphNode findNode(Predicate<GraphNode> filter)
//	{
//		List<GraphNode> nodes = findNodes(filter);
//		if(nodes.size()>1)

//	}

	public GraphNode getRootNode()
	{
		return rootNode;
	}


	@Override
	public String toString()
	{
		return "Graph{" +
			   "nodes=" + nodes +
			   ", edges=" + edges +
			   ", nodeMap=" + nodeMap +
			   ", edgeMap=" + edgeMap +
			   ", infos=" + infos +
			   ", rootNode=" + rootNode +
			   '}';
	}
}
