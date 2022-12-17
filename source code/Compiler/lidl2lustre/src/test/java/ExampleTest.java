import core.common.FSUtils;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphCallbacks;
import core.graph.GraphTransformationPipeline;
import org.junit.jupiter.api.Test;
import core.parser.Analyser;

import java.io.File;
import java.util.List;

public class ExampleTest
{
	Analyser analyser;
	//	int compileStep = 11;
	int compileStep = Integer.MAX_VALUE;
	final String exampleRoot = ".\\src\\test\\resources\\case";
	String[] exampleEntry = new String[]{
			"MainUI",
			"My Simple User Interface ()",
			"My Simple User Interface",
			"My Simple User Interface()And()",
			"My Simple User Interface",
			"My Simple User Interface()()",
			"My Simple User Interface",
			"My Simple User Interface()()",
			"My Simple User Interface ()",
			"fibonacci ! ()",
	};

	@Test
	void analyse()
	{
		analyseSingle(0);
	}

	@Test
	void analyseSimple()
	{
		analyseSingle(7);
	}

	@Test
	void analyseSmall()
	{
		for (int i = exampleEntry.length - 1; i > 0; i--)
		{
			analyseSingle(i);
		}
	}

	boolean analyseSingle(int index)
	{
		analyser = new Analyser();
		BetterLogger.setLogLevel(BetterLogger.LogLevel.Debug);
//		BetterLogger.setLogLevel(BetterLogger.LogLevel.Notice);
		List<File> lidls = FSUtils.searchFilesWithExt(exampleRoot + index, "lidl");
		File f = new File("./src/main/lib/lang.lidl");
		lidls.add(f);
		analyser.addSrc(lidls);
		analyser.analyse();
		Graph g = analyser.getGraph();
		g.setEntryName(exampleEntry[index]);
		g.setTargetStep(compileStep);
		return new GraphTransformationPipeline().setWorkDirectory(exampleRoot + index)
												.addCallback(GraphCallbacks.outDigraph)
												.run(g);
	}
}
