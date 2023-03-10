/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl.impl;

import java.util.Collection;

import lab.buaa.software.lidl.lidl.LidlArrayItem;
import lab.buaa.software.lidl.lidl.LidlExpression;
import lab.buaa.software.lidl.lidl.LidlPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.impl.LidlExpressionImpl#getItem <em>Item</em>}</li>
 *   <li>{@link lab.buaa.software.lidl.lidl.impl.LidlExpressionImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LidlExpressionImpl extends LidlExpressonImpl implements LidlExpression
{
  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected EList<LidlArrayItem> item;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<EObject> items;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LidlExpressionImpl()
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
    return LidlPackage.Literals.LIDL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<LidlArrayItem> getItem()
  {
    if (item == null)
    {
      item = new EObjectContainmentEList<LidlArrayItem>(LidlArrayItem.class, this, LidlPackage.LIDL_EXPRESSION__ITEM);
    }
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<EObject>(EObject.class, this, LidlPackage.LIDL_EXPRESSION__ITEMS);
    }
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case LidlPackage.LIDL_EXPRESSION__ITEM:
        return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
      case LidlPackage.LIDL_EXPRESSION__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case LidlPackage.LIDL_EXPRESSION__ITEM:
        return getItem();
      case LidlPackage.LIDL_EXPRESSION__ITEMS:
        return getItems();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LidlPackage.LIDL_EXPRESSION__ITEM:
        getItem().clear();
        getItem().addAll((Collection<? extends LidlArrayItem>)newValue);
        return;
      case LidlPackage.LIDL_EXPRESSION__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends EObject>)newValue);
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
      case LidlPackage.LIDL_EXPRESSION__ITEM:
        getItem().clear();
        return;
      case LidlPackage.LIDL_EXPRESSION__ITEMS:
        getItems().clear();
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
      case LidlPackage.LIDL_EXPRESSION__ITEM:
        return item != null && !item.isEmpty();
      case LidlPackage.LIDL_EXPRESSION__ITEMS:
        return items != null && !items.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //LidlExpressionImpl
