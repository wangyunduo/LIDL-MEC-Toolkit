/**
 */
package org.eclipse.sirius.LIDLGUI;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Radio Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.RadioBox#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.RadioBox#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.RadioBox#getLabelStringArray <em>Label String Array</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getRadioBox()
 * @model
 * @generated
 */
public interface RadioBox extends Button {
	/**
	 * Returns the value of the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size X</em>' attribute.
	 * @see #setSizeX(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getRadioBox_SizeX()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getSizeX();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.RadioBox#getSizeX <em>Size X</em>}' attribute.
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
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getRadioBox_SizeY()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getSizeY();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.RadioBox#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Y</em>' attribute.
	 * @see #getSizeY()
	 * @generated
	 */
	void setSizeY(double value);

	/**
	 * Returns the value of the '<em><b>Label String Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label String Array</em>' attribute.
	 * @see #setLabelStringArray(List)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getRadioBox_LabelStringArray()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ENTITIES" many="false"
	 * @generated
	 */
	List<String> getLabelStringArray();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.RadioBox#getLabelStringArray <em>Label String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label String Array</em>' attribute.
	 * @see #getLabelStringArray()
	 * @generated
	 */
	void setLabelStringArray(List<String> value);

} // RadioBox
