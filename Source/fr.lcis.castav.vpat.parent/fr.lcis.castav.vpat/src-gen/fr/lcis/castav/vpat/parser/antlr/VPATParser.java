/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.vpat.parser.antlr;

import com.google.inject.Inject;
import fr.lcis.castav.vpat.parser.antlr.internal.InternalVPATParser;
import fr.lcis.castav.vpat.services.VPATGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class VPATParser extends AbstractAntlrParser {

	@Inject
	private VPATGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalVPATParser createParser(XtextTokenStream stream) {
		return new InternalVPATParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Vulnerability";
	}

	public VPATGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(VPATGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}