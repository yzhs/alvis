package org.xtext.example.mydsl2.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl2.services.TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTestLanguageParser extends AbstractInternalContentAssistParser {
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
    public String getGrammarFileName() { return "../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g"; }


     
     	private TestLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TestLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start entryRuleModel
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:62:1: ( ruleModel EOF )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:70:1: ruleModel : ( ( rule__Model__TypesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:74:2: ( ( ( rule__Model__TypesAssignment )* ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:75:1: ( ( rule__Model__TypesAssignment )* )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:75:1: ( ( rule__Model__TypesAssignment )* )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:76:1: ( rule__Model__TypesAssignment )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:77:1: ( rule__Model__TypesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:77:2: rule__Model__TypesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Model__TypesAssignment_in_ruleModel94);
            	    rule__Model__TypesAssignment();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleType
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:89:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:90:1: ( ruleType EOF )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:91:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType122);
            ruleType();
            _fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleType


    // $ANTLR start ruleType
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:98:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:102:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:103:1: ( ( rule__Type__Alternatives ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:103:1: ( ( rule__Type__Alternatives ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:104:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:105:1: ( rule__Type__Alternatives )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:105:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType155);
            rule__Type__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleType


    // $ANTLR start entryRuleDatatype
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:117:1: entryRuleDatatype : ruleDatatype EOF ;
    public final void entryRuleDatatype() throws RecognitionException {
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:118:1: ( ruleDatatype EOF )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:119:1: ruleDatatype EOF
            {
             before(grammarAccess.getDatatypeRule()); 
            pushFollow(FOLLOW_ruleDatatype_in_entryRuleDatatype182);
            ruleDatatype();
            _fsp--;

             after(grammarAccess.getDatatypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDatatype189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDatatype


    // $ANTLR start ruleDatatype
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:126:1: ruleDatatype : ( ( rule__Datatype__Group__0 ) ) ;
    public final void ruleDatatype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:130:2: ( ( ( rule__Datatype__Group__0 ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:131:1: ( ( rule__Datatype__Group__0 ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:131:1: ( ( rule__Datatype__Group__0 ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:132:1: ( rule__Datatype__Group__0 )
            {
             before(grammarAccess.getDatatypeAccess().getGroup()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:133:1: ( rule__Datatype__Group__0 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:133:2: rule__Datatype__Group__0
            {
            pushFollow(FOLLOW_rule__Datatype__Group__0_in_ruleDatatype215);
            rule__Datatype__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDatatype


    // $ANTLR start entryRuleEntity
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:145:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:146:1: ( ruleEntity EOF )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:147:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity242);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleEntity


    // $ANTLR start ruleEntity
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:154:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:158:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:159:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:159:1: ( ( rule__Entity__Group__0 ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:160:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:161:1: ( rule__Entity__Group__0 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:161:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity275);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntity


    // $ANTLR start entryRuleFeature
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:173:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:174:1: ( ruleFeature EOF )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:175:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_ruleFeature_in_entryRuleFeature302);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeature309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFeature


    // $ANTLR start ruleFeature
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:182:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:186:2: ( ( ( rule__Feature__Group__0 ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:187:1: ( ( rule__Feature__Group__0 ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:187:1: ( ( rule__Feature__Group__0 ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:188:1: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:189:1: ( rule__Feature__Group__0 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:189:2: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_rule__Feature__Group__0_in_ruleFeature335);
            rule__Feature__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start rule__Type__Alternatives
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:201:1: rule__Type__Alternatives : ( ( ruleDatatype ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:205:1: ( ( ruleDatatype ) | ( ruleEntity ) )
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
                    new NoViableAltException("201:1: rule__Type__Alternatives : ( ( ruleDatatype ) | ( ruleEntity ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:206:1: ( ruleDatatype )
                    {
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:206:1: ( ruleDatatype )
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:207:1: ruleDatatype
                    {
                     before(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDatatype_in_rule__Type__Alternatives371);
                    ruleDatatype();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getDatatypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:212:6: ( ruleEntity )
                    {
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:212:6: ( ruleEntity )
                    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:213:1: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Type__Alternatives388);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Type__Alternatives


    // $ANTLR start rule__Datatype__Group__0
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:225:1: rule__Datatype__Group__0 : rule__Datatype__Group__0__Impl rule__Datatype__Group__1 ;
    public final void rule__Datatype__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:229:1: ( rule__Datatype__Group__0__Impl rule__Datatype__Group__1 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:230:2: rule__Datatype__Group__0__Impl rule__Datatype__Group__1
            {
            pushFollow(FOLLOW_rule__Datatype__Group__0__Impl_in_rule__Datatype__Group__0418);
            rule__Datatype__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Datatype__Group__1_in_rule__Datatype__Group__0421);
            rule__Datatype__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Datatype__Group__0


    // $ANTLR start rule__Datatype__Group__0__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:237:1: rule__Datatype__Group__0__Impl : ( 'Datatype' ) ;
    public final void rule__Datatype__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:241:1: ( ( 'Datatype' ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:242:1: ( 'Datatype' )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:242:1: ( 'Datatype' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:243:1: 'Datatype'
            {
             before(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Datatype__Group__0__Impl449); 
             after(grammarAccess.getDatatypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Datatype__Group__0__Impl


    // $ANTLR start rule__Datatype__Group__1
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:256:1: rule__Datatype__Group__1 : rule__Datatype__Group__1__Impl ;
    public final void rule__Datatype__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:260:1: ( rule__Datatype__Group__1__Impl )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:261:2: rule__Datatype__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Datatype__Group__1__Impl_in_rule__Datatype__Group__1480);
            rule__Datatype__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Datatype__Group__1


    // $ANTLR start rule__Datatype__Group__1__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:267:1: rule__Datatype__Group__1__Impl : ( ( rule__Datatype__NameAssignment_1 ) ) ;
    public final void rule__Datatype__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:271:1: ( ( ( rule__Datatype__NameAssignment_1 ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:272:1: ( ( rule__Datatype__NameAssignment_1 ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:272:1: ( ( rule__Datatype__NameAssignment_1 ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:273:1: ( rule__Datatype__NameAssignment_1 )
            {
             before(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:274:1: ( rule__Datatype__NameAssignment_1 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:274:2: rule__Datatype__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Datatype__NameAssignment_1_in_rule__Datatype__Group__1__Impl507);
            rule__Datatype__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDatatypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Datatype__Group__1__Impl


    // $ANTLR start rule__Entity__Group__0
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:288:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:292:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:293:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0541);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0544);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:300:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:304:1: ( ( 'entity' ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:305:1: ( 'entity' )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:305:1: ( 'entity' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:306:1: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__Entity__Group__0__Impl572); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:319:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:323:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:324:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1603);
            rule__Entity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1606);
            rule__Entity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:331:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:335:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:336:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:336:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:337:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:338:1: ( rule__Entity__NameAssignment_1 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:338:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl633);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Entity__Group__2
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:348:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:352:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:353:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2663);
            rule__Entity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2666);
            rule__Entity__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2


    // $ANTLR start rule__Entity__Group__2__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:360:1: rule__Entity__Group__2__Impl : ( '{' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:364:1: ( ( '{' ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:365:1: ( '{' )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:365:1: ( '{' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:366:1: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Entity__Group__2__Impl694); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__2__Impl


    // $ANTLR start rule__Entity__Group__3
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:379:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:383:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:384:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3725);
            rule__Entity__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3728);
            rule__Entity__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3


    // $ANTLR start rule__Entity__Group__3__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:391:1: rule__Entity__Group__3__Impl : ( ( rule__Entity__FeaturesAssignment_3 )* ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:395:1: ( ( ( rule__Entity__FeaturesAssignment_3 )* ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:396:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:396:1: ( ( rule__Entity__FeaturesAssignment_3 )* )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:397:1: ( rule__Entity__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:398:1: ( rule__Entity__FeaturesAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:398:2: rule__Entity__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl755);
            	    rule__Entity__FeaturesAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__3__Impl


    // $ANTLR start rule__Entity__Group__4
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:408:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:412:1: ( rule__Entity__Group__4__Impl )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:413:2: rule__Entity__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4786);
            rule__Entity__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4


    // $ANTLR start rule__Entity__Group__4__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:419:1: rule__Entity__Group__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:423:1: ( ( '}' ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:424:1: ( '}' )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:424:1: ( '}' )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:425:1: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__Entity__Group__4__Impl814); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__4__Impl


    // $ANTLR start rule__Feature__Group__0
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:448:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:452:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:453:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__0855);
            rule__Feature__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__0858);
            rule__Feature__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__0


    // $ANTLR start rule__Feature__Group__0__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:460:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__TypeAssignment_0 ) ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:464:1: ( ( ( rule__Feature__TypeAssignment_0 ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:465:1: ( ( rule__Feature__TypeAssignment_0 ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:465:1: ( ( rule__Feature__TypeAssignment_0 ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:466:1: ( rule__Feature__TypeAssignment_0 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_0()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:467:1: ( rule__Feature__TypeAssignment_0 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:467:2: rule__Feature__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Feature__TypeAssignment_0_in_rule__Feature__Group__0__Impl885);
            rule__Feature__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__0__Impl


    // $ANTLR start rule__Feature__Group__1
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:477:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:481:1: ( rule__Feature__Group__1__Impl )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:482:2: rule__Feature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__1915);
            rule__Feature__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__1


    // $ANTLR start rule__Feature__Group__1__Impl
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:488:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:492:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:493:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:493:1: ( ( rule__Feature__NameAssignment_1 ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:494:1: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:495:1: ( rule__Feature__NameAssignment_1 )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:495:2: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl942);
            rule__Feature__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__Group__1__Impl


    // $ANTLR start rule__Model__TypesAssignment
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:510:1: rule__Model__TypesAssignment : ( ruleType ) ;
    public final void rule__Model__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:514:1: ( ( ruleType ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:515:1: ( ruleType )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:515:1: ( ruleType )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:516:1: ruleType
            {
             before(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Model__TypesAssignment981);
            ruleType();
            _fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__TypesAssignment


    // $ANTLR start rule__Datatype__NameAssignment_1
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:525:1: rule__Datatype__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Datatype__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:529:1: ( ( RULE_ID ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:530:1: ( RULE_ID )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:530:1: ( RULE_ID )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:531:1: RULE_ID
            {
             before(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Datatype__NameAssignment_11012); 
             after(grammarAccess.getDatatypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Datatype__NameAssignment_1


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:540:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:544:1: ( ( RULE_ID ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:545:1: ( RULE_ID )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:545:1: ( RULE_ID )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:546:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11043); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Entity__FeaturesAssignment_3
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:555:1: rule__Entity__FeaturesAssignment_3 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:559:1: ( ( ruleFeature ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:560:1: ( ruleFeature )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:560:1: ( ruleFeature )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:561:1: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_31074);
            ruleFeature();
            _fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__FeaturesAssignment_3


    // $ANTLR start rule__Feature__TypeAssignment_0
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:570:1: rule__Feature__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Feature__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:574:1: ( ( ( RULE_ID ) ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:575:1: ( ( RULE_ID ) )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:575:1: ( ( RULE_ID ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:576:1: ( RULE_ID )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_0_0()); 
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:577:1: ( RULE_ID )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:578:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__TypeAssignment_01109); 
             after(grammarAccess.getFeatureAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__TypeAssignment_0


    // $ANTLR start rule__Feature__NameAssignment_1
    // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:589:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:593:1: ( ( RULE_ID ) )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:594:1: ( RULE_ID )
            {
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:594:1: ( RULE_ID )
            // ../org.xtext.example.testLanguage.ui/src-gen/org/xtext/example/mydsl2/ui/contentassist/antlr/internal/InternalTestLanguage.g:595:1: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_11144); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Feature__NameAssignment_1


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__TypesAssignment_in_ruleModel94 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_entryRuleDatatype182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDatatype189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__0_in_ruleDatatype215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeature309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0_in_ruleFeature335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDatatype_in_rule__Type__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Type__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__0__Impl_in_rule__Datatype__Group__0418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Datatype__Group__1_in_rule__Datatype__Group__0421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Datatype__Group__0__Impl449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__Group__1__Impl_in_rule__Datatype__Group__1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Datatype__NameAssignment_1_in_rule__Datatype__Group__1__Impl507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__0541 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__0544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Entity__Group__0__Impl572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__1603 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__1606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__2663 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__2666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Entity__Group__2__Impl694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__3725 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_3_in_rule__Entity__Group__3__Impl755 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Entity__Group__4__Impl814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__0__Impl_in_rule__Feature__Group__0855 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Feature__Group__1_in_rule__Feature__Group__0858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__TypeAssignment_0_in_rule__Feature__Group__0__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__Group__1__Impl_in_rule__Feature__Group__1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Feature__NameAssignment_1_in_rule__Feature__Group__1__Impl942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Model__TypesAssignment981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Datatype__NameAssignment_11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_11043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_31074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__TypeAssignment_01109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Feature__NameAssignment_11144 = new BitSet(new long[]{0x0000000000000002L});

}