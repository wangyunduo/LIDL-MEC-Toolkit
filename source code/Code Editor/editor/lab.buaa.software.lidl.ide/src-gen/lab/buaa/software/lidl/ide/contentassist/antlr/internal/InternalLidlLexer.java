package lab.buaa.software.lidl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLidlLexer extends Lexer {
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

    public InternalLidlLexer() {;} 
    public InternalLidlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLidlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLidl.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:11:7: ( ',' )
            // InternalLidl.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:12:7: ( '.' )
            // InternalLidl.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:13:7: ( 'true' )
            // InternalLidl.g:13:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:14:7: ( 'false' )
            // InternalLidl.g:14:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:15:7: ( 'active' )
            // InternalLidl.g:15:9: 'active'
            {
            match("active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:16:7: ( 'inactive' )
            // InternalLidl.g:16:9: 'inactive'
            {
            match("inactive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:17:7: ( 'in' )
            // InternalLidl.g:17:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:18:7: ( 'out' )
            // InternalLidl.g:18:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:19:7: ( ';' )
            // InternalLidl.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:20:7: ( 'import' )
            // InternalLidl.g:20:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:21:7: ( '.*' )
            // InternalLidl.g:21:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:22:7: ( 'data' )
            // InternalLidl.g:22:9: 'data'
            {
            match("data"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:23:7: ( 'is' )
            // InternalLidl.g:23:9: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:24:7: ( '{' )
            // InternalLidl.g:24:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:25:7: ( '}' )
            // InternalLidl.g:25:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:26:7: ( ':' )
            // InternalLidl.g:26:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:27:7: ( ']' )
            // InternalLidl.g:27:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:28:7: ( 'interface' )
            // InternalLidl.g:28:9: 'interface'
            {
            match("interface"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:29:7: ( 'interaction' )
            // InternalLidl.g:29:9: 'interaction'
            {
            match("interaction"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:30:7: ( '(' )
            // InternalLidl.g:30:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:31:7: ( ')' )
            // InternalLidl.g:31:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:32:7: ( '[' )
            // InternalLidl.g:32:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:33:7: ( 'package' )
            // InternalLidl.g:33:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:34:7: ( 'with' )
            // InternalLidl.g:34:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:35:7: ( 'Undefined' )
            // InternalLidl.g:35:9: 'Undefined'
            {
            match("Undefined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:36:7: ( '\\'' )
            // InternalLidl.g:36:9: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_LIDLIDSYMBOL"
    public final void mRULE_LIDLIDSYMBOL() throws RecognitionException {
        try {
            int _type = RULE_LIDLIDSYMBOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:5963:19: ( ( '?' | '!' | '+' | '-' | '*' | '/' | '\\\\' | '=' | '@' | '`' | '~' | '%' | '^' | '&' | '_' | '|' | '\\'' | '\"' | '<' | '>' )+ )
            // InternalLidl.g:5963:21: ( '?' | '!' | '+' | '-' | '*' | '/' | '\\\\' | '=' | '@' | '`' | '~' | '%' | '^' | '&' | '_' | '|' | '\\'' | '\"' | '<' | '>' )+
            {
            // InternalLidl.g:5963:21: ( '?' | '!' | '+' | '-' | '*' | '/' | '\\\\' | '=' | '@' | '`' | '~' | '%' | '^' | '&' | '_' | '|' | '\\'' | '\"' | '<' | '>' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='!' && LA1_0<='\"')||(LA1_0>='%' && LA1_0<='\'')||(LA1_0>='*' && LA1_0<='+')||LA1_0=='-'||LA1_0=='/'||(LA1_0>='<' && LA1_0<='@')||LA1_0=='\\'||(LA1_0>='^' && LA1_0<='`')||LA1_0=='|'||LA1_0=='~') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLidl.g:
            	    {
            	    if ( (input.LA(1)>='!' && input.LA(1)<='\"')||(input.LA(1)>='%' && input.LA(1)<='\'')||(input.LA(1)>='*' && input.LA(1)<='+')||input.LA(1)=='-'||input.LA(1)=='/'||(input.LA(1)>='<' && input.LA(1)<='@')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='`')||input.LA(1)=='|'||input.LA(1)=='~' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LIDLIDSYMBOL"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:5965:13: ( RULE_INT ( '.' RULE_INT )? )
            // InternalLidl.g:5965:15: RULE_INT ( '.' RULE_INT )?
            {
            mRULE_INT(); 
            // InternalLidl.g:5965:24: ( '.' RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='.') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalLidl.g:5965:25: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:5967:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalLidl.g:5967:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalLidl.g:5967:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLidl.g:5967:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLidl.g:5967:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLidl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalLidl.g:5969:19: ( ( '0' .. '9' )+ )
            // InternalLidl.g:5969:21: ( '0' .. '9' )+
            {
            // InternalLidl.g:5969:21: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLidl.g:5969:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:5971:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalLidl.g:5971:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalLidl.g:5971:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalLidl.g:5971:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalLidl.g:5971:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalLidl.g:5971:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLidl.g:5971:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalLidl.g:5971:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalLidl.g:5971:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalLidl.g:5971:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalLidl.g:5971:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:5973:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalLidl.g:5973:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalLidl.g:5973:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLidl.g:5973:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:5975:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalLidl.g:5975:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalLidl.g:5975:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLidl.g:5975:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalLidl.g:5975:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLidl.g:5975:41: ( '\\r' )? '\\n'
                    {
                    // InternalLidl.g:5975:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalLidl.g:5975:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:5977:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLidl.g:5977:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLidl.g:5977:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLidl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLidl.g:5979:16: ( . )
            // InternalLidl.g:5979:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalLidl.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_LIDLIDSYMBOL | RULE_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=34;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalLidl.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalLidl.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalLidl.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalLidl.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalLidl.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalLidl.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalLidl.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalLidl.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalLidl.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalLidl.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalLidl.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalLidl.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalLidl.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalLidl.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalLidl.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalLidl.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalLidl.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalLidl.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalLidl.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalLidl.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalLidl.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalLidl.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalLidl.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalLidl.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalLidl.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalLidl.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalLidl.g:1:166: RULE_LIDLIDSYMBOL
                {
                mRULE_LIDLIDSYMBOL(); 

                }
                break;
            case 28 :
                // InternalLidl.g:1:184: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 29 :
                // InternalLidl.g:1:196: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalLidl.g:1:204: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalLidl.g:1:216: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalLidl.g:1:232: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalLidl.g:1:248: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalLidl.g:1:256: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\2\uffff\1\40\5\42\1\uffff\1\42\7\uffff\3\42\1\65\1\72\1\uffff\2\72\1\uffff\1\72\6\uffff\1\42\1\uffff\2\42\1\111\1\42\1\113\1\42\1\uffff\1\42\7\uffff\3\42\1\uffff\2\72\3\uffff\1\72\1\uffff\3\72\1\uffff\2\72\1\uffff\5\42\1\uffff\1\42\1\uffff\1\136\4\42\3\72\1\uffff\2\72\1\uffff\1\144\5\42\1\uffff\1\152\1\42\1\154\1\42\1\72\1\uffff\1\156\4\42\1\uffff\1\42\1\uffff\1\42\1\uffff\1\166\3\42\1\172\2\42\1\uffff\3\42\1\uffff\1\u0080\1\42\1\u0082\2\42\1\uffff\1\42\1\uffff\1\u0086\1\42\1\u0088\1\uffff\1\42\1\uffff\1\u008a\1\uffff";
    static final String DFA14_eofS =
        "\u008b\uffff";
    static final String DFA14_minS =
        "\1\0\1\uffff\1\52\1\162\1\141\1\143\1\155\1\165\1\uffff\1\141\7\uffff\1\141\1\151\1\156\1\0\1\101\1\uffff\1\60\1\0\1\uffff\1\52\6\uffff\1\165\1\uffff\1\154\1\164\1\60\1\160\1\60\1\164\1\uffff\1\164\7\uffff\1\143\1\164\1\144\1\uffff\2\0\3\uffff\1\60\1\uffff\1\60\2\0\1\uffff\2\0\1\uffff\1\145\1\163\1\151\1\143\1\145\1\uffff\1\157\1\uffff\1\60\1\141\1\153\1\150\1\145\3\0\1\uffff\2\0\1\uffff\1\60\1\145\1\166\1\164\2\162\1\uffff\1\60\1\141\1\60\1\146\1\0\1\uffff\1\60\1\145\1\151\1\141\1\164\1\uffff\1\147\1\uffff\1\151\1\uffff\1\60\1\166\1\141\1\143\1\60\1\145\1\156\1\uffff\1\145\1\143\1\164\1\uffff\1\60\1\145\1\60\1\145\1\151\1\uffff\1\144\1\uffff\1\60\1\157\1\60\1\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\uffff\1\52\1\162\1\141\1\143\1\163\1\165\1\uffff\1\141\7\uffff\1\141\1\151\1\156\1\uffff\1\172\1\uffff\1\172\1\uffff\1\uffff\1\57\6\uffff\1\165\1\uffff\1\154\1\164\1\172\1\160\1\172\1\164\1\uffff\1\164\7\uffff\1\143\1\164\1\144\1\uffff\2\uffff\3\uffff\1\172\1\uffff\1\172\2\uffff\1\uffff\2\uffff\1\uffff\1\145\1\163\1\151\1\143\1\145\1\uffff\1\157\1\uffff\1\172\1\141\1\153\1\150\1\145\3\uffff\1\uffff\2\uffff\1\uffff\1\172\1\145\1\166\1\164\2\162\1\uffff\1\172\1\141\1\172\1\146\1\uffff\1\uffff\1\172\1\145\1\151\1\146\1\164\1\uffff\1\147\1\uffff\1\151\1\uffff\1\172\1\166\1\141\1\143\1\172\1\145\1\156\1\uffff\1\145\1\143\1\164\1\uffff\1\172\1\145\1\172\1\145\1\151\1\uffff\1\144\1\uffff\1\172\1\157\1\172\1\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\6\uffff\1\11\1\uffff\1\16\1\17\1\20\1\21\1\24\1\25\1\26\5\uffff\1\34\2\uffff\1\35\1\uffff\1\33\1\41\1\42\1\1\1\13\1\2\1\uffff\1\35\6\uffff\1\11\1\uffff\1\16\1\17\1\20\1\21\1\24\1\25\1\26\3\uffff\1\32\2\uffff\1\33\1\36\1\33\1\uffff\1\34\3\uffff\1\33\2\uffff\1\41\5\uffff\1\7\1\uffff\1\15\10\uffff\1\37\2\uffff\1\40\6\uffff\1\10\5\uffff\1\3\5\uffff\1\14\1\uffff\1\30\1\uffff\1\4\7\uffff\1\5\3\uffff\1\12\5\uffff\1\27\1\uffff\1\6\3\uffff\1\22\1\uffff\1\31\1\uffff\1\23";
    static final String DFA14_specialS =
        "\1\4\23\uffff\1\6\3\uffff\1\14\35\uffff\1\1\1\11\6\uffff\1\0\1\16\1\uffff\1\13\1\3\16\uffff\1\10\1\15\1\5\1\uffff\1\2\1\7\14\uffff\1\12\47\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\35\2\34\2\35\1\34\22\35\1\34\1\33\1\30\2\35\2\33\1\24\1\16\1\17\2\33\1\1\1\33\1\2\1\32\12\26\1\14\1\10\5\33\24\31\1\23\5\31\1\20\1\33\1\15\1\25\1\27\1\33\1\5\2\31\1\11\1\31\1\4\2\31\1\6\5\31\1\7\1\21\3\31\1\3\2\31\1\22\3\31\1\12\1\33\1\13\1\33\uff81\35",
            "",
            "\1\37",
            "\1\41",
            "\1\43",
            "\1\44",
            "\1\46\1\45\4\uffff\1\47",
            "\1\50",
            "",
            "\1\52",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62",
            "\1\63",
            "\1\64",
            "\41\71\2\67\2\71\2\67\1\70\2\71\2\67\1\71\1\67\1\71\1\67\14\71\5\67\33\71\1\66\1\71\3\67\33\71\1\67\1\71\1\67\uff81\71",
            "\32\42\4\uffff\1\73\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\75\1\uffff\32\42",
            "\41\71\1\77\1\100\2\71\3\77\2\71\2\77\1\71\1\77\1\71\1\77\14\71\5\77\33\71\1\76\1\71\3\77\33\71\1\77\1\71\1\77\uff81\71",
            "",
            "\1\101\4\uffff\1\102",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\1\107\22\42\1\110\6\42",
            "\1\112",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\114",
            "",
            "\1\115",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\41\71\2\121\2\71\3\121\2\71\2\121\1\71\1\121\1\71\1\121\14\71\5\121\33\71\1\121\1\71\3\121\33\71\1\121\1\71\1\121\uff81\71",
            "\41\71\2\67\2\71\2\67\1\70\2\71\2\67\1\71\1\67\1\71\1\67\14\71\5\67\33\71\1\66\1\71\3\67\33\71\1\67\1\71\1\67\uff81\71",
            "",
            "",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\75\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\75\1\uffff\32\42",
            "\41\71\2\122\2\71\3\122\2\71\2\122\1\71\1\122\1\71\1\122\14\71\5\122\33\71\1\122\1\71\3\122\33\71\1\122\1\71\1\122\uff81\71",
            "\41\71\1\77\1\100\2\71\3\77\2\71\2\77\1\71\1\77\1\71\1\77\14\71\5\77\33\71\1\76\1\71\3\77\33\71\1\77\1\71\1\77\uff81\71",
            "",
            "\41\124\2\125\2\124\3\125\2\124\1\123\1\125\1\124\1\125\1\124\1\125\14\124\5\125\33\124\1\125\1\124\3\125\33\124\1\125\1\124\1\125\uff81\124",
            "\41\127\2\126\2\127\3\126\2\127\2\126\1\127\1\126\1\127\1\126\14\127\5\126\33\127\1\126\1\127\3\126\33\127\1\126\1\127\1\126\uff81\127",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\135",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\41\71\2\67\2\71\2\67\1\70\2\71\2\67\1\71\1\67\1\71\1\67\14\71\5\67\33\71\1\66\1\71\3\67\33\71\1\67\1\71\1\67\uff81\71",
            "\41\71\1\77\1\100\2\71\3\77\2\71\2\77\1\71\1\77\1\71\1\77\14\71\5\77\33\71\1\76\1\71\3\77\33\71\1\77\1\71\1\77\uff81\71",
            "\41\124\2\125\2\124\3\125\2\124\1\123\1\125\1\124\1\125\1\124\1\143\14\124\5\125\33\124\1\125\1\124\3\125\33\124\1\125\1\124\1\125\uff81\124",
            "",
            "\41\124\2\125\2\124\3\125\2\124\1\123\1\125\1\124\1\125\1\124\1\125\14\124\5\125\33\124\1\125\1\124\3\125\33\124\1\125\1\124\1\125\uff81\124",
            "\41\127\2\126\2\127\3\126\2\127\2\126\1\127\1\126\1\127\1\126\14\127\5\126\33\127\1\126\1\127\3\126\33\127\1\126\1\127\1\126\uff81\127",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\153",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\155",
            "\41\124\2\125\2\124\3\125\2\124\1\123\1\125\1\124\1\125\1\124\1\125\14\124\5\125\33\124\1\125\1\124\3\125\33\124\1\125\1\124\1\125\uff81\124",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\157",
            "\1\160",
            "\1\162\4\uffff\1\161",
            "\1\163",
            "",
            "\1\164",
            "",
            "\1\165",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\173",
            "\1\174",
            "",
            "\1\175",
            "\1\176",
            "\1\177",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0081",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0083",
            "\1\u0084",
            "",
            "\1\u0085",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0087",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u0089",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_LIDLIDSYMBOL | RULE_NUMBER | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_62 = input.LA(1);

                        s = -1;
                        if ( ((LA14_62>='!' && LA14_62<='\"')||(LA14_62>='%' && LA14_62<='\'')||(LA14_62>='*' && LA14_62<='+')||LA14_62=='-'||LA14_62=='/'||(LA14_62>='<' && LA14_62<='@')||LA14_62=='\\'||(LA14_62>='^' && LA14_62<='`')||LA14_62=='|'||LA14_62=='~') ) {s = 82;}

                        else if ( ((LA14_62>='\u0000' && LA14_62<=' ')||(LA14_62>='#' && LA14_62<='$')||(LA14_62>='(' && LA14_62<=')')||LA14_62==','||LA14_62=='.'||(LA14_62>='0' && LA14_62<=';')||(LA14_62>='A' && LA14_62<='[')||LA14_62==']'||(LA14_62>='a' && LA14_62<='{')||LA14_62=='}'||(LA14_62>='\u007F' && LA14_62<='\uFFFF')) ) {s = 57;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_54 = input.LA(1);

                        s = -1;
                        if ( ((LA14_54>='!' && LA14_54<='\"')||(LA14_54>='%' && LA14_54<='\'')||(LA14_54>='*' && LA14_54<='+')||LA14_54=='-'||LA14_54=='/'||(LA14_54>='<' && LA14_54<='@')||LA14_54=='\\'||(LA14_54>='^' && LA14_54<='`')||LA14_54=='|'||LA14_54=='~') ) {s = 81;}

                        else if ( ((LA14_54>='\u0000' && LA14_54<=' ')||(LA14_54>='#' && LA14_54<='$')||(LA14_54>='(' && LA14_54<=')')||LA14_54==','||LA14_54=='.'||(LA14_54>='0' && LA14_54<=';')||(LA14_54>='A' && LA14_54<='[')||LA14_54==']'||(LA14_54>='a' && LA14_54<='{')||LA14_54=='}'||(LA14_54>='\u007F' && LA14_54<='\uFFFF')) ) {s = 57;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_85 = input.LA(1);

                        s = -1;
                        if ( (LA14_85=='*') ) {s = 83;}

                        else if ( ((LA14_85>='!' && LA14_85<='\"')||(LA14_85>='%' && LA14_85<='\'')||LA14_85=='+'||LA14_85=='-'||LA14_85=='/'||(LA14_85>='<' && LA14_85<='@')||LA14_85=='\\'||(LA14_85>='^' && LA14_85<='`')||LA14_85=='|'||LA14_85=='~') ) {s = 85;}

                        else if ( ((LA14_85>='\u0000' && LA14_85<=' ')||(LA14_85>='#' && LA14_85<='$')||(LA14_85>='(' && LA14_85<=')')||LA14_85==','||LA14_85=='.'||(LA14_85>='0' && LA14_85<=';')||(LA14_85>='A' && LA14_85<='[')||LA14_85==']'||(LA14_85>='a' && LA14_85<='{')||LA14_85=='}'||(LA14_85>='\u007F' && LA14_85<='\uFFFF')) ) {s = 84;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_66 = input.LA(1);

                        s = -1;
                        if ( ((LA14_66>='!' && LA14_66<='\"')||(LA14_66>='%' && LA14_66<='\'')||(LA14_66>='*' && LA14_66<='+')||LA14_66=='-'||LA14_66=='/'||(LA14_66>='<' && LA14_66<='@')||LA14_66=='\\'||(LA14_66>='^' && LA14_66<='`')||LA14_66=='|'||LA14_66=='~') ) {s = 86;}

                        else if ( ((LA14_66>='\u0000' && LA14_66<=' ')||(LA14_66>='#' && LA14_66<='$')||(LA14_66>='(' && LA14_66<=')')||LA14_66==','||LA14_66=='.'||(LA14_66>='0' && LA14_66<=';')||(LA14_66>='A' && LA14_66<='[')||LA14_66==']'||(LA14_66>='a' && LA14_66<='{')||LA14_66=='}'||(LA14_66>='\u007F' && LA14_66<='\uFFFF')) ) {s = 87;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0==',') ) {s = 1;}

                        else if ( (LA14_0=='.') ) {s = 2;}

                        else if ( (LA14_0=='t') ) {s = 3;}

                        else if ( (LA14_0=='f') ) {s = 4;}

                        else if ( (LA14_0=='a') ) {s = 5;}

                        else if ( (LA14_0=='i') ) {s = 6;}

                        else if ( (LA14_0=='o') ) {s = 7;}

                        else if ( (LA14_0==';') ) {s = 8;}

                        else if ( (LA14_0=='d') ) {s = 9;}

                        else if ( (LA14_0=='{') ) {s = 10;}

                        else if ( (LA14_0=='}') ) {s = 11;}

                        else if ( (LA14_0==':') ) {s = 12;}

                        else if ( (LA14_0==']') ) {s = 13;}

                        else if ( (LA14_0=='(') ) {s = 14;}

                        else if ( (LA14_0==')') ) {s = 15;}

                        else if ( (LA14_0=='[') ) {s = 16;}

                        else if ( (LA14_0=='p') ) {s = 17;}

                        else if ( (LA14_0=='w') ) {s = 18;}

                        else if ( (LA14_0=='U') ) {s = 19;}

                        else if ( (LA14_0=='\'') ) {s = 20;}

                        else if ( (LA14_0=='^') ) {s = 21;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 22;}

                        else if ( (LA14_0=='_') ) {s = 23;}

                        else if ( (LA14_0=='\"') ) {s = 24;}

                        else if ( ((LA14_0>='A' && LA14_0<='T')||(LA14_0>='V' && LA14_0<='Z')||(LA14_0>='b' && LA14_0<='c')||LA14_0=='e'||(LA14_0>='g' && LA14_0<='h')||(LA14_0>='j' && LA14_0<='n')||(LA14_0>='q' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='v')||(LA14_0>='x' && LA14_0<='z')) ) {s = 25;}

                        else if ( (LA14_0=='/') ) {s = 26;}

                        else if ( (LA14_0=='!'||(LA14_0>='%' && LA14_0<='&')||(LA14_0>='*' && LA14_0<='+')||LA14_0=='-'||(LA14_0>='<' && LA14_0<='@')||LA14_0=='\\'||LA14_0=='`'||LA14_0=='|'||LA14_0=='~') ) {s = 27;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 28;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='$')||(LA14_0>='\u007F' && LA14_0<='\uFFFF')) ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_83 = input.LA(1);

                        s = -1;
                        if ( (LA14_83=='/') ) {s = 99;}

                        else if ( (LA14_83=='*') ) {s = 83;}

                        else if ( ((LA14_83>='!' && LA14_83<='\"')||(LA14_83>='%' && LA14_83<='\'')||LA14_83=='+'||LA14_83=='-'||(LA14_83>='<' && LA14_83<='@')||LA14_83=='\\'||(LA14_83>='^' && LA14_83<='`')||LA14_83=='|'||LA14_83=='~') ) {s = 85;}

                        else if ( ((LA14_83>='\u0000' && LA14_83<=' ')||(LA14_83>='#' && LA14_83<='$')||(LA14_83>='(' && LA14_83<=')')||LA14_83==','||LA14_83=='.'||(LA14_83>='0' && LA14_83<=';')||(LA14_83>='A' && LA14_83<='[')||LA14_83==']'||(LA14_83>='a' && LA14_83<='{')||LA14_83=='}'||(LA14_83>='\u007F' && LA14_83<='\uFFFF')) ) {s = 84;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_20 = input.LA(1);

                        s = -1;
                        if ( (LA14_20=='\\') ) {s = 54;}

                        else if ( ((LA14_20>='!' && LA14_20<='\"')||(LA14_20>='%' && LA14_20<='&')||(LA14_20>='*' && LA14_20<='+')||LA14_20=='-'||LA14_20=='/'||(LA14_20>='<' && LA14_20<='@')||(LA14_20>='^' && LA14_20<='`')||LA14_20=='|'||LA14_20=='~') ) {s = 55;}

                        else if ( (LA14_20=='\'') ) {s = 56;}

                        else if ( ((LA14_20>='\u0000' && LA14_20<=' ')||(LA14_20>='#' && LA14_20<='$')||(LA14_20>='(' && LA14_20<=')')||LA14_20==','||LA14_20=='.'||(LA14_20>='0' && LA14_20<=';')||(LA14_20>='A' && LA14_20<='[')||LA14_20==']'||(LA14_20>='a' && LA14_20<='{')||LA14_20=='}'||(LA14_20>='\u007F' && LA14_20<='\uFFFF')) ) {s = 57;}

                        else s = 53;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_86 = input.LA(1);

                        s = -1;
                        if ( ((LA14_86>='!' && LA14_86<='\"')||(LA14_86>='%' && LA14_86<='\'')||(LA14_86>='*' && LA14_86<='+')||LA14_86=='-'||LA14_86=='/'||(LA14_86>='<' && LA14_86<='@')||LA14_86=='\\'||(LA14_86>='^' && LA14_86<='`')||LA14_86=='|'||LA14_86=='~') ) {s = 86;}

                        else if ( ((LA14_86>='\u0000' && LA14_86<=' ')||(LA14_86>='#' && LA14_86<='$')||(LA14_86>='(' && LA14_86<=')')||LA14_86==','||LA14_86=='.'||(LA14_86>='0' && LA14_86<=';')||(LA14_86>='A' && LA14_86<='[')||LA14_86==']'||(LA14_86>='a' && LA14_86<='{')||LA14_86=='}'||(LA14_86>='\u007F' && LA14_86<='\uFFFF')) ) {s = 87;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_81 = input.LA(1);

                        s = -1;
                        if ( (LA14_81=='\'') ) {s = 56;}

                        else if ( (LA14_81=='\\') ) {s = 54;}

                        else if ( ((LA14_81>='!' && LA14_81<='\"')||(LA14_81>='%' && LA14_81<='&')||(LA14_81>='*' && LA14_81<='+')||LA14_81=='-'||LA14_81=='/'||(LA14_81>='<' && LA14_81<='@')||(LA14_81>='^' && LA14_81<='`')||LA14_81=='|'||LA14_81=='~') ) {s = 55;}

                        else if ( ((LA14_81>='\u0000' && LA14_81<=' ')||(LA14_81>='#' && LA14_81<='$')||(LA14_81>='(' && LA14_81<=')')||LA14_81==','||LA14_81=='.'||(LA14_81>='0' && LA14_81<=';')||(LA14_81>='A' && LA14_81<='[')||LA14_81==']'||(LA14_81>='a' && LA14_81<='{')||LA14_81=='}'||(LA14_81>='\u007F' && LA14_81<='\uFFFF')) ) {s = 57;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_55 = input.LA(1);

                        s = -1;
                        if ( (LA14_55=='\'') ) {s = 56;}

                        else if ( (LA14_55=='\\') ) {s = 54;}

                        else if ( ((LA14_55>='!' && LA14_55<='\"')||(LA14_55>='%' && LA14_55<='&')||(LA14_55>='*' && LA14_55<='+')||LA14_55=='-'||LA14_55=='/'||(LA14_55>='<' && LA14_55<='@')||(LA14_55>='^' && LA14_55<='`')||LA14_55=='|'||LA14_55=='~') ) {s = 55;}

                        else if ( ((LA14_55>='\u0000' && LA14_55<=' ')||(LA14_55>='#' && LA14_55<='$')||(LA14_55>='(' && LA14_55<=')')||LA14_55==','||LA14_55=='.'||(LA14_55>='0' && LA14_55<=';')||(LA14_55>='A' && LA14_55<='[')||LA14_55==']'||(LA14_55>='a' && LA14_55<='{')||LA14_55=='}'||(LA14_55>='\u007F' && LA14_55<='\uFFFF')) ) {s = 57;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_99 = input.LA(1);

                        s = -1;
                        if ( (LA14_99=='*') ) {s = 83;}

                        else if ( ((LA14_99>='!' && LA14_99<='\"')||(LA14_99>='%' && LA14_99<='\'')||LA14_99=='+'||LA14_99=='-'||LA14_99=='/'||(LA14_99>='<' && LA14_99<='@')||LA14_99=='\\'||(LA14_99>='^' && LA14_99<='`')||LA14_99=='|'||LA14_99=='~') ) {s = 85;}

                        else if ( ((LA14_99>='\u0000' && LA14_99<=' ')||(LA14_99>='#' && LA14_99<='$')||(LA14_99>='(' && LA14_99<=')')||LA14_99==','||LA14_99=='.'||(LA14_99>='0' && LA14_99<=';')||(LA14_99>='A' && LA14_99<='[')||LA14_99==']'||(LA14_99>='a' && LA14_99<='{')||LA14_99=='}'||(LA14_99>='\u007F' && LA14_99<='\uFFFF')) ) {s = 84;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_65 = input.LA(1);

                        s = -1;
                        if ( (LA14_65=='*') ) {s = 83;}

                        else if ( ((LA14_65>='\u0000' && LA14_65<=' ')||(LA14_65>='#' && LA14_65<='$')||(LA14_65>='(' && LA14_65<=')')||LA14_65==','||LA14_65=='.'||(LA14_65>='0' && LA14_65<=';')||(LA14_65>='A' && LA14_65<='[')||LA14_65==']'||(LA14_65>='a' && LA14_65<='{')||LA14_65=='}'||(LA14_65>='\u007F' && LA14_65<='\uFFFF')) ) {s = 84;}

                        else if ( ((LA14_65>='!' && LA14_65<='\"')||(LA14_65>='%' && LA14_65<='\'')||LA14_65=='+'||LA14_65=='-'||LA14_65=='/'||(LA14_65>='<' && LA14_65<='@')||LA14_65=='\\'||(LA14_65>='^' && LA14_65<='`')||LA14_65=='|'||LA14_65=='~') ) {s = 85;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_24 = input.LA(1);

                        s = -1;
                        if ( (LA14_24=='\\') ) {s = 62;}

                        else if ( (LA14_24=='!'||(LA14_24>='%' && LA14_24<='\'')||(LA14_24>='*' && LA14_24<='+')||LA14_24=='-'||LA14_24=='/'||(LA14_24>='<' && LA14_24<='@')||(LA14_24>='^' && LA14_24<='`')||LA14_24=='|'||LA14_24=='~') ) {s = 63;}

                        else if ( (LA14_24=='\"') ) {s = 64;}

                        else if ( ((LA14_24>='\u0000' && LA14_24<=' ')||(LA14_24>='#' && LA14_24<='$')||(LA14_24>='(' && LA14_24<=')')||LA14_24==','||LA14_24=='.'||(LA14_24>='0' && LA14_24<=';')||(LA14_24>='A' && LA14_24<='[')||LA14_24==']'||(LA14_24>='a' && LA14_24<='{')||LA14_24=='}'||(LA14_24>='\u007F' && LA14_24<='\uFFFF')) ) {s = 57;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_82 = input.LA(1);

                        s = -1;
                        if ( (LA14_82=='\"') ) {s = 64;}

                        else if ( (LA14_82=='\\') ) {s = 62;}

                        else if ( (LA14_82=='!'||(LA14_82>='%' && LA14_82<='\'')||(LA14_82>='*' && LA14_82<='+')||LA14_82=='-'||LA14_82=='/'||(LA14_82>='<' && LA14_82<='@')||(LA14_82>='^' && LA14_82<='`')||LA14_82=='|'||LA14_82=='~') ) {s = 63;}

                        else if ( ((LA14_82>='\u0000' && LA14_82<=' ')||(LA14_82>='#' && LA14_82<='$')||(LA14_82>='(' && LA14_82<=')')||LA14_82==','||LA14_82=='.'||(LA14_82>='0' && LA14_82<=';')||(LA14_82>='A' && LA14_82<='[')||LA14_82==']'||(LA14_82>='a' && LA14_82<='{')||LA14_82=='}'||(LA14_82>='\u007F' && LA14_82<='\uFFFF')) ) {s = 57;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_63 = input.LA(1);

                        s = -1;
                        if ( (LA14_63=='\"') ) {s = 64;}

                        else if ( (LA14_63=='\\') ) {s = 62;}

                        else if ( (LA14_63=='!'||(LA14_63>='%' && LA14_63<='\'')||(LA14_63>='*' && LA14_63<='+')||LA14_63=='-'||LA14_63=='/'||(LA14_63>='<' && LA14_63<='@')||(LA14_63>='^' && LA14_63<='`')||LA14_63=='|'||LA14_63=='~') ) {s = 63;}

                        else if ( ((LA14_63>='\u0000' && LA14_63<=' ')||(LA14_63>='#' && LA14_63<='$')||(LA14_63>='(' && LA14_63<=')')||LA14_63==','||LA14_63=='.'||(LA14_63>='0' && LA14_63<=';')||(LA14_63>='A' && LA14_63<='[')||LA14_63==']'||(LA14_63>='a' && LA14_63<='{')||LA14_63=='}'||(LA14_63>='\u007F' && LA14_63<='\uFFFF')) ) {s = 57;}

                        else s = 58;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}