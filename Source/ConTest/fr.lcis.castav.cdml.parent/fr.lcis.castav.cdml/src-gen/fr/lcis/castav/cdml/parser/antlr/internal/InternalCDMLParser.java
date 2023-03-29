package fr.lcis.castav.cdml.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.lcis.castav.cdml.services.CDMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCDMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'{'", "'}'", "'contexts'", "','", "'static'", "'='", "'situations'", "':'", "'statemachine'", "'exported'", "'dataflows'", "'state'", "'awareof'", "'super'", "'abstracts'", "'transition'", "'on'", "'->'", "'external'", "'normal'", "'dangerous'", "'signature'", "'signatureOrSystem'", "'sink'", "'('", "')'", "'*'", "'source'", "'input'", "'adaptation'", "'for'", "'at'", "'.'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCDMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCDMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCDMLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCDML.g"; }



     	private CDMLGrammarAccess grammarAccess;

        public InternalCDMLParser(TokenStream input, CDMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Cdml";
       	}

       	@Override
       	protected CDMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCdml"
    // InternalCDML.g:64:1: entryRuleCdml returns [EObject current=null] : iv_ruleCdml= ruleCdml EOF ;
    public final EObject entryRuleCdml() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCdml = null;


        try {
            // InternalCDML.g:64:45: (iv_ruleCdml= ruleCdml EOF )
            // InternalCDML.g:65:2: iv_ruleCdml= ruleCdml EOF
            {
             newCompositeNode(grammarAccess.getCdmlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCdml=ruleCdml();

            state._fsp--;

             current =iv_ruleCdml; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCdml"


    // $ANTLR start "ruleCdml"
    // InternalCDML.g:71:1: ruleCdml returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleCdml() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_contexts_4_0 = null;

        EObject lv_staticContexts_5_0 = null;

        EObject lv_situations_6_0 = null;

        EObject lv_statemachines_7_0 = null;

        EObject lv_adaptations_8_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalCDML.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalCDML.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) ) )
            // InternalCDML.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalCDML.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?) )
            // InternalCDML.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getCdmlAccess().getUnorderedGroup());
            			
            // InternalCDML.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?)
            // InternalCDML.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+ {...}?
            {
            // InternalCDML.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=6;
                int LA4_0 = input.LA(1);

                if ( LA4_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 0) ) {
                    alt4=1;
                }
                else if ( LA4_0 == 16 && getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 1) ) {
                    alt4=2;
                }
                else if ( LA4_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 2) ) {
                    alt4=3;
                }
                else if ( LA4_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 3) ) {
                    alt4=4;
                }
                else if ( ( LA4_0 == 13 || LA4_0 == 41 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 4) ) {
                    alt4=5;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCDML.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) )
            	    {
            	    // InternalCDML.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) ) )
            	    // InternalCDML.g:86:4: {...}? => ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalCDML.g:86:98: ( ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) ) )
            	    // InternalCDML.g:87:5: ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCdmlAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalCDML.g:90:8: ({...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? ) )
            	    // InternalCDML.g:90:9: {...}? => (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "true");
            	    }
            	    // InternalCDML.g:90:18: (otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )? )
            	    // InternalCDML.g:90:19: otherlv_1= 'model' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( (lv_contexts_4_0= ruleContexts ) )?
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getCdmlAccess().getModelKeyword_0_0());
            	    							
            	    // InternalCDML.g:94:8: ( (lv_name_2_0= ruleEString ) )
            	    // InternalCDML.g:95:9: (lv_name_2_0= ruleEString )
            	    {
            	    // InternalCDML.g:95:9: (lv_name_2_0= ruleEString )
            	    // InternalCDML.g:96:10: lv_name_2_0= ruleEString
            	    {

            	    										newCompositeNode(grammarAccess.getCdmlAccess().getNameEStringParserRuleCall_0_1_0());
            	    									
            	    pushFollow(FOLLOW_4);
            	    lv_name_2_0=ruleEString();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getCdmlRule());
            	    										}
            	    										set(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"fr.lcis.castav.cdml.CDML.EString");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getCdmlAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalCDML.g:117:8: ( (lv_contexts_4_0= ruleContexts ) )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==14) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // InternalCDML.g:118:9: (lv_contexts_4_0= ruleContexts )
            	            {
            	            // InternalCDML.g:118:9: (lv_contexts_4_0= ruleContexts )
            	            // InternalCDML.g:119:10: lv_contexts_4_0= ruleContexts
            	            {

            	            										newCompositeNode(grammarAccess.getCdmlAccess().getContextsContextsParserRuleCall_0_3_0());
            	            									
            	            pushFollow(FOLLOW_6);
            	            lv_contexts_4_0=ruleContexts();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getCdmlRule());
            	            										}
            	            										add(
            	            											current,
            	            											"contexts",
            	            											lv_contexts_4_0,
            	            											"fr.lcis.castav.cdml.CDML.Contexts");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCdmlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCDML.g:142:3: ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) )
            	    {
            	    // InternalCDML.g:142:3: ({...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) ) )
            	    // InternalCDML.g:143:4: {...}? => ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalCDML.g:143:98: ( ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) ) )
            	    // InternalCDML.g:144:5: ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCdmlAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalCDML.g:147:8: ({...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) ) )
            	    // InternalCDML.g:147:9: {...}? => ( (lv_staticContexts_5_0= ruleStaticContexts ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "true");
            	    }
            	    // InternalCDML.g:147:18: ( (lv_staticContexts_5_0= ruleStaticContexts ) )
            	    // InternalCDML.g:147:19: (lv_staticContexts_5_0= ruleStaticContexts )
            	    {
            	    // InternalCDML.g:147:19: (lv_staticContexts_5_0= ruleStaticContexts )
            	    // InternalCDML.g:148:9: lv_staticContexts_5_0= ruleStaticContexts
            	    {

            	    									newCompositeNode(grammarAccess.getCdmlAccess().getStaticContextsStaticContextsParserRuleCall_1_0());
            	    								
            	    pushFollow(FOLLOW_6);
            	    lv_staticContexts_5_0=ruleStaticContexts();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCdmlRule());
            	    									}
            	    									add(
            	    										current,
            	    										"staticContexts",
            	    										lv_staticContexts_5_0,
            	    										"fr.lcis.castav.cdml.CDML.StaticContexts");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCdmlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCDML.g:170:3: ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) )
            	    {
            	    // InternalCDML.g:170:3: ({...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) ) )
            	    // InternalCDML.g:171:4: {...}? => ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalCDML.g:171:98: ( ({...}? => ( (lv_situations_6_0= ruleSituations ) ) ) )
            	    // InternalCDML.g:172:5: ({...}? => ( (lv_situations_6_0= ruleSituations ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCdmlAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalCDML.g:175:8: ({...}? => ( (lv_situations_6_0= ruleSituations ) ) )
            	    // InternalCDML.g:175:9: {...}? => ( (lv_situations_6_0= ruleSituations ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "true");
            	    }
            	    // InternalCDML.g:175:18: ( (lv_situations_6_0= ruleSituations ) )
            	    // InternalCDML.g:175:19: (lv_situations_6_0= ruleSituations )
            	    {
            	    // InternalCDML.g:175:19: (lv_situations_6_0= ruleSituations )
            	    // InternalCDML.g:176:9: lv_situations_6_0= ruleSituations
            	    {

            	    									newCompositeNode(grammarAccess.getCdmlAccess().getSituationsSituationsParserRuleCall_2_0());
            	    								
            	    pushFollow(FOLLOW_6);
            	    lv_situations_6_0=ruleSituations();

            	    state._fsp--;


            	    									if (current==null) {
            	    										current = createModelElementForParent(grammarAccess.getCdmlRule());
            	    									}
            	    									add(
            	    										current,
            	    										"situations",
            	    										lv_situations_6_0,
            	    										"fr.lcis.castav.cdml.CDML.Situations");
            	    									afterParserOrEnumRuleCall();
            	    								

            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCdmlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCDML.g:198:3: ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) )
            	    {
            	    // InternalCDML.g:198:3: ({...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ ) )
            	    // InternalCDML.g:199:4: {...}? => ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalCDML.g:199:98: ( ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+ )
            	    // InternalCDML.g:200:5: ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCdmlAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalCDML.g:203:8: ({...}? => ( (lv_statemachines_7_0= ruleStatemachine ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==20) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalCDML.g:203:9: {...}? => ( (lv_statemachines_7_0= ruleStatemachine ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleCdml", "true");
            	    	    }
            	    	    // InternalCDML.g:203:18: ( (lv_statemachines_7_0= ruleStatemachine ) )
            	    	    // InternalCDML.g:203:19: (lv_statemachines_7_0= ruleStatemachine )
            	    	    {
            	    	    // InternalCDML.g:203:19: (lv_statemachines_7_0= ruleStatemachine )
            	    	    // InternalCDML.g:204:9: lv_statemachines_7_0= ruleStatemachine
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getCdmlAccess().getStatemachinesStatemachineParserRuleCall_3_0());
            	    	    								
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_statemachines_7_0=ruleStatemachine();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getCdmlRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"statemachines",
            	    	    										lv_statemachines_7_0,
            	    	    										"fr.lcis.castav.cdml.CDML.Statemachine");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCdmlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalCDML.g:226:3: ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) )
            	    {
            	    // InternalCDML.g:226:3: ({...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) ) )
            	    // InternalCDML.g:227:4: {...}? => ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "getUnorderedGroupHelper().canSelect(grammarAccess.getCdmlAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalCDML.g:227:98: ( ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) ) )
            	    // InternalCDML.g:228:5: ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getCdmlAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalCDML.g:231:8: ({...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' ) )
            	    // InternalCDML.g:231:9: {...}? => ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleCdml", "true");
            	    }
            	    // InternalCDML.g:231:18: ( ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}' )
            	    // InternalCDML.g:231:19: ( (lv_adaptations_8_0= ruleAdaptation ) )* otherlv_9= '}'
            	    {
            	    // InternalCDML.g:231:19: ( (lv_adaptations_8_0= ruleAdaptation ) )*
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==41) ) {
            	            alt3=1;
            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalCDML.g:232:9: (lv_adaptations_8_0= ruleAdaptation )
            	    	    {
            	    	    // InternalCDML.g:232:9: (lv_adaptations_8_0= ruleAdaptation )
            	    	    // InternalCDML.g:233:10: lv_adaptations_8_0= ruleAdaptation
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getCdmlAccess().getAdaptationsAdaptationParserRuleCall_4_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_adaptations_8_0=ruleAdaptation();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getCdmlRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"adaptations",
            	    	    											lv_adaptations_8_0,
            	    	    											"fr.lcis.castav.cdml.CDML.Adaptation");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop3;
            	        }
            	    } while (true);

            	    otherlv_9=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_9, grammarAccess.getCdmlAccess().getRightCurlyBracketKeyword_4_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCdmlAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCdmlAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleCdml", "getUnorderedGroupHelper().canLeave(grammarAccess.getCdmlAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getCdmlAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCdml"


    // $ANTLR start "entryRuleContexts"
    // InternalCDML.g:271:1: entryRuleContexts returns [EObject current=null] : iv_ruleContexts= ruleContexts EOF ;
    public final EObject entryRuleContexts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContexts = null;


        try {
            // InternalCDML.g:271:49: (iv_ruleContexts= ruleContexts EOF )
            // InternalCDML.g:272:2: iv_ruleContexts= ruleContexts EOF
            {
             newCompositeNode(grammarAccess.getContextsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContexts=ruleContexts();

            state._fsp--;

             current =iv_ruleContexts; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContexts"


    // $ANTLR start "ruleContexts"
    // InternalCDML.g:278:1: ruleContexts returns [EObject current=null] : (otherlv_0= 'contexts' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleContexts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_contexts_2_0 = null;

        EObject lv_contexts_4_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:284:2: ( (otherlv_0= 'contexts' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}' ) )
            // InternalCDML.g:285:2: (otherlv_0= 'contexts' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}' )
            {
            // InternalCDML.g:285:2: (otherlv_0= 'contexts' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}' )
            // InternalCDML.g:286:3: otherlv_0= 'contexts' otherlv_1= '{' ( (lv_contexts_2_0= ruleContext ) ) (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getContextsAccess().getContextsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContextsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCDML.g:294:3: ( (lv_contexts_2_0= ruleContext ) )
            // InternalCDML.g:295:4: (lv_contexts_2_0= ruleContext )
            {
            // InternalCDML.g:295:4: (lv_contexts_2_0= ruleContext )
            // InternalCDML.g:296:5: lv_contexts_2_0= ruleContext
            {

            					newCompositeNode(grammarAccess.getContextsAccess().getContextsContextParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_contexts_2_0=ruleContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextsRule());
            					}
            					add(
            						current,
            						"contexts",
            						lv_contexts_2_0,
            						"fr.lcis.castav.cdml.CDML.Context");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDML.g:313:3: (otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCDML.g:314:4: otherlv_3= ',' ( (lv_contexts_4_0= ruleContext ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getContextsAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCDML.g:318:4: ( (lv_contexts_4_0= ruleContext ) )
            	    // InternalCDML.g:319:5: (lv_contexts_4_0= ruleContext )
            	    {
            	    // InternalCDML.g:319:5: (lv_contexts_4_0= ruleContext )
            	    // InternalCDML.g:320:6: lv_contexts_4_0= ruleContext
            	    {

            	    						newCompositeNode(grammarAccess.getContextsAccess().getContextsContextParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_contexts_4_0=ruleContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContextsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"contexts",
            	    							lv_contexts_4_0,
            	    							"fr.lcis.castav.cdml.CDML.Context");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getContextsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContexts"


    // $ANTLR start "entryRuleContext"
    // InternalCDML.g:346:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCDML.g:346:48: (iv_ruleContext= ruleContext EOF )
            // InternalCDML.g:347:2: iv_ruleContext= ruleContext EOF
            {
             newCompositeNode(grammarAccess.getContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContext=ruleContext();

            state._fsp--;

             current =iv_ruleContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContext"


    // $ANTLR start "ruleContext"
    // InternalCDML.g:353:1: ruleContext returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:359:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalCDML.g:360:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalCDML.g:360:2: ( (lv_name_0_0= ruleEString ) )
            // InternalCDML.g:361:3: (lv_name_0_0= ruleEString )
            {
            // InternalCDML.g:361:3: (lv_name_0_0= ruleEString )
            // InternalCDML.g:362:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getContextAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getContextRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"fr.lcis.castav.cdml.CDML.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleStaticContexts"
    // InternalCDML.g:382:1: entryRuleStaticContexts returns [EObject current=null] : iv_ruleStaticContexts= ruleStaticContexts EOF ;
    public final EObject entryRuleStaticContexts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticContexts = null;


        try {
            // InternalCDML.g:382:55: (iv_ruleStaticContexts= ruleStaticContexts EOF )
            // InternalCDML.g:383:2: iv_ruleStaticContexts= ruleStaticContexts EOF
            {
             newCompositeNode(grammarAccess.getStaticContextsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticContexts=ruleStaticContexts();

            state._fsp--;

             current =iv_ruleStaticContexts; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticContexts"


    // $ANTLR start "ruleStaticContexts"
    // InternalCDML.g:389:1: ruleStaticContexts returns [EObject current=null] : (otherlv_0= 'static' otherlv_1= 'contexts' otherlv_2= '{' ( (lv_staticContexts_3_0= ruleStaticContext ) ) (otherlv_4= ',' ( (lv_staticContexts_5_0= ruleStaticContext ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleStaticContexts() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_staticContexts_3_0 = null;

        EObject lv_staticContexts_5_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:395:2: ( (otherlv_0= 'static' otherlv_1= 'contexts' otherlv_2= '{' ( (lv_staticContexts_3_0= ruleStaticContext ) ) (otherlv_4= ',' ( (lv_staticContexts_5_0= ruleStaticContext ) ) )* otherlv_6= '}' ) )
            // InternalCDML.g:396:2: (otherlv_0= 'static' otherlv_1= 'contexts' otherlv_2= '{' ( (lv_staticContexts_3_0= ruleStaticContext ) ) (otherlv_4= ',' ( (lv_staticContexts_5_0= ruleStaticContext ) ) )* otherlv_6= '}' )
            {
            // InternalCDML.g:396:2: (otherlv_0= 'static' otherlv_1= 'contexts' otherlv_2= '{' ( (lv_staticContexts_3_0= ruleStaticContext ) ) (otherlv_4= ',' ( (lv_staticContexts_5_0= ruleStaticContext ) ) )* otherlv_6= '}' )
            // InternalCDML.g:397:3: otherlv_0= 'static' otherlv_1= 'contexts' otherlv_2= '{' ( (lv_staticContexts_3_0= ruleStaticContext ) ) (otherlv_4= ',' ( (lv_staticContexts_5_0= ruleStaticContext ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getStaticContextsAccess().getStaticKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getStaticContextsAccess().getContextsKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getStaticContextsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCDML.g:409:3: ( (lv_staticContexts_3_0= ruleStaticContext ) )
            // InternalCDML.g:410:4: (lv_staticContexts_3_0= ruleStaticContext )
            {
            // InternalCDML.g:410:4: (lv_staticContexts_3_0= ruleStaticContext )
            // InternalCDML.g:411:5: lv_staticContexts_3_0= ruleStaticContext
            {

            					newCompositeNode(grammarAccess.getStaticContextsAccess().getStaticContextsStaticContextParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_staticContexts_3_0=ruleStaticContext();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaticContextsRule());
            					}
            					add(
            						current,
            						"staticContexts",
            						lv_staticContexts_3_0,
            						"fr.lcis.castav.cdml.CDML.StaticContext");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDML.g:428:3: (otherlv_4= ',' ( (lv_staticContexts_5_0= ruleStaticContext ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCDML.g:429:4: otherlv_4= ',' ( (lv_staticContexts_5_0= ruleStaticContext ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_4, grammarAccess.getStaticContextsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCDML.g:433:4: ( (lv_staticContexts_5_0= ruleStaticContext ) )
            	    // InternalCDML.g:434:5: (lv_staticContexts_5_0= ruleStaticContext )
            	    {
            	    // InternalCDML.g:434:5: (lv_staticContexts_5_0= ruleStaticContext )
            	    // InternalCDML.g:435:6: lv_staticContexts_5_0= ruleStaticContext
            	    {

            	    						newCompositeNode(grammarAccess.getStaticContextsAccess().getStaticContextsStaticContextParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_staticContexts_5_0=ruleStaticContext();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStaticContextsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"staticContexts",
            	    							lv_staticContexts_5_0,
            	    							"fr.lcis.castav.cdml.CDML.StaticContext");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStaticContextsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticContexts"


    // $ANTLR start "entryRuleStaticContext"
    // InternalCDML.g:461:1: entryRuleStaticContext returns [EObject current=null] : iv_ruleStaticContext= ruleStaticContext EOF ;
    public final EObject entryRuleStaticContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticContext = null;


        try {
            // InternalCDML.g:461:54: (iv_ruleStaticContext= ruleStaticContext EOF )
            // InternalCDML.g:462:2: iv_ruleStaticContext= ruleStaticContext EOF
            {
             newCompositeNode(grammarAccess.getStaticContextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticContext=ruleStaticContext();

            state._fsp--;

             current =iv_ruleStaticContext; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStaticContext"


    // $ANTLR start "ruleStaticContext"
    // InternalCDML.g:468:1: ruleStaticContext returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleStaticContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:474:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalCDML.g:475:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalCDML.g:475:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalCDML.g:476:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalCDML.g:476:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCDML.g:477:4: (lv_name_0_0= ruleEString )
            {
            // InternalCDML.g:477:4: (lv_name_0_0= ruleEString )
            // InternalCDML.g:478:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStaticContextAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStaticContextRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.lcis.castav.cdml.CDML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getStaticContextAccess().getEqualsSignKeyword_1());
            		
            // InternalCDML.g:499:3: ( (lv_value_2_0= RULE_STRING ) )
            // InternalCDML.g:500:4: (lv_value_2_0= RULE_STRING )
            {
            // InternalCDML.g:500:4: (lv_value_2_0= RULE_STRING )
            // InternalCDML.g:501:5: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getStaticContextAccess().getValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStaticContext"


    // $ANTLR start "entryRuleSituations"
    // InternalCDML.g:521:1: entryRuleSituations returns [EObject current=null] : iv_ruleSituations= ruleSituations EOF ;
    public final EObject entryRuleSituations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituations = null;


        try {
            // InternalCDML.g:521:51: (iv_ruleSituations= ruleSituations EOF )
            // InternalCDML.g:522:2: iv_ruleSituations= ruleSituations EOF
            {
             newCompositeNode(grammarAccess.getSituationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSituations=ruleSituations();

            state._fsp--;

             current =iv_ruleSituations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSituations"


    // $ANTLR start "ruleSituations"
    // InternalCDML.g:528:1: ruleSituations returns [EObject current=null] : (otherlv_0= 'situations' otherlv_1= '{' ( (lv_situations_2_0= ruleSituation ) ) (otherlv_3= ',' ( (lv_situations_4_0= ruleSituation ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleSituations() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_situations_2_0 = null;

        EObject lv_situations_4_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:534:2: ( (otherlv_0= 'situations' otherlv_1= '{' ( (lv_situations_2_0= ruleSituation ) ) (otherlv_3= ',' ( (lv_situations_4_0= ruleSituation ) ) )* otherlv_5= '}' ) )
            // InternalCDML.g:535:2: (otherlv_0= 'situations' otherlv_1= '{' ( (lv_situations_2_0= ruleSituation ) ) (otherlv_3= ',' ( (lv_situations_4_0= ruleSituation ) ) )* otherlv_5= '}' )
            {
            // InternalCDML.g:535:2: (otherlv_0= 'situations' otherlv_1= '{' ( (lv_situations_2_0= ruleSituation ) ) (otherlv_3= ',' ( (lv_situations_4_0= ruleSituation ) ) )* otherlv_5= '}' )
            // InternalCDML.g:536:3: otherlv_0= 'situations' otherlv_1= '{' ( (lv_situations_2_0= ruleSituation ) ) (otherlv_3= ',' ( (lv_situations_4_0= ruleSituation ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSituationsAccess().getSituationsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSituationsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCDML.g:544:3: ( (lv_situations_2_0= ruleSituation ) )
            // InternalCDML.g:545:4: (lv_situations_2_0= ruleSituation )
            {
            // InternalCDML.g:545:4: (lv_situations_2_0= ruleSituation )
            // InternalCDML.g:546:5: lv_situations_2_0= ruleSituation
            {

            					newCompositeNode(grammarAccess.getSituationsAccess().getSituationsSituationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_situations_2_0=ruleSituation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSituationsRule());
            					}
            					add(
            						current,
            						"situations",
            						lv_situations_2_0,
            						"fr.lcis.castav.cdml.CDML.Situation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDML.g:563:3: (otherlv_3= ',' ( (lv_situations_4_0= ruleSituation ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCDML.g:564:4: otherlv_3= ',' ( (lv_situations_4_0= ruleSituation ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getSituationsAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCDML.g:568:4: ( (lv_situations_4_0= ruleSituation ) )
            	    // InternalCDML.g:569:5: (lv_situations_4_0= ruleSituation )
            	    {
            	    // InternalCDML.g:569:5: (lv_situations_4_0= ruleSituation )
            	    // InternalCDML.g:570:6: lv_situations_4_0= ruleSituation
            	    {

            	    						newCompositeNode(grammarAccess.getSituationsAccess().getSituationsSituationParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_situations_4_0=ruleSituation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSituationsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"situations",
            	    							lv_situations_4_0,
            	    							"fr.lcis.castav.cdml.CDML.Situation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSituationsAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSituations"


    // $ANTLR start "entryRuleSituation"
    // InternalCDML.g:596:1: entryRuleSituation returns [EObject current=null] : iv_ruleSituation= ruleSituation EOF ;
    public final EObject entryRuleSituation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituation = null;


        try {
            // InternalCDML.g:596:50: (iv_ruleSituation= ruleSituation EOF )
            // InternalCDML.g:597:2: iv_ruleSituation= ruleSituation EOF
            {
             newCompositeNode(grammarAccess.getSituationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSituation=ruleSituation();

            state._fsp--;

             current =iv_ruleSituation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSituation"


    // $ANTLR start "ruleSituation"
    // InternalCDML.g:603:1: ruleSituation returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleSituation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:609:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalCDML.g:610:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalCDML.g:610:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) ) )
            // InternalCDML.g:611:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (otherlv_2= RULE_ID ) )
            {
            // InternalCDML.g:611:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCDML.g:612:4: (lv_name_0_0= ruleEString )
            {
            // InternalCDML.g:612:4: (lv_name_0_0= ruleEString )
            // InternalCDML.g:613:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSituationAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSituationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"fr.lcis.castav.cdml.CDML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSituationAccess().getColonKeyword_1());
            		
            // InternalCDML.g:634:3: ( (otherlv_2= RULE_ID ) )
            // InternalCDML.g:635:4: (otherlv_2= RULE_ID )
            {
            // InternalCDML.g:635:4: (otherlv_2= RULE_ID )
            // InternalCDML.g:636:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSituationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getSituationAccess().getContextContextCrossReference_2_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSituation"


    // $ANTLR start "entryRuleStatemachine"
    // InternalCDML.g:651:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalCDML.g:651:53: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalCDML.g:652:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // InternalCDML.g:658:1: ruleStatemachine returns [EObject current=null] : (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_exported_2_0= 'exported' ) ) ( (lv_permission_3_0= rulePermission ) )? )? otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_exported_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_permission_3_0 = null;

        EObject lv_states_5_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:664:2: ( (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_exported_2_0= 'exported' ) ) ( (lv_permission_3_0= rulePermission ) )? )? otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' ) )
            // InternalCDML.g:665:2: (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_exported_2_0= 'exported' ) ) ( (lv_permission_3_0= rulePermission ) )? )? otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' )
            {
            // InternalCDML.g:665:2: (otherlv_0= 'statemachine' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_exported_2_0= 'exported' ) ) ( (lv_permission_3_0= rulePermission ) )? )? otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}' )
            // InternalCDML.g:666:3: otherlv_0= 'statemachine' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_exported_2_0= 'exported' ) ) ( (lv_permission_3_0= rulePermission ) )? )? otherlv_4= '{' ( (lv_states_5_0= ruleState ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStatemachineAccess().getStatemachineKeyword_0());
            		
            // InternalCDML.g:670:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCDML.g:671:4: (lv_name_1_0= ruleEString )
            {
            // InternalCDML.g:671:4: (lv_name_1_0= ruleEString )
            // InternalCDML.g:672:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.lcis.castav.cdml.CDML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDML.g:689:3: ( ( (lv_exported_2_0= 'exported' ) ) ( (lv_permission_3_0= rulePermission ) )? )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCDML.g:690:4: ( (lv_exported_2_0= 'exported' ) ) ( (lv_permission_3_0= rulePermission ) )?
                    {
                    // InternalCDML.g:690:4: ( (lv_exported_2_0= 'exported' ) )
                    // InternalCDML.g:691:5: (lv_exported_2_0= 'exported' )
                    {
                    // InternalCDML.g:691:5: (lv_exported_2_0= 'exported' )
                    // InternalCDML.g:692:6: lv_exported_2_0= 'exported'
                    {
                    lv_exported_2_0=(Token)match(input,21,FOLLOW_15); 

                    						newLeafNode(lv_exported_2_0, grammarAccess.getStatemachineAccess().getExportedExportedKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStatemachineRule());
                    						}
                    						setWithLastConsumed(current, "exported", lv_exported_2_0 != null, "exported");
                    					

                    }


                    }

                    // InternalCDML.g:704:4: ( (lv_permission_3_0= rulePermission ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=31 && LA8_0<=34)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalCDML.g:705:5: (lv_permission_3_0= rulePermission )
                            {
                            // InternalCDML.g:705:5: (lv_permission_3_0= rulePermission )
                            // InternalCDML.g:706:6: lv_permission_3_0= rulePermission
                            {

                            						newCompositeNode(grammarAccess.getStatemachineAccess().getPermissionPermissionParserRuleCall_2_1_0());
                            					
                            pushFollow(FOLLOW_4);
                            lv_permission_3_0=rulePermission();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getStatemachineRule());
                            						}
                            						set(
                            							current,
                            							"permission",
                            							lv_permission_3_0,
                            							"fr.lcis.castav.cdml.CDML.Permission");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCDML.g:728:3: ( (lv_states_5_0= ruleState ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23||LA10_0==25) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCDML.g:729:4: (lv_states_5_0= ruleState )
            	    {
            	    // InternalCDML.g:729:4: (lv_states_5_0= ruleState )
            	    // InternalCDML.g:730:5: lv_states_5_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getStatemachineAccess().getStatesStateParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_states_5_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_5_0,
            	    						"fr.lcis.castav.cdml.CDML.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleState"
    // InternalCDML.g:755:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalCDML.g:755:46: (iv_ruleState= ruleState EOF )
            // InternalCDML.g:756:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalCDML.g:762:1: ruleState returns [EObject current=null] : ( (this_AtomicState_0= ruleAtomicState | this_SuperState_1= ruleSuperState ) (otherlv_2= '{' ( (lv_transitions_3_0= ruleTransition ) )* (otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}' )? otherlv_10= '}' )? ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject this_AtomicState_0 = null;

        EObject this_SuperState_1 = null;

        EObject lv_transitions_3_0 = null;

        EObject lv_dataflows_6_0 = null;

        EObject lv_dataflows_8_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:768:2: ( ( (this_AtomicState_0= ruleAtomicState | this_SuperState_1= ruleSuperState ) (otherlv_2= '{' ( (lv_transitions_3_0= ruleTransition ) )* (otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}' )? otherlv_10= '}' )? ) )
            // InternalCDML.g:769:2: ( (this_AtomicState_0= ruleAtomicState | this_SuperState_1= ruleSuperState ) (otherlv_2= '{' ( (lv_transitions_3_0= ruleTransition ) )* (otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}' )? otherlv_10= '}' )? )
            {
            // InternalCDML.g:769:2: ( (this_AtomicState_0= ruleAtomicState | this_SuperState_1= ruleSuperState ) (otherlv_2= '{' ( (lv_transitions_3_0= ruleTransition ) )* (otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}' )? otherlv_10= '}' )? )
            // InternalCDML.g:770:3: (this_AtomicState_0= ruleAtomicState | this_SuperState_1= ruleSuperState ) (otherlv_2= '{' ( (lv_transitions_3_0= ruleTransition ) )* (otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}' )? otherlv_10= '}' )?
            {
            // InternalCDML.g:770:3: (this_AtomicState_0= ruleAtomicState | this_SuperState_1= ruleSuperState )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            else if ( (LA11_0==25) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCDML.g:771:4: this_AtomicState_0= ruleAtomicState
                    {

                    				newCompositeNode(grammarAccess.getStateAccess().getAtomicStateParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_17);
                    this_AtomicState_0=ruleAtomicState();

                    state._fsp--;


                    				current = this_AtomicState_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalCDML.g:780:4: this_SuperState_1= ruleSuperState
                    {

                    				newCompositeNode(grammarAccess.getStateAccess().getSuperStateParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_SuperState_1=ruleSuperState();

                    state._fsp--;


                    				current = this_SuperState_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalCDML.g:789:3: (otherlv_2= '{' ( (lv_transitions_3_0= ruleTransition ) )* (otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}' )? otherlv_10= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==12) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCDML.g:790:4: otherlv_2= '{' ( (lv_transitions_3_0= ruleTransition ) )* (otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}' )? otherlv_10= '}'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_0());
                    			
                    // InternalCDML.g:794:4: ( (lv_transitions_3_0= ruleTransition ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==27) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCDML.g:795:5: (lv_transitions_3_0= ruleTransition )
                    	    {
                    	    // InternalCDML.g:795:5: (lv_transitions_3_0= ruleTransition )
                    	    // InternalCDML.g:796:6: lv_transitions_3_0= ruleTransition
                    	    {

                    	    						newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_transitions_3_0=ruleTransition();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStateRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"transitions",
                    	    							lv_transitions_3_0,
                    	    							"fr.lcis.castav.cdml.CDML.Transition");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalCDML.g:813:4: (otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==22) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalCDML.g:814:5: otherlv_4= 'dataflows' otherlv_5= '{' ( (lv_dataflows_6_0= ruleDataFlow ) ) (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )* otherlv_9= '}'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_4); 

                            					newLeafNode(otherlv_4, grammarAccess.getStateAccess().getDataflowsKeyword_1_2_0());
                            				
                            otherlv_5=(Token)match(input,12,FOLLOW_19); 

                            					newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_1_2_1());
                            				
                            // InternalCDML.g:822:5: ( (lv_dataflows_6_0= ruleDataFlow ) )
                            // InternalCDML.g:823:6: (lv_dataflows_6_0= ruleDataFlow )
                            {
                            // InternalCDML.g:823:6: (lv_dataflows_6_0= ruleDataFlow )
                            // InternalCDML.g:824:7: lv_dataflows_6_0= ruleDataFlow
                            {

                            							newCompositeNode(grammarAccess.getStateAccess().getDataflowsDataFlowParserRuleCall_1_2_2_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_dataflows_6_0=ruleDataFlow();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getStateRule());
                            							}
                            							add(
                            								current,
                            								"dataflows",
                            								lv_dataflows_6_0,
                            								"fr.lcis.castav.cdml.CDML.DataFlow");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalCDML.g:841:5: (otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) ) )*
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==15) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalCDML.g:842:6: otherlv_7= ',' ( (lv_dataflows_8_0= ruleDataFlow ) )
                            	    {
                            	    otherlv_7=(Token)match(input,15,FOLLOW_19); 

                            	    						newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_1_2_3_0());
                            	    					
                            	    // InternalCDML.g:846:6: ( (lv_dataflows_8_0= ruleDataFlow ) )
                            	    // InternalCDML.g:847:7: (lv_dataflows_8_0= ruleDataFlow )
                            	    {
                            	    // InternalCDML.g:847:7: (lv_dataflows_8_0= ruleDataFlow )
                            	    // InternalCDML.g:848:8: lv_dataflows_8_0= ruleDataFlow
                            	    {

                            	    								newCompositeNode(grammarAccess.getStateAccess().getDataflowsDataFlowParserRuleCall_1_2_3_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_dataflows_8_0=ruleDataFlow();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getStateRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"dataflows",
                            	    									lv_dataflows_8_0,
                            	    									"fr.lcis.castav.cdml.CDML.DataFlow");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop13;
                                }
                            } while (true);

                            otherlv_9=(Token)match(input,13,FOLLOW_20); 

                            					newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_2_4());
                            				

                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,13,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleAtomicState"
    // InternalCDML.g:880:1: entryRuleAtomicState returns [EObject current=null] : iv_ruleAtomicState= ruleAtomicState EOF ;
    public final EObject entryRuleAtomicState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicState = null;


        try {
            // InternalCDML.g:880:52: (iv_ruleAtomicState= ruleAtomicState EOF )
            // InternalCDML.g:881:2: iv_ruleAtomicState= ruleAtomicState EOF
            {
             newCompositeNode(grammarAccess.getAtomicStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomicState=ruleAtomicState();

            state._fsp--;

             current =iv_ruleAtomicState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomicState"


    // $ANTLR start "ruleAtomicState"
    // InternalCDML.g:887:1: ruleAtomicState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_contextAware_2_0= 'awareof' ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ) ;
    public final EObject ruleAtomicState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_contextAware_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:893:2: ( (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_contextAware_2_0= 'awareof' ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? ) )
            // InternalCDML.g:894:2: (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_contextAware_2_0= 'awareof' ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? )
            {
            // InternalCDML.g:894:2: (otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_contextAware_2_0= 'awareof' ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )? )
            // InternalCDML.g:895:3: otherlv_0= 'state' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_contextAware_2_0= 'awareof' ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAtomicStateAccess().getStateKeyword_0());
            		
            // InternalCDML.g:899:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCDML.g:900:4: (lv_name_1_0= ruleEString )
            {
            // InternalCDML.g:900:4: (lv_name_1_0= ruleEString )
            // InternalCDML.g:901:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAtomicStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.lcis.castav.cdml.CDML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDML.g:918:3: ( ( (lv_contextAware_2_0= 'awareof' ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==24) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCDML.g:919:4: ( (lv_contextAware_2_0= 'awareof' ) ) ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    {
                    // InternalCDML.g:919:4: ( (lv_contextAware_2_0= 'awareof' ) )
                    // InternalCDML.g:920:5: (lv_contextAware_2_0= 'awareof' )
                    {
                    // InternalCDML.g:920:5: (lv_contextAware_2_0= 'awareof' )
                    // InternalCDML.g:921:6: lv_contextAware_2_0= 'awareof'
                    {
                    lv_contextAware_2_0=(Token)match(input,24,FOLLOW_13); 

                    						newLeafNode(lv_contextAware_2_0, grammarAccess.getAtomicStateAccess().getContextAwareAwareofKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicStateRule());
                    						}
                    						setWithLastConsumed(current, "contextAware", lv_contextAware_2_0 != null, "awareof");
                    					

                    }


                    }

                    // InternalCDML.g:933:4: ( (otherlv_3= RULE_ID ) )
                    // InternalCDML.g:934:5: (otherlv_3= RULE_ID )
                    {
                    // InternalCDML.g:934:5: (otherlv_3= RULE_ID )
                    // InternalCDML.g:935:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicStateRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_22); 

                    						newLeafNode(otherlv_3, grammarAccess.getAtomicStateAccess().getContextsContextCrossReference_2_1_0());
                    					

                    }


                    }

                    // InternalCDML.g:946:4: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCDML.g:947:5: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_13); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getAtomicStateAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalCDML.g:951:5: ( (otherlv_5= RULE_ID ) )
                    	    // InternalCDML.g:952:6: (otherlv_5= RULE_ID )
                    	    {
                    	    // InternalCDML.g:952:6: (otherlv_5= RULE_ID )
                    	    // InternalCDML.g:953:7: otherlv_5= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getAtomicStateRule());
                    	    							}
                    	    						
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_22); 

                    	    							newLeafNode(otherlv_5, grammarAccess.getAtomicStateAccess().getContextsContextCrossReference_2_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomicState"


    // $ANTLR start "entryRuleSuperState"
    // InternalCDML.g:970:1: entryRuleSuperState returns [EObject current=null] : iv_ruleSuperState= ruleSuperState EOF ;
    public final EObject entryRuleSuperState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperState = null;


        try {
            // InternalCDML.g:970:51: (iv_ruleSuperState= ruleSuperState EOF )
            // InternalCDML.g:971:2: iv_ruleSuperState= ruleSuperState EOF
            {
             newCompositeNode(grammarAccess.getSuperStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperState=ruleSuperState();

            state._fsp--;

             current =iv_ruleSuperState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperState"


    // $ANTLR start "ruleSuperState"
    // InternalCDML.g:977:1: ruleSuperState returns [EObject current=null] : (otherlv_0= 'super' otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'abstracts' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleSuperState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:983:2: ( (otherlv_0= 'super' otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'abstracts' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalCDML.g:984:2: (otherlv_0= 'super' otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'abstracts' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalCDML.g:984:2: (otherlv_0= 'super' otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'abstracts' ( (otherlv_4= RULE_ID ) ) )
            // InternalCDML.g:985:3: otherlv_0= 'super' otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'abstracts' ( (otherlv_4= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_23); 

            			newLeafNode(otherlv_0, grammarAccess.getSuperStateAccess().getSuperKeyword_0());
            		
            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSuperStateAccess().getStateKeyword_1());
            		
            // InternalCDML.g:993:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCDML.g:994:4: (lv_name_2_0= ruleEString )
            {
            // InternalCDML.g:994:4: (lv_name_2_0= ruleEString )
            // InternalCDML.g:995:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSuperStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSuperStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.lcis.castav.cdml.CDML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSuperStateAccess().getAbstractsKeyword_3());
            		
            // InternalCDML.g:1016:3: ( (otherlv_4= RULE_ID ) )
            // InternalCDML.g:1017:4: (otherlv_4= RULE_ID )
            {
            // InternalCDML.g:1017:4: (otherlv_4= RULE_ID )
            // InternalCDML.g:1018:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSuperStateRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_4, grammarAccess.getSuperStateAccess().getAbstractsStatemachineCrossReference_4_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperState"


    // $ANTLR start "entryRuleTransition"
    // InternalCDML.g:1033:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalCDML.g:1033:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalCDML.g:1034:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalCDML.g:1040:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'transition' (otherlv_2= 'on' ( (lv_on_3_0= ruleEvent ) ) )? otherlv_4= '->' ( ( ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) ) )? | ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_external_5_0=null;
        Token otherlv_7=null;
        EObject lv_on_3_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:1046:2: ( ( () otherlv_1= 'transition' (otherlv_2= 'on' ( (lv_on_3_0= ruleEvent ) ) )? otherlv_4= '->' ( ( ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) ) )? | ( (otherlv_7= RULE_ID ) ) ) ) )
            // InternalCDML.g:1047:2: ( () otherlv_1= 'transition' (otherlv_2= 'on' ( (lv_on_3_0= ruleEvent ) ) )? otherlv_4= '->' ( ( ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) ) )? | ( (otherlv_7= RULE_ID ) ) ) )
            {
            // InternalCDML.g:1047:2: ( () otherlv_1= 'transition' (otherlv_2= 'on' ( (lv_on_3_0= ruleEvent ) ) )? otherlv_4= '->' ( ( ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) ) )? | ( (otherlv_7= RULE_ID ) ) ) )
            // InternalCDML.g:1048:3: () otherlv_1= 'transition' (otherlv_2= 'on' ( (lv_on_3_0= ruleEvent ) ) )? otherlv_4= '->' ( ( ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) ) )? | ( (otherlv_7= RULE_ID ) ) )
            {
            // InternalCDML.g:1048:3: ()
            // InternalCDML.g:1049:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalCDML.g:1059:3: (otherlv_2= 'on' ( (lv_on_3_0= ruleEvent ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCDML.g:1060:4: otherlv_2= 'on' ( (lv_on_3_0= ruleEvent ) )
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getOnKeyword_2_0());
                    			
                    // InternalCDML.g:1064:4: ( (lv_on_3_0= ruleEvent ) )
                    // InternalCDML.g:1065:5: (lv_on_3_0= ruleEvent )
                    {
                    // InternalCDML.g:1065:5: (lv_on_3_0= ruleEvent )
                    // InternalCDML.g:1066:6: lv_on_3_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getOnEventParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_on_3_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"on",
                    							lv_on_3_0,
                    							"fr.lcis.castav.cdml.CDML.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_27); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            // InternalCDML.g:1088:3: ( ( ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) ) )? | ( (otherlv_7= RULE_ID ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EOF||LA20_0==13||LA20_0==22||LA20_0==27||LA20_0==30) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalCDML.g:1089:4: ( ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) ) )?
                    {
                    // InternalCDML.g:1089:4: ( ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalCDML.g:1090:5: ( (lv_external_5_0= 'external' ) ) ( ( ruleFQN ) )
                            {
                            // InternalCDML.g:1090:5: ( (lv_external_5_0= 'external' ) )
                            // InternalCDML.g:1091:6: (lv_external_5_0= 'external' )
                            {
                            // InternalCDML.g:1091:6: (lv_external_5_0= 'external' )
                            // InternalCDML.g:1092:7: lv_external_5_0= 'external'
                            {
                            lv_external_5_0=(Token)match(input,30,FOLLOW_3); 

                            							newLeafNode(lv_external_5_0, grammarAccess.getTransitionAccess().getExternalExternalKeyword_4_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTransitionRule());
                            							}
                            							setWithLastConsumed(current, "external", lv_external_5_0 != null, "external");
                            						

                            }


                            }

                            // InternalCDML.g:1104:5: ( ( ruleFQN ) )
                            // InternalCDML.g:1105:6: ( ruleFQN )
                            {
                            // InternalCDML.g:1105:6: ( ruleFQN )
                            // InternalCDML.g:1106:7: ruleFQN
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getTransitionRule());
                            							}
                            						

                            							newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_0_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            ruleFQN();

                            state._fsp--;


                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalCDML.g:1122:4: ( (otherlv_7= RULE_ID ) )
                    {
                    // InternalCDML.g:1122:4: ( (otherlv_7= RULE_ID ) )
                    // InternalCDML.g:1123:5: (otherlv_7= RULE_ID )
                    {
                    // InternalCDML.g:1123:5: (otherlv_7= RULE_ID )
                    // InternalCDML.g:1124:6: otherlv_7= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetStateCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleEvent"
    // InternalCDML.g:1140:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalCDML.g:1140:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalCDML.g:1141:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalCDML.g:1147:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:1153:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalCDML.g:1154:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalCDML.g:1154:2: ( (lv_name_0_0= ruleEString ) )
            // InternalCDML.g:1155:3: (lv_name_0_0= ruleEString )
            {
            // InternalCDML.g:1155:3: (lv_name_0_0= ruleEString )
            // InternalCDML.g:1156:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getEventRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"fr.lcis.castav.cdml.CDML.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRulePermission"
    // InternalCDML.g:1176:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // InternalCDML.g:1176:51: (iv_rulePermission= rulePermission EOF )
            // InternalCDML.g:1177:2: iv_rulePermission= rulePermission EOF
            {
             newCompositeNode(grammarAccess.getPermissionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermission=rulePermission();

            state._fsp--;

             current =iv_rulePermission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermission"


    // $ANTLR start "rulePermission"
    // InternalCDML.g:1183:1: rulePermission returns [EObject current=null] : ( ( ( (lv_normal_0_0= 'normal' ) ) ( (lv_permissionValues_1_0= rulePermissionValue ) ) (otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) ) )* ) | ( ( (lv_dangerous_4_0= 'dangerous' ) ) ( (lv_permissionValues_5_0= rulePermissionValue ) ) (otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) ) )* ) | ( (lv_signature_8_0= 'signature' ) ) | ( (lv_signatureOrSystem_9_0= 'signatureOrSystem' ) ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        Token lv_normal_0_0=null;
        Token otherlv_2=null;
        Token lv_dangerous_4_0=null;
        Token otherlv_6=null;
        Token lv_signature_8_0=null;
        Token lv_signatureOrSystem_9_0=null;
        EObject lv_permissionValues_1_0 = null;

        EObject lv_permissionValues_3_0 = null;

        EObject lv_permissionValues_5_0 = null;

        EObject lv_permissionValues_7_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:1189:2: ( ( ( ( (lv_normal_0_0= 'normal' ) ) ( (lv_permissionValues_1_0= rulePermissionValue ) ) (otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) ) )* ) | ( ( (lv_dangerous_4_0= 'dangerous' ) ) ( (lv_permissionValues_5_0= rulePermissionValue ) ) (otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) ) )* ) | ( (lv_signature_8_0= 'signature' ) ) | ( (lv_signatureOrSystem_9_0= 'signatureOrSystem' ) ) ) )
            // InternalCDML.g:1190:2: ( ( ( (lv_normal_0_0= 'normal' ) ) ( (lv_permissionValues_1_0= rulePermissionValue ) ) (otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) ) )* ) | ( ( (lv_dangerous_4_0= 'dangerous' ) ) ( (lv_permissionValues_5_0= rulePermissionValue ) ) (otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) ) )* ) | ( (lv_signature_8_0= 'signature' ) ) | ( (lv_signatureOrSystem_9_0= 'signatureOrSystem' ) ) )
            {
            // InternalCDML.g:1190:2: ( ( ( (lv_normal_0_0= 'normal' ) ) ( (lv_permissionValues_1_0= rulePermissionValue ) ) (otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) ) )* ) | ( ( (lv_dangerous_4_0= 'dangerous' ) ) ( (lv_permissionValues_5_0= rulePermissionValue ) ) (otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) ) )* ) | ( (lv_signature_8_0= 'signature' ) ) | ( (lv_signatureOrSystem_9_0= 'signatureOrSystem' ) ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt23=1;
                }
                break;
            case 32:
                {
                alt23=2;
                }
                break;
            case 33:
                {
                alt23=3;
                }
                break;
            case 34:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalCDML.g:1191:3: ( ( (lv_normal_0_0= 'normal' ) ) ( (lv_permissionValues_1_0= rulePermissionValue ) ) (otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) ) )* )
                    {
                    // InternalCDML.g:1191:3: ( ( (lv_normal_0_0= 'normal' ) ) ( (lv_permissionValues_1_0= rulePermissionValue ) ) (otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) ) )* )
                    // InternalCDML.g:1192:4: ( (lv_normal_0_0= 'normal' ) ) ( (lv_permissionValues_1_0= rulePermissionValue ) ) (otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) ) )*
                    {
                    // InternalCDML.g:1192:4: ( (lv_normal_0_0= 'normal' ) )
                    // InternalCDML.g:1193:5: (lv_normal_0_0= 'normal' )
                    {
                    // InternalCDML.g:1193:5: (lv_normal_0_0= 'normal' )
                    // InternalCDML.g:1194:6: lv_normal_0_0= 'normal'
                    {
                    lv_normal_0_0=(Token)match(input,31,FOLLOW_3); 

                    						newLeafNode(lv_normal_0_0, grammarAccess.getPermissionAccess().getNormalNormalKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPermissionRule());
                    						}
                    						setWithLastConsumed(current, "normal", lv_normal_0_0 != null, "normal");
                    					

                    }


                    }

                    // InternalCDML.g:1206:4: ( (lv_permissionValues_1_0= rulePermissionValue ) )
                    // InternalCDML.g:1207:5: (lv_permissionValues_1_0= rulePermissionValue )
                    {
                    // InternalCDML.g:1207:5: (lv_permissionValues_1_0= rulePermissionValue )
                    // InternalCDML.g:1208:6: lv_permissionValues_1_0= rulePermissionValue
                    {

                    						newCompositeNode(grammarAccess.getPermissionAccess().getPermissionValuesPermissionValueParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_permissionValues_1_0=rulePermissionValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPermissionRule());
                    						}
                    						add(
                    							current,
                    							"permissionValues",
                    							lv_permissionValues_1_0,
                    							"fr.lcis.castav.cdml.CDML.PermissionValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCDML.g:1225:4: (otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalCDML.g:1226:5: otherlv_2= ',' ( (lv_permissionValues_3_0= rulePermissionValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getPermissionAccess().getCommaKeyword_0_2_0());
                    	    				
                    	    // InternalCDML.g:1230:5: ( (lv_permissionValues_3_0= rulePermissionValue ) )
                    	    // InternalCDML.g:1231:6: (lv_permissionValues_3_0= rulePermissionValue )
                    	    {
                    	    // InternalCDML.g:1231:6: (lv_permissionValues_3_0= rulePermissionValue )
                    	    // InternalCDML.g:1232:7: lv_permissionValues_3_0= rulePermissionValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getPermissionAccess().getPermissionValuesPermissionValueParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_permissionValues_3_0=rulePermissionValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPermissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"permissionValues",
                    	    								lv_permissionValues_3_0,
                    	    								"fr.lcis.castav.cdml.CDML.PermissionValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalCDML.g:1252:3: ( ( (lv_dangerous_4_0= 'dangerous' ) ) ( (lv_permissionValues_5_0= rulePermissionValue ) ) (otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) ) )* )
                    {
                    // InternalCDML.g:1252:3: ( ( (lv_dangerous_4_0= 'dangerous' ) ) ( (lv_permissionValues_5_0= rulePermissionValue ) ) (otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) ) )* )
                    // InternalCDML.g:1253:4: ( (lv_dangerous_4_0= 'dangerous' ) ) ( (lv_permissionValues_5_0= rulePermissionValue ) ) (otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) ) )*
                    {
                    // InternalCDML.g:1253:4: ( (lv_dangerous_4_0= 'dangerous' ) )
                    // InternalCDML.g:1254:5: (lv_dangerous_4_0= 'dangerous' )
                    {
                    // InternalCDML.g:1254:5: (lv_dangerous_4_0= 'dangerous' )
                    // InternalCDML.g:1255:6: lv_dangerous_4_0= 'dangerous'
                    {
                    lv_dangerous_4_0=(Token)match(input,32,FOLLOW_3); 

                    						newLeafNode(lv_dangerous_4_0, grammarAccess.getPermissionAccess().getDangerousDangerousKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPermissionRule());
                    						}
                    						setWithLastConsumed(current, "dangerous", lv_dangerous_4_0 != null, "dangerous");
                    					

                    }


                    }

                    // InternalCDML.g:1267:4: ( (lv_permissionValues_5_0= rulePermissionValue ) )
                    // InternalCDML.g:1268:5: (lv_permissionValues_5_0= rulePermissionValue )
                    {
                    // InternalCDML.g:1268:5: (lv_permissionValues_5_0= rulePermissionValue )
                    // InternalCDML.g:1269:6: lv_permissionValues_5_0= rulePermissionValue
                    {

                    						newCompositeNode(grammarAccess.getPermissionAccess().getPermissionValuesPermissionValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_permissionValues_5_0=rulePermissionValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPermissionRule());
                    						}
                    						add(
                    							current,
                    							"permissionValues",
                    							lv_permissionValues_5_0,
                    							"fr.lcis.castav.cdml.CDML.PermissionValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCDML.g:1286:4: (otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalCDML.g:1287:5: otherlv_6= ',' ( (lv_permissionValues_7_0= rulePermissionValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getPermissionAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalCDML.g:1291:5: ( (lv_permissionValues_7_0= rulePermissionValue ) )
                    	    // InternalCDML.g:1292:6: (lv_permissionValues_7_0= rulePermissionValue )
                    	    {
                    	    // InternalCDML.g:1292:6: (lv_permissionValues_7_0= rulePermissionValue )
                    	    // InternalCDML.g:1293:7: lv_permissionValues_7_0= rulePermissionValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getPermissionAccess().getPermissionValuesPermissionValueParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    lv_permissionValues_7_0=rulePermissionValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPermissionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"permissionValues",
                    	    								lv_permissionValues_7_0,
                    	    								"fr.lcis.castav.cdml.CDML.PermissionValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalCDML.g:1313:3: ( (lv_signature_8_0= 'signature' ) )
                    {
                    // InternalCDML.g:1313:3: ( (lv_signature_8_0= 'signature' ) )
                    // InternalCDML.g:1314:4: (lv_signature_8_0= 'signature' )
                    {
                    // InternalCDML.g:1314:4: (lv_signature_8_0= 'signature' )
                    // InternalCDML.g:1315:5: lv_signature_8_0= 'signature'
                    {
                    lv_signature_8_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_signature_8_0, grammarAccess.getPermissionAccess().getSignatureSignatureKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPermissionRule());
                    					}
                    					setWithLastConsumed(current, "signature", lv_signature_8_0 != null, "signature");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalCDML.g:1328:3: ( (lv_signatureOrSystem_9_0= 'signatureOrSystem' ) )
                    {
                    // InternalCDML.g:1328:3: ( (lv_signatureOrSystem_9_0= 'signatureOrSystem' ) )
                    // InternalCDML.g:1329:4: (lv_signatureOrSystem_9_0= 'signatureOrSystem' )
                    {
                    // InternalCDML.g:1329:4: (lv_signatureOrSystem_9_0= 'signatureOrSystem' )
                    // InternalCDML.g:1330:5: lv_signatureOrSystem_9_0= 'signatureOrSystem'
                    {
                    lv_signatureOrSystem_9_0=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_signatureOrSystem_9_0, grammarAccess.getPermissionAccess().getSignatureOrSystemSignatureOrSystemKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPermissionRule());
                    					}
                    					setWithLastConsumed(current, "signatureOrSystem", lv_signatureOrSystem_9_0 != null, "signatureOrSystem");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRulePermissionValue"
    // InternalCDML.g:1346:1: entryRulePermissionValue returns [EObject current=null] : iv_rulePermissionValue= rulePermissionValue EOF ;
    public final EObject entryRulePermissionValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermissionValue = null;


        try {
            // InternalCDML.g:1346:56: (iv_rulePermissionValue= rulePermissionValue EOF )
            // InternalCDML.g:1347:2: iv_rulePermissionValue= rulePermissionValue EOF
            {
             newCompositeNode(grammarAccess.getPermissionValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePermissionValue=rulePermissionValue();

            state._fsp--;

             current =iv_rulePermissionValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePermissionValue"


    // $ANTLR start "rulePermissionValue"
    // InternalCDML.g:1353:1: rulePermissionValue returns [EObject current=null] : ( (lv_name_0_0= ruleEString ) ) ;
    public final EObject rulePermissionValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:1359:2: ( ( (lv_name_0_0= ruleEString ) ) )
            // InternalCDML.g:1360:2: ( (lv_name_0_0= ruleEString ) )
            {
            // InternalCDML.g:1360:2: ( (lv_name_0_0= ruleEString ) )
            // InternalCDML.g:1361:3: (lv_name_0_0= ruleEString )
            {
            // InternalCDML.g:1361:3: (lv_name_0_0= ruleEString )
            // InternalCDML.g:1362:4: lv_name_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getPermissionValueAccess().getNameEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPermissionValueRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"fr.lcis.castav.cdml.CDML.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePermissionValue"


    // $ANTLR start "entryRuleDataFlow"
    // InternalCDML.g:1382:1: entryRuleDataFlow returns [EObject current=null] : iv_ruleDataFlow= ruleDataFlow EOF ;
    public final EObject entryRuleDataFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataFlow = null;


        try {
            // InternalCDML.g:1382:49: (iv_ruleDataFlow= ruleDataFlow EOF )
            // InternalCDML.g:1383:2: iv_ruleDataFlow= ruleDataFlow EOF
            {
             newCompositeNode(grammarAccess.getDataFlowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataFlow=ruleDataFlow();

            state._fsp--;

             current =iv_ruleDataFlow; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataFlow"


    // $ANTLR start "ruleDataFlow"
    // InternalCDML.g:1389:1: ruleDataFlow returns [EObject current=null] : (this_Source_0= ruleSource | this_Sink_1= ruleSink ) ;
    public final EObject ruleDataFlow() throws RecognitionException {
        EObject current = null;

        EObject this_Source_0 = null;

        EObject this_Sink_1 = null;



        	enterRule();

        try {
            // InternalCDML.g:1395:2: ( (this_Source_0= ruleSource | this_Sink_1= ruleSink ) )
            // InternalCDML.g:1396:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink )
            {
            // InternalCDML.g:1396:2: (this_Source_0= ruleSource | this_Sink_1= ruleSink )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=39 && LA24_0<=40)) ) {
                alt24=1;
            }
            else if ( (LA24_0==35) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalCDML.g:1397:3: this_Source_0= ruleSource
                    {

                    			newCompositeNode(grammarAccess.getDataFlowAccess().getSourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Source_0=ruleSource();

                    state._fsp--;


                    			current = this_Source_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCDML.g:1406:3: this_Sink_1= ruleSink
                    {

                    			newCompositeNode(grammarAccess.getDataFlowAccess().getSinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sink_1=ruleSink();

                    state._fsp--;


                    			current = this_Sink_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataFlow"


    // $ANTLR start "entryRuleSink"
    // InternalCDML.g:1418:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalCDML.g:1418:45: (iv_ruleSink= ruleSink EOF )
            // InternalCDML.g:1419:2: iv_ruleSink= ruleSink EOF
            {
             newCompositeNode(grammarAccess.getSinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSink=ruleSink();

            state._fsp--;

             current =iv_ruleSink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSink"


    // $ANTLR start "ruleSink"
    // InternalCDML.g:1425:1: ruleSink returns [EObject current=null] : (otherlv_0= 'sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ;
    public final EObject ruleSink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:1431:2: ( (otherlv_0= 'sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) )
            // InternalCDML.g:1432:2: (otherlv_0= 'sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            {
            // InternalCDML.g:1432:2: (otherlv_0= 'sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
            // InternalCDML.g:1433:3: otherlv_0= 'sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '(' ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalCDML.g:1437:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCDML.g:1438:4: (lv_name_1_0= ruleEString )
            {
            // InternalCDML.g:1438:4: (lv_name_1_0= ruleEString )
            // InternalCDML.g:1439:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.lcis.castav.cdml.CDML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCDML.g:1460:3: ( ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID||(LA26_0>=38 && LA26_0<=39)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalCDML.g:1461:4: ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    {
                    // InternalCDML.g:1461:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalCDML.g:1462:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalCDML.g:1462:5: (lv_parameters_3_0= ruleParameter )
                    // InternalCDML.g:1463:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getParametersParameterParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"fr.lcis.castav.cdml.CDML.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCDML.g:1480:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==15) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalCDML.g:1481:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_31); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getSinkAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCDML.g:1485:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalCDML.g:1486:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalCDML.g:1486:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalCDML.g:1487:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSinkAccess().getParametersParameterParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSinkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"fr.lcis.castav.cdml.CDML.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSinkAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSink"


    // $ANTLR start "entryRuleParameter"
    // InternalCDML.g:1514:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCDML.g:1514:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCDML.g:1515:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCDML.g:1521:1: ruleParameter returns [EObject current=null] : ( ( (lv_wildcard_0_0= '*' ) ) | ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_source_2_0= 'source' ) ) ( ( ruleFQN ) ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_wildcard_0_0=null;
        Token lv_value_1_0=null;
        Token lv_source_2_0=null;


        	enterRule();

        try {
            // InternalCDML.g:1527:2: ( ( ( (lv_wildcard_0_0= '*' ) ) | ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_source_2_0= 'source' ) ) ( ( ruleFQN ) ) ) ) )
            // InternalCDML.g:1528:2: ( ( (lv_wildcard_0_0= '*' ) ) | ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_source_2_0= 'source' ) ) ( ( ruleFQN ) ) ) )
            {
            // InternalCDML.g:1528:2: ( ( (lv_wildcard_0_0= '*' ) ) | ( (lv_value_1_0= RULE_ID ) ) | ( ( (lv_source_2_0= 'source' ) ) ( ( ruleFQN ) ) ) )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt27=1;
                }
                break;
            case RULE_ID:
                {
                alt27=2;
                }
                break;
            case 39:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalCDML.g:1529:3: ( (lv_wildcard_0_0= '*' ) )
                    {
                    // InternalCDML.g:1529:3: ( (lv_wildcard_0_0= '*' ) )
                    // InternalCDML.g:1530:4: (lv_wildcard_0_0= '*' )
                    {
                    // InternalCDML.g:1530:4: (lv_wildcard_0_0= '*' )
                    // InternalCDML.g:1531:5: lv_wildcard_0_0= '*'
                    {
                    lv_wildcard_0_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_wildcard_0_0, grammarAccess.getParameterAccess().getWildcardAsteriskKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(current, "wildcard", lv_wildcard_0_0 != null, "*");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCDML.g:1544:3: ( (lv_value_1_0= RULE_ID ) )
                    {
                    // InternalCDML.g:1544:3: ( (lv_value_1_0= RULE_ID ) )
                    // InternalCDML.g:1545:4: (lv_value_1_0= RULE_ID )
                    {
                    // InternalCDML.g:1545:4: (lv_value_1_0= RULE_ID )
                    // InternalCDML.g:1546:5: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_value_1_0, grammarAccess.getParameterAccess().getValueIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"value",
                    						lv_value_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCDML.g:1563:3: ( ( (lv_source_2_0= 'source' ) ) ( ( ruleFQN ) ) )
                    {
                    // InternalCDML.g:1563:3: ( ( (lv_source_2_0= 'source' ) ) ( ( ruleFQN ) ) )
                    // InternalCDML.g:1564:4: ( (lv_source_2_0= 'source' ) ) ( ( ruleFQN ) )
                    {
                    // InternalCDML.g:1564:4: ( (lv_source_2_0= 'source' ) )
                    // InternalCDML.g:1565:5: (lv_source_2_0= 'source' )
                    {
                    // InternalCDML.g:1565:5: (lv_source_2_0= 'source' )
                    // InternalCDML.g:1566:6: lv_source_2_0= 'source'
                    {
                    lv_source_2_0=(Token)match(input,39,FOLLOW_3); 

                    						newLeafNode(lv_source_2_0, grammarAccess.getParameterAccess().getSourceSourceKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    						setWithLastConsumed(current, "source", lv_source_2_0 != null, "source");
                    					

                    }


                    }

                    // InternalCDML.g:1578:4: ( ( ruleFQN ) )
                    // InternalCDML.g:1579:5: ( ruleFQN )
                    {
                    // InternalCDML.g:1579:5: ( ruleFQN )
                    // InternalCDML.g:1580:6: ruleFQN
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getParameterAccess().getOriginSourceCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSource"
    // InternalCDML.g:1599:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalCDML.g:1599:47: (iv_ruleSource= ruleSource EOF )
            // InternalCDML.g:1600:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // InternalCDML.g:1606:1: ruleSource returns [EObject current=null] : ( ( (lv_input_0_0= 'input' ) )? otherlv_1= 'source' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token lv_input_0_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:1612:2: ( ( ( (lv_input_0_0= 'input' ) )? otherlv_1= 'source' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCDML.g:1613:2: ( ( (lv_input_0_0= 'input' ) )? otherlv_1= 'source' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCDML.g:1613:2: ( ( (lv_input_0_0= 'input' ) )? otherlv_1= 'source' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCDML.g:1614:3: ( (lv_input_0_0= 'input' ) )? otherlv_1= 'source' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCDML.g:1614:3: ( (lv_input_0_0= 'input' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalCDML.g:1615:4: (lv_input_0_0= 'input' )
                    {
                    // InternalCDML.g:1615:4: (lv_input_0_0= 'input' )
                    // InternalCDML.g:1616:5: lv_input_0_0= 'input'
                    {
                    lv_input_0_0=(Token)match(input,40,FOLLOW_32); 

                    					newLeafNode(lv_input_0_0, grammarAccess.getSourceAccess().getInputInputKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceRule());
                    					}
                    					setWithLastConsumed(current, "input", lv_input_0_0 != null, "input");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceAccess().getSourceKeyword_1());
            		
            // InternalCDML.g:1632:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCDML.g:1633:4: (lv_name_2_0= ruleEString )
            {
            // InternalCDML.g:1633:4: (lv_name_2_0= ruleEString )
            // InternalCDML.g:1634:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSourceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.lcis.castav.cdml.CDML.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleAdaptation"
    // InternalCDML.g:1655:1: entryRuleAdaptation returns [EObject current=null] : iv_ruleAdaptation= ruleAdaptation EOF ;
    public final EObject entryRuleAdaptation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdaptation = null;


        try {
            // InternalCDML.g:1655:51: (iv_ruleAdaptation= ruleAdaptation EOF )
            // InternalCDML.g:1656:2: iv_ruleAdaptation= ruleAdaptation EOF
            {
             newCompositeNode(grammarAccess.getAdaptationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdaptation=ruleAdaptation();

            state._fsp--;

             current =iv_ruleAdaptation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdaptation"


    // $ANTLR start "ruleAdaptation"
    // InternalCDML.g:1662:1: ruleAdaptation returns [EObject current=null] : (otherlv_0= 'adaptation' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'at' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_states_8_0= ruleState ) )* otherlv_9= '}' ) ;
    public final EObject ruleAdaptation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_states_8_0 = null;



        	enterRule();

        try {
            // InternalCDML.g:1668:2: ( (otherlv_0= 'adaptation' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'at' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_states_8_0= ruleState ) )* otherlv_9= '}' ) )
            // InternalCDML.g:1669:2: (otherlv_0= 'adaptation' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'at' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_states_8_0= ruleState ) )* otherlv_9= '}' )
            {
            // InternalCDML.g:1669:2: (otherlv_0= 'adaptation' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'at' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_states_8_0= ruleState ) )* otherlv_9= '}' )
            // InternalCDML.g:1670:3: otherlv_0= 'adaptation' otherlv_1= 'for' ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* otherlv_5= 'at' ( (otherlv_6= RULE_ID ) ) otherlv_7= '{' ( (lv_states_8_0= ruleState ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getAdaptationAccess().getAdaptationKeyword_0());
            		
            otherlv_1=(Token)match(input,42,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getAdaptationAccess().getForKeyword_1());
            		
            // InternalCDML.g:1678:3: ( (otherlv_2= RULE_ID ) )
            // InternalCDML.g:1679:4: (otherlv_2= RULE_ID )
            {
            // InternalCDML.g:1679:4: (otherlv_2= RULE_ID )
            // InternalCDML.g:1680:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_2, grammarAccess.getAdaptationAccess().getSituationsSituationCrossReference_2_0());
            				

            }


            }

            // InternalCDML.g:1691:3: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==15) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalCDML.g:1692:4: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAdaptationAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCDML.g:1696:4: ( (otherlv_4= RULE_ID ) )
            	    // InternalCDML.g:1697:5: (otherlv_4= RULE_ID )
            	    {
            	    // InternalCDML.g:1697:5: (otherlv_4= RULE_ID )
            	    // InternalCDML.g:1698:6: otherlv_4= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAdaptationRule());
            	    						}
            	    					
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    						newLeafNode(otherlv_4, grammarAccess.getAdaptationAccess().getSituationsSituationCrossReference_3_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,43,FOLLOW_13); 

            			newLeafNode(otherlv_5, grammarAccess.getAdaptationAccess().getAtKeyword_4());
            		
            // InternalCDML.g:1714:3: ( (otherlv_6= RULE_ID ) )
            // InternalCDML.g:1715:4: (otherlv_6= RULE_ID )
            {
            // InternalCDML.g:1715:4: (otherlv_6= RULE_ID )
            // InternalCDML.g:1716:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAdaptationRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(otherlv_6, grammarAccess.getAdaptationAccess().getStateStateCrossReference_5_0());
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getAdaptationAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalCDML.g:1731:3: ( (lv_states_8_0= ruleState ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==23||LA30_0==25) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalCDML.g:1732:4: (lv_states_8_0= ruleState )
            	    {
            	    // InternalCDML.g:1732:4: (lv_states_8_0= ruleState )
            	    // InternalCDML.g:1733:5: lv_states_8_0= ruleState
            	    {

            	    					newCompositeNode(grammarAccess.getAdaptationAccess().getStatesStateParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_states_8_0=ruleState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAdaptationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_8_0,
            	    						"fr.lcis.castav.cdml.CDML.State");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_9=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getAdaptationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdaptation"


    // $ANTLR start "entryRuleFQN"
    // InternalCDML.g:1758:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCDML.g:1760:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalCDML.g:1761:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalCDML.g:1770:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCDML.g:1777:2: ( (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) )
            // InternalCDML.g:1778:2: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            {
            // InternalCDML.g:1778:2: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            // InternalCDML.g:1779:3: this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )*
            {

            			newCompositeNode(grammarAccess.getFQNAccess().getEStringParserRuleCall_0());
            		
            pushFollow(FOLLOW_35);
            this_EString_0=ruleEString();

            state._fsp--;


            			current.merge(this_EString_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalCDML.g:1789:3: (kw= '.' this_EString_2= ruleEString )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalCDML.g:1790:4: kw= '.' this_EString_2= ruleEString
            	    {
            	    kw=(Token)match(input,44,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getFQNAccess().getEStringParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_35);
            	    this_EString_2=ruleEString();

            	    state._fsp--;


            	    				current.merge(this_EString_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "entryRuleEString"
    // InternalCDML.g:1813:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCDML.g:1813:47: (iv_ruleEString= ruleEString EOF )
            // InternalCDML.g:1814:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCDML.g:1820:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCDML.g:1826:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCDML.g:1827:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCDML.g:1827:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalCDML.g:1828:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCDML.g:1836:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000020000156802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000020000152802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000780001000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002802000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008402000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000018800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000022L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000E000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000C000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000008000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000002L});

}
