package org.xxxx.gui.ui.views.navigator.nodes;

import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;

public class InteractionDiagramNode extends NavigatorNode {
	
	public InteractionDiagramNode(String name, int index) {
		this.index = index;
		this.name = GuiGlobalConfig.INTERACTION_DIAGRAM_IDENTIFIER
				 + " " + index;
		this.representation = GuiGlobalConfig.INTERACTION_DIAGRAM_IDENTIFIER+(int)index;
	}
	
}
