/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom Interface Type Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.AtomInterfaceTypeElement#getType <em>Type</em>}</li>
 *   <li>{@link lab.buaa.software.lidl.lidl.AtomInterfaceTypeElement#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see lab.buaa.software.lidl.lidl.LidlPackage#getAtomInterfaceTypeElement()
 * @model
 * @generated
 */
public interface AtomInterfaceTypeElement extends InterfaceElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(LidlData)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getAtomInterfaceTypeElement_Type()
   * @model
   * @generated
   */
  LidlData getType();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.AtomInterfaceTypeElement#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(LidlData value);

  /**
   * Returns the value of the '<em><b>Direction</b></em>' attribute.
   * The literals are from the enumeration {@link lab.buaa.software.lidl.lidl.DataDirection}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direction</em>' attribute.
   * @see lab.buaa.software.lidl.lidl.DataDirection
   * @see #setDirection(DataDirection)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getAtomInterfaceTypeElement_Direction()
   * @model
   * @generated
   */
  DataDirection getDirection();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.AtomInterfaceTypeElement#getDirection <em>Direction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direction</em>' attribute.
   * @see lab.buaa.software.lidl.lidl.DataDirection
   * @see #getDirection()
   * @generated
   */
  void setDirection(DataDirection value);

} // AtomInterfaceTypeElement
