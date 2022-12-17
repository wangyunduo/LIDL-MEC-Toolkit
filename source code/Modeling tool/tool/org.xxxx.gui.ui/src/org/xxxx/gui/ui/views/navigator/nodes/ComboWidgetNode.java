package org.xxxx.gui.ui.views.navigator.nodes;

import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;

public class ComboWidgetNode extends NavigatorNode {
	
	public ComboWidgetNode(String name, int index) {
		this.index = index;
		this.name = name;
		this.representation = GuiGlobalConfig.COMBOWIDGET_IDENTIFIER+(int)index;
	}
	
}
