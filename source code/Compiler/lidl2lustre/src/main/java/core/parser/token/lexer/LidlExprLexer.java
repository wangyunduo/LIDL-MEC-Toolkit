package core.parser.token.lexer;

import core.common.math.FixedPoint;
import core.err.MethodNotSupportedException;
import core.parser.token.Token;
import core.parser.token.TokenType;
import core.common.log.BetterLogger;
import core.common.log.BetterToString;
import core.common.ch.CharIter;
import core.common.ch.Position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * ID_Part, Literals, ID_Qualified, Operators
 * <p>
 * Strategy: Analysing Lexer
 * <p>
 * Output: List<Token>
 */
public class LidlExprLexer extends AbstractLexer
{
	private static final Map<String, TokenType> LITERALS = new HashMap<>();
	private static final Map<Character, TokenType> OPERATORS = new HashMap<>();

	static
	{
		LITERALS.put("active", TokenType.L_Activation);
		LITERALS.put("inactive", TokenType.L_Activation);

		LITERALS.put("true", TokenType.L_Boolean);
		LITERALS.put("false", TokenType.L_Boolean);

		OPERATORS.put('(', TokenType.LParen);
		OPERATORS.put(')', TokenType.RParen);
		OPERATORS.put(':', TokenType.Colon);
		OPERATORS.put('{', TokenType.LBrace);
		OPERATORS.put('}', TokenType.RBrace);
	}

	private Position srt = null;
	private Position end = null;

