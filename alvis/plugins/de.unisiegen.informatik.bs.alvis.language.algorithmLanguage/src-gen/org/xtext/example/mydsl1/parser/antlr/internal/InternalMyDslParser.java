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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_SIGN", "RULE_CONSTANT", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "')'", "':'", "'main('", "','", "'begin'", "'end'", "'String'", "'Integer'", "'Boolean'", "'return'", "'if'", "'else'", "'for'", "'in'", "'while'", "'[]'", "'='", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'.'", "'['", "']'", "';'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=7;
    public static final int RULE_CONSTANT=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=8;
    public static final int RULE_SIGN=5;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

        public InternalMyDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[84+1];
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:92:1: ruleModel returns [EObject current=null] : ( () ( ( (lv_functions_1_0= rulefunctionDefinition ) )* ( (lv_main_2_0= rulemainFunction ) ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_functions_1_0 = null;

        EObject lv_main_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:97:6: ( ( () ( ( (lv_functions_1_0= rulefunctionDefinition ) )* ( (lv_main_2_0= rulemainFunction ) ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:1: ( () ( ( (lv_functions_1_0= rulefunctionDefinition ) )* ( (lv_main_2_0= rulemainFunction ) ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:1: ( () ( ( (lv_functions_1_0= rulefunctionDefinition ) )* ( (lv_main_2_0= rulemainFunction ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:2: () ( ( (lv_functions_1_0= rulefunctionDefinition ) )* ( (lv_main_2_0= rulemainFunction ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:98:2: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:99:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getModelAccess().getModelAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getModelAccess().getModelAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:112:2: ( ( (lv_functions_1_0= rulefunctionDefinition ) )* ( (lv_main_2_0= rulemainFunction ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:112:3: ( (lv_functions_1_0= rulefunctionDefinition ) )* ( (lv_main_2_0= rulemainFunction ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:112:3: ( (lv_functions_1_0= rulefunctionDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:113:1: (lv_functions_1_0= rulefunctionDefinition )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:113:1: (lv_functions_1_0= rulefunctionDefinition )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:114:3: lv_functions_1_0= rulefunctionDefinition
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getFunctionsFunctionDefinitionParserRuleCall_1_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulefunctionDefinition_in_ruleModel150);
            	    lv_functions_1_0=rulefunctionDefinition();
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
            	      	        		lv_functions_1_0, 
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

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:136:3: ( (lv_main_2_0= rulemainFunction ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_main_2_0= rulemainFunction )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:137:1: (lv_main_2_0= rulemainFunction )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:138:3: lv_main_2_0= rulemainFunction
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getMainMainFunctionParserRuleCall_1_1_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_rulemainFunction_in_ruleModel172);
            lv_main_2_0=rulemainFunction();
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
              	        		lv_main_2_0, 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:168:1: entryRulefunctionDefinition returns [EObject current=null] : iv_rulefunctionDefinition= rulefunctionDefinition EOF ;
    public final EObject entryRulefunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefunctionDefinition = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:169:2: (iv_rulefunctionDefinition= rulefunctionDefinition EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:170:2: iv_rulefunctionDefinition= rulefunctionDefinition EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFunctionDefinitionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulefunctionDefinition_in_entryRulefunctionDefinition209);
            iv_rulefunctionDefinition=rulefunctionDefinition();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulefunctionDefinition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctionDefinition219); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:177:1: rulefunctionDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) ) ;
    public final EObject rulefunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_formalParams_2_0 = null;

        EObject lv_returnType_5_0 = null;

        EObject lv_blocks_6_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:182:6: ( ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:183:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:183:1: ( ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:183:2: ( (lv_name_0_0= RULE_ID ) ) '(' ( (lv_formalParams_2_0= ruleformalParams ) )? ')' ( ':' ( (lv_returnType_5_0= ruletype ) ) )? ( (lv_blocks_6_0= ruleblock ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:183:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:184:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:184:1: (lv_name_0_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:185:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulefunctionDefinition261); if (failed) return current;
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

            match(input,13,FOLLOW_13_in_rulefunctionDefinition276); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:211:1: ( (lv_formalParams_2_0= ruleformalParams ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=20 && LA2_0<=22)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_formalParams_2_0= ruleformalParams )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:212:1: (lv_formalParams_2_0= ruleformalParams )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:213:3: lv_formalParams_2_0= ruleformalParams
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFormalParamsFormalParamsParserRuleCall_2_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformalParams_in_rulefunctionDefinition297);
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

            match(input,14,FOLLOW_14_in_rulefunctionDefinition308); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_3(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:239:1: ( ':' ( (lv_returnType_5_0= ruletype ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:239:3: ':' ( (lv_returnType_5_0= ruletype ) )
                    {
                    match(input,15,FOLLOW_15_in_rulefunctionDefinition319); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getFunctionDefinitionAccess().getColonKeyword_4_0(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:243:1: ( (lv_returnType_5_0= ruletype ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:1: (lv_returnType_5_0= ruletype )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:244:1: (lv_returnType_5_0= ruletype )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:245:3: lv_returnType_5_0= ruletype
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeParserRuleCall_4_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruletype_in_rulefunctionDefinition340);
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

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:267:4: ( (lv_blocks_6_0= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:268:1: (lv_blocks_6_0= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:268:1: (lv_blocks_6_0= ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:269:3: lv_blocks_6_0= ruleblock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBlocksBlockParserRuleCall_5_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_rulefunctionDefinition363);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:299:1: entryRulemainFunction returns [EObject current=null] : iv_rulemainFunction= rulemainFunction EOF ;
    public final EObject entryRulemainFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemainFunction = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:300:2: (iv_rulemainFunction= rulemainFunction EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:301:2: iv_rulemainFunction= rulemainFunction EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMainFunctionRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemainFunction_in_entryRulemainFunction399);
            iv_rulemainFunction=rulemainFunction();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemainFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemainFunction409); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:308:1: rulemainFunction returns [EObject current=null] : ( 'main(' ( (lv_formalParams_1_0= ruleformalParams ) )? ')' ( (lv_blocks_3_0= ruleblock ) ) ) ;
    public final EObject rulemainFunction() throws RecognitionException {
        EObject current = null;

        EObject lv_formalParams_1_0 = null;

        EObject lv_blocks_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:313:6: ( ( 'main(' ( (lv_formalParams_1_0= ruleformalParams ) )? ')' ( (lv_blocks_3_0= ruleblock ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:314:1: ( 'main(' ( (lv_formalParams_1_0= ruleformalParams ) )? ')' ( (lv_blocks_3_0= ruleblock ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:314:1: ( 'main(' ( (lv_formalParams_1_0= ruleformalParams ) )? ')' ( (lv_blocks_3_0= ruleblock ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:314:3: 'main(' ( (lv_formalParams_1_0= ruleformalParams ) )? ')' ( (lv_blocks_3_0= ruleblock ) )
            {
            match(input,16,FOLLOW_16_in_rulemainFunction444); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainFunctionAccess().getMainKeyword_0(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:318:1: ( (lv_formalParams_1_0= ruleformalParams ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID||(LA4_0>=20 && LA4_0<=22)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:319:1: (lv_formalParams_1_0= ruleformalParams )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:319:1: (lv_formalParams_1_0= ruleformalParams )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:320:3: lv_formalParams_1_0= ruleformalParams
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getMainFunctionAccess().getFormalParamsFormalParamsParserRuleCall_1_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleformalParams_in_rulemainFunction465);
                    lv_formalParams_1_0=ruleformalParams();
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
                      	        		lv_formalParams_1_0, 
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

            match(input,14,FOLLOW_14_in_rulemainFunction476); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getMainFunctionAccess().getRightParenthesisKeyword_2(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:346:1: ( (lv_blocks_3_0= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:347:1: (lv_blocks_3_0= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:347:1: (lv_blocks_3_0= ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:348:3: lv_blocks_3_0= ruleblock
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getMainFunctionAccess().getBlocksBlockParserRuleCall_3_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleblock_in_rulemainFunction497);
            lv_blocks_3_0=ruleblock();
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
              	        		lv_blocks_3_0, 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:378:1: entryRuleformalParams returns [EObject current=null] : iv_ruleformalParams= ruleformalParams EOF ;
    public final EObject entryRuleformalParams() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleformalParams = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:379:2: (iv_ruleformalParams= ruleformalParams EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:380:2: iv_ruleformalParams= ruleformalParams EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getFormalParamsRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_entryRuleformalParams533);
            iv_ruleformalParams=ruleformalParams();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleformalParams; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleformalParams543); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:387:1: ruleformalParams returns [EObject current=null] : ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* ) ;
    public final EObject ruleformalParams() throws RecognitionException {
        EObject current = null;

        EObject lv_params_0_0 = null;

        EObject lv_params_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:392:6: ( ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:393:1: ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:393:1: ( ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:393:2: ( (lv_params_0_0= ruleparam ) ) ( ',' ( (lv_params_2_0= ruleparam ) ) )*
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:393:2: ( (lv_params_0_0= ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:394:1: (lv_params_0_0= ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:394:1: (lv_params_0_0= ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:395:3: lv_params_0_0= ruleparam
            {
            if ( backtracking==0 ) {
               
              	        currentNode=createCompositeNode(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_0_0(), currentNode); 
              	    
            }
            pushFollow(FOLLOW_ruleparam_in_ruleformalParams589);
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

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:417:2: ( ',' ( (lv_params_2_0= ruleparam ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:417:4: ',' ( (lv_params_2_0= ruleparam ) )
            	    {
            	    match(input,17,FOLLOW_17_in_ruleformalParams600); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              createLeafNode(grammarAccess.getFormalParamsAccess().getCommaKeyword_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:421:1: ( (lv_params_2_0= ruleparam ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:422:1: (lv_params_2_0= ruleparam )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:422:1: (lv_params_2_0= ruleparam )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:423:3: lv_params_2_0= ruleparam
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_1_1_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleparam_in_ruleformalParams621);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:453:1: entryRuleparam returns [EObject current=null] : iv_ruleparam= ruleparam EOF ;
    public final EObject entryRuleparam() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleparam = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:454:2: (iv_ruleparam= ruleparam EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:455:2: iv_ruleparam= ruleparam EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getParamRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleparam_in_entryRuleparam659);
            iv_ruleparam=ruleparam();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleparam; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparam669); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:462:1: ruleparam returns [EObject current=null] : (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleparam() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject this_type_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:467:6: ( (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:468:1: (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:468:1: (this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:469:2: this_type_0= ruletype ( (lv_name_1_0= RULE_ID ) )
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getParamAccess().getTypeParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruletype_in_ruleparam719);
            this_type_0=ruletype();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               
                      current = this_type_0; 
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:480:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:481:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:481:1: (lv_name_1_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:482:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleparam735); if (failed) return current;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:512:1: entryRuleblock returns [EObject current=null] : iv_ruleblock= ruleblock EOF ;
    public final EObject entryRuleblock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleblock = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:513:2: (iv_ruleblock= ruleblock EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:514:2: iv_ruleblock= ruleblock EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getBlockRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock776);
            iv_ruleblock=ruleblock();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleblock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock786); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:521:1: ruleblock returns [EObject current=null] : ( () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end' ) ;
    public final EObject ruleblock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_2_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:526:6: ( ( () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:527:1: ( () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:527:1: ( () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:527:2: () 'begin' ( (lv_statements_2_0= rulestatement ) )* 'end'
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:527:2: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:528:2: 
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

            match(input,18,FOLLOW_18_in_ruleblock833); if (failed) return current;
            if ( backtracking==0 ) {

                      createLeafNode(grammarAccess.getBlockAccess().getBeginKeyword_1(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:545:1: ( (lv_statements_2_0= rulestatement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||LA6_0==RULE_CONSTANT||LA6_0==13||LA6_0==18||(LA6_0>=20 && LA6_0<=24)||LA6_0==26||LA6_0==28||LA6_0==44) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:546:1: (lv_statements_2_0= rulestatement )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:546:1: (lv_statements_2_0= rulestatement )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:547:3: lv_statements_2_0= rulestatement
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulestatement_in_ruleblock854);
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

            match(input,19,FOLLOW_19_in_ruleblock865); if (failed) return current;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:581:1: entryRuletype returns [EObject current=null] : iv_ruletype= ruletype EOF ;
    public final EObject entryRuletype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletype = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:582:2: (iv_ruletype= ruletype EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:583:2: iv_ruletype= ruletype EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype901);
            iv_ruletype=ruletype();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruletype; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype911); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:590:1: ruletype returns [EObject current=null] : ( () ( ( ( RULE_ID ) ) | 'String' | 'Integer' | 'Boolean' ) ) ;
    public final EObject ruletype() throws RecognitionException {
        EObject current = null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:595:6: ( ( () ( ( ( RULE_ID ) ) | 'String' | 'Integer' | 'Boolean' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:596:1: ( () ( ( ( RULE_ID ) ) | 'String' | 'Integer' | 'Boolean' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:596:1: ( () ( ( ( RULE_ID ) ) | 'String' | 'Integer' | 'Boolean' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:596:2: () ( ( ( RULE_ID ) ) | 'String' | 'Integer' | 'Boolean' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:596:2: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:597:2: 
            {
            if ( backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( backtracking==0 ) {
               
                      temp=factory.create(grammarAccess.getTypeAccess().getTypeAction_0().getType().getClassifier());
                      current = temp; 
                      temp = null;
                      CompositeNode newNode = createCompositeNode(grammarAccess.getTypeAccess().getTypeAction_0(), currentNode.getParent());
                  newNode.getChildren().add(currentNode);
                  moveLookaheadInfo(currentNode, newNode);
                  currentNode = newNode; 
                      associateNodeWithAstElement(currentNode, current); 
                  
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:610:2: ( ( ( RULE_ID ) ) | 'String' | 'Integer' | 'Boolean' )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
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
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("610:2: ( ( ( RULE_ID ) ) | 'String' | 'Integer' | 'Boolean' )", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:610:3: ( ( RULE_ID ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:610:3: ( ( RULE_ID ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:611:1: ( RULE_ID )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:611:1: ( RULE_ID )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:612:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       
                      		  /* */ 
                      		
                    }
                    if ( backtracking==0 ) {

                      			if (current==null) {
                      	            current = factory.create(grammarAccess.getTypeRule().getType().getClassifier());
                      	            associateNodeWithAstElement(currentNode, current);
                      	        }
                              
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruletype971); if (failed) return current;
                    if ( backtracking==0 ) {

                      		createLeafNode(grammarAccess.getTypeAccess().getTypeDeclarationCrossReference_1_0_0(), "type"); 
                      	
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:628:7: 'String'
                    {
                    match(input,20,FOLLOW_20_in_ruletype987); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getStringKeyword_1_1(), null); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:633:7: 'Integer'
                    {
                    match(input,21,FOLLOW_21_in_ruletype1003); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getIntegerKeyword_1_2(), null); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:638:7: 'Boolean'
                    {
                    match(input,22,FOLLOW_22_in_ruletype1019); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getTypeAccess().getBooleanKeyword_1_3(), null); 
                          
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
    // $ANTLR end ruletype


    // $ANTLR start entryRulestatement
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:650:1: entryRulestatement returns [EObject current=null] : iv_rulestatement= rulestatement EOF ;
    public final EObject entryRulestatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestatement = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:651:2: (iv_rulestatement= rulestatement EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:652:2: iv_rulestatement= rulestatement EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getStatementRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement1056);
            iv_rulestatement=rulestatement();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulestatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement1066); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:659:1: rulestatement returns [EObject current=null] : ( (this_declaration_0= ruledeclaration ruleendExpr ) | ( () ruleexpr ruleendExpr ) | ( () ruleassignment ruleendExpr ) | ( () 'return' ( ruleexpr )? ruleendExpr ) | ( 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' ruleexpr ':' this_statement_27= rulestatement ) | this_block_28= ruleblock ) ;
    public final EObject rulestatement() throws RecognitionException {
        EObject current = null;

        EObject this_declaration_0 = null;

        EObject this_statement_15 = null;

        EObject lv_statements_17_0 = null;

        EObject this_param_19 = null;

        EObject lv_statements_23_0 = null;

        EObject this_statement_27 = null;

        EObject this_block_28 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:664:6: ( ( (this_declaration_0= ruledeclaration ruleendExpr ) | ( () ruleexpr ruleendExpr ) | ( () ruleassignment ruleendExpr ) | ( () 'return' ( ruleexpr )? ruleendExpr ) | ( 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' ruleexpr ':' this_statement_27= rulestatement ) | this_block_28= ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:665:1: ( (this_declaration_0= ruledeclaration ruleendExpr ) | ( () ruleexpr ruleendExpr ) | ( () ruleassignment ruleendExpr ) | ( () 'return' ( ruleexpr )? ruleendExpr ) | ( 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' ruleexpr ':' this_statement_27= rulestatement ) | this_block_28= ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:665:1: ( (this_declaration_0= ruledeclaration ruleendExpr ) | ( () ruleexpr ruleendExpr ) | ( () ruleassignment ruleendExpr ) | ( () 'return' ( ruleexpr )? ruleendExpr ) | ( 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' ruleexpr ':' this_statement_27= rulestatement ) | this_block_28= ruleblock )
            int alt10=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA10_1 = input.LA(2);

                if ( (synpred10()) ) {
                    alt10=1;
                }
                else if ( (synpred11()) ) {
                    alt10=2;
                }
                else if ( (synpred12()) ) {
                    alt10=3;
                }
                else {
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("665:1: ( (this_declaration_0= ruledeclaration ruleendExpr ) | ( () ruleexpr ruleendExpr ) | ( () ruleassignment ruleendExpr ) | ( () 'return' ( ruleexpr )? ruleendExpr ) | ( 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' ruleexpr ':' this_statement_27= rulestatement ) | this_block_28= ruleblock )", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
            case 21:
            case 22:
                {
                alt10=1;
                }
                break;
            case RULE_CONSTANT:
            case 13:
            case 44:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 26:
                {
                alt10=6;
                }
                break;
            case 28:
                {
                alt10=7;
                }
                break;
            case 18:
                {
                alt10=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("665:1: ( (this_declaration_0= ruledeclaration ruleendExpr ) | ( () ruleexpr ruleendExpr ) | ( () ruleassignment ruleendExpr ) | ( () 'return' ( ruleexpr )? ruleendExpr ) | ( 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? ) | ( 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) ) ) | ( 'while' ruleexpr ':' this_statement_27= rulestatement ) | this_block_28= ruleblock )", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:665:2: (this_declaration_0= ruledeclaration ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:665:2: (this_declaration_0= ruledeclaration ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:666:2: this_declaration_0= ruledeclaration ruleendExpr
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0_0(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruledeclaration_in_rulestatement1117);
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
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1135);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:6: ( () ruleexpr ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:6: ( () ruleexpr ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:7: () ruleexpr ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:690:2: 
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              temp=factory.create(grammarAccess.getStatementAccess().getStatementAction_1_0().getType().getClassifier());
                              current = temp; 
                              temp = null;
                              CompositeNode newNode = createCompositeNode(grammarAccess.getStatementAccess().getStatementAction_1_0(), currentNode.getParent());
                          newNode.getChildren().add(currentNode);
                          moveLookaheadInfo(currentNode, newNode);
                          currentNode = newNode; 
                              associateNodeWithAstElement(currentNode, current); 
                          
                    }

                    }

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_1_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1173);
                    ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_1_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1191);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:6: ( () ruleassignment ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:6: ( () ruleassignment ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:7: () ruleassignment ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:727:2: 
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

                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getAssignmentParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleassignment_in_rulestatement1229);
                    ruleassignment();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getEndExprParserRuleCall_2_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1247);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:763:6: ( () 'return' ( ruleexpr )? ruleendExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:763:6: ( () 'return' ( ruleexpr )? ruleendExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:763:7: () 'return' ( ruleexpr )? ruleendExpr
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:763:7: ()
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:764:2: 
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

                    match(input,23,FOLLOW_23_in_rulestatement1276); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getReturnKeyword_3_1(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:781:1: ( ruleexpr )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID||LA8_0==RULE_CONSTANT||LA8_0==13||LA8_0==44) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:782:2: ruleexpr
                            {
                            if ( backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( backtracking==0 ) {
                               
                                      currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_3_2(), currentNode); 
                                  
                            }
                            pushFollow(FOLLOW_ruleexpr_in_rulestatement1296);
                            ruleexpr();
                            _fsp--;
                            if (failed) return current;
                            if ( backtracking==0 ) {
                               
                                      currentNode = currentNode.getParent();
                                  
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
                    pushFollow(FOLLOW_ruleendExpr_in_rulestatement1316);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:804:6: ( 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:804:6: ( 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )? )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:804:8: 'if' ruleexpr ':' this_statement_15= rulestatement ( 'else' ( (lv_statements_17_0= rulestatement ) ) )?
                    {
                    match(input,24,FOLLOW_24_in_rulestatement1333); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getIfKeyword_4_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_4_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1352);
                    ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,15,FOLLOW_15_in_rulestatement1361); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_4_2(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_4_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1386);
                    this_statement_15=rulestatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_statement_15; 
                              currentNode = currentNode.getParent();
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:835:1: ( 'else' ( (lv_statements_17_0= rulestatement ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==25) ) {
                        int LA9_1 = input.LA(2);

                        if ( (synpred15()) ) {
                            alt9=1;
                        }
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:835:3: 'else' ( (lv_statements_17_0= rulestatement ) )
                            {
                            match(input,25,FOLLOW_25_in_rulestatement1396); if (failed) return current;
                            if ( backtracking==0 ) {

                                      createLeafNode(grammarAccess.getStatementAccess().getElseKeyword_4_4_0(), null); 
                                  
                            }
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:839:1: ( (lv_statements_17_0= rulestatement ) )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:840:1: (lv_statements_17_0= rulestatement )
                            {
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:840:1: (lv_statements_17_0= rulestatement )
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:841:3: lv_statements_17_0= rulestatement
                            {
                            if ( backtracking==0 ) {
                               
                              	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0(), currentNode); 
                              	    
                            }
                            pushFollow(FOLLOW_rulestatement_in_rulestatement1417);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:864:6: ( 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:864:6: ( 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:864:8: 'for' this_param_19= ruleparam 'in' ruleexpr ':' ( (lv_statements_23_0= rulestatement ) )
                    {
                    match(input,26,FOLLOW_26_in_rulestatement1437); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getForKeyword_5_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getParamParserRuleCall_5_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleparam_in_rulestatement1462);
                    this_param_19=ruleparam();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_param_19; 
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,27,FOLLOW_27_in_rulestatement1471); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getInKeyword_5_2(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_5_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1490);
                    ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,15,FOLLOW_15_in_rulestatement1499); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_5_4(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:899:1: ( (lv_statements_23_0= rulestatement ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:900:1: (lv_statements_23_0= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:900:1: (lv_statements_23_0= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:901:3: lv_statements_23_0= rulestatement
                    {
                    if ( backtracking==0 ) {
                       
                      	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_5_0(), currentNode); 
                      	    
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1520);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:924:6: ( 'while' ruleexpr ':' this_statement_27= rulestatement )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:924:6: ( 'while' ruleexpr ':' this_statement_27= rulestatement )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:924:8: 'while' ruleexpr ':' this_statement_27= rulestatement
                    {
                    match(input,28,FOLLOW_28_in_rulestatement1538); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getWhileKeyword_6_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getExprParserRuleCall_6_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_rulestatement1557);
                    ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    match(input,15,FOLLOW_15_in_rulestatement1566); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getStatementAccess().getColonKeyword_6_2(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementParserRuleCall_6_3(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulestatement_in_rulestatement1591);
                    this_statement_27=rulestatement();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              current = this_statement_27; 
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:957:2: this_block_28= ruleblock
                    {
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getStatementAccess().getBlockParserRuleCall_7(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleblock_in_rulestatement1622);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:976:1: entryRuledeclaration returns [EObject current=null] : iv_ruledeclaration= ruledeclaration EOF ;
    public final EObject entryRuledeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledeclaration = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:977:2: (iv_ruledeclaration= ruledeclaration EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:978:2: iv_ruledeclaration= ruledeclaration EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getDeclarationRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration1657);
            iv_ruledeclaration=ruledeclaration();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruledeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration1667); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:985:1: ruledeclaration returns [EObject current=null] : ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ruleexpr )? ) ;
    public final EObject ruledeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        EObject lv_variableType_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:990:6: ( ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ruleexpr )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:1: ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ruleexpr )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:1: ( ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ruleexpr )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:2: ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+ ( (lv_name_2_0= RULE_ID ) ) ( '=' ruleexpr )?
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:2: ( ( (lv_variableType_0_0= ruletype ) ) ( '[]' )? )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_1 = input.LA(2);

                    if ( (LA12_1==RULE_ID||(LA12_1>=20 && LA12_1<=22)||LA12_1==29) ) {
                        alt12=1;
                    }


                }
                else if ( ((LA12_0>=20 && LA12_0<=22)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:3: ( (lv_variableType_0_0= ruletype ) ) ( '[]' )?
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:991:3: ( (lv_variableType_0_0= ruletype ) )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:992:1: (lv_variableType_0_0= ruletype )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:992:1: (lv_variableType_0_0= ruletype )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:993:3: lv_variableType_0_0= ruletype
            	    {
            	    if ( backtracking==0 ) {
            	       
            	      	        currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getVariableTypeTypeParserRuleCall_0_0_0(), currentNode); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruletype_in_ruledeclaration1714);
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

            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1015:2: ( '[]' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==29) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1015:4: '[]'
            	            {
            	            match(input,29,FOLLOW_29_in_ruledeclaration1725); if (failed) return current;
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

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1019:5: ( (lv_name_2_0= RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1020:1: (lv_name_2_0= RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1020:1: (lv_name_2_0= RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1021:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruledeclaration1746); if (failed) return current;
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

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1043:2: ( '=' ruleexpr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1043:4: '=' ruleexpr
                    {
                    match(input,30,FOLLOW_30_in_ruledeclaration1762); if (failed) return current;
                    if ( backtracking==0 ) {

                              createLeafNode(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getDeclarationAccess().getExprParserRuleCall_2_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruledeclaration1781);
                    ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1066:1: entryRuleassignment returns [String current=null] : iv_ruleassignment= ruleassignment EOF ;
    public final String entryRuleassignment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassignment = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1067:2: (iv_ruleassignment= ruleassignment EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1068:2: iv_ruleassignment= ruleassignment EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAssignmentRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleassignment_in_entryRuleassignment1819);
            iv_ruleassignment=ruleassignment();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleassignment.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment1830); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1075:1: ruleassignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_postfixExpr_0= rulepostfixExpr kw= '=' this_expr_2= ruleexpr ) ;
    public final AntlrDatatypeRuleToken ruleassignment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_postfixExpr_0 = null;

        AntlrDatatypeRuleToken this_expr_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1080:6: ( (this_postfixExpr_0= rulepostfixExpr kw= '=' this_expr_2= ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1081:1: (this_postfixExpr_0= rulepostfixExpr kw= '=' this_expr_2= ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1081:1: (this_postfixExpr_0= rulepostfixExpr kw= '=' this_expr_2= ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1082:5: this_postfixExpr_0= rulepostfixExpr kw= '=' this_expr_2= ruleexpr
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getPostfixExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_ruleassignment1877);
            this_postfixExpr_0=rulepostfixExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_postfixExpr_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            kw=(Token)input.LT(1);
            match(input,30,FOLLOW_30_in_ruleassignment1895); if (failed) return current;
            if ( backtracking==0 ) {

                      current.merge(kw);
                      createLeafNode(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1(), null); 
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAssignmentAccess().getExprParserRuleCall_2(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleexpr_in_ruleassignment1917);
            this_expr_2=ruleexpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_expr_2);
                  
            }
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
    // $ANTLR end ruleassignment


    // $ANTLR start entryRuleexpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1117:1: entryRuleexpr returns [String current=null] : iv_ruleexpr= ruleexpr EOF ;
    public final String entryRuleexpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleexpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1118:2: (iv_ruleexpr= ruleexpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1119:2: iv_ruleexpr= ruleexpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr1963);
            iv_ruleexpr=ruleexpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleexpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr1974); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1126:1: ruleexpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_andExpr_0= ruleandExpr (kw= '||' this_andExpr_2= ruleandExpr )* ) ;
    public final AntlrDatatypeRuleToken ruleexpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_andExpr_0 = null;

        AntlrDatatypeRuleToken this_andExpr_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1131:6: ( (this_andExpr_0= ruleandExpr (kw= '||' this_andExpr_2= ruleandExpr )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1132:1: (this_andExpr_0= ruleandExpr (kw= '||' this_andExpr_2= ruleandExpr )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1132:1: (this_andExpr_0= ruleandExpr (kw= '||' this_andExpr_2= ruleandExpr )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1133:5: this_andExpr_0= ruleandExpr (kw= '||' this_andExpr_2= ruleandExpr )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getExprAccess().getAndExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleandExpr_in_ruleexpr2021);
            this_andExpr_0=ruleandExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_andExpr_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1143:1: (kw= '||' this_andExpr_2= ruleandExpr )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1144:2: kw= '||' this_andExpr_2= ruleandExpr
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,31,FOLLOW_31_in_ruleexpr2040); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0(), null); 
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode=createCompositeNode(grammarAccess.getExprAccess().getAndExprParserRuleCall_1_1(), currentNode); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleandExpr_in_ruleexpr2062);
            	    this_andExpr_2=ruleandExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_andExpr_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode = currentNode.getParent();
            	          
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1168:1: entryRuleandExpr returns [String current=null] : iv_ruleandExpr= ruleandExpr EOF ;
    public final String entryRuleandExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleandExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1169:2: (iv_ruleandExpr= ruleandExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1170:2: iv_ruleandExpr= ruleandExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAndExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_entryRuleandExpr2110);
            iv_ruleandExpr=ruleandExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleandExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpr2121); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1177:1: ruleandExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_eqExpr_0= ruleeqExpr (kw= '&&' this_eqExpr_2= ruleeqExpr )* ) ;
    public final AntlrDatatypeRuleToken ruleandExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_eqExpr_0 = null;

        AntlrDatatypeRuleToken this_eqExpr_2 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1182:6: ( (this_eqExpr_0= ruleeqExpr (kw= '&&' this_eqExpr_2= ruleeqExpr )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1183:1: (this_eqExpr_0= ruleeqExpr (kw= '&&' this_eqExpr_2= ruleeqExpr )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1183:1: (this_eqExpr_0= ruleeqExpr (kw= '&&' this_eqExpr_2= ruleeqExpr )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1184:5: this_eqExpr_0= ruleeqExpr (kw= '&&' this_eqExpr_2= ruleeqExpr )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleeqExpr_in_ruleandExpr2168);
            this_eqExpr_0=ruleeqExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_eqExpr_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1194:1: (kw= '&&' this_eqExpr_2= ruleeqExpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1195:2: kw= '&&' this_eqExpr_2= ruleeqExpr
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,32,FOLLOW_32_in_ruleandExpr2187); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_0(), null); 
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode=createCompositeNode(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_1_1(), currentNode); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleeqExpr_in_ruleandExpr2209);
            	    this_eqExpr_2=ruleeqExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_eqExpr_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode = currentNode.getParent();
            	          
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1219:1: entryRuleeqExpr returns [String current=null] : iv_ruleeqExpr= ruleeqExpr EOF ;
    public final String entryRuleeqExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleeqExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1220:2: (iv_ruleeqExpr= ruleeqExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1221:2: iv_ruleeqExpr= ruleeqExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEqExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_entryRuleeqExpr2257);
            iv_ruleeqExpr=ruleeqExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleeqExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleeqExpr2268); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1228:1: ruleeqExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_relExpr_0= rulerelExpr ( (kw= '==' | kw= '!=' ) this_relExpr_3= rulerelExpr )* ) ;
    public final AntlrDatatypeRuleToken ruleeqExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_relExpr_0 = null;

        AntlrDatatypeRuleToken this_relExpr_3 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1233:6: ( (this_relExpr_0= rulerelExpr ( (kw= '==' | kw= '!=' ) this_relExpr_3= rulerelExpr )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1234:1: (this_relExpr_0= rulerelExpr ( (kw= '==' | kw= '!=' ) this_relExpr_3= rulerelExpr )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1234:1: (this_relExpr_0= rulerelExpr ( (kw= '==' | kw= '!=' ) this_relExpr_3= rulerelExpr )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1235:5: this_relExpr_0= rulerelExpr ( (kw= '==' | kw= '!=' ) this_relExpr_3= rulerelExpr )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulerelExpr_in_ruleeqExpr2315);
            this_relExpr_0=rulerelExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_relExpr_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1245:1: ( (kw= '==' | kw= '!=' ) this_relExpr_3= rulerelExpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=33 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1245:2: (kw= '==' | kw= '!=' ) this_relExpr_3= rulerelExpr
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1245:2: (kw= '==' | kw= '!=' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==33) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==34) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1245:2: (kw= '==' | kw= '!=' )", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1246:2: kw= '=='
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,33,FOLLOW_33_in_ruleeqExpr2335); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1253:2: kw= '!='
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,34,FOLLOW_34_in_ruleeqExpr2354); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getEqExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    if ( backtracking==0 ) {
            	       
            	              currentNode=createCompositeNode(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_1_1(), currentNode); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulerelExpr_in_ruleeqExpr2377);
            	    this_relExpr_3=rulerelExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_relExpr_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode = currentNode.getParent();
            	          
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1277:1: entryRulerelExpr returns [String current=null] : iv_rulerelExpr= rulerelExpr EOF ;
    public final String entryRulerelExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1278:2: (iv_rulerelExpr= rulerelExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1279:2: iv_rulerelExpr= rulerelExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getRelExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_entryRulerelExpr2425);
            iv_rulerelExpr=rulerelExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulerelExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelExpr2436); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1286:1: rulerelExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_addExpr_0= ruleaddExpr ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_addExpr_5= ruleaddExpr )* ) ;
    public final AntlrDatatypeRuleToken rulerelExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_addExpr_0 = null;

        AntlrDatatypeRuleToken this_addExpr_5 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1291:6: ( (this_addExpr_0= ruleaddExpr ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_addExpr_5= ruleaddExpr )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1292:1: (this_addExpr_0= ruleaddExpr ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_addExpr_5= ruleaddExpr )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1292:1: (this_addExpr_0= ruleaddExpr ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_addExpr_5= ruleaddExpr )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1293:5: this_addExpr_0= ruleaddExpr ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_addExpr_5= ruleaddExpr )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rulerelExpr2483);
            this_addExpr_0=ruleaddExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_addExpr_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1303:1: ( (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_addExpr_5= ruleaddExpr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=35 && LA19_0<=38)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1303:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' ) this_addExpr_5= ruleaddExpr
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1303:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )
            	    int alt18=4;
            	    switch ( input.LA(1) ) {
            	    case 35:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case 36:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt18=4;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1303:2: (kw= '<' | kw= '>' | kw= '<=' | kw= '>=' )", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1304:2: kw= '<'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,35,FOLLOW_35_in_rulerelExpr2503); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1311:2: kw= '>'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,36,FOLLOW_36_in_rulerelExpr2522); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1318:2: kw= '<='
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,37,FOLLOW_37_in_rulerelExpr2541); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1325:2: kw= '>='
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,38,FOLLOW_38_in_rulerelExpr2560); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getRelExprAccess().getGreaterThanSignEqualsSignKeyword_1_0_3(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    if ( backtracking==0 ) {
            	       
            	              currentNode=createCompositeNode(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_1_1(), currentNode); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleaddExpr_in_rulerelExpr2583);
            	    this_addExpr_5=ruleaddExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_addExpr_5);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode = currentNode.getParent();
            	          
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1349:1: entryRuleaddExpr returns [String current=null] : iv_ruleaddExpr= ruleaddExpr EOF ;
    public final String entryRuleaddExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleaddExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1350:2: (iv_ruleaddExpr= ruleaddExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1351:2: iv_ruleaddExpr= ruleaddExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAddExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_entryRuleaddExpr2631);
            iv_ruleaddExpr=ruleaddExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleaddExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaddExpr2642); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1358:1: ruleaddExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_mulExpr_0= rulemulExpr ( (kw= '+' | kw= '-' ) this_mulExpr_3= rulemulExpr )* ) ;
    public final AntlrDatatypeRuleToken ruleaddExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_mulExpr_0 = null;

        AntlrDatatypeRuleToken this_mulExpr_3 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1363:6: ( (this_mulExpr_0= rulemulExpr ( (kw= '+' | kw= '-' ) this_mulExpr_3= rulemulExpr )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1364:1: (this_mulExpr_0= rulemulExpr ( (kw= '+' | kw= '-' ) this_mulExpr_3= rulemulExpr )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1364:1: (this_mulExpr_0= rulemulExpr ( (kw= '+' | kw= '-' ) this_mulExpr_3= rulemulExpr )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1365:5: this_mulExpr_0= rulemulExpr ( (kw= '+' | kw= '-' ) this_mulExpr_3= rulemulExpr )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_rulemulExpr_in_ruleaddExpr2689);
            this_mulExpr_0=rulemulExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_mulExpr_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1375:1: ( (kw= '+' | kw= '-' ) this_mulExpr_3= rulemulExpr )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=39 && LA21_0<=40)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1375:2: (kw= '+' | kw= '-' ) this_mulExpr_3= rulemulExpr
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1375:2: (kw= '+' | kw= '-' )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==39) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==40) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1375:2: (kw= '+' | kw= '-' )", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1376:2: kw= '+'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,39,FOLLOW_39_in_ruleaddExpr2709); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getAddExprAccess().getPlusSignKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1383:2: kw= '-'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,40,FOLLOW_40_in_ruleaddExpr2728); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getAddExprAccess().getHyphenMinusKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    if ( backtracking==0 ) {
            	       
            	              currentNode=createCompositeNode(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_1_1(), currentNode); 
            	          
            	    }
            	    pushFollow(FOLLOW_rulemulExpr_in_ruleaddExpr2751);
            	    this_mulExpr_3=rulemulExpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_mulExpr_3);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode = currentNode.getParent();
            	          
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
    // $ANTLR end ruleaddExpr


    // $ANTLR start entryRulemulExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1407:1: entryRulemulExpr returns [String current=null] : iv_rulemulExpr= rulemulExpr EOF ;
    public final String entryRulemulExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulemulExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1408:2: (iv_rulemulExpr= rulemulExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1409:2: iv_rulemulExpr= rulemulExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getMulExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_entryRulemulExpr2799);
            iv_rulemulExpr=rulemulExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulemulExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemulExpr2810); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1416:1: rulemulExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_atom_0= ruleatom ( (kw= '*' | kw= '/' | kw= '%' ) this_atom_4= ruleatom )* ) ;
    public final AntlrDatatypeRuleToken rulemulExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_atom_0 = null;

        AntlrDatatypeRuleToken this_atom_4 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1421:6: ( (this_atom_0= ruleatom ( (kw= '*' | kw= '/' | kw= '%' ) this_atom_4= ruleatom )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1422:1: (this_atom_0= ruleatom ( (kw= '*' | kw= '/' | kw= '%' ) this_atom_4= ruleatom )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1422:1: (this_atom_0= ruleatom ( (kw= '*' | kw= '/' | kw= '%' ) this_atom_4= ruleatom )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1423:5: this_atom_0= ruleatom ( (kw= '*' | kw= '/' | kw= '%' ) this_atom_4= ruleatom )*
            {
            if ( backtracking==0 ) {
               
                      currentNode=createCompositeNode(grammarAccess.getMulExprAccess().getAtomParserRuleCall_0(), currentNode); 
                  
            }
            pushFollow(FOLLOW_ruleatom_in_rulemulExpr2857);
            this_atom_0=ruleatom();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_atom_0);
                  
            }
            if ( backtracking==0 ) {
               
                      currentNode = currentNode.getParent();
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1433:1: ( (kw= '*' | kw= '/' | kw= '%' ) this_atom_4= ruleatom )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=41 && LA23_0<=43)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1433:2: (kw= '*' | kw= '/' | kw= '%' ) this_atom_4= ruleatom
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1433:2: (kw= '*' | kw= '/' | kw= '%' )
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case 41:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case 42:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case 43:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        if (backtracking>0) {failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("1433:2: (kw= '*' | kw= '/' | kw= '%' )", 22, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1434:2: kw= '*'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,41,FOLLOW_41_in_rulemulExpr2877); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1441:2: kw= '/'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,42,FOLLOW_42_in_rulemulExpr2896); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1(), null); 
            	                  
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1448:2: kw= '%'
            	            {
            	            kw=(Token)input.LT(1);
            	            match(input,43,FOLLOW_43_in_rulemulExpr2915); if (failed) return current;
            	            if ( backtracking==0 ) {

            	                      current.merge(kw);
            	                      createLeafNode(grammarAccess.getMulExprAccess().getPercentSignKeyword_1_0_2(), null); 
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    if ( backtracking==0 ) {
            	       
            	              currentNode=createCompositeNode(grammarAccess.getMulExprAccess().getAtomParserRuleCall_1_1(), currentNode); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleatom_in_rulemulExpr2938);
            	    this_atom_4=ruleatom();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_atom_4);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode = currentNode.getParent();
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1472:1: entryRuleatom returns [String current=null] : iv_ruleatom= ruleatom EOF ;
    public final String entryRuleatom() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleatom = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1473:2: (iv_ruleatom= ruleatom EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1474:2: iv_ruleatom= ruleatom EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getAtomRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleatom_in_entryRuleatom2986);
            iv_ruleatom=ruleatom();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleatom.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleatom2997); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1481:1: ruleatom returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' this_atom_1= ruleatom ) | (kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')' ) | (kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')' ) | (kw= '(' this_expr_12= ruleexpr kw= ')' ) | this_postfixExpr_14= rulepostfixExpr | this_constant_15= RULE_CONSTANT ) ;
    public final AntlrDatatypeRuleToken ruleatom() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_sign_3=null;
        Token this_constant_15=null;
        AntlrDatatypeRuleToken this_atom_1 = null;

        AntlrDatatypeRuleToken this_expr_4 = null;

        AntlrDatatypeRuleToken this_expr_9 = null;

        AntlrDatatypeRuleToken this_expr_12 = null;

        AntlrDatatypeRuleToken this_postfixExpr_14 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1486:6: ( ( (kw= '!' this_atom_1= ruleatom ) | (kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')' ) | (kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')' ) | (kw= '(' this_expr_12= ruleexpr kw= ')' ) | this_postfixExpr_14= rulepostfixExpr | this_constant_15= RULE_CONSTANT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1487:1: ( (kw= '!' this_atom_1= ruleatom ) | (kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')' ) | (kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')' ) | (kw= '(' this_expr_12= ruleexpr kw= ')' ) | this_postfixExpr_14= rulepostfixExpr | this_constant_15= RULE_CONSTANT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1487:1: ( (kw= '!' this_atom_1= ruleatom ) | (kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')' ) | (kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')' ) | (kw= '(' this_expr_12= ruleexpr kw= ')' ) | this_postfixExpr_14= rulepostfixExpr | this_constant_15= RULE_CONSTANT )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt25=1;
                }
                break;
            case 13:
                {
                switch ( input.LA(2) ) {
                case RULE_SIGN:
                    {
                    alt25=2;
                    }
                    break;
                case 39:
                case 40:
                    {
                    alt25=3;
                    }
                    break;
                case RULE_ID:
                case RULE_CONSTANT:
                case 13:
                case 44:
                    {
                    alt25=4;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("1487:1: ( (kw= '!' this_atom_1= ruleatom ) | (kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')' ) | (kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')' ) | (kw= '(' this_expr_12= ruleexpr kw= ')' ) | this_postfixExpr_14= rulepostfixExpr | this_constant_15= RULE_CONSTANT )", 25, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_ID:
                {
                alt25=5;
                }
                break;
            case RULE_CONSTANT:
                {
                alt25=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1487:1: ( (kw= '!' this_atom_1= ruleatom ) | (kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')' ) | (kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')' ) | (kw= '(' this_expr_12= ruleexpr kw= ')' ) | this_postfixExpr_14= rulepostfixExpr | this_constant_15= RULE_CONSTANT )", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1487:2: (kw= '!' this_atom_1= ruleatom )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1487:2: (kw= '!' this_atom_1= ruleatom )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1488:2: kw= '!' this_atom_1= ruleatom
                    {
                    kw=(Token)input.LT(1);
                    match(input,44,FOLLOW_44_in_ruleatom3036); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAtomAccess().getExclamationMarkKeyword_0_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getAtomParserRuleCall_0_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleatom_in_ruleatom3058);
                    this_atom_1=ruleatom();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_atom_1);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1505:6: (kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1505:6: (kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1506:2: kw= '(' this_sign_3= RULE_SIGN this_expr_4= ruleexpr kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleatom3084); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0(), null); 
                          
                    }
                    this_sign_3=(Token)input.LT(1);
                    match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_ruleatom3099); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_sign_3);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAtomAccess().getSignTerminalRuleCall_1_1(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_1_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3126);
                    this_expr_4=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_expr_4);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleatom3144); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1536:6: (kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1536:6: (kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1537:2: kw= '(' (kw= '+' | kw= '-' ) this_expr_9= ruleexpr kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleatom3165); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0(), null); 
                          
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1542:1: (kw= '+' | kw= '-' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==39) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==40) ) {
                        alt24=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("1542:1: (kw= '+' | kw= '-' )", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1543:2: kw= '+'
                            {
                            kw=(Token)input.LT(1);
                            match(input,39,FOLLOW_39_in_ruleatom3179); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getAtomAccess().getPlusSignKeyword_2_1_0(), null); 
                                  
                            }

                            }
                            break;
                        case 2 :
                            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1550:2: kw= '-'
                            {
                            kw=(Token)input.LT(1);
                            match(input,40,FOLLOW_40_in_ruleatom3198); if (failed) return current;
                            if ( backtracking==0 ) {

                                      current.merge(kw);
                                      createLeafNode(grammarAccess.getAtomAccess().getHyphenMinusKeyword_2_1_1(), null); 
                                  
                            }

                            }
                            break;

                    }

                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_2_2(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3221);
                    this_expr_9=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_expr_9);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleatom3239); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_3(), null); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1573:6: (kw= '(' this_expr_12= ruleexpr kw= ')' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1573:6: (kw= '(' this_expr_12= ruleexpr kw= ')' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1574:2: kw= '(' this_expr_12= ruleexpr kw= ')'
                    {
                    kw=(Token)input.LT(1);
                    match(input,13,FOLLOW_13_in_ruleatom3260); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_3_0(), null); 
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getExprParserRuleCall_3_1(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_ruleexpr_in_ruleatom3282);
                    this_expr_12=ruleexpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_expr_12);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }
                    kw=(Token)input.LT(1);
                    match(input,14,FOLLOW_14_in_ruleatom3300); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getAtomAccess().getRightParenthesisKeyword_3_2(), null); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1598:5: this_postfixExpr_14= rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       
                              currentNode=createCompositeNode(grammarAccess.getAtomAccess().getPostfixExprParserRuleCall_4(), currentNode); 
                          
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_ruleatom3329);
                    this_postfixExpr_14=rulepostfixExpr();
                    _fsp--;
                    if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_postfixExpr_14);
                          
                    }
                    if ( backtracking==0 ) {
                       
                              currentNode = currentNode.getParent();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1609:10: this_constant_15= RULE_CONSTANT
                    {
                    this_constant_15=(Token)input.LT(1);
                    match(input,RULE_CONSTANT,FOLLOW_RULE_CONSTANT_in_ruleatom3355); if (failed) return current;
                    if ( backtracking==0 ) {

                      		current.merge(this_constant_15);
                          
                    }
                    if ( backtracking==0 ) {
                       
                          createLeafNode(grammarAccess.getAtomAccess().getConstantTerminalRuleCall_5(), null); 
                          
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1624:1: entryRulepostfixExpr returns [String current=null] : iv_rulepostfixExpr= rulepostfixExpr EOF ;
    public final String entryRulepostfixExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepostfixExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1625:2: (iv_rulepostfixExpr= rulepostfixExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1626:2: iv_rulepostfixExpr= rulepostfixExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getPostfixExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr3401);
            iv_rulepostfixExpr=rulepostfixExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_rulepostfixExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepostfixExpr3412); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1633:1: rulepostfixExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')' ) | (kw= '[' this_expr_9= ruleexpr kw= ']' ) )* ) ;
    public final AntlrDatatypeRuleToken rulepostfixExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_expr_4 = null;

        AntlrDatatypeRuleToken this_expr_6 = null;

        AntlrDatatypeRuleToken this_expr_9 = null;


         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1638:6: ( (this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')' ) | (kw= '[' this_expr_9= ruleexpr kw= ']' ) )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1639:1: (this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')' ) | (kw= '[' this_expr_9= ruleexpr kw= ']' ) )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1639:1: (this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')' ) | (kw= '[' this_expr_9= ruleexpr kw= ']' ) )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1639:6: this_ID_0= RULE_ID ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')' ) | (kw= '[' this_expr_9= ruleexpr kw= ']' ) )*
            {
            this_ID_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3452); if (failed) return current;
            if ( backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( backtracking==0 ) {
               
                  createLeafNode(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_0(), null); 
                  
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1646:1: ( (kw= '.' this_ID_2= RULE_ID ) | (kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')' ) | (kw= '[' this_expr_9= ruleexpr kw= ']' ) )*
            loop28:
            do {
                int alt28=4;
                switch ( input.LA(1) ) {
                case 45:
                    {
                    alt28=1;
                    }
                    break;
                case 13:
                    {
                    alt28=2;
                    }
                    break;
                case 46:
                    {
                    alt28=3;
                    }
                    break;

                }

                switch (alt28) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1646:2: (kw= '.' this_ID_2= RULE_ID )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1646:2: (kw= '.' this_ID_2= RULE_ID )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1647:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,45,FOLLOW_45_in_rulepostfixExpr3472); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getPostfixExprAccess().getFullStopKeyword_1_0_0(), null); 
            	          
            	    }
            	    this_ID_2=(Token)input.LT(1);
            	    match(input,RULE_ID,FOLLOW_RULE_ID_in_rulepostfixExpr3487); if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	          createLeafNode(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_1_0_1(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1660:6: (kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')' )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1660:6: (kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')' )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1661:2: kw= '(' (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )? kw= ')'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,13,FOLLOW_13_in_rulepostfixExpr3513); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_1_1_0(), null); 
            	          
            	    }
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1666:1: (this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )* )?
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==RULE_ID||LA27_0==RULE_CONSTANT||LA27_0==13||LA27_0==44) ) {
            	        alt27=1;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1667:5: this_expr_4= ruleexpr (kw= ',' this_expr_6= ruleexpr )*
            	            {
            	            if ( backtracking==0 ) {
            	               
            	                      currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExprParserRuleCall_1_1_1_0(), currentNode); 
            	                  
            	            }
            	            pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3536);
            	            this_expr_4=ruleexpr();
            	            _fsp--;
            	            if (failed) return current;
            	            if ( backtracking==0 ) {

            	              		current.merge(this_expr_4);
            	                  
            	            }
            	            if ( backtracking==0 ) {
            	               
            	                      currentNode = currentNode.getParent();
            	                  
            	            }
            	            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1677:1: (kw= ',' this_expr_6= ruleexpr )*
            	            loop26:
            	            do {
            	                int alt26=2;
            	                int LA26_0 = input.LA(1);

            	                if ( (LA26_0==17) ) {
            	                    alt26=1;
            	                }


            	                switch (alt26) {
            	            	case 1 :
            	            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1678:2: kw= ',' this_expr_6= ruleexpr
            	            	    {
            	            	    kw=(Token)input.LT(1);
            	            	    match(input,17,FOLLOW_17_in_rulepostfixExpr3555); if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	              current.merge(kw);
            	            	              createLeafNode(grammarAccess.getPostfixExprAccess().getCommaKeyword_1_1_1_1_0(), null); 
            	            	          
            	            	    }
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	              currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExprParserRuleCall_1_1_1_1_1(), currentNode); 
            	            	          
            	            	    }
            	            	    pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3577);
            	            	    this_expr_6=ruleexpr();
            	            	    _fsp--;
            	            	    if (failed) return current;
            	            	    if ( backtracking==0 ) {

            	            	      		current.merge(this_expr_6);
            	            	          
            	            	    }
            	            	    if ( backtracking==0 ) {
            	            	       
            	            	              currentNode = currentNode.getParent();
            	            	          
            	            	    }

            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop26;
            	                }
            	            } while (true);


            	            }
            	            break;

            	    }

            	    kw=(Token)input.LT(1);
            	    match(input,14,FOLLOW_14_in_rulepostfixExpr3599); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_1_1_2(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1701:6: (kw= '[' this_expr_9= ruleexpr kw= ']' )
            	    {
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1701:6: (kw= '[' this_expr_9= ruleexpr kw= ']' )
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1702:2: kw= '[' this_expr_9= ruleexpr kw= ']'
            	    {
            	    kw=(Token)input.LT(1);
            	    match(input,46,FOLLOW_46_in_rulepostfixExpr3620); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_1_2_0(), null); 
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode=createCompositeNode(grammarAccess.getPostfixExprAccess().getExprParserRuleCall_1_2_1(), currentNode); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleexpr_in_rulepostfixExpr3642);
            	    this_expr_9=ruleexpr();
            	    _fsp--;
            	    if (failed) return current;
            	    if ( backtracking==0 ) {

            	      		current.merge(this_expr_9);
            	          
            	    }
            	    if ( backtracking==0 ) {
            	       
            	              currentNode = currentNode.getParent();
            	          
            	    }
            	    kw=(Token)input.LT(1);
            	    match(input,47,FOLLOW_47_in_rulepostfixExpr3660); if (failed) return current;
            	    if ( backtracking==0 ) {

            	              current.merge(kw);
            	              createLeafNode(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_1_2_2(), null); 
            	          
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
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


    // $ANTLR start entryRuleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1732:1: entryRuleendExpr returns [String current=null] : iv_ruleendExpr= ruleendExpr EOF ;
    public final String entryRuleendExpr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleendExpr = null;


        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1733:2: (iv_ruleendExpr= ruleendExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1734:2: iv_ruleendExpr= ruleendExpr EOF
            {
            if ( backtracking==0 ) {
               currentNode = createCompositeNode(grammarAccess.getEndExprRule(), currentNode); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_entryRuleendExpr3704);
            iv_ruleendExpr=ruleendExpr();
            _fsp--;
            if (failed) return current;
            if ( backtracking==0 ) {
               current =iv_ruleendExpr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleendExpr3715); if (failed) return current;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1741:1: ruleendExpr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= ',' | kw= ';' ) ;
    public final AntlrDatatypeRuleToken ruleendExpr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1746:6: ( (kw= ',' | kw= ';' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1747:1: (kw= ',' | kw= ';' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1747:1: (kw= ',' | kw= ';' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            else if ( (LA29_0==48) ) {
                alt29=2;
            }
            else {
                if (backtracking>0) {failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("1747:1: (kw= ',' | kw= ';' )", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1748:2: kw= ','
                    {
                    kw=(Token)input.LT(1);
                    match(input,17,FOLLOW_17_in_ruleendExpr3753); if (failed) return current;
                    if ( backtracking==0 ) {

                              current.merge(kw);
                              createLeafNode(grammarAccess.getEndExprAccess().getCommaKeyword_0(), null); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:1755:2: kw= ';'
                    {
                    kw=(Token)input.LT(1);
                    match(input,48,FOLLOW_48_in_ruleendExpr3772); if (failed) return current;
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
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:665:2: ( ( ruledeclaration ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:665:2: ( ruledeclaration ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:665:2: ( ruledeclaration ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:666:2: ruledeclaration ruleendExpr
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruledeclaration_in_synpred101117);
        ruledeclaration();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_ruleendExpr_in_synpred101135);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred10

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:6: ( ( () ruleexpr ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:6: ( () ruleexpr ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:6: ( () ruleexpr ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:7: () ruleexpr ruleendExpr
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:689:7: ()
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:690:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        pushFollow(FOLLOW_ruleexpr_in_synpred111173);
        ruleexpr();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_ruleendExpr_in_synpred111191);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred12
    public final void synpred12_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:6: ( ( () ruleassignment ruleendExpr ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:6: ( () ruleassignment ruleendExpr )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:6: ( () ruleassignment ruleendExpr )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:7: () ruleassignment ruleendExpr
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:726:7: ()
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:727:2: 
        {
        if ( backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        pushFollow(FOLLOW_ruleassignment_in_synpred121229);
        ruleassignment();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_ruleendExpr_in_synpred121247);
        ruleendExpr();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred12

    // $ANTLR start synpred15
    public final void synpred15_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:835:3: ( 'else' ( ( rulestatement ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:835:3: 'else' ( ( rulestatement ) )
        {
        match(input,25,FOLLOW_25_in_synpred151396); if (failed) return ;
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:839:1: ( ( rulestatement ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:840:1: ( rulestatement )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:840:1: ( rulestatement )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage/src-gen/org/xtext/example/mydsl1/parser/antlr/internal/InternalMyDsl.g:841:3: rulestatement
        {
        if ( backtracking==0 ) {
           
          	        currentNode=createCompositeNode(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0(), currentNode); 
          	    
        }
        pushFollow(FOLLOW_rulestatement_in_synpred151417);
        rulestatement();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred15

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
    public static final BitSet FOLLOW_rulefunctionDefinition_in_ruleModel150 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_rulemainFunction_in_ruleModel172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_entryRulefunctionDefinition209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctionDefinition219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulefunctionDefinition261 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulefunctionDefinition276 = new BitSet(new long[]{0x0000000000704010L});
    public static final BitSet FOLLOW_ruleformalParams_in_rulefunctionDefinition297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulefunctionDefinition308 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_15_in_rulefunctionDefinition319 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruletype_in_rulefunctionDefinition340 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleblock_in_rulefunctionDefinition363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemainFunction_in_entryRulemainFunction399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemainFunction409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rulemainFunction444 = new BitSet(new long[]{0x0000000000704010L});
    public static final BitSet FOLLOW_ruleformalParams_in_rulemainFunction465 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulemainFunction476 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleblock_in_rulemainFunction497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_entryRuleformalParams533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformalParams543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_ruleformalParams589 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17_in_ruleformalParams600 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruleparam_in_ruleformalParams621 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleparam_in_entryRuleparam659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparam669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruleparam719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleparam735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleblock833 = new BitSet(new long[]{0x0000100015FC2050L});
    public static final BitSet FOLLOW_rulestatement_in_ruleblock854 = new BitSet(new long[]{0x0000100015FC2050L});
    public static final BitSet FOLLOW_19_in_ruleblock865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruletype971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruletype987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruletype1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruletype1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rulestatement1117 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1173 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_rulestatement1229 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rulestatement1276 = new BitSet(new long[]{0x0001100000022050L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1296 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_ruleendExpr_in_rulestatement1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rulestatement1333 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1352 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulestatement1361 = new BitSet(new long[]{0x0000100015F42050L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1386 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_rulestatement1396 = new BitSet(new long[]{0x0000100015F42050L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rulestatement1437 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_ruleparam_in_rulestatement1462 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulestatement1471 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1490 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulestatement1499 = new BitSet(new long[]{0x0000100015F42050L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rulestatement1538 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_rulestatement1557 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulestatement1566 = new BitSet(new long[]{0x0000100015F42050L});
    public static final BitSet FOLLOW_rulestatement_in_rulestatement1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rulestatement1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration1657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_ruledeclaration1714 = new BitSet(new long[]{0x0000000020700010L});
    public static final BitSet FOLLOW_29_in_ruledeclaration1725 = new BitSet(new long[]{0x0000000000700010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruledeclaration1746 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruledeclaration1762 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_ruledeclaration1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_entryRuleassignment1819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_ruleassignment1877 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleassignment1895 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleassignment1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr1963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_ruleexpr2021 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_31_in_ruleexpr2040 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleandExpr_in_ruleexpr2062 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_entryRuleandExpr2110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpr2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_ruleandExpr2168 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleandExpr2187 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleeqExpr_in_ruleandExpr2209 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_entryRuleeqExpr2257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeqExpr2268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_ruleeqExpr2315 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_33_in_ruleeqExpr2335 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_34_in_ruleeqExpr2354 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_rulerelExpr_in_ruleeqExpr2377 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_entryRulerelExpr2425 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelExpr2436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rulerelExpr2483 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_35_in_rulerelExpr2503 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_36_in_rulerelExpr2522 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_37_in_rulerelExpr2541 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_38_in_rulerelExpr2560 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rulerelExpr2583 = new BitSet(new long[]{0x0000007800000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_entryRuleaddExpr2631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaddExpr2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_ruleaddExpr2689 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_39_in_ruleaddExpr2709 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_40_in_ruleaddExpr2728 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_rulemulExpr_in_ruleaddExpr2751 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_entryRulemulExpr2799 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemulExpr2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rulemulExpr2857 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_41_in_rulemulExpr2877 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_42_in_rulemulExpr2896 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_43_in_rulemulExpr2915 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleatom_in_rulemulExpr2938 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_ruleatom_in_entryRuleatom2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleatom2997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleatom3036 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleatom_in_ruleatom3058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleatom3084 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_SIGN_in_ruleatom3099 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3126 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleatom3144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleatom3165 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_39_in_ruleatom3179 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_40_in_ruleatom3198 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3221 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleatom3239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleatom3260 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_ruleatom3282 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleatom3300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_ruleatom3329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CONSTANT_in_ruleatom3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr3401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepostfixExpr3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3452 = new BitSet(new long[]{0x0000600000002002L});
    public static final BitSet FOLLOW_45_in_rulepostfixExpr3472 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulepostfixExpr3487 = new BitSet(new long[]{0x0000600000002002L});
    public static final BitSet FOLLOW_13_in_rulepostfixExpr3513 = new BitSet(new long[]{0x0000100000006050L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3536 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_rulepostfixExpr3555 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3577 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_rulepostfixExpr3599 = new BitSet(new long[]{0x0000600000002002L});
    public static final BitSet FOLLOW_46_in_rulepostfixExpr3620 = new BitSet(new long[]{0x0000100000002050L});
    public static final BitSet FOLLOW_ruleexpr_in_rulepostfixExpr3642 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_rulepostfixExpr3660 = new BitSet(new long[]{0x0000600000002002L});
    public static final BitSet FOLLOW_ruleendExpr_in_entryRuleendExpr3704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendExpr3715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleendExpr3753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleendExpr3772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_synpred101117 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred101135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_synpred111173 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred111191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_synpred121229 = new BitSet(new long[]{0x0001000000020000L});
    public static final BitSet FOLLOW_ruleendExpr_in_synpred121247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_synpred151396 = new BitSet(new long[]{0x0000100015F42050L});
    public static final BitSet FOLLOW_rulestatement_in_synpred151417 = new BitSet(new long[]{0x0000000000000002L});

}