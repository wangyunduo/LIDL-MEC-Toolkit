/**
 */
package org.eclipse.sirius.LIDLGUI;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date And Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.DateAndTime#getDateAndTime <em>Date And Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDateAndTime()
 * @model
 * @generated
 */
public interface DateAndTime extends Sensor {
	/**
	 * Returns the value of the '<em><b>Date And Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date And Time</em>' attribute.
	 * @see #setDateAndTime(XMLGregorianCalendar)
	 * @see org.eclipse.sirius.LIDLGUI.LIDLGUIPackage#getDateAndTime_DateAndTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 * @generated
	 */
	XMLGregorianCalendar getDateAndTime();

	/**
	 * Sets the value of the '{@link org.eclipse.sirius.LIDLGUI.DateAndTime#getDateAndTime <em>Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date And Time</em>' attribute.
	 * @see #getDateAndTime()
	 * @generated
	 */
	void setDateAndTime(XMLGregorianCalendar value);

} // DateAndTime
