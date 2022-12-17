package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;

import java.util.stream.Collectors;

public class DataflowDirectionSolving extends AbstractProcessor<Graph>
{
	public DataflowDirectionSolving()
	{
		super("GT Processor", "Dataflow Direction Solving");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		if (!solveApplyToAndGets(item))
			return false;

//		item.setStage("afterATAG");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveIfThenElses(item))
			return false;

//		item.setStage("afterITE");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveAssignment(item))
			return false;

//		item.setStage("afterAS");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solvePrevious(item))
			return false;

//		item.setStage("afterPre");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveCompositeElements(item))
			return false;

//		item.setStage("afterCE");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveParams(item))
			return false;

//		item.setStage("afterParam");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveConstant(item))
			return false;

//		item.setStage("afterCST");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveNodeCall(item))
			return false;

//		item.setStage("afterNC");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveReturnIns(item))
			return false;

//		item.setStage("afterRI");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveRestIdent(item))
			return false;

		item.setStage(pNameSimple);

		return true;
	}

	private boolean solveNodeCall(Graph graph)
	{
		var calls = graph.findNodesOfType(GraphNode.Type.NodeCall);
		for (var call : calls)
		{
			BetterLogger.debug("Solve NodeCall", call.getId());
			var from = graph.findInEdges(
									call,
									e -> e.getType() == GraphEdge.Type.Expression2SubExpression ||
										 e.getType() == GraphEdge.Type.CompositeElement2Expression ||
										 e.getType() == GraphEdge.Type.Interaction2Expression ||
										 e.getType() == GraphEdge.Type.DataFlowSource2Dest
							)
							.stream()
							.findFirst()
							.orElseThrow()
							.from();
			if (from.getType() == GraphNode.Type.ActiveSource ||
				from.getType() == GraphNode.Type.CoreInteraction ||
				from.getType() == GraphNode.Type.CompositionElement)
			{
				continue;
			}

			if (from.getType() == GraphNode.Type.NodeDef)
			{
				var retIns =
						graph.findOutEdges(from, e -> e.getType() == GraphEdge.Type.Node2Return)
							 .stream()
							 .map(GraphEdge::to)
							 .filter(n -> n.getMeta(GraphNode.MetaType.Name, String.class)
										   .orElseThrow()
										   .equals("theInterface"))
							 .findFirst()
							 .orElseThrow();
				GraphEdge e = new GraphEdge(call, retIns, GraphEdge.Type.DataFlowSource2Dest);
				e.addMeta(GraphEdge.Meta.FromIndex, 1);
				e.addMeta(GraphEdge.Meta.ToIndex, 0);
				graph.addEdge(e);
				continue;
			}
			if (graph.findOutEdges(
					call,
					e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest &&
						 e.to().getType() == GraphNode.Type.CoreInteraction &&
						 e.to().getMeta(GraphNode.MetaType.Name, String.class)
						  .orElseThrow().equals(LidlUtil.Const.ASSIGNMENT)
			).size() != 0)
			{
				continue;
			}
			GraphEdge call2from = new GraphEdge(call, from, GraphEdge.Type.DataFlowSource2Dest);
			call2from.addMeta(GraphEdge.Meta.FromIndex, 1);
			call2from.addMeta(GraphEdge.Meta.ToIndex, 0);
			graph.addEdge(call2from);
		}
		return true;
	}

