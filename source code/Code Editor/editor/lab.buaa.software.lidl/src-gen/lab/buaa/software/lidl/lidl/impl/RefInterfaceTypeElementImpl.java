/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl.impl;

import lab.buaa.software.lidl.lidl.LidlInterface;
import lab.buaa.software.lidl.lidl.LidlPackage;
import lab.buaa.software.lidl.lidl.RefInterfaceTypeElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Interface Type Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.impl.RefInterfaceTypeElementImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefInterfaceTypeElementImpl extends InterfaceElementImpl implements RefInterfaceTypeElement
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LidlInterface type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RefInterfaceTypeElementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return LidlPackage.Literals.REF_INTERFACE_TYPE_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LidlInterface getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (LidlInterface)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LidlPackage.REF_INTERFACE_TYPE_ELEMENT__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LidlInterface basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(LidlInterface newType)
  {
    LidlInterface oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LidlPackage.REF_INTERFACE_TYPE_ELEMENT__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case LidlPackage.REF_INTERFACE_TYPE_ELEMENT__TYPE:
        if (resolve) return getType();
        return basicGetType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LidlPackage.REF_INTERFACE_TYPE_ELEMENT__TYPE:
        setType((LidlInterface)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case LidlPackage.REF_INTERFACE_TYPE_ELEMENT__TYPE:
        setType((LidlInterface)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case LidlPackage.REF_INTERFACE_TYPE_ELEMENT__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

} //RefInterfaceTypeElementImpl
