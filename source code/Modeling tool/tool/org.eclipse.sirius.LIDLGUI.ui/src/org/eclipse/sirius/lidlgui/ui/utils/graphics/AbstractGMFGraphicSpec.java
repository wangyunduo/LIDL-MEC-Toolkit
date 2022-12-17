package org.eclipse.sirius.lidlgui.ui.utils.graphics;

import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.sirius.diagram.ContainerStyle;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.NodeStyle;
import org.eclipse.sirius.viewpoint.Style;

public class AbstractGMFGraphicSpec {

	private Style style;
    private Location labelLocation;
    
    public Style getStyle() {
        return style;
    }
    
    public void setStyle(Style originalStyle) {
        style = EcoreUtil.copy(originalStyle);
        List<String> customFeatures = style.getCustomFeatures();
        customFeatures.clear();
        if (style instanceof NodeStyle) {
            customFeatures.add("labelColor");
            customFeatures.add("labelFormat");
            customFeatures.add("color");
            customFeatures.add("borderColor");
        } else if (style instanceof ContainerStyle) {
            customFeatures.add("labelColor");
            customFeatures.add("labelFormat");
            customFeatures.add("backgroundColor");
            customFeatures.add("foregroundColor");
            customFeatures.add("borderColor");
        } else if (style instanceof EdgeStyle) {
            customFeatures.add("strokeColor");
        }
    }
    
    public Location getLabelLocation() {
        return labelLocation;
    }

    public void setLabelLocation(Location originalLabelLocation) {
        labelLocation = EcoreUtil.copy(originalLabelLocation);
    }
    
}
