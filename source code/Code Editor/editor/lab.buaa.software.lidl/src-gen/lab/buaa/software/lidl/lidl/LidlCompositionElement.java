/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.LidlCompositionElement#getParam <em>Param</em>}</li>
 *   <li>{@link lab.buaa.software.lidl.lidl.LidlCompositionElement#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlCompositionElement()
 * @model
 * @generated
 */
public interface LidlCompositionElement extends LidlSymbol
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' attribute.
   * @see #setParam(String)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlCompositionElement_Param()
   * @model
   * @generated
   */
  String getParam();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.LidlCompositionElement#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
  void setParam(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(LidlExpresson)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlCompositionElement_Value()
   * @model containment="true"
   * @generated
   */
  LidlExpresson getValue();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.LidlCompositionElement#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(LidlExpresson value);

} // LidlCompositionElement