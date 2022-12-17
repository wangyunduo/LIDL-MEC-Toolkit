package org.eclipse.sirius.lidlgui.ui.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;

public class LidltablePropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		IProject project = LidlTableUtils.getProject();
		if (project == null) {
			return false;
		}
		if ("atLidltablePerspective".equals(property)) {
			if (LidlTableUtils.getCurrentPerspectiveId().equals(LidlTableGlobalConfig.PERSPECTIVE_ID)) {
				return true;
			}
		}
		return false;
	}

}