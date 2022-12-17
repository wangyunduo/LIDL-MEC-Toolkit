/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.DatatypeTable#getDatatypes <em>Datatypes</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.DatatypeTable#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.DatatypeTable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatypeTable()
 * @model
 * @generated
 */
public interface DatatypeTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatypes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.Datatype}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatypes</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatypeTable_Datatypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Datatype> getDatatypes();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatypeTable_Index()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.DatatypeTable#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(double value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDatatypeTable_Name()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.DatatypeTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DatatypeTable
