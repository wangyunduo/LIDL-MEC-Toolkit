package core.common.log;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BetterLogger
{
	public static final int BLACK = 30;
	public static final int RED = 31;
	public static final int GREEN = 32;
	public static final int YELLOW = 33;
	public static final int BLUE = 34;
	public static final int PURPLE = 35;
	public static final int DARK_GREEN = 36;
	public static final int WHITE = 37;

	private static LogLevel logLevel = LogLevel.Notice;

	private static boolean COLOR_LOG = true;

	public enum LogLevel
	{
		All(0, "all"),
		Debug(1, "debug"),
		Notice(2, "notice"),
		Warning(3, "warning"),
		Success(4, "success"),
		Error(5, "error"),
		Fatal(6, "fatal"),
		None(7, "none");

		public final int level;
		public final String optionName;

		LogLevel(int value, String consoleOption)
		{
			level = value;
			optionName = consoleOption;
		}

		public static LogLevel parse(String lvl)
		{
			return Arrays.stream(LogLevel.values())
			             .filter((x) -> x.optionName.equals(lvl))
			             .collect(Collectors.toList())
			             .get(0);
		}
	}


	/**
	 * Valid log-levels:
	 * <p>
	 * all, debug, notice, warning, success, error, fatal, none
	 *
	 * @param lvl string type of log level
	 * @see LogLevel
	 */
	public static void setLogLevel(String lvl)
	{
		setLogLevel(LogLevel.parse(lvl));
	}

	public static LogLevel getLogLevel()
	{
		return logLevel;
	}

	public static void setLogLevel(LogLevel lvl)
	{
		logLevel = lvl;
		log(BLUE, "BetterLogger", BLUE, "Current Log Level: " + lvl.name(), LogLevel.Notice);
	}

	public static void setColorLog(boolean colorLog)
	{
		COLOR_LOG = colorLog;
	}

	public static void log(int tagColor, String tag, int msgColor, String msg, LogLevel lvl, boolean multiline)
	{
		if (lvl.level < logLevel.level)
			return;
		System.out.printf("[ %s ]: %s%s%s", colorText(tagColor, tag), multiline ? "\n" : "", colorText(msgColor, msg),
		                  msg.endsWith("\n") ? "" : "\n");
	}

	public static void log(int tagColor, String tag, int msgColor, String msg, LogLevel lvl)
	{
		log(tagColor, tag, msgColor, msg, lvl, false);
	}

	public static void log(String tag, String msg, LogLevel lvl, boolean multiline)
	{
		if (lvl.level < logLevel.level)
			return;
		System.out.printf("[ %s ]: %s%s%s", tag, multiline ? "\n" : "", msg, msg.endsWith("\n") ? "" : "\n");
	}

	public static void log(String tag, String msg, LogLevel lvl)
	{
		log(tag, msg, lvl, false);
	}

	public static String colorText(int color, String msg)
	{
		if (COLOR_LOG)
			return String.format("\033[%dm%s\033[0m", color, msg);
		return msg;
	}

	public static String colorText(int front, int back, String msg)
	{
		if (COLOR_LOG)
			return String.format("\033[%d;%dm%s\033[0m", back + 10, front, msg);
		return msg;
	}

	// lvl 5
	public static void fatal(String tag, String msg, boolean multiline)
	{
		log(colorText(RED, YELLOW, tag), colorText(RED, msg), LogLevel.Fatal, multiline);
	}

	public static void fatal(String tag, String msg)
	{
		log(colorText(RED, YELLOW, tag), colorText(RED, msg), LogLevel.Fatal);
	}

	public static void fatal(String msg)
	{
		fatal("Fatal", msg);
	}

	public static void success(String tag, String msg, boolean multiline)
	{
		log(GREEN, tag, GREEN, msg, LogLevel.Success, multiline);
	}

	public static void success(String tag, String msg)
	{
		log(GREEN, tag, GREEN, msg, LogLevel.Success);
	}

	public static void success(String msg)
	{
		success("Success", msg);
	}

	// lvl 4
	public static void error(String tag, String msg, boolean multiline)
	{
		log(RED, tag, RED, msg, LogLevel.Error, multiline);
	}

	public static void error(String tag, String msg)
	{
		log(RED, tag, RED, msg, LogLevel.Error);
	}

	public static void error(String msg)
	{
		error("Error", msg);
	}

	// lvl 3
	public static void warn(String tag, String msg, boolean multiline)
	{
		log(YELLOW, tag, YELLOW, msg, LogLevel.Warning, multiline);
	}

	public static void warn(String tag, String msg)
	{
		log(YELLOW, tag, YELLOW, msg, LogLevel.Warning);
	}

	public static void warn(String msg)
	{
		warn("Warn", msg);
	}

	// lvl 2
	public static void notice(String tag, String msg, boolean multiline)
	{
		log(BLUE, tag, WHITE, msg, LogLevel.Notice, multiline);
	}

	public static void notice(String tag, String msg)
	{
		log(BLUE, tag, WHITE, msg, LogLevel.Notice);
	}

	public static void notice(String msg)
	{
		notice("Notice", msg);
	}

	// lvl 1
	public static void debug(String tag, String msg, boolean multiline)
	{
		log(WHITE, tag, WHITE, msg, LogLevel.Debug, multiline);
	}

	public static void debug(String tag, String msg)
	{
		log(WHITE, tag, WHITE, msg, LogLevel.Debug);
	}

	public static void debug(String msg)
	{
		debug("Debug", msg);
	}
}