package org.xxxx.lidltable.ui.views.navigator.nodes;

import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;

public class InterfacetableNode extends NavigatorNode {
	
	public InterfacetableNode(int index) {
		this.index = index;
		this.name = "Definition table " + index;
		this.representation = LidlTableGlobalConfig.INTERFACE_TABLE_NAME + " " + index;
	}
}
