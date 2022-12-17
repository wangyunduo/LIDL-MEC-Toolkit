/*
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import lab.buaa.software.lidl.ide.contentassist.antlr.internal.InternalLidlParser;
import lab.buaa.software.lidl.services.LidlGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LidlParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LidlGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LidlGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getLidlDefinitionAccess().getAlternatives(), "rule__LidlDefinition__Alternatives");
			builder.put(grammarAccess.getLidlDataAccess().getAlternatives_4(), "rule__LidlData__Alternatives_4");
			builder.put(grammarAccess.getLidlDataTypeAccess().getAlternatives(), "rule__LidlDataType__Alternatives");
			builder.put(grammarAccess.getTypeElementAccess().getAlternatives(), "rule__TypeElement__Alternatives");
			builder.put(grammarAccess.getCompositeDataTypeElementAccess().getAlternatives_3(), "rule__CompositeDataTypeElement__Alternatives_3");
			builder.put(grammarAccess.getRefDataTypeElementAccess().getAlternatives(), "rule__RefDataTypeElement__Alternatives");
			builder.put(grammarAccess.getLidlInterfaceAccess().getAlternatives_4(), "rule__LidlInterface__Alternatives_4");
			builder.put(grammarAccess.getLidlInterfaceTypeAccess().getAlternatives(), "rule__LidlInterfaceType__Alternatives");
			builder.put(grammarAccess.getInterfaceElementAccess().getAlternatives(), "rule__InterfaceElement__Alternatives");
			builder.put(grammarAccess.getCompositeInterfaceTypeElementAccess().getAlternatives_3(), "rule__CompositeInterfaceTypeElement__Alternatives_3");
			builder.put(grammarAccess.getIDPartAccess().getAlternatives(), "rule__IDPart__Alternatives");
			builder.put(grammarAccess.getLidlTextAccess().getTextAlternatives_1_0(), "rule__LidlText__TextAlternatives_1_0");
			builder.put(grammarAccess.getLidlExpressionAccess().getAlternatives(), "rule__LidlExpression__Alternatives");
			builder.put(grammarAccess.getCallPartAccess().getAlternatives(), "rule__CallPart__Alternatives");
			builder.put(grammarAccess.getCallPartAccess().getTextAlternatives_0_1_0(), "rule__CallPart__TextAlternatives_0_1_0");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getAlternatives(), "rule__LidlTerminalExpression__Alternatives");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getValueAlternatives_2_1_0(), "rule__LidlTerminalExpression__ValueAlternatives_2_1_0");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getValueAlternatives_3_1_0(), "rule__LidlTerminalExpression__ValueAlternatives_3_1_0");
			builder.put(grammarAccess.getLidlSymbolAccess().getAlternatives(), "rule__LidlSymbol__Alternatives");
			builder.put(grammarAccess.getDataDirectionAccess().getAlternatives(), "rule__DataDirection__Alternatives");
			builder.put(grammarAccess.getLidlProgramAccess().getGroup(), "rule__LidlProgram__Group__0");
			builder.put(grammarAccess.getLidlProgramAccess().getGroup_0(), "rule__LidlProgram__Group_0__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getLidlImportAccess().getGroup(), "rule__LidlImport__Group__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getLidlDataAccess().getGroup(), "rule__LidlData__Group__0");
			builder.put(grammarAccess.getLidlDataAccess().getGroup_2(), "rule__LidlData__Group_2__0");
			builder.put(grammarAccess.getCompositeDataTypeAccess().getGroup(), "rule__CompositeDataType__Group__0");
			builder.put(grammarAccess.getCompositeDataTypeAccess().getGroup_3(), "rule__CompositeDataType__Group_3__0");
			builder.put(grammarAccess.getRefDataTypeAccess().getGroup(), "rule__RefDataType__Group__0");
			builder.put(grammarAccess.getCompositeDataTypeElementAccess().getGroup(), "rule__CompositeDataTypeElement__Group__0");
			builder.put(grammarAccess.getCompositeDataTypeElementAccess().getGroup_3_1(), "rule__CompositeDataTypeElement__Group_3_1__0");
			builder.put(grammarAccess.getRefDataTypeElementAccess().getGroup_0(), "rule__RefDataTypeElement__Group_0__0");
			builder.put(grammarAccess.getRefDataTypeElementAccess().getGroup_1(), "rule__RefDataTypeElement__Group_1__0");
			builder.put(grammarAccess.getLidlInterfaceAccess().getGroup(), "rule__LidlInterface__Group__0");
			builder.put(grammarAccess.getLidlInterfaceAccess().getGroup_2(), "rule__LidlInterface__Group_2__0");
			builder.put(grammarAccess.getLidlInterfaceTypeAccess().getGroup_2(), "rule__LidlInterfaceType__Group_2__0");
			builder.put(grammarAccess.getAtomInterfaceTypeElementAccess().getGroup(), "rule__AtomInterfaceTypeElement__Group__0");
			builder.put(grammarAccess.getCompositeInterfaceTypeElementAccess().getGroup(), "rule__CompositeInterfaceTypeElement__Group__0");
			builder.put(grammarAccess.getCompositeInterfaceTypeElementAccess().getGroup_3_0(), "rule__CompositeInterfaceTypeElement__Group_3_0__0");
			builder.put(grammarAccess.getRefInterfaceTypeElementAccess().getGroup(), "rule__RefInterfaceTypeElement__Group__0");
			builder.put(grammarAccess.getAtomInterfaceTypeAccess().getGroup(), "rule__AtomInterfaceType__Group__0");
			builder.put(grammarAccess.getCompositeInterfaceTypeAccess().getGroup(), "rule__CompositeInterfaceType__Group__0");
			builder.put(grammarAccess.getCompositeInterfaceTypeAccess().getGroup_3(), "rule__CompositeInterfaceType__Group_3__0");
			builder.put(grammarAccess.getRefInterfaceTypeAccess().getGroup(), "rule__RefInterfaceType__Group__0");
			builder.put(grammarAccess.getLidlInteractionAccess().getGroup(), "rule__LidlInteraction__Group__0");
			builder.put(grammarAccess.getLidlInteractionAccess().getGroup_4(), "rule__LidlInteraction__Group_4__0");
			builder.put(grammarAccess.getLidlInteractionIDAccess().getGroup(), "rule__LidlInteractionID__Group__0");
			builder.put(grammarAccess.getLidlParameterAccess().getGroup(), "rule__LidlParameter__Group__0");
			builder.put(grammarAccess.getLidlTextAccess().getGroup(), "rule__LidlText__Group__0");
			builder.put(grammarAccess.getLidlCallExpressionAccess().getGroup(), "rule__LidlCallExpression__Group__0");
			builder.put(grammarAccess.getCallPartAccess().getGroup_0(), "rule__CallPart__Group_0__0");
			builder.put(grammarAccess.getCallPartAccess().getGroup_1(), "rule__CallPart__Group_1__0");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getGroup_0(), "rule__LidlTerminalExpression__Group_0__0");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getGroup_1(), "rule__LidlTerminalExpression__Group_1__0");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getGroup_2(), "rule__LidlTerminalExpression__Group_2__0");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getGroup_3(), "rule__LidlTerminalExpression__Group_3__0");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getGroup_4(), "rule__LidlTerminalExpression__Group_4__0");
			builder.put(grammarAccess.getLidlArrayAccess().getGroup(), "rule__LidlArray__Group__0");
			builder.put(grammarAccess.getLidlArrayAccess().getGroup_2(), "rule__LidlArray__Group_2__0");
			builder.put(grammarAccess.getLidlArrayAccess().getGroup_2_1(), "rule__LidlArray__Group_2_1__0");
			builder.put(grammarAccess.getLidlArrayItemAccess().getGroup(), "rule__LidlArrayItem__Group__0");
			builder.put(grammarAccess.getLidlCompositionElementAccess().getGroup(), "rule__LidlCompositionElement__Group__0");
			builder.put(grammarAccess.getLidlCompositionAccess().getGroup(), "rule__LidlComposition__Group__0");
			builder.put(grammarAccess.getLidlCompositionAccess().getGroup_2(), "rule__LidlComposition__Group_2__0");
			builder.put(grammarAccess.getLidlProgramAccess().getPackAssignment_0_0(), "rule__LidlProgram__PackAssignment_0_0");
			builder.put(grammarAccess.getLidlProgramAccess().getNameAssignment_0_1(), "rule__LidlProgram__NameAssignment_0_1");
			builder.put(grammarAccess.getLidlProgramAccess().getImportsAssignment_1(), "rule__LidlProgram__ImportsAssignment_1");
			builder.put(grammarAccess.getLidlProgramAccess().getDefinitionsAssignment_2(), "rule__LidlProgram__DefinitionsAssignment_2");
			builder.put(grammarAccess.getLidlImportAccess().getImportedNamespaceAssignment_1(), "rule__LidlImport__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getLidlDataAccess().getNameAssignment_1(), "rule__LidlData__NameAssignment_1");
			builder.put(grammarAccess.getLidlDataAccess().getNestedAssignment_2_0(), "rule__LidlData__NestedAssignment_2_0");
			builder.put(grammarAccess.getLidlDataAccess().getNestedDefAssignment_2_1(), "rule__LidlData__NestedDefAssignment_2_1");
			builder.put(grammarAccess.getLidlDataAccess().getDefinitionAssignment_4_0(), "rule__LidlData__DefinitionAssignment_4_0");
			builder.put(grammarAccess.getLidlDataAccess().getDefinedAssignment_4_1(), "rule__LidlData__DefinedAssignment_4_1");
			builder.put(grammarAccess.getCompositeDataTypeAccess().getItemsAssignment_2(), "rule__CompositeDataType__ItemsAssignment_2");
			builder.put(grammarAccess.getCompositeDataTypeAccess().getItemsAssignment_3_1(), "rule__CompositeDataType__ItemsAssignment_3_1");
			builder.put(grammarAccess.getRefDataTypeAccess().getItemsAssignment_1(), "rule__RefDataType__ItemsAssignment_1");
			builder.put(grammarAccess.getCompositeDataTypeElementAccess().getNameAssignment_1(), "rule__CompositeDataTypeElement__NameAssignment_1");
			builder.put(grammarAccess.getCompositeDataTypeElementAccess().getTypeAssignment_3_0(), "rule__CompositeDataTypeElement__TypeAssignment_3_0");
			builder.put(grammarAccess.getCompositeDataTypeElementAccess().getIsArrayAssignment_3_1_0(), "rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0");
			builder.put(grammarAccess.getCompositeDataTypeElementAccess().getTypeAssignment_3_1_1(), "rule__CompositeDataTypeElement__TypeAssignment_3_1_1");
			builder.put(grammarAccess.getRefDataTypeElementAccess().getTypeAssignment_0_1(), "rule__RefDataTypeElement__TypeAssignment_0_1");
			builder.put(grammarAccess.getRefDataTypeElementAccess().getIsArrayAssignment_1_0(), "rule__RefDataTypeElement__IsArrayAssignment_1_0");
			builder.put(grammarAccess.getRefDataTypeElementAccess().getTypeAssignment_1_1(), "rule__RefDataTypeElement__TypeAssignment_1_1");
			builder.put(grammarAccess.getLidlInterfaceAccess().getNameAssignment_1(), "rule__LidlInterface__NameAssignment_1");
			builder.put(grammarAccess.getLidlInterfaceAccess().getNestedAssignment_2_0(), "rule__LidlInterface__NestedAssignment_2_0");
			builder.put(grammarAccess.getLidlInterfaceAccess().getNestedDefAssignment_2_1(), "rule__LidlInterface__NestedDefAssignment_2_1");
			builder.put(grammarAccess.getLidlInterfaceAccess().getDefinitionAssignment_4_0(), "rule__LidlInterface__DefinitionAssignment_4_0");
			builder.put(grammarAccess.getLidlInterfaceAccess().getDefinedAssignment_4_1(), "rule__LidlInterface__DefinedAssignment_4_1");
			builder.put(grammarAccess.getLidlInterfaceTypeAccess().getConjugateAssignment_2_1(), "rule__LidlInterfaceType__ConjugateAssignment_2_1");
			builder.put(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeAssignment_1(), "rule__AtomInterfaceTypeElement__TypeAssignment_1");
			builder.put(grammarAccess.getAtomInterfaceTypeElementAccess().getDirectionAssignment_2(), "rule__AtomInterfaceTypeElement__DirectionAssignment_2");
			builder.put(grammarAccess.getCompositeInterfaceTypeElementAccess().getNameAssignment_1(), "rule__CompositeInterfaceTypeElement__NameAssignment_1");
			builder.put(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeAssignment_3_0_0(), "rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0");
			builder.put(grammarAccess.getCompositeInterfaceTypeElementAccess().getDirectionAssignment_3_0_1(), "rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1");
			builder.put(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeAssignment_3_1(), "rule__CompositeInterfaceTypeElement__TypeAssignment_3_1");
			builder.put(grammarAccess.getRefInterfaceTypeElementAccess().getTypeAssignment_1(), "rule__RefInterfaceTypeElement__TypeAssignment_1");
			builder.put(grammarAccess.getAtomInterfaceTypeAccess().getItemsAssignment_1(), "rule__AtomInterfaceType__ItemsAssignment_1");
			builder.put(grammarAccess.getCompositeInterfaceTypeAccess().getItemsAssignment_2(), "rule__CompositeInterfaceType__ItemsAssignment_2");
			builder.put(grammarAccess.getCompositeInterfaceTypeAccess().getItemsAssignment_3_1(), "rule__CompositeInterfaceType__ItemsAssignment_3_1");
			builder.put(grammarAccess.getRefInterfaceTypeAccess().getItemsAssignment_1(), "rule__RefInterfaceType__ItemsAssignment_1");
			builder.put(grammarAccess.getLidlInteractionAccess().getIdAssignment_1(), "rule__LidlInteraction__IdAssignment_1");
			builder.put(grammarAccess.getLidlInteractionAccess().getInterfaceAssignment_3(), "rule__LidlInteraction__InterfaceAssignment_3");
			builder.put(grammarAccess.getLidlInteractionAccess().getNestedAssignment_4_0(), "rule__LidlInteraction__NestedAssignment_4_0");
			builder.put(grammarAccess.getLidlInteractionAccess().getNestedDefAssignment_4_1(), "rule__LidlInteraction__NestedDefAssignment_4_1");
			builder.put(grammarAccess.getLidlInteractionAccess().getDefinitionAssignment_7(), "rule__LidlInteraction__DefinitionAssignment_7");
			builder.put(grammarAccess.getLidlInteractionIDAccess().getItemsAssignment_1(), "rule__LidlInteractionID__ItemsAssignment_1");
			builder.put(grammarAccess.getLidlParameterAccess().getNameAssignment_2(), "rule__LidlParameter__NameAssignment_2");
			builder.put(grammarAccess.getLidlParameterAccess().getInterfaceAssignment_4(), "rule__LidlParameter__InterfaceAssignment_4");
			builder.put(grammarAccess.getLidlTextAccess().getTextAssignment_1(), "rule__LidlText__TextAssignment_1");
			builder.put(grammarAccess.getLidlCallExpressionAccess().getItemsAssignment_1(), "rule__LidlCallExpression__ItemsAssignment_1");
			builder.put(grammarAccess.getCallPartAccess().getTextAssignment_0_1(), "rule__CallPart__TextAssignment_0_1");
			builder.put(grammarAccess.getCallPartAccess().getParamAssignment_1_2(), "rule__CallPart__ParamAssignment_1_2");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_0_1(), "rule__LidlTerminalExpression__ValueAssignment_0_1");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_1_1(), "rule__LidlTerminalExpression__ValueAssignment_1_1");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_2_1(), "rule__LidlTerminalExpression__ValueAssignment_2_1");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_3_1(), "rule__LidlTerminalExpression__ValueAssignment_3_1");
			builder.put(grammarAccess.getLidlTerminalExpressionAccess().getBodyAssignment_4_1(), "rule__LidlTerminalExpression__BodyAssignment_4_1");
			builder.put(grammarAccess.getLidlArrayAccess().getItemAssignment_2_0(), "rule__LidlArray__ItemAssignment_2_0");
			builder.put(grammarAccess.getLidlArrayAccess().getItemAssignment_2_1_1(), "rule__LidlArray__ItemAssignment_2_1_1");
			builder.put(grammarAccess.getLidlArrayItemAccess().getValueAssignment_1(), "rule__LidlArrayItem__ValueAssignment_1");
			builder.put(grammarAccess.getLidlCompositionElementAccess().getParamAssignment_0(), "rule__LidlCompositionElement__ParamAssignment_0");
			builder.put(grammarAccess.getLidlCompositionElementAccess().getValueAssignment_3(), "rule__LidlCompositionElement__ValueAssignment_3");
			builder.put(grammarAccess.getLidlCompositionAccess().getItemsAssignment_1(), "rule__LidlComposition__ItemsAssignment_1");
			builder.put(grammarAccess.getLidlCompositionAccess().getItemsAssignment_2_1(), "rule__LidlComposition__ItemsAssignment_2_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LidlGrammarAccess grammarAccess;

	@Override
	protected InternalLidlParser createParser() {
		InternalLidlParser result = new InternalLidlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LidlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LidlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}