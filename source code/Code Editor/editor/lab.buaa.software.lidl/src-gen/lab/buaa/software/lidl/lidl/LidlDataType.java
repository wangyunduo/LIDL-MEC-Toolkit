/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.LidlDataType#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlDataType()
 * @model
 * @generated
 */
public interface LidlDataType extends EObject
{
  /**
   * Returns the value of the '<em><b>Items</b></em>' containment reference list.
   * The list contents are of type {@link lab.buaa.software.lidl.lidl.TypeElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Items</em>' containment reference list.
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlDataType_Items()
   * @model containment="true"
   * @generated
   */
  EList<TypeElement> getItems();

} // LidlDataType
