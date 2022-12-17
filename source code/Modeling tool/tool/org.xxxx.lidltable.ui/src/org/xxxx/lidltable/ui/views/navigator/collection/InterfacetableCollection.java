package org.xxxx.lidltable.ui.views.navigator.collection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.LIDLGUI.InterfaceTable;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;
import org.xxxx.lidltable.ui.views.navigator.nodes.InterfacetableNode;

public class InterfacetableCollection extends NavigatorCollection {
	
	public List<InterfacetableNode> getInterfacetableNode() {
		List<InterfacetableNode> InterfacetableNodes = new ArrayList<InterfacetableNode>();
		Session session = LidlTableUtils.getSession();
		if (session == null) {
			return InterfacetableNodes;
		}
		TableFactory factory = LidlTableUtils.getFactory();
		for (InterfaceTable Interfacetable : factory.getInterfacetable()) {
			InterfacetableNodes.add(new InterfacetableNode((int)Interfacetable.getIndex()));
		}
		return InterfacetableNodes;
	}
	
	@Override
	public int getSize() {
		return getInterfacetableNode().size();
	}
	
	@Override
	public Object[] getElements() {
		return getInterfacetableNode().toArray();
	}
	
	@Override
	public String getText() {
		return LidlTableGlobalConfig.INTERFACE_TABLE_IDENTIFIER;
	}
	
}
