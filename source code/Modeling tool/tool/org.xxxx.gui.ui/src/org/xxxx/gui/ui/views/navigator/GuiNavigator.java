package org.xxxx.gui.ui.views.navigator;

import org.eclipse.ui.navigator.CommonNavigator;

public class GuiNavigator extends CommonNavigator {
	
	public static final String ID = "org.xxxx.gui.ui.views.navigator";
	
	private GuiNavigatorRoot root;

	@Override
	protected Object getInitialInput() {
		if (root != null) {
			return root;
		} else {
			return new GuiNavigatorRoot();
		}
	}
}
