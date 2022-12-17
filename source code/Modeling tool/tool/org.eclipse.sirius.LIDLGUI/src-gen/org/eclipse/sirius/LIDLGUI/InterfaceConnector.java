/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterfaceConnector()
 * @model
 * @generated
 */
public interface InterfaceConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.LIDLGUI.Interface#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Interface)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterfaceConnector_Source()
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	Interface getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Interface value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.LIDLGUI.Interface#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Interface)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterfaceConnector_Target()
	 * @see org.eclipse.sirius.LIDLGUI.Interface#getTo
	 * @model opposite="to"
	 * @generated
	 */
	Interface getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Interface value);

} // InterfaceConnector
