package org.xxxx.gui.ui.views.navigator.collection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.LIDLGUI.ComboWidgetFactory;
import org.eclipse.sirius.LIDLGUI.GUI;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;
import org.xxxx.gui.ui.views.navigator.nodes.GuiNode;

public class GuiCollection extends NavigatorCollection {
	
	public List<GuiNode> getGuiNode() {
		List<GuiNode> guiNodes = new ArrayList<GuiNode>();
		Session session = GuiUtils.getSession();
		if (session == null) {
			return guiNodes;
		}
		ComboWidgetFactory factory = GuiUtils.getFactory();
		for (GUI Gui : factory.getGui()) {
			guiNodes.add(new GuiNode(Gui.getName(), (int)Gui.getIndex()));
		}
		return guiNodes;
	}
	
	@Override
	public int getSize() {
		return getGuiNode().size();
	}
	
	@Override
	public Object[] getElements() {
		return getGuiNode().toArray();
	}
	
	@Override
	public String getText() {
		return GuiGlobalConfig.GUI_DIAGRAM_COLLECTION_IDENTIFIER;
	}
	
}