	public LidlExprLexer(CharIter iter) {super(iter);}

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
		String exprRaw = getTransformRegion();
		end = iter.currentPos();
		return transformSuffixAndTokenize(exprRaw);
	}

	private List<Token> transformSuffixAndTokenize(String exprRaw)
	{
		BetterLogger.debug(
				"Lexer",
				"LidlExprLexer#transformSuffixAndTokenize before start:\n" + exprRaw,
				true
		);
		// phase 1:
		// remove LR_Paren, strip WS
		exprRaw = exprRaw.trim();
		assertChar(exprRaw.charAt(0), '(');
		assertChar(exprRaw.charAt(exprRaw.length() - 1), ')');
		exprRaw = exprRaw.substring(1, exprRaw.length() - 1).trim();
		BetterLogger.debug(
				"Lexer",
				"LidlExprLexer#transformSuffixAndTokenize phase1:\n" + exprRaw,
				true
		);
		if (!exprRaw.contains(" ") && !exprRaw.contains("("))
		{
			List<Token> res = new ArrayList<>();
			res.add(new Token(TokenType.LParen, "(", srt, end));
			res.add(lexLiteralOrIdent(exprRaw));
			res.add(new Token(TokenType.RParen, ")", srt, end));
			BetterLogger.debug("Lexer", "LiteralOrIdent: \n" + BetterToString.str(res));
			return res;
		}
		if (exprRaw.charAt(0) == '{')
		{
			List<Token> res = new ArrayList<>();
			res.add(new Token(TokenType.LParen, "(", srt, end));
			res.addAll(lexComposition(exprRaw));
			res.add(new Token(TokenType.RParen, ")", srt, end));
			BetterLogger.debug("Lexer", "Composition: \n" + BetterToString.str(res));
			return res;
		}
		// phase 2:
		// recognize param expression, transform and tokenize them
		List<String> paramExprsRaw = new ArrayList<>();
		StringBuilder textRaw = new StringBuilder();
		int si = 0, ei = 0;
		for (int i = 0; i < exprRaw.length(); )
		{
			char ch = exprRaw.charAt(i);
			if (ch == '(')
			{
				int stack = 1;
				textRaw.append("$");
				si = i++;
				while (i < exprRaw.length() && stack != 0)
				{
					if (exprRaw.charAt(i) == '(')
						stack++;
					if (exprRaw.charAt(i) == ')')
						stack--;
					i++;
				}
				if (stack != 0)
					invalidToken(exprRaw, "Expression", "Mismatching parentheses", srt, end);
				ei = i;
				paramExprsRaw.add(exprRaw.substring(si, ei));
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
		for (String paramExprRaw : paramExprsRaw)
		{
			List<Token> expr = transformSuffixAndTokenize(paramExprRaw);
			params.add(expr);
		}
		BetterLogger.debug(
				"Lexer",
				"LidlExprLexer#transformSuffixAndTokenize phase2:\n" +
						text + "\n" +
						BetterToString.str(params) + "\n",
				true
		);
		// phase 3:
		//
		List<Token> res = new ArrayList<>();
		res.add(new Token(TokenType.LParen, "(", srt, end));
		res.add(new Token(TokenType.ID_Qualified, text, srt, end));
		res.addAll(params.stream().collect(ArrayList<Token>::new, ArrayList::addAll, ArrayList::addAll));
		res.add(new Token(TokenType.RParen, ")", srt, end));
		BetterLogger.debug(
				"Lexer",
				"LidlExprLexer#transformSuffixAndTokenize phase3:\n" +
						BetterToString.str(res) + "\n",
				true
		);
		return res;
	}

	private String getTransformRegion()
	{
		char peek = iter.nextChar();
		if (peek != '(')
			invalidToken(peek + "", "Lidl Expression", "Lidl Expression should start with '('", iter.currentPos(),
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
		}
		return idDef.toString();
	}

	private List<Token> lexComposition(String compRaw)
	{
		List<Token> res = new ArrayList<>();
		assertChar(compRaw.charAt(0), '{');
		assertChar(compRaw.charAt(compRaw.length() - 1), '}');
		compRaw = compRaw.trim().substring(1, compRaw.length() - 1).trim();

		res.add(new Token(TokenType.LBrace, "{", srt, iter.currentPos()));
		List<List<Token>> tempList = new ArrayList<>();
		for (String compElemRaw : compRaw.split(","))
		{
			List<Token> temp = new ArrayList<>();
			BetterLogger.debug("Lexer", "lexComposition-Element: " + compElemRaw);
			String[] compElemRaws = compElemRaw.trim().split(":");
			if (compElemRaws.length != 2)
			{
				BetterLogger.error("Lexer", String.format(
						"Composition Element Error: <%s>", compElemRaw
				));
			}
			temp.add(lexLiteralOrIdent(compElemRaws[0].trim()));
			temp.add(new Token(TokenType.Colon, ":", srt, iter.currentPos()));
			temp.addAll(transformSuffixAndTokenize(compElemRaws[1].trim()));
			tempList.add(temp);
		}
		res.addAll(tempList.stream().reduce((x, y) ->
		                                    {
			                                    x.add(new Token(TokenType.Comma, ",", srt, iter.currentPos()));
			                                    x.addAll(y);
			                                    return x;
		                                    }).orElseThrow());
		res.add(new Token(TokenType.RBrace, "{", srt, iter.currentPos()));
		return res;
	}


	private Token lexLiteralOrIdent(String literalIdent)
	{
		if (LITERALS.containsKey(literalIdent))
			return new Token(LITERALS.get(literalIdent), literalIdent, srt, iter.currentPos());
		char[] literals = literalIdent.toCharArray();
		if (Character.isDigit(literals[0]))
			return lexNumber(literalIdent);
		if (literals[0] == '"' && literals[literals.length - 1] == '"')
			return new Token(TokenType.L_String,
			                 literalIdent.substring(1, literalIdent.length() - 1),
			                 srt, iter.currentPos());
		return new Token(TokenType.ID_Qualified, literalIdent, srt, iter.currentPos());
	}

	private Token lexNumber(String number)
	{
		FixedPoint fp = null;
		try
		{
			fp = new FixedPoint(number);
		} catch (NumberFormatException e)
		{
			invalidToken(number, "Number", "Invalid Number", srt, iter.currentPos());
		}
		assert fp != null;
		return new Token(TokenType.L_Number, fp.toString(), srt, iter.currentPos());
	}
}
