package core.graph.trans;

import core.common.AbstractProcessor;
import core.common.log.BetterLogger;
import core.common.log.BetterToString;
import core.graph.Graph;
import core.graph.GraphEdge;
import core.graph.GraphNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Currently only concerns about the wildcard-imports
 */
public class PackageImportChecking extends AbstractProcessor<Graph>
{
	public PackageImportChecking()
	{
		super("GT Processor", "Check Package Import");
//		addCallback(GraphCallbacks.outDigraph);
	}

	@Override
	protected boolean process(Graph item)
	{
		item.setStage(pNameSimple);

		if (!removeWildCard(item))
			return false;

//		if (!removeStandardLib(item))
//			return false;

		if (!resolveData(item))
			return false;

		if (!resolveInterface(item))
			return false;

		if (!resolveExpression(item))
			return false;

		return true;
	}

	private boolean removeWildCard(Graph graph)
	{
		var pkgs = graph.findNodesOfType(GraphNode.Type.ModuleRoot);
		pkgs.forEach(
				pkg ->
				{
					List<String> imps = pkg.getMeta(GraphNode.MetaType.Imports, List.class)
					                       .orElse(new ArrayList<String>());
					List<String> newImps = new ArrayList<>();
					imps.forEach(imp -> newImps.add(imp.replaceAll("\\.\\*", "")));
					pkg.addMeta(GraphNode.MetaType.Imports, newImps);
				});
		return true;
	}

	private final String STANDARD_LIB = "lidl.lang";

	private boolean removeStandardLib(Graph graph)
	{
		var pkgs = graph.findNodesOfType(GraphNode.Type.ModuleRoot);
		pkgs.forEach(
				pkg ->
				{
					List<String> imps = pkg.getMeta(GraphNode.MetaType.Imports, List.class)
					                       .orElse(new ArrayList<String>());
					imps.remove(STANDARD_LIB);
				});
		return true;
	}

	private boolean resolveData(Graph graph)
	{
		HashSet<String> lidlBDT = new HashSet<>(List.of("Number", "Text", "Activation", "Boolean"));
		List<GraphNode> dataRefs = graph.findNodes(
				(node) -> (node.getType() == GraphNode.Type.DataTypeElem &&
				           node.getMeta(GraphNode.MetaType.Type, String.class).orElseThrow().equals("ref") &&
				           !lidlBDT.contains(node.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow()))
				          ||
				          (node.getType() == GraphNode.Type.InterfaceTypeElem &&
				           node.getMeta(GraphNode.MetaType.Type, String.class).orElseThrow().equals("ref") &&
				           !lidlBDT.contains(
						           node.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow()) &&
				           node.getMeta(GraphNode.MetaType.Direction).isPresent())
		);
//		BetterLogger.notice("Expand PI", BetterToString.str(dataRefs));

		for (var ref : dataRefs)
		{
			String refType = ref.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();
			// find in self nested defs
			AtomicBoolean find = new AtomicBoolean(false);
			AtomicReference<GraphNode> findNode = new AtomicReference<>(null);
			graph.findNodesInDirectChildren(
					ref.parent(),
					node -> node.getType() == GraphNode.Type.DataDefinition &&
					        node.getIns().get(0).getType() == GraphEdge.Type.Data2NestData
			).forEach(nestedDef -> {
				if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refType))
				{
					find.set(true);
					findNode.set(nestedDef);
				}
			});
			if (find.get())
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI", String.format("Data %s Found \n%s", refType, findNode.get()), true);
				continue;
			}


			// if not , find in same level defs

			graph.findNodesInDirectChildren(
					ref.parent().parent(),
					node -> node.getType() == GraphNode.Type.DataDefinition
			).forEach(nestedDef -> {
				if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refType))
				{
					find.set(true);
					findNode.set(nestedDef);
				}
			});
			if (find.get())
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI", String.format("Data %s Found \non %s", refType, findNode.get()), true);
				continue;
			}

			// if not , find in other package
			GraphNode module = graph.findNodeInOriginalParents(
					ref, node -> node.getType() == GraphNode.Type.ModuleRoot
			);
			List<String> imports = new ArrayList<String>(module.getMeta(GraphNode.MetaType.Imports, List.class)
			                                                   .orElse(new ArrayList<String>()));
			imports.add(module.getMeta(GraphNode.MetaType.Package, String.class).orElseThrow());
			AtomicReference<String> findPackage = new AtomicReference<>(null);
			for (String imp : imports)
			{
				var targetModules = graph.findNodes(
						node -> node.getType() == GraphNode.Type.ModuleRoot &&
						        node.getMeta(GraphNode.MetaType.Package, String.class).orElseThrow().equals(imp)
				);

				if (targetModules.size() > 1)
				{
					reportError(String.format(
							"Package with same name: %s",
							BetterToString.str(targetModules.stream().map(
									node -> node.getMeta(GraphNode.MetaType.Package, String.class)
							)))
					);
					return false;
				}

				if (targetModules.size() == 0)
				{
					reportError(String.format("No package with name: %s", imp));
					return false;
				}

				GraphNode m = targetModules.get(0);
				List<GraphNode> defs = graph
						.findNodesInDirectChildren(m, node -> node.getType() == GraphNode.Type.DataDefinition);

				defs.forEach(nestedDef -> {
					if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refType))
					{
						find.set(true);
						findNode.set(nestedDef);
						findPackage.set(imp);
					}
				});
			}
			if (!find.get())
			{
				reportError(String.format("Data Definition Not Found: %s", refType));
				return false;
			}
			else
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI",
				                    String.format("Data %s Found \nin package %s", refType, findPackage.get()), true);
			}
		}
		return true;
	}

	private boolean resolveInterface(Graph graph)
	{
		List<GraphNode> interfaceRefs = graph.findNodes(
				(node) -> node.getType() == GraphNode.Type.InterfaceTypeElem &&
				          node.getMeta(GraphNode.MetaType.Direction).isEmpty()
		);
//		BetterLogger.notice("Expand PI", BetterToString.str(dataRefs));
///*
		for (var ref : interfaceRefs)
		{
			String refType = ref.getMeta(GraphNode.MetaType.SubType, String.class).orElseThrow();
			// find in self nested defs
			AtomicBoolean find = new AtomicBoolean(false);
			AtomicReference<GraphNode> findNode = new AtomicReference<>(null);
			graph.findNodesInDirectChildren(
					ref.parent(),
					node -> node.getType() == GraphNode.Type.InterfaceDefinition &&
					        node.getIns().get(0).getType() == GraphEdge.Type.Interface2NestInterface
			).forEach(nestedDef -> {
				if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refType))
				{
					find.set(true);
					findNode.set(nestedDef);
				}
			});
			if (find.get())
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI", String.format("Interface %s Found! \n%s", refType, findNode.get()),
				                    true);
				continue;
			}


			// if not , find in same level defs

			graph.findNodesInDirectChildren(
					ref.parent().parent(),
					node -> node.getType() == GraphNode.Type.InterfaceDefinition
			).forEach(nestedDef -> {
				if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refType))
				{
					find.set(true);
					findNode.set(nestedDef);
				}
			});
			if (find.get())
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI", String.format("Interface %s Found \non %s", refType, findNode.get()),
				                    true);
				continue;
			}

			// if not , find in other package
			GraphNode module = graph.findNodeInOriginalParents(
					ref, node -> node.getType() == GraphNode.Type.ModuleRoot
			);
			List<String> imports = new ArrayList<>(module.getMeta(GraphNode.MetaType.Imports, List.class)
			                                             .orElse(new ArrayList<String>()));
			imports.add(module.getMeta(GraphNode.MetaType.Package, String.class).orElseThrow());
			AtomicReference<String> findPackage = new AtomicReference<>(null);
			for (String imp : imports)
			{
				var targetModules = graph.findNodes(
						node -> node.getType() == GraphNode.Type.ModuleRoot &&
						        node.getMeta(GraphNode.MetaType.Package, String.class).orElseThrow().equals(imp)
				);

				if (targetModules.size() > 1)
				{
					reportError(String.format(
							"Package with same name: %s",
							BetterToString.str(targetModules.stream().map(
									node -> node.getMeta(GraphNode.MetaType.Package, String.class)
							)))
					);
					return false;
				}

				if (targetModules.size() == 0)
				{
					reportError(String.format("No package with name: %s", imp));
					return false;
				}

				GraphNode m = targetModules.get(0);
				List<GraphNode> defs = graph
						.findNodesInDirectChildren(m, node -> node.getType() == GraphNode.Type.InterfaceDefinition);

				defs.forEach(nestedDef -> {
					if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refType))
					{
						find.set(true);
						findNode.set(nestedDef);
						findPackage.set(imp);
					}
				});
			}
			if (!find.get())
			{
				reportError(String.format("Interface Definition Not Found: %s", refType));
				return false;
			}
			else
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI",
				                    String.format("Interface %s Found \nin package %s", refType, findPackage), true);
			}
		}
		//*/
		return true;
	}

	private boolean resolveExpression(Graph graph)
	{
		List<GraphNode> expressionRefs = graph.findNodes(
				(node) -> node.getType() == GraphNode.Type.Expression &&
				          node.getMeta(GraphNode.MetaType.Type, String.class)
				              .orElseThrow()
				              .equals(GraphNode.MetaValue.Reference)
		);
//		BetterLogger.notice("Expand PI", BetterToString.str(dataRefs));
///*
		for (var ref : expressionRefs)
		{
			String refName = ref.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow();
			AtomicBoolean find = new AtomicBoolean(false);
			AtomicReference<GraphNode> findNode = new AtomicReference<>(null);
			// find in params
			graph.findNodesInDirectChildren(
					     graph.findNodeInOriginalParents(
							     ref, node -> node.getType() == GraphNode.Type.InteractionDefinition
					     ),
					     node -> node.getType() == GraphNode.Type.InteractionParam
			     )
			     .stream()
			     .map(GraphNode::getOuts)
			     .reduce(new ArrayList<>(), (x, y) -> {
				     x.addAll(y);
				     return x;
			     })
			     .forEach(paramEdge -> {
				     if (paramEdge.to().getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refName))
				     {
					     find.set(true);
					     findNode.set(paramEdge.from());
				     }
			     });
			if (find.get())
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Check PI", String.format("Param %s Found! \n%s", refName, findNode.get()), true);
				continue;
			}

			// if not ,find in self nested defs
			// TODO: Fix? findNodes or findNode ?
			var parentIADef = graph.findNodesInOriginalParents(
					ref,
					node -> node.getType() == GraphNode.Type.InteractionDefinition
			);

			List<GraphNode> nestedIADefs = new ArrayList<>();
			parentIADef.forEach(
					node -> nestedIADefs.addAll(
							graph.findNodesInDirectChildren(
									node,
									nd -> nd.getType() == GraphNode.Type.InteractionDefinition &&
									      nd.getIns()
									        .get(0)
									        .getType() == GraphEdge.Type.Interaction2NestInteraction)
					)
			);

			nestedIADefs.forEach(nestedDef -> {
				if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refName))
				{
					find.set(true);
					findNode.set(nestedDef);
				}
			});
			if (find.get())
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI", String.format("Interaction %s Found! \n%s", refName, findNode.get()),
				                    true);
				continue;
			}

			// if not , find in same level defs
			graph.findNodesInDirectChildren(
					graph.findNodeInOriginalParents(
							ref, node -> node.getType() == GraphNode.Type.ModuleRoot
					),
					node -> node.getType() == GraphNode.Type.InteractionDefinition
			).forEach(nestedDef -> {
				if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refName))
				{
					find.set(true);
					findNode.set(nestedDef);
				}
			});
			if (find.get())
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI", String.format("Interaction %s Found \non %s", refName, findNode.get()),
				                    true);
				continue;
			}

			// if not , find in other package
			GraphNode module = graph.findNodeInOriginalParents(
					ref, node -> node.getType() == GraphNode.Type.ModuleRoot
			);
			List<String> imports = new ArrayList<>(module.getMeta(GraphNode.MetaType.Imports, List.class)
			                                             .orElse(new ArrayList<String>()));
			imports.add(module.getMeta(GraphNode.MetaType.Package, String.class).orElseThrow());
			AtomicReference<String> findPackage = new AtomicReference<>(null);
			for (String imp : imports)
			{
				var targetModules = graph.findNodes(
						node -> node.getType() == GraphNode.Type.ModuleRoot &&
						        node.getMeta(GraphNode.MetaType.Package, String.class).orElseThrow().equals(imp)
				);

				if (targetModules.size() > 1)
				{
					reportError(String.format(
							"Package with same name: %s",
							BetterToString.str(targetModules.stream().map(
									node -> node.getMeta(GraphNode.MetaType.Package, String.class)
							)))
					);
					return false;
				}

				if (targetModules.size() == 0)
				{
					reportError(String.format("No package with name: %s", imp));
					return false;
				}

				GraphNode m = targetModules.get(0);
				List<GraphNode> defs = graph
						.findNodesInDirectChildren(m, node -> node.getType() == GraphNode.Type.InteractionDefinition);

				defs.forEach(nestedDef -> {
					if (nestedDef.getMeta(GraphNode.MetaType.Name, String.class).orElseThrow().equals(refName))
					{
						find.set(true);
						findNode.set(nestedDef);
						findPackage.set(imp);
					}
				});
			}
			if (!find.get())
			{
				// if still not, convert it to an identifier
//				reportError(String.format("Interaction Definition Not Found: %s", refName));
//				return false;
				if (ref.getOuts().size() != 0)
				{
					reportError(
							"Error: Missing symbol with name: %s, maybe error in typo?",
							refName
					);
					return false;
				}
				GraphNode id = new GraphNode(GraphNode.Type.Identifier);
				id.addMeta(GraphNode.MetaType.Type, GraphNode.MetaValue.Identifier);
				id.addMeta(GraphNode.MetaType.Name, refName);
				graph.addNode(id);
				for (GraphEdge eDef : ref.getIns())
				{
					GraphEdge edge = new GraphEdge(eDef.from(), id, eDef.getType());
					if (eDef.getMeta(GraphEdge.Meta.FromIndex, Integer.class).isPresent())
					{
						edge.addMeta(GraphEdge.Meta.FromIndex,
						             eDef.getMeta(GraphEdge.Meta.FromIndex, Integer.class).get());
					}
					if (eDef.getMeta(GraphEdge.Meta.ToIndex, Integer.class).isPresent())
					{
						edge.addMeta(GraphEdge.Meta.ToIndex,
						             eDef.getMeta(GraphEdge.Meta.ToIndex, Integer.class).get());
					}
					graph.addEdge(edge);
				}
				graph.removeNode(ref);
			}
			else
			{
				GraphEdge ref2def = new GraphEdge(ref, findNode.get(), GraphEdge.Type.TypeRef2Def);
				graph.addEdge(ref2def);
				BetterLogger.notice("Expand PI",
				                    String.format("Interaction %s Found \nin package %s", refName, findPackage), true);
			}
		}
		//*/
		return true;
	}
}