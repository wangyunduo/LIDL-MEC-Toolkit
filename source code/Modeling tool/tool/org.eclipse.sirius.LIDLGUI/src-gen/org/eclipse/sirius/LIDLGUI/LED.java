/**
 */
package org.eclipse.sirius.LIDLGUI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.LED#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.LED#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.LED#getLEDOn <em>LED On</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.LED#getLegend <em>Legend</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getLED()
 * @model
 * @generated
 */
public interface LED extends Indicator {
	/**
	 * Returns the value of the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size X</em>' attribute.
	 * @see #setSizeX(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getLED_SizeX()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getSizeX();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.LED#getSizeX <em>Size X</em>}' attribute.
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
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getLED_SizeY()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getSizeY();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.LED#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Y</em>' attribute.
	 * @see #getSizeY()
	 * @generated
	 */
	void setSizeY(double value);

	/**
	 * Returns the value of the '<em><b>LED On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LED On</em>' attribute.
	 * @see #setLEDOn(activationStat)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getLED_LEDOn()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Activation"
	 * @generated
	 */
	Object getLEDOn();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.LED#getLEDOn <em>LED On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LED On</em>' attribute.
	 * @see #getLEDOn()
	 * @generated
	 */
	void setLEDOn(Object value);

	/**
	 * Returns the value of the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend</em>' attribute.
	 * @see #setLegend(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getLED_Legend()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Text"
	 * @generated
	 */
	String getLegend();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.LED#getLegend <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' attribute.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(String value);

} // LED
