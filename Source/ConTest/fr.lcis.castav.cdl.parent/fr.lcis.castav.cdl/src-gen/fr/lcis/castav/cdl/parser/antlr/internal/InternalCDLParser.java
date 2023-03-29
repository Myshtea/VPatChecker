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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'contextModel'", "'{'", "'}'", "'static'", "'context'", "'derives'", "','", "'providers'", "':'", "'['", "']'", "'properties'", "'mappings'", "'->'", "'type'", "'string'", "'integer'", "'boolean'", "'double'", "'situation'", "'<'", "'>'", "'>='", "'<='", "'=='", "'!='", "'and'", "'or'", "'.'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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


        public InternalCDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCDL.g"; }



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




    // $ANTLR start "entryRuleContextModel"
    // InternalCDL.g:64:1: entryRuleContextModel returns [EObject current=null] : iv_ruleContextModel= ruleContextModel EOF ;
    public final EObject entryRuleContextModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModel = null;


        try {
            // InternalCDL.g:64:53: (iv_ruleContextModel= ruleContextModel EOF )
            // InternalCDL.g:65:2: iv_ruleContextModel= ruleContextModel EOF
            {
             newCompositeNode(grammarAccess.getContextModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextModel=ruleContextModel();

            state._fsp--;

             current =iv_ruleContextModel; 
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
    // $ANTLR end "entryRuleContextModel"


    // $ANTLR start "ruleContextModel"
    // InternalCDL.g:71:1: ruleContextModel returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleContextModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_8=null;
        EObject lv_Contexts_4_0 = null;

        EObject lv_Providers_5_0 = null;

        EObject lv_Situations_6_0 = null;

        EObject lv_Types_7_0 = null;



        	enterRule();

        try {
            // InternalCDL.g:77:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?) ) ) )
            // InternalCDL.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            {
            // InternalCDL.g:78:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?) ) )
            // InternalCDL.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?) )
            {
            // InternalCDL.g:79:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?) )
            // InternalCDL.g:80:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getContextModelAccess().getUnorderedGroup());
            			
            // InternalCDL.g:83:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?)
            // InternalCDL.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+ {...}?
            {
            // InternalCDL.g:84:5: ( ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                int LA5_0 = input.LA(1);

                if ( LA5_0 == 11 && getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 0) ) {
                    alt5=1;
                }
                else if ( LA5_0 == 18 && getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 1) ) {
                    alt5=2;
                }
                else if ( LA5_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 2) ) {
                    alt5=3;
                }
                else if ( ( LA5_0 == 13 || LA5_0 == 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 3) ) {
                    alt5=4;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCDL.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) )
            	    {
            	    // InternalCDL.g:85:3: ({...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) ) )
            	    // InternalCDL.g:86:4: {...}? => ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContextModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalCDL.g:86:106: ( ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) ) )
            	    // InternalCDL.g:87:5: ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getContextModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalCDL.g:90:8: ({...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* ) )
            	    // InternalCDL.g:90:9: {...}? => (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContextModel", "true");
            	    }
            	    // InternalCDL.g:90:18: (otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )* )
            	    // InternalCDL.g:90:19: otherlv_1= 'contextModel' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_Contexts_4_0= ruleContext ) )*
            	    {
            	    otherlv_1=(Token)match(input,11,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getContextModelAccess().getContextModelKeyword_0_0());
            	    							
            	    // InternalCDL.g:94:8: ( (lv_name_2_0= RULE_ID ) )
            	    // InternalCDL.g:95:9: (lv_name_2_0= RULE_ID )
            	    {
            	    // InternalCDL.g:95:9: (lv_name_2_0= RULE_ID )
            	    // InternalCDL.g:96:10: lv_name_2_0= RULE_ID
            	    {
            	    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            	    										newLeafNode(lv_name_2_0, grammarAccess.getContextModelAccess().getNameIDTerminalRuleCall_0_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getContextModelRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"name",
            	    											lv_name_2_0,
            	    											"org.eclipse.xtext.common.Terminals.ID");
            	    									

            	    }


            	    }

            	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

            	    								newLeafNode(otherlv_3, grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_0_2());
            	    							
            	    // InternalCDL.g:116:8: ( (lv_Contexts_4_0= ruleContext ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( ((LA1_0>=14 && LA1_0<=15)) ) {
            	            alt1=1;
            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalCDL.g:117:9: (lv_Contexts_4_0= ruleContext )
            	    	    {
            	    	    // InternalCDL.g:117:9: (lv_Contexts_4_0= ruleContext )
            	    	    // InternalCDL.g:118:10: lv_Contexts_4_0= ruleContext
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getContextModelAccess().getContextsContextParserRuleCall_0_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_Contexts_4_0=ruleContext();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"Contexts",
            	    	    											lv_Contexts_4_0,
            	    	    											"fr.lcis.castav.cdl.CDL.Context");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContextModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalCDL.g:141:3: ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) )
            	    {
            	    // InternalCDL.g:141:3: ({...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ ) )
            	    // InternalCDL.g:142:4: {...}? => ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContextModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalCDL.g:142:106: ( ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+ )
            	    // InternalCDL.g:143:5: ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getContextModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalCDL.g:146:8: ({...}? => ( (lv_Providers_5_0= ruleProviders ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==18) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalCDL.g:146:9: {...}? => ( (lv_Providers_5_0= ruleProviders ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContextModel", "true");
            	    	    }
            	    	    // InternalCDL.g:146:18: ( (lv_Providers_5_0= ruleProviders ) )
            	    	    // InternalCDL.g:146:19: (lv_Providers_5_0= ruleProviders )
            	    	    {
            	    	    // InternalCDL.g:146:19: (lv_Providers_5_0= ruleProviders )
            	    	    // InternalCDL.g:147:9: lv_Providers_5_0= ruleProviders
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getContextModelAccess().getProvidersProvidersParserRuleCall_1_0());
            	    	    								
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_Providers_5_0=ruleProviders();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"Providers",
            	    	    										lv_Providers_5_0,
            	    	    										"fr.lcis.castav.cdl.CDL.Providers");
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

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContextModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalCDL.g:169:3: ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) )
            	    {
            	    // InternalCDL.g:169:3: ({...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ ) )
            	    // InternalCDL.g:170:4: {...}? => ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContextModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalCDL.g:170:106: ( ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+ )
            	    // InternalCDL.g:171:5: ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getContextModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalCDL.g:174:8: ({...}? => ( (lv_Situations_6_0= ruleSituation ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==30) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalCDL.g:174:9: {...}? => ( (lv_Situations_6_0= ruleSituation ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContextModel", "true");
            	    	    }
            	    	    // InternalCDL.g:174:18: ( (lv_Situations_6_0= ruleSituation ) )
            	    	    // InternalCDL.g:174:19: (lv_Situations_6_0= ruleSituation )
            	    	    {
            	    	    // InternalCDL.g:174:19: (lv_Situations_6_0= ruleSituation )
            	    	    // InternalCDL.g:175:9: lv_Situations_6_0= ruleSituation
            	    	    {

            	    	    									newCompositeNode(grammarAccess.getContextModelAccess().getSituationsSituationParserRuleCall_2_0());
            	    	    								
            	    	    pushFollow(FOLLOW_6);
            	    	    lv_Situations_6_0=ruleSituation();

            	    	    state._fsp--;


            	    	    									if (current==null) {
            	    	    										current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    	    									}
            	    	    									add(
            	    	    										current,
            	    	    										"Situations",
            	    	    										lv_Situations_6_0,
            	    	    										"fr.lcis.castav.cdl.CDL.Situation");
            	    	    									afterParserOrEnumRuleCall();
            	    	    								

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContextModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalCDL.g:197:3: ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) )
            	    {
            	    // InternalCDL.g:197:3: ({...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) ) )
            	    // InternalCDL.g:198:4: {...}? => ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContextModel", "getUnorderedGroupHelper().canSelect(grammarAccess.getContextModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalCDL.g:198:106: ( ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) ) )
            	    // InternalCDL.g:199:5: ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getContextModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalCDL.g:202:8: ({...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' ) )
            	    // InternalCDL.g:202:9: {...}? => ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContextModel", "true");
            	    }
            	    // InternalCDL.g:202:18: ( ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}' )
            	    // InternalCDL.g:202:19: ( (lv_Types_7_0= ruleDefinedType ) )* otherlv_8= '}'
            	    {
            	    // InternalCDL.g:202:19: ( (lv_Types_7_0= ruleDefinedType ) )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==25) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalCDL.g:203:9: (lv_Types_7_0= ruleDefinedType )
            	    	    {
            	    	    // InternalCDL.g:203:9: (lv_Types_7_0= ruleDefinedType )
            	    	    // InternalCDL.g:204:10: lv_Types_7_0= ruleDefinedType
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getContextModelAccess().getTypesDefinedTypeParserRuleCall_3_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_7);
            	    	    lv_Types_7_0=ruleDefinedType();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"Types",
            	    	    											lv_Types_7_0,
            	    	    											"fr.lcis.castav.cdl.CDL.DefinedType");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);

            	    otherlv_8=(Token)match(input,13,FOLLOW_6); 

            	    								newLeafNode(otherlv_8, grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_3_1());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContextModelAccess().getUnorderedGroup());
            	    				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getContextModelAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleContextModel", "getUnorderedGroupHelper().canLeave(grammarAccess.getContextModelAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getContextModelAccess().getUnorderedGroup());
            			

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
    // $ANTLR end "ruleContextModel"


    // $ANTLR start "entryRuleContext"
    // InternalCDL.g:242:1: entryRuleContext returns [EObject current=null] : iv_ruleContext= ruleContext EOF ;
    public final EObject entryRuleContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContext = null;


        try {
            // InternalCDL.g:242:48: (iv_ruleContext= ruleContext EOF )
            // InternalCDL.g:243:2: iv_ruleContext= ruleContext EOF
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
    // InternalCDL.g:249:1: ruleContext returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_derived_3_0= 'derives' ) ) ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'providers' otherlv_9= ':' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' otherlv_15= ',' )? otherlv_16= 'properties' otherlv_17= ':' otherlv_18= '[' ( (lv_properties_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleProperty ) ) )* otherlv_22= ']' (otherlv_23= ',' otherlv_24= 'mappings' otherlv_25= ':' otherlv_26= '{' ( (lv_mappings_27_0= ruleContextMapping ) ) (otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) ;
    public final EObject ruleContext() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token lv_derived_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        EObject lv_properties_19_0 = null;

        EObject lv_properties_21_0 = null;

        EObject lv_mappings_27_0 = null;

        EObject lv_mappings_29_0 = null;



        	enterRule();

        try {
            // InternalCDL.g:255:2: ( ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_derived_3_0= 'derives' ) ) ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'providers' otherlv_9= ':' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' otherlv_15= ',' )? otherlv_16= 'properties' otherlv_17= ':' otherlv_18= '[' ( (lv_properties_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleProperty ) ) )* otherlv_22= ']' (otherlv_23= ',' otherlv_24= 'mappings' otherlv_25= ':' otherlv_26= '{' ( (lv_mappings_27_0= ruleContextMapping ) ) (otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) )
            // InternalCDL.g:256:2: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_derived_3_0= 'derives' ) ) ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'providers' otherlv_9= ':' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' otherlv_15= ',' )? otherlv_16= 'properties' otherlv_17= ':' otherlv_18= '[' ( (lv_properties_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleProperty ) ) )* otherlv_22= ']' (otherlv_23= ',' otherlv_24= 'mappings' otherlv_25= ':' otherlv_26= '{' ( (lv_mappings_27_0= ruleContextMapping ) ) (otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            {
            // InternalCDL.g:256:2: ( ( (lv_static_0_0= 'static' ) )? otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_derived_3_0= 'derives' ) ) ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'providers' otherlv_9= ':' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' otherlv_15= ',' )? otherlv_16= 'properties' otherlv_17= ':' otherlv_18= '[' ( (lv_properties_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleProperty ) ) )* otherlv_22= ']' (otherlv_23= ',' otherlv_24= 'mappings' otherlv_25= ':' otherlv_26= '{' ( (lv_mappings_27_0= ruleContextMapping ) ) (otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            // InternalCDL.g:257:3: ( (lv_static_0_0= 'static' ) )? otherlv_1= 'context' ( (lv_name_2_0= RULE_ID ) ) ( ( (lv_derived_3_0= 'derives' ) ) ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )? otherlv_7= '{' (otherlv_8= 'providers' otherlv_9= ':' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' otherlv_15= ',' )? otherlv_16= 'properties' otherlv_17= ':' otherlv_18= '[' ( (lv_properties_19_0= ruleProperty ) ) (otherlv_20= ',' ( (lv_properties_21_0= ruleProperty ) ) )* otherlv_22= ']' (otherlv_23= ',' otherlv_24= 'mappings' otherlv_25= ':' otherlv_26= '{' ( (lv_mappings_27_0= ruleContextMapping ) ) (otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) ) )* otherlv_30= '}' )? otherlv_31= '}'
            {
            // InternalCDL.g:257:3: ( (lv_static_0_0= 'static' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCDL.g:258:4: (lv_static_0_0= 'static' )
                    {
                    // InternalCDL.g:258:4: (lv_static_0_0= 'static' )
                    // InternalCDL.g:259:5: lv_static_0_0= 'static'
                    {
                    lv_static_0_0=(Token)match(input,14,FOLLOW_8); 

                    					newLeafNode(lv_static_0_0, grammarAccess.getContextAccess().getStaticStaticKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextRule());
                    					}
                    					setWithLastConsumed(current, "static", lv_static_0_0 != null, "static");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContextAccess().getContextKeyword_1());
            		
            // InternalCDL.g:275:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCDL.g:276:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCDL.g:276:4: (lv_name_2_0= RULE_ID )
            // InternalCDL.g:277:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_2_0, grammarAccess.getContextAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalCDL.g:293:3: ( ( (lv_derived_3_0= 'derives' ) ) ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCDL.g:294:4: ( (lv_derived_3_0= 'derives' ) ) ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    {
                    // InternalCDL.g:294:4: ( (lv_derived_3_0= 'derives' ) )
                    // InternalCDL.g:295:5: (lv_derived_3_0= 'derives' )
                    {
                    // InternalCDL.g:295:5: (lv_derived_3_0= 'derives' )
                    // InternalCDL.g:296:6: lv_derived_3_0= 'derives'
                    {
                    lv_derived_3_0=(Token)match(input,16,FOLLOW_3); 

                    						newLeafNode(lv_derived_3_0, grammarAccess.getContextAccess().getDerivedDerivesKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextRule());
                    						}
                    						setWithLastConsumed(current, "derived", lv_derived_3_0 != null, "derives");
                    					

                    }


                    }

                    // InternalCDL.g:308:4: ( (otherlv_4= RULE_ID ) )
                    // InternalCDL.g:309:5: (otherlv_4= RULE_ID )
                    {
                    // InternalCDL.g:309:5: (otherlv_4= RULE_ID )
                    // InternalCDL.g:310:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_4, grammarAccess.getContextAccess().getDerivesContextCrossReference_3_1_0());
                    					

                    }


                    }

                    // InternalCDL.g:321:4: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCDL.g:322:5: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getContextAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalCDL.g:326:5: ( (otherlv_6= RULE_ID ) )
                    	    // InternalCDL.g:327:6: (otherlv_6= RULE_ID )
                    	    {
                    	    // InternalCDL.g:327:6: (otherlv_6= RULE_ID )
                    	    // InternalCDL.g:328:7: otherlv_6= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getContextRule());
                    	    							}
                    	    						
                    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    							newLeafNode(otherlv_6, grammarAccess.getContextAccess().getDerivesContextCrossReference_3_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalCDL.g:345:3: (otherlv_8= 'providers' otherlv_9= ':' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' otherlv_15= ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCDL.g:346:4: otherlv_8= 'providers' otherlv_9= ':' otherlv_10= '[' ( (otherlv_11= RULE_ID ) ) (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )* otherlv_14= ']' otherlv_15= ','
                    {
                    otherlv_8=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getContextAccess().getProvidersKeyword_5_0());
                    			
                    otherlv_9=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextAccess().getColonKeyword_5_1());
                    			
                    otherlv_10=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getContextAccess().getLeftSquareBracketKeyword_5_2());
                    			
                    // InternalCDL.g:358:4: ( (otherlv_11= RULE_ID ) )
                    // InternalCDL.g:359:5: (otherlv_11= RULE_ID )
                    {
                    // InternalCDL.g:359:5: (otherlv_11= RULE_ID )
                    // InternalCDL.g:360:6: otherlv_11= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextRule());
                    						}
                    					
                    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_11, grammarAccess.getContextAccess().getProvidersProviderCrossReference_5_3_0());
                    					

                    }


                    }

                    // InternalCDL.g:371:4: (otherlv_12= ',' ( (otherlv_13= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCDL.g:372:5: otherlv_12= ',' ( (otherlv_13= RULE_ID ) )
                    	    {
                    	    otherlv_12=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getContextAccess().getCommaKeyword_5_4_0());
                    	    				
                    	    // InternalCDL.g:376:5: ( (otherlv_13= RULE_ID ) )
                    	    // InternalCDL.g:377:6: (otherlv_13= RULE_ID )
                    	    {
                    	    // InternalCDL.g:377:6: (otherlv_13= RULE_ID )
                    	    // InternalCDL.g:378:7: otherlv_13= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getContextRule());
                    	    							}
                    	    						
                    	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_14); 

                    	    							newLeafNode(otherlv_13, grammarAccess.getContextAccess().getProvidersProviderCrossReference_5_4_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_14, grammarAccess.getContextAccess().getRightSquareBracketKeyword_5_5());
                    			
                    otherlv_15=(Token)match(input,17,FOLLOW_16); 

                    				newLeafNode(otherlv_15, grammarAccess.getContextAccess().getCommaKeyword_5_6());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,22,FOLLOW_12); 

            			newLeafNode(otherlv_16, grammarAccess.getContextAccess().getPropertiesKeyword_6());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getContextAccess().getColonKeyword_7());
            		
            otherlv_18=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_18, grammarAccess.getContextAccess().getLeftSquareBracketKeyword_8());
            		
            // InternalCDL.g:411:3: ( (lv_properties_19_0= ruleProperty ) )
            // InternalCDL.g:412:4: (lv_properties_19_0= ruleProperty )
            {
            // InternalCDL.g:412:4: (lv_properties_19_0= ruleProperty )
            // InternalCDL.g:413:5: lv_properties_19_0= ruleProperty
            {

            					newCompositeNode(grammarAccess.getContextAccess().getPropertiesPropertyParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_properties_19_0=ruleProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextRule());
            					}
            					add(
            						current,
            						"properties",
            						lv_properties_19_0,
            						"fr.lcis.castav.cdl.CDL.Property");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDL.g:430:3: (otherlv_20= ',' ( (lv_properties_21_0= ruleProperty ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCDL.g:431:4: otherlv_20= ',' ( (lv_properties_21_0= ruleProperty ) )
            	    {
            	    otherlv_20=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_20, grammarAccess.getContextAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalCDL.g:435:4: ( (lv_properties_21_0= ruleProperty ) )
            	    // InternalCDL.g:436:5: (lv_properties_21_0= ruleProperty )
            	    {
            	    // InternalCDL.g:436:5: (lv_properties_21_0= ruleProperty )
            	    // InternalCDL.g:437:6: lv_properties_21_0= ruleProperty
            	    {

            	    						newCompositeNode(grammarAccess.getContextAccess().getPropertiesPropertyParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_14);
            	    lv_properties_21_0=ruleProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getContextRule());
            	    						}
            	    						add(
            	    							current,
            	    							"properties",
            	    							lv_properties_21_0,
            	    							"fr.lcis.castav.cdl.CDL.Property");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_22=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_22, grammarAccess.getContextAccess().getRightSquareBracketKeyword_11());
            		
            // InternalCDL.g:459:3: (otherlv_23= ',' otherlv_24= 'mappings' otherlv_25= ':' otherlv_26= '{' ( (lv_mappings_27_0= ruleContextMapping ) ) (otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) ) )* otherlv_30= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCDL.g:460:4: otherlv_23= ',' otherlv_24= 'mappings' otherlv_25= ':' otherlv_26= '{' ( (lv_mappings_27_0= ruleContextMapping ) ) (otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) ) )* otherlv_30= '}'
                    {
                    otherlv_23=(Token)match(input,17,FOLLOW_18); 

                    				newLeafNode(otherlv_23, grammarAccess.getContextAccess().getCommaKeyword_12_0());
                    			
                    otherlv_24=(Token)match(input,23,FOLLOW_12); 

                    				newLeafNode(otherlv_24, grammarAccess.getContextAccess().getMappingsKeyword_12_1());
                    			
                    otherlv_25=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_25, grammarAccess.getContextAccess().getColonKeyword_12_2());
                    			
                    otherlv_26=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_26, grammarAccess.getContextAccess().getLeftCurlyBracketKeyword_12_3());
                    			
                    // InternalCDL.g:476:4: ( (lv_mappings_27_0= ruleContextMapping ) )
                    // InternalCDL.g:477:5: (lv_mappings_27_0= ruleContextMapping )
                    {
                    // InternalCDL.g:477:5: (lv_mappings_27_0= ruleContextMapping )
                    // InternalCDL.g:478:6: lv_mappings_27_0= ruleContextMapping
                    {

                    						newCompositeNode(grammarAccess.getContextAccess().getMappingsContextMappingParserRuleCall_12_4_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_mappings_27_0=ruleContextMapping();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextRule());
                    						}
                    						add(
                    							current,
                    							"mappings",
                    							lv_mappings_27_0,
                    							"fr.lcis.castav.cdl.CDL.ContextMapping");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCDL.g:495:4: (otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCDL.g:496:5: otherlv_28= ',' ( (lv_mappings_29_0= ruleContextMapping ) )
                    	    {
                    	    otherlv_28=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getContextAccess().getCommaKeyword_12_5_0());
                    	    				
                    	    // InternalCDL.g:500:5: ( (lv_mappings_29_0= ruleContextMapping ) )
                    	    // InternalCDL.g:501:6: (lv_mappings_29_0= ruleContextMapping )
                    	    {
                    	    // InternalCDL.g:501:6: (lv_mappings_29_0= ruleContextMapping )
                    	    // InternalCDL.g:502:7: lv_mappings_29_0= ruleContextMapping
                    	    {

                    	    							newCompositeNode(grammarAccess.getContextAccess().getMappingsContextMappingParserRuleCall_12_5_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_mappings_29_0=ruleContextMapping();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getContextRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"mappings",
                    	    								lv_mappings_29_0,
                    	    								"fr.lcis.castav.cdl.CDL.ContextMapping");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,13,FOLLOW_19); 

                    				newLeafNode(otherlv_30, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_12_6());
                    			

                    }
                    break;

            }

            otherlv_31=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getContextAccess().getRightCurlyBracketKeyword_13());
            		

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


    // $ANTLR start "entryRuleContextMapping"
    // InternalCDL.g:533:1: entryRuleContextMapping returns [EObject current=null] : iv_ruleContextMapping= ruleContextMapping EOF ;
    public final EObject entryRuleContextMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextMapping = null;


        try {
            // InternalCDL.g:533:55: (iv_ruleContextMapping= ruleContextMapping EOF )
            // InternalCDL.g:534:2: iv_ruleContextMapping= ruleContextMapping EOF
            {
             newCompositeNode(grammarAccess.getContextMappingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextMapping=ruleContextMapping();

            state._fsp--;

             current =iv_ruleContextMapping; 
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
    // $ANTLR end "entryRuleContextMapping"


    // $ANTLR start "ruleContextMapping"
    // InternalCDL.g:540:1: ruleContextMapping returns [EObject current=null] : ( ( ( ruleFQN ) ) otherlv_1= '->' ( (lv_expression_2_0= ruleContextExpression ) ) ) ;
    public final EObject ruleContextMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalCDL.g:546:2: ( ( ( ( ruleFQN ) ) otherlv_1= '->' ( (lv_expression_2_0= ruleContextExpression ) ) ) )
            // InternalCDL.g:547:2: ( ( ( ruleFQN ) ) otherlv_1= '->' ( (lv_expression_2_0= ruleContextExpression ) ) )
            {
            // InternalCDL.g:547:2: ( ( ( ruleFQN ) ) otherlv_1= '->' ( (lv_expression_2_0= ruleContextExpression ) ) )
            // InternalCDL.g:548:3: ( ( ruleFQN ) ) otherlv_1= '->' ( (lv_expression_2_0= ruleContextExpression ) )
            {
            // InternalCDL.g:548:3: ( ( ruleFQN ) )
            // InternalCDL.g:549:4: ( ruleFQN )
            {
            // InternalCDL.g:549:4: ( ruleFQN )
            // InternalCDL.g:550:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextMappingRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContextMappingAccess().getRefContextValueCrossReference_0_0());
            				
            pushFollow(FOLLOW_20);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getContextMappingAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalCDL.g:568:3: ( (lv_expression_2_0= ruleContextExpression ) )
            // InternalCDL.g:569:4: (lv_expression_2_0= ruleContextExpression )
            {
            // InternalCDL.g:569:4: (lv_expression_2_0= ruleContextExpression )
            // InternalCDL.g:570:5: lv_expression_2_0= ruleContextExpression
            {

            					newCompositeNode(grammarAccess.getContextMappingAccess().getExpressionContextExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleContextExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextMappingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"fr.lcis.castav.cdl.CDL.ContextExpression");
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
    // $ANTLR end "ruleContextMapping"


    // $ANTLR start "entryRuleProviders"
    // InternalCDL.g:591:1: entryRuleProviders returns [EObject current=null] : iv_ruleProviders= ruleProviders EOF ;
    public final EObject entryRuleProviders() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProviders = null;


        try {
            // InternalCDL.g:591:50: (iv_ruleProviders= ruleProviders EOF )
            // InternalCDL.g:592:2: iv_ruleProviders= ruleProviders EOF
            {
             newCompositeNode(grammarAccess.getProvidersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProviders=ruleProviders();

            state._fsp--;

             current =iv_ruleProviders; 
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
    // $ANTLR end "entryRuleProviders"


    // $ANTLR start "ruleProviders"
    // InternalCDL.g:598:1: ruleProviders returns [EObject current=null] : (otherlv_0= 'providers' otherlv_1= '{' ( (lv_providers_2_0= ruleProvider ) ) (otherlv_3= ',' ( (lv_providers_4_0= ruleProvider ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleProviders() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_providers_2_0 = null;

        EObject lv_providers_4_0 = null;



        	enterRule();

        try {
            // InternalCDL.g:604:2: ( (otherlv_0= 'providers' otherlv_1= '{' ( (lv_providers_2_0= ruleProvider ) ) (otherlv_3= ',' ( (lv_providers_4_0= ruleProvider ) ) )* otherlv_5= '}' ) )
            // InternalCDL.g:605:2: (otherlv_0= 'providers' otherlv_1= '{' ( (lv_providers_2_0= ruleProvider ) ) (otherlv_3= ',' ( (lv_providers_4_0= ruleProvider ) ) )* otherlv_5= '}' )
            {
            // InternalCDL.g:605:2: (otherlv_0= 'providers' otherlv_1= '{' ( (lv_providers_2_0= ruleProvider ) ) (otherlv_3= ',' ( (lv_providers_4_0= ruleProvider ) ) )* otherlv_5= '}' )
            // InternalCDL.g:606:3: otherlv_0= 'providers' otherlv_1= '{' ( (lv_providers_2_0= ruleProvider ) ) (otherlv_3= ',' ( (lv_providers_4_0= ruleProvider ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProvidersAccess().getProvidersKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getProvidersAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalCDL.g:614:3: ( (lv_providers_2_0= ruleProvider ) )
            // InternalCDL.g:615:4: (lv_providers_2_0= ruleProvider )
            {
            // InternalCDL.g:615:4: (lv_providers_2_0= ruleProvider )
            // InternalCDL.g:616:5: lv_providers_2_0= ruleProvider
            {

            					newCompositeNode(grammarAccess.getProvidersAccess().getProvidersProviderParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_providers_2_0=ruleProvider();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProvidersRule());
            					}
            					add(
            						current,
            						"providers",
            						lv_providers_2_0,
            						"fr.lcis.castav.cdl.CDL.Provider");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDL.g:633:3: (otherlv_3= ',' ( (lv_providers_4_0= ruleProvider ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCDL.g:634:4: otherlv_3= ',' ( (lv_providers_4_0= ruleProvider ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_3, grammarAccess.getProvidersAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCDL.g:638:4: ( (lv_providers_4_0= ruleProvider ) )
            	    // InternalCDL.g:639:5: (lv_providers_4_0= ruleProvider )
            	    {
            	    // InternalCDL.g:639:5: (lv_providers_4_0= ruleProvider )
            	    // InternalCDL.g:640:6: lv_providers_4_0= ruleProvider
            	    {

            	    						newCompositeNode(grammarAccess.getProvidersAccess().getProvidersProviderParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_providers_4_0=ruleProvider();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getProvidersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"providers",
            	    							lv_providers_4_0,
            	    							"fr.lcis.castav.cdl.CDL.Provider");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProvidersAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleProviders"


    // $ANTLR start "entryRuleProvider"
    // InternalCDL.g:666:1: entryRuleProvider returns [EObject current=null] : iv_ruleProvider= ruleProvider EOF ;
    public final EObject entryRuleProvider() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProvider = null;


        try {
            // InternalCDL.g:666:49: (iv_ruleProvider= ruleProvider EOF )
            // InternalCDL.g:667:2: iv_ruleProvider= ruleProvider EOF
            {
             newCompositeNode(grammarAccess.getProviderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProvider=ruleProvider();

            state._fsp--;

             current =iv_ruleProvider; 
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
    // $ANTLR end "entryRuleProvider"


    // $ANTLR start "ruleProvider"
    // InternalCDL.g:673:1: ruleProvider returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleProvider() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalCDL.g:679:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalCDL.g:680:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalCDL.g:680:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalCDL.g:681:3: (lv_name_0_0= RULE_ID )
            {
            // InternalCDL.g:681:3: (lv_name_0_0= RULE_ID )
            // InternalCDL.g:682:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getProviderAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getProviderRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleProvider"


    // $ANTLR start "entryRuleProperty"
    // InternalCDL.g:701:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalCDL.g:701:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalCDL.g:702:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalCDL.g:708:1: ruleProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType ) ) ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;



        	enterRule();

        try {
            // InternalCDL.g:714:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType ) ) ) ) )
            // InternalCDL.g:715:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType ) ) ) )
            {
            // InternalCDL.g:715:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType ) ) ) )
            // InternalCDL.g:716:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType ) ) )
            {
            // InternalCDL.g:716:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalCDL.g:717:4: (lv_name_0_0= RULE_ID )
            {
            // InternalCDL.g:717:4: (lv_name_0_0= RULE_ID )
            // InternalCDL.g:718:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_0_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getColonKeyword_1());
            		
            // InternalCDL.g:738:3: ( ( (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType ) ) )
            // InternalCDL.g:739:4: ( (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType ) )
            {
            // InternalCDL.g:739:4: ( (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType ) )
            // InternalCDL.g:740:5: (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType )
            {
            // InternalCDL.g:740:5: (lv_type_2_1= ruleTypeRef | lv_type_2_2= ruleSimpleType )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=26 && LA15_0<=29)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalCDL.g:741:6: lv_type_2_1= ruleTypeRef
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getTypeTypeRefParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_1=ruleTypeRef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_1,
                    							"fr.lcis.castav.cdl.CDL.TypeRef");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;
                case 2 :
                    // InternalCDL.g:757:6: lv_type_2_2= ruleSimpleType
                    {

                    						newCompositeNode(grammarAccess.getPropertyAccess().getTypeSimpleTypeParserRuleCall_2_0_1());
                    					
                    pushFollow(FOLLOW_2);
                    lv_type_2_2=ruleSimpleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPropertyRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_2_2,
                    							"fr.lcis.castav.cdl.CDL.SimpleType");
                    						afterParserOrEnumRuleCall();
                    					

                    }
                    break;

            }


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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleTypeRef"
    // InternalCDL.g:779:1: entryRuleTypeRef returns [EObject current=null] : iv_ruleTypeRef= ruleTypeRef EOF ;
    public final EObject entryRuleTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeRef = null;


        try {
            // InternalCDL.g:779:48: (iv_ruleTypeRef= ruleTypeRef EOF )
            // InternalCDL.g:780:2: iv_ruleTypeRef= ruleTypeRef EOF
            {
             newCompositeNode(grammarAccess.getTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeRef=ruleTypeRef();

            state._fsp--;

             current =iv_ruleTypeRef; 
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
    // $ANTLR end "entryRuleTypeRef"


    // $ANTLR start "ruleTypeRef"
    // InternalCDL.g:786:1: ruleTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalCDL.g:792:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalCDL.g:793:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalCDL.g:793:2: ( (otherlv_0= RULE_ID ) )
            // InternalCDL.g:794:3: (otherlv_0= RULE_ID )
            {
            // InternalCDL.g:794:3: (otherlv_0= RULE_ID )
            // InternalCDL.g:795:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTypeRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getRefDefinedTypeCrossReference_0());
            			

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
    // $ANTLR end "ruleTypeRef"


    // $ANTLR start "entryRuleDefinedType"
    // InternalCDL.g:809:1: entryRuleDefinedType returns [EObject current=null] : iv_ruleDefinedType= ruleDefinedType EOF ;
    public final EObject entryRuleDefinedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinedType = null;


        try {
            // InternalCDL.g:809:52: (iv_ruleDefinedType= ruleDefinedType EOF )
            // InternalCDL.g:810:2: iv_ruleDefinedType= ruleDefinedType EOF
            {
             newCompositeNode(grammarAccess.getDefinedTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinedType=ruleDefinedType();

            state._fsp--;

             current =iv_ruleDefinedType; 
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
    // $ANTLR end "entryRuleDefinedType"


    // $ANTLR start "ruleDefinedType"
    // InternalCDL.g:816:1: ruleDefinedType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleContextValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleContextValue ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleDefinedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_values_3_0 = null;

        EObject lv_values_5_0 = null;



        	enterRule();

        try {
            // InternalCDL.g:822:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleContextValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleContextValue ) ) )* otherlv_6= '}' ) )
            // InternalCDL.g:823:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleContextValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleContextValue ) ) )* otherlv_6= '}' )
            {
            // InternalCDL.g:823:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleContextValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleContextValue ) ) )* otherlv_6= '}' )
            // InternalCDL.g:824:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_values_3_0= ruleContextValue ) ) (otherlv_4= ',' ( (lv_values_5_0= ruleContextValue ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDefinedTypeAccess().getTypeKeyword_0());
            		
            // InternalCDL.g:828:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCDL.g:829:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCDL.g:829:4: (lv_name_1_0= RULE_ID )
            // InternalCDL.g:830:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDefinedTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDefinedTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getDefinedTypeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCDL.g:850:3: ( (lv_values_3_0= ruleContextValue ) )
            // InternalCDL.g:851:4: (lv_values_3_0= ruleContextValue )
            {
            // InternalCDL.g:851:4: (lv_values_3_0= ruleContextValue )
            // InternalCDL.g:852:5: lv_values_3_0= ruleContextValue
            {

            					newCompositeNode(grammarAccess.getDefinedTypeAccess().getValuesContextValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
            lv_values_3_0=ruleContextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDefinedTypeRule());
            					}
            					add(
            						current,
            						"values",
            						lv_values_3_0,
            						"fr.lcis.castav.cdl.CDL.ContextValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDL.g:869:3: (otherlv_4= ',' ( (lv_values_5_0= ruleContextValue ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCDL.g:870:4: otherlv_4= ',' ( (lv_values_5_0= ruleContextValue ) )
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_22); 

            	    				newLeafNode(otherlv_4, grammarAccess.getDefinedTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCDL.g:874:4: ( (lv_values_5_0= ruleContextValue ) )
            	    // InternalCDL.g:875:5: (lv_values_5_0= ruleContextValue )
            	    {
            	    // InternalCDL.g:875:5: (lv_values_5_0= ruleContextValue )
            	    // InternalCDL.g:876:6: lv_values_5_0= ruleContextValue
            	    {

            	    						newCompositeNode(grammarAccess.getDefinedTypeAccess().getValuesContextValueParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_values_5_0=ruleContextValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDefinedTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_5_0,
            	    							"fr.lcis.castav.cdl.CDL.ContextValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getDefinedTypeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDefinedType"


    // $ANTLR start "entryRuleContextValue"
    // InternalCDL.g:902:1: entryRuleContextValue returns [EObject current=null] : iv_ruleContextValue= ruleContextValue EOF ;
    public final EObject entryRuleContextValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextValue = null;


        try {
            // InternalCDL.g:902:53: (iv_ruleContextValue= ruleContextValue EOF )
            // InternalCDL.g:903:2: iv_ruleContextValue= ruleContextValue EOF
            {
             newCompositeNode(grammarAccess.getContextValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextValue=ruleContextValue();

            state._fsp--;

             current =iv_ruleContextValue; 
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
    // $ANTLR end "entryRuleContextValue"


    // $ANTLR start "ruleContextValue"
    // InternalCDL.g:909:1: ruleContextValue returns [EObject current=null] : ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_ID ) ) ) ;
    public final EObject ruleContextValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;


        	enterRule();

        try {
            // InternalCDL.g:915:2: ( ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_ID ) ) ) )
            // InternalCDL.g:916:2: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_ID ) ) )
            {
            // InternalCDL.g:916:2: ( ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_ID ) ) )
            // InternalCDL.g:917:3: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_ID ) )
            {
            // InternalCDL.g:917:3: ( (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_ID ) )
            // InternalCDL.g:918:4: (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_ID )
            {
            // InternalCDL.g:918:4: (lv_name_0_1= RULE_STRING | lv_name_0_2= RULE_ID )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalCDL.g:919:5: lv_name_0_1= RULE_STRING
                    {
                    lv_name_0_1=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_name_0_1, grammarAccess.getContextValueAccess().getNameSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_1,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }
                    break;
                case 2 :
                    // InternalCDL.g:934:5: lv_name_0_2= RULE_ID
                    {
                    lv_name_0_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_name_0_2, grammarAccess.getContextValueAccess().getNameIDTerminalRuleCall_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getContextValueRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_0_2,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }
                    break;

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
    // $ANTLR end "ruleContextValue"


    // $ANTLR start "entryRuleSimpleType"
    // InternalCDL.g:954:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalCDL.g:954:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalCDL.g:955:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalCDL.g:961:1: ruleSimpleType returns [EObject current=null] : (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType | this_BooleanType_2= ruleBooleanType | this_DoubleType_3= ruleDoubleType ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject this_StringType_0 = null;

        EObject this_IntegerType_1 = null;

        EObject this_BooleanType_2 = null;

        EObject this_DoubleType_3 = null;



        	enterRule();

        try {
            // InternalCDL.g:967:2: ( (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType | this_BooleanType_2= ruleBooleanType | this_DoubleType_3= ruleDoubleType ) )
            // InternalCDL.g:968:2: (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType | this_BooleanType_2= ruleBooleanType | this_DoubleType_3= ruleDoubleType )
            {
            // InternalCDL.g:968:2: (this_StringType_0= ruleStringType | this_IntegerType_1= ruleIntegerType | this_BooleanType_2= ruleBooleanType | this_DoubleType_3= ruleDoubleType )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt18=1;
                }
                break;
            case 27:
                {
                alt18=2;
                }
                break;
            case 28:
                {
                alt18=3;
                }
                break;
            case 29:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalCDL.g:969:3: this_StringType_0= ruleStringType
                    {

                    			newCompositeNode(grammarAccess.getSimpleTypeAccess().getStringTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringType_0=ruleStringType();

                    state._fsp--;


                    			current = this_StringType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCDL.g:978:3: this_IntegerType_1= ruleIntegerType
                    {

                    			newCompositeNode(grammarAccess.getSimpleTypeAccess().getIntegerTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntegerType_1=ruleIntegerType();

                    state._fsp--;


                    			current = this_IntegerType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalCDL.g:987:3: this_BooleanType_2= ruleBooleanType
                    {

                    			newCompositeNode(grammarAccess.getSimpleTypeAccess().getBooleanTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanType_2=ruleBooleanType();

                    state._fsp--;


                    			current = this_BooleanType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalCDL.g:996:3: this_DoubleType_3= ruleDoubleType
                    {

                    			newCompositeNode(grammarAccess.getSimpleTypeAccess().getDoubleTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleType_3=ruleDoubleType();

                    state._fsp--;


                    			current = this_DoubleType_3;
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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRuleStringType"
    // InternalCDL.g:1008:1: entryRuleStringType returns [EObject current=null] : iv_ruleStringType= ruleStringType EOF ;
    public final EObject entryRuleStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringType = null;


        try {
            // InternalCDL.g:1008:51: (iv_ruleStringType= ruleStringType EOF )
            // InternalCDL.g:1009:2: iv_ruleStringType= ruleStringType EOF
            {
             newCompositeNode(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringType=ruleStringType();

            state._fsp--;

             current =iv_ruleStringType; 
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
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalCDL.g:1015:1: ruleStringType returns [EObject current=null] : ( () otherlv_1= 'string' ) ;
    public final EObject ruleStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCDL.g:1021:2: ( ( () otherlv_1= 'string' ) )
            // InternalCDL.g:1022:2: ( () otherlv_1= 'string' )
            {
            // InternalCDL.g:1022:2: ( () otherlv_1= 'string' )
            // InternalCDL.g:1023:3: () otherlv_1= 'string'
            {
            // InternalCDL.g:1023:3: ()
            // InternalCDL.g:1024:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStringTypeAccess().getStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getStringTypeAccess().getStringKeyword_1());
            		

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
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleIntegerType"
    // InternalCDL.g:1038:1: entryRuleIntegerType returns [EObject current=null] : iv_ruleIntegerType= ruleIntegerType EOF ;
    public final EObject entryRuleIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerType = null;


        try {
            // InternalCDL.g:1038:52: (iv_ruleIntegerType= ruleIntegerType EOF )
            // InternalCDL.g:1039:2: iv_ruleIntegerType= ruleIntegerType EOF
            {
             newCompositeNode(grammarAccess.getIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntegerType=ruleIntegerType();

            state._fsp--;

             current =iv_ruleIntegerType; 
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
    // $ANTLR end "entryRuleIntegerType"


    // $ANTLR start "ruleIntegerType"
    // InternalCDL.g:1045:1: ruleIntegerType returns [EObject current=null] : ( () otherlv_1= 'integer' ) ;
    public final EObject ruleIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCDL.g:1051:2: ( ( () otherlv_1= 'integer' ) )
            // InternalCDL.g:1052:2: ( () otherlv_1= 'integer' )
            {
            // InternalCDL.g:1052:2: ( () otherlv_1= 'integer' )
            // InternalCDL.g:1053:3: () otherlv_1= 'integer'
            {
            // InternalCDL.g:1053:3: ()
            // InternalCDL.g:1054:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIntegerTypeAccess().getIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getIntegerTypeAccess().getIntegerKeyword_1());
            		

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
    // $ANTLR end "ruleIntegerType"


    // $ANTLR start "entryRuleBooleanType"
    // InternalCDL.g:1068:1: entryRuleBooleanType returns [EObject current=null] : iv_ruleBooleanType= ruleBooleanType EOF ;
    public final EObject entryRuleBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanType = null;


        try {
            // InternalCDL.g:1068:52: (iv_ruleBooleanType= ruleBooleanType EOF )
            // InternalCDL.g:1069:2: iv_ruleBooleanType= ruleBooleanType EOF
            {
             newCompositeNode(grammarAccess.getBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanType=ruleBooleanType();

            state._fsp--;

             current =iv_ruleBooleanType; 
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
    // $ANTLR end "entryRuleBooleanType"


    // $ANTLR start "ruleBooleanType"
    // InternalCDL.g:1075:1: ruleBooleanType returns [EObject current=null] : ( () otherlv_1= 'boolean' ) ;
    public final EObject ruleBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCDL.g:1081:2: ( ( () otherlv_1= 'boolean' ) )
            // InternalCDL.g:1082:2: ( () otherlv_1= 'boolean' )
            {
            // InternalCDL.g:1082:2: ( () otherlv_1= 'boolean' )
            // InternalCDL.g:1083:3: () otherlv_1= 'boolean'
            {
            // InternalCDL.g:1083:3: ()
            // InternalCDL.g:1084:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBooleanTypeAccess().getBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBooleanTypeAccess().getBooleanKeyword_1());
            		

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
    // $ANTLR end "ruleBooleanType"


    // $ANTLR start "entryRuleDoubleType"
    // InternalCDL.g:1098:1: entryRuleDoubleType returns [EObject current=null] : iv_ruleDoubleType= ruleDoubleType EOF ;
    public final EObject entryRuleDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleType = null;


        try {
            // InternalCDL.g:1098:51: (iv_ruleDoubleType= ruleDoubleType EOF )
            // InternalCDL.g:1099:2: iv_ruleDoubleType= ruleDoubleType EOF
            {
             newCompositeNode(grammarAccess.getDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleType=ruleDoubleType();

            state._fsp--;

             current =iv_ruleDoubleType; 
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
    // $ANTLR end "entryRuleDoubleType"


    // $ANTLR start "ruleDoubleType"
    // InternalCDL.g:1105:1: ruleDoubleType returns [EObject current=null] : ( () otherlv_1= 'double' ) ;
    public final EObject ruleDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalCDL.g:1111:2: ( ( () otherlv_1= 'double' ) )
            // InternalCDL.g:1112:2: ( () otherlv_1= 'double' )
            {
            // InternalCDL.g:1112:2: ( () otherlv_1= 'double' )
            // InternalCDL.g:1113:3: () otherlv_1= 'double'
            {
            // InternalCDL.g:1113:3: ()
            // InternalCDL.g:1114:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoubleTypeAccess().getDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDoubleTypeAccess().getDoubleKeyword_1());
            		

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
    // $ANTLR end "ruleDoubleType"


    // $ANTLR start "entryRuleSituation"
    // InternalCDL.g:1128:1: entryRuleSituation returns [EObject current=null] : iv_ruleSituation= ruleSituation EOF ;
    public final EObject entryRuleSituation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSituation = null;


        try {
            // InternalCDL.g:1128:50: (iv_ruleSituation= ruleSituation EOF )
            // InternalCDL.g:1129:2: iv_ruleSituation= ruleSituation EOF
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
    // InternalCDL.g:1135:1: ruleSituation returns [EObject current=null] : (otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleContextExpression ) ) otherlv_4= '}' ) ;
    public final EObject ruleSituation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalCDL.g:1141:2: ( (otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleContextExpression ) ) otherlv_4= '}' ) )
            // InternalCDL.g:1142:2: (otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleContextExpression ) ) otherlv_4= '}' )
            {
            // InternalCDL.g:1142:2: (otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleContextExpression ) ) otherlv_4= '}' )
            // InternalCDL.g:1143:3: otherlv_0= 'situation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleContextExpression ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSituationAccess().getSituationKeyword_0());
            		
            // InternalCDL.g:1147:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCDL.g:1148:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCDL.g:1148:4: (lv_name_1_0= RULE_ID )
            // InternalCDL.g:1149:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSituationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSituationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getSituationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCDL.g:1169:3: ( (lv_expression_3_0= ruleContextExpression ) )
            // InternalCDL.g:1170:4: (lv_expression_3_0= ruleContextExpression )
            {
            // InternalCDL.g:1170:4: (lv_expression_3_0= ruleContextExpression )
            // InternalCDL.g:1171:5: lv_expression_3_0= ruleContextExpression
            {

            					newCompositeNode(grammarAccess.getSituationAccess().getExpressionContextExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_19);
            lv_expression_3_0=ruleContextExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSituationRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"fr.lcis.castav.cdl.CDL.ContextExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSituationAccess().getRightCurlyBracketKeyword_4());
            		

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


    // $ANTLR start "entryRuleContextExpression"
    // InternalCDL.g:1196:1: entryRuleContextExpression returns [EObject current=null] : iv_ruleContextExpression= ruleContextExpression EOF ;
    public final EObject entryRuleContextExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextExpression = null;


        try {
            // InternalCDL.g:1196:58: (iv_ruleContextExpression= ruleContextExpression EOF )
            // InternalCDL.g:1197:2: iv_ruleContextExpression= ruleContextExpression EOF
            {
             newCompositeNode(grammarAccess.getContextExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextExpression=ruleContextExpression();

            state._fsp--;

             current =iv_ruleContextExpression; 
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
    // $ANTLR end "entryRuleContextExpression"


    // $ANTLR start "ruleContextExpression"
    // InternalCDL.g:1203:1: ruleContextExpression returns [EObject current=null] : ( ( ( ruleFQN ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' | otherlv_5= '==' | otherlv_6= '!=' ) ( (lv_value_7_0= ruleContextValue ) ) ( (otherlv_8= 'and' | otherlv_9= 'or' ) ( (lv_expr_10_0= ruleContextExpression ) ) )? ) ;
    public final EObject ruleContextExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_value_7_0 = null;

        EObject lv_expr_10_0 = null;



        	enterRule();

        try {
            // InternalCDL.g:1209:2: ( ( ( ( ruleFQN ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' | otherlv_5= '==' | otherlv_6= '!=' ) ( (lv_value_7_0= ruleContextValue ) ) ( (otherlv_8= 'and' | otherlv_9= 'or' ) ( (lv_expr_10_0= ruleContextExpression ) ) )? ) )
            // InternalCDL.g:1210:2: ( ( ( ruleFQN ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' | otherlv_5= '==' | otherlv_6= '!=' ) ( (lv_value_7_0= ruleContextValue ) ) ( (otherlv_8= 'and' | otherlv_9= 'or' ) ( (lv_expr_10_0= ruleContextExpression ) ) )? )
            {
            // InternalCDL.g:1210:2: ( ( ( ruleFQN ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' | otherlv_5= '==' | otherlv_6= '!=' ) ( (lv_value_7_0= ruleContextValue ) ) ( (otherlv_8= 'and' | otherlv_9= 'or' ) ( (lv_expr_10_0= ruleContextExpression ) ) )? )
            // InternalCDL.g:1211:3: ( ( ruleFQN ) ) (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' | otherlv_5= '==' | otherlv_6= '!=' ) ( (lv_value_7_0= ruleContextValue ) ) ( (otherlv_8= 'and' | otherlv_9= 'or' ) ( (lv_expr_10_0= ruleContextExpression ) ) )?
            {
            // InternalCDL.g:1211:3: ( ( ruleFQN ) )
            // InternalCDL.g:1212:4: ( ruleFQN )
            {
            // InternalCDL.g:1212:4: ( ruleFQN )
            // InternalCDL.g:1213:5: ruleFQN
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextExpressionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getContextExpressionAccess().getRefPropertyCrossReference_0_0());
            				
            pushFollow(FOLLOW_23);
            ruleFQN();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDL.g:1227:3: (otherlv_1= '<' | otherlv_2= '>' | otherlv_3= '>=' | otherlv_4= '<=' | otherlv_5= '==' | otherlv_6= '!=' )
            int alt19=6;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case 34:
                {
                alt19=4;
                }
                break;
            case 35:
                {
                alt19=5;
                }
                break;
            case 36:
                {
                alt19=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalCDL.g:1228:4: otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getContextExpressionAccess().getLessThanSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalCDL.g:1233:4: otherlv_2= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getContextExpressionAccess().getGreaterThanSignKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalCDL.g:1238:4: otherlv_3= '>='
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_22); 

                    				newLeafNode(otherlv_3, grammarAccess.getContextExpressionAccess().getGreaterThanSignEqualsSignKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalCDL.g:1243:4: otherlv_4= '<='
                    {
                    otherlv_4=(Token)match(input,34,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getContextExpressionAccess().getLessThanSignEqualsSignKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalCDL.g:1248:4: otherlv_5= '=='
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_5, grammarAccess.getContextExpressionAccess().getEqualsSignEqualsSignKeyword_1_4());
                    			

                    }
                    break;
                case 6 :
                    // InternalCDL.g:1253:4: otherlv_6= '!='
                    {
                    otherlv_6=(Token)match(input,36,FOLLOW_22); 

                    				newLeafNode(otherlv_6, grammarAccess.getContextExpressionAccess().getExclamationMarkEqualsSignKeyword_1_5());
                    			

                    }
                    break;

            }

            // InternalCDL.g:1258:3: ( (lv_value_7_0= ruleContextValue ) )
            // InternalCDL.g:1259:4: (lv_value_7_0= ruleContextValue )
            {
            // InternalCDL.g:1259:4: (lv_value_7_0= ruleContextValue )
            // InternalCDL.g:1260:5: lv_value_7_0= ruleContextValue
            {

            					newCompositeNode(grammarAccess.getContextExpressionAccess().getValueContextValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
            lv_value_7_0=ruleContextValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextExpressionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"fr.lcis.castav.cdl.CDL.ContextValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCDL.g:1277:3: ( (otherlv_8= 'and' | otherlv_9= 'or' ) ( (lv_expr_10_0= ruleContextExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=37 && LA21_0<=38)) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalCDL.g:1278:4: (otherlv_8= 'and' | otherlv_9= 'or' ) ( (lv_expr_10_0= ruleContextExpression ) )
                    {
                    // InternalCDL.g:1278:4: (otherlv_8= 'and' | otherlv_9= 'or' )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==37) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==38) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalCDL.g:1279:5: otherlv_8= 'and'
                            {
                            otherlv_8=(Token)match(input,37,FOLLOW_3); 

                            					newLeafNode(otherlv_8, grammarAccess.getContextExpressionAccess().getAndKeyword_3_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCDL.g:1284:5: otherlv_9= 'or'
                            {
                            otherlv_9=(Token)match(input,38,FOLLOW_3); 

                            					newLeafNode(otherlv_9, grammarAccess.getContextExpressionAccess().getOrKeyword_3_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCDL.g:1289:4: ( (lv_expr_10_0= ruleContextExpression ) )
                    // InternalCDL.g:1290:5: (lv_expr_10_0= ruleContextExpression )
                    {
                    // InternalCDL.g:1290:5: (lv_expr_10_0= ruleContextExpression )
                    // InternalCDL.g:1291:6: lv_expr_10_0= ruleContextExpression
                    {

                    						newCompositeNode(grammarAccess.getContextExpressionAccess().getExprContextExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expr_10_0=ruleContextExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextExpressionRule());
                    						}
                    						set(
                    							current,
                    							"expr",
                    							lv_expr_10_0,
                    							"fr.lcis.castav.cdl.CDL.ContextExpression");
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
    // $ANTLR end "ruleContextExpression"


    // $ANTLR start "entryRuleFQN"
    // InternalCDL.g:1313:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCDL.g:1315:2: (iv_ruleFQN= ruleFQN EOF )
            // InternalCDL.g:1316:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalCDL.g:1325:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalCDL.g:1332:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalCDL.g:1333:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalCDL.g:1333:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalCDL.g:1334:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalCDL.g:1341:3: (kw= '.' this_ID_2= RULE_ID )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalCDL.g:1342:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,39,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop22;
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000004204E802L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000042042802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000021000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000003C000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001F80000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000002L});

}
