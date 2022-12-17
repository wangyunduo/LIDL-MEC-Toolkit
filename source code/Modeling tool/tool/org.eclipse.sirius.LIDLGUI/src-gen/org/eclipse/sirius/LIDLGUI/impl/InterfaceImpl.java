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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.LIDLGUI.Datatype;
import org.eclipse.sirius.LIDLGUI.Direction;
import org.eclipse.sirius.LIDLGUI.Interface;
import org.eclipse.sirius.LIDLGUI.InterfaceConnector;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;
import org.eclipse.sirius.LIDLGUI.MetaInterface;
import org.eclipse.sirius.LIDLGUI.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getCandidate_interfaces <em>Candidate interfaces</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getTo <em>To</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InterfaceImpl#getActualPar <em>Actual Par</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
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
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final Scope SCOPE_EDEFAULT = Scope.GLOBAL;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected static final MetaInterface INTERFACE_EDEFAULT = MetaInterface.COMPOSITE;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected MetaInterface interface_ = INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatatype()
	 * @generated
	 * @ordered
	 */
	protected Datatype datatype;

	/**
	 * The cached value of the '{@link #getCandidate_interfaces() <em>Candidate interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidate_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> candidate_interfaces;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConnector> from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConnector> to;

	/**
	 * The default value of the '{@link #getActualPar() <em>Actual Par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPar()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTUAL_PAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActualPar() <em>Actual Par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActualPar()
	 * @generated
	 * @ordered
	 */
	protected String actualPar = ACTUAL_PAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		Scope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERFACE__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaInterface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(MetaInterface newInterface) {
		MetaInterface oldInterface = interface_;
		interface_ = newInterface == null ? INTERFACE_EDEFAULT : newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERFACE__INTERFACE, oldInterface,
					interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERFACE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERFACE__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Datatype getDatatype() {
		return datatype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatatype(Datatype newDatatype, NotificationChain msgs) {
		Datatype oldDatatype = datatype;
		datatype = newDatatype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LIDLGUIPackage.INTERFACE__DATATYPE, oldDatatype, newDatatype);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatatype(Datatype newDatatype) {
		if (newDatatype != datatype) {
			NotificationChain msgs = null;
			if (datatype != null)
				msgs = ((InternalEObject) datatype).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LIDLGUIPackage.INTERFACE__DATATYPE, null, msgs);
			if (newDatatype != null)
				msgs = ((InternalEObject) newDatatype).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LIDLGUIPackage.INTERFACE__DATATYPE, null, msgs);
			msgs = basicSetDatatype(newDatatype, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERFACE__DATATYPE, newDatatype,
					newDatatype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getCandidate_interfaces() {
		if (candidate_interfaces == null) {
			candidate_interfaces = new EObjectContainmentEList<Interface>(Interface.class, this,
					LIDLGUIPackage.INTERFACE__CANDIDATE_INTERFACES);
		}
		return candidate_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConnector> getFrom() {
		if (from == null) {
			from = new EObjectWithInverseResolvingEList<InterfaceConnector>(InterfaceConnector.class, this,
					LIDLGUIPackage.INTERFACE__FROM, LIDLGUIPackage.INTERFACE_CONNECTOR__SOURCE);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConnector> getTo() {
		if (to == null) {
			to = new EObjectWithInverseResolvingEList<InterfaceConnector>(InterfaceConnector.class, this,
					LIDLGUIPackage.INTERFACE__TO, LIDLGUIPackage.INTERFACE_CONNECTOR__TARGET);
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActualPar() {
		return actualPar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActualPar(String newActualPar) {
		String oldActualPar = actualPar;
		actualPar = newActualPar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERFACE__ACTUAL_PAR, oldActualPar,
					actualPar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LIDLGUIPackage.INTERFACE__FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFrom()).basicAdd(otherEnd, msgs);
		case LIDLGUIPackage.INTERFACE__TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTo()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LIDLGUIPackage.INTERFACE__DATATYPE:
			return basicSetDatatype(null, msgs);
		case LIDLGUIPackage.INTERFACE__CANDIDATE_INTERFACES:
			return ((InternalEList<?>) getCandidate_interfaces()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.INTERFACE__FROM:
			return ((InternalEList<?>) getFrom()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.INTERFACE__TO:
			return ((InternalEList<?>) getTo()).basicRemove(otherEnd, msgs);
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
		case LIDLGUIPackage.INTERFACE__NAME:
			return getName();
		case LIDLGUIPackage.INTERFACE__SCOPE:
			return getScope();
		case LIDLGUIPackage.INTERFACE__INTERFACE:
			return getInterface();
		case LIDLGUIPackage.INTERFACE__LABEL:
			return getLabel();
		case LIDLGUIPackage.INTERFACE__DIRECTION:
			return getDirection();
		case LIDLGUIPackage.INTERFACE__DATATYPE:
			return getDatatype();
		case LIDLGUIPackage.INTERFACE__CANDIDATE_INTERFACES:
			return getCandidate_interfaces();
		case LIDLGUIPackage.INTERFACE__FROM:
			return getFrom();
		case LIDLGUIPackage.INTERFACE__TO:
			return getTo();
		case LIDLGUIPackage.INTERFACE__ACTUAL_PAR:
			return getActualPar();
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
		case LIDLGUIPackage.INTERFACE__NAME:
			setName((String) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__SCOPE:
			setScope((Scope) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__INTERFACE:
			setInterface((MetaInterface) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__LABEL:
			setLabel((String) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__DIRECTION:
			setDirection((Direction) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__DATATYPE:
			setDatatype((Datatype) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__CANDIDATE_INTERFACES:
			getCandidate_interfaces().clear();
			getCandidate_interfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__FROM:
			getFrom().clear();
			getFrom().addAll((Collection<? extends InterfaceConnector>) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__TO:
			getTo().clear();
			getTo().addAll((Collection<? extends InterfaceConnector>) newValue);
			return;
		case LIDLGUIPackage.INTERFACE__ACTUAL_PAR:
			setActualPar((String) newValue);
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
		case LIDLGUIPackage.INTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERFACE__SCOPE:
			setScope(SCOPE_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERFACE__INTERFACE:
			setInterface(INTERFACE_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERFACE__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERFACE__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERFACE__DATATYPE:
			setDatatype((Datatype) null);
			return;
		case LIDLGUIPackage.INTERFACE__CANDIDATE_INTERFACES:
			getCandidate_interfaces().clear();
			return;
		case LIDLGUIPackage.INTERFACE__FROM:
			getFrom().clear();
			return;
		case LIDLGUIPackage.INTERFACE__TO:
			getTo().clear();
			return;
		case LIDLGUIPackage.INTERFACE__ACTUAL_PAR:
			setActualPar(ACTUAL_PAR_EDEFAULT);
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
		case LIDLGUIPackage.INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LIDLGUIPackage.INTERFACE__SCOPE:
			return scope != SCOPE_EDEFAULT;
		case LIDLGUIPackage.INTERFACE__INTERFACE:
			return interface_ != INTERFACE_EDEFAULT;
		case LIDLGUIPackage.INTERFACE__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case LIDLGUIPackage.INTERFACE__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case LIDLGUIPackage.INTERFACE__DATATYPE:
			return datatype != null;
		case LIDLGUIPackage.INTERFACE__CANDIDATE_INTERFACES:
			return candidate_interfaces != null && !candidate_interfaces.isEmpty();
		case LIDLGUIPackage.INTERFACE__FROM:
			return from != null && !from.isEmpty();
		case LIDLGUIPackage.INTERFACE__TO:
			return to != null && !to.isEmpty();
		case LIDLGUIPackage.INTERFACE__ACTUAL_PAR:
			return ACTUAL_PAR_EDEFAULT == null ? actualPar != null : !ACTUAL_PAR_EDEFAULT.equals(actualPar);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", scope: ");
		result.append(scope);
		result.append(", interface: ");
		result.append(interface_);
		result.append(", label: ");
		result.append(label);
		result.append(", direction: ");
		result.append(direction);
		result.append(", actualPar: ");
		result.append(actualPar);
		result.append(')');
		return result.toString();
	}

} //InterfaceImpl
