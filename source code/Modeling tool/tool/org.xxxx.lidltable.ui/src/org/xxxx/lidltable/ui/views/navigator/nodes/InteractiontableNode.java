package org.xxxx.lidltable.ui.views.navigator.nodes;

import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;

public class InteractiontableNode extends NavigatorNode {
	
	public InteractiontableNode(int index) {
		this.index = index;
		this.name = "Definition table " + index;
		this.representation = LidlTableGlobalConfig.INTERACTION_TABLE_NAME + " " + index;
	}
}
