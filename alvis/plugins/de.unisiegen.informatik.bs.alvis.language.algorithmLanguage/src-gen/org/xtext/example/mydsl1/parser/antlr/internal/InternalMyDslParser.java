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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'main'", "','", "'begin'", "'end'", "'String'", "'Integer'", "'Boolean'", "'Graph'", "'Vertex'", "'Edge'", "'return'", "'if'", "'else'", "'for'", "'in'", "'while'", "'[]'", "'='", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'%'", "'!'", "'.'", "'['", "']'", "'true'", "'false'", "'null'", "'infty'", "';'"
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
            ruleMemo = new HashMap[96+1];
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

            if ( ((LA2_0>=19 && LA2_0<=24)) ) {
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

            if ( ((LA4_0>=19 && LA4_0<=24)) ) {
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

                if ( (LA6_0==RULE_ID||LA6_0==17||(LA6_0>=19 && LA6_0<=26)||LA6_0==28||LA6_0==30) ) {
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:597:1: ruletype returns [EObject current=null] : ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' ) ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

        Token lv_types_0_1=null;
        Token lv_types_0_2=null;
        Token lv_types_0_3=null;
        Token lv_types_0_4=null;
        Token lv_types_0_5=null;
        Token lv_types_0_6=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:602:6: ( ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:603:1: ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:603:1: ( ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:604:1: ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:604:1: ( (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:605:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:605:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' )
            int alt7=6;
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
            case 22:
                {
                alt7=4;
                }
                break;
            case 23:
                {
                alt7=5;
                }
                break;
            case 24:
                {
                alt7=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("605:1: (lv_types_0_1= 'String' | lv_types_0_2= 'Integer' | lv_types_0_3= 'Boolean' | lv_types_0_4= 'Graph' | lv_types_0_5= 'Vertex' | lv_types_0_6= 'Edge' )", 7, 0, input);

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
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:660:8: lv_types_0_4= 'Graph'
                    {
                    lv_types_0_4=(Token)input.LT(1);
                    match(input,22,FOLLOW_22_in_ruletype1059); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesGraphKeyword_0_3(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_4, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:678:8: lv_types_0_5= 'Vertex'
                    {
                    lv_types_0_5=(Token)input.LT(1);
                    match(input,23,FOLLOW_23_in_ruletype1088); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesVertexKeyword_0_4(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_5, null, lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:696:8: lv_types_0_6= 'Edge'
                    {
                    lv_types_0_6=(Token)input.LT(1);
                    match(input,24,FOLLOW_24_in_ruletype1117); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getTypesEdgeKeyword_0_5(), "types"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "types", lv_types_0_6, null, lastConsumedNode);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:725:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:2: (iv_rulestatement= rulestatement EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:727:2: iv_rulestatement= rulestatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1168);
            iv_rulestatement=rulestatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1178); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:734:1: rulestatement returns [EObject current=null] : ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject lv_postFixExpression_1_0 = null;

        EObject this_declaration_3 = null;

        EObject lv_assignments_6_0 = null;

        EObject lv_exprs_10_0 = null;

        EObject this_expr_13 = null;

        EObject lv_statements_15_0 = null;

        EObject lv_statements_17_0 = null;

        EObject this_param_19 = null;

        EObject lv_exprs_21_0 = null;

        EObject lv_statements_23_0 = null;

        EObject this_expr_25 = null;

        EObject lv_statements_27_0 = null;

        EObject this_block_28 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:739:6: ( ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:1: ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:1: ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock )
            int alt10=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred12()) ) {
                    alt10=1;
                }
                else if ( (synpred14()) ) {
                    alt10=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("740:1: ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock )", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt10=2;
                }
                break;
            case 25:
                {
                alt10=4;
                }
                break;
            case 26:
                {
                alt10=5;
                }
                break;
            case 28:
                {
                alt10=6;
                }
                break;
            case 30:
                {
                alt10=7;
                }
                break;
            case 17:
                {
                alt10=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("740:1: ( ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr ) | (this_declaration_3= ruledeclaration ruleendExpr ) | ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr ) | ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr ) | ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) ) | this_block_28= ruleblock )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:2: ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:2: ( () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:3: () ( (lv_postFixExpression_1_0= rulepostfixExpr ) ) ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:3: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:741:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:754:2: ( (lv_postFixExpression_1_0= rulepostfixExpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:755:1: (lv_postFixExpression_1_0= rulepostfixExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:755:1: (lv_postFixExpression_1_0= rulepostfixExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:756:3: lv_postFixExpression_1_0= rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_0_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_rulestatement1237);
                    lv_postFixExpression_1_0=rulepostfixExpr();
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
                      	        		lv_postFixExpression_1_0, 
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
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_0_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1256);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:790:6: (this_declaration_3= ruledeclaration ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:790:6: (this_declaration_3= ruledeclaration ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:791:2: this_declaration_3= ruledeclaration ruleendExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_1_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruledeclaration_in_rulestatement1288);
                    this_declaration_3=ruledeclaration();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_declaration_3; 
                              currentNode = currentNode.getParent();
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1306);
                    ruleendExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:6: ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:6: ( () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:7: () ( (lv_assignments_6_0= ruleassignment ) ) ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:815:2: 
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

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:828:2: ( (lv_assignments_6_0= ruleassignment ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:829:1: (lv_assignments_6_0= ruleassignment )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:829:1: (lv_assignments_6_0= ruleassignment )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:830:3: lv_assignments_6_0= ruleassignment
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleassignment_in_rulestatement1346);
                    lv_assignments_6_0=ruleassignment();
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
                      	        		lv_assignments_6_0, 
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
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_2_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1365);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:864:6: ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:864:6: ( () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:864:7: () 'return' ( (lv_exprs_10_0= ruleexpr ) )? ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:864:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:865:2: 
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

                    match(input,25,FOLLOW_25_in_rulestatement1394); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getReturnKeyword_3_1(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:882:1: ( (lv_exprs_10_0= ruleexpr ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||(LA8_0>=RULE_INT && LA8_0<=RULE_STRING)||LA8_0==12||LA8_0==44||(LA8_0>=48 && LA8_0<=51)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:883:1: (lv_exprs_10_0= ruleexpr )
                            {
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:883:1: (lv_exprs_10_0= ruleexpr )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:884:3: lv_exprs_10_0= ruleexpr
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_3_2_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleexpr_in_rulestatement1415);
                            lv_exprs_10_0=ruleexpr();
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
                              	        		lv_exprs_10_0, 
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
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_3_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1435);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:918:6: ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:918:6: ( 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:918:8: 'if' this_expr_13= ruleexpr ':' ( (lv_statements_15_0= rulestatement ) ) ( 'else' ( (lv_statements_17_0= rulestatement ) ) )?
                    {
                    match(input,26,FOLLOW_26_in_rulestatement1452); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getIfKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1477);
                    this_expr_13=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_13; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,14,FOLLOW_14_in_rulestatement1486); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_4_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:938:1: ( (lv_statements_15_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:939:1: (lv_statements_15_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:939:1: (lv_statements_15_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:940:3: lv_statements_15_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1507);
                    lv_statements_15_0=rulestatement();
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
                      	        		lv_statements_15_0, 
                      	        		"statement", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:962:2: ( 'else' ( (lv_statements_17_0= rulestatement ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==27) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred17()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:962:4: 'else' ( (lv_statements_17_0= rulestatement ) )
                            {
                            match(input,27,FOLLOW_27_in_rulestatement1518); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStatementAccess().getElseKeyword_4_4_0(), null); 
                                  
                            }
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:966:1: ( (lv_statements_17_0= rulestatement ) )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:967:1: (lv_statements_17_0= rulestatement )
                            {
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:967:1: (lv_statements_17_0= rulestatement )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:968:3: lv_statements_17_0= rulestatement
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_rulestatement_in_rulestatement1539);
                            lv_statements_17_0=rulestatement();
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
                              	        		lv_statements_17_0, 
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
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:6: ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:6: ( 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:8: 'for' this_param_19= ruleparam 'in' ( (lv_exprs_21_0= ruleexpr ) ) ':' ( (lv_statements_23_0= rulestatement ) )
                    {
                    match(input,28,FOLLOW_28_in_rulestatement1559); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getForKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getParamParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleparam_in_rulestatement1584);
                    this_param_19=ruleparam();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_param_19; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,29,FOLLOW_29_in_rulestatement1593); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getInKeyword_5_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1011:1: ( (lv_exprs_21_0= ruleexpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1012:1: (lv_exprs_21_0= ruleexpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1012:1: (lv_exprs_21_0= ruleexpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1013:3: lv_exprs_21_0= ruleexpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_5_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1614);
                    lv_exprs_21_0=ruleexpr();
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
                      	        		lv_exprs_21_0, 
                      	        		"expr", 
                      	        		currentNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	        currentNode = currentNode.getParent();
                      	    
                    }

                    }


                    }

                    match(input,14,FOLLOW_14_in_rulestatement1624); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_5_4(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1039:1: ( (lv_statements_23_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1040:1: (lv_statements_23_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1040:1: (lv_statements_23_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1041:3: lv_statements_23_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1645);
                    lv_statements_23_0=rulestatement();
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
                      	        		lv_statements_23_0, 
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
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1064:6: ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1064:6: ( 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1064:8: 'while' this_expr_25= ruleexpr ':' ( (lv_statements_27_0= rulestatement ) )
                    {
                    match(input,30,FOLLOW_30_in_rulestatement1663); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getWhileKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1688);
                    this_expr_25=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_25; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,14,FOLLOW_14_in_rulestatement1697); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_6_2(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1084:1: ( (lv_statements_27_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:1: (lv_statements_27_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1085:1: (lv_statements_27_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1086:3: lv_statements_27_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_6_3_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1718);
                    lv_statements_27_0=rulestatement();
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
                      	        		lv_statements_27_0, 
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1110:2: this_block_28= ruleblock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleblock_in_rulestatement1750);
                    this_block_28=ruleblock();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_block_28; 
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


    // $ANTLR start entryRuledeclaration
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1129:1: entryRuledeclaration returns [EObject current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final EObject entryRuledeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1130:2: (iv_ruledeclaration= ruledeclaration EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1131:2: iv_ruledeclaration= ruledeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration1785);
            iv_ruledeclaration=ruledeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruledeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration1795); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1138:1: ruledeclaration returns [EObject current=null] : ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? ) ;
    public final EObject ruledeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_variableType_0_0 = null;

        EObject lv_exprs_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1143:6: ( ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1144:1: ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1144:1: ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1144:2: ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )?
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1144:2: ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=19 && LA12_0<=24)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1144:3: ( (lv_variableType_0_0= ruletype ) ) ( '[]' )?
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1144:3: ( (lv_variableType_0_0= ruletype ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1145:1: (lv_variableType_0_0= ruletype )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1145:1: (lv_variableType_0_0= ruletype )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1146:3: lv_variableType_0_0= ruletype
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getVariableTypeTypeParserRuleCall_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletype_in_ruledeclaration1842);
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

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1168:2: ( '[]' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==31) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1168:4: '[]'
            	            {
            	            match(input,31,FOLLOW_31_in_ruledeclaration1853); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getDeclarationAccess().getLeftSquareBracketRightSquareBracketKeyword_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1172:5: ( (lv_name_2_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1173:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1173:1: (lv_name_2_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1174:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledeclaration1874); if (failed) return current;
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

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1196:2: ( '=' ( (lv_exprs_4_0= ruleexpr ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1196:4: '=' ( (lv_exprs_4_0= ruleexpr ) )
                    {
                    match(input,32,FOLLOW_32_in_ruledeclaration1890); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1200:1: ( (lv_exprs_4_0= ruleexpr ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1201:1: (lv_exprs_4_0= ruleexpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1201:1: (lv_exprs_4_0= ruleexpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1202:3: lv_exprs_4_0= ruleexpr
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getExprsExprParserRuleCall_2_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruledeclaration1911);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1232:1: entryRuleassignment returns [EObject current=null] : iv_ruleassignment= ruleassignment EOF ;
    public final EObject entryRuleassignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleassignment = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1233:2: (iv_ruleassignment= ruleassignment EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1234:2: iv_ruleassignment= ruleassignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleassignment_in_entryRuleassignment1949);
            iv_ruleassignment=ruleassignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleassignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment1959); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1241:1: ruleassignment returns [EObject current=null] : (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) ) ;
    public final EObject ruleassignment() throws RecognitionException {
        EObject current = null;

        EObject this_postfixExpr_0 = null;

        EObject lv_exprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1246:6: ( (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1247:1: (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1247:1: (this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1248:2: this_postfixExpr_0= rulepostfixExpr '=' ( (lv_exprs_2_0= ruleexpr ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getPostfixExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_ruleassignment2009);
            this_postfixExpr_0=rulepostfixExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_postfixExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            match(input,32,FOLLOW_32_in_ruleassignment2018); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1263:1: ( (lv_exprs_2_0= ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1264:1: (lv_exprs_2_0= ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1264:1: (lv_exprs_2_0= ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1265:3: lv_exprs_2_0= ruleexpr
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExprsExprParserRuleCall_2_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleexpr_in_ruleassignment2039);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1295:1: entryRuleexpr returns [EObject current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final EObject entryRuleexpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleexpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1296:2: (iv_ruleexpr= ruleexpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1297:2: iv_ruleexpr= ruleexpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr2075);
            iv_ruleexpr=ruleexpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleexpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr2085); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1304:1: ruleexpr returns [EObject current=null] : (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* ) ;
    public final EObject ruleexpr() throws RecognitionException {
        EObject current = null;

        EObject this_andExpr_0 = null;

        EObject lv_andExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1309:6: ( (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1310:1: (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1310:1: (this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:2: this_andExpr_0= ruleandExpr ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExprAccess().getAndExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleandExpr_in_ruleexpr2135);
            this_andExpr_0=ruleandExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_andExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1322:1: ( '||' ( (lv_andExprs_2_0= ruleandExpr ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1322:3: '||' ( (lv_andExprs_2_0= ruleandExpr ) )
            	    {
            	    match(input,33,FOLLOW_33_in_ruleexpr2145); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1326:1: ( (lv_andExprs_2_0= ruleandExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1327:1: (lv_andExprs_2_0= ruleandExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1327:1: (lv_andExprs_2_0= ruleandExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1328:3: lv_andExprs_2_0= ruleandExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getExprAccess().getAndExprsAndExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleandExpr_in_ruleexpr2166);
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
            	    break loop14;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1358:1: entryRuleandExpr returns [EObject current=null] : iv_ruleandExpr= ruleandExpr EOF ;
    public final EObject entryRuleandExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleandExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1359:2: (iv_ruleandExpr= ruleandExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1360:2: iv_ruleandExpr= ruleandExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_entryRuleandExpr2204);
            iv_ruleandExpr=ruleandExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleandExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpr2214); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1367:1: ruleandExpr returns [EObject current=null] : (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* ) ;
    public final EObject ruleandExpr() throws RecognitionException {
        EObject current = null;

        EObject this_eqExpr_0 = null;

        EObject lv_eqExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1372:6: ( (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1373:1: (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1373:1: (this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1374:2: this_eqExpr_0= ruleeqExpr ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleeqExpr_in_ruleandExpr2264);
            this_eqExpr_0=ruleeqExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_eqExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1385:1: ( '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1385:3: '&&' ( (lv_eqExprs_2_0= ruleeqExpr ) )
            	    {
            	    match(input,34,FOLLOW_34_in_ruleandExpr2274); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1389:1: ( (lv_eqExprs_2_0= ruleeqExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1390:1: (lv_eqExprs_2_0= ruleeqExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1390:1: (lv_eqExprs_2_0= ruleeqExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1391:3: lv_eqExprs_2_0= ruleeqExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAndExprAccess().getEqExprsEqExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleeqExpr_in_ruleandExpr2295);
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
            	    break loop15;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1421:1: entryRuleeqExpr returns [EObject current=null] : iv_ruleeqExpr= ruleeqExpr EOF ;
    public final EObject entryRuleeqExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleeqExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1422:2: (iv_ruleeqExpr= ruleeqExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1423:2: iv_ruleeqExpr= ruleeqExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEqExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_entryRuleeqExpr2333);
            iv_ruleeqExpr=ruleeqExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleeqExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleeqExpr2343); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1430:1: ruleeqExpr returns [EObject current=null] : (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* ) ;
    public final EObject ruleeqExpr() throws RecognitionException {
        EObject current = null;

        EObject this_relExpr_0 = null;

        EObject lv_relExprs_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1435:6: ( (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1436:1: (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1436:1: (this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1437:2: this_relExpr_0= rulerelExpr ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulerelExpr_in_ruleeqExpr2393);
            this_relExpr_0=rulerelExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_relExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1448:1: ( ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=35 && LA17_0<=36)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1448:2: ( '==' | '!=' ) ( (lv_relExprs_3_0= rulerelExpr ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1448:2: ( '==' | '!=' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==35) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==36) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1448:2: ( '==' | '!=' )", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1448:4: '=='
            	            {
            	            match(input,35,FOLLOW_35_in_ruleeqExpr2404); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1453:7: '!='
            	            {
            	            match(input,36,FOLLOW_36_in_ruleeqExpr2420); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getEqExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1457:2: ( (lv_relExprs_3_0= rulerelExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1458:1: (lv_relExprs_3_0= rulerelExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1458:1: (lv_relExprs_3_0= rulerelExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1459:3: lv_relExprs_3_0= rulerelExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getEqExprAccess().getRelExprsRelExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulerelExpr_in_ruleeqExpr2442);
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
    // $ANTLR end ruleeqExpr


    // $ANTLR start entryRulerelExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1489:1: entryRulerelExpr returns [EObject current=null] : iv_rulerelExpr= rulerelExpr EOF ;
    public final EObject entryRulerelExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulerelExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1490:2: (iv_rulerelExpr= rulerelExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1491:2: iv_rulerelExpr= rulerelExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_entryRulerelExpr2480);
            iv_rulerelExpr=rulerelExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulerelExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelExpr2490); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1498:1: rulerelExpr returns [EObject current=null] : (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* ) ;
    public final EObject rulerelExpr() throws RecognitionException {
        EObject current = null;

        EObject this_addExpr_0 = null;

        EObject lv_addExpr_5_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1503:6: ( (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1504:1: (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1504:1: (this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1505:2: this_addExpr_0= ruleaddExpr ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rulerelExpr2540);
            this_addExpr_0=ruleaddExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_addExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1516:1: ( ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=37 && LA19_0<=40)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1516:2: ( '<' | '>' | '<=' | '>=' ) ( (lv_addExpr_5_0= ruleaddExpr ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1516:2: ( '<' | '>' | '<=' | '>=' )
            	    int alt18=4;
            	    switch ( input.LA(1) ) {
            	    case 37:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 39:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 40:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1516:2: ( '<' | '>' | '<=' | '>=' )", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1516:4: '<'
            	            {
            	            match(input,37,FOLLOW_37_in_rulerelExpr2551); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1521:7: '>'
            	            {
            	            match(input,38,FOLLOW_38_in_rulerelExpr2567); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1526:7: '<='
            	            {
            	            match(input,39,FOLLOW_39_in_rulerelExpr2583); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1531:7: '>='
            	            {
            	            match(input,40,FOLLOW_40_in_rulerelExpr2599); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getRelExprAccess().getGreaterThanSignEqualsSignKeyword_1_0_3(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1535:2: ( (lv_addExpr_5_0= ruleaddExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1536:1: (lv_addExpr_5_0= ruleaddExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1536:1: (lv_addExpr_5_0= ruleaddExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1537:3: lv_addExpr_5_0= ruleaddExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getRelExprAccess().getAddExprAddExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleaddExpr_in_rulerelExpr2621);
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
    // $ANTLR end rulerelExpr


    // $ANTLR start entryRuleaddExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1567:1: entryRuleaddExpr returns [EObject current=null] : iv_ruleaddExpr= ruleaddExpr EOF ;
    public final EObject entryRuleaddExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleaddExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1568:2: (iv_ruleaddExpr= ruleaddExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1569:2: iv_ruleaddExpr= ruleaddExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_entryRuleaddExpr2659);
            iv_ruleaddExpr=ruleaddExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleaddExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaddExpr2669); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1576:1: ruleaddExpr returns [EObject current=null] : (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* ) ;
    public final EObject ruleaddExpr() throws RecognitionException {
        EObject current = null;

        EObject this_mulExpr_0 = null;

        EObject lv_mulExprs_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1581:6: ( (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1582:1: (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1582:1: (this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1583:2: this_mulExpr_0= rulemulExpr ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )*
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulemulExpr_in_ruleaddExpr2719);
            this_mulExpr_0=rulemulExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_mulExpr_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1594:1: ( RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_SIGN) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1594:2: RULE_SIGN ( (lv_mulExprs_2_0= rulemulExpr ) )
            	    {
            	    match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_ruleaddExpr2728); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getAddExprAccess().getSignTerminalRuleCall_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1598:1: ( (lv_mulExprs_2_0= rulemulExpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1599:1: (lv_mulExprs_2_0= rulemulExpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1599:1: (lv_mulExprs_2_0= rulemulExpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1600:3: lv_mulExprs_2_0= rulemulExpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getAddExprAccess().getMulExprsMulExprParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulemulExpr_in_ruleaddExpr2748);
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
            	    break loop20;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1630:1: entryRulemulExpr returns [EObject current=null] : iv_rulemulExpr= rulemulExpr EOF ;
    public final EObject entryRulemulExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemulExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1631:2: (iv_rulemulExpr= rulemulExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1632:2: iv_rulemulExpr= rulemulExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMulExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_entryRulemulExpr2786);
            iv_rulemulExpr=rulemulExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemulExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemulExpr2796); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1639:1: rulemulExpr returns [EObject current=null] : ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* ) ;
    public final EObject rulemulExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_atoms_0_0 = null;

        EObject lv_atoms_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1644:6: ( ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1645:1: ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1645:1: ( ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1645:2: ( (lv_atoms_0_0= ruleatom ) ) ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1645:2: ( (lv_atoms_0_0= ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1646:1: (lv_atoms_0_0= ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1646:1: (lv_atoms_0_0= ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1647:3: lv_atoms_0_0= ruleatom
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleatom_in_rulemulExpr2842);
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

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1669:2: ( ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=41 && LA22_0<=43)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1669:3: ( '*' | '/' | '%' ) ( (lv_atoms_4_0= ruleatom ) )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1669:3: ( '*' | '/' | '%' )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1669:3: ( '*' | '/' | '%' )", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1669:5: '*'
            	            {
            	            match(input,41,FOLLOW_41_in_rulemulExpr2854); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1674:7: '/'
            	            {
            	            match(input,42,FOLLOW_42_in_rulemulExpr2870); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1679:7: '%'
            	            {
            	            match(input,43,FOLLOW_43_in_rulemulExpr2886); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      createLeafNode(grammarAccess.getMulExprAccess().getPercentSignKeyword_1_0_2(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1683:2: ( (lv_atoms_4_0= ruleatom ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1684:1: (lv_atoms_4_0= ruleatom )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1684:1: (lv_atoms_4_0= ruleatom )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1685:3: lv_atoms_4_0= ruleatom
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleatom_in_rulemulExpr2908);
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
    // $ANTLR end rulemulExpr


    // $ANTLR start entryRuleatom
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1715:1: entryRuleatom returns [EObject current=null] : iv_ruleatom= ruleatom EOF ;
    public final EObject entryRuleatom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleatom = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1716:2: (iv_ruleatom= ruleatom EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1717:2: iv_ruleatom= ruleatom EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleatom_in_entryRuleatom2946);
            iv_ruleatom=ruleatom();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleatom; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleatom2956); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1724:1: ruleatom returns [EObject current=null] : ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) ) ;
    public final EObject ruleatom() throws RecognitionException {
        EObject current = null;

        EObject this_atom_1 = null;

        EObject this_expr_4 = null;

        EObject this_expr_7 = null;

        EObject this_postfixExpr_9 = null;

        EObject lv_constants_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1729:6: ( ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1730:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1730:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt23=1;
                }
                break;
            case 12:
                {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==RULE_SIGN) ) {
                    alt23=2;
                }
                else if ( (LA23_2==RULE_ID||(LA23_2>=RULE_INT && LA23_2<=RULE_STRING)||LA23_2==12||LA23_2==44||(LA23_2>=48 && LA23_2<=51)) ) {
                    alt23=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1730:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )", 23, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt23=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt23=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1730:1: ( ( '!' this_atom_1= ruleatom ) | ( '(' RULE_SIGN this_expr_4= ruleexpr ')' ) | ( '(' this_expr_7= ruleexpr ')' ) | this_postfixExpr_9= rulepostfixExpr | ( () ( (lv_constants_11_0= ruleconstant ) ) ) )", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1730:2: ( '!' this_atom_1= ruleatom )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1730:2: ( '!' this_atom_1= ruleatom )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1730:4: '!' this_atom_1= ruleatom
                    {
                    match(input,44,FOLLOW_44_in_ruleatom2992); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getExclamationMarkKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getAtomParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleatom_in_ruleatom3017);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1747:6: ( '(' RULE_SIGN this_expr_4= ruleexpr ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1747:6: ( '(' RULE_SIGN this_expr_4= ruleexpr ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1747:8: '(' RULE_SIGN this_expr_4= ruleexpr ')'
                    {
                    match(input,12,FOLLOW_12_in_ruleatom3034); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_ruleatom3043); if (failed) return current;
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAtomAccess().getSignTerminalRuleCall_1_1(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_1_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3067);
                    this_expr_4=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_4; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,13,FOLLOW_13_in_ruleatom3076); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1772:6: ( '(' this_expr_7= ruleexpr ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1772:6: ( '(' this_expr_7= ruleexpr ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1772:8: '(' this_expr_7= ruleexpr ')'
                    {
                    match(input,12,FOLLOW_12_in_ruleatom3094); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3119);
                    this_expr_7=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_expr_7; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,13,FOLLOW_13_in_ruleatom3128); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1794:2: this_postfixExpr_9= rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getPostfixExprParserRuleCall_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_ruleatom3160);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1806:6: ( () ( (lv_constants_11_0= ruleconstant ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1806:6: ( () ( (lv_constants_11_0= ruleconstant ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1806:7: () ( (lv_constants_11_0= ruleconstant ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1806:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1807:2: 
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

                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1820:2: ( (lv_constants_11_0= ruleconstant ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1821:1: (lv_constants_11_0= ruleconstant )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1821:1: (lv_constants_11_0= ruleconstant )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1822:3: lv_constants_11_0= ruleconstant
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getAtomAccess().getConstantsConstantParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleconstant_in_ruleatom3199);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1852:1: entryRulepostfixExpr returns [EObject current=null] : iv_rulepostfixExpr= rulepostfixExpr EOF ;
    public final EObject entryRulepostfixExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepostfixExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1853:2: (iv_rulepostfixExpr= rulepostfixExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1854:2: iv_rulepostfixExpr= rulepostfixExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPostfixExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr3236);
            iv_rulepostfixExpr=rulepostfixExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulepostfixExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepostfixExpr3246); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1861:1: rulepostfixExpr returns [EObject current=null] : ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* ) ;
    public final EObject rulepostfixExpr() throws RecognitionException {
        EObject current = null;

        EObject lv_expressions_6_0 = null;

        EObject lv_expressions_8_0 = null;

        EObject lv_expressions_11_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1866:6: ( ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:1: ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:1: ( ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) ) ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (synpred40()) ) {
                    alt24=1;
                }
                else if ( (synpred41()) ) {
                    alt24=2;
                }
                else if ( (true) ) {
                    alt24=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1867:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1867:2: ( ( ( RULE_ID ) ) | ( ( RULE_ID ) ) | ( ( RULE_ID ) ) )", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:3: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:3: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1868:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1868:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1869:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3294); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationCrossReference_0_0_0(), "existingVariable"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1885:6: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1885:6: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1886:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1886:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1887:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3322); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPostfixExprAccess().getExistingVariableParamCrossReference_0_1_0(), "existingVariable"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1903:6: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1903:6: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1904:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1904:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1905:3: RULE_ID
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
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3350); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getPostfixExprAccess().getExistingVariableFunctionDefinitionCrossReference_0_2_0(), "existingVariable"); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1920:3: ( ( '.' RULE_ID ) | ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' ) | ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' ) )*
            loop27:
            do {
                int alt27=4;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    alt27=1;
                    }
                    break;
                case 12:
                    {
                    alt27=2;
                    }
                    break;
                case 46:
                    {
                    alt27=3;
                    }
                    break;

                }

                switch (alt27) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1920:4: ( '.' RULE_ID )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1920:4: ( '.' RULE_ID )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1920:6: '.' RULE_ID
            	    {
            	    match(input,45,FOLLOW_45_in_rulepostfixExpr3363); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getFullStopKeyword_1_0_0(), null); 
            	          
            	    }
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3372); if (failed) return current;
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_1_0_1(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1929:6: ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1929:6: ( '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')' )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1929:8: '(' ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )? ')'
            	    {
            	    match(input,12,FOLLOW_12_in_rulepostfixExpr3389); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1933:1: ( ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )* )?
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==RULE_ID||(LA26_0>=RULE_INT && LA26_0<=RULE_STRING)||LA26_0==12||LA26_0==44||(LA26_0>=48 && LA26_0<=51)) ) {
            	        alt26=1;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1933:2: ( (lv_expressions_6_0= ruleexpr ) ) ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )*
            	            {
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1933:2: ( (lv_expressions_6_0= ruleexpr ) )
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1934:1: (lv_expressions_6_0= ruleexpr )
            	            {
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1934:1: (lv_expressions_6_0= ruleexpr )
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1935:3: lv_expressions_6_0= ruleexpr
            	            {
            	            if ( backtracking==0 ) {
            	               
            	              	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_0_0(), currentNode); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3411);
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

            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1957:2: ( ',' ( (lv_expressions_8_0= ruleexpr ) ) )*
            	            loop25:
            	            do {
            	                int alt25=2;
            	                int LA25_0 = input.LA(1);

            	                if ( (LA25_0==16) ) {
            	                    alt25=1;
            	                }


            	                switch (alt25) {
            	            	case 1 :
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1957:4: ',' ( (lv_expressions_8_0= ruleexpr ) )
            	            	    {
            	            	    match(input,16,FOLLOW_16_in_rulepostfixExpr3422); if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	              createLeafNode(grammarAccess.getPostfixExprAccess().getCommaKeyword_1_1_1_1_0(), null); 
            	            	          
            	            	    }
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1961:1: ( (lv_expressions_8_0= ruleexpr ) )
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1962:1: (lv_expressions_8_0= ruleexpr )
            	            	    {
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1962:1: (lv_expressions_8_0= ruleexpr )
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1963:3: lv_expressions_8_0= ruleexpr
            	            	    {
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	      	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_1_1_0(), currentNode); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3443);
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
            	            	    break loop25;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    match(input,13,FOLLOW_13_in_rulepostfixExpr3457); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_1_1_2(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1990:6: ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1990:6: ( '[' ( (lv_expressions_11_0= ruleexpr ) ) ']' )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1990:8: '[' ( (lv_expressions_11_0= ruleexpr ) ) ']'
            	    {
            	    match(input,46,FOLLOW_46_in_rulepostfixExpr3475); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_1_2_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1994:1: ( (lv_expressions_11_0= ruleexpr ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1995:1: (lv_expressions_11_0= ruleexpr )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1995:1: (lv_expressions_11_0= ruleexpr )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1996:3: lv_expressions_11_0= ruleexpr
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_2_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3496);
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

            	    match(input,47,FOLLOW_47_in_rulepostfixExpr3506); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_1_2_2(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2030:1: entryRuleconstant returns [EObject current=null] : iv_ruleconstant= ruleconstant EOF ;
    public final EObject entryRuleconstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleconstant = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2031:2: (iv_ruleconstant= ruleconstant EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2032:2: iv_ruleconstant= ruleconstant EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getConstantRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant3545);
            iv_ruleconstant=ruleconstant();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleconstant; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant3555); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2039:1: ruleconstant returns [EObject current=null] : ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) ) ;
    public final EObject ruleconstant() throws RecognitionException {
        EObject current = null;

        Token lv_Integer_5_0=null;
        Token lv_String_6_0=null;
        Token lv_Null_7_0=null;
        Token lv_Infinity_8_0=null;
        EObject lv_Float_4_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2044:6: ( ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2045:1: ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2045:1: ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) )
            int alt28=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt28=1;
                }
                break;
            case 49:
                {
                alt28=2;
                }
                break;
            case RULE_INT:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==45) ) {
                    alt28=3;
                }
                else if ( (LA28_3==EOF||LA28_3==RULE_SIGN||(LA28_3>=13 && LA28_3<=14)||LA28_3==16||(LA28_3>=33 && LA28_3<=43)||LA28_3==47||LA28_3==52) ) {
                    alt28=4;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("2045:1: ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) )", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt28=5;
                }
                break;
            case 50:
                {
                alt28=6;
                }
                break;
            case 51:
                {
                alt28=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2045:1: ( ( () 'true' ) | ( () 'false' ) | ( (lv_Float_4_0= ruleFLOAT ) ) | ( (lv_Integer_5_0= RULE_INT ) ) | ( (lv_String_6_0= RULE_STRING ) ) | ( (lv_Null_7_0= 'null' ) ) | ( (lv_Infinity_8_0= 'infty' ) ) )", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2045:2: ( () 'true' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2045:2: ( () 'true' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2045:3: () 'true'
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2045:3: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2046:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConstantAccess().getConstantAction_0_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConstantAccess().getConstantAction_0_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,48,FOLLOW_48_in_ruleconstant3603); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getTrueKeyword_0_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2064:6: ( () 'false' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2064:6: ( () 'false' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2064:7: () 'false'
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2064:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2065:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getConstantAccess().getConstantAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getConstantAccess().getConstantAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    match(input,49,FOLLOW_49_in_ruleconstant3633); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getFalseKeyword_1_1(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2083:6: ( (lv_Float_4_0= ruleFLOAT ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2083:6: ( (lv_Float_4_0= ruleFLOAT ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2084:1: (lv_Float_4_0= ruleFLOAT )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2084:1: (lv_Float_4_0= ruleFLOAT )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2085:3: lv_Float_4_0= ruleFLOAT
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getConstantAccess().getFloatFLOATParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleFLOAT_in_ruleconstant3661);
                    lv_Float_4_0=ruleFLOAT();
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
                      	       			"Float",
                      	        		lv_Float_4_0, 
                      	        		"FLOAT", 
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2108:6: ( (lv_Integer_5_0= RULE_INT ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2108:6: ( (lv_Integer_5_0= RULE_INT ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2109:1: (lv_Integer_5_0= RULE_INT )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2109:1: (lv_Integer_5_0= RULE_INT )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2110:3: lv_Integer_5_0= RULE_INT
                    {
                    lv_Integer_5_0=(Token)input.LT(1);
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleconstant3684); if (failed) return current;
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
                      	        		lv_Integer_5_0, 
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2133:6: ( (lv_String_6_0= RULE_STRING ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2133:6: ( (lv_String_6_0= RULE_STRING ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2134:1: (lv_String_6_0= RULE_STRING )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2134:1: (lv_String_6_0= RULE_STRING )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2135:3: lv_String_6_0= RULE_STRING
                    {
                    lv_String_6_0=(Token)input.LT(1);
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleconstant3712); if (failed) return current;
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
                      	        		lv_String_6_0, 
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2158:6: ( (lv_Null_7_0= 'null' ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2158:6: ( (lv_Null_7_0= 'null' ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2159:1: (lv_Null_7_0= 'null' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2159:1: (lv_Null_7_0= 'null' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2160:3: lv_Null_7_0= 'null'
                    {
                    lv_Null_7_0=(Token)input.LT(1);
                    match(input,50,FOLLOW_50_in_ruleconstant3741); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getNullNullKeyword_5_0(), "Null"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "Null", lv_Null_7_0, "null", lastConsumedNode);
                      	        } catch (ValueConverterException vce) {
                      				handleValueConverterException(vce);
                      	        }
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2180:6: ( (lv_Infinity_8_0= 'infty' ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2180:6: ( (lv_Infinity_8_0= 'infty' ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2181:1: (lv_Infinity_8_0= 'infty' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2181:1: (lv_Infinity_8_0= 'infty' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2182:3: lv_Infinity_8_0= 'infty'
                    {
                    lv_Infinity_8_0=(Token)input.LT(1);
                    match(input,51,FOLLOW_51_in_ruleconstant3778); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0(), "Infinity"); 
                          
                    }
                    if ( backtracking==0 ) {

                      	        if (current==null) {
                      	            current = factory.create(grammarAccess.getConstantRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                      	        
                      	        try {
                      	       		set(current, "Infinity", lv_Infinity_8_0, "infty", lastConsumedNode);
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


    // $ANTLR start entryRuleFLOAT
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2209:1: entryRuleFLOAT returns [EObject current=null] : iv_ruleFLOAT= ruleFLOAT EOF ;
    public final EObject entryRuleFLOAT() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFLOAT = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2210:2: (iv_ruleFLOAT= ruleFLOAT EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2211:2: iv_ruleFLOAT= ruleFLOAT EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFLOATRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleFLOAT_in_entryRuleFLOAT3827);
            iv_ruleFLOAT=ruleFLOAT();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleFLOAT; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT3837); if (failed) return current;

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
    // $ANTLR end entryRuleFLOAT


    // $ANTLR start ruleFLOAT
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2218:1: ruleFLOAT returns [EObject current=null] : ( ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+ ) ;
    public final EObject ruleFLOAT() throws RecognitionException {
        EObject current = null;

        Token lv_FLOAT_0_0=null;
        Token lv_FLOAT_2_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2223:6: ( ( ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+ ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2224:1: ( ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+ )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2224:1: ( ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+ )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2224:2: ( (lv_FLOAT_0_0= RULE_INT ) ) '.' ( (lv_FLOAT_2_0= RULE_INT ) )+
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2224:2: ( (lv_FLOAT_0_0= RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2225:1: (lv_FLOAT_0_0= RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2225:1: (lv_FLOAT_0_0= RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2226:3: lv_FLOAT_0_0= RULE_INT
            {
            lv_FLOAT_0_0=(Token)input.LT(1);
            match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT3879); if (failed) return current;
            if ( backtracking==0 ) {

              			createLeafNode(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_0_0(), "FLOAT"); 
              		
            }
            if ( backtracking==0 ) {

              	        if (current==null) {
              	            current = factory.create(grammarAccess.getFLOATRule().getType().getClassifier());
              	            associateNodeWithAstElement(currentNode, current);
              	        }
              	        try {
              	       		add(
              	       			current, 
              	       			"FLOAT",
              	        		lv_FLOAT_0_0, 
              	        		"INT", 
              	        		lastConsumedNode);
              	        } catch (ValueConverterException vce) {
              				handleValueConverterException(vce);
              	        }
              	    
            }

            }


            }

            match(input,45,FOLLOW_45_in_ruleFLOAT3894); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFLOATAccess().getFullStopKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2252:1: ( (lv_FLOAT_2_0= RULE_INT ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_INT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2253:1: (lv_FLOAT_2_0= RULE_INT )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2253:1: (lv_FLOAT_2_0= RULE_INT )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2254:3: lv_FLOAT_2_0= RULE_INT
            	    {
            	    lv_FLOAT_2_0=(Token)input.LT(1);
            	    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFLOAT3911); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      			createLeafNode(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_2_0(), "FLOAT"); 
            	      		
            	    }
            	    if ( backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = factory.create(grammarAccess.getFLOATRule().getType().getClassifier());
            	      	            associateNodeWithAstElement(currentNode, current);
            	      	        }
            	      	        try {
            	      	       		add(
            	      	       			current, 
            	      	       			"FLOAT",
            	      	        		lv_FLOAT_2_0, 
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
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (backtracking>0) {failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
    // $ANTLR end ruleFLOAT


    // $ANTLR start entryRuleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2284:1: entryRuleendExpr returns [String current=null] : iv_ruleendExpr= ruleendExpr EOF ;
    public final String entryRuleendExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleendExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2285:2: (iv_ruleendExpr= ruleendExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2286:2: iv_ruleendExpr= ruleendExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEndExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_entryRuleendExpr3954);
            iv_ruleendExpr=ruleendExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleendExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleendExpr3965); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2293:1: ruleendExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleendExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2298:6: ( (kw= ',' | kw= ';' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2299:1: (kw= ',' | kw= ';' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2299:1: (kw= ',' | kw= ';' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            else if ( (LA30_0==52) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("2299:1: (kw= ',' | kw= ';' )", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2300:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,16,FOLLOW_16_in_ruleendExpr4003); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEndExprAccess().getCommaKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:2307:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,52,FOLLOW_52_in_ruleendExpr4022); if (failed) return current;
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

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:2: ( ( () ( ( rulepostfixExpr ) ) ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:2: ( () ( ( rulepostfixExpr ) ) ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:2: ( () ( ( rulepostfixExpr ) ) ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:3: () ( ( rulepostfixExpr ) ) ruleendExpr
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:740:3: ()
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:741:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:754:2: ( ( rulepostfixExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:755:1: ( rulepostfixExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:755:1: ( rulepostfixExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:756:3: rulepostfixExpr
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_0_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulepostfixExpr_in_synpred121237);
        rulepostfixExpr();
        _fsp--;
        if (failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleendExpr_in_synpred121256);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred14
    public final void synpred14_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:6: ( ( () ( ( ruleassignment ) ) ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:6: ( () ( ( ruleassignment ) ) ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:6: ( () ( ( ruleassignment ) ) ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:7: () ( ( ruleassignment ) ) ruleendExpr
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:814:7: ()
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:815:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:828:2: ( ( ruleassignment ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:829:1: ( ruleassignment )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:829:1: ( ruleassignment )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:830:3: ruleassignment
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_2_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_ruleassignment_in_synpred141346);
        ruleassignment();
        _fsp--;
        if (failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleendExpr_in_synpred141365);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred14

    // $ANTLR start synpred17
    public final void synpred17_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:962:4: ( 'else' ( ( rulestatement ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:962:4: 'else' ( ( rulestatement ) )
        {
        match(input,27,FOLLOW_27_in_synpred171518); if (failed) return ;
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:966:1: ( ( rulestatement ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:967:1: ( rulestatement )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:967:1: ( rulestatement )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:968:3: rulestatement
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred171539);
        rulestatement();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred17

    // $ANTLR start synpred40
    public final void synpred40_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:3: ( ( ( RULE_ID ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:3: ( ( RULE_ID ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1867:3: ( ( RULE_ID ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1868:1: ( RULE_ID )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1868:1: ( RULE_ID )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1869:3: RULE_ID
        {
        if ( backtracking==0 ) {
           
          		  /* */ 
          		
        }
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred403294); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred40

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1885:6: ( ( ( RULE_ID ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1885:6: ( ( RULE_ID ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1885:6: ( ( RULE_ID ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1886:1: ( RULE_ID )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1886:1: ( RULE_ID )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1887:3: RULE_ID
        {
        if ( backtracking==0 ) {
           
          		  /* */ 
          		
        }
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred413322); if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred41

    public final boolean synpred14() {
        backtracking++;
        int start = input.mark();
        try {
            synpred14_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred17() {
        backtracking++;
        int start = input.mark();
        try {
            synpred17_fragment(); // can never throw exception
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
    public final boolean synpred41() {
        backtracking++;
        int start = input.mark();
        try {
            synpred41_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_12_in_rulefunctionDefinition262 = new BitSet(new long[]{0x0000000001F82000L});
    public static final BitSet FOLLOW_ruleformalParams_in_rulefunctionDefinition283 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulefunctionDefinition294 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_rulefunctionDefinition305 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_ruletype_in_rulefunctionDefinition326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunctionDefinition349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemainFunction_in_entryRulemainFunction385 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemainFunction395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rulemainFunction438 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulemainFunction461 = new BitSet(new long[]{0x0000000001F82000L});
    public static final BitSet FOLLOW_ruleformalParams_in_rulemainFunction482 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulemainFunction493 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleblock_in_rulemainFunction514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_entryRuleformalParams550 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformalParams560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_ruleformalParams606 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleformalParams617 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleparam_in_ruleformalParams638 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_ruleparam_in_entryRuleparam676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparam686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparam736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparam752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock793 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleblock850 = new BitSet(new long[]{0x0000000057FE0010L});
    public static final BitSet FOLLOW_rulestatement_in_ruleblock871 = new BitSet(new long[]{0x0000000057FE0010L});
    public static final BitSet FOLLOW_18_in_ruleblock882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruletype972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruletype1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruletype1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruletype1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruletype1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruletype1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rulestatement1237 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rulestatement1288 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_rulestatement1346 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rulestatement1394 = new BitSet(new long[]{0x001F1000000110D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1415 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulestatement1452 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1477 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1486 = new BitSet(new long[]{0x0000000057FA0010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1507 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulestatement1518 = new BitSet(new long[]{0x0000000057FA0010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulestatement1559 = new BitSet(new long[]{0x0000000001F80000L});
    public static final BitSet FOLLOW_ruleparam_in_rulestatement1584 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulestatement1593 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1614 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1624 = new BitSet(new long[]{0x0000000057FA0010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rulestatement1663 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1688 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulestatement1697 = new BitSet(new long[]{0x0000000057FA0010L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rulestatement1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration1785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruledeclaration1842 = new BitSet(new long[]{0x0000000081F80010L});
    public static final BitSet FOLLOW_31_in_ruledeclaration1853 = new BitSet(new long[]{0x0000000001F80010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledeclaration1874 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruledeclaration1890 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruledeclaration1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_entryRuleassignment1949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_ruleassignment2009 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleassignment2018 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleassignment2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr2075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_ruleexpr2135 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleexpr2145 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleandExpr_in_ruleexpr2166 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_entryRuleandExpr2204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpr2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_ruleandExpr2264 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34_in_ruleandExpr2274 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleeqExpr_in_ruleandExpr2295 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_entryRuleeqExpr2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeqExpr2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_ruleeqExpr2393 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_35_in_ruleeqExpr2404 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_36_in_ruleeqExpr2420 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_rulerelExpr_in_ruleeqExpr2442 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_entryRulerelExpr2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelExpr2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rulerelExpr2540 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_37_in_rulerelExpr2551 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_38_in_rulerelExpr2567 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_39_in_rulerelExpr2583 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_40_in_rulerelExpr2599 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rulerelExpr2621 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_entryRuleaddExpr2659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaddExpr2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_ruleaddExpr2719 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_RULE_SIGN_in_ruleaddExpr2728 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_rulemulExpr_in_ruleaddExpr2748 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rulemulExpr_in_entryRulemulExpr2786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemulExpr2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rulemulExpr2842 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_41_in_rulemulExpr2854 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_42_in_rulemulExpr2870 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_43_in_rulemulExpr2886 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleatom_in_rulemulExpr2908 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_ruleatom_in_entryRuleatom2946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleatom2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleatom2992 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleatom_in_ruleatom3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleatom3034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SIGN_in_ruleatom3043 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3067 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleatom3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleatom3094 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3119 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleatom3128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_ruleatom3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_ruleatom3199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr3236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepostfixExpr3246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3294 = new BitSet(new long[]{0x0000600000001002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3322 = new BitSet(new long[]{0x0000600000001002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3350 = new BitSet(new long[]{0x0000600000001002L});
    public static final BitSet FOLLOW_45_in_rulepostfixExpr3363 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3372 = new BitSet(new long[]{0x0000600000001002L});
    public static final BitSet FOLLOW_12_in_rulepostfixExpr3389 = new BitSet(new long[]{0x000F1000000030D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3411 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_rulepostfixExpr3422 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3443 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13_in_rulepostfixExpr3457 = new BitSet(new long[]{0x0000600000001002L});
    public static final BitSet FOLLOW_46_in_rulepostfixExpr3475 = new BitSet(new long[]{0x000F1000000010D0L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3496 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulepostfixExpr3506 = new BitSet(new long[]{0x0000600000001002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant3545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant3555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleconstant3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleconstant3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_ruleconstant3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleconstant3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleconstant3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleconstant3741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleconstant3778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_entryRuleFLOAT3827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT3879 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleFLOAT3894 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFLOAT3911 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_ruleendExpr_in_entryRuleendExpr3954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendExpr3965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleendExpr4003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleendExpr4022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_synpred121237 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred121256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_synpred141346 = new BitSet(new long[]{0x0010000000010000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred141365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_synpred171518 = new BitSet(new long[]{0x0000000057FA0010L});
    public static final BitSet FOLLOW_rulestatement_in_synpred171539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred403294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred413322 = new BitSet(new long[]{0x0000000000000002L});

}