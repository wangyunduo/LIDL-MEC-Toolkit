package org.xxxx.gui.ui.views.navigator.collection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.sirius.LIDLGUI.ComboWidgetFactory;
import org.eclipse.sirius.LIDLGUI.GUI;
import org.eclipse.sirius.LIDLGUI.Interaction;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.lidlgui.ui.config.GuiGlobalConfig;
import org.eclipse.sirius.lidlgui.ui.utils.GuiUtils;
import org.xxxx.gui.ui.views.navigator.nodes.GuiNode;
import org.xxxx.gui.ui.views.navigator.nodes.InteractionDiagramNode;

public class InteractionDiagramCollection extends NavigatorCollection {
	
	public List<InteractionDiagramNode> getGuiNode() {
		List<InteractionDiagramNode> interactiontNodes = new ArrayList<InteractionDiagramNode>();
		Session session = GuiUtils.getSession();
		if (session == null) {
			return interactiontNodes;
		}
		ComboWidgetFactory factory = GuiUtils.getFactory();
		
		for (Interaction interaction : factory.getInteraction_diagram()) {
			interactiontNodes.add(new InteractionDiagramNode(interaction.getName(), (int)interaction.getIndex()));
		}
		
		return interactiontNodes;
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
		return GuiGlobalConfig.INTERACTION_DIAGRAM_IDENTIFIER;
	}
	
}
