package parser.token.lexer;

import core.parser.token.lexer.InteractionIDLexer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import core.parser.token.Token;
import core.parser.token.TokenType;
import core.common.log.BetterLogger;
import core.common.ch.CharIter;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InteractionIDLexerTest
{
	InteractionIDLexer lexer;

	private static final String[] TC = new String[]{
//			"(main)",
//			"(button  on (state: Activation in)and    displaying(text: TextInterface))",
			"((x:Number in)+(param: {x:Number in,y:Text out}))",
			"((x:Number in)+(y:Number in))",

	};

	private static final TokenType[][] TK = new TokenType[][]{
//			new TokenType[]{
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					TokenType.RParen},
//			new TokenType[]{
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					// param 1
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					TokenType.Colon,
//					TokenType.ID_Qualified,
//					TokenType.KW_DirIn,
//					TokenType.RParen,
//					// end
//					// param 2
//					TokenType.LParen,
//					TokenType.ID_Qualified,
//					TokenType.Colon,
//					TokenType.ID_Qualified,
//					TokenType.RParen,
//					// end
//					TokenType.RParen},
			new TokenType[]{},
			new TokenType[]{
					TokenType.LParen,
					TokenType.ID_Qualified,
					TokenType.LParen,
					TokenType.ID_Qualified,
					TokenType.Colon,
					TokenType.ID_Qualified,
					TokenType.KW_DirIn,
					TokenType.RParen,
					TokenType.LParen,
					TokenType.ID_Qualified,
					TokenType.Colon,
					TokenType.ID_Qualified,
					TokenType.KW_DirIn,
					TokenType.RParen,
					TokenType.RParen
			},

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
			lexer = new InteractionIDLexer(new CharIter(TC[s]));
//			assertThrows(MethodNotSupportedException.class, lexer::nextToken);
			List<Token> list = lexer.listToken();
			for (int i = 0; i < list.size(); i++)
			{
				assertTrue(list.get(i).equalsType(TK[s][i]));
			}

			String res = list.stream().map(t -> t.getValue().toString()).reduce((x, y) -> x + " " + y).orElseThrow();
			BetterLogger.success("Test", String.format("before: %s\nafter: %s", TC[s], res), true);
		}
	}

	@Test
	void nextToken()
	{
		for (int s = 0; s < TC.length; s++)
		{
			lexer = new InteractionIDLexer(new CharIter(TC[s]));
			for (int i = 0; i < TK[s].length; i++)
			{
				assertEquals(lexer.nextToken().getType(), TK[s][i]);
//				assertTrue(lexer.nextToken().equalsType(TK[s][i]));
			}
		}
	}
}