	private boolean solveRestIdent(Graph graph)
	{
		var edges1 = graph.findEdges(
				edge -> edge.getType() == GraphEdge.Type.Interaction2Return &&
						edge.from().getType() == GraphNode.Type.NodeDef &&
						edge.to().getType() == GraphNode.Type.Identifier
		);

		for (var edge : edges1)
		{
			var ident = edge.to();
			var node = edge.from();
			GraphNode ret = findLinkedRet(graph, node);
			GraphEdge e2 = new GraphEdge(ident, ret, GraphEdge.Type.DataFlowSource2Dest);
//			e1.addMeta(GraphEdge.Meta.FromIndex);
			graph.addEdge(e2);
		}

		var edges2 = graph.findEdges(
				edge -> edge.getType() == GraphEdge.Type.Expression2SubExpression &&
						edge.from().getType() == GraphNode.Type.NodeCall &&
						edge.to().getType() == GraphNode.Type.Identifier
		);

		for (var edge : edges2)
		{
			var ident = edge.to();
			var node = edge.from();
			GraphEdge e = new GraphEdge(ident, node, GraphEdge.Type.DataFlowSource2Dest);
			var fromIdx = edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			var toIdx = edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			e.addMeta(GraphEdge.Meta.FromIndex, fromIdx);
			e.addMeta(GraphEdge.Meta.ToIndex, toIdx);
			graph.addEdge(e);
		}

		return true;
	}

	private GraphNode findLinkedRet(Graph graph, GraphNode nodeDef)
	{
		var rets = graph.findNodesInDirectChildren(
				nodeDef,
				node -> node.getType() == GraphNode.Type.ReturnInstance
		);
		var res = rets.stream()
					  .filter(n -> graph.findInEdges(n, e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest)
										.size() == 0)
					  .findFirst();

		if (res.isEmpty())
		{
			BetterLogger.error("GT Processor", "mismatching ident <--> param/ret");
			System.exit(-1);
		}
		return res.get();
	}

	private boolean solveParams(Graph graph)
	{
		var params = graph.findNodesOfType(GraphNode.Type.InteractionParam);

		for (var param : params)
		{
			BetterLogger.debug("Solve Param", param.getId());
			// ParamInstance
			var paramRet =
					graph.findOutEdges(
								 param,
								 e -> e.getType() == GraphEdge.Type.Param2ParamRet)
						 .stream()
						 .findFirst()
						 .orElseThrow()
						 .to();

			// Expression activated, theResult,
			// pActive -> param
			// theFlag -> param
			// theResult -> param
			var temp =
					graph.findInEdges(param, e -> e.getType() == GraphEdge.Type.TypeRef2Def)
						 .stream()
						 .findFirst()
						 .orElse(null);

			if (temp == null)
			{
				BetterLogger.warn("ParamMatching", "Unused Param " + param.getId());
				// NodeDef --> Param
				var fromEdge =
						graph.findInEdges(param, e -> e.getType() == GraphEdge.Type.Interaction2Param)
							 .stream()
							 .findFirst()
							 .orElseThrow();
				if (paramRet.getType() == GraphNode.Type.ReturnInstance)
				{
					GraphEdge edge2 = new GraphEdge(paramRet, fromEdge.from(), GraphEdge.Type.DataFlowSource2Dest);
					edge2.addMeta(GraphEdge.Meta.FromIndex, 0);
					edge2.addMeta(GraphEdge.Meta.ToIndex, 1);
					graph.addEdge(edge2);
				}

				if (paramRet.getType() == GraphNode.Type.ParamInstance)
				{
					//                              NodeDef          ParamInstance
					GraphEdge edge2 = new GraphEdge(fromEdge.from(), paramRet, GraphEdge.Type.DataFlowSource2Dest);
					edge2.addMeta(GraphEdge.Meta.FromIndex, 1);
					edge2.addMeta(GraphEdge.Meta.ToIndex, 0);
					graph.addEdge(edge2);
				}
				continue;
			}

			// ATAG --> Expression theNumber,
			var toEdge1 =
					graph.findOutEdges(temp.from(), e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest)
						 .stream()
						 .findFirst();

			// AS --> Expression theResult
			var toEdge2 =
					graph.findInEdges(temp.from(),
									  e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest ||
										   e.getType() == GraphEdge.Type.Expression2SubExpression
						 )
						 .stream()
						 .findFirst();

			var toEdge = toEdge1.orElse(toEdge2.orElse(null));

			if (toEdge == null)
			{
				BetterLogger.error("ParamMatching", String.format("missing edge %s", param.getId()));
				return false;
			}

			// NodeDef --> Param
			var fromEdge =
					graph.findInEdges(param, e -> e.getType() == GraphEdge.Type.Interaction2Param)
						 .stream()
						 .findFirst()
						 .orElseThrow();

			var idx = graph.findInEdges(param, e -> e.getType() == GraphEdge.Type.Interaction2Param)
						   .stream()
						   .findFirst()
						   .orElseThrow()
						   .getMeta(GraphEdge.Meta.FromIndex, Integer.class)
						   .orElseThrow();

			if (paramRet.getType() == GraphNode.Type.ReturnInstance)
			{
				GraphEdge edge1 = new GraphEdge(toEdge.from(), paramRet, GraphEdge.Type.DataFlowSource2Dest);
				edge1.copyMeta(toEdge);
				graph.addEdge(edge1);
				graph.removeEdgeSimple(toEdge);

				GraphEdge edge2 = new GraphEdge(paramRet, fromEdge.from(), GraphEdge.Type.DataFlowSource2Dest);
				edge2.addMeta(GraphEdge.Meta.FromIndex, 0);
				edge2.addMeta(GraphEdge.Meta.ToIndex, idx);
				graph.addEdge(edge2);
				continue;
			}

			if (paramRet.getType() == GraphNode.Type.ParamInstance)
			{
				if (toEdge.getType() == GraphEdge.Type.Expression2SubExpression)
				{
					//                              ParamInstance   IfThenElse
					GraphEdge edge1 = new GraphEdge(paramRet, toEdge.from(), GraphEdge.Type.DataFlowSource2Dest);
					int idxFrom = toEdge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
					int idxTo = toEdge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
					edge1.addMeta(GraphEdge.Meta.FromIndex, idxFrom);
					edge1.addMeta(GraphEdge.Meta.ToIndex, idxTo);
					graph.addEdge(edge1);
					graph.removeEdgeSimple(toEdge);
				}
				else
				{
					//                              ParamInstance   ATAG
					GraphEdge edge1 = new GraphEdge(paramRet, toEdge.to(), GraphEdge.Type.DataFlowSource2Dest);
					edge1.copyMeta(toEdge);
					graph.addEdge(edge1);
					graph.removeEdgeSimple(toEdge);
				}
				//                              NodeDef          ParamInstance
				GraphEdge edge2 = new GraphEdge(fromEdge.from(), paramRet, GraphEdge.Type.DataFlowSource2Dest);
				edge2.addMeta(GraphEdge.Meta.FromIndex, 1);
				edge2.addMeta(GraphEdge.Meta.ToIndex, 0);
				graph.addEdge(edge2);

				continue;
			}
		}
		return true;
	}

