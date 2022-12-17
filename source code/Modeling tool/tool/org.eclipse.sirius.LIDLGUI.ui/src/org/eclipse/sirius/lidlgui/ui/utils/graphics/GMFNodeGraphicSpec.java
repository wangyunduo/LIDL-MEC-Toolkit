package org.eclipse.sirius.lidlgui.ui.utils.graphics;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.Bounds;

public class GMFNodeGraphicSpec extends AbstractGMFGraphicSpec {

	private Bounds bounds;

    public GMFNodeGraphicSpec() {
        super();
    }

    public Bounds getBounds() {
        return this.bounds;
    }

    public void setBounds(Bounds originalBounds) {
        bounds = EcoreUtil.copy(originalBounds);
    }
    
}
