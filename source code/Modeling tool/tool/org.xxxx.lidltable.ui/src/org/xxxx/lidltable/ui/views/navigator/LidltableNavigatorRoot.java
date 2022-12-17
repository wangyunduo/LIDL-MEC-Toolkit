package org.xxxx.lidltable.ui.views.navigator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.PlatformObject;
import org.xxxx.lidltable.ui.views.navigator.collection.DatatypetableCollection;
import org.xxxx.lidltable.ui.views.navigator.collection.InteractiontableCollection;
import org.xxxx.lidltable.ui.views.navigator.collection.InterfacetableCollection;

public class LidltableNavigatorRoot extends PlatformObject {
	
	private List<Object> collections;
	
	public LidltableNavigatorRoot() {
		
		collections = new ArrayList<>();
		
		// Create three collections for three types definition tables
		DatatypetableCollection datatypeTable = new DatatypetableCollection();
		InterfacetableCollection interfaceTable = new InterfacetableCollection();
		InteractiontableCollection interactionTable = new InteractiontableCollection();
		
		// Add three definition tables' collections to the navigator
		collections.add(interactionTable);
		collections.add(datatypeTable);
		collections.add(interfaceTable);

	}
	
	public List<Object> getSubCollections() {
		return collections;
	}
}
