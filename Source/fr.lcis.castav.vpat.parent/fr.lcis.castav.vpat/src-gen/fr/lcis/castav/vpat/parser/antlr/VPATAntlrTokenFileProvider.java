/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.vpat.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class VPATAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/lcis/castav/vpat/parser/antlr/internal/InternalVPAT.tokens");
	}
}