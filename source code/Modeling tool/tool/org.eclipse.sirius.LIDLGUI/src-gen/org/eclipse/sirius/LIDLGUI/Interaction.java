/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getSignature_interfaces <em>Signature interfaces</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getCandidates_interactions <em>Candidates interactions</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getInterfaceConnectors <em>Interface Connectors</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interaction#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Signature interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature interfaces</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_Signature_interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getSignature_interfaces();

	/**
	 * Returns the value of the '<em><b>Candidates interactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidates interactions</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_Candidates_interactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getCandidates_interactions();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_Label()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interaction#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_Name()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interaction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_Signature()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interaction#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference.
	 * @see #setInterface(Interface)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_Interface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Interface getInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interaction#getInterface <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' containment reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(Interface value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_Expression()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interaction#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Interface Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.InterfaceConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Connectors</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_InterfaceConnectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceConnector> getInterfaceConnectors();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInteraction_Index()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interaction#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(double value);

} // Interaction
