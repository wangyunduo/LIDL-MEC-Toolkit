/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;
import org.eclipse.sirius.LIDLGUI.ScrollList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scroll List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ScrollListImpl#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ScrollListImpl#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ScrollListImpl#getInnerX <em>Inner X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ScrollListImpl#getInnerY <em>Inner Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScrollListImpl extends ContainerImpl implements ScrollList {
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
	 * The default value of the '{@link #getInnerX() <em>Inner X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerX()
	 * @generated
	 * @ordered
	 */
	protected static final double INNER_X_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInnerX() <em>Inner X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerX()
	 * @generated
	 * @ordered
	 */
	protected double innerX = INNER_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getInnerY() <em>Inner Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerY()
	 * @generated
	 * @ordered
	 */
	protected static final double INNER_Y_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInnerY() <em>Inner Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerY()
	 * @generated
	 * @ordered
	 */
	protected double innerY = INNER_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScrollListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.SCROLL_LIST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.SCROLL_LIST__SIZE_X, oldSizeX, sizeX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.SCROLL_LIST__SIZE_Y, oldSizeY, sizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInnerX() {
		return innerX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerX(double newInnerX) {
		double oldInnerX = innerX;
		innerX = newInnerX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.SCROLL_LIST__INNER_X, oldInnerX,
					innerX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInnerY() {
		return innerY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInnerY(double newInnerY) {
		double oldInnerY = innerY;
		innerY = newInnerY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.SCROLL_LIST__INNER_Y, oldInnerY,
					innerY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LIDLGUIPackage.SCROLL_LIST__SIZE_X:
			return getSizeX();
		case LIDLGUIPackage.SCROLL_LIST__SIZE_Y:
			return getSizeY();
		case LIDLGUIPackage.SCROLL_LIST__INNER_X:
			return getInnerX();
		case LIDLGUIPackage.SCROLL_LIST__INNER_Y:
			return getInnerY();
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
		case LIDLGUIPackage.SCROLL_LIST__SIZE_X:
			setSizeX((Double) newValue);
			return;
		case LIDLGUIPackage.SCROLL_LIST__SIZE_Y:
			setSizeY((Double) newValue);
			return;
		case LIDLGUIPackage.SCROLL_LIST__INNER_X:
			setInnerX((Double) newValue);
			return;
		case LIDLGUIPackage.SCROLL_LIST__INNER_Y:
			setInnerY((Double) newValue);
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
		case LIDLGUIPackage.SCROLL_LIST__SIZE_X:
			setSizeX(SIZE_X_EDEFAULT);
			return;
		case LIDLGUIPackage.SCROLL_LIST__SIZE_Y:
			setSizeY(SIZE_Y_EDEFAULT);
			return;
		case LIDLGUIPackage.SCROLL_LIST__INNER_X:
			setInnerX(INNER_X_EDEFAULT);
			return;
		case LIDLGUIPackage.SCROLL_LIST__INNER_Y:
			setInnerY(INNER_Y_EDEFAULT);
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
		case LIDLGUIPackage.SCROLL_LIST__SIZE_X:
			return sizeX != SIZE_X_EDEFAULT;
		case LIDLGUIPackage.SCROLL_LIST__SIZE_Y:
			return sizeY != SIZE_Y_EDEFAULT;
		case LIDLGUIPackage.SCROLL_LIST__INNER_X:
			return innerX != INNER_X_EDEFAULT;
		case LIDLGUIPackage.SCROLL_LIST__INNER_Y:
			return innerY != INNER_Y_EDEFAULT;
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
		result.append(", InnerX: ");
		result.append(innerX);
		result.append(", InnerY: ");
		result.append(innerY);
		result.append(')');
		return result.toString();
	}

} //ScrollListImpl
