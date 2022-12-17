/**
 */
package org.eclipse.sirius.LIDLGUI.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.LIDLGUI.ComboWidget;
import org.eclipse.sirius.LIDLGUI.ComboWidgetFactory;
import org.eclipse.sirius.LIDLGUI.GUI;
import org.eclipse.sirius.LIDLGUI.Interaction;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combo Widget Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetFactoryImpl#getMyComboWidget <em>My Combo Widget</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetFactoryImpl#getGui <em>Gui</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.ComboWidgetFactoryImpl#getInteraction_diagram <em>Interaction diagram</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComboWidgetFactoryImpl extends MinimalEObjectImpl.Container implements ComboWidgetFactory {
	/**
	 * The cached value of the '{@link #getMyComboWidget() <em>My Combo Widget</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMyComboWidget()
	 * @generated
	 * @ordered
	 */
	protected EList<ComboWidget> myComboWidget;

	/**
	 * The cached value of the '{@link #getGui() <em>Gui</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGui()
	 * @generated
	 * @ordered
	 */
	protected EList<GUI> gui;

	/**
	 * The cached value of the '{@link #getInteraction_diagram() <em>Interaction diagram</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteraction_diagram()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> interaction_diagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComboWidgetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.COMBO_WIDGET_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComboWidget> getMyComboWidget() {
		if (myComboWidget == null) {
			myComboWidget = new EObjectContainmentEList<ComboWidget>(ComboWidget.class, this,
					LIDLGUIPackage.COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET);
		}
		return myComboWidget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GUI> getGui() {
		if (gui == null) {
			gui = new EObjectContainmentEList<GUI>(GUI.class, this, LIDLGUIPackage.COMBO_WIDGET_FACTORY__GUI);
		}
		return gui;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getInteraction_diagram() {
		if (interaction_diagram == null) {
			interaction_diagram = new EObjectContainmentEList<Interaction>(Interaction.class, this,
					LIDLGUIPackage.COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM);
		}
		return interaction_diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET:
			return ((InternalEList<?>) getMyComboWidget()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__GUI:
			return ((InternalEList<?>) getGui()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM:
			return ((InternalEList<?>) getInteraction_diagram()).basicRemove(otherEnd, msgs);
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
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET:
			return getMyComboWidget();
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__GUI:
			return getGui();
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM:
			return getInteraction_diagram();
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
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET:
			getMyComboWidget().clear();
			getMyComboWidget().addAll((Collection<? extends ComboWidget>) newValue);
			return;
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__GUI:
			getGui().clear();
			getGui().addAll((Collection<? extends GUI>) newValue);
			return;
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM:
			getInteraction_diagram().clear();
			getInteraction_diagram().addAll((Collection<? extends Interaction>) newValue);
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
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET:
			getMyComboWidget().clear();
			return;
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__GUI:
			getGui().clear();
			return;
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM:
			getInteraction_diagram().clear();
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
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__MY_COMBO_WIDGET:
			return myComboWidget != null && !myComboWidget.isEmpty();
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__GUI:
			return gui != null && !gui.isEmpty();
		case LIDLGUIPackage.COMBO_WIDGET_FACTORY__INTERACTION_DIAGRAM:
			return interaction_diagram != null && !interaction_diagram.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComboWidgetFactoryImpl
