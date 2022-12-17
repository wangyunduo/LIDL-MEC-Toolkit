/**
 */
package org.eclipse.sirius.LIDLGUI;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Panel#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.Panel#getSizeY <em>Size Y</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getPanel()
 * @model
 * @generated
 */
public interface Panel extends Container {
	/**
	 * Returns the value of the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size X</em>' attribute.
	 * @see #setSizeX(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getPanel_SizeX()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getSizeX();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Panel#getSizeX <em>Size X</em>}' attribute.
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
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getPanel_SizeY()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getSizeY();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.Panel#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Y</em>' attribute.
	 * @see #getSizeY()
	 * @generated
	 */
	void setSizeY(double value);

} // Panel
