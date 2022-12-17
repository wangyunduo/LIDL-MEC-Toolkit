package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;
import core.graph.util.LidlUtil;
import core.graph.util.LustreUtil;

import java.util.List;
import java.util.stream.Collectors;

public class DataflowTypeSolving extends AbstractProcessor<Graph>
{
	public DataflowTypeSolving()
	{
		super("GT Processor", "Dataflow Type Solving");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{

		if (!solveReturnInstance(item))
			return false;

//		item.setStage("solve RI");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveParamInstance(item))
			return false;

//		item.setStage("solve PI");
//		GraphCallbacks.outDigraph.apply(item, workDir);

//		if (!solveNodeCall(item))
//			return false;
//
//		item.setStage("solve NC");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		if (!solveConstant(item))
			return false;

//		item.setStage("solve CST");
//		GraphCallbacks.outDigraph.apply(item, workDir);

		boolean flag = true;
		while (flag)
		{
			flag = false;
			flag |= solveEdges(item);
//			BetterLogger.debug(String.format("edge:%s", flag));
			flag |= solveVariables(item);
//			BetterLogger.debug(String.format("var:%s", flag));
			flag |= solveInternalCallParam(item);
//			BetterLogger.debug(String.format("icall:%s", flag));
			flag |= solveAssignment(item);
//			BetterLogger.debug(String.format("assign:%s", flag));
			flag |= solveIfThenElse(item);
//			BetterLogger.debug(String.format("ite:%s", flag));
			flag |= solvePrevious(item);
		}

		item.setStage(pNameSimple);

		return true;
	}



	private boolean solveConstant(Graph graph)
	{
		var consts = graph.findNodesOfType(GraphNode.Type.Const);

		for (var cst : consts)
		{
			solveConst(cst);
		}

		return true;
	}

	private boolean solveConst(GraphNode node)
	{
		if (node.getMeta(GraphNode.MetaType.Value, String.class).orElseThrow().equals("inactive"))
			return true;
		String type = node.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();
		GraphEdge to = node.getOuts().stream().findFirst().orElseThrow();
		to.addMeta(GraphEdge.Meta.FromInf, String.format("{theInterface:%s-out}", type));
		node.addMeta(GraphNode.MetaType.DataFlowSolved, true);
		return true;
	}

	private boolean solveReturnInstance(Graph graph)
	{
		var rets = graph.findNodesOfType(GraphNode.Type.ReturnInstance);

		for (var ret : rets)
		{
			solveParamOrReturn(ret);
		}
		return true;
	}

	private boolean solveParamInstance(Graph graph)
	{
		var params = graph.findNodesOfType(GraphNode.Type.ParamInstance);

		for (var param : params)
		{
			solveParamOrReturn(param);
		}
		return true;
	}

//	private boolean solveNodeCall(Graph graph)
//	{
//		var calls = graph.findNodesOfType(GraphNode.Type.NodeCall);
//
//		for (var call : calls)
//		{
//			BetterLogger.debug("solveNodeCall", call.getId());
//			var def = graph.findOutEdges(
//					call, e -> e.getType() == GraphEdge.Type.NodeCall2Def
//			).stream().map(GraphEdge::to).findFirst().orElseThrow();
//
//			var edges = graph.findEdges(
//					e -> e.getType() == GraphEdge.Type.DataFlowSource2Dest &&
//						 (e.from().getId().equals(call.getId()) ||
//						  e.to().getId().equals(call.getId()))
//			);
//
//			for (var edge : edges)
//			{
//				int idx;
//				if (edge.from().getId().equals(call.getId()))
//				{
//					// ret
//					idx = edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
//					BetterLogger.debug("solveNodeCall", String.valueOf(idx));
//					var infEdge = graph.findEdges(
//							e -> (e.from().getId().equals(def.getId()) &&
//								  e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
//								   .orElse(-1) == idx) ||
//								 (e.to().getId().equals(def.getId()) &&
//								  e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
//								   .orElse(-1) == idx)
//					).stream().findFirst().orElseThrow();
//					if (infEdge.to().getId().equals(call.getId()))
//					{
//						// data flow invert
//						GraphEdge newEdge = new GraphEdge(edge.to(), edge.from(), GraphEdge.Type.DataFlowSource2Dest);
//						newEdge.copyMeta(infEdge);
//						graph.addEdge(newEdge);
//						graph.removeEdgeSimple(edge);
//						continue;
//					}
//					edge.copyMeta(infEdge);
//				}
//				else
//				{
//					// arg
//					idx = edge.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow();
//					var idx2 = edge.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow();
//					var infEdge = graph.findEdges(
//							e -> (e.from().getId().equals(def.getId()) &&
//								  e.getMeta(GraphEdge.Meta.FromIndex, Integer.class)
//								   .orElse(-1) == idx) ||
//								 (e.to().getId().equals(def.getId()) &&
//								  e.getMeta(GraphEdge.Meta.ToIndex, Integer.class)
//								   .orElse(-1) == idx)
//					).stream().findFirst().orElse(null);
//					if (infEdge == null || infEdge.from().getId().equals(call.getId()))
//					{
//						// data flow invert
//						GraphEdge newEdge = new GraphEdge(edge.to(), edge.from(), GraphEdge.Type.DataFlowSource2Dest);
//						newEdge.addMeta(GraphEdge.Meta.FromIndex, idx);
//						newEdge.addMeta(GraphEdge.Meta.ToIndex, idx2);
//						graph.addEdge(newEdge);
//						graph.removeEdgeSimple(edge);
//						continue;
//					}
//					edge.copyMeta(infEdge);
//				}
//			}
//		}
//		return true;
//	}

	private void solveParamOrReturn(GraphNode node)
	{
		String type = node.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();
		GraphEdge from = node.getIns().stream().findFirst().orElse(null);
		GraphEdge to = node.getOuts().stream().findFirst().orElse(null);
		if (from != null)
		{
			from.addMeta(GraphEdge.Meta.ToInf, String.format("{theInterface:%s-in}", type));
			from.addMeta(GraphEdge.Meta.FromInf, String.format("{theInterface:%s-out}", type));
		}
		if (to != null)
		{
			to.addMeta(GraphEdge.Meta.FromInf, String.format("{theInterface:%s-out}", type));
			to.addMeta(GraphEdge.Meta.ToInf, String.format("{theInterface:%s-in}", type));
		}

		node.addMeta(GraphNode.MetaType.DataFlowSolved, true);
		return;
	}

	private boolean solveEdges(Graph graph)
	{
		var edges = graph.findEdges(this::isEdgeSolvable);

		if (edges.isEmpty())
			return false;

		for (var edge : edges)
		{
			String inf;
			if (edge.hasMeta(GraphEdge.Meta.FromInf))
			{
				inf = edge.getMeta(GraphEdge.Meta.FromInf, String.class).orElseThrow();
				inf = getConjInf(inf);
				edge.addMeta(GraphEdge.Meta.ToInf, inf);
				edge.addMeta(GraphEdge.Meta.DataFlowSolved, true);
				continue;
			}
			if (edge.hasMeta(GraphEdge.Meta.ToInf))
			{
				inf = edge.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow();
				inf = getConjInf(inf);
				edge.addMeta(GraphEdge.Meta.FromInf, inf);
				edge.addMeta(GraphEdge.Meta.DataFlowSolved, true);
				continue;
			}
			throw new RuntimeException();
		}
		return true;
	}

	private boolean solveVariables(Graph graph)
	{
		var vars = graph.findNodes(this::isVarSolvable);

		if (vars.isEmpty())
			return false;

		for (var var : vars)
		{
			String inf;
			if (var.getIns().stream().anyMatch(e -> e.hasMeta(GraphEdge.Meta.ToInf)))
			{
				inf = var.getIns()
						 .stream()
						 .filter(e -> e.hasMeta(GraphEdge.Meta.ToInf))
						 .findFirst()
						 .orElseThrow()
						 .getMeta(GraphEdge.Meta.ToInf, String.class)
						 .orElseThrow();
				String conjInf = getConjInf(inf);
				String oriInf = inf;
				var.getOuts().forEach(e -> e.addMeta(GraphEdge.Meta.FromInf, conjInf));
				var.getIns().forEach(e -> e.addMeta(GraphEdge.Meta.ToInf, oriInf));
				var.addMeta(GraphNode.MetaType.DataFlowSolved, true);
				continue;
			}
			if (var.getOuts().stream().anyMatch(e -> e.hasMeta(GraphEdge.Meta.FromInf)))
			{
				inf = var.getOuts()
						 .stream()
						 .filter(e -> e.hasMeta(GraphEdge.Meta.FromInf))
						 .findFirst()
						 .orElseThrow()
						 .getMeta(GraphEdge.Meta.FromInf, String.class)
						 .orElseThrow();
				String conjInf = getConjInf(inf);
				String oriInf = inf;
				var.getOuts().forEach(e -> e.addMeta(GraphEdge.Meta.FromInf, oriInf));
				var.getIns().forEach(e -> e.addMeta(GraphEdge.Meta.ToInf, conjInf));
				var.addMeta(GraphNode.MetaType.DataFlowSolved, true);
				continue;
			}
			throw new RuntimeException();
		}
		return true;
	}

	private boolean solvePrevious(Graph graph)
	{
		var pres = graph.findNodes(this::isPreviousSolvable);

		if (pres.isEmpty())
			return false;

		for (var pre : pres)
		{
			String inf;
			if (pre.getIns().stream().anyMatch(e -> e.hasMeta(GraphEdge.Meta.ToInf)))
			{
				inf = pre.getIns()
				        .stream()
				        .filter(e -> e.hasMeta(GraphEdge.Meta.ToInf))
				        .findFirst()
				        .orElseThrow()
				        .getMeta(GraphEdge.Meta.ToInf, String.class)
				        .orElseThrow();
				String conjInf = getConjInf(inf);
				String oriInf = inf;
				pre.getOuts().forEach(e -> e.addMeta(GraphEdge.Meta.FromInf, conjInf));
				pre.getIns().forEach(e -> e.addMeta(GraphEdge.Meta.ToInf, oriInf));
				pre.addMeta(GraphNode.MetaType.DataFlowSolved, true);
				continue;
			}
			if (pre.getOuts().stream().anyMatch(e -> e.hasMeta(GraphEdge.Meta.FromInf)))
			{
				inf = pre.getOuts()
				        .stream()
				        .filter(e -> e.hasMeta(GraphEdge.Meta.FromInf))
				        .findFirst()
				        .orElseThrow()
				        .getMeta(GraphEdge.Meta.FromInf, String.class)
				        .orElseThrow();
				String conjInf = getConjInf(inf);
				String oriInf = inf;
				pre.getOuts().forEach(e -> e.addMeta(GraphEdge.Meta.FromInf, oriInf));
				pre.getIns().forEach(e -> e.addMeta(GraphEdge.Meta.ToInf, conjInf));
				pre.addMeta(GraphNode.MetaType.DataFlowSolved, true);
				continue;
			}
			throw new RuntimeException();
		}
		return true;
	}

	private boolean solveAssignment(Graph graph)
	{
		var ass = graph.findNodesOfType(
				GraphNode.Type.CoreInteraction,
				this::isAssignmentSolvable
		);

		if (ass.isEmpty())
			return false;

		for (var as : ass)
		{
			String inf;
			if (as.getIns()
				  .stream()
				  .anyMatch(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() != 0 &&
								 e.hasMeta(GraphEdge.Meta.ToInf)))
			{
				inf = as.getIns()
						.stream()
						.filter(e -> e.hasMeta(GraphEdge.Meta.ToInf))
						.findFirst()
						.orElseThrow()
						.getMeta(GraphEdge.Meta.ToInf, String.class)
						.orElseThrow();
				String conjInf = getConjInf(inf);
				String oriInf = inf;
				as.getOuts().forEach(e -> e.addMeta(GraphEdge.Meta.FromInf, conjInf));
				as.getIns().forEach(e -> e.addMeta(GraphEdge.Meta.ToInf, oriInf));
				as.addMeta(GraphNode.MetaType.DataFlowSolved, true);
				continue;
			}
			if (as.getOuts().stream().anyMatch(e -> e.hasMeta(GraphEdge.Meta.FromInf)))
			{
				inf = as.getOuts()
						.stream()
						.filter(e -> e.hasMeta(GraphEdge.Meta.FromInf))
						.findFirst()
						.orElseThrow()
						.getMeta(GraphEdge.Meta.FromInf, String.class)
						.orElseThrow();
				String conjInf = getConjInf(inf);
				String oriInf = inf;
				as.getOuts().forEach(e -> e.addMeta(GraphEdge.Meta.FromInf, oriInf));
				as.getIns().forEach(e -> e.addMeta(GraphEdge.Meta.ToInf, conjInf));
				as.addMeta(GraphNode.MetaType.DataFlowSolved, true);
				continue;
			}
			throw new RuntimeException();
		}
		return true;
	}

	private boolean solveInternalCallParam(Graph graph)
	{
		var cps = graph.findNodes(this::isCallParamSolvable);

		if (cps.isEmpty())
			return false;

		for (var cp : cps)
		{
			List<String> infs = cp.getIns()
								  .stream()
								  .map(e -> e.getMeta(GraphEdge.Meta.ToInf, String.class).orElseThrow())
								  .collect(Collectors.toList());
			var outInfEdge =
					cp.getOuts()
					  .stream()
					  .findFirst()
					  .orElseThrow();

			var outInf = infs.stream().reduce((x, y) -> x + y).orElseThrow();

			outInfEdge.addMeta(GraphEdge.Meta.FromInf, outInf);
			cp.addMeta(GraphNode.MetaType.DataFlowSolved, true);
		}
		return true;
	}

	private boolean solveIfThenElse(Graph graph)
	{
		var ites = graph.findNodes(this::isIfThenElseSolvable);
		if (ites.isEmpty())
			return false;

		for (var ite : ites)
		{
			String inf;
			if (ite.getIns()
				   .stream()
				   .anyMatch(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() >= 2 &&
								  e.hasMeta(GraphEdge.Meta.ToInf)))
			{
				inf = ite.getIns()
						 .stream()
						 .filter(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() >= 2 &&
									  e.hasMeta(GraphEdge.Meta.ToInf))
						 .findFirst()
						 .orElseThrow()
						 .getMeta(GraphEdge.Meta.ToInf, String.class)
						 .orElseThrow();
				String conjInf = getConjInf(inf);
				String oriInf = inf;
				ite.getIns()
				   .stream()
				   .filter(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() >= 2)
				   .forEach(e -> e.addMeta(GraphEdge.Meta.ToInf, oriInf));
				ite.getOuts()
				   .stream()
				   .filter(e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 0)
				   .forEach(e -> e.addMeta(GraphEdge.Meta.FromInf, conjInf));
				ite.addMeta(GraphNode.MetaType.DataFlowSolved, true);
				continue;
			}

			if (ite.getOuts()
				   .stream()
				   .anyMatch(e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 0 &&
								  e.hasMeta(GraphEdge.Meta.FromInf)))
			{
				inf = ite.getIns()
						 .stream()
						 .filter(e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 0 &&
									  e.hasMeta(GraphEdge.Meta.FromInf))
						 .findFirst()
						 .orElseThrow()
						 .getMeta(GraphEdge.Meta.FromInf, String.class)
						 .orElseThrow();
				String conjInf = getConjInf(inf);
				String oriInf = inf;
				ite.getIns()
				   .stream()
				   .filter(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() >= 2)
				   .forEach(e -> e.addMeta(GraphEdge.Meta.ToInf, conjInf));
				ite.getOuts()
				   .stream()
				   .filter(e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 0)
				   .forEach(e -> e.addMeta(GraphEdge.Meta.FromInf, oriInf));
				ite.addMeta(GraphNode.MetaType.DataFlowSolved, true);
				continue;
			}
		}
		return true;
	}

	private boolean isPreviousSolvable(GraphNode pre)
	{
		if (pre.getType() != GraphNode.Type.CoreInteraction)
			return false;
		if (!pre.getMeta(GraphNode.MetaType.Name, String.class)
		        .orElseThrow()
		        .equals(LidlUtil.Const.PREVIOUS))
			return false;

		boolean flag1 = pre.getIns()
		                   .stream()
		                   .anyMatch(e -> e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag2 = pre.getOuts()
		                   .stream()
		                   .anyMatch(e -> e.hasMeta(GraphEdge.Meta.FromInf));

		boolean flag3 = pre.getIns()
		                   .stream()
		                   .anyMatch(e -> !e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag4 = pre.getOuts()
		                   .stream()
		                   .anyMatch(e -> !e.hasMeta(GraphEdge.Meta.FromInf));

		return (flag1 || flag2) && (flag3 || flag4);
	}
	private boolean isVarSolvable(GraphNode var)
	{
		if (var.getType() != GraphNode.Type.LocalVariable)
			return false;
		if (var.getMeta(GraphNode.MetaType.DataFlowSolved, Boolean.class).orElse(false))
			return false;

		boolean flag1 = var.getIns().stream().anyMatch(e -> e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag2 = var.getOuts().stream().anyMatch(e -> e.hasMeta(GraphEdge.Meta.FromInf));
		boolean flag3 = var.getIns().stream().anyMatch(e -> !e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag4 = var.getOuts().stream().anyMatch(e -> !e.hasMeta(GraphEdge.Meta.FromInf));

		return (flag1 || flag2) && (flag3 || flag4);
	}

	private boolean isEdgeSolvable(GraphEdge edge)
	{
		if (edge.getMeta(GraphEdge.Meta.DataFlowSolved, Boolean.class).orElse(false))
			return false;
		if (edge.getType() != GraphEdge.Type.DataFlowSource2Dest)
			return false;
		boolean flag1 = edge.hasMeta(GraphEdge.Meta.FromInf);
		boolean flag2 = edge.hasMeta(GraphEdge.Meta.ToInf);

		return flag1 ^ flag2;
	}

	private boolean isCallParamSolvable(GraphNode param)
	{
		if (param.getType() != GraphNode.Type.InternalCallParam)
			return false;
		if (param.getMeta(GraphNode.MetaType.DataFlowSolved, Boolean.class).orElse(false))
			return false;

		return param.getIns().stream().allMatch(e -> e.hasMeta(GraphEdge.Meta.ToInf));
	}

	private boolean isAssignmentSolvable(GraphNode ass)
	{
		if (ass.getType() != GraphNode.Type.CoreInteraction)
			return false;
		if (!ass.getMeta(GraphNode.MetaType.Name, String.class)
				.orElseThrow()
				.equals(LidlUtil.Const.ASSIGNMENT))
			return false;

		boolean flag1 = ass.getIns()
						   .stream()
						   .anyMatch(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() == 2 &&
										  e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag2 = ass.getOuts()
						   .stream()
						   .anyMatch(e -> e.hasMeta(GraphEdge.Meta.FromInf));

		boolean flag3 = ass.getIns()
						   .stream()
						   .anyMatch(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() == 2 &&
										  !e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag4 = ass.getOuts()
						   .stream()
						   .anyMatch(e -> !e.hasMeta(GraphEdge.Meta.FromInf));

		return (flag1 || flag2) && (flag3 || flag4);
	}

	private boolean isIfThenElseSolvable(GraphNode ite)
	{
		if (ite.getType() != GraphNode.Type.CoreInteraction)
			return false;
		if (!ite.getMeta(GraphNode.MetaType.Name, String.class)
				.orElseThrow()
				.equals(LidlUtil.Const.IF_THEN_ELSE))
			return false;

		if (ite.getIns()
			   .stream()
			   .filter(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() == 1)
			   .map(e -> e.getMeta(GraphEdge.Meta.ToInf, String.class)
						  .map(inf -> LustreUtil.findTypeFromInterface(inf).get(0))
						  .orElse("Activation"))
			   .noneMatch(i -> i.equals("Activation"))
		)
		{
			BetterLogger.error("Solving ITE", "If$Then$Else$ requires arg<1> for type Activation");
			System.exit(-1);
		}

		boolean flag2C = ite.getIns()
							.stream()
							.anyMatch(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() == 2 &&
										   e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag3C = ite.getIns()
							.stream()
							.anyMatch(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() == 3 &&
										   e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag0C = ite.getOuts()
							.stream()
							.anyMatch(e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 0 &&
										   e.hasMeta(GraphEdge.Meta.FromInf));

		boolean flag2W = ite.getIns()
							.stream()
							.anyMatch(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() == 2 &&
										   !e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag3W = ite.getIns()
							.stream()
							.anyMatch(e -> e.getMeta(GraphEdge.Meta.ToIndex, Integer.class).orElseThrow() == 3 &&
										   !e.hasMeta(GraphEdge.Meta.ToInf));
		boolean flag0W = ite.getOuts()
							.stream()
							.anyMatch(e -> e.getMeta(GraphEdge.Meta.FromIndex, Integer.class).orElseThrow() == 0 &&
										   !e.hasMeta(GraphEdge.Meta.FromInf));

		return (flag2C || flag3C || flag0C) && (flag2W || flag3W || flag0W);
	}

	private String getConjInf(String inf)
	{
		return inf.replace("-in", "--temp--")
				  .replace("-out", "-in")
				  .replace("--temp--", "-out");
	}
}
