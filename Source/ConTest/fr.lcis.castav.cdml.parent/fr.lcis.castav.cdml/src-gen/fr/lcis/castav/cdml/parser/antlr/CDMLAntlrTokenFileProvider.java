/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdml.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CDMLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/lcis/castav/cdml/parser/antlr/internal/InternalCDML.tokens");
	}
}