package core.parser.token.lexer;

import core.err.MethodNotSupportedException;
import core.parser.token.Token;
import core.common.log.BetterLogger;
import core.common.ch.CharIter;
import core.common.ch.Position;

import java.util.List;

public abstract class AbstractLexer
{
	protected CharIter iter;

	public AbstractLexer(CharIter iter)
	{
		this.iter = iter;
	}

	public abstract Token nextToken() throws MethodNotSupportedException;

	public abstract List<Token> listToken() throws MethodNotSupportedException;

	protected void skipWSCharacters(CharIter ir)
	{
		while (ir.hasNext() && Character.isWhitespace(ir.peekChar()))
		{
			ir.nextChar();
		}
	}

	protected void unknownToken(String rec, String req, Position srt, Position end)
	{
		BetterLogger.error("Lexer", String.format(
				"Unknown %s [%s] from %s to %s",
				req, rec, srt.toString(), end.toString()
		));
		System.exit(-1);
	}

	protected void invalidToken(String rec, String req, String cause, Position srt, Position end)
	{
		BetterLogger.error("Lexer", String.format(
				"Invalid %s [%s] from %s to %s, cause: %s",
				req, rec, srt, end, cause
		));
		System.exit(-1);
	}

	protected void assertChar(char src, char ans)
	{
		if (src == ans)
			return;
		BetterLogger.error("Lexer", String.format(
				"Assert Error, expecting [%s], but got [%s]",
				ans, src
		));
	}
}
