package lab.buaa.software.lidl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import lab.buaa.software.lidl.services.LidlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLidlParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LIDLIDSYMBOL", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "','", "'.'", "'true'", "'false'", "'active'", "'inactive'", "'in'", "'out'", "';'", "'import'", "'.*'", "'data'", "'is'", "'{'", "'}'", "':'", "']'", "'interface'", "'interaction'", "'('", "')'", "'['", "'package'", "'with'", "'Undefined'", "'\\''"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_LIDLIDSYMBOL=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLidlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLidlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLidlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLidl.g"; }


    	private LidlGrammarAccess grammarAccess;

    	public void setGrammarAccess(LidlGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleLidlProgram"
    // InternalLidl.g:53:1: entryRuleLidlProgram : ruleLidlProgram EOF ;
    public final void entryRuleLidlProgram() throws RecognitionException {
        try {
            // InternalLidl.g:54:1: ( ruleLidlProgram EOF )
            // InternalLidl.g:55:1: ruleLidlProgram EOF
            {
             before(grammarAccess.getLidlProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlProgram();

            state._fsp--;

             after(grammarAccess.getLidlProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlProgram"


    // $ANTLR start "ruleLidlProgram"
    // InternalLidl.g:62:1: ruleLidlProgram : ( ( rule__LidlProgram__Group__0 ) ) ;
    public final void ruleLidlProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:66:2: ( ( ( rule__LidlProgram__Group__0 ) ) )
            // InternalLidl.g:67:2: ( ( rule__LidlProgram__Group__0 ) )
            {
            // InternalLidl.g:67:2: ( ( rule__LidlProgram__Group__0 ) )
            // InternalLidl.g:68:3: ( rule__LidlProgram__Group__0 )
            {
             before(grammarAccess.getLidlProgramAccess().getGroup()); 
            // InternalLidl.g:69:3: ( rule__LidlProgram__Group__0 )
            // InternalLidl.g:69:4: rule__LidlProgram__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlProgram__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlProgram"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLidl.g:78:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalLidl.g:79:1: ( ruleQualifiedName EOF )
            // InternalLidl.g:80:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLidl.g:87:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:91:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalLidl.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalLidl.g:92:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalLidl.g:93:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalLidl.g:94:3: ( rule__QualifiedName__Group__0 )
            // InternalLidl.g:94:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLidlImport"
    // InternalLidl.g:103:1: entryRuleLidlImport : ruleLidlImport EOF ;
    public final void entryRuleLidlImport() throws RecognitionException {
        try {
            // InternalLidl.g:104:1: ( ruleLidlImport EOF )
            // InternalLidl.g:105:1: ruleLidlImport EOF
            {
             before(grammarAccess.getLidlImportRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlImport();

            state._fsp--;

             after(grammarAccess.getLidlImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlImport"


    // $ANTLR start "ruleLidlImport"
    // InternalLidl.g:112:1: ruleLidlImport : ( ( rule__LidlImport__Group__0 ) ) ;
    public final void ruleLidlImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:116:2: ( ( ( rule__LidlImport__Group__0 ) ) )
            // InternalLidl.g:117:2: ( ( rule__LidlImport__Group__0 ) )
            {
            // InternalLidl.g:117:2: ( ( rule__LidlImport__Group__0 ) )
            // InternalLidl.g:118:3: ( rule__LidlImport__Group__0 )
            {
             before(grammarAccess.getLidlImportAccess().getGroup()); 
            // InternalLidl.g:119:3: ( rule__LidlImport__Group__0 )
            // InternalLidl.g:119:4: rule__LidlImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalLidl.g:128:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalLidl.g:129:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalLidl.g:130:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalLidl.g:137:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:141:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalLidl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalLidl.g:142:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalLidl.g:143:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalLidl.g:144:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalLidl.g:144:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleLidlDefinition"
    // InternalLidl.g:153:1: entryRuleLidlDefinition : ruleLidlDefinition EOF ;
    public final void entryRuleLidlDefinition() throws RecognitionException {
        try {
            // InternalLidl.g:154:1: ( ruleLidlDefinition EOF )
            // InternalLidl.g:155:1: ruleLidlDefinition EOF
            {
             before(grammarAccess.getLidlDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlDefinition();

            state._fsp--;

             after(grammarAccess.getLidlDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlDefinition"


    // $ANTLR start "ruleLidlDefinition"
    // InternalLidl.g:162:1: ruleLidlDefinition : ( ( rule__LidlDefinition__Alternatives ) ) ;
    public final void ruleLidlDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:166:2: ( ( ( rule__LidlDefinition__Alternatives ) ) )
            // InternalLidl.g:167:2: ( ( rule__LidlDefinition__Alternatives ) )
            {
            // InternalLidl.g:167:2: ( ( rule__LidlDefinition__Alternatives ) )
            // InternalLidl.g:168:3: ( rule__LidlDefinition__Alternatives )
            {
             before(grammarAccess.getLidlDefinitionAccess().getAlternatives()); 
            // InternalLidl.g:169:3: ( rule__LidlDefinition__Alternatives )
            // InternalLidl.g:169:4: rule__LidlDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LidlDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLidlDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlDefinition"


    // $ANTLR start "entryRuleLidlData"
    // InternalLidl.g:178:1: entryRuleLidlData : ruleLidlData EOF ;
    public final void entryRuleLidlData() throws RecognitionException {
        try {
            // InternalLidl.g:179:1: ( ruleLidlData EOF )
            // InternalLidl.g:180:1: ruleLidlData EOF
            {
             before(grammarAccess.getLidlDataRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlData();

            state._fsp--;

             after(grammarAccess.getLidlDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlData"


    // $ANTLR start "ruleLidlData"
    // InternalLidl.g:187:1: ruleLidlData : ( ( rule__LidlData__Group__0 ) ) ;
    public final void ruleLidlData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:191:2: ( ( ( rule__LidlData__Group__0 ) ) )
            // InternalLidl.g:192:2: ( ( rule__LidlData__Group__0 ) )
            {
            // InternalLidl.g:192:2: ( ( rule__LidlData__Group__0 ) )
            // InternalLidl.g:193:3: ( rule__LidlData__Group__0 )
            {
             before(grammarAccess.getLidlDataAccess().getGroup()); 
            // InternalLidl.g:194:3: ( rule__LidlData__Group__0 )
            // InternalLidl.g:194:4: rule__LidlData__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlData__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlDataAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlData"


    // $ANTLR start "entryRuleLidlDataType"
    // InternalLidl.g:203:1: entryRuleLidlDataType : ruleLidlDataType EOF ;
    public final void entryRuleLidlDataType() throws RecognitionException {
        try {
            // InternalLidl.g:204:1: ( ruleLidlDataType EOF )
            // InternalLidl.g:205:1: ruleLidlDataType EOF
            {
             before(grammarAccess.getLidlDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlDataType();

            state._fsp--;

             after(grammarAccess.getLidlDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlDataType"


    // $ANTLR start "ruleLidlDataType"
    // InternalLidl.g:212:1: ruleLidlDataType : ( ( rule__LidlDataType__Alternatives ) ) ;
    public final void ruleLidlDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:216:2: ( ( ( rule__LidlDataType__Alternatives ) ) )
            // InternalLidl.g:217:2: ( ( rule__LidlDataType__Alternatives ) )
            {
            // InternalLidl.g:217:2: ( ( rule__LidlDataType__Alternatives ) )
            // InternalLidl.g:218:3: ( rule__LidlDataType__Alternatives )
            {
             before(grammarAccess.getLidlDataTypeAccess().getAlternatives()); 
            // InternalLidl.g:219:3: ( rule__LidlDataType__Alternatives )
            // InternalLidl.g:219:4: rule__LidlDataType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LidlDataType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLidlDataTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlDataType"


    // $ANTLR start "entryRuleCompositeDataType"
    // InternalLidl.g:228:1: entryRuleCompositeDataType : ruleCompositeDataType EOF ;
    public final void entryRuleCompositeDataType() throws RecognitionException {
        try {
            // InternalLidl.g:229:1: ( ruleCompositeDataType EOF )
            // InternalLidl.g:230:1: ruleCompositeDataType EOF
            {
             before(grammarAccess.getCompositeDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeDataType();

            state._fsp--;

             after(grammarAccess.getCompositeDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeDataType"


    // $ANTLR start "ruleCompositeDataType"
    // InternalLidl.g:237:1: ruleCompositeDataType : ( ( rule__CompositeDataType__Group__0 ) ) ;
    public final void ruleCompositeDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:241:2: ( ( ( rule__CompositeDataType__Group__0 ) ) )
            // InternalLidl.g:242:2: ( ( rule__CompositeDataType__Group__0 ) )
            {
            // InternalLidl.g:242:2: ( ( rule__CompositeDataType__Group__0 ) )
            // InternalLidl.g:243:3: ( rule__CompositeDataType__Group__0 )
            {
             before(grammarAccess.getCompositeDataTypeAccess().getGroup()); 
            // InternalLidl.g:244:3: ( rule__CompositeDataType__Group__0 )
            // InternalLidl.g:244:4: rule__CompositeDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeDataType"


    // $ANTLR start "entryRuleRefDataType"
    // InternalLidl.g:253:1: entryRuleRefDataType : ruleRefDataType EOF ;
    public final void entryRuleRefDataType() throws RecognitionException {
        try {
            // InternalLidl.g:254:1: ( ruleRefDataType EOF )
            // InternalLidl.g:255:1: ruleRefDataType EOF
            {
             before(grammarAccess.getRefDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRefDataType();

            state._fsp--;

             after(grammarAccess.getRefDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefDataType"


    // $ANTLR start "ruleRefDataType"
    // InternalLidl.g:262:1: ruleRefDataType : ( ( rule__RefDataType__Group__0 ) ) ;
    public final void ruleRefDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:266:2: ( ( ( rule__RefDataType__Group__0 ) ) )
            // InternalLidl.g:267:2: ( ( rule__RefDataType__Group__0 ) )
            {
            // InternalLidl.g:267:2: ( ( rule__RefDataType__Group__0 ) )
            // InternalLidl.g:268:3: ( rule__RefDataType__Group__0 )
            {
             before(grammarAccess.getRefDataTypeAccess().getGroup()); 
            // InternalLidl.g:269:3: ( rule__RefDataType__Group__0 )
            // InternalLidl.g:269:4: rule__RefDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefDataType"


    // $ANTLR start "entryRuleCompositeDataTypeElement"
    // InternalLidl.g:278:1: entryRuleCompositeDataTypeElement : ruleCompositeDataTypeElement EOF ;
    public final void entryRuleCompositeDataTypeElement() throws RecognitionException {
        try {
            // InternalLidl.g:279:1: ( ruleCompositeDataTypeElement EOF )
            // InternalLidl.g:280:1: ruleCompositeDataTypeElement EOF
            {
             before(grammarAccess.getCompositeDataTypeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeDataTypeElement();

            state._fsp--;

             after(grammarAccess.getCompositeDataTypeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeDataTypeElement"


    // $ANTLR start "ruleCompositeDataTypeElement"
    // InternalLidl.g:287:1: ruleCompositeDataTypeElement : ( ( rule__CompositeDataTypeElement__Group__0 ) ) ;
    public final void ruleCompositeDataTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:291:2: ( ( ( rule__CompositeDataTypeElement__Group__0 ) ) )
            // InternalLidl.g:292:2: ( ( rule__CompositeDataTypeElement__Group__0 ) )
            {
            // InternalLidl.g:292:2: ( ( rule__CompositeDataTypeElement__Group__0 ) )
            // InternalLidl.g:293:3: ( rule__CompositeDataTypeElement__Group__0 )
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getGroup()); 
            // InternalLidl.g:294:3: ( rule__CompositeDataTypeElement__Group__0 )
            // InternalLidl.g:294:4: rule__CompositeDataTypeElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeDataTypeElement"


    // $ANTLR start "entryRuleRefDataTypeElement"
    // InternalLidl.g:303:1: entryRuleRefDataTypeElement : ruleRefDataTypeElement EOF ;
    public final void entryRuleRefDataTypeElement() throws RecognitionException {
        try {
            // InternalLidl.g:304:1: ( ruleRefDataTypeElement EOF )
            // InternalLidl.g:305:1: ruleRefDataTypeElement EOF
            {
             before(grammarAccess.getRefDataTypeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRefDataTypeElement();

            state._fsp--;

             after(grammarAccess.getRefDataTypeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefDataTypeElement"


    // $ANTLR start "ruleRefDataTypeElement"
    // InternalLidl.g:312:1: ruleRefDataTypeElement : ( ( rule__RefDataTypeElement__Alternatives ) ) ;
    public final void ruleRefDataTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:316:2: ( ( ( rule__RefDataTypeElement__Alternatives ) ) )
            // InternalLidl.g:317:2: ( ( rule__RefDataTypeElement__Alternatives ) )
            {
            // InternalLidl.g:317:2: ( ( rule__RefDataTypeElement__Alternatives ) )
            // InternalLidl.g:318:3: ( rule__RefDataTypeElement__Alternatives )
            {
             before(grammarAccess.getRefDataTypeElementAccess().getAlternatives()); 
            // InternalLidl.g:319:3: ( rule__RefDataTypeElement__Alternatives )
            // InternalLidl.g:319:4: rule__RefDataTypeElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRefDataTypeElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefDataTypeElement"


    // $ANTLR start "entryRuleLidlInterface"
    // InternalLidl.g:328:1: entryRuleLidlInterface : ruleLidlInterface EOF ;
    public final void entryRuleLidlInterface() throws RecognitionException {
        try {
            // InternalLidl.g:329:1: ( ruleLidlInterface EOF )
            // InternalLidl.g:330:1: ruleLidlInterface EOF
            {
             before(grammarAccess.getLidlInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlInterface();

            state._fsp--;

             after(grammarAccess.getLidlInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlInterface"


    // $ANTLR start "ruleLidlInterface"
    // InternalLidl.g:337:1: ruleLidlInterface : ( ( rule__LidlInterface__Group__0 ) ) ;
    public final void ruleLidlInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:341:2: ( ( ( rule__LidlInterface__Group__0 ) ) )
            // InternalLidl.g:342:2: ( ( rule__LidlInterface__Group__0 ) )
            {
            // InternalLidl.g:342:2: ( ( rule__LidlInterface__Group__0 ) )
            // InternalLidl.g:343:3: ( rule__LidlInterface__Group__0 )
            {
             before(grammarAccess.getLidlInterfaceAccess().getGroup()); 
            // InternalLidl.g:344:3: ( rule__LidlInterface__Group__0 )
            // InternalLidl.g:344:4: rule__LidlInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlInterface"


    // $ANTLR start "entryRuleLidlInterfaceType"
    // InternalLidl.g:353:1: entryRuleLidlInterfaceType : ruleLidlInterfaceType EOF ;
    public final void entryRuleLidlInterfaceType() throws RecognitionException {
        try {
            // InternalLidl.g:354:1: ( ruleLidlInterfaceType EOF )
            // InternalLidl.g:355:1: ruleLidlInterfaceType EOF
            {
             before(grammarAccess.getLidlInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlInterfaceType();

            state._fsp--;

             after(grammarAccess.getLidlInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlInterfaceType"


    // $ANTLR start "ruleLidlInterfaceType"
    // InternalLidl.g:362:1: ruleLidlInterfaceType : ( ( rule__LidlInterfaceType__Alternatives ) ) ;
    public final void ruleLidlInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:366:2: ( ( ( rule__LidlInterfaceType__Alternatives ) ) )
            // InternalLidl.g:367:2: ( ( rule__LidlInterfaceType__Alternatives ) )
            {
            // InternalLidl.g:367:2: ( ( rule__LidlInterfaceType__Alternatives ) )
            // InternalLidl.g:368:3: ( rule__LidlInterfaceType__Alternatives )
            {
             before(grammarAccess.getLidlInterfaceTypeAccess().getAlternatives()); 
            // InternalLidl.g:369:3: ( rule__LidlInterfaceType__Alternatives )
            // InternalLidl.g:369:4: rule__LidlInterfaceType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LidlInterfaceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLidlInterfaceTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlInterfaceType"


    // $ANTLR start "entryRuleAtomInterfaceTypeElement"
    // InternalLidl.g:378:1: entryRuleAtomInterfaceTypeElement : ruleAtomInterfaceTypeElement EOF ;
    public final void entryRuleAtomInterfaceTypeElement() throws RecognitionException {
        try {
            // InternalLidl.g:379:1: ( ruleAtomInterfaceTypeElement EOF )
            // InternalLidl.g:380:1: ruleAtomInterfaceTypeElement EOF
            {
             before(grammarAccess.getAtomInterfaceTypeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomInterfaceTypeElement();

            state._fsp--;

             after(grammarAccess.getAtomInterfaceTypeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomInterfaceTypeElement"


    // $ANTLR start "ruleAtomInterfaceTypeElement"
    // InternalLidl.g:387:1: ruleAtomInterfaceTypeElement : ( ( rule__AtomInterfaceTypeElement__Group__0 ) ) ;
    public final void ruleAtomInterfaceTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:391:2: ( ( ( rule__AtomInterfaceTypeElement__Group__0 ) ) )
            // InternalLidl.g:392:2: ( ( rule__AtomInterfaceTypeElement__Group__0 ) )
            {
            // InternalLidl.g:392:2: ( ( rule__AtomInterfaceTypeElement__Group__0 ) )
            // InternalLidl.g:393:3: ( rule__AtomInterfaceTypeElement__Group__0 )
            {
             before(grammarAccess.getAtomInterfaceTypeElementAccess().getGroup()); 
            // InternalLidl.g:394:3: ( rule__AtomInterfaceTypeElement__Group__0 )
            // InternalLidl.g:394:4: rule__AtomInterfaceTypeElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomInterfaceTypeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomInterfaceTypeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomInterfaceTypeElement"


    // $ANTLR start "entryRuleCompositeInterfaceTypeElement"
    // InternalLidl.g:403:1: entryRuleCompositeInterfaceTypeElement : ruleCompositeInterfaceTypeElement EOF ;
    public final void entryRuleCompositeInterfaceTypeElement() throws RecognitionException {
        try {
            // InternalLidl.g:404:1: ( ruleCompositeInterfaceTypeElement EOF )
            // InternalLidl.g:405:1: ruleCompositeInterfaceTypeElement EOF
            {
             before(grammarAccess.getCompositeInterfaceTypeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeInterfaceTypeElement();

            state._fsp--;

             after(grammarAccess.getCompositeInterfaceTypeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeInterfaceTypeElement"


    // $ANTLR start "ruleCompositeInterfaceTypeElement"
    // InternalLidl.g:412:1: ruleCompositeInterfaceTypeElement : ( ( rule__CompositeInterfaceTypeElement__Group__0 ) ) ;
    public final void ruleCompositeInterfaceTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:416:2: ( ( ( rule__CompositeInterfaceTypeElement__Group__0 ) ) )
            // InternalLidl.g:417:2: ( ( rule__CompositeInterfaceTypeElement__Group__0 ) )
            {
            // InternalLidl.g:417:2: ( ( rule__CompositeInterfaceTypeElement__Group__0 ) )
            // InternalLidl.g:418:3: ( rule__CompositeInterfaceTypeElement__Group__0 )
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getGroup()); 
            // InternalLidl.g:419:3: ( rule__CompositeInterfaceTypeElement__Group__0 )
            // InternalLidl.g:419:4: rule__CompositeInterfaceTypeElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeInterfaceTypeElement"


    // $ANTLR start "entryRuleRefInterfaceTypeElement"
    // InternalLidl.g:428:1: entryRuleRefInterfaceTypeElement : ruleRefInterfaceTypeElement EOF ;
    public final void entryRuleRefInterfaceTypeElement() throws RecognitionException {
        try {
            // InternalLidl.g:429:1: ( ruleRefInterfaceTypeElement EOF )
            // InternalLidl.g:430:1: ruleRefInterfaceTypeElement EOF
            {
             before(grammarAccess.getRefInterfaceTypeElementRule()); 
            pushFollow(FOLLOW_1);
            ruleRefInterfaceTypeElement();

            state._fsp--;

             after(grammarAccess.getRefInterfaceTypeElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefInterfaceTypeElement"


    // $ANTLR start "ruleRefInterfaceTypeElement"
    // InternalLidl.g:437:1: ruleRefInterfaceTypeElement : ( ( rule__RefInterfaceTypeElement__Group__0 ) ) ;
    public final void ruleRefInterfaceTypeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:441:2: ( ( ( rule__RefInterfaceTypeElement__Group__0 ) ) )
            // InternalLidl.g:442:2: ( ( rule__RefInterfaceTypeElement__Group__0 ) )
            {
            // InternalLidl.g:442:2: ( ( rule__RefInterfaceTypeElement__Group__0 ) )
            // InternalLidl.g:443:3: ( rule__RefInterfaceTypeElement__Group__0 )
            {
             before(grammarAccess.getRefInterfaceTypeElementAccess().getGroup()); 
            // InternalLidl.g:444:3: ( rule__RefInterfaceTypeElement__Group__0 )
            // InternalLidl.g:444:4: rule__RefInterfaceTypeElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefInterfaceTypeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefInterfaceTypeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefInterfaceTypeElement"


    // $ANTLR start "entryRuleAtomInterfaceType"
    // InternalLidl.g:453:1: entryRuleAtomInterfaceType : ruleAtomInterfaceType EOF ;
    public final void entryRuleAtomInterfaceType() throws RecognitionException {
        try {
            // InternalLidl.g:454:1: ( ruleAtomInterfaceType EOF )
            // InternalLidl.g:455:1: ruleAtomInterfaceType EOF
            {
             before(grammarAccess.getAtomInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomInterfaceType();

            state._fsp--;

             after(grammarAccess.getAtomInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomInterfaceType"


    // $ANTLR start "ruleAtomInterfaceType"
    // InternalLidl.g:462:1: ruleAtomInterfaceType : ( ( rule__AtomInterfaceType__Group__0 ) ) ;
    public final void ruleAtomInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:466:2: ( ( ( rule__AtomInterfaceType__Group__0 ) ) )
            // InternalLidl.g:467:2: ( ( rule__AtomInterfaceType__Group__0 ) )
            {
            // InternalLidl.g:467:2: ( ( rule__AtomInterfaceType__Group__0 ) )
            // InternalLidl.g:468:3: ( rule__AtomInterfaceType__Group__0 )
            {
             before(grammarAccess.getAtomInterfaceTypeAccess().getGroup()); 
            // InternalLidl.g:469:3: ( rule__AtomInterfaceType__Group__0 )
            // InternalLidl.g:469:4: rule__AtomInterfaceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtomInterfaceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomInterfaceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomInterfaceType"


    // $ANTLR start "entryRuleCompositeInterfaceType"
    // InternalLidl.g:478:1: entryRuleCompositeInterfaceType : ruleCompositeInterfaceType EOF ;
    public final void entryRuleCompositeInterfaceType() throws RecognitionException {
        try {
            // InternalLidl.g:479:1: ( ruleCompositeInterfaceType EOF )
            // InternalLidl.g:480:1: ruleCompositeInterfaceType EOF
            {
             before(grammarAccess.getCompositeInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleCompositeInterfaceType();

            state._fsp--;

             after(grammarAccess.getCompositeInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeInterfaceType"


    // $ANTLR start "ruleCompositeInterfaceType"
    // InternalLidl.g:487:1: ruleCompositeInterfaceType : ( ( rule__CompositeInterfaceType__Group__0 ) ) ;
    public final void ruleCompositeInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:491:2: ( ( ( rule__CompositeInterfaceType__Group__0 ) ) )
            // InternalLidl.g:492:2: ( ( rule__CompositeInterfaceType__Group__0 ) )
            {
            // InternalLidl.g:492:2: ( ( rule__CompositeInterfaceType__Group__0 ) )
            // InternalLidl.g:493:3: ( rule__CompositeInterfaceType__Group__0 )
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getGroup()); 
            // InternalLidl.g:494:3: ( rule__CompositeInterfaceType__Group__0 )
            // InternalLidl.g:494:4: rule__CompositeInterfaceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInterfaceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeInterfaceType"


    // $ANTLR start "entryRuleRefInterfaceType"
    // InternalLidl.g:503:1: entryRuleRefInterfaceType : ruleRefInterfaceType EOF ;
    public final void entryRuleRefInterfaceType() throws RecognitionException {
        try {
            // InternalLidl.g:504:1: ( ruleRefInterfaceType EOF )
            // InternalLidl.g:505:1: ruleRefInterfaceType EOF
            {
             before(grammarAccess.getRefInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRefInterfaceType();

            state._fsp--;

             after(grammarAccess.getRefInterfaceTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefInterfaceType"


    // $ANTLR start "ruleRefInterfaceType"
    // InternalLidl.g:512:1: ruleRefInterfaceType : ( ( rule__RefInterfaceType__Group__0 ) ) ;
    public final void ruleRefInterfaceType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:516:2: ( ( ( rule__RefInterfaceType__Group__0 ) ) )
            // InternalLidl.g:517:2: ( ( rule__RefInterfaceType__Group__0 ) )
            {
            // InternalLidl.g:517:2: ( ( rule__RefInterfaceType__Group__0 ) )
            // InternalLidl.g:518:3: ( rule__RefInterfaceType__Group__0 )
            {
             before(grammarAccess.getRefInterfaceTypeAccess().getGroup()); 
            // InternalLidl.g:519:3: ( rule__RefInterfaceType__Group__0 )
            // InternalLidl.g:519:4: rule__RefInterfaceType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RefInterfaceType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRefInterfaceTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefInterfaceType"


    // $ANTLR start "entryRuleLidlInteraction"
    // InternalLidl.g:528:1: entryRuleLidlInteraction : ruleLidlInteraction EOF ;
    public final void entryRuleLidlInteraction() throws RecognitionException {
        try {
            // InternalLidl.g:529:1: ( ruleLidlInteraction EOF )
            // InternalLidl.g:530:1: ruleLidlInteraction EOF
            {
             before(grammarAccess.getLidlInteractionRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlInteraction();

            state._fsp--;

             after(grammarAccess.getLidlInteractionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlInteraction"


    // $ANTLR start "ruleLidlInteraction"
    // InternalLidl.g:537:1: ruleLidlInteraction : ( ( rule__LidlInteraction__Group__0 ) ) ;
    public final void ruleLidlInteraction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:541:2: ( ( ( rule__LidlInteraction__Group__0 ) ) )
            // InternalLidl.g:542:2: ( ( rule__LidlInteraction__Group__0 ) )
            {
            // InternalLidl.g:542:2: ( ( rule__LidlInteraction__Group__0 ) )
            // InternalLidl.g:543:3: ( rule__LidlInteraction__Group__0 )
            {
             before(grammarAccess.getLidlInteractionAccess().getGroup()); 
            // InternalLidl.g:544:3: ( rule__LidlInteraction__Group__0 )
            // InternalLidl.g:544:4: rule__LidlInteraction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlInteractionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlInteraction"


    // $ANTLR start "entryRuleLidlInteractionID"
    // InternalLidl.g:553:1: entryRuleLidlInteractionID : ruleLidlInteractionID EOF ;
    public final void entryRuleLidlInteractionID() throws RecognitionException {
        try {
            // InternalLidl.g:554:1: ( ruleLidlInteractionID EOF )
            // InternalLidl.g:555:1: ruleLidlInteractionID EOF
            {
             before(grammarAccess.getLidlInteractionIDRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlInteractionID();

            state._fsp--;

             after(grammarAccess.getLidlInteractionIDRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlInteractionID"


    // $ANTLR start "ruleLidlInteractionID"
    // InternalLidl.g:562:1: ruleLidlInteractionID : ( ( rule__LidlInteractionID__Group__0 ) ) ;
    public final void ruleLidlInteractionID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:566:2: ( ( ( rule__LidlInteractionID__Group__0 ) ) )
            // InternalLidl.g:567:2: ( ( rule__LidlInteractionID__Group__0 ) )
            {
            // InternalLidl.g:567:2: ( ( rule__LidlInteractionID__Group__0 ) )
            // InternalLidl.g:568:3: ( rule__LidlInteractionID__Group__0 )
            {
             before(grammarAccess.getLidlInteractionIDAccess().getGroup()); 
            // InternalLidl.g:569:3: ( rule__LidlInteractionID__Group__0 )
            // InternalLidl.g:569:4: rule__LidlInteractionID__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteractionID__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlInteractionIDAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlInteractionID"


    // $ANTLR start "entryRuleIDPart"
    // InternalLidl.g:578:1: entryRuleIDPart : ruleIDPart EOF ;
    public final void entryRuleIDPart() throws RecognitionException {
        try {
            // InternalLidl.g:579:1: ( ruleIDPart EOF )
            // InternalLidl.g:580:1: ruleIDPart EOF
            {
             before(grammarAccess.getIDPartRule()); 
            pushFollow(FOLLOW_1);
            ruleIDPart();

            state._fsp--;

             after(grammarAccess.getIDPartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIDPart"


    // $ANTLR start "ruleIDPart"
    // InternalLidl.g:587:1: ruleIDPart : ( ( rule__IDPart__Alternatives ) ) ;
    public final void ruleIDPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:591:2: ( ( ( rule__IDPart__Alternatives ) ) )
            // InternalLidl.g:592:2: ( ( rule__IDPart__Alternatives ) )
            {
            // InternalLidl.g:592:2: ( ( rule__IDPart__Alternatives ) )
            // InternalLidl.g:593:3: ( rule__IDPart__Alternatives )
            {
             before(grammarAccess.getIDPartAccess().getAlternatives()); 
            // InternalLidl.g:594:3: ( rule__IDPart__Alternatives )
            // InternalLidl.g:594:4: rule__IDPart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__IDPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIDPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIDPart"


    // $ANTLR start "entryRuleLidlParameter"
    // InternalLidl.g:603:1: entryRuleLidlParameter : ruleLidlParameter EOF ;
    public final void entryRuleLidlParameter() throws RecognitionException {
        try {
            // InternalLidl.g:604:1: ( ruleLidlParameter EOF )
            // InternalLidl.g:605:1: ruleLidlParameter EOF
            {
             before(grammarAccess.getLidlParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlParameter();

            state._fsp--;

             after(grammarAccess.getLidlParameterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlParameter"


    // $ANTLR start "ruleLidlParameter"
    // InternalLidl.g:612:1: ruleLidlParameter : ( ( rule__LidlParameter__Group__0 ) ) ;
    public final void ruleLidlParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:616:2: ( ( ( rule__LidlParameter__Group__0 ) ) )
            // InternalLidl.g:617:2: ( ( rule__LidlParameter__Group__0 ) )
            {
            // InternalLidl.g:617:2: ( ( rule__LidlParameter__Group__0 ) )
            // InternalLidl.g:618:3: ( rule__LidlParameter__Group__0 )
            {
             before(grammarAccess.getLidlParameterAccess().getGroup()); 
            // InternalLidl.g:619:3: ( rule__LidlParameter__Group__0 )
            // InternalLidl.g:619:4: rule__LidlParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlParameter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlParameterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlParameter"


    // $ANTLR start "entryRuleLidlText"
    // InternalLidl.g:628:1: entryRuleLidlText : ruleLidlText EOF ;
    public final void entryRuleLidlText() throws RecognitionException {
        try {
            // InternalLidl.g:629:1: ( ruleLidlText EOF )
            // InternalLidl.g:630:1: ruleLidlText EOF
            {
             before(grammarAccess.getLidlTextRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlText();

            state._fsp--;

             after(grammarAccess.getLidlTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlText"


    // $ANTLR start "ruleLidlText"
    // InternalLidl.g:637:1: ruleLidlText : ( ( rule__LidlText__Group__0 ) ) ;
    public final void ruleLidlText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:641:2: ( ( ( rule__LidlText__Group__0 ) ) )
            // InternalLidl.g:642:2: ( ( rule__LidlText__Group__0 ) )
            {
            // InternalLidl.g:642:2: ( ( rule__LidlText__Group__0 ) )
            // InternalLidl.g:643:3: ( rule__LidlText__Group__0 )
            {
             before(grammarAccess.getLidlTextAccess().getGroup()); 
            // InternalLidl.g:644:3: ( rule__LidlText__Group__0 )
            // InternalLidl.g:644:4: rule__LidlText__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlText__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlText"


    // $ANTLR start "entryRuleLidlExpression"
    // InternalLidl.g:653:1: entryRuleLidlExpression : ruleLidlExpression EOF ;
    public final void entryRuleLidlExpression() throws RecognitionException {
        try {
            // InternalLidl.g:654:1: ( ruleLidlExpression EOF )
            // InternalLidl.g:655:1: ruleLidlExpression EOF
            {
             before(grammarAccess.getLidlExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlExpression();

            state._fsp--;

             after(grammarAccess.getLidlExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlExpression"


    // $ANTLR start "ruleLidlExpression"
    // InternalLidl.g:662:1: ruleLidlExpression : ( ( rule__LidlExpression__Alternatives ) ) ;
    public final void ruleLidlExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:666:2: ( ( ( rule__LidlExpression__Alternatives ) ) )
            // InternalLidl.g:667:2: ( ( rule__LidlExpression__Alternatives ) )
            {
            // InternalLidl.g:667:2: ( ( rule__LidlExpression__Alternatives ) )
            // InternalLidl.g:668:3: ( rule__LidlExpression__Alternatives )
            {
             before(grammarAccess.getLidlExpressionAccess().getAlternatives()); 
            // InternalLidl.g:669:3: ( rule__LidlExpression__Alternatives )
            // InternalLidl.g:669:4: rule__LidlExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LidlExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLidlExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlExpression"


    // $ANTLR start "entryRuleLidlCallExpression"
    // InternalLidl.g:678:1: entryRuleLidlCallExpression : ruleLidlCallExpression EOF ;
    public final void entryRuleLidlCallExpression() throws RecognitionException {
        try {
            // InternalLidl.g:679:1: ( ruleLidlCallExpression EOF )
            // InternalLidl.g:680:1: ruleLidlCallExpression EOF
            {
             before(grammarAccess.getLidlCallExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlCallExpression();

            state._fsp--;

             after(grammarAccess.getLidlCallExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlCallExpression"


    // $ANTLR start "ruleLidlCallExpression"
    // InternalLidl.g:687:1: ruleLidlCallExpression : ( ( rule__LidlCallExpression__Group__0 ) ) ;
    public final void ruleLidlCallExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:691:2: ( ( ( rule__LidlCallExpression__Group__0 ) ) )
            // InternalLidl.g:692:2: ( ( rule__LidlCallExpression__Group__0 ) )
            {
            // InternalLidl.g:692:2: ( ( rule__LidlCallExpression__Group__0 ) )
            // InternalLidl.g:693:3: ( rule__LidlCallExpression__Group__0 )
            {
             before(grammarAccess.getLidlCallExpressionAccess().getGroup()); 
            // InternalLidl.g:694:3: ( rule__LidlCallExpression__Group__0 )
            // InternalLidl.g:694:4: rule__LidlCallExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlCallExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlCallExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlCallExpression"


    // $ANTLR start "entryRuleCallPart"
    // InternalLidl.g:703:1: entryRuleCallPart : ruleCallPart EOF ;
    public final void entryRuleCallPart() throws RecognitionException {
        try {
            // InternalLidl.g:704:1: ( ruleCallPart EOF )
            // InternalLidl.g:705:1: ruleCallPart EOF
            {
             before(grammarAccess.getCallPartRule()); 
            pushFollow(FOLLOW_1);
            ruleCallPart();

            state._fsp--;

             after(grammarAccess.getCallPartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCallPart"


    // $ANTLR start "ruleCallPart"
    // InternalLidl.g:712:1: ruleCallPart : ( ( rule__CallPart__Alternatives ) ) ;
    public final void ruleCallPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:716:2: ( ( ( rule__CallPart__Alternatives ) ) )
            // InternalLidl.g:717:2: ( ( rule__CallPart__Alternatives ) )
            {
            // InternalLidl.g:717:2: ( ( rule__CallPart__Alternatives ) )
            // InternalLidl.g:718:3: ( rule__CallPart__Alternatives )
            {
             before(grammarAccess.getCallPartAccess().getAlternatives()); 
            // InternalLidl.g:719:3: ( rule__CallPart__Alternatives )
            // InternalLidl.g:719:4: rule__CallPart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CallPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCallPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallPart"


    // $ANTLR start "entryRuleLidlTerminalExpression"
    // InternalLidl.g:728:1: entryRuleLidlTerminalExpression : ruleLidlTerminalExpression EOF ;
    public final void entryRuleLidlTerminalExpression() throws RecognitionException {
        try {
            // InternalLidl.g:729:1: ( ruleLidlTerminalExpression EOF )
            // InternalLidl.g:730:1: ruleLidlTerminalExpression EOF
            {
             before(grammarAccess.getLidlTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlTerminalExpression();

            state._fsp--;

             after(grammarAccess.getLidlTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlTerminalExpression"


    // $ANTLR start "ruleLidlTerminalExpression"
    // InternalLidl.g:737:1: ruleLidlTerminalExpression : ( ( rule__LidlTerminalExpression__Alternatives ) ) ;
    public final void ruleLidlTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:741:2: ( ( ( rule__LidlTerminalExpression__Alternatives ) ) )
            // InternalLidl.g:742:2: ( ( rule__LidlTerminalExpression__Alternatives ) )
            {
            // InternalLidl.g:742:2: ( ( rule__LidlTerminalExpression__Alternatives ) )
            // InternalLidl.g:743:3: ( rule__LidlTerminalExpression__Alternatives )
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getAlternatives()); 
            // InternalLidl.g:744:3: ( rule__LidlTerminalExpression__Alternatives )
            // InternalLidl.g:744:4: rule__LidlTerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlTerminalExpression"


    // $ANTLR start "entryRuleLidlArray"
    // InternalLidl.g:753:1: entryRuleLidlArray : ruleLidlArray EOF ;
    public final void entryRuleLidlArray() throws RecognitionException {
        try {
            // InternalLidl.g:754:1: ( ruleLidlArray EOF )
            // InternalLidl.g:755:1: ruleLidlArray EOF
            {
             before(grammarAccess.getLidlArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlArray();

            state._fsp--;

             after(grammarAccess.getLidlArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlArray"


    // $ANTLR start "ruleLidlArray"
    // InternalLidl.g:762:1: ruleLidlArray : ( ( rule__LidlArray__Group__0 ) ) ;
    public final void ruleLidlArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:766:2: ( ( ( rule__LidlArray__Group__0 ) ) )
            // InternalLidl.g:767:2: ( ( rule__LidlArray__Group__0 ) )
            {
            // InternalLidl.g:767:2: ( ( rule__LidlArray__Group__0 ) )
            // InternalLidl.g:768:3: ( rule__LidlArray__Group__0 )
            {
             before(grammarAccess.getLidlArrayAccess().getGroup()); 
            // InternalLidl.g:769:3: ( rule__LidlArray__Group__0 )
            // InternalLidl.g:769:4: rule__LidlArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlArray"


    // $ANTLR start "entryRuleLidlArrayItem"
    // InternalLidl.g:778:1: entryRuleLidlArrayItem : ruleLidlArrayItem EOF ;
    public final void entryRuleLidlArrayItem() throws RecognitionException {
        try {
            // InternalLidl.g:779:1: ( ruleLidlArrayItem EOF )
            // InternalLidl.g:780:1: ruleLidlArrayItem EOF
            {
             before(grammarAccess.getLidlArrayItemRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlArrayItem();

            state._fsp--;

             after(grammarAccess.getLidlArrayItemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlArrayItem"


    // $ANTLR start "ruleLidlArrayItem"
    // InternalLidl.g:787:1: ruleLidlArrayItem : ( ( rule__LidlArrayItem__Group__0 ) ) ;
    public final void ruleLidlArrayItem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:791:2: ( ( ( rule__LidlArrayItem__Group__0 ) ) )
            // InternalLidl.g:792:2: ( ( rule__LidlArrayItem__Group__0 ) )
            {
            // InternalLidl.g:792:2: ( ( rule__LidlArrayItem__Group__0 ) )
            // InternalLidl.g:793:3: ( rule__LidlArrayItem__Group__0 )
            {
             before(grammarAccess.getLidlArrayItemAccess().getGroup()); 
            // InternalLidl.g:794:3: ( rule__LidlArrayItem__Group__0 )
            // InternalLidl.g:794:4: rule__LidlArrayItem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlArrayItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlArrayItemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlArrayItem"


    // $ANTLR start "entryRuleLidlCompositionElement"
    // InternalLidl.g:803:1: entryRuleLidlCompositionElement : ruleLidlCompositionElement EOF ;
    public final void entryRuleLidlCompositionElement() throws RecognitionException {
        try {
            // InternalLidl.g:804:1: ( ruleLidlCompositionElement EOF )
            // InternalLidl.g:805:1: ruleLidlCompositionElement EOF
            {
             before(grammarAccess.getLidlCompositionElementRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlCompositionElement();

            state._fsp--;

             after(grammarAccess.getLidlCompositionElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlCompositionElement"


    // $ANTLR start "ruleLidlCompositionElement"
    // InternalLidl.g:812:1: ruleLidlCompositionElement : ( ( rule__LidlCompositionElement__Group__0 ) ) ;
    public final void ruleLidlCompositionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:816:2: ( ( ( rule__LidlCompositionElement__Group__0 ) ) )
            // InternalLidl.g:817:2: ( ( rule__LidlCompositionElement__Group__0 ) )
            {
            // InternalLidl.g:817:2: ( ( rule__LidlCompositionElement__Group__0 ) )
            // InternalLidl.g:818:3: ( rule__LidlCompositionElement__Group__0 )
            {
             before(grammarAccess.getLidlCompositionElementAccess().getGroup()); 
            // InternalLidl.g:819:3: ( rule__LidlCompositionElement__Group__0 )
            // InternalLidl.g:819:4: rule__LidlCompositionElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlCompositionElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlCompositionElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlCompositionElement"


    // $ANTLR start "entryRuleLidlComposition"
    // InternalLidl.g:828:1: entryRuleLidlComposition : ruleLidlComposition EOF ;
    public final void entryRuleLidlComposition() throws RecognitionException {
        try {
            // InternalLidl.g:829:1: ( ruleLidlComposition EOF )
            // InternalLidl.g:830:1: ruleLidlComposition EOF
            {
             before(grammarAccess.getLidlCompositionRule()); 
            pushFollow(FOLLOW_1);
            ruleLidlComposition();

            state._fsp--;

             after(grammarAccess.getLidlCompositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLidlComposition"


    // $ANTLR start "ruleLidlComposition"
    // InternalLidl.g:837:1: ruleLidlComposition : ( ( rule__LidlComposition__Group__0 ) ) ;
    public final void ruleLidlComposition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:841:2: ( ( ( rule__LidlComposition__Group__0 ) ) )
            // InternalLidl.g:842:2: ( ( rule__LidlComposition__Group__0 ) )
            {
            // InternalLidl.g:842:2: ( ( rule__LidlComposition__Group__0 ) )
            // InternalLidl.g:843:3: ( rule__LidlComposition__Group__0 )
            {
             before(grammarAccess.getLidlCompositionAccess().getGroup()); 
            // InternalLidl.g:844:3: ( rule__LidlComposition__Group__0 )
            // InternalLidl.g:844:4: rule__LidlComposition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LidlComposition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLidlCompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLidlComposition"


    // $ANTLR start "ruleDataDirection"
    // InternalLidl.g:853:1: ruleDataDirection : ( ( rule__DataDirection__Alternatives ) ) ;
    public final void ruleDataDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:857:1: ( ( ( rule__DataDirection__Alternatives ) ) )
            // InternalLidl.g:858:2: ( ( rule__DataDirection__Alternatives ) )
            {
            // InternalLidl.g:858:2: ( ( rule__DataDirection__Alternatives ) )
            // InternalLidl.g:859:3: ( rule__DataDirection__Alternatives )
            {
             before(grammarAccess.getDataDirectionAccess().getAlternatives()); 
            // InternalLidl.g:860:3: ( rule__DataDirection__Alternatives )
            // InternalLidl.g:860:4: rule__DataDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DataDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDataDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataDirection"


    // $ANTLR start "rule__LidlDefinition__Alternatives"
    // InternalLidl.g:868:1: rule__LidlDefinition__Alternatives : ( ( ruleLidlData ) | ( ruleLidlInterface ) | ( ruleLidlInteraction ) );
    public final void rule__LidlDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:872:1: ( ( ruleLidlData ) | ( ruleLidlInterface ) | ( ruleLidlInteraction ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 30:
                {
                alt1=2;
                }
                break;
            case 31:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLidl.g:873:2: ( ruleLidlData )
                    {
                    // InternalLidl.g:873:2: ( ruleLidlData )
                    // InternalLidl.g:874:3: ruleLidlData
                    {
                     before(grammarAccess.getLidlDefinitionAccess().getLidlDataParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLidlData();

                    state._fsp--;

                     after(grammarAccess.getLidlDefinitionAccess().getLidlDataParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:879:2: ( ruleLidlInterface )
                    {
                    // InternalLidl.g:879:2: ( ruleLidlInterface )
                    // InternalLidl.g:880:3: ruleLidlInterface
                    {
                     before(grammarAccess.getLidlDefinitionAccess().getLidlInterfaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLidlInterface();

                    state._fsp--;

                     after(grammarAccess.getLidlDefinitionAccess().getLidlInterfaceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLidl.g:885:2: ( ruleLidlInteraction )
                    {
                    // InternalLidl.g:885:2: ( ruleLidlInteraction )
                    // InternalLidl.g:886:3: ruleLidlInteraction
                    {
                     before(grammarAccess.getLidlDefinitionAccess().getLidlInteractionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLidlInteraction();

                    state._fsp--;

                     after(grammarAccess.getLidlDefinitionAccess().getLidlInteractionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlDefinition__Alternatives"


    // $ANTLR start "rule__LidlData__Alternatives_4"
    // InternalLidl.g:895:1: rule__LidlData__Alternatives_4 : ( ( ( rule__LidlData__DefinitionAssignment_4_0 ) ) | ( ( rule__LidlData__DefinedAssignment_4_1 ) ) );
    public final void rule__LidlData__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:899:1: ( ( ( rule__LidlData__DefinitionAssignment_4_0 ) ) | ( ( rule__LidlData__DefinedAssignment_4_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==26||LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==37) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLidl.g:900:2: ( ( rule__LidlData__DefinitionAssignment_4_0 ) )
                    {
                    // InternalLidl.g:900:2: ( ( rule__LidlData__DefinitionAssignment_4_0 ) )
                    // InternalLidl.g:901:3: ( rule__LidlData__DefinitionAssignment_4_0 )
                    {
                     before(grammarAccess.getLidlDataAccess().getDefinitionAssignment_4_0()); 
                    // InternalLidl.g:902:3: ( rule__LidlData__DefinitionAssignment_4_0 )
                    // InternalLidl.g:902:4: rule__LidlData__DefinitionAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlData__DefinitionAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlDataAccess().getDefinitionAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:906:2: ( ( rule__LidlData__DefinedAssignment_4_1 ) )
                    {
                    // InternalLidl.g:906:2: ( ( rule__LidlData__DefinedAssignment_4_1 ) )
                    // InternalLidl.g:907:3: ( rule__LidlData__DefinedAssignment_4_1 )
                    {
                     before(grammarAccess.getLidlDataAccess().getDefinedAssignment_4_1()); 
                    // InternalLidl.g:908:3: ( rule__LidlData__DefinedAssignment_4_1 )
                    // InternalLidl.g:908:4: rule__LidlData__DefinedAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlData__DefinedAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlDataAccess().getDefinedAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Alternatives_4"


    // $ANTLR start "rule__LidlDataType__Alternatives"
    // InternalLidl.g:916:1: rule__LidlDataType__Alternatives : ( ( ruleCompositeDataType ) | ( ruleRefDataType ) );
    public final void rule__LidlDataType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:920:1: ( ( ruleCompositeDataType ) | ( ruleRefDataType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID||LA3_0==34) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalLidl.g:921:2: ( ruleCompositeDataType )
                    {
                    // InternalLidl.g:921:2: ( ruleCompositeDataType )
                    // InternalLidl.g:922:3: ruleCompositeDataType
                    {
                     before(grammarAccess.getLidlDataTypeAccess().getCompositeDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeDataType();

                    state._fsp--;

                     after(grammarAccess.getLidlDataTypeAccess().getCompositeDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:927:2: ( ruleRefDataType )
                    {
                    // InternalLidl.g:927:2: ( ruleRefDataType )
                    // InternalLidl.g:928:3: ruleRefDataType
                    {
                     before(grammarAccess.getLidlDataTypeAccess().getRefDataTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefDataType();

                    state._fsp--;

                     after(grammarAccess.getLidlDataTypeAccess().getRefDataTypeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlDataType__Alternatives"


    // $ANTLR start "rule__CompositeDataTypeElement__Alternatives_3"
    // InternalLidl.g:937:1: rule__CompositeDataTypeElement__Alternatives_3 : ( ( ( rule__CompositeDataTypeElement__TypeAssignment_3_0 ) ) | ( ( rule__CompositeDataTypeElement__Group_3_1__0 ) ) );
    public final void rule__CompositeDataTypeElement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:941:1: ( ( ( rule__CompositeDataTypeElement__TypeAssignment_3_0 ) ) | ( ( rule__CompositeDataTypeElement__Group_3_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==34) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLidl.g:942:2: ( ( rule__CompositeDataTypeElement__TypeAssignment_3_0 ) )
                    {
                    // InternalLidl.g:942:2: ( ( rule__CompositeDataTypeElement__TypeAssignment_3_0 ) )
                    // InternalLidl.g:943:3: ( rule__CompositeDataTypeElement__TypeAssignment_3_0 )
                    {
                     before(grammarAccess.getCompositeDataTypeElementAccess().getTypeAssignment_3_0()); 
                    // InternalLidl.g:944:3: ( rule__CompositeDataTypeElement__TypeAssignment_3_0 )
                    // InternalLidl.g:944:4: rule__CompositeDataTypeElement__TypeAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeDataTypeElement__TypeAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositeDataTypeElementAccess().getTypeAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:948:2: ( ( rule__CompositeDataTypeElement__Group_3_1__0 ) )
                    {
                    // InternalLidl.g:948:2: ( ( rule__CompositeDataTypeElement__Group_3_1__0 ) )
                    // InternalLidl.g:949:3: ( rule__CompositeDataTypeElement__Group_3_1__0 )
                    {
                     before(grammarAccess.getCompositeDataTypeElementAccess().getGroup_3_1()); 
                    // InternalLidl.g:950:3: ( rule__CompositeDataTypeElement__Group_3_1__0 )
                    // InternalLidl.g:950:4: rule__CompositeDataTypeElement__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeDataTypeElement__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositeDataTypeElementAccess().getGroup_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Alternatives_3"


    // $ANTLR start "rule__RefDataTypeElement__Alternatives"
    // InternalLidl.g:958:1: rule__RefDataTypeElement__Alternatives : ( ( ( rule__RefDataTypeElement__Group_0__0 ) ) | ( ( rule__RefDataTypeElement__Group_1__0 ) ) );
    public final void rule__RefDataTypeElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:962:1: ( ( ( rule__RefDataTypeElement__Group_0__0 ) ) | ( ( rule__RefDataTypeElement__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==34) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLidl.g:963:2: ( ( rule__RefDataTypeElement__Group_0__0 ) )
                    {
                    // InternalLidl.g:963:2: ( ( rule__RefDataTypeElement__Group_0__0 ) )
                    // InternalLidl.g:964:3: ( rule__RefDataTypeElement__Group_0__0 )
                    {
                     before(grammarAccess.getRefDataTypeElementAccess().getGroup_0()); 
                    // InternalLidl.g:965:3: ( rule__RefDataTypeElement__Group_0__0 )
                    // InternalLidl.g:965:4: rule__RefDataTypeElement__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefDataTypeElement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRefDataTypeElementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:969:2: ( ( rule__RefDataTypeElement__Group_1__0 ) )
                    {
                    // InternalLidl.g:969:2: ( ( rule__RefDataTypeElement__Group_1__0 ) )
                    // InternalLidl.g:970:3: ( rule__RefDataTypeElement__Group_1__0 )
                    {
                     before(grammarAccess.getRefDataTypeElementAccess().getGroup_1()); 
                    // InternalLidl.g:971:3: ( rule__RefDataTypeElement__Group_1__0 )
                    // InternalLidl.g:971:4: rule__RefDataTypeElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RefDataTypeElement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRefDataTypeElementAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Alternatives"


    // $ANTLR start "rule__LidlInterface__Alternatives_4"
    // InternalLidl.g:979:1: rule__LidlInterface__Alternatives_4 : ( ( ( rule__LidlInterface__DefinitionAssignment_4_0 ) ) | ( ( rule__LidlInterface__DefinedAssignment_4_1 ) ) );
    public final void rule__LidlInterface__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:983:1: ( ( ( rule__LidlInterface__DefinitionAssignment_4_0 ) ) | ( ( rule__LidlInterface__DefinedAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==37) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalLidl.g:984:2: ( ( rule__LidlInterface__DefinitionAssignment_4_0 ) )
                    {
                    // InternalLidl.g:984:2: ( ( rule__LidlInterface__DefinitionAssignment_4_0 ) )
                    // InternalLidl.g:985:3: ( rule__LidlInterface__DefinitionAssignment_4_0 )
                    {
                     before(grammarAccess.getLidlInterfaceAccess().getDefinitionAssignment_4_0()); 
                    // InternalLidl.g:986:3: ( rule__LidlInterface__DefinitionAssignment_4_0 )
                    // InternalLidl.g:986:4: rule__LidlInterface__DefinitionAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlInterface__DefinitionAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlInterfaceAccess().getDefinitionAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:990:2: ( ( rule__LidlInterface__DefinedAssignment_4_1 ) )
                    {
                    // InternalLidl.g:990:2: ( ( rule__LidlInterface__DefinedAssignment_4_1 ) )
                    // InternalLidl.g:991:3: ( rule__LidlInterface__DefinedAssignment_4_1 )
                    {
                     before(grammarAccess.getLidlInterfaceAccess().getDefinedAssignment_4_1()); 
                    // InternalLidl.g:992:3: ( rule__LidlInterface__DefinedAssignment_4_1 )
                    // InternalLidl.g:992:4: rule__LidlInterface__DefinedAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlInterface__DefinedAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlInterfaceAccess().getDefinedAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Alternatives_4"


    // $ANTLR start "rule__LidlInterfaceType__Alternatives"
    // InternalLidl.g:1000:1: rule__LidlInterfaceType__Alternatives : ( ( ruleAtomInterfaceType ) | ( ruleCompositeInterfaceType ) | ( ( rule__LidlInterfaceType__Group_2__0 ) ) );
    public final void rule__LidlInterfaceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1004:1: ( ( ruleAtomInterfaceType ) | ( ruleCompositeInterfaceType ) | ( ( rule__LidlInterfaceType__Group_2__0 ) ) )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalLidl.g:1005:2: ( ruleAtomInterfaceType )
                    {
                    // InternalLidl.g:1005:2: ( ruleAtomInterfaceType )
                    // InternalLidl.g:1006:3: ruleAtomInterfaceType
                    {
                     before(grammarAccess.getLidlInterfaceTypeAccess().getAtomInterfaceTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomInterfaceType();

                    state._fsp--;

                     after(grammarAccess.getLidlInterfaceTypeAccess().getAtomInterfaceTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1011:2: ( ruleCompositeInterfaceType )
                    {
                    // InternalLidl.g:1011:2: ( ruleCompositeInterfaceType )
                    // InternalLidl.g:1012:3: ruleCompositeInterfaceType
                    {
                     before(grammarAccess.getLidlInterfaceTypeAccess().getCompositeInterfaceTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCompositeInterfaceType();

                    state._fsp--;

                     after(grammarAccess.getLidlInterfaceTypeAccess().getCompositeInterfaceTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLidl.g:1017:2: ( ( rule__LidlInterfaceType__Group_2__0 ) )
                    {
                    // InternalLidl.g:1017:2: ( ( rule__LidlInterfaceType__Group_2__0 ) )
                    // InternalLidl.g:1018:3: ( rule__LidlInterfaceType__Group_2__0 )
                    {
                     before(grammarAccess.getLidlInterfaceTypeAccess().getGroup_2()); 
                    // InternalLidl.g:1019:3: ( rule__LidlInterfaceType__Group_2__0 )
                    // InternalLidl.g:1019:4: rule__LidlInterfaceType__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlInterfaceType__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlInterfaceTypeAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterfaceType__Alternatives"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Alternatives_3"
    // InternalLidl.g:1027:1: rule__CompositeInterfaceTypeElement__Alternatives_3 : ( ( ( rule__CompositeInterfaceTypeElement__Group_3_0__0 ) ) | ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_1 ) ) );
    public final void rule__CompositeInterfaceTypeElement__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1031:1: ( ( ( rule__CompositeInterfaceTypeElement__Group_3_0__0 ) ) | ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_1 ) ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalLidl.g:1032:2: ( ( rule__CompositeInterfaceTypeElement__Group_3_0__0 ) )
                    {
                    // InternalLidl.g:1032:2: ( ( rule__CompositeInterfaceTypeElement__Group_3_0__0 ) )
                    // InternalLidl.g:1033:3: ( rule__CompositeInterfaceTypeElement__Group_3_0__0 )
                    {
                     before(grammarAccess.getCompositeInterfaceTypeElementAccess().getGroup_3_0()); 
                    // InternalLidl.g:1034:3: ( rule__CompositeInterfaceTypeElement__Group_3_0__0 )
                    // InternalLidl.g:1034:4: rule__CompositeInterfaceTypeElement__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeInterfaceTypeElement__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositeInterfaceTypeElementAccess().getGroup_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1038:2: ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_1 ) )
                    {
                    // InternalLidl.g:1038:2: ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_1 ) )
                    // InternalLidl.g:1039:3: ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_1 )
                    {
                     before(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeAssignment_3_1()); 
                    // InternalLidl.g:1040:3: ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_1 )
                    // InternalLidl.g:1040:4: rule__CompositeInterfaceTypeElement__TypeAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositeInterfaceTypeElement__TypeAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeAssignment_3_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Alternatives_3"


    // $ANTLR start "rule__IDPart__Alternatives"
    // InternalLidl.g:1048:1: rule__IDPart__Alternatives : ( ( ruleLidlText ) | ( ruleLidlParameter ) );
    public final void rule__IDPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1052:1: ( ( ruleLidlText ) | ( ruleLidlParameter ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_LIDLIDSYMBOL)) ) {
                alt9=1;
            }
            else if ( (LA9_0==32) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLidl.g:1053:2: ( ruleLidlText )
                    {
                    // InternalLidl.g:1053:2: ( ruleLidlText )
                    // InternalLidl.g:1054:3: ruleLidlText
                    {
                     before(grammarAccess.getIDPartAccess().getLidlTextParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLidlText();

                    state._fsp--;

                     after(grammarAccess.getIDPartAccess().getLidlTextParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1059:2: ( ruleLidlParameter )
                    {
                    // InternalLidl.g:1059:2: ( ruleLidlParameter )
                    // InternalLidl.g:1060:3: ruleLidlParameter
                    {
                     before(grammarAccess.getIDPartAccess().getLidlParameterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLidlParameter();

                    state._fsp--;

                     after(grammarAccess.getIDPartAccess().getLidlParameterParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IDPart__Alternatives"


    // $ANTLR start "rule__LidlText__TextAlternatives_1_0"
    // InternalLidl.g:1069:1: rule__LidlText__TextAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_LIDLIDSYMBOL ) );
    public final void rule__LidlText__TextAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1073:1: ( ( RULE_ID ) | ( RULE_LIDLIDSYMBOL ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_LIDLIDSYMBOL) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLidl.g:1074:2: ( RULE_ID )
                    {
                    // InternalLidl.g:1074:2: ( RULE_ID )
                    // InternalLidl.g:1075:3: RULE_ID
                    {
                     before(grammarAccess.getLidlTextAccess().getTextIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLidlTextAccess().getTextIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1080:2: ( RULE_LIDLIDSYMBOL )
                    {
                    // InternalLidl.g:1080:2: ( RULE_LIDLIDSYMBOL )
                    // InternalLidl.g:1081:3: RULE_LIDLIDSYMBOL
                    {
                     before(grammarAccess.getLidlTextAccess().getTextLIDLIDSYMBOLTerminalRuleCall_1_0_1()); 
                    match(input,RULE_LIDLIDSYMBOL,FOLLOW_2); 
                     after(grammarAccess.getLidlTextAccess().getTextLIDLIDSYMBOLTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlText__TextAlternatives_1_0"


    // $ANTLR start "rule__LidlExpression__Alternatives"
    // InternalLidl.g:1090:1: rule__LidlExpression__Alternatives : ( ( ruleLidlCallExpression ) | ( ruleLidlTerminalExpression ) | ( ruleLidlArray ) );
    public final void rule__LidlExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1094:1: ( ( ruleLidlCallExpression ) | ( ruleLidlTerminalExpression ) | ( ruleLidlArray ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_LIDLIDSYMBOL:
            case 13:
            case 14:
            case 32:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 15:
            case 16:
            case 17:
            case 18:
            case 26:
                {
                alt11=2;
                }
                break;
            case 34:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLidl.g:1095:2: ( ruleLidlCallExpression )
                    {
                    // InternalLidl.g:1095:2: ( ruleLidlCallExpression )
                    // InternalLidl.g:1096:3: ruleLidlCallExpression
                    {
                     before(grammarAccess.getLidlExpressionAccess().getLidlCallExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLidlCallExpression();

                    state._fsp--;

                     after(grammarAccess.getLidlExpressionAccess().getLidlCallExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1101:2: ( ruleLidlTerminalExpression )
                    {
                    // InternalLidl.g:1101:2: ( ruleLidlTerminalExpression )
                    // InternalLidl.g:1102:3: ruleLidlTerminalExpression
                    {
                     before(grammarAccess.getLidlExpressionAccess().getLidlTerminalExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLidlTerminalExpression();

                    state._fsp--;

                     after(grammarAccess.getLidlExpressionAccess().getLidlTerminalExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLidl.g:1107:2: ( ruleLidlArray )
                    {
                    // InternalLidl.g:1107:2: ( ruleLidlArray )
                    // InternalLidl.g:1108:3: ruleLidlArray
                    {
                     before(grammarAccess.getLidlExpressionAccess().getLidlArrayParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLidlArray();

                    state._fsp--;

                     after(grammarAccess.getLidlExpressionAccess().getLidlArrayParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlExpression__Alternatives"


    // $ANTLR start "rule__CallPart__Alternatives"
    // InternalLidl.g:1117:1: rule__CallPart__Alternatives : ( ( ( rule__CallPart__Group_0__0 ) ) | ( ( rule__CallPart__Group_1__0 ) ) );
    public final void rule__CallPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1121:1: ( ( ( rule__CallPart__Group_0__0 ) ) | ( ( rule__CallPart__Group_1__0 ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_LIDLIDSYMBOL)||(LA12_0>=13 && LA12_0<=14)) ) {
                alt12=1;
            }
            else if ( (LA12_0==32) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLidl.g:1122:2: ( ( rule__CallPart__Group_0__0 ) )
                    {
                    // InternalLidl.g:1122:2: ( ( rule__CallPart__Group_0__0 ) )
                    // InternalLidl.g:1123:3: ( rule__CallPart__Group_0__0 )
                    {
                     before(grammarAccess.getCallPartAccess().getGroup_0()); 
                    // InternalLidl.g:1124:3: ( rule__CallPart__Group_0__0 )
                    // InternalLidl.g:1124:4: rule__CallPart__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallPart__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCallPartAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1128:2: ( ( rule__CallPart__Group_1__0 ) )
                    {
                    // InternalLidl.g:1128:2: ( ( rule__CallPart__Group_1__0 ) )
                    // InternalLidl.g:1129:3: ( rule__CallPart__Group_1__0 )
                    {
                     before(grammarAccess.getCallPartAccess().getGroup_1()); 
                    // InternalLidl.g:1130:3: ( rule__CallPart__Group_1__0 )
                    // InternalLidl.g:1130:4: rule__CallPart__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallPart__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCallPartAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Alternatives"


    // $ANTLR start "rule__CallPart__TextAlternatives_0_1_0"
    // InternalLidl.g:1138:1: rule__CallPart__TextAlternatives_0_1_0 : ( ( RULE_ID ) | ( RULE_LIDLIDSYMBOL ) | ( ',' ) | ( '.' ) );
    public final void rule__CallPart__TextAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1142:1: ( ( RULE_ID ) | ( RULE_LIDLIDSYMBOL ) | ( ',' ) | ( '.' ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt13=1;
                }
                break;
            case RULE_LIDLIDSYMBOL:
                {
                alt13=2;
                }
                break;
            case 13:
                {
                alt13=3;
                }
                break;
            case 14:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalLidl.g:1143:2: ( RULE_ID )
                    {
                    // InternalLidl.g:1143:2: ( RULE_ID )
                    // InternalLidl.g:1144:3: RULE_ID
                    {
                     before(grammarAccess.getCallPartAccess().getTextIDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getCallPartAccess().getTextIDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1149:2: ( RULE_LIDLIDSYMBOL )
                    {
                    // InternalLidl.g:1149:2: ( RULE_LIDLIDSYMBOL )
                    // InternalLidl.g:1150:3: RULE_LIDLIDSYMBOL
                    {
                     before(grammarAccess.getCallPartAccess().getTextLIDLIDSYMBOLTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_LIDLIDSYMBOL,FOLLOW_2); 
                     after(grammarAccess.getCallPartAccess().getTextLIDLIDSYMBOLTerminalRuleCall_0_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLidl.g:1155:2: ( ',' )
                    {
                    // InternalLidl.g:1155:2: ( ',' )
                    // InternalLidl.g:1156:3: ','
                    {
                     before(grammarAccess.getCallPartAccess().getTextCommaKeyword_0_1_0_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getCallPartAccess().getTextCommaKeyword_0_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLidl.g:1161:2: ( '.' )
                    {
                    // InternalLidl.g:1161:2: ( '.' )
                    // InternalLidl.g:1162:3: '.'
                    {
                     before(grammarAccess.getCallPartAccess().getTextFullStopKeyword_0_1_0_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getCallPartAccess().getTextFullStopKeyword_0_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__TextAlternatives_0_1_0"


    // $ANTLR start "rule__LidlTerminalExpression__Alternatives"
    // InternalLidl.g:1171:1: rule__LidlTerminalExpression__Alternatives : ( ( ( rule__LidlTerminalExpression__Group_0__0 ) ) | ( ( rule__LidlTerminalExpression__Group_1__0 ) ) | ( ( rule__LidlTerminalExpression__Group_2__0 ) ) | ( ( rule__LidlTerminalExpression__Group_3__0 ) ) | ( ( rule__LidlTerminalExpression__Group_4__0 ) ) );
    public final void rule__LidlTerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1175:1: ( ( ( rule__LidlTerminalExpression__Group_0__0 ) ) | ( ( rule__LidlTerminalExpression__Group_1__0 ) ) | ( ( rule__LidlTerminalExpression__Group_2__0 ) ) | ( ( rule__LidlTerminalExpression__Group_3__0 ) ) | ( ( rule__LidlTerminalExpression__Group_4__0 ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt14=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt14=2;
                }
                break;
            case 15:
            case 16:
                {
                alt14=3;
                }
                break;
            case 17:
            case 18:
                {
                alt14=4;
                }
                break;
            case 26:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalLidl.g:1176:2: ( ( rule__LidlTerminalExpression__Group_0__0 ) )
                    {
                    // InternalLidl.g:1176:2: ( ( rule__LidlTerminalExpression__Group_0__0 ) )
                    // InternalLidl.g:1177:3: ( rule__LidlTerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getGroup_0()); 
                    // InternalLidl.g:1178:3: ( rule__LidlTerminalExpression__Group_0__0 )
                    // InternalLidl.g:1178:4: rule__LidlTerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlTerminalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1182:2: ( ( rule__LidlTerminalExpression__Group_1__0 ) )
                    {
                    // InternalLidl.g:1182:2: ( ( rule__LidlTerminalExpression__Group_1__0 ) )
                    // InternalLidl.g:1183:3: ( rule__LidlTerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getGroup_1()); 
                    // InternalLidl.g:1184:3: ( rule__LidlTerminalExpression__Group_1__0 )
                    // InternalLidl.g:1184:4: rule__LidlTerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlTerminalExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLidl.g:1188:2: ( ( rule__LidlTerminalExpression__Group_2__0 ) )
                    {
                    // InternalLidl.g:1188:2: ( ( rule__LidlTerminalExpression__Group_2__0 ) )
                    // InternalLidl.g:1189:3: ( rule__LidlTerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getGroup_2()); 
                    // InternalLidl.g:1190:3: ( rule__LidlTerminalExpression__Group_2__0 )
                    // InternalLidl.g:1190:4: rule__LidlTerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlTerminalExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlTerminalExpressionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLidl.g:1194:2: ( ( rule__LidlTerminalExpression__Group_3__0 ) )
                    {
                    // InternalLidl.g:1194:2: ( ( rule__LidlTerminalExpression__Group_3__0 ) )
                    // InternalLidl.g:1195:3: ( rule__LidlTerminalExpression__Group_3__0 )
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getGroup_3()); 
                    // InternalLidl.g:1196:3: ( rule__LidlTerminalExpression__Group_3__0 )
                    // InternalLidl.g:1196:4: rule__LidlTerminalExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlTerminalExpression__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlTerminalExpressionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLidl.g:1200:2: ( ( rule__LidlTerminalExpression__Group_4__0 ) )
                    {
                    // InternalLidl.g:1200:2: ( ( rule__LidlTerminalExpression__Group_4__0 ) )
                    // InternalLidl.g:1201:3: ( rule__LidlTerminalExpression__Group_4__0 )
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getGroup_4()); 
                    // InternalLidl.g:1202:3: ( rule__LidlTerminalExpression__Group_4__0 )
                    // InternalLidl.g:1202:4: rule__LidlTerminalExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlTerminalExpression__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLidlTerminalExpressionAccess().getGroup_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Alternatives"


    // $ANTLR start "rule__LidlTerminalExpression__ValueAlternatives_2_1_0"
    // InternalLidl.g:1210:1: rule__LidlTerminalExpression__ValueAlternatives_2_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__LidlTerminalExpression__ValueAlternatives_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1214:1: ( ( 'true' ) | ( 'false' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalLidl.g:1215:2: ( 'true' )
                    {
                    // InternalLidl.g:1215:2: ( 'true' )
                    // InternalLidl.g:1216:3: 'true'
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getLidlTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1221:2: ( 'false' )
                    {
                    // InternalLidl.g:1221:2: ( 'false' )
                    // InternalLidl.g:1222:3: 'false'
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getLidlTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__ValueAlternatives_2_1_0"


    // $ANTLR start "rule__LidlTerminalExpression__ValueAlternatives_3_1_0"
    // InternalLidl.g:1231:1: rule__LidlTerminalExpression__ValueAlternatives_3_1_0 : ( ( 'active' ) | ( 'inactive' ) );
    public final void rule__LidlTerminalExpression__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1235:1: ( ( 'active' ) | ( 'inactive' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLidl.g:1236:2: ( 'active' )
                    {
                    // InternalLidl.g:1236:2: ( 'active' )
                    // InternalLidl.g:1237:3: 'active'
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getValueActiveKeyword_3_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getLidlTerminalExpressionAccess().getValueActiveKeyword_3_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1242:2: ( 'inactive' )
                    {
                    // InternalLidl.g:1242:2: ( 'inactive' )
                    // InternalLidl.g:1243:3: 'inactive'
                    {
                     before(grammarAccess.getLidlTerminalExpressionAccess().getValueInactiveKeyword_3_1_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getLidlTerminalExpressionAccess().getValueInactiveKeyword_3_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__DataDirection__Alternatives"
    // InternalLidl.g:1252:1: rule__DataDirection__Alternatives : ( ( ( 'in' ) ) | ( ( 'out' ) ) );
    public final void rule__DataDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1256:1: ( ( ( 'in' ) ) | ( ( 'out' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            else if ( (LA17_0==20) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLidl.g:1257:2: ( ( 'in' ) )
                    {
                    // InternalLidl.g:1257:2: ( ( 'in' ) )
                    // InternalLidl.g:1258:3: ( 'in' )
                    {
                     before(grammarAccess.getDataDirectionAccess().getINEnumLiteralDeclaration_0()); 
                    // InternalLidl.g:1259:3: ( 'in' )
                    // InternalLidl.g:1259:4: 'in'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataDirectionAccess().getINEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1263:2: ( ( 'out' ) )
                    {
                    // InternalLidl.g:1263:2: ( ( 'out' ) )
                    // InternalLidl.g:1264:3: ( 'out' )
                    {
                     before(grammarAccess.getDataDirectionAccess().getOUTEnumLiteralDeclaration_1()); 
                    // InternalLidl.g:1265:3: ( 'out' )
                    // InternalLidl.g:1265:4: 'out'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDataDirectionAccess().getOUTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataDirection__Alternatives"


    // $ANTLR start "rule__LidlProgram__Group__0"
    // InternalLidl.g:1273:1: rule__LidlProgram__Group__0 : rule__LidlProgram__Group__0__Impl rule__LidlProgram__Group__1 ;
    public final void rule__LidlProgram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1277:1: ( rule__LidlProgram__Group__0__Impl rule__LidlProgram__Group__1 )
            // InternalLidl.g:1278:2: rule__LidlProgram__Group__0__Impl rule__LidlProgram__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LidlProgram__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlProgram__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group__0"


    // $ANTLR start "rule__LidlProgram__Group__0__Impl"
    // InternalLidl.g:1285:1: rule__LidlProgram__Group__0__Impl : ( ( rule__LidlProgram__Group_0__0 )? ) ;
    public final void rule__LidlProgram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1289:1: ( ( ( rule__LidlProgram__Group_0__0 )? ) )
            // InternalLidl.g:1290:1: ( ( rule__LidlProgram__Group_0__0 )? )
            {
            // InternalLidl.g:1290:1: ( ( rule__LidlProgram__Group_0__0 )? )
            // InternalLidl.g:1291:2: ( rule__LidlProgram__Group_0__0 )?
            {
             before(grammarAccess.getLidlProgramAccess().getGroup_0()); 
            // InternalLidl.g:1292:2: ( rule__LidlProgram__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLidl.g:1292:3: rule__LidlProgram__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlProgram__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLidlProgramAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group__0__Impl"


    // $ANTLR start "rule__LidlProgram__Group__1"
    // InternalLidl.g:1300:1: rule__LidlProgram__Group__1 : rule__LidlProgram__Group__1__Impl rule__LidlProgram__Group__2 ;
    public final void rule__LidlProgram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1304:1: ( rule__LidlProgram__Group__1__Impl rule__LidlProgram__Group__2 )
            // InternalLidl.g:1305:2: rule__LidlProgram__Group__1__Impl rule__LidlProgram__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LidlProgram__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlProgram__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group__1"


    // $ANTLR start "rule__LidlProgram__Group__1__Impl"
    // InternalLidl.g:1312:1: rule__LidlProgram__Group__1__Impl : ( ( rule__LidlProgram__ImportsAssignment_1 )* ) ;
    public final void rule__LidlProgram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1316:1: ( ( ( rule__LidlProgram__ImportsAssignment_1 )* ) )
            // InternalLidl.g:1317:1: ( ( rule__LidlProgram__ImportsAssignment_1 )* )
            {
            // InternalLidl.g:1317:1: ( ( rule__LidlProgram__ImportsAssignment_1 )* )
            // InternalLidl.g:1318:2: ( rule__LidlProgram__ImportsAssignment_1 )*
            {
             before(grammarAccess.getLidlProgramAccess().getImportsAssignment_1()); 
            // InternalLidl.g:1319:2: ( rule__LidlProgram__ImportsAssignment_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLidl.g:1319:3: rule__LidlProgram__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__LidlProgram__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getLidlProgramAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group__1__Impl"


    // $ANTLR start "rule__LidlProgram__Group__2"
    // InternalLidl.g:1327:1: rule__LidlProgram__Group__2 : rule__LidlProgram__Group__2__Impl ;
    public final void rule__LidlProgram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1331:1: ( rule__LidlProgram__Group__2__Impl )
            // InternalLidl.g:1332:2: rule__LidlProgram__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlProgram__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group__2"


    // $ANTLR start "rule__LidlProgram__Group__2__Impl"
    // InternalLidl.g:1338:1: rule__LidlProgram__Group__2__Impl : ( ( rule__LidlProgram__DefinitionsAssignment_2 )* ) ;
    public final void rule__LidlProgram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1342:1: ( ( ( rule__LidlProgram__DefinitionsAssignment_2 )* ) )
            // InternalLidl.g:1343:1: ( ( rule__LidlProgram__DefinitionsAssignment_2 )* )
            {
            // InternalLidl.g:1343:1: ( ( rule__LidlProgram__DefinitionsAssignment_2 )* )
            // InternalLidl.g:1344:2: ( rule__LidlProgram__DefinitionsAssignment_2 )*
            {
             before(grammarAccess.getLidlProgramAccess().getDefinitionsAssignment_2()); 
            // InternalLidl.g:1345:2: ( rule__LidlProgram__DefinitionsAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24||(LA20_0>=30 && LA20_0<=31)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLidl.g:1345:3: rule__LidlProgram__DefinitionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__LidlProgram__DefinitionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getLidlProgramAccess().getDefinitionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group__2__Impl"


    // $ANTLR start "rule__LidlProgram__Group_0__0"
    // InternalLidl.g:1354:1: rule__LidlProgram__Group_0__0 : rule__LidlProgram__Group_0__0__Impl rule__LidlProgram__Group_0__1 ;
    public final void rule__LidlProgram__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1358:1: ( rule__LidlProgram__Group_0__0__Impl rule__LidlProgram__Group_0__1 )
            // InternalLidl.g:1359:2: rule__LidlProgram__Group_0__0__Impl rule__LidlProgram__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__LidlProgram__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlProgram__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group_0__0"


    // $ANTLR start "rule__LidlProgram__Group_0__0__Impl"
    // InternalLidl.g:1366:1: rule__LidlProgram__Group_0__0__Impl : ( ( rule__LidlProgram__PackAssignment_0_0 ) ) ;
    public final void rule__LidlProgram__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1370:1: ( ( ( rule__LidlProgram__PackAssignment_0_0 ) ) )
            // InternalLidl.g:1371:1: ( ( rule__LidlProgram__PackAssignment_0_0 ) )
            {
            // InternalLidl.g:1371:1: ( ( rule__LidlProgram__PackAssignment_0_0 ) )
            // InternalLidl.g:1372:2: ( rule__LidlProgram__PackAssignment_0_0 )
            {
             before(grammarAccess.getLidlProgramAccess().getPackAssignment_0_0()); 
            // InternalLidl.g:1373:2: ( rule__LidlProgram__PackAssignment_0_0 )
            // InternalLidl.g:1373:3: rule__LidlProgram__PackAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlProgram__PackAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlProgramAccess().getPackAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group_0__0__Impl"


    // $ANTLR start "rule__LidlProgram__Group_0__1"
    // InternalLidl.g:1381:1: rule__LidlProgram__Group_0__1 : rule__LidlProgram__Group_0__1__Impl rule__LidlProgram__Group_0__2 ;
    public final void rule__LidlProgram__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1385:1: ( rule__LidlProgram__Group_0__1__Impl rule__LidlProgram__Group_0__2 )
            // InternalLidl.g:1386:2: rule__LidlProgram__Group_0__1__Impl rule__LidlProgram__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__LidlProgram__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlProgram__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group_0__1"


    // $ANTLR start "rule__LidlProgram__Group_0__1__Impl"
    // InternalLidl.g:1393:1: rule__LidlProgram__Group_0__1__Impl : ( ( rule__LidlProgram__NameAssignment_0_1 ) ) ;
    public final void rule__LidlProgram__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1397:1: ( ( ( rule__LidlProgram__NameAssignment_0_1 ) ) )
            // InternalLidl.g:1398:1: ( ( rule__LidlProgram__NameAssignment_0_1 ) )
            {
            // InternalLidl.g:1398:1: ( ( rule__LidlProgram__NameAssignment_0_1 ) )
            // InternalLidl.g:1399:2: ( rule__LidlProgram__NameAssignment_0_1 )
            {
             before(grammarAccess.getLidlProgramAccess().getNameAssignment_0_1()); 
            // InternalLidl.g:1400:2: ( rule__LidlProgram__NameAssignment_0_1 )
            // InternalLidl.g:1400:3: rule__LidlProgram__NameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlProgram__NameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlProgramAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group_0__1__Impl"


    // $ANTLR start "rule__LidlProgram__Group_0__2"
    // InternalLidl.g:1408:1: rule__LidlProgram__Group_0__2 : rule__LidlProgram__Group_0__2__Impl ;
    public final void rule__LidlProgram__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1412:1: ( rule__LidlProgram__Group_0__2__Impl )
            // InternalLidl.g:1413:2: rule__LidlProgram__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlProgram__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group_0__2"


    // $ANTLR start "rule__LidlProgram__Group_0__2__Impl"
    // InternalLidl.g:1419:1: rule__LidlProgram__Group_0__2__Impl : ( ';' ) ;
    public final void rule__LidlProgram__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1423:1: ( ( ';' ) )
            // InternalLidl.g:1424:1: ( ';' )
            {
            // InternalLidl.g:1424:1: ( ';' )
            // InternalLidl.g:1425:2: ';'
            {
             before(grammarAccess.getLidlProgramAccess().getSemicolonKeyword_0_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLidlProgramAccess().getSemicolonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__Group_0__2__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalLidl.g:1435:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1439:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalLidl.g:1440:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalLidl.g:1447:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1451:1: ( ( RULE_ID ) )
            // InternalLidl.g:1452:1: ( RULE_ID )
            {
            // InternalLidl.g:1452:1: ( RULE_ID )
            // InternalLidl.g:1453:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalLidl.g:1462:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1466:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalLidl.g:1467:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalLidl.g:1473:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1477:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalLidl.g:1478:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalLidl.g:1478:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalLidl.g:1479:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalLidl.g:1480:2: ( rule__QualifiedName__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==14) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalLidl.g:1480:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalLidl.g:1489:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1493:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalLidl.g:1494:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalLidl.g:1501:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1505:1: ( ( '.' ) )
            // InternalLidl.g:1506:1: ( '.' )
            {
            // InternalLidl.g:1506:1: ( '.' )
            // InternalLidl.g:1507:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalLidl.g:1516:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1520:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalLidl.g:1521:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalLidl.g:1527:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1531:1: ( ( RULE_ID ) )
            // InternalLidl.g:1532:1: ( RULE_ID )
            {
            // InternalLidl.g:1532:1: ( RULE_ID )
            // InternalLidl.g:1533:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__LidlImport__Group__0"
    // InternalLidl.g:1543:1: rule__LidlImport__Group__0 : rule__LidlImport__Group__0__Impl rule__LidlImport__Group__1 ;
    public final void rule__LidlImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1547:1: ( rule__LidlImport__Group__0__Impl rule__LidlImport__Group__1 )
            // InternalLidl.g:1548:2: rule__LidlImport__Group__0__Impl rule__LidlImport__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LidlImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlImport__Group__0"


    // $ANTLR start "rule__LidlImport__Group__0__Impl"
    // InternalLidl.g:1555:1: rule__LidlImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__LidlImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1559:1: ( ( 'import' ) )
            // InternalLidl.g:1560:1: ( 'import' )
            {
            // InternalLidl.g:1560:1: ( 'import' )
            // InternalLidl.g:1561:2: 'import'
            {
             before(grammarAccess.getLidlImportAccess().getImportKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getLidlImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlImport__Group__0__Impl"


    // $ANTLR start "rule__LidlImport__Group__1"
    // InternalLidl.g:1570:1: rule__LidlImport__Group__1 : rule__LidlImport__Group__1__Impl rule__LidlImport__Group__2 ;
    public final void rule__LidlImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1574:1: ( rule__LidlImport__Group__1__Impl rule__LidlImport__Group__2 )
            // InternalLidl.g:1575:2: rule__LidlImport__Group__1__Impl rule__LidlImport__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LidlImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlImport__Group__1"


    // $ANTLR start "rule__LidlImport__Group__1__Impl"
    // InternalLidl.g:1582:1: rule__LidlImport__Group__1__Impl : ( ( rule__LidlImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__LidlImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1586:1: ( ( ( rule__LidlImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalLidl.g:1587:1: ( ( rule__LidlImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalLidl.g:1587:1: ( ( rule__LidlImport__ImportedNamespaceAssignment_1 ) )
            // InternalLidl.g:1588:2: ( rule__LidlImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getLidlImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalLidl.g:1589:2: ( rule__LidlImport__ImportedNamespaceAssignment_1 )
            // InternalLidl.g:1589:3: rule__LidlImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlImport__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlImport__Group__1__Impl"


    // $ANTLR start "rule__LidlImport__Group__2"
    // InternalLidl.g:1597:1: rule__LidlImport__Group__2 : rule__LidlImport__Group__2__Impl ;
    public final void rule__LidlImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1601:1: ( rule__LidlImport__Group__2__Impl )
            // InternalLidl.g:1602:2: rule__LidlImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlImport__Group__2"


    // $ANTLR start "rule__LidlImport__Group__2__Impl"
    // InternalLidl.g:1608:1: rule__LidlImport__Group__2__Impl : ( ';' ) ;
    public final void rule__LidlImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1612:1: ( ( ';' ) )
            // InternalLidl.g:1613:1: ( ';' )
            {
            // InternalLidl.g:1613:1: ( ';' )
            // InternalLidl.g:1614:2: ';'
            {
             before(grammarAccess.getLidlImportAccess().getSemicolonKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLidlImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlImport__Group__2__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalLidl.g:1624:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1628:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalLidl.g:1629:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalLidl.g:1636:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1640:1: ( ( ruleQualifiedName ) )
            // InternalLidl.g:1641:1: ( ruleQualifiedName )
            {
            // InternalLidl.g:1641:1: ( ruleQualifiedName )
            // InternalLidl.g:1642:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalLidl.g:1651:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1655:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalLidl.g:1656:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalLidl.g:1662:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1666:1: ( ( ( '.*' )? ) )
            // InternalLidl.g:1667:1: ( ( '.*' )? )
            {
            // InternalLidl.g:1667:1: ( ( '.*' )? )
            // InternalLidl.g:1668:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalLidl.g:1669:2: ( '.*' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLidl.g:1669:3: '.*'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__LidlData__Group__0"
    // InternalLidl.g:1678:1: rule__LidlData__Group__0 : rule__LidlData__Group__0__Impl rule__LidlData__Group__1 ;
    public final void rule__LidlData__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1682:1: ( rule__LidlData__Group__0__Impl rule__LidlData__Group__1 )
            // InternalLidl.g:1683:2: rule__LidlData__Group__0__Impl rule__LidlData__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LidlData__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlData__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__0"


    // $ANTLR start "rule__LidlData__Group__0__Impl"
    // InternalLidl.g:1690:1: rule__LidlData__Group__0__Impl : ( 'data' ) ;
    public final void rule__LidlData__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1694:1: ( ( 'data' ) )
            // InternalLidl.g:1695:1: ( 'data' )
            {
            // InternalLidl.g:1695:1: ( 'data' )
            // InternalLidl.g:1696:2: 'data'
            {
             before(grammarAccess.getLidlDataAccess().getDataKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLidlDataAccess().getDataKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__0__Impl"


    // $ANTLR start "rule__LidlData__Group__1"
    // InternalLidl.g:1705:1: rule__LidlData__Group__1 : rule__LidlData__Group__1__Impl rule__LidlData__Group__2 ;
    public final void rule__LidlData__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1709:1: ( rule__LidlData__Group__1__Impl rule__LidlData__Group__2 )
            // InternalLidl.g:1710:2: rule__LidlData__Group__1__Impl rule__LidlData__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__LidlData__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlData__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__1"


    // $ANTLR start "rule__LidlData__Group__1__Impl"
    // InternalLidl.g:1717:1: rule__LidlData__Group__1__Impl : ( ( rule__LidlData__NameAssignment_1 ) ) ;
    public final void rule__LidlData__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1721:1: ( ( ( rule__LidlData__NameAssignment_1 ) ) )
            // InternalLidl.g:1722:1: ( ( rule__LidlData__NameAssignment_1 ) )
            {
            // InternalLidl.g:1722:1: ( ( rule__LidlData__NameAssignment_1 ) )
            // InternalLidl.g:1723:2: ( rule__LidlData__NameAssignment_1 )
            {
             before(grammarAccess.getLidlDataAccess().getNameAssignment_1()); 
            // InternalLidl.g:1724:2: ( rule__LidlData__NameAssignment_1 )
            // InternalLidl.g:1724:3: rule__LidlData__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlData__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlDataAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__1__Impl"


    // $ANTLR start "rule__LidlData__Group__2"
    // InternalLidl.g:1732:1: rule__LidlData__Group__2 : rule__LidlData__Group__2__Impl rule__LidlData__Group__3 ;
    public final void rule__LidlData__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1736:1: ( rule__LidlData__Group__2__Impl rule__LidlData__Group__3 )
            // InternalLidl.g:1737:2: rule__LidlData__Group__2__Impl rule__LidlData__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__LidlData__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlData__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__2"


    // $ANTLR start "rule__LidlData__Group__2__Impl"
    // InternalLidl.g:1744:1: rule__LidlData__Group__2__Impl : ( ( rule__LidlData__Group_2__0 )? ) ;
    public final void rule__LidlData__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1748:1: ( ( ( rule__LidlData__Group_2__0 )? ) )
            // InternalLidl.g:1749:1: ( ( rule__LidlData__Group_2__0 )? )
            {
            // InternalLidl.g:1749:1: ( ( rule__LidlData__Group_2__0 )? )
            // InternalLidl.g:1750:2: ( rule__LidlData__Group_2__0 )?
            {
             before(grammarAccess.getLidlDataAccess().getGroup_2()); 
            // InternalLidl.g:1751:2: ( rule__LidlData__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalLidl.g:1751:3: rule__LidlData__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlData__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLidlDataAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__2__Impl"


    // $ANTLR start "rule__LidlData__Group__3"
    // InternalLidl.g:1759:1: rule__LidlData__Group__3 : rule__LidlData__Group__3__Impl rule__LidlData__Group__4 ;
    public final void rule__LidlData__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1763:1: ( rule__LidlData__Group__3__Impl rule__LidlData__Group__4 )
            // InternalLidl.g:1764:2: rule__LidlData__Group__3__Impl rule__LidlData__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__LidlData__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlData__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__3"


    // $ANTLR start "rule__LidlData__Group__3__Impl"
    // InternalLidl.g:1771:1: rule__LidlData__Group__3__Impl : ( 'is' ) ;
    public final void rule__LidlData__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1775:1: ( ( 'is' ) )
            // InternalLidl.g:1776:1: ( 'is' )
            {
            // InternalLidl.g:1776:1: ( 'is' )
            // InternalLidl.g:1777:2: 'is'
            {
             before(grammarAccess.getLidlDataAccess().getIsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLidlDataAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__3__Impl"


    // $ANTLR start "rule__LidlData__Group__4"
    // InternalLidl.g:1786:1: rule__LidlData__Group__4 : rule__LidlData__Group__4__Impl ;
    public final void rule__LidlData__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1790:1: ( rule__LidlData__Group__4__Impl )
            // InternalLidl.g:1791:2: rule__LidlData__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlData__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__4"


    // $ANTLR start "rule__LidlData__Group__4__Impl"
    // InternalLidl.g:1797:1: rule__LidlData__Group__4__Impl : ( ( rule__LidlData__Alternatives_4 ) ) ;
    public final void rule__LidlData__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1801:1: ( ( ( rule__LidlData__Alternatives_4 ) ) )
            // InternalLidl.g:1802:1: ( ( rule__LidlData__Alternatives_4 ) )
            {
            // InternalLidl.g:1802:1: ( ( rule__LidlData__Alternatives_4 ) )
            // InternalLidl.g:1803:2: ( rule__LidlData__Alternatives_4 )
            {
             before(grammarAccess.getLidlDataAccess().getAlternatives_4()); 
            // InternalLidl.g:1804:2: ( rule__LidlData__Alternatives_4 )
            // InternalLidl.g:1804:3: rule__LidlData__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__LidlData__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getLidlDataAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group__4__Impl"


    // $ANTLR start "rule__LidlData__Group_2__0"
    // InternalLidl.g:1813:1: rule__LidlData__Group_2__0 : rule__LidlData__Group_2__0__Impl rule__LidlData__Group_2__1 ;
    public final void rule__LidlData__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1817:1: ( rule__LidlData__Group_2__0__Impl rule__LidlData__Group_2__1 )
            // InternalLidl.g:1818:2: rule__LidlData__Group_2__0__Impl rule__LidlData__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__LidlData__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlData__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group_2__0"


    // $ANTLR start "rule__LidlData__Group_2__0__Impl"
    // InternalLidl.g:1825:1: rule__LidlData__Group_2__0__Impl : ( ( rule__LidlData__NestedAssignment_2_0 ) ) ;
    public final void rule__LidlData__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1829:1: ( ( ( rule__LidlData__NestedAssignment_2_0 ) ) )
            // InternalLidl.g:1830:1: ( ( rule__LidlData__NestedAssignment_2_0 ) )
            {
            // InternalLidl.g:1830:1: ( ( rule__LidlData__NestedAssignment_2_0 ) )
            // InternalLidl.g:1831:2: ( rule__LidlData__NestedAssignment_2_0 )
            {
             before(grammarAccess.getLidlDataAccess().getNestedAssignment_2_0()); 
            // InternalLidl.g:1832:2: ( rule__LidlData__NestedAssignment_2_0 )
            // InternalLidl.g:1832:3: rule__LidlData__NestedAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlData__NestedAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlDataAccess().getNestedAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group_2__0__Impl"


    // $ANTLR start "rule__LidlData__Group_2__1"
    // InternalLidl.g:1840:1: rule__LidlData__Group_2__1 : rule__LidlData__Group_2__1__Impl ;
    public final void rule__LidlData__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1844:1: ( rule__LidlData__Group_2__1__Impl )
            // InternalLidl.g:1845:2: rule__LidlData__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlData__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group_2__1"


    // $ANTLR start "rule__LidlData__Group_2__1__Impl"
    // InternalLidl.g:1851:1: rule__LidlData__Group_2__1__Impl : ( ( ( rule__LidlData__NestedDefAssignment_2_1 ) ) ( ( rule__LidlData__NestedDefAssignment_2_1 )* ) ) ;
    public final void rule__LidlData__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1855:1: ( ( ( ( rule__LidlData__NestedDefAssignment_2_1 ) ) ( ( rule__LidlData__NestedDefAssignment_2_1 )* ) ) )
            // InternalLidl.g:1856:1: ( ( ( rule__LidlData__NestedDefAssignment_2_1 ) ) ( ( rule__LidlData__NestedDefAssignment_2_1 )* ) )
            {
            // InternalLidl.g:1856:1: ( ( ( rule__LidlData__NestedDefAssignment_2_1 ) ) ( ( rule__LidlData__NestedDefAssignment_2_1 )* ) )
            // InternalLidl.g:1857:2: ( ( rule__LidlData__NestedDefAssignment_2_1 ) ) ( ( rule__LidlData__NestedDefAssignment_2_1 )* )
            {
            // InternalLidl.g:1857:2: ( ( rule__LidlData__NestedDefAssignment_2_1 ) )
            // InternalLidl.g:1858:3: ( rule__LidlData__NestedDefAssignment_2_1 )
            {
             before(grammarAccess.getLidlDataAccess().getNestedDefAssignment_2_1()); 
            // InternalLidl.g:1859:3: ( rule__LidlData__NestedDefAssignment_2_1 )
            // InternalLidl.g:1859:4: rule__LidlData__NestedDefAssignment_2_1
            {
            pushFollow(FOLLOW_14);
            rule__LidlData__NestedDefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlDataAccess().getNestedDefAssignment_2_1()); 

            }

            // InternalLidl.g:1862:2: ( ( rule__LidlData__NestedDefAssignment_2_1 )* )
            // InternalLidl.g:1863:3: ( rule__LidlData__NestedDefAssignment_2_1 )*
            {
             before(grammarAccess.getLidlDataAccess().getNestedDefAssignment_2_1()); 
            // InternalLidl.g:1864:3: ( rule__LidlData__NestedDefAssignment_2_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==24) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLidl.g:1864:4: rule__LidlData__NestedDefAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__LidlData__NestedDefAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLidlDataAccess().getNestedDefAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__Group_2__1__Impl"


    // $ANTLR start "rule__CompositeDataType__Group__0"
    // InternalLidl.g:1874:1: rule__CompositeDataType__Group__0 : rule__CompositeDataType__Group__0__Impl rule__CompositeDataType__Group__1 ;
    public final void rule__CompositeDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1878:1: ( rule__CompositeDataType__Group__0__Impl rule__CompositeDataType__Group__1 )
            // InternalLidl.g:1879:2: rule__CompositeDataType__Group__0__Impl rule__CompositeDataType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CompositeDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__0"


    // $ANTLR start "rule__CompositeDataType__Group__0__Impl"
    // InternalLidl.g:1886:1: rule__CompositeDataType__Group__0__Impl : ( () ) ;
    public final void rule__CompositeDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1890:1: ( ( () ) )
            // InternalLidl.g:1891:1: ( () )
            {
            // InternalLidl.g:1891:1: ( () )
            // InternalLidl.g:1892:2: ()
            {
             before(grammarAccess.getCompositeDataTypeAccess().getCompositeDataTypeAction_0()); 
            // InternalLidl.g:1893:2: ()
            // InternalLidl.g:1893:3: 
            {
            }

             after(grammarAccess.getCompositeDataTypeAccess().getCompositeDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__0__Impl"


    // $ANTLR start "rule__CompositeDataType__Group__1"
    // InternalLidl.g:1901:1: rule__CompositeDataType__Group__1 : rule__CompositeDataType__Group__1__Impl rule__CompositeDataType__Group__2 ;
    public final void rule__CompositeDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1905:1: ( rule__CompositeDataType__Group__1__Impl rule__CompositeDataType__Group__2 )
            // InternalLidl.g:1906:2: rule__CompositeDataType__Group__1__Impl rule__CompositeDataType__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CompositeDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__1"


    // $ANTLR start "rule__CompositeDataType__Group__1__Impl"
    // InternalLidl.g:1913:1: rule__CompositeDataType__Group__1__Impl : ( '{' ) ;
    public final void rule__CompositeDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1917:1: ( ( '{' ) )
            // InternalLidl.g:1918:1: ( '{' )
            {
            // InternalLidl.g:1918:1: ( '{' )
            // InternalLidl.g:1919:2: '{'
            {
             before(grammarAccess.getCompositeDataTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositeDataTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__1__Impl"


    // $ANTLR start "rule__CompositeDataType__Group__2"
    // InternalLidl.g:1928:1: rule__CompositeDataType__Group__2 : rule__CompositeDataType__Group__2__Impl rule__CompositeDataType__Group__3 ;
    public final void rule__CompositeDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1932:1: ( rule__CompositeDataType__Group__2__Impl rule__CompositeDataType__Group__3 )
            // InternalLidl.g:1933:2: rule__CompositeDataType__Group__2__Impl rule__CompositeDataType__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__CompositeDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__2"


    // $ANTLR start "rule__CompositeDataType__Group__2__Impl"
    // InternalLidl.g:1940:1: rule__CompositeDataType__Group__2__Impl : ( ( rule__CompositeDataType__ItemsAssignment_2 ) ) ;
    public final void rule__CompositeDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1944:1: ( ( ( rule__CompositeDataType__ItemsAssignment_2 ) ) )
            // InternalLidl.g:1945:1: ( ( rule__CompositeDataType__ItemsAssignment_2 ) )
            {
            // InternalLidl.g:1945:1: ( ( rule__CompositeDataType__ItemsAssignment_2 ) )
            // InternalLidl.g:1946:2: ( rule__CompositeDataType__ItemsAssignment_2 )
            {
             before(grammarAccess.getCompositeDataTypeAccess().getItemsAssignment_2()); 
            // InternalLidl.g:1947:2: ( rule__CompositeDataType__ItemsAssignment_2 )
            // InternalLidl.g:1947:3: rule__CompositeDataType__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataType__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeDataTypeAccess().getItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__2__Impl"


    // $ANTLR start "rule__CompositeDataType__Group__3"
    // InternalLidl.g:1955:1: rule__CompositeDataType__Group__3 : rule__CompositeDataType__Group__3__Impl rule__CompositeDataType__Group__4 ;
    public final void rule__CompositeDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1959:1: ( rule__CompositeDataType__Group__3__Impl rule__CompositeDataType__Group__4 )
            // InternalLidl.g:1960:2: rule__CompositeDataType__Group__3__Impl rule__CompositeDataType__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CompositeDataType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__3"


    // $ANTLR start "rule__CompositeDataType__Group__3__Impl"
    // InternalLidl.g:1967:1: rule__CompositeDataType__Group__3__Impl : ( ( rule__CompositeDataType__Group_3__0 )* ) ;
    public final void rule__CompositeDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1971:1: ( ( ( rule__CompositeDataType__Group_3__0 )* ) )
            // InternalLidl.g:1972:1: ( ( rule__CompositeDataType__Group_3__0 )* )
            {
            // InternalLidl.g:1972:1: ( ( rule__CompositeDataType__Group_3__0 )* )
            // InternalLidl.g:1973:2: ( rule__CompositeDataType__Group_3__0 )*
            {
             before(grammarAccess.getCompositeDataTypeAccess().getGroup_3()); 
            // InternalLidl.g:1974:2: ( rule__CompositeDataType__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==13) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalLidl.g:1974:3: rule__CompositeDataType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CompositeDataType__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getCompositeDataTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__3__Impl"


    // $ANTLR start "rule__CompositeDataType__Group__4"
    // InternalLidl.g:1982:1: rule__CompositeDataType__Group__4 : rule__CompositeDataType__Group__4__Impl ;
    public final void rule__CompositeDataType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1986:1: ( rule__CompositeDataType__Group__4__Impl )
            // InternalLidl.g:1987:2: rule__CompositeDataType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__4"


    // $ANTLR start "rule__CompositeDataType__Group__4__Impl"
    // InternalLidl.g:1993:1: rule__CompositeDataType__Group__4__Impl : ( '}' ) ;
    public final void rule__CompositeDataType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:1997:1: ( ( '}' ) )
            // InternalLidl.g:1998:1: ( '}' )
            {
            // InternalLidl.g:1998:1: ( '}' )
            // InternalLidl.g:1999:2: '}'
            {
             before(grammarAccess.getCompositeDataTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeDataTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group__4__Impl"


    // $ANTLR start "rule__CompositeDataType__Group_3__0"
    // InternalLidl.g:2009:1: rule__CompositeDataType__Group_3__0 : rule__CompositeDataType__Group_3__0__Impl rule__CompositeDataType__Group_3__1 ;
    public final void rule__CompositeDataType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2013:1: ( rule__CompositeDataType__Group_3__0__Impl rule__CompositeDataType__Group_3__1 )
            // InternalLidl.g:2014:2: rule__CompositeDataType__Group_3__0__Impl rule__CompositeDataType__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeDataType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group_3__0"


    // $ANTLR start "rule__CompositeDataType__Group_3__0__Impl"
    // InternalLidl.g:2021:1: rule__CompositeDataType__Group_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeDataType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2025:1: ( ( ',' ) )
            // InternalLidl.g:2026:1: ( ',' )
            {
            // InternalLidl.g:2026:1: ( ',' )
            // InternalLidl.g:2027:2: ','
            {
             before(grammarAccess.getCompositeDataTypeAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompositeDataTypeAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeDataType__Group_3__1"
    // InternalLidl.g:2036:1: rule__CompositeDataType__Group_3__1 : rule__CompositeDataType__Group_3__1__Impl ;
    public final void rule__CompositeDataType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2040:1: ( rule__CompositeDataType__Group_3__1__Impl )
            // InternalLidl.g:2041:2: rule__CompositeDataType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group_3__1"


    // $ANTLR start "rule__CompositeDataType__Group_3__1__Impl"
    // InternalLidl.g:2047:1: rule__CompositeDataType__Group_3__1__Impl : ( ( rule__CompositeDataType__ItemsAssignment_3_1 ) ) ;
    public final void rule__CompositeDataType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2051:1: ( ( ( rule__CompositeDataType__ItemsAssignment_3_1 ) ) )
            // InternalLidl.g:2052:1: ( ( rule__CompositeDataType__ItemsAssignment_3_1 ) )
            {
            // InternalLidl.g:2052:1: ( ( rule__CompositeDataType__ItemsAssignment_3_1 ) )
            // InternalLidl.g:2053:2: ( rule__CompositeDataType__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getCompositeDataTypeAccess().getItemsAssignment_3_1()); 
            // InternalLidl.g:2054:2: ( rule__CompositeDataType__ItemsAssignment_3_1 )
            // InternalLidl.g:2054:3: rule__CompositeDataType__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataType__ItemsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeDataTypeAccess().getItemsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__Group_3__1__Impl"


    // $ANTLR start "rule__RefDataType__Group__0"
    // InternalLidl.g:2063:1: rule__RefDataType__Group__0 : rule__RefDataType__Group__0__Impl rule__RefDataType__Group__1 ;
    public final void rule__RefDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2067:1: ( rule__RefDataType__Group__0__Impl rule__RefDataType__Group__1 )
            // InternalLidl.g:2068:2: rule__RefDataType__Group__0__Impl rule__RefDataType__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__RefDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataType__Group__0"


    // $ANTLR start "rule__RefDataType__Group__0__Impl"
    // InternalLidl.g:2075:1: rule__RefDataType__Group__0__Impl : ( () ) ;
    public final void rule__RefDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2079:1: ( ( () ) )
            // InternalLidl.g:2080:1: ( () )
            {
            // InternalLidl.g:2080:1: ( () )
            // InternalLidl.g:2081:2: ()
            {
             before(grammarAccess.getRefDataTypeAccess().getRefDataTypeAction_0()); 
            // InternalLidl.g:2082:2: ()
            // InternalLidl.g:2082:3: 
            {
            }

             after(grammarAccess.getRefDataTypeAccess().getRefDataTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataType__Group__0__Impl"


    // $ANTLR start "rule__RefDataType__Group__1"
    // InternalLidl.g:2090:1: rule__RefDataType__Group__1 : rule__RefDataType__Group__1__Impl ;
    public final void rule__RefDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2094:1: ( rule__RefDataType__Group__1__Impl )
            // InternalLidl.g:2095:2: rule__RefDataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefDataType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataType__Group__1"


    // $ANTLR start "rule__RefDataType__Group__1__Impl"
    // InternalLidl.g:2101:1: rule__RefDataType__Group__1__Impl : ( ( rule__RefDataType__ItemsAssignment_1 ) ) ;
    public final void rule__RefDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2105:1: ( ( ( rule__RefDataType__ItemsAssignment_1 ) ) )
            // InternalLidl.g:2106:1: ( ( rule__RefDataType__ItemsAssignment_1 ) )
            {
            // InternalLidl.g:2106:1: ( ( rule__RefDataType__ItemsAssignment_1 ) )
            // InternalLidl.g:2107:2: ( rule__RefDataType__ItemsAssignment_1 )
            {
             before(grammarAccess.getRefDataTypeAccess().getItemsAssignment_1()); 
            // InternalLidl.g:2108:2: ( rule__RefDataType__ItemsAssignment_1 )
            // InternalLidl.g:2108:3: rule__RefDataType__ItemsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RefDataType__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefDataTypeAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataType__Group__1__Impl"


    // $ANTLR start "rule__CompositeDataTypeElement__Group__0"
    // InternalLidl.g:2117:1: rule__CompositeDataTypeElement__Group__0 : rule__CompositeDataTypeElement__Group__0__Impl rule__CompositeDataTypeElement__Group__1 ;
    public final void rule__CompositeDataTypeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2121:1: ( rule__CompositeDataTypeElement__Group__0__Impl rule__CompositeDataTypeElement__Group__1 )
            // InternalLidl.g:2122:2: rule__CompositeDataTypeElement__Group__0__Impl rule__CompositeDataTypeElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeDataTypeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group__0"


    // $ANTLR start "rule__CompositeDataTypeElement__Group__0__Impl"
    // InternalLidl.g:2129:1: rule__CompositeDataTypeElement__Group__0__Impl : ( () ) ;
    public final void rule__CompositeDataTypeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2133:1: ( ( () ) )
            // InternalLidl.g:2134:1: ( () )
            {
            // InternalLidl.g:2134:1: ( () )
            // InternalLidl.g:2135:2: ()
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getCompositeDataTypeElementAction_0()); 
            // InternalLidl.g:2136:2: ()
            // InternalLidl.g:2136:3: 
            {
            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getCompositeDataTypeElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group__0__Impl"


    // $ANTLR start "rule__CompositeDataTypeElement__Group__1"
    // InternalLidl.g:2144:1: rule__CompositeDataTypeElement__Group__1 : rule__CompositeDataTypeElement__Group__1__Impl rule__CompositeDataTypeElement__Group__2 ;
    public final void rule__CompositeDataTypeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2148:1: ( rule__CompositeDataTypeElement__Group__1__Impl rule__CompositeDataTypeElement__Group__2 )
            // InternalLidl.g:2149:2: rule__CompositeDataTypeElement__Group__1__Impl rule__CompositeDataTypeElement__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__CompositeDataTypeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group__1"


    // $ANTLR start "rule__CompositeDataTypeElement__Group__1__Impl"
    // InternalLidl.g:2156:1: rule__CompositeDataTypeElement__Group__1__Impl : ( ( rule__CompositeDataTypeElement__NameAssignment_1 ) ) ;
    public final void rule__CompositeDataTypeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2160:1: ( ( ( rule__CompositeDataTypeElement__NameAssignment_1 ) ) )
            // InternalLidl.g:2161:1: ( ( rule__CompositeDataTypeElement__NameAssignment_1 ) )
            {
            // InternalLidl.g:2161:1: ( ( rule__CompositeDataTypeElement__NameAssignment_1 ) )
            // InternalLidl.g:2162:2: ( rule__CompositeDataTypeElement__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getNameAssignment_1()); 
            // InternalLidl.g:2163:2: ( rule__CompositeDataTypeElement__NameAssignment_1 )
            // InternalLidl.g:2163:3: rule__CompositeDataTypeElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group__1__Impl"


    // $ANTLR start "rule__CompositeDataTypeElement__Group__2"
    // InternalLidl.g:2171:1: rule__CompositeDataTypeElement__Group__2 : rule__CompositeDataTypeElement__Group__2__Impl rule__CompositeDataTypeElement__Group__3 ;
    public final void rule__CompositeDataTypeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2175:1: ( rule__CompositeDataTypeElement__Group__2__Impl rule__CompositeDataTypeElement__Group__3 )
            // InternalLidl.g:2176:2: rule__CompositeDataTypeElement__Group__2__Impl rule__CompositeDataTypeElement__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__CompositeDataTypeElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group__2"


    // $ANTLR start "rule__CompositeDataTypeElement__Group__2__Impl"
    // InternalLidl.g:2183:1: rule__CompositeDataTypeElement__Group__2__Impl : ( ':' ) ;
    public final void rule__CompositeDataTypeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2187:1: ( ( ':' ) )
            // InternalLidl.g:2188:1: ( ':' )
            {
            // InternalLidl.g:2188:1: ( ':' )
            // InternalLidl.g:2189:2: ':'
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeDataTypeElementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group__2__Impl"


    // $ANTLR start "rule__CompositeDataTypeElement__Group__3"
    // InternalLidl.g:2198:1: rule__CompositeDataTypeElement__Group__3 : rule__CompositeDataTypeElement__Group__3__Impl ;
    public final void rule__CompositeDataTypeElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2202:1: ( rule__CompositeDataTypeElement__Group__3__Impl )
            // InternalLidl.g:2203:2: rule__CompositeDataTypeElement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group__3"


    // $ANTLR start "rule__CompositeDataTypeElement__Group__3__Impl"
    // InternalLidl.g:2209:1: rule__CompositeDataTypeElement__Group__3__Impl : ( ( rule__CompositeDataTypeElement__Alternatives_3 ) ) ;
    public final void rule__CompositeDataTypeElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2213:1: ( ( ( rule__CompositeDataTypeElement__Alternatives_3 ) ) )
            // InternalLidl.g:2214:1: ( ( rule__CompositeDataTypeElement__Alternatives_3 ) )
            {
            // InternalLidl.g:2214:1: ( ( rule__CompositeDataTypeElement__Alternatives_3 ) )
            // InternalLidl.g:2215:2: ( rule__CompositeDataTypeElement__Alternatives_3 )
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getAlternatives_3()); 
            // InternalLidl.g:2216:2: ( rule__CompositeDataTypeElement__Alternatives_3 )
            // InternalLidl.g:2216:3: rule__CompositeDataTypeElement__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group__3__Impl"


    // $ANTLR start "rule__CompositeDataTypeElement__Group_3_1__0"
    // InternalLidl.g:2225:1: rule__CompositeDataTypeElement__Group_3_1__0 : rule__CompositeDataTypeElement__Group_3_1__0__Impl rule__CompositeDataTypeElement__Group_3_1__1 ;
    public final void rule__CompositeDataTypeElement__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2229:1: ( rule__CompositeDataTypeElement__Group_3_1__0__Impl rule__CompositeDataTypeElement__Group_3_1__1 )
            // InternalLidl.g:2230:2: rule__CompositeDataTypeElement__Group_3_1__0__Impl rule__CompositeDataTypeElement__Group_3_1__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeDataTypeElement__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group_3_1__0"


    // $ANTLR start "rule__CompositeDataTypeElement__Group_3_1__0__Impl"
    // InternalLidl.g:2237:1: rule__CompositeDataTypeElement__Group_3_1__0__Impl : ( ( rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0 ) ) ;
    public final void rule__CompositeDataTypeElement__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2241:1: ( ( ( rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0 ) ) )
            // InternalLidl.g:2242:1: ( ( rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0 ) )
            {
            // InternalLidl.g:2242:1: ( ( rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0 ) )
            // InternalLidl.g:2243:2: ( rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0 )
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getIsArrayAssignment_3_1_0()); 
            // InternalLidl.g:2244:2: ( rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0 )
            // InternalLidl.g:2244:3: rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getIsArrayAssignment_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group_3_1__0__Impl"


    // $ANTLR start "rule__CompositeDataTypeElement__Group_3_1__1"
    // InternalLidl.g:2252:1: rule__CompositeDataTypeElement__Group_3_1__1 : rule__CompositeDataTypeElement__Group_3_1__1__Impl rule__CompositeDataTypeElement__Group_3_1__2 ;
    public final void rule__CompositeDataTypeElement__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2256:1: ( rule__CompositeDataTypeElement__Group_3_1__1__Impl rule__CompositeDataTypeElement__Group_3_1__2 )
            // InternalLidl.g:2257:2: rule__CompositeDataTypeElement__Group_3_1__1__Impl rule__CompositeDataTypeElement__Group_3_1__2
            {
            pushFollow(FOLLOW_21);
            rule__CompositeDataTypeElement__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group_3_1__1"


    // $ANTLR start "rule__CompositeDataTypeElement__Group_3_1__1__Impl"
    // InternalLidl.g:2264:1: rule__CompositeDataTypeElement__Group_3_1__1__Impl : ( ( rule__CompositeDataTypeElement__TypeAssignment_3_1_1 ) ) ;
    public final void rule__CompositeDataTypeElement__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2268:1: ( ( ( rule__CompositeDataTypeElement__TypeAssignment_3_1_1 ) ) )
            // InternalLidl.g:2269:1: ( ( rule__CompositeDataTypeElement__TypeAssignment_3_1_1 ) )
            {
            // InternalLidl.g:2269:1: ( ( rule__CompositeDataTypeElement__TypeAssignment_3_1_1 ) )
            // InternalLidl.g:2270:2: ( rule__CompositeDataTypeElement__TypeAssignment_3_1_1 )
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getTypeAssignment_3_1_1()); 
            // InternalLidl.g:2271:2: ( rule__CompositeDataTypeElement__TypeAssignment_3_1_1 )
            // InternalLidl.g:2271:3: rule__CompositeDataTypeElement__TypeAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__TypeAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getTypeAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group_3_1__1__Impl"


    // $ANTLR start "rule__CompositeDataTypeElement__Group_3_1__2"
    // InternalLidl.g:2279:1: rule__CompositeDataTypeElement__Group_3_1__2 : rule__CompositeDataTypeElement__Group_3_1__2__Impl ;
    public final void rule__CompositeDataTypeElement__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2283:1: ( rule__CompositeDataTypeElement__Group_3_1__2__Impl )
            // InternalLidl.g:2284:2: rule__CompositeDataTypeElement__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeDataTypeElement__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group_3_1__2"


    // $ANTLR start "rule__CompositeDataTypeElement__Group_3_1__2__Impl"
    // InternalLidl.g:2290:1: rule__CompositeDataTypeElement__Group_3_1__2__Impl : ( ']' ) ;
    public final void rule__CompositeDataTypeElement__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2294:1: ( ( ']' ) )
            // InternalLidl.g:2295:1: ( ']' )
            {
            // InternalLidl.g:2295:1: ( ']' )
            // InternalLidl.g:2296:2: ']'
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getRightSquareBracketKeyword_3_1_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCompositeDataTypeElementAccess().getRightSquareBracketKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__Group_3_1__2__Impl"


    // $ANTLR start "rule__RefDataTypeElement__Group_0__0"
    // InternalLidl.g:2306:1: rule__RefDataTypeElement__Group_0__0 : rule__RefDataTypeElement__Group_0__0__Impl rule__RefDataTypeElement__Group_0__1 ;
    public final void rule__RefDataTypeElement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2310:1: ( rule__RefDataTypeElement__Group_0__0__Impl rule__RefDataTypeElement__Group_0__1 )
            // InternalLidl.g:2311:2: rule__RefDataTypeElement__Group_0__0__Impl rule__RefDataTypeElement__Group_0__1
            {
            pushFollow(FOLLOW_6);
            rule__RefDataTypeElement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_0__0"


    // $ANTLR start "rule__RefDataTypeElement__Group_0__0__Impl"
    // InternalLidl.g:2318:1: rule__RefDataTypeElement__Group_0__0__Impl : ( () ) ;
    public final void rule__RefDataTypeElement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2322:1: ( ( () ) )
            // InternalLidl.g:2323:1: ( () )
            {
            // InternalLidl.g:2323:1: ( () )
            // InternalLidl.g:2324:2: ()
            {
             before(grammarAccess.getRefDataTypeElementAccess().getRefDataTypeElementAction_0_0()); 
            // InternalLidl.g:2325:2: ()
            // InternalLidl.g:2325:3: 
            {
            }

             after(grammarAccess.getRefDataTypeElementAccess().getRefDataTypeElementAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_0__0__Impl"


    // $ANTLR start "rule__RefDataTypeElement__Group_0__1"
    // InternalLidl.g:2333:1: rule__RefDataTypeElement__Group_0__1 : rule__RefDataTypeElement__Group_0__1__Impl ;
    public final void rule__RefDataTypeElement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2337:1: ( rule__RefDataTypeElement__Group_0__1__Impl )
            // InternalLidl.g:2338:2: rule__RefDataTypeElement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_0__1"


    // $ANTLR start "rule__RefDataTypeElement__Group_0__1__Impl"
    // InternalLidl.g:2344:1: rule__RefDataTypeElement__Group_0__1__Impl : ( ( rule__RefDataTypeElement__TypeAssignment_0_1 ) ) ;
    public final void rule__RefDataTypeElement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2348:1: ( ( ( rule__RefDataTypeElement__TypeAssignment_0_1 ) ) )
            // InternalLidl.g:2349:1: ( ( rule__RefDataTypeElement__TypeAssignment_0_1 ) )
            {
            // InternalLidl.g:2349:1: ( ( rule__RefDataTypeElement__TypeAssignment_0_1 ) )
            // InternalLidl.g:2350:2: ( rule__RefDataTypeElement__TypeAssignment_0_1 )
            {
             before(grammarAccess.getRefDataTypeElementAccess().getTypeAssignment_0_1()); 
            // InternalLidl.g:2351:2: ( rule__RefDataTypeElement__TypeAssignment_0_1 )
            // InternalLidl.g:2351:3: rule__RefDataTypeElement__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__TypeAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRefDataTypeElementAccess().getTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_0__1__Impl"


    // $ANTLR start "rule__RefDataTypeElement__Group_1__0"
    // InternalLidl.g:2360:1: rule__RefDataTypeElement__Group_1__0 : rule__RefDataTypeElement__Group_1__0__Impl rule__RefDataTypeElement__Group_1__1 ;
    public final void rule__RefDataTypeElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2364:1: ( rule__RefDataTypeElement__Group_1__0__Impl rule__RefDataTypeElement__Group_1__1 )
            // InternalLidl.g:2365:2: rule__RefDataTypeElement__Group_1__0__Impl rule__RefDataTypeElement__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__RefDataTypeElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_1__0"


    // $ANTLR start "rule__RefDataTypeElement__Group_1__0__Impl"
    // InternalLidl.g:2372:1: rule__RefDataTypeElement__Group_1__0__Impl : ( ( rule__RefDataTypeElement__IsArrayAssignment_1_0 ) ) ;
    public final void rule__RefDataTypeElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2376:1: ( ( ( rule__RefDataTypeElement__IsArrayAssignment_1_0 ) ) )
            // InternalLidl.g:2377:1: ( ( rule__RefDataTypeElement__IsArrayAssignment_1_0 ) )
            {
            // InternalLidl.g:2377:1: ( ( rule__RefDataTypeElement__IsArrayAssignment_1_0 ) )
            // InternalLidl.g:2378:2: ( rule__RefDataTypeElement__IsArrayAssignment_1_0 )
            {
             before(grammarAccess.getRefDataTypeElementAccess().getIsArrayAssignment_1_0()); 
            // InternalLidl.g:2379:2: ( rule__RefDataTypeElement__IsArrayAssignment_1_0 )
            // InternalLidl.g:2379:3: rule__RefDataTypeElement__IsArrayAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__IsArrayAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRefDataTypeElementAccess().getIsArrayAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_1__0__Impl"


    // $ANTLR start "rule__RefDataTypeElement__Group_1__1"
    // InternalLidl.g:2387:1: rule__RefDataTypeElement__Group_1__1 : rule__RefDataTypeElement__Group_1__1__Impl rule__RefDataTypeElement__Group_1__2 ;
    public final void rule__RefDataTypeElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2391:1: ( rule__RefDataTypeElement__Group_1__1__Impl rule__RefDataTypeElement__Group_1__2 )
            // InternalLidl.g:2392:2: rule__RefDataTypeElement__Group_1__1__Impl rule__RefDataTypeElement__Group_1__2
            {
            pushFollow(FOLLOW_21);
            rule__RefDataTypeElement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_1__1"


    // $ANTLR start "rule__RefDataTypeElement__Group_1__1__Impl"
    // InternalLidl.g:2399:1: rule__RefDataTypeElement__Group_1__1__Impl : ( ( rule__RefDataTypeElement__TypeAssignment_1_1 ) ) ;
    public final void rule__RefDataTypeElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2403:1: ( ( ( rule__RefDataTypeElement__TypeAssignment_1_1 ) ) )
            // InternalLidl.g:2404:1: ( ( rule__RefDataTypeElement__TypeAssignment_1_1 ) )
            {
            // InternalLidl.g:2404:1: ( ( rule__RefDataTypeElement__TypeAssignment_1_1 ) )
            // InternalLidl.g:2405:2: ( rule__RefDataTypeElement__TypeAssignment_1_1 )
            {
             before(grammarAccess.getRefDataTypeElementAccess().getTypeAssignment_1_1()); 
            // InternalLidl.g:2406:2: ( rule__RefDataTypeElement__TypeAssignment_1_1 )
            // InternalLidl.g:2406:3: rule__RefDataTypeElement__TypeAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__TypeAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRefDataTypeElementAccess().getTypeAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_1__1__Impl"


    // $ANTLR start "rule__RefDataTypeElement__Group_1__2"
    // InternalLidl.g:2414:1: rule__RefDataTypeElement__Group_1__2 : rule__RefDataTypeElement__Group_1__2__Impl ;
    public final void rule__RefDataTypeElement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2418:1: ( rule__RefDataTypeElement__Group_1__2__Impl )
            // InternalLidl.g:2419:2: rule__RefDataTypeElement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefDataTypeElement__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_1__2"


    // $ANTLR start "rule__RefDataTypeElement__Group_1__2__Impl"
    // InternalLidl.g:2425:1: rule__RefDataTypeElement__Group_1__2__Impl : ( ']' ) ;
    public final void rule__RefDataTypeElement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2429:1: ( ( ']' ) )
            // InternalLidl.g:2430:1: ( ']' )
            {
            // InternalLidl.g:2430:1: ( ']' )
            // InternalLidl.g:2431:2: ']'
            {
             before(grammarAccess.getRefDataTypeElementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRefDataTypeElementAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__Group_1__2__Impl"


    // $ANTLR start "rule__LidlInterface__Group__0"
    // InternalLidl.g:2441:1: rule__LidlInterface__Group__0 : rule__LidlInterface__Group__0__Impl rule__LidlInterface__Group__1 ;
    public final void rule__LidlInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2445:1: ( rule__LidlInterface__Group__0__Impl rule__LidlInterface__Group__1 )
            // InternalLidl.g:2446:2: rule__LidlInterface__Group__0__Impl rule__LidlInterface__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LidlInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__0"


    // $ANTLR start "rule__LidlInterface__Group__0__Impl"
    // InternalLidl.g:2453:1: rule__LidlInterface__Group__0__Impl : ( 'interface' ) ;
    public final void rule__LidlInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2457:1: ( ( 'interface' ) )
            // InternalLidl.g:2458:1: ( 'interface' )
            {
            // InternalLidl.g:2458:1: ( 'interface' )
            // InternalLidl.g:2459:2: 'interface'
            {
             before(grammarAccess.getLidlInterfaceAccess().getInterfaceKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLidlInterfaceAccess().getInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__0__Impl"


    // $ANTLR start "rule__LidlInterface__Group__1"
    // InternalLidl.g:2468:1: rule__LidlInterface__Group__1 : rule__LidlInterface__Group__1__Impl rule__LidlInterface__Group__2 ;
    public final void rule__LidlInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2472:1: ( rule__LidlInterface__Group__1__Impl rule__LidlInterface__Group__2 )
            // InternalLidl.g:2473:2: rule__LidlInterface__Group__1__Impl rule__LidlInterface__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__LidlInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__1"


    // $ANTLR start "rule__LidlInterface__Group__1__Impl"
    // InternalLidl.g:2480:1: rule__LidlInterface__Group__1__Impl : ( ( rule__LidlInterface__NameAssignment_1 ) ) ;
    public final void rule__LidlInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2484:1: ( ( ( rule__LidlInterface__NameAssignment_1 ) ) )
            // InternalLidl.g:2485:1: ( ( rule__LidlInterface__NameAssignment_1 ) )
            {
            // InternalLidl.g:2485:1: ( ( rule__LidlInterface__NameAssignment_1 ) )
            // InternalLidl.g:2486:2: ( rule__LidlInterface__NameAssignment_1 )
            {
             before(grammarAccess.getLidlInterfaceAccess().getNameAssignment_1()); 
            // InternalLidl.g:2487:2: ( rule__LidlInterface__NameAssignment_1 )
            // InternalLidl.g:2487:3: rule__LidlInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__1__Impl"


    // $ANTLR start "rule__LidlInterface__Group__2"
    // InternalLidl.g:2495:1: rule__LidlInterface__Group__2 : rule__LidlInterface__Group__2__Impl rule__LidlInterface__Group__3 ;
    public final void rule__LidlInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2499:1: ( rule__LidlInterface__Group__2__Impl rule__LidlInterface__Group__3 )
            // InternalLidl.g:2500:2: rule__LidlInterface__Group__2__Impl rule__LidlInterface__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__LidlInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__2"


    // $ANTLR start "rule__LidlInterface__Group__2__Impl"
    // InternalLidl.g:2507:1: rule__LidlInterface__Group__2__Impl : ( ( rule__LidlInterface__Group_2__0 )? ) ;
    public final void rule__LidlInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2511:1: ( ( ( rule__LidlInterface__Group_2__0 )? ) )
            // InternalLidl.g:2512:1: ( ( rule__LidlInterface__Group_2__0 )? )
            {
            // InternalLidl.g:2512:1: ( ( rule__LidlInterface__Group_2__0 )? )
            // InternalLidl.g:2513:2: ( rule__LidlInterface__Group_2__0 )?
            {
             before(grammarAccess.getLidlInterfaceAccess().getGroup_2()); 
            // InternalLidl.g:2514:2: ( rule__LidlInterface__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==36) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLidl.g:2514:3: rule__LidlInterface__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlInterface__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLidlInterfaceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__2__Impl"


    // $ANTLR start "rule__LidlInterface__Group__3"
    // InternalLidl.g:2522:1: rule__LidlInterface__Group__3 : rule__LidlInterface__Group__3__Impl rule__LidlInterface__Group__4 ;
    public final void rule__LidlInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2526:1: ( rule__LidlInterface__Group__3__Impl rule__LidlInterface__Group__4 )
            // InternalLidl.g:2527:2: rule__LidlInterface__Group__3__Impl rule__LidlInterface__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__LidlInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__3"


    // $ANTLR start "rule__LidlInterface__Group__3__Impl"
    // InternalLidl.g:2534:1: rule__LidlInterface__Group__3__Impl : ( 'is' ) ;
    public final void rule__LidlInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2538:1: ( ( 'is' ) )
            // InternalLidl.g:2539:1: ( 'is' )
            {
            // InternalLidl.g:2539:1: ( 'is' )
            // InternalLidl.g:2540:2: 'is'
            {
             before(grammarAccess.getLidlInterfaceAccess().getIsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLidlInterfaceAccess().getIsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__3__Impl"


    // $ANTLR start "rule__LidlInterface__Group__4"
    // InternalLidl.g:2549:1: rule__LidlInterface__Group__4 : rule__LidlInterface__Group__4__Impl ;
    public final void rule__LidlInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2553:1: ( rule__LidlInterface__Group__4__Impl )
            // InternalLidl.g:2554:2: rule__LidlInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlInterface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__4"


    // $ANTLR start "rule__LidlInterface__Group__4__Impl"
    // InternalLidl.g:2560:1: rule__LidlInterface__Group__4__Impl : ( ( rule__LidlInterface__Alternatives_4 ) ) ;
    public final void rule__LidlInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2564:1: ( ( ( rule__LidlInterface__Alternatives_4 ) ) )
            // InternalLidl.g:2565:1: ( ( rule__LidlInterface__Alternatives_4 ) )
            {
            // InternalLidl.g:2565:1: ( ( rule__LidlInterface__Alternatives_4 ) )
            // InternalLidl.g:2566:2: ( rule__LidlInterface__Alternatives_4 )
            {
             before(grammarAccess.getLidlInterfaceAccess().getAlternatives_4()); 
            // InternalLidl.g:2567:2: ( rule__LidlInterface__Alternatives_4 )
            // InternalLidl.g:2567:3: rule__LidlInterface__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__LidlInterface__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getLidlInterfaceAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group__4__Impl"


    // $ANTLR start "rule__LidlInterface__Group_2__0"
    // InternalLidl.g:2576:1: rule__LidlInterface__Group_2__0 : rule__LidlInterface__Group_2__0__Impl rule__LidlInterface__Group_2__1 ;
    public final void rule__LidlInterface__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2580:1: ( rule__LidlInterface__Group_2__0__Impl rule__LidlInterface__Group_2__1 )
            // InternalLidl.g:2581:2: rule__LidlInterface__Group_2__0__Impl rule__LidlInterface__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__LidlInterface__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInterface__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group_2__0"


    // $ANTLR start "rule__LidlInterface__Group_2__0__Impl"
    // InternalLidl.g:2588:1: rule__LidlInterface__Group_2__0__Impl : ( ( rule__LidlInterface__NestedAssignment_2_0 ) ) ;
    public final void rule__LidlInterface__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2592:1: ( ( ( rule__LidlInterface__NestedAssignment_2_0 ) ) )
            // InternalLidl.g:2593:1: ( ( rule__LidlInterface__NestedAssignment_2_0 ) )
            {
            // InternalLidl.g:2593:1: ( ( rule__LidlInterface__NestedAssignment_2_0 ) )
            // InternalLidl.g:2594:2: ( rule__LidlInterface__NestedAssignment_2_0 )
            {
             before(grammarAccess.getLidlInterfaceAccess().getNestedAssignment_2_0()); 
            // InternalLidl.g:2595:2: ( rule__LidlInterface__NestedAssignment_2_0 )
            // InternalLidl.g:2595:3: rule__LidlInterface__NestedAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlInterface__NestedAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlInterfaceAccess().getNestedAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group_2__0__Impl"


    // $ANTLR start "rule__LidlInterface__Group_2__1"
    // InternalLidl.g:2603:1: rule__LidlInterface__Group_2__1 : rule__LidlInterface__Group_2__1__Impl ;
    public final void rule__LidlInterface__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2607:1: ( rule__LidlInterface__Group_2__1__Impl )
            // InternalLidl.g:2608:2: rule__LidlInterface__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlInterface__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group_2__1"


    // $ANTLR start "rule__LidlInterface__Group_2__1__Impl"
    // InternalLidl.g:2614:1: rule__LidlInterface__Group_2__1__Impl : ( ( ( rule__LidlInterface__NestedDefAssignment_2_1 ) ) ( ( rule__LidlInterface__NestedDefAssignment_2_1 )* ) ) ;
    public final void rule__LidlInterface__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2618:1: ( ( ( ( rule__LidlInterface__NestedDefAssignment_2_1 ) ) ( ( rule__LidlInterface__NestedDefAssignment_2_1 )* ) ) )
            // InternalLidl.g:2619:1: ( ( ( rule__LidlInterface__NestedDefAssignment_2_1 ) ) ( ( rule__LidlInterface__NestedDefAssignment_2_1 )* ) )
            {
            // InternalLidl.g:2619:1: ( ( ( rule__LidlInterface__NestedDefAssignment_2_1 ) ) ( ( rule__LidlInterface__NestedDefAssignment_2_1 )* ) )
            // InternalLidl.g:2620:2: ( ( rule__LidlInterface__NestedDefAssignment_2_1 ) ) ( ( rule__LidlInterface__NestedDefAssignment_2_1 )* )
            {
            // InternalLidl.g:2620:2: ( ( rule__LidlInterface__NestedDefAssignment_2_1 ) )
            // InternalLidl.g:2621:3: ( rule__LidlInterface__NestedDefAssignment_2_1 )
            {
             before(grammarAccess.getLidlInterfaceAccess().getNestedDefAssignment_2_1()); 
            // InternalLidl.g:2622:3: ( rule__LidlInterface__NestedDefAssignment_2_1 )
            // InternalLidl.g:2622:4: rule__LidlInterface__NestedDefAssignment_2_1
            {
            pushFollow(FOLLOW_24);
            rule__LidlInterface__NestedDefAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlInterfaceAccess().getNestedDefAssignment_2_1()); 

            }

            // InternalLidl.g:2625:2: ( ( rule__LidlInterface__NestedDefAssignment_2_1 )* )
            // InternalLidl.g:2626:3: ( rule__LidlInterface__NestedDefAssignment_2_1 )*
            {
             before(grammarAccess.getLidlInterfaceAccess().getNestedDefAssignment_2_1()); 
            // InternalLidl.g:2627:3: ( rule__LidlInterface__NestedDefAssignment_2_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLidl.g:2627:4: rule__LidlInterface__NestedDefAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__LidlInterface__NestedDefAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getLidlInterfaceAccess().getNestedDefAssignment_2_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__Group_2__1__Impl"


    // $ANTLR start "rule__LidlInterfaceType__Group_2__0"
    // InternalLidl.g:2637:1: rule__LidlInterfaceType__Group_2__0 : rule__LidlInterfaceType__Group_2__0__Impl rule__LidlInterfaceType__Group_2__1 ;
    public final void rule__LidlInterfaceType__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2641:1: ( rule__LidlInterfaceType__Group_2__0__Impl rule__LidlInterfaceType__Group_2__1 )
            // InternalLidl.g:2642:2: rule__LidlInterfaceType__Group_2__0__Impl rule__LidlInterfaceType__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__LidlInterfaceType__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInterfaceType__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterfaceType__Group_2__0"


    // $ANTLR start "rule__LidlInterfaceType__Group_2__0__Impl"
    // InternalLidl.g:2649:1: rule__LidlInterfaceType__Group_2__0__Impl : ( ruleRefInterfaceType ) ;
    public final void rule__LidlInterfaceType__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2653:1: ( ( ruleRefInterfaceType ) )
            // InternalLidl.g:2654:1: ( ruleRefInterfaceType )
            {
            // InternalLidl.g:2654:1: ( ruleRefInterfaceType )
            // InternalLidl.g:2655:2: ruleRefInterfaceType
            {
             before(grammarAccess.getLidlInterfaceTypeAccess().getRefInterfaceTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRefInterfaceType();

            state._fsp--;

             after(grammarAccess.getLidlInterfaceTypeAccess().getRefInterfaceTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterfaceType__Group_2__0__Impl"


    // $ANTLR start "rule__LidlInterfaceType__Group_2__1"
    // InternalLidl.g:2664:1: rule__LidlInterfaceType__Group_2__1 : rule__LidlInterfaceType__Group_2__1__Impl ;
    public final void rule__LidlInterfaceType__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2668:1: ( rule__LidlInterfaceType__Group_2__1__Impl )
            // InternalLidl.g:2669:2: rule__LidlInterfaceType__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlInterfaceType__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterfaceType__Group_2__1"


    // $ANTLR start "rule__LidlInterfaceType__Group_2__1__Impl"
    // InternalLidl.g:2675:1: rule__LidlInterfaceType__Group_2__1__Impl : ( ( rule__LidlInterfaceType__ConjugateAssignment_2_1 )? ) ;
    public final void rule__LidlInterfaceType__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2679:1: ( ( ( rule__LidlInterfaceType__ConjugateAssignment_2_1 )? ) )
            // InternalLidl.g:2680:1: ( ( rule__LidlInterfaceType__ConjugateAssignment_2_1 )? )
            {
            // InternalLidl.g:2680:1: ( ( rule__LidlInterfaceType__ConjugateAssignment_2_1 )? )
            // InternalLidl.g:2681:2: ( rule__LidlInterfaceType__ConjugateAssignment_2_1 )?
            {
             before(grammarAccess.getLidlInterfaceTypeAccess().getConjugateAssignment_2_1()); 
            // InternalLidl.g:2682:2: ( rule__LidlInterfaceType__ConjugateAssignment_2_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLidl.g:2682:3: rule__LidlInterfaceType__ConjugateAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlInterfaceType__ConjugateAssignment_2_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLidlInterfaceTypeAccess().getConjugateAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterfaceType__Group_2__1__Impl"


    // $ANTLR start "rule__AtomInterfaceTypeElement__Group__0"
    // InternalLidl.g:2691:1: rule__AtomInterfaceTypeElement__Group__0 : rule__AtomInterfaceTypeElement__Group__0__Impl rule__AtomInterfaceTypeElement__Group__1 ;
    public final void rule__AtomInterfaceTypeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2695:1: ( rule__AtomInterfaceTypeElement__Group__0__Impl rule__AtomInterfaceTypeElement__Group__1 )
            // InternalLidl.g:2696:2: rule__AtomInterfaceTypeElement__Group__0__Impl rule__AtomInterfaceTypeElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AtomInterfaceTypeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomInterfaceTypeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceTypeElement__Group__0"


    // $ANTLR start "rule__AtomInterfaceTypeElement__Group__0__Impl"
    // InternalLidl.g:2703:1: rule__AtomInterfaceTypeElement__Group__0__Impl : ( () ) ;
    public final void rule__AtomInterfaceTypeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2707:1: ( ( () ) )
            // InternalLidl.g:2708:1: ( () )
            {
            // InternalLidl.g:2708:1: ( () )
            // InternalLidl.g:2709:2: ()
            {
             before(grammarAccess.getAtomInterfaceTypeElementAccess().getAtomInterfaceTypeElementAction_0()); 
            // InternalLidl.g:2710:2: ()
            // InternalLidl.g:2710:3: 
            {
            }

             after(grammarAccess.getAtomInterfaceTypeElementAccess().getAtomInterfaceTypeElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceTypeElement__Group__0__Impl"


    // $ANTLR start "rule__AtomInterfaceTypeElement__Group__1"
    // InternalLidl.g:2718:1: rule__AtomInterfaceTypeElement__Group__1 : rule__AtomInterfaceTypeElement__Group__1__Impl rule__AtomInterfaceTypeElement__Group__2 ;
    public final void rule__AtomInterfaceTypeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2722:1: ( rule__AtomInterfaceTypeElement__Group__1__Impl rule__AtomInterfaceTypeElement__Group__2 )
            // InternalLidl.g:2723:2: rule__AtomInterfaceTypeElement__Group__1__Impl rule__AtomInterfaceTypeElement__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__AtomInterfaceTypeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomInterfaceTypeElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceTypeElement__Group__1"


    // $ANTLR start "rule__AtomInterfaceTypeElement__Group__1__Impl"
    // InternalLidl.g:2730:1: rule__AtomInterfaceTypeElement__Group__1__Impl : ( ( rule__AtomInterfaceTypeElement__TypeAssignment_1 ) ) ;
    public final void rule__AtomInterfaceTypeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2734:1: ( ( ( rule__AtomInterfaceTypeElement__TypeAssignment_1 ) ) )
            // InternalLidl.g:2735:1: ( ( rule__AtomInterfaceTypeElement__TypeAssignment_1 ) )
            {
            // InternalLidl.g:2735:1: ( ( rule__AtomInterfaceTypeElement__TypeAssignment_1 ) )
            // InternalLidl.g:2736:2: ( rule__AtomInterfaceTypeElement__TypeAssignment_1 )
            {
             before(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeAssignment_1()); 
            // InternalLidl.g:2737:2: ( rule__AtomInterfaceTypeElement__TypeAssignment_1 )
            // InternalLidl.g:2737:3: rule__AtomInterfaceTypeElement__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomInterfaceTypeElement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceTypeElement__Group__1__Impl"


    // $ANTLR start "rule__AtomInterfaceTypeElement__Group__2"
    // InternalLidl.g:2745:1: rule__AtomInterfaceTypeElement__Group__2 : rule__AtomInterfaceTypeElement__Group__2__Impl ;
    public final void rule__AtomInterfaceTypeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2749:1: ( rule__AtomInterfaceTypeElement__Group__2__Impl )
            // InternalLidl.g:2750:2: rule__AtomInterfaceTypeElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomInterfaceTypeElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceTypeElement__Group__2"


    // $ANTLR start "rule__AtomInterfaceTypeElement__Group__2__Impl"
    // InternalLidl.g:2756:1: rule__AtomInterfaceTypeElement__Group__2__Impl : ( ( rule__AtomInterfaceTypeElement__DirectionAssignment_2 ) ) ;
    public final void rule__AtomInterfaceTypeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2760:1: ( ( ( rule__AtomInterfaceTypeElement__DirectionAssignment_2 ) ) )
            // InternalLidl.g:2761:1: ( ( rule__AtomInterfaceTypeElement__DirectionAssignment_2 ) )
            {
            // InternalLidl.g:2761:1: ( ( rule__AtomInterfaceTypeElement__DirectionAssignment_2 ) )
            // InternalLidl.g:2762:2: ( rule__AtomInterfaceTypeElement__DirectionAssignment_2 )
            {
             before(grammarAccess.getAtomInterfaceTypeElementAccess().getDirectionAssignment_2()); 
            // InternalLidl.g:2763:2: ( rule__AtomInterfaceTypeElement__DirectionAssignment_2 )
            // InternalLidl.g:2763:3: rule__AtomInterfaceTypeElement__DirectionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AtomInterfaceTypeElement__DirectionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAtomInterfaceTypeElementAccess().getDirectionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceTypeElement__Group__2__Impl"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group__0"
    // InternalLidl.g:2772:1: rule__CompositeInterfaceTypeElement__Group__0 : rule__CompositeInterfaceTypeElement__Group__0__Impl rule__CompositeInterfaceTypeElement__Group__1 ;
    public final void rule__CompositeInterfaceTypeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2776:1: ( rule__CompositeInterfaceTypeElement__Group__0__Impl rule__CompositeInterfaceTypeElement__Group__1 )
            // InternalLidl.g:2777:2: rule__CompositeInterfaceTypeElement__Group__0__Impl rule__CompositeInterfaceTypeElement__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeInterfaceTypeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group__0"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group__0__Impl"
    // InternalLidl.g:2784:1: rule__CompositeInterfaceTypeElement__Group__0__Impl : ( () ) ;
    public final void rule__CompositeInterfaceTypeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2788:1: ( ( () ) )
            // InternalLidl.g:2789:1: ( () )
            {
            // InternalLidl.g:2789:1: ( () )
            // InternalLidl.g:2790:2: ()
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getCompositeInterfaceTypeElementAction_0()); 
            // InternalLidl.g:2791:2: ()
            // InternalLidl.g:2791:3: 
            {
            }

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getCompositeInterfaceTypeElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group__0__Impl"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group__1"
    // InternalLidl.g:2799:1: rule__CompositeInterfaceTypeElement__Group__1 : rule__CompositeInterfaceTypeElement__Group__1__Impl rule__CompositeInterfaceTypeElement__Group__2 ;
    public final void rule__CompositeInterfaceTypeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2803:1: ( rule__CompositeInterfaceTypeElement__Group__1__Impl rule__CompositeInterfaceTypeElement__Group__2 )
            // InternalLidl.g:2804:2: rule__CompositeInterfaceTypeElement__Group__1__Impl rule__CompositeInterfaceTypeElement__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__CompositeInterfaceTypeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group__1"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group__1__Impl"
    // InternalLidl.g:2811:1: rule__CompositeInterfaceTypeElement__Group__1__Impl : ( ( rule__CompositeInterfaceTypeElement__NameAssignment_1 ) ) ;
    public final void rule__CompositeInterfaceTypeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2815:1: ( ( ( rule__CompositeInterfaceTypeElement__NameAssignment_1 ) ) )
            // InternalLidl.g:2816:1: ( ( rule__CompositeInterfaceTypeElement__NameAssignment_1 ) )
            {
            // InternalLidl.g:2816:1: ( ( rule__CompositeInterfaceTypeElement__NameAssignment_1 ) )
            // InternalLidl.g:2817:2: ( rule__CompositeInterfaceTypeElement__NameAssignment_1 )
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getNameAssignment_1()); 
            // InternalLidl.g:2818:2: ( rule__CompositeInterfaceTypeElement__NameAssignment_1 )
            // InternalLidl.g:2818:3: rule__CompositeInterfaceTypeElement__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group__1__Impl"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group__2"
    // InternalLidl.g:2826:1: rule__CompositeInterfaceTypeElement__Group__2 : rule__CompositeInterfaceTypeElement__Group__2__Impl rule__CompositeInterfaceTypeElement__Group__3 ;
    public final void rule__CompositeInterfaceTypeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2830:1: ( rule__CompositeInterfaceTypeElement__Group__2__Impl rule__CompositeInterfaceTypeElement__Group__3 )
            // InternalLidl.g:2831:2: rule__CompositeInterfaceTypeElement__Group__2__Impl rule__CompositeInterfaceTypeElement__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__CompositeInterfaceTypeElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group__2"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group__2__Impl"
    // InternalLidl.g:2838:1: rule__CompositeInterfaceTypeElement__Group__2__Impl : ( ':' ) ;
    public final void rule__CompositeInterfaceTypeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2842:1: ( ( ':' ) )
            // InternalLidl.g:2843:1: ( ':' )
            {
            // InternalLidl.g:2843:1: ( ':' )
            // InternalLidl.g:2844:2: ':'
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group__2__Impl"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group__3"
    // InternalLidl.g:2853:1: rule__CompositeInterfaceTypeElement__Group__3 : rule__CompositeInterfaceTypeElement__Group__3__Impl ;
    public final void rule__CompositeInterfaceTypeElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2857:1: ( rule__CompositeInterfaceTypeElement__Group__3__Impl )
            // InternalLidl.g:2858:2: rule__CompositeInterfaceTypeElement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group__3"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group__3__Impl"
    // InternalLidl.g:2864:1: rule__CompositeInterfaceTypeElement__Group__3__Impl : ( ( rule__CompositeInterfaceTypeElement__Alternatives_3 ) ) ;
    public final void rule__CompositeInterfaceTypeElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2868:1: ( ( ( rule__CompositeInterfaceTypeElement__Alternatives_3 ) ) )
            // InternalLidl.g:2869:1: ( ( rule__CompositeInterfaceTypeElement__Alternatives_3 ) )
            {
            // InternalLidl.g:2869:1: ( ( rule__CompositeInterfaceTypeElement__Alternatives_3 ) )
            // InternalLidl.g:2870:2: ( rule__CompositeInterfaceTypeElement__Alternatives_3 )
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getAlternatives_3()); 
            // InternalLidl.g:2871:2: ( rule__CompositeInterfaceTypeElement__Alternatives_3 )
            // InternalLidl.g:2871:3: rule__CompositeInterfaceTypeElement__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__Alternatives_3();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group__3__Impl"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group_3_0__0"
    // InternalLidl.g:2880:1: rule__CompositeInterfaceTypeElement__Group_3_0__0 : rule__CompositeInterfaceTypeElement__Group_3_0__0__Impl rule__CompositeInterfaceTypeElement__Group_3_0__1 ;
    public final void rule__CompositeInterfaceTypeElement__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2884:1: ( rule__CompositeInterfaceTypeElement__Group_3_0__0__Impl rule__CompositeInterfaceTypeElement__Group_3_0__1 )
            // InternalLidl.g:2885:2: rule__CompositeInterfaceTypeElement__Group_3_0__0__Impl rule__CompositeInterfaceTypeElement__Group_3_0__1
            {
            pushFollow(FOLLOW_26);
            rule__CompositeInterfaceTypeElement__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group_3_0__0"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group_3_0__0__Impl"
    // InternalLidl.g:2892:1: rule__CompositeInterfaceTypeElement__Group_3_0__0__Impl : ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0 ) ) ;
    public final void rule__CompositeInterfaceTypeElement__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2896:1: ( ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0 ) ) )
            // InternalLidl.g:2897:1: ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0 ) )
            {
            // InternalLidl.g:2897:1: ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0 ) )
            // InternalLidl.g:2898:2: ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0 )
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeAssignment_3_0_0()); 
            // InternalLidl.g:2899:2: ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0 )
            // InternalLidl.g:2899:3: rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeAssignment_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group_3_0__0__Impl"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group_3_0__1"
    // InternalLidl.g:2907:1: rule__CompositeInterfaceTypeElement__Group_3_0__1 : rule__CompositeInterfaceTypeElement__Group_3_0__1__Impl ;
    public final void rule__CompositeInterfaceTypeElement__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2911:1: ( rule__CompositeInterfaceTypeElement__Group_3_0__1__Impl )
            // InternalLidl.g:2912:2: rule__CompositeInterfaceTypeElement__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group_3_0__1"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__Group_3_0__1__Impl"
    // InternalLidl.g:2918:1: rule__CompositeInterfaceTypeElement__Group_3_0__1__Impl : ( ( rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1 ) ) ;
    public final void rule__CompositeInterfaceTypeElement__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2922:1: ( ( ( rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1 ) ) )
            // InternalLidl.g:2923:1: ( ( rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1 ) )
            {
            // InternalLidl.g:2923:1: ( ( rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1 ) )
            // InternalLidl.g:2924:2: ( rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1 )
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getDirectionAssignment_3_0_1()); 
            // InternalLidl.g:2925:2: ( rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1 )
            // InternalLidl.g:2925:3: rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getDirectionAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__Group_3_0__1__Impl"


    // $ANTLR start "rule__RefInterfaceTypeElement__Group__0"
    // InternalLidl.g:2934:1: rule__RefInterfaceTypeElement__Group__0 : rule__RefInterfaceTypeElement__Group__0__Impl rule__RefInterfaceTypeElement__Group__1 ;
    public final void rule__RefInterfaceTypeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2938:1: ( rule__RefInterfaceTypeElement__Group__0__Impl rule__RefInterfaceTypeElement__Group__1 )
            // InternalLidl.g:2939:2: rule__RefInterfaceTypeElement__Group__0__Impl rule__RefInterfaceTypeElement__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__RefInterfaceTypeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefInterfaceTypeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceTypeElement__Group__0"


    // $ANTLR start "rule__RefInterfaceTypeElement__Group__0__Impl"
    // InternalLidl.g:2946:1: rule__RefInterfaceTypeElement__Group__0__Impl : ( () ) ;
    public final void rule__RefInterfaceTypeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2950:1: ( ( () ) )
            // InternalLidl.g:2951:1: ( () )
            {
            // InternalLidl.g:2951:1: ( () )
            // InternalLidl.g:2952:2: ()
            {
             before(grammarAccess.getRefInterfaceTypeElementAccess().getRefInterfaceTypeElementAction_0()); 
            // InternalLidl.g:2953:2: ()
            // InternalLidl.g:2953:3: 
            {
            }

             after(grammarAccess.getRefInterfaceTypeElementAccess().getRefInterfaceTypeElementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceTypeElement__Group__0__Impl"


    // $ANTLR start "rule__RefInterfaceTypeElement__Group__1"
    // InternalLidl.g:2961:1: rule__RefInterfaceTypeElement__Group__1 : rule__RefInterfaceTypeElement__Group__1__Impl ;
    public final void rule__RefInterfaceTypeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2965:1: ( rule__RefInterfaceTypeElement__Group__1__Impl )
            // InternalLidl.g:2966:2: rule__RefInterfaceTypeElement__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefInterfaceTypeElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceTypeElement__Group__1"


    // $ANTLR start "rule__RefInterfaceTypeElement__Group__1__Impl"
    // InternalLidl.g:2972:1: rule__RefInterfaceTypeElement__Group__1__Impl : ( ( rule__RefInterfaceTypeElement__TypeAssignment_1 ) ) ;
    public final void rule__RefInterfaceTypeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2976:1: ( ( ( rule__RefInterfaceTypeElement__TypeAssignment_1 ) ) )
            // InternalLidl.g:2977:1: ( ( rule__RefInterfaceTypeElement__TypeAssignment_1 ) )
            {
            // InternalLidl.g:2977:1: ( ( rule__RefInterfaceTypeElement__TypeAssignment_1 ) )
            // InternalLidl.g:2978:2: ( rule__RefInterfaceTypeElement__TypeAssignment_1 )
            {
             before(grammarAccess.getRefInterfaceTypeElementAccess().getTypeAssignment_1()); 
            // InternalLidl.g:2979:2: ( rule__RefInterfaceTypeElement__TypeAssignment_1 )
            // InternalLidl.g:2979:3: rule__RefInterfaceTypeElement__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RefInterfaceTypeElement__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefInterfaceTypeElementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceTypeElement__Group__1__Impl"


    // $ANTLR start "rule__AtomInterfaceType__Group__0"
    // InternalLidl.g:2988:1: rule__AtomInterfaceType__Group__0 : rule__AtomInterfaceType__Group__0__Impl rule__AtomInterfaceType__Group__1 ;
    public final void rule__AtomInterfaceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:2992:1: ( rule__AtomInterfaceType__Group__0__Impl rule__AtomInterfaceType__Group__1 )
            // InternalLidl.g:2993:2: rule__AtomInterfaceType__Group__0__Impl rule__AtomInterfaceType__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__AtomInterfaceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtomInterfaceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceType__Group__0"


    // $ANTLR start "rule__AtomInterfaceType__Group__0__Impl"
    // InternalLidl.g:3000:1: rule__AtomInterfaceType__Group__0__Impl : ( () ) ;
    public final void rule__AtomInterfaceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3004:1: ( ( () ) )
            // InternalLidl.g:3005:1: ( () )
            {
            // InternalLidl.g:3005:1: ( () )
            // InternalLidl.g:3006:2: ()
            {
             before(grammarAccess.getAtomInterfaceTypeAccess().getAtomInterfaceTypeAction_0()); 
            // InternalLidl.g:3007:2: ()
            // InternalLidl.g:3007:3: 
            {
            }

             after(grammarAccess.getAtomInterfaceTypeAccess().getAtomInterfaceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceType__Group__0__Impl"


    // $ANTLR start "rule__AtomInterfaceType__Group__1"
    // InternalLidl.g:3015:1: rule__AtomInterfaceType__Group__1 : rule__AtomInterfaceType__Group__1__Impl ;
    public final void rule__AtomInterfaceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3019:1: ( rule__AtomInterfaceType__Group__1__Impl )
            // InternalLidl.g:3020:2: rule__AtomInterfaceType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtomInterfaceType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceType__Group__1"


    // $ANTLR start "rule__AtomInterfaceType__Group__1__Impl"
    // InternalLidl.g:3026:1: rule__AtomInterfaceType__Group__1__Impl : ( ( rule__AtomInterfaceType__ItemsAssignment_1 ) ) ;
    public final void rule__AtomInterfaceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3030:1: ( ( ( rule__AtomInterfaceType__ItemsAssignment_1 ) ) )
            // InternalLidl.g:3031:1: ( ( rule__AtomInterfaceType__ItemsAssignment_1 ) )
            {
            // InternalLidl.g:3031:1: ( ( rule__AtomInterfaceType__ItemsAssignment_1 ) )
            // InternalLidl.g:3032:2: ( rule__AtomInterfaceType__ItemsAssignment_1 )
            {
             before(grammarAccess.getAtomInterfaceTypeAccess().getItemsAssignment_1()); 
            // InternalLidl.g:3033:2: ( rule__AtomInterfaceType__ItemsAssignment_1 )
            // InternalLidl.g:3033:3: rule__AtomInterfaceType__ItemsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtomInterfaceType__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomInterfaceTypeAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceType__Group__1__Impl"


    // $ANTLR start "rule__CompositeInterfaceType__Group__0"
    // InternalLidl.g:3042:1: rule__CompositeInterfaceType__Group__0 : rule__CompositeInterfaceType__Group__0__Impl rule__CompositeInterfaceType__Group__1 ;
    public final void rule__CompositeInterfaceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3046:1: ( rule__CompositeInterfaceType__Group__0__Impl rule__CompositeInterfaceType__Group__1 )
            // InternalLidl.g:3047:2: rule__CompositeInterfaceType__Group__0__Impl rule__CompositeInterfaceType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__CompositeInterfaceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__0"


    // $ANTLR start "rule__CompositeInterfaceType__Group__0__Impl"
    // InternalLidl.g:3054:1: rule__CompositeInterfaceType__Group__0__Impl : ( () ) ;
    public final void rule__CompositeInterfaceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3058:1: ( ( () ) )
            // InternalLidl.g:3059:1: ( () )
            {
            // InternalLidl.g:3059:1: ( () )
            // InternalLidl.g:3060:2: ()
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getCompositeInterfaceTypeAction_0()); 
            // InternalLidl.g:3061:2: ()
            // InternalLidl.g:3061:3: 
            {
            }

             after(grammarAccess.getCompositeInterfaceTypeAccess().getCompositeInterfaceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__0__Impl"


    // $ANTLR start "rule__CompositeInterfaceType__Group__1"
    // InternalLidl.g:3069:1: rule__CompositeInterfaceType__Group__1 : rule__CompositeInterfaceType__Group__1__Impl rule__CompositeInterfaceType__Group__2 ;
    public final void rule__CompositeInterfaceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3073:1: ( rule__CompositeInterfaceType__Group__1__Impl rule__CompositeInterfaceType__Group__2 )
            // InternalLidl.g:3074:2: rule__CompositeInterfaceType__Group__1__Impl rule__CompositeInterfaceType__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__CompositeInterfaceType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__1"


    // $ANTLR start "rule__CompositeInterfaceType__Group__1__Impl"
    // InternalLidl.g:3081:1: rule__CompositeInterfaceType__Group__1__Impl : ( '{' ) ;
    public final void rule__CompositeInterfaceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3085:1: ( ( '{' ) )
            // InternalLidl.g:3086:1: ( '{' )
            {
            // InternalLidl.g:3086:1: ( '{' )
            // InternalLidl.g:3087:2: '{'
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCompositeInterfaceTypeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__1__Impl"


    // $ANTLR start "rule__CompositeInterfaceType__Group__2"
    // InternalLidl.g:3096:1: rule__CompositeInterfaceType__Group__2 : rule__CompositeInterfaceType__Group__2__Impl rule__CompositeInterfaceType__Group__3 ;
    public final void rule__CompositeInterfaceType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3100:1: ( rule__CompositeInterfaceType__Group__2__Impl rule__CompositeInterfaceType__Group__3 )
            // InternalLidl.g:3101:2: rule__CompositeInterfaceType__Group__2__Impl rule__CompositeInterfaceType__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__CompositeInterfaceType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__2"


    // $ANTLR start "rule__CompositeInterfaceType__Group__2__Impl"
    // InternalLidl.g:3108:1: rule__CompositeInterfaceType__Group__2__Impl : ( ( rule__CompositeInterfaceType__ItemsAssignment_2 ) ) ;
    public final void rule__CompositeInterfaceType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3112:1: ( ( ( rule__CompositeInterfaceType__ItemsAssignment_2 ) ) )
            // InternalLidl.g:3113:1: ( ( rule__CompositeInterfaceType__ItemsAssignment_2 ) )
            {
            // InternalLidl.g:3113:1: ( ( rule__CompositeInterfaceType__ItemsAssignment_2 ) )
            // InternalLidl.g:3114:2: ( rule__CompositeInterfaceType__ItemsAssignment_2 )
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getItemsAssignment_2()); 
            // InternalLidl.g:3115:2: ( rule__CompositeInterfaceType__ItemsAssignment_2 )
            // InternalLidl.g:3115:3: rule__CompositeInterfaceType__ItemsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInterfaceTypeAccess().getItemsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__2__Impl"


    // $ANTLR start "rule__CompositeInterfaceType__Group__3"
    // InternalLidl.g:3123:1: rule__CompositeInterfaceType__Group__3 : rule__CompositeInterfaceType__Group__3__Impl rule__CompositeInterfaceType__Group__4 ;
    public final void rule__CompositeInterfaceType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3127:1: ( rule__CompositeInterfaceType__Group__3__Impl rule__CompositeInterfaceType__Group__4 )
            // InternalLidl.g:3128:2: rule__CompositeInterfaceType__Group__3__Impl rule__CompositeInterfaceType__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__CompositeInterfaceType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__3"


    // $ANTLR start "rule__CompositeInterfaceType__Group__3__Impl"
    // InternalLidl.g:3135:1: rule__CompositeInterfaceType__Group__3__Impl : ( ( rule__CompositeInterfaceType__Group_3__0 )* ) ;
    public final void rule__CompositeInterfaceType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3139:1: ( ( ( rule__CompositeInterfaceType__Group_3__0 )* ) )
            // InternalLidl.g:3140:1: ( ( rule__CompositeInterfaceType__Group_3__0 )* )
            {
            // InternalLidl.g:3140:1: ( ( rule__CompositeInterfaceType__Group_3__0 )* )
            // InternalLidl.g:3141:2: ( rule__CompositeInterfaceType__Group_3__0 )*
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getGroup_3()); 
            // InternalLidl.g:3142:2: ( rule__CompositeInterfaceType__Group_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==13) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalLidl.g:3142:3: rule__CompositeInterfaceType__Group_3__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__CompositeInterfaceType__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getCompositeInterfaceTypeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__3__Impl"


    // $ANTLR start "rule__CompositeInterfaceType__Group__4"
    // InternalLidl.g:3150:1: rule__CompositeInterfaceType__Group__4 : rule__CompositeInterfaceType__Group__4__Impl ;
    public final void rule__CompositeInterfaceType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3154:1: ( rule__CompositeInterfaceType__Group__4__Impl )
            // InternalLidl.g:3155:2: rule__CompositeInterfaceType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__4"


    // $ANTLR start "rule__CompositeInterfaceType__Group__4__Impl"
    // InternalLidl.g:3161:1: rule__CompositeInterfaceType__Group__4__Impl : ( '}' ) ;
    public final void rule__CompositeInterfaceType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3165:1: ( ( '}' ) )
            // InternalLidl.g:3166:1: ( '}' )
            {
            // InternalLidl.g:3166:1: ( '}' )
            // InternalLidl.g:3167:2: '}'
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompositeInterfaceTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group__4__Impl"


    // $ANTLR start "rule__CompositeInterfaceType__Group_3__0"
    // InternalLidl.g:3177:1: rule__CompositeInterfaceType__Group_3__0 : rule__CompositeInterfaceType__Group_3__0__Impl rule__CompositeInterfaceType__Group_3__1 ;
    public final void rule__CompositeInterfaceType__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3181:1: ( rule__CompositeInterfaceType__Group_3__0__Impl rule__CompositeInterfaceType__Group_3__1 )
            // InternalLidl.g:3182:2: rule__CompositeInterfaceType__Group_3__0__Impl rule__CompositeInterfaceType__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__CompositeInterfaceType__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group_3__0"


    // $ANTLR start "rule__CompositeInterfaceType__Group_3__0__Impl"
    // InternalLidl.g:3189:1: rule__CompositeInterfaceType__Group_3__0__Impl : ( ',' ) ;
    public final void rule__CompositeInterfaceType__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3193:1: ( ( ',' ) )
            // InternalLidl.g:3194:1: ( ',' )
            {
            // InternalLidl.g:3194:1: ( ',' )
            // InternalLidl.g:3195:2: ','
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getCommaKeyword_3_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompositeInterfaceTypeAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group_3__0__Impl"


    // $ANTLR start "rule__CompositeInterfaceType__Group_3__1"
    // InternalLidl.g:3204:1: rule__CompositeInterfaceType__Group_3__1 : rule__CompositeInterfaceType__Group_3__1__Impl ;
    public final void rule__CompositeInterfaceType__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3208:1: ( rule__CompositeInterfaceType__Group_3__1__Impl )
            // InternalLidl.g:3209:2: rule__CompositeInterfaceType__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group_3__1"


    // $ANTLR start "rule__CompositeInterfaceType__Group_3__1__Impl"
    // InternalLidl.g:3215:1: rule__CompositeInterfaceType__Group_3__1__Impl : ( ( rule__CompositeInterfaceType__ItemsAssignment_3_1 ) ) ;
    public final void rule__CompositeInterfaceType__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3219:1: ( ( ( rule__CompositeInterfaceType__ItemsAssignment_3_1 ) ) )
            // InternalLidl.g:3220:1: ( ( rule__CompositeInterfaceType__ItemsAssignment_3_1 ) )
            {
            // InternalLidl.g:3220:1: ( ( rule__CompositeInterfaceType__ItemsAssignment_3_1 ) )
            // InternalLidl.g:3221:2: ( rule__CompositeInterfaceType__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getItemsAssignment_3_1()); 
            // InternalLidl.g:3222:2: ( rule__CompositeInterfaceType__ItemsAssignment_3_1 )
            // InternalLidl.g:3222:3: rule__CompositeInterfaceType__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CompositeInterfaceType__ItemsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCompositeInterfaceTypeAccess().getItemsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__Group_3__1__Impl"


    // $ANTLR start "rule__RefInterfaceType__Group__0"
    // InternalLidl.g:3231:1: rule__RefInterfaceType__Group__0 : rule__RefInterfaceType__Group__0__Impl rule__RefInterfaceType__Group__1 ;
    public final void rule__RefInterfaceType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3235:1: ( rule__RefInterfaceType__Group__0__Impl rule__RefInterfaceType__Group__1 )
            // InternalLidl.g:3236:2: rule__RefInterfaceType__Group__0__Impl rule__RefInterfaceType__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__RefInterfaceType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RefInterfaceType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceType__Group__0"


    // $ANTLR start "rule__RefInterfaceType__Group__0__Impl"
    // InternalLidl.g:3243:1: rule__RefInterfaceType__Group__0__Impl : ( () ) ;
    public final void rule__RefInterfaceType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3247:1: ( ( () ) )
            // InternalLidl.g:3248:1: ( () )
            {
            // InternalLidl.g:3248:1: ( () )
            // InternalLidl.g:3249:2: ()
            {
             before(grammarAccess.getRefInterfaceTypeAccess().getRefInterfaceTypeAction_0()); 
            // InternalLidl.g:3250:2: ()
            // InternalLidl.g:3250:3: 
            {
            }

             after(grammarAccess.getRefInterfaceTypeAccess().getRefInterfaceTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceType__Group__0__Impl"


    // $ANTLR start "rule__RefInterfaceType__Group__1"
    // InternalLidl.g:3258:1: rule__RefInterfaceType__Group__1 : rule__RefInterfaceType__Group__1__Impl ;
    public final void rule__RefInterfaceType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3262:1: ( rule__RefInterfaceType__Group__1__Impl )
            // InternalLidl.g:3263:2: rule__RefInterfaceType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RefInterfaceType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceType__Group__1"


    // $ANTLR start "rule__RefInterfaceType__Group__1__Impl"
    // InternalLidl.g:3269:1: rule__RefInterfaceType__Group__1__Impl : ( ( rule__RefInterfaceType__ItemsAssignment_1 ) ) ;
    public final void rule__RefInterfaceType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3273:1: ( ( ( rule__RefInterfaceType__ItemsAssignment_1 ) ) )
            // InternalLidl.g:3274:1: ( ( rule__RefInterfaceType__ItemsAssignment_1 ) )
            {
            // InternalLidl.g:3274:1: ( ( rule__RefInterfaceType__ItemsAssignment_1 ) )
            // InternalLidl.g:3275:2: ( rule__RefInterfaceType__ItemsAssignment_1 )
            {
             before(grammarAccess.getRefInterfaceTypeAccess().getItemsAssignment_1()); 
            // InternalLidl.g:3276:2: ( rule__RefInterfaceType__ItemsAssignment_1 )
            // InternalLidl.g:3276:3: rule__RefInterfaceType__ItemsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RefInterfaceType__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRefInterfaceTypeAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceType__Group__1__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__0"
    // InternalLidl.g:3285:1: rule__LidlInteraction__Group__0 : rule__LidlInteraction__Group__0__Impl rule__LidlInteraction__Group__1 ;
    public final void rule__LidlInteraction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3289:1: ( rule__LidlInteraction__Group__0__Impl rule__LidlInteraction__Group__1 )
            // InternalLidl.g:3290:2: rule__LidlInteraction__Group__0__Impl rule__LidlInteraction__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__LidlInteraction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__0"


    // $ANTLR start "rule__LidlInteraction__Group__0__Impl"
    // InternalLidl.g:3297:1: rule__LidlInteraction__Group__0__Impl : ( 'interaction' ) ;
    public final void rule__LidlInteraction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3301:1: ( ( 'interaction' ) )
            // InternalLidl.g:3302:1: ( 'interaction' )
            {
            // InternalLidl.g:3302:1: ( 'interaction' )
            // InternalLidl.g:3303:2: 'interaction'
            {
             before(grammarAccess.getLidlInteractionAccess().getInteractionKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLidlInteractionAccess().getInteractionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__0__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__1"
    // InternalLidl.g:3312:1: rule__LidlInteraction__Group__1 : rule__LidlInteraction__Group__1__Impl rule__LidlInteraction__Group__2 ;
    public final void rule__LidlInteraction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3316:1: ( rule__LidlInteraction__Group__1__Impl rule__LidlInteraction__Group__2 )
            // InternalLidl.g:3317:2: rule__LidlInteraction__Group__1__Impl rule__LidlInteraction__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__LidlInteraction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__1"


    // $ANTLR start "rule__LidlInteraction__Group__1__Impl"
    // InternalLidl.g:3324:1: rule__LidlInteraction__Group__1__Impl : ( ( rule__LidlInteraction__IdAssignment_1 ) ) ;
    public final void rule__LidlInteraction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3328:1: ( ( ( rule__LidlInteraction__IdAssignment_1 ) ) )
            // InternalLidl.g:3329:1: ( ( rule__LidlInteraction__IdAssignment_1 ) )
            {
            // InternalLidl.g:3329:1: ( ( rule__LidlInteraction__IdAssignment_1 ) )
            // InternalLidl.g:3330:2: ( rule__LidlInteraction__IdAssignment_1 )
            {
             before(grammarAccess.getLidlInteractionAccess().getIdAssignment_1()); 
            // InternalLidl.g:3331:2: ( rule__LidlInteraction__IdAssignment_1 )
            // InternalLidl.g:3331:3: rule__LidlInteraction__IdAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteraction__IdAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlInteractionAccess().getIdAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__1__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__2"
    // InternalLidl.g:3339:1: rule__LidlInteraction__Group__2 : rule__LidlInteraction__Group__2__Impl rule__LidlInteraction__Group__3 ;
    public final void rule__LidlInteraction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3343:1: ( rule__LidlInteraction__Group__2__Impl rule__LidlInteraction__Group__3 )
            // InternalLidl.g:3344:2: rule__LidlInteraction__Group__2__Impl rule__LidlInteraction__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__LidlInteraction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__2"


    // $ANTLR start "rule__LidlInteraction__Group__2__Impl"
    // InternalLidl.g:3351:1: rule__LidlInteraction__Group__2__Impl : ( ':' ) ;
    public final void rule__LidlInteraction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3355:1: ( ( ':' ) )
            // InternalLidl.g:3356:1: ( ':' )
            {
            // InternalLidl.g:3356:1: ( ':' )
            // InternalLidl.g:3357:2: ':'
            {
             before(grammarAccess.getLidlInteractionAccess().getColonKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLidlInteractionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__2__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__3"
    // InternalLidl.g:3366:1: rule__LidlInteraction__Group__3 : rule__LidlInteraction__Group__3__Impl rule__LidlInteraction__Group__4 ;
    public final void rule__LidlInteraction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3370:1: ( rule__LidlInteraction__Group__3__Impl rule__LidlInteraction__Group__4 )
            // InternalLidl.g:3371:2: rule__LidlInteraction__Group__3__Impl rule__LidlInteraction__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__LidlInteraction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__3"


    // $ANTLR start "rule__LidlInteraction__Group__3__Impl"
    // InternalLidl.g:3378:1: rule__LidlInteraction__Group__3__Impl : ( ( rule__LidlInteraction__InterfaceAssignment_3 ) ) ;
    public final void rule__LidlInteraction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3382:1: ( ( ( rule__LidlInteraction__InterfaceAssignment_3 ) ) )
            // InternalLidl.g:3383:1: ( ( rule__LidlInteraction__InterfaceAssignment_3 ) )
            {
            // InternalLidl.g:3383:1: ( ( rule__LidlInteraction__InterfaceAssignment_3 ) )
            // InternalLidl.g:3384:2: ( rule__LidlInteraction__InterfaceAssignment_3 )
            {
             before(grammarAccess.getLidlInteractionAccess().getInterfaceAssignment_3()); 
            // InternalLidl.g:3385:2: ( rule__LidlInteraction__InterfaceAssignment_3 )
            // InternalLidl.g:3385:3: rule__LidlInteraction__InterfaceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteraction__InterfaceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLidlInteractionAccess().getInterfaceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__3__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__4"
    // InternalLidl.g:3393:1: rule__LidlInteraction__Group__4 : rule__LidlInteraction__Group__4__Impl rule__LidlInteraction__Group__5 ;
    public final void rule__LidlInteraction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3397:1: ( rule__LidlInteraction__Group__4__Impl rule__LidlInteraction__Group__5 )
            // InternalLidl.g:3398:2: rule__LidlInteraction__Group__4__Impl rule__LidlInteraction__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__LidlInteraction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__4"


    // $ANTLR start "rule__LidlInteraction__Group__4__Impl"
    // InternalLidl.g:3405:1: rule__LidlInteraction__Group__4__Impl : ( ( rule__LidlInteraction__Group_4__0 )? ) ;
    public final void rule__LidlInteraction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3409:1: ( ( ( rule__LidlInteraction__Group_4__0 )? ) )
            // InternalLidl.g:3410:1: ( ( rule__LidlInteraction__Group_4__0 )? )
            {
            // InternalLidl.g:3410:1: ( ( rule__LidlInteraction__Group_4__0 )? )
            // InternalLidl.g:3411:2: ( rule__LidlInteraction__Group_4__0 )?
            {
             before(grammarAccess.getLidlInteractionAccess().getGroup_4()); 
            // InternalLidl.g:3412:2: ( rule__LidlInteraction__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==36) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalLidl.g:3412:3: rule__LidlInteraction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LidlInteraction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLidlInteractionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__4__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__5"
    // InternalLidl.g:3420:1: rule__LidlInteraction__Group__5 : rule__LidlInteraction__Group__5__Impl rule__LidlInteraction__Group__6 ;
    public final void rule__LidlInteraction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3424:1: ( rule__LidlInteraction__Group__5__Impl rule__LidlInteraction__Group__6 )
            // InternalLidl.g:3425:2: rule__LidlInteraction__Group__5__Impl rule__LidlInteraction__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__LidlInteraction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__5"


    // $ANTLR start "rule__LidlInteraction__Group__5__Impl"
    // InternalLidl.g:3432:1: rule__LidlInteraction__Group__5__Impl : ( 'is' ) ;
    public final void rule__LidlInteraction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3436:1: ( ( 'is' ) )
            // InternalLidl.g:3437:1: ( 'is' )
            {
            // InternalLidl.g:3437:1: ( 'is' )
            // InternalLidl.g:3438:2: 'is'
            {
             before(grammarAccess.getLidlInteractionAccess().getIsKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLidlInteractionAccess().getIsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__5__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__6"
    // InternalLidl.g:3447:1: rule__LidlInteraction__Group__6 : rule__LidlInteraction__Group__6__Impl rule__LidlInteraction__Group__7 ;
    public final void rule__LidlInteraction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3451:1: ( rule__LidlInteraction__Group__6__Impl rule__LidlInteraction__Group__7 )
            // InternalLidl.g:3452:2: rule__LidlInteraction__Group__6__Impl rule__LidlInteraction__Group__7
            {
            pushFollow(FOLLOW_29);
            rule__LidlInteraction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__6"


    // $ANTLR start "rule__LidlInteraction__Group__6__Impl"
    // InternalLidl.g:3459:1: rule__LidlInteraction__Group__6__Impl : ( '(' ) ;
    public final void rule__LidlInteraction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3463:1: ( ( '(' ) )
            // InternalLidl.g:3464:1: ( '(' )
            {
            // InternalLidl.g:3464:1: ( '(' )
            // InternalLidl.g:3465:2: '('
            {
             before(grammarAccess.getLidlInteractionAccess().getLeftParenthesisKeyword_6()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLidlInteractionAccess().getLeftParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__6__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__7"
    // InternalLidl.g:3474:1: rule__LidlInteraction__Group__7 : rule__LidlInteraction__Group__7__Impl rule__LidlInteraction__Group__8 ;
    public final void rule__LidlInteraction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3478:1: ( rule__LidlInteraction__Group__7__Impl rule__LidlInteraction__Group__8 )
            // InternalLidl.g:3479:2: rule__LidlInteraction__Group__7__Impl rule__LidlInteraction__Group__8
            {
            pushFollow(FOLLOW_30);
            rule__LidlInteraction__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__7"


    // $ANTLR start "rule__LidlInteraction__Group__7__Impl"
    // InternalLidl.g:3486:1: rule__LidlInteraction__Group__7__Impl : ( ( rule__LidlInteraction__DefinitionAssignment_7 ) ) ;
    public final void rule__LidlInteraction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3490:1: ( ( ( rule__LidlInteraction__DefinitionAssignment_7 ) ) )
            // InternalLidl.g:3491:1: ( ( rule__LidlInteraction__DefinitionAssignment_7 ) )
            {
            // InternalLidl.g:3491:1: ( ( rule__LidlInteraction__DefinitionAssignment_7 ) )
            // InternalLidl.g:3492:2: ( rule__LidlInteraction__DefinitionAssignment_7 )
            {
             before(grammarAccess.getLidlInteractionAccess().getDefinitionAssignment_7()); 
            // InternalLidl.g:3493:2: ( rule__LidlInteraction__DefinitionAssignment_7 )
            // InternalLidl.g:3493:3: rule__LidlInteraction__DefinitionAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteraction__DefinitionAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getLidlInteractionAccess().getDefinitionAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__7__Impl"


    // $ANTLR start "rule__LidlInteraction__Group__8"
    // InternalLidl.g:3501:1: rule__LidlInteraction__Group__8 : rule__LidlInteraction__Group__8__Impl ;
    public final void rule__LidlInteraction__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3505:1: ( rule__LidlInteraction__Group__8__Impl )
            // InternalLidl.g:3506:2: rule__LidlInteraction__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__8"


    // $ANTLR start "rule__LidlInteraction__Group__8__Impl"
    // InternalLidl.g:3512:1: rule__LidlInteraction__Group__8__Impl : ( ')' ) ;
    public final void rule__LidlInteraction__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3516:1: ( ( ')' ) )
            // InternalLidl.g:3517:1: ( ')' )
            {
            // InternalLidl.g:3517:1: ( ')' )
            // InternalLidl.g:3518:2: ')'
            {
             before(grammarAccess.getLidlInteractionAccess().getRightParenthesisKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLidlInteractionAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group__8__Impl"


    // $ANTLR start "rule__LidlInteraction__Group_4__0"
    // InternalLidl.g:3528:1: rule__LidlInteraction__Group_4__0 : rule__LidlInteraction__Group_4__0__Impl rule__LidlInteraction__Group_4__1 ;
    public final void rule__LidlInteraction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3532:1: ( rule__LidlInteraction__Group_4__0__Impl rule__LidlInteraction__Group_4__1 )
            // InternalLidl.g:3533:2: rule__LidlInteraction__Group_4__0__Impl rule__LidlInteraction__Group_4__1
            {
            pushFollow(FOLLOW_31);
            rule__LidlInteraction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group_4__0"


    // $ANTLR start "rule__LidlInteraction__Group_4__0__Impl"
    // InternalLidl.g:3540:1: rule__LidlInteraction__Group_4__0__Impl : ( ( rule__LidlInteraction__NestedAssignment_4_0 ) ) ;
    public final void rule__LidlInteraction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3544:1: ( ( ( rule__LidlInteraction__NestedAssignment_4_0 ) ) )
            // InternalLidl.g:3545:1: ( ( rule__LidlInteraction__NestedAssignment_4_0 ) )
            {
            // InternalLidl.g:3545:1: ( ( rule__LidlInteraction__NestedAssignment_4_0 ) )
            // InternalLidl.g:3546:2: ( rule__LidlInteraction__NestedAssignment_4_0 )
            {
             before(grammarAccess.getLidlInteractionAccess().getNestedAssignment_4_0()); 
            // InternalLidl.g:3547:2: ( rule__LidlInteraction__NestedAssignment_4_0 )
            // InternalLidl.g:3547:3: rule__LidlInteraction__NestedAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteraction__NestedAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlInteractionAccess().getNestedAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group_4__0__Impl"


    // $ANTLR start "rule__LidlInteraction__Group_4__1"
    // InternalLidl.g:3555:1: rule__LidlInteraction__Group_4__1 : rule__LidlInteraction__Group_4__1__Impl ;
    public final void rule__LidlInteraction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3559:1: ( rule__LidlInteraction__Group_4__1__Impl )
            // InternalLidl.g:3560:2: rule__LidlInteraction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteraction__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group_4__1"


    // $ANTLR start "rule__LidlInteraction__Group_4__1__Impl"
    // InternalLidl.g:3566:1: rule__LidlInteraction__Group_4__1__Impl : ( ( ( rule__LidlInteraction__NestedDefAssignment_4_1 ) ) ( ( rule__LidlInteraction__NestedDefAssignment_4_1 )* ) ) ;
    public final void rule__LidlInteraction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3570:1: ( ( ( ( rule__LidlInteraction__NestedDefAssignment_4_1 ) ) ( ( rule__LidlInteraction__NestedDefAssignment_4_1 )* ) ) )
            // InternalLidl.g:3571:1: ( ( ( rule__LidlInteraction__NestedDefAssignment_4_1 ) ) ( ( rule__LidlInteraction__NestedDefAssignment_4_1 )* ) )
            {
            // InternalLidl.g:3571:1: ( ( ( rule__LidlInteraction__NestedDefAssignment_4_1 ) ) ( ( rule__LidlInteraction__NestedDefAssignment_4_1 )* ) )
            // InternalLidl.g:3572:2: ( ( rule__LidlInteraction__NestedDefAssignment_4_1 ) ) ( ( rule__LidlInteraction__NestedDefAssignment_4_1 )* )
            {
            // InternalLidl.g:3572:2: ( ( rule__LidlInteraction__NestedDefAssignment_4_1 ) )
            // InternalLidl.g:3573:3: ( rule__LidlInteraction__NestedDefAssignment_4_1 )
            {
             before(grammarAccess.getLidlInteractionAccess().getNestedDefAssignment_4_1()); 
            // InternalLidl.g:3574:3: ( rule__LidlInteraction__NestedDefAssignment_4_1 )
            // InternalLidl.g:3574:4: rule__LidlInteraction__NestedDefAssignment_4_1
            {
            pushFollow(FOLLOW_5);
            rule__LidlInteraction__NestedDefAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlInteractionAccess().getNestedDefAssignment_4_1()); 

            }

            // InternalLidl.g:3577:2: ( ( rule__LidlInteraction__NestedDefAssignment_4_1 )* )
            // InternalLidl.g:3578:3: ( rule__LidlInteraction__NestedDefAssignment_4_1 )*
            {
             before(grammarAccess.getLidlInteractionAccess().getNestedDefAssignment_4_1()); 
            // InternalLidl.g:3579:3: ( rule__LidlInteraction__NestedDefAssignment_4_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalLidl.g:3579:4: rule__LidlInteraction__NestedDefAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__LidlInteraction__NestedDefAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getLidlInteractionAccess().getNestedDefAssignment_4_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__Group_4__1__Impl"


    // $ANTLR start "rule__LidlInteractionID__Group__0"
    // InternalLidl.g:3589:1: rule__LidlInteractionID__Group__0 : rule__LidlInteractionID__Group__0__Impl rule__LidlInteractionID__Group__1 ;
    public final void rule__LidlInteractionID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3593:1: ( rule__LidlInteractionID__Group__0__Impl rule__LidlInteractionID__Group__1 )
            // InternalLidl.g:3594:2: rule__LidlInteractionID__Group__0__Impl rule__LidlInteractionID__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__LidlInteractionID__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteractionID__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteractionID__Group__0"


    // $ANTLR start "rule__LidlInteractionID__Group__0__Impl"
    // InternalLidl.g:3601:1: rule__LidlInteractionID__Group__0__Impl : ( '(' ) ;
    public final void rule__LidlInteractionID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3605:1: ( ( '(' ) )
            // InternalLidl.g:3606:1: ( '(' )
            {
            // InternalLidl.g:3606:1: ( '(' )
            // InternalLidl.g:3607:2: '('
            {
             before(grammarAccess.getLidlInteractionIDAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLidlInteractionIDAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteractionID__Group__0__Impl"


    // $ANTLR start "rule__LidlInteractionID__Group__1"
    // InternalLidl.g:3616:1: rule__LidlInteractionID__Group__1 : rule__LidlInteractionID__Group__1__Impl rule__LidlInteractionID__Group__2 ;
    public final void rule__LidlInteractionID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3620:1: ( rule__LidlInteractionID__Group__1__Impl rule__LidlInteractionID__Group__2 )
            // InternalLidl.g:3621:2: rule__LidlInteractionID__Group__1__Impl rule__LidlInteractionID__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__LidlInteractionID__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlInteractionID__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteractionID__Group__1"


    // $ANTLR start "rule__LidlInteractionID__Group__1__Impl"
    // InternalLidl.g:3628:1: rule__LidlInteractionID__Group__1__Impl : ( ( ( rule__LidlInteractionID__ItemsAssignment_1 ) ) ( ( rule__LidlInteractionID__ItemsAssignment_1 )* ) ) ;
    public final void rule__LidlInteractionID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3632:1: ( ( ( ( rule__LidlInteractionID__ItemsAssignment_1 ) ) ( ( rule__LidlInteractionID__ItemsAssignment_1 )* ) ) )
            // InternalLidl.g:3633:1: ( ( ( rule__LidlInteractionID__ItemsAssignment_1 ) ) ( ( rule__LidlInteractionID__ItemsAssignment_1 )* ) )
            {
            // InternalLidl.g:3633:1: ( ( ( rule__LidlInteractionID__ItemsAssignment_1 ) ) ( ( rule__LidlInteractionID__ItemsAssignment_1 )* ) )
            // InternalLidl.g:3634:2: ( ( rule__LidlInteractionID__ItemsAssignment_1 ) ) ( ( rule__LidlInteractionID__ItemsAssignment_1 )* )
            {
            // InternalLidl.g:3634:2: ( ( rule__LidlInteractionID__ItemsAssignment_1 ) )
            // InternalLidl.g:3635:3: ( rule__LidlInteractionID__ItemsAssignment_1 )
            {
             before(grammarAccess.getLidlInteractionIDAccess().getItemsAssignment_1()); 
            // InternalLidl.g:3636:3: ( rule__LidlInteractionID__ItemsAssignment_1 )
            // InternalLidl.g:3636:4: rule__LidlInteractionID__ItemsAssignment_1
            {
            pushFollow(FOLLOW_33);
            rule__LidlInteractionID__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlInteractionIDAccess().getItemsAssignment_1()); 

            }

            // InternalLidl.g:3639:2: ( ( rule__LidlInteractionID__ItemsAssignment_1 )* )
            // InternalLidl.g:3640:3: ( rule__LidlInteractionID__ItemsAssignment_1 )*
            {
             before(grammarAccess.getLidlInteractionIDAccess().getItemsAssignment_1()); 
            // InternalLidl.g:3641:3: ( rule__LidlInteractionID__ItemsAssignment_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_ID && LA32_0<=RULE_LIDLIDSYMBOL)||LA32_0==32) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalLidl.g:3641:4: rule__LidlInteractionID__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__LidlInteractionID__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getLidlInteractionIDAccess().getItemsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteractionID__Group__1__Impl"


    // $ANTLR start "rule__LidlInteractionID__Group__2"
    // InternalLidl.g:3650:1: rule__LidlInteractionID__Group__2 : rule__LidlInteractionID__Group__2__Impl ;
    public final void rule__LidlInteractionID__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3654:1: ( rule__LidlInteractionID__Group__2__Impl )
            // InternalLidl.g:3655:2: rule__LidlInteractionID__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlInteractionID__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteractionID__Group__2"


    // $ANTLR start "rule__LidlInteractionID__Group__2__Impl"
    // InternalLidl.g:3661:1: rule__LidlInteractionID__Group__2__Impl : ( ')' ) ;
    public final void rule__LidlInteractionID__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3665:1: ( ( ')' ) )
            // InternalLidl.g:3666:1: ( ')' )
            {
            // InternalLidl.g:3666:1: ( ')' )
            // InternalLidl.g:3667:2: ')'
            {
             before(grammarAccess.getLidlInteractionIDAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLidlInteractionIDAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteractionID__Group__2__Impl"


    // $ANTLR start "rule__LidlParameter__Group__0"
    // InternalLidl.g:3677:1: rule__LidlParameter__Group__0 : rule__LidlParameter__Group__0__Impl rule__LidlParameter__Group__1 ;
    public final void rule__LidlParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3681:1: ( rule__LidlParameter__Group__0__Impl rule__LidlParameter__Group__1 )
            // InternalLidl.g:3682:2: rule__LidlParameter__Group__0__Impl rule__LidlParameter__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__LidlParameter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlParameter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__0"


    // $ANTLR start "rule__LidlParameter__Group__0__Impl"
    // InternalLidl.g:3689:1: rule__LidlParameter__Group__0__Impl : ( () ) ;
    public final void rule__LidlParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3693:1: ( ( () ) )
            // InternalLidl.g:3694:1: ( () )
            {
            // InternalLidl.g:3694:1: ( () )
            // InternalLidl.g:3695:2: ()
            {
             before(grammarAccess.getLidlParameterAccess().getLidlParameterAction_0()); 
            // InternalLidl.g:3696:2: ()
            // InternalLidl.g:3696:3: 
            {
            }

             after(grammarAccess.getLidlParameterAccess().getLidlParameterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__0__Impl"


    // $ANTLR start "rule__LidlParameter__Group__1"
    // InternalLidl.g:3704:1: rule__LidlParameter__Group__1 : rule__LidlParameter__Group__1__Impl rule__LidlParameter__Group__2 ;
    public final void rule__LidlParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3708:1: ( rule__LidlParameter__Group__1__Impl rule__LidlParameter__Group__2 )
            // InternalLidl.g:3709:2: rule__LidlParameter__Group__1__Impl rule__LidlParameter__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__LidlParameter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlParameter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__1"


    // $ANTLR start "rule__LidlParameter__Group__1__Impl"
    // InternalLidl.g:3716:1: rule__LidlParameter__Group__1__Impl : ( '(' ) ;
    public final void rule__LidlParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3720:1: ( ( '(' ) )
            // InternalLidl.g:3721:1: ( '(' )
            {
            // InternalLidl.g:3721:1: ( '(' )
            // InternalLidl.g:3722:2: '('
            {
             before(grammarAccess.getLidlParameterAccess().getLeftParenthesisKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLidlParameterAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__1__Impl"


    // $ANTLR start "rule__LidlParameter__Group__2"
    // InternalLidl.g:3731:1: rule__LidlParameter__Group__2 : rule__LidlParameter__Group__2__Impl rule__LidlParameter__Group__3 ;
    public final void rule__LidlParameter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3735:1: ( rule__LidlParameter__Group__2__Impl rule__LidlParameter__Group__3 )
            // InternalLidl.g:3736:2: rule__LidlParameter__Group__2__Impl rule__LidlParameter__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__LidlParameter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlParameter__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__2"


    // $ANTLR start "rule__LidlParameter__Group__2__Impl"
    // InternalLidl.g:3743:1: rule__LidlParameter__Group__2__Impl : ( ( rule__LidlParameter__NameAssignment_2 ) ) ;
    public final void rule__LidlParameter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3747:1: ( ( ( rule__LidlParameter__NameAssignment_2 ) ) )
            // InternalLidl.g:3748:1: ( ( rule__LidlParameter__NameAssignment_2 ) )
            {
            // InternalLidl.g:3748:1: ( ( rule__LidlParameter__NameAssignment_2 ) )
            // InternalLidl.g:3749:2: ( rule__LidlParameter__NameAssignment_2 )
            {
             before(grammarAccess.getLidlParameterAccess().getNameAssignment_2()); 
            // InternalLidl.g:3750:2: ( rule__LidlParameter__NameAssignment_2 )
            // InternalLidl.g:3750:3: rule__LidlParameter__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LidlParameter__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLidlParameterAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__2__Impl"


    // $ANTLR start "rule__LidlParameter__Group__3"
    // InternalLidl.g:3758:1: rule__LidlParameter__Group__3 : rule__LidlParameter__Group__3__Impl rule__LidlParameter__Group__4 ;
    public final void rule__LidlParameter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3762:1: ( rule__LidlParameter__Group__3__Impl rule__LidlParameter__Group__4 )
            // InternalLidl.g:3763:2: rule__LidlParameter__Group__3__Impl rule__LidlParameter__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__LidlParameter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlParameter__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__3"


    // $ANTLR start "rule__LidlParameter__Group__3__Impl"
    // InternalLidl.g:3770:1: rule__LidlParameter__Group__3__Impl : ( ':' ) ;
    public final void rule__LidlParameter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3774:1: ( ( ':' ) )
            // InternalLidl.g:3775:1: ( ':' )
            {
            // InternalLidl.g:3775:1: ( ':' )
            // InternalLidl.g:3776:2: ':'
            {
             before(grammarAccess.getLidlParameterAccess().getColonKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLidlParameterAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__3__Impl"


    // $ANTLR start "rule__LidlParameter__Group__4"
    // InternalLidl.g:3785:1: rule__LidlParameter__Group__4 : rule__LidlParameter__Group__4__Impl rule__LidlParameter__Group__5 ;
    public final void rule__LidlParameter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3789:1: ( rule__LidlParameter__Group__4__Impl rule__LidlParameter__Group__5 )
            // InternalLidl.g:3790:2: rule__LidlParameter__Group__4__Impl rule__LidlParameter__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__LidlParameter__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlParameter__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__4"


    // $ANTLR start "rule__LidlParameter__Group__4__Impl"
    // InternalLidl.g:3797:1: rule__LidlParameter__Group__4__Impl : ( ( rule__LidlParameter__InterfaceAssignment_4 ) ) ;
    public final void rule__LidlParameter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3801:1: ( ( ( rule__LidlParameter__InterfaceAssignment_4 ) ) )
            // InternalLidl.g:3802:1: ( ( rule__LidlParameter__InterfaceAssignment_4 ) )
            {
            // InternalLidl.g:3802:1: ( ( rule__LidlParameter__InterfaceAssignment_4 ) )
            // InternalLidl.g:3803:2: ( rule__LidlParameter__InterfaceAssignment_4 )
            {
             before(grammarAccess.getLidlParameterAccess().getInterfaceAssignment_4()); 
            // InternalLidl.g:3804:2: ( rule__LidlParameter__InterfaceAssignment_4 )
            // InternalLidl.g:3804:3: rule__LidlParameter__InterfaceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LidlParameter__InterfaceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLidlParameterAccess().getInterfaceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__4__Impl"


    // $ANTLR start "rule__LidlParameter__Group__5"
    // InternalLidl.g:3812:1: rule__LidlParameter__Group__5 : rule__LidlParameter__Group__5__Impl ;
    public final void rule__LidlParameter__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3816:1: ( rule__LidlParameter__Group__5__Impl )
            // InternalLidl.g:3817:2: rule__LidlParameter__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlParameter__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__5"


    // $ANTLR start "rule__LidlParameter__Group__5__Impl"
    // InternalLidl.g:3823:1: rule__LidlParameter__Group__5__Impl : ( ')' ) ;
    public final void rule__LidlParameter__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3827:1: ( ( ')' ) )
            // InternalLidl.g:3828:1: ( ')' )
            {
            // InternalLidl.g:3828:1: ( ')' )
            // InternalLidl.g:3829:2: ')'
            {
             before(grammarAccess.getLidlParameterAccess().getRightParenthesisKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLidlParameterAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__Group__5__Impl"


    // $ANTLR start "rule__LidlText__Group__0"
    // InternalLidl.g:3839:1: rule__LidlText__Group__0 : rule__LidlText__Group__0__Impl rule__LidlText__Group__1 ;
    public final void rule__LidlText__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3843:1: ( rule__LidlText__Group__0__Impl rule__LidlText__Group__1 )
            // InternalLidl.g:3844:2: rule__LidlText__Group__0__Impl rule__LidlText__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__LidlText__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlText__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlText__Group__0"


    // $ANTLR start "rule__LidlText__Group__0__Impl"
    // InternalLidl.g:3851:1: rule__LidlText__Group__0__Impl : ( () ) ;
    public final void rule__LidlText__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3855:1: ( ( () ) )
            // InternalLidl.g:3856:1: ( () )
            {
            // InternalLidl.g:3856:1: ( () )
            // InternalLidl.g:3857:2: ()
            {
             before(grammarAccess.getLidlTextAccess().getLidlTextAction_0()); 
            // InternalLidl.g:3858:2: ()
            // InternalLidl.g:3858:3: 
            {
            }

             after(grammarAccess.getLidlTextAccess().getLidlTextAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlText__Group__0__Impl"


    // $ANTLR start "rule__LidlText__Group__1"
    // InternalLidl.g:3866:1: rule__LidlText__Group__1 : rule__LidlText__Group__1__Impl ;
    public final void rule__LidlText__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3870:1: ( rule__LidlText__Group__1__Impl )
            // InternalLidl.g:3871:2: rule__LidlText__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlText__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlText__Group__1"


    // $ANTLR start "rule__LidlText__Group__1__Impl"
    // InternalLidl.g:3877:1: rule__LidlText__Group__1__Impl : ( ( rule__LidlText__TextAssignment_1 ) ) ;
    public final void rule__LidlText__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3881:1: ( ( ( rule__LidlText__TextAssignment_1 ) ) )
            // InternalLidl.g:3882:1: ( ( rule__LidlText__TextAssignment_1 ) )
            {
            // InternalLidl.g:3882:1: ( ( rule__LidlText__TextAssignment_1 ) )
            // InternalLidl.g:3883:2: ( rule__LidlText__TextAssignment_1 )
            {
             before(grammarAccess.getLidlTextAccess().getTextAssignment_1()); 
            // InternalLidl.g:3884:2: ( rule__LidlText__TextAssignment_1 )
            // InternalLidl.g:3884:3: rule__LidlText__TextAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlText__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlTextAccess().getTextAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlText__Group__1__Impl"


    // $ANTLR start "rule__LidlCallExpression__Group__0"
    // InternalLidl.g:3893:1: rule__LidlCallExpression__Group__0 : rule__LidlCallExpression__Group__0__Impl rule__LidlCallExpression__Group__1 ;
    public final void rule__LidlCallExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3897:1: ( rule__LidlCallExpression__Group__0__Impl rule__LidlCallExpression__Group__1 )
            // InternalLidl.g:3898:2: rule__LidlCallExpression__Group__0__Impl rule__LidlCallExpression__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__LidlCallExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlCallExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCallExpression__Group__0"


    // $ANTLR start "rule__LidlCallExpression__Group__0__Impl"
    // InternalLidl.g:3905:1: rule__LidlCallExpression__Group__0__Impl : ( () ) ;
    public final void rule__LidlCallExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3909:1: ( ( () ) )
            // InternalLidl.g:3910:1: ( () )
            {
            // InternalLidl.g:3910:1: ( () )
            // InternalLidl.g:3911:2: ()
            {
             before(grammarAccess.getLidlCallExpressionAccess().getLidlCallExpressionAction_0()); 
            // InternalLidl.g:3912:2: ()
            // InternalLidl.g:3912:3: 
            {
            }

             after(grammarAccess.getLidlCallExpressionAccess().getLidlCallExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCallExpression__Group__0__Impl"


    // $ANTLR start "rule__LidlCallExpression__Group__1"
    // InternalLidl.g:3920:1: rule__LidlCallExpression__Group__1 : rule__LidlCallExpression__Group__1__Impl ;
    public final void rule__LidlCallExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3924:1: ( rule__LidlCallExpression__Group__1__Impl )
            // InternalLidl.g:3925:2: rule__LidlCallExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlCallExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCallExpression__Group__1"


    // $ANTLR start "rule__LidlCallExpression__Group__1__Impl"
    // InternalLidl.g:3931:1: rule__LidlCallExpression__Group__1__Impl : ( ( ( rule__LidlCallExpression__ItemsAssignment_1 ) ) ( ( rule__LidlCallExpression__ItemsAssignment_1 )* ) ) ;
    public final void rule__LidlCallExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3935:1: ( ( ( ( rule__LidlCallExpression__ItemsAssignment_1 ) ) ( ( rule__LidlCallExpression__ItemsAssignment_1 )* ) ) )
            // InternalLidl.g:3936:1: ( ( ( rule__LidlCallExpression__ItemsAssignment_1 ) ) ( ( rule__LidlCallExpression__ItemsAssignment_1 )* ) )
            {
            // InternalLidl.g:3936:1: ( ( ( rule__LidlCallExpression__ItemsAssignment_1 ) ) ( ( rule__LidlCallExpression__ItemsAssignment_1 )* ) )
            // InternalLidl.g:3937:2: ( ( rule__LidlCallExpression__ItemsAssignment_1 ) ) ( ( rule__LidlCallExpression__ItemsAssignment_1 )* )
            {
            // InternalLidl.g:3937:2: ( ( rule__LidlCallExpression__ItemsAssignment_1 ) )
            // InternalLidl.g:3938:3: ( rule__LidlCallExpression__ItemsAssignment_1 )
            {
             before(grammarAccess.getLidlCallExpressionAccess().getItemsAssignment_1()); 
            // InternalLidl.g:3939:3: ( rule__LidlCallExpression__ItemsAssignment_1 )
            // InternalLidl.g:3939:4: rule__LidlCallExpression__ItemsAssignment_1
            {
            pushFollow(FOLLOW_36);
            rule__LidlCallExpression__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlCallExpressionAccess().getItemsAssignment_1()); 

            }

            // InternalLidl.g:3942:2: ( ( rule__LidlCallExpression__ItemsAssignment_1 )* )
            // InternalLidl.g:3943:3: ( rule__LidlCallExpression__ItemsAssignment_1 )*
            {
             before(grammarAccess.getLidlCallExpressionAccess().getItemsAssignment_1()); 
            // InternalLidl.g:3944:3: ( rule__LidlCallExpression__ItemsAssignment_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_ID && LA33_0<=RULE_LIDLIDSYMBOL)||(LA33_0>=13 && LA33_0<=14)||LA33_0==32) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalLidl.g:3944:4: rule__LidlCallExpression__ItemsAssignment_1
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__LidlCallExpression__ItemsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getLidlCallExpressionAccess().getItemsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCallExpression__Group__1__Impl"


    // $ANTLR start "rule__CallPart__Group_0__0"
    // InternalLidl.g:3954:1: rule__CallPart__Group_0__0 : rule__CallPart__Group_0__0__Impl rule__CallPart__Group_0__1 ;
    public final void rule__CallPart__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3958:1: ( rule__CallPart__Group_0__0__Impl rule__CallPart__Group_0__1 )
            // InternalLidl.g:3959:2: rule__CallPart__Group_0__0__Impl rule__CallPart__Group_0__1
            {
            pushFollow(FOLLOW_37);
            rule__CallPart__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallPart__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_0__0"


    // $ANTLR start "rule__CallPart__Group_0__0__Impl"
    // InternalLidl.g:3966:1: rule__CallPart__Group_0__0__Impl : ( () ) ;
    public final void rule__CallPart__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3970:1: ( ( () ) )
            // InternalLidl.g:3971:1: ( () )
            {
            // InternalLidl.g:3971:1: ( () )
            // InternalLidl.g:3972:2: ()
            {
             before(grammarAccess.getCallPartAccess().getTextCallPartAction_0_0()); 
            // InternalLidl.g:3973:2: ()
            // InternalLidl.g:3973:3: 
            {
            }

             after(grammarAccess.getCallPartAccess().getTextCallPartAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_0__0__Impl"


    // $ANTLR start "rule__CallPart__Group_0__1"
    // InternalLidl.g:3981:1: rule__CallPart__Group_0__1 : rule__CallPart__Group_0__1__Impl ;
    public final void rule__CallPart__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3985:1: ( rule__CallPart__Group_0__1__Impl )
            // InternalLidl.g:3986:2: rule__CallPart__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallPart__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_0__1"


    // $ANTLR start "rule__CallPart__Group_0__1__Impl"
    // InternalLidl.g:3992:1: rule__CallPart__Group_0__1__Impl : ( ( rule__CallPart__TextAssignment_0_1 ) ) ;
    public final void rule__CallPart__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:3996:1: ( ( ( rule__CallPart__TextAssignment_0_1 ) ) )
            // InternalLidl.g:3997:1: ( ( rule__CallPart__TextAssignment_0_1 ) )
            {
            // InternalLidl.g:3997:1: ( ( rule__CallPart__TextAssignment_0_1 ) )
            // InternalLidl.g:3998:2: ( rule__CallPart__TextAssignment_0_1 )
            {
             before(grammarAccess.getCallPartAccess().getTextAssignment_0_1()); 
            // InternalLidl.g:3999:2: ( rule__CallPart__TextAssignment_0_1 )
            // InternalLidl.g:3999:3: rule__CallPart__TextAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CallPart__TextAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCallPartAccess().getTextAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_0__1__Impl"


    // $ANTLR start "rule__CallPart__Group_1__0"
    // InternalLidl.g:4008:1: rule__CallPart__Group_1__0 : rule__CallPart__Group_1__0__Impl rule__CallPart__Group_1__1 ;
    public final void rule__CallPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4012:1: ( rule__CallPart__Group_1__0__Impl rule__CallPart__Group_1__1 )
            // InternalLidl.g:4013:2: rule__CallPart__Group_1__0__Impl rule__CallPart__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__CallPart__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallPart__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_1__0"


    // $ANTLR start "rule__CallPart__Group_1__0__Impl"
    // InternalLidl.g:4020:1: rule__CallPart__Group_1__0__Impl : ( () ) ;
    public final void rule__CallPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4024:1: ( ( () ) )
            // InternalLidl.g:4025:1: ( () )
            {
            // InternalLidl.g:4025:1: ( () )
            // InternalLidl.g:4026:2: ()
            {
             before(grammarAccess.getCallPartAccess().getParamCallPartAction_1_0()); 
            // InternalLidl.g:4027:2: ()
            // InternalLidl.g:4027:3: 
            {
            }

             after(grammarAccess.getCallPartAccess().getParamCallPartAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_1__0__Impl"


    // $ANTLR start "rule__CallPart__Group_1__1"
    // InternalLidl.g:4035:1: rule__CallPart__Group_1__1 : rule__CallPart__Group_1__1__Impl rule__CallPart__Group_1__2 ;
    public final void rule__CallPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4039:1: ( rule__CallPart__Group_1__1__Impl rule__CallPart__Group_1__2 )
            // InternalLidl.g:4040:2: rule__CallPart__Group_1__1__Impl rule__CallPart__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__CallPart__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallPart__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_1__1"


    // $ANTLR start "rule__CallPart__Group_1__1__Impl"
    // InternalLidl.g:4047:1: rule__CallPart__Group_1__1__Impl : ( '(' ) ;
    public final void rule__CallPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4051:1: ( ( '(' ) )
            // InternalLidl.g:4052:1: ( '(' )
            {
            // InternalLidl.g:4052:1: ( '(' )
            // InternalLidl.g:4053:2: '('
            {
             before(grammarAccess.getCallPartAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCallPartAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_1__1__Impl"


    // $ANTLR start "rule__CallPart__Group_1__2"
    // InternalLidl.g:4062:1: rule__CallPart__Group_1__2 : rule__CallPart__Group_1__2__Impl rule__CallPart__Group_1__3 ;
    public final void rule__CallPart__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4066:1: ( rule__CallPart__Group_1__2__Impl rule__CallPart__Group_1__3 )
            // InternalLidl.g:4067:2: rule__CallPart__Group_1__2__Impl rule__CallPart__Group_1__3
            {
            pushFollow(FOLLOW_30);
            rule__CallPart__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallPart__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_1__2"


    // $ANTLR start "rule__CallPart__Group_1__2__Impl"
    // InternalLidl.g:4074:1: rule__CallPart__Group_1__2__Impl : ( ( rule__CallPart__ParamAssignment_1_2 ) ) ;
    public final void rule__CallPart__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4078:1: ( ( ( rule__CallPart__ParamAssignment_1_2 ) ) )
            // InternalLidl.g:4079:1: ( ( rule__CallPart__ParamAssignment_1_2 ) )
            {
            // InternalLidl.g:4079:1: ( ( rule__CallPart__ParamAssignment_1_2 ) )
            // InternalLidl.g:4080:2: ( rule__CallPart__ParamAssignment_1_2 )
            {
             before(grammarAccess.getCallPartAccess().getParamAssignment_1_2()); 
            // InternalLidl.g:4081:2: ( rule__CallPart__ParamAssignment_1_2 )
            // InternalLidl.g:4081:3: rule__CallPart__ParamAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__CallPart__ParamAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getCallPartAccess().getParamAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_1__2__Impl"


    // $ANTLR start "rule__CallPart__Group_1__3"
    // InternalLidl.g:4089:1: rule__CallPart__Group_1__3 : rule__CallPart__Group_1__3__Impl ;
    public final void rule__CallPart__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4093:1: ( rule__CallPart__Group_1__3__Impl )
            // InternalLidl.g:4094:2: rule__CallPart__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallPart__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_1__3"


    // $ANTLR start "rule__CallPart__Group_1__3__Impl"
    // InternalLidl.g:4100:1: rule__CallPart__Group_1__3__Impl : ( ')' ) ;
    public final void rule__CallPart__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4104:1: ( ( ')' ) )
            // InternalLidl.g:4105:1: ( ')' )
            {
            // InternalLidl.g:4105:1: ( ')' )
            // InternalLidl.g:4106:2: ')'
            {
             before(grammarAccess.getCallPartAccess().getRightParenthesisKeyword_1_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCallPartAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__Group_1__3__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_0__0"
    // InternalLidl.g:4116:1: rule__LidlTerminalExpression__Group_0__0 : rule__LidlTerminalExpression__Group_0__0__Impl rule__LidlTerminalExpression__Group_0__1 ;
    public final void rule__LidlTerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4120:1: ( rule__LidlTerminalExpression__Group_0__0__Impl rule__LidlTerminalExpression__Group_0__1 )
            // InternalLidl.g:4121:2: rule__LidlTerminalExpression__Group_0__0__Impl rule__LidlTerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__LidlTerminalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_0__0"


    // $ANTLR start "rule__LidlTerminalExpression__Group_0__0__Impl"
    // InternalLidl.g:4128:1: rule__LidlTerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__LidlTerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4132:1: ( ( () ) )
            // InternalLidl.g:4133:1: ( () )
            {
            // InternalLidl.g:4133:1: ( () )
            // InternalLidl.g:4134:2: ()
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getLidlStringConstantAction_0_0()); 
            // InternalLidl.g:4135:2: ()
            // InternalLidl.g:4135:3: 
            {
            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getLidlStringConstantAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_0__1"
    // InternalLidl.g:4143:1: rule__LidlTerminalExpression__Group_0__1 : rule__LidlTerminalExpression__Group_0__1__Impl ;
    public final void rule__LidlTerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4147:1: ( rule__LidlTerminalExpression__Group_0__1__Impl )
            // InternalLidl.g:4148:2: rule__LidlTerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_0__1"


    // $ANTLR start "rule__LidlTerminalExpression__Group_0__1__Impl"
    // InternalLidl.g:4154:1: rule__LidlTerminalExpression__Group_0__1__Impl : ( ( rule__LidlTerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__LidlTerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4158:1: ( ( ( rule__LidlTerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalLidl.g:4159:1: ( ( rule__LidlTerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalLidl.g:4159:1: ( ( rule__LidlTerminalExpression__ValueAssignment_0_1 ) )
            // InternalLidl.g:4160:2: ( rule__LidlTerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_0_1()); 
            // InternalLidl.g:4161:2: ( rule__LidlTerminalExpression__ValueAssignment_0_1 )
            // InternalLidl.g:4161:3: rule__LidlTerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_1__0"
    // InternalLidl.g:4170:1: rule__LidlTerminalExpression__Group_1__0 : rule__LidlTerminalExpression__Group_1__0__Impl rule__LidlTerminalExpression__Group_1__1 ;
    public final void rule__LidlTerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4174:1: ( rule__LidlTerminalExpression__Group_1__0__Impl rule__LidlTerminalExpression__Group_1__1 )
            // InternalLidl.g:4175:2: rule__LidlTerminalExpression__Group_1__0__Impl rule__LidlTerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__LidlTerminalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_1__0"


    // $ANTLR start "rule__LidlTerminalExpression__Group_1__0__Impl"
    // InternalLidl.g:4182:1: rule__LidlTerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LidlTerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4186:1: ( ( () ) )
            // InternalLidl.g:4187:1: ( () )
            {
            // InternalLidl.g:4187:1: ( () )
            // InternalLidl.g:4188:2: ()
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getLidlNumberConstantAction_1_0()); 
            // InternalLidl.g:4189:2: ()
            // InternalLidl.g:4189:3: 
            {
            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getLidlNumberConstantAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_1__1"
    // InternalLidl.g:4197:1: rule__LidlTerminalExpression__Group_1__1 : rule__LidlTerminalExpression__Group_1__1__Impl ;
    public final void rule__LidlTerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4201:1: ( rule__LidlTerminalExpression__Group_1__1__Impl )
            // InternalLidl.g:4202:2: rule__LidlTerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_1__1"


    // $ANTLR start "rule__LidlTerminalExpression__Group_1__1__Impl"
    // InternalLidl.g:4208:1: rule__LidlTerminalExpression__Group_1__1__Impl : ( ( rule__LidlTerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__LidlTerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4212:1: ( ( ( rule__LidlTerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalLidl.g:4213:1: ( ( rule__LidlTerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalLidl.g:4213:1: ( ( rule__LidlTerminalExpression__ValueAssignment_1_1 ) )
            // InternalLidl.g:4214:2: ( rule__LidlTerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_1_1()); 
            // InternalLidl.g:4215:2: ( rule__LidlTerminalExpression__ValueAssignment_1_1 )
            // InternalLidl.g:4215:3: rule__LidlTerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_2__0"
    // InternalLidl.g:4224:1: rule__LidlTerminalExpression__Group_2__0 : rule__LidlTerminalExpression__Group_2__0__Impl rule__LidlTerminalExpression__Group_2__1 ;
    public final void rule__LidlTerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4228:1: ( rule__LidlTerminalExpression__Group_2__0__Impl rule__LidlTerminalExpression__Group_2__1 )
            // InternalLidl.g:4229:2: rule__LidlTerminalExpression__Group_2__0__Impl rule__LidlTerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_40);
            rule__LidlTerminalExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_2__0"


    // $ANTLR start "rule__LidlTerminalExpression__Group_2__0__Impl"
    // InternalLidl.g:4236:1: rule__LidlTerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__LidlTerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4240:1: ( ( () ) )
            // InternalLidl.g:4241:1: ( () )
            {
            // InternalLidl.g:4241:1: ( () )
            // InternalLidl.g:4242:2: ()
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getLidlBoolConstantAction_2_0()); 
            // InternalLidl.g:4243:2: ()
            // InternalLidl.g:4243:3: 
            {
            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getLidlBoolConstantAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_2__1"
    // InternalLidl.g:4251:1: rule__LidlTerminalExpression__Group_2__1 : rule__LidlTerminalExpression__Group_2__1__Impl ;
    public final void rule__LidlTerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4255:1: ( rule__LidlTerminalExpression__Group_2__1__Impl )
            // InternalLidl.g:4256:2: rule__LidlTerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_2__1"


    // $ANTLR start "rule__LidlTerminalExpression__Group_2__1__Impl"
    // InternalLidl.g:4262:1: rule__LidlTerminalExpression__Group_2__1__Impl : ( ( rule__LidlTerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__LidlTerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4266:1: ( ( ( rule__LidlTerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalLidl.g:4267:1: ( ( rule__LidlTerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalLidl.g:4267:1: ( ( rule__LidlTerminalExpression__ValueAssignment_2_1 ) )
            // InternalLidl.g:4268:2: ( rule__LidlTerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_2_1()); 
            // InternalLidl.g:4269:2: ( rule__LidlTerminalExpression__ValueAssignment_2_1 )
            // InternalLidl.g:4269:3: rule__LidlTerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_3__0"
    // InternalLidl.g:4278:1: rule__LidlTerminalExpression__Group_3__0 : rule__LidlTerminalExpression__Group_3__0__Impl rule__LidlTerminalExpression__Group_3__1 ;
    public final void rule__LidlTerminalExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4282:1: ( rule__LidlTerminalExpression__Group_3__0__Impl rule__LidlTerminalExpression__Group_3__1 )
            // InternalLidl.g:4283:2: rule__LidlTerminalExpression__Group_3__0__Impl rule__LidlTerminalExpression__Group_3__1
            {
            pushFollow(FOLLOW_41);
            rule__LidlTerminalExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_3__0"


    // $ANTLR start "rule__LidlTerminalExpression__Group_3__0__Impl"
    // InternalLidl.g:4290:1: rule__LidlTerminalExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__LidlTerminalExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4294:1: ( ( () ) )
            // InternalLidl.g:4295:1: ( () )
            {
            // InternalLidl.g:4295:1: ( () )
            // InternalLidl.g:4296:2: ()
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getLidlAvtivationConstantAction_3_0()); 
            // InternalLidl.g:4297:2: ()
            // InternalLidl.g:4297:3: 
            {
            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getLidlAvtivationConstantAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_3__0__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_3__1"
    // InternalLidl.g:4305:1: rule__LidlTerminalExpression__Group_3__1 : rule__LidlTerminalExpression__Group_3__1__Impl ;
    public final void rule__LidlTerminalExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4309:1: ( rule__LidlTerminalExpression__Group_3__1__Impl )
            // InternalLidl.g:4310:2: rule__LidlTerminalExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_3__1"


    // $ANTLR start "rule__LidlTerminalExpression__Group_3__1__Impl"
    // InternalLidl.g:4316:1: rule__LidlTerminalExpression__Group_3__1__Impl : ( ( rule__LidlTerminalExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__LidlTerminalExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4320:1: ( ( ( rule__LidlTerminalExpression__ValueAssignment_3_1 ) ) )
            // InternalLidl.g:4321:1: ( ( rule__LidlTerminalExpression__ValueAssignment_3_1 ) )
            {
            // InternalLidl.g:4321:1: ( ( rule__LidlTerminalExpression__ValueAssignment_3_1 ) )
            // InternalLidl.g:4322:2: ( rule__LidlTerminalExpression__ValueAssignment_3_1 )
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_3_1()); 
            // InternalLidl.g:4323:2: ( rule__LidlTerminalExpression__ValueAssignment_3_1 )
            // InternalLidl.g:4323:3: rule__LidlTerminalExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_3__1__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_4__0"
    // InternalLidl.g:4332:1: rule__LidlTerminalExpression__Group_4__0 : rule__LidlTerminalExpression__Group_4__0__Impl rule__LidlTerminalExpression__Group_4__1 ;
    public final void rule__LidlTerminalExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4336:1: ( rule__LidlTerminalExpression__Group_4__0__Impl rule__LidlTerminalExpression__Group_4__1 )
            // InternalLidl.g:4337:2: rule__LidlTerminalExpression__Group_4__0__Impl rule__LidlTerminalExpression__Group_4__1
            {
            pushFollow(FOLLOW_42);
            rule__LidlTerminalExpression__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_4__0"


    // $ANTLR start "rule__LidlTerminalExpression__Group_4__0__Impl"
    // InternalLidl.g:4344:1: rule__LidlTerminalExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__LidlTerminalExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4348:1: ( ( () ) )
            // InternalLidl.g:4349:1: ( () )
            {
            // InternalLidl.g:4349:1: ( () )
            // InternalLidl.g:4350:2: ()
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getLidlCompositionAction_4_0()); 
            // InternalLidl.g:4351:2: ()
            // InternalLidl.g:4351:3: 
            {
            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getLidlCompositionAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_4__0__Impl"


    // $ANTLR start "rule__LidlTerminalExpression__Group_4__1"
    // InternalLidl.g:4359:1: rule__LidlTerminalExpression__Group_4__1 : rule__LidlTerminalExpression__Group_4__1__Impl ;
    public final void rule__LidlTerminalExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4363:1: ( rule__LidlTerminalExpression__Group_4__1__Impl )
            // InternalLidl.g:4364:2: rule__LidlTerminalExpression__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_4__1"


    // $ANTLR start "rule__LidlTerminalExpression__Group_4__1__Impl"
    // InternalLidl.g:4370:1: rule__LidlTerminalExpression__Group_4__1__Impl : ( ( rule__LidlTerminalExpression__BodyAssignment_4_1 ) ) ;
    public final void rule__LidlTerminalExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4374:1: ( ( ( rule__LidlTerminalExpression__BodyAssignment_4_1 ) ) )
            // InternalLidl.g:4375:1: ( ( rule__LidlTerminalExpression__BodyAssignment_4_1 ) )
            {
            // InternalLidl.g:4375:1: ( ( rule__LidlTerminalExpression__BodyAssignment_4_1 ) )
            // InternalLidl.g:4376:2: ( rule__LidlTerminalExpression__BodyAssignment_4_1 )
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getBodyAssignment_4_1()); 
            // InternalLidl.g:4377:2: ( rule__LidlTerminalExpression__BodyAssignment_4_1 )
            // InternalLidl.g:4377:3: rule__LidlTerminalExpression__BodyAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__BodyAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getBodyAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__Group_4__1__Impl"


    // $ANTLR start "rule__LidlArray__Group__0"
    // InternalLidl.g:4386:1: rule__LidlArray__Group__0 : rule__LidlArray__Group__0__Impl rule__LidlArray__Group__1 ;
    public final void rule__LidlArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4390:1: ( rule__LidlArray__Group__0__Impl rule__LidlArray__Group__1 )
            // InternalLidl.g:4391:2: rule__LidlArray__Group__0__Impl rule__LidlArray__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__LidlArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group__0"


    // $ANTLR start "rule__LidlArray__Group__0__Impl"
    // InternalLidl.g:4398:1: rule__LidlArray__Group__0__Impl : ( () ) ;
    public final void rule__LidlArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4402:1: ( ( () ) )
            // InternalLidl.g:4403:1: ( () )
            {
            // InternalLidl.g:4403:1: ( () )
            // InternalLidl.g:4404:2: ()
            {
             before(grammarAccess.getLidlArrayAccess().getLidlExpressionAction_0()); 
            // InternalLidl.g:4405:2: ()
            // InternalLidl.g:4405:3: 
            {
            }

             after(grammarAccess.getLidlArrayAccess().getLidlExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group__0__Impl"


    // $ANTLR start "rule__LidlArray__Group__1"
    // InternalLidl.g:4413:1: rule__LidlArray__Group__1 : rule__LidlArray__Group__1__Impl rule__LidlArray__Group__2 ;
    public final void rule__LidlArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4417:1: ( rule__LidlArray__Group__1__Impl rule__LidlArray__Group__2 )
            // InternalLidl.g:4418:2: rule__LidlArray__Group__1__Impl rule__LidlArray__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__LidlArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group__1"


    // $ANTLR start "rule__LidlArray__Group__1__Impl"
    // InternalLidl.g:4425:1: rule__LidlArray__Group__1__Impl : ( '[' ) ;
    public final void rule__LidlArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4429:1: ( ( '[' ) )
            // InternalLidl.g:4430:1: ( '[' )
            {
            // InternalLidl.g:4430:1: ( '[' )
            // InternalLidl.g:4431:2: '['
            {
             before(grammarAccess.getLidlArrayAccess().getLeftSquareBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLidlArrayAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group__1__Impl"


    // $ANTLR start "rule__LidlArray__Group__2"
    // InternalLidl.g:4440:1: rule__LidlArray__Group__2 : rule__LidlArray__Group__2__Impl rule__LidlArray__Group__3 ;
    public final void rule__LidlArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4444:1: ( rule__LidlArray__Group__2__Impl rule__LidlArray__Group__3 )
            // InternalLidl.g:4445:2: rule__LidlArray__Group__2__Impl rule__LidlArray__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__LidlArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group__2"


    // $ANTLR start "rule__LidlArray__Group__2__Impl"
    // InternalLidl.g:4452:1: rule__LidlArray__Group__2__Impl : ( ( rule__LidlArray__Group_2__0 )* ) ;
    public final void rule__LidlArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4456:1: ( ( ( rule__LidlArray__Group_2__0 )* ) )
            // InternalLidl.g:4457:1: ( ( rule__LidlArray__Group_2__0 )* )
            {
            // InternalLidl.g:4457:1: ( ( rule__LidlArray__Group_2__0 )* )
            // InternalLidl.g:4458:2: ( rule__LidlArray__Group_2__0 )*
            {
             before(grammarAccess.getLidlArrayAccess().getGroup_2()); 
            // InternalLidl.g:4459:2: ( rule__LidlArray__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==32) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalLidl.g:4459:3: rule__LidlArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__LidlArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getLidlArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group__2__Impl"


    // $ANTLR start "rule__LidlArray__Group__3"
    // InternalLidl.g:4467:1: rule__LidlArray__Group__3 : rule__LidlArray__Group__3__Impl ;
    public final void rule__LidlArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4471:1: ( rule__LidlArray__Group__3__Impl )
            // InternalLidl.g:4472:2: rule__LidlArray__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlArray__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group__3"


    // $ANTLR start "rule__LidlArray__Group__3__Impl"
    // InternalLidl.g:4478:1: rule__LidlArray__Group__3__Impl : ( ']' ) ;
    public final void rule__LidlArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4482:1: ( ( ']' ) )
            // InternalLidl.g:4483:1: ( ']' )
            {
            // InternalLidl.g:4483:1: ( ']' )
            // InternalLidl.g:4484:2: ']'
            {
             before(grammarAccess.getLidlArrayAccess().getRightSquareBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLidlArrayAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group__3__Impl"


    // $ANTLR start "rule__LidlArray__Group_2__0"
    // InternalLidl.g:4494:1: rule__LidlArray__Group_2__0 : rule__LidlArray__Group_2__0__Impl rule__LidlArray__Group_2__1 ;
    public final void rule__LidlArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4498:1: ( rule__LidlArray__Group_2__0__Impl rule__LidlArray__Group_2__1 )
            // InternalLidl.g:4499:2: rule__LidlArray__Group_2__0__Impl rule__LidlArray__Group_2__1
            {
            pushFollow(FOLLOW_45);
            rule__LidlArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group_2__0"


    // $ANTLR start "rule__LidlArray__Group_2__0__Impl"
    // InternalLidl.g:4506:1: rule__LidlArray__Group_2__0__Impl : ( ( rule__LidlArray__ItemAssignment_2_0 ) ) ;
    public final void rule__LidlArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4510:1: ( ( ( rule__LidlArray__ItemAssignment_2_0 ) ) )
            // InternalLidl.g:4511:1: ( ( rule__LidlArray__ItemAssignment_2_0 ) )
            {
            // InternalLidl.g:4511:1: ( ( rule__LidlArray__ItemAssignment_2_0 ) )
            // InternalLidl.g:4512:2: ( rule__LidlArray__ItemAssignment_2_0 )
            {
             before(grammarAccess.getLidlArrayAccess().getItemAssignment_2_0()); 
            // InternalLidl.g:4513:2: ( rule__LidlArray__ItemAssignment_2_0 )
            // InternalLidl.g:4513:3: rule__LidlArray__ItemAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlArray__ItemAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlArrayAccess().getItemAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group_2__0__Impl"


    // $ANTLR start "rule__LidlArray__Group_2__1"
    // InternalLidl.g:4521:1: rule__LidlArray__Group_2__1 : rule__LidlArray__Group_2__1__Impl ;
    public final void rule__LidlArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4525:1: ( rule__LidlArray__Group_2__1__Impl )
            // InternalLidl.g:4526:2: rule__LidlArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlArray__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group_2__1"


    // $ANTLR start "rule__LidlArray__Group_2__1__Impl"
    // InternalLidl.g:4532:1: rule__LidlArray__Group_2__1__Impl : ( ( rule__LidlArray__Group_2_1__0 )* ) ;
    public final void rule__LidlArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4536:1: ( ( ( rule__LidlArray__Group_2_1__0 )* ) )
            // InternalLidl.g:4537:1: ( ( rule__LidlArray__Group_2_1__0 )* )
            {
            // InternalLidl.g:4537:1: ( ( rule__LidlArray__Group_2_1__0 )* )
            // InternalLidl.g:4538:2: ( rule__LidlArray__Group_2_1__0 )*
            {
             before(grammarAccess.getLidlArrayAccess().getGroup_2_1()); 
            // InternalLidl.g:4539:2: ( rule__LidlArray__Group_2_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==13) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLidl.g:4539:3: rule__LidlArray__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__LidlArray__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getLidlArrayAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group_2__1__Impl"


    // $ANTLR start "rule__LidlArray__Group_2_1__0"
    // InternalLidl.g:4548:1: rule__LidlArray__Group_2_1__0 : rule__LidlArray__Group_2_1__0__Impl rule__LidlArray__Group_2_1__1 ;
    public final void rule__LidlArray__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4552:1: ( rule__LidlArray__Group_2_1__0__Impl rule__LidlArray__Group_2_1__1 )
            // InternalLidl.g:4553:2: rule__LidlArray__Group_2_1__0__Impl rule__LidlArray__Group_2_1__1
            {
            pushFollow(FOLLOW_28);
            rule__LidlArray__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlArray__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group_2_1__0"


    // $ANTLR start "rule__LidlArray__Group_2_1__0__Impl"
    // InternalLidl.g:4560:1: rule__LidlArray__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__LidlArray__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4564:1: ( ( ',' ) )
            // InternalLidl.g:4565:1: ( ',' )
            {
            // InternalLidl.g:4565:1: ( ',' )
            // InternalLidl.g:4566:2: ','
            {
             before(grammarAccess.getLidlArrayAccess().getCommaKeyword_2_1_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLidlArrayAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group_2_1__0__Impl"


    // $ANTLR start "rule__LidlArray__Group_2_1__1"
    // InternalLidl.g:4575:1: rule__LidlArray__Group_2_1__1 : rule__LidlArray__Group_2_1__1__Impl ;
    public final void rule__LidlArray__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4579:1: ( rule__LidlArray__Group_2_1__1__Impl )
            // InternalLidl.g:4580:2: rule__LidlArray__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlArray__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group_2_1__1"


    // $ANTLR start "rule__LidlArray__Group_2_1__1__Impl"
    // InternalLidl.g:4586:1: rule__LidlArray__Group_2_1__1__Impl : ( ( rule__LidlArray__ItemAssignment_2_1_1 ) ) ;
    public final void rule__LidlArray__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4590:1: ( ( ( rule__LidlArray__ItemAssignment_2_1_1 ) ) )
            // InternalLidl.g:4591:1: ( ( rule__LidlArray__ItemAssignment_2_1_1 ) )
            {
            // InternalLidl.g:4591:1: ( ( rule__LidlArray__ItemAssignment_2_1_1 ) )
            // InternalLidl.g:4592:2: ( rule__LidlArray__ItemAssignment_2_1_1 )
            {
             before(grammarAccess.getLidlArrayAccess().getItemAssignment_2_1_1()); 
            // InternalLidl.g:4593:2: ( rule__LidlArray__ItemAssignment_2_1_1 )
            // InternalLidl.g:4593:3: rule__LidlArray__ItemAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlArray__ItemAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlArrayAccess().getItemAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__Group_2_1__1__Impl"


    // $ANTLR start "rule__LidlArrayItem__Group__0"
    // InternalLidl.g:4602:1: rule__LidlArrayItem__Group__0 : rule__LidlArrayItem__Group__0__Impl rule__LidlArrayItem__Group__1 ;
    public final void rule__LidlArrayItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4606:1: ( rule__LidlArrayItem__Group__0__Impl rule__LidlArrayItem__Group__1 )
            // InternalLidl.g:4607:2: rule__LidlArrayItem__Group__0__Impl rule__LidlArrayItem__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__LidlArrayItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlArrayItem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArrayItem__Group__0"


    // $ANTLR start "rule__LidlArrayItem__Group__0__Impl"
    // InternalLidl.g:4614:1: rule__LidlArrayItem__Group__0__Impl : ( '(' ) ;
    public final void rule__LidlArrayItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4618:1: ( ( '(' ) )
            // InternalLidl.g:4619:1: ( '(' )
            {
            // InternalLidl.g:4619:1: ( '(' )
            // InternalLidl.g:4620:2: '('
            {
             before(grammarAccess.getLidlArrayItemAccess().getLeftParenthesisKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLidlArrayItemAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArrayItem__Group__0__Impl"


    // $ANTLR start "rule__LidlArrayItem__Group__1"
    // InternalLidl.g:4629:1: rule__LidlArrayItem__Group__1 : rule__LidlArrayItem__Group__1__Impl rule__LidlArrayItem__Group__2 ;
    public final void rule__LidlArrayItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4633:1: ( rule__LidlArrayItem__Group__1__Impl rule__LidlArrayItem__Group__2 )
            // InternalLidl.g:4634:2: rule__LidlArrayItem__Group__1__Impl rule__LidlArrayItem__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__LidlArrayItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlArrayItem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArrayItem__Group__1"


    // $ANTLR start "rule__LidlArrayItem__Group__1__Impl"
    // InternalLidl.g:4641:1: rule__LidlArrayItem__Group__1__Impl : ( ( rule__LidlArrayItem__ValueAssignment_1 ) ) ;
    public final void rule__LidlArrayItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4645:1: ( ( ( rule__LidlArrayItem__ValueAssignment_1 ) ) )
            // InternalLidl.g:4646:1: ( ( rule__LidlArrayItem__ValueAssignment_1 ) )
            {
            // InternalLidl.g:4646:1: ( ( rule__LidlArrayItem__ValueAssignment_1 ) )
            // InternalLidl.g:4647:2: ( rule__LidlArrayItem__ValueAssignment_1 )
            {
             before(grammarAccess.getLidlArrayItemAccess().getValueAssignment_1()); 
            // InternalLidl.g:4648:2: ( rule__LidlArrayItem__ValueAssignment_1 )
            // InternalLidl.g:4648:3: rule__LidlArrayItem__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlArrayItem__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlArrayItemAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArrayItem__Group__1__Impl"


    // $ANTLR start "rule__LidlArrayItem__Group__2"
    // InternalLidl.g:4656:1: rule__LidlArrayItem__Group__2 : rule__LidlArrayItem__Group__2__Impl ;
    public final void rule__LidlArrayItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4660:1: ( rule__LidlArrayItem__Group__2__Impl )
            // InternalLidl.g:4661:2: rule__LidlArrayItem__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlArrayItem__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArrayItem__Group__2"


    // $ANTLR start "rule__LidlArrayItem__Group__2__Impl"
    // InternalLidl.g:4667:1: rule__LidlArrayItem__Group__2__Impl : ( ')' ) ;
    public final void rule__LidlArrayItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4671:1: ( ( ')' ) )
            // InternalLidl.g:4672:1: ( ')' )
            {
            // InternalLidl.g:4672:1: ( ')' )
            // InternalLidl.g:4673:2: ')'
            {
             before(grammarAccess.getLidlArrayItemAccess().getRightParenthesisKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLidlArrayItemAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArrayItem__Group__2__Impl"


    // $ANTLR start "rule__LidlCompositionElement__Group__0"
    // InternalLidl.g:4683:1: rule__LidlCompositionElement__Group__0 : rule__LidlCompositionElement__Group__0__Impl rule__LidlCompositionElement__Group__1 ;
    public final void rule__LidlCompositionElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4687:1: ( rule__LidlCompositionElement__Group__0__Impl rule__LidlCompositionElement__Group__1 )
            // InternalLidl.g:4688:2: rule__LidlCompositionElement__Group__0__Impl rule__LidlCompositionElement__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__LidlCompositionElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlCompositionElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__0"


    // $ANTLR start "rule__LidlCompositionElement__Group__0__Impl"
    // InternalLidl.g:4695:1: rule__LidlCompositionElement__Group__0__Impl : ( ( rule__LidlCompositionElement__ParamAssignment_0 ) ) ;
    public final void rule__LidlCompositionElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4699:1: ( ( ( rule__LidlCompositionElement__ParamAssignment_0 ) ) )
            // InternalLidl.g:4700:1: ( ( rule__LidlCompositionElement__ParamAssignment_0 ) )
            {
            // InternalLidl.g:4700:1: ( ( rule__LidlCompositionElement__ParamAssignment_0 ) )
            // InternalLidl.g:4701:2: ( rule__LidlCompositionElement__ParamAssignment_0 )
            {
             before(grammarAccess.getLidlCompositionElementAccess().getParamAssignment_0()); 
            // InternalLidl.g:4702:2: ( rule__LidlCompositionElement__ParamAssignment_0 )
            // InternalLidl.g:4702:3: rule__LidlCompositionElement__ParamAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlCompositionElement__ParamAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlCompositionElementAccess().getParamAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__0__Impl"


    // $ANTLR start "rule__LidlCompositionElement__Group__1"
    // InternalLidl.g:4710:1: rule__LidlCompositionElement__Group__1 : rule__LidlCompositionElement__Group__1__Impl rule__LidlCompositionElement__Group__2 ;
    public final void rule__LidlCompositionElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4714:1: ( rule__LidlCompositionElement__Group__1__Impl rule__LidlCompositionElement__Group__2 )
            // InternalLidl.g:4715:2: rule__LidlCompositionElement__Group__1__Impl rule__LidlCompositionElement__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__LidlCompositionElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlCompositionElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__1"


    // $ANTLR start "rule__LidlCompositionElement__Group__1__Impl"
    // InternalLidl.g:4722:1: rule__LidlCompositionElement__Group__1__Impl : ( ':' ) ;
    public final void rule__LidlCompositionElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4726:1: ( ( ':' ) )
            // InternalLidl.g:4727:1: ( ':' )
            {
            // InternalLidl.g:4727:1: ( ':' )
            // InternalLidl.g:4728:2: ':'
            {
             before(grammarAccess.getLidlCompositionElementAccess().getColonKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLidlCompositionElementAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__1__Impl"


    // $ANTLR start "rule__LidlCompositionElement__Group__2"
    // InternalLidl.g:4737:1: rule__LidlCompositionElement__Group__2 : rule__LidlCompositionElement__Group__2__Impl rule__LidlCompositionElement__Group__3 ;
    public final void rule__LidlCompositionElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4741:1: ( rule__LidlCompositionElement__Group__2__Impl rule__LidlCompositionElement__Group__3 )
            // InternalLidl.g:4742:2: rule__LidlCompositionElement__Group__2__Impl rule__LidlCompositionElement__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__LidlCompositionElement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlCompositionElement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__2"


    // $ANTLR start "rule__LidlCompositionElement__Group__2__Impl"
    // InternalLidl.g:4749:1: rule__LidlCompositionElement__Group__2__Impl : ( '(' ) ;
    public final void rule__LidlCompositionElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4753:1: ( ( '(' ) )
            // InternalLidl.g:4754:1: ( '(' )
            {
            // InternalLidl.g:4754:1: ( '(' )
            // InternalLidl.g:4755:2: '('
            {
             before(grammarAccess.getLidlCompositionElementAccess().getLeftParenthesisKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLidlCompositionElementAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__2__Impl"


    // $ANTLR start "rule__LidlCompositionElement__Group__3"
    // InternalLidl.g:4764:1: rule__LidlCompositionElement__Group__3 : rule__LidlCompositionElement__Group__3__Impl rule__LidlCompositionElement__Group__4 ;
    public final void rule__LidlCompositionElement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4768:1: ( rule__LidlCompositionElement__Group__3__Impl rule__LidlCompositionElement__Group__4 )
            // InternalLidl.g:4769:2: rule__LidlCompositionElement__Group__3__Impl rule__LidlCompositionElement__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__LidlCompositionElement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlCompositionElement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__3"


    // $ANTLR start "rule__LidlCompositionElement__Group__3__Impl"
    // InternalLidl.g:4776:1: rule__LidlCompositionElement__Group__3__Impl : ( ( rule__LidlCompositionElement__ValueAssignment_3 ) ) ;
    public final void rule__LidlCompositionElement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4780:1: ( ( ( rule__LidlCompositionElement__ValueAssignment_3 ) ) )
            // InternalLidl.g:4781:1: ( ( rule__LidlCompositionElement__ValueAssignment_3 ) )
            {
            // InternalLidl.g:4781:1: ( ( rule__LidlCompositionElement__ValueAssignment_3 ) )
            // InternalLidl.g:4782:2: ( rule__LidlCompositionElement__ValueAssignment_3 )
            {
             before(grammarAccess.getLidlCompositionElementAccess().getValueAssignment_3()); 
            // InternalLidl.g:4783:2: ( rule__LidlCompositionElement__ValueAssignment_3 )
            // InternalLidl.g:4783:3: rule__LidlCompositionElement__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LidlCompositionElement__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLidlCompositionElementAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__3__Impl"


    // $ANTLR start "rule__LidlCompositionElement__Group__4"
    // InternalLidl.g:4791:1: rule__LidlCompositionElement__Group__4 : rule__LidlCompositionElement__Group__4__Impl ;
    public final void rule__LidlCompositionElement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4795:1: ( rule__LidlCompositionElement__Group__4__Impl )
            // InternalLidl.g:4796:2: rule__LidlCompositionElement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlCompositionElement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__4"


    // $ANTLR start "rule__LidlCompositionElement__Group__4__Impl"
    // InternalLidl.g:4802:1: rule__LidlCompositionElement__Group__4__Impl : ( ')' ) ;
    public final void rule__LidlCompositionElement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4806:1: ( ( ')' ) )
            // InternalLidl.g:4807:1: ( ')' )
            {
            // InternalLidl.g:4807:1: ( ')' )
            // InternalLidl.g:4808:2: ')'
            {
             before(grammarAccess.getLidlCompositionElementAccess().getRightParenthesisKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLidlCompositionElementAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__Group__4__Impl"


    // $ANTLR start "rule__LidlComposition__Group__0"
    // InternalLidl.g:4818:1: rule__LidlComposition__Group__0 : rule__LidlComposition__Group__0__Impl rule__LidlComposition__Group__1 ;
    public final void rule__LidlComposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4822:1: ( rule__LidlComposition__Group__0__Impl rule__LidlComposition__Group__1 )
            // InternalLidl.g:4823:2: rule__LidlComposition__Group__0__Impl rule__LidlComposition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LidlComposition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlComposition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group__0"


    // $ANTLR start "rule__LidlComposition__Group__0__Impl"
    // InternalLidl.g:4830:1: rule__LidlComposition__Group__0__Impl : ( '{' ) ;
    public final void rule__LidlComposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4834:1: ( ( '{' ) )
            // InternalLidl.g:4835:1: ( '{' )
            {
            // InternalLidl.g:4835:1: ( '{' )
            // InternalLidl.g:4836:2: '{'
            {
             before(grammarAccess.getLidlCompositionAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLidlCompositionAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group__0__Impl"


    // $ANTLR start "rule__LidlComposition__Group__1"
    // InternalLidl.g:4845:1: rule__LidlComposition__Group__1 : rule__LidlComposition__Group__1__Impl rule__LidlComposition__Group__2 ;
    public final void rule__LidlComposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4849:1: ( rule__LidlComposition__Group__1__Impl rule__LidlComposition__Group__2 )
            // InternalLidl.g:4850:2: rule__LidlComposition__Group__1__Impl rule__LidlComposition__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__LidlComposition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlComposition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group__1"


    // $ANTLR start "rule__LidlComposition__Group__1__Impl"
    // InternalLidl.g:4857:1: rule__LidlComposition__Group__1__Impl : ( ( rule__LidlComposition__ItemsAssignment_1 ) ) ;
    public final void rule__LidlComposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4861:1: ( ( ( rule__LidlComposition__ItemsAssignment_1 ) ) )
            // InternalLidl.g:4862:1: ( ( rule__LidlComposition__ItemsAssignment_1 ) )
            {
            // InternalLidl.g:4862:1: ( ( rule__LidlComposition__ItemsAssignment_1 ) )
            // InternalLidl.g:4863:2: ( rule__LidlComposition__ItemsAssignment_1 )
            {
             before(grammarAccess.getLidlCompositionAccess().getItemsAssignment_1()); 
            // InternalLidl.g:4864:2: ( rule__LidlComposition__ItemsAssignment_1 )
            // InternalLidl.g:4864:3: rule__LidlComposition__ItemsAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlComposition__ItemsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlCompositionAccess().getItemsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group__1__Impl"


    // $ANTLR start "rule__LidlComposition__Group__2"
    // InternalLidl.g:4872:1: rule__LidlComposition__Group__2 : rule__LidlComposition__Group__2__Impl rule__LidlComposition__Group__3 ;
    public final void rule__LidlComposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4876:1: ( rule__LidlComposition__Group__2__Impl rule__LidlComposition__Group__3 )
            // InternalLidl.g:4877:2: rule__LidlComposition__Group__2__Impl rule__LidlComposition__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__LidlComposition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlComposition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group__2"


    // $ANTLR start "rule__LidlComposition__Group__2__Impl"
    // InternalLidl.g:4884:1: rule__LidlComposition__Group__2__Impl : ( ( rule__LidlComposition__Group_2__0 )* ) ;
    public final void rule__LidlComposition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4888:1: ( ( ( rule__LidlComposition__Group_2__0 )* ) )
            // InternalLidl.g:4889:1: ( ( rule__LidlComposition__Group_2__0 )* )
            {
            // InternalLidl.g:4889:1: ( ( rule__LidlComposition__Group_2__0 )* )
            // InternalLidl.g:4890:2: ( rule__LidlComposition__Group_2__0 )*
            {
             before(grammarAccess.getLidlCompositionAccess().getGroup_2()); 
            // InternalLidl.g:4891:2: ( rule__LidlComposition__Group_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==13) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLidl.g:4891:3: rule__LidlComposition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__LidlComposition__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getLidlCompositionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group__2__Impl"


    // $ANTLR start "rule__LidlComposition__Group__3"
    // InternalLidl.g:4899:1: rule__LidlComposition__Group__3 : rule__LidlComposition__Group__3__Impl ;
    public final void rule__LidlComposition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4903:1: ( rule__LidlComposition__Group__3__Impl )
            // InternalLidl.g:4904:2: rule__LidlComposition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlComposition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group__3"


    // $ANTLR start "rule__LidlComposition__Group__3__Impl"
    // InternalLidl.g:4910:1: rule__LidlComposition__Group__3__Impl : ( '}' ) ;
    public final void rule__LidlComposition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4914:1: ( ( '}' ) )
            // InternalLidl.g:4915:1: ( '}' )
            {
            // InternalLidl.g:4915:1: ( '}' )
            // InternalLidl.g:4916:2: '}'
            {
             before(grammarAccess.getLidlCompositionAccess().getRightCurlyBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getLidlCompositionAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group__3__Impl"


    // $ANTLR start "rule__LidlComposition__Group_2__0"
    // InternalLidl.g:4926:1: rule__LidlComposition__Group_2__0 : rule__LidlComposition__Group_2__0__Impl rule__LidlComposition__Group_2__1 ;
    public final void rule__LidlComposition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4930:1: ( rule__LidlComposition__Group_2__0__Impl rule__LidlComposition__Group_2__1 )
            // InternalLidl.g:4931:2: rule__LidlComposition__Group_2__0__Impl rule__LidlComposition__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__LidlComposition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LidlComposition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group_2__0"


    // $ANTLR start "rule__LidlComposition__Group_2__0__Impl"
    // InternalLidl.g:4938:1: rule__LidlComposition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__LidlComposition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4942:1: ( ( ',' ) )
            // InternalLidl.g:4943:1: ( ',' )
            {
            // InternalLidl.g:4943:1: ( ',' )
            // InternalLidl.g:4944:2: ','
            {
             before(grammarAccess.getLidlCompositionAccess().getCommaKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getLidlCompositionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group_2__0__Impl"


    // $ANTLR start "rule__LidlComposition__Group_2__1"
    // InternalLidl.g:4953:1: rule__LidlComposition__Group_2__1 : rule__LidlComposition__Group_2__1__Impl ;
    public final void rule__LidlComposition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4957:1: ( rule__LidlComposition__Group_2__1__Impl )
            // InternalLidl.g:4958:2: rule__LidlComposition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LidlComposition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group_2__1"


    // $ANTLR start "rule__LidlComposition__Group_2__1__Impl"
    // InternalLidl.g:4964:1: rule__LidlComposition__Group_2__1__Impl : ( ( rule__LidlComposition__ItemsAssignment_2_1 ) ) ;
    public final void rule__LidlComposition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4968:1: ( ( ( rule__LidlComposition__ItemsAssignment_2_1 ) ) )
            // InternalLidl.g:4969:1: ( ( rule__LidlComposition__ItemsAssignment_2_1 ) )
            {
            // InternalLidl.g:4969:1: ( ( rule__LidlComposition__ItemsAssignment_2_1 ) )
            // InternalLidl.g:4970:2: ( rule__LidlComposition__ItemsAssignment_2_1 )
            {
             before(grammarAccess.getLidlCompositionAccess().getItemsAssignment_2_1()); 
            // InternalLidl.g:4971:2: ( rule__LidlComposition__ItemsAssignment_2_1 )
            // InternalLidl.g:4971:3: rule__LidlComposition__ItemsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LidlComposition__ItemsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLidlCompositionAccess().getItemsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__Group_2__1__Impl"


    // $ANTLR start "rule__LidlProgram__PackAssignment_0_0"
    // InternalLidl.g:4980:1: rule__LidlProgram__PackAssignment_0_0 : ( ( 'package' ) ) ;
    public final void rule__LidlProgram__PackAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:4984:1: ( ( ( 'package' ) ) )
            // InternalLidl.g:4985:2: ( ( 'package' ) )
            {
            // InternalLidl.g:4985:2: ( ( 'package' ) )
            // InternalLidl.g:4986:3: ( 'package' )
            {
             before(grammarAccess.getLidlProgramAccess().getPackPackageKeyword_0_0_0()); 
            // InternalLidl.g:4987:3: ( 'package' )
            // InternalLidl.g:4988:4: 'package'
            {
             before(grammarAccess.getLidlProgramAccess().getPackPackageKeyword_0_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getLidlProgramAccess().getPackPackageKeyword_0_0_0()); 

            }

             after(grammarAccess.getLidlProgramAccess().getPackPackageKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__PackAssignment_0_0"


    // $ANTLR start "rule__LidlProgram__NameAssignment_0_1"
    // InternalLidl.g:4999:1: rule__LidlProgram__NameAssignment_0_1 : ( ruleQualifiedName ) ;
    public final void rule__LidlProgram__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5003:1: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5004:2: ( ruleQualifiedName )
            {
            // InternalLidl.g:5004:2: ( ruleQualifiedName )
            // InternalLidl.g:5005:3: ruleQualifiedName
            {
             before(grammarAccess.getLidlProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLidlProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__NameAssignment_0_1"


    // $ANTLR start "rule__LidlProgram__ImportsAssignment_1"
    // InternalLidl.g:5014:1: rule__LidlProgram__ImportsAssignment_1 : ( ruleLidlImport ) ;
    public final void rule__LidlProgram__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5018:1: ( ( ruleLidlImport ) )
            // InternalLidl.g:5019:2: ( ruleLidlImport )
            {
            // InternalLidl.g:5019:2: ( ruleLidlImport )
            // InternalLidl.g:5020:3: ruleLidlImport
            {
             before(grammarAccess.getLidlProgramAccess().getImportsLidlImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlImport();

            state._fsp--;

             after(grammarAccess.getLidlProgramAccess().getImportsLidlImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__ImportsAssignment_1"


    // $ANTLR start "rule__LidlProgram__DefinitionsAssignment_2"
    // InternalLidl.g:5029:1: rule__LidlProgram__DefinitionsAssignment_2 : ( ruleLidlDefinition ) ;
    public final void rule__LidlProgram__DefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5033:1: ( ( ruleLidlDefinition ) )
            // InternalLidl.g:5034:2: ( ruleLidlDefinition )
            {
            // InternalLidl.g:5034:2: ( ruleLidlDefinition )
            // InternalLidl.g:5035:3: ruleLidlDefinition
            {
             before(grammarAccess.getLidlProgramAccess().getDefinitionsLidlDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlDefinition();

            state._fsp--;

             after(grammarAccess.getLidlProgramAccess().getDefinitionsLidlDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlProgram__DefinitionsAssignment_2"


    // $ANTLR start "rule__LidlImport__ImportedNamespaceAssignment_1"
    // InternalLidl.g:5044:1: rule__LidlImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__LidlImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5048:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalLidl.g:5049:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalLidl.g:5049:2: ( ruleQualifiedNameWithWildcard )
            // InternalLidl.g:5050:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getLidlImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getLidlImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__LidlData__NameAssignment_1"
    // InternalLidl.g:5059:1: rule__LidlData__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LidlData__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5063:1: ( ( RULE_ID ) )
            // InternalLidl.g:5064:2: ( RULE_ID )
            {
            // InternalLidl.g:5064:2: ( RULE_ID )
            // InternalLidl.g:5065:3: RULE_ID
            {
             before(grammarAccess.getLidlDataAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLidlDataAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__NameAssignment_1"


    // $ANTLR start "rule__LidlData__NestedAssignment_2_0"
    // InternalLidl.g:5074:1: rule__LidlData__NestedAssignment_2_0 : ( ( 'with' ) ) ;
    public final void rule__LidlData__NestedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5078:1: ( ( ( 'with' ) ) )
            // InternalLidl.g:5079:2: ( ( 'with' ) )
            {
            // InternalLidl.g:5079:2: ( ( 'with' ) )
            // InternalLidl.g:5080:3: ( 'with' )
            {
             before(grammarAccess.getLidlDataAccess().getNestedWithKeyword_2_0_0()); 
            // InternalLidl.g:5081:3: ( 'with' )
            // InternalLidl.g:5082:4: 'with'
            {
             before(grammarAccess.getLidlDataAccess().getNestedWithKeyword_2_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLidlDataAccess().getNestedWithKeyword_2_0_0()); 

            }

             after(grammarAccess.getLidlDataAccess().getNestedWithKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__NestedAssignment_2_0"


    // $ANTLR start "rule__LidlData__NestedDefAssignment_2_1"
    // InternalLidl.g:5093:1: rule__LidlData__NestedDefAssignment_2_1 : ( ruleLidlData ) ;
    public final void rule__LidlData__NestedDefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5097:1: ( ( ruleLidlData ) )
            // InternalLidl.g:5098:2: ( ruleLidlData )
            {
            // InternalLidl.g:5098:2: ( ruleLidlData )
            // InternalLidl.g:5099:3: ruleLidlData
            {
             before(grammarAccess.getLidlDataAccess().getNestedDefLidlDataParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlData();

            state._fsp--;

             after(grammarAccess.getLidlDataAccess().getNestedDefLidlDataParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__NestedDefAssignment_2_1"


    // $ANTLR start "rule__LidlData__DefinitionAssignment_4_0"
    // InternalLidl.g:5108:1: rule__LidlData__DefinitionAssignment_4_0 : ( ruleLidlDataType ) ;
    public final void rule__LidlData__DefinitionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5112:1: ( ( ruleLidlDataType ) )
            // InternalLidl.g:5113:2: ( ruleLidlDataType )
            {
            // InternalLidl.g:5113:2: ( ruleLidlDataType )
            // InternalLidl.g:5114:3: ruleLidlDataType
            {
             before(grammarAccess.getLidlDataAccess().getDefinitionLidlDataTypeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlDataType();

            state._fsp--;

             after(grammarAccess.getLidlDataAccess().getDefinitionLidlDataTypeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__DefinitionAssignment_4_0"


    // $ANTLR start "rule__LidlData__DefinedAssignment_4_1"
    // InternalLidl.g:5123:1: rule__LidlData__DefinedAssignment_4_1 : ( ( 'Undefined' ) ) ;
    public final void rule__LidlData__DefinedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5127:1: ( ( ( 'Undefined' ) ) )
            // InternalLidl.g:5128:2: ( ( 'Undefined' ) )
            {
            // InternalLidl.g:5128:2: ( ( 'Undefined' ) )
            // InternalLidl.g:5129:3: ( 'Undefined' )
            {
             before(grammarAccess.getLidlDataAccess().getDefinedUndefinedKeyword_4_1_0()); 
            // InternalLidl.g:5130:3: ( 'Undefined' )
            // InternalLidl.g:5131:4: 'Undefined'
            {
             before(grammarAccess.getLidlDataAccess().getDefinedUndefinedKeyword_4_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLidlDataAccess().getDefinedUndefinedKeyword_4_1_0()); 

            }

             after(grammarAccess.getLidlDataAccess().getDefinedUndefinedKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlData__DefinedAssignment_4_1"


    // $ANTLR start "rule__CompositeDataType__ItemsAssignment_2"
    // InternalLidl.g:5142:1: rule__CompositeDataType__ItemsAssignment_2 : ( ruleCompositeDataTypeElement ) ;
    public final void rule__CompositeDataType__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5146:1: ( ( ruleCompositeDataTypeElement ) )
            // InternalLidl.g:5147:2: ( ruleCompositeDataTypeElement )
            {
            // InternalLidl.g:5147:2: ( ruleCompositeDataTypeElement )
            // InternalLidl.g:5148:3: ruleCompositeDataTypeElement
            {
             before(grammarAccess.getCompositeDataTypeAccess().getItemsCompositeDataTypeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositeDataTypeElement();

            state._fsp--;

             after(grammarAccess.getCompositeDataTypeAccess().getItemsCompositeDataTypeElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__ItemsAssignment_2"


    // $ANTLR start "rule__CompositeDataType__ItemsAssignment_3_1"
    // InternalLidl.g:5157:1: rule__CompositeDataType__ItemsAssignment_3_1 : ( ruleCompositeDataTypeElement ) ;
    public final void rule__CompositeDataType__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5161:1: ( ( ruleCompositeDataTypeElement ) )
            // InternalLidl.g:5162:2: ( ruleCompositeDataTypeElement )
            {
            // InternalLidl.g:5162:2: ( ruleCompositeDataTypeElement )
            // InternalLidl.g:5163:3: ruleCompositeDataTypeElement
            {
             before(grammarAccess.getCompositeDataTypeAccess().getItemsCompositeDataTypeElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositeDataTypeElement();

            state._fsp--;

             after(grammarAccess.getCompositeDataTypeAccess().getItemsCompositeDataTypeElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataType__ItemsAssignment_3_1"


    // $ANTLR start "rule__RefDataType__ItemsAssignment_1"
    // InternalLidl.g:5172:1: rule__RefDataType__ItemsAssignment_1 : ( ruleRefDataTypeElement ) ;
    public final void rule__RefDataType__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5176:1: ( ( ruleRefDataTypeElement ) )
            // InternalLidl.g:5177:2: ( ruleRefDataTypeElement )
            {
            // InternalLidl.g:5177:2: ( ruleRefDataTypeElement )
            // InternalLidl.g:5178:3: ruleRefDataTypeElement
            {
             before(grammarAccess.getRefDataTypeAccess().getItemsRefDataTypeElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRefDataTypeElement();

            state._fsp--;

             after(grammarAccess.getRefDataTypeAccess().getItemsRefDataTypeElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataType__ItemsAssignment_1"


    // $ANTLR start "rule__CompositeDataTypeElement__NameAssignment_1"
    // InternalLidl.g:5187:1: rule__CompositeDataTypeElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeDataTypeElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5191:1: ( ( RULE_ID ) )
            // InternalLidl.g:5192:2: ( RULE_ID )
            {
            // InternalLidl.g:5192:2: ( RULE_ID )
            // InternalLidl.g:5193:3: RULE_ID
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeDataTypeElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__NameAssignment_1"


    // $ANTLR start "rule__CompositeDataTypeElement__TypeAssignment_3_0"
    // InternalLidl.g:5202:1: rule__CompositeDataTypeElement__TypeAssignment_3_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CompositeDataTypeElement__TypeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5206:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:5207:2: ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:5207:2: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5208:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataCrossReference_3_0_0()); 
            // InternalLidl.g:5209:3: ( ruleQualifiedName )
            // InternalLidl.g:5210:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_3_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_3_0_0_1()); 

            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataCrossReference_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__TypeAssignment_3_0"


    // $ANTLR start "rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0"
    // InternalLidl.g:5221:1: rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0 : ( ( '[' ) ) ;
    public final void rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5225:1: ( ( ( '[' ) ) )
            // InternalLidl.g:5226:2: ( ( '[' ) )
            {
            // InternalLidl.g:5226:2: ( ( '[' ) )
            // InternalLidl.g:5227:3: ( '[' )
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_3_1_0_0()); 
            // InternalLidl.g:5228:3: ( '[' )
            // InternalLidl.g:5229:4: '['
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_3_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCompositeDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_3_1_0_0()); 

            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_3_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__IsArrayAssignment_3_1_0"


    // $ANTLR start "rule__CompositeDataTypeElement__TypeAssignment_3_1_1"
    // InternalLidl.g:5240:1: rule__CompositeDataTypeElement__TypeAssignment_3_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CompositeDataTypeElement__TypeAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5244:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:5245:2: ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:5245:2: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5246:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataCrossReference_3_1_1_0()); 
            // InternalLidl.g:5247:3: ( ruleQualifiedName )
            // InternalLidl.g:5248:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_3_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_3_1_1_0_1()); 

            }

             after(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataCrossReference_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeDataTypeElement__TypeAssignment_3_1_1"


    // $ANTLR start "rule__RefDataTypeElement__TypeAssignment_0_1"
    // InternalLidl.g:5259:1: rule__RefDataTypeElement__TypeAssignment_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RefDataTypeElement__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5263:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:5264:2: ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:5264:2: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5265:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataCrossReference_0_1_0()); 
            // InternalLidl.g:5266:3: ( ruleQualifiedName )
            // InternalLidl.g:5267:4: ruleQualifiedName
            {
             before(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__TypeAssignment_0_1"


    // $ANTLR start "rule__RefDataTypeElement__IsArrayAssignment_1_0"
    // InternalLidl.g:5278:1: rule__RefDataTypeElement__IsArrayAssignment_1_0 : ( ( '[' ) ) ;
    public final void rule__RefDataTypeElement__IsArrayAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5282:1: ( ( ( '[' ) ) )
            // InternalLidl.g:5283:2: ( ( '[' ) )
            {
            // InternalLidl.g:5283:2: ( ( '[' ) )
            // InternalLidl.g:5284:3: ( '[' )
            {
             before(grammarAccess.getRefDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_1_0_0()); 
            // InternalLidl.g:5285:3: ( '[' )
            // InternalLidl.g:5286:4: '['
            {
             before(grammarAccess.getRefDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRefDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_1_0_0()); 

            }

             after(grammarAccess.getRefDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__IsArrayAssignment_1_0"


    // $ANTLR start "rule__RefDataTypeElement__TypeAssignment_1_1"
    // InternalLidl.g:5297:1: rule__RefDataTypeElement__TypeAssignment_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RefDataTypeElement__TypeAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5301:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:5302:2: ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:5302:2: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5303:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataCrossReference_1_1_0()); 
            // InternalLidl.g:5304:3: ( ruleQualifiedName )
            // InternalLidl.g:5305:4: ruleQualifiedName
            {
             before(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_1_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefDataTypeElement__TypeAssignment_1_1"


    // $ANTLR start "rule__LidlInterface__NameAssignment_1"
    // InternalLidl.g:5316:1: rule__LidlInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LidlInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5320:1: ( ( RULE_ID ) )
            // InternalLidl.g:5321:2: ( RULE_ID )
            {
            // InternalLidl.g:5321:2: ( RULE_ID )
            // InternalLidl.g:5322:3: RULE_ID
            {
             before(grammarAccess.getLidlInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLidlInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__NameAssignment_1"


    // $ANTLR start "rule__LidlInterface__NestedAssignment_2_0"
    // InternalLidl.g:5331:1: rule__LidlInterface__NestedAssignment_2_0 : ( ( 'with' ) ) ;
    public final void rule__LidlInterface__NestedAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5335:1: ( ( ( 'with' ) ) )
            // InternalLidl.g:5336:2: ( ( 'with' ) )
            {
            // InternalLidl.g:5336:2: ( ( 'with' ) )
            // InternalLidl.g:5337:3: ( 'with' )
            {
             before(grammarAccess.getLidlInterfaceAccess().getNestedWithKeyword_2_0_0()); 
            // InternalLidl.g:5338:3: ( 'with' )
            // InternalLidl.g:5339:4: 'with'
            {
             before(grammarAccess.getLidlInterfaceAccess().getNestedWithKeyword_2_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLidlInterfaceAccess().getNestedWithKeyword_2_0_0()); 

            }

             after(grammarAccess.getLidlInterfaceAccess().getNestedWithKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__NestedAssignment_2_0"


    // $ANTLR start "rule__LidlInterface__NestedDefAssignment_2_1"
    // InternalLidl.g:5350:1: rule__LidlInterface__NestedDefAssignment_2_1 : ( ruleLidlInterface ) ;
    public final void rule__LidlInterface__NestedDefAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5354:1: ( ( ruleLidlInterface ) )
            // InternalLidl.g:5355:2: ( ruleLidlInterface )
            {
            // InternalLidl.g:5355:2: ( ruleLidlInterface )
            // InternalLidl.g:5356:3: ruleLidlInterface
            {
             before(grammarAccess.getLidlInterfaceAccess().getNestedDefLidlInterfaceParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlInterface();

            state._fsp--;

             after(grammarAccess.getLidlInterfaceAccess().getNestedDefLidlInterfaceParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__NestedDefAssignment_2_1"


    // $ANTLR start "rule__LidlInterface__DefinitionAssignment_4_0"
    // InternalLidl.g:5365:1: rule__LidlInterface__DefinitionAssignment_4_0 : ( ruleLidlInterfaceType ) ;
    public final void rule__LidlInterface__DefinitionAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5369:1: ( ( ruleLidlInterfaceType ) )
            // InternalLidl.g:5370:2: ( ruleLidlInterfaceType )
            {
            // InternalLidl.g:5370:2: ( ruleLidlInterfaceType )
            // InternalLidl.g:5371:3: ruleLidlInterfaceType
            {
             before(grammarAccess.getLidlInterfaceAccess().getDefinitionLidlInterfaceTypeParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlInterfaceType();

            state._fsp--;

             after(grammarAccess.getLidlInterfaceAccess().getDefinitionLidlInterfaceTypeParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__DefinitionAssignment_4_0"


    // $ANTLR start "rule__LidlInterface__DefinedAssignment_4_1"
    // InternalLidl.g:5380:1: rule__LidlInterface__DefinedAssignment_4_1 : ( ( 'Undefined' ) ) ;
    public final void rule__LidlInterface__DefinedAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5384:1: ( ( ( 'Undefined' ) ) )
            // InternalLidl.g:5385:2: ( ( 'Undefined' ) )
            {
            // InternalLidl.g:5385:2: ( ( 'Undefined' ) )
            // InternalLidl.g:5386:3: ( 'Undefined' )
            {
             before(grammarAccess.getLidlInterfaceAccess().getDefinedUndefinedKeyword_4_1_0()); 
            // InternalLidl.g:5387:3: ( 'Undefined' )
            // InternalLidl.g:5388:4: 'Undefined'
            {
             before(grammarAccess.getLidlInterfaceAccess().getDefinedUndefinedKeyword_4_1_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getLidlInterfaceAccess().getDefinedUndefinedKeyword_4_1_0()); 

            }

             after(grammarAccess.getLidlInterfaceAccess().getDefinedUndefinedKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterface__DefinedAssignment_4_1"


    // $ANTLR start "rule__LidlInterfaceType__ConjugateAssignment_2_1"
    // InternalLidl.g:5399:1: rule__LidlInterfaceType__ConjugateAssignment_2_1 : ( ( '\\'' ) ) ;
    public final void rule__LidlInterfaceType__ConjugateAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5403:1: ( ( ( '\\'' ) ) )
            // InternalLidl.g:5404:2: ( ( '\\'' ) )
            {
            // InternalLidl.g:5404:2: ( ( '\\'' ) )
            // InternalLidl.g:5405:3: ( '\\'' )
            {
             before(grammarAccess.getLidlInterfaceTypeAccess().getConjugateApostropheKeyword_2_1_0()); 
            // InternalLidl.g:5406:3: ( '\\'' )
            // InternalLidl.g:5407:4: '\\''
            {
             before(grammarAccess.getLidlInterfaceTypeAccess().getConjugateApostropheKeyword_2_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLidlInterfaceTypeAccess().getConjugateApostropheKeyword_2_1_0()); 

            }

             after(grammarAccess.getLidlInterfaceTypeAccess().getConjugateApostropheKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInterfaceType__ConjugateAssignment_2_1"


    // $ANTLR start "rule__AtomInterfaceTypeElement__TypeAssignment_1"
    // InternalLidl.g:5418:1: rule__AtomInterfaceTypeElement__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AtomInterfaceTypeElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5422:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:5423:2: ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:5423:2: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5424:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeLidlDataCrossReference_1_0()); 
            // InternalLidl.g:5425:3: ( ruleQualifiedName )
            // InternalLidl.g:5426:4: ruleQualifiedName
            {
             before(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeLidlDataCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceTypeElement__TypeAssignment_1"


    // $ANTLR start "rule__AtomInterfaceTypeElement__DirectionAssignment_2"
    // InternalLidl.g:5437:1: rule__AtomInterfaceTypeElement__DirectionAssignment_2 : ( ruleDataDirection ) ;
    public final void rule__AtomInterfaceTypeElement__DirectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5441:1: ( ( ruleDataDirection ) )
            // InternalLidl.g:5442:2: ( ruleDataDirection )
            {
            // InternalLidl.g:5442:2: ( ruleDataDirection )
            // InternalLidl.g:5443:3: ruleDataDirection
            {
             before(grammarAccess.getAtomInterfaceTypeElementAccess().getDirectionDataDirectionEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDirection();

            state._fsp--;

             after(grammarAccess.getAtomInterfaceTypeElementAccess().getDirectionDataDirectionEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceTypeElement__DirectionAssignment_2"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__NameAssignment_1"
    // InternalLidl.g:5452:1: rule__CompositeInterfaceTypeElement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CompositeInterfaceTypeElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5456:1: ( ( RULE_ID ) )
            // InternalLidl.g:5457:2: ( RULE_ID )
            {
            // InternalLidl.g:5457:2: ( RULE_ID )
            // InternalLidl.g:5458:3: RULE_ID
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__NameAssignment_1"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0"
    // InternalLidl.g:5467:1: rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5471:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:5472:2: ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:5472:2: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5473:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlDataCrossReference_3_0_0_0()); 
            // InternalLidl.g:5474:3: ( ruleQualifiedName )
            // InternalLidl.g:5475:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_3_0_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlDataQualifiedNameParserRuleCall_3_0_0_0_1()); 

            }

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlDataCrossReference_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__TypeAssignment_3_0_0"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1"
    // InternalLidl.g:5486:1: rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1 : ( ruleDataDirection ) ;
    public final void rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5490:1: ( ( ruleDataDirection ) )
            // InternalLidl.g:5491:2: ( ruleDataDirection )
            {
            // InternalLidl.g:5491:2: ( ruleDataDirection )
            // InternalLidl.g:5492:3: ruleDataDirection
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getDirectionDataDirectionEnumRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDataDirection();

            state._fsp--;

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getDirectionDataDirectionEnumRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__DirectionAssignment_3_0_1"


    // $ANTLR start "rule__CompositeInterfaceTypeElement__TypeAssignment_3_1"
    // InternalLidl.g:5501:1: rule__CompositeInterfaceTypeElement__TypeAssignment_3_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__CompositeInterfaceTypeElement__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5505:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:5506:2: ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:5506:2: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5507:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlInterfaceCrossReference_3_1_0()); 
            // InternalLidl.g:5508:3: ( ruleQualifiedName )
            // InternalLidl.g:5509:4: ruleQualifiedName
            {
             before(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlInterfaceQualifiedNameParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlInterfaceCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceTypeElement__TypeAssignment_3_1"


    // $ANTLR start "rule__RefInterfaceTypeElement__TypeAssignment_1"
    // InternalLidl.g:5520:1: rule__RefInterfaceTypeElement__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RefInterfaceTypeElement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5524:1: ( ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:5525:2: ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:5525:2: ( ( ruleQualifiedName ) )
            // InternalLidl.g:5526:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getRefInterfaceTypeElementAccess().getTypeLidlInterfaceCrossReference_1_0()); 
            // InternalLidl.g:5527:3: ( ruleQualifiedName )
            // InternalLidl.g:5528:4: ruleQualifiedName
            {
             before(grammarAccess.getRefInterfaceTypeElementAccess().getTypeLidlInterfaceQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getRefInterfaceTypeElementAccess().getTypeLidlInterfaceQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRefInterfaceTypeElementAccess().getTypeLidlInterfaceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceTypeElement__TypeAssignment_1"


    // $ANTLR start "rule__AtomInterfaceType__ItemsAssignment_1"
    // InternalLidl.g:5539:1: rule__AtomInterfaceType__ItemsAssignment_1 : ( ruleAtomInterfaceTypeElement ) ;
    public final void rule__AtomInterfaceType__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5543:1: ( ( ruleAtomInterfaceTypeElement ) )
            // InternalLidl.g:5544:2: ( ruleAtomInterfaceTypeElement )
            {
            // InternalLidl.g:5544:2: ( ruleAtomInterfaceTypeElement )
            // InternalLidl.g:5545:3: ruleAtomInterfaceTypeElement
            {
             before(grammarAccess.getAtomInterfaceTypeAccess().getItemsAtomInterfaceTypeElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAtomInterfaceTypeElement();

            state._fsp--;

             after(grammarAccess.getAtomInterfaceTypeAccess().getItemsAtomInterfaceTypeElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtomInterfaceType__ItemsAssignment_1"


    // $ANTLR start "rule__CompositeInterfaceType__ItemsAssignment_2"
    // InternalLidl.g:5554:1: rule__CompositeInterfaceType__ItemsAssignment_2 : ( ruleCompositeInterfaceTypeElement ) ;
    public final void rule__CompositeInterfaceType__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5558:1: ( ( ruleCompositeInterfaceTypeElement ) )
            // InternalLidl.g:5559:2: ( ruleCompositeInterfaceTypeElement )
            {
            // InternalLidl.g:5559:2: ( ruleCompositeInterfaceTypeElement )
            // InternalLidl.g:5560:3: ruleCompositeInterfaceTypeElement
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getItemsCompositeInterfaceTypeElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositeInterfaceTypeElement();

            state._fsp--;

             after(grammarAccess.getCompositeInterfaceTypeAccess().getItemsCompositeInterfaceTypeElementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__ItemsAssignment_2"


    // $ANTLR start "rule__CompositeInterfaceType__ItemsAssignment_3_1"
    // InternalLidl.g:5569:1: rule__CompositeInterfaceType__ItemsAssignment_3_1 : ( ruleCompositeInterfaceTypeElement ) ;
    public final void rule__CompositeInterfaceType__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5573:1: ( ( ruleCompositeInterfaceTypeElement ) )
            // InternalLidl.g:5574:2: ( ruleCompositeInterfaceTypeElement )
            {
            // InternalLidl.g:5574:2: ( ruleCompositeInterfaceTypeElement )
            // InternalLidl.g:5575:3: ruleCompositeInterfaceTypeElement
            {
             before(grammarAccess.getCompositeInterfaceTypeAccess().getItemsCompositeInterfaceTypeElementParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCompositeInterfaceTypeElement();

            state._fsp--;

             after(grammarAccess.getCompositeInterfaceTypeAccess().getItemsCompositeInterfaceTypeElementParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeInterfaceType__ItemsAssignment_3_1"


    // $ANTLR start "rule__RefInterfaceType__ItemsAssignment_1"
    // InternalLidl.g:5584:1: rule__RefInterfaceType__ItemsAssignment_1 : ( ruleRefInterfaceTypeElement ) ;
    public final void rule__RefInterfaceType__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5588:1: ( ( ruleRefInterfaceTypeElement ) )
            // InternalLidl.g:5589:2: ( ruleRefInterfaceTypeElement )
            {
            // InternalLidl.g:5589:2: ( ruleRefInterfaceTypeElement )
            // InternalLidl.g:5590:3: ruleRefInterfaceTypeElement
            {
             before(grammarAccess.getRefInterfaceTypeAccess().getItemsRefInterfaceTypeElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRefInterfaceTypeElement();

            state._fsp--;

             after(grammarAccess.getRefInterfaceTypeAccess().getItemsRefInterfaceTypeElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefInterfaceType__ItemsAssignment_1"


    // $ANTLR start "rule__LidlInteraction__IdAssignment_1"
    // InternalLidl.g:5599:1: rule__LidlInteraction__IdAssignment_1 : ( ruleLidlInteractionID ) ;
    public final void rule__LidlInteraction__IdAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5603:1: ( ( ruleLidlInteractionID ) )
            // InternalLidl.g:5604:2: ( ruleLidlInteractionID )
            {
            // InternalLidl.g:5604:2: ( ruleLidlInteractionID )
            // InternalLidl.g:5605:3: ruleLidlInteractionID
            {
             before(grammarAccess.getLidlInteractionAccess().getIdLidlInteractionIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlInteractionID();

            state._fsp--;

             after(grammarAccess.getLidlInteractionAccess().getIdLidlInteractionIDParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__IdAssignment_1"


    // $ANTLR start "rule__LidlInteraction__InterfaceAssignment_3"
    // InternalLidl.g:5614:1: rule__LidlInteraction__InterfaceAssignment_3 : ( ruleLidlInterfaceType ) ;
    public final void rule__LidlInteraction__InterfaceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5618:1: ( ( ruleLidlInterfaceType ) )
            // InternalLidl.g:5619:2: ( ruleLidlInterfaceType )
            {
            // InternalLidl.g:5619:2: ( ruleLidlInterfaceType )
            // InternalLidl.g:5620:3: ruleLidlInterfaceType
            {
             before(grammarAccess.getLidlInteractionAccess().getInterfaceLidlInterfaceTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlInterfaceType();

            state._fsp--;

             after(grammarAccess.getLidlInteractionAccess().getInterfaceLidlInterfaceTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__InterfaceAssignment_3"


    // $ANTLR start "rule__LidlInteraction__NestedAssignment_4_0"
    // InternalLidl.g:5629:1: rule__LidlInteraction__NestedAssignment_4_0 : ( ( 'with' ) ) ;
    public final void rule__LidlInteraction__NestedAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5633:1: ( ( ( 'with' ) ) )
            // InternalLidl.g:5634:2: ( ( 'with' ) )
            {
            // InternalLidl.g:5634:2: ( ( 'with' ) )
            // InternalLidl.g:5635:3: ( 'with' )
            {
             before(grammarAccess.getLidlInteractionAccess().getNestedWithKeyword_4_0_0()); 
            // InternalLidl.g:5636:3: ( 'with' )
            // InternalLidl.g:5637:4: 'with'
            {
             before(grammarAccess.getLidlInteractionAccess().getNestedWithKeyword_4_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getLidlInteractionAccess().getNestedWithKeyword_4_0_0()); 

            }

             after(grammarAccess.getLidlInteractionAccess().getNestedWithKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__NestedAssignment_4_0"


    // $ANTLR start "rule__LidlInteraction__NestedDefAssignment_4_1"
    // InternalLidl.g:5648:1: rule__LidlInteraction__NestedDefAssignment_4_1 : ( ruleLidlInteraction ) ;
    public final void rule__LidlInteraction__NestedDefAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5652:1: ( ( ruleLidlInteraction ) )
            // InternalLidl.g:5653:2: ( ruleLidlInteraction )
            {
            // InternalLidl.g:5653:2: ( ruleLidlInteraction )
            // InternalLidl.g:5654:3: ruleLidlInteraction
            {
             before(grammarAccess.getLidlInteractionAccess().getNestedDefLidlInteractionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlInteraction();

            state._fsp--;

             after(grammarAccess.getLidlInteractionAccess().getNestedDefLidlInteractionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__NestedDefAssignment_4_1"


    // $ANTLR start "rule__LidlInteraction__DefinitionAssignment_7"
    // InternalLidl.g:5663:1: rule__LidlInteraction__DefinitionAssignment_7 : ( ruleLidlExpression ) ;
    public final void rule__LidlInteraction__DefinitionAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5667:1: ( ( ruleLidlExpression ) )
            // InternalLidl.g:5668:2: ( ruleLidlExpression )
            {
            // InternalLidl.g:5668:2: ( ruleLidlExpression )
            // InternalLidl.g:5669:3: ruleLidlExpression
            {
             before(grammarAccess.getLidlInteractionAccess().getDefinitionLidlExpressionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlExpression();

            state._fsp--;

             after(grammarAccess.getLidlInteractionAccess().getDefinitionLidlExpressionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteraction__DefinitionAssignment_7"


    // $ANTLR start "rule__LidlInteractionID__ItemsAssignment_1"
    // InternalLidl.g:5678:1: rule__LidlInteractionID__ItemsAssignment_1 : ( ruleIDPart ) ;
    public final void rule__LidlInteractionID__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5682:1: ( ( ruleIDPart ) )
            // InternalLidl.g:5683:2: ( ruleIDPart )
            {
            // InternalLidl.g:5683:2: ( ruleIDPart )
            // InternalLidl.g:5684:3: ruleIDPart
            {
             before(grammarAccess.getLidlInteractionIDAccess().getItemsIDPartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleIDPart();

            state._fsp--;

             after(grammarAccess.getLidlInteractionIDAccess().getItemsIDPartParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlInteractionID__ItemsAssignment_1"


    // $ANTLR start "rule__LidlParameter__NameAssignment_2"
    // InternalLidl.g:5693:1: rule__LidlParameter__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LidlParameter__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5697:1: ( ( RULE_ID ) )
            // InternalLidl.g:5698:2: ( RULE_ID )
            {
            // InternalLidl.g:5698:2: ( RULE_ID )
            // InternalLidl.g:5699:3: RULE_ID
            {
             before(grammarAccess.getLidlParameterAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLidlParameterAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__NameAssignment_2"


    // $ANTLR start "rule__LidlParameter__InterfaceAssignment_4"
    // InternalLidl.g:5708:1: rule__LidlParameter__InterfaceAssignment_4 : ( ruleLidlInterfaceType ) ;
    public final void rule__LidlParameter__InterfaceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5712:1: ( ( ruleLidlInterfaceType ) )
            // InternalLidl.g:5713:2: ( ruleLidlInterfaceType )
            {
            // InternalLidl.g:5713:2: ( ruleLidlInterfaceType )
            // InternalLidl.g:5714:3: ruleLidlInterfaceType
            {
             before(grammarAccess.getLidlParameterAccess().getInterfaceLidlInterfaceTypeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlInterfaceType();

            state._fsp--;

             after(grammarAccess.getLidlParameterAccess().getInterfaceLidlInterfaceTypeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlParameter__InterfaceAssignment_4"


    // $ANTLR start "rule__LidlText__TextAssignment_1"
    // InternalLidl.g:5723:1: rule__LidlText__TextAssignment_1 : ( ( rule__LidlText__TextAlternatives_1_0 ) ) ;
    public final void rule__LidlText__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5727:1: ( ( ( rule__LidlText__TextAlternatives_1_0 ) ) )
            // InternalLidl.g:5728:2: ( ( rule__LidlText__TextAlternatives_1_0 ) )
            {
            // InternalLidl.g:5728:2: ( ( rule__LidlText__TextAlternatives_1_0 ) )
            // InternalLidl.g:5729:3: ( rule__LidlText__TextAlternatives_1_0 )
            {
             before(grammarAccess.getLidlTextAccess().getTextAlternatives_1_0()); 
            // InternalLidl.g:5730:3: ( rule__LidlText__TextAlternatives_1_0 )
            // InternalLidl.g:5730:4: rule__LidlText__TextAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlText__TextAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlTextAccess().getTextAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlText__TextAssignment_1"


    // $ANTLR start "rule__LidlCallExpression__ItemsAssignment_1"
    // InternalLidl.g:5738:1: rule__LidlCallExpression__ItemsAssignment_1 : ( ruleCallPart ) ;
    public final void rule__LidlCallExpression__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5742:1: ( ( ruleCallPart ) )
            // InternalLidl.g:5743:2: ( ruleCallPart )
            {
            // InternalLidl.g:5743:2: ( ruleCallPart )
            // InternalLidl.g:5744:3: ruleCallPart
            {
             before(grammarAccess.getLidlCallExpressionAccess().getItemsCallPartParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCallPart();

            state._fsp--;

             after(grammarAccess.getLidlCallExpressionAccess().getItemsCallPartParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCallExpression__ItemsAssignment_1"


    // $ANTLR start "rule__CallPart__TextAssignment_0_1"
    // InternalLidl.g:5753:1: rule__CallPart__TextAssignment_0_1 : ( ( rule__CallPart__TextAlternatives_0_1_0 ) ) ;
    public final void rule__CallPart__TextAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5757:1: ( ( ( rule__CallPart__TextAlternatives_0_1_0 ) ) )
            // InternalLidl.g:5758:2: ( ( rule__CallPart__TextAlternatives_0_1_0 ) )
            {
            // InternalLidl.g:5758:2: ( ( rule__CallPart__TextAlternatives_0_1_0 ) )
            // InternalLidl.g:5759:3: ( rule__CallPart__TextAlternatives_0_1_0 )
            {
             before(grammarAccess.getCallPartAccess().getTextAlternatives_0_1_0()); 
            // InternalLidl.g:5760:3: ( rule__CallPart__TextAlternatives_0_1_0 )
            // InternalLidl.g:5760:4: rule__CallPart__TextAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__CallPart__TextAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getCallPartAccess().getTextAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__TextAssignment_0_1"


    // $ANTLR start "rule__CallPart__ParamAssignment_1_2"
    // InternalLidl.g:5768:1: rule__CallPart__ParamAssignment_1_2 : ( ruleLidlExpression ) ;
    public final void rule__CallPart__ParamAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5772:1: ( ( ruleLidlExpression ) )
            // InternalLidl.g:5773:2: ( ruleLidlExpression )
            {
            // InternalLidl.g:5773:2: ( ruleLidlExpression )
            // InternalLidl.g:5774:3: ruleLidlExpression
            {
             before(grammarAccess.getCallPartAccess().getParamLidlExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlExpression();

            state._fsp--;

             after(grammarAccess.getCallPartAccess().getParamLidlExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallPart__ParamAssignment_1_2"


    // $ANTLR start "rule__LidlTerminalExpression__ValueAssignment_0_1"
    // InternalLidl.g:5783:1: rule__LidlTerminalExpression__ValueAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__LidlTerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5787:1: ( ( RULE_STRING ) )
            // InternalLidl.g:5788:2: ( RULE_STRING )
            {
            // InternalLidl.g:5788:2: ( RULE_STRING )
            // InternalLidl.g:5789:3: RULE_STRING
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLidlTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__LidlTerminalExpression__ValueAssignment_1_1"
    // InternalLidl.g:5798:1: rule__LidlTerminalExpression__ValueAssignment_1_1 : ( RULE_NUMBER ) ;
    public final void rule__LidlTerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5802:1: ( ( RULE_NUMBER ) )
            // InternalLidl.g:5803:2: ( RULE_NUMBER )
            {
            // InternalLidl.g:5803:2: ( RULE_NUMBER )
            // InternalLidl.g:5804:3: RULE_NUMBER
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getLidlTerminalExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__LidlTerminalExpression__ValueAssignment_2_1"
    // InternalLidl.g:5813:1: rule__LidlTerminalExpression__ValueAssignment_2_1 : ( ( rule__LidlTerminalExpression__ValueAlternatives_2_1_0 ) ) ;
    public final void rule__LidlTerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5817:1: ( ( ( rule__LidlTerminalExpression__ValueAlternatives_2_1_0 ) ) )
            // InternalLidl.g:5818:2: ( ( rule__LidlTerminalExpression__ValueAlternatives_2_1_0 ) )
            {
            // InternalLidl.g:5818:2: ( ( rule__LidlTerminalExpression__ValueAlternatives_2_1_0 ) )
            // InternalLidl.g:5819:3: ( rule__LidlTerminalExpression__ValueAlternatives_2_1_0 )
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getValueAlternatives_2_1_0()); 
            // InternalLidl.g:5820:3: ( rule__LidlTerminalExpression__ValueAlternatives_2_1_0 )
            // InternalLidl.g:5820:4: rule__LidlTerminalExpression__ValueAlternatives_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__ValueAlternatives_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getValueAlternatives_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__LidlTerminalExpression__ValueAssignment_3_1"
    // InternalLidl.g:5828:1: rule__LidlTerminalExpression__ValueAssignment_3_1 : ( ( rule__LidlTerminalExpression__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__LidlTerminalExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5832:1: ( ( ( rule__LidlTerminalExpression__ValueAlternatives_3_1_0 ) ) )
            // InternalLidl.g:5833:2: ( ( rule__LidlTerminalExpression__ValueAlternatives_3_1_0 ) )
            {
            // InternalLidl.g:5833:2: ( ( rule__LidlTerminalExpression__ValueAlternatives_3_1_0 ) )
            // InternalLidl.g:5834:3: ( rule__LidlTerminalExpression__ValueAlternatives_3_1_0 )
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getValueAlternatives_3_1_0()); 
            // InternalLidl.g:5835:3: ( rule__LidlTerminalExpression__ValueAlternatives_3_1_0 )
            // InternalLidl.g:5835:4: rule__LidlTerminalExpression__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LidlTerminalExpression__ValueAlternatives_3_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLidlTerminalExpressionAccess().getValueAlternatives_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__LidlTerminalExpression__BodyAssignment_4_1"
    // InternalLidl.g:5843:1: rule__LidlTerminalExpression__BodyAssignment_4_1 : ( ruleLidlComposition ) ;
    public final void rule__LidlTerminalExpression__BodyAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5847:1: ( ( ruleLidlComposition ) )
            // InternalLidl.g:5848:2: ( ruleLidlComposition )
            {
            // InternalLidl.g:5848:2: ( ruleLidlComposition )
            // InternalLidl.g:5849:3: ruleLidlComposition
            {
             before(grammarAccess.getLidlTerminalExpressionAccess().getBodyLidlCompositionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlComposition();

            state._fsp--;

             after(grammarAccess.getLidlTerminalExpressionAccess().getBodyLidlCompositionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlTerminalExpression__BodyAssignment_4_1"


    // $ANTLR start "rule__LidlArray__ItemAssignment_2_0"
    // InternalLidl.g:5858:1: rule__LidlArray__ItemAssignment_2_0 : ( ruleLidlArrayItem ) ;
    public final void rule__LidlArray__ItemAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5862:1: ( ( ruleLidlArrayItem ) )
            // InternalLidl.g:5863:2: ( ruleLidlArrayItem )
            {
            // InternalLidl.g:5863:2: ( ruleLidlArrayItem )
            // InternalLidl.g:5864:3: ruleLidlArrayItem
            {
             before(grammarAccess.getLidlArrayAccess().getItemLidlArrayItemParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlArrayItem();

            state._fsp--;

             after(grammarAccess.getLidlArrayAccess().getItemLidlArrayItemParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__ItemAssignment_2_0"


    // $ANTLR start "rule__LidlArray__ItemAssignment_2_1_1"
    // InternalLidl.g:5873:1: rule__LidlArray__ItemAssignment_2_1_1 : ( ruleLidlArrayItem ) ;
    public final void rule__LidlArray__ItemAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5877:1: ( ( ruleLidlArrayItem ) )
            // InternalLidl.g:5878:2: ( ruleLidlArrayItem )
            {
            // InternalLidl.g:5878:2: ( ruleLidlArrayItem )
            // InternalLidl.g:5879:3: ruleLidlArrayItem
            {
             before(grammarAccess.getLidlArrayAccess().getItemLidlArrayItemParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlArrayItem();

            state._fsp--;

             after(grammarAccess.getLidlArrayAccess().getItemLidlArrayItemParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArray__ItemAssignment_2_1_1"


    // $ANTLR start "rule__LidlArrayItem__ValueAssignment_1"
    // InternalLidl.g:5888:1: rule__LidlArrayItem__ValueAssignment_1 : ( ruleLidlExpression ) ;
    public final void rule__LidlArrayItem__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5892:1: ( ( ruleLidlExpression ) )
            // InternalLidl.g:5893:2: ( ruleLidlExpression )
            {
            // InternalLidl.g:5893:2: ( ruleLidlExpression )
            // InternalLidl.g:5894:3: ruleLidlExpression
            {
             before(grammarAccess.getLidlArrayItemAccess().getValueLidlExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlExpression();

            state._fsp--;

             after(grammarAccess.getLidlArrayItemAccess().getValueLidlExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlArrayItem__ValueAssignment_1"


    // $ANTLR start "rule__LidlCompositionElement__ParamAssignment_0"
    // InternalLidl.g:5903:1: rule__LidlCompositionElement__ParamAssignment_0 : ( RULE_ID ) ;
    public final void rule__LidlCompositionElement__ParamAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5907:1: ( ( RULE_ID ) )
            // InternalLidl.g:5908:2: ( RULE_ID )
            {
            // InternalLidl.g:5908:2: ( RULE_ID )
            // InternalLidl.g:5909:3: RULE_ID
            {
             before(grammarAccess.getLidlCompositionElementAccess().getParamIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLidlCompositionElementAccess().getParamIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__ParamAssignment_0"


    // $ANTLR start "rule__LidlCompositionElement__ValueAssignment_3"
    // InternalLidl.g:5918:1: rule__LidlCompositionElement__ValueAssignment_3 : ( ruleLidlExpression ) ;
    public final void rule__LidlCompositionElement__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5922:1: ( ( ruleLidlExpression ) )
            // InternalLidl.g:5923:2: ( ruleLidlExpression )
            {
            // InternalLidl.g:5923:2: ( ruleLidlExpression )
            // InternalLidl.g:5924:3: ruleLidlExpression
            {
             before(grammarAccess.getLidlCompositionElementAccess().getValueLidlExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlExpression();

            state._fsp--;

             after(grammarAccess.getLidlCompositionElementAccess().getValueLidlExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlCompositionElement__ValueAssignment_3"


    // $ANTLR start "rule__LidlComposition__ItemsAssignment_1"
    // InternalLidl.g:5933:1: rule__LidlComposition__ItemsAssignment_1 : ( ruleLidlCompositionElement ) ;
    public final void rule__LidlComposition__ItemsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5937:1: ( ( ruleLidlCompositionElement ) )
            // InternalLidl.g:5938:2: ( ruleLidlCompositionElement )
            {
            // InternalLidl.g:5938:2: ( ruleLidlCompositionElement )
            // InternalLidl.g:5939:3: ruleLidlCompositionElement
            {
             before(grammarAccess.getLidlCompositionAccess().getItemsLidlCompositionElementParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlCompositionElement();

            state._fsp--;

             after(grammarAccess.getLidlCompositionAccess().getItemsLidlCompositionElementParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__ItemsAssignment_1"


    // $ANTLR start "rule__LidlComposition__ItemsAssignment_2_1"
    // InternalLidl.g:5948:1: rule__LidlComposition__ItemsAssignment_2_1 : ( ruleLidlCompositionElement ) ;
    public final void rule__LidlComposition__ItemsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLidl.g:5952:1: ( ( ruleLidlCompositionElement ) )
            // InternalLidl.g:5953:2: ( ruleLidlCompositionElement )
            {
            // InternalLidl.g:5953:2: ( ruleLidlCompositionElement )
            // InternalLidl.g:5954:3: ruleLidlCompositionElement
            {
             before(grammarAccess.getLidlCompositionAccess().getItemsLidlCompositionElementParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLidlCompositionElement();

            state._fsp--;

             after(grammarAccess.getLidlCompositionAccess().getItemsLidlCompositionElementParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LidlComposition__ItemsAssignment_2_1"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\uffff\1\5\4\uffff\1\5";
    static final String dfa_3s = "\1\4\1\16\1\uffff\1\4\2\uffff\1\16";
    static final String dfa_4s = "\1\32\1\46\1\uffff\1\4\2\uffff\1\46";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\25\uffff\1\2",
            "\1\3\4\uffff\2\4\3\uffff\2\5\4\uffff\2\5\1\uffff\1\5\2\uffff\1\5\1\uffff\1\5",
            "",
            "\1\6",
            "",
            "",
            "\1\3\4\uffff\2\4\3\uffff\2\5\4\uffff\2\5\1\uffff\1\5\2\uffff\1\5\1\uffff\1\5"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1000:1: rule__LidlInterfaceType__Alternatives : ( ( ruleAtomInterfaceType ) | ( ruleCompositeInterfaceType ) | ( ( rule__LidlInterfaceType__Group_2__0 ) ) );";
        }
    }
    static final String dfa_8s = "\6\uffff";
    static final String dfa_9s = "\1\uffff\1\3\3\uffff\1\3";
    static final String dfa_10s = "\1\4\1\15\1\4\2\uffff\1\15";
    static final String dfa_11s = "\1\4\1\33\1\4\2\uffff\1\33";
    static final String dfa_12s = "\3\uffff\1\2\1\1\1\uffff";
    static final String dfa_13s = "\6\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\3\1\2\4\uffff\2\4\6\uffff\1\3",
            "\1\5",
            "",
            "",
            "\1\3\1\2\4\uffff\2\4\6\uffff\1\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1027:1: rule__CompositeInterfaceTypeElement__Alternatives_3 : ( ( ( rule__CompositeInterfaceTypeElement__Group_3_0__0 ) ) | ( ( rule__CompositeInterfaceTypeElement__TypeAssignment_3_1 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000C1400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000C1000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002404000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000404000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002004000010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000050407E0F0L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000000C1000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100006030L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000100006032L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000006030L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000040780C0L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000002000L});

}