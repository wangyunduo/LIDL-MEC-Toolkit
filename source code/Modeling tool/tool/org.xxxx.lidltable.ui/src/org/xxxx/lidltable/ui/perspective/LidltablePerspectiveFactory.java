package org.xxxx.lidltable.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.xxxx.lidltable.ui.views.LidltablePropertyView;
import org.xxxx.lidltable.ui.views.navigator.LidltableNavigator;

public class LidltablePerspectiveFactory implements IPerspectiveFactory {
	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.2f, editorArea);
		left.addView(LidltableNavigator.ID);
		layout.addView(LidltablePropertyView.ID, IPageLayout.BOTTOM, 0.6f, editorArea);
		layout.getViewLayout(LidltableNavigator.ID).setCloseable(false);
		layout.getViewLayout(LidltableNavigator.ID).setMoveable(false);
		layout.setFixed(true);
	}
}
