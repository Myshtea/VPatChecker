/*
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdl.serializer;

import com.google.inject.Inject;
import fr.lcis.castav.cdl.services.CDLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CDLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CDLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_ContextExpression_AndKeyword_3_0_0_or_OrKeyword_3_0_1;
	protected AbstractElementAlias match_ContextExpression_EqualsSignEqualsSignKeyword_1_4_or_ExclamationMarkEqualsSignKeyword_1_5_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_1_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_0;
	protected AbstractElementAlias match_ContextModel_RightCurlyBracketKeyword_3_1_a;
	protected AbstractElementAlias match_ContextModel_RightCurlyBracketKeyword_3_1_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CDLGrammarAccess) access;
		match_ContextExpression_AndKeyword_3_0_0_or_OrKeyword_3_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getContextExpressionAccess().getAndKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getContextExpressionAccess().getOrKeyword_3_0_1()));
		match_ContextExpression_EqualsSignEqualsSignKeyword_1_4_or_ExclamationMarkEqualsSignKeyword_1_5_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_1_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getContextExpressionAccess().getEqualsSignEqualsSignKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getContextExpressionAccess().getExclamationMarkEqualsSignKeyword_1_5()), new TokenAlias(false, false, grammarAccess.getContextExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getContextExpressionAccess().getGreaterThanSignKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getContextExpressionAccess().getLessThanSignEqualsSignKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getContextExpressionAccess().getLessThanSignKeyword_1_0()));
		match_ContextModel_RightCurlyBracketKeyword_3_1_a = new TokenAlias(true, true, grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_3_1());
		match_ContextModel_RightCurlyBracketKeyword_3_1_p = new TokenAlias(true, false, grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_3_1());
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
			if (match_ContextExpression_AndKeyword_3_0_0_or_OrKeyword_3_0_1.equals(syntax))
				emit_ContextExpression_AndKeyword_3_0_0_or_OrKeyword_3_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ContextExpression_EqualsSignEqualsSignKeyword_1_4_or_ExclamationMarkEqualsSignKeyword_1_5_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_1_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_0.equals(syntax))
				emit_ContextExpression_EqualsSignEqualsSignKeyword_1_4_or_ExclamationMarkEqualsSignKeyword_1_5_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_1_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ContextModel_RightCurlyBracketKeyword_3_1_a.equals(syntax))
				emit_ContextModel_RightCurlyBracketKeyword_3_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ContextModel_RightCurlyBracketKeyword_3_1_p.equals(syntax))
				emit_ContextModel_RightCurlyBracketKeyword_3_1_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'and' | 'or'
	 *
	 * This ambiguous syntax occurs at:
	 *     value=ContextValue (ambiguity) expr=ContextExpression
	 
	 * </pre>
	 */
	protected void emit_ContextExpression_AndKeyword_3_0_0_or_OrKeyword_3_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (
	  *         '&lt;' | 
	  *         '&gt;' | 
	  *         '&gt;=' | 
	  *         '&lt;=' | 
	  *         '==' | 
	  *         '!='
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     ref=[Property|FQN] (ambiguity) value=ContextValue
	 
	 * </pre>
	 */
	protected void emit_ContextExpression_EqualsSignEqualsSignKeyword_1_4_or_ExclamationMarkEqualsSignKeyword_1_5_or_GreaterThanSignEqualsSignKeyword_1_2_or_GreaterThanSignKeyword_1_1_or_LessThanSignEqualsSignKeyword_1_3_or_LessThanSignKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '}'*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'contextModel' name=ID
	 *     (rule start) (ambiguity) (rule start)
	 *     (rule start) (ambiguity) Providers+=Providers
	 *     (rule start) (ambiguity) Situations+=Situation
	 *     (rule start) (ambiguity) Types+=DefinedType
	 *     Contexts+=Context (ambiguity) 'contextModel' name=ID
	 *     Contexts+=Context (ambiguity) (rule end)
	 *     Contexts+=Context (ambiguity) Providers+=Providers
	 *     Contexts+=Context (ambiguity) Situations+=Situation
	 *     Contexts+=Context (ambiguity) Types+=DefinedType
	 *     Providers+=Providers (ambiguity) 'contextModel' name=ID
	 *     Providers+=Providers (ambiguity) (rule end)
	 *     Providers+=Providers (ambiguity) Providers+=Providers
	 *     Providers+=Providers (ambiguity) Situations+=Situation
	 *     Providers+=Providers (ambiguity) Types+=DefinedType
	 *     Situations+=Situation (ambiguity) 'contextModel' name=ID
	 *     Situations+=Situation (ambiguity) (rule end)
	 *     Situations+=Situation (ambiguity) Providers+=Providers
	 *     Situations+=Situation (ambiguity) Situations+=Situation
	 *     Situations+=Situation (ambiguity) Types+=DefinedType
	 *     Types+=DefinedType (ambiguity) Types+=DefinedType
	 *     name=ID '{' (ambiguity) 'contextModel' name=ID
	 *     name=ID '{' (ambiguity) (rule end)
	 *     name=ID '{' (ambiguity) Providers+=Providers
	 *     name=ID '{' (ambiguity) Situations+=Situation
	 *     name=ID '{' (ambiguity) Types+=DefinedType
	 
	 * </pre>
	 */
	protected void emit_ContextModel_RightCurlyBracketKeyword_3_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '}'+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 *     Types+=DefinedType (ambiguity) 'contextModel' name=ID
	 *     Types+=DefinedType (ambiguity) (rule end)
	 *     Types+=DefinedType (ambiguity) Providers+=Providers
	 *     Types+=DefinedType (ambiguity) Situations+=Situation
	 
	 * </pre>
	 */
	protected void emit_ContextModel_RightCurlyBracketKeyword_3_1_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
