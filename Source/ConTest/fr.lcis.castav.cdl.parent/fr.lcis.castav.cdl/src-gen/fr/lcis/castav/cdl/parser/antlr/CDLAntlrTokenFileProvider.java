/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CDLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/lcis/castav/cdl/parser/antlr/internal/InternalCDL.tokens");
	}
}