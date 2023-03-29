package fr.lcis.castav.vpat.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.lcis.castav.vpat.services.VPATGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVPATParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Vulnerability'", "'{'", "'description'", "'context'", "','", "'}'", "'function'", "'main'", "'android.permission.'", "'network'", "'apiversion'", "'ACCESS_MEDIA_LOCATION'", "'ACCESS_NETWORK_STATE'", "'ACCESS_WIFI_STATE'", "'INTERNET'", "'default'", "'Sink'", "'parameter'", "'static'", "'*'", "'Source'", "'Input'", "'.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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

    // delegates
    // delegators


        public InternalVPATParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVPATParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVPATParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVPAT.g"; }



     	private VPATGrammarAccess grammarAccess;

        public InternalVPATParser(TokenStream input, VPATGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Vulnerability";
       	}

       	@Override
       	protected VPATGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVulnerability"
    // InternalVPAT.g:64:1: entryRuleVulnerability returns [EObject current=null] : iv_ruleVulnerability= ruleVulnerability EOF ;
    public final EObject entryRuleVulnerability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVulnerability = null;


        try {
            // InternalVPAT.g:64:54: (iv_ruleVulnerability= ruleVulnerability EOF )
            // InternalVPAT.g:65:2: iv_ruleVulnerability= ruleVulnerability EOF
            {
             newCompositeNode(grammarAccess.getVulnerabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVulnerability=ruleVulnerability();

            state._fsp--;

             current =iv_ruleVulnerability; 
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
    // $ANTLR end "entryRuleVulnerability"


    // $ANTLR start "ruleVulnerability"
    // InternalVPAT.g:71:1: ruleVulnerability returns [EObject current=null] : ( () otherlv_1= 'Vulnerability' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'context' otherlv_7= '{' ( (lv_context_8_0= ruleContext ) ) (otherlv_9= ',' ( (lv_context_10_0= ruleContext ) ) )* otherlv_11= '}' )? (otherlv_12= 'function' otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleVulnerability() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        EObject lv_context_8_0 = null;

        EObject lv_context_10_0 = null;

        EObject lv_mainFunction_16_0 = null;

        EObject lv_function_18_0 = null;



        	enterRule();

        try {
            // InternalVPAT.g:77:2: ( ( () otherlv_1= 'Vulnerability' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'context' otherlv_7= '{' ( (lv_context_8_0= ruleContext ) ) (otherlv_9= ',' ( (lv_context_10_0= ruleContext ) ) )* otherlv_11= '}' )? (otherlv_12= 'function' otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalVPAT.g:78:2: ( () otherlv_1= 'Vulnerability' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'context' otherlv_7= '{' ( (lv_context_8_0= ruleContext ) ) (otherlv_9= ',' ( (lv_context_10_0= ruleContext ) ) )* otherlv_11= '}' )? (otherlv_12= 'function' otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalVPAT.g:78:2: ( () otherlv_1= 'Vulnerability' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'context' otherlv_7= '{' ( (lv_context_8_0= ruleContext ) ) (otherlv_9= ',' ( (lv_context_10_0= ruleContext ) ) )* otherlv_11= '}' )? (otherlv_12= 'function' otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_19= '}' )? otherlv_20= '}' )
            // InternalVPAT.g:79:3: () otherlv_1= 'Vulnerability' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'context' otherlv_7= '{' ( (lv_context_8_0= ruleContext ) ) (otherlv_9= ',' ( (lv_context_10_0= ruleContext ) ) )* otherlv_11= '}' )? (otherlv_12= 'function' otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalVPAT.g:79:3: ()
            // InternalVPAT.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVulnerabilityAccess().getVulnerabilityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVulnerabilityAccess().getVulnerabilityKeyword_1());
            		
            // InternalVPAT.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalVPAT.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalVPAT.g:91:4: (lv_name_2_0= ruleEString )
            // InternalVPAT.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVulnerabilityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVulnerabilityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.lcis.castav.vpat.VPAT.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getVulnerabilityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalVPAT.g:113:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalVPAT.g:114:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getVulnerabilityAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalVPAT.g:118:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalVPAT.g:119:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalVPAT.g:119:5: (lv_description_5_0= ruleEString )
                    // InternalVPAT.g:120:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getVulnerabilityAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVulnerabilityRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"fr.lcis.castav.vpat.VPAT.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVPAT.g:138:3: (otherlv_6= 'context' otherlv_7= '{' ( (lv_context_8_0= ruleContext ) ) (otherlv_9= ',' ( (lv_context_10_0= ruleContext ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVPAT.g:139:4: otherlv_6= 'context' otherlv_7= '{' ( (lv_context_8_0= ruleContext ) ) (otherlv_9= ',' ( (lv_context_10_0= ruleContext ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getVulnerabilityAccess().getContextKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getVulnerabilityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalVPAT.g:147:4: ( (lv_context_8_0= ruleContext ) )
                    // InternalVPAT.g:148:5: (lv_context_8_0= ruleContext )
                    {
                    // InternalVPAT.g:148:5: (lv_context_8_0= ruleContext )
                    // InternalVPAT.g:149:6: lv_context_8_0= ruleContext
                    {

                    						newCompositeNode(grammarAccess.getVulnerabilityAccess().getContextContextParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_context_8_0=ruleContext();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVulnerabilityRule());
                    						}
                    						add(
                    							current,
                    							"context",
                    							lv_context_8_0,
                    							"fr.lcis.castav.vpat.VPAT.Context");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVPAT.g:166:4: (otherlv_9= ',' ( (lv_context_10_0= ruleContext ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalVPAT.g:167:5: otherlv_9= ',' ( (lv_context_10_0= ruleContext ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getVulnerabilityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalVPAT.g:171:5: ( (lv_context_10_0= ruleContext ) )
                    	    // InternalVPAT.g:172:6: (lv_context_10_0= ruleContext )
                    	    {
                    	    // InternalVPAT.g:172:6: (lv_context_10_0= ruleContext )
                    	    // InternalVPAT.g:173:7: lv_context_10_0= ruleContext
                    	    {

                    	    							newCompositeNode(grammarAccess.getVulnerabilityAccess().getContextContextParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_context_10_0=ruleContext();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVulnerabilityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"context",
                    	    								lv_context_10_0,
                    	    								"fr.lcis.castav.vpat.VPAT.Context");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getVulnerabilityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalVPAT.g:196:3: (otherlv_12= 'function' otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_19= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVPAT.g:197:4: otherlv_12= 'function' otherlv_13= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) ) ) otherlv_19= '}'
                    {
                    otherlv_12=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_12, grammarAccess.getVulnerabilityAccess().getFunctionKeyword_6_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_13, grammarAccess.getVulnerabilityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalVPAT.g:205:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) ) )
                    // InternalVPAT.g:206:5: ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) )
                    {
                    // InternalVPAT.g:206:5: ( ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?) )
                    // InternalVPAT.g:207:6: ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?)
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2());
                    					
                    // InternalVPAT.g:210:6: ( ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?)
                    // InternalVPAT.g:211:7: ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+ {...}?
                    {
                    // InternalVPAT.g:211:7: ( ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( LA5_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), 0) ) {
                            alt5=1;
                        }
                        else if ( LA5_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), 1) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalVPAT.g:212:5: ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) )
                    	    {
                    	    // InternalVPAT.g:212:5: ({...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) ) )
                    	    // InternalVPAT.g:213:6: {...}? => ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleVulnerability", "getUnorderedGroupHelper().canSelect(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), 0)");
                    	    }
                    	    // InternalVPAT.g:213:113: ( ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) ) )
                    	    // InternalVPAT.g:214:7: ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), 0);
                    	    						
                    	    // InternalVPAT.g:217:10: ({...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) ) )
                    	    // InternalVPAT.g:217:11: {...}? => (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleVulnerability", "true");
                    	    }
                    	    // InternalVPAT.g:217:20: (otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) ) )
                    	    // InternalVPAT.g:217:21: otherlv_15= 'main' ( (lv_mainFunction_16_0= ruleSink ) )
                    	    {
                    	    otherlv_15=(Token)match(input,18,FOLLOW_11); 

                    	    										newLeafNode(otherlv_15, grammarAccess.getVulnerabilityAccess().getMainKeyword_6_2_0_0());
                    	    									
                    	    // InternalVPAT.g:221:10: ( (lv_mainFunction_16_0= ruleSink ) )
                    	    // InternalVPAT.g:222:11: (lv_mainFunction_16_0= ruleSink )
                    	    {
                    	    // InternalVPAT.g:222:11: (lv_mainFunction_16_0= ruleSink )
                    	    // InternalVPAT.g:223:12: lv_mainFunction_16_0= ruleSink
                    	    {

                    	    												newCompositeNode(grammarAccess.getVulnerabilityAccess().getMainFunctionSinkParserRuleCall_6_2_0_1_0());
                    	    											
                    	    pushFollow(FOLLOW_12);
                    	    lv_mainFunction_16_0=ruleSink();

                    	    state._fsp--;


                    	    												if (current==null) {
                    	    													current = createModelElementForParent(grammarAccess.getVulnerabilityRule());
                    	    												}
                    	    												set(
                    	    													current,
                    	    													"mainFunction",
                    	    													lv_mainFunction_16_0,
                    	    													"fr.lcis.castav.vpat.VPAT.Sink");
                    	    												afterParserOrEnumRuleCall();
                    	    											

                    	    }


                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalVPAT.g:246:5: ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) )
                    	    {
                    	    // InternalVPAT.g:246:5: ({...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ ) )
                    	    // InternalVPAT.g:247:6: {...}? => ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleVulnerability", "getUnorderedGroupHelper().canSelect(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), 1)");
                    	    }
                    	    // InternalVPAT.g:247:113: ( ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+ )
                    	    // InternalVPAT.g:248:7: ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2(), 1);
                    	    						
                    	    // InternalVPAT.g:251:10: ({...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) ) )+
                    	    int cnt4=0;
                    	    loop4:
                    	    do {
                    	        int alt4=2;
                    	        int LA4_0 = input.LA(1);

                    	        if ( (LA4_0==15) ) {
                    	            int LA4_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt4=1;
                    	            }


                    	        }


                    	        switch (alt4) {
                    	    	case 1 :
                    	    	    // InternalVPAT.g:251:11: {...}? => (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleVulnerability", "true");
                    	    	    }
                    	    	    // InternalVPAT.g:251:20: (otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) ) )
                    	    	    // InternalVPAT.g:251:21: otherlv_17= ',' ( (lv_function_18_0= ruleFunction ) )
                    	    	    {
                    	    	    otherlv_17=(Token)match(input,15,FOLLOW_13); 

                    	    	    										newLeafNode(otherlv_17, grammarAccess.getVulnerabilityAccess().getCommaKeyword_6_2_1_0());
                    	    	    									
                    	    	    // InternalVPAT.g:255:10: ( (lv_function_18_0= ruleFunction ) )
                    	    	    // InternalVPAT.g:256:11: (lv_function_18_0= ruleFunction )
                    	    	    {
                    	    	    // InternalVPAT.g:256:11: (lv_function_18_0= ruleFunction )
                    	    	    // InternalVPAT.g:257:12: lv_function_18_0= ruleFunction
                    	    	    {

                    	    	    												newCompositeNode(grammarAccess.getVulnerabilityAccess().getFunctionFunctionParserRuleCall_6_2_1_1_0());
                    	    	    											
                    	    	    pushFollow(FOLLOW_12);
                    	    	    lv_function_18_0=ruleFunction();

                    	    	    state._fsp--;


                    	    	    												if (current==null) {
                    	    	    													current = createModelElementForParent(grammarAccess.getVulnerabilityRule());
                    	    	    												}
                    	    	    												add(
                    	    	    													current,
                    	    	    													"function",
                    	    	    													lv_function_18_0,
                    	    	    													"fr.lcis.castav.vpat.VPAT.Function");
                    	    	    												afterParserOrEnumRuleCall();
                    	    	    											

                    	    	    }


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

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2()) ) {
                        throw new FailedPredicateException(input, "ruleVulnerability", "getUnorderedGroupHelper().canLeave(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2())");
                    }

                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getVulnerabilityAccess().getUnorderedGroup_6_2());
                    					

                    }

                    otherlv_19=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_19, grammarAccess.getVulnerabilityAccess().getRightCurlyBracketKeyword_6_3());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getVulnerabilityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleVulnerability"


    // $ANTLR start "entryRuleEString"
    // InternalVPAT.g:301:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalVPAT.g:301:47: (iv_ruleEString= ruleEString EOF )
            // InternalVPAT.g:302:2: iv_ruleEString= ruleEString EOF
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
    // InternalVPAT.g:308:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalVPAT.g:314:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalVPAT.g:315:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalVPAT.g:315:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalVPAT.g:316:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVPAT.g:324:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleContext"
    // InternalVPAT.g:335:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalVPAT.g:335:48: (iv_ruleContext= ruleContext EOF )
            // InternalVPAT.g:336:2: iv_ruleContext= ruleContext EOF
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
    // InternalVPAT.g:342:1: ruleContext returns [EObject current=null] : ( ( ( (lv_Permission_0_0= 'android.permission.' ) ) ( (lv_value_1_0= rulePermission ) ) ) | ( ( (lv_Network_2_0= 'network' ) ) ( (lv_value_3_0= ruleNetwork ) ) ) | ( ( (lv_Version_4_0= 'apiversion' ) ) ( (lv_value_5_0= ruleVersion ) ) ) ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token lv_Permission_0_0=null;
        Token lv_Network_2_0=null;
        Token lv_Version_4_0=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;

        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalVPAT.g:348:2: ( ( ( ( (lv_Permission_0_0= 'android.permission.' ) ) ( (lv_value_1_0= rulePermission ) ) ) | ( ( (lv_Network_2_0= 'network' ) ) ( (lv_value_3_0= ruleNetwork ) ) ) | ( ( (lv_Version_4_0= 'apiversion' ) ) ( (lv_value_5_0= ruleVersion ) ) ) ) )
            // InternalVPAT.g:349:2: ( ( ( (lv_Permission_0_0= 'android.permission.' ) ) ( (lv_value_1_0= rulePermission ) ) ) | ( ( (lv_Network_2_0= 'network' ) ) ( (lv_value_3_0= ruleNetwork ) ) ) | ( ( (lv_Version_4_0= 'apiversion' ) ) ( (lv_value_5_0= ruleVersion ) ) ) )
            {
            // InternalVPAT.g:349:2: ( ( ( (lv_Permission_0_0= 'android.permission.' ) ) ( (lv_value_1_0= rulePermission ) ) ) | ( ( (lv_Network_2_0= 'network' ) ) ( (lv_value_3_0= ruleNetwork ) ) ) | ( ( (lv_Version_4_0= 'apiversion' ) ) ( (lv_value_5_0= ruleVersion ) ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalVPAT.g:350:3: ( ( (lv_Permission_0_0= 'android.permission.' ) ) ( (lv_value_1_0= rulePermission ) ) )
                    {
                    // InternalVPAT.g:350:3: ( ( (lv_Permission_0_0= 'android.permission.' ) ) ( (lv_value_1_0= rulePermission ) ) )
                    // InternalVPAT.g:351:4: ( (lv_Permission_0_0= 'android.permission.' ) ) ( (lv_value_1_0= rulePermission ) )
                    {
                    // InternalVPAT.g:351:4: ( (lv_Permission_0_0= 'android.permission.' ) )
                    // InternalVPAT.g:352:5: (lv_Permission_0_0= 'android.permission.' )
                    {
                    // InternalVPAT.g:352:5: (lv_Permission_0_0= 'android.permission.' )
                    // InternalVPAT.g:353:6: lv_Permission_0_0= 'android.permission.'
                    {
                    lv_Permission_0_0=(Token)match(input,19,FOLLOW_15); 

                    						newLeafNode(lv_Permission_0_0, grammarAccess.getContextAccess().getPermissionAndroidPermissionKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextRule());
                    						}
                    						setWithLastConsumed(current, "Permission", lv_Permission_0_0 != null, "android.permission.");
                    					

                    }


                    }

                    // InternalVPAT.g:365:4: ( (lv_value_1_0= rulePermission ) )
                    // InternalVPAT.g:366:5: (lv_value_1_0= rulePermission )
                    {
                    // InternalVPAT.g:366:5: (lv_value_1_0= rulePermission )
                    // InternalVPAT.g:367:6: lv_value_1_0= rulePermission
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getValuePermissionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=rulePermission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"fr.lcis.castav.vpat.VPAT.Permission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVPAT.g:386:3: ( ( (lv_Network_2_0= 'network' ) ) ( (lv_value_3_0= ruleNetwork ) ) )
                    {
                    // InternalVPAT.g:386:3: ( ( (lv_Network_2_0= 'network' ) ) ( (lv_value_3_0= ruleNetwork ) ) )
                    // InternalVPAT.g:387:4: ( (lv_Network_2_0= 'network' ) ) ( (lv_value_3_0= ruleNetwork ) )
                    {
                    // InternalVPAT.g:387:4: ( (lv_Network_2_0= 'network' ) )
                    // InternalVPAT.g:388:5: (lv_Network_2_0= 'network' )
                    {
                    // InternalVPAT.g:388:5: (lv_Network_2_0= 'network' )
                    // InternalVPAT.g:389:6: lv_Network_2_0= 'network'
                    {
                    lv_Network_2_0=(Token)match(input,20,FOLLOW_16); 

                    						newLeafNode(lv_Network_2_0, grammarAccess.getContextAccess().getNetworkNetworkKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextRule());
                    						}
                    						setWithLastConsumed(current, "Network", lv_Network_2_0 != null, "network");
                    					

                    }


                    }

                    // InternalVPAT.g:401:4: ( (lv_value_3_0= ruleNetwork ) )
                    // InternalVPAT.g:402:5: (lv_value_3_0= ruleNetwork )
                    {
                    // InternalVPAT.g:402:5: (lv_value_3_0= ruleNetwork )
                    // InternalVPAT.g:403:6: lv_value_3_0= ruleNetwork
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getValueNetworkParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleNetwork();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"fr.lcis.castav.vpat.VPAT.Network");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVPAT.g:422:3: ( ( (lv_Version_4_0= 'apiversion' ) ) ( (lv_value_5_0= ruleVersion ) ) )
                    {
                    // InternalVPAT.g:422:3: ( ( (lv_Version_4_0= 'apiversion' ) ) ( (lv_value_5_0= ruleVersion ) ) )
                    // InternalVPAT.g:423:4: ( (lv_Version_4_0= 'apiversion' ) ) ( (lv_value_5_0= ruleVersion ) )
                    {
                    // InternalVPAT.g:423:4: ( (lv_Version_4_0= 'apiversion' ) )
                    // InternalVPAT.g:424:5: (lv_Version_4_0= 'apiversion' )
                    {
                    // InternalVPAT.g:424:5: (lv_Version_4_0= 'apiversion' )
                    // InternalVPAT.g:425:6: lv_Version_4_0= 'apiversion'
                    {
                    lv_Version_4_0=(Token)match(input,21,FOLLOW_17); 

                    						newLeafNode(lv_Version_4_0, grammarAccess.getContextAccess().getVersionApiversionKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextRule());
                    						}
                    						setWithLastConsumed(current, "Version", lv_Version_4_0 != null, "apiversion");
                    					

                    }


                    }

                    // InternalVPAT.g:437:4: ( (lv_value_5_0= ruleVersion ) )
                    // InternalVPAT.g:438:5: (lv_value_5_0= ruleVersion )
                    {
                    // InternalVPAT.g:438:5: (lv_value_5_0= ruleVersion )
                    // InternalVPAT.g:439:6: lv_value_5_0= ruleVersion
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getValueVersionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleVersion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_5_0,
                    							"fr.lcis.castav.vpat.VPAT.Version");
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
    // $ANTLR end "ruleContext"


    // $ANTLR start "entryRuleVersion"
    // InternalVPAT.g:461:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalVPAT.g:461:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalVPAT.g:462:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalVPAT.g:468:1: ruleVersion returns [EObject current=null] : ( (lv_name_0_0= RULE_STRING ) ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalVPAT.g:474:2: ( ( (lv_name_0_0= RULE_STRING ) ) )
            // InternalVPAT.g:475:2: ( (lv_name_0_0= RULE_STRING ) )
            {
            // InternalVPAT.g:475:2: ( (lv_name_0_0= RULE_STRING ) )
            // InternalVPAT.g:476:3: (lv_name_0_0= RULE_STRING )
            {
            // InternalVPAT.g:476:3: (lv_name_0_0= RULE_STRING )
            // InternalVPAT.g:477:4: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getVersionAccess().getNameSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVersionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRulePermission"
    // InternalVPAT.g:496:1: entryRulePermission returns [EObject current=null] : iv_rulePermission= rulePermission EOF ;
    public final EObject entryRulePermission() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePermission = null;


        try {
            // InternalVPAT.g:496:51: (iv_rulePermission= rulePermission EOF )
            // InternalVPAT.g:497:2: iv_rulePermission= rulePermission EOF
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
    // InternalVPAT.g:503:1: rulePermission returns [EObject current=null] : ( () ( (lv_name_1_0= rulepermissionID ) ) ) ;
    public final EObject rulePermission() throws RecognitionException {
        EObject current = null;

        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalVPAT.g:509:2: ( ( () ( (lv_name_1_0= rulepermissionID ) ) ) )
            // InternalVPAT.g:510:2: ( () ( (lv_name_1_0= rulepermissionID ) ) )
            {
            // InternalVPAT.g:510:2: ( () ( (lv_name_1_0= rulepermissionID ) ) )
            // InternalVPAT.g:511:3: () ( (lv_name_1_0= rulepermissionID ) )
            {
            // InternalVPAT.g:511:3: ()
            // InternalVPAT.g:512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPermissionAccess().getPermissionAction_0(),
            					current);
            			

            }

            // InternalVPAT.g:518:3: ( (lv_name_1_0= rulepermissionID ) )
            // InternalVPAT.g:519:4: (lv_name_1_0= rulepermissionID )
            {
            // InternalVPAT.g:519:4: (lv_name_1_0= rulepermissionID )
            // InternalVPAT.g:520:5: lv_name_1_0= rulepermissionID
            {

            					newCompositeNode(grammarAccess.getPermissionAccess().getNamePermissionIDParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=rulepermissionID();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPermissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.lcis.castav.vpat.VPAT.permissionID");
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
    // $ANTLR end "rulePermission"


    // $ANTLR start "entryRulepermissionID"
    // InternalVPAT.g:541:1: entryRulepermissionID returns [EObject current=null] : iv_rulepermissionID= rulepermissionID EOF ;
    public final EObject entryRulepermissionID() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepermissionID = null;


        try {
            // InternalVPAT.g:541:53: (iv_rulepermissionID= rulepermissionID EOF )
            // InternalVPAT.g:542:2: iv_rulepermissionID= rulepermissionID EOF
            {
             newCompositeNode(grammarAccess.getPermissionIDRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepermissionID=rulepermissionID();

            state._fsp--;

             current =iv_rulepermissionID; 
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
    // $ANTLR end "entryRulepermissionID"


    // $ANTLR start "rulepermissionID"
    // InternalVPAT.g:548:1: rulepermissionID returns [EObject current=null] : ( ( (lv_name_0_0= 'ACCESS_MEDIA_LOCATION' ) ) | ( (lv_name_1_0= 'ACCESS_NETWORK_STATE' ) ) | ( (lv_name_2_0= 'ACCESS_WIFI_STATE' ) ) | ( (lv_name_3_0= 'INTERNET' ) ) ) ;
    public final EObject rulepermissionID() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_name_1_0=null;
        Token lv_name_2_0=null;
        Token lv_name_3_0=null;


        	enterRule();

        try {
            // InternalVPAT.g:554:2: ( ( ( (lv_name_0_0= 'ACCESS_MEDIA_LOCATION' ) ) | ( (lv_name_1_0= 'ACCESS_NETWORK_STATE' ) ) | ( (lv_name_2_0= 'ACCESS_WIFI_STATE' ) ) | ( (lv_name_3_0= 'INTERNET' ) ) ) )
            // InternalVPAT.g:555:2: ( ( (lv_name_0_0= 'ACCESS_MEDIA_LOCATION' ) ) | ( (lv_name_1_0= 'ACCESS_NETWORK_STATE' ) ) | ( (lv_name_2_0= 'ACCESS_WIFI_STATE' ) ) | ( (lv_name_3_0= 'INTERNET' ) ) )
            {
            // InternalVPAT.g:555:2: ( ( (lv_name_0_0= 'ACCESS_MEDIA_LOCATION' ) ) | ( (lv_name_1_0= 'ACCESS_NETWORK_STATE' ) ) | ( (lv_name_2_0= 'ACCESS_WIFI_STATE' ) ) | ( (lv_name_3_0= 'INTERNET' ) ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt9=1;
                }
                break;
            case 23:
                {
                alt9=2;
                }
                break;
            case 24:
                {
                alt9=3;
                }
                break;
            case 25:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalVPAT.g:556:3: ( (lv_name_0_0= 'ACCESS_MEDIA_LOCATION' ) )
                    {
                    // InternalVPAT.g:556:3: ( (lv_name_0_0= 'ACCESS_MEDIA_LOCATION' ) )
                    // InternalVPAT.g:557:4: (lv_name_0_0= 'ACCESS_MEDIA_LOCATION' )
                    {
                    // InternalVPAT.g:557:4: (lv_name_0_0= 'ACCESS_MEDIA_LOCATION' )
                    // InternalVPAT.g:558:5: lv_name_0_0= 'ACCESS_MEDIA_LOCATION'
                    {
                    lv_name_0_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_name_0_0, grammarAccess.getPermissionIDAccess().getNameACCESS_MEDIA_LOCATIONKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPermissionIDRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_0_0, "ACCESS_MEDIA_LOCATION");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVPAT.g:571:3: ( (lv_name_1_0= 'ACCESS_NETWORK_STATE' ) )
                    {
                    // InternalVPAT.g:571:3: ( (lv_name_1_0= 'ACCESS_NETWORK_STATE' ) )
                    // InternalVPAT.g:572:4: (lv_name_1_0= 'ACCESS_NETWORK_STATE' )
                    {
                    // InternalVPAT.g:572:4: (lv_name_1_0= 'ACCESS_NETWORK_STATE' )
                    // InternalVPAT.g:573:5: lv_name_1_0= 'ACCESS_NETWORK_STATE'
                    {
                    lv_name_1_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getPermissionIDAccess().getNameACCESS_NETWORK_STATEKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPermissionIDRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_1_0, "ACCESS_NETWORK_STATE");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVPAT.g:586:3: ( (lv_name_2_0= 'ACCESS_WIFI_STATE' ) )
                    {
                    // InternalVPAT.g:586:3: ( (lv_name_2_0= 'ACCESS_WIFI_STATE' ) )
                    // InternalVPAT.g:587:4: (lv_name_2_0= 'ACCESS_WIFI_STATE' )
                    {
                    // InternalVPAT.g:587:4: (lv_name_2_0= 'ACCESS_WIFI_STATE' )
                    // InternalVPAT.g:588:5: lv_name_2_0= 'ACCESS_WIFI_STATE'
                    {
                    lv_name_2_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_name_2_0, grammarAccess.getPermissionIDAccess().getNameACCESS_WIFI_STATEKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPermissionIDRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_2_0, "ACCESS_WIFI_STATE");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVPAT.g:601:3: ( (lv_name_3_0= 'INTERNET' ) )
                    {
                    // InternalVPAT.g:601:3: ( (lv_name_3_0= 'INTERNET' ) )
                    // InternalVPAT.g:602:4: (lv_name_3_0= 'INTERNET' )
                    {
                    // InternalVPAT.g:602:4: (lv_name_3_0= 'INTERNET' )
                    // InternalVPAT.g:603:5: lv_name_3_0= 'INTERNET'
                    {
                    lv_name_3_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_name_3_0, grammarAccess.getPermissionIDAccess().getNameINTERNETKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPermissionIDRule());
                    					}
                    					setWithLastConsumed(current, "name", lv_name_3_0, "INTERNET");
                    				

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
    // $ANTLR end "rulepermissionID"


    // $ANTLR start "entryRuleNetwork"
    // InternalVPAT.g:619:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalVPAT.g:619:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalVPAT.g:620:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalVPAT.g:626:1: ruleNetwork returns [EObject current=null] : ( () otherlv_1= 'default' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVPAT.g:632:2: ( ( () otherlv_1= 'default' ) )
            // InternalVPAT.g:633:2: ( () otherlv_1= 'default' )
            {
            // InternalVPAT.g:633:2: ( () otherlv_1= 'default' )
            // InternalVPAT.g:634:3: () otherlv_1= 'default'
            {
            // InternalVPAT.g:634:3: ()
            // InternalVPAT.g:635:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNetworkAccess().getNetworkAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNetworkAccess().getDefaultKeyword_1());
            		

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleFunction"
    // InternalVPAT.g:649:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalVPAT.g:649:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalVPAT.g:650:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
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
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalVPAT.g:656:1: ruleFunction returns [EObject current=null] : (this_Sink_0= ruleSink | this_Inflow_1= ruleInflow ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        EObject this_Sink_0 = null;

        EObject this_Inflow_1 = null;



        	enterRule();

        try {
            // InternalVPAT.g:662:2: ( (this_Sink_0= ruleSink | this_Inflow_1= ruleInflow ) )
            // InternalVPAT.g:663:2: (this_Sink_0= ruleSink | this_Inflow_1= ruleInflow )
            {
            // InternalVPAT.g:663:2: (this_Sink_0= ruleSink | this_Inflow_1= ruleInflow )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=31 && LA10_0<=32)) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalVPAT.g:664:3: this_Sink_0= ruleSink
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getSinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sink_0=ruleSink();

                    state._fsp--;


                    			current = this_Sink_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVPAT.g:673:3: this_Inflow_1= ruleInflow
                    {

                    			newCompositeNode(grammarAccess.getFunctionAccess().getInflowParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Inflow_1=ruleInflow();

                    state._fsp--;


                    			current = this_Inflow_1;
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
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleSink"
    // InternalVPAT.g:685:1: entryRuleSink returns [EObject current=null] : iv_ruleSink= ruleSink EOF ;
    public final EObject entryRuleSink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSink = null;


        try {
            // InternalVPAT.g:685:45: (iv_ruleSink= ruleSink EOF )
            // InternalVPAT.g:686:2: iv_ruleSink= ruleSink EOF
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
    // InternalVPAT.g:692:1: ruleSink returns [EObject current=null] : (otherlv_0= 'Sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'parameter' otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleSink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameter_5_0 = null;

        EObject lv_parameter_7_0 = null;



        	enterRule();

        try {
            // InternalVPAT.g:698:2: ( (otherlv_0= 'Sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'parameter' otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalVPAT.g:699:2: (otherlv_0= 'Sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'parameter' otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalVPAT.g:699:2: (otherlv_0= 'Sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'parameter' otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalVPAT.g:700:3: otherlv_0= 'Sink' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'parameter' otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSinkAccess().getSinkKeyword_0());
            		
            // InternalVPAT.g:704:3: ( (lv_name_1_0= ruleEString ) )
            // InternalVPAT.g:705:4: (lv_name_1_0= ruleEString )
            {
            // InternalVPAT.g:705:4: (lv_name_1_0= ruleEString )
            // InternalVPAT.g:706:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSinkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSinkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"fr.lcis.castav.vpat.VPAT.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalVPAT.g:727:3: (otherlv_3= 'parameter' otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVPAT.g:728:4: otherlv_3= 'parameter' otherlv_4= '{' ( (lv_parameter_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getSinkAccess().getParameterKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getSinkAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalVPAT.g:736:4: ( (lv_parameter_5_0= ruleParameter ) )
                    // InternalVPAT.g:737:5: (lv_parameter_5_0= ruleParameter )
                    {
                    // InternalVPAT.g:737:5: (lv_parameter_5_0= ruleParameter )
                    // InternalVPAT.g:738:6: lv_parameter_5_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getSinkAccess().getParameterParameterParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameter_5_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSinkRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_5_0,
                    							"fr.lcis.castav.vpat.VPAT.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalVPAT.g:755:4: (otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalVPAT.g:756:5: otherlv_6= ',' ( (lv_parameter_7_0= ruleParameter ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_19); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getSinkAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalVPAT.g:760:5: ( (lv_parameter_7_0= ruleParameter ) )
                    	    // InternalVPAT.g:761:6: (lv_parameter_7_0= ruleParameter )
                    	    {
                    	    // InternalVPAT.g:761:6: (lv_parameter_7_0= ruleParameter )
                    	    // InternalVPAT.g:762:7: lv_parameter_7_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getSinkAccess().getParameterParameterParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameter_7_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSinkRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_7_0,
                    	    								"fr.lcis.castav.vpat.VPAT.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FOLLOW_14); 

                    				newLeafNode(otherlv_8, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSinkAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalVPAT.g:793:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalVPAT.g:793:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalVPAT.g:794:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalVPAT.g:800:1: ruleParameter returns [EObject current=null] : ( ( ( ruleFQN ) ) | ( ( (lv_static_1_0= 'static' ) ) ( ( (lv_anyValue_2_0= '*' ) ) | ( (lv_value_3_0= ruleEString ) ) ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_anyValue_2_0=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalVPAT.g:806:2: ( ( ( ( ruleFQN ) ) | ( ( (lv_static_1_0= 'static' ) ) ( ( (lv_anyValue_2_0= '*' ) ) | ( (lv_value_3_0= ruleEString ) ) ) ) ) )
            // InternalVPAT.g:807:2: ( ( ( ruleFQN ) ) | ( ( (lv_static_1_0= 'static' ) ) ( ( (lv_anyValue_2_0= '*' ) ) | ( (lv_value_3_0= ruleEString ) ) ) ) )
            {
            // InternalVPAT.g:807:2: ( ( ( ruleFQN ) ) | ( ( (lv_static_1_0= 'static' ) ) ( ( (lv_anyValue_2_0= '*' ) ) | ( (lv_value_3_0= ruleEString ) ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_ID)) ) {
                alt14=1;
            }
            else if ( (LA14_0==29) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalVPAT.g:808:3: ( ( ruleFQN ) )
                    {
                    // InternalVPAT.g:808:3: ( ( ruleFQN ) )
                    // InternalVPAT.g:809:4: ( ruleFQN )
                    {
                    // InternalVPAT.g:809:4: ( ruleFQN )
                    // InternalVPAT.g:810:5: ruleFQN
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getParameterAccess().getOriginFunctionCrossReference_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    ruleFQN();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVPAT.g:825:3: ( ( (lv_static_1_0= 'static' ) ) ( ( (lv_anyValue_2_0= '*' ) ) | ( (lv_value_3_0= ruleEString ) ) ) )
                    {
                    // InternalVPAT.g:825:3: ( ( (lv_static_1_0= 'static' ) ) ( ( (lv_anyValue_2_0= '*' ) ) | ( (lv_value_3_0= ruleEString ) ) ) )
                    // InternalVPAT.g:826:4: ( (lv_static_1_0= 'static' ) ) ( ( (lv_anyValue_2_0= '*' ) ) | ( (lv_value_3_0= ruleEString ) ) )
                    {
                    // InternalVPAT.g:826:4: ( (lv_static_1_0= 'static' ) )
                    // InternalVPAT.g:827:5: (lv_static_1_0= 'static' )
                    {
                    // InternalVPAT.g:827:5: (lv_static_1_0= 'static' )
                    // InternalVPAT.g:828:6: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,29,FOLLOW_20); 

                    						newLeafNode(lv_static_1_0, grammarAccess.getParameterAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParameterRule());
                    						}
                    						setWithLastConsumed(current, "static", lv_static_1_0 != null, "static");
                    					

                    }


                    }

                    // InternalVPAT.g:840:4: ( ( (lv_anyValue_2_0= '*' ) ) | ( (lv_value_3_0= ruleEString ) ) )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==30) ) {
                        alt13=1;
                    }
                    else if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalVPAT.g:841:5: ( (lv_anyValue_2_0= '*' ) )
                            {
                            // InternalVPAT.g:841:5: ( (lv_anyValue_2_0= '*' ) )
                            // InternalVPAT.g:842:6: (lv_anyValue_2_0= '*' )
                            {
                            // InternalVPAT.g:842:6: (lv_anyValue_2_0= '*' )
                            // InternalVPAT.g:843:7: lv_anyValue_2_0= '*'
                            {
                            lv_anyValue_2_0=(Token)match(input,30,FOLLOW_2); 

                            							newLeafNode(lv_anyValue_2_0, grammarAccess.getParameterAccess().getAnyValueAsteriskKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getParameterRule());
                            							}
                            							setWithLastConsumed(current, "anyValue", lv_anyValue_2_0 != null, "*");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalVPAT.g:856:5: ( (lv_value_3_0= ruleEString ) )
                            {
                            // InternalVPAT.g:856:5: ( (lv_value_3_0= ruleEString ) )
                            // InternalVPAT.g:857:6: (lv_value_3_0= ruleEString )
                            {
                            // InternalVPAT.g:857:6: (lv_value_3_0= ruleEString )
                            // InternalVPAT.g:858:7: lv_value_3_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getParameterAccess().getValueEStringParserRuleCall_1_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_3_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParameterRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_3_0,
                            								"fr.lcis.castav.vpat.VPAT.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

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


    // $ANTLR start "entryRuleInflow"
    // InternalVPAT.g:881:1: entryRuleInflow returns [EObject current=null] : iv_ruleInflow= ruleInflow EOF ;
    public final EObject entryRuleInflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInflow = null;


        try {
            // InternalVPAT.g:881:47: (iv_ruleInflow= ruleInflow EOF )
            // InternalVPAT.g:882:2: iv_ruleInflow= ruleInflow EOF
            {
             newCompositeNode(grammarAccess.getInflowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInflow=ruleInflow();

            state._fsp--;

             current =iv_ruleInflow; 
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
    // $ANTLR end "entryRuleInflow"


    // $ANTLR start "ruleInflow"
    // InternalVPAT.g:888:1: ruleInflow returns [EObject current=null] : (this_Source_0= ruleSource | this_Input_1= ruleInput ) ;
    public final EObject ruleInflow() throws RecognitionException {
        EObject current = null;

        EObject this_Source_0 = null;

        EObject this_Input_1 = null;



        	enterRule();

        try {
            // InternalVPAT.g:894:2: ( (this_Source_0= ruleSource | this_Input_1= ruleInput ) )
            // InternalVPAT.g:895:2: (this_Source_0= ruleSource | this_Input_1= ruleInput )
            {
            // InternalVPAT.g:895:2: (this_Source_0= ruleSource | this_Input_1= ruleInput )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            else if ( (LA15_0==32) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalVPAT.g:896:3: this_Source_0= ruleSource
                    {

                    			newCompositeNode(grammarAccess.getInflowAccess().getSourceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Source_0=ruleSource();

                    state._fsp--;


                    			current = this_Source_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVPAT.g:905:3: this_Input_1= ruleInput
                    {

                    			newCompositeNode(grammarAccess.getInflowAccess().getInputParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Input_1=ruleInput();

                    state._fsp--;


                    			current = this_Input_1;
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
    // $ANTLR end "ruleInflow"


    // $ANTLR start "entryRuleSource"
    // InternalVPAT.g:917:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // InternalVPAT.g:917:47: (iv_ruleSource= ruleSource EOF )
            // InternalVPAT.g:918:2: iv_ruleSource= ruleSource EOF
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
    // InternalVPAT.g:924:1: ruleSource returns [EObject current=null] : ( () otherlv_1= 'Source' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_anyPrivate_3_0= '*' ) ) | ( (lv_method_4_0= ruleEString ) ) ) ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_anyPrivate_3_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_method_4_0 = null;



        	enterRule();

        try {
            // InternalVPAT.g:930:2: ( ( () otherlv_1= 'Source' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_anyPrivate_3_0= '*' ) ) | ( (lv_method_4_0= ruleEString ) ) ) ) )
            // InternalVPAT.g:931:2: ( () otherlv_1= 'Source' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_anyPrivate_3_0= '*' ) ) | ( (lv_method_4_0= ruleEString ) ) ) )
            {
            // InternalVPAT.g:931:2: ( () otherlv_1= 'Source' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_anyPrivate_3_0= '*' ) ) | ( (lv_method_4_0= ruleEString ) ) ) )
            // InternalVPAT.g:932:3: () otherlv_1= 'Source' ( (lv_name_2_0= ruleEString ) ) ( ( (lv_anyPrivate_3_0= '*' ) ) | ( (lv_method_4_0= ruleEString ) ) )
            {
            // InternalVPAT.g:932:3: ()
            // InternalVPAT.g:933:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSourceAccess().getSourceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSourceAccess().getSourceKeyword_1());
            		
            // InternalVPAT.g:943:3: ( (lv_name_2_0= ruleEString ) )
            // InternalVPAT.g:944:4: (lv_name_2_0= ruleEString )
            {
            // InternalVPAT.g:944:4: (lv_name_2_0= ruleEString )
            // InternalVPAT.g:945:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSourceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.lcis.castav.vpat.VPAT.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVPAT.g:962:3: ( ( (lv_anyPrivate_3_0= '*' ) ) | ( (lv_method_4_0= ruleEString ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=RULE_STRING && LA16_0<=RULE_ID)) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalVPAT.g:963:4: ( (lv_anyPrivate_3_0= '*' ) )
                    {
                    // InternalVPAT.g:963:4: ( (lv_anyPrivate_3_0= '*' ) )
                    // InternalVPAT.g:964:5: (lv_anyPrivate_3_0= '*' )
                    {
                    // InternalVPAT.g:964:5: (lv_anyPrivate_3_0= '*' )
                    // InternalVPAT.g:965:6: lv_anyPrivate_3_0= '*'
                    {
                    lv_anyPrivate_3_0=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_anyPrivate_3_0, grammarAccess.getSourceAccess().getAnyPrivateAsteriskKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSourceRule());
                    						}
                    						setWithLastConsumed(current, "anyPrivate", lv_anyPrivate_3_0 != null, "*");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVPAT.g:978:4: ( (lv_method_4_0= ruleEString ) )
                    {
                    // InternalVPAT.g:978:4: ( (lv_method_4_0= ruleEString ) )
                    // InternalVPAT.g:979:5: (lv_method_4_0= ruleEString )
                    {
                    // InternalVPAT.g:979:5: (lv_method_4_0= ruleEString )
                    // InternalVPAT.g:980:6: lv_method_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getSourceAccess().getMethodEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_method_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSourceRule());
                    						}
                    						set(
                    							current,
                    							"method",
                    							lv_method_4_0,
                    							"fr.lcis.castav.vpat.VPAT.EString");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleInput"
    // InternalVPAT.g:1002:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalVPAT.g:1002:46: (iv_ruleInput= ruleInput EOF )
            // InternalVPAT.g:1003:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalVPAT.g:1009:1: ruleInput returns [EObject current=null] : ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) ( (lv_method_3_0= ruleEString ) ) ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_method_3_0 = null;



        	enterRule();

        try {
            // InternalVPAT.g:1015:2: ( ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) ( (lv_method_3_0= ruleEString ) ) ) )
            // InternalVPAT.g:1016:2: ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) ( (lv_method_3_0= ruleEString ) ) )
            {
            // InternalVPAT.g:1016:2: ( () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) ( (lv_method_3_0= ruleEString ) ) )
            // InternalVPAT.g:1017:3: () otherlv_1= 'Input' ( (lv_name_2_0= ruleEString ) ) ( (lv_method_3_0= ruleEString ) )
            {
            // InternalVPAT.g:1017:3: ()
            // InternalVPAT.g:1018:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInputAccess().getInputAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInputAccess().getInputKeyword_1());
            		
            // InternalVPAT.g:1028:3: ( (lv_name_2_0= ruleEString ) )
            // InternalVPAT.g:1029:4: (lv_name_2_0= ruleEString )
            {
            // InternalVPAT.g:1029:4: (lv_name_2_0= ruleEString )
            // InternalVPAT.g:1030:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"fr.lcis.castav.vpat.VPAT.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVPAT.g:1047:3: ( (lv_method_3_0= ruleEString ) )
            // InternalVPAT.g:1048:4: (lv_method_3_0= ruleEString )
            {
            // InternalVPAT.g:1048:4: (lv_method_3_0= ruleEString )
            // InternalVPAT.g:1049:5: lv_method_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInputAccess().getMethodEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_method_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInputRule());
            					}
            					set(
            						current,
            						"method",
            						lv_method_3_0,
            						"fr.lcis.castav.vpat.VPAT.EString");
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleFQN"
    // InternalVPAT.g:1070:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalVPAT.g:1072:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalVPAT.g:1073:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalVPAT.g:1082:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_EString_0 = null;

        AntlrDatatypeRuleToken this_EString_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalVPAT.g:1089:2: ( (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* ) )
            // InternalVPAT.g:1090:2: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            {
            // InternalVPAT.g:1090:2: (this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )* )
            // InternalVPAT.g:1091:3: this_EString_0= ruleEString (kw= '.' this_EString_2= ruleEString )*
            {

            			newCompositeNode(grammarAccess.getFQNAccess().getEStringParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_EString_0=ruleEString();

            state._fsp--;


            			current.merge(this_EString_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalVPAT.g:1101:3: (kw= '.' this_EString_2= ruleEString )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalVPAT.g:1102:4: kw= '.' this_EString_2= ruleEString
            	    {
            	    kw=(Token)match(input,33,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			

            	    				newCompositeNode(grammarAccess.getFQNAccess().getEStringParserRuleCall_1_1());
            	    			
            	    pushFollow(FOLLOW_21);
            	    this_EString_2=ruleEString();

            	    state._fsp--;


            	    				current.merge(this_EString_2);
            	    			

            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop17;
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000036000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000034000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000188000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});

}
