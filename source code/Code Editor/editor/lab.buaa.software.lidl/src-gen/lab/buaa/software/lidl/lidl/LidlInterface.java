/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lab.buaa.software.lidl.lidl.LidlInterface#getName <em>Name</em>}</li>
 *   <li>{@link lab.buaa.software.lidl.lidl.LidlInterface#getNestedDef <em>Nested Def</em>}</li>
 *   <li>{@link lab.buaa.software.lidl.lidl.LidlInterface#getDefinition <em>Definition</em>}</li>
 *   <li>{@link lab.buaa.software.lidl.lidl.LidlInterface#isDefined <em>Defined</em>}</li>
 * </ul>
 *
 * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlInterface()
 * @model
 * @generated
 */
public interface LidlInterface extends LidlDefinition
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlInterface_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.LidlInterface#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Nested Def</b></em>' containment reference list.
   * The list contents are of type {@link lab.buaa.software.lidl.lidl.LidlInterface}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nested Def</em>' containment reference list.
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlInterface_NestedDef()
   * @model containment="true"
   * @generated
   */
  EList<LidlInterface> getNestedDef();

  /**
   * Returns the value of the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' containment reference.
   * @see #setDefinition(LidlInterfaceType)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlInterface_Definition()
   * @model containment="true"
   * @generated
   */
  LidlInterfaceType getDefinition();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.LidlInterface#getDefinition <em>Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' containment reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(LidlInterfaceType value);

  /**
   * Returns the value of the '<em><b>Defined</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Defined</em>' attribute.
   * @see #setDefined(boolean)
   * @see lab.buaa.software.lidl.lidl.LidlPackage#getLidlInterface_Defined()
   * @model
   * @generated
   */
  boolean isDefined();

  /**
   * Sets the value of the '{@link lab.buaa.software.lidl.lidl.LidlInterface#isDefined <em>Defined</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Defined</em>' attribute.
   * @see #isDefined()
   * @generated
   */
  void setDefined(boolean value);

} // LidlInterface
