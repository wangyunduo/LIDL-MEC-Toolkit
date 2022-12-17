/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Datatype#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Datatype#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Datatype#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Datatype#getCandidate_datatypes <em>Candidate datatypes</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatype()
 * @model
 * @generated
 */
public interface Datatype extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatype_Name()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Datatype#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatype_Label()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Datatype#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.sirius.LIDLGUI.MetaDatatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' attribute.
	 * @see org.eclipse.sirius.LIDLGUI.MetaDatatype
	 * @see #setDatatype(MetaDatatype)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatype_Datatype()
	 * @model
	 * @generated
	 */
	MetaDatatype getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Datatype#getDatatype <em>Datatype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' attribute.
	 * @see org.eclipse.sirius.LIDLGUI.MetaDatatype
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(MetaDatatype value);

	/**
	 * Returns the value of the '<em><b>Candidate datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.Datatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Candidate datatypes</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatype_Candidate_datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datatype> getCandidate_datatypes();

} // Datatype
