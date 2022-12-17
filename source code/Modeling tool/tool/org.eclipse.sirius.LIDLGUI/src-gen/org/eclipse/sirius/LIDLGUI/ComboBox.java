/**
 */
package org.eclipse.sirius.LIDLGUI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboBox#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboBox#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.ComboBox#getLabelString <em>Label String</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboBox()
 * @model
 * @generated
 */
public interface ComboBox extends Button {
	/**
	 * Returns the value of the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size X</em>' attribute.
	 * @see #setSizeX(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboBox_SizeX()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getSizeX();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.ComboBox#getSizeX <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size X</em>' attribute.
	 * @see #getSizeX()
	 * @generated
	 */
	void setSizeX(double value);

	/**
	 * Returns the value of the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Y</em>' attribute.
	 * @see #setSizeY(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboBox_SizeY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getSizeY();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.ComboBox#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Y</em>' attribute.
	 * @see #getSizeY()
	 * @generated
	 */
	void setSizeY(double value);

	/**
	 * Returns the value of the '<em><b>Label String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label String</em>' attribute.
	 * @see #setLabelString(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getComboBox_LabelString()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLabelString();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.ComboBox#getLabelString <em>Label String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label String</em>' attribute.
	 * @see #getLabelString()
	 * @generated
	 */
	void setLabelString(String value);

} // ComboBox
