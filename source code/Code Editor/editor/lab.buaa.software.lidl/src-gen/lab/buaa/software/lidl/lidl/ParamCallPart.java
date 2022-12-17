/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Call Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.ParamCallPart#getParam <em>Param</em>}</li>
 * </ul>
 *
 * @see lab.buaa.software.lidl.lidl.LidlPackage#getParamCallPart()
 * @model
 * @generated
 */
public interface ParamCallPart extends CallPart
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' containment reference.
   * @see #setParam(LidlExpresson)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getParamCallPart_Param()
   * @model containment="true"
   * @generated
   */
  LidlExpresson getParam();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.ParamCallPart#getParam <em>Param</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' containment reference.
   * @see #getParam()
   * @generated
   */
  void setParam(LidlExpresson value);

} // ParamCallPart