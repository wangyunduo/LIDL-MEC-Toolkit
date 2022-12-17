package core.parser.token.lexer;

import core.parser.token.Token;
import core.parser.token.TokenType;
import core.common.log.BetterLogger;
import core.common.log.BetterToString;
import core.common.ch.CharIter;
import core.common.math.FixedPoint;
import core.common.ch.Position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Keywords, ID_Qualified, Operators
 * <p>
 * Strategy: Normal Lexer
 */
public class NormalLexer extends AbstractLexer
{
	private static final Map<String, TokenType> KEYWORDS = new HashMap<>();

	static
	{
		KEYWORDS.put("package", TokenType.KW_Package);
		KEYWORDS.put("import", TokenType.KW_Import);

		KEYWORDS.put("Predefined", TokenType.KW_Predefined);
		KEYWORDS.put("with", TokenType.KW_With);
		KEYWORDS.put("is", TokenType.KW_Is);

		KEYWORDS.put("data", TokenType.KW_Data);
		KEYWORDS.put("interface", TokenType.KW_Interface);
		KEYWORDS.put("interaction", TokenType.KW_Interaction);

		KEYWORDS.put("in", TokenType.KW_DirIn);
		KEYWORDS.put("out", TokenType.KW_DirOut);
	}

	public NormalLexer(CharIter iter)
	{
		super(iter);
	}

	/**
	 * Next token at CharIter, see {@link CharIter}
	 *
	 * @return Token
	 */
	@Override
	public Token nextToken()
	{
		skipWSCharacters(iter);
		if (!iter.hasNext())
		{
			return new Token(TokenType.EOF, null, iter.currentPos(), iter.currentPos());
		}

		char peek = iter.peekChar();

		if (Character.isAlphabetic(peek))
		{
			return lexKeywordOrIdent();
		}
		else
		{
			return lexOperatorOrUnknown();
		}
	}

	/**
	 * Unused
	 *
	 * @return list of tokens, see {@link Token}
	 */
	@Override
	public List<Token> listToken()
	{
		List<Token> list = new ArrayList<>();
		Token temp;
		do
		{
			temp = nextToken();
			list.add(temp);
		} while (!temp.equalsType(TokenType.EOF));
		BetterLogger.debug(
				"Lexer",
				"NormalLexer#listToken result:\n" +
				BetterToString.str(list) + "\n",
				true
		);
		return list;
	}

	private Token lexNumberLiteral()
	{
		char peek = iter.peekChar();
		Position srtPos = iter.currentPos();
		StringBuilder numberRaw = new StringBuilder();
		while (Character.isDigit(peek) || peek == '.')
		{
			numberRaw.append(iter.nextChar());
			peek = iter.peekChar();
		}

		FixedPoint res = new FixedPoint();
		try
		{
			res = new FixedPoint(numberRaw.toString());
		} catch (Exception e)
		{
			invalidToken(numberRaw.toString(), "Number", "Invalid Number Format", srtPos, iter.currentPos());
		}

		return new Token(TokenType.L_Number, res, srtPos, iter.currentPos());
	}

	private Token lexStringLiteral()
	{
		StringBuilder s = new StringBuilder();
		iter.nextChar();
		var c = iter.peekChar();
		var srt = iter.currentPos();
		while (c != '\"')
		{
			if (c == '\\')
			{
				iter.nextChar();
				char a = iter.nextChar();
				switch (a)
				{
					case 'n':
						s.append('\n');
						break;
					case 't':
						s.append('\t');
						break;
					case 'r':
						s.append('\r');
						break;
					default:
						s.append(a);
				}
			}
			else
			{
				s.append(iter.nextChar());
			}
			c = iter.peekChar();
		}
		iter.nextChar();
		return new Token(TokenType.L_String, s.toString(), srt, iter.currentPos());
	}

	private Token lexKeywordOrIdent()
	{
		char peek = iter.peekChar();
		Position srt = iter.currentPos();
		StringBuilder keyRaw = new StringBuilder();
		while (Character.isDigit(peek) || Character.isAlphabetic(peek) || peek == '_' || peek == '.' || peek == '*')
		{
			keyRaw.append(iter.nextChar());
			peek = iter.peekChar();
		}
		String key = keyRaw.toString();
		if (KEYWORDS.containsKey(key))
			return new Token(KEYWORDS.get(key), key, srt, iter.currentPos());
		return new Token(TokenType.ID_Qualified, key, srt, iter.currentPos());
	}

	private Token lexOperatorOrUnknown()
	{
		char ch = iter.nextChar();
		switch (ch)
		{
			case '/':
				// /
				if (iter.peekChar() == '/')
				{
					// //
					iter.nextChar();
					Position srt = iter.previousPos();
					StringBuilder value = new StringBuilder("//");
					for (char c = iter.nextChar(); c != '\n'; c = iter.nextChar())
					{
						value.append(c);
					}
					return new Token(TokenType.Comment, value.toString(), srt, iter.currentPos());
				}
				invalidToken("/", "Comment", "missing another '/'", iter.currentPos(), iter.nextPos());

			case '(':
				// (
				return new Token(TokenType.LParen, "(", iter.previousPos(), iter.currentPos());

			case ')':
				// )
				return new Token(TokenType.RParen, ")", iter.previousPos(), iter.currentPos());

			case '{':
				// {
				return new Token(TokenType.LBrace, "{", iter.previousPos(), iter.currentPos());

			case '}':
				// }
				return new Token(TokenType.RBrace, "}", iter.previousPos(), iter.currentPos());

			case '[':
				// [
				return new Token(TokenType.LBrack, "[", iter.previousPos(), iter.currentPos());

			case ']':
				// [
				return new Token(TokenType.RBrack, "]", iter.previousPos(), iter.currentPos());

			case ',':
				// ,
				return new Token(TokenType.Comma, ",", iter.previousPos(), iter.currentPos());

			case ':':
				// :
				return new Token(TokenType.Colon, ":", iter.previousPos(), iter.currentPos());

			case ';':
				// ;
				return new Token(TokenType.SemiColon, ";", iter.previousPos(), iter.currentPos());

			case '-':
				// ->
				char peek = iter.peekChar();
				if (peek == '>')
				{
					iter.nextChar();
					return new Token(TokenType.RightArrow, "->", iter.previousPos(), iter.currentPos());
				}
				unknownToken(ch + "" + peek, "Operator", iter.previousPos(), iter.currentPos());

			default:
				unknownToken(ch + "", "Operator", iter.previousPos(), iter.currentPos());
		}
		unknownToken(ch + "", "Operator", iter.previousPos(), iter.currentPos());
		// Unreachable code
		return null;
	}
}
