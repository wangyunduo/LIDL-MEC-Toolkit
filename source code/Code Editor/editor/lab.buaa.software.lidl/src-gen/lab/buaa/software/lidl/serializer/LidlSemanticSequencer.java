/*
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import lab.buaa.software.lidl.lidl.AtomInterfaceType;
import lab.buaa.software.lidl.lidl.AtomInterfaceTypeElement;
import lab.buaa.software.lidl.lidl.CompositeDataType;
import lab.buaa.software.lidl.lidl.CompositeDataTypeElement;
import lab.buaa.software.lidl.lidl.CompositeInterfaceType;
import lab.buaa.software.lidl.lidl.CompositeInterfaceTypeElement;
import lab.buaa.software.lidl.lidl.LidlArrayItem;
import lab.buaa.software.lidl.lidl.LidlAvtivationConstant;
import lab.buaa.software.lidl.lidl.LidlBoolConstant;
import lab.buaa.software.lidl.lidl.LidlCallExpression;
import lab.buaa.software.lidl.lidl.LidlComposition;
import lab.buaa.software.lidl.lidl.LidlCompositionElement;
import lab.buaa.software.lidl.lidl.LidlData;
import lab.buaa.software.lidl.lidl.LidlExpression;
import lab.buaa.software.lidl.lidl.LidlImport;
import lab.buaa.software.lidl.lidl.LidlInteraction;
import lab.buaa.software.lidl.lidl.LidlInteractionID;
import lab.buaa.software.lidl.lidl.LidlInterface;
import lab.buaa.software.lidl.lidl.LidlNumberConstant;
import lab.buaa.software.lidl.lidl.LidlPackage;
import lab.buaa.software.lidl.lidl.LidlParameter;
import lab.buaa.software.lidl.lidl.LidlProgram;
import lab.buaa.software.lidl.lidl.LidlStringConstant;
import lab.buaa.software.lidl.lidl.LidlText;
import lab.buaa.software.lidl.lidl.ParamCallPart;
import lab.buaa.software.lidl.lidl.RefDataType;
import lab.buaa.software.lidl.lidl.RefDataTypeElement;
import lab.buaa.software.lidl.lidl.RefInterfaceType;
import lab.buaa.software.lidl.lidl.RefInterfaceTypeElement;
import lab.buaa.software.lidl.lidl.TextCallPart;
import lab.buaa.software.lidl.lidl.TypeElement;
import lab.buaa.software.lidl.services.LidlGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LidlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LidlGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LidlPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LidlPackage.ATOM_INTERFACE_TYPE:
				sequence_AtomInterfaceType(context, (AtomInterfaceType) semanticObject); 
				return; 
			case LidlPackage.ATOM_INTERFACE_TYPE_ELEMENT:
				sequence_AtomInterfaceTypeElement(context, (AtomInterfaceTypeElement) semanticObject); 
				return; 
			case LidlPackage.COMPOSITE_DATA_TYPE:
				sequence_CompositeDataType(context, (CompositeDataType) semanticObject); 
				return; 
			case LidlPackage.COMPOSITE_DATA_TYPE_ELEMENT:
				sequence_CompositeDataTypeElement(context, (CompositeDataTypeElement) semanticObject); 
				return; 
			case LidlPackage.COMPOSITE_INTERFACE_TYPE:
				sequence_CompositeInterfaceType(context, (CompositeInterfaceType) semanticObject); 
				return; 
			case LidlPackage.COMPOSITE_INTERFACE_TYPE_ELEMENT:
				sequence_CompositeInterfaceTypeElement(context, (CompositeInterfaceTypeElement) semanticObject); 
				return; 
			case LidlPackage.LIDL_ARRAY_ITEM:
				sequence_LidlArrayItem(context, (LidlArrayItem) semanticObject); 
				return; 
			case LidlPackage.LIDL_AVTIVATION_CONSTANT:
				sequence_LidlTerminalExpression(context, (LidlAvtivationConstant) semanticObject); 
				return; 
			case LidlPackage.LIDL_BOOL_CONSTANT:
				sequence_LidlTerminalExpression(context, (LidlBoolConstant) semanticObject); 
				return; 
			case LidlPackage.LIDL_CALL_EXPRESSION:
				sequence_LidlCallExpression(context, (LidlCallExpression) semanticObject); 
				return; 
			case LidlPackage.LIDL_COMPOSITION:
				sequence_LidlTerminalExpression(context, (LidlComposition) semanticObject); 
				return; 
			case LidlPackage.LIDL_COMPOSITION_ELEMENT:
				sequence_LidlCompositionElement(context, (LidlCompositionElement) semanticObject); 
				return; 
			case LidlPackage.LIDL_DATA:
				sequence_LidlData(context, (LidlData) semanticObject); 
				return; 
			case LidlPackage.LIDL_EXPRESSION:
				if (rule == grammarAccess.getLidlExpressionRule()
						|| rule == grammarAccess.getLidlArrayRule()) {
					sequence_LidlArray(context, (LidlExpression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLidlCompositionRule()) {
					sequence_LidlComposition(context, (LidlExpression) semanticObject); 
					return; 
				}
				else break;
			case LidlPackage.LIDL_IMPORT:
				sequence_LidlImport(context, (LidlImport) semanticObject); 
				return; 
			case LidlPackage.LIDL_INTERACTION:
				sequence_LidlInteraction(context, (LidlInteraction) semanticObject); 
				return; 
			case LidlPackage.LIDL_INTERACTION_ID:
				sequence_LidlInteractionID(context, (LidlInteractionID) semanticObject); 
				return; 
			case LidlPackage.LIDL_INTERFACE:
				sequence_LidlInterface(context, (LidlInterface) semanticObject); 
				return; 
			case LidlPackage.LIDL_NUMBER_CONSTANT:
				sequence_LidlTerminalExpression(context, (LidlNumberConstant) semanticObject); 
				return; 
			case LidlPackage.LIDL_PARAMETER:
				sequence_LidlParameter(context, (LidlParameter) semanticObject); 
				return; 
			case LidlPackage.LIDL_PROGRAM:
				sequence_LidlProgram(context, (LidlProgram) semanticObject); 
				return; 
			case LidlPackage.LIDL_STRING_CONSTANT:
				sequence_LidlTerminalExpression(context, (LidlStringConstant) semanticObject); 
				return; 
			case LidlPackage.LIDL_TEXT:
				sequence_LidlText(context, (LidlText) semanticObject); 
				return; 
			case LidlPackage.PARAM_CALL_PART:
				sequence_CallPart(context, (ParamCallPart) semanticObject); 
				return; 
			case LidlPackage.REF_DATA_TYPE:
				sequence_RefDataType(context, (RefDataType) semanticObject); 
				return; 
			case LidlPackage.REF_DATA_TYPE_ELEMENT:
				sequence_RefDataTypeElement(context, (RefDataTypeElement) semanticObject); 
				return; 
			case LidlPackage.REF_INTERFACE_TYPE:
				if (rule == grammarAccess.getLidlInterfaceTypeRule()) {
					sequence_LidlInterfaceType_RefInterfaceType(context, (RefInterfaceType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRefInterfaceTypeRule()) {
					sequence_RefInterfaceType(context, (RefInterfaceType) semanticObject); 
					return; 
				}
				else break;
			case LidlPackage.REF_INTERFACE_TYPE_ELEMENT:
				sequence_RefInterfaceTypeElement(context, (RefInterfaceTypeElement) semanticObject); 
				return; 
			case LidlPackage.TEXT_CALL_PART:
				sequence_CallPart(context, (TextCallPart) semanticObject); 
				return; 
			case LidlPackage.TYPE_ELEMENT:
				sequence_RefDataTypeElement(context, (TypeElement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     InterfaceElement returns AtomInterfaceTypeElement
	 *     AtomInterfaceTypeElement returns AtomInterfaceTypeElement
	 *
	 * Constraint:
	 *     (type=[LidlData|QualifiedName] direction=DataDirection)
	 */
	protected void sequence_AtomInterfaceTypeElement(ISerializationContext context, AtomInterfaceTypeElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.ATOM_INTERFACE_TYPE_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.ATOM_INTERFACE_TYPE_ELEMENT__TYPE));
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.ATOM_INTERFACE_TYPE_ELEMENT__DIRECTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.ATOM_INTERFACE_TYPE_ELEMENT__DIRECTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(LidlPackage.Literals.ATOM_INTERFACE_TYPE_ELEMENT__TYPE, false));
		feeder.accept(grammarAccess.getAtomInterfaceTypeElementAccess().getDirectionDataDirectionEnumRuleCall_2_0(), semanticObject.getDirection());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LidlInterfaceType returns AtomInterfaceType
	 *     AtomInterfaceType returns AtomInterfaceType
	 *
	 * Constraint:
	 *     items=AtomInterfaceTypeElement
	 */
	protected void sequence_AtomInterfaceType(ISerializationContext context, AtomInterfaceType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.ATOM_INTERFACE_TYPE__ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.ATOM_INTERFACE_TYPE__ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomInterfaceTypeAccess().getItemsAtomInterfaceTypeElementParserRuleCall_1_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CallPart returns ParamCallPart
	 *
	 * Constraint:
	 *     param=LidlExpression
	 */
	protected void sequence_CallPart(ISerializationContext context, ParamCallPart semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.PARAM_CALL_PART__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.PARAM_CALL_PART__PARAM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCallPartAccess().getParamLidlExpressionParserRuleCall_1_2_0(), semanticObject.getParam());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CallPart returns TextCallPart
	 *
	 * Constraint:
	 *     (text=ID | text=LIDLIDSYMBOL | text=',' | text='.')
	 */
	protected void sequence_CallPart(ISerializationContext context, TextCallPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeElement returns CompositeDataTypeElement
	 *     CompositeDataTypeElement returns CompositeDataTypeElement
	 *
	 * Constraint:
	 *     (name=ID (type=[LidlData|QualifiedName] | (isArray?='[' type=[LidlData|QualifiedName])))
	 */
	protected void sequence_CompositeDataTypeElement(ISerializationContext context, CompositeDataTypeElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlDataType returns CompositeDataType
	 *     CompositeDataType returns CompositeDataType
	 *
	 * Constraint:
	 *     (items+=CompositeDataTypeElement items+=CompositeDataTypeElement*)
	 */
	protected void sequence_CompositeDataType(ISerializationContext context, CompositeDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceElement returns CompositeInterfaceTypeElement
	 *     CompositeInterfaceTypeElement returns CompositeInterfaceTypeElement
	 *     LidlSymbol returns CompositeInterfaceTypeElement
	 *
	 * Constraint:
	 *     (name=ID ((type=[LidlData|QualifiedName] direction=DataDirection) | type=[LidlInterface|QualifiedName]))
	 */
	protected void sequence_CompositeInterfaceTypeElement(ISerializationContext context, CompositeInterfaceTypeElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlInterfaceType returns CompositeInterfaceType
	 *     CompositeInterfaceType returns CompositeInterfaceType
	 *
	 * Constraint:
	 *     (items+=CompositeInterfaceTypeElement items+=CompositeInterfaceTypeElement*)
	 */
	protected void sequence_CompositeInterfaceType(ISerializationContext context, CompositeInterfaceType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlArrayItem returns LidlArrayItem
	 *
	 * Constraint:
	 *     value=LidlExpression
	 */
	protected void sequence_LidlArrayItem(ISerializationContext context, LidlArrayItem semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_ARRAY_ITEM__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_ARRAY_ITEM__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLidlArrayItemAccess().getValueLidlExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LidlExpression returns LidlExpression
	 *     LidlArray returns LidlExpression
	 *
	 * Constraint:
	 *     (item+=LidlArrayItem item+=LidlArrayItem*)*
	 */
	protected void sequence_LidlArray(ISerializationContext context, LidlExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlExpression returns LidlCallExpression
	 *     LidlCallExpression returns LidlCallExpression
	 *
	 * Constraint:
	 *     items+=CallPart+
	 */
	protected void sequence_LidlCallExpression(ISerializationContext context, LidlCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlSymbol returns LidlCompositionElement
	 *     LidlCompositionElement returns LidlCompositionElement
	 *
	 * Constraint:
	 *     (param=ID value=LidlExpression)
	 */
	protected void sequence_LidlCompositionElement(ISerializationContext context, LidlCompositionElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_COMPOSITION_ELEMENT__PARAM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_COMPOSITION_ELEMENT__PARAM));
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_COMPOSITION_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_COMPOSITION_ELEMENT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLidlCompositionElementAccess().getParamIDTerminalRuleCall_0_0(), semanticObject.getParam());
		feeder.accept(grammarAccess.getLidlCompositionElementAccess().getValueLidlExpressionParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LidlComposition returns LidlExpression
	 *
	 * Constraint:
	 *     (items+=LidlCompositionElement items+=LidlCompositionElement*)
	 */
	protected void sequence_LidlComposition(ISerializationContext context, LidlExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlDefinition returns LidlData
	 *     LidlData returns LidlData
	 *
	 * Constraint:
	 *     (name=ID (nested?='with' nestedDef+=LidlData+)? (definition=LidlDataType | defined?='Undefined'))
	 */
	protected void sequence_LidlData(ISerializationContext context, LidlData semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlImport returns LidlImport
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_LidlImport(ISerializationContext context, LidlImport semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLidlImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LidlInteractionID returns LidlInteractionID
	 *
	 * Constraint:
	 *     items+=IDPart+
	 */
	protected void sequence_LidlInteractionID(ISerializationContext context, LidlInteractionID semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlDefinition returns LidlInteraction
	 *     LidlInteraction returns LidlInteraction
	 *
	 * Constraint:
	 *     (id=LidlInteractionID interface=LidlInterfaceType (nested?='with' nestedDef+=LidlInteraction+)? definition=LidlExpression)
	 */
	protected void sequence_LidlInteraction(ISerializationContext context, LidlInteraction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlInterfaceType returns RefInterfaceType
	 *
	 * Constraint:
	 *     (items=RefInterfaceTypeElement conjugate?='''?)
	 */
	protected void sequence_LidlInterfaceType_RefInterfaceType(ISerializationContext context, RefInterfaceType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlDefinition returns LidlInterface
	 *     LidlInterface returns LidlInterface
	 *
	 * Constraint:
	 *     (name=ID (nested?='with' nestedDef+=LidlInterface+)? (definition=LidlInterfaceType | defined?='Undefined'))
	 */
	protected void sequence_LidlInterface(ISerializationContext context, LidlInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     IDPart returns LidlParameter
	 *     LidlParameter returns LidlParameter
	 *     LidlSymbol returns LidlParameter
	 *
	 * Constraint:
	 *     (name=ID interface=LidlInterfaceType)
	 */
	protected void sequence_LidlParameter(ISerializationContext context, LidlParameter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_PARAMETER__NAME));
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_PARAMETER__INTERFACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_PARAMETER__INTERFACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLidlParameterAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLidlParameterAccess().getInterfaceLidlInterfaceTypeParserRuleCall_4_0(), semanticObject.getInterface());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LidlProgram returns LidlProgram
	 *
	 * Constraint:
	 *     (
	 *         (pack?='package' name=QualifiedName ((imports+=LidlImport+ definitions+=LidlDefinition+) | definitions+=LidlDefinition+)) | 
	 *         (imports+=LidlImport+ definitions+=LidlDefinition+) | 
	 *         definitions+=LidlDefinition+
	 *     )?
	 */
	protected void sequence_LidlProgram(ISerializationContext context, LidlProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlExpression returns LidlAvtivationConstant
	 *     LidlTerminalExpression returns LidlAvtivationConstant
	 *
	 * Constraint:
	 *     (value='active' | value='inactive')
	 */
	protected void sequence_LidlTerminalExpression(ISerializationContext context, LidlAvtivationConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlExpression returns LidlBoolConstant
	 *     LidlTerminalExpression returns LidlBoolConstant
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_LidlTerminalExpression(ISerializationContext context, LidlBoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LidlExpression returns LidlComposition
	 *     LidlTerminalExpression returns LidlComposition
	 *
	 * Constraint:
	 *     body=LidlComposition
	 */
	protected void sequence_LidlTerminalExpression(ISerializationContext context, LidlComposition semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_COMPOSITION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_COMPOSITION__BODY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLidlTerminalExpressionAccess().getBodyLidlCompositionParserRuleCall_4_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LidlExpression returns LidlNumberConstant
	 *     LidlTerminalExpression returns LidlNumberConstant
	 *
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_LidlTerminalExpression(ISerializationContext context, LidlNumberConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_NUMBER_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_NUMBER_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLidlTerminalExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LidlExpression returns LidlStringConstant
	 *     LidlTerminalExpression returns LidlStringConstant
	 *
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_LidlTerminalExpression(ISerializationContext context, LidlStringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.LIDL_STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.LIDL_STRING_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLidlTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     IDPart returns LidlText
	 *     LidlText returns LidlText
	 *
	 * Constraint:
	 *     (text=ID | text=LIDLIDSYMBOL)
	 */
	protected void sequence_LidlText(ISerializationContext context, LidlText semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeElement returns RefDataTypeElement
	 *     RefDataTypeElement returns RefDataTypeElement
	 *
	 * Constraint:
	 *     type=[LidlData|QualifiedName]
	 */
	protected void sequence_RefDataTypeElement(ISerializationContext context, RefDataTypeElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.TYPE_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.TYPE_ELEMENT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_0_1_0_1(), semanticObject.eGet(LidlPackage.Literals.TYPE_ELEMENT__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeElement returns TypeElement
	 *     RefDataTypeElement returns TypeElement
	 *
	 * Constraint:
	 *     (isArray?='[' type=[LidlData|QualifiedName])
	 */
	protected void sequence_RefDataTypeElement(ISerializationContext context, TypeElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.TYPE_ELEMENT__IS_ARRAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.TYPE_ELEMENT__IS_ARRAY));
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.TYPE_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.TYPE_ELEMENT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRefDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_1_0_0(), semanticObject.isIsArray());
		feeder.accept(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_1_1_0_1(), semanticObject.eGet(LidlPackage.Literals.TYPE_ELEMENT__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LidlDataType returns RefDataType
	 *     RefDataType returns RefDataType
	 *
	 * Constraint:
	 *     items+=RefDataTypeElement
	 */
	protected void sequence_RefDataType(ISerializationContext context, RefDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InterfaceElement returns RefInterfaceTypeElement
	 *     RefInterfaceTypeElement returns RefInterfaceTypeElement
	 *
	 * Constraint:
	 *     type=[LidlInterface|QualifiedName]
	 */
	protected void sequence_RefInterfaceTypeElement(ISerializationContext context, RefInterfaceTypeElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.REF_INTERFACE_TYPE_ELEMENT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.REF_INTERFACE_TYPE_ELEMENT__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRefInterfaceTypeElementAccess().getTypeLidlInterfaceQualifiedNameParserRuleCall_1_0_1(), semanticObject.eGet(LidlPackage.Literals.REF_INTERFACE_TYPE_ELEMENT__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RefInterfaceType returns RefInterfaceType
	 *
	 * Constraint:
	 *     items=RefInterfaceTypeElement
	 */
	protected void sequence_RefInterfaceType(ISerializationContext context, RefInterfaceType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LidlPackage.Literals.REF_INTERFACE_TYPE__ITEMS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LidlPackage.Literals.REF_INTERFACE_TYPE__ITEMS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRefInterfaceTypeAccess().getItemsRefInterfaceTypeElementParserRuleCall_1_0(), semanticObject.getItems());
		feeder.finish();
	}
	
	
}