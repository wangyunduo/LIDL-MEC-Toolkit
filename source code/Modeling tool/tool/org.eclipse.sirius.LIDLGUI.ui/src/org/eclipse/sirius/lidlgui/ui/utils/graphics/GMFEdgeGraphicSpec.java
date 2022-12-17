package org.eclipse.sirius.lidlgui.ui.utils.graphics;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.IdentityAnchor;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;

public class GMFEdgeGraphicSpec extends AbstractGMFGraphicSpec {

	 private RelativeBendpoints bendpoints;
	 private IdentityAnchor sourceAnchor;
	 private IdentityAnchor targetAnchor;
	    
	 public GMFEdgeGraphicSpec() {
	        super();
	    }

	    public RelativeBendpoints getBendpoints() {
	        return bendpoints;
	    }

	    public void setBendpoints(RelativeBendpoints originalBendpoints) {
	        bendpoints = EcoreUtil.copy(originalBendpoints);
	    }

	    public IdentityAnchor getSourceAnchor() {
	        return sourceAnchor;
	    }

	    public void setSourceAnchor(IdentityAnchor originalSourceAnchor) {
	        sourceAnchor = EcoreUtil.copy(originalSourceAnchor);
	    }

	    public IdentityAnchor getTargetAnchor() {
	        return targetAnchor;
	    }

	    public void setTargetAnchor(IdentityAnchor originalTargetAnchor) {
	        targetAnchor = EcoreUtil.copy(originalTargetAnchor);
	    }
}
