/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.LIDLGUI.Knob;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knob</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.KnobImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.KnobImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.KnobImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.KnobImpl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnobImpl extends ButtonImpl implements Knob {
	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final double RADIUS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected double radius = RADIUS_EDEFAULT;

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
	 * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMin()
	 * @generated
	 * @ordered
	 */
	protected double min = MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax()
	 * @generated
	 * @ordered
	 */
	protected double max = MAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KnobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.KNOB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		double oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.KNOB__RADIUS, oldRadius, radius));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.KNOB__LEGEND, oldLegend, legend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMin() {
		return min;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMin(double newMin) {
		double oldMin = min;
		min = newMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.KNOB__MIN, oldMin, min));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMax() {
		return max;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMax(double newMax) {
		double oldMax = max;
		max = newMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.KNOB__MAX, oldMax, max));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LIDLGUIPackage.KNOB__RADIUS:
			return getRadius();
		case LIDLGUIPackage.KNOB__LEGEND:
			return getLegend();
		case LIDLGUIPackage.KNOB__MIN:
			return getMin();
		case LIDLGUIPackage.KNOB__MAX:
			return getMax();
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
		case LIDLGUIPackage.KNOB__RADIUS:
			setRadius((Double) newValue);
			return;
		case LIDLGUIPackage.KNOB__LEGEND:
			setLegend((String) newValue);
			return;
		case LIDLGUIPackage.KNOB__MIN:
			setMin((Double) newValue);
			return;
		case LIDLGUIPackage.KNOB__MAX:
			setMax((Double) newValue);
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
		case LIDLGUIPackage.KNOB__RADIUS:
			setRadius(RADIUS_EDEFAULT);
			return;
		case LIDLGUIPackage.KNOB__LEGEND:
			setLegend(LEGEND_EDEFAULT);
			return;
		case LIDLGUIPackage.KNOB__MIN:
			setMin(MIN_EDEFAULT);
			return;
		case LIDLGUIPackage.KNOB__MAX:
			setMax(MAX_EDEFAULT);
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
		case LIDLGUIPackage.KNOB__RADIUS:
			return radius != RADIUS_EDEFAULT;
		case LIDLGUIPackage.KNOB__LEGEND:
			return LEGEND_EDEFAULT == null ? legend != null : !LEGEND_EDEFAULT.equals(legend);
		case LIDLGUIPackage.KNOB__MIN:
			return min != MIN_EDEFAULT;
		case LIDLGUIPackage.KNOB__MAX:
			return max != MAX_EDEFAULT;
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
		result.append(" (Radius: ");
		result.append(radius);
		result.append(", Legend: ");
		result.append(legend);
		result.append(", Min: ");
		result.append(min);
		result.append(", Max: ");
		result.append(max);
		result.append(')');
		return result.toString();
	}

} //KnobImpl
