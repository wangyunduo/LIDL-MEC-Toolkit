/**
 */
package org.eclipse.sirius.LIDLGUI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Counter#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Counter#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Counter#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Counter#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getCounter()
 * @model
 * @generated
 */
public interface Counter extends Indicator {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getCounter_Radius()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Counter#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getCounter_Value()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Counter#getValue <em>Value</em>}' attribute.
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
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getCounter_MinValue()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getMinValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Counter#getMinValue <em>Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' attribute.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(double value);

	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' attribute.
	 * @see #setMaxValue(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getCounter_MaxValue()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getMaxValue();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Counter#getMaxValue <em>Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' attribute.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(double value);

} // Counter
