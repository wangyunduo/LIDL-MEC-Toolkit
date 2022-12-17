package parser;

import core.common.FSUtils;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphCallbacks;
import core.parser.Analyser;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

class AnalyserTest
{
	Analyser analyser;

//	String[] entries = new String[]{
//			"button  on (state: i1)and    displaying(text: m3 out)"
//	};

	String[] paths = new String[]{
			".\\src\\test\\resources\\case0",
			".\\src\\test\\resources\\case1",
//			".\\src\\test\\resources\\case2"
	};

	@Test
	void analyse()
	{
		for (int i = 0; i < paths.length; i++)
		{
			analyser = new Analyser();
//			runSingle(paths[i], entries[i]);
			runSingle(paths[i]);
		}
	}

	//	void runSingle(String path, String entry)
	void runSingle(String path)
	{
		BetterLogger.setLogLevel(BetterLogger.LogLevel.Debug);
		List<File> lidls = FSUtils.searchFilesWithExt(path, "lidl");
		analyser.addSrc(lidls);
		analyser.analyse();
		Graph g = analyser.getGraph();
//		g.setEntryName(entry);
		boolean ret = GraphCallbacks.outDigraph.apply(g, path);
		BetterLogger.success("AnalyserTest", String.valueOf(ret));
	}
}