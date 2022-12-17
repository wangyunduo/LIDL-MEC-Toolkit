/**
 */
package org.eclipse.sirius.LIDLGUI;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotary Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getRotarySwitch()
 * @model
 * @generated
 */
public interface RotarySwitch extends Button {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getRotarySwitch_Radius()
	 * @model dataType="org.eclipse.sirius.LIDLGUI.Number"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Legend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legend</em>' attribute.
	 * @see #setLegend(String)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getRotarySwitch_Legend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getLegend();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getLegend <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legend</em>' attribute.
	 * @see #getLegend()
	 * @generated
	 */
	void setLegend(String value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute.
	 * @see #setLabels(List)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getRotarySwitch_Labels()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ENTITIES" many="false"
	 * @generated
	 */
	List<String> getLabels();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.RotarySwitch#getLabels <em>Labels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Labels</em>' attribute.
	 * @see #getLabels()
	 * @generated
	 */
	void setLabels(List<String> value);

} // RotarySwitch
