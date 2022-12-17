package org.xxxx.gui.ui.views.navigator;

import org.eclipse.jface.viewers.LabelProvider;
import org.xxxx.gui.ui.views.navigator.collection.NavigatorCollection;
import org.xxxx.gui.ui.views.navigator.nodes.NavigatorNode;


public class GuiContentLabelProvider extends LabelProvider {
	@Override
	public String getText(Object element) {
		if (element instanceof NavigatorCollection) {
			NavigatorCollection collection = (NavigatorCollection) element;
			return collection.getText();
		} else if (element instanceof NavigatorNode) {
			NavigatorNode node = (NavigatorNode) element;
			return node.getName();
		}
		return null;
	}
}
