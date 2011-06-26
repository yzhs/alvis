package org.xtext.example.mydsl1.parser.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'main'", "','", "'begin'", "'end'", "'String'", "'Integer'", "'Boolean'", "'return'", "'if'", "'else'", "'for'", "'in'", "'while'", "'[]'", "'='", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'%'", "'!'", "'.'", "'['", "']'", "'true'", "'false'", "'null'", "'infty'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_SIGN=5;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalMyDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[97+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private MyDslGrammarAccess grammarAccess;
     	
        public InternalMyDslParser(TokenStream input, IAstFactory factory, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:83:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:84:2: (iv_ruleModel= ruleModel EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:85:2: iv_ruleModel= ruleModel EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel81);
            iv_ruleModel=ruleModel();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel91); if (failed) return current;

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:92:1: ruleModel returns [EObject current=null] : ( ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_0_0 = null;

        EObject lv_main_1_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:97:6: ( ( ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:1: ( ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:1: ( ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:2: ( (lv_functions_0_0= rulefunctionDefinition ) )* ( (lv_main_1_0= rulemainFunction ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:2: ( (lv_functions_0_0= rulefunctionDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_functions_0_0= rulefunctionDefinition )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:1: (lv_functions_0_0= rulefunctionDefinition )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:100:3: lv_functions_0_0= rulefunctionDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionDefinitionParserRuleCall_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefunctionDefinition_in_ruleModel137);
            	    lv_functions_0_0=rulefunctionDefinition();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"functions",
            	      	        		lv_functions_0_0, 
            	      	        		"functionDefinition", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:122:3: ( (lv_main_1_0= rulemainFunction ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:123:1: (lv_main_1_0= rulemainFunction )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:123:1: (lv_main_1_0= rulemainFunction )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:124:3: lv_main_1_0= rulemainFunction
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getMainMainFunctionParserRuleCall_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulemainFunction_in_ruleModel159);
            lv_main_1_0=rulemainFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"main",
              	        		lv_main_1_0, 
              	        		"mainFunction", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleModel


    // $ANTLR start entryRulefunctionDefinition
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:154:1: entryRulefunctionDefinition returns [EObject current=null] : iv_rulefunctionDefinition= rulefunctionDefinition EOF ;
    public final EObject entryRulefunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDefinition = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:155:2: (iv_rulefunctionDefinition= rulefunctionDefinition EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:156:2: iv_rulefunctionDefinition= rulefunctionDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulefunctionDefinition_in_entryRulefunctionDefinition195);
            iv_rulefunctionDefinition=rulefunctionDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefunctionDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctionDefinition205); if (failed) return current;

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
    // $ANTLR end entryRulefunctionDefinition


    // $ANTLR start rulefunctionDefinition
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:163:1: rulefunctionDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) ) ;
    public final EObject rulefunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_formalParams_2_0 = null;

        EObject lv_returnType_5_0 = null;

        EObject lv_blocks_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:168:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:170:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:170:1: (lv_name_0_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:171:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunctionDefinition247); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_0_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunctionDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_0_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_rulefunctionDefinition262); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:197:1: ( (lv_formalParams_2_0= ruleformalParams ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=19 && LA2_0<=21)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:198:1: (lv_formalParams_2_0= ruleformalParams )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:198:1: (lv_formalParams_2_0= ruleformalParams )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:199:3: lv_formalParams_2_0= ruleformalParams
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFormalParamsFormalParamsParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformalParams_in_rulefunctionDefinition283);
                    lv_formalParams_2_0=ruleformalParams();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunctionDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"formalParams",
                      	        		lv_formalParams_2_0, 
                      	        		"formalParams", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulefunctionDefinition294); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:225:1: ( ':' ( (lv_returnType_5_0= ruletype ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:225:3: ':' ( (lv_returnType_5_0= ruletype ) )
                    {
                    match(input,14,FOLLOW_14_in_rulefunctionDefinition305); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunctionDefinitionAccess().getColonKeyword_4_0(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:229:1: ( (lv_returnType_5_0= ruletype ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:230:1: (lv_returnType_5_0= ruletype )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:230:1: (lv_returnType_5_0= ruletype )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:231:3: lv_returnType_5_0= ruletype
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulefunctionDefinition326);
                    lv_returnType_5_0=ruletype();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunctionDefinitionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"returnType",
                      	        		lv_returnType_5_0, 
                      	        		"type", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:253:4: ( (lv_blocks_6_0= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:254:1: (lv_blocks_6_0= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:254:1: (lv_blocks_6_0= ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:255:3: lv_blocks_6_0= ruleblock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBlocksBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_rulefunctionDefinition349);
            lv_blocks_6_0=ruleblock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFunctionDefinitionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"blocks",
              	        		lv_blocks_6_0, 
              	        		"block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulefunctionDefinition


    // $ANTLR start entryRulemainFunction
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:285:1: entryRulemainFunction returns [EObject current=null] : iv_rulemainFunction= rulemainFunction EOF ;
    public final EObject entryRulemainFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemainFunction = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:286:2: (iv_rulemainFunction= rulemainFunction EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:287:2: iv_rulemainFunction= rulemainFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMainFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemainFunction_in_entryRulemainFunction385);
            iv_rulemainFunction=rulemainFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemainFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemainFunction395); if (failed) return current;

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
    // $ANTLR end entryRulemainFunction


    // $ANTLR start rulemainFunction
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:294:1: rulemainFunction returns [EObject current=null] : ( ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) ) ) ;
    public final EObject rulemainFunction() throws RecognitionException {
        EObject current = null;

        Token lv_main_0_0=null;
        EObject lv_formalParams_2_0 = null;

        EObject lv_blocks_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:299:6: ( ( ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:1: ( ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:1: ( ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:2: ( (lv_main_0_0= 'main' ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( (lv_blocks_4_0= ruleblock ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:2: ( (lv_main_0_0= 'main' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:301:1: (lv_main_0_0= 'main' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:301:1: (lv_main_0_0= 'main' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:302:3: lv_main_0_0= 'main'
            {
            lv_main_0_0=(Token)input.LT(1);
            match(input,15,FOLLOW_15_in_rulemainFunction438); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0(), "main"); 
                  
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMainFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        
              	        try {
              	       		set(current, "main", lv_main_0_0, "main", lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,12,FOLLOW_12_in_rulemainFunction461); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainFunctionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:325:1: ( (lv_formalParams_2_0= ruleformalParams ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=21)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:326:1: (lv_formalParams_2_0= ruleformalParams )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:326:1: (lv_formalParams_2_0= ruleformalParams )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:327:3: lv_formalParams_2_0= ruleformalParams
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMainFunctionAccess().getFormalParamsFormalParamsParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformalParams_in_rulemainFunction482);
                    lv_formalParams_2_0=ruleformalParams();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getMainFunctionRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"formalParams",
                      	        		lv_formalParams_2_0, 
                      	        		"formalParams", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulemainFunction493); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainFunctionAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:353:1: ( (lv_blocks_4_0= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_blocks_4_0= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:354:1: (lv_blocks_4_0= ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:355:3: lv_blocks_4_0= ruleblock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMainFunctionAccess().getBlocksBlockParserRuleCall_4_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_rulemainFunction514);
            lv_blocks_4_0=ruleblock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMainFunctionRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"blocks",
              	        		lv_blocks_4_0, 
              	        		"block", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulemainFunction


    // $ANTLR start entryRuleformalParams
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:385:1: entryRuleformalParams returns [EObject current=null] : iv_ruleformalParams= ruleformalParams EOF ;
    public final EObject entryRuleformalParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParams = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:386:2: (iv_ruleformalParams= ruleformalParams EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:387:2: iv_ruleformalParams= ruleformalParams EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalParamsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_entryRuleformalParams550);
            iv_ruleformalParams=ruleformalParams();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleformalParams; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleformalParams560); if (failed) return current;

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
    // $ANTLR end entryRuleformalParams


    // $ANTLR start ruleformalParams
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:394:1: ruleformalParams returns [EObject current=null] : ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* ) ;
    public final EObject ruleformalParams() throws RecognitionException {
        EObject current = null;

        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:399:6: ( ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:400:1: ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:400:1: ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:400:2: ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:400:2: ( (lv_params_0_0= ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:401:1: (lv_params_0_0= ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:401:1: (lv_params_0_0= ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:402:3: lv_params_0_0= ruleparam
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleparam_in_ruleformalParams606);
            lv_params_0_0=ruleparam();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFormalParamsRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"params",
              	        		lv_params_0_0, 
              	        		"param", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:2: ( ',' ( (lv_params_2_0= ruleparam ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:424:4: ',' ( (lv_params_2_0= ruleparam ) )
            	    {
            	    match(input,16,FOLLOW_16_in_ruleformalParams617); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getFormalParamsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:428:1: ( (lv_params_2_0= ruleparam ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:429:1: (lv_params_2_0= ruleparam )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:429:1: (lv_params_2_0= ruleparam )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:430:3: lv_params_2_0= ruleparam
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparam_in_ruleformalParams638);
            	    lv_params_2_0=ruleparam();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFormalParamsRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"params",
            	      	        		lv_params_2_0, 
            	      	        		"param", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleformalParams


    // $ANTLR start entryRuleparam
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:460:1: entryRuleparam returns [EObject current=null] : iv_ruleparam= ruleparam EOF ;
    public final EObject entryRuleparam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparam = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:461:2: (iv_ruleparam= ruleparam EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:462:2: iv_ruleparam= ruleparam EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParamRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleparam_in_entryRuleparam676);
            iv_ruleparam=ruleparam();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleparam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparam686); if (failed) return current;

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
    // $ANTLR end entryRuleparam


    // $ANTLR start ruleparam
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:469:1: ruleparam returns [EObject current=null] : (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:474:6: ( (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:475:1: (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:475:1: (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:476:2: this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getParamAccess().getTypeParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruletype_in_ruleparam736);
            this_type_0=ruletype();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_type_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:487:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:488:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:488:1: (lv_name_1_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:489:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparam752); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getParamRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_1_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleparam


    // $ANTLR start entryRuleblock
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:519:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:520:2: (iv_ruleblock= ruleblock EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:521:2: iv_ruleblock= ruleblock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock793);
            iv_ruleblock=ruleblock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleblock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock803); if (failed) return current;

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
    // $ANTLR end entryRuleblock


    // $ANTLR start ruleblock
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:528:1: ruleblock returns [EObject current=null] : ( () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end' ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:533:6: ( ( () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:534:1: ( () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:534:1: ( () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:534:2: () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end'
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:534:2: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:535:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getBlockAccess().getBlockAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getBlockAccess().getBlockAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            match(input,17,FOLLOW_17_in_ruleblock850); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlockAccess().getBeginKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:552:1: ( (lv_statements_2_0= rulestatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==17||(LA6_0>=19 && LA6_0<=23)||LA6_0==25||LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:553:1: (lv_statements_2_0= rulestatement )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:553:1: (lv_statements_2_0= rulestatement )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:554:3: lv_statements_2_0= rulestatement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_ruleblock871);
            	    lv_statements_2_0=rulestatement();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getBlockRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"statements",
            	      	        		lv_statements_2_0, 
            	      	        		"statement", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,18,FOLLOW_18_in_ruleblock882); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlockAccess().getEndKeyword_3(), null); 
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleblock


    // $ANTLR start entryRuletype
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:588:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:589:2: (iv_ruletype= ruletype EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:590:2: iv_ruletype= ruletype EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype918);
            iv_ruletype=ruletype();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype928); if (failed) return current;

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
    // $ANTLR end entryRuletype


    // $ANTLR start ruletype
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:597:1: ruletype returns [EObject current=null] : ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        Token lv_types_0_1=null;
        Token lv_types_0_2=null;
        Token lv_types_0_3=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:602:6: ( ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:603:1: ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:603:1: ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:604:1: ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:604:1: ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:605:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:605:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("605:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:606:3: lv_types_0_1= 'String'
                    {
                    lv_types_0_1=(Token)input.LT(1);
                    match(input,19,FOLLOW_19_in_ruletype972); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesStringKeyword_0_0(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_1, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:624:8: lv_types_0_2= 'Integer'
                    {
                    lv_types_0_2=(Token)input.LT(1);
                    match(input,20,FOLLOW_20_in_ruletype1001); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesIntegerKeyword_0_1(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_2, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:642:8: lv_types_0_3= 'Boolean'
                    {
                    lv_types_0_3=(Token)input.LT(1);
                    match(input,21,FOLLOW_21_in_ruletype1030); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesBooleanKeyword_0_2(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_3, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruletype


    // $ANTLR start entryRulestatement
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:671:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:672:2: (iv_rulestatement= rulestatement EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:673:2: iv_rulestatement= rulestatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1081);
            iv_rulestatement=rulestatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1091); if (failed) return current;

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
    // $ANTLR end entryRulestatement


    // $ANTLR start rulestatement
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:680:1: rulestatement returns [EObject current=null] : ( (this_declaration_0= ruledeclaration ruleendExpr ) | this_functionCall_2= rulefunctionCall | ( () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr ) | ( () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )? ) | ( 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) ) ) | ( 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) ) ) | this_block_29= ruleblock ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject this_declaration_0 = null;

        EObject this_functionCall_2 = null;

        EObject lv_postFixExpression_4_0 = null;

        EObject lv_assignments_7_0 = null;

        EObject lv_exprs_11_0 = null;

        EObject this_expr_14 = null;

        EObject lv_statements_16_0 = null;

        EObject lv_statements_18_0 = null;

        EObject this_param_20 = null;

        EObject lv_exprs_22_0 = null;

        EObject lv_statements_24_0 = null;

        EObject this_expr_26 = null;

        EObject lv_statements_28_0 = null;

        EObject this_block_29 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:685:6: ( ( (this_declaration_0= ruledeclaration ruleendExpr ) | this_functionCall_2= rulefunctionCall | ( () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr ) | ( () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )? ) | ( 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) ) ) | ( 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) ) ) | this_block_29= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:686:1: ( (this_declaration_0= ruledeclaration ruleendExpr ) | this_functionCall_2= rulefunctionCall | ( () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr ) | ( () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )? ) | ( 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) ) ) | ( 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) ) ) | this_block_29= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:686:1: ( (this_declaration_0= ruledeclaration ruleendExpr ) | this_functionCall_2= rulefunctionCall | ( () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr ) | ( () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )? ) | ( 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) ) ) | ( 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) ) ) | this_block_29= ruleblock )
            int alt10=9;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
            case 21:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred10()) ) {
                    alt10=2;
                }
                else if ( (synpred11()) ) {
                    alt10=3;
                }
                else if ( (synpred12()) ) {
                    alt10=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("686:1: ( (this_declaration_0= ruledeclaration ruleendExpr ) | this_functionCall_2= rulefunctionCall | ( () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr ) | ( () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )? ) | ( 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) ) ) | ( 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) ) ) | this_block_29= ruleblock )", 10, 4, input);

                    throw nvae;
                }
                }
                break;
            case 22:
                {
                alt10=5;
                }
                break;
            case 23:
                {
                alt10=6;
                }
                break;
            case 25:
                {
                alt10=7;
                }
                break;
            case 27:
                {
                alt10=8;
                }
                break;
            case 17:
                {
                alt10=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("686:1: ( (this_declaration_0= ruledeclaration ruleendExpr ) | this_functionCall_2= rulefunctionCall | ( () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr ) | ( () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )? ) | ( 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) ) ) | ( 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) ) ) | this_block_29= ruleblock )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:686:2: (this_declaration_0= ruledeclaration ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:686:2: (this_declaration_0= ruledeclaration ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:687:2: this_declaration_0= ruledeclaration ruleendExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruledeclaration_in_rulestatement1142);
                    this_declaration_0=ruledeclaration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_declaration_0; 
                              currentNode = currentNode.getParent();
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1160);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:711:2: this_functionCall_2= rulefunctionCall
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulefunctionCall_in_rulestatement1191);
                    this_functionCall_2=rulefunctionCall();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_functionCall_2; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:6: ( () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:6: ( () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:7: () ( (lv_postFixExpression_4_0= rulepostfixExpr ) ) ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:724:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_2_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_2_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:737:2: ( (lv_postFixExpression_4_0= rulepostfixExpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:738:1: (lv_postFixExpression_4_0= rulepostfixExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:738:1: (lv_postFixExpression_4_0= rulepostfixExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:739:3: lv_postFixExpression_4_0= rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_rulestatement1230);
                    lv_postFixExpression_4_0=rulepostfixExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"postFixExpression",
                      	        		lv_postFixExpression_4_0, 
                      	        		"postfixExpr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_2_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1249);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:6: ( () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:6: ( () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:7: () ( (lv_assignments_7_0= ruleassignment ) ) ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:774:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_3_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_3_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:787:2: ( (lv_assignments_7_0= ruleassignment ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:788:1: (lv_assignments_7_0= ruleassignment )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:788:1: (lv_assignments_7_0= ruleassignment )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:789:3: lv_assignments_7_0= ruleassignment
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_3_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignment_in_rulestatement1289);
                    lv_assignments_7_0=ruleassignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"assignments",
                      	        		lv_assignments_7_0, 
                      	        		"assignment", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_3_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1308);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:6: ( () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:6: ( () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:7: () 'return' ( (lv_exprs_11_0= ruleexpr ) )? ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:823:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:824:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,22,FOLLOW_22_in_rulestatement1337); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getReturnKeyword_4_1(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:841:1: ( (lv_exprs_11_0= ruleexpr ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||(LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||LA8_0==12||LA8_0==41||(LA8_0>=45 && LA8_0<=48)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:842:1: (lv_exprs_11_0= ruleexpr )
                            {
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:842:1: (lv_exprs_11_0= ruleexpr )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:843:3: lv_exprs_11_0= ruleexpr
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_4_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpr_in_rulestatement1358);
                            lv_exprs_11_0=ruleexpr();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"exprs",
                              	        		lv_exprs_11_0, 
                              	        		"expr", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_4_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1378);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:877:6: ( 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )? )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:877:6: ( 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )? )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:877:8: 'if' this_expr_14= ruleexpr ':' ( (lv_statements_16_0= rulestatement ) ) ( 'else' ( (lv_statements_18_0= rulestatement ) ) )?
                    {
                    match(input,23,FOLLOW_23_in_rulestatement1395); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getIfKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1420);
                    this_expr_14=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_14; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,14,FOLLOW_14_in_rulestatement1429); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_5_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:897:1: ( (lv_statements_16_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:898:1: (lv_statements_16_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:898:1: (lv_statements_16_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:899:3: lv_statements_16_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1450);
                    lv_statements_16_0=rulestatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"statements",
                      	        		lv_statements_16_0, 
                      	        		"statement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:921:2: ( 'else' ( (lv_statements_18_0= rulestatement ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==24) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred15()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:921:4: 'else' ( (lv_statements_18_0= rulestatement ) )
                            {
                            match(input,24,FOLLOW_24_in_rulestatement1461); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStatementAccess().getElseKeyword_5_4_0(), null); 
                                  
                            }
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:925:1: ( (lv_statements_18_0= rulestatement ) )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:926:1: (lv_statements_18_0= rulestatement )
                            {
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:926:1: (lv_statements_18_0= rulestatement )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:927:3: lv_statements_18_0= rulestatement
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_4_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_rulestatement_in_rulestatement1482);
                            lv_statements_18_0=rulestatement();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {

                              	        if (current==null) {
                              	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                              	            associateNodeWithAstElement(currentNode.getParent(), current);
                              	        }
                              	        try {
                              	       		add(
                              	       			current, 
                              	       			"statements",
                              	        		lv_statements_18_0, 
                              	        		"statement", 
                              	        		currentNode);
                              	        } catch (ValueConverterException vce) {
                              				handleValueConverterException(vce);
                              	        }
                              	        currentNode = currentNode.getParent();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:950:6: ( 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:950:6: ( 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:950:8: 'for' this_param_20= ruleparam 'in' ( (lv_exprs_22_0= ruleexpr ) ) ':' ( (lv_statements_24_0= rulestatement ) )
                    {
                    match(input,25,FOLLOW_25_in_rulestatement1502); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getForKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getParamParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleparam_in_rulestatement1527);
                    this_param_20=ruleparam();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_param_20; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,26,FOLLOW_26_in_rulestatement1536); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getInKeyword_6_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:970:1: ( (lv_exprs_22_0= ruleexpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:971:1: (lv_exprs_22_0= ruleexpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:971:1: (lv_exprs_22_0= ruleexpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:972:3: lv_exprs_22_0= ruleexpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_6_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1557);
                    lv_exprs_22_0=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"exprs",
                      	        		lv_exprs_22_0, 
                      	        		"expr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,14,FOLLOW_14_in_rulestatement1567); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_6_4(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:998:1: ( (lv_statements_24_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:999:1: (lv_statements_24_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:999:1: (lv_statements_24_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1000:3: lv_statements_24_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_6_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1588);
                    lv_statements_24_0=rulestatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"statements",
                      	        		lv_statements_24_0, 
                      	        		"statement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1023:6: ( 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1023:6: ( 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1023:8: 'while' this_expr_26= ruleexpr ':' ( (lv_statements_28_0= rulestatement ) )
                    {
                    match(input,27,FOLLOW_27_in_rulestatement1606); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getWhileKeyword_7_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_7_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1631);
                    this_expr_26=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_26; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,14,FOLLOW_14_in_rulestatement1640); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_7_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1043:1: ( (lv_statements_28_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1044:1: (lv_statements_28_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1044:1: (lv_statements_28_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1045:3: lv_statements_28_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_7_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1661);
                    lv_statements_28_0=rulestatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getStatementRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"statements",
                      	        		lv_statements_28_0, 
                      	        		"statement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1069:2: this_block_29= ruleblock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_8(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleblock_in_rulestatement1693);
                    this_block_29=ruleblock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_block_29; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulestatement


    // $ANTLR start entryRulefunctionCall
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1088:1: entryRulefunctionCall returns [EObject current=null] : iv_rulefunctionCall= rulefunctionCall EOF ;
    public final EObject entryRulefunctionCall() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionCall = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1089:2: (iv_rulefunctionCall= rulefunctionCall EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1090:2: iv_rulefunctionCall= rulefunctionCall EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionCallRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulefunctionCall_in_entryRulefunctionCall1728);
            iv_rulefunctionCall=rulefunctionCall();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefunctionCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctionCall1738); if (failed) return current;

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
    // $ANTLR end entryRulefunctionCall


    // $ANTLR start rulefunctionCall
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1097:1: rulefunctionCall returns [EObject current=null] : ( ( ( RULE_ID ) ) '(' ( ( (lv_exprs_2_0= ruleexpr ) ) ( ',' ( (lv_exprs_4_0= ruleexpr ) ) )* )? ')' ruleendExpr ) ;
    public final EObject rulefunctionCall() throws RecognitionException {
        EObject current = null;

        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1102:6: ( ( ( ( RULE_ID ) ) '(' ( ( (lv_exprs_2_0= ruleexpr ) ) ( ',' ( (lv_exprs_4_0= ruleexpr ) ) )* )? ')' ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1103:1: ( ( ( RULE_ID ) ) '(' ( ( (lv_exprs_2_0= ruleexpr ) ) ( ',' ( (lv_exprs_4_0= ruleexpr ) ) )* )? ')' ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1103:1: ( ( ( RULE_ID ) ) '(' ( ( (lv_exprs_2_0= ruleexpr ) ) ( ',' ( (lv_exprs_4_0= ruleexpr ) ) )* )? ')' ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1103:2: ( ( RULE_ID ) ) '(' ( ( (lv_exprs_2_0= ruleexpr ) ) ( ',' ( (lv_exprs_4_0= ruleexpr ) ) )* )? ')' ruleendExpr
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1103:2: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1104:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1104:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1105:3: RULE_ID
            {
            if ( backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( backtracking==0 ) {

              			if (current==null) {
              	            current = factory.create(grammarAccess.getFunctionCallRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
                      
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunctionCall1785); if (failed) return current;
            if ( backtracking==0 ) {

              		createLeafNode(grammarAccess.getFunctionCallAccess().getFunctionFunctionDefinitionCrossReference_0_0(), "function"); 
              	
            }

            }


            }

            match(input,12,FOLLOW_12_in_rulefunctionCall1795); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1124:1: ( ( (lv_exprs_2_0= ruleexpr ) ) ( ',' ( (lv_exprs_4_0= ruleexpr ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID||(LA12_0>=RULE_INT && LA12_0<=RULE_STRING)||LA12_0==12||LA12_0==41||(LA12_0>=45 && LA12_0<=48)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1124:2: ( (lv_exprs_2_0= ruleexpr ) ) ( ',' ( (lv_exprs_4_0= ruleexpr ) ) )*
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1124:2: ( (lv_exprs_2_0= ruleexpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1125:1: (lv_exprs_2_0= ruleexpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1125:1: (lv_exprs_2_0= ruleexpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1126:3: lv_exprs_2_0= ruleexpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunctionCallAccess().getExprsExprParserRuleCall_2_0_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulefunctionCall1817);
                    lv_exprs_2_0=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getFunctionCallRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"exprs",
                      	        		lv_exprs_2_0, 
                      	        		"expr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1148:2: ( ',' ( (lv_exprs_4_0= ruleexpr ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==16) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1148:4: ',' ( (lv_exprs_4_0= ruleexpr ) )
                    	    {
                    	    match(input,16,FOLLOW_16_in_rulefunctionCall1828); if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	              createLeafNode(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0(), null); 
                    	          
                    	    }
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1152:1: ( (lv_exprs_4_0= ruleexpr ) )
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1153:1: (lv_exprs_4_0= ruleexpr )
                    	    {
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1153:1: (lv_exprs_4_0= ruleexpr )
                    	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1154:3: lv_exprs_4_0= ruleexpr
                    	    {
                    	    if ( backtracking==0 ) {
                    	       
                    	      	        currentNode=createCompositeNode(grammarAccess.getFunctionCallAccess().getExprsExprParserRuleCall_2_1_1_0(), currentNode); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleexpr_in_rulefunctionCall1849);
                    	    lv_exprs_4_0=ruleexpr();
                    	    _fsp--;
                    	    if (failed) return current;
                    	    if ( backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = factory.create(grammarAccess.getFunctionCallRule().getType().getClassifier());
                    	      	            associateNodeWithAstElement(currentNode.getParent(), current);
                    	      	        }
                    	      	        try {
                    	      	       		add(
                    	      	       			current, 
                    	      	       			"exprs",
                    	      	        		lv_exprs_4_0, 
                    	      	        		"expr", 
                    	      	        		currentNode);
                    	      	        } catch (ValueConverterException vce) {
                    	      				handleValueConverterException(vce);
                    	      	        }
                    	      	        currentNode = currentNode.getParent();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,13,FOLLOW_13_in_rulefunctionCall1863); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getFunctionCallAccess().getEndExprParserRuleCall_4(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleendExpr_in_rulefunctionCall1882);
            ruleendExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulefunctionCall


    // $ANTLR start entryRuledeclaration
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1199:1: entryRuledeclaration returns [EObject current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final EObject entryRuledeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1200:2: (iv_ruledeclaration= ruledeclaration EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1201:2: iv_ruledeclaration= ruledeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration1917);
            iv_ruledeclaration=ruledeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruledeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration1927); if (failed) return current;

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
    // $ANTLR end entryRuledeclaration


    // $ANTLR start ruledeclaration
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1208:1: ruledeclaration returns [EObject current=null] : ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? ) ;
    public final EObject ruledeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_variableType_0_0 = null;

        EObject lv_exprs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1213:6: ( ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:1: ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:1: ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:2: ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )?
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:2: ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=21)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:3: ( (lv_variableType_0_0= ruletype ) ) ( '[]' )?
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1214:3: ( (lv_variableType_0_0= ruletype ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1215:1: (lv_variableType_0_0= ruletype )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1215:1: (lv_variableType_0_0= ruletype )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1216:3: lv_variableType_0_0= ruletype
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getVariableTypeTypeParserRuleCall_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletype_in_ruledeclaration1974);
            	    lv_variableType_0_0=ruletype();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"variableType",
            	      	        		lv_variableType_0_0, 
            	      	        		"type", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1238:2: ( '[]' )?
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==28) ) {
            	        alt13=1;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1238:4: '[]'
            	            {
            	            match(input,28,FOLLOW_28_in_ruledeclaration1985); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getDeclarationAccess().getLeftSquareBracketRightSquareBracketKeyword_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1242:5: ( (lv_name_2_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1243:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1243:1: (lv_name_2_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1244:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledeclaration2006); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		set(
              	       			current, 
              	       			"name",
              	        		lv_name_2_0, 
              	        		"ID", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1266:2: ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1266:4: '=' ( (lv_exprs_4_0= ruleexpr ) )
                    {
                    match(input,29,FOLLOW_29_in_ruledeclaration2022); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1270:1: ( (lv_exprs_4_0= ruleexpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1271:1: (lv_exprs_4_0= ruleexpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1271:1: (lv_exprs_4_0= ruleexpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1272:3: lv_exprs_4_0= ruleexpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getExprsExprParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruledeclaration2043);
                    lv_exprs_4_0=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getDeclarationRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"exprs",
                      	        		lv_exprs_4_0, 
                      	        		"expr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruledeclaration


    // $ANTLR start entryRuleassignment
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1302:1: entryRuleassignment returns [EObject current=null] : iv_ruleassignment= ruleassignment EOF ;
    public final EObject entryRuleassignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1303:2: (iv_ruleassignment= ruleassignment EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1304:2: iv_ruleassignment= ruleassignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleassignment_in_entryRuleassignment2081);
            iv_ruleassignment=ruleassignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleassignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment2091); if (failed) return current;

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
    // $ANTLR end entryRuleassignment


    // $ANTLR start ruleassignment
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:1: ruleassignment returns [EObject current=null] : (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) ) ;
    public final EObject ruleassignment() throws RecognitionException {
        EObject current = null;

        EObject this_postfixExpr_0 = null;

        EObject lv_exprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1316:6: ( (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1317:1: (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1317:1: (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1318:2: this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getPostfixExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_ruleassignment2141);
            this_postfixExpr_0=rulepostfixExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_postfixExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            match(input,29,FOLLOW_29_in_ruleassignment2150); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1333:1: ( (lv_exprs_2_0= ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1334:1: (lv_exprs_2_0= ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1334:1: (lv_exprs_2_0= ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1335:3: lv_exprs_2_0= ruleexpr
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExprsExprParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleexpr_in_ruleassignment2171);
            lv_exprs_2_0=ruleexpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getAssignmentRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"exprs",
              	        		lv_exprs_2_0, 
              	        		"expr", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleassignment


    // $ANTLR start entryRuleexpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1365:1: entryRuleexpr returns [EObject current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final EObject entryRuleexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1366:2: (iv_ruleexpr= ruleexpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1367:2: iv_ruleexpr= ruleexpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr2207);
            iv_ruleexpr=ruleexpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleexpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr2217); if (failed) return current;

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
    // $ANTLR end entryRuleexpr


    // $ANTLR start ruleexpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1374:1: ruleexpr returns [EObject current=null] : (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* ) ;
    public final EObject ruleexpr() throws RecognitionException {
        EObject current = null;

        EObject this_andExpr_0 = null;

        EObject lv_andExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1379:6: ( (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1380:1: (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1380:1: (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1381:2: this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExprAccess().getAndExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleandExpr_in_ruleexpr2267);
            this_andExpr_0=ruleandExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_andExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1392:1: ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1392:3: '||' ( (lv_andExprs_2_0= ruleandExpr ) )
            	    {
            	    match(input,30,FOLLOW_30_in_ruleexpr2277); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1396:1: ( (lv_andExprs_2_0= ruleandExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1397:1: (lv_andExprs_2_0= ruleandExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1397:1: (lv_andExprs_2_0= ruleandExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1398:3: lv_andExprs_2_0= ruleandExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExprAccess().getAndExprsAndExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleandExpr_in_ruleexpr2298);
            	    lv_andExprs_2_0=ruleandExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"andExprs",
            	      	        		lv_andExprs_2_0, 
            	      	        		"andExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleexpr


    // $ANTLR start entryRuleandExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1428:1: entryRuleandExpr returns [EObject current=null] : iv_ruleandExpr= ruleandExpr EOF ;
    public final EObject entryRuleandExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleandExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1429:2: (iv_ruleandExpr= ruleandExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1430:2: iv_ruleandExpr= ruleandExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_entryRuleandExpr2336);
            iv_ruleandExpr=ruleandExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleandExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpr2346); if (failed) return current;

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
    // $ANTLR end entryRuleandExpr


    // $ANTLR start ruleandExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1437:1: ruleandExpr returns [EObject current=null] : (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* ) ;
    public final EObject ruleandExpr() throws RecognitionException {
        EObject current = null;

        EObject this_eqExpr_0 = null;

        EObject lv_eqExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1442:6: ( (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1443:1: (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1443:1: (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1444:2: this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleeqExpr_in_ruleandExpr2396);
            this_eqExpr_0=ruleeqExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_eqExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1455:1: ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1455:3: '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) )
            	    {
            	    match(input,31,FOLLOW_31_in_ruleandExpr2406); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1459:1: ( (lv_eqExprs_2_0= ruleeqExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1460:1: (lv_eqExprs_2_0= ruleeqExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1460:1: (lv_eqExprs_2_0= ruleeqExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1461:3: lv_eqExprs_2_0= ruleeqExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExprAccess().getEqExprsEqExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleeqExpr_in_ruleandExpr2427);
            	    lv_eqExprs_2_0=ruleeqExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAndExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"eqExprs",
            	      	        		lv_eqExprs_2_0, 
            	      	        		"eqExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleandExpr


    // $ANTLR start entryRuleeqExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1491:1: entryRuleeqExpr returns [EObject current=null] : iv_ruleeqExpr= ruleeqExpr EOF ;
    public final EObject entryRuleeqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleeqExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1492:2: (iv_ruleeqExpr= ruleeqExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1493:2: iv_ruleeqExpr= ruleeqExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEqExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_entryRuleeqExpr2465);
            iv_ruleeqExpr=ruleeqExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleeqExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleeqExpr2475); if (failed) return current;

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
    // $ANTLR end entryRuleeqExpr


    // $ANTLR start ruleeqExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1500:1: ruleeqExpr returns [EObject current=null] : (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* ) ;
    public final EObject ruleeqExpr() throws RecognitionException {
        EObject current = null;

        EObject this_relExpr_0 = null;

        EObject lv_relExprs_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1505:6: ( (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1506:1: (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1506:1: (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1507:2: this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulerelExpr_in_ruleeqExpr2525);
            this_relExpr_0=rulerelExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_relExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1518:1: ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=32 && LA19_0<=33)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1518:2: ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1518:2: ( '==' | '!=' )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( (LA18_0==32) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==33) ) {
            	        alt18=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1518:2: ( '==' | '!=' )", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1518:4: '=='
            	            {
            	            match(input,32,FOLLOW_32_in_ruleeqExpr2536); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1523:7: '!='
            	            {
            	            match(input,33,FOLLOW_33_in_ruleeqExpr2552); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getEqExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1527:2: ( (lv_relExprs_3_0= rulerelExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1528:1: (lv_relExprs_3_0= rulerelExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1528:1: (lv_relExprs_3_0= rulerelExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1529:3: lv_relExprs_3_0= rulerelExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEqExprAccess().getRelExprsRelExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulerelExpr_in_ruleeqExpr2574);
            	    lv_relExprs_3_0=rulerelExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getEqExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"relExprs",
            	      	        		lv_relExprs_3_0, 
            	      	        		"relExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleeqExpr


    // $ANTLR start entryRulerelExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1559:1: entryRulerelExpr returns [EObject current=null] : iv_rulerelExpr= rulerelExpr EOF ;
    public final EObject entryRulerelExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1560:2: (iv_rulerelExpr= rulerelExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1561:2: iv_rulerelExpr= rulerelExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_entryRulerelExpr2612);
            iv_rulerelExpr=rulerelExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulerelExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelExpr2622); if (failed) return current;

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
    // $ANTLR end entryRulerelExpr


    // $ANTLR start rulerelExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1568:1: rulerelExpr returns [EObject current=null] : (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* ) ;
    public final EObject rulerelExpr() throws RecognitionException {
        EObject current = null;

        EObject this_addExpr_0 = null;

        EObject lv_addExpr_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1573:6: ( (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1574:1: (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1574:1: (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1575:2: this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rulerelExpr2672);
            this_addExpr_0=ruleaddExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_addExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1586:1: ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=34 && LA21_0<=37)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1586:2: ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1586:2: ( '<' | '>' | '<=' | '>=' )
            	    int alt20=4;
            	    switch ( input.LA(1) ) {
            	    case 34:
            	        {
            	        alt20=1;
            	        }
            	        break;
            	    case 35:
            	        {
            	        alt20=2;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt20=3;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt20=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1586:2: ( '<' | '>' | '<=' | '>=' )", 20, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt20) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1586:4: '<'
            	            {
            	            match(input,34,FOLLOW_34_in_rulerelExpr2683); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1591:7: '>'
            	            {
            	            match(input,35,FOLLOW_35_in_rulerelExpr2699); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1596:7: '<='
            	            {
            	            match(input,36,FOLLOW_36_in_rulerelExpr2715); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1601:7: '>='
            	            {
            	            match(input,37,FOLLOW_37_in_rulerelExpr2731); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getGreaterThanSignEqualsSignKeyword_1_0_3(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1605:2: ( (lv_addExpr_5_0= ruleaddExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1606:1: (lv_addExpr_5_0= ruleaddExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1606:1: (lv_addExpr_5_0= ruleaddExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1607:3: lv_addExpr_5_0= ruleaddExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRelExprAccess().getAddExprAddExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleaddExpr_in_rulerelExpr2753);
            	    lv_addExpr_5_0=ruleaddExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRelExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"addExpr",
            	      	        		lv_addExpr_5_0, 
            	      	        		"addExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulerelExpr


    // $ANTLR start entryRuleaddExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1637:1: entryRuleaddExpr returns [EObject current=null] : iv_ruleaddExpr= ruleaddExpr EOF ;
    public final EObject entryRuleaddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaddExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1638:2: (iv_ruleaddExpr= ruleaddExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1639:2: iv_ruleaddExpr= ruleaddExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_entryRuleaddExpr2791);
            iv_ruleaddExpr=ruleaddExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleaddExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaddExpr2801); if (failed) return current;

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
    // $ANTLR end entryRuleaddExpr


    // $ANTLR start ruleaddExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1646:1: ruleaddExpr returns [EObject current=null] : (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* ) ;
    public final EObject ruleaddExpr() throws RecognitionException {
        EObject current = null;

        EObject this_mulExpr_0 = null;

        EObject lv_mulExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1651:6: ( (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1652:1: (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1652:1: (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1653:2: this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulemulExpr_in_ruleaddExpr2851);
            this_mulExpr_0=rulemulExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_mulExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1664:1: ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_SIGN) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1664:2: RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) )
            	    {
            	    match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_ruleaddExpr2860); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getAddExprAccess().getSignTerminalRuleCall_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1668:1: ( (lv_mulExprs_2_0= rulemulExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1669:1: (lv_mulExprs_2_0= rulemulExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1669:1: (lv_mulExprs_2_0= rulemulExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1670:3: lv_mulExprs_2_0= rulemulExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExprAccess().getMulExprsMulExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemulExpr_in_ruleaddExpr2880);
            	    lv_mulExprs_2_0=rulemulExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getAddExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"mulExprs",
            	      	        		lv_mulExprs_2_0, 
            	      	        		"mulExpr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

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

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleaddExpr


    // $ANTLR start entryRulemulExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1700:1: entryRulemulExpr returns [EObject current=null] : iv_rulemulExpr= rulemulExpr EOF ;
    public final EObject entryRulemulExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemulExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1701:2: (iv_rulemulExpr= rulemulExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1702:2: iv_rulemulExpr= rulemulExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMulExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_entryRulemulExpr2918);
            iv_rulemulExpr=rulemulExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemulExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemulExpr2928); if (failed) return current;

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
    // $ANTLR end entryRulemulExpr


    // $ANTLR start rulemulExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1709:1: rulemulExpr returns [EObject current=null] : ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* ) ;
    public final EObject rulemulExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_atoms_0_0 = null;

        EObject lv_atoms_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1714:6: ( ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:1: ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:1: ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:2: ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:2: ( (lv_atoms_0_0= ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1716:1: (lv_atoms_0_0= ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1716:1: (lv_atoms_0_0= ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1717:3: lv_atoms_0_0= ruleatom
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleatom_in_rulemulExpr2974);
            lv_atoms_0_0=ruleatom();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getMulExprRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode.getParent(), current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"atoms",
              	        		lv_atoms_0_0, 
              	        		"atom", 
              	        		currentNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	        currentNode = currentNode.getParent();
              	    
            }

            }


            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1739:2: ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=38 && LA24_0<=40)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1739:3: ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1739:3: ( '*' | '/' | '%' )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 38:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1739:3: ( '*' | '/' | '%' )", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1739:5: '*'
            	            {
            	            match(input,38,FOLLOW_38_in_rulemulExpr2986); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1744:7: '/'
            	            {
            	            match(input,39,FOLLOW_39_in_rulemulExpr3002); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1749:7: '%'
            	            {
            	            match(input,40,FOLLOW_40_in_rulemulExpr3018); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getPercentSignKeyword_1_0_2(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1753:2: ( (lv_atoms_4_0= ruleatom ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1754:1: (lv_atoms_4_0= ruleatom )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1754:1: (lv_atoms_4_0= ruleatom )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1755:3: lv_atoms_4_0= ruleatom
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleatom_in_rulemulExpr3040);
            	    lv_atoms_4_0=ruleatom();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getMulExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"atoms",
            	      	        		lv_atoms_4_0, 
            	      	        		"atom", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulemulExpr


    // $ANTLR start entryRuleatom
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1785:1: entryRuleatom returns [EObject current=null] : iv_ruleatom= ruleatom EOF ;
    public final EObject entryRuleatom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatom = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1786:2: (iv_ruleatom= ruleatom EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1787:2: iv_ruleatom= ruleatom EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleatom_in_entryRuleatom3078);
            iv_ruleatom=ruleatom();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleatom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleatom3088); if (failed) return current;

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
    // $ANTLR end entryRuleatom


    // $ANTLR start ruleatom
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1794:1: ruleatom returns [EObject current=null] : ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) ) ;
    public final EObject ruleatom() throws RecognitionException {
        EObject current = null;

        EObject this_atom_1 = null;

        EObject this_expr_4 = null;

        EObject this_expr_7 = null;

        EObject this_postfixExpr_9 = null;

        EObject lv_constants_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1799:6: ( ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1800:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1800:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt25=1;
                }
                break;
            case 12:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==RULE_SIGN) ) {
                    alt25=2;
                }
                else if ( (LA25_2==RULE_ID||(LA25_2>=RULE_INT && LA25_2<=RULE_STRING)||LA25_2==12||LA25_2==41||(LA25_2>=45 && LA25_2<=48)) ) {
                    alt25=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1800:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )", 25, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt25=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt25=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1800:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1800:2: ( '!' this_atom_1= ruleatom )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1800:2: ( '!' this_atom_1= ruleatom )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1800:4: '!' this_atom_1= ruleatom
                    {
                    match(input,41,FOLLOW_41_in_ruleatom3124); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getExclamationMarkKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getAtomParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleatom_in_ruleatom3149);
                    this_atom_1=ruleatom();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_atom_1; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1817:6: ( '(' RULE_SIGN this_expr_4= ruleexpr ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1817:6: ( '(' RULE_SIGN this_expr_4= ruleexpr ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1817:8: '(' RULE_SIGN this_expr_4= ruleexpr ')'
                    {
                    match(input,12,FOLLOW_12_in_ruleatom3166); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_ruleatom3175); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAtomAccess().getSignTerminalRuleCall_1_1(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_1_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3199);
                    this_expr_4=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,13,FOLLOW_13_in_ruleatom3208); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1842:6: ( '(' this_expr_7= ruleexpr ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1842:6: ( '(' this_expr_7= ruleexpr ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1842:8: '(' this_expr_7= ruleexpr ')'
                    {
                    match(input,12,FOLLOW_12_in_ruleatom3226); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3251);
                    this_expr_7=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_7; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,13,FOLLOW_13_in_ruleatom3260); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1864:2: this_postfixExpr_9= rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getPostfixExprParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_ruleatom3292);
                    this_postfixExpr_9=rulepostfixExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_postfixExpr_9; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1876:6: ( () ( (lv_constants_11_0= ruleconstant ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1876:6: ( () ( (lv_constants_11_0= ruleconstant ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1876:7: () ( (lv_constants_11_0= ruleconstant ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1876:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1877:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getAtomAccess().getAtomAction_4_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getAtomAccess().getAtomAction_4_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1890:2: ( (lv_constants_11_0= ruleconstant ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1891:1: (lv_constants_11_0= ruleconstant )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1891:1: (lv_constants_11_0= ruleconstant )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1892:3: lv_constants_11_0= ruleconstant
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomAccess().getConstantsConstantParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconstant_in_ruleatom3331);
                    lv_constants_11_0=ruleconstant();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getAtomRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"constants",
                      	        		lv_constants_11_0, 
                      	        		"constant", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleatom


    // $ANTLR start entryRulepostfixExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1922:1: entryRulepostfixExpr returns [EObject current=null] : iv_rulepostfixExpr= rulepostfixExpr EOF ;
    public final EObject entryRulepostfixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepostfixExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1923:2: (iv_rulepostfixExpr= rulepostfixExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1924:2: iv_rulepostfixExpr= rulepostfixExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPostfixExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr3368);
            iv_rulepostfixExpr=rulepostfixExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulepostfixExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepostfixExpr3378); if (failed) return current;

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
    // $ANTLR end entryRulepostfixExpr


    // $ANTLR start rulepostfixExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1931:1: rulepostfixExpr returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* ) ;
    public final EObject rulepostfixExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_6_0 = null;

        EObject lv_expressions_8_0 = null;

        EObject lv_expressions_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1936:6: ( ( () ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1937:1: ( () ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1937:1: ( () ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1937:2: () ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1937:2: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1938:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getPostfixExprAccess().getPostfixExprAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getPostfixExprAccess().getPostfixExprAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1951:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (synpred40()) ) {
                    alt26=1;
                }
                else if ( (true) ) {
                    alt26=2;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1951:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1951:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1951:3: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1951:3: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1952:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1952:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1953:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3438); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationCrossReference_1_0_0(), "existingVariable"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1969:6: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1969:6: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1970:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1970:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1971:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3466); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPostfixExprAccess().getExistingVariableParamCrossReference_1_1_0(), "existingVariable"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1986:3: ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )*
            loop29:
            do {
                int alt29=4;
                switch ( input.LA(1) ) {
                case 42:
                    {
                    alt29=1;
                    }
                    break;
                case 12:
                    {
                    alt29=2;
                    }
                    break;
                case 43:
                    {
                    alt29=3;
                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1986:4: ( '.' RULE_ID )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1986:4: ( '.' RULE_ID )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1986:6: '.' RULE_ID
            	    {
            	    match(input,42,FOLLOW_42_in_rulepostfixExpr3479); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getFullStopKeyword_2_0_0(), null); 
            	          
            	    }
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3488); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_2_0_1(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1995:6: ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1995:6: ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1995:8: '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')'
            	    {
            	    match(input,12,FOLLOW_12_in_rulepostfixExpr3505); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_2_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1999:1: ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )?
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==RULE_ID||(LA28_0>=RULE_INT && LA28_0<=RULE_STRING)||LA28_0==12||LA28_0==41||(LA28_0>=45 && LA28_0<=48)) ) {
            	        alt28=1;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1999:2: ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )*
            	            {
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1999:2: ( (lv_expressions_6_0= ruleexpr ) )
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2000:1: (lv_expressions_6_0= ruleexpr )
            	            {
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2000:1: (lv_expressions_6_0= ruleexpr )
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2001:3: lv_expressions_6_0= ruleexpr
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_1_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3527);
            	            lv_expressions_6_0=ruleexpr();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
            	              	            associateNodeWithAstElement(currentNode.getParent(), current);
            	              	        }
            	              	        try {
            	              	       		add(
            	              	       			current, 
            	              	       			"expressions",
            	              	        		lv_expressions_6_0, 
            	              	        		"expr", 
            	              	        		currentNode);
            	              	        } catch (ValueConverterException vce) {
            	              				handleValueConverterException(vce);
            	              	        }
            	              	        currentNode = currentNode.getParent();
            	              	    
            	            }

            	            }


            	            }

            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2023:2: ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )*
            	            loop27:
            	            do {
            	                int alt27=2;
            	                int LA27_0 = input.LA(1);

            	                if ( (LA27_0==16) ) {
            	                    alt27=1;
            	                }


            	                switch (alt27) {
            	            	case 1 :
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2023:4: ',' ( (lv_expressions_8_0= ruleexpr ) )
            	            	    {
            	            	    match(input,16,FOLLOW_16_in_rulepostfixExpr3538); if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	              createLeafNode(grammarAccess.getPostfixExprAccess().getCommaKeyword_2_1_1_1_0(), null); 
            	            	          
            	            	    }
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2027:1: ( (lv_expressions_8_0= ruleexpr ) )
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2028:1: (lv_expressions_8_0= ruleexpr )
            	            	    {
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2028:1: (lv_expressions_8_0= ruleexpr )
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2029:3: lv_expressions_8_0= ruleexpr
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_1_1_1_1_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3559);
            	            	    lv_expressions_8_0=ruleexpr();
            	            	    _fsp--;
            	            	    if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
            	            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	            	      	        }
            	            	      	        try {
            	            	      	       		add(
            	            	      	       			current, 
            	            	      	       			"expressions",
            	            	      	        		lv_expressions_8_0, 
            	            	      	        		"expr", 
            	            	      	        		currentNode);
            	            	      	        } catch (ValueConverterException vce) {
            	            	      				handleValueConverterException(vce);
            	            	      	        }
            	            	      	        currentNode = currentNode.getParent();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop27;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    match(input,13,FOLLOW_13_in_rulepostfixExpr3573); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_2_1_2(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2056:6: ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2056:6: ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2056:8: '[' ( (lv_expressions_11_0= ruleexpr ) ) ']'
            	    {
            	    match(input,43,FOLLOW_43_in_rulepostfixExpr3591); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_2_2_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2060:1: ( (lv_expressions_11_0= ruleexpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2061:1: (lv_expressions_11_0= ruleexpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2061:1: (lv_expressions_11_0= ruleexpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2062:3: lv_expressions_11_0= ruleexpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3612);
            	    lv_expressions_11_0=ruleexpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getPostfixExprRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode.getParent(), current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"expressions",
            	      	        		lv_expressions_11_0, 
            	      	        		"expr", 
            	      	        		currentNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	        currentNode = currentNode.getParent();
            	      	    
            	    }

            	    }


            	    }

            	    match(input,44,FOLLOW_44_in_rulepostfixExpr3622); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_2_2_2(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulepostfixExpr


    // $ANTLR start entryRuleconstant
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2096:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2097:2: (iv_ruleconstant= ruleconstant EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2098:2: iv_ruleconstant= ruleconstant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant3661);
            iv_ruleconstant=ruleconstant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant3671); if (failed) return current;

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
    // $ANTLR end entryRuleconstant


    // $ANTLR start ruleconstant
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2105:1: ruleconstant returns [EObject current=null] : ( 'true' | 'false' | ( (lv_Real_2_0= rulereal ) ) | ( (lv_Integer_3_0= RULE_INT ) ) | ( (lv_String_4_0= RULE_STRING ) ) | ( (lv_Null_5_0= 'null' ) ) | ( (lv_Infinity_6_0= 'infty' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_Integer_3_0=null;
        Token lv_String_4_0=null;
        Token lv_Null_5_0=null;
        Token lv_Infinity_6_0=null;
        EObject lv_Real_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2110:6: ( ( 'true' | 'false' | ( (lv_Real_2_0= rulereal ) ) | ( (lv_Integer_3_0= RULE_INT ) ) | ( (lv_String_4_0= RULE_STRING ) ) | ( (lv_Null_5_0= 'null' ) ) | ( (lv_Infinity_6_0= 'infty' ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2111:1: ( 'true' | 'false' | ( (lv_Real_2_0= rulereal ) ) | ( (lv_Integer_3_0= RULE_INT ) ) | ( (lv_String_4_0= RULE_STRING ) ) | ( (lv_Null_5_0= 'null' ) ) | ( (lv_Infinity_6_0= 'infty' ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2111:1: ( 'true' | 'false' | ( (lv_Real_2_0= rulereal ) ) | ( (lv_Integer_3_0= RULE_INT ) ) | ( (lv_String_4_0= RULE_STRING ) ) | ( (lv_Null_5_0= 'null' ) ) | ( (lv_Infinity_6_0= 'infty' ) ) )
            int alt30=7;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt30=1;
                }
                break;
            case 46:
                {
                alt30=2;
                }
                break;
            case RULE_INT:
                {
                int LA30_3 = input.LA(2);

                if ( (LA30_3==42) ) {
                    alt30=3;
                }
                else if ( (LA30_3==EOF||LA30_3==RULE_SIGN||(LA30_3>=13 && LA30_3<=14)||LA30_3==16||(LA30_3>=30 && LA30_3<=40)||LA30_3==44||LA30_3==49) ) {
                    alt30=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2111:1: ( 'true' | 'false' | ( (lv_Real_2_0= rulereal ) ) | ( (lv_Integer_3_0= RULE_INT ) ) | ( (lv_String_4_0= RULE_STRING ) ) | ( (lv_Null_5_0= 'null' ) ) | ( (lv_Infinity_6_0= 'infty' ) ) )", 30, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt30=5;
                }
                break;
            case 47:
                {
                alt30=6;
                }
                break;
            case 48:
                {
                alt30=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2111:1: ( 'true' | 'false' | ( (lv_Real_2_0= rulereal ) ) | ( (lv_Integer_3_0= RULE_INT ) ) | ( (lv_String_4_0= RULE_STRING ) ) | ( (lv_Null_5_0= 'null' ) ) | ( (lv_Infinity_6_0= 'infty' ) ) )", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2111:3: 'true'
                    {
                    match(input,45,FOLLOW_45_in_ruleconstant3706); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getTrueKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2116:7: 'false'
                    {
                    match(input,46,FOLLOW_46_in_ruleconstant3722); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getFalseKeyword_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2121:6: ( (lv_Real_2_0= rulereal ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2121:6: ( (lv_Real_2_0= rulereal ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2122:1: (lv_Real_2_0= rulereal )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2122:1: (lv_Real_2_0= rulereal )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2123:3: lv_Real_2_0= rulereal
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getRealRealParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulereal_in_ruleconstant3749);
                    lv_Real_2_0=rulereal();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode.getParent(), current);
                      	        }
                      	        try {
                      	       		add(
                      	       			current, 
                      	       			"Real",
                      	        		lv_Real_2_0, 
                      	        		"real", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2146:6: ( (lv_Integer_3_0= RULE_INT ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2146:6: ( (lv_Integer_3_0= RULE_INT ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2147:1: (lv_Integer_3_0= RULE_INT )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2147:1: (lv_Integer_3_0= RULE_INT )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2148:3: lv_Integer_3_0= RULE_INT
                    {
                    lv_Integer_3_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleconstant3772); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getConstantAccess().getIntegerINTTerminalRuleCall_3_0(), "Integer"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"Integer",
                      	        		lv_Integer_3_0, 
                      	        		"INT", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2171:6: ( (lv_String_4_0= RULE_STRING ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2171:6: ( (lv_String_4_0= RULE_STRING ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2172:1: (lv_String_4_0= RULE_STRING )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2172:1: (lv_String_4_0= RULE_STRING )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2173:3: lv_String_4_0= RULE_STRING
                    {
                    lv_String_4_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant3800); if (failed) return current;
                    if ( backtracking==0 ) {

                      			createLeafNode(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0(), "String"); 
                      		
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        try {
                      	       		set(
                      	       			current, 
                      	       			"String",
                      	        		lv_String_4_0, 
                      	        		"STRING", 
                      	        		lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2196:6: ( (lv_Null_5_0= 'null' ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2196:6: ( (lv_Null_5_0= 'null' ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2197:1: (lv_Null_5_0= 'null' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2197:1: (lv_Null_5_0= 'null' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2198:3: lv_Null_5_0= 'null'
                    {
                    lv_Null_5_0=(Token)input.LT(1);
                    match(input,47,FOLLOW_47_in_ruleconstant3829); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getNullNullKeyword_5_0(), "Null"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "Null", lv_Null_5_0, "null", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2218:6: ( (lv_Infinity_6_0= 'infty' ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2218:6: ( (lv_Infinity_6_0= 'infty' ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2219:1: (lv_Infinity_6_0= 'infty' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2219:1: (lv_Infinity_6_0= 'infty' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2220:3: lv_Infinity_6_0= 'infty'
                    {
                    lv_Infinity_6_0=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleconstant3866); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0(), "Infinity"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "Infinity", lv_Infinity_6_0, "infty", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleconstant


    // $ANTLR start entryRulereal
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2247:1: entryRulereal returns [EObject current=null] : iv_rulereal= rulereal EOF ;
    public final EObject entryRulereal() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereal = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2248:2: (iv_rulereal= rulereal EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2249:2: iv_rulereal= rulereal EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRealRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulereal_in_entryRulereal3915);
            iv_rulereal=rulereal();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulereal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulereal3925); if (failed) return current;

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
    // $ANTLR end entryRulereal


    // $ANTLR start rulereal
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2256:1: rulereal returns [EObject current=null] : ( ( (lv_real_0_0= RULE_INT ) ) '.' ( (lv_real_2_0= RULE_INT ) )+ ) ;
    public final EObject rulereal() throws RecognitionException {
        EObject current = null;

        Token lv_real_0_0=null;
        Token lv_real_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2261:6: ( ( ( (lv_real_0_0= RULE_INT ) ) '.' ( (lv_real_2_0= RULE_INT ) )+ ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2262:1: ( ( (lv_real_0_0= RULE_INT ) ) '.' ( (lv_real_2_0= RULE_INT ) )+ )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2262:1: ( ( (lv_real_0_0= RULE_INT ) ) '.' ( (lv_real_2_0= RULE_INT ) )+ )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2262:2: ( (lv_real_0_0= RULE_INT ) ) '.' ( (lv_real_2_0= RULE_INT ) )+
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2262:2: ( (lv_real_0_0= RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2263:1: (lv_real_0_0= RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2263:1: (lv_real_0_0= RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2264:3: lv_real_0_0= RULE_INT
            {
            lv_real_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rulereal3967); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getRealAccess().getRealINTTerminalRuleCall_0_0(), "real"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getRealRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"real",
              	        		lv_real_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,42,FOLLOW_42_in_rulereal3982); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getRealAccess().getFullStopKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2290:1: ( (lv_real_2_0= RULE_INT ) )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_INT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2291:1: (lv_real_2_0= RULE_INT )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2291:1: (lv_real_2_0= RULE_INT )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2292:3: lv_real_2_0= RULE_INT
            	    {
            	    lv_real_2_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_rulereal3999); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getRealAccess().getRealINTTerminalRuleCall_2_0(), "real"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getRealRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"real",
            	      	        		lv_real_2_0, 
            	      	        		"INT", 
            	      	        		lastConsumedNode);
            	      	        } catch (ValueConverterException vce) {
            	      				handleValueConverterException(vce);
            	      	        }
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);


            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
                  	lastConsumedNode = currentNode;
                  
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
    // $ANTLR end rulereal


    // $ANTLR start entryRuleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2322:1: entryRuleendExpr returns [String current=null] : iv_ruleendExpr= ruleendExpr EOF ;
    public final String entryRuleendExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleendExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2323:2: (iv_ruleendExpr= ruleendExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2324:2: iv_ruleendExpr= ruleendExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEndExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_entryRuleendExpr4042);
            iv_ruleendExpr=ruleendExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleendExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleendExpr4053); if (failed) return current;

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
    // $ANTLR end entryRuleendExpr


    // $ANTLR start ruleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2331:1: ruleendExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleendExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2336:6: ( (kw= ',' | kw= ';' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2337:1: (kw= ',' | kw= ';' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2337:1: (kw= ',' | kw= ';' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            else if ( (LA32_0==49) ) {
                alt32=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2337:1: (kw= ',' | kw= ';' )", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2338:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleendExpr4091); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEndExprAccess().getCommaKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2345:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,49,FOLLOW_49_in_ruleendExpr4110); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEndExprAccess().getSemicolonKeyword_1(), null); 
                          
                    }

                    }
                    break;

            }


            }

            if ( backtracking==0 ) {
               resetLookahead(); 
              	    lastConsumedNode = currentNode;
                  
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
    // $ANTLR end ruleendExpr

    // $ANTLR start synpred10
    public final void synpred10_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:711:2: ( rulefunctionCall )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:711:2: rulefunctionCall
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_rulefunctionCall_in_synpred101191);
        rulefunctionCall();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:6: ( ( () ( ( rulepostfixExpr ) ) ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:6: ( () ( ( rulepostfixExpr ) ) ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:6: ( () ( ( rulepostfixExpr ) ) ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:7: () ( ( rulepostfixExpr ) ) ruleendExpr
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:723:7: ()
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:724:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:737:2: ( ( rulepostfixExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:738:1: ( rulepostfixExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:738:1: ( rulepostfixExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:739:3: rulepostfixExpr
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulepostfixExpr_in_synpred111230);
        rulepostfixExpr();
        _fsp--;
        if (failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleendExpr_in_synpred111249);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:6: ( ( () ( ( ruleassignment ) ) ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:6: ( () ( ( ruleassignment ) ) ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:6: ( () ( ( ruleassignment ) ) ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:7: () ( ( ruleassignment ) ) ruleendExpr
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:773:7: ()
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:774:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:787:2: ( ( ruleassignment ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:788:1: ( ruleassignment )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:788:1: ( ruleassignment )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:789:3: ruleassignment
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_3_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleassignment_in_synpred121289);
        ruleassignment();
        _fsp--;
        if (failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleendExpr_in_synpred121308);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:921:4: ( 'else' ( ( rulestatement ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:921:4: 'else' ( ( rulestatement ) )
        {
        match(input,24,FOLLOW_24_in_synpred151461); if (failed) return ;
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:925:1: ( ( rulestatement ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:926:1: ( rulestatement )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:926:1: ( rulestatement )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:927:3: rulestatement
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred151482);
        rulestatement();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1951:3: ( ( ( RULE_ID ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1951:3: ( ( RULE_ID ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1951:3: ( ( RULE_ID ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1952:1: ( RULE_ID )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1952:1: ( RULE_ID )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1953:3: RULE_ID
        {
        if ( backtracking==0 ) {
           
          		  /* */ 
          		
        }
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred403438); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred40

    public final boolean synpred15() {
        backtracking++;
        int start = input.mark();
        try {
            synpred15_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred40() {
        backtracking++;
        int start = input.mark();
        try {
            synpred40_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred10() {
        backtracking++;
        int start = input.mark();
        try {
            synpred10_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred11() {
        backtracking++;
        int start = input.mark();
        try {
            synpred11_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred12() {
        backtracking++;
        int start = input.mark();
        try {
            synpred12_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_ruleModel137 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_rulemainFunction_in_ruleModel159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_entryRulefunctionDefinition195 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctionDefinition205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunctionDefinition247 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulefunctionDefinition262 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_ruleformalParams_in_rulefunctionDefinition283 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulefunctionDefinition294 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_rulefunctionDefinition305 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_ruletype_in_rulefunctionDefinition326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunctionDefinition349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemainFunction_in_entryRulemainFunction385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemainFunction395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulemainFunction438 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulemainFunction461 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_ruleformalParams_in_rulemainFunction482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulemainFunction493 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleblock_in_rulemainFunction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_entryRuleformalParams550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformalParams560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_ruleformalParams606 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleformalParams617 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_ruleparam_in_ruleformalParams638 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleparam_in_entryRuleparam676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparam686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparam736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparam752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleblock850 = new BitSet(new long[]{0x000000000AFE0010L});
    public static final BitSet FOLLOW_rulestatement_in_ruleblock871 = new BitSet(new long[]{0x000000000AFE0010L});
    public static final BitSet FOLLOW_18_in_ruleblock882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruletype972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruletype1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruletype1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rulestatement1142 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionCall_in_rulestatement1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rulestatement1230 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_rulestatement1289 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulestatement1337 = new BitSet(new long[]{0x0003E200000110D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1358 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulestatement1395 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1420 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1429 = new BitSet(new long[]{0x000000000AFA0010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1450 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulestatement1461 = new BitSet(new long[]{0x000000000AFA0010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulestatement1502 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_ruleparam_in_rulestatement1527 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulestatement1536 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1557 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1567 = new BitSet(new long[]{0x000000000AFA0010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rulestatement1606 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1631 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1640 = new BitSet(new long[]{0x000000000AFA0010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rulestatement1693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionCall_in_entryRulefunctionCall1728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctionCall1738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunctionCall1785 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulefunctionCall1795 = new BitSet(new long[]{0x0001E200000030D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulefunctionCall1817 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_rulefunctionCall1828 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulefunctionCall1849 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_rulefunctionCall1863 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulefunctionCall1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration1917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruledeclaration1974 = new BitSet(new long[]{0x0000000010380010L});
    public static final BitSet FOLLOW_28_in_ruledeclaration1985 = new BitSet(new long[]{0x0000000000380010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledeclaration2006 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruledeclaration2022 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruledeclaration2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_entryRuleassignment2081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment2091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_ruleassignment2141 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleassignment2150 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleassignment2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr2207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr2217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_ruleexpr2267 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleexpr2277 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleandExpr_in_ruleexpr2298 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_entryRuleandExpr2336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpr2346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_ruleandExpr2396 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleandExpr2406 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleeqExpr_in_ruleandExpr2427 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_entryRuleeqExpr2465 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeqExpr2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_ruleeqExpr2525 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32_in_ruleeqExpr2536 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_33_in_ruleeqExpr2552 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_rulerelExpr_in_ruleeqExpr2574 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_entryRulerelExpr2612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelExpr2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rulerelExpr2672 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_34_in_rulerelExpr2683 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_35_in_rulerelExpr2699 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_36_in_rulerelExpr2715 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_37_in_rulerelExpr2731 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rulerelExpr2753 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_entryRuleaddExpr2791 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaddExpr2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_ruleaddExpr2851 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SIGN_in_ruleaddExpr2860 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_rulemulExpr_in_ruleaddExpr2880 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulemulExpr_in_entryRulemulExpr2918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemulExpr2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rulemulExpr2974 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_38_in_rulemulExpr2986 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_39_in_rulemulExpr3002 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_40_in_rulemulExpr3018 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleatom_in_rulemulExpr3040 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleatom_in_entryRuleatom3078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleatom3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleatom3124 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleatom_in_ruleatom3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleatom3166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SIGN_in_ruleatom3175 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3199 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleatom3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleatom3226 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3251 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleatom3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_ruleatom3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleatom3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr3368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepostfixExpr3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3438 = new BitSet(new long[]{0x00000C0000001002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3466 = new BitSet(new long[]{0x00000C0000001002L});
    public static final BitSet FOLLOW_42_in_rulepostfixExpr3479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3488 = new BitSet(new long[]{0x00000C0000001002L});
    public static final BitSet FOLLOW_12_in_rulepostfixExpr3505 = new BitSet(new long[]{0x0001E200000030D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3527 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_rulepostfixExpr3538 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3559 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_rulepostfixExpr3573 = new BitSet(new long[]{0x00000C0000001002L});
    public static final BitSet FOLLOW_43_in_rulepostfixExpr3591 = new BitSet(new long[]{0x0001E200000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3612 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_rulepostfixExpr3622 = new BitSet(new long[]{0x00000C0000001002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant3661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleconstant3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleconstant3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_in_ruleconstant3749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleconstant3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleconstant3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleconstant3866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_in_entryRulereal3915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rulereal3967 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_rulereal3982 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulereal3999 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleendExpr_in_entryRuleendExpr4042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendExpr4053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleendExpr4091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleendExpr4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionCall_in_synpred101191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_synpred111230 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred111249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_synpred121289 = new BitSet(new long[]{0x0002000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred121308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_synpred151461 = new BitSet(new long[]{0x000000000AFA0010L});
    public static final BitSet FOLLOW_rulestatement_in_synpred151482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred403438 = new BitSet(new long[]{0x0000000000000002L});

}