package org.eclipse.sirius.lidlgui.ui.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.sirius.lidlgui.ui.config.ComolGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.ComolUtils;

public class ComolPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if ("atComolPerspective".equals(property)) {
			if (ComolUtils.getCurrentPerspectiveId().equals(ComolGlobalConfig.PERSPECTIVE_ID)) {
				return true;
			}
		}
		return false;
	}
	

}
