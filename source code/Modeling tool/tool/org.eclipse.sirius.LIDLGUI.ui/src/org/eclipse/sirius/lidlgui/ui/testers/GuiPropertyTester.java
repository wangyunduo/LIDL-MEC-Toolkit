package org.eclipse.sirius.lidlgui.ui.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;

public class GuiPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		IProject project = GuiUtils.getProject();
		if (project == null) {
			return false;
		}
		if ("atGuiPerspective".equals(property)) {
			if (GuiUtils.getCurrentPerspectiveId().equals(GuiGlobalConfig.PERSPECTIVE_ID)) {
				return true;
			}
		}
		return false;
	}

}