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
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.sirius.LIDLGUI.Interaction;
import org.eclipse.sirius.LIDLGUI.Interface;
import org.eclipse.sirius.LIDLGUI.InterfaceConnector;
import org.eclipse.sirius.LIDLGUI.LIDLGUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getSignature_interfaces <em>Signature interfaces</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getCandidates_interactions <em>Candidates interactions</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getInterfaceConnectors <em>Interface Connectors</em>}</li>
 *   <li>{@link org.eclipse.sirius.LIDLGUI.impl.InteractionImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends MinimalEObjectImpl.Container implements Interaction {
	/**
	 * The cached value of the '{@link #getSignature_interfaces() <em>Signature interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature_interfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> signature_interfaces;

	/**
	 * The cached value of the '{@link #getCandidates_interactions() <em>Candidates interactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCandidates_interactions()
	 * @generated
	 * @ordered
	 */
	protected EList<Interaction> candidates_interactions;

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
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected String signature = SIGNATURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected Interface interface_;

	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInterfaceConnectors() <em>Interface Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceConnector> interfaceConnectors;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LIDLGUIPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getSignature_interfaces() {
		if (signature_interfaces == null) {
			signature_interfaces = new EObjectContainmentEList<Interface>(Interface.class, this,
					LIDLGUIPackage.INTERACTION__SIGNATURE_INTERFACES);
		}
		return signature_interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interaction> getCandidates_interactions() {
		if (candidates_interactions == null) {
			candidates_interactions = new EObjectContainmentEList<Interaction>(Interaction.class, this,
					LIDLGUIPackage.INTERACTION__CANDIDATES_INTERACTIONS);
		}
		return candidates_interactions;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERACTION__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERACTION__SIGNATURE, oldSignature,
					signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		Interface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LIDLGUIPackage.INTERACTION__INTERFACE, oldInterface, newInterface);
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
	public void setInterface(Interface newInterface) {
		if (newInterface != interface_) {
			NotificationChain msgs = null;
			if (interface_ != null)
				msgs = ((InternalEObject) interface_).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LIDLGUIPackage.INTERACTION__INTERFACE, null, msgs);
			if (newInterface != null)
				msgs = ((InternalEObject) newInterface).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LIDLGUIPackage.INTERACTION__INTERFACE, null, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERACTION__INTERFACE, newInterface,
					newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERACTION__EXPRESSION, oldExpression,
					expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceConnector> getInterfaceConnectors() {
		if (interfaceConnectors == null) {
			interfaceConnectors = new EObjectContainmentEList<InterfaceConnector>(InterfaceConnector.class, this,
					LIDLGUIPackage.INTERACTION__INTERFACE_CONNECTORS);
		}
		return interfaceConnectors;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LIDLGUIPackage.INTERACTION__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LIDLGUIPackage.INTERACTION__SIGNATURE_INTERFACES:
			return ((InternalEList<?>) getSignature_interfaces()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.INTERACTION__CANDIDATES_INTERACTIONS:
			return ((InternalEList<?>) getCandidates_interactions()).basicRemove(otherEnd, msgs);
		case LIDLGUIPackage.INTERACTION__INTERFACE:
			return basicSetInterface(null, msgs);
		case LIDLGUIPackage.INTERACTION__INTERFACE_CONNECTORS:
			return ((InternalEList<?>) getInterfaceConnectors()).basicRemove(otherEnd, msgs);
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
		case LIDLGUIPackage.INTERACTION__SIGNATURE_INTERFACES:
			return getSignature_interfaces();
		case LIDLGUIPackage.INTERACTION__CANDIDATES_INTERACTIONS:
			return getCandidates_interactions();
		case LIDLGUIPackage.INTERACTION__LABEL:
			return getLabel();
		case LIDLGUIPackage.INTERACTION__NAME:
			return getName();
		case LIDLGUIPackage.INTERACTION__SIGNATURE:
			return getSignature();
		case LIDLGUIPackage.INTERACTION__INTERFACE:
			return getInterface();
		case LIDLGUIPackage.INTERACTION__EXPRESSION:
			return getExpression();
		case LIDLGUIPackage.INTERACTION__INTERFACE_CONNECTORS:
			return getInterfaceConnectors();
		case LIDLGUIPackage.INTERACTION__INDEX:
			return getIndex();
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
		case LIDLGUIPackage.INTERACTION__SIGNATURE_INTERFACES:
			getSignature_interfaces().clear();
			getSignature_interfaces().addAll((Collection<? extends Interface>) newValue);
			return;
		case LIDLGUIPackage.INTERACTION__CANDIDATES_INTERACTIONS:
			getCandidates_interactions().clear();
			getCandidates_interactions().addAll((Collection<? extends Interaction>) newValue);
			return;
		case LIDLGUIPackage.INTERACTION__LABEL:
			setLabel((String) newValue);
			return;
		case LIDLGUIPackage.INTERACTION__NAME:
			setName((String) newValue);
			return;
		case LIDLGUIPackage.INTERACTION__SIGNATURE:
			setSignature((String) newValue);
			return;
		case LIDLGUIPackage.INTERACTION__INTERFACE:
			setInterface((Interface) newValue);
			return;
		case LIDLGUIPackage.INTERACTION__EXPRESSION:
			setExpression((String) newValue);
			return;
		case LIDLGUIPackage.INTERACTION__INTERFACE_CONNECTORS:
			getInterfaceConnectors().clear();
			getInterfaceConnectors().addAll((Collection<? extends InterfaceConnector>) newValue);
			return;
		case LIDLGUIPackage.INTERACTION__INDEX:
			setIndex((Double) newValue);
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
		case LIDLGUIPackage.INTERACTION__SIGNATURE_INTERFACES:
			getSignature_interfaces().clear();
			return;
		case LIDLGUIPackage.INTERACTION__CANDIDATES_INTERACTIONS:
			getCandidates_interactions().clear();
			return;
		case LIDLGUIPackage.INTERACTION__LABEL:
			setLabel(LABEL_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERACTION__SIGNATURE:
			setSignature(SIGNATURE_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERACTION__INTERFACE:
			setInterface((Interface) null);
			return;
		case LIDLGUIPackage.INTERACTION__EXPRESSION:
			setExpression(EXPRESSION_EDEFAULT);
			return;
		case LIDLGUIPackage.INTERACTION__INTERFACE_CONNECTORS:
			getInterfaceConnectors().clear();
			return;
		case LIDLGUIPackage.INTERACTION__INDEX:
			setIndex(INDEX_EDEFAULT);
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
		case LIDLGUIPackage.INTERACTION__SIGNATURE_INTERFACES:
			return signature_interfaces != null && !signature_interfaces.isEmpty();
		case LIDLGUIPackage.INTERACTION__CANDIDATES_INTERACTIONS:
			return candidates_interactions != null && !candidates_interactions.isEmpty();
		case LIDLGUIPackage.INTERACTION__LABEL:
			return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
		case LIDLGUIPackage.INTERACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case LIDLGUIPackage.INTERACTION__SIGNATURE:
			return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
		case LIDLGUIPackage.INTERACTION__INTERFACE:
			return interface_ != null;
		case LIDLGUIPackage.INTERACTION__EXPRESSION:
			return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
		case LIDLGUIPackage.INTERACTION__INTERFACE_CONNECTORS:
			return interfaceConnectors != null && !interfaceConnectors.isEmpty();
		case LIDLGUIPackage.INTERACTION__INDEX:
			return index != INDEX_EDEFAULT;
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
		result.append(" (label: ");
		result.append(label);
		result.append(", name: ");
		result.append(name);
		result.append(", signature: ");
		result.append(signature);
		result.append(", expression: ");
		result.append(expression);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //InteractionImpl
