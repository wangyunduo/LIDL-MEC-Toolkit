package org.xxxx.gui.ui.views.navigator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.PlatformObject;
import org.xxxx.gui.ui.views.navigator.collection.ComboWidgetCollection;
import org.xxxx.gui.ui.views.navigator.collection.GuiCollection;
import org.xxxx.gui.ui.views.navigator.collection.InteractionDiagramCollection;

public class GuiNavigatorRoot extends PlatformObject {
	
	private List<Object> collections;
	
	public GuiNavigatorRoot() {
		
		collections = new ArrayList<>();
		
		GuiCollection guiSet = new GuiCollection();
		ComboWidgetCollection comboWidgetSet = new ComboWidgetCollection();
		InteractionDiagramCollection interactionDiagramSet = new InteractionDiagramCollection();
		
		
		
	//	collections.add(guiSet);
		
	//	collections.add(comboWidgetSet);
		
		collections.add(interactionDiagramSet);
//		collections.add(datatypeTable);
		
	}
	
	public List<Object> getSubCollections() {
		return collections;
	}
}
