package org.xxxx.gui.ui.views.navigator.action;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPage;
import org.xxxx.gui.ui.views.navigator.nodes.NavigatorNode;

public class GuiNavigatorAction extends Action{
	
	private ISelectionProvider provider;
	protected NavigatorNode origNode;
	
	public GuiNavigatorAction(String actionName, IWorkbenchPage page, ISelectionProvider provider) {
		super(actionName);
		this.provider = provider;
	}
	
	@Override
	public boolean isEnabled() {
		ISelection selection = provider.getSelection();
		if (!selection.isEmpty()) {
			IStructuredSelection sel = (IStructuredSelection) selection;
			if (sel.size() == 1 && sel.getFirstElement() instanceof NavigatorNode) {
				origNode = (NavigatorNode) sel.getFirstElement();
				return true;
			}
		}
		return false;
	}
	

}
