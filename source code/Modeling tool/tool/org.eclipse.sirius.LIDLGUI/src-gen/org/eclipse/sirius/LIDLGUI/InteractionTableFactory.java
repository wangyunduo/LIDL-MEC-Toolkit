/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Table Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.InteractionTableFactory#getInteractiontables <em>Interactiontables</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteractionTableFactory()
 * @model
 * @generated
 */
public interface InteractionTableFactory extends EObject {
	/**
	 * Returns the value of the '<em><b>Interactiontables</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.InteractionTable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interactiontables</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteractionTableFactory_Interactiontables()
	 * @model containment="true"
	 * @generated
	 */
	EList<InteractionTable> getInteractiontables();

} // InteractionTableFactory
