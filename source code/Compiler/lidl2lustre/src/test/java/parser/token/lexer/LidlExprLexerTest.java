package parser.token.lexer;

import core.common.ch.CharIter;
import core.common.log.BetterLogger;
import core.parser.token.lexer.LidlExprLexer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import core.parser.token.Token;
import core.parser.token.TokenType;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LidlExprLexerTest
{
	LidlExprLexer lexer;
	private static final String[] TC = new String[]{
//			"(main)",
//			"( button  on (state)and    displaying(get (active) text))",
//			"(test(true)is(\"jfklsd\")and(123.543)or(33))",
			"({number: (233), text: (\"hello\")})",
	};

	private static final TokenType[][] TK = new TokenType[][]{
//			new TokenType[]{
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					TokenType.RParen
//			},
//			new TokenType[]{
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					// param 1
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					TokenType.RParen,
//					// end
//					// param 2
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					// nested 1 param 1
//					TokenType.LParen,
//					TokenType.L_Activation,
//					TokenType.RParen,
//					// nested 1 end
//					TokenType.RParen,
//					// end
//					TokenType.RParen
//			},
//			new TokenType[]{
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					TokenType.LParen,
//					TokenType.L_Boolean,
//					TokenType.RParen,
//					TokenType.LParen,
//					TokenType.L_String,
//					TokenType.RParen,
//					TokenType.LParen,
//					TokenType.L_Number,
//					TokenType.RParen,
//					TokenType.LParen,
//					TokenType.L_Number,
//					TokenType.RParen,
//					TokenType.RParen
//			},
			new TokenType[]{
					TokenType.LParen,
					TokenType.LBrace,
					TokenType.ID_Qualified,
					TokenType.Colon,
					TokenType.LParen,
					TokenType.L_Number,
					TokenType.RParen,
					TokenType.Comma,
					TokenType.ID_Qualified,
					TokenType.Colon,
					TokenType.LParen,
					TokenType.L_String,
					TokenType.RParen,
					TokenType.RBrace,
					TokenType.RParen
			}
	};

	@BeforeEach
	void setUp()
	{
		BetterLogger.setLogLevel(BetterLogger.LogLevel.All);
	}

	@Test
	void listToken()
	{
		for (int s = 0; s < TC.length; s++)
		{
			lexer = new LidlExprLexer(new CharIter(TC[s]));
//			assertThrows(MethodNotSupportedException.class, lexer::nextToken);
			List<Token> list = lexer.listToken();
			assertArrayEquals(list.stream().map(Token::getType).toArray(), TK[s]);
		}
	}
}