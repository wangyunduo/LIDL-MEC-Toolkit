/*
 * generated by Xtext 2.25.0
 */
package lab.buaa.software.lidl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LidlAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("lab/buaa/software/lidl/parser/antlr/internal/InternalLidl.tokens");
	}
}