	private boolean solveReturnIns(Graph graph)
	{
		var retEdges = graph.findEdgesOfType(GraphEdge.Type.Node2Return);

		for (var retEdge : retEdges)
		{
			if (graph.findOutEdges(retEdge.to(), e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest).size() != 0)
			{
				continue;
			}
			GraphEdge e = new GraphEdge(retEdge.to(), retEdge.from(), GraphEdge.Type.DataFlowSource2Dest);
			e.addMeta(GraphEdge.Meta.FromIndex, 1);
			e.addMeta(GraphEdge.Meta.ToIndex, 0);
			graph.addEdge(e);
		}
		return true;
	}

	private boolean solveConstant(Graph graph)
	{
		var consts = graph.findNodesOfType(
				GraphNode.Type.Expression,
				n -> n.getMeta(GraphNode.MetaType.Type, String.class)
					  .orElseThrow()
					  .equals(GraphNode.MetaValue.Literal) &&
					 graph.findOutEdges(n, e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest)
						  .size() == 0
		);

		for (var cst : consts)
		{
			var parentEdge = graph.findInEdges(
					cst,
					e -> e.getType() == GraphEdge.Type.Expression2SubExpression ||
						 e.getType() == GraphEdge.Type.Interaction2Expression ||
						 e.getType() == GraphEdge.Type.CompositeElement2Expression
			).get(0);

			var parent = parentEdge.from();

			if (parent.getType() == GraphNode.Type.NodeDef)
			{
				var retIns =
						graph.findOutEdges(parent, e -> e.getType() == GraphEdge.Type.Node2Return)
							 .stream()
							 .map(GraphEdge::to)
							 .filter(n -> n.getMeta(GraphNode.MetaType.Name, String.class)
										   .orElseThrow()
										   .equals("theInterface"))
							 .findFirst()
							 .orElseThrow();
				GraphEdge e = new GraphEdge(cst, retIns, GraphEdge.Type.DataFlowSource2Dest);
				e.addMeta(GraphEdge.Meta.FromIndex, 1);
				e.addMeta(GraphEdge.Meta.ToIndex, 0);
				graph.addEdge(e);
				continue;
			}

			if (parent.getType() == GraphNode.Type.NodeCall ||
				parent.getType() == GraphNode.Type.CoreInteraction)
			{
				GraphEdge e = new GraphEdge(cst, parent, GraphEdge.Type.DataFlowSource2Dest);
				int fromIdx = 0;
				int toIdx = parentEdge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
				e.addMeta(GraphEdge.Meta.FromIndex, fromIdx);
				e.addMeta(GraphEdge.Meta.ToIndex, toIdx);
				graph.addEdge(e);
				continue;
			}

			GraphEdge e = new GraphEdge(cst, parent, GraphEdge.Type.DataFlowSource2Dest);
			e.addMeta(GraphEdge.Meta.FromIndex, 1);
			e.addMeta(GraphEdge.Meta.ToIndex, 0);
			graph.addEdge(e);
		}
		return true;
	}

