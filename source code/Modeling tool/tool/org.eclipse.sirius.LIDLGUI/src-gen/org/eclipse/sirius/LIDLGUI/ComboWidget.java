/**
 */
package org.eclipse.sirius.LIDLGUI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Widget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getBasicwidget <em>Basicwidget</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getCombowidget <em>Combowidget</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getInteractionURL <em>Interaction URL</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidget()
 * @model
 * @generated
 */
public interface ComboWidget extends Widget {
	/**
	 * Returns the value of the '<em><b>Basicwidget</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.BasicWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basicwidget</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidget_Basicwidget()
	 * @model containment="true"
	 * @generated
	 */
	EList<BasicWidget> getBasicwidget();

	/**
	 * Returns the value of the '<em><b>Combowidget</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sirius.LIDLGUI.ComboWidget}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combowidget</em>' containment reference list.
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidget_Combowidget()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComboWidget> getCombowidget();

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidget_Index()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getIndex();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getIndex <em>Index</em>}' attribute.
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
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidget_Name()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Interaction URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction URL</em>' attribute.
	 * @see #setInteractionURL(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboWidget_InteractionURL()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getInteractionURL();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.ComboWidget#getInteractionURL <em>Interaction URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction URL</em>' attribute.
	 * @see #getInteractionURL()
	 * @generated
	 */
	void setInteractionURL(String value);

} // ComboWidget
