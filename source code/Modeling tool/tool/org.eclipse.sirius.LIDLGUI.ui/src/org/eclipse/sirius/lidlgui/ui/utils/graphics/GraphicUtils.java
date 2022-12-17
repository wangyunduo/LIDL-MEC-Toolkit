package org.eclipse.sirius.lidlgui.ui.utils.graphics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.IdentityAnchor;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.AbstractDNode;
import org.eclipse.sirius.diagram.ContainerStyle;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.EdgeStyle;
import org.eclipse.sirius.diagram.NodeStyle;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DEdgeSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeContainerSpec;
import org.eclipse.sirius.diagram.business.internal.metamodel.spec.DNodeSpec;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

//import archi.Architect;

public class GraphicUtils {

	public static DDiagramElement getDDiagramElementFromSemantic(EObject semantic) {
        List<EObject> dSemanticReferences = new ArrayList<>(new EObjectQuery(semantic).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET));
        return (DDiagramElement) dSemanticReferences.stream().filter(r -> r instanceof DDiagramElement).findAny().get();
    }
	
	public static Node getGmfNodeFromDDiagramElement(DDiagramElement element) {
		return SiriusGMFHelper.getGmfNode(element);
	}
	
	public static Edge getGmfEdgeFromDDiagramElement(DDiagramElement element) {
	    return SiriusGMFHelper.getGmfEdge(element);
	}

	public static Node getGmfNodeFromSemantic(EObject semantic) {
	    DDiagramElement element = getDDiagramElementFromSemantic(semantic);
	    return getGmfNodeFromDDiagramElement(element);
	}

	public static Edge getGmfEdgeFromSemantic(EObject semantic) {
	    DDiagramElement element = getDDiagramElementFromSemantic(semantic);
	    return getGmfEdgeFromDDiagramElement(element);
	}

//	public static List<Node> getAllGmfNodesFromSemantic(EObject semantic) {
//	    List<Node> nodes = new ArrayList<>();
//	    DDiagramElement element = getDDiagramElementFromSemantic(semantic);
//	    getSubNodesFromDDiagramElement(element, nodes);
//	    sortGmfNodeAccordingToSemantic(nodes);
//	    return nodes;
//	}

//	private static void sortGmfNodeAccordingToSemantic(List<Node> nodes) {
//	    nodes.sort((n1, n2) -> {
//	        Architect d1 = (Architect) resolveEObjectFromGmfNode(n1);
//	        Architect d2 = (Architect) resolveEObjectFromGmfNode(n2);
//	        List<String> l1 = getIdentifyListFromDevice(d1);
//	        List<String> l2 = getIdentifyListFromDevice(d2);
//	        return compareIdentifyList(l1, l2);
//	    });
//	}

	private static int compareIdentifyList(List<String> l1, List<String> l2) {
	    if (l1.size() != l2.size()) {
	    	return l2.size() - l1.size();
	    } else {
	    	for (int i = 0; i < l1.size(); i++) {
	    		if (l1.get(i).compareTo(l2.get(i)) > 0) {
	    			return -1;
	            } else if (l1.get(i).compareTo(l2.get(i)) < 0) {
	                return 1;
	            }
	        }
	    }
	    return 0;
	}

//	private static List<String> getIdentifyListFromDevice(Architect architect) {
//	    List<String> list = new ArrayList<>();
//	    EObject container = architect;
//	    while (true) {
//	        if (container instanceof Architect) {
//	            list.add(container.getClass().getSimpleName() + ((Architect) container).getIndex());
//	            container = container.eContainer();
//	            } else {
//	            	break;
//	            	}
//	        }
//	    return list;
//	}

