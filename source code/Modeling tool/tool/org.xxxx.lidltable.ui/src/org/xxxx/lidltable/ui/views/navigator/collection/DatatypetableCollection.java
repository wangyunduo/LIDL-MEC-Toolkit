package org.xxxx.lidltable.ui.views.navigator.collection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;
import org.xxxx.lidltable.ui.views.navigator.nodes.DatatypetableNode;

public class DatatypetableCollection extends NavigatorCollection {
	
	public List<DatatypetableNode> getDatatypeTableNode() {
		List<DatatypetableNode> datatypetableNodes = new ArrayList<DatatypetableNode>();
		Session session = LidlTableUtils.getSession();
		if (session == null) {
			return datatypetableNodes;
		}
		TableFactory factory = LidlTableUtils.getFactory();
		for (DatatypeTable datatypeTable : factory.getDatatypetable()) {
			datatypetableNodes.add(new DatatypetableNode((int)datatypeTable.getIndex()));
		}
		return datatypetableNodes;
	}
	
	@Override
	public int getSize() {
		return getDatatypeTableNode().size();
	}
	
	@Override
	public Object[] getElements() {
		return getDatatypeTableNode().toArray();
	}
	
	@Override
	public String getText() {
		return LidlTableGlobalConfig.DATATYPE_TABLE_IDENTIFIER;
	}
	
}
