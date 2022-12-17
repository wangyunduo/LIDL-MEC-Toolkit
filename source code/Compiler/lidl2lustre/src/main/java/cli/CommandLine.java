package cli;

import core.Compiler;
import net.sourceforge.argparse4j.ArgumentParsers;
import net.sourceforge.argparse4j.impl.Arguments;
import net.sourceforge.argparse4j.inf.ArgumentParser;
import net.sourceforge.argparse4j.inf.ArgumentParserException;
import net.sourceforge.argparse4j.inf.Namespace;

import java.util.Collections;
import java.util.List;

public class CommandLine
{
	public static void main(String[] args)
	{
		ArgumentParser parser = buildParser();
		Namespace result = null;
		try
		{
			result = parser.parseArgs(args);
		} catch (ArgumentParserException e)
		{
			parser.handleError(e);
			System.exit(-1);
		}
		Args.resolveArgs(result);
		new Compiler().compile();
	}

	private static ArgumentParser buildParser()
	{
		ArgumentParser parser = ArgumentParsers.newFor("Lidl2Lus")
		                                       .addHelp(true)
		                                       .build()
		                                       .description("Lidl-Lustre core.Compiler")
		                                       .defaultHelp(true);

		parser.addArgument("-mi", "--main-interaction")
		      .dest("lidlEntry")
		      .type(String.class)
		      .nargs(1)
		      .required(true)
		      .metavar("Interaction Name")
		      .help("Defines the main interaction (or entry point) of the program");
//
		parser.addArgument("-f", "--files")
		      .dest("lidlSrc")
		      .type(String.class)
		      .nargs("+")
		      .required(true)
		      .metavar("FILE")
		      .help("Source files passed to this compiler tool.");

		parser.addArgument("-o", "--output")
		      .dest("lidlDst")
		      .type(String.class)
		      .nargs(1)
		      .required(false)
		      .metavar("FILE")
		      .help("Output file.");
//
		parser.addArgument("-l", "--log-level")
		      .dest("logLevel")
		      .type(String.class)
		      .nargs(1)
		      .required(false)
		      .setDefault(Collections.singletonList("notice"))
		      .metavar("LEVEL")
		      .help("Set tool's log level.");

		parser.addArgument("-cl", "--colorful-log")
		      .dest("colorfulLog")
		      .type(Boolean.class)
		      .required(false)
		      .setDefault(false)
		      .action(Arguments.storeTrue())
		      .help("Set this to enable colorful log.");
//
//		parser.addArgument("-sc", "--step-compile")
//		      .dest("compileStep")
//		      .type(Integer.class)
//		      .nargs(1)
//		      .required(false)
//		      .setDefault(Collections.singletonList(2147483647))
//		      .metavar("TARGET STEP")
//		      .help("Set tool's target compile step.");

		return parser;
	}

	public static class Args
	{
		public static Args Instance = new Args();

		private Args() {}

		public static final String lidlEntryKey = "lidlEntry";
		private String lidlEntry;

		public static final String lidlSrcKey = "lidlSrc";
		private List<String> lidlSrc;

		public static final String lidlDstKey = "lidlDst";
		private String lidlDst;

		public static final String logLevelKey = "logLevel";
		private String logLevel;

		public static final String compileStepKey = "compileStep";
		private Integer compileStep = 2147483647;

		public static final String colorfulLogKey = "colorfulLog";
		private Boolean colorfulLog = false;

		public static void resolveArgs(Namespace ns)
		{
			Instance.lidlEntry = (String) ns.getList(lidlEntryKey).get(0);
			var dstList = ns.getList(lidlDstKey);
			Instance.lidlDst = dstList == null ? null : (String) dstList.get(0);
			Instance.lidlSrc = ns.getList(lidlSrcKey);
			Instance.logLevel = (String) ns.getList(logLevelKey).get(0);
			Instance.colorfulLog = ns.getBoolean(colorfulLogKey);
//			Instance.compileStep = (Integer) ns.getList(compileStepKey).get(0);
		}

		public Boolean getColorfulLog()
		{
			return colorfulLog;
		}

		public String getLidlEntry()
		{
			return lidlEntry;
		}

		public String getLidlDst()
		{
			return lidlDst;
		}

		public List<String> getLidlSrc()
		{
			return lidlSrc;
		}

		public String getLogLevel() {return logLevel;}

		public Integer getCompileStep()
		{
			return compileStep;
		}
	}
}

