/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.LIDLGUI.LED;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LED</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.LEDImpl#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.LEDImpl#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.LEDImpl#getLEDOn <em>LED On</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.LEDImpl#getLegend <em>Legend</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LEDImpl extends IndicatorImpl implements LED {
	/**
	 * The default value of the '{@link #getSizeX() <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeX()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSizeX() <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeX()
	 * @generated
	 * @ordered
	 */
	protected double sizeX = SIZE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getSizeY() <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeY()
	 * @generated
	 * @ordered
	 */
	protected static final double SIZE_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSizeY() <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeY()
	 * @generated
	 * @ordered
	 */
	protected double sizeY = SIZE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getLEDOn() <em>LED On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEDOn()
	 * @generated
	 * @ordered
	 */
	protected static final Object LED_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLEDOn() <em>LED On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLEDOn()
	 * @generated
	 * @ordered
	 */
	protected Object ledOn = LED_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLegend() <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected static final String LEGEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLegend() <em>Legend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegend()
	 * @generated
	 * @ordered
	 */
	protected String legend = LEGEND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.LED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSizeX() {
		return sizeX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeX(double newSizeX) {
		double oldSizeX = sizeX;
		sizeX = newSizeX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.LED__SIZE_X, oldSizeX, sizeX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSizeY() {
		return sizeY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeY(double newSizeY) {
		double oldSizeY = sizeY;
		sizeY = newSizeY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.LED__SIZE_Y, oldSizeY, sizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLEDOn() {
		return ledOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLEDOn(Object newLEDOn) {
		Object oldLEDOn = ledOn;
		ledOn = newLEDOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.LED__LED_ON, oldLEDOn, ledOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLegend() {
		return legend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegend(String newLegend) {
		String oldLegend = legend;
		legend = newLegend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.LED__LEGEND, oldLegend, legend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LIDLGUIPackage.LED__SIZE_X:
			return getSizeX();
		case LIDLGUIPackage.LED__SIZE_Y:
			return getSizeY();
		case LIDLGUIPackage.LED__LED_ON:
			return getLEDOn();
		case LIDLGUIPackage.LED__LEGEND:
			return getLegend();
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
		case LIDLGUIPackage.LED__SIZE_X:
			setSizeX((Double) newValue);
			return;
		case LIDLGUIPackage.LED__SIZE_Y:
			setSizeY((Double) newValue);
			return;
		case LIDLGUIPackage.LED__LED_ON:
			setLEDOn((Object) newValue);
			return;
		case LIDLGUIPackage.LED__LEGEND:
			setLegend((String) newValue);
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
		case LIDLGUIPackage.LED__SIZE_X:
			setSizeX(SIZE_X_EDEFAULT);
			return;
		case LIDLGUIPackage.LED__SIZE_Y:
			setSizeY(SIZE_Y_EDEFAULT);
			return;
		case LIDLGUIPackage.LED__LED_ON:
			setLEDOn(LED_ON_EDEFAULT);
			return;
		case LIDLGUIPackage.LED__LEGEND:
			setLegend(LEGEND_EDEFAULT);
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
		case LIDLGUIPackage.LED__SIZE_X:
			return sizeX != SIZE_X_EDEFAULT;
		case LIDLGUIPackage.LED__SIZE_Y:
			return sizeY != SIZE_Y_EDEFAULT;
		case LIDLGUIPackage.LED__LED_ON:
			return LED_ON_EDEFAULT == null ? ledOn != null : !LED_ON_EDEFAULT.equals(ledOn);
		case LIDLGUIPackage.LED__LEGEND:
			return LEGEND_EDEFAULT == null ? legend != null : !LEGEND_EDEFAULT.equals(legend);
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
		result.append(" (SizeX: ");
		result.append(sizeX);
		result.append(", SizeY: ");
		result.append(sizeY);
		result.append(", LEDOn: ");
		result.append(ledOn);
		result.append(", Legend: ");
		result.append(legend);
		result.append(')');
		return result.toString();
	}

} //LEDImpl
