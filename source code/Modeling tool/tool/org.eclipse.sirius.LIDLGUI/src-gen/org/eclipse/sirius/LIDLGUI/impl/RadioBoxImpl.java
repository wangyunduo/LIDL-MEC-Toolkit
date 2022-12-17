/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;
import org.eclipse.sirius.LIDLGUI.RadioBox;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Radio Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.RadioBoxImpl#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.RadioBoxImpl#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.RadioBoxImpl#getLabelStringArray <em>Label String Array</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RadioBoxImpl extends ButtonImpl implements RadioBox {
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
	 * The default value of the '{@link #getLabelStringArray() <em>Label String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStringArray()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> LABEL_STRING_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelStringArray() <em>Label String Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelStringArray()
	 * @generated
	 * @ordered
	 */
	protected List<String> labelStringArray = LABEL_STRING_ARRAY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RadioBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.RADIO_BOX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.RADIO_BOX__SIZE_X, oldSizeX, sizeX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.RADIO_BOX__SIZE_Y, oldSizeY, sizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getLabelStringArray() {
		return labelStringArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelStringArray(List<String> newLabelStringArray) {
		List<String> oldLabelStringArray = labelStringArray;
		labelStringArray = newLabelStringArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.RADIO_BOX__LABEL_STRING_ARRAY,
					oldLabelStringArray, labelStringArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LIDLGUIPackage.RADIO_BOX__SIZE_X:
			return getSizeX();
		case LIDLGUIPackage.RADIO_BOX__SIZE_Y:
			return getSizeY();
		case LIDLGUIPackage.RADIO_BOX__LABEL_STRING_ARRAY:
			return getLabelStringArray();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LIDLGUIPackage.RADIO_BOX__SIZE_X:
			setSizeX((Double) newValue);
			return;
		case LIDLGUIPackage.RADIO_BOX__SIZE_Y:
			setSizeY((Double) newValue);
			return;
		case LIDLGUIPackage.RADIO_BOX__LABEL_STRING_ARRAY:
			setLabelStringArray((List<String>) newValue);
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
		case LIDLGUIPackage.RADIO_BOX__SIZE_X:
			setSizeX(SIZE_X_EDEFAULT);
			return;
		case LIDLGUIPackage.RADIO_BOX__SIZE_Y:
			setSizeY(SIZE_Y_EDEFAULT);
			return;
		case LIDLGUIPackage.RADIO_BOX__LABEL_STRING_ARRAY:
			setLabelStringArray(LABEL_STRING_ARRAY_EDEFAULT);
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
		case LIDLGUIPackage.RADIO_BOX__SIZE_X:
			return sizeX != SIZE_X_EDEFAULT;
		case LIDLGUIPackage.RADIO_BOX__SIZE_Y:
			return sizeY != SIZE_Y_EDEFAULT;
		case LIDLGUIPackage.RADIO_BOX__LABEL_STRING_ARRAY:
			return LABEL_STRING_ARRAY_EDEFAULT == null ? labelStringArray != null
					: !LABEL_STRING_ARRAY_EDEFAULT.equals(labelStringArray);
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
		result.append(", LabelStringArray: ");
		result.append(labelStringArray);
		result.append(')');
		return result.toString();
	}

} //RadioBoxImpl
