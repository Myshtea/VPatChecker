/*
 * generated by Xtext 2.29.0
 */
grammar InternalCDL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package fr.lcis.castav.cdl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.lcis.castav.cdl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.lcis.castav.cdl.services.CDLGrammarAccess;

}

@parser::members {

 	private CDLGrammarAccess grammarAccess;

    public InternalCDLParser(TokenStream input, CDLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "ContextModel";
   	}

   	@Override
   	protected CDLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleContextModel
entryRuleContextModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContextModelRule()); }
	iv_ruleContextModel=ruleContextModel
	{ $current=$iv_ruleContextModel.current; }
	EOF;

// Rule ContextModel
ruleContextModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{ 
			  getUnorderedGroupHelper().enter(grammarAccess.getContextModelAccess().getUnorderedGroup());
			}
			(
				(
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getContextModelAccess().getUnorderedGroup(), 0);
				}
							({true}?=>(otherlv_1='contextModel'
							{
								newLeafNode(otherlv_1, grammarAccess.getContextModelAccess().getContextModelKeyword_0_0());
							}
							(
								(
									lv_name_2_0=RULE_ID
									{
										newLeafNode(lv_name_2_0, grammarAccess.getContextModelAccess().getNameIDTerminalRuleCall_0_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getContextModelRule());
										}
										setWithLastConsumed(
											$current,
											"name",
											lv_name_2_0,
											"org.eclipse.xtext.common.Terminals.ID");
									}
								)
							)
							otherlv_3='{'
							{
								newLeafNode(otherlv_3, grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_0_2());
							}
							(
								(
									{
										newCompositeNode(grammarAccess.getContextModelAccess().getContextsContextParserRuleCall_0_3_0());
									}
									lv_Contexts_4_0=ruleContext
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getContextModelRule());
										}
										add(
											$current,
											"Contexts",
											lv_Contexts_4_0,
											"fr.lcis.castav.cdl.CDL.Context");
										afterParserOrEnumRuleCall();
									}
								)
							)*
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContextModelAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getContextModelAccess().getUnorderedGroup(), 1);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getContextModelAccess().getProvidersProvidersParserRuleCall_1_0());
								}
								lv_Providers_5_0=ruleProviders
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getContextModelRule());
									}
									add(
										$current,
										"Providers",
										lv_Providers_5_0,
										"fr.lcis.castav.cdl.CDL.Providers");
									afterParserOrEnumRuleCall();
								}
							)
							))+
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContextModelAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getContextModelAccess().getUnorderedGroup(), 2);
				}
							({true}?=>((
								{
									newCompositeNode(grammarAccess.getContextModelAccess().getSituationsSituationParserRuleCall_2_0());
								}
								lv_Situations_6_0=ruleSituation
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getContextModelRule());
									}
									add(
										$current,
										"Situations",
										lv_Situations_6_0,
										"fr.lcis.castav.cdl.CDL.Situation");
									afterParserOrEnumRuleCall();
								}
							)
							))+
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContextModelAccess().getUnorderedGroup());
				}
			)
		)|
		(
			{getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getContextModelAccess().getUnorderedGroup(), 3);
				}
							({true}?=>((
								(
									{
										newCompositeNode(grammarAccess.getContextModelAccess().getTypesDefinedTypeParserRuleCall_3_0_0());
									}
									lv_Types_7_0=ruleDefinedType
									{
										if ($current==null) {
											$current = createModelElementForParent(grammarAccess.getContextModelRule());
										}
										add(
											$current,
											"Types",
											lv_Types_7_0,
											"fr.lcis.castav.cdl.CDL.DefinedType");
										afterParserOrEnumRuleCall();
									}
								)
							)*
							otherlv_8='}'
							{
								newLeafNode(otherlv_8, grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_3_1());
							}
							))
				{ 
					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContextModelAccess().getUnorderedGroup());
				}
			)
		)
				)+
				{getUnorderedGroupHelper().canLeave(grammarAccess.getContextModelAccess().getUnorderedGroup())}?
			)
		)
			{ 
			  getUnorderedGroupHelper().leave(grammarAccess.getContextModelAccess().getUnorderedGroup());
			}
	)
;

// Entry rule entryRuleContext
entryRuleContext returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContextRule()); }
	iv_ruleContext=ruleContext
	{ $current=$iv_ruleContext.current; }
	EOF;

