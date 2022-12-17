/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.LidlArrayItem#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlArrayItem()
 * @model
 * @generated
 */
public interface LidlArrayItem extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(LidlExpresson)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlArrayItem_Value()
   * @model containment="true"
   * @generated
   */
  LidlExpresson getValue();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.LidlArrayItem#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LidlExpresson value);

} // LidlArrayItem