package core.parser.token.lexer;

import core.err.MethodNotSupportedException;
import core.parser.token.Token;
import core.parser.token.TokenType;
import core.common.log.BetterLogger;
import core.common.log.BetterToString;
import core.common.ch.CharIter;
import core.common.ch.Position;

import java.util.*;
import java.util.regex.Matcher;

/**
 * ID_Part, Literals, ID_Qualified, Operators
 * Strategy: Analysing Lexer
 */
public class InteractionIDLexer extends AbstractLexer
{
	private static final Map<String, TokenType> KEYWORDS = new HashMap<>();

	private static final Map<Character, TokenType> OPERATORS = new HashMap<>();

	static
	{
		KEYWORDS.put("in", TokenType.KW_DirIn);
		KEYWORDS.put("out", TokenType.KW_DirOut);

		OPERATORS.put('(', TokenType.LParen);
		OPERATORS.put(')', TokenType.RParen);
		OPERATORS.put(':', TokenType.Colon);
		OPERATORS.put('{', TokenType.LBrace);
		OPERATORS.put('}', TokenType.RBrace);
		OPERATORS.put(',', TokenType.RBrace);
	}

	private Position srt = null;
	private Position end = null;

	public InteractionIDLexer(CharIter iter) {super(iter);}

	List<Token> tokenList = null;
	int index = 0;

	@Override
	public Token nextToken() throws MethodNotSupportedException
	{
		if (tokenList == null || tokenList.get(index).getType() == TokenType.Nil)
		{
			tokenList = listToken();
			index = -1;
		}
		index++;
		if (index >= tokenList.size())
		{
			tokenList = listToken();
			index = 0;
		}
		return tokenList.get(index);
//		throw new MethodNotSupportedException("InteractionIDLexer do not support AbstractLexer#nextToken");
	}

	@Override
	public List<Token> listToken()
	{
		skipWSCharacters(iter);
		srt = iter.currentPos();
		String idRaw = getTransformRegion();
		end = iter.currentPos();
		return transformSuffixAndTokenize(idRaw);
	}

	private List<Token> transformSuffixAndTokenize(String idRaw)
	{
		// phase 1:
		// remove LR_Paren, strip WS
		assertChar(idRaw.charAt(0), '(');
		assertChar(idRaw.charAt(idRaw.length() - 1), ')');
		idRaw = idRaw.trim().substring(1, idRaw.length() - 1).trim();
		BetterLogger.debug(
				"Lexer",
				"InteractionIDLexer#transformSuffixAndTokenize phase1:\n" + idRaw,
				true
		);
		// phase 2:
		// recognize param parts, tokenize them
		List<String> paramsRaw = new ArrayList<>();
		StringBuilder textRaw = new StringBuilder();
		int si = 0, ei = 0;
		for (int i = 0; i < idRaw.length(); )
		{
			char ch = idRaw.charAt(i);
			if (ch == '(')
			{
				int stack = 1;
				textRaw.append("$");
				si = i++;
				while (i < idRaw.length() && stack != 0)
				{
					if (idRaw.charAt(i) == '(')
						stack++;
					if (idRaw.charAt(i) == ')')
						stack--;
					i++;
				}
				if (stack != 0)
					invalidToken(idRaw, "Expression", "Mismatching parentheses", srt, end);
				ei = i;
				paramsRaw.add(idRaw.substring(si, ei));
			}
			else
			{
				textRaw.append(ch);
				i++;
			}
		}
		String text = textRaw.toString()
		                     .replaceAll("[\\s]*\\$[\\s]*", Matcher.quoteReplacement("$"))
		                     .replaceAll("[\\s]+", "_");
		List<List<Token>> params = new ArrayList<>();
		for (String paramRaw : paramsRaw)
		{
			List<Token> param = new ArrayList<>();
			CharIter it = new CharIter(paramRaw);
			while (true)
			{
				Token t = nextTokenParam(it);
				if (t.equalsType(TokenType.EOF))
					break;
				param.add(t);
			}
			params.add(param);
		}
		BetterLogger.debug(
				"Lexer",
				"InteractionIDLexer#transformSuffixAndTokenize phase2:\n" +
						text + "\n" +
						BetterToString.str(params) + "\n",
				true
		);
		// phase 3:
		// transform to suffix
		List<Token> res = new ArrayList<>();
		res.add(new Token(TokenType.LParen, "(", srt, end));
		res.add(new Token(TokenType.ID_Qualified, text, srt, end));
		res.addAll(params.stream().collect(ArrayList<Token>::new, ArrayList::addAll, ArrayList::addAll));
		res.add(new Token(TokenType.RParen, ")", srt, end));
		BetterLogger.debug(
				"Lexer",
				"InteractionIDLexer#transformSuffixAndTokenize phase3:\n" +
						BetterToString.str(res) + "\n",
				true
		);
		return res;
	}

	private Token nextTokenParam(CharIter it)
	{
		if (!it.hasNext())
			return new Token(TokenType.EOF, null, it.currentPos(), it.currentPos());
		skipWSCharacters(it);
		char ch = it.peekChar();
		if (OPERATORS.containsKey(ch))
		{
			it.nextChar();
			return new Token(OPERATORS.get(ch), ch, it.previousPos(), it.currentPos());
		}
		else
		{
			return lexKeywordOrIdent(it);
		}
	}

	private Token lexKeywordOrIdent(CharIter it)
	{
		char peek = it.peekChar();
		Position srt = it.currentPos();
		StringBuilder keyRaw = new StringBuilder();
		while (Character.isDigit(peek) || Character.isAlphabetic(peek) || peek == '_' || peek == '.')
		{
			keyRaw.append(it.nextChar());
			peek = it.peekChar();
		}
		String key = keyRaw.toString();
		if (KEYWORDS.containsKey(key))
			return new Token(KEYWORDS.get(key), key, srt, it.currentPos());
		return new Token(TokenType.ID_Qualified, key, srt, it.currentPos());
	}

	private String getTransformRegion()
	{
		char peek = iter.nextChar();
		if (peek != '(')
			invalidToken(peek + "", "Interaction ID", "Interaction ID should start with '('", iter.currentPos(),
			             iter.nextPos());
		int stack = 1;
		StringBuilder idDef = new StringBuilder("(");
		while (stack != 0)
		{
			peek = iter.nextChar();
			idDef.append(peek);
			if (peek == '(')
				stack++;
			if (peek == ')')
				stack--;
			if (stack > 2)
			{
				invalidToken(peek + "", "Interaction ID",
				             "Interaction ID should not have tripple nested parens.",
				             iter.currentPos(),
				             iter.nextPos());
			}
		}
		return idDef.toString();
	}
}
