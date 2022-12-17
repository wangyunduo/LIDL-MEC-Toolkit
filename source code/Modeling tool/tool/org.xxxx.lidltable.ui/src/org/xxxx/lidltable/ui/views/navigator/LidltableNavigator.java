package org.xxxx.lidltable.ui.views.navigator;

import org.eclipse.ui.navigator.CommonNavigator;

public class LidltableNavigator extends CommonNavigator {
	
	public static final String ID = "org.xxxx.lidltable.ui.views.navigator";
	
	private LidltableNavigatorRoot root;

	@Override
	protected Object getInitialInput() {
		if (root != null) {
			return root;
		} else {
			return new LidltableNavigatorRoot();
		}
	}
}
