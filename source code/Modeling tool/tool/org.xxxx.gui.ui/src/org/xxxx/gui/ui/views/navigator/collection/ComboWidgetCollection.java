package org.xxxx.gui.ui.views.navigator.collection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.LIDLGUI.ComboWidget;
import org.eclipse.sirius.LIDLGUI.ComboWidgetFactory;
import org.eclipse.sirius.LIDLGUI.GUI;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.config.LidlTableGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;
import org.xxxx.gui.ui.views.navigator.nodes.ComboWidgetNode;
import org.xxxx.gui.ui.views.navigator.nodes.GuiNode;

public class ComboWidgetCollection extends NavigatorCollection {
	
	public List<ComboWidgetNode> getGuiNode() {
		List<ComboWidgetNode> combowidgetNodes = new ArrayList<ComboWidgetNode>();
		Session session = GuiUtils.getSession();
		if (session == null) {
			return combowidgetNodes;
		}
		ComboWidgetFactory factory = GuiUtils.getFactory();
		for (ComboWidget combowidget: factory.getMyComboWidget()) {
			combowidgetNodes.add(new ComboWidgetNode(combowidget.getName(), (int)combowidget.getIndex()));
		}
		return combowidgetNodes;
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
		return GuiGlobalConfig.COMBOWIDGET_COLLECTION_IDENTIFIER;
	}
	
}