// Rule Context
ruleContext returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_static_0_0='static'
				{
					newLeafNode(lv_static_0_0, grammarAccess.getContextAccess().getStaticStaticKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContextRule());
					}
					setWithLastConsumed($current, "static", lv_static_0_0 != null, "static");
				}
			)
		)?
		otherlv_1='context'
		{
			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getContextKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContextRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					lv_derived_3_0='derives'
					{
						newLeafNode(lv_derived_3_0, grammarAccess.getContextAccess().getDerivedDerivesKeyword_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getContextRule());
						}
						setWithLastConsumed($current, "derived", lv_derived_3_0 != null, "derives");
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getContextRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getContextAccess().getDerivesContextCrossReference_3_1_0());
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getContextAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getContextRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getContextAccess().getDerivesContextCrossReference_3_2_1_0());
						}
					)
				)
			)*
		)?
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_8='providers'
			{
				newLeafNode(otherlv_8, grammarAccess.getContextAccess().getProvidersKeyword_5_0());
			}
			otherlv_9=':'
			{
				newLeafNode(otherlv_9, grammarAccess.getContextAccess().getColonKeyword_5_1());
			}
			otherlv_10='['
			{
				newLeafNode(otherlv_10, grammarAccess.getContextAccess().getLeftSquareBracketKeyword_5_2());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getContextRule());
						}
					}
					otherlv_11=RULE_ID
					{
						newLeafNode(otherlv_11, grammarAccess.getContextAccess().getProvidersProviderCrossReference_5_3_0());
					}
				)
			)
			(
				otherlv_12=','
				{
					newLeafNode(otherlv_12, grammarAccess.getContextAccess().getCommaKeyword_5_4_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getContextRule());
							}
						}
						otherlv_13=RULE_ID
						{
							newLeafNode(otherlv_13, grammarAccess.getContextAccess().getProvidersProviderCrossReference_5_4_1_0());
						}
					)
				)
			)*
			otherlv_14=']'
			{
				newLeafNode(otherlv_14, grammarAccess.getContextAccess().getRightSquareBracketKeyword_5_5());
			}
			otherlv_15=','
			{
				newLeafNode(otherlv_15, grammarAccess.getContextAccess().getCommaKeyword_5_6());
			}
		)?
		otherlv_16='properties'
		{
			newLeafNode(otherlv_16, grammarAccess.getContextAccess().getPropertiesKeyword_6());
		}
		otherlv_17=':'
		{
			newLeafNode(otherlv_17, grammarAccess.getContextAccess().getColonKeyword_7());
		}
		otherlv_18='['
		{
			newLeafNode(otherlv_18, grammarAccess.getContextAccess().getLeftSquareBracketKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContextAccess().getPropertiesPropertyParserRuleCall_9_0());
				}
				lv_properties_19_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContextRule());
					}
					add(
						$current,
						"properties",
						lv_properties_19_0,
						"fr.lcis.castav.cdl.CDL.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_20=','
			{
				newLeafNode(otherlv_20, grammarAccess.getContextAccess().getCommaKeyword_10_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getContextAccess().getPropertiesPropertyParserRuleCall_10_1_0());
					}
					lv_properties_21_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContextRule());
						}
						add(
							$current,
							"properties",
							lv_properties_21_0,
							"fr.lcis.castav.cdl.CDL.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_22=']'
		{
			newLeafNode(otherlv_22, grammarAccess.getContextAccess().getRightSquareBracketKeyword_11());
		}
		(
			otherlv_23=','
			{
				newLeafNode(otherlv_23, grammarAccess.getContextAccess().getCommaKeyword_12_0());
			}
			otherlv_24='mappings'
			{
				newLeafNode(otherlv_24, grammarAccess.getContextAccess().getMappingsKeyword_12_1());
			}
			otherlv_25=':'
			{
				newLeafNode(otherlv_25, grammarAccess.getContextAccess().getColonKeyword_12_2());
			}
			otherlv_26='{'
			{
				newLeafNode(otherlv_26, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_12_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getContextAccess().getMappingsContextMappingParserRuleCall_12_4_0());
					}
					lv_mappings_27_0=ruleContextMapping
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContextRule());
						}
						add(
							$current,
							"mappings",
							lv_mappings_27_0,
							"fr.lcis.castav.cdl.CDL.ContextMapping");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_28=','
				{
					newLeafNode(otherlv_28, grammarAccess.getContextAccess().getCommaKeyword_12_5_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getContextAccess().getMappingsContextMappingParserRuleCall_12_5_1_0());
						}
						lv_mappings_29_0=ruleContextMapping
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getContextRule());
							}
							add(
								$current,
								"mappings",
								lv_mappings_29_0,
								"fr.lcis.castav.cdl.CDL.ContextMapping");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_30='}'
			{
				newLeafNode(otherlv_30, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_12_6());
			}
		)?
		otherlv_31='}'
		{
			newLeafNode(otherlv_31, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_13());
		}
	)
;

