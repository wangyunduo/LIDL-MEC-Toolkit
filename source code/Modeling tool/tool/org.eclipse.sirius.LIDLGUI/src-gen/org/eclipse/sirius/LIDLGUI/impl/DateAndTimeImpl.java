/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.LIDLGUI.DateAndTime;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date And Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.DateAndTimeImpl#getDateAndTime <em>Date And Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DateAndTimeImpl extends SensorImpl implements DateAndTime {
	/**
	 * The default value of the '{@link #getDateAndTime() <em>Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAndTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_AND_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateAndTime() <em>Date And Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateAndTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateAndTime = DATE_AND_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateAndTimeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.DATE_AND_TIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateAndTime() {
		return dateAndTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateAndTime(XMLGregorianCalendar newDateAndTime) {
		XMLGregorianCalendar oldDateAndTime = dateAndTime;
		dateAndTime = newDateAndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.DATE_AND_TIME__DATE_AND_TIME,
					oldDateAndTime, dateAndTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LIDLGUIPackage.DATE_AND_TIME__DATE_AND_TIME:
			return getDateAndTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LIDLGUIPackage.DATE_AND_TIME__DATE_AND_TIME:
			setDateAndTime((XMLGregorianCalendar) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LIDLGUIPackage.DATE_AND_TIME__DATE_AND_TIME:
			setDateAndTime(DATE_AND_TIME_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LIDLGUIPackage.DATE_AND_TIME__DATE_AND_TIME:
			return DATE_AND_TIME_EDEFAULT == null ? dateAndTime != null : !DATE_AND_TIME_EDEFAULT.equals(dateAndTime);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dateAndTime: ");
		result.append(dateAndTime);
		result.append(')');
		return result.toString();
	}

} //DateAndTimeImpl
