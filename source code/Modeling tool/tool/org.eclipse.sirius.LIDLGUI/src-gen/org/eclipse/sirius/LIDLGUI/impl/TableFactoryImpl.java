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

import org.eclipse.sirius.LIDLGUI.DatatypeTable;
import org.eclipse.sirius.LIDLGUI.InteractionTable;
import org.eclipse.sirius.LIDLGUI.InterfaceTable;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;
import org.eclipse.sirius.LIDLGUI.TableFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.TableFactoryImpl#getInteractiontable <em>Interactiontable</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.TableFactoryImpl#getInterfacetable <em>Interfacetable</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.TableFactoryImpl#getDatatypetable <em>Datatypetable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableFactoryImpl extends MinimalEObjectImpl.Container implements TableFactory {
	/**
	 * The cached value of the '{@link #getInteractiontable() <em>Interactiontable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractiontable()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionTable> interactiontable;

	/**
	 * The cached value of the '{@link #getInterfacetable() <em>Interfacetable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfacetable()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceTable> interfacetable;

	/**
	 * The cached value of the '{@link #getDatatypetable() <em>Datatypetable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatypetable()
	 * @generated
	 * @ordered
	 */
	protected EList<DatatypeTable> datatypetable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.TABLE_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionTable> getInteractiontable() {
		if (interactiontable == null) {
			interactiontable = new EObjectContainmentEList<InteractionTable>(InteractionTable.class, this,
					LIDLGUIPackage.TABLE_FACTORY__INTERACTIONTABLE);
		}
		return interactiontable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceTable> getInterfacetable() {
		if (interfacetable == null) {
			interfacetable = new EObjectContainmentEList<InterfaceTable>(InterfaceTable.class, this,
					LIDLGUIPackage.TABLE_FACTORY__INTERFACETABLE);
		}
		return interfacetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DatatypeTable> getDatatypetable() {
		if (datatypetable == null) {
			datatypetable = new EObjectContainmentEList<DatatypeTable>(DatatypeTable.class, this,
					LIDLGUIPackage.TABLE_FACTORY__DATATYPETABLE);
		}
		return datatypetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LIDLGUIPackage.TABLE_FACTORY__INTERACTIONTABLE:
			return ((InternalEList<?>) getInteractiontable()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.TABLE_FACTORY__INTERFACETABLE:
			return ((InternalEList<?>) getInterfacetable()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.TABLE_FACTORY__DATATYPETABLE:
			return ((InternalEList<?>) getDatatypetable()).basicRemove(otherEnd, msgs);
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
		case LIDLGUIPackage.TABLE_FACTORY__INTERACTIONTABLE:
			return getInteractiontable();
		case LIDLGUIPackage.TABLE_FACTORY__INTERFACETABLE:
			return getInterfacetable();
		case LIDLGUIPackage.TABLE_FACTORY__DATATYPETABLE:
			return getDatatypetable();
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
		case LIDLGUIPackage.TABLE_FACTORY__INTERACTIONTABLE:
			getInteractiontable().clear();
			getInteractiontable().addAll((Collection<? extends InteractionTable>) newValue);
			return;
		case LIDLGUIPackage.TABLE_FACTORY__INTERFACETABLE:
			getInterfacetable().clear();
			getInterfacetable().addAll((Collection<? extends InterfaceTable>) newValue);
			return;
		case LIDLGUIPackage.TABLE_FACTORY__DATATYPETABLE:
			getDatatypetable().clear();
			getDatatypetable().addAll((Collection<? extends DatatypeTable>) newValue);
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
		case LIDLGUIPackage.TABLE_FACTORY__INTERACTIONTABLE:
			getInteractiontable().clear();
			return;
		case LIDLGUIPackage.TABLE_FACTORY__INTERFACETABLE:
			getInterfacetable().clear();
			return;
		case LIDLGUIPackage.TABLE_FACTORY__DATATYPETABLE:
			getDatatypetable().clear();
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
		case LIDLGUIPackage.TABLE_FACTORY__INTERACTIONTABLE:
			return interactiontable != null && !interactiontable.isEmpty();
		case LIDLGUIPackage.TABLE_FACTORY__INTERFACETABLE:
			return interfacetable != null && !interfacetable.isEmpty();
		case LIDLGUIPackage.TABLE_FACTORY__DATATYPETABLE:
			return datatypetable != null && !datatypetable.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TableFactoryImpl
