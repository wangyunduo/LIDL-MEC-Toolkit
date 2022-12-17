package core.graph;

import core.common.AbstractProcessor;
import core.common.FSUtils;
import core.graph.output.OutputLustre;
import core.graph.trans.*;
import core.common.log.BetterLogger;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class GraphTransformationPipeline extends AbstractProcessor<Graph>
{
	private static final List<Class<? extends AbstractProcessor<Graph>>> graphProcessors;

	public GraphTransformationPipeline()
	{
		super("GT Pipeline", "Graph Transformation Pipeline");
	}


	static
	{
		graphProcessors = new ArrayList<>();
		registerGraphProcessors();
	}

	/**
	 * Register Graph Processors here
	 */
	private static void registerGraphProcessors()
	{
//		graphProcessors.add(OutputDigraph.class);
		graphProcessors.add(GraphNodeRelabel.class);
		graphProcessors.add(PackageImportChecking.class);
		graphProcessors.add(ModuleCollapse.class);
		graphProcessors.add(MainNodeExtraction.class);
		graphProcessors.add(IdentifierCollapse.class);
//		graphProcessors.add(DataTypeExpansion.class);
		graphProcessors.add(InterfaceCollapse.class);
		graphProcessors.add(InterfaceRename.class);
		graphProcessors.add(InterfaceSeparation.class);
		graphProcessors.add(BehaviourSeparation.class);
		graphProcessors.add(WhenThenSeparation.class);
		graphProcessors.add(AllSeparation.class);
		graphProcessors.add(InteractionInstantiate.class);
		graphProcessors.add(CompositionSeparation.class);
		graphProcessors.add(MakeIsAFlowInitiallyInstantiate.class);
		graphProcessors.add(CompositionMatching.class);
		graphProcessors.add(ParamMatching.class);
//		graphProcessors.add(IdentifierMatching.class);
		graphProcessors.add(DataflowDirectionSolving.class);
		graphProcessors.add(DataflowCleanSweep.class);
		graphProcessors.add(IdentifierInstantiate.class);
		graphProcessors.add(ConstantInstantiate.class);
		graphProcessors.add(DataflowTypeSolving.class);
		graphProcessors.add(IfThenElseInstantiate.class);
		graphProcessors.add(ApplyToAndGetInstantiate.class);
		graphProcessors.add(AssignmentInstantiate.class);
		graphProcessors.add(PreviousInstantiate.class);
//		graphProcessors.add(FunctionCallInstantiate.class);
		graphProcessors.add(NodeAssembleFlow.class);
		graphProcessors.add(NodeAssembleDef.class);
		graphProcessors.add(NodeAssemble.class);
		graphProcessors.add(OutputLustre.class);
//		graphProcessors.add(InterfaceInstantiate.class);
	}

	@Override
	protected boolean process(Graph item)
	{
		if (BetterLogger.getLogLevel().level <= BetterLogger.LogLevel.Debug.level)
		{
			// Only affect when dir doesn't exist
			FSUtils.createDir(workDir + File.separator + "graphRaw");
			FSUtils.createDir(workDir + File.separator + "core/graph");
			// Affect when dir is not empty
			FSUtils.clearOnlyFilesInDir(workDir + File.separator + "graphRaw");
			FSUtils.clearOnlyFilesInDir(workDir + File.separator + "core/graph");
		}

		for (var c : graphProcessors)
		{
			try
			{
				AbstractProcessor<Graph> ap = c.getDeclaredConstructor().newInstance();
				if (BetterLogger.getLogLevel().level <= BetterLogger.LogLevel.Debug.level)
					ap.addCallback(GraphCallbacks.outDigraph);
				if (!ap.setWorkDirectory(workDir).run(item))
					return false;
				if (item.step >= item.targetStep)
					return true;
			} catch (InstantiationException |
					 IllegalAccessException |
					 InvocationTargetException |
					 NoSuchMethodException e)
			{
				BetterLogger.error("GT Pipeline", String.format("Error in graph transformation <%s> ", c.getName()));
				e.printStackTrace();
			}
		}
		return true;
	}
}
