package org.xxxx.lidltable.ui.views.navigator.nodes;

import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;

public class DatatypetableNode extends NavigatorNode {
	
	public DatatypetableNode(int index) {
		this.index = index;
		this.name = "Definition table " + index;
		// bind the representation to the Data type table's representation
		// the two representations' name should be the same
		this.representation = LidlTableGlobalConfig.DATATYPE_TABLE_NAME + " " + index;
	}
	
}
