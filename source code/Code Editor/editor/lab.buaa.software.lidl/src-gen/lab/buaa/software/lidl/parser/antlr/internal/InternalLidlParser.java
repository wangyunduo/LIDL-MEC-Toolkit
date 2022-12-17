package lab.buaa.software.lidl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import lab.buaa.software.lidl.services.LidlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLidlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_LIDLIDSYMBOL", "RULE_STRING", "RULE_NUMBER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'.'", "'import'", "'.*'", "'data'", "'with'", "'is'", "'Undefined'", "'{'", "','", "'}'", "':'", "'['", "']'", "'interface'", "'\\''", "'interaction'", "'('", "')'", "'true'", "'false'", "'active'", "'inactive'", "'in'", "'out'"
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

        public InternalLidlParser(TokenStream input, LidlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "LidlProgram";
       	}

       	@Override
       	protected LidlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLidlProgram"
    // InternalLidl.g:65:1: entryRuleLidlProgram returns [EObject current=null] : iv_ruleLidlProgram= ruleLidlProgram EOF ;
    public final EObject entryRuleLidlProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlProgram = null;


        try {
            // InternalLidl.g:65:52: (iv_ruleLidlProgram= ruleLidlProgram EOF )
            // InternalLidl.g:66:2: iv_ruleLidlProgram= ruleLidlProgram EOF
            {
             newCompositeNode(grammarAccess.getLidlProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlProgram=ruleLidlProgram();

            state._fsp--;

             current =iv_ruleLidlProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlProgram"


    // $ANTLR start "ruleLidlProgram"
    // InternalLidl.g:72:1: ruleLidlProgram returns [EObject current=null] : ( ( ( (lv_pack_0_0= 'package' ) ) ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleLidlImport ) )* ( (lv_definitions_4_0= ruleLidlDefinition ) )* ) ;
    public final EObject ruleLidlProgram() throws RecognitionException {
        EObject current = null;

        Token lv_pack_0_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_definitions_4_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:78:2: ( ( ( ( (lv_pack_0_0= 'package' ) ) ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleLidlImport ) )* ( (lv_definitions_4_0= ruleLidlDefinition ) )* ) )
            // InternalLidl.g:79:2: ( ( ( (lv_pack_0_0= 'package' ) ) ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleLidlImport ) )* ( (lv_definitions_4_0= ruleLidlDefinition ) )* )
            {
            // InternalLidl.g:79:2: ( ( ( (lv_pack_0_0= 'package' ) ) ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleLidlImport ) )* ( (lv_definitions_4_0= ruleLidlDefinition ) )* )
            // InternalLidl.g:80:3: ( ( (lv_pack_0_0= 'package' ) ) ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )? ( (lv_imports_3_0= ruleLidlImport ) )* ( (lv_definitions_4_0= ruleLidlDefinition ) )*
            {
            // InternalLidl.g:80:3: ( ( (lv_pack_0_0= 'package' ) ) ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLidl.g:81:4: ( (lv_pack_0_0= 'package' ) ) ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= ';'
                    {
                    // InternalLidl.g:81:4: ( (lv_pack_0_0= 'package' ) )
                    // InternalLidl.g:82:5: (lv_pack_0_0= 'package' )
                    {
                    // InternalLidl.g:82:5: (lv_pack_0_0= 'package' )
                    // InternalLidl.g:83:6: lv_pack_0_0= 'package'
                    {
                    lv_pack_0_0=(Token)match(input,13,FOLLOW_3); 

                    						newLeafNode(lv_pack_0_0, grammarAccess.getLidlProgramAccess().getPackPackageKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlProgramRule());
                    						}
                    						setWithLastConsumed(current, "pack", lv_pack_0_0 != null, "package");
                    					

                    }


                    }

                    // InternalLidl.g:95:4: ( (lv_name_1_0= ruleQualifiedName ) )
                    // InternalLidl.g:96:5: (lv_name_1_0= ruleQualifiedName )
                    {
                    // InternalLidl.g:96:5: (lv_name_1_0= ruleQualifiedName )
                    // InternalLidl.g:97:6: lv_name_1_0= ruleQualifiedName
                    {

                    						newCompositeNode(grammarAccess.getLidlProgramAccess().getNameQualifiedNameParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_name_1_0=ruleQualifiedName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLidlProgramRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_1_0,
                    							"lab.buaa.software.lidl.Lidl.QualifiedName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getLidlProgramAccess().getSemicolonKeyword_0_2());
                    			

                    }
                    break;

            }

            // InternalLidl.g:119:3: ( (lv_imports_3_0= ruleLidlImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLidl.g:120:4: (lv_imports_3_0= ruleLidlImport )
            	    {
            	    // InternalLidl.g:120:4: (lv_imports_3_0= ruleLidlImport )
            	    // InternalLidl.g:121:5: lv_imports_3_0= ruleLidlImport
            	    {

            	    					newCompositeNode(grammarAccess.getLidlProgramAccess().getImportsLidlImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleLidlImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLidlProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_3_0,
            	    						"lab.buaa.software.lidl.Lidl.LidlImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalLidl.g:138:3: ( (lv_definitions_4_0= ruleLidlDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18||LA3_0==28||LA3_0==30) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLidl.g:139:4: (lv_definitions_4_0= ruleLidlDefinition )
            	    {
            	    // InternalLidl.g:139:4: (lv_definitions_4_0= ruleLidlDefinition )
            	    // InternalLidl.g:140:5: lv_definitions_4_0= ruleLidlDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getLidlProgramAccess().getDefinitionsLidlDefinitionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_definitions_4_0=ruleLidlDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLidlProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"definitions",
            	    						lv_definitions_4_0,
            	    						"lab.buaa.software.lidl.Lidl.LidlDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlProgram"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalLidl.g:161:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLidl.g:161:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLidl.g:162:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalLidl.g:168:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalLidl.g:174:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalLidl.g:175:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalLidl.g:175:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalLidl.g:176:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalLidl.g:183:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLidl.g:184:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleLidlImport"
    // InternalLidl.g:201:1: entryRuleLidlImport returns [EObject current=null] : iv_ruleLidlImport= ruleLidlImport EOF ;
    public final EObject entryRuleLidlImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlImport = null;


        try {
            // InternalLidl.g:201:51: (iv_ruleLidlImport= ruleLidlImport EOF )
            // InternalLidl.g:202:2: iv_ruleLidlImport= ruleLidlImport EOF
            {
             newCompositeNode(grammarAccess.getLidlImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlImport=ruleLidlImport();

            state._fsp--;

             current =iv_ruleLidlImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlImport"


    // $ANTLR start "ruleLidlImport"
    // InternalLidl.g:208:1: ruleLidlImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleLidlImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:214:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalLidl.g:215:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalLidl.g:215:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalLidl.g:216:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLidlImportAccess().getImportKeyword_0());
            		
            // InternalLidl.g:220:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalLidl.g:221:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalLidl.g:221:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalLidl.g:222:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getLidlImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLidlImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"lab.buaa.software.lidl.Lidl.QualifiedNameWithWildcard");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLidlImportAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalLidl.g:247:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalLidl.g:247:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalLidl.g:248:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalLidl.g:254:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:260:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalLidl.g:261:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalLidl.g:261:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalLidl.g:262:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalLidl.g:272:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalLidl.g:273:4: kw= '.*'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleLidlDefinition"
    // InternalLidl.g:283:1: entryRuleLidlDefinition returns [EObject current=null] : iv_ruleLidlDefinition= ruleLidlDefinition EOF ;
    public final EObject entryRuleLidlDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlDefinition = null;


        try {
            // InternalLidl.g:283:55: (iv_ruleLidlDefinition= ruleLidlDefinition EOF )
            // InternalLidl.g:284:2: iv_ruleLidlDefinition= ruleLidlDefinition EOF
            {
             newCompositeNode(grammarAccess.getLidlDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlDefinition=ruleLidlDefinition();

            state._fsp--;

             current =iv_ruleLidlDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlDefinition"


    // $ANTLR start "ruleLidlDefinition"
    // InternalLidl.g:290:1: ruleLidlDefinition returns [EObject current=null] : (this_LidlData_0= ruleLidlData | this_LidlInterface_1= ruleLidlInterface | this_LidlInteraction_2= ruleLidlInteraction ) ;
    public final EObject ruleLidlDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_LidlData_0 = null;

        EObject this_LidlInterface_1 = null;

        EObject this_LidlInteraction_2 = null;



        	enterRule();

        try {
            // InternalLidl.g:296:2: ( (this_LidlData_0= ruleLidlData | this_LidlInterface_1= ruleLidlInterface | this_LidlInteraction_2= ruleLidlInteraction ) )
            // InternalLidl.g:297:2: (this_LidlData_0= ruleLidlData | this_LidlInterface_1= ruleLidlInterface | this_LidlInteraction_2= ruleLidlInteraction )
            {
            // InternalLidl.g:297:2: (this_LidlData_0= ruleLidlData | this_LidlInterface_1= ruleLidlInterface | this_LidlInteraction_2= ruleLidlInteraction )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLidl.g:298:3: this_LidlData_0= ruleLidlData
                    {

                    			newCompositeNode(grammarAccess.getLidlDefinitionAccess().getLidlDataParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LidlData_0=ruleLidlData();

                    state._fsp--;


                    			current = this_LidlData_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLidl.g:307:3: this_LidlInterface_1= ruleLidlInterface
                    {

                    			newCompositeNode(grammarAccess.getLidlDefinitionAccess().getLidlInterfaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LidlInterface_1=ruleLidlInterface();

                    state._fsp--;


                    			current = this_LidlInterface_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLidl.g:316:3: this_LidlInteraction_2= ruleLidlInteraction
                    {

                    			newCompositeNode(grammarAccess.getLidlDefinitionAccess().getLidlInteractionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LidlInteraction_2=ruleLidlInteraction();

                    state._fsp--;


                    			current = this_LidlInteraction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlDefinition"


    // $ANTLR start "entryRuleLidlData"
    // InternalLidl.g:328:1: entryRuleLidlData returns [EObject current=null] : iv_ruleLidlData= ruleLidlData EOF ;
    public final EObject entryRuleLidlData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlData = null;


        try {
            // InternalLidl.g:328:49: (iv_ruleLidlData= ruleLidlData EOF )
            // InternalLidl.g:329:2: iv_ruleLidlData= ruleLidlData EOF
            {
             newCompositeNode(grammarAccess.getLidlDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlData=ruleLidlData();

            state._fsp--;

             current =iv_ruleLidlData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlData"


    // $ANTLR start "ruleLidlData"
    // InternalLidl.g:335:1: ruleLidlData returns [EObject current=null] : (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlData ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlDataType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) ) ) ;
    public final EObject ruleLidlData() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nested_2_0=null;
        Token otherlv_4=null;
        Token lv_defined_6_0=null;
        EObject lv_nestedDef_3_0 = null;

        EObject lv_definition_5_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:341:2: ( (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlData ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlDataType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) ) ) )
            // InternalLidl.g:342:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlData ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlDataType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) ) )
            {
            // InternalLidl.g:342:2: (otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlData ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlDataType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) ) )
            // InternalLidl.g:343:3: otherlv_0= 'data' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlData ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlDataType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLidlDataAccess().getDataKeyword_0());
            		
            // InternalLidl.g:347:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLidl.g:348:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLidl.g:348:4: (lv_name_1_0= RULE_ID )
            // InternalLidl.g:349:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLidlDataAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLidlDataRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLidl.g:365:3: ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlData ) )+ )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalLidl.g:366:4: ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlData ) )+
                    {
                    // InternalLidl.g:366:4: ( (lv_nested_2_0= 'with' ) )
                    // InternalLidl.g:367:5: (lv_nested_2_0= 'with' )
                    {
                    // InternalLidl.g:367:5: (lv_nested_2_0= 'with' )
                    // InternalLidl.g:368:6: lv_nested_2_0= 'with'
                    {
                    lv_nested_2_0=(Token)match(input,19,FOLLOW_10); 

                    						newLeafNode(lv_nested_2_0, grammarAccess.getLidlDataAccess().getNestedWithKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlDataRule());
                    						}
                    						setWithLastConsumed(current, "nested", lv_nested_2_0 != null, "with");
                    					

                    }


                    }

                    // InternalLidl.g:380:4: ( (lv_nestedDef_3_0= ruleLidlData ) )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==18) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalLidl.g:381:5: (lv_nestedDef_3_0= ruleLidlData )
                    	    {
                    	    // InternalLidl.g:381:5: (lv_nestedDef_3_0= ruleLidlData )
                    	    // InternalLidl.g:382:6: lv_nestedDef_3_0= ruleLidlData
                    	    {

                    	    						newCompositeNode(grammarAccess.getLidlDataAccess().getNestedDefLidlDataParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_nestedDef_3_0=ruleLidlData();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLidlDataRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"nestedDef",
                    	    							lv_nestedDef_3_0,
                    	    							"lab.buaa.software.lidl.Lidl.LidlData");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getLidlDataAccess().getIsKeyword_3());
            		
            // InternalLidl.g:404:3: ( ( (lv_definition_5_0= ruleLidlDataType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==22||LA9_0==26) ) {
                alt9=1;
            }
            else if ( (LA9_0==21) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLidl.g:405:4: ( (lv_definition_5_0= ruleLidlDataType ) )
                    {
                    // InternalLidl.g:405:4: ( (lv_definition_5_0= ruleLidlDataType ) )
                    // InternalLidl.g:406:5: (lv_definition_5_0= ruleLidlDataType )
                    {
                    // InternalLidl.g:406:5: (lv_definition_5_0= ruleLidlDataType )
                    // InternalLidl.g:407:6: lv_definition_5_0= ruleLidlDataType
                    {

                    						newCompositeNode(grammarAccess.getLidlDataAccess().getDefinitionLidlDataTypeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_definition_5_0=ruleLidlDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLidlDataRule());
                    						}
                    						set(
                    							current,
                    							"definition",
                    							lv_definition_5_0,
                    							"lab.buaa.software.lidl.Lidl.LidlDataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:425:4: ( (lv_defined_6_0= 'Undefined' ) )
                    {
                    // InternalLidl.g:425:4: ( (lv_defined_6_0= 'Undefined' ) )
                    // InternalLidl.g:426:5: (lv_defined_6_0= 'Undefined' )
                    {
                    // InternalLidl.g:426:5: (lv_defined_6_0= 'Undefined' )
                    // InternalLidl.g:427:6: lv_defined_6_0= 'Undefined'
                    {
                    lv_defined_6_0=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_defined_6_0, grammarAccess.getLidlDataAccess().getDefinedUndefinedKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlDataRule());
                    						}
                    						setWithLastConsumed(current, "defined", lv_defined_6_0 != null, "Undefined");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlData"


    // $ANTLR start "entryRuleLidlDataType"
    // InternalLidl.g:444:1: entryRuleLidlDataType returns [EObject current=null] : iv_ruleLidlDataType= ruleLidlDataType EOF ;
    public final EObject entryRuleLidlDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlDataType = null;


        try {
            // InternalLidl.g:444:53: (iv_ruleLidlDataType= ruleLidlDataType EOF )
            // InternalLidl.g:445:2: iv_ruleLidlDataType= ruleLidlDataType EOF
            {
             newCompositeNode(grammarAccess.getLidlDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlDataType=ruleLidlDataType();

            state._fsp--;

             current =iv_ruleLidlDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlDataType"


    // $ANTLR start "ruleLidlDataType"
    // InternalLidl.g:451:1: ruleLidlDataType returns [EObject current=null] : (this_CompositeDataType_0= ruleCompositeDataType | this_RefDataType_1= ruleRefDataType ) ;
    public final EObject ruleLidlDataType() throws RecognitionException {
        EObject current = null;

        EObject this_CompositeDataType_0 = null;

        EObject this_RefDataType_1 = null;



        	enterRule();

        try {
            // InternalLidl.g:457:2: ( (this_CompositeDataType_0= ruleCompositeDataType | this_RefDataType_1= ruleRefDataType ) )
            // InternalLidl.g:458:2: (this_CompositeDataType_0= ruleCompositeDataType | this_RefDataType_1= ruleRefDataType )
            {
            // InternalLidl.g:458:2: (this_CompositeDataType_0= ruleCompositeDataType | this_RefDataType_1= ruleRefDataType )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID||LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLidl.g:459:3: this_CompositeDataType_0= ruleCompositeDataType
                    {

                    			newCompositeNode(grammarAccess.getLidlDataTypeAccess().getCompositeDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeDataType_0=ruleCompositeDataType();

                    state._fsp--;


                    			current = this_CompositeDataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLidl.g:468:3: this_RefDataType_1= ruleRefDataType
                    {

                    			newCompositeNode(grammarAccess.getLidlDataTypeAccess().getRefDataTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefDataType_1=ruleRefDataType();

                    state._fsp--;


                    			current = this_RefDataType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlDataType"


    // $ANTLR start "entryRuleCompositeDataType"
    // InternalLidl.g:480:1: entryRuleCompositeDataType returns [EObject current=null] : iv_ruleCompositeDataType= ruleCompositeDataType EOF ;
    public final EObject entryRuleCompositeDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDataType = null;


        try {
            // InternalLidl.g:480:58: (iv_ruleCompositeDataType= ruleCompositeDataType EOF )
            // InternalLidl.g:481:2: iv_ruleCompositeDataType= ruleCompositeDataType EOF
            {
             newCompositeNode(grammarAccess.getCompositeDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeDataType=ruleCompositeDataType();

            state._fsp--;

             current =iv_ruleCompositeDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeDataType"


    // $ANTLR start "ruleCompositeDataType"
    // InternalLidl.g:487:1: ruleCompositeDataType returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeDataTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeDataTypeElement ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleCompositeDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:493:2: ( ( () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeDataTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeDataTypeElement ) ) )* otherlv_5= '}' ) )
            // InternalLidl.g:494:2: ( () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeDataTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeDataTypeElement ) ) )* otherlv_5= '}' )
            {
            // InternalLidl.g:494:2: ( () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeDataTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeDataTypeElement ) ) )* otherlv_5= '}' )
            // InternalLidl.g:495:3: () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeDataTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeDataTypeElement ) ) )* otherlv_5= '}'
            {
            // InternalLidl.g:495:3: ()
            // InternalLidl.g:496:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeDataTypeAccess().getCompositeDataTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeDataTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLidl.g:506:3: ( (lv_items_2_0= ruleCompositeDataTypeElement ) )
            // InternalLidl.g:507:4: (lv_items_2_0= ruleCompositeDataTypeElement )
            {
            // InternalLidl.g:507:4: (lv_items_2_0= ruleCompositeDataTypeElement )
            // InternalLidl.g:508:5: lv_items_2_0= ruleCompositeDataTypeElement
            {

            					newCompositeNode(grammarAccess.getCompositeDataTypeAccess().getItemsCompositeDataTypeElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_items_2_0=ruleCompositeDataTypeElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeDataTypeRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"lab.buaa.software.lidl.Lidl.CompositeDataTypeElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLidl.g:525:3: (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeDataTypeElement ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalLidl.g:526:4: otherlv_3= ',' ( (lv_items_4_0= ruleCompositeDataTypeElement ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCompositeDataTypeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalLidl.g:530:4: ( (lv_items_4_0= ruleCompositeDataTypeElement ) )
            	    // InternalLidl.g:531:5: (lv_items_4_0= ruleCompositeDataTypeElement )
            	    {
            	    // InternalLidl.g:531:5: (lv_items_4_0= ruleCompositeDataTypeElement )
            	    // InternalLidl.g:532:6: lv_items_4_0= ruleCompositeDataTypeElement
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeDataTypeAccess().getItemsCompositeDataTypeElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_items_4_0=ruleCompositeDataTypeElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeDataTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_4_0,
            	    							"lab.buaa.software.lidl.Lidl.CompositeDataTypeElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositeDataTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeDataType"


    // $ANTLR start "entryRuleRefDataType"
    // InternalLidl.g:558:1: entryRuleRefDataType returns [EObject current=null] : iv_ruleRefDataType= ruleRefDataType EOF ;
    public final EObject entryRuleRefDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefDataType = null;


        try {
            // InternalLidl.g:558:52: (iv_ruleRefDataType= ruleRefDataType EOF )
            // InternalLidl.g:559:2: iv_ruleRefDataType= ruleRefDataType EOF
            {
             newCompositeNode(grammarAccess.getRefDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefDataType=ruleRefDataType();

            state._fsp--;

             current =iv_ruleRefDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefDataType"


    // $ANTLR start "ruleRefDataType"
    // InternalLidl.g:565:1: ruleRefDataType returns [EObject current=null] : ( () ( (lv_items_1_0= ruleRefDataTypeElement ) ) ) ;
    public final EObject ruleRefDataType() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:571:2: ( ( () ( (lv_items_1_0= ruleRefDataTypeElement ) ) ) )
            // InternalLidl.g:572:2: ( () ( (lv_items_1_0= ruleRefDataTypeElement ) ) )
            {
            // InternalLidl.g:572:2: ( () ( (lv_items_1_0= ruleRefDataTypeElement ) ) )
            // InternalLidl.g:573:3: () ( (lv_items_1_0= ruleRefDataTypeElement ) )
            {
            // InternalLidl.g:573:3: ()
            // InternalLidl.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefDataTypeAccess().getRefDataTypeAction_0(),
            					current);
            			

            }

            // InternalLidl.g:580:3: ( (lv_items_1_0= ruleRefDataTypeElement ) )
            // InternalLidl.g:581:4: (lv_items_1_0= ruleRefDataTypeElement )
            {
            // InternalLidl.g:581:4: (lv_items_1_0= ruleRefDataTypeElement )
            // InternalLidl.g:582:5: lv_items_1_0= ruleRefDataTypeElement
            {

            					newCompositeNode(grammarAccess.getRefDataTypeAccess().getItemsRefDataTypeElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_1_0=ruleRefDataTypeElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefDataTypeRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_1_0,
            						"lab.buaa.software.lidl.Lidl.RefDataTypeElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefDataType"


    // $ANTLR start "entryRuleCompositeDataTypeElement"
    // InternalLidl.g:603:1: entryRuleCompositeDataTypeElement returns [EObject current=null] : iv_ruleCompositeDataTypeElement= ruleCompositeDataTypeElement EOF ;
    public final EObject entryRuleCompositeDataTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeDataTypeElement = null;


        try {
            // InternalLidl.g:603:65: (iv_ruleCompositeDataTypeElement= ruleCompositeDataTypeElement EOF )
            // InternalLidl.g:604:2: iv_ruleCompositeDataTypeElement= ruleCompositeDataTypeElement EOF
            {
             newCompositeNode(grammarAccess.getCompositeDataTypeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeDataTypeElement=ruleCompositeDataTypeElement();

            state._fsp--;

             current =iv_ruleCompositeDataTypeElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeDataTypeElement"


    // $ANTLR start "ruleCompositeDataTypeElement"
    // InternalLidl.g:610:1: ruleCompositeDataTypeElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']' ) ) ) ;
    public final EObject ruleCompositeDataTypeElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_isArray_4_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalLidl.g:616:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']' ) ) ) )
            // InternalLidl.g:617:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']' ) ) )
            {
            // InternalLidl.g:617:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']' ) ) )
            // InternalLidl.g:618:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ruleQualifiedName ) ) | ( ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']' ) )
            {
            // InternalLidl.g:618:3: ()
            // InternalLidl.g:619:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeDataTypeElementAccess().getCompositeDataTypeElementAction_0(),
            					current);
            			

            }

            // InternalLidl.g:625:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLidl.g:626:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLidl.g:626:4: (lv_name_1_0= RULE_ID )
            // InternalLidl.g:627:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositeDataTypeElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeDataTypeElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeDataTypeElementAccess().getColonKeyword_2());
            		
            // InternalLidl.g:647:3: ( ( ( ruleQualifiedName ) ) | ( ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==26) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLidl.g:648:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalLidl.g:648:4: ( ( ruleQualifiedName ) )
                    // InternalLidl.g:649:5: ( ruleQualifiedName )
                    {
                    // InternalLidl.g:649:5: ( ruleQualifiedName )
                    // InternalLidl.g:650:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeDataTypeElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataCrossReference_3_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:665:4: ( ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']' )
                    {
                    // InternalLidl.g:665:4: ( ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']' )
                    // InternalLidl.g:666:5: ( (lv_isArray_4_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_6= ']'
                    {
                    // InternalLidl.g:666:5: ( (lv_isArray_4_0= '[' ) )
                    // InternalLidl.g:667:6: (lv_isArray_4_0= '[' )
                    {
                    // InternalLidl.g:667:6: (lv_isArray_4_0= '[' )
                    // InternalLidl.g:668:7: lv_isArray_4_0= '['
                    {
                    lv_isArray_4_0=(Token)match(input,26,FOLLOW_3); 

                    							newLeafNode(lv_isArray_4_0, grammarAccess.getCompositeDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_3_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCompositeDataTypeElementRule());
                    							}
                    							setWithLastConsumed(current, "isArray", lv_isArray_4_0 != null, "[");
                    						

                    }


                    }

                    // InternalLidl.g:680:5: ( ( ruleQualifiedName ) )
                    // InternalLidl.g:681:6: ( ruleQualifiedName )
                    {
                    // InternalLidl.g:681:6: ( ruleQualifiedName )
                    // InternalLidl.g:682:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCompositeDataTypeElementRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getCompositeDataTypeElementAccess().getTypeLidlDataCrossReference_3_1_1_0());
                    						
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(otherlv_6, grammarAccess.getCompositeDataTypeElementAccess().getRightSquareBracketKeyword_3_1_2());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeDataTypeElement"


    // $ANTLR start "entryRuleRefDataTypeElement"
    // InternalLidl.g:706:1: entryRuleRefDataTypeElement returns [EObject current=null] : iv_ruleRefDataTypeElement= ruleRefDataTypeElement EOF ;
    public final EObject entryRuleRefDataTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefDataTypeElement = null;


        try {
            // InternalLidl.g:706:59: (iv_ruleRefDataTypeElement= ruleRefDataTypeElement EOF )
            // InternalLidl.g:707:2: iv_ruleRefDataTypeElement= ruleRefDataTypeElement EOF
            {
             newCompositeNode(grammarAccess.getRefDataTypeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefDataTypeElement=ruleRefDataTypeElement();

            state._fsp--;

             current =iv_ruleRefDataTypeElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefDataTypeElement"


    // $ANTLR start "ruleRefDataTypeElement"
    // InternalLidl.g:713:1: ruleRefDataTypeElement returns [EObject current=null] : ( ( () ( ( ruleQualifiedName ) ) ) | ( ( (lv_isArray_2_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleRefDataTypeElement() throws RecognitionException {
        EObject current = null;

        Token lv_isArray_2_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLidl.g:719:2: ( ( ( () ( ( ruleQualifiedName ) ) ) | ( ( (lv_isArray_2_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_4= ']' ) ) )
            // InternalLidl.g:720:2: ( ( () ( ( ruleQualifiedName ) ) ) | ( ( (lv_isArray_2_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_4= ']' ) )
            {
            // InternalLidl.g:720:2: ( ( () ( ( ruleQualifiedName ) ) ) | ( ( (lv_isArray_2_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_4= ']' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==26) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLidl.g:721:3: ( () ( ( ruleQualifiedName ) ) )
                    {
                    // InternalLidl.g:721:3: ( () ( ( ruleQualifiedName ) ) )
                    // InternalLidl.g:722:4: () ( ( ruleQualifiedName ) )
                    {
                    // InternalLidl.g:722:4: ()
                    // InternalLidl.g:723:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRefDataTypeElementAccess().getRefDataTypeElementAction_0_0(),
                    						current);
                    				

                    }

                    // InternalLidl.g:729:4: ( ( ruleQualifiedName ) )
                    // InternalLidl.g:730:5: ( ruleQualifiedName )
                    {
                    // InternalLidl.g:730:5: ( ruleQualifiedName )
                    // InternalLidl.g:731:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRefDataTypeElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataCrossReference_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:747:3: ( ( (lv_isArray_2_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_4= ']' )
                    {
                    // InternalLidl.g:747:3: ( ( (lv_isArray_2_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_4= ']' )
                    // InternalLidl.g:748:4: ( (lv_isArray_2_0= '[' ) ) ( ( ruleQualifiedName ) ) otherlv_4= ']'
                    {
                    // InternalLidl.g:748:4: ( (lv_isArray_2_0= '[' ) )
                    // InternalLidl.g:749:5: (lv_isArray_2_0= '[' )
                    {
                    // InternalLidl.g:749:5: (lv_isArray_2_0= '[' )
                    // InternalLidl.g:750:6: lv_isArray_2_0= '['
                    {
                    lv_isArray_2_0=(Token)match(input,26,FOLLOW_3); 

                    						newLeafNode(lv_isArray_2_0, grammarAccess.getRefDataTypeElementAccess().getIsArrayLeftSquareBracketKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRefDataTypeElementRule());
                    						}
                    						setWithLastConsumed(current, "isArray", lv_isArray_2_0 != null, "[");
                    					

                    }


                    }

                    // InternalLidl.g:762:4: ( ( ruleQualifiedName ) )
                    // InternalLidl.g:763:5: ( ruleQualifiedName )
                    {
                    // InternalLidl.g:763:5: ( ruleQualifiedName )
                    // InternalLidl.g:764:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRefDataTypeElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRefDataTypeElementAccess().getTypeLidlDataCrossReference_1_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getRefDataTypeElementAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefDataTypeElement"


    // $ANTLR start "entryRuleLidlInterface"
    // InternalLidl.g:787:1: entryRuleLidlInterface returns [EObject current=null] : iv_ruleLidlInterface= ruleLidlInterface EOF ;
    public final EObject entryRuleLidlInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlInterface = null;


        try {
            // InternalLidl.g:787:54: (iv_ruleLidlInterface= ruleLidlInterface EOF )
            // InternalLidl.g:788:2: iv_ruleLidlInterface= ruleLidlInterface EOF
            {
             newCompositeNode(grammarAccess.getLidlInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlInterface=ruleLidlInterface();

            state._fsp--;

             current =iv_ruleLidlInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlInterface"


    // $ANTLR start "ruleLidlInterface"
    // InternalLidl.g:794:1: ruleLidlInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlInterface ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlInterfaceType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) ) ) ;
    public final EObject ruleLidlInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token lv_nested_2_0=null;
        Token otherlv_4=null;
        Token lv_defined_6_0=null;
        EObject lv_nestedDef_3_0 = null;

        EObject lv_definition_5_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:800:2: ( (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlInterface ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlInterfaceType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) ) ) )
            // InternalLidl.g:801:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlInterface ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlInterfaceType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) ) )
            {
            // InternalLidl.g:801:2: (otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlInterface ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlInterfaceType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) ) )
            // InternalLidl.g:802:3: otherlv_0= 'interface' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlInterface ) )+ )? otherlv_4= 'is' ( ( (lv_definition_5_0= ruleLidlInterfaceType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLidlInterfaceAccess().getInterfaceKeyword_0());
            		
            // InternalLidl.g:806:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLidl.g:807:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLidl.g:807:4: (lv_name_1_0= RULE_ID )
            // InternalLidl.g:808:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLidlInterfaceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLidlInterfaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalLidl.g:824:3: ( ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlInterface ) )+ )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLidl.g:825:4: ( (lv_nested_2_0= 'with' ) ) ( (lv_nestedDef_3_0= ruleLidlInterface ) )+
                    {
                    // InternalLidl.g:825:4: ( (lv_nested_2_0= 'with' ) )
                    // InternalLidl.g:826:5: (lv_nested_2_0= 'with' )
                    {
                    // InternalLidl.g:826:5: (lv_nested_2_0= 'with' )
                    // InternalLidl.g:827:6: lv_nested_2_0= 'with'
                    {
                    lv_nested_2_0=(Token)match(input,19,FOLLOW_17); 

                    						newLeafNode(lv_nested_2_0, grammarAccess.getLidlInterfaceAccess().getNestedWithKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlInterfaceRule());
                    						}
                    						setWithLastConsumed(current, "nested", lv_nested_2_0 != null, "with");
                    					

                    }


                    }

                    // InternalLidl.g:839:4: ( (lv_nestedDef_3_0= ruleLidlInterface ) )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==28) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalLidl.g:840:5: (lv_nestedDef_3_0= ruleLidlInterface )
                    	    {
                    	    // InternalLidl.g:840:5: (lv_nestedDef_3_0= ruleLidlInterface )
                    	    // InternalLidl.g:841:6: lv_nestedDef_3_0= ruleLidlInterface
                    	    {

                    	    						newCompositeNode(grammarAccess.getLidlInterfaceAccess().getNestedDefLidlInterfaceParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_nestedDef_3_0=ruleLidlInterface();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLidlInterfaceRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"nestedDef",
                    	    							lv_nestedDef_3_0,
                    	    							"lab.buaa.software.lidl.Lidl.LidlInterface");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,20,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getLidlInterfaceAccess().getIsKeyword_3());
            		
            // InternalLidl.g:863:3: ( ( (lv_definition_5_0= ruleLidlInterfaceType ) ) | ( (lv_defined_6_0= 'Undefined' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==22) ) {
                alt16=1;
            }
            else if ( (LA16_0==21) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalLidl.g:864:4: ( (lv_definition_5_0= ruleLidlInterfaceType ) )
                    {
                    // InternalLidl.g:864:4: ( (lv_definition_5_0= ruleLidlInterfaceType ) )
                    // InternalLidl.g:865:5: (lv_definition_5_0= ruleLidlInterfaceType )
                    {
                    // InternalLidl.g:865:5: (lv_definition_5_0= ruleLidlInterfaceType )
                    // InternalLidl.g:866:6: lv_definition_5_0= ruleLidlInterfaceType
                    {

                    						newCompositeNode(grammarAccess.getLidlInterfaceAccess().getDefinitionLidlInterfaceTypeParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_definition_5_0=ruleLidlInterfaceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLidlInterfaceRule());
                    						}
                    						set(
                    							current,
                    							"definition",
                    							lv_definition_5_0,
                    							"lab.buaa.software.lidl.Lidl.LidlInterfaceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:884:4: ( (lv_defined_6_0= 'Undefined' ) )
                    {
                    // InternalLidl.g:884:4: ( (lv_defined_6_0= 'Undefined' ) )
                    // InternalLidl.g:885:5: (lv_defined_6_0= 'Undefined' )
                    {
                    // InternalLidl.g:885:5: (lv_defined_6_0= 'Undefined' )
                    // InternalLidl.g:886:6: lv_defined_6_0= 'Undefined'
                    {
                    lv_defined_6_0=(Token)match(input,21,FOLLOW_2); 

                    						newLeafNode(lv_defined_6_0, grammarAccess.getLidlInterfaceAccess().getDefinedUndefinedKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlInterfaceRule());
                    						}
                    						setWithLastConsumed(current, "defined", lv_defined_6_0 != null, "Undefined");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlInterface"


    // $ANTLR start "entryRuleLidlInterfaceType"
    // InternalLidl.g:903:1: entryRuleLidlInterfaceType returns [EObject current=null] : iv_ruleLidlInterfaceType= ruleLidlInterfaceType EOF ;
    public final EObject entryRuleLidlInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlInterfaceType = null;


        try {
            // InternalLidl.g:903:58: (iv_ruleLidlInterfaceType= ruleLidlInterfaceType EOF )
            // InternalLidl.g:904:2: iv_ruleLidlInterfaceType= ruleLidlInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getLidlInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlInterfaceType=ruleLidlInterfaceType();

            state._fsp--;

             current =iv_ruleLidlInterfaceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlInterfaceType"


    // $ANTLR start "ruleLidlInterfaceType"
    // InternalLidl.g:910:1: ruleLidlInterfaceType returns [EObject current=null] : (this_AtomInterfaceType_0= ruleAtomInterfaceType | this_CompositeInterfaceType_1= ruleCompositeInterfaceType | (this_RefInterfaceType_2= ruleRefInterfaceType ( (lv_conjugate_3_0= '\\'' ) )? ) ) ;
    public final EObject ruleLidlInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_conjugate_3_0=null;
        EObject this_AtomInterfaceType_0 = null;

        EObject this_CompositeInterfaceType_1 = null;

        EObject this_RefInterfaceType_2 = null;



        	enterRule();

        try {
            // InternalLidl.g:916:2: ( (this_AtomInterfaceType_0= ruleAtomInterfaceType | this_CompositeInterfaceType_1= ruleCompositeInterfaceType | (this_RefInterfaceType_2= ruleRefInterfaceType ( (lv_conjugate_3_0= '\\'' ) )? ) ) )
            // InternalLidl.g:917:2: (this_AtomInterfaceType_0= ruleAtomInterfaceType | this_CompositeInterfaceType_1= ruleCompositeInterfaceType | (this_RefInterfaceType_2= ruleRefInterfaceType ( (lv_conjugate_3_0= '\\'' ) )? ) )
            {
            // InternalLidl.g:917:2: (this_AtomInterfaceType_0= ruleAtomInterfaceType | this_CompositeInterfaceType_1= ruleCompositeInterfaceType | (this_RefInterfaceType_2= ruleRefInterfaceType ( (lv_conjugate_3_0= '\\'' ) )? ) )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalLidl.g:918:3: this_AtomInterfaceType_0= ruleAtomInterfaceType
                    {

                    			newCompositeNode(grammarAccess.getLidlInterfaceTypeAccess().getAtomInterfaceTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_AtomInterfaceType_0=ruleAtomInterfaceType();

                    state._fsp--;


                    			current = this_AtomInterfaceType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLidl.g:927:3: this_CompositeInterfaceType_1= ruleCompositeInterfaceType
                    {

                    			newCompositeNode(grammarAccess.getLidlInterfaceTypeAccess().getCompositeInterfaceTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeInterfaceType_1=ruleCompositeInterfaceType();

                    state._fsp--;


                    			current = this_CompositeInterfaceType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLidl.g:936:3: (this_RefInterfaceType_2= ruleRefInterfaceType ( (lv_conjugate_3_0= '\\'' ) )? )
                    {
                    // InternalLidl.g:936:3: (this_RefInterfaceType_2= ruleRefInterfaceType ( (lv_conjugate_3_0= '\\'' ) )? )
                    // InternalLidl.g:937:4: this_RefInterfaceType_2= ruleRefInterfaceType ( (lv_conjugate_3_0= '\\'' ) )?
                    {

                    				newCompositeNode(grammarAccess.getLidlInterfaceTypeAccess().getRefInterfaceTypeParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_20);
                    this_RefInterfaceType_2=ruleRefInterfaceType();

                    state._fsp--;


                    				current = this_RefInterfaceType_2;
                    				afterParserOrEnumRuleCall();
                    			
                    // InternalLidl.g:945:4: ( (lv_conjugate_3_0= '\\'' ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==29) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalLidl.g:946:5: (lv_conjugate_3_0= '\\'' )
                            {
                            // InternalLidl.g:946:5: (lv_conjugate_3_0= '\\'' )
                            // InternalLidl.g:947:6: lv_conjugate_3_0= '\\''
                            {
                            lv_conjugate_3_0=(Token)match(input,29,FOLLOW_2); 

                            						newLeafNode(lv_conjugate_3_0, grammarAccess.getLidlInterfaceTypeAccess().getConjugateApostropheKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getLidlInterfaceTypeRule());
                            						}
                            						setWithLastConsumed(current, "conjugate", lv_conjugate_3_0 != null, "\'");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlInterfaceType"


    // $ANTLR start "entryRuleAtomInterfaceTypeElement"
    // InternalLidl.g:964:1: entryRuleAtomInterfaceTypeElement returns [EObject current=null] : iv_ruleAtomInterfaceTypeElement= ruleAtomInterfaceTypeElement EOF ;
    public final EObject entryRuleAtomInterfaceTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomInterfaceTypeElement = null;


        try {
            // InternalLidl.g:964:65: (iv_ruleAtomInterfaceTypeElement= ruleAtomInterfaceTypeElement EOF )
            // InternalLidl.g:965:2: iv_ruleAtomInterfaceTypeElement= ruleAtomInterfaceTypeElement EOF
            {
             newCompositeNode(grammarAccess.getAtomInterfaceTypeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomInterfaceTypeElement=ruleAtomInterfaceTypeElement();

            state._fsp--;

             current =iv_ruleAtomInterfaceTypeElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomInterfaceTypeElement"


    // $ANTLR start "ruleAtomInterfaceTypeElement"
    // InternalLidl.g:971:1: ruleAtomInterfaceTypeElement returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleDataDirection ) ) ) ;
    public final EObject ruleAtomInterfaceTypeElement() throws RecognitionException {
        EObject current = null;

        Enumerator lv_direction_2_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:977:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleDataDirection ) ) ) )
            // InternalLidl.g:978:2: ( () ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleDataDirection ) ) )
            {
            // InternalLidl.g:978:2: ( () ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleDataDirection ) ) )
            // InternalLidl.g:979:3: () ( ( ruleQualifiedName ) ) ( (lv_direction_2_0= ruleDataDirection ) )
            {
            // InternalLidl.g:979:3: ()
            // InternalLidl.g:980:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomInterfaceTypeElementAccess().getAtomInterfaceTypeElementAction_0(),
            					current);
            			

            }

            // InternalLidl.g:986:3: ( ( ruleQualifiedName ) )
            // InternalLidl.g:987:4: ( ruleQualifiedName )
            {
            // InternalLidl.g:987:4: ( ruleQualifiedName )
            // InternalLidl.g:988:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtomInterfaceTypeElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAtomInterfaceTypeElementAccess().getTypeLidlDataCrossReference_1_0());
            				
            pushFollow(FOLLOW_21);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLidl.g:1002:3: ( (lv_direction_2_0= ruleDataDirection ) )
            // InternalLidl.g:1003:4: (lv_direction_2_0= ruleDataDirection )
            {
            // InternalLidl.g:1003:4: (lv_direction_2_0= ruleDataDirection )
            // InternalLidl.g:1004:5: lv_direction_2_0= ruleDataDirection
            {

            					newCompositeNode(grammarAccess.getAtomInterfaceTypeElementAccess().getDirectionDataDirectionEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_direction_2_0=ruleDataDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomInterfaceTypeElementRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_2_0,
            						"lab.buaa.software.lidl.Lidl.DataDirection");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomInterfaceTypeElement"


    // $ANTLR start "entryRuleCompositeInterfaceTypeElement"
    // InternalLidl.g:1025:1: entryRuleCompositeInterfaceTypeElement returns [EObject current=null] : iv_ruleCompositeInterfaceTypeElement= ruleCompositeInterfaceTypeElement EOF ;
    public final EObject entryRuleCompositeInterfaceTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeInterfaceTypeElement = null;


        try {
            // InternalLidl.g:1025:70: (iv_ruleCompositeInterfaceTypeElement= ruleCompositeInterfaceTypeElement EOF )
            // InternalLidl.g:1026:2: iv_ruleCompositeInterfaceTypeElement= ruleCompositeInterfaceTypeElement EOF
            {
             newCompositeNode(grammarAccess.getCompositeInterfaceTypeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeInterfaceTypeElement=ruleCompositeInterfaceTypeElement();

            state._fsp--;

             current =iv_ruleCompositeInterfaceTypeElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeInterfaceTypeElement"


    // $ANTLR start "ruleCompositeInterfaceTypeElement"
    // InternalLidl.g:1032:1: ruleCompositeInterfaceTypeElement returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) ) | ( ( ruleQualifiedName ) ) ) ) ;
    public final EObject ruleCompositeInterfaceTypeElement() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Enumerator lv_direction_4_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1038:2: ( ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) ) | ( ( ruleQualifiedName ) ) ) ) )
            // InternalLidl.g:1039:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) ) | ( ( ruleQualifiedName ) ) ) )
            {
            // InternalLidl.g:1039:2: ( () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) ) | ( ( ruleQualifiedName ) ) ) )
            // InternalLidl.g:1040:3: () ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) ) | ( ( ruleQualifiedName ) ) )
            {
            // InternalLidl.g:1040:3: ()
            // InternalLidl.g:1041:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeInterfaceTypeElementAccess().getCompositeInterfaceTypeElementAction_0(),
            					current);
            			

            }

            // InternalLidl.g:1047:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLidl.g:1048:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLidl.g:1048:4: (lv_name_1_0= RULE_ID )
            // InternalLidl.g:1049:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompositeInterfaceTypeElementAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompositeInterfaceTypeElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCompositeInterfaceTypeElementAccess().getColonKeyword_2());
            		
            // InternalLidl.g:1069:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) ) | ( ( ruleQualifiedName ) ) )
            int alt19=2;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalLidl.g:1070:4: ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) )
                    {
                    // InternalLidl.g:1070:4: ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) )
                    // InternalLidl.g:1071:5: ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) )
                    {
                    // InternalLidl.g:1071:5: ( ( ruleQualifiedName ) )
                    // InternalLidl.g:1072:6: ( ruleQualifiedName )
                    {
                    // InternalLidl.g:1072:6: ( ruleQualifiedName )
                    // InternalLidl.g:1073:7: ruleQualifiedName
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getCompositeInterfaceTypeElementRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlDataCrossReference_3_0_0_0());
                    						
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalLidl.g:1087:5: ( (lv_direction_4_0= ruleDataDirection ) )
                    // InternalLidl.g:1088:6: (lv_direction_4_0= ruleDataDirection )
                    {
                    // InternalLidl.g:1088:6: (lv_direction_4_0= ruleDataDirection )
                    // InternalLidl.g:1089:7: lv_direction_4_0= ruleDataDirection
                    {

                    							newCompositeNode(grammarAccess.getCompositeInterfaceTypeElementAccess().getDirectionDataDirectionEnumRuleCall_3_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_direction_4_0=ruleDataDirection();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getCompositeInterfaceTypeElementRule());
                    							}
                    							set(
                    								current,
                    								"direction",
                    								lv_direction_4_0,
                    								"lab.buaa.software.lidl.Lidl.DataDirection");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1108:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalLidl.g:1108:4: ( ( ruleQualifiedName ) )
                    // InternalLidl.g:1109:5: ( ruleQualifiedName )
                    {
                    // InternalLidl.g:1109:5: ( ruleQualifiedName )
                    // InternalLidl.g:1110:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCompositeInterfaceTypeElementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCompositeInterfaceTypeElementAccess().getTypeLidlInterfaceCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeInterfaceTypeElement"


    // $ANTLR start "entryRuleRefInterfaceTypeElement"
    // InternalLidl.g:1129:1: entryRuleRefInterfaceTypeElement returns [EObject current=null] : iv_ruleRefInterfaceTypeElement= ruleRefInterfaceTypeElement EOF ;
    public final EObject entryRuleRefInterfaceTypeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefInterfaceTypeElement = null;


        try {
            // InternalLidl.g:1129:64: (iv_ruleRefInterfaceTypeElement= ruleRefInterfaceTypeElement EOF )
            // InternalLidl.g:1130:2: iv_ruleRefInterfaceTypeElement= ruleRefInterfaceTypeElement EOF
            {
             newCompositeNode(grammarAccess.getRefInterfaceTypeElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefInterfaceTypeElement=ruleRefInterfaceTypeElement();

            state._fsp--;

             current =iv_ruleRefInterfaceTypeElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefInterfaceTypeElement"


    // $ANTLR start "ruleRefInterfaceTypeElement"
    // InternalLidl.g:1136:1: ruleRefInterfaceTypeElement returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleRefInterfaceTypeElement() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalLidl.g:1142:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalLidl.g:1143:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalLidl.g:1143:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalLidl.g:1144:3: () ( ( ruleQualifiedName ) )
            {
            // InternalLidl.g:1144:3: ()
            // InternalLidl.g:1145:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefInterfaceTypeElementAccess().getRefInterfaceTypeElementAction_0(),
            					current);
            			

            }

            // InternalLidl.g:1151:3: ( ( ruleQualifiedName ) )
            // InternalLidl.g:1152:4: ( ruleQualifiedName )
            {
            // InternalLidl.g:1152:4: ( ruleQualifiedName )
            // InternalLidl.g:1153:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRefInterfaceTypeElementRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRefInterfaceTypeElementAccess().getTypeLidlInterfaceCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefInterfaceTypeElement"


    // $ANTLR start "entryRuleAtomInterfaceType"
    // InternalLidl.g:1171:1: entryRuleAtomInterfaceType returns [EObject current=null] : iv_ruleAtomInterfaceType= ruleAtomInterfaceType EOF ;
    public final EObject entryRuleAtomInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomInterfaceType = null;


        try {
            // InternalLidl.g:1171:58: (iv_ruleAtomInterfaceType= ruleAtomInterfaceType EOF )
            // InternalLidl.g:1172:2: iv_ruleAtomInterfaceType= ruleAtomInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getAtomInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomInterfaceType=ruleAtomInterfaceType();

            state._fsp--;

             current =iv_ruleAtomInterfaceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomInterfaceType"


    // $ANTLR start "ruleAtomInterfaceType"
    // InternalLidl.g:1178:1: ruleAtomInterfaceType returns [EObject current=null] : ( () ( (lv_items_1_0= ruleAtomInterfaceTypeElement ) ) ) ;
    public final EObject ruleAtomInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1184:2: ( ( () ( (lv_items_1_0= ruleAtomInterfaceTypeElement ) ) ) )
            // InternalLidl.g:1185:2: ( () ( (lv_items_1_0= ruleAtomInterfaceTypeElement ) ) )
            {
            // InternalLidl.g:1185:2: ( () ( (lv_items_1_0= ruleAtomInterfaceTypeElement ) ) )
            // InternalLidl.g:1186:3: () ( (lv_items_1_0= ruleAtomInterfaceTypeElement ) )
            {
            // InternalLidl.g:1186:3: ()
            // InternalLidl.g:1187:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomInterfaceTypeAccess().getAtomInterfaceTypeAction_0(),
            					current);
            			

            }

            // InternalLidl.g:1193:3: ( (lv_items_1_0= ruleAtomInterfaceTypeElement ) )
            // InternalLidl.g:1194:4: (lv_items_1_0= ruleAtomInterfaceTypeElement )
            {
            // InternalLidl.g:1194:4: (lv_items_1_0= ruleAtomInterfaceTypeElement )
            // InternalLidl.g:1195:5: lv_items_1_0= ruleAtomInterfaceTypeElement
            {

            					newCompositeNode(grammarAccess.getAtomInterfaceTypeAccess().getItemsAtomInterfaceTypeElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_1_0=ruleAtomInterfaceTypeElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomInterfaceTypeRule());
            					}
            					set(
            						current,
            						"items",
            						lv_items_1_0,
            						"lab.buaa.software.lidl.Lidl.AtomInterfaceTypeElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomInterfaceType"


    // $ANTLR start "entryRuleCompositeInterfaceType"
    // InternalLidl.g:1216:1: entryRuleCompositeInterfaceType returns [EObject current=null] : iv_ruleCompositeInterfaceType= ruleCompositeInterfaceType EOF ;
    public final EObject entryRuleCompositeInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeInterfaceType = null;


        try {
            // InternalLidl.g:1216:63: (iv_ruleCompositeInterfaceType= ruleCompositeInterfaceType EOF )
            // InternalLidl.g:1217:2: iv_ruleCompositeInterfaceType= ruleCompositeInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getCompositeInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeInterfaceType=ruleCompositeInterfaceType();

            state._fsp--;

             current =iv_ruleCompositeInterfaceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeInterfaceType"


    // $ANTLR start "ruleCompositeInterfaceType"
    // InternalLidl.g:1223:1: ruleCompositeInterfaceType returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeInterfaceTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeInterfaceTypeElement ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleCompositeInterfaceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1229:2: ( ( () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeInterfaceTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeInterfaceTypeElement ) ) )* otherlv_5= '}' ) )
            // InternalLidl.g:1230:2: ( () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeInterfaceTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeInterfaceTypeElement ) ) )* otherlv_5= '}' )
            {
            // InternalLidl.g:1230:2: ( () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeInterfaceTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeInterfaceTypeElement ) ) )* otherlv_5= '}' )
            // InternalLidl.g:1231:3: () otherlv_1= '{' ( (lv_items_2_0= ruleCompositeInterfaceTypeElement ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeInterfaceTypeElement ) ) )* otherlv_5= '}'
            {
            // InternalLidl.g:1231:3: ()
            // InternalLidl.g:1232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeInterfaceTypeAccess().getCompositeInterfaceTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCompositeInterfaceTypeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalLidl.g:1242:3: ( (lv_items_2_0= ruleCompositeInterfaceTypeElement ) )
            // InternalLidl.g:1243:4: (lv_items_2_0= ruleCompositeInterfaceTypeElement )
            {
            // InternalLidl.g:1243:4: (lv_items_2_0= ruleCompositeInterfaceTypeElement )
            // InternalLidl.g:1244:5: lv_items_2_0= ruleCompositeInterfaceTypeElement
            {

            					newCompositeNode(grammarAccess.getCompositeInterfaceTypeAccess().getItemsCompositeInterfaceTypeElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_items_2_0=ruleCompositeInterfaceTypeElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCompositeInterfaceTypeRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_2_0,
            						"lab.buaa.software.lidl.Lidl.CompositeInterfaceTypeElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLidl.g:1261:3: (otherlv_3= ',' ( (lv_items_4_0= ruleCompositeInterfaceTypeElement ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==23) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLidl.g:1262:4: otherlv_3= ',' ( (lv_items_4_0= ruleCompositeInterfaceTypeElement ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCompositeInterfaceTypeAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalLidl.g:1266:4: ( (lv_items_4_0= ruleCompositeInterfaceTypeElement ) )
            	    // InternalLidl.g:1267:5: (lv_items_4_0= ruleCompositeInterfaceTypeElement )
            	    {
            	    // InternalLidl.g:1267:5: (lv_items_4_0= ruleCompositeInterfaceTypeElement )
            	    // InternalLidl.g:1268:6: lv_items_4_0= ruleCompositeInterfaceTypeElement
            	    {

            	    						newCompositeNode(grammarAccess.getCompositeInterfaceTypeAccess().getItemsCompositeInterfaceTypeElementParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_items_4_0=ruleCompositeInterfaceTypeElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCompositeInterfaceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_4_0,
            	    							"lab.buaa.software.lidl.Lidl.CompositeInterfaceTypeElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCompositeInterfaceTypeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeInterfaceType"


    // $ANTLR start "entryRuleRefInterfaceType"
    // InternalLidl.g:1294:1: entryRuleRefInterfaceType returns [EObject current=null] : iv_ruleRefInterfaceType= ruleRefInterfaceType EOF ;
    public final EObject entryRuleRefInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefInterfaceType = null;


        try {
            // InternalLidl.g:1294:57: (iv_ruleRefInterfaceType= ruleRefInterfaceType EOF )
            // InternalLidl.g:1295:2: iv_ruleRefInterfaceType= ruleRefInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getRefInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefInterfaceType=ruleRefInterfaceType();

            state._fsp--;

             current =iv_ruleRefInterfaceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefInterfaceType"


    // $ANTLR start "ruleRefInterfaceType"
    // InternalLidl.g:1301:1: ruleRefInterfaceType returns [EObject current=null] : ( () ( (lv_items_1_0= ruleRefInterfaceTypeElement ) ) ) ;
    public final EObject ruleRefInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1307:2: ( ( () ( (lv_items_1_0= ruleRefInterfaceTypeElement ) ) ) )
            // InternalLidl.g:1308:2: ( () ( (lv_items_1_0= ruleRefInterfaceTypeElement ) ) )
            {
            // InternalLidl.g:1308:2: ( () ( (lv_items_1_0= ruleRefInterfaceTypeElement ) ) )
            // InternalLidl.g:1309:3: () ( (lv_items_1_0= ruleRefInterfaceTypeElement ) )
            {
            // InternalLidl.g:1309:3: ()
            // InternalLidl.g:1310:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRefInterfaceTypeAccess().getRefInterfaceTypeAction_0(),
            					current);
            			

            }

            // InternalLidl.g:1316:3: ( (lv_items_1_0= ruleRefInterfaceTypeElement ) )
            // InternalLidl.g:1317:4: (lv_items_1_0= ruleRefInterfaceTypeElement )
            {
            // InternalLidl.g:1317:4: (lv_items_1_0= ruleRefInterfaceTypeElement )
            // InternalLidl.g:1318:5: lv_items_1_0= ruleRefInterfaceTypeElement
            {

            					newCompositeNode(grammarAccess.getRefInterfaceTypeAccess().getItemsRefInterfaceTypeElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_items_1_0=ruleRefInterfaceTypeElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRefInterfaceTypeRule());
            					}
            					set(
            						current,
            						"items",
            						lv_items_1_0,
            						"lab.buaa.software.lidl.Lidl.RefInterfaceTypeElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefInterfaceType"


    // $ANTLR start "entryRuleLidlInteraction"
    // InternalLidl.g:1339:1: entryRuleLidlInteraction returns [EObject current=null] : iv_ruleLidlInteraction= ruleLidlInteraction EOF ;
    public final EObject entryRuleLidlInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlInteraction = null;


        try {
            // InternalLidl.g:1339:56: (iv_ruleLidlInteraction= ruleLidlInteraction EOF )
            // InternalLidl.g:1340:2: iv_ruleLidlInteraction= ruleLidlInteraction EOF
            {
             newCompositeNode(grammarAccess.getLidlInteractionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlInteraction=ruleLidlInteraction();

            state._fsp--;

             current =iv_ruleLidlInteraction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlInteraction"


    // $ANTLR start "ruleLidlInteraction"
    // InternalLidl.g:1346:1: ruleLidlInteraction returns [EObject current=null] : (otherlv_0= 'interaction' ( (lv_id_1_0= ruleLidlInteractionID ) ) otherlv_2= ':' ( (lv_interface_3_0= ruleLidlInterfaceType ) ) ( ( (lv_nested_4_0= 'with' ) ) ( (lv_nestedDef_5_0= ruleLidlInteraction ) )+ )? otherlv_6= 'is' otherlv_7= '(' ( (lv_definition_8_0= ruleLidlExpression ) ) otherlv_9= ')' ) ;
    public final EObject ruleLidlInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_nested_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_id_1_0 = null;

        EObject lv_interface_3_0 = null;

        EObject lv_nestedDef_5_0 = null;

        EObject lv_definition_8_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1352:2: ( (otherlv_0= 'interaction' ( (lv_id_1_0= ruleLidlInteractionID ) ) otherlv_2= ':' ( (lv_interface_3_0= ruleLidlInterfaceType ) ) ( ( (lv_nested_4_0= 'with' ) ) ( (lv_nestedDef_5_0= ruleLidlInteraction ) )+ )? otherlv_6= 'is' otherlv_7= '(' ( (lv_definition_8_0= ruleLidlExpression ) ) otherlv_9= ')' ) )
            // InternalLidl.g:1353:2: (otherlv_0= 'interaction' ( (lv_id_1_0= ruleLidlInteractionID ) ) otherlv_2= ':' ( (lv_interface_3_0= ruleLidlInterfaceType ) ) ( ( (lv_nested_4_0= 'with' ) ) ( (lv_nestedDef_5_0= ruleLidlInteraction ) )+ )? otherlv_6= 'is' otherlv_7= '(' ( (lv_definition_8_0= ruleLidlExpression ) ) otherlv_9= ')' )
            {
            // InternalLidl.g:1353:2: (otherlv_0= 'interaction' ( (lv_id_1_0= ruleLidlInteractionID ) ) otherlv_2= ':' ( (lv_interface_3_0= ruleLidlInterfaceType ) ) ( ( (lv_nested_4_0= 'with' ) ) ( (lv_nestedDef_5_0= ruleLidlInteraction ) )+ )? otherlv_6= 'is' otherlv_7= '(' ( (lv_definition_8_0= ruleLidlExpression ) ) otherlv_9= ')' )
            // InternalLidl.g:1354:3: otherlv_0= 'interaction' ( (lv_id_1_0= ruleLidlInteractionID ) ) otherlv_2= ':' ( (lv_interface_3_0= ruleLidlInterfaceType ) ) ( ( (lv_nested_4_0= 'with' ) ) ( (lv_nestedDef_5_0= ruleLidlInteraction ) )+ )? otherlv_6= 'is' otherlv_7= '(' ( (lv_definition_8_0= ruleLidlExpression ) ) otherlv_9= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getLidlInteractionAccess().getInteractionKeyword_0());
            		
            // InternalLidl.g:1358:3: ( (lv_id_1_0= ruleLidlInteractionID ) )
            // InternalLidl.g:1359:4: (lv_id_1_0= ruleLidlInteractionID )
            {
            // InternalLidl.g:1359:4: (lv_id_1_0= ruleLidlInteractionID )
            // InternalLidl.g:1360:5: lv_id_1_0= ruleLidlInteractionID
            {

            					newCompositeNode(grammarAccess.getLidlInteractionAccess().getIdLidlInteractionIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_id_1_0=ruleLidlInteractionID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLidlInteractionRule());
            					}
            					set(
            						current,
            						"id",
            						lv_id_1_0,
            						"lab.buaa.software.lidl.Lidl.LidlInteractionID");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getLidlInteractionAccess().getColonKeyword_2());
            		
            // InternalLidl.g:1381:3: ( (lv_interface_3_0= ruleLidlInterfaceType ) )
            // InternalLidl.g:1382:4: (lv_interface_3_0= ruleLidlInterfaceType )
            {
            // InternalLidl.g:1382:4: (lv_interface_3_0= ruleLidlInterfaceType )
            // InternalLidl.g:1383:5: lv_interface_3_0= ruleLidlInterfaceType
            {

            					newCompositeNode(grammarAccess.getLidlInteractionAccess().getInterfaceLidlInterfaceTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_interface_3_0=ruleLidlInterfaceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLidlInteractionRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_3_0,
            						"lab.buaa.software.lidl.Lidl.LidlInterfaceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLidl.g:1400:3: ( ( (lv_nested_4_0= 'with' ) ) ( (lv_nestedDef_5_0= ruleLidlInteraction ) )+ )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLidl.g:1401:4: ( (lv_nested_4_0= 'with' ) ) ( (lv_nestedDef_5_0= ruleLidlInteraction ) )+
                    {
                    // InternalLidl.g:1401:4: ( (lv_nested_4_0= 'with' ) )
                    // InternalLidl.g:1402:5: (lv_nested_4_0= 'with' )
                    {
                    // InternalLidl.g:1402:5: (lv_nested_4_0= 'with' )
                    // InternalLidl.g:1403:6: lv_nested_4_0= 'with'
                    {
                    lv_nested_4_0=(Token)match(input,19,FOLLOW_24); 

                    						newLeafNode(lv_nested_4_0, grammarAccess.getLidlInteractionAccess().getNestedWithKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlInteractionRule());
                    						}
                    						setWithLastConsumed(current, "nested", lv_nested_4_0 != null, "with");
                    					

                    }


                    }

                    // InternalLidl.g:1415:4: ( (lv_nestedDef_5_0= ruleLidlInteraction ) )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==30) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalLidl.g:1416:5: (lv_nestedDef_5_0= ruleLidlInteraction )
                    	    {
                    	    // InternalLidl.g:1416:5: (lv_nestedDef_5_0= ruleLidlInteraction )
                    	    // InternalLidl.g:1417:6: lv_nestedDef_5_0= ruleLidlInteraction
                    	    {

                    	    						newCompositeNode(grammarAccess.getLidlInteractionAccess().getNestedDefLidlInteractionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_25);
                    	    lv_nestedDef_5_0=ruleLidlInteraction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLidlInteractionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"nestedDef",
                    	    							lv_nestedDef_5_0,
                    	    							"lab.buaa.software.lidl.Lidl.LidlInteraction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,20,FOLLOW_22); 

            			newLeafNode(otherlv_6, grammarAccess.getLidlInteractionAccess().getIsKeyword_5());
            		
            otherlv_7=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getLidlInteractionAccess().getLeftParenthesisKeyword_6());
            		
            // InternalLidl.g:1443:3: ( (lv_definition_8_0= ruleLidlExpression ) )
            // InternalLidl.g:1444:4: (lv_definition_8_0= ruleLidlExpression )
            {
            // InternalLidl.g:1444:4: (lv_definition_8_0= ruleLidlExpression )
            // InternalLidl.g:1445:5: lv_definition_8_0= ruleLidlExpression
            {

            					newCompositeNode(grammarAccess.getLidlInteractionAccess().getDefinitionLidlExpressionParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_27);
            lv_definition_8_0=ruleLidlExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLidlInteractionRule());
            					}
            					set(
            						current,
            						"definition",
            						lv_definition_8_0,
            						"lab.buaa.software.lidl.Lidl.LidlExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLidlInteractionAccess().getRightParenthesisKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlInteraction"


    // $ANTLR start "entryRuleLidlInteractionID"
    // InternalLidl.g:1470:1: entryRuleLidlInteractionID returns [EObject current=null] : iv_ruleLidlInteractionID= ruleLidlInteractionID EOF ;
    public final EObject entryRuleLidlInteractionID() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlInteractionID = null;


        try {
            // InternalLidl.g:1470:58: (iv_ruleLidlInteractionID= ruleLidlInteractionID EOF )
            // InternalLidl.g:1471:2: iv_ruleLidlInteractionID= ruleLidlInteractionID EOF
            {
             newCompositeNode(grammarAccess.getLidlInteractionIDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlInteractionID=ruleLidlInteractionID();

            state._fsp--;

             current =iv_ruleLidlInteractionID; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlInteractionID"


    // $ANTLR start "ruleLidlInteractionID"
    // InternalLidl.g:1477:1: ruleLidlInteractionID returns [EObject current=null] : (otherlv_0= '(' ( (lv_items_1_0= ruleIDPart ) )+ otherlv_2= ')' ) ;
    public final EObject ruleLidlInteractionID() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1483:2: ( (otherlv_0= '(' ( (lv_items_1_0= ruleIDPart ) )+ otherlv_2= ')' ) )
            // InternalLidl.g:1484:2: (otherlv_0= '(' ( (lv_items_1_0= ruleIDPart ) )+ otherlv_2= ')' )
            {
            // InternalLidl.g:1484:2: (otherlv_0= '(' ( (lv_items_1_0= ruleIDPart ) )+ otherlv_2= ')' )
            // InternalLidl.g:1485:3: otherlv_0= '(' ( (lv_items_1_0= ruleIDPart ) )+ otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getLidlInteractionIDAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLidl.g:1489:3: ( (lv_items_1_0= ruleIDPart ) )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_LIDLIDSYMBOL)||LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLidl.g:1490:4: (lv_items_1_0= ruleIDPart )
            	    {
            	    // InternalLidl.g:1490:4: (lv_items_1_0= ruleIDPart )
            	    // InternalLidl.g:1491:5: lv_items_1_0= ruleIDPart
            	    {

            	    					newCompositeNode(grammarAccess.getLidlInteractionIDAccess().getItemsIDPartParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_items_1_0=ruleIDPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLidlInteractionIDRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"lab.buaa.software.lidl.Lidl.IDPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);

            otherlv_2=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLidlInteractionIDAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlInteractionID"


    // $ANTLR start "entryRuleIDPart"
    // InternalLidl.g:1516:1: entryRuleIDPart returns [EObject current=null] : iv_ruleIDPart= ruleIDPart EOF ;
    public final EObject entryRuleIDPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIDPart = null;


        try {
            // InternalLidl.g:1516:47: (iv_ruleIDPart= ruleIDPart EOF )
            // InternalLidl.g:1517:2: iv_ruleIDPart= ruleIDPart EOF
            {
             newCompositeNode(grammarAccess.getIDPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIDPart=ruleIDPart();

            state._fsp--;

             current =iv_ruleIDPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIDPart"


    // $ANTLR start "ruleIDPart"
    // InternalLidl.g:1523:1: ruleIDPart returns [EObject current=null] : (this_LidlText_0= ruleLidlText | this_LidlParameter_1= ruleLidlParameter ) ;
    public final EObject ruleIDPart() throws RecognitionException {
        EObject current = null;

        EObject this_LidlText_0 = null;

        EObject this_LidlParameter_1 = null;



        	enterRule();

        try {
            // InternalLidl.g:1529:2: ( (this_LidlText_0= ruleLidlText | this_LidlParameter_1= ruleLidlParameter ) )
            // InternalLidl.g:1530:2: (this_LidlText_0= ruleLidlText | this_LidlParameter_1= ruleLidlParameter )
            {
            // InternalLidl.g:1530:2: (this_LidlText_0= ruleLidlText | this_LidlParameter_1= ruleLidlParameter )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_LIDLIDSYMBOL)) ) {
                alt24=1;
            }
            else if ( (LA24_0==31) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalLidl.g:1531:3: this_LidlText_0= ruleLidlText
                    {

                    			newCompositeNode(grammarAccess.getIDPartAccess().getLidlTextParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LidlText_0=ruleLidlText();

                    state._fsp--;


                    			current = this_LidlText_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLidl.g:1540:3: this_LidlParameter_1= ruleLidlParameter
                    {

                    			newCompositeNode(grammarAccess.getIDPartAccess().getLidlParameterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LidlParameter_1=ruleLidlParameter();

                    state._fsp--;


                    			current = this_LidlParameter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIDPart"


    // $ANTLR start "entryRuleLidlParameter"
    // InternalLidl.g:1552:1: entryRuleLidlParameter returns [EObject current=null] : iv_ruleLidlParameter= ruleLidlParameter EOF ;
    public final EObject entryRuleLidlParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlParameter = null;


        try {
            // InternalLidl.g:1552:54: (iv_ruleLidlParameter= ruleLidlParameter EOF )
            // InternalLidl.g:1553:2: iv_ruleLidlParameter= ruleLidlParameter EOF
            {
             newCompositeNode(grammarAccess.getLidlParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlParameter=ruleLidlParameter();

            state._fsp--;

             current =iv_ruleLidlParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlParameter"


    // $ANTLR start "ruleLidlParameter"
    // InternalLidl.g:1559:1: ruleLidlParameter returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_interface_4_0= ruleLidlInterfaceType ) ) otherlv_5= ')' ) ;
    public final EObject ruleLidlParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_interface_4_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1565:2: ( ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_interface_4_0= ruleLidlInterfaceType ) ) otherlv_5= ')' ) )
            // InternalLidl.g:1566:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_interface_4_0= ruleLidlInterfaceType ) ) otherlv_5= ')' )
            {
            // InternalLidl.g:1566:2: ( () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_interface_4_0= ruleLidlInterfaceType ) ) otherlv_5= ')' )
            // InternalLidl.g:1567:3: () otherlv_1= '(' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_interface_4_0= ruleLidlInterfaceType ) ) otherlv_5= ')'
            {
            // InternalLidl.g:1567:3: ()
            // InternalLidl.g:1568:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLidlParameterAccess().getLidlParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLidlParameterAccess().getLeftParenthesisKeyword_1());
            		
            // InternalLidl.g:1578:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalLidl.g:1579:4: (lv_name_2_0= RULE_ID )
            {
            // InternalLidl.g:1579:4: (lv_name_2_0= RULE_ID )
            // InternalLidl.g:1580:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLidlParameterAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLidlParameterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getLidlParameterAccess().getColonKeyword_3());
            		
            // InternalLidl.g:1600:3: ( (lv_interface_4_0= ruleLidlInterfaceType ) )
            // InternalLidl.g:1601:4: (lv_interface_4_0= ruleLidlInterfaceType )
            {
            // InternalLidl.g:1601:4: (lv_interface_4_0= ruleLidlInterfaceType )
            // InternalLidl.g:1602:5: lv_interface_4_0= ruleLidlInterfaceType
            {

            					newCompositeNode(grammarAccess.getLidlParameterAccess().getInterfaceLidlInterfaceTypeParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_interface_4_0=ruleLidlInterfaceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLidlParameterRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_4_0,
            						"lab.buaa.software.lidl.Lidl.LidlInterfaceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLidlParameterAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlParameter"


    // $ANTLR start "entryRuleLidlText"
    // InternalLidl.g:1627:1: entryRuleLidlText returns [EObject current=null] : iv_ruleLidlText= ruleLidlText EOF ;
    public final EObject entryRuleLidlText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlText = null;


        try {
            // InternalLidl.g:1627:49: (iv_ruleLidlText= ruleLidlText EOF )
            // InternalLidl.g:1628:2: iv_ruleLidlText= ruleLidlText EOF
            {
             newCompositeNode(grammarAccess.getLidlTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlText=ruleLidlText();

            state._fsp--;

             current =iv_ruleLidlText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlText"


    // $ANTLR start "ruleLidlText"
    // InternalLidl.g:1634:1: ruleLidlText returns [EObject current=null] : ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL ) ) ) ) ;
    public final EObject ruleLidlText() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_1=null;
        Token lv_text_1_2=null;


        	enterRule();

        try {
            // InternalLidl.g:1640:2: ( ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL ) ) ) ) )
            // InternalLidl.g:1641:2: ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL ) ) ) )
            {
            // InternalLidl.g:1641:2: ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL ) ) ) )
            // InternalLidl.g:1642:3: () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL ) ) )
            {
            // InternalLidl.g:1642:3: ()
            // InternalLidl.g:1643:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLidlTextAccess().getLidlTextAction_0(),
            					current);
            			

            }

            // InternalLidl.g:1649:3: ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL ) ) )
            // InternalLidl.g:1650:4: ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL ) )
            {
            // InternalLidl.g:1650:4: ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL ) )
            // InternalLidl.g:1651:5: (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL )
            {
            // InternalLidl.g:1651:5: (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( (LA25_0==RULE_LIDLIDSYMBOL) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalLidl.g:1652:6: lv_text_1_1= RULE_ID
                    {
                    lv_text_1_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_text_1_1, grammarAccess.getLidlTextAccess().getTextIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalLidl.g:1667:6: lv_text_1_2= RULE_LIDLIDSYMBOL
                    {
                    lv_text_1_2=(Token)match(input,RULE_LIDLIDSYMBOL,FOLLOW_2); 

                    						newLeafNode(lv_text_1_2, grammarAccess.getLidlTextAccess().getTextLIDLIDSYMBOLTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"text",
                    							lv_text_1_2,
                    							"lab.buaa.software.lidl.Lidl.LIDLIDSYMBOL");
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlText"


    // $ANTLR start "entryRuleLidlExpression"
    // InternalLidl.g:1688:1: entryRuleLidlExpression returns [EObject current=null] : iv_ruleLidlExpression= ruleLidlExpression EOF ;
    public final EObject entryRuleLidlExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlExpression = null;


        try {
            // InternalLidl.g:1688:55: (iv_ruleLidlExpression= ruleLidlExpression EOF )
            // InternalLidl.g:1689:2: iv_ruleLidlExpression= ruleLidlExpression EOF
            {
             newCompositeNode(grammarAccess.getLidlExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlExpression=ruleLidlExpression();

            state._fsp--;

             current =iv_ruleLidlExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlExpression"


    // $ANTLR start "ruleLidlExpression"
    // InternalLidl.g:1695:1: ruleLidlExpression returns [EObject current=null] : (this_LidlCallExpression_0= ruleLidlCallExpression | this_LidlTerminalExpression_1= ruleLidlTerminalExpression | this_LidlArray_2= ruleLidlArray ) ;
    public final EObject ruleLidlExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LidlCallExpression_0 = null;

        EObject this_LidlTerminalExpression_1 = null;

        EObject this_LidlArray_2 = null;



        	enterRule();

        try {
            // InternalLidl.g:1701:2: ( (this_LidlCallExpression_0= ruleLidlCallExpression | this_LidlTerminalExpression_1= ruleLidlTerminalExpression | this_LidlArray_2= ruleLidlArray ) )
            // InternalLidl.g:1702:2: (this_LidlCallExpression_0= ruleLidlCallExpression | this_LidlTerminalExpression_1= ruleLidlTerminalExpression | this_LidlArray_2= ruleLidlArray )
            {
            // InternalLidl.g:1702:2: (this_LidlCallExpression_0= ruleLidlCallExpression | this_LidlTerminalExpression_1= ruleLidlTerminalExpression | this_LidlArray_2= ruleLidlArray )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_LIDLIDSYMBOL:
            case 15:
            case 23:
            case 31:
                {
                alt26=1;
                }
                break;
            case RULE_STRING:
            case RULE_NUMBER:
            case 22:
            case 33:
            case 34:
            case 35:
            case 36:
                {
                alt26=2;
                }
                break;
            case 26:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalLidl.g:1703:3: this_LidlCallExpression_0= ruleLidlCallExpression
                    {

                    			newCompositeNode(grammarAccess.getLidlExpressionAccess().getLidlCallExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LidlCallExpression_0=ruleLidlCallExpression();

                    state._fsp--;


                    			current = this_LidlCallExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLidl.g:1712:3: this_LidlTerminalExpression_1= ruleLidlTerminalExpression
                    {

                    			newCompositeNode(grammarAccess.getLidlExpressionAccess().getLidlTerminalExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LidlTerminalExpression_1=ruleLidlTerminalExpression();

                    state._fsp--;


                    			current = this_LidlTerminalExpression_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLidl.g:1721:3: this_LidlArray_2= ruleLidlArray
                    {

                    			newCompositeNode(grammarAccess.getLidlExpressionAccess().getLidlArrayParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LidlArray_2=ruleLidlArray();

                    state._fsp--;


                    			current = this_LidlArray_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlExpression"


    // $ANTLR start "entryRuleLidlCallExpression"
    // InternalLidl.g:1733:1: entryRuleLidlCallExpression returns [EObject current=null] : iv_ruleLidlCallExpression= ruleLidlCallExpression EOF ;
    public final EObject entryRuleLidlCallExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlCallExpression = null;


        try {
            // InternalLidl.g:1733:59: (iv_ruleLidlCallExpression= ruleLidlCallExpression EOF )
            // InternalLidl.g:1734:2: iv_ruleLidlCallExpression= ruleLidlCallExpression EOF
            {
             newCompositeNode(grammarAccess.getLidlCallExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlCallExpression=ruleLidlCallExpression();

            state._fsp--;

             current =iv_ruleLidlCallExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlCallExpression"


    // $ANTLR start "ruleLidlCallExpression"
    // InternalLidl.g:1740:1: ruleLidlCallExpression returns [EObject current=null] : ( () ( (lv_items_1_0= ruleCallPart ) )+ ) ;
    public final EObject ruleLidlCallExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_items_1_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1746:2: ( ( () ( (lv_items_1_0= ruleCallPart ) )+ ) )
            // InternalLidl.g:1747:2: ( () ( (lv_items_1_0= ruleCallPart ) )+ )
            {
            // InternalLidl.g:1747:2: ( () ( (lv_items_1_0= ruleCallPart ) )+ )
            // InternalLidl.g:1748:3: () ( (lv_items_1_0= ruleCallPart ) )+
            {
            // InternalLidl.g:1748:3: ()
            // InternalLidl.g:1749:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLidlCallExpressionAccess().getLidlCallExpressionAction_0(),
            					current);
            			

            }

            // InternalLidl.g:1755:3: ( (lv_items_1_0= ruleCallPart ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_LIDLIDSYMBOL)||LA27_0==15||LA27_0==23||LA27_0==31) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLidl.g:1756:4: (lv_items_1_0= ruleCallPart )
            	    {
            	    // InternalLidl.g:1756:4: (lv_items_1_0= ruleCallPart )
            	    // InternalLidl.g:1757:5: lv_items_1_0= ruleCallPart
            	    {

            	    					newCompositeNode(grammarAccess.getLidlCallExpressionAccess().getItemsCallPartParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_30);
            	    lv_items_1_0=ruleCallPart();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLidlCallExpressionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"items",
            	    						lv_items_1_0,
            	    						"lab.buaa.software.lidl.Lidl.CallPart");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlCallExpression"


    // $ANTLR start "entryRuleCallPart"
    // InternalLidl.g:1778:1: entryRuleCallPart returns [EObject current=null] : iv_ruleCallPart= ruleCallPart EOF ;
    public final EObject entryRuleCallPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallPart = null;


        try {
            // InternalLidl.g:1778:49: (iv_ruleCallPart= ruleCallPart EOF )
            // InternalLidl.g:1779:2: iv_ruleCallPart= ruleCallPart EOF
            {
             newCompositeNode(grammarAccess.getCallPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallPart=ruleCallPart();

            state._fsp--;

             current =iv_ruleCallPart; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallPart"


    // $ANTLR start "ruleCallPart"
    // InternalLidl.g:1785:1: ruleCallPart returns [EObject current=null] : ( ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) ) ) ) | ( () otherlv_3= '(' ( (lv_param_4_0= ruleLidlExpression ) ) otherlv_5= ')' ) ) ;
    public final EObject ruleCallPart() throws RecognitionException {
        EObject current = null;

        Token lv_text_1_1=null;
        Token lv_text_1_2=null;
        Token lv_text_1_3=null;
        Token lv_text_1_4=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_param_4_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1791:2: ( ( ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) ) ) ) | ( () otherlv_3= '(' ( (lv_param_4_0= ruleLidlExpression ) ) otherlv_5= ')' ) ) )
            // InternalLidl.g:1792:2: ( ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) ) ) ) | ( () otherlv_3= '(' ( (lv_param_4_0= ruleLidlExpression ) ) otherlv_5= ')' ) )
            {
            // InternalLidl.g:1792:2: ( ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) ) ) ) | ( () otherlv_3= '(' ( (lv_param_4_0= ruleLidlExpression ) ) otherlv_5= ')' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_LIDLIDSYMBOL)||LA29_0==15||LA29_0==23) ) {
                alt29=1;
            }
            else if ( (LA29_0==31) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalLidl.g:1793:3: ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) ) ) )
                    {
                    // InternalLidl.g:1793:3: ( () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) ) ) )
                    // InternalLidl.g:1794:4: () ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) ) )
                    {
                    // InternalLidl.g:1794:4: ()
                    // InternalLidl.g:1795:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCallPartAccess().getTextCallPartAction_0_0(),
                    						current);
                    				

                    }

                    // InternalLidl.g:1801:4: ( ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) ) )
                    // InternalLidl.g:1802:5: ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) )
                    {
                    // InternalLidl.g:1802:5: ( (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' ) )
                    // InternalLidl.g:1803:6: (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' )
                    {
                    // InternalLidl.g:1803:6: (lv_text_1_1= RULE_ID | lv_text_1_2= RULE_LIDLIDSYMBOL | lv_text_1_3= ',' | lv_text_1_4= '.' )
                    int alt28=4;
                    switch ( input.LA(1) ) {
                    case RULE_ID:
                        {
                        alt28=1;
                        }
                        break;
                    case RULE_LIDLIDSYMBOL:
                        {
                        alt28=2;
                        }
                        break;
                    case 23:
                        {
                        alt28=3;
                        }
                        break;
                    case 15:
                        {
                        alt28=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }

                    switch (alt28) {
                        case 1 :
                            // InternalLidl.g:1804:7: lv_text_1_1= RULE_ID
                            {
                            lv_text_1_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_text_1_1, grammarAccess.getCallPartAccess().getTextIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCallPartRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"text",
                            								lv_text_1_1,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalLidl.g:1819:7: lv_text_1_2= RULE_LIDLIDSYMBOL
                            {
                            lv_text_1_2=(Token)match(input,RULE_LIDLIDSYMBOL,FOLLOW_2); 

                            							newLeafNode(lv_text_1_2, grammarAccess.getCallPartAccess().getTextLIDLIDSYMBOLTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCallPartRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"text",
                            								lv_text_1_2,
                            								"lab.buaa.software.lidl.Lidl.LIDLIDSYMBOL");
                            						

                            }
                            break;
                        case 3 :
                            // InternalLidl.g:1834:7: lv_text_1_3= ','
                            {
                            lv_text_1_3=(Token)match(input,23,FOLLOW_2); 

                            							newLeafNode(lv_text_1_3, grammarAccess.getCallPartAccess().getTextCommaKeyword_0_1_0_2());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCallPartRule());
                            							}
                            							setWithLastConsumed(current, "text", lv_text_1_3, null);
                            						

                            }
                            break;
                        case 4 :
                            // InternalLidl.g:1845:7: lv_text_1_4= '.'
                            {
                            lv_text_1_4=(Token)match(input,15,FOLLOW_2); 

                            							newLeafNode(lv_text_1_4, grammarAccess.getCallPartAccess().getTextFullStopKeyword_0_1_0_3());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getCallPartRule());
                            							}
                            							setWithLastConsumed(current, "text", lv_text_1_4, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1860:3: ( () otherlv_3= '(' ( (lv_param_4_0= ruleLidlExpression ) ) otherlv_5= ')' )
                    {
                    // InternalLidl.g:1860:3: ( () otherlv_3= '(' ( (lv_param_4_0= ruleLidlExpression ) ) otherlv_5= ')' )
                    // InternalLidl.g:1861:4: () otherlv_3= '(' ( (lv_param_4_0= ruleLidlExpression ) ) otherlv_5= ')'
                    {
                    // InternalLidl.g:1861:4: ()
                    // InternalLidl.g:1862:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCallPartAccess().getParamCallPartAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,31,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getCallPartAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalLidl.g:1872:4: ( (lv_param_4_0= ruleLidlExpression ) )
                    // InternalLidl.g:1873:5: (lv_param_4_0= ruleLidlExpression )
                    {
                    // InternalLidl.g:1873:5: (lv_param_4_0= ruleLidlExpression )
                    // InternalLidl.g:1874:6: lv_param_4_0= ruleLidlExpression
                    {

                    						newCompositeNode(grammarAccess.getCallPartAccess().getParamLidlExpressionParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_param_4_0=ruleLidlExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCallPartRule());
                    						}
                    						set(
                    							current,
                    							"param",
                    							lv_param_4_0,
                    							"lab.buaa.software.lidl.Lidl.LidlExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getCallPartAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallPart"


    // $ANTLR start "entryRuleLidlTerminalExpression"
    // InternalLidl.g:1900:1: entryRuleLidlTerminalExpression returns [EObject current=null] : iv_ruleLidlTerminalExpression= ruleLidlTerminalExpression EOF ;
    public final EObject entryRuleLidlTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlTerminalExpression = null;


        try {
            // InternalLidl.g:1900:63: (iv_ruleLidlTerminalExpression= ruleLidlTerminalExpression EOF )
            // InternalLidl.g:1901:2: iv_ruleLidlTerminalExpression= ruleLidlTerminalExpression EOF
            {
             newCompositeNode(grammarAccess.getLidlTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlTerminalExpression=ruleLidlTerminalExpression();

            state._fsp--;

             current =iv_ruleLidlTerminalExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlTerminalExpression"


    // $ANTLR start "ruleLidlTerminalExpression"
    // InternalLidl.g:1907:1: ruleLidlTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) ) ) ) | ( () ( (lv_body_9_0= ruleLidlComposition ) ) ) ) ;
    public final EObject ruleLidlTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token lv_value_7_1=null;
        Token lv_value_7_2=null;
        EObject lv_body_9_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:1913:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) ) ) ) | ( () ( (lv_body_9_0= ruleLidlComposition ) ) ) ) )
            // InternalLidl.g:1914:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) ) ) ) | ( () ( (lv_body_9_0= ruleLidlComposition ) ) ) )
            {
            // InternalLidl.g:1914:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_NUMBER ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) ) ) ) | ( () ( (lv_body_9_0= ruleLidlComposition ) ) ) )
            int alt32=5;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt32=1;
                }
                break;
            case RULE_NUMBER:
                {
                alt32=2;
                }
                break;
            case 33:
            case 34:
                {
                alt32=3;
                }
                break;
            case 35:
            case 36:
                {
                alt32=4;
                }
                break;
            case 22:
                {
                alt32=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalLidl.g:1915:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalLidl.g:1915:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalLidl.g:1916:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalLidl.g:1916:4: ()
                    // InternalLidl.g:1917:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLidlTerminalExpressionAccess().getLidlStringConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalLidl.g:1923:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalLidl.g:1924:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalLidl.g:1924:5: (lv_value_1_0= RULE_STRING )
                    // InternalLidl.g:1925:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getLidlTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlTerminalExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:1943:3: ( () ( (lv_value_3_0= RULE_NUMBER ) ) )
                    {
                    // InternalLidl.g:1943:3: ( () ( (lv_value_3_0= RULE_NUMBER ) ) )
                    // InternalLidl.g:1944:4: () ( (lv_value_3_0= RULE_NUMBER ) )
                    {
                    // InternalLidl.g:1944:4: ()
                    // InternalLidl.g:1945:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLidlTerminalExpressionAccess().getLidlNumberConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalLidl.g:1951:4: ( (lv_value_3_0= RULE_NUMBER ) )
                    // InternalLidl.g:1952:5: (lv_value_3_0= RULE_NUMBER )
                    {
                    // InternalLidl.g:1952:5: (lv_value_3_0= RULE_NUMBER )
                    // InternalLidl.g:1953:6: lv_value_3_0= RULE_NUMBER
                    {
                    lv_value_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); 

                    						newLeafNode(lv_value_3_0, grammarAccess.getLidlTerminalExpressionAccess().getValueNUMBERTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLidlTerminalExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"lab.buaa.software.lidl.Lidl.NUMBER");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLidl.g:1971:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalLidl.g:1971:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalLidl.g:1972:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalLidl.g:1972:4: ()
                    // InternalLidl.g:1973:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLidlTerminalExpressionAccess().getLidlBoolConstantAction_2_0(),
                    						current);
                    				

                    }

                    // InternalLidl.g:1979:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalLidl.g:1980:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalLidl.g:1980:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalLidl.g:1981:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalLidl.g:1981:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==33) ) {
                        alt30=1;
                    }
                    else if ( (LA30_0==34) ) {
                        alt30=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 0, input);

                        throw nvae;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalLidl.g:1982:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,33,FOLLOW_2); 

                            							newLeafNode(lv_value_5_1, grammarAccess.getLidlTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLidlTerminalExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalLidl.g:1993:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,34,FOLLOW_2); 

                            							newLeafNode(lv_value_5_2, grammarAccess.getLidlTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLidlTerminalExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_5_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLidl.g:2008:3: ( () ( ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) ) ) )
                    {
                    // InternalLidl.g:2008:3: ( () ( ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) ) ) )
                    // InternalLidl.g:2009:4: () ( ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) ) )
                    {
                    // InternalLidl.g:2009:4: ()
                    // InternalLidl.g:2010:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLidlTerminalExpressionAccess().getLidlAvtivationConstantAction_3_0(),
                    						current);
                    				

                    }

                    // InternalLidl.g:2016:4: ( ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) ) )
                    // InternalLidl.g:2017:5: ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) )
                    {
                    // InternalLidl.g:2017:5: ( (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' ) )
                    // InternalLidl.g:2018:6: (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' )
                    {
                    // InternalLidl.g:2018:6: (lv_value_7_1= 'active' | lv_value_7_2= 'inactive' )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==35) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==36) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalLidl.g:2019:7: lv_value_7_1= 'active'
                            {
                            lv_value_7_1=(Token)match(input,35,FOLLOW_2); 

                            							newLeafNode(lv_value_7_1, grammarAccess.getLidlTerminalExpressionAccess().getValueActiveKeyword_3_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLidlTerminalExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_7_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalLidl.g:2030:7: lv_value_7_2= 'inactive'
                            {
                            lv_value_7_2=(Token)match(input,36,FOLLOW_2); 

                            							newLeafNode(lv_value_7_2, grammarAccess.getLidlTerminalExpressionAccess().getValueInactiveKeyword_3_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLidlTerminalExpressionRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_7_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalLidl.g:2045:3: ( () ( (lv_body_9_0= ruleLidlComposition ) ) )
                    {
                    // InternalLidl.g:2045:3: ( () ( (lv_body_9_0= ruleLidlComposition ) ) )
                    // InternalLidl.g:2046:4: () ( (lv_body_9_0= ruleLidlComposition ) )
                    {
                    // InternalLidl.g:2046:4: ()
                    // InternalLidl.g:2047:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLidlTerminalExpressionAccess().getLidlCompositionAction_4_0(),
                    						current);
                    				

                    }

                    // InternalLidl.g:2053:4: ( (lv_body_9_0= ruleLidlComposition ) )
                    // InternalLidl.g:2054:5: (lv_body_9_0= ruleLidlComposition )
                    {
                    // InternalLidl.g:2054:5: (lv_body_9_0= ruleLidlComposition )
                    // InternalLidl.g:2055:6: lv_body_9_0= ruleLidlComposition
                    {

                    						newCompositeNode(grammarAccess.getLidlTerminalExpressionAccess().getBodyLidlCompositionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_body_9_0=ruleLidlComposition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLidlTerminalExpressionRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_9_0,
                    							"lab.buaa.software.lidl.Lidl.LidlComposition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlTerminalExpression"


    // $ANTLR start "entryRuleLidlArray"
    // InternalLidl.g:2077:1: entryRuleLidlArray returns [EObject current=null] : iv_ruleLidlArray= ruleLidlArray EOF ;
    public final EObject entryRuleLidlArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlArray = null;


        try {
            // InternalLidl.g:2077:50: (iv_ruleLidlArray= ruleLidlArray EOF )
            // InternalLidl.g:2078:2: iv_ruleLidlArray= ruleLidlArray EOF
            {
             newCompositeNode(grammarAccess.getLidlArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlArray=ruleLidlArray();

            state._fsp--;

             current =iv_ruleLidlArray; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlArray"


    // $ANTLR start "ruleLidlArray"
    // InternalLidl.g:2084:1: ruleLidlArray returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_item_2_0= ruleLidlArrayItem ) ) (otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) ) )* )* otherlv_5= ']' ) ;
    public final EObject ruleLidlArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_item_2_0 = null;

        EObject lv_item_4_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:2090:2: ( ( () otherlv_1= '[' ( ( (lv_item_2_0= ruleLidlArrayItem ) ) (otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) ) )* )* otherlv_5= ']' ) )
            // InternalLidl.g:2091:2: ( () otherlv_1= '[' ( ( (lv_item_2_0= ruleLidlArrayItem ) ) (otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) ) )* )* otherlv_5= ']' )
            {
            // InternalLidl.g:2091:2: ( () otherlv_1= '[' ( ( (lv_item_2_0= ruleLidlArrayItem ) ) (otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) ) )* )* otherlv_5= ']' )
            // InternalLidl.g:2092:3: () otherlv_1= '[' ( ( (lv_item_2_0= ruleLidlArrayItem ) ) (otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) ) )* )* otherlv_5= ']'
            {
            // InternalLidl.g:2092:3: ()
            // InternalLidl.g:2093:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLidlArrayAccess().getLidlExpressionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getLidlArrayAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalLidl.g:2103:3: ( ( (lv_item_2_0= ruleLidlArrayItem ) ) (otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) ) )* )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==31) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalLidl.g:2104:4: ( (lv_item_2_0= ruleLidlArrayItem ) ) (otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) ) )*
            	    {
            	    // InternalLidl.g:2104:4: ( (lv_item_2_0= ruleLidlArrayItem ) )
            	    // InternalLidl.g:2105:5: (lv_item_2_0= ruleLidlArrayItem )
            	    {
            	    // InternalLidl.g:2105:5: (lv_item_2_0= ruleLidlArrayItem )
            	    // InternalLidl.g:2106:6: lv_item_2_0= ruleLidlArrayItem
            	    {

            	    						newCompositeNode(grammarAccess.getLidlArrayAccess().getItemLidlArrayItemParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_item_2_0=ruleLidlArrayItem();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLidlArrayRule());
            	    						}
            	    						add(
            	    							current,
            	    							"item",
            	    							lv_item_2_0,
            	    							"lab.buaa.software.lidl.Lidl.LidlArrayItem");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalLidl.g:2123:4: (otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==23) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalLidl.g:2124:5: otherlv_3= ',' ( (lv_item_4_0= ruleLidlArrayItem ) )
            	    	    {
            	    	    otherlv_3=(Token)match(input,23,FOLLOW_22); 

            	    	    					newLeafNode(otherlv_3, grammarAccess.getLidlArrayAccess().getCommaKeyword_2_1_0());
            	    	    				
            	    	    // InternalLidl.g:2128:5: ( (lv_item_4_0= ruleLidlArrayItem ) )
            	    	    // InternalLidl.g:2129:6: (lv_item_4_0= ruleLidlArrayItem )
            	    	    {
            	    	    // InternalLidl.g:2129:6: (lv_item_4_0= ruleLidlArrayItem )
            	    	    // InternalLidl.g:2130:7: lv_item_4_0= ruleLidlArrayItem
            	    	    {

            	    	    							newCompositeNode(grammarAccess.getLidlArrayAccess().getItemLidlArrayItemParserRuleCall_2_1_1_0());
            	    	    						
            	    	    pushFollow(FOLLOW_32);
            	    	    lv_item_4_0=ruleLidlArrayItem();

            	    	    state._fsp--;


            	    	    							if (current==null) {
            	    	    								current = createModelElementForParent(grammarAccess.getLidlArrayRule());
            	    	    							}
            	    	    							add(
            	    	    								current,
            	    	    								"item",
            	    	    								lv_item_4_0,
            	    	    								"lab.buaa.software.lidl.Lidl.LidlArrayItem");
            	    	    							afterParserOrEnumRuleCall();
            	    	    						

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLidlArrayAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlArray"


    // $ANTLR start "entryRuleLidlArrayItem"
    // InternalLidl.g:2157:1: entryRuleLidlArrayItem returns [EObject current=null] : iv_ruleLidlArrayItem= ruleLidlArrayItem EOF ;
    public final EObject entryRuleLidlArrayItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlArrayItem = null;


        try {
            // InternalLidl.g:2157:54: (iv_ruleLidlArrayItem= ruleLidlArrayItem EOF )
            // InternalLidl.g:2158:2: iv_ruleLidlArrayItem= ruleLidlArrayItem EOF
            {
             newCompositeNode(grammarAccess.getLidlArrayItemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlArrayItem=ruleLidlArrayItem();

            state._fsp--;

             current =iv_ruleLidlArrayItem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlArrayItem"


    // $ANTLR start "ruleLidlArrayItem"
    // InternalLidl.g:2164:1: ruleLidlArrayItem returns [EObject current=null] : (otherlv_0= '(' ( (lv_value_1_0= ruleLidlExpression ) ) otherlv_2= ')' ) ;
    public final EObject ruleLidlArrayItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:2170:2: ( (otherlv_0= '(' ( (lv_value_1_0= ruleLidlExpression ) ) otherlv_2= ')' ) )
            // InternalLidl.g:2171:2: (otherlv_0= '(' ( (lv_value_1_0= ruleLidlExpression ) ) otherlv_2= ')' )
            {
            // InternalLidl.g:2171:2: (otherlv_0= '(' ( (lv_value_1_0= ruleLidlExpression ) ) otherlv_2= ')' )
            // InternalLidl.g:2172:3: otherlv_0= '(' ( (lv_value_1_0= ruleLidlExpression ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getLidlArrayItemAccess().getLeftParenthesisKeyword_0());
            		
            // InternalLidl.g:2176:3: ( (lv_value_1_0= ruleLidlExpression ) )
            // InternalLidl.g:2177:4: (lv_value_1_0= ruleLidlExpression )
            {
            // InternalLidl.g:2177:4: (lv_value_1_0= ruleLidlExpression )
            // InternalLidl.g:2178:5: lv_value_1_0= ruleLidlExpression
            {

            					newCompositeNode(grammarAccess.getLidlArrayItemAccess().getValueLidlExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_27);
            lv_value_1_0=ruleLidlExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLidlArrayItemRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"lab.buaa.software.lidl.Lidl.LidlExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getLidlArrayItemAccess().getRightParenthesisKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlArrayItem"


    // $ANTLR start "entryRuleLidlCompositionElement"
    // InternalLidl.g:2203:1: entryRuleLidlCompositionElement returns [EObject current=null] : iv_ruleLidlCompositionElement= ruleLidlCompositionElement EOF ;
    public final EObject entryRuleLidlCompositionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlCompositionElement = null;


        try {
            // InternalLidl.g:2203:63: (iv_ruleLidlCompositionElement= ruleLidlCompositionElement EOF )
            // InternalLidl.g:2204:2: iv_ruleLidlCompositionElement= ruleLidlCompositionElement EOF
            {
             newCompositeNode(grammarAccess.getLidlCompositionElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlCompositionElement=ruleLidlCompositionElement();

            state._fsp--;

             current =iv_ruleLidlCompositionElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlCompositionElement"


    // $ANTLR start "ruleLidlCompositionElement"
    // InternalLidl.g:2210:1: ruleLidlCompositionElement returns [EObject current=null] : ( ( (lv_param_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_value_3_0= ruleLidlExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleLidlCompositionElement() throws RecognitionException {
        EObject current = null;

        Token lv_param_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:2216:2: ( ( ( (lv_param_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_value_3_0= ruleLidlExpression ) ) otherlv_4= ')' ) )
            // InternalLidl.g:2217:2: ( ( (lv_param_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_value_3_0= ruleLidlExpression ) ) otherlv_4= ')' )
            {
            // InternalLidl.g:2217:2: ( ( (lv_param_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_value_3_0= ruleLidlExpression ) ) otherlv_4= ')' )
            // InternalLidl.g:2218:3: ( (lv_param_0_0= RULE_ID ) ) otherlv_1= ':' otherlv_2= '(' ( (lv_value_3_0= ruleLidlExpression ) ) otherlv_4= ')'
            {
            // InternalLidl.g:2218:3: ( (lv_param_0_0= RULE_ID ) )
            // InternalLidl.g:2219:4: (lv_param_0_0= RULE_ID )
            {
            // InternalLidl.g:2219:4: (lv_param_0_0= RULE_ID )
            // InternalLidl.g:2220:5: lv_param_0_0= RULE_ID
            {
            lv_param_0_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_param_0_0, grammarAccess.getLidlCompositionElementAccess().getParamIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLidlCompositionElementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"param",
            						lv_param_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getLidlCompositionElementAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getLidlCompositionElementAccess().getLeftParenthesisKeyword_2());
            		
            // InternalLidl.g:2244:3: ( (lv_value_3_0= ruleLidlExpression ) )
            // InternalLidl.g:2245:4: (lv_value_3_0= ruleLidlExpression )
            {
            // InternalLidl.g:2245:4: (lv_value_3_0= ruleLidlExpression )
            // InternalLidl.g:2246:5: lv_value_3_0= ruleLidlExpression
            {

            					newCompositeNode(grammarAccess.getLidlCompositionElementAccess().getValueLidlExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_value_3_0=ruleLidlExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLidlCompositionElementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"lab.buaa.software.lidl.Lidl.LidlExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLidlCompositionElementAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlCompositionElement"


    // $ANTLR start "entryRuleLidlComposition"
    // InternalLidl.g:2271:1: entryRuleLidlComposition returns [EObject current=null] : iv_ruleLidlComposition= ruleLidlComposition EOF ;
    public final EObject entryRuleLidlComposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLidlComposition = null;


        try {
            // InternalLidl.g:2271:56: (iv_ruleLidlComposition= ruleLidlComposition EOF )
            // InternalLidl.g:2272:2: iv_ruleLidlComposition= ruleLidlComposition EOF
            {
             newCompositeNode(grammarAccess.getLidlCompositionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLidlComposition=ruleLidlComposition();

            state._fsp--;

             current =iv_ruleLidlComposition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLidlComposition"


    // $ANTLR start "ruleLidlComposition"
    // InternalLidl.g:2278:1: ruleLidlComposition returns [EObject current=null] : (otherlv_0= '{' ( (lv_items_1_0= ruleLidlCompositionElement ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleLidlCompositionElement ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleLidlComposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_items_1_0 = null;

        EObject lv_items_3_0 = null;



        	enterRule();

        try {
            // InternalLidl.g:2284:2: ( (otherlv_0= '{' ( (lv_items_1_0= ruleLidlCompositionElement ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleLidlCompositionElement ) ) )* otherlv_4= '}' ) )
            // InternalLidl.g:2285:2: (otherlv_0= '{' ( (lv_items_1_0= ruleLidlCompositionElement ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleLidlCompositionElement ) ) )* otherlv_4= '}' )
            {
            // InternalLidl.g:2285:2: (otherlv_0= '{' ( (lv_items_1_0= ruleLidlCompositionElement ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleLidlCompositionElement ) ) )* otherlv_4= '}' )
            // InternalLidl.g:2286:3: otherlv_0= '{' ( (lv_items_1_0= ruleLidlCompositionElement ) ) (otherlv_2= ',' ( (lv_items_3_0= ruleLidlCompositionElement ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLidlCompositionAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalLidl.g:2290:3: ( (lv_items_1_0= ruleLidlCompositionElement ) )
            // InternalLidl.g:2291:4: (lv_items_1_0= ruleLidlCompositionElement )
            {
            // InternalLidl.g:2291:4: (lv_items_1_0= ruleLidlCompositionElement )
            // InternalLidl.g:2292:5: lv_items_1_0= ruleLidlCompositionElement
            {

            					newCompositeNode(grammarAccess.getLidlCompositionAccess().getItemsLidlCompositionElementParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_items_1_0=ruleLidlCompositionElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLidlCompositionRule());
            					}
            					add(
            						current,
            						"items",
            						lv_items_1_0,
            						"lab.buaa.software.lidl.Lidl.LidlCompositionElement");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLidl.g:2309:3: (otherlv_2= ',' ( (lv_items_3_0= ruleLidlCompositionElement ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==23) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLidl.g:2310:4: otherlv_2= ',' ( (lv_items_3_0= ruleLidlCompositionElement ) )
            	    {
            	    otherlv_2=(Token)match(input,23,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getLidlCompositionAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalLidl.g:2314:4: ( (lv_items_3_0= ruleLidlCompositionElement ) )
            	    // InternalLidl.g:2315:5: (lv_items_3_0= ruleLidlCompositionElement )
            	    {
            	    // InternalLidl.g:2315:5: (lv_items_3_0= ruleLidlCompositionElement )
            	    // InternalLidl.g:2316:6: lv_items_3_0= ruleLidlCompositionElement
            	    {

            	    						newCompositeNode(grammarAccess.getLidlCompositionAccess().getItemsLidlCompositionElementParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_items_3_0=ruleLidlCompositionElement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLidlCompositionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"items",
            	    							lv_items_3_0,
            	    							"lab.buaa.software.lidl.Lidl.LidlCompositionElement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLidlCompositionAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLidlComposition"


    // $ANTLR start "ruleDataDirection"
    // InternalLidl.g:2342:1: ruleDataDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleDataDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLidl.g:2348:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalLidl.g:2349:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalLidl.g:2349:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            else if ( (LA36_0==38) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalLidl.g:2350:3: (enumLiteral_0= 'in' )
                    {
                    // InternalLidl.g:2350:3: (enumLiteral_0= 'in' )
                    // InternalLidl.g:2351:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDataDirectionAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataDirectionAccess().getINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLidl.g:2358:3: (enumLiteral_1= 'out' )
                    {
                    // InternalLidl.g:2358:3: (enumLiteral_1= 'out' )
                    // InternalLidl.g:2359:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDataDirectionAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataDirectionAccess().getOUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataDirection"

    // Delegated rules


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\1\uffff\1\5\4\uffff\1\5";
    static final String dfa_3s = "\1\4\1\17\1\uffff\1\4\2\uffff\1\17";
    static final String dfa_4s = "\1\26\1\46\1\uffff\1\4\2\uffff\1\46";
    static final String dfa_5s = "\2\uffff\1\2\1\uffff\1\1\1\3\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\21\uffff\1\2",
            "\1\3\2\uffff\3\5\7\uffff\3\5\1\uffff\1\5\4\uffff\2\4",
            "",
            "\1\6",
            "",
            "",
            "\1\3\2\uffff\3\5\7\uffff\3\5\1\uffff\1\5\4\uffff\2\4"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "917:2: (this_AtomInterfaceType_0= ruleAtomInterfaceType | this_CompositeInterfaceType_1= ruleCompositeInterfaceType | (this_RefInterfaceType_2= ruleRefInterfaceType ( (lv_conjugate_3_0= '\\'' ) )? ) )";
        }
    }
    static final String dfa_8s = "\6\uffff";
    static final String dfa_9s = "\1\uffff\1\4\3\uffff\1\4";
    static final String dfa_10s = "\1\4\1\17\1\4\2\uffff\1\17";
    static final String dfa_11s = "\1\4\1\46\1\4\2\uffff\1\46";
    static final String dfa_12s = "\3\uffff\1\1\1\2\1\uffff";
    static final String dfa_13s = "\6\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2\7\uffff\2\4\14\uffff\2\3",
            "\1\5",
            "",
            "",
            "\1\2\7\uffff\2\4\14\uffff\2\3"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1069:3: ( ( ( ( ruleQualifiedName ) ) ( (lv_direction_4_0= ruleDataDirection ) ) ) | ( ( ruleQualifiedName ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000050050002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000050040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004600010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000050040000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000050140000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001E84C080F0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000180000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080808032L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000088800000L});

}