/**
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.lidl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see lab.buaa.software.lidl.lidl.LidlPackage
 * @generated
 */
public interface LidlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LidlFactory eINSTANCE = lab.buaa.software.lidl.lidl.impl.LidlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Program</em>'.
   * @generated
   */
  LidlProgram createLidlProgram();

  /**
   * Returns a new object of class '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import</em>'.
   * @generated
   */
  LidlImport createLidlImport();

  /**
   * Returns a new object of class '<em>Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Definition</em>'.
   * @generated
   */
  LidlDefinition createLidlDefinition();

  /**
   * Returns a new object of class '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data</em>'.
   * @generated
   */
  LidlData createLidlData();

  /**
   * Returns a new object of class '<em>Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type</em>'.
   * @generated
   */
  LidlDataType createLidlDataType();

  /**
   * Returns a new object of class '<em>Type Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Element</em>'.
   * @generated
   */
  TypeElement createTypeElement();

  /**
   * Returns a new object of class '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface</em>'.
   * @generated
   */
  LidlInterface createLidlInterface();

  /**
   * Returns a new object of class '<em>Interface Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Type</em>'.
   * @generated
   */
  LidlInterfaceType createLidlInterfaceType();

  /**
   * Returns a new object of class '<em>Interface Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Element</em>'.
   * @generated
   */
  InterfaceElement createInterfaceElement();

  /**
   * Returns a new object of class '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction</em>'.
   * @generated
   */
  LidlInteraction createLidlInteraction();

  /**
   * Returns a new object of class '<em>Interaction ID</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction ID</em>'.
   * @generated
   */
  LidlInteractionID createLidlInteractionID();

  /**
   * Returns a new object of class '<em>ID Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ID Part</em>'.
   * @generated
   */
  IDPart createIDPart();

  /**
   * Returns a new object of class '<em>Expresson</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expresson</em>'.
   * @generated
   */
  LidlExpresson createLidlExpresson();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  LidlExpression createLidlExpression();

  /**
   * Returns a new object of class '<em>Call Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Part</em>'.
   * @generated
   */
  CallPart createCallPart();

  /**
   * Returns a new object of class '<em>Array Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Item</em>'.
   * @generated
   */
  LidlArrayItem createLidlArrayItem();

  /**
   * Returns a new object of class '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol</em>'.
   * @generated
   */
  LidlSymbol createLidlSymbol();

  /**
   * Returns a new object of class '<em>Composition Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition Element</em>'.
   * @generated
   */
  LidlCompositionElement createLidlCompositionElement();

  /**
   * Returns a new object of class '<em>Composite Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Data Type</em>'.
   * @generated
   */
  CompositeDataType createCompositeDataType();

  /**
   * Returns a new object of class '<em>Ref Data Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Data Type</em>'.
   * @generated
   */
  RefDataType createRefDataType();

  /**
   * Returns a new object of class '<em>Composite Data Type Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Data Type Element</em>'.
   * @generated
   */
  CompositeDataTypeElement createCompositeDataTypeElement();

  /**
   * Returns a new object of class '<em>Ref Data Type Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Data Type Element</em>'.
   * @generated
   */
  RefDataTypeElement createRefDataTypeElement();

  /**
   * Returns a new object of class '<em>Atom Interface Type Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom Interface Type Element</em>'.
   * @generated
   */
  AtomInterfaceTypeElement createAtomInterfaceTypeElement();

  /**
   * Returns a new object of class '<em>Composite Interface Type Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Interface Type Element</em>'.
   * @generated
   */
  CompositeInterfaceTypeElement createCompositeInterfaceTypeElement();

  /**
   * Returns a new object of class '<em>Ref Interface Type Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Interface Type Element</em>'.
   * @generated
   */
  RefInterfaceTypeElement createRefInterfaceTypeElement();

  /**
   * Returns a new object of class '<em>Atom Interface Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom Interface Type</em>'.
   * @generated
   */
  AtomInterfaceType createAtomInterfaceType();

  /**
   * Returns a new object of class '<em>Composite Interface Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composite Interface Type</em>'.
   * @generated
   */
  CompositeInterfaceType createCompositeInterfaceType();

  /**
   * Returns a new object of class '<em>Ref Interface Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ref Interface Type</em>'.
   * @generated
   */
  RefInterfaceType createRefInterfaceType();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  LidlParameter createLidlParameter();

  /**
   * Returns a new object of class '<em>Text</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text</em>'.
   * @generated
   */
  LidlText createLidlText();

  /**
   * Returns a new object of class '<em>Call Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call Expression</em>'.
   * @generated
   */
  LidlCallExpression createLidlCallExpression();

  /**
   * Returns a new object of class '<em>Text Call Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Call Part</em>'.
   * @generated
   */
  TextCallPart createTextCallPart();

  /**
   * Returns a new object of class '<em>Param Call Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Param Call Part</em>'.
   * @generated
   */
  ParamCallPart createParamCallPart();

  /**
   * Returns a new object of class '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constant</em>'.
   * @generated
   */
  LidlStringConstant createLidlStringConstant();

  /**
   * Returns a new object of class '<em>Number Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Constant</em>'.
   * @generated
   */
  LidlNumberConstant createLidlNumberConstant();

  /**
   * Returns a new object of class '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Constant</em>'.
   * @generated
   */
  LidlBoolConstant createLidlBoolConstant();

  /**
   * Returns a new object of class '<em>Avtivation Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Avtivation Constant</em>'.
   * @generated
   */
  LidlAvtivationConstant createLidlAvtivationConstant();

  /**
   * Returns a new object of class '<em>Composition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Composition</em>'.
   * @generated
   */
  LidlComposition createLidlComposition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LidlPackage getLidlPackage();

} //LidlFactory
