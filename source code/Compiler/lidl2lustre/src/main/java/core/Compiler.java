package core;

import cli.CommandLine;
import core.common.FSUtils;
import core.common.log.BetterLogger;
import core.err.InvalidFilePathException;
import core.graph.Graph;
import core.graph.GraphTransformationPipeline;
import core.parser.Analyser;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

public class Compiler
{
	private final Analyser analyser;
	private final GraphTransformationPipeline pipeline;

	public Compiler()
	{
		analyser = new Analyser();
		pipeline = new GraphTransformationPipeline();
	}

	public void compile()
	{
		BetterLogger.setColorLog(CommandLine.Args.Instance.getColorfulLog());
		BetterLogger.setLogLevel(CommandLine.Args.Instance.getLogLevel());
		lidlAnalyse();
		graphTransform();
	}

	private void lidlAnalyse()
	{
		List<File> srcs = null;
		List<String> paths = CommandLine.Args.Instance.getLidlSrc();
		try
		{
			srcs = FSUtils.getFilesErrorThrow(paths);
		} catch (InvalidFilePathException e)
		{
			BetterLogger.error("core.Compiler", e.getMessage());
			System.exit(-1);
		}
		// Add lib file
		File lib = getLibFile();
		srcs.add(lib);
		analyser.addSrc(srcs);
		analyser.analyse();
	}

	private static final String LIB_PATH = "lib/lang.lidl";

	private File getLibFile()
	{
		String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath();
		try
		{
			path = java.net.URLDecoder.decode(path, "UTF-8");
			path = path.replace("file:\\", "").replace("file:", "");
			File file = new File(path);
			path = file.getParent();
		} catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException(e);
		}
		System.out.println(path);
		File lib = new File(path + File.separator + LIB_PATH);
		return lib;
	}

	private void graphTransform()
	{
		Graph g = analyser.getGraph();
		g.setEntryName(CommandLine.Args.Instance.getLidlEntry());
		g.setTargetStep(CommandLine.Args.Instance.getCompileStep());
		g.setOutFileName(CommandLine.Args.Instance.getLidlDst());
		boolean flag = pipeline.run(g);
		if (flag)
		{
			BetterLogger.success("Lidl2Lustre", "Done!");
		}
		else
		{
			System.exit(-1);
		}
	}
}
