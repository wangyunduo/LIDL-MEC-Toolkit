package org.xxxx.gui.ui.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.xxxx.gui.ui.views.GuiPropertyView;
import org.xxxx.gui.ui.views.navigator.GuiNavigator;

public class GuiPerspectiveFactory implements IPerspectiveFactory {
	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		IFolderLayout left = layout.createFolder("left", IPageLayout.LEFT, 0.2f, editorArea);
		left.addView(GuiNavigator.ID);
		layout.addView(GuiPropertyView.ID, IPageLayout.BOTTOM, 0.6f, editorArea);
		layout.getViewLayout(GuiNavigator.ID).setCloseable(false);
		layout.getViewLayout(GuiNavigator.ID).setMoveable(false);
		layout.setFixed(true);
	}
}
