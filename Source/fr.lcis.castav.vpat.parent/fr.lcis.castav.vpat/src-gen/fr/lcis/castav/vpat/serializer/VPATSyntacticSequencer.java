/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.vpat.serializer;

import com.google.inject.Inject;
import fr.lcis.castav.vpat.services.VPATGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class VPATSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VPATGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Vulnerability___FunctionKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VPATGrammarAccess) access;
		match_Vulnerability___FunctionKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVulnerabilityAccess().getFunctionKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getVulnerabilityAccess().getLeftCurlyBracketKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getVulnerabilityAccess().getRightCurlyBracketKeyword_6_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Vulnerability___FunctionKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q.equals(syntax))
				emit_Vulnerability___FunctionKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('function' '{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     context+=Context '}' (ambiguity) '}' (rule end)
	 *     description=EString (ambiguity) '}' (rule end)
	 *     name=EString '{' (ambiguity) '}' (rule end)
	 
	 * </pre>
	 */
	protected void emit_Vulnerability___FunctionKeyword_6_0_LeftCurlyBracketKeyword_6_1_RightCurlyBracketKeyword_6_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}