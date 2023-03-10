/*
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.parser.antlr;

import com.google.inject.Inject;
import lab.buaa.software.lidl.parser.antlr.internal.InternalLidlParser;
import lab.buaa.software.lidl.services.LidlGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class LidlParser extends AbstractAntlrParser {

	@Inject
	private LidlGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalLidlParser createParser(XtextTokenStream stream) {
		return new InternalLidlParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "LidlProgram";
	}

	public LidlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LidlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
