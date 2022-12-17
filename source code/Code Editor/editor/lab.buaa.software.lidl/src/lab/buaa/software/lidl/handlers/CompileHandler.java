package lab.buaa.software.lidl.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.swt.widgets.FileDialog;

public class CompileHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Locale.setDefault(Locale.ENGLISH);
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ConsolePrinter ptr = new ConsolePrinter();

		FileNameExtensionFilter filter = new FileNameExtensionFilter("LIDL File (*.lidl)", "lidl");
		JFileChooser fileDialog = new JFileChooser(getProjectPath());
		fileDialog.setMultiSelectionEnabled(true);
		fileDialog.addChoosableFileFilter(filter);
		fileDialog.setFileFilter(filter);

		int ret1 = fileDialog.showOpenDialog(null);
		if (ret1 != JFileChooser.APPROVE_OPTION) {
			return null;
		}

		File[] files = fileDialog.getSelectedFiles();
		if (files.length == 0) {
			return null;
		}
		for (File file : files) {
			ptr.printMessage("SourceFile", file.getAbsolutePath());
		}

		String srcs = Arrays.stream(files).map(f -> f.getAbsolutePath()).reduce((x, y) -> x + " " + y).orElse("");

		InputDialog dialog = new InputDialog(window.getShell(), "LIDL Compiler", "Main Interaction", null, null);
		dialog.setBlockOnOpen(true);
		int ret2 = dialog.open();
		if (ret2 != InputDialog.OK) {
			return null;
		}

		String mi = dialog.getValue();

		ptr.printMessage("LIDL Editor", "Main Interaction: " + mi);
		String cmd = String.format("cmd /c java -jar Lidl2Lustre.jar -f %s -mi \"%s\" -o %s\\build\\%s.lus", srcs, mi,
				files[0].getParent(), "out");
		ptr.printMessage("LIDL Editor", "Excuting: " + cmd);
		try {
			Runtime runtime = Runtime.getRuntime();
//			cmd = "cmd /c path";
//			cmd = "cmd /c java -v";
//			cmd = "cmd /c dir";
//			cmd = "cmd /c java -jar Lidl2Lustre.jar -h";
			String temp = null;
			StringBuilder sb = new StringBuilder();
//			sb.append("\n");

			Process process = runtime.exec(cmd);
			int ret = process.waitFor();

			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(process.getInputStream()/*, Charset.forName("gbk")*/));
			while ((temp = bufferedReader.readLine()) != null) {
				sb.append(temp + "\n");
			}

			BufferedReader bufferedErrReader = new BufferedReader(
					new InputStreamReader(process.getErrorStream()));
			while ((temp = bufferedErrReader.readLine()) != null) {
				sb.append("[Error Stream] " + temp + "\n");
			}
			
			ptr.printMessage(sb.toString());

			if (ret == 0) {
				ptr.printMessage("Success!");
			} else {
				ptr.printMessage("Error Occured!");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	private String getProjectPath() {
		return Platform.getLocation().toOSString();
	}
}
