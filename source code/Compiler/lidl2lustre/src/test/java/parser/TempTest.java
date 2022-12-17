package parser;

import core.common.FSUtils;
import core.common.log.BetterLogger;
import core.graph.Graph;
import core.graph.GraphTransformationPipeline;
import core.parser.Analyser;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

class TempTest
{
	Analyser analyser;

	@Test
	void analyse()
	{
		analyser = new Analyser();
		List<File> lidls = FSUtils.searchFilesWithExt(".\\src\\test\\resources\\temp", "lidl");
		analyser.addSrc(lidls);
		analyser.analyse();
		Graph g = analyser.getGraph();
		g.setEntryName("addition () ()");
		BetterLogger.setLogLevel(BetterLogger.LogLevel.Debug);
		new GraphTransformationPipeline().setWorkDirectory(".\\src\\test\\resources\\temp").run(g);
	}
}