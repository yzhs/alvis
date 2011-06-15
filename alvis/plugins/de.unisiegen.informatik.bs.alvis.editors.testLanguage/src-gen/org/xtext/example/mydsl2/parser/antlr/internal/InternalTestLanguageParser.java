package org.xtext.example.mydsl2.parser.antlr.internal; 

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
import org.xtext.example.mydsl2.services.TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Datatype'", "'entity'", "'{'", "'}'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalTestLanguageParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g"; }



     	private TestLanguageGrammarAccess grammarAccess;
     	
        public InternalTestLanguageParser(TokenStream input, IAstFactory factory, TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.factory = factory;
            registerRules(grammarAccess.getGrammar());
            this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected InputStream getTokenFile() {
        	ClassLoader classLoader = getClass().getClassLoader();
        	return classLoader.getResourceAsStream("org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.tokens");
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start entryRuleModel
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:77:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:78:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:79:2: iv_ruleModel= ruleModel EOF
            {
             currentNode = createCompositeNode(grammarAccess.getModelRule(), currentNode); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();
            _fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:86:1: ruleModel returns [EObject current=null] : ( (lv_types_0_0= ruleType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_types_0_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:91:6: ( ( (lv_types_0_0= ruleType ) )* )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:92:1: ( (lv_types_0_0= ruleType ) )*
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:92:1: ( (lv_types_0_0= ruleType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:93:1: (lv_types_0_0= ruleType )
            	    {
            	    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:93:1: (lv_types_0_0= ruleType )
            	    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:94:3: lv_types_0_0= ruleType
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleModel130);
            	    lv_types_0_0=ruleType();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getModelRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"types",
            	    	        		lv_types_0_0, 
            	    	        		"Type", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
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


    // $ANTLR start entryRuleType
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:124:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:125:2: (iv_ruleType= ruleType EOF )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:126:2: iv_ruleType= ruleType EOF
            {
             currentNode = createCompositeNode(grammarAccess.getTypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType166);
            iv_ruleType=ruleType();
            _fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType176); 

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
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:133:1: ruleType returns [EObject current=null] : (this_Datatype_0= ruleDatatype | this_Entity_1= ruleEntity ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Datatype_0 = null;

        EObject this_Entity_1 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:138:6: ( (this_Datatype_0= ruleDatatype | this_Entity_1= ruleEntity ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:139:1: (this_Datatype_0= ruleDatatype | this_Entity_1= ruleEntity )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:139:1: (this_Datatype_0= ruleDatatype | this_Entity_1= ruleEntity )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("139:1: (this_Datatype_0= ruleDatatype | this_Entity_1= ruleEntity )", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:140:5: this_Datatype_0= ruleDatatype
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_0(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleDatatype_in_ruleType223);
                    this_Datatype_0=ruleDatatype();
                    _fsp--;

                     
                            current = this_Datatype_0; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:150:5: this_Entity_1= ruleEntity
                    {
                     
                            currentNode=createCompositeNode(grammarAccess.getTypeAccess().getEntityParserRuleCall_1(), currentNode); 
                        
                    pushFollow(FOLLOW_ruleEntity_in_ruleType250);
                    this_Entity_1=ruleEntity();
                    _fsp--;

                     
                            current = this_Entity_1; 
                            currentNode = currentNode.getParent();
                        

                    }
                    break;

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleDatatype
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:166:1: entryRuleDatatype returns [EObject current=null] : iv_ruleDatatype= ruleDatatype EOF ;
    public final EObject entryRuleDatatype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDatatype = null;


        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:167:2: (iv_ruleDatatype= ruleDatatype EOF )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:168:2: iv_ruleDatatype= ruleDatatype EOF
            {
             currentNode = createCompositeNode(grammarAccess.getDatatypeRule(), currentNode); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype285);
            iv_ruleDatatype=ruleDatatype();
            _fsp--;

             current =iv_ruleDatatype; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype295); 

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
    // $ANTLR end entryRuleDatatype


    // $ANTLR start ruleDatatype
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:175:1: ruleDatatype returns [EObject current=null] : ( 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleDatatype() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:180:6: ( ( 'Datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:181:1: ( 'Datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:181:1: ( 'Datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:181:3: 'Datatype' ( (lv_name_1_0= RULE_ID ) )
            {
            match(input,11,FOLLOW_11_in_ruleDatatype330); 

                    createLeafNode(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0(), null); 
                
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:185:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:186:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:186:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:187:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDatatype347); 

            			createLeafNode(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getDatatypeRule().getType().getClassifier());
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleDatatype


    // $ANTLR start entryRuleEntity
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:217:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:218:2: (iv_ruleEntity= ruleEntity EOF )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:219:2: iv_ruleEntity= ruleEntity EOF
            {
             currentNode = createCompositeNode(grammarAccess.getEntityRule(), currentNode); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity388);
            iv_ruleEntity=ruleEntity();
            _fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity398); 

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
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:226:1: ruleEntity returns [EObject current=null] : ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_features_3_0 = null;


         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:231:6: ( ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:232:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:232:1: ( 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}' )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:232:3: 'entity' ( (lv_name_1_0= RULE_ID ) ) '{' ( (lv_features_3_0= ruleFeature ) )* '}'
            {
            match(input,12,FOLLOW_12_in_ruleEntity433); 

                    createLeafNode(grammarAccess.getEntityAccess().getEntityKeyword_0(), null); 
                
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:236:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:237:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:237:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:238:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEntity450); 

            			createLeafNode(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
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

            match(input,13,FOLLOW_13_in_ruleEntity465); 

                    createLeafNode(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2(), null); 
                
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:264:1: ( (lv_features_3_0= ruleFeature ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:265:1: (lv_features_3_0= ruleFeature )
            	    {
            	    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:265:1: (lv_features_3_0= ruleFeature )
            	    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:266:3: lv_features_3_0= ruleFeature
            	    {
            	     
            	    	        currentNode=createCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0(), currentNode); 
            	    	    
            	    pushFollow(FOLLOW_ruleFeature_in_ruleEntity486);
            	    lv_features_3_0=ruleFeature();
            	    _fsp--;


            	    	        if (current==null) {
            	    	            current = factory.create(grammarAccess.getEntityRule().getType().getClassifier());
            	    	            associateNodeWithAstElement(currentNode.getParent(), current);
            	    	        }
            	    	        try {
            	    	       		add(
            	    	       			current, 
            	    	       			"features",
            	    	        		lv_features_3_0, 
            	    	        		"Feature", 
            	    	        		currentNode);
            	    	        } catch (ValueConverterException vce) {
            	    				handleValueConverterException(vce);
            	    	        }
            	    	        currentNode = currentNode.getParent();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,14,FOLLOW_14_in_ruleEntity497); 

                    createLeafNode(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4(), null); 
                

            }


            }

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:300:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:301:2: (iv_ruleFeature= ruleFeature EOF )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:302:2: iv_ruleFeature= ruleFeature EOF
            {
             currentNode = createCompositeNode(grammarAccess.getFeatureRule(), currentNode); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature533);
            iv_ruleFeature=ruleFeature();
            _fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature543); 

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
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:309:1: ruleFeature returns [EObject current=null] : ( ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;

         EObject temp=null; setCurrentLookahead(); resetLookahead(); 
            
        try {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:314:6: ( ( ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:315:1: ( ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:315:1: ( ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:315:2: ( ( RULE_ID ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:315:2: ( ( RULE_ID ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:316:1: ( RULE_ID )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:316:1: ( RULE_ID )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:317:3: RULE_ID
            {

            			if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
            	            associateNodeWithAstElement(currentNode, current);
            	        }
                    
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature586); 

            		createLeafNode(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_0_0(), "type"); 
            	

            }


            }

            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:329:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:330:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:330:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.example.testLanguage/src-gen/org/xtext/example/mydsl2/parser/antlr/internal/InternalTestLanguage.g:331:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)input.LT(1);
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleFeature603); 

            			createLeafNode(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0(), "name"); 
            		

            	        if (current==null) {
            	            current = factory.create(grammarAccess.getFeatureRule().getType().getClassifier());
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

             resetLookahead(); 
                	lastConsumedNode = currentNode;
                
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end ruleFeature


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleModel130 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_ruleType223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_ruleType250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype285 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDatatype330 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDatatype347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleEntity433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEntity450 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEntity465 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleEntity486 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleEntity497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature586 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleFeature603 = new BitSet(new long[]{0x0000000000000002L});

}