// Entry rule entryRuleContextMapping
entryRuleContextMapping returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContextMappingRule()); }
	iv_ruleContextMapping=ruleContextMapping
	{ $current=$iv_ruleContextMapping.current; }
	EOF;

// Rule ContextMapping
ruleContextMapping returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContextMappingRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getContextMappingAccess().getRefContextValueCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='->'
		{
			newLeafNode(otherlv_1, grammarAccess.getContextMappingAccess().getHyphenMinusGreaterThanSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getContextMappingAccess().getExpressionContextExpressionParserRuleCall_2_0());
				}
				lv_expression_2_0=ruleContextExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContextMappingRule());
					}
					set(
						$current,
						"expression",
						lv_expression_2_0,
						"fr.lcis.castav.cdl.CDL.ContextExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleProviders
entryRuleProviders returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProvidersRule()); }
	iv_ruleProviders=ruleProviders
	{ $current=$iv_ruleProviders.current; }
	EOF;

// Rule Providers
ruleProviders returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='providers'
		{
			newLeafNode(otherlv_0, grammarAccess.getProvidersAccess().getProvidersKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getProvidersAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProvidersAccess().getProvidersProviderParserRuleCall_2_0());
				}
				lv_providers_2_0=ruleProvider
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProvidersRule());
					}
					add(
						$current,
						"providers",
						lv_providers_2_0,
						"fr.lcis.castav.cdl.CDL.Provider");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getProvidersAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getProvidersAccess().getProvidersProviderParserRuleCall_3_1_0());
					}
					lv_providers_4_0=ruleProvider
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getProvidersRule());
						}
						add(
							$current,
							"providers",
							lv_providers_4_0,
							"fr.lcis.castav.cdl.CDL.Provider");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getProvidersAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleProvider
entryRuleProvider returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProviderRule()); }
	iv_ruleProvider=ruleProvider
	{ $current=$iv_ruleProvider.current; }
	EOF;

// Rule Provider
ruleProvider returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getProviderAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getProviderRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_2_0_0());
					}
					lv_type_2_1=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"type",
							lv_type_2_1,
							"fr.lcis.castav.cdl.CDL.TypeRef");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getTypeSimpleTypeParserRuleCall_2_0_1());
					}
					lv_type_2_2=ruleSimpleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"type",
							lv_type_2_2,
							"fr.lcis.castav.cdl.CDL.SimpleType");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRefRule()); }
	iv_ruleTypeRef=ruleTypeRef
	{ $current=$iv_ruleTypeRef.current; }
	EOF;

// Rule TypeRef
ruleTypeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTypeRefRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getRefDefinedTypeCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleDefinedType
entryRuleDefinedType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinedTypeRule()); }
	iv_ruleDefinedType=ruleDefinedType
	{ $current=$iv_ruleDefinedType.current; }
	EOF;

// Rule DefinedType
ruleDefinedType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='type'
		{
			newLeafNode(otherlv_0, grammarAccess.getDefinedTypeAccess().getTypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDefinedTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDefinedTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDefinedTypeAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDefinedTypeAccess().getValuesContextValueParserRuleCall_3_0());
				}
				lv_values_3_0=ruleContextValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDefinedTypeRule());
					}
					add(
						$current,
						"values",
						lv_values_3_0,
						"fr.lcis.castav.cdl.CDL.ContextValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getDefinedTypeAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDefinedTypeAccess().getValuesContextValueParserRuleCall_4_1_0());
					}
					lv_values_5_0=ruleContextValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDefinedTypeRule());
						}
						add(
							$current,
							"values",
							lv_values_5_0,
							"fr.lcis.castav.cdl.CDL.ContextValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getDefinedTypeAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleContextValue
entryRuleContextValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContextValueRule()); }
	iv_ruleContextValue=ruleContextValue
	{ $current=$iv_ruleContextValue.current; }
	EOF;

// Rule ContextValue
ruleContextValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_1=RULE_STRING
				{
					newLeafNode(lv_name_0_1, grammarAccess.getContextValueAccess().getNameSTRINGTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContextValueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_1,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
				    |
				lv_name_0_2=RULE_ID
				{
					newLeafNode(lv_name_0_2, grammarAccess.getContextValueAccess().getNameIDTerminalRuleCall_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContextValueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_2,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSimpleType
entryRuleSimpleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleTypeRule()); }
	iv_ruleSimpleType=ruleSimpleType
	{ $current=$iv_ruleSimpleType.current; }
	EOF;

// Rule SimpleType
ruleSimpleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_0());
		}
		this_StringType_0=ruleStringType
		{
			$current = $this_StringType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSimpleTypeAccess().getIntegerTypeParserRuleCall_1());
		}
		this_IntegerType_1=ruleIntegerType
		{
			$current = $this_IntegerType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_2());
		}
		this_BooleanType_2=ruleBooleanType
		{
			$current = $this_BooleanType_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_3());
		}
		this_DoubleType_3=ruleDoubleType
		{
			$current = $this_DoubleType_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleStringType
entryRuleStringType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringTypeRule()); }
	iv_ruleStringType=ruleStringType
	{ $current=$iv_ruleStringType.current; }
	EOF;

