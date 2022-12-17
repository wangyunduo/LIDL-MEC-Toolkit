/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Widget#getImplement_interaction <em>Implement interaction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getWidget()
 * @model
 * @generated
 */
public interface Widget extends EObject {
	/**
	 * Returns the value of the '<em><b>Implement interaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implement interaction</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getWidget_Implement_interaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getImplement_interaction();

} // Widget
