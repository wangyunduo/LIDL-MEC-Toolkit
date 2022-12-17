package core.parser.token;

import core.parser.token.lexer.AbstractLexer;
import core.parser.token.lexer.InteractionIDLexer;
import core.parser.token.lexer.LidlExprLexer;
import core.parser.token.lexer.NormalLexer;
import core.common.ch.CharIter;

import java.util.HashMap;
import java.util.Map;

/**
 * Tokenize & Syntax analyze
 */
public class Tokenizer
{
	private CharIter iter;
	private final Map<TokenizeState, AbstractLexer> lexers = new HashMap<>();

	public Tokenizer(CharIter iter)
	{
		this.iter = iter;
		lexers.put(TokenizeState.Normal, new NormalLexer(iter));
		lexers.put(TokenizeState.InteractionID, new InteractionIDLexer(iter));
		lexers.put(TokenizeState.LidlExpression, new LidlExprLexer(iter));
	}

	public AbstractLexer getLexer(TokenizeState st)
	{
		return lexers.get(st);
	}

	public boolean isEOF()
	{
		return !iter.hasNext();
	}
}