// Rule StringType
ruleStringType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
					$current);
			}
		)
		otherlv_1='string'
		{
			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
		}
	)
;

// Entry rule entryRuleIntegerType
entryRuleIntegerType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerTypeRule()); }
	iv_ruleIntegerType=ruleIntegerType
	{ $current=$iv_ruleIntegerType.current; }
	EOF;

// Rule IntegerType
ruleIntegerType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
					$current);
			}
		)
		otherlv_1='integer'
		{
			newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
		}
	)
;

// Entry rule entryRuleBooleanType
entryRuleBooleanType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanTypeRule()); }
	iv_ruleBooleanType=ruleBooleanType
	{ $current=$iv_ruleBooleanType.current; }
	EOF;

// Rule BooleanType
ruleBooleanType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
					$current);
			}
		)
		otherlv_1='boolean'
		{
			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
		}
	)
;

// Entry rule entryRuleDoubleType
entryRuleDoubleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDoubleTypeRule()); }
	iv_ruleDoubleType=ruleDoubleType
	{ $current=$iv_ruleDoubleType.current; }
	EOF;

// Rule DoubleType
ruleDoubleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
					$current);
			}
		)
		otherlv_1='double'
		{
			newLeafNode(otherlv_1, grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1());
		}
	)
;

// Entry rule entryRuleSituation
entryRuleSituation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSituationRule()); }
	iv_ruleSituation=ruleSituation
	{ $current=$iv_ruleSituation.current; }
	EOF;

// Rule Situation
ruleSituation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='situation'
		{
			newLeafNode(otherlv_0, grammarAccess.getSituationAccess().getSituationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSituationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSituationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSituationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSituationAccess().getExpressionContextExpressionParserRuleCall_3_0());
				}
				lv_expression_3_0=ruleContextExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSituationRule());
					}
					add(
						$current,
						"expression",
						lv_expression_3_0,
						"fr.lcis.castav.cdl.CDL.ContextExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getSituationAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleContextExpression
entryRuleContextExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContextExpressionRule()); }
	iv_ruleContextExpression=ruleContextExpression
	{ $current=$iv_ruleContextExpression.current; }
	EOF;

// Rule ContextExpression
ruleContextExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getContextExpressionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getContextExpressionAccess().getRefPropertyCrossReference_0_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_1='<'
			{
				newLeafNode(otherlv_1, grammarAccess.getContextExpressionAccess().getLessThanSignKeyword_1_0());
			}
			    |
			otherlv_2='>'
			{
				newLeafNode(otherlv_2, grammarAccess.getContextExpressionAccess().getGreaterThanSignKeyword_1_1());
			}
			    |
			otherlv_3='>='
			{
				newLeafNode(otherlv_3, grammarAccess.getContextExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_2());
			}
			    |
			otherlv_4='<='
			{
				newLeafNode(otherlv_4, grammarAccess.getContextExpressionAccess().getLessThanSignEqualsSignKeyword_1_3());
			}
			    |
			otherlv_5='=='
			{
				newLeafNode(otherlv_5, grammarAccess.getContextExpressionAccess().getEqualsSignEqualsSignKeyword_1_4());
			}
			    |
			otherlv_6='!='
			{
				newLeafNode(otherlv_6, grammarAccess.getContextExpressionAccess().getExclamationMarkEqualsSignKeyword_1_5());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getContextExpressionAccess().getValueContextValueParserRuleCall_2_0());
				}
				lv_value_7_0=ruleContextValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getContextExpressionRule());
					}
					set(
						$current,
						"value",
						lv_value_7_0,
						"fr.lcis.castav.cdl.CDL.ContextValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				otherlv_8='and'
				{
					newLeafNode(otherlv_8, grammarAccess.getContextExpressionAccess().getAndKeyword_3_0_0());
				}
				    |
				otherlv_9='or'
				{
					newLeafNode(otherlv_9, grammarAccess.getContextExpressionAccess().getOrKeyword_3_0_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getContextExpressionAccess().getExprContextExpressionParserRuleCall_3_1_0());
					}
					lv_expr_10_0=ruleContextExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getContextExpressionRule());
						}
						set(
							$current,
							"expr",
							lv_expr_10_0,
							"fr.lcis.castav.cdl.CDL.ContextExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;
finally {
	myHiddenTokenState.restore();
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
