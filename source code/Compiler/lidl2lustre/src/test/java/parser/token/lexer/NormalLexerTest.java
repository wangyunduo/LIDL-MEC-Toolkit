package parser.token.lexer;

import core.parser.token.lexer.NormalLexer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import core.parser.token.Token;
import core.parser.token.TokenType;
import core.common.log.BetterLogger;
import core.common.ch.CharIter;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NormalLexerTest
{
	NormalLexer lexer;

	private static final String[][] TC = new String[][]{
			new String[]{
					"package default;\n",
					"import lidl.lang.*;\n"
			},
			new String[]{
					"data\n",
					"   MyData1\n",
					"is\n",
					"   Text\n"
			},
			new String[]{
					"interface\n",
					"   MyInterface\n",
					"is\n",
					"   Text out\n"
			},
			new String[]{
					"interface\n",
					"   MyInterface\n",
					"is\n",
					"{\n",
					"	x: { da: Text, db: Number } out,\n",
					"	y: { ia: Text in, ib: Number out },\n",
					"}\n"
			},
	};

	private static final TokenType[][] TK = new TokenType[][]{
			new TokenType[]{
					TokenType.KW_Package, TokenType.ID_Qualified, TokenType.SemiColon,
					TokenType.KW_Import, TokenType.ID_Qualified, TokenType.SemiColon,
					TokenType.EOF
			},
			new TokenType[]{
					TokenType.KW_Data,
					TokenType.ID_Qualified,
					TokenType.KW_Is,
					TokenType.ID_Qualified,
					TokenType.EOF
			},
			new TokenType[]{
					TokenType.KW_Interface,
					TokenType.ID_Qualified,
					TokenType.KW_Is,
					TokenType.ID_Qualified,
					TokenType.KW_DirOut,
					TokenType.EOF
			},
			new TokenType[]{

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
			lexer = new NormalLexer(new CharIter(Arrays.stream(TC[s]).reduce((x, y) -> x + y).orElseThrow()));
			List<Token> list = lexer.listToken();
			for (int i = 0; i < list.size(); i++)
			{
				assertTrue(list.get(i).equalsType(TK[s][i]));
			}
		}
	}
}