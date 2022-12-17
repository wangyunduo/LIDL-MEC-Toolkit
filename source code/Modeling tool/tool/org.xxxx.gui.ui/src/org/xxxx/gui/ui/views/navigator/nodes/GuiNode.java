package org.xxxx.gui.ui.views.navigator.nodes;

import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;


public class GuiNode extends NavigatorNode {
	
	public GuiNode(String name, int index) {
		this.index = index;
		this.name = name;
		this.representation = GuiGlobalConfig.GUI_DIAGRAM_IDENTIFIER+(int)index;
	}
	
}
