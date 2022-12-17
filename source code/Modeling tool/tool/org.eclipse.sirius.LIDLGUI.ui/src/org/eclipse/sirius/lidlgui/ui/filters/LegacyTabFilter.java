package org.eclipse.sirius.lidlgui.ui.filters;

import static java.util.Arrays.asList;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.eef.properties.ui.api.IEEFTabDescriptor;
import org.eclipse.eef.properties.ui.api.IEEFTabDescriptorFilter;

public class LegacyTabFilter implements IEEFTabDescriptorFilter {

	private static final Set<String> TABS_TO_FILTER_OUT = new HashSet<>(asList(
			"sirius_default_rules_defaultpagesirius_default_rules_defaultgroup",
			"org.eclipse.sirius.table.ui.tab.semantic", "org.eclipse.sirius.table.ui.tab.style",
			"org.eclipse.sirius.table.ui.tab.behaviors", "org.eclipse.sirius.table.ui.tab.documentation",
			"property.tab.semantic", "property.tab.documentation", "property.tab.style", "property.tab.behaviors",
			"property.tab.DiagramPropertySection", "property.tab.AppearancePropertySection"));

	@Override
	public boolean filter(IEEFTabDescriptor tabDescriptor) {
		return !tabMustBeFilteredOut(tabDescriptor);
	}

	private static boolean tabMustBeFilteredOut(IEEFTabDescriptor tabDescriptor) {
		// 'startsWith' because the ID of the 'Main' group is dynamic and has a suffix
		// at runtime
		return TABS_TO_FILTER_OUT.stream().anyMatch(id -> tabDescriptor.getId().startsWith(id));
	}

}