/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl.impl;

import lab.buaa.software.lidl.lidl.LidlInterfaceType;
import lab.buaa.software.lidl.lidl.LidlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.impl.LidlInterfaceTypeImpl#isConjugate <em>Conjugate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LidlInterfaceTypeImpl extends MinimalEObjectImpl.Container implements LidlInterfaceType
{
  /**
   * The default value of the '{@link #isConjugate() <em>Conjugate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConjugate()
   * @generated
   * @ordered
   */
  protected static final boolean CONJUGATE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isConjugate() <em>Conjugate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isConjugate()
   * @generated
   * @ordered
   */
  protected boolean conjugate = CONJUGATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LidlInterfaceTypeImpl()
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
    return LidlPackage.Literals.LIDL_INTERFACE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isConjugate()
  {
    return conjugate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConjugate(boolean newConjugate)
  {
    boolean oldConjugate = conjugate;
    conjugate = newConjugate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LidlPackage.LIDL_INTERFACE_TYPE__CONJUGATE, oldConjugate, conjugate));
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
      case LidlPackage.LIDL_INTERFACE_TYPE__CONJUGATE:
        return isConjugate();
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
      case LidlPackage.LIDL_INTERFACE_TYPE__CONJUGATE:
        setConjugate((Boolean)newValue);
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
      case LidlPackage.LIDL_INTERFACE_TYPE__CONJUGATE:
        setConjugate(CONJUGATE_EDEFAULT);
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
      case LidlPackage.LIDL_INTERFACE_TYPE__CONJUGATE:
        return conjugate != CONJUGATE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (conjugate: ");
    result.append(conjugate);
    result.append(')');
    return result.toString();
  }

} //LidlInterfaceTypeImpl
