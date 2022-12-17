/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.LIDLGUI.BasicWidget;
import org.eclipse.sirius.LIDLGUI.ComboWidget;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combo Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl#getBasicwidget <em>Basicwidget</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl#getCombowidget <em>Combowidget</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetImpl#getInteractionURL <em>Interaction URL</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComboWidgetImpl extends WidgetImpl implements ComboWidget {
	/**
	 * The cached value of the '{@link #getBasicwidget() <em>Basicwidget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicwidget()
	 * @generated
	 * @ordered
	 */
	protected EList<BasicWidget> basicwidget;

	/**
	 * The cached value of the '{@link #getCombowidget() <em>Combowidget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombowidget()
	 * @generated
	 * @ordered
	 */
	protected EList<ComboWidget> combowidget;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final double INDEX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected double index = INDEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getInteractionURL() <em>Interaction URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionURL()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERACTION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInteractionURL() <em>Interaction URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionURL()
	 * @generated
	 * @ordered
	 */
	protected String interactionURL = INTERACTION_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboWidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.COMBO_WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasicWidget> getBasicwidget() {
		if (basicwidget == null) {
			basicwidget = new EObjectContainmentEList<BasicWidget>(BasicWidget.class, this,
					LIDLGUIPackage.COMBO_WIDGET__BASICWIDGET);
		}
		return basicwidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComboWidget> getCombowidget() {
		if (combowidget == null) {
			combowidget = new EObjectContainmentEList<ComboWidget>(ComboWidget.class, this,
					LIDLGUIPackage.COMBO_WIDGET__COMBOWIDGET);
		}
		return combowidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(double newIndex) {
		double oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.COMBO_WIDGET__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.COMBO_WIDGET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInteractionURL() {
		return interactionURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionURL(String newInteractionURL) {
		String oldInteractionURL = interactionURL;
		interactionURL = newInteractionURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.COMBO_WIDGET__INTERACTION_URL,
					oldInteractionURL, interactionURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LIDLGUIPackage.COMBO_WIDGET__BASICWIDGET:
			return ((InternalEList<?>) getBasicwidget()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.COMBO_WIDGET__COMBOWIDGET:
			return ((InternalEList<?>) getCombowidget()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LIDLGUIPackage.COMBO_WIDGET__BASICWIDGET:
			return getBasicwidget();
		case LIDLGUIPackage.COMBO_WIDGET__COMBOWIDGET:
			return getCombowidget();
		case LIDLGUIPackage.COMBO_WIDGET__INDEX:
			return getIndex();
		case LIDLGUIPackage.COMBO_WIDGET__NAME:
			return getName();
		case LIDLGUIPackage.COMBO_WIDGET__INTERACTION_URL:
			return getInteractionURL();
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
		case LIDLGUIPackage.COMBO_WIDGET__BASICWIDGET:
			getBasicwidget().clear();
			getBasicwidget().addAll((Collection<? extends BasicWidget>) newValue);
			return;
		case LIDLGUIPackage.COMBO_WIDGET__COMBOWIDGET:
			getCombowidget().clear();
			getCombowidget().addAll((Collection<? extends ComboWidget>) newValue);
			return;
		case LIDLGUIPackage.COMBO_WIDGET__INDEX:
			setIndex((Double) newValue);
			return;
		case LIDLGUIPackage.COMBO_WIDGET__NAME:
			setName((String) newValue);
			return;
		case LIDLGUIPackage.COMBO_WIDGET__INTERACTION_URL:
			setInteractionURL((String) newValue);
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
		case LIDLGUIPackage.COMBO_WIDGET__BASICWIDGET:
			getBasicwidget().clear();
			return;
		case LIDLGUIPackage.COMBO_WIDGET__COMBOWIDGET:
			getCombowidget().clear();
			return;
		case LIDLGUIPackage.COMBO_WIDGET__INDEX:
			setIndex(INDEX_EDEFAULT);
			return;
		case LIDLGUIPackage.COMBO_WIDGET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LIDLGUIPackage.COMBO_WIDGET__INTERACTION_URL:
			setInteractionURL(INTERACTION_URL_EDEFAULT);
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
		case LIDLGUIPackage.COMBO_WIDGET__BASICWIDGET:
			return basicwidget != null && !basicwidget.isEmpty();
		case LIDLGUIPackage.COMBO_WIDGET__COMBOWIDGET:
			return combowidget != null && !combowidget.isEmpty();
		case LIDLGUIPackage.COMBO_WIDGET__INDEX:
			return index != INDEX_EDEFAULT;
		case LIDLGUIPackage.COMBO_WIDGET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LIDLGUIPackage.COMBO_WIDGET__INTERACTION_URL:
			return INTERACTION_URL_EDEFAULT == null ? interactionURL != null
					: !INTERACTION_URL_EDEFAULT.equals(interactionURL);
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
		result.append(" (index: ");
		result.append(index);
		result.append(", name: ");
		result.append(name);
		result.append(", InteractionURL: ");
		result.append(interactionURL);
		result.append(')');
		return result.toString();
	}

} //ComboWidgetImpl
