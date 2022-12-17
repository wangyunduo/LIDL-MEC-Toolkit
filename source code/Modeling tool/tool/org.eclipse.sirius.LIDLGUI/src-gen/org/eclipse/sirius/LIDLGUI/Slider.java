/**
 */
package org.eclipse.sirius.LIDLGUI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Slider#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Slider#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Slider#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Slider#getMinValue <em>Min Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getSlider()
 * @model
 * @generated
 */
public interface Slider extends Button {
	/**
	 * Returns the value of the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size X</em>' attribute.
	 * @see #setSizeX(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getSlider_SizeX()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getSizeX();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Slider#getSizeX <em>Size X</em>}' attribute.
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
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getSlider_SizeY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getSizeY();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Slider#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Y</em>' attribute.
	 * @see #getSizeY()
	 * @generated
	 */
	void setSizeY(double value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getSlider_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Slider#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' attribute.
	 * @see #setMinValue(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getSlider_MinValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Double"
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Slider#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

} // Slider
