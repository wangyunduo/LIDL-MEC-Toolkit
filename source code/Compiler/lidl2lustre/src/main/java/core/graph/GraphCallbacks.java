package core.graph;

import core.common.log.BetterLogger;
import core.graph.output.OutputDigraph;

import java.util.function.BiFunction;

public class GraphCallbacks
{
	/**
	 * Not Useful
	 */
	public static final GraphCallbackFunc logGraph =
			new GraphCallbackFunc(
					"logGraph",
					(graph, dir) ->
					{
						BetterLogger.notice("Graph Output", graph.toString(), true);
						return true;
					}
			);

	/**
	 * Output Digraph of a map
	 */
	public static final GraphCallbackFunc outDigraph = new GraphCallbackFunc(
			"outputDigraph",
			(graph, dir) ->
					new OutputDigraph().setWorkDirectory(dir).run(graph)
	);


	public static class GraphCallbackFunc implements BiFunction<Graph, String, Boolean>
	{
		private final BiFunction<Graph, String, Boolean> func;
		private final String funcName;

		public GraphCallbackFunc(String name, BiFunction<Graph, String, Boolean> function)
		{
			func = function;
			funcName = name;
		}

		public Boolean apply(Graph graph, String directory)
		{
			return func.apply(graph, directory);
		}

		@Override
		public String toString()
		{
			return funcName;
		}
	}
}
