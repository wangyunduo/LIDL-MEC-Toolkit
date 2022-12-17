/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getCandidate_interfaces <em>Candidate interfaces</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Interface#getActualPar <em>Actual Par</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_Name()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.LIDLGUI.Scope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.sirius.LIDLGUI.Scope
	 * @see #setScope(Scope)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_Scope()
	 * @model
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interface#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.eclipse.sirius.LIDLGUI.Scope
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.LIDLGUI.MetaInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see org.eclipse.sirius.LIDLGUI.MetaInterface
	 * @see #setInterface(MetaInterface)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_Interface()
	 * @model
	 * @generated
	 */
	MetaInterface getInterface();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interface#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see org.eclipse.sirius.LIDLGUI.MetaInterface
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(MetaInterface value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_Label()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interface#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.LIDLGUI.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.sirius.LIDLGUI.Direction
	 * @see #setDirection(Direction)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interface#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see org.eclipse.sirius.LIDLGUI.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' containment reference.
	 * @see #setDatatype(Datatype)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_Datatype()
	 * @model containment="true"
	 * @generated
	 */
	Datatype getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interface#getDatatype <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' containment reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(Datatype value);

	/**
	 * Returns the value of the '<em><b>Candidate interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate interfaces</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_Candidate_interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getCandidate_interfaces();

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.InterfaceConnector}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_From()
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceConnector#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<InterfaceConnector> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.InterfaceConnector}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.sirius.LIDLGUI.InterfaceConnector#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_To()
	 * @see org.eclipse.sirius.LIDLGUI.InterfaceConnector#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<InterfaceConnector> getTo();

	/**
	 * Returns the value of the '<em><b>Actual Par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Par</em>' attribute.
	 * @see #setActualPar(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getInterface_ActualPar()
	 * @model
	 * @generated
	 */
	String getActualPar();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Interface#getActualPar <em>Actual Par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual Par</em>' attribute.
	 * @see #getActualPar()
	 * @generated
	 */
	void setActualPar(String value);

} // Interface