	private boolean solveCompositeElements(Graph graph)
	{
		var cpes = graph.findNodesOfType(GraphNode.Type.CompositionElement);

		for (var cpe : cpes)
		{
			var paramRets =
					graph.findOutEdges(
								 cpe,
								 e -> e.getType() == GraphEdge.Type.CompositeElement2ParamRet)
						 .stream()
						 .map(GraphEdge::to)
						 .collect(Collectors.toList());
			var toEdge =
					graph.findOutEdges(
								 cpe,
								 e -> e.getType() == GraphEdge.Type.CompositeElement2Expression)
						 .stream()
						 .findFirst()
						 .orElseThrow();
			var fromEdge =
					graph.findInEdges(
								 cpe,
								 e -> e.getType() == GraphEdge.Type.Node2Sentence)
						 .stream()
						 .findFirst()
						 .orElseThrow();

			for (var paramRet : paramRets)
			{
				if (paramRet.getType() == GraphNode.Type.ReturnInstance)
				{
					GraphEdge edge1 = new GraphEdge(toEdge.to(), paramRet, GraphEdge.Type.DataFlowSource2Dest);
					edge1.addMeta(GraphEdge.Meta.FromIndex, 0);
					edge1.addMeta(GraphEdge.Meta.ToIndex, 1);
					graph.addEdge(edge1);
					GraphEdge edge2 = new GraphEdge(paramRet, fromEdge.from(), GraphEdge.Type.DataFlowSource2Dest);
					edge2.addMeta(GraphEdge.Meta.FromIndex, 0);
					edge2.addMeta(GraphEdge.Meta.ToIndex, 1);
					graph.addEdge(edge2);
					continue;
				}
				if (paramRet.getType() == GraphNode.Type.ParamInstance)
				{
					GraphEdge edge1 = new GraphEdge(paramRet, toEdge.to(), GraphEdge.Type.DataFlowSource2Dest);
					edge1.addMeta(GraphEdge.Meta.FromIndex, 1);
					edge1.addMeta(GraphEdge.Meta.ToIndex, 0);
					graph.addEdge(edge1);
					GraphEdge edge2 = new GraphEdge(fromEdge.from(), paramRet, GraphEdge.Type.DataFlowSource2Dest);
					edge2.addMeta(GraphEdge.Meta.FromIndex, 1);
					edge2.addMeta(GraphEdge.Meta.ToIndex, 0);
					graph.addEdge(edge2);
					continue;
				}
				return false;
			}
		}

		return true;
	}

