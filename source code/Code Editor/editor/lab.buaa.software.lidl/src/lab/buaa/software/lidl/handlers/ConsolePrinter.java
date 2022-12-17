package lab.buaa.software.lidl.handlers;

import java.text.SimpleDateFormat;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class ConsolePrinter {

	MessageConsole console = null;
	MessageConsoleStream consoleStream = null;
	IConsoleManager consoleManager = null;
	final String CONSOLE_NAME = "Console";

	private void initConsole() {
		console = new MessageConsole(CONSOLE_NAME, null);

		consoleManager = ConsolePlugin.getDefault().getConsoleManager();
		consoleManager.addConsoles(new IConsole[] { console });

		consoleStream = console.newMessageStream();
	}

	private void print(String message) {
		if (message != null) {
			if (console == null) {
				initConsole();
			}

			consoleManager.showConsoleView(console);

			consoleStream.print(message);
		}
	}

	public void printMessage(String message) {
		printMessage("Console", message);
	}

	public void printMessage(String tag, String message) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		print(String.format("%s [%s] %s\n", sdf.format(System.currentTimeMillis()), tag, message));
	}
}
