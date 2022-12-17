package org.xxxx.gui.ui.views.navigator.action;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.navigator.CommonActionProvider;
import org.eclipse.ui.navigator.ICommonActionConstants;
import org.eclipse.ui.navigator.ICommonActionExtensionSite;
import org.eclipse.ui.navigator.ICommonMenuConstants;
import org.eclipse.ui.navigator.ICommonViewerSite;
import org.eclipse.ui.navigator.ICommonViewerWorkbenchSite;


public class GuiNavigatorActionProvider extends CommonActionProvider {
	
	private OpenAction openAction;
	private DeleteAction deleteAction;
	
	@Override
	public void init(ICommonActionExtensionSite site) {
		ICommonViewerSite viewerSite = site.getViewSite();
		if (viewerSite instanceof ICommonViewerWorkbenchSite) {
			ICommonViewerWorkbenchSite workbenchSite = (ICommonViewerWorkbenchSite) viewerSite;
			IWorkbenchPage page = workbenchSite.getPage();
			ISelectionProvider provider = workbenchSite.getSelectionProvider();
			openAction = new OpenAction(page, provider);
			deleteAction = new DeleteAction(page, provider);
		}
	}
	
	@Override
	public void fillActionBars(IActionBars actionBars) {
		if (openAction.isEnabled()) {
			actionBars.setGlobalActionHandler(ICommonActionConstants.OPEN, openAction);
		}
	}

	@Override
	public void fillContextMenu(IMenuManager menu) {
		if (openAction.isEnabled()) {
			menu.appendToGroup(ICommonMenuConstants.GROUP_OPEN, openAction);
			menu.appendToGroup(ICommonMenuConstants.GROUP_EDIT, deleteAction);
		}
	}
}
