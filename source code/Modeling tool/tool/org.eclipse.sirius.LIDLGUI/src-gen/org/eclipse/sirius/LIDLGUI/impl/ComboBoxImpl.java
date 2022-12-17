/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.sirius.LIDLGUI.ComboBox;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combo Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboBoxImpl#getSizeX <em>Size X</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboBoxImpl#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboBoxImpl#getLabelString <em>Label String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComboBoxImpl extends ButtonImpl implements ComboBox {
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
	 * The default value of the '{@link #getLabelString() <em>Label String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelString()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelString() <em>Label String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelString()
	 * @generated
	 * @ordered
	 */
	protected String labelString = LABEL_STRING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.COMBO_BOX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.COMBO_BOX__SIZE_X, oldSizeX, sizeX));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.COMBO_BOX__SIZE_Y, oldSizeY, sizeY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelString() {
		return labelString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelString(String newLabelString) {
		String oldLabelString = labelString;
		labelString = newLabelString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.COMBO_BOX__LABEL_STRING,
					oldLabelString, labelString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LIDLGUIPackage.COMBO_BOX__SIZE_X:
			return getSizeX();
		case LIDLGUIPackage.COMBO_BOX__SIZE_Y:
			return getSizeY();
		case LIDLGUIPackage.COMBO_BOX__LABEL_STRING:
			return getLabelString();
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
		case LIDLGUIPackage.COMBO_BOX__SIZE_X:
			setSizeX((Double) newValue);
			return;
		case LIDLGUIPackage.COMBO_BOX__SIZE_Y:
			setSizeY((Double) newValue);
			return;
		case LIDLGUIPackage.COMBO_BOX__LABEL_STRING:
			setLabelString((String) newValue);
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
		case LIDLGUIPackage.COMBO_BOX__SIZE_X:
			setSizeX(SIZE_X_EDEFAULT);
			return;
		case LIDLGUIPackage.COMBO_BOX__SIZE_Y:
			setSizeY(SIZE_Y_EDEFAULT);
			return;
		case LIDLGUIPackage.COMBO_BOX__LABEL_STRING:
			setLabelString(LABEL_STRING_EDEFAULT);
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
		case LIDLGUIPackage.COMBO_BOX__SIZE_X:
			return sizeX != SIZE_X_EDEFAULT;
		case LIDLGUIPackage.COMBO_BOX__SIZE_Y:
			return sizeY != SIZE_Y_EDEFAULT;
		case LIDLGUIPackage.COMBO_BOX__LABEL_STRING:
			return LABEL_STRING_EDEFAULT == null ? labelString != null : !LABEL_STRING_EDEFAULT.equals(labelString);
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
		result.append(", LabelString: ");
		result.append(labelString);
		result.append(')');
		return result.toString();
	}

} //ComboBoxImpl
