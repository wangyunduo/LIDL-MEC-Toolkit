package org.xxxx.lidltable.ui.views.navigator.collection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.LIDLGUI.InteractionTable;
import org.eclipse.sirius.LIDLGUI.TableFactory;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.LidlTableUtils;
import org.xxxx.lidltable.ui.views.navigator.nodes.InteractiontableNode;

public class InteractiontableCollection extends NavigatorCollection {
	
	public List<InteractiontableNode> getInteractiontableNode() {
		List<InteractiontableNode> InteractiontableNodes = new ArrayList<InteractiontableNode>();
		Session session = LidlTableUtils.getSession();
		if (session == null) {
			return InteractiontableNodes;
		}
		TableFactory factory = LidlTableUtils.getFactory();
		for (InteractionTable Interactiontable : factory.getInteractiontable()) {
			InteractiontableNodes.add(new InteractiontableNode((int)Interactiontable.getIndex()));
		}
		return InteractiontableNodes;
	}
	
	@Override
	public int getSize() {
		return getInteractiontableNode().size();
	}
	
	@Override
	public Object[] getElements() {
		return getInteractiontableNode().toArray();
	}
	
	@Override
	public String getText() {
		return LidlTableGlobalConfig.INTERACTION_TABLE_IDENTIFIER;
	}
	
}