	private boolean solveApplyToAndGets(Graph graph)
	{
		var atags = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.APPLY_TO_AND_GET));

		for (var atag : atags)
		{
//			var idx0 = graph.findInEdges(atag).get(0);
			var idx2 = graph.findOutEdges(
					atag, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
								.orElseThrow() == 2).get(0);
			var idx3 = graph.findOutEdges(
					atag, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
								.orElseThrow() == 3).get(0);

			var internalCallParamEdges = graph.findOutEdges(idx2.to());
			for (var paramEdge : internalCallParamEdges)
			{
				GraphEdge param2icp = new GraphEdge(paramEdge.to(), idx2.to(), GraphEdge.Type.DataFlowSource2Dest);
				int fromIdx = paramEdge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
				int toIdx = paramEdge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
				param2icp.addMeta(GraphEdge.Meta.FromIndex, fromIdx);
				param2icp.addMeta(GraphEdge.Meta.ToIndex, toIdx);
				graph.addEdge(param2icp);
			}

			int toIdx2 = idx2.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			int fromIdx2 = idx2.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			addIfNotExist(graph, fromIdx2, toIdx2, idx2.to(), idx2.from());
//			GraphEdge flow2 = new GraphEdge(idx2.to(), idx2.from(), GraphEdge.Type.DataFlowSource2Dest);
//			flow2.addMeta(GraphEdge.Meta.FromIndex, fromIdx2);
//			flow2.addMeta(GraphEdge.Meta.ToIndex, toIdx2);
//			graph.addEdge(flow2);

			int fromIdx3 = idx3.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			int toIdx3 = idx3.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			addIfNotExist(graph, fromIdx3, toIdx3, idx3.from(), idx3.to());

//			GraphEdge flow3 = new GraphEdge(idx3.from(), idx3.to(), GraphEdge.Type.DataFlowSource2Dest);
//			flow3.addMeta(GraphEdge.Meta.FromIndex, fromIdx3);
//			flow3.addMeta(GraphEdge.Meta.ToIndex, toIdx3);
//			graph.addEdge(flow3);
		}
		return true;
	}

	private boolean solveIfThenElses(Graph graph)
	{
		var ites = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.IF_THEN_ELSE));

		for (var ite : ites)
		{
			var idx0 = graph.findInEdges(
					ite, e -> e.getType() == GraphEdge.Type.Interaction2Expression ||
							  e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
							   .orElseThrow() == 0).get(0);
			var idx1 = graph.findOutEdges(
					ite, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
							   .orElseThrow() == 1).get(0);
			var idx2 = graph.findOutEdges(
					ite, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
							   .orElseThrow() == 2).get(0);
			var idx3 = graph.findOutEdges(
					ite, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
							   .orElseThrow() == 3).get(0);

			if (idx0.from().getType() == GraphNode.Type.NodeDef)
			{
				var retIns =
						graph.findOutEdges(idx0.from(), e -> e.getType() == GraphEdge.Type.Node2Return)
							 .stream()
							 .map(GraphEdge::to)
							 .filter(n -> n.getMeta(GraphNode.MetaType.Name, String.class)
										   .orElseThrow()
										   .equals("theInterface"))
							 .findFirst()
							 .orElseThrow();
				addIfNotExist(graph, 0, 1, ite, retIns);
//				if (graph.findEdgesOfType(GraphEdge.Type.DataFlowSource2Dest).stream().noneMatch(
//						e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(-1) == 0 &&
//							 e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(-1) == 1 &&
//							 e.from().getId().equals(ite.getId()) &&
//							 e.to().getId().equals(retIns.getId())
//				))
//				{
//					GraphEdge e = new GraphEdge(ite, retIns, GraphEdge.Type.DataFlowSource2Dest);
//					e.addMeta(GraphEdge.Meta.FromIndex, 0);
//					e.addMeta(GraphEdge.Meta.ToIndex, 1);
//					graph.addEdge(e);
//					continue;
//				}
			}
			else
			{
				int toIdx0 = idx0.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(1);
				int fromIdx0 = idx0.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(0);
				addIfNotExist(graph, fromIdx0, toIdx0, idx0.to(), idx0.from());
//				if (graph.findEdgesOfType(GraphEdge.Type.DataFlowSource2Dest).stream().noneMatch(
//						e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(-1) == fromIdx0 &&
//							 e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(-1) == toIdx0 &&
//							 e.from().getId().equals(idx0.to().getId()) &&
//							 e.to().getId().equals(idx0.from().getId())
//				))
//				{
//					GraphEdge flow0 = new GraphEdge(idx0.to(), idx0.from(), GraphEdge.Type.DataFlowSource2Dest);
//					flow0.addMeta(GraphEdge.Meta.FromIndex, fromIdx0);
//					flow0.addMeta(GraphEdge.Meta.ToIndex, toIdx0);
//					graph.addEdge(flow0);
//				}
			}

			int toIdx1 = idx1.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			int fromIdx1 = idx1.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			addIfNotExist(graph, fromIdx1, toIdx1, idx1.to(), idx1.from());
//			if (graph.findEdgesOfType(GraphEdge.Type.DataFlowSource2Dest).stream().noneMatch(
//					e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(-1) == fromIdx1 &&
//						 e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(-1) == toIdx1 &&
//						 e.from().getId().equals(idx1.to().getId()) &&
//						 e.to().getId().equals(idx1.from().getId())
//			))
//			{
//				GraphEdge flow1 = new GraphEdge(idx1.to(), idx1.from(), GraphEdge.Type.DataFlowSource2Dest);
//				flow1.addMeta(GraphEdge.Meta.FromIndex, fromIdx1);
//				flow1.addMeta(GraphEdge.Meta.ToIndex, toIdx1);
//				graph.addEdge(flow1);
//			}

			int toIdx2 = idx2.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			int fromIdx2 = idx2.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			addIfNotExist(graph, fromIdx2, toIdx2, idx2.to(), idx2.from());

//			if (graph.findEdgesOfType(GraphEdge.Type.DataFlowSource2Dest).stream().noneMatch(
//					e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(-1) == fromIdx2 &&
//						 e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(-1) == toIdx2 &&
//						 e.from().getId().equals(idx2.to().getId()) &&
//						 e.to().getId().equals(idx2.from().getId())
//			))
//			{
//				GraphEdge flow2 = new GraphEdge(idx2.to(), idx2.from(), GraphEdge.Type.DataFlowSource2Dest);
//				flow2.addMeta(GraphEdge.Meta.FromIndex, fromIdx2);
//				flow2.addMeta(GraphEdge.Meta.ToIndex, toIdx2);
//				graph.addEdge(flow2);
//			}

			int toIdx3 = idx3.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			int fromIdx3 = idx3.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			addIfNotExist(graph, fromIdx3, toIdx3, idx3.to(), idx3.from());
//			if (graph.findEdgesOfType(GraphEdge.Type.DataFlowSource2Dest).stream().noneMatch(
//					e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(-1) == fromIdx3 &&
//						 e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(-1) == toIdx3 &&
//						 e.from().getId().equals(idx3.to().getId()) &&
//						 e.to().getId().equals(idx3.from().getId())
//			))
//			{
//				GraphEdge flow3 = new GraphEdge(idx3.to(), idx3.from(), GraphEdge.Type.DataFlowSource2Dest);
//				flow3.addMeta(GraphEdge.Meta.FromIndex, fromIdx3);
//				flow3.addMeta(GraphEdge.Meta.ToIndex, toIdx3);
//				graph.addEdge(flow3);
//			}
		}
		return true;
	}

	private boolean solveAssignment(Graph graph)
	{
		var assigns = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.ASSIGNMENT));

		for (var assign : assigns)
		{
			var idx1 = graph.findOutEdges(
					assign, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
								  .orElseThrow() == 1).get(0);
			var idx2 = graph.findOutEdges(
					assign, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
								  .orElseThrow() == 2).get(0);

			if (idx1.to().getType() == GraphNode.Type.Expression &&
				!idx1.to()
					 .getMeta(GraphNode.MetaType.Type, String.class)
					 .orElseThrow()
					 .equals(GraphNode.MetaValue.Literal))
			{
			}
			else
			{
				int fromIdx1 = idx1.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
				int toIdx1 = idx1.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
				addIfNotExist(graph, fromIdx1, toIdx1, idx1.from(), idx1.to());
//				if (graph.findEdgesOfType(GraphEdge.Type.DataFlowSource2Dest).stream().noneMatch(
//						e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(-1) == fromIdx1 &&
//							 e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(-1) == toIdx1 &&
//							 e.from().getId().equals(idx1.from().getId()) &&
//							 e.to().getId().equals(idx1.to().getId())
//				))
//				{
//					GraphEdge flow1 = new GraphEdge(idx1.from(), idx1.to(), GraphEdge.Type.DataFlowSource2Dest);
//					flow1.addMeta(GraphEdge.Meta.FromIndex, fromIdx1);
//					flow1.addMeta(GraphEdge.Meta.ToIndex, toIdx1);
//					graph.addEdge(flow1);
//				}
			}
			int toIdx2 = idx2.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			int fromIdx2 = idx2.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			addIfNotExist(graph, fromIdx2, toIdx2, idx2.to(), idx2.from());

//			if (graph.findEdgesOfType(GraphEdge.Type.DataFlowSource2Dest).stream().noneMatch(
//					e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(-1) == fromIdx2 &&
//						 e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(-1) == toIdx2 &&
//						 e.from().getId().equals(idx2.to().getId()) &&
//						 e.to().getId().equals(idx2.from().getId())
//			))
//			{
//				GraphEdge flow2 = new GraphEdge(idx2.to(), idx2.from(), GraphEdge.Type.DataFlowSource2Dest);
//				flow2.addMeta(GraphEdge.Meta.FromIndex, fromIdx2);
//				flow2.addMeta(GraphEdge.Meta.ToIndex, toIdx2);
//				graph.addEdge(flow2);
//			}
		}
		return true;
	}

	private boolean solvePrevious(Graph graph)
	{
		var pres = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				n -> n.getMeta(GraphNode.MetaType.Name, String.class)
					  .orElseThrow()
					  .equals(LidlUtil.Const.PREVIOUS));

		for (var pre : pres)
		{
			var idx0 = graph.findInEdges(
					pre, e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
							   .orElseThrow() == 0).get(0);
			var idx1 = graph.findOutEdges(
					pre, e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
							   .orElseThrow() == 1).get(0);

			int toIdx1 = idx1.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			int fromIdx1 = idx1.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			addIfNotExist(graph, fromIdx1, toIdx1, idx1.to(), idx1.from());

			int toIdx0 = idx0.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
			int fromIdx0 = idx0.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
			addIfNotExist(graph, fromIdx0, toIdx0, idx0.to(), idx0.from());
		}
		return true;
	}

	private void addIfNotExist(Graph graph, int fromIdx, int toIdx, GraphNode fromNode, GraphNode toNode)
	{
		if (graph.findEdgesOfType(GraphEdge.Type.DataFlowSource2Dest).stream().noneMatch(
				e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElse(-1) == fromIdx &&
					 e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElse(-1) == toIdx &&
					 e.from().getId().equals(fromNode.getId()) &&
					 e.to().getId().equals(toNode.getId())
		))
		{
			GraphEdge flow1 = new GraphEdge(fromNode, toNode, GraphEdge.Type.DataFlowSource2Dest);
			flow1.addMeta(GraphEdge.Meta.FromIndex, fromIdx);
			flow1.addMeta(GraphEdge.Meta.ToIndex, toIdx);
			graph.addEdge(flow1);
		}
	}
}