//	public static List<Edge> getAllGmfEdgesFromSemantic(EObject semantic) {
//		List<Node> nodes = getAllGmfNodesFromSemantic(semantic);
//		return getAllGmfEdgesFromGmfNodes(nodes);
//	}
	    
	private static void getSubNodesFromDDiagramElement(DDiagramElement element, List<Node> nodes) {
		nodes.add(getGmfNodeFromDDiagramElement(element));
		if (element instanceof DNodeContainerSpec) {
			List<DDiagramElement> elements = ((DNodeContainerSpec) element).getElements();
			((DNodeContainerSpec) element).getContainers()
	                    .stream()
	                    .filter(elements::contains)
	                    .forEach(subContainer -> getSubNodesFromDDiagramElement(subContainer, nodes));
			((DNodeContainerSpec) element).getNodes()
	                    .stream()
	                    .filter(elements::contains)
	                    .forEach(subNode -> getSubNodesFromDDiagramElement(subNode, nodes));
			} else if (element instanceof DNodeSpec) {
				((DNodeSpec) element).getOwnedBorderedNodes()
				.forEach(subNode -> getSubNodesFromDDiagramElement(subNode, nodes));
				}
	}

	public static EObject resolveEObjectFromGmfNode(Node node) {
		return ((AbstractDNode) node.getElement()).getTarget();
	}

	public static EObject resolveEObjectFromGmfEdge(Edge edge) {
		return ((DEdgeSpec) edge.getElement()).getTarget();
	}

	public static GMFNodeGraphicSpec resolveGraphicSpecFromGmfNode(Node node) {
		GMFNodeGraphicSpec spec = new GMFNodeGraphicSpec();

		spec.setBounds((Bounds) node.getLayoutConstraint());
		EObject nodeElement = node.getElement();
		if (nodeElement instanceof DNodeSpec) {
			spec.setStyle(((DNodeSpec) nodeElement).getOwnedStyle());
		} else if (nodeElement instanceof DNodeContainerSpec) {
			spec.setStyle(((DNodeContainerSpec) nodeElement).getOwnedStyle());
	    }
		spec.setLabelLocation((Location) SiriusGMFHelper.getLabelNode(node).getLayoutConstraint());

		return spec;
	}
	
	private static void applyGraphicSpecToLabelNode(View gmfView, AbstractGMFGraphicSpec spec) {
        if (spec.getLabelLocation() != null) {
            Node labelNode = SiriusGMFHelper.getLabelNode(gmfView);
            labelNode.setLayoutConstraint(spec.getLabelLocation());
            // Workaround to make label node's location refresh immediately
            labelNode.setVisible(false);
            labelNode.setVisible(true);
            disableAutoRearrangeGmfView(labelNode);
        }
    }
	
	public static void applyGraphicSpecToGmfNode(Node node, GMFNodeGraphicSpec spec) {
        if (spec.getBounds() != null) {
            node.setLayoutConstraint(spec.getBounds());
        }

        if (spec.getStyle() != null) {
            EObject nodeElement = node.getElement();
            if (nodeElement instanceof DNodeSpec) {
                ((DNodeSpec) nodeElement).setOwnedStyle((NodeStyle) spec.getStyle());
            } else if (nodeElement instanceof DNodeContainerSpec) {
                ((DNodeContainerSpec) nodeElement).setOwnedStyle((ContainerStyle) spec.getStyle());
            }
        }
        applyGraphicSpecToLabelNode(node, spec);
        disableAutoRearrangeGmfView(node);
    }

    public static void disableAutoRearrangeGmfView(View view) {
        Set<View> viewsToLayout = SiriusLayoutDataManager.INSTANCE.getCreatedViewsToLayout().get(view.getDiagram());
        if (viewsToLayout != null) {
            viewsToLayout.remove(view);
        }
        Set<View> viewWithCenterLayout = SiriusLayoutDataManager.INSTANCE.getCreatedViewWithCenterLayout().get(view.getDiagram());
        if (viewWithCenterLayout != null) {
            viewWithCenterLayout.remove(view);
        }
    }

    private static int getEdgeId(Edge edge, List<Node> nodes) {
        int index1 = nodes.indexOf(edge.getSource());
        int index2 = nodes.indexOf(edge.getTarget());
        return Math.max(index1, index2) * nodes.size() + Math.min(index1, index2);
    }

    public static List<Edge> getAllGmfEdgesFromGmfNodes(List<Node> nodes) {
        Map<Integer, Edge> edgeMap = new HashMap<>();
        nodes.forEach(node -> {
            node.getSourceEdges().forEach(edge -> edgeMap.put(getEdgeId((Edge) edge, nodes), (Edge) edge));
            node.getTargetEdges().forEach(edge -> edgeMap.put(getEdgeId((Edge) edge, nodes), (Edge) edge));
        });
        return new ArrayList<>(edgeMap.values());
    }

    public static GMFEdgeGraphicSpec resolveGraphicSpecFromGmfEdge(Edge edge) {
        GMFEdgeGraphicSpec spec = new GMFEdgeGraphicSpec();

        spec.setBendpoints((RelativeBendpoints) edge.getBendpoints());
        spec.setSourceAnchor((IdentityAnchor) edge.getSourceAnchor());
        spec.setTargetAnchor((IdentityAnchor) edge.getTargetAnchor());
        spec.setStyle(((DEdgeSpec) edge.getElement()).getStyle());
        spec.setLabelLocation((Bounds) SiriusGMFHelper.getLabelNode(edge).getLayoutConstraint());

        return spec;
    }

    public static void applyGraphicSpecToGmfEdge(Edge edge, GMFEdgeGraphicSpec spec) {
        if (spec.getBendpoints() != null) {
            edge.setBendpoints(spec.getBendpoints());
        }
        if (spec.getSourceAnchor() != null) {
            edge.setSourceAnchor(spec.getSourceAnchor());
        }
        if (spec.getTargetAnchor() != null) {
            edge.setTargetAnchor(spec.getTargetAnchor());
        }
        if (spec.getStyle() != null) {
            ((DEdgeSpec) edge.getElement()).setOwnedStyle((EdgeStyle) spec.getStyle());
        }
        applyGraphicSpecToLabelNode(edge, spec);
        disableAutoRearrangeGmfView(edge);
    }
	
}
