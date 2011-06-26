package org.xtext.example.mydsl1.ui.contentassist.antlr.internal; 

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIGN", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Boolean'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'%'", "'true'", "'false'", "','", "';'", "'('", "')'", "':'", "'begin'", "'end'", "'return'", "'if'", "'else'", "'for'", "'in'", "'while'", "'[]'", "'='", "'||'", "'&&'", "'!'", "'.'", "'['", "']'", "'main'", "'null'", "'infty'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=7;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_SIGN=4;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalMyDslParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[408+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g"; }


     
     	private MyDslGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:62:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:63:1: ( ruleModel EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:64:1: ruleModel EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel67);
            ruleModel();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel74); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:71:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:75:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( ( rule__Model__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:76:1: ( ( rule__Model__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:77:1: ( rule__Model__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:78:1: ( rule__Model__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:78:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel100);
            rule__Model__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

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


    // $ANTLR start entryRulefunctionDefinition
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:90:1: entryRulefunctionDefinition : rulefunctionDefinition EOF ;
    public final void entryRulefunctionDefinition() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:91:1: ( rulefunctionDefinition EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:92:1: rulefunctionDefinition EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionRule()); 
            }
            pushFollow(FOLLOW_rulefunctionDefinition_in_entryRulefunctionDefinition127);
            rulefunctionDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctionDefinition134); if (failed) return ;

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
    // $ANTLR end entryRulefunctionDefinition


    // $ANTLR start rulefunctionDefinition
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:99:1: rulefunctionDefinition : ( ( rule__FunctionDefinition__Group__0 ) ) ;
    public final void rulefunctionDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:103:2: ( ( ( rule__FunctionDefinition__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( ( rule__FunctionDefinition__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:104:1: ( ( rule__FunctionDefinition__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:105:1: ( rule__FunctionDefinition__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:106:1: ( rule__FunctionDefinition__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:106:2: rule__FunctionDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0_in_rulefunctionDefinition160);
            rule__FunctionDefinition__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getGroup()); 
            }

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
    // $ANTLR end rulefunctionDefinition


    // $ANTLR start entryRulemainFunction
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:118:1: entryRulemainFunction : rulemainFunction EOF ;
    public final void entryRulemainFunction() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:119:1: ( rulemainFunction EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:120:1: rulemainFunction EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionRule()); 
            }
            pushFollow(FOLLOW_rulemainFunction_in_entryRulemainFunction187);
            rulemainFunction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemainFunction194); if (failed) return ;

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
    // $ANTLR end entryRulemainFunction


    // $ANTLR start rulemainFunction
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:127:1: rulemainFunction : ( ( rule__MainFunction__Group__0 ) ) ;
    public final void rulemainFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:131:2: ( ( ( rule__MainFunction__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rule__MainFunction__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:132:1: ( ( rule__MainFunction__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:133:1: ( rule__MainFunction__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:134:1: ( rule__MainFunction__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:134:2: rule__MainFunction__Group__0
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__0_in_rulemainFunction220);
            rule__MainFunction__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getGroup()); 
            }

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
    // $ANTLR end rulemainFunction


    // $ANTLR start entryRuleformalParams
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:146:1: entryRuleformalParams : ruleformalParams EOF ;
    public final void entryRuleformalParams() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:147:1: ( ruleformalParams EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:148:1: ruleformalParams EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsRule()); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_entryRuleformalParams247);
            ruleformalParams();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFormalParamsRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleformalParams254); if (failed) return ;

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
    // $ANTLR end entryRuleformalParams


    // $ANTLR start ruleformalParams
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:155:1: ruleformalParams : ( ( rule__FormalParams__Group__0 ) ) ;
    public final void ruleformalParams() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:159:2: ( ( ( rule__FormalParams__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__FormalParams__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:160:1: ( ( rule__FormalParams__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:161:1: ( rule__FormalParams__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:162:1: ( rule__FormalParams__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:162:2: rule__FormalParams__Group__0
            {
            pushFollow(FOLLOW_rule__FormalParams__Group__0_in_ruleformalParams280);
            rule__FormalParams__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFormalParamsAccess().getGroup()); 
            }

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
    // $ANTLR end ruleformalParams


    // $ANTLR start entryRuleparam
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:174:1: entryRuleparam : ruleparam EOF ;
    public final void entryRuleparam() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:175:1: ( ruleparam EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:176:1: ruleparam EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamRule()); 
            }
            pushFollow(FOLLOW_ruleparam_in_entryRuleparam307);
            ruleparam();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParamRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleparam314); if (failed) return ;

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
    // $ANTLR end entryRuleparam


    // $ANTLR start ruleparam
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:183:1: ruleparam : ( ( rule__Param__Group__0 ) ) ;
    public final void ruleparam() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:187:2: ( ( ( rule__Param__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__Param__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:188:1: ( ( rule__Param__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:189:1: ( rule__Param__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:190:1: ( rule__Param__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:190:2: rule__Param__Group__0
            {
            pushFollow(FOLLOW_rule__Param__Group__0_in_ruleparam340);
            rule__Param__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParamAccess().getGroup()); 
            }

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
    // $ANTLR end ruleparam


    // $ANTLR start entryRuleblock
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:202:1: entryRuleblock : ruleblock EOF ;
    public final void entryRuleblock() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:203:1: ( ruleblock EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:204:1: ruleblock EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockRule()); 
            }
            pushFollow(FOLLOW_ruleblock_in_entryRuleblock367);
            ruleblock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBlockRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleblock374); if (failed) return ;

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
    // $ANTLR end entryRuleblock


    // $ANTLR start ruleblock
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:211:1: ruleblock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleblock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:215:2: ( ( ( rule__Block__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__Block__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:216:1: ( ( rule__Block__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:217:1: ( rule__Block__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:218:1: ( rule__Block__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:218:2: rule__Block__Group__0
            {
            pushFollow(FOLLOW_rule__Block__Group__0_in_ruleblock400);
            rule__Block__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getGroup()); 
            }

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
    // $ANTLR end ruleblock


    // $ANTLR start entryRuletype
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:230:1: entryRuletype : ruletype EOF ;
    public final void entryRuletype() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:231:1: ( ruletype EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:232:1: ruletype EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_ruletype_in_entryRuletype427);
            ruletype();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getTypeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuletype434); if (failed) return ;

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
    // $ANTLR end entryRuletype


    // $ANTLR start ruletype
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:239:1: ruletype : ( ( rule__Type__TypesAssignment ) ) ;
    public final void ruletype() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:243:2: ( ( ( rule__Type__TypesAssignment ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( ( rule__Type__TypesAssignment ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:244:1: ( ( rule__Type__TypesAssignment ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:245:1: ( rule__Type__TypesAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypesAssignment()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:246:1: ( rule__Type__TypesAssignment )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:246:2: rule__Type__TypesAssignment
            {
            pushFollow(FOLLOW_rule__Type__TypesAssignment_in_ruletype460);
            rule__Type__TypesAssignment();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypesAssignment()); 
            }

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
    // $ANTLR end ruletype


    // $ANTLR start entryRulestatement
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:258:1: entryRulestatement : rulestatement EOF ;
    public final void entryRulestatement() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:259:1: ( rulestatement EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:260:1: rulestatement EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementRule()); 
            }
            pushFollow(FOLLOW_rulestatement_in_entryRulestatement487);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulestatement494); if (failed) return ;

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
    // $ANTLR end entryRulestatement


    // $ANTLR start rulestatement
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:267:1: rulestatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void rulestatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:271:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:272:1: ( ( rule__Statement__Alternatives ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:273:1: ( rule__Statement__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAlternatives()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:274:1: ( rule__Statement__Alternatives )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:274:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_rulestatement520);
            rule__Statement__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAlternatives()); 
            }

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
    // $ANTLR end rulestatement


    // $ANTLR start entryRulefunctionCall
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: entryRulefunctionCall : rulefunctionCall EOF ;
    public final void entryRulefunctionCall() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: ( rulefunctionCall EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: rulefunctionCall EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallRule()); 
            }
            pushFollow(FOLLOW_rulefunctionCall_in_entryRulefunctionCall547);
            rulefunctionCall();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulefunctionCall554); if (failed) return ;

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
    // $ANTLR end entryRulefunctionCall


    // $ANTLR start rulefunctionCall
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:295:1: rulefunctionCall : ( ( rule__FunctionCall__Group__0 ) ) ;
    public final void rulefunctionCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:299:2: ( ( ( rule__FunctionCall__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( ( rule__FunctionCall__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( ( rule__FunctionCall__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( rule__FunctionCall__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( rule__FunctionCall__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:302:2: rule__FunctionCall__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0_in_rulefunctionCall580);
            rule__FunctionCall__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup()); 
            }

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
    // $ANTLR end rulefunctionCall


    // $ANTLR start entryRuledeclaration
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: entryRuledeclaration : ruledeclaration EOF ;
    public final void entryRuledeclaration() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ( ruledeclaration EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ruledeclaration EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration607);
            ruledeclaration();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration614); if (failed) return ;

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
    // $ANTLR end entryRuledeclaration


    // $ANTLR start ruledeclaration
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ruledeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruledeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:327:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( ( rule__Declaration__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( rule__Declaration__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ( rule__Declaration__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:330:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruledeclaration640);
            rule__Declaration__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getGroup()); 
            }

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
    // $ANTLR end ruledeclaration


    // $ANTLR start entryRuleassignment
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: entryRuleassignment : ruleassignment EOF ;
    public final void entryRuleassignment() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( ruleassignment EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ruleassignment EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleassignment_in_entryRuleassignment667);
            ruleassignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment674); if (failed) return ;

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
    // $ANTLR end entryRuleassignment


    // $ANTLR start ruleassignment
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:351:1: ruleassignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleassignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:355:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( rule__Assignment__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:358:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleassignment700);
            rule__Assignment__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getGroup()); 
            }

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
    // $ANTLR end ruleassignment


    // $ANTLR start entryRuleexpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: entryRuleexpr : ruleexpr EOF ;
    public final void entryRuleexpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( ruleexpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ruleexpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr727);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr734); if (failed) return ;

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
    // $ANTLR end entryRuleexpr


    // $ANTLR start ruleexpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ruleexpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:383:2: ( ( ( rule__Expr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( ( rule__Expr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( ( rule__Expr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( rule__Expr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( rule__Expr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:386:2: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_rule__Expr__Group__0_in_ruleexpr760);
            rule__Expr__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExprAccess().getGroup()); 
            }

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
    // $ANTLR end ruleexpr


    // $ANTLR start entryRuleandExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: entryRuleandExpr : ruleandExpr EOF ;
    public final void entryRuleandExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ( ruleandExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ruleandExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_entryRuleandExpr787);
            ruleandExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpr794); if (failed) return ;

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
    // $ANTLR end entryRuleandExpr


    // $ANTLR start ruleandExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:407:1: ruleandExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleandExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:411:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( ( rule__AndExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( rule__AndExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( rule__AndExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:414:2: rule__AndExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0_in_ruleandExpr820);
            rule__AndExpr__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getGroup()); 
            }

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
    // $ANTLR end ruleandExpr


    // $ANTLR start entryRuleeqExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: entryRuleeqExpr : ruleeqExpr EOF ;
    public final void entryRuleeqExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ( ruleeqExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: ruleeqExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprRule()); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_entryRuleeqExpr847);
            ruleeqExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEqExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleeqExpr854); if (failed) return ;

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
    // $ANTLR end entryRuleeqExpr


    // $ANTLR start ruleeqExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: ruleeqExpr : ( ( rule__EqExpr__Group__0 ) ) ;
    public final void ruleeqExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:439:2: ( ( ( rule__EqExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( ( rule__EqExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( ( rule__EqExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( rule__EqExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( rule__EqExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:442:2: rule__EqExpr__Group__0
            {
            pushFollow(FOLLOW_rule__EqExpr__Group__0_in_ruleeqExpr880);
            rule__EqExpr__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEqExprAccess().getGroup()); 
            }

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
    // $ANTLR end ruleeqExpr


    // $ANTLR start entryRulerelExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: entryRulerelExpr : rulerelExpr EOF ;
    public final void entryRulerelExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: ( rulerelExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: rulerelExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprRule()); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_entryRulerelExpr907);
            rulerelExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getRelExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelExpr914); if (failed) return ;

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
    // $ANTLR end entryRulerelExpr


    // $ANTLR start rulerelExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: rulerelExpr : ( ( rule__RelExpr__Group__0 ) ) ;
    public final void rulerelExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:467:2: ( ( ( rule__RelExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( rule__RelExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( rule__RelExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( rule__RelExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( rule__RelExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:470:2: rule__RelExpr__Group__0
            {
            pushFollow(FOLLOW_rule__RelExpr__Group__0_in_rulerelExpr940);
            rule__RelExpr__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getGroup()); 
            }

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
    // $ANTLR end rulerelExpr


    // $ANTLR start entryRuleaddExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: entryRuleaddExpr : ruleaddExpr EOF ;
    public final void entryRuleaddExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ( ruleaddExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: ruleaddExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprRule()); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_entryRuleaddExpr967);
            ruleaddExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaddExpr974); if (failed) return ;

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
    // $ANTLR end entryRuleaddExpr


    // $ANTLR start ruleaddExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: ruleaddExpr : ( ( rule__AddExpr__Group__0 ) ) ;
    public final void ruleaddExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:495:2: ( ( ( rule__AddExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__AddExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__AddExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__AddExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__AddExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:498:2: rule__AddExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AddExpr__Group__0_in_ruleaddExpr1000);
            rule__AddExpr__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getGroup()); 
            }

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
    // $ANTLR end ruleaddExpr


    // $ANTLR start entryRulemulExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: entryRulemulExpr : rulemulExpr EOF ;
    public final void entryRulemulExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( rulemulExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: rulemulExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprRule()); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_entryRulemulExpr1027);
            rulemulExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemulExpr1034); if (failed) return ;

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
    // $ANTLR end entryRulemulExpr


    // $ANTLR start rulemulExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: rulemulExpr : ( ( rule__MulExpr__Group__0 ) ) ;
    public final void rulemulExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:523:2: ( ( ( rule__MulExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( ( rule__MulExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( ( rule__MulExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( rule__MulExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( rule__MulExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:526:2: rule__MulExpr__Group__0
            {
            pushFollow(FOLLOW_rule__MulExpr__Group__0_in_rulemulExpr1060);
            rule__MulExpr__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getGroup()); 
            }

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
    // $ANTLR end rulemulExpr


    // $ANTLR start entryRuleatom
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: entryRuleatom : ruleatom EOF ;
    public final void entryRuleatom() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( ruleatom EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: ruleatom EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleatom_in_entryRuleatom1087);
            ruleatom();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleatom1094); if (failed) return ;

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
    // $ANTLR end entryRuleatom


    // $ANTLR start ruleatom
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: ruleatom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleatom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:551:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rule__Atom__Alternatives ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__Atom__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( rule__Atom__Alternatives )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:554:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleatom1120);
            rule__Atom__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getAlternatives()); 
            }

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
    // $ANTLR end ruleatom


    // $ANTLR start entryRulepostfixExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: entryRulepostfixExpr : rulepostfixExpr EOF ;
    public final void entryRulepostfixExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( rulepostfixExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: rulepostfixExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprRule()); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr1147);
            rulepostfixExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepostfixExpr1154); if (failed) return ;

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
    // $ANTLR end entryRulepostfixExpr


    // $ANTLR start rulepostfixExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: rulepostfixExpr : ( ( rule__PostfixExpr__Group__0 ) ) ;
    public final void rulepostfixExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:579:2: ( ( ( rule__PostfixExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( ( rule__PostfixExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( ( rule__PostfixExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__PostfixExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( rule__PostfixExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:582:2: rule__PostfixExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__0_in_rulepostfixExpr1180);
            rule__PostfixExpr__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getGroup()); 
            }

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
    // $ANTLR end rulepostfixExpr


    // $ANTLR start entryRuleconstant
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( ruleconstant EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ruleconstant EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant1207);
            ruleconstant();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant1214); if (failed) return ;

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
    // $ANTLR end entryRuleconstant


    // $ANTLR start ruleconstant
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:607:2: ( ( ( rule__Constant__Alternatives ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ( rule__Constant__Alternatives ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ( rule__Constant__Alternatives ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( rule__Constant__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( rule__Constant__Alternatives )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:610:2: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_in_ruleconstant1240);
            rule__Constant__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getAlternatives()); 
            }

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
    // $ANTLR end ruleconstant


    // $ANTLR start entryRulereal
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: entryRulereal : rulereal EOF ;
    public final void entryRulereal() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( rulereal EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: rulereal EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRealRule()); 
            }
            pushFollow(FOLLOW_rulereal_in_entryRulereal1267);
            rulereal();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getRealRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulereal1274); if (failed) return ;

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
    // $ANTLR end entryRulereal


    // $ANTLR start rulereal
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: rulereal : ( ( rule__Real__Group__0 ) ) ;
    public final void rulereal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:635:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( rule__Real__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( rule__Real__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( rule__Real__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRealAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( rule__Real__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:638:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_rulereal1300);
            rule__Real__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getRealAccess().getGroup()); 
            }

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
    // $ANTLR end rulereal


    // $ANTLR start entryRuleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: entryRuleendExpr : ruleendExpr EOF ;
    public final void entryRuleendExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:651:1: ( ruleendExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:652:1: ruleendExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEndExprRule()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_entryRuleendExpr1327);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEndExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleendExpr1334); if (failed) return ;

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
    // $ANTLR end entryRuleendExpr


    // $ANTLR start ruleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:659:1: ruleendExpr : ( ( rule__EndExpr__Alternatives ) ) ;
    public final void ruleendExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:663:2: ( ( ( rule__EndExpr__Alternatives ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__EndExpr__Alternatives ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: ( ( rule__EndExpr__Alternatives ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:665:1: ( rule__EndExpr__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEndExprAccess().getAlternatives()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:1: ( rule__EndExpr__Alternatives )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:666:2: rule__EndExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__EndExpr__Alternatives_in_ruleendExpr1360);
            rule__EndExpr__Alternatives();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEndExprAccess().getAlternatives()); 
            }

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
    // $ANTLR end ruleendExpr


    // $ANTLR start rule__Type__TypesAlternatives_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:678:1: rule__Type__TypesAlternatives_0 : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) );
    public final void rule__Type__TypesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:682:1: ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("678:1: rule__Type__TypesAlternatives_0 : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: ( 'String' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:683:1: ( 'String' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:684:1: 'String'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesStringKeyword_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Type__TypesAlternatives_01397); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesStringKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:691:6: ( 'Integer' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:691:6: ( 'Integer' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:692:1: 'Integer'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesIntegerKeyword_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Type__TypesAlternatives_01417); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesIntegerKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:699:6: ( 'Boolean' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:699:6: ( 'Boolean' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:700:1: 'Boolean'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesBooleanKeyword_0_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Type__TypesAlternatives_01437); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesBooleanKeyword_0_2()); 
                    }

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
    // $ANTLR end rule__Type__TypesAlternatives_0


    // $ANTLR start rule__Statement__Alternatives
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( rulefunctionCall ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ruleblock ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( rulefunctionCall ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ruleblock ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 12:
            case 13:
            case 14:
                {
                alt2=1;
                }
                break;
            case RULE_ID:
                {
                int LA2_4 = input.LA(2);

                if ( (synpred4()) ) {
                    alt2=2;
                }
                else if ( (synpred5()) ) {
                    alt2=3;
                }
                else if ( (synpred6()) ) {
                    alt2=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("712:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( rulefunctionCall ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ruleblock ) );", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt2=5;
                }
                break;
            case 34:
                {
                alt2=6;
                }
                break;
            case 36:
                {
                alt2=7;
                }
                break;
            case 38:
                {
                alt2=8;
                }
                break;
            case 31:
                {
                alt2=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("712:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( rulefunctionCall ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ( rule__Statement__Group_7__0 ) ) | ( ruleblock ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:717:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:717:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:718:1: ( rule__Statement__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:719:1: ( rule__Statement__Group_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:719:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1471);
                    rule__Statement__Group_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( rulefunctionCall )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( rulefunctionCall )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: rulefunctionCall
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_rulefunctionCall_in_rule__Statement__Alternatives1489);
                    rulefunctionCall();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:729:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:729:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( rule__Statement__Group_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1506);
                    rule__Statement__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:6: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:6: ( ( rule__Statement__Group_3__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( rule__Statement__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_3()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( rule__Statement__Group_3__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1524);
                    rule__Statement__Group_3__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:741:6: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:741:6: ( ( rule__Statement__Group_4__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:742:1: ( rule__Statement__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:743:1: ( rule__Statement__Group_4__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:743:2: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1542);
                    rule__Statement__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( ( rule__Statement__Group_5__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: ( rule__Statement__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:749:1: ( rule__Statement__Group_5__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:749:2: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives1560);
                    rule__Statement__Group_5__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:753:6: ( ( rule__Statement__Group_6__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:753:6: ( ( rule__Statement__Group_6__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:754:1: ( rule__Statement__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_6()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:755:1: ( rule__Statement__Group_6__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:755:2: rule__Statement__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_6__0_in_rule__Statement__Alternatives1578);
                    rule__Statement__Group_6__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:759:6: ( ( rule__Statement__Group_7__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:759:6: ( ( rule__Statement__Group_7__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:760:1: ( rule__Statement__Group_7__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_7()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:761:1: ( rule__Statement__Group_7__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:761:2: rule__Statement__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives1596);
                    rule__Statement__Group_7__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:765:6: ( ruleblock )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:765:6: ( ruleblock )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: ruleblock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 
                    }
                    pushFollow(FOLLOW_ruleblock_in_rule__Statement__Alternatives1614);
                    ruleblock();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getBlockParserRuleCall_8()); 
                    }

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
    // $ANTLR end rule__Statement__Alternatives


    // $ANTLR start rule__EqExpr__Alternatives_1_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:776:1: rule__EqExpr__Alternatives_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__EqExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( ( '==' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("776:1: rule__EqExpr__Alternatives_1_0 : ( ( '==' ) | ( '!=' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( '==' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( '==' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:782:1: '=='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__EqExpr__Alternatives_1_01647); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:789:6: ( '!=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:789:6: ( '!=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:790:1: '!='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEqExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__EqExpr__Alternatives_1_01667); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEqExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1()); 
                    }

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
    // $ANTLR end rule__EqExpr__Alternatives_1_0


    // $ANTLR start rule__RelExpr__Alternatives_1_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:802:1: rule__RelExpr__Alternatives_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__RelExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("802:1: rule__RelExpr__Alternatives_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( '<' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:807:1: ( '<' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:808:1: '<'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__RelExpr__Alternatives_1_01702); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:815:6: ( '>' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:815:6: ( '>' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: '>'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__RelExpr__Alternatives_1_01722); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:823:6: ( '<=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:823:6: ( '<=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:824:1: '<='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__RelExpr__Alternatives_1_01742); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:831:6: ( '>=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:831:6: ( '>=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: '>='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getGreaterThanSignEqualsSignKeyword_1_0_3()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__RelExpr__Alternatives_1_01762); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getGreaterThanSignEqualsSignKeyword_1_0_3()); 
                    }

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
    // $ANTLR end rule__RelExpr__Alternatives_1_0


    // $ANTLR start rule__MulExpr__Alternatives_1_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:844:1: rule__MulExpr__Alternatives_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MulExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("844:1: rule__MulExpr__Alternatives_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( '*' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:849:1: ( '*' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:850:1: '*'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__MulExpr__Alternatives_1_01797); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:857:6: ( '/' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:857:6: ( '/' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: '/'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__MulExpr__Alternatives_1_01817); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:865:6: ( '%' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:865:6: ( '%' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: '%'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getPercentSignKeyword_1_0_2()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__MulExpr__Alternatives_1_01837); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getPercentSignKeyword_1_0_2()); 
                    }

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
    // $ANTLR end rule__MulExpr__Alternatives_1_0


    // $ANTLR start rule__Atom__Alternatives
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:878:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt6=1;
                }
                break;
            case 28:
                {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=RULE_ID && LA6_2<=RULE_STRING)||(LA6_2>=24 && LA6_2<=25)||LA6_2==28||LA6_2==43||(LA6_2>=48 && LA6_2<=49)) ) {
                    alt6=3;
                }
                else if ( (LA6_2==RULE_SIGN) ) {
                    alt6=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("878:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 24:
            case 25:
            case 48:
            case 49:
                {
                alt6=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("878:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( ( rule__Atom__Group_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:883:1: ( ( rule__Atom__Group_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:884:1: ( rule__Atom__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:885:1: ( rule__Atom__Group_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:885:2: rule__Atom__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_0__0_in_rule__Atom__Alternatives1871);
                    rule__Atom__Group_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:889:6: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:889:6: ( ( rule__Atom__Group_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:890:1: ( rule__Atom__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:891:1: ( rule__Atom__Group_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:891:2: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives1889);
                    rule__Atom__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:895:6: ( ( rule__Atom__Group_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:895:6: ( ( rule__Atom__Group_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:896:1: ( rule__Atom__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:897:1: ( rule__Atom__Group_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:897:2: rule__Atom__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_2__0_in_rule__Atom__Alternatives1907);
                    rule__Atom__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:901:6: ( rulepostfixExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:901:6: ( rulepostfixExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:902:1: rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getPostfixExprParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_rule__Atom__Alternatives1925);
                    rulepostfixExpr();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getPostfixExprParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:907:6: ( ( rule__Atom__Group_4__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:907:6: ( ( rule__Atom__Group_4__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: ( rule__Atom__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:909:1: ( rule__Atom__Group_4__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:909:2: rule__Atom__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives1942);
                    rule__Atom__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getAtomAccess().getGroup_4()); 
                    }

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
    // $ANTLR end rule__Atom__Alternatives


    // $ANTLR start rule__PostfixExpr__Alternatives_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:918:1: rule__PostfixExpr__Alternatives_1 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_1_1 ) ) );
    public final void rule__PostfixExpr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:922:1: ( ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred21()) ) {
                    alt7=1;
                }
                else if ( (true) ) {
                    alt7=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("918:1: rule__PostfixExpr__Alternatives_1 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_1_1 ) ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("918:1: rule__PostfixExpr__Alternatives_1 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_1_1 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( rule__PostfixExpr__ExistingVariableAssignment_1_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_1_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( rule__PostfixExpr__ExistingVariableAssignment_1_0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:2: rule__PostfixExpr__ExistingVariableAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_1_0_in_rule__PostfixExpr__Alternatives_11975);
                    rule__PostfixExpr__ExistingVariableAssignment_1_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:929:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_1_1 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:929:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_1_1 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:930:1: ( rule__PostfixExpr__ExistingVariableAssignment_1_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_1_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:931:1: ( rule__PostfixExpr__ExistingVariableAssignment_1_1 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:931:2: rule__PostfixExpr__ExistingVariableAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_1_1_in_rule__PostfixExpr__Alternatives_11993);
                    rule__PostfixExpr__ExistingVariableAssignment_1_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_1_1()); 
                    }

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
    // $ANTLR end rule__PostfixExpr__Alternatives_1


    // $ANTLR start rule__PostfixExpr__Alternatives_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: rule__PostfixExpr__Alternatives_2 : ( ( ( rule__PostfixExpr__Group_2_0__0 ) ) | ( ( rule__PostfixExpr__Group_2_1__0 ) ) | ( ( rule__PostfixExpr__Group_2_2__0 ) ) );
    public final void rule__PostfixExpr__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:944:1: ( ( ( rule__PostfixExpr__Group_2_0__0 ) ) | ( ( rule__PostfixExpr__Group_2_1__0 ) ) | ( ( rule__PostfixExpr__Group_2_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt8=1;
                }
                break;
            case 28:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("940:1: rule__PostfixExpr__Alternatives_2 : ( ( ( rule__PostfixExpr__Group_2_0__0 ) ) | ( ( rule__PostfixExpr__Group_2_1__0 ) ) | ( ( rule__PostfixExpr__Group_2_2__0 ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( ( rule__PostfixExpr__Group_2_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:945:1: ( ( rule__PostfixExpr__Group_2_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( rule__PostfixExpr__Group_2_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_2_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( rule__PostfixExpr__Group_2_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:947:2: rule__PostfixExpr__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_2_0__0_in_rule__PostfixExpr__Alternatives_22026);
                    rule__PostfixExpr__Group_2_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:951:6: ( ( rule__PostfixExpr__Group_2_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:951:6: ( ( rule__PostfixExpr__Group_2_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: ( rule__PostfixExpr__Group_2_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_2_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:953:1: ( rule__PostfixExpr__Group_2_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:953:2: rule__PostfixExpr__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1__0_in_rule__PostfixExpr__Alternatives_22044);
                    rule__PostfixExpr__Group_2_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getGroup_2_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:957:6: ( ( rule__PostfixExpr__Group_2_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:957:6: ( ( rule__PostfixExpr__Group_2_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ( rule__PostfixExpr__Group_2_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_2_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( rule__PostfixExpr__Group_2_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:959:2: rule__PostfixExpr__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_2_2__0_in_rule__PostfixExpr__Alternatives_22062);
                    rule__PostfixExpr__Group_2_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getGroup_2_2()); 
                    }

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
    // $ANTLR end rule__PostfixExpr__Alternatives_2


    // $ANTLR start rule__Constant__Alternatives
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: rule__Constant__Alternatives : ( ( 'true' ) | ( 'false' ) | ( ( rule__Constant__RealAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( ( 'true' ) | ( 'false' ) | ( ( rule__Constant__RealAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==EOF||LA9_3==RULE_SIGN||(LA9_3>=15 && LA9_3<=23)||(LA9_3>=26 && LA9_3<=27)||(LA9_3>=29 && LA9_3<=30)||(LA9_3>=41 && LA9_3<=42)||LA9_3==46) ) {
                    alt9=4;
                }
                else if ( (LA9_3==44) ) {
                    alt9=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("968:1: rule__Constant__Alternatives : ( ( 'true' ) | ( 'false' ) | ( ( rule__Constant__RealAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt9=5;
                }
                break;
            case 48:
                {
                alt9=6;
                }
                break;
            case 49:
                {
                alt9=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("968:1: rule__Constant__Alternatives : ( ( 'true' ) | ( 'false' ) | ( ( rule__Constant__RealAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( 'true' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( 'true' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: 'true'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getTrueKeyword_0()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__Constant__Alternatives2096); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:6: ( 'false' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:6: ( 'false' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: 'false'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getFalseKeyword_1()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__Constant__Alternatives2116); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:989:6: ( ( rule__Constant__RealAssignment_2 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:989:6: ( ( rule__Constant__RealAssignment_2 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:990:1: ( rule__Constant__RealAssignment_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getRealAssignment_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:991:1: ( rule__Constant__RealAssignment_2 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:991:2: rule__Constant__RealAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Constant__RealAssignment_2_in_rule__Constant__Alternatives2135);
                    rule__Constant__RealAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getRealAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:995:6: ( ( rule__Constant__IntegerAssignment_3 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:995:6: ( ( rule__Constant__IntegerAssignment_3 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: ( rule__Constant__IntegerAssignment_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getIntegerAssignment_3()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:997:1: ( rule__Constant__IntegerAssignment_3 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:997:2: rule__Constant__IntegerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constant__IntegerAssignment_3_in_rule__Constant__Alternatives2153);
                    rule__Constant__IntegerAssignment_3();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getIntegerAssignment_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:6: ( ( rule__Constant__StringAssignment_4 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:6: ( ( rule__Constant__StringAssignment_4 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( rule__Constant__StringAssignment_4 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringAssignment_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( rule__Constant__StringAssignment_4 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:2: rule__Constant__StringAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Constant__StringAssignment_4_in_rule__Constant__Alternatives2171);
                    rule__Constant__StringAssignment_4();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getStringAssignment_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:6: ( ( rule__Constant__NullAssignment_5 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:6: ( ( rule__Constant__NullAssignment_5 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( rule__Constant__NullAssignment_5 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNullAssignment_5()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: ( rule__Constant__NullAssignment_5 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:2: rule__Constant__NullAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Constant__NullAssignment_5_in_rule__Constant__Alternatives2189);
                    rule__Constant__NullAssignment_5();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getNullAssignment_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:6: ( ( rule__Constant__InfinityAssignment_6 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:6: ( ( rule__Constant__InfinityAssignment_6 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( rule__Constant__InfinityAssignment_6 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getInfinityAssignment_6()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( rule__Constant__InfinityAssignment_6 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:2: rule__Constant__InfinityAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Constant__InfinityAssignment_6_in_rule__Constant__Alternatives2207);
                    rule__Constant__InfinityAssignment_6();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getInfinityAssignment_6()); 
                    }

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
    // $ANTLR end rule__Constant__Alternatives


    // $ANTLR start rule__EndExpr__Alternatives
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: rule__EndExpr__Alternatives : ( ( ',' ) | ( ';' ) );
    public final void rule__EndExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( ( ',' ) | ( ';' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1024:1: rule__EndExpr__Alternatives : ( ( ',' ) | ( ';' ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ',' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ',' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ','
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEndExprAccess().getCommaKeyword_0()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__EndExpr__Alternatives2241); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEndExprAccess().getCommaKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:6: ( ';' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:6: ( ';' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1038:1: ';'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEndExprAccess().getSemicolonKeyword_1()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__EndExpr__Alternatives2261); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEndExprAccess().getSemicolonKeyword_1()); 
                    }

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
    // $ANTLR end rule__EndExpr__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1052:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1057:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02293);
            rule__Model__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02296);
            rule__Model__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1064:1: rule__Model__Group__0__Impl : ( ( rule__Model__FunctionsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1068:1: ( ( ( rule__Model__FunctionsAssignment_0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( ( rule__Model__FunctionsAssignment_0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1069:1: ( ( rule__Model__FunctionsAssignment_0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1070:1: ( rule__Model__FunctionsAssignment_0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:1: ( rule__Model__FunctionsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1071:2: rule__Model__FunctionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__FunctionsAssignment_0_in_rule__Model__Group__0__Impl2323);
            	    rule__Model__FunctionsAssignment_0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFunctionsAssignment_0()); 
            }

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
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1085:1: ( rule__Model__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1086:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12354);
            rule__Model__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1092:1: rule__Model__Group__1__Impl : ( ( rule__Model__MainAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1096:1: ( ( ( rule__Model__MainAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( ( rule__Model__MainAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1097:1: ( ( rule__Model__MainAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1098:1: ( rule__Model__MainAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMainAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:1: ( rule__Model__MainAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1099:2: rule__Model__MainAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__MainAssignment_1_in_rule__Model__Group__1__Impl2381);
            rule__Model__MainAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMainAssignment_1()); 
            }

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
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__FunctionDefinition__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1113:1: rule__FunctionDefinition__Group__0 : rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 ;
    public final void rule__FunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: ( rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1118:2: rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02415);
            rule__FunctionDefinition__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02418);
            rule__FunctionDefinition__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionDefinition__Group__0


    // $ANTLR start rule__FunctionDefinition__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1125:1: rule__FunctionDefinition__Group__0__Impl : ( ( rule__FunctionDefinition__NameAssignment_0 ) ) ;
    public final void rule__FunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1129:1: ( ( ( rule__FunctionDefinition__NameAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( ( rule__FunctionDefinition__NameAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1130:1: ( ( rule__FunctionDefinition__NameAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1131:1: ( rule__FunctionDefinition__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:1: ( rule__FunctionDefinition__NameAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1132:2: rule__FunctionDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__NameAssignment_0_in_rule__FunctionDefinition__Group__0__Impl2445);
            rule__FunctionDefinition__NameAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_0()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__Group__0__Impl


    // $ANTLR start rule__FunctionDefinition__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1142:1: rule__FunctionDefinition__Group__1 : rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 ;
    public final void rule__FunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: ( rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1147:2: rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12475);
            rule__FunctionDefinition__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12478);
            rule__FunctionDefinition__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionDefinition__Group__1


    // $ANTLR start rule__FunctionDefinition__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1154:1: rule__FunctionDefinition__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1158:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1159:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1160:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__FunctionDefinition__Group__1__Impl2506); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__Group__1__Impl


    // $ANTLR start rule__FunctionDefinition__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1173:1: rule__FunctionDefinition__Group__2 : rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 ;
    public final void rule__FunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: ( rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1178:2: rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22537);
            rule__FunctionDefinition__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22540);
            rule__FunctionDefinition__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionDefinition__Group__2


    // $ANTLR start rule__FunctionDefinition__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1185:1: rule__FunctionDefinition__Group__2__Impl : ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? ) ;
    public final void rule__FunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1189:1: ( ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1190:1: ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1191:1: ( rule__FunctionDefinition__FormalParamsAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getFormalParamsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:1: ( rule__FunctionDefinition__FormalParamsAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=14)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1192:2: rule__FunctionDefinition__FormalParamsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__FormalParamsAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2567);
                    rule__FunctionDefinition__FormalParamsAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getFormalParamsAssignment_2()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__Group__2__Impl


    // $ANTLR start rule__FunctionDefinition__Group__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1202:1: rule__FunctionDefinition__Group__3 : rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 ;
    public final void rule__FunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: ( rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1207:2: rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32598);
            rule__FunctionDefinition__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32601);
            rule__FunctionDefinition__Group__4();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionDefinition__Group__3


    // $ANTLR start rule__FunctionDefinition__Group__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1214:1: rule__FunctionDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1218:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1219:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1220:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__FunctionDefinition__Group__3__Impl2629); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__Group__3__Impl


    // $ANTLR start rule__FunctionDefinition__Group__4
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1233:1: rule__FunctionDefinition__Group__4 : rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 ;
    public final void rule__FunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: ( rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1238:2: rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42660);
            rule__FunctionDefinition__Group__4__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42663);
            rule__FunctionDefinition__Group__5();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionDefinition__Group__4


    // $ANTLR start rule__FunctionDefinition__Group__4__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1245:1: rule__FunctionDefinition__Group__4__Impl : ( ( rule__FunctionDefinition__Group_4__0 )? ) ;
    public final void rule__FunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1249:1: ( ( ( rule__FunctionDefinition__Group_4__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: ( ( rule__FunctionDefinition__Group_4__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1250:1: ( ( rule__FunctionDefinition__Group_4__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1251:1: ( rule__FunctionDefinition__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getGroup_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:1: ( rule__FunctionDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1252:2: rule__FunctionDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__0_in_rule__FunctionDefinition__Group__4__Impl2690);
                    rule__FunctionDefinition__Group_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getGroup_4()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__Group__4__Impl


    // $ANTLR start rule__FunctionDefinition__Group__5
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1262:1: rule__FunctionDefinition__Group__5 : rule__FunctionDefinition__Group__5__Impl ;
    public final void rule__FunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: ( rule__FunctionDefinition__Group__5__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1267:2: rule__FunctionDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52721);
            rule__FunctionDefinition__Group__5__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionDefinition__Group__5


    // $ANTLR start rule__FunctionDefinition__Group__5__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1273:1: rule__FunctionDefinition__Group__5__Impl : ( ( rule__FunctionDefinition__BlocksAssignment_5 ) ) ;
    public final void rule__FunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1277:1: ( ( ( rule__FunctionDefinition__BlocksAssignment_5 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: ( ( rule__FunctionDefinition__BlocksAssignment_5 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1278:1: ( ( rule__FunctionDefinition__BlocksAssignment_5 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1279:1: ( rule__FunctionDefinition__BlocksAssignment_5 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getBlocksAssignment_5()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:1: ( rule__FunctionDefinition__BlocksAssignment_5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1280:2: rule__FunctionDefinition__BlocksAssignment_5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__BlocksAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2748);
            rule__FunctionDefinition__BlocksAssignment_5();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getBlocksAssignment_5()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__Group__5__Impl


    // $ANTLR start rule__FunctionDefinition__Group_4__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: rule__FunctionDefinition__Group_4__0 : rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1 ;
    public final void rule__FunctionDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: ( rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1307:2: rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__0__Impl_in_rule__FunctionDefinition__Group_4__02790);
            rule__FunctionDefinition__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__1_in_rule__FunctionDefinition__Group_4__02793);
            rule__FunctionDefinition__Group_4__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionDefinition__Group_4__0


    // $ANTLR start rule__FunctionDefinition__Group_4__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: rule__FunctionDefinition__Group_4__0__Impl : ( ':' ) ;
    public final void rule__FunctionDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1320:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getColonKeyword_4_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__FunctionDefinition__Group_4__0__Impl2821); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getColonKeyword_4_0()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__Group_4__0__Impl


    // $ANTLR start rule__FunctionDefinition__Group_4__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1333:1: rule__FunctionDefinition__Group_4__1 : rule__FunctionDefinition__Group_4__1__Impl ;
    public final void rule__FunctionDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1337:1: ( rule__FunctionDefinition__Group_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1338:2: rule__FunctionDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__1__Impl_in_rule__FunctionDefinition__Group_4__12852);
            rule__FunctionDefinition__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionDefinition__Group_4__1


    // $ANTLR start rule__FunctionDefinition__Group_4__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1344:1: rule__FunctionDefinition__Group_4__1__Impl : ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) ) ;
    public final void rule__FunctionDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1348:1: ( ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1349:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1350:1: ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:1: ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1351:2: rule__FunctionDefinition__ReturnTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_4_1_in_rule__FunctionDefinition__Group_4__1__Impl2879);
            rule__FunctionDefinition__ReturnTypeAssignment_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_4_1()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__Group_4__1__Impl


    // $ANTLR start rule__MainFunction__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1365:1: rule__MainFunction__Group__0 : rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 ;
    public final void rule__MainFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: ( rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:2: rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__0__Impl_in_rule__MainFunction__Group__02913);
            rule__MainFunction__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__1_in_rule__MainFunction__Group__02916);
            rule__MainFunction__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MainFunction__Group__0


    // $ANTLR start rule__MainFunction__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1377:1: rule__MainFunction__Group__0__Impl : ( ( rule__MainFunction__MainAssignment_0 ) ) ;
    public final void rule__MainFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1381:1: ( ( ( rule__MainFunction__MainAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( ( rule__MainFunction__MainAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1382:1: ( ( rule__MainFunction__MainAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1383:1: ( rule__MainFunction__MainAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:1: ( rule__MainFunction__MainAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1384:2: rule__MainFunction__MainAssignment_0
            {
            pushFollow(FOLLOW_rule__MainFunction__MainAssignment_0_in_rule__MainFunction__Group__0__Impl2943);
            rule__MainFunction__MainAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getMainAssignment_0()); 
            }

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
    // $ANTLR end rule__MainFunction__Group__0__Impl


    // $ANTLR start rule__MainFunction__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1394:1: rule__MainFunction__Group__1 : rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 ;
    public final void rule__MainFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: ( rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1399:2: rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__1__Impl_in_rule__MainFunction__Group__12973);
            rule__MainFunction__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__2_in_rule__MainFunction__Group__12976);
            rule__MainFunction__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MainFunction__Group__1


    // $ANTLR start rule__MainFunction__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1406:1: rule__MainFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__MainFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1410:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1411:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1412:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__MainFunction__Group__1__Impl3004); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end rule__MainFunction__Group__1__Impl


    // $ANTLR start rule__MainFunction__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1425:1: rule__MainFunction__Group__2 : rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 ;
    public final void rule__MainFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: ( rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1430:2: rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__2__Impl_in_rule__MainFunction__Group__23035);
            rule__MainFunction__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__3_in_rule__MainFunction__Group__23038);
            rule__MainFunction__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MainFunction__Group__2


    // $ANTLR start rule__MainFunction__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1437:1: rule__MainFunction__Group__2__Impl : ( ( rule__MainFunction__FormalParamsAssignment_2 )? ) ;
    public final void rule__MainFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1441:1: ( ( ( rule__MainFunction__FormalParamsAssignment_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ( rule__MainFunction__FormalParamsAssignment_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1442:1: ( ( rule__MainFunction__FormalParamsAssignment_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1443:1: ( rule__MainFunction__FormalParamsAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getFormalParamsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:1: ( rule__MainFunction__FormalParamsAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=12 && LA14_0<=14)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1444:2: rule__MainFunction__FormalParamsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MainFunction__FormalParamsAssignment_2_in_rule__MainFunction__Group__2__Impl3065);
                    rule__MainFunction__FormalParamsAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getFormalParamsAssignment_2()); 
            }

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
    // $ANTLR end rule__MainFunction__Group__2__Impl


    // $ANTLR start rule__MainFunction__Group__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1454:1: rule__MainFunction__Group__3 : rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 ;
    public final void rule__MainFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: ( rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1459:2: rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__3__Impl_in_rule__MainFunction__Group__33096);
            rule__MainFunction__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__4_in_rule__MainFunction__Group__33099);
            rule__MainFunction__Group__4();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MainFunction__Group__3


    // $ANTLR start rule__MainFunction__Group__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1466:1: rule__MainFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__MainFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1470:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1471:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1472:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__MainFunction__Group__3__Impl3127); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end rule__MainFunction__Group__3__Impl


    // $ANTLR start rule__MainFunction__Group__4
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1485:1: rule__MainFunction__Group__4 : rule__MainFunction__Group__4__Impl ;
    public final void rule__MainFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: ( rule__MainFunction__Group__4__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1490:2: rule__MainFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__4__Impl_in_rule__MainFunction__Group__43158);
            rule__MainFunction__Group__4__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MainFunction__Group__4


    // $ANTLR start rule__MainFunction__Group__4__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: rule__MainFunction__Group__4__Impl : ( ( rule__MainFunction__BlocksAssignment_4 ) ) ;
    public final void rule__MainFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1500:1: ( ( ( rule__MainFunction__BlocksAssignment_4 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: ( ( rule__MainFunction__BlocksAssignment_4 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1501:1: ( ( rule__MainFunction__BlocksAssignment_4 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1502:1: ( rule__MainFunction__BlocksAssignment_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getBlocksAssignment_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:1: ( rule__MainFunction__BlocksAssignment_4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1503:2: rule__MainFunction__BlocksAssignment_4
            {
            pushFollow(FOLLOW_rule__MainFunction__BlocksAssignment_4_in_rule__MainFunction__Group__4__Impl3185);
            rule__MainFunction__BlocksAssignment_4();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getBlocksAssignment_4()); 
            }

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
    // $ANTLR end rule__MainFunction__Group__4__Impl


    // $ANTLR start rule__FormalParams__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: rule__FormalParams__Group__0 : rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1 ;
    public final void rule__FormalParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: ( rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1528:2: rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1
            {
            pushFollow(FOLLOW_rule__FormalParams__Group__0__Impl_in_rule__FormalParams__Group__03225);
            rule__FormalParams__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FormalParams__Group__1_in_rule__FormalParams__Group__03228);
            rule__FormalParams__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FormalParams__Group__0


    // $ANTLR start rule__FormalParams__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1535:1: rule__FormalParams__Group__0__Impl : ( ( rule__FormalParams__ParamsAssignment_0 ) ) ;
    public final void rule__FormalParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1539:1: ( ( ( rule__FormalParams__ParamsAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:1: ( ( rule__FormalParams__ParamsAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1540:1: ( ( rule__FormalParams__ParamsAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: ( rule__FormalParams__ParamsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:1: ( rule__FormalParams__ParamsAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:2: rule__FormalParams__ParamsAssignment_0
            {
            pushFollow(FOLLOW_rule__FormalParams__ParamsAssignment_0_in_rule__FormalParams__Group__0__Impl3255);
            rule__FormalParams__ParamsAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFormalParamsAccess().getParamsAssignment_0()); 
            }

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
    // $ANTLR end rule__FormalParams__Group__0__Impl


    // $ANTLR start rule__FormalParams__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: rule__FormalParams__Group__1 : rule__FormalParams__Group__1__Impl ;
    public final void rule__FormalParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1556:1: ( rule__FormalParams__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1557:2: rule__FormalParams__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FormalParams__Group__1__Impl_in_rule__FormalParams__Group__13285);
            rule__FormalParams__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FormalParams__Group__1


    // $ANTLR start rule__FormalParams__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1563:1: rule__FormalParams__Group__1__Impl : ( ( rule__FormalParams__Group_1__0 )* ) ;
    public final void rule__FormalParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1567:1: ( ( ( rule__FormalParams__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( ( rule__FormalParams__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1568:1: ( ( rule__FormalParams__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1569:1: ( rule__FormalParams__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:1: ( rule__FormalParams__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==26) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1570:2: rule__FormalParams__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FormalParams__Group_1__0_in_rule__FormalParams__Group__1__Impl3312);
            	    rule__FormalParams__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getFormalParamsAccess().getGroup_1()); 
            }

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
    // $ANTLR end rule__FormalParams__Group__1__Impl


    // $ANTLR start rule__FormalParams__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1584:1: rule__FormalParams__Group_1__0 : rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1 ;
    public final void rule__FormalParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: ( rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1589:2: rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1
            {
            pushFollow(FOLLOW_rule__FormalParams__Group_1__0__Impl_in_rule__FormalParams__Group_1__03347);
            rule__FormalParams__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FormalParams__Group_1__1_in_rule__FormalParams__Group_1__03350);
            rule__FormalParams__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FormalParams__Group_1__0


    // $ANTLR start rule__FormalParams__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1596:1: rule__FormalParams__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FormalParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1600:1: ( ( ',' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:1: ( ',' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1601:1: ( ',' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1602:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getCommaKeyword_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__FormalParams__Group_1__0__Impl3378); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFormalParamsAccess().getCommaKeyword_1_0()); 
            }

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
    // $ANTLR end rule__FormalParams__Group_1__0__Impl


    // $ANTLR start rule__FormalParams__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: rule__FormalParams__Group_1__1 : rule__FormalParams__Group_1__1__Impl ;
    public final void rule__FormalParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( rule__FormalParams__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:2: rule__FormalParams__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FormalParams__Group_1__1__Impl_in_rule__FormalParams__Group_1__13409);
            rule__FormalParams__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FormalParams__Group_1__1


    // $ANTLR start rule__FormalParams__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1626:1: rule__FormalParams__Group_1__1__Impl : ( ( rule__FormalParams__ParamsAssignment_1_1 ) ) ;
    public final void rule__FormalParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1630:1: ( ( ( rule__FormalParams__ParamsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( ( rule__FormalParams__ParamsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1631:1: ( ( rule__FormalParams__ParamsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1632:1: ( rule__FormalParams__ParamsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:1: ( rule__FormalParams__ParamsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1633:2: rule__FormalParams__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FormalParams__ParamsAssignment_1_1_in_rule__FormalParams__Group_1__1__Impl3436);
            rule__FormalParams__ParamsAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFormalParamsAccess().getParamsAssignment_1_1()); 
            }

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
    // $ANTLR end rule__FormalParams__Group_1__1__Impl


    // $ANTLR start rule__Param__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1647:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03470);
            rule__Param__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03473);
            rule__Param__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Param__Group__0


    // $ANTLR start rule__Param__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1659:1: rule__Param__Group__0__Impl : ( ruletype ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1663:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1664:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1665:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__Param__Group__0__Impl3500);
            ruletype();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParamAccess().getTypeParserRuleCall_0()); 
            }

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
    // $ANTLR end rule__Param__Group__0__Impl


    // $ANTLR start rule__Param__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1676:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1680:1: ( rule__Param__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1681:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__13529);
            rule__Param__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Param__Group__1


    // $ANTLR start rule__Param__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1687:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1691:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1692:1: ( ( rule__Param__NameAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1693:1: ( rule__Param__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:1: ( rule__Param__NameAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1694:2: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl3556);
            rule__Param__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end rule__Param__Group__1__Impl


    // $ANTLR start rule__Block__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1708:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1713:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03590);
            rule__Block__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03593);
            rule__Block__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Block__Group__0


    // $ANTLR start rule__Block__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1720:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1724:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1725:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1726:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1727:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1729:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Block__Group__0__Impl


    // $ANTLR start rule__Block__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13651);
            rule__Block__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__13654);
            rule__Block__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Block__Group__1


    // $ANTLR start rule__Block__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1751:1: rule__Block__Group__1__Impl : ( 'begin' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1755:1: ( ( 'begin' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( 'begin' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1756:1: ( 'begin' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1757:1: 'begin'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBeginKeyword_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Block__Group__1__Impl3682); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getBeginKeyword_1()); 
            }

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
    // $ANTLR end rule__Block__Group__1__Impl


    // $ANTLR start rule__Block__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1770:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1775:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__23713);
            rule__Block__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__23716);
            rule__Block__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Block__Group__2


    // $ANTLR start rule__Block__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1782:1: rule__Block__Group__2__Impl : ( ( rule__Block__StatementsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1786:1: ( ( ( rule__Block__StatementsAssignment_2 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( ( rule__Block__StatementsAssignment_2 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1787:1: ( ( rule__Block__StatementsAssignment_2 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1788:1: ( rule__Block__StatementsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:1: ( rule__Block__StatementsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=12 && LA16_0<=14)||LA16_0==31||(LA16_0>=33 && LA16_0<=34)||LA16_0==36||LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1789:2: rule__Block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__StatementsAssignment_2_in_rule__Block__Group__2__Impl3743);
            	    rule__Block__StatementsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }

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
    // $ANTLR end rule__Block__Group__2__Impl


    // $ANTLR start rule__Block__Group__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1799:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: ( rule__Block__Group__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1804:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__33774);
            rule__Block__Group__3__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Block__Group__3


    // $ANTLR start rule__Block__Group__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: rule__Block__Group__3__Impl : ( 'end' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1814:1: ( ( 'end' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( 'end' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1815:1: ( 'end' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1816:1: 'end'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getEndKeyword_3()); 
            }
            match(input,32,FOLLOW_32_in_rule__Block__Group__3__Impl3802); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getEndKeyword_3()); 
            }

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
    // $ANTLR end rule__Block__Group__3__Impl


    // $ANTLR start rule__Statement__Group_0__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1842:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03841);
            rule__Statement__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03844);
            rule__Statement__Group_0__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_0__0


    // $ANTLR start rule__Statement__Group_0__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: rule__Statement__Group_0__0__Impl : ( ruledeclaration ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:1: ( ( ruledeclaration ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( ruledeclaration )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:1: ( ruledeclaration )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1855:1: ruledeclaration
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_rule__Statement__Group_0__0__Impl3871);
            ruledeclaration();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_0_0()); 
            }

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
    // $ANTLR end rule__Statement__Group_0__0__Impl


    // $ANTLR start rule__Statement__Group_0__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1870:1: ( rule__Statement__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1871:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__13900);
            rule__Statement__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_0__1


    // $ANTLR start rule__Statement__Group_0__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: rule__Statement__Group_0__1__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1881:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1882:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1883:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_0__1__Impl3927);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEndExprParserRuleCall_0_1()); 
            }

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
    // $ANTLR end rule__Statement__Group_0__1__Impl


    // $ANTLR start rule__Statement__Group_2__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1898:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__03960);
            rule__Statement__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__03963);
            rule__Statement__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_2__0


    // $ANTLR start rule__Statement__Group_2__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1910:1: rule__Statement__Group_2__0__Impl : ( () ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1914:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1915:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_2_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1917:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1919:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_2__0__Impl


    // $ANTLR start rule__Statement__Group_2__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1929:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__14021);
            rule__Statement__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__14024);
            rule__Statement__Group_2__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_2__1


    // $ANTLR start rule__Statement__Group_2__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: rule__Statement__Group_2__1__Impl : ( ( rule__Statement__PostFixExpressionAssignment_2_1 ) ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: ( ( ( rule__Statement__PostFixExpressionAssignment_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1946:1: ( ( rule__Statement__PostFixExpressionAssignment_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1946:1: ( ( rule__Statement__PostFixExpressionAssignment_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1947:1: ( rule__Statement__PostFixExpressionAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPostFixExpressionAssignment_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:1: ( rule__Statement__PostFixExpressionAssignment_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1948:2: rule__Statement__PostFixExpressionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Statement__PostFixExpressionAssignment_2_1_in_rule__Statement__Group_2__1__Impl4051);
            rule__Statement__PostFixExpressionAssignment_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getPostFixExpressionAssignment_2_1()); 
            }

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
    // $ANTLR end rule__Statement__Group_2__1__Impl


    // $ANTLR start rule__Statement__Group_2__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1958:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ( rule__Statement__Group_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:2: rule__Statement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__24081);
            rule__Statement__Group_2__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_2__2


    // $ANTLR start rule__Statement__Group_2__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: rule__Statement__Group_2__2__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1973:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1974:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1975:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_2_2()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_2__2__Impl4108);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEndExprParserRuleCall_2_2()); 
            }

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
    // $ANTLR end rule__Statement__Group_2__2__Impl


    // $ANTLR start rule__Statement__Group_3__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1992:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__04143);
            rule__Statement__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__04146);
            rule__Statement__Group_3__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_3__0


    // $ANTLR start rule__Statement__Group_3__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2004:1: rule__Statement__Group_3__0__Impl : ( () ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2009:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2010:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_3_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2011:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_3__0__Impl


    // $ANTLR start rule__Statement__Group_3__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2028:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__14204);
            rule__Statement__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__14207);
            rule__Statement__Group_3__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_3__1


    // $ANTLR start rule__Statement__Group_3__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2035:1: rule__Statement__Group_3__1__Impl : ( ( rule__Statement__AssignmentsAssignment_3_1 ) ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2039:1: ( ( ( rule__Statement__AssignmentsAssignment_3_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( ( rule__Statement__AssignmentsAssignment_3_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: ( ( rule__Statement__AssignmentsAssignment_3_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2041:1: ( rule__Statement__AssignmentsAssignment_3_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentsAssignment_3_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:1: ( rule__Statement__AssignmentsAssignment_3_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2042:2: rule__Statement__AssignmentsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Statement__AssignmentsAssignment_3_1_in_rule__Statement__Group_3__1__Impl4234);
            rule__Statement__AssignmentsAssignment_3_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAssignmentsAssignment_3_1()); 
            }

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
    // $ANTLR end rule__Statement__Group_3__1__Impl


    // $ANTLR start rule__Statement__Group_3__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: ( rule__Statement__Group_3__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:2: rule__Statement__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__2__Impl_in_rule__Statement__Group_3__24264);
            rule__Statement__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_3__2


    // $ANTLR start rule__Statement__Group_3__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2063:1: rule__Statement__Group_3__2__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2067:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2068:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2069:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_3_2()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_3__2__Impl4291);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEndExprParserRuleCall_3_2()); 
            }

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
    // $ANTLR end rule__Statement__Group_3__2__Impl


    // $ANTLR start rule__Statement__Group_4__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2086:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2091:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__04326);
            rule__Statement__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__04329);
            rule__Statement__Group_4__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_4__0


    // $ANTLR start rule__Statement__Group_4__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2098:1: rule__Statement__Group_4__0__Impl : ( () ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2102:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2103:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_4_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2107:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_4__0__Impl


    // $ANTLR start rule__Statement__Group_4__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2122:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__14387);
            rule__Statement__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__14390);
            rule__Statement__Group_4__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_4__1


    // $ANTLR start rule__Statement__Group_4__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2129:1: rule__Statement__Group_4__1__Impl : ( 'return' ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2133:1: ( ( 'return' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( 'return' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: ( 'return' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2135:1: 'return'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnKeyword_4_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Statement__Group_4__1__Impl4418); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnKeyword_4_1()); 
            }

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
    // $ANTLR end rule__Statement__Group_4__1__Impl


    // $ANTLR start rule__Statement__Group_4__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2148:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__24449);
            rule__Statement__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__24452);
            rule__Statement__Group_4__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_4__2


    // $ANTLR start rule__Statement__Group_4__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2160:1: rule__Statement__Group_4__2__Impl : ( ( rule__Statement__ExprsAssignment_4_2 )? ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2164:1: ( ( ( rule__Statement__ExprsAssignment_4_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( ( rule__Statement__ExprsAssignment_4_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: ( ( rule__Statement__ExprsAssignment_4_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2166:1: ( rule__Statement__ExprsAssignment_4_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsAssignment_4_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:1: ( rule__Statement__ExprsAssignment_4_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||(LA17_0>=24 && LA17_0<=25)||LA17_0==28||LA17_0==43||(LA17_0>=48 && LA17_0<=49)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2167:2: rule__Statement__ExprsAssignment_4_2
                    {
                    pushFollow(FOLLOW_rule__Statement__ExprsAssignment_4_2_in_rule__Statement__Group_4__2__Impl4479);
                    rule__Statement__ExprsAssignment_4_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprsAssignment_4_2()); 
            }

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
    // $ANTLR end rule__Statement__Group_4__2__Impl


    // $ANTLR start rule__Statement__Group_4__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ( rule__Statement__Group_4__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:2: rule__Statement__Group_4__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__34510);
            rule__Statement__Group_4__3__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_4__3


    // $ANTLR start rule__Statement__Group_4__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2188:1: rule__Statement__Group_4__3__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2192:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2193:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2194:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_4_3()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_4__3__Impl4537);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEndExprParserRuleCall_4_3()); 
            }

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
    // $ANTLR end rule__Statement__Group_4__3__Impl


    // $ANTLR start rule__Statement__Group_5__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2218:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__04574);
            rule__Statement__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__04577);
            rule__Statement__Group_5__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_5__0


    // $ANTLR start rule__Statement__Group_5__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2225:1: rule__Statement__Group_5__0__Impl : ( 'if' ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: ( ( 'if' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ( 'if' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:1: ( 'if' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2231:1: 'if'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getIfKeyword_5_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Statement__Group_5__0__Impl4605); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getIfKeyword_5_0()); 
            }

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
    // $ANTLR end rule__Statement__Group_5__0__Impl


    // $ANTLR start rule__Statement__Group_5__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2244:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: ( rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2249:2: rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__14636);
            rule__Statement__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__2_in_rule__Statement__Group_5__14639);
            rule__Statement__Group_5__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_5__1


    // $ANTLR start rule__Statement__Group_5__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2256:1: rule__Statement__Group_5__1__Impl : ( ruleexpr ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2260:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2262:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__Group_5__1__Impl4666);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprParserRuleCall_5_1()); 
            }

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
    // $ANTLR end rule__Statement__Group_5__1__Impl


    // $ANTLR start rule__Statement__Group_5__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: rule__Statement__Group_5__2 : rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 ;
    public final void rule__Statement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ( rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:2: rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__2__Impl_in_rule__Statement__Group_5__24695);
            rule__Statement__Group_5__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__3_in_rule__Statement__Group_5__24698);
            rule__Statement__Group_5__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_5__2


    // $ANTLR start rule__Statement__Group_5__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2285:1: rule__Statement__Group_5__2__Impl : ( ':' ) ;
    public final void rule__Statement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2289:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2290:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2291:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_5_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Statement__Group_5__2__Impl4726); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_5_2()); 
            }

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
    // $ANTLR end rule__Statement__Group_5__2__Impl


    // $ANTLR start rule__Statement__Group_5__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: rule__Statement__Group_5__3 : rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 ;
    public final void rule__Statement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: ( rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:2: rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__3__Impl_in_rule__Statement__Group_5__34757);
            rule__Statement__Group_5__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__4_in_rule__Statement__Group_5__34760);
            rule__Statement__Group_5__4();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_5__3


    // $ANTLR start rule__Statement__Group_5__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2316:1: rule__Statement__Group_5__3__Impl : ( ( rule__Statement__StatementsAssignment_5_3 ) ) ;
    public final void rule__Statement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2320:1: ( ( ( rule__Statement__StatementsAssignment_5_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( ( rule__Statement__StatementsAssignment_5_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: ( ( rule__Statement__StatementsAssignment_5_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2322:1: ( rule__Statement__StatementsAssignment_5_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_5_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:1: ( rule__Statement__StatementsAssignment_5_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2323:2: rule__Statement__StatementsAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_5_3_in_rule__Statement__Group_5__3__Impl4787);
            rule__Statement__StatementsAssignment_5_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsAssignment_5_3()); 
            }

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
    // $ANTLR end rule__Statement__Group_5__3__Impl


    // $ANTLR start rule__Statement__Group_5__4
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: rule__Statement__Group_5__4 : rule__Statement__Group_5__4__Impl ;
    public final void rule__Statement__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: ( rule__Statement__Group_5__4__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:2: rule__Statement__Group_5__4__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__4__Impl_in_rule__Statement__Group_5__44817);
            rule__Statement__Group_5__4__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_5__4


    // $ANTLR start rule__Statement__Group_5__4__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2344:1: rule__Statement__Group_5__4__Impl : ( ( rule__Statement__Group_5_4__0 )? ) ;
    public final void rule__Statement__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2348:1: ( ( ( rule__Statement__Group_5_4__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:1: ( ( rule__Statement__Group_5_4__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2349:1: ( ( rule__Statement__Group_5_4__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2350:1: ( rule__Statement__Group_5_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup_5_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:1: ( rule__Statement__Group_5_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred38()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:2: rule__Statement__Group_5_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_5_4__0_in_rule__Statement__Group_5__4__Impl4844);
                    rule__Statement__Group_5_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getGroup_5_4()); 
            }

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
    // $ANTLR end rule__Statement__Group_5__4__Impl


    // $ANTLR start rule__Statement__Group_5_4__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: rule__Statement__Group_5_4__0 : rule__Statement__Group_5_4__0__Impl rule__Statement__Group_5_4__1 ;
    public final void rule__Statement__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: ( rule__Statement__Group_5_4__0__Impl rule__Statement__Group_5_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2376:2: rule__Statement__Group_5_4__0__Impl rule__Statement__Group_5_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_5_4__0__Impl_in_rule__Statement__Group_5_4__04885);
            rule__Statement__Group_5_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5_4__1_in_rule__Statement__Group_5_4__04888);
            rule__Statement__Group_5_4__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_5_4__0


    // $ANTLR start rule__Statement__Group_5_4__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2383:1: rule__Statement__Group_5_4__0__Impl : ( 'else' ) ;
    public final void rule__Statement__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2387:1: ( ( 'else' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( 'else' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2388:1: ( 'else' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2389:1: 'else'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getElseKeyword_5_4_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Statement__Group_5_4__0__Impl4916); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getElseKeyword_5_4_0()); 
            }

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
    // $ANTLR end rule__Statement__Group_5_4__0__Impl


    // $ANTLR start rule__Statement__Group_5_4__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2402:1: rule__Statement__Group_5_4__1 : rule__Statement__Group_5_4__1__Impl ;
    public final void rule__Statement__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2406:1: ( rule__Statement__Group_5_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2407:2: rule__Statement__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_5_4__1__Impl_in_rule__Statement__Group_5_4__14947);
            rule__Statement__Group_5_4__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_5_4__1


    // $ANTLR start rule__Statement__Group_5_4__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2413:1: rule__Statement__Group_5_4__1__Impl : ( ( rule__Statement__StatementsAssignment_5_4_1 ) ) ;
    public final void rule__Statement__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2417:1: ( ( ( rule__Statement__StatementsAssignment_5_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( ( rule__Statement__StatementsAssignment_5_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2418:1: ( ( rule__Statement__StatementsAssignment_5_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: ( rule__Statement__StatementsAssignment_5_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_5_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:1: ( rule__Statement__StatementsAssignment_5_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2420:2: rule__Statement__StatementsAssignment_5_4_1
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_5_4_1_in_rule__Statement__Group_5_4__1__Impl4974);
            rule__Statement__StatementsAssignment_5_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsAssignment_5_4_1()); 
            }

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
    // $ANTLR end rule__Statement__Group_5_4__1__Impl


    // $ANTLR start rule__Statement__Group_6__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2434:1: rule__Statement__Group_6__0 : rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 ;
    public final void rule__Statement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: ( rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2439:2: rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__0__Impl_in_rule__Statement__Group_6__05008);
            rule__Statement__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__1_in_rule__Statement__Group_6__05011);
            rule__Statement__Group_6__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_6__0


    // $ANTLR start rule__Statement__Group_6__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2446:1: rule__Statement__Group_6__0__Impl : ( 'for' ) ;
    public final void rule__Statement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: ( ( 'for' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( 'for' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2451:1: ( 'for' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2452:1: 'for'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getForKeyword_6_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Statement__Group_6__0__Impl5039); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getForKeyword_6_0()); 
            }

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
    // $ANTLR end rule__Statement__Group_6__0__Impl


    // $ANTLR start rule__Statement__Group_6__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: rule__Statement__Group_6__1 : rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2 ;
    public final void rule__Statement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: ( rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2470:2: rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__1__Impl_in_rule__Statement__Group_6__15070);
            rule__Statement__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__2_in_rule__Statement__Group_6__15073);
            rule__Statement__Group_6__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_6__1


    // $ANTLR start rule__Statement__Group_6__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2477:1: rule__Statement__Group_6__1__Impl : ( ruleparam ) ;
    public final void rule__Statement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2481:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2483:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getParamParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__Statement__Group_6__1__Impl5100);
            ruleparam();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getParamParserRuleCall_6_1()); 
            }

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
    // $ANTLR end rule__Statement__Group_6__1__Impl


    // $ANTLR start rule__Statement__Group_6__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: rule__Statement__Group_6__2 : rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3 ;
    public final void rule__Statement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: ( rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:2: rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__2__Impl_in_rule__Statement__Group_6__25129);
            rule__Statement__Group_6__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__3_in_rule__Statement__Group_6__25132);
            rule__Statement__Group_6__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_6__2


    // $ANTLR start rule__Statement__Group_6__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2506:1: rule__Statement__Group_6__2__Impl : ( 'in' ) ;
    public final void rule__Statement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2510:1: ( ( 'in' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( 'in' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2511:1: ( 'in' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2512:1: 'in'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getInKeyword_6_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__Statement__Group_6__2__Impl5160); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getInKeyword_6_2()); 
            }

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
    // $ANTLR end rule__Statement__Group_6__2__Impl


    // $ANTLR start rule__Statement__Group_6__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: rule__Statement__Group_6__3 : rule__Statement__Group_6__3__Impl rule__Statement__Group_6__4 ;
    public final void rule__Statement__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: ( rule__Statement__Group_6__3__Impl rule__Statement__Group_6__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:2: rule__Statement__Group_6__3__Impl rule__Statement__Group_6__4
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__3__Impl_in_rule__Statement__Group_6__35191);
            rule__Statement__Group_6__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__4_in_rule__Statement__Group_6__35194);
            rule__Statement__Group_6__4();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_6__3


    // $ANTLR start rule__Statement__Group_6__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2537:1: rule__Statement__Group_6__3__Impl : ( ( rule__Statement__ExprsAssignment_6_3 ) ) ;
    public final void rule__Statement__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2541:1: ( ( ( rule__Statement__ExprsAssignment_6_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( ( rule__Statement__ExprsAssignment_6_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: ( ( rule__Statement__ExprsAssignment_6_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2543:1: ( rule__Statement__ExprsAssignment_6_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsAssignment_6_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2544:1: ( rule__Statement__ExprsAssignment_6_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2544:2: rule__Statement__ExprsAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Statement__ExprsAssignment_6_3_in_rule__Statement__Group_6__3__Impl5221);
            rule__Statement__ExprsAssignment_6_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprsAssignment_6_3()); 
            }

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
    // $ANTLR end rule__Statement__Group_6__3__Impl


    // $ANTLR start rule__Statement__Group_6__4
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: rule__Statement__Group_6__4 : rule__Statement__Group_6__4__Impl rule__Statement__Group_6__5 ;
    public final void rule__Statement__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:1: ( rule__Statement__Group_6__4__Impl rule__Statement__Group_6__5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2559:2: rule__Statement__Group_6__4__Impl rule__Statement__Group_6__5
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__4__Impl_in_rule__Statement__Group_6__45251);
            rule__Statement__Group_6__4__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__5_in_rule__Statement__Group_6__45254);
            rule__Statement__Group_6__5();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_6__4


    // $ANTLR start rule__Statement__Group_6__4__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2566:1: rule__Statement__Group_6__4__Impl : ( ':' ) ;
    public final void rule__Statement__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2570:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2571:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2572:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_6_4()); 
            }
            match(input,30,FOLLOW_30_in_rule__Statement__Group_6__4__Impl5282); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_6_4()); 
            }

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
    // $ANTLR end rule__Statement__Group_6__4__Impl


    // $ANTLR start rule__Statement__Group_6__5
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: rule__Statement__Group_6__5 : rule__Statement__Group_6__5__Impl ;
    public final void rule__Statement__Group_6__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: ( rule__Statement__Group_6__5__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:2: rule__Statement__Group_6__5__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__5__Impl_in_rule__Statement__Group_6__55313);
            rule__Statement__Group_6__5__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_6__5


    // $ANTLR start rule__Statement__Group_6__5__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2596:1: rule__Statement__Group_6__5__Impl : ( ( rule__Statement__StatementsAssignment_6_5 ) ) ;
    public final void rule__Statement__Group_6__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2600:1: ( ( ( rule__Statement__StatementsAssignment_6_5 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( ( rule__Statement__StatementsAssignment_6_5 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2601:1: ( ( rule__Statement__StatementsAssignment_6_5 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: ( rule__Statement__StatementsAssignment_6_5 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_6_5()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:1: ( rule__Statement__StatementsAssignment_6_5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2603:2: rule__Statement__StatementsAssignment_6_5
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_6_5_in_rule__Statement__Group_6__5__Impl5340);
            rule__Statement__StatementsAssignment_6_5();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsAssignment_6_5()); 
            }

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
    // $ANTLR end rule__Statement__Group_6__5__Impl


    // $ANTLR start rule__Statement__Group_7__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2625:1: rule__Statement__Group_7__0 : rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 ;
    public final void rule__Statement__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: ( rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2630:2: rule__Statement__Group_7__0__Impl rule__Statement__Group_7__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__05382);
            rule__Statement__Group_7__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__05385);
            rule__Statement__Group_7__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_7__0


    // $ANTLR start rule__Statement__Group_7__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: rule__Statement__Group_7__0__Impl : ( 'while' ) ;
    public final void rule__Statement__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2641:1: ( ( 'while' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( 'while' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2642:1: ( 'while' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2643:1: 'while'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getWhileKeyword_7_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Statement__Group_7__0__Impl5413); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getWhileKeyword_7_0()); 
            }

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
    // $ANTLR end rule__Statement__Group_7__0__Impl


    // $ANTLR start rule__Statement__Group_7__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2656:1: rule__Statement__Group_7__1 : rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 ;
    public final void rule__Statement__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2660:1: ( rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2661:2: rule__Statement__Group_7__1__Impl rule__Statement__Group_7__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__15444);
            rule__Statement__Group_7__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__15447);
            rule__Statement__Group_7__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_7__1


    // $ANTLR start rule__Statement__Group_7__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2668:1: rule__Statement__Group_7__1__Impl : ( ruleexpr ) ;
    public final void rule__Statement__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2672:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2674:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprParserRuleCall_7_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__Group_7__1__Impl5474);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprParserRuleCall_7_1()); 
            }

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
    // $ANTLR end rule__Statement__Group_7__1__Impl


    // $ANTLR start rule__Statement__Group_7__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: rule__Statement__Group_7__2 : rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3 ;
    public final void rule__Statement__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: ( rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:2: rule__Statement__Group_7__2__Impl rule__Statement__Group_7__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__25503);
            rule__Statement__Group_7__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_7__3_in_rule__Statement__Group_7__25506);
            rule__Statement__Group_7__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_7__2


    // $ANTLR start rule__Statement__Group_7__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2697:1: rule__Statement__Group_7__2__Impl : ( ':' ) ;
    public final void rule__Statement__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2701:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2702:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2703:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_7_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Statement__Group_7__2__Impl5534); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_7_2()); 
            }

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
    // $ANTLR end rule__Statement__Group_7__2__Impl


    // $ANTLR start rule__Statement__Group_7__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: rule__Statement__Group_7__3 : rule__Statement__Group_7__3__Impl ;
    public final void rule__Statement__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: ( rule__Statement__Group_7__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:2: rule__Statement__Group_7__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_7__3__Impl_in_rule__Statement__Group_7__35565);
            rule__Statement__Group_7__3__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Statement__Group_7__3


    // $ANTLR start rule__Statement__Group_7__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2727:1: rule__Statement__Group_7__3__Impl : ( ( rule__Statement__StatementsAssignment_7_3 ) ) ;
    public final void rule__Statement__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2731:1: ( ( ( rule__Statement__StatementsAssignment_7_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: ( ( rule__Statement__StatementsAssignment_7_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2732:1: ( ( rule__Statement__StatementsAssignment_7_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: ( rule__Statement__StatementsAssignment_7_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_7_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:1: ( rule__Statement__StatementsAssignment_7_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2734:2: rule__Statement__StatementsAssignment_7_3
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_7_3_in_rule__Statement__Group_7__3__Impl5592);
            rule__Statement__StatementsAssignment_7_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsAssignment_7_3()); 
            }

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
    // $ANTLR end rule__Statement__Group_7__3__Impl


    // $ANTLR start rule__FunctionCall__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2752:1: rule__FunctionCall__Group__0 : rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 ;
    public final void rule__FunctionCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: ( rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2757:2: rule__FunctionCall__Group__0__Impl rule__FunctionCall__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__05630);
            rule__FunctionCall__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__05633);
            rule__FunctionCall__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group__0


    // $ANTLR start rule__FunctionCall__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:1: rule__FunctionCall__Group__0__Impl : ( ( rule__FunctionCall__FunctionAssignment_0 ) ) ;
    public final void rule__FunctionCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: ( ( ( rule__FunctionCall__FunctionAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( ( rule__FunctionCall__FunctionAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( ( rule__FunctionCall__FunctionAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2770:1: ( rule__FunctionCall__FunctionAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:1: ( rule__FunctionCall__FunctionAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2771:2: rule__FunctionCall__FunctionAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionCall__FunctionAssignment_0_in_rule__FunctionCall__Group__0__Impl5660);
            rule__FunctionCall__FunctionAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionAssignment_0()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group__0__Impl


    // $ANTLR start rule__FunctionCall__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: rule__FunctionCall__Group__1 : rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 ;
    public final void rule__FunctionCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:1: ( rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2786:2: rule__FunctionCall__Group__1__Impl rule__FunctionCall__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__15690);
            rule__FunctionCall__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__15693);
            rule__FunctionCall__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group__1


    // $ANTLR start rule__FunctionCall__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2793:1: rule__FunctionCall__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__FunctionCall__Group__1__Impl5721); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_1()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group__1__Impl


    // $ANTLR start rule__FunctionCall__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2812:1: rule__FunctionCall__Group__2 : rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 ;
    public final void rule__FunctionCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:2: rule__FunctionCall__Group__2__Impl rule__FunctionCall__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__25752);
            rule__FunctionCall__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__25755);
            rule__FunctionCall__Group__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group__2


    // $ANTLR start rule__FunctionCall__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: rule__FunctionCall__Group__2__Impl : ( ( rule__FunctionCall__Group_2__0 )? ) ;
    public final void rule__FunctionCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2828:1: ( ( ( rule__FunctionCall__Group_2__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: ( ( rule__FunctionCall__Group_2__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2829:1: ( ( rule__FunctionCall__Group_2__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2830:1: ( rule__FunctionCall__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:1: ( rule__FunctionCall__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||(LA19_0>=24 && LA19_0<=25)||LA19_0==28||LA19_0==43||(LA19_0>=48 && LA19_0<=49)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2831:2: rule__FunctionCall__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__FunctionCall__Group_2__0_in_rule__FunctionCall__Group__2__Impl5782);
                    rule__FunctionCall__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_2()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group__2__Impl


    // $ANTLR start rule__FunctionCall__Group__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2841:1: rule__FunctionCall__Group__3 : rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 ;
    public final void rule__FunctionCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2845:1: ( rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2846:2: rule__FunctionCall__Group__3__Impl rule__FunctionCall__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__35813);
            rule__FunctionCall__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__35816);
            rule__FunctionCall__Group__4();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group__3


    // $ANTLR start rule__FunctionCall__Group__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: rule__FunctionCall__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2857:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2858:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__FunctionCall__Group__3__Impl5844); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_3()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group__3__Impl


    // $ANTLR start rule__FunctionCall__Group__4
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: rule__FunctionCall__Group__4 : rule__FunctionCall__Group__4__Impl ;
    public final void rule__FunctionCall__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( rule__FunctionCall__Group__4__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:2: rule__FunctionCall__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__45875);
            rule__FunctionCall__Group__4__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group__4


    // $ANTLR start rule__FunctionCall__Group__4__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: rule__FunctionCall__Group__4__Impl : ( ruleendExpr ) ;
    public final void rule__FunctionCall__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getEndExprParserRuleCall_4()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__FunctionCall__Group__4__Impl5902);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getEndExprParserRuleCall_4()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group__4__Impl


    // $ANTLR start rule__FunctionCall__Group_2__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: rule__FunctionCall__Group_2__0 : rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 ;
    public final void rule__FunctionCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2914:1: ( rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:2: rule__FunctionCall__Group_2__0__Impl rule__FunctionCall__Group_2__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_2__0__Impl_in_rule__FunctionCall__Group_2__05941);
            rule__FunctionCall__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group_2__1_in_rule__FunctionCall__Group_2__05944);
            rule__FunctionCall__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group_2__0


    // $ANTLR start rule__FunctionCall__Group_2__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: rule__FunctionCall__Group_2__0__Impl : ( ( rule__FunctionCall__ExprsAssignment_2_0 ) ) ;
    public final void rule__FunctionCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2926:1: ( ( ( rule__FunctionCall__ExprsAssignment_2_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__FunctionCall__ExprsAssignment_2_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2927:1: ( ( rule__FunctionCall__ExprsAssignment_2_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: ( rule__FunctionCall__ExprsAssignment_2_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getExprsAssignment_2_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:1: ( rule__FunctionCall__ExprsAssignment_2_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2929:2: rule__FunctionCall__ExprsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__FunctionCall__ExprsAssignment_2_0_in_rule__FunctionCall__Group_2__0__Impl5971);
            rule__FunctionCall__ExprsAssignment_2_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getExprsAssignment_2_0()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group_2__0__Impl


    // $ANTLR start rule__FunctionCall__Group_2__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: rule__FunctionCall__Group_2__1 : rule__FunctionCall__Group_2__1__Impl ;
    public final void rule__FunctionCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( rule__FunctionCall__Group_2__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:2: rule__FunctionCall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_2__1__Impl_in_rule__FunctionCall__Group_2__16001);
            rule__FunctionCall__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group_2__1


    // $ANTLR start rule__FunctionCall__Group_2__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2950:1: rule__FunctionCall__Group_2__1__Impl : ( ( rule__FunctionCall__Group_2_1__0 )* ) ;
    public final void rule__FunctionCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( ( ( rule__FunctionCall__Group_2_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( ( rule__FunctionCall__Group_2_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2956:1: ( rule__FunctionCall__Group_2_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:1: ( rule__FunctionCall__Group_2_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==26) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2957:2: rule__FunctionCall__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FunctionCall__Group_2_1__0_in_rule__FunctionCall__Group_2__1__Impl6028);
            	    rule__FunctionCall__Group_2_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getGroup_2_1()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group_2__1__Impl


    // $ANTLR start rule__FunctionCall__Group_2_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2971:1: rule__FunctionCall__Group_2_1__0 : rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 ;
    public final void rule__FunctionCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2975:1: ( rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2976:2: rule__FunctionCall__Group_2_1__0__Impl rule__FunctionCall__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_2_1__0__Impl_in_rule__FunctionCall__Group_2_1__06063);
            rule__FunctionCall__Group_2_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionCall__Group_2_1__1_in_rule__FunctionCall__Group_2_1__06066);
            rule__FunctionCall__Group_2_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group_2_1__0


    // $ANTLR start rule__FunctionCall__Group_2_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2983:1: rule__FunctionCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__FunctionCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: ( ( ',' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: ( ',' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2988:1: ( ',' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2989:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__FunctionCall__Group_2_1__0__Impl6094); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getCommaKeyword_2_1_0()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group_2_1__0__Impl


    // $ANTLR start rule__FunctionCall__Group_2_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: rule__FunctionCall__Group_2_1__1 : rule__FunctionCall__Group_2_1__1__Impl ;
    public final void rule__FunctionCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3006:1: ( rule__FunctionCall__Group_2_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3007:2: rule__FunctionCall__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionCall__Group_2_1__1__Impl_in_rule__FunctionCall__Group_2_1__16125);
            rule__FunctionCall__Group_2_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__FunctionCall__Group_2_1__1


    // $ANTLR start rule__FunctionCall__Group_2_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3013:1: rule__FunctionCall__Group_2_1__1__Impl : ( ( rule__FunctionCall__ExprsAssignment_2_1_1 ) ) ;
    public final void rule__FunctionCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3017:1: ( ( ( rule__FunctionCall__ExprsAssignment_2_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: ( ( rule__FunctionCall__ExprsAssignment_2_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3018:1: ( ( rule__FunctionCall__ExprsAssignment_2_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3019:1: ( rule__FunctionCall__ExprsAssignment_2_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getExprsAssignment_2_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3020:1: ( rule__FunctionCall__ExprsAssignment_2_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3020:2: rule__FunctionCall__ExprsAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__FunctionCall__ExprsAssignment_2_1_1_in_rule__FunctionCall__Group_2_1__1__Impl6152);
            rule__FunctionCall__ExprsAssignment_2_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getExprsAssignment_2_1_1()); 
            }

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
    // $ANTLR end rule__FunctionCall__Group_2_1__1__Impl


    // $ANTLR start rule__Declaration__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3038:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3039:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__06186);
            rule__Declaration__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__06189);
            rule__Declaration__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Declaration__Group__0


    // $ANTLR start rule__Declaration__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: rule__Declaration__Group__0__Impl : ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3050:1: ( ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3051:1: ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3052:1: ( ( rule__Declaration__Group_0__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3053:1: ( rule__Declaration__Group_0__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:1: ( rule__Declaration__Group_0__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:2: rule__Declaration__Group_0__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl6218);
            rule__Declaration__Group_0__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3057:1: ( ( rule__Declaration__Group_0__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:1: ( rule__Declaration__Group_0__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:1: ( rule__Declaration__Group_0__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=12 && LA21_0<=14)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:2: rule__Declaration__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl6230);
            	    rule__Declaration__Group_0__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }

            }


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
    // $ANTLR end rule__Declaration__Group__0__Impl


    // $ANTLR start rule__Declaration__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3074:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__16263);
            rule__Declaration__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__16266);
            rule__Declaration__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Declaration__Group__1


    // $ANTLR start rule__Declaration__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3082:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3086:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3087:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3088:1: ( rule__Declaration__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:1: ( rule__Declaration__NameAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl6293);
            rule__Declaration__NameAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end rule__Declaration__Group__1__Impl


    // $ANTLR start rule__Declaration__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3099:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( rule__Declaration__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3104:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__26323);
            rule__Declaration__Group__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Declaration__Group__2


    // $ANTLR start rule__Declaration__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__Group_2__0 )? ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3114:1: ( ( ( rule__Declaration__Group_2__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( ( rule__Declaration__Group_2__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3115:1: ( ( rule__Declaration__Group_2__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3116:1: ( rule__Declaration__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:1: ( rule__Declaration__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==40) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3117:2: rule__Declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl6350);
                    rule__Declaration__Group_2__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getGroup_2()); 
            }

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
    // $ANTLR end rule__Declaration__Group__2__Impl


    // $ANTLR start rule__Declaration__Group_0__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3133:1: rule__Declaration__Group_0__0 : rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 ;
    public final void rule__Declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ( rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3138:2: rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__06387);
            rule__Declaration__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__06390);
            rule__Declaration__Group_0__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Declaration__Group_0__0


    // $ANTLR start rule__Declaration__Group_0__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3145:1: rule__Declaration__Group_0__0__Impl : ( ( rule__Declaration__VariableTypeAssignment_0_0 ) ) ;
    public final void rule__Declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3149:1: ( ( ( rule__Declaration__VariableTypeAssignment_0_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ( rule__Declaration__VariableTypeAssignment_0_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3150:1: ( ( rule__Declaration__VariableTypeAssignment_0_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3151:1: ( rule__Declaration__VariableTypeAssignment_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getVariableTypeAssignment_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:1: ( rule__Declaration__VariableTypeAssignment_0_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:2: rule__Declaration__VariableTypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Declaration__VariableTypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl6417);
            rule__Declaration__VariableTypeAssignment_0_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getVariableTypeAssignment_0_0()); 
            }

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
    // $ANTLR end rule__Declaration__Group_0__0__Impl


    // $ANTLR start rule__Declaration__Group_0__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3162:1: rule__Declaration__Group_0__1 : rule__Declaration__Group_0__1__Impl ;
    public final void rule__Declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( rule__Declaration__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3167:2: rule__Declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__16447);
            rule__Declaration__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Declaration__Group_0__1


    // $ANTLR start rule__Declaration__Group_0__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: rule__Declaration__Group_0__1__Impl : ( ( '[]' )? ) ;
    public final void rule__Declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3177:1: ( ( ( '[]' )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( ( '[]' )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3178:1: ( ( '[]' )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3179:1: ( '[]' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getLeftSquareBracketRightSquareBracketKeyword_0_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: ( '[]' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==39) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3181:2: '[]'
                    {
                    match(input,39,FOLLOW_39_in_rule__Declaration__Group_0__1__Impl6476); if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getLeftSquareBracketRightSquareBracketKeyword_0_1()); 
            }

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
    // $ANTLR end rule__Declaration__Group_0__1__Impl


    // $ANTLR start rule__Declaration__Group_2__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3200:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3201:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__06513);
            rule__Declaration__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__06516);
            rule__Declaration__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Declaration__Group_2__0


    // $ANTLR start rule__Declaration__Group_2__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3208:1: rule__Declaration__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3212:1: ( ( '=' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: ( '=' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3213:1: ( '=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3214:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Declaration__Group_2__0__Impl6544); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0()); 
            }

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
    // $ANTLR end rule__Declaration__Group_2__0__Impl


    // $ANTLR start rule__Declaration__Group_2__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: ( rule__Declaration__Group_2__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:2: rule__Declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__16575);
            rule__Declaration__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Declaration__Group_2__1


    // $ANTLR start rule__Declaration__Group_2__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3238:1: rule__Declaration__Group_2__1__Impl : ( ( rule__Declaration__ExprsAssignment_2_1 ) ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3242:1: ( ( ( rule__Declaration__ExprsAssignment_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: ( ( rule__Declaration__ExprsAssignment_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: ( ( rule__Declaration__ExprsAssignment_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3244:1: ( rule__Declaration__ExprsAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getExprsAssignment_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:1: ( rule__Declaration__ExprsAssignment_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3245:2: rule__Declaration__ExprsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Declaration__ExprsAssignment_2_1_in_rule__Declaration__Group_2__1__Impl6602);
            rule__Declaration__ExprsAssignment_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getExprsAssignment_2_1()); 
            }

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
    // $ANTLR end rule__Declaration__Group_2__1__Impl


    // $ANTLR start rule__Assignment__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3263:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__06636);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__06639);
            rule__Assignment__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Assignment__Group__0


    // $ANTLR start rule__Assignment__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3271:1: rule__Assignment__Group__0__Impl : ( rulepostfixExpr ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3275:1: ( ( rulepostfixExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ( rulepostfixExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ( rulepostfixExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:1: rulepostfixExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getPostfixExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_rule__Assignment__Group__0__Impl6666);
            rulepostfixExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getPostfixExprParserRuleCall_0()); 
            }

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
    // $ANTLR end rule__Assignment__Group__0__Impl


    // $ANTLR start rule__Assignment__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3292:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3293:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__16695);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__16698);
            rule__Assignment__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Assignment__Group__1


    // $ANTLR start rule__Assignment__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3300:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: ( ( '=' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:1: ( '=' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3305:1: ( '=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3306:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,40,FOLLOW_40_in_rule__Assignment__Group__1__Impl6726); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }

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
    // $ANTLR end rule__Assignment__Group__1__Impl


    // $ANTLR start rule__Assignment__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3319:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3323:1: ( rule__Assignment__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3324:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__26757);
            rule__Assignment__Group__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Assignment__Group__2


    // $ANTLR start rule__Assignment__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3330:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExprsAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3334:1: ( ( ( rule__Assignment__ExprsAssignment_2 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( ( rule__Assignment__ExprsAssignment_2 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: ( ( rule__Assignment__ExprsAssignment_2 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3336:1: ( rule__Assignment__ExprsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExprsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:1: ( rule__Assignment__ExprsAssignment_2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3337:2: rule__Assignment__ExprsAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExprsAssignment_2_in_rule__Assignment__Group__2__Impl6784);
            rule__Assignment__ExprsAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExprsAssignment_2()); 
            }

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
    // $ANTLR end rule__Assignment__Group__2__Impl


    // $ANTLR start rule__Expr__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3353:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__06820);
            rule__Expr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__06823);
            rule__Expr__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Expr__Group__0


    // $ANTLR start rule__Expr__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3365:1: rule__Expr__Group__0__Impl : ( ruleandExpr ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3369:1: ( ( ruleandExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: ( ruleandExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3370:1: ( ruleandExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ruleandExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_rule__Expr__Group__0__Impl6850);
            ruleandExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAndExprParserRuleCall_0()); 
            }

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
    // $ANTLR end rule__Expr__Group__0__Impl


    // $ANTLR start rule__Expr__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3382:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3386:1: ( rule__Expr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3387:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__16879);
            rule__Expr__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Expr__Group__1


    // $ANTLR start rule__Expr__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3393:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3397:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3398:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3398:1: ( ( rule__Expr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3399:1: ( rule__Expr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( rule__Expr__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==41) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl6906);
            	    rule__Expr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getExprAccess().getGroup_1()); 
            }

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
    // $ANTLR end rule__Expr__Group__1__Impl


    // $ANTLR start rule__Expr__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__06941);
            rule__Expr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__06944);
            rule__Expr__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Expr__Group_1__0


    // $ANTLR start rule__Expr__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3426:1: rule__Expr__Group_1__0__Impl : ( '||' ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3430:1: ( ( '||' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: ( '||' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3431:1: ( '||' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: '||'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Expr__Group_1__0__Impl6972); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            }

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
    // $ANTLR end rule__Expr__Group_1__0__Impl


    // $ANTLR start rule__Expr__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:1: ( rule__Expr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__17003);
            rule__Expr__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Expr__Group_1__1


    // $ANTLR start rule__Expr__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3456:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__AndExprsAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3460:1: ( ( ( rule__Expr__AndExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: ( ( rule__Expr__AndExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: ( ( rule__Expr__AndExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: ( rule__Expr__AndExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:1: ( rule__Expr__AndExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3463:2: rule__Expr__AndExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__AndExprsAssignment_1_1_in_rule__Expr__Group_1__1__Impl7030);
            rule__Expr__AndExprsAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAndExprsAssignment_1_1()); 
            }

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
    // $ANTLR end rule__Expr__Group_1__1__Impl


    // $ANTLR start rule__AndExpr__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3481:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3482:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__07064);
            rule__AndExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__07067);
            rule__AndExpr__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AndExpr__Group__0


    // $ANTLR start rule__AndExpr__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: rule__AndExpr__Group__0__Impl : ( ruleeqExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: ( ( ruleeqExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: ( ruleeqExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: ( ruleeqExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3495:1: ruleeqExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_rule__AndExpr__Group__0__Impl7094);
            ruleeqExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_0()); 
            }

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
    // $ANTLR end rule__AndExpr__Group__0__Impl


    // $ANTLR start rule__AndExpr__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( rule__AndExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__17123);
            rule__AndExpr__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AndExpr__Group__1


    // $ANTLR start rule__AndExpr__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3517:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3521:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: ( rule__AndExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:1: ( rule__AndExpr__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3524:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl7150);
            	    rule__AndExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getGroup_1()); 
            }

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
    // $ANTLR end rule__AndExpr__Group__1__Impl


    // $ANTLR start rule__AndExpr__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3542:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3543:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__07185);
            rule__AndExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__07188);
            rule__AndExpr__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AndExpr__Group_1__0


    // $ANTLR start rule__AndExpr__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3550:1: rule__AndExpr__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: ( ( '&&' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( '&&' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: ( '&&' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3556:1: '&&'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__AndExpr__Group_1__0__Impl7216); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_0()); 
            }

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
    // $ANTLR end rule__AndExpr__Group_1__0__Impl


    // $ANTLR start rule__AndExpr__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: ( rule__AndExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3574:2: rule__AndExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__17247);
            rule__AndExpr__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AndExpr__Group_1__1


    // $ANTLR start rule__AndExpr__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3580:1: rule__AndExpr__Group_1__1__Impl : ( ( rule__AndExpr__EqExprsAssignment_1_1 ) ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:1: ( ( ( rule__AndExpr__EqExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( ( rule__AndExpr__EqExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3585:1: ( ( rule__AndExpr__EqExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3586:1: ( rule__AndExpr__EqExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:1: ( rule__AndExpr__EqExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3587:2: rule__AndExpr__EqExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpr__EqExprsAssignment_1_1_in_rule__AndExpr__Group_1__1__Impl7274);
            rule__AndExpr__EqExprsAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getEqExprsAssignment_1_1()); 
            }

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
    // $ANTLR end rule__AndExpr__Group_1__1__Impl


    // $ANTLR start rule__EqExpr__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: rule__EqExpr__Group__0 : rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1 ;
    public final void rule__EqExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3605:1: ( rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3606:2: rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1
            {
            pushFollow(FOLLOW_rule__EqExpr__Group__0__Impl_in_rule__EqExpr__Group__07308);
            rule__EqExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EqExpr__Group__1_in_rule__EqExpr__Group__07311);
            rule__EqExpr__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__EqExpr__Group__0


    // $ANTLR start rule__EqExpr__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3613:1: rule__EqExpr__Group__0__Impl : ( rulerelExpr ) ;
    public final void rule__EqExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3617:1: ( ( rulerelExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ( rulerelExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3618:1: ( rulerelExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3619:1: rulerelExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_rule__EqExpr__Group__0__Impl7338);
            rulerelExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_0()); 
            }

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
    // $ANTLR end rule__EqExpr__Group__0__Impl


    // $ANTLR start rule__EqExpr__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3630:1: rule__EqExpr__Group__1 : rule__EqExpr__Group__1__Impl ;
    public final void rule__EqExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: ( rule__EqExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3635:2: rule__EqExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EqExpr__Group__1__Impl_in_rule__EqExpr__Group__17367);
            rule__EqExpr__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__EqExpr__Group__1


    // $ANTLR start rule__EqExpr__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3641:1: rule__EqExpr__Group__1__Impl : ( ( rule__EqExpr__Group_1__0 )* ) ;
    public final void rule__EqExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: ( ( ( rule__EqExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: ( ( rule__EqExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3646:1: ( ( rule__EqExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3647:1: ( rule__EqExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:1: ( rule__EqExpr__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=15 && LA26_0<=16)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3648:2: rule__EqExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EqExpr__Group_1__0_in_rule__EqExpr__Group__1__Impl7394);
            	    rule__EqExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getEqExprAccess().getGroup_1()); 
            }

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
    // $ANTLR end rule__EqExpr__Group__1__Impl


    // $ANTLR start rule__EqExpr__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: rule__EqExpr__Group_1__0 : rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1 ;
    public final void rule__EqExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3666:1: ( rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3667:2: rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__EqExpr__Group_1__0__Impl_in_rule__EqExpr__Group_1__07429);
            rule__EqExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EqExpr__Group_1__1_in_rule__EqExpr__Group_1__07432);
            rule__EqExpr__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__EqExpr__Group_1__0


    // $ANTLR start rule__EqExpr__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3674:1: rule__EqExpr__Group_1__0__Impl : ( ( rule__EqExpr__Alternatives_1_0 ) ) ;
    public final void rule__EqExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3678:1: ( ( ( rule__EqExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( ( rule__EqExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3679:1: ( ( rule__EqExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3680:1: ( rule__EqExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( rule__EqExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:2: rule__EqExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EqExpr__Alternatives_1_0_in_rule__EqExpr__Group_1__0__Impl7459);
            rule__EqExpr__Alternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEqExprAccess().getAlternatives_1_0()); 
            }

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
    // $ANTLR end rule__EqExpr__Group_1__0__Impl


    // $ANTLR start rule__EqExpr__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3691:1: rule__EqExpr__Group_1__1 : rule__EqExpr__Group_1__1__Impl ;
    public final void rule__EqExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( rule__EqExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:2: rule__EqExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EqExpr__Group_1__1__Impl_in_rule__EqExpr__Group_1__17489);
            rule__EqExpr__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__EqExpr__Group_1__1


    // $ANTLR start rule__EqExpr__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3702:1: rule__EqExpr__Group_1__1__Impl : ( ( rule__EqExpr__RelExprsAssignment_1_1 ) ) ;
    public final void rule__EqExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: ( ( ( rule__EqExpr__RelExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( ( rule__EqExpr__RelExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3707:1: ( ( rule__EqExpr__RelExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3708:1: ( rule__EqExpr__RelExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:1: ( rule__EqExpr__RelExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3709:2: rule__EqExpr__RelExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EqExpr__RelExprsAssignment_1_1_in_rule__EqExpr__Group_1__1__Impl7516);
            rule__EqExpr__RelExprsAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getEqExprAccess().getRelExprsAssignment_1_1()); 
            }

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
    // $ANTLR end rule__EqExpr__Group_1__1__Impl


    // $ANTLR start rule__RelExpr__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: rule__RelExpr__Group__0 : rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1 ;
    public final void rule__RelExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3727:1: ( rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3728:2: rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1
            {
            pushFollow(FOLLOW_rule__RelExpr__Group__0__Impl_in_rule__RelExpr__Group__07550);
            rule__RelExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__RelExpr__Group__1_in_rule__RelExpr__Group__07553);
            rule__RelExpr__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__RelExpr__Group__0


    // $ANTLR start rule__RelExpr__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3735:1: rule__RelExpr__Group__0__Impl : ( ruleaddExpr ) ;
    public final void rule__RelExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3739:1: ( ( ruleaddExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( ruleaddExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3740:1: ( ruleaddExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3741:1: ruleaddExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rule__RelExpr__Group__0__Impl7580);
            ruleaddExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0()); 
            }

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
    // $ANTLR end rule__RelExpr__Group__0__Impl


    // $ANTLR start rule__RelExpr__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: rule__RelExpr__Group__1 : rule__RelExpr__Group__1__Impl ;
    public final void rule__RelExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( rule__RelExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:2: rule__RelExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelExpr__Group__1__Impl_in_rule__RelExpr__Group__17609);
            rule__RelExpr__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__RelExpr__Group__1


    // $ANTLR start rule__RelExpr__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3763:1: rule__RelExpr__Group__1__Impl : ( ( rule__RelExpr__Group_1__0 )* ) ;
    public final void rule__RelExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: ( ( ( rule__RelExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ( rule__RelExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3768:1: ( ( rule__RelExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3769:1: ( rule__RelExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:1: ( rule__RelExpr__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=17 && LA27_0<=20)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3770:2: rule__RelExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RelExpr__Group_1__0_in_rule__RelExpr__Group__1__Impl7636);
            	    rule__RelExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getGroup_1()); 
            }

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
    // $ANTLR end rule__RelExpr__Group__1__Impl


    // $ANTLR start rule__RelExpr__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: rule__RelExpr__Group_1__0 : rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1 ;
    public final void rule__RelExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3788:1: ( rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3789:2: rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__RelExpr__Group_1__0__Impl_in_rule__RelExpr__Group_1__07671);
            rule__RelExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__RelExpr__Group_1__1_in_rule__RelExpr__Group_1__07674);
            rule__RelExpr__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__RelExpr__Group_1__0


    // $ANTLR start rule__RelExpr__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3796:1: rule__RelExpr__Group_1__0__Impl : ( ( rule__RelExpr__Alternatives_1_0 ) ) ;
    public final void rule__RelExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3800:1: ( ( ( rule__RelExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ( rule__RelExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3801:1: ( ( rule__RelExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3802:1: ( rule__RelExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: ( rule__RelExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:2: rule__RelExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__RelExpr__Alternatives_1_0_in_rule__RelExpr__Group_1__0__Impl7701);
            rule__RelExpr__Alternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getAlternatives_1_0()); 
            }

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
    // $ANTLR end rule__RelExpr__Group_1__0__Impl


    // $ANTLR start rule__RelExpr__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3813:1: rule__RelExpr__Group_1__1 : rule__RelExpr__Group_1__1__Impl ;
    public final void rule__RelExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: ( rule__RelExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3818:2: rule__RelExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RelExpr__Group_1__1__Impl_in_rule__RelExpr__Group_1__17731);
            rule__RelExpr__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__RelExpr__Group_1__1


    // $ANTLR start rule__RelExpr__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3824:1: rule__RelExpr__Group_1__1__Impl : ( ( rule__RelExpr__AddExprAssignment_1_1 ) ) ;
    public final void rule__RelExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:1: ( ( ( rule__RelExpr__AddExprAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: ( ( rule__RelExpr__AddExprAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3829:1: ( ( rule__RelExpr__AddExprAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:1: ( rule__RelExpr__AddExprAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:1: ( rule__RelExpr__AddExprAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3831:2: rule__RelExpr__AddExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RelExpr__AddExprAssignment_1_1_in_rule__RelExpr__Group_1__1__Impl7758);
            rule__RelExpr__AddExprAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getAddExprAssignment_1_1()); 
            }

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
    // $ANTLR end rule__RelExpr__Group_1__1__Impl


    // $ANTLR start rule__AddExpr__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:1: rule__AddExpr__Group__0 : rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1 ;
    public final void rule__AddExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3849:1: ( rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3850:2: rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AddExpr__Group__0__Impl_in_rule__AddExpr__Group__07792);
            rule__AddExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpr__Group__1_in_rule__AddExpr__Group__07795);
            rule__AddExpr__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AddExpr__Group__0


    // $ANTLR start rule__AddExpr__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3857:1: rule__AddExpr__Group__0__Impl : ( rulemulExpr ) ;
    public final void rule__AddExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3861:1: ( ( rulemulExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( rulemulExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: ( rulemulExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3863:1: rulemulExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_rule__AddExpr__Group__0__Impl7822);
            rulemulExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0()); 
            }

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
    // $ANTLR end rule__AddExpr__Group__0__Impl


    // $ANTLR start rule__AddExpr__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3874:1: rule__AddExpr__Group__1 : rule__AddExpr__Group__1__Impl ;
    public final void rule__AddExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: ( rule__AddExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:2: rule__AddExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpr__Group__1__Impl_in_rule__AddExpr__Group__17851);
            rule__AddExpr__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AddExpr__Group__1


    // $ANTLR start rule__AddExpr__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3885:1: rule__AddExpr__Group__1__Impl : ( ( rule__AddExpr__Group_1__0 )* ) ;
    public final void rule__AddExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3889:1: ( ( ( rule__AddExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:1: ( ( rule__AddExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:1: ( ( rule__AddExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:1: ( rule__AddExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:1: ( rule__AddExpr__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_SIGN) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3892:2: rule__AddExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExpr__Group_1__0_in_rule__AddExpr__Group__1__Impl7878);
            	    rule__AddExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getGroup_1()); 
            }

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
    // $ANTLR end rule__AddExpr__Group__1__Impl


    // $ANTLR start rule__AddExpr__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3906:1: rule__AddExpr__Group_1__0 : rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1 ;
    public final void rule__AddExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:2: rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExpr__Group_1__0__Impl_in_rule__AddExpr__Group_1__07913);
            rule__AddExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpr__Group_1__1_in_rule__AddExpr__Group_1__07916);
            rule__AddExpr__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AddExpr__Group_1__0


    // $ANTLR start rule__AddExpr__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: rule__AddExpr__Group_1__0__Impl : ( RULE_SIGN ) ;
    public final void rule__AddExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( ( RULE_SIGN ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( RULE_SIGN )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:1: ( RULE_SIGN )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3924:1: RULE_SIGN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getSignTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_rule__AddExpr__Group_1__0__Impl7943); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getSignTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end rule__AddExpr__Group_1__0__Impl


    // $ANTLR start rule__AddExpr__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: rule__AddExpr__Group_1__1 : rule__AddExpr__Group_1__1__Impl ;
    public final void rule__AddExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: ( rule__AddExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:2: rule__AddExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpr__Group_1__1__Impl_in_rule__AddExpr__Group_1__17972);
            rule__AddExpr__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__AddExpr__Group_1__1


    // $ANTLR start rule__AddExpr__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3946:1: rule__AddExpr__Group_1__1__Impl : ( ( rule__AddExpr__MulExprsAssignment_1_1 ) ) ;
    public final void rule__AddExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3950:1: ( ( ( rule__AddExpr__MulExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: ( ( rule__AddExpr__MulExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: ( ( rule__AddExpr__MulExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3952:1: ( rule__AddExpr__MulExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:1: ( rule__AddExpr__MulExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:2: rule__AddExpr__MulExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExpr__MulExprsAssignment_1_1_in_rule__AddExpr__Group_1__1__Impl7999);
            rule__AddExpr__MulExprsAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getMulExprsAssignment_1_1()); 
            }

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
    // $ANTLR end rule__AddExpr__Group_1__1__Impl


    // $ANTLR start rule__MulExpr__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:1: rule__MulExpr__Group__0 : rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1 ;
    public final void rule__MulExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3971:1: ( rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3972:2: rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1
            {
            pushFollow(FOLLOW_rule__MulExpr__Group__0__Impl_in_rule__MulExpr__Group__08033);
            rule__MulExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MulExpr__Group__1_in_rule__MulExpr__Group__08036);
            rule__MulExpr__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MulExpr__Group__0


    // $ANTLR start rule__MulExpr__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3979:1: rule__MulExpr__Group__0__Impl : ( ( rule__MulExpr__AtomsAssignment_0 ) ) ;
    public final void rule__MulExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3983:1: ( ( ( rule__MulExpr__AtomsAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:1: ( ( rule__MulExpr__AtomsAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3984:1: ( ( rule__MulExpr__AtomsAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3985:1: ( rule__MulExpr__AtomsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:1: ( rule__MulExpr__AtomsAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3986:2: rule__MulExpr__AtomsAssignment_0
            {
            pushFollow(FOLLOW_rule__MulExpr__AtomsAssignment_0_in_rule__MulExpr__Group__0__Impl8063);
            rule__MulExpr__AtomsAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getAtomsAssignment_0()); 
            }

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
    // $ANTLR end rule__MulExpr__Group__0__Impl


    // $ANTLR start rule__MulExpr__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:1: rule__MulExpr__Group__1 : rule__MulExpr__Group__1__Impl ;
    public final void rule__MulExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4000:1: ( rule__MulExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:2: rule__MulExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulExpr__Group__1__Impl_in_rule__MulExpr__Group__18093);
            rule__MulExpr__Group__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MulExpr__Group__1


    // $ANTLR start rule__MulExpr__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: rule__MulExpr__Group__1__Impl : ( ( rule__MulExpr__Group_1__0 )* ) ;
    public final void rule__MulExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: ( ( ( rule__MulExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4012:1: ( ( rule__MulExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4012:1: ( ( rule__MulExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4013:1: ( rule__MulExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4014:1: ( rule__MulExpr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=21 && LA29_0<=23)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4014:2: rule__MulExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulExpr__Group_1__0_in_rule__MulExpr__Group__1__Impl8120);
            	    rule__MulExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getGroup_1()); 
            }

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
    // $ANTLR end rule__MulExpr__Group__1__Impl


    // $ANTLR start rule__MulExpr__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4028:1: rule__MulExpr__Group_1__0 : rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 ;
    public final void rule__MulExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: ( rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4033:2: rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulExpr__Group_1__0__Impl_in_rule__MulExpr__Group_1__08155);
            rule__MulExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MulExpr__Group_1__1_in_rule__MulExpr__Group_1__08158);
            rule__MulExpr__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MulExpr__Group_1__0


    // $ANTLR start rule__MulExpr__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4040:1: rule__MulExpr__Group_1__0__Impl : ( ( rule__MulExpr__Alternatives_1_0 ) ) ;
    public final void rule__MulExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4044:1: ( ( ( rule__MulExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:1: ( ( rule__MulExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:1: ( ( rule__MulExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4046:1: ( rule__MulExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:1: ( rule__MulExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4047:2: rule__MulExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__MulExpr__Alternatives_1_0_in_rule__MulExpr__Group_1__0__Impl8185);
            rule__MulExpr__Alternatives_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getAlternatives_1_0()); 
            }

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
    // $ANTLR end rule__MulExpr__Group_1__0__Impl


    // $ANTLR start rule__MulExpr__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:1: rule__MulExpr__Group_1__1 : rule__MulExpr__Group_1__1__Impl ;
    public final void rule__MulExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( rule__MulExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:2: rule__MulExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MulExpr__Group_1__1__Impl_in_rule__MulExpr__Group_1__18215);
            rule__MulExpr__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__MulExpr__Group_1__1


    // $ANTLR start rule__MulExpr__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4068:1: rule__MulExpr__Group_1__1__Impl : ( ( rule__MulExpr__AtomsAssignment_1_1 ) ) ;
    public final void rule__MulExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4072:1: ( ( ( rule__MulExpr__AtomsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: ( ( rule__MulExpr__AtomsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4073:1: ( ( rule__MulExpr__AtomsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4074:1: ( rule__MulExpr__AtomsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:1: ( rule__MulExpr__AtomsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4075:2: rule__MulExpr__AtomsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulExpr__AtomsAssignment_1_1_in_rule__MulExpr__Group_1__1__Impl8242);
            rule__MulExpr__AtomsAssignment_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getAtomsAssignment_1_1()); 
            }

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
    // $ANTLR end rule__MulExpr__Group_1__1__Impl


    // $ANTLR start rule__Atom__Group_0__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: rule__Atom__Group_0__0 : rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1 ;
    public final void rule__Atom__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ( rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:2: rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_0__0__Impl_in_rule__Atom__Group_0__08276);
            rule__Atom__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_0__1_in_rule__Atom__Group_0__08279);
            rule__Atom__Group_0__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_0__0


    // $ANTLR start rule__Atom__Group_0__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: rule__Atom__Group_0__0__Impl : ( '!' ) ;
    public final void rule__Atom__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4105:1: ( ( '!' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( '!' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: ( '!' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4107:1: '!'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExclamationMarkKeyword_0_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__Atom__Group_0__0__Impl8307); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getExclamationMarkKeyword_0_0()); 
            }

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
    // $ANTLR end rule__Atom__Group_0__0__Impl


    // $ANTLR start rule__Atom__Group_0__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: rule__Atom__Group_0__1 : rule__Atom__Group_0__1__Impl ;
    public final void rule__Atom__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4124:1: ( rule__Atom__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4125:2: rule__Atom__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_0__1__Impl_in_rule__Atom__Group_0__18338);
            rule__Atom__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_0__1


    // $ANTLR start rule__Atom__Group_0__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: rule__Atom__Group_0__1__Impl : ( ruleatom ) ;
    public final void rule__Atom__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4135:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4136:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4137:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAtomParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__Atom__Group_0__1__Impl8365);
            ruleatom();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getAtomParserRuleCall_0_1()); 
            }

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
    // $ANTLR end rule__Atom__Group_0__1__Impl


    // $ANTLR start rule__Atom__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4156:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__08398);
            rule__Atom__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__08401);
            rule__Atom__Group_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_1__0


    // $ANTLR start rule__Atom__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4164:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4168:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4169:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4170:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Atom__Group_1__0__Impl8429); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }

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
    // $ANTLR end rule__Atom__Group_1__0__Impl


    // $ANTLR start rule__Atom__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__18460);
            rule__Atom__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__18463);
            rule__Atom__Group_1__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_1__1


    // $ANTLR start rule__Atom__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: rule__Atom__Group_1__1__Impl : ( RULE_SIGN ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4199:1: ( ( RULE_SIGN ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4200:1: ( RULE_SIGN )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4200:1: ( RULE_SIGN )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4201:1: RULE_SIGN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getSignTerminalRuleCall_1_1()); 
            }
            match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_rule__Atom__Group_1__1__Impl8490); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getSignTerminalRuleCall_1_1()); 
            }

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
    // $ANTLR end rule__Atom__Group_1__1__Impl


    // $ANTLR start rule__Atom__Group_1__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4212:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: ( rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4217:2: rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__28519);
            rule__Atom__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__3_in_rule__Atom__Group_1__28522);
            rule__Atom__Group_1__3();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_1__2


    // $ANTLR start rule__Atom__Group_1__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4224:1: rule__Atom__Group_1__2__Impl : ( ruleexpr ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4228:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4229:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4230:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExprParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Atom__Group_1__2__Impl8549);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getExprParserRuleCall_1_2()); 
            }

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
    // $ANTLR end rule__Atom__Group_1__2__Impl


    // $ANTLR start rule__Atom__Group_1__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4241:1: rule__Atom__Group_1__3 : rule__Atom__Group_1__3__Impl ;
    public final void rule__Atom__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:1: ( rule__Atom__Group_1__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4246:2: rule__Atom__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__3__Impl_in_rule__Atom__Group_1__38578);
            rule__Atom__Group_1__3__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_1__3


    // $ANTLR start rule__Atom__Group_1__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4252:1: rule__Atom__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4258:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,29,FOLLOW_29_in_rule__Atom__Group_1__3__Impl8606); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3()); 
            }

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
    // $ANTLR end rule__Atom__Group_1__3__Impl


    // $ANTLR start rule__Atom__Group_2__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4279:1: rule__Atom__Group_2__0 : rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 ;
    public final void rule__Atom__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4283:1: ( rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4284:2: rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__0__Impl_in_rule__Atom__Group_2__08645);
            rule__Atom__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_2__1_in_rule__Atom__Group_2__08648);
            rule__Atom__Group_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_2__0


    // $ANTLR start rule__Atom__Group_2__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4291:1: rule__Atom__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4295:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4297:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__Atom__Group_2__0__Impl8676); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0()); 
            }

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
    // $ANTLR end rule__Atom__Group_2__0__Impl


    // $ANTLR start rule__Atom__Group_2__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4310:1: rule__Atom__Group_2__1 : rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2 ;
    public final void rule__Atom__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4314:1: ( rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:2: rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__1__Impl_in_rule__Atom__Group_2__18707);
            rule__Atom__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_2__2_in_rule__Atom__Group_2__18710);
            rule__Atom__Group_2__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_2__1


    // $ANTLR start rule__Atom__Group_2__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: rule__Atom__Group_2__1__Impl : ( ruleexpr ) ;
    public final void rule__Atom__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4326:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4327:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExprParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Atom__Group_2__1__Impl8737);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getExprParserRuleCall_2_1()); 
            }

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
    // $ANTLR end rule__Atom__Group_2__1__Impl


    // $ANTLR start rule__Atom__Group_2__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4339:1: rule__Atom__Group_2__2 : rule__Atom__Group_2__2__Impl ;
    public final void rule__Atom__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: ( rule__Atom__Group_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:2: rule__Atom__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__2__Impl_in_rule__Atom__Group_2__28766);
            rule__Atom__Group_2__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_2__2


    // $ANTLR start rule__Atom__Group_2__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4350:1: rule__Atom__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4354:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4355:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4355:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4356:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__Atom__Group_2__2__Impl8794); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2()); 
            }

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
    // $ANTLR end rule__Atom__Group_2__2__Impl


    // $ANTLR start rule__Atom__Group_4__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: rule__Atom__Group_4__0 : rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 ;
    public final void rule__Atom__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4379:1: ( rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4380:2: rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__08831);
            rule__Atom__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__08834);
            rule__Atom__Group_4__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_4__0


    // $ANTLR start rule__Atom__Group_4__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: rule__Atom__Group_4__0__Impl : ( () ) ;
    public final void rule__Atom__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4391:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4392:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4392:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4393:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAtomAction_4_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4394:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4396:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getAtomAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Atom__Group_4__0__Impl


    // $ANTLR start rule__Atom__Group_4__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4406:1: rule__Atom__Group_4__1 : rule__Atom__Group_4__1__Impl ;
    public final void rule__Atom__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4410:1: ( rule__Atom__Group_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4411:2: rule__Atom__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__18892);
            rule__Atom__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Atom__Group_4__1


    // $ANTLR start rule__Atom__Group_4__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4417:1: rule__Atom__Group_4__1__Impl : ( ( rule__Atom__ConstantsAssignment_4_1 ) ) ;
    public final void rule__Atom__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4421:1: ( ( ( rule__Atom__ConstantsAssignment_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: ( ( rule__Atom__ConstantsAssignment_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4422:1: ( ( rule__Atom__ConstantsAssignment_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4423:1: ( rule__Atom__ConstantsAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getConstantsAssignment_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: ( rule__Atom__ConstantsAssignment_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:2: rule__Atom__ConstantsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atom__ConstantsAssignment_4_1_in_rule__Atom__Group_4__1__Impl8919);
            rule__Atom__ConstantsAssignment_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getConstantsAssignment_4_1()); 
            }

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
    // $ANTLR end rule__Atom__Group_4__1__Impl


    // $ANTLR start rule__PostfixExpr__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4438:1: rule__PostfixExpr__Group__0 : rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1 ;
    public final void rule__PostfixExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4442:1: ( rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:2: rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__0__Impl_in_rule__PostfixExpr__Group__08953);
            rule__PostfixExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group__1_in_rule__PostfixExpr__Group__08956);
            rule__PostfixExpr__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group__0


    // $ANTLR start rule__PostfixExpr__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4450:1: rule__PostfixExpr__Group__0__Impl : ( () ) ;
    public final void rule__PostfixExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4454:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4455:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4456:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getPostfixExprAction_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4457:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4459:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getPostfixExprAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PostfixExpr__Group__0__Impl


    // $ANTLR start rule__PostfixExpr__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: rule__PostfixExpr__Group__1 : rule__PostfixExpr__Group__1__Impl rule__PostfixExpr__Group__2 ;
    public final void rule__PostfixExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4473:1: ( rule__PostfixExpr__Group__1__Impl rule__PostfixExpr__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4474:2: rule__PostfixExpr__Group__1__Impl rule__PostfixExpr__Group__2
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__1__Impl_in_rule__PostfixExpr__Group__19014);
            rule__PostfixExpr__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group__2_in_rule__PostfixExpr__Group__19017);
            rule__PostfixExpr__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group__1


    // $ANTLR start rule__PostfixExpr__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4481:1: rule__PostfixExpr__Group__1__Impl : ( ( rule__PostfixExpr__Alternatives_1 ) ) ;
    public final void rule__PostfixExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:1: ( ( ( rule__PostfixExpr__Alternatives_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4486:1: ( ( rule__PostfixExpr__Alternatives_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4486:1: ( ( rule__PostfixExpr__Alternatives_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4487:1: ( rule__PostfixExpr__Alternatives_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getAlternatives_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:1: ( rule__PostfixExpr__Alternatives_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4488:2: rule__PostfixExpr__Alternatives_1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Alternatives_1_in_rule__PostfixExpr__Group__1__Impl9044);
            rule__PostfixExpr__Alternatives_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getAlternatives_1()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group__1__Impl


    // $ANTLR start rule__PostfixExpr__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4498:1: rule__PostfixExpr__Group__2 : rule__PostfixExpr__Group__2__Impl ;
    public final void rule__PostfixExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:1: ( rule__PostfixExpr__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:2: rule__PostfixExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__2__Impl_in_rule__PostfixExpr__Group__29074);
            rule__PostfixExpr__Group__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group__2


    // $ANTLR start rule__PostfixExpr__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:1: rule__PostfixExpr__Group__2__Impl : ( ( rule__PostfixExpr__Alternatives_2 )* ) ;
    public final void rule__PostfixExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4513:1: ( ( ( rule__PostfixExpr__Alternatives_2 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: ( ( rule__PostfixExpr__Alternatives_2 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4514:1: ( ( rule__PostfixExpr__Alternatives_2 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4515:1: ( rule__PostfixExpr__Alternatives_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getAlternatives_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: ( rule__PostfixExpr__Alternatives_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==28||(LA30_0>=44 && LA30_0<=45)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:2: rule__PostfixExpr__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__PostfixExpr__Alternatives_2_in_rule__PostfixExpr__Group__2__Impl9101);
            	    rule__PostfixExpr__Alternatives_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getAlternatives_2()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group__2__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_0__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: rule__PostfixExpr__Group_2_0__0 : rule__PostfixExpr__Group_2_0__0__Impl rule__PostfixExpr__Group_2_0__1 ;
    public final void rule__PostfixExpr__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4536:1: ( rule__PostfixExpr__Group_2_0__0__Impl rule__PostfixExpr__Group_2_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4537:2: rule__PostfixExpr__Group_2_0__0__Impl rule__PostfixExpr__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_0__0__Impl_in_rule__PostfixExpr__Group_2_0__09138);
            rule__PostfixExpr__Group_2_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_0__1_in_rule__PostfixExpr__Group_2_0__09141);
            rule__PostfixExpr__Group_2_0__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_0__0


    // $ANTLR start rule__PostfixExpr__Group_2_0__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4544:1: rule__PostfixExpr__Group_2_0__0__Impl : ( '.' ) ;
    public final void rule__PostfixExpr__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4548:1: ( ( '.' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( '.' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4549:1: ( '.' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4550:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getFullStopKeyword_2_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__PostfixExpr__Group_2_0__0__Impl9169); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getFullStopKeyword_2_0_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_0__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_0__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: rule__PostfixExpr__Group_2_0__1 : rule__PostfixExpr__Group_2_0__1__Impl ;
    public final void rule__PostfixExpr__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: ( rule__PostfixExpr__Group_2_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:2: rule__PostfixExpr__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_0__1__Impl_in_rule__PostfixExpr__Group_2_0__19200);
            rule__PostfixExpr__Group_2_0__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_0__1


    // $ANTLR start rule__PostfixExpr__Group_2_0__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4574:1: rule__PostfixExpr__Group_2_0__1__Impl : ( RULE_ID ) ;
    public final void rule__PostfixExpr__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4578:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4580:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__Group_2_0__1__Impl9227); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_2_0_1()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_0__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:1: rule__PostfixExpr__Group_2_1__0 : rule__PostfixExpr__Group_2_1__0__Impl rule__PostfixExpr__Group_2_1__1 ;
    public final void rule__PostfixExpr__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4599:1: ( rule__PostfixExpr__Group_2_1__0__Impl rule__PostfixExpr__Group_2_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:2: rule__PostfixExpr__Group_2_1__0__Impl rule__PostfixExpr__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1__0__Impl_in_rule__PostfixExpr__Group_2_1__09260);
            rule__PostfixExpr__Group_2_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1__1_in_rule__PostfixExpr__Group_2_1__09263);
            rule__PostfixExpr__Group_2_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_1__0


    // $ANTLR start rule__PostfixExpr__Group_2_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4607:1: rule__PostfixExpr__Group_2_1__0__Impl : ( '(' ) ;
    public final void rule__PostfixExpr__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4611:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_2_1_0()); 
            }
            match(input,28,FOLLOW_28_in_rule__PostfixExpr__Group_2_1__0__Impl9291); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_2_1_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_1__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4626:1: rule__PostfixExpr__Group_2_1__1 : rule__PostfixExpr__Group_2_1__1__Impl rule__PostfixExpr__Group_2_1__2 ;
    public final void rule__PostfixExpr__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4630:1: ( rule__PostfixExpr__Group_2_1__1__Impl rule__PostfixExpr__Group_2_1__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4631:2: rule__PostfixExpr__Group_2_1__1__Impl rule__PostfixExpr__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1__1__Impl_in_rule__PostfixExpr__Group_2_1__19322);
            rule__PostfixExpr__Group_2_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1__2_in_rule__PostfixExpr__Group_2_1__19325);
            rule__PostfixExpr__Group_2_1__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_1__1


    // $ANTLR start rule__PostfixExpr__Group_2_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4638:1: rule__PostfixExpr__Group_2_1__1__Impl : ( ( rule__PostfixExpr__Group_2_1_1__0 )? ) ;
    public final void rule__PostfixExpr__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4642:1: ( ( ( rule__PostfixExpr__Group_2_1_1__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: ( ( rule__PostfixExpr__Group_2_1_1__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4643:1: ( ( rule__PostfixExpr__Group_2_1_1__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: ( rule__PostfixExpr__Group_2_1_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getGroup_2_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:1: ( rule__PostfixExpr__Group_2_1_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||(LA31_0>=24 && LA31_0<=25)||LA31_0==28||LA31_0==43||(LA31_0>=48 && LA31_0<=49)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4645:2: rule__PostfixExpr__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1_1__0_in_rule__PostfixExpr__Group_2_1__1__Impl9352);
                    rule__PostfixExpr__Group_2_1_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getGroup_2_1_1()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_1__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_1__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4655:1: rule__PostfixExpr__Group_2_1__2 : rule__PostfixExpr__Group_2_1__2__Impl ;
    public final void rule__PostfixExpr__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4659:1: ( rule__PostfixExpr__Group_2_1__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4660:2: rule__PostfixExpr__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1__2__Impl_in_rule__PostfixExpr__Group_2_1__29383);
            rule__PostfixExpr__Group_2_1__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_1__2


    // $ANTLR start rule__PostfixExpr__Group_2_1__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4666:1: rule__PostfixExpr__Group_2_1__2__Impl : ( ')' ) ;
    public final void rule__PostfixExpr__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4672:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_2_1_2()); 
            }
            match(input,29,FOLLOW_29_in_rule__PostfixExpr__Group_2_1__2__Impl9411); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_2_1_2()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_1__2__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_1_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: rule__PostfixExpr__Group_2_1_1__0 : rule__PostfixExpr__Group_2_1_1__0__Impl rule__PostfixExpr__Group_2_1_1__1 ;
    public final void rule__PostfixExpr__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4695:1: ( rule__PostfixExpr__Group_2_1_1__0__Impl rule__PostfixExpr__Group_2_1_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4696:2: rule__PostfixExpr__Group_2_1_1__0__Impl rule__PostfixExpr__Group_2_1_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1_1__0__Impl_in_rule__PostfixExpr__Group_2_1_1__09448);
            rule__PostfixExpr__Group_2_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1_1__1_in_rule__PostfixExpr__Group_2_1_1__09451);
            rule__PostfixExpr__Group_2_1_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_1_1__0


    // $ANTLR start rule__PostfixExpr__Group_2_1_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4703:1: rule__PostfixExpr__Group_2_1_1__0__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_0 ) ) ;
    public final void rule__PostfixExpr__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4707:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:1: ( ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4708:1: ( ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4709:1: ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_2_1_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:1: ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4710:2: rule__PostfixExpr__ExpressionsAssignment_2_1_1_0
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_2_1_1_0_in_rule__PostfixExpr__Group_2_1_1__0__Impl9478);
            rule__PostfixExpr__ExpressionsAssignment_2_1_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_2_1_1_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_1_1__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_1_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4720:1: rule__PostfixExpr__Group_2_1_1__1 : rule__PostfixExpr__Group_2_1_1__1__Impl ;
    public final void rule__PostfixExpr__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4724:1: ( rule__PostfixExpr__Group_2_1_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:2: rule__PostfixExpr__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1_1__1__Impl_in_rule__PostfixExpr__Group_2_1_1__19508);
            rule__PostfixExpr__Group_2_1_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_1_1__1


    // $ANTLR start rule__PostfixExpr__Group_2_1_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4731:1: rule__PostfixExpr__Group_2_1_1__1__Impl : ( ( rule__PostfixExpr__Group_2_1_1_1__0 )* ) ;
    public final void rule__PostfixExpr__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( ( ( rule__PostfixExpr__Group_2_1_1_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:1: ( ( rule__PostfixExpr__Group_2_1_1_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:1: ( ( rule__PostfixExpr__Group_2_1_1_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:1: ( rule__PostfixExpr__Group_2_1_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getGroup_2_1_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:1: ( rule__PostfixExpr__Group_2_1_1_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==26) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4738:2: rule__PostfixExpr__Group_2_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1_1_1__0_in_rule__PostfixExpr__Group_2_1_1__1__Impl9535);
            	    rule__PostfixExpr__Group_2_1_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getGroup_2_1_1_1()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_1_1__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_1_1_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:1: rule__PostfixExpr__Group_2_1_1_1__0 : rule__PostfixExpr__Group_2_1_1_1__0__Impl rule__PostfixExpr__Group_2_1_1_1__1 ;
    public final void rule__PostfixExpr__Group_2_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: ( rule__PostfixExpr__Group_2_1_1_1__0__Impl rule__PostfixExpr__Group_2_1_1_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4757:2: rule__PostfixExpr__Group_2_1_1_1__0__Impl rule__PostfixExpr__Group_2_1_1_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1_1_1__0__Impl_in_rule__PostfixExpr__Group_2_1_1_1__09570);
            rule__PostfixExpr__Group_2_1_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1_1_1__1_in_rule__PostfixExpr__Group_2_1_1_1__09573);
            rule__PostfixExpr__Group_2_1_1_1__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_1_1_1__0


    // $ANTLR start rule__PostfixExpr__Group_2_1_1_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: rule__PostfixExpr__Group_2_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__PostfixExpr__Group_2_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4768:1: ( ( ',' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: ( ',' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4769:1: ( ',' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4770:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getCommaKeyword_2_1_1_1_0()); 
            }
            match(input,26,FOLLOW_26_in_rule__PostfixExpr__Group_2_1_1_1__0__Impl9601); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getCommaKeyword_2_1_1_1_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_1_1_1__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_1_1_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:1: rule__PostfixExpr__Group_2_1_1_1__1 : rule__PostfixExpr__Group_2_1_1_1__1__Impl ;
    public final void rule__PostfixExpr__Group_2_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4787:1: ( rule__PostfixExpr__Group_2_1_1_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4788:2: rule__PostfixExpr__Group_2_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_1_1_1__1__Impl_in_rule__PostfixExpr__Group_2_1_1_1__19632);
            rule__PostfixExpr__Group_2_1_1_1__1__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_1_1_1__1


    // $ANTLR start rule__PostfixExpr__Group_2_1_1_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: rule__PostfixExpr__Group_2_1_1_1__1__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1 ) ) ;
    public final void rule__PostfixExpr__Group_2_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4798:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ( ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4799:1: ( ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_2_1_1_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:1: ( rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:2: rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1_in_rule__PostfixExpr__Group_2_1_1_1__1__Impl9659);
            rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_2_1_1_1_1()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_1_1_1__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_2__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: rule__PostfixExpr__Group_2_2__0 : rule__PostfixExpr__Group_2_2__0__Impl rule__PostfixExpr__Group_2_2__1 ;
    public final void rule__PostfixExpr__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4819:1: ( rule__PostfixExpr__Group_2_2__0__Impl rule__PostfixExpr__Group_2_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:2: rule__PostfixExpr__Group_2_2__0__Impl rule__PostfixExpr__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_2__0__Impl_in_rule__PostfixExpr__Group_2_2__09693);
            rule__PostfixExpr__Group_2_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_2__1_in_rule__PostfixExpr__Group_2_2__09696);
            rule__PostfixExpr__Group_2_2__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_2__0


    // $ANTLR start rule__PostfixExpr__Group_2_2__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4827:1: rule__PostfixExpr__Group_2_2__0__Impl : ( '[' ) ;
    public final void rule__PostfixExpr__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4831:1: ( ( '[' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4832:1: ( '[' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4832:1: ( '[' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4833:1: '['
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_2_2_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__PostfixExpr__Group_2_2__0__Impl9724); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_2_2_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_2__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_2__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4846:1: rule__PostfixExpr__Group_2_2__1 : rule__PostfixExpr__Group_2_2__1__Impl rule__PostfixExpr__Group_2_2__2 ;
    public final void rule__PostfixExpr__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: ( rule__PostfixExpr__Group_2_2__1__Impl rule__PostfixExpr__Group_2_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4851:2: rule__PostfixExpr__Group_2_2__1__Impl rule__PostfixExpr__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_2__1__Impl_in_rule__PostfixExpr__Group_2_2__19755);
            rule__PostfixExpr__Group_2_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_2__2_in_rule__PostfixExpr__Group_2_2__19758);
            rule__PostfixExpr__Group_2_2__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_2__1


    // $ANTLR start rule__PostfixExpr__Group_2_2__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: rule__PostfixExpr__Group_2_2__1__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_2_2_1 ) ) ;
    public final void rule__PostfixExpr__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4862:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_2_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4863:1: ( ( rule__PostfixExpr__ExpressionsAssignment_2_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4863:1: ( ( rule__PostfixExpr__ExpressionsAssignment_2_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4864:1: ( rule__PostfixExpr__ExpressionsAssignment_2_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_2_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4865:1: ( rule__PostfixExpr__ExpressionsAssignment_2_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4865:2: rule__PostfixExpr__ExpressionsAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_2_2_1_in_rule__PostfixExpr__Group_2_2__1__Impl9785);
            rule__PostfixExpr__ExpressionsAssignment_2_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_2_2_1()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_2__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_2_2__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4875:1: rule__PostfixExpr__Group_2_2__2 : rule__PostfixExpr__Group_2_2__2__Impl ;
    public final void rule__PostfixExpr__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4879:1: ( rule__PostfixExpr__Group_2_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:2: rule__PostfixExpr__Group_2_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_2_2__2__Impl_in_rule__PostfixExpr__Group_2_2__29815);
            rule__PostfixExpr__Group_2_2__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__PostfixExpr__Group_2_2__2


    // $ANTLR start rule__PostfixExpr__Group_2_2__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: rule__PostfixExpr__Group_2_2__2__Impl : ( ']' ) ;
    public final void rule__PostfixExpr__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4890:1: ( ( ']' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4891:1: ( ']' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4891:1: ( ']' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4892:1: ']'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_2_2_2()); 
            }
            match(input,46,FOLLOW_46_in_rule__PostfixExpr__Group_2_2__2__Impl9843); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_2_2_2()); 
            }

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
    // $ANTLR end rule__PostfixExpr__Group_2_2__2__Impl


    // $ANTLR start rule__Real__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__09880);
            rule__Real__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__09883);
            rule__Real__Group__1();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Real__Group__0


    // $ANTLR start rule__Real__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4923:1: rule__Real__Group__0__Impl : ( ( rule__Real__RealAssignment_0 ) ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4927:1: ( ( ( rule__Real__RealAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4928:1: ( ( rule__Real__RealAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4928:1: ( ( rule__Real__RealAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4929:1: ( rule__Real__RealAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRealAccess().getRealAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:1: ( rule__Real__RealAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4930:2: rule__Real__RealAssignment_0
            {
            pushFollow(FOLLOW_rule__Real__RealAssignment_0_in_rule__Real__Group__0__Impl9910);
            rule__Real__RealAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getRealAccess().getRealAssignment_0()); 
            }

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
    // $ANTLR end rule__Real__Group__0__Impl


    // $ANTLR start rule__Real__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4944:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4945:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__19940);
            rule__Real__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__19943);
            rule__Real__Group__2();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Real__Group__1


    // $ANTLR start rule__Real__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:1: rule__Real__Group__1__Impl : ( '.' ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4956:1: ( ( '.' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: ( '.' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: ( '.' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4958:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRealAccess().getFullStopKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__Real__Group__1__Impl9971); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getRealAccess().getFullStopKeyword_1()); 
            }

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
    // $ANTLR end rule__Real__Group__1__Impl


    // $ANTLR start rule__Real__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: rule__Real__Group__2 : rule__Real__Group__2__Impl ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4975:1: ( rule__Real__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4976:2: rule__Real__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__210002);
            rule__Real__Group__2__Impl();
            _fsp--;
            if (failed) return ;

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
    // $ANTLR end rule__Real__Group__2


    // $ANTLR start rule__Real__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4982:1: rule__Real__Group__2__Impl : ( ( ( rule__Real__RealAssignment_2 ) ) ( ( rule__Real__RealAssignment_2 )* ) ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4986:1: ( ( ( ( rule__Real__RealAssignment_2 ) ) ( ( rule__Real__RealAssignment_2 )* ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4987:1: ( ( ( rule__Real__RealAssignment_2 ) ) ( ( rule__Real__RealAssignment_2 )* ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4987:1: ( ( ( rule__Real__RealAssignment_2 ) ) ( ( rule__Real__RealAssignment_2 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: ( ( rule__Real__RealAssignment_2 ) ) ( ( rule__Real__RealAssignment_2 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4988:1: ( ( rule__Real__RealAssignment_2 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4989:1: ( rule__Real__RealAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRealAccess().getRealAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4990:1: ( rule__Real__RealAssignment_2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4990:2: rule__Real__RealAssignment_2
            {
            pushFollow(FOLLOW_rule__Real__RealAssignment_2_in_rule__Real__Group__2__Impl10031);
            rule__Real__RealAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getRealAccess().getRealAssignment_2()); 
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: ( ( rule__Real__RealAssignment_2 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4994:1: ( rule__Real__RealAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRealAccess().getRealAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4995:1: ( rule__Real__RealAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4995:2: rule__Real__RealAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Real__RealAssignment_2_in_rule__Real__Group__2__Impl10043);
            	    rule__Real__RealAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getRealAccess().getRealAssignment_2()); 
            }

            }


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
    // $ANTLR end rule__Real__Group__2__Impl


    // $ANTLR start rule__Model__FunctionsAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: rule__Model__FunctionsAssignment_0 : ( rulefunctionDefinition ) ;
    public final void rule__Model__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5017:1: ( ( rulefunctionDefinition ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: ( rulefunctionDefinition )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5018:1: ( rulefunctionDefinition )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: rulefunctionDefinition
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionsFunctionDefinitionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulefunctionDefinition_in_rule__Model__FunctionsAssignment_010087);
            rulefunctionDefinition();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFunctionsFunctionDefinitionParserRuleCall_0_0()); 
            }

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
    // $ANTLR end rule__Model__FunctionsAssignment_0


    // $ANTLR start rule__Model__MainAssignment_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: rule__Model__MainAssignment_1 : ( rulemainFunction ) ;
    public final void rule__Model__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5032:1: ( ( rulemainFunction ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( rulemainFunction )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5033:1: ( rulemainFunction )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: rulemainFunction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMainMainFunctionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulemainFunction_in_rule__Model__MainAssignment_110118);
            rulemainFunction();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getModelAccess().getMainMainFunctionParserRuleCall_1_0()); 
            }

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
    // $ANTLR end rule__Model__MainAssignment_1


    // $ANTLR start rule__FunctionDefinition__NameAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: rule__FunctionDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5047:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5048:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_010149); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__NameAssignment_0


    // $ANTLR start rule__FunctionDefinition__FormalParamsAssignment_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5058:1: rule__FunctionDefinition__FormalParamsAssignment_2 : ( ruleformalParams ) ;
    public final void rule__FunctionDefinition__FormalParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5062:1: ( ( ruleformalParams ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: ( ruleformalParams )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5063:1: ( ruleformalParams )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5064:1: ruleformalParams
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getFormalParamsFormalParamsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_rule__FunctionDefinition__FormalParamsAssignment_210180);
            ruleformalParams();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getFormalParamsFormalParamsParserRuleCall_2_0()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__FormalParamsAssignment_2


    // $ANTLR start rule__FunctionDefinition__ReturnTypeAssignment_4_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5073:1: rule__FunctionDefinition__ReturnTypeAssignment_4_1 : ( ruletype ) ;
    public final void rule__FunctionDefinition__ReturnTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5077:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5078:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__FunctionDefinition__ReturnTypeAssignment_4_110211);
            ruletype();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__ReturnTypeAssignment_4_1


    // $ANTLR start rule__FunctionDefinition__BlocksAssignment_5
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5088:1: rule__FunctionDefinition__BlocksAssignment_5 : ( ruleblock ) ;
    public final void rule__FunctionDefinition__BlocksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5092:1: ( ( ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5093:1: ( ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5094:1: ruleblock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getBlocksBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleblock_in_rule__FunctionDefinition__BlocksAssignment_510242);
            ruleblock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionDefinitionAccess().getBlocksBlockParserRuleCall_5_0()); 
            }

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
    // $ANTLR end rule__FunctionDefinition__BlocksAssignment_5


    // $ANTLR start rule__MainFunction__MainAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5103:1: rule__MainFunction__MainAssignment_0 : ( ( 'main' ) ) ;
    public final void rule__MainFunction__MainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5107:1: ( ( ( 'main' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: ( ( 'main' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5108:1: ( ( 'main' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5109:1: ( 'main' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5110:1: ( 'main' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5111:1: 'main'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__MainFunction__MainAssignment_010278); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0()); 
            }

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
    // $ANTLR end rule__MainFunction__MainAssignment_0


    // $ANTLR start rule__MainFunction__FormalParamsAssignment_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5126:1: rule__MainFunction__FormalParamsAssignment_2 : ( ruleformalParams ) ;
    public final void rule__MainFunction__FormalParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ( ( ruleformalParams ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( ruleformalParams )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ( ruleformalParams )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5132:1: ruleformalParams
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getFormalParamsFormalParamsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_rule__MainFunction__FormalParamsAssignment_210317);
            ruleformalParams();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getFormalParamsFormalParamsParserRuleCall_2_0()); 
            }

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
    // $ANTLR end rule__MainFunction__FormalParamsAssignment_2


    // $ANTLR start rule__MainFunction__BlocksAssignment_4
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5141:1: rule__MainFunction__BlocksAssignment_4 : ( ruleblock ) ;
    public final void rule__MainFunction__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( ( ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: ( ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: ( ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5147:1: ruleblock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getBlocksBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleblock_in_rule__MainFunction__BlocksAssignment_410348);
            ruleblock();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMainFunctionAccess().getBlocksBlockParserRuleCall_4_0()); 
            }

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
    // $ANTLR end rule__MainFunction__BlocksAssignment_4


    // $ANTLR start rule__FormalParams__ParamsAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5156:1: rule__FormalParams__ParamsAssignment_0 : ( ruleparam ) ;
    public final void rule__FormalParams__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5162:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_010379);
            ruleparam();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_0_0()); 
            }

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
    // $ANTLR end rule__FormalParams__ParamsAssignment_0


    // $ANTLR start rule__FormalParams__ParamsAssignment_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5171:1: rule__FormalParams__ParamsAssignment_1_1 : ( ruleparam ) ;
    public final void rule__FormalParams__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5177:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_1_110410);
            ruleparam();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end rule__FormalParams__ParamsAssignment_1_1


    // $ANTLR start rule__Param__NameAssignment_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5186:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5190:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5191:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5191:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5192:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Param__NameAssignment_110441); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end rule__Param__NameAssignment_1


    // $ANTLR start rule__Block__StatementsAssignment_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5201:1: rule__Block__StatementsAssignment_2 : ( rulestatement ) ;
    public final void rule__Block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5207:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Block__StatementsAssignment_210472);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }

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
    // $ANTLR end rule__Block__StatementsAssignment_2


    // $ANTLR start rule__Type__TypesAssignment
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5216:1: rule__Type__TypesAssignment : ( ( rule__Type__TypesAlternatives_0 ) ) ;
    public final void rule__Type__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5220:1: ( ( ( rule__Type__TypesAlternatives_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5221:1: ( ( rule__Type__TypesAlternatives_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5221:1: ( ( rule__Type__TypesAlternatives_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5222:1: ( rule__Type__TypesAlternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypesAlternatives_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( rule__Type__TypesAlternatives_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:2: rule__Type__TypesAlternatives_0
            {
            pushFollow(FOLLOW_rule__Type__TypesAlternatives_0_in_rule__Type__TypesAssignment10503);
            rule__Type__TypesAlternatives_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getTypeAccess().getTypesAlternatives_0()); 
            }

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
    // $ANTLR end rule__Type__TypesAssignment


    // $ANTLR start rule__Statement__PostFixExpressionAssignment_2_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5232:1: rule__Statement__PostFixExpressionAssignment_2_1 : ( rulepostfixExpr ) ;
    public final void rule__Statement__PostFixExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: ( ( rulepostfixExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: ( rulepostfixExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5237:1: ( rulepostfixExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5238:1: rulepostfixExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_rule__Statement__PostFixExpressionAssignment_2_110536);
            rulepostfixExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end rule__Statement__PostFixExpressionAssignment_2_1


    // $ANTLR start rule__Statement__AssignmentsAssignment_3_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5247:1: rule__Statement__AssignmentsAssignment_3_1 : ( ruleassignment ) ;
    public final void rule__Statement__AssignmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: ( ( ruleassignment ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5252:1: ( ruleassignment )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5252:1: ( ruleassignment )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5253:1: ruleassignment
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleassignment_in_rule__Statement__AssignmentsAssignment_3_110567);
            ruleassignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_3_1_0()); 
            }

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
    // $ANTLR end rule__Statement__AssignmentsAssignment_3_1


    // $ANTLR start rule__Statement__ExprsAssignment_4_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5262:1: rule__Statement__ExprsAssignment_4_2 : ( ruleexpr ) ;
    public final void rule__Statement__ExprsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5267:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_4_210598);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_4_2_0()); 
            }

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
    // $ANTLR end rule__Statement__ExprsAssignment_4_2


    // $ANTLR start rule__Statement__StatementsAssignment_5_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5277:1: rule__Statement__StatementsAssignment_5_3 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5281:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5282:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5282:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5283:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_3_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_5_310629);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_3_0()); 
            }

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
    // $ANTLR end rule__Statement__StatementsAssignment_5_3


    // $ANTLR start rule__Statement__StatementsAssignment_5_4_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5292:1: rule__Statement__StatementsAssignment_5_4_1 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5297:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5298:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_4_1_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_5_4_110660);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_4_1_0()); 
            }

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
    // $ANTLR end rule__Statement__StatementsAssignment_5_4_1


    // $ANTLR start rule__Statement__ExprsAssignment_6_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5307:1: rule__Statement__ExprsAssignment_6_3 : ( ruleexpr ) ;
    public final void rule__Statement__ExprsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5312:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5312:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5313:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_6_310691);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_6_3_0()); 
            }

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
    // $ANTLR end rule__Statement__ExprsAssignment_6_3


    // $ANTLR start rule__Statement__StatementsAssignment_6_5
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5322:1: rule__Statement__StatementsAssignment_6_5 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_6_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5327:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_6_5_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_6_510722);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_6_5_0()); 
            }

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
    // $ANTLR end rule__Statement__StatementsAssignment_6_5


    // $ANTLR start rule__Statement__StatementsAssignment_7_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5337:1: rule__Statement__StatementsAssignment_7_3 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_7_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5341:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5342:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_7_3_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_7_310753);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_7_3_0()); 
            }

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
    // $ANTLR end rule__Statement__StatementsAssignment_7_3


    // $ANTLR start rule__FunctionCall__FunctionAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5352:1: rule__FunctionCall__FunctionAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__FunctionCall__FunctionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5357:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5358:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionDefinitionCrossReference_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5359:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5360:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getFunctionFunctionDefinitionIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_010788); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionFunctionDefinitionIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getFunctionFunctionDefinitionCrossReference_0_0()); 
            }

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
    // $ANTLR end rule__FunctionCall__FunctionAssignment_0


    // $ANTLR start rule__FunctionCall__ExprsAssignment_2_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: rule__FunctionCall__ExprsAssignment_2_0 : ( ruleexpr ) ;
    public final void rule__FunctionCall__ExprsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5375:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5376:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5376:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5377:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getExprsExprParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__FunctionCall__ExprsAssignment_2_010823);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getExprsExprParserRuleCall_2_0_0()); 
            }

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
    // $ANTLR end rule__FunctionCall__ExprsAssignment_2_0


    // $ANTLR start rule__FunctionCall__ExprsAssignment_2_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: rule__FunctionCall__ExprsAssignment_2_1_1 : ( ruleexpr ) ;
    public final void rule__FunctionCall__ExprsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5390:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5391:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5392:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionCallAccess().getExprsExprParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__FunctionCall__ExprsAssignment_2_1_110854);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFunctionCallAccess().getExprsExprParserRuleCall_2_1_1_0()); 
            }

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
    // $ANTLR end rule__FunctionCall__ExprsAssignment_2_1_1


    // $ANTLR start rule__Declaration__VariableTypeAssignment_0_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5401:1: rule__Declaration__VariableTypeAssignment_0_0 : ( ruletype ) ;
    public final void rule__Declaration__VariableTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5405:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5406:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5406:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5407:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getVariableTypeTypeParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__Declaration__VariableTypeAssignment_0_010885);
            ruletype();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getVariableTypeTypeParserRuleCall_0_0_0()); 
            }

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
    // $ANTLR end rule__Declaration__VariableTypeAssignment_0_0


    // $ANTLR start rule__Declaration__NameAssignment_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5420:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5421:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5421:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_110916); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

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
    // $ANTLR end rule__Declaration__NameAssignment_1


    // $ANTLR start rule__Declaration__ExprsAssignment_2_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: rule__Declaration__ExprsAssignment_2_1 : ( ruleexpr ) ;
    public final void rule__Declaration__ExprsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5435:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5436:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5436:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5437:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getExprsExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Declaration__ExprsAssignment_2_110947);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getExprsExprParserRuleCall_2_1_0()); 
            }

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
    // $ANTLR end rule__Declaration__ExprsAssignment_2_1


    // $ANTLR start rule__Assignment__ExprsAssignment_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:1: rule__Assignment__ExprsAssignment_2 : ( ruleexpr ) ;
    public final void rule__Assignment__ExprsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5450:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5451:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExprsExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Assignment__ExprsAssignment_210978);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentAccess().getExprsExprParserRuleCall_2_0()); 
            }

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
    // $ANTLR end rule__Assignment__ExprsAssignment_2


    // $ANTLR start rule__Expr__AndExprsAssignment_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: rule__Expr__AndExprsAssignment_1_1 : ( ruleandExpr ) ;
    public final void rule__Expr__AndExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5465:1: ( ( ruleandExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: ( ruleandExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5466:1: ( ruleandExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: ruleandExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprsAndExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_rule__Expr__AndExprsAssignment_1_111009);
            ruleandExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExprAccess().getAndExprsAndExprParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end rule__Expr__AndExprsAssignment_1_1


    // $ANTLR start rule__AndExpr__EqExprsAssignment_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: rule__AndExpr__EqExprsAssignment_1_1 : ( ruleeqExpr ) ;
    public final void rule__AndExpr__EqExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5480:1: ( ( ruleeqExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:1: ( ruleeqExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5481:1: ( ruleeqExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: ruleeqExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprsEqExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_rule__AndExpr__EqExprsAssignment_1_111040);
            ruleeqExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getEqExprsEqExprParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end rule__AndExpr__EqExprsAssignment_1_1


    // $ANTLR start rule__EqExpr__RelExprsAssignment_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: rule__EqExpr__RelExprsAssignment_1_1 : ( rulerelExpr ) ;
    public final void rule__EqExpr__RelExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5495:1: ( ( rulerelExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5496:1: ( rulerelExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5496:1: ( rulerelExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: rulerelExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprsRelExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_rule__EqExpr__RelExprsAssignment_1_111071);
            rulerelExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEqExprAccess().getRelExprsRelExprParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end rule__EqExpr__RelExprsAssignment_1_1


    // $ANTLR start rule__RelExpr__AddExprAssignment_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5506:1: rule__RelExpr__AddExprAssignment_1_1 : ( ruleaddExpr ) ;
    public final void rule__RelExpr__AddExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5510:1: ( ( ruleaddExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: ( ruleaddExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5511:1: ( ruleaddExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: ruleaddExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprAddExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rule__RelExpr__AddExprAssignment_1_111102);
            ruleaddExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getRelExprAccess().getAddExprAddExprParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end rule__RelExpr__AddExprAssignment_1_1


    // $ANTLR start rule__AddExpr__MulExprsAssignment_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5521:1: rule__AddExpr__MulExprsAssignment_1_1 : ( rulemulExpr ) ;
    public final void rule__AddExpr__MulExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5525:1: ( ( rulemulExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: ( rulemulExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5526:1: ( rulemulExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: rulemulExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprsMulExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_rule__AddExpr__MulExprsAssignment_1_111133);
            rulemulExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExprAccess().getMulExprsMulExprParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end rule__AddExpr__MulExprsAssignment_1_1


    // $ANTLR start rule__MulExpr__AtomsAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5536:1: rule__MulExpr__AtomsAssignment_0 : ( ruleatom ) ;
    public final void rule__MulExpr__AtomsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5540:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5541:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_011164);
            ruleatom();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_0_0()); 
            }

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
    // $ANTLR end rule__MulExpr__AtomsAssignment_0


    // $ANTLR start rule__MulExpr__AtomsAssignment_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: rule__MulExpr__AtomsAssignment_1_1 : ( ruleatom ) ;
    public final void rule__MulExpr__AtomsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5555:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5556:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5556:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5557:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_1_111195);
            ruleatom();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_1_1_0()); 
            }

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
    // $ANTLR end rule__MulExpr__AtomsAssignment_1_1


    // $ANTLR start rule__Atom__ConstantsAssignment_4_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5566:1: rule__Atom__ConstantsAssignment_4_1 : ( ruleconstant ) ;
    public final void rule__Atom__ConstantsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5570:1: ( ( ruleconstant ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5571:1: ( ruleconstant )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5571:1: ( ruleconstant )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5572:1: ruleconstant
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getConstantsConstantParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleconstant_in_rule__Atom__ConstantsAssignment_4_111226);
            ruleconstant();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomAccess().getConstantsConstantParserRuleCall_4_1_0()); 
            }

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
    // $ANTLR end rule__Atom__ConstantsAssignment_4_1


    // $ANTLR start rule__PostfixExpr__ExistingVariableAssignment_1_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5581:1: rule__PostfixExpr__ExistingVariableAssignment_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixExpr__ExistingVariableAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5585:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5586:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5586:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5587:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationCrossReference_1_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5588:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5589:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationIDTerminalRuleCall_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_1_011261); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationIDTerminalRuleCall_1_0_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationCrossReference_1_0_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__ExistingVariableAssignment_1_0


    // $ANTLR start rule__PostfixExpr__ExistingVariableAssignment_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5600:1: rule__PostfixExpr__ExistingVariableAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixExpr__ExistingVariableAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5604:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5605:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5605:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5606:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableParamCrossReference_1_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5608:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableParamIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_1_111300); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableParamIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableParamCrossReference_1_1_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__ExistingVariableAssignment_1_1


    // $ANTLR start rule__PostfixExpr__ExpressionsAssignment_2_1_1_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5619:1: rule__PostfixExpr__ExpressionsAssignment_2_1_1_0 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5623:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5624:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5624:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5625:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_2_1_1_011335);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_1_1_0_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__ExpressionsAssignment_2_1_1_0


    // $ANTLR start rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5634:1: rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5638:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5639:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5639:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5640:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_111366);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_1_1_1_1_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1


    // $ANTLR start rule__PostfixExpr__ExpressionsAssignment_2_2_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5649:1: rule__PostfixExpr__ExpressionsAssignment_2_2_1 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5653:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5654:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5654:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5655:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_2_2_111397);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_2_2_1_0()); 
            }

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
    // $ANTLR end rule__PostfixExpr__ExpressionsAssignment_2_2_1


    // $ANTLR start rule__Constant__RealAssignment_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5664:1: rule__Constant__RealAssignment_2 : ( rulereal ) ;
    public final void rule__Constant__RealAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5668:1: ( ( rulereal ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5669:1: ( rulereal )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5669:1: ( rulereal )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5670:1: rulereal
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getRealRealParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulereal_in_rule__Constant__RealAssignment_211428);
            rulereal();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getRealRealParserRuleCall_2_0()); 
            }

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
    // $ANTLR end rule__Constant__RealAssignment_2


    // $ANTLR start rule__Constant__IntegerAssignment_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5679:1: rule__Constant__IntegerAssignment_3 : ( RULE_INT ) ;
    public final void rule__Constant__IntegerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5683:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5684:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5684:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5685:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getIntegerINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Constant__IntegerAssignment_311459); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getIntegerINTTerminalRuleCall_3_0()); 
            }

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
    // $ANTLR end rule__Constant__IntegerAssignment_3


    // $ANTLR start rule__Constant__StringAssignment_4
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5694:1: rule__Constant__StringAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5698:1: ( ( RULE_STRING ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5699:1: ( RULE_STRING )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5699:1: ( RULE_STRING )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5700:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constant__StringAssignment_411490); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0()); 
            }

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
    // $ANTLR end rule__Constant__StringAssignment_4


    // $ANTLR start rule__Constant__NullAssignment_5
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5709:1: rule__Constant__NullAssignment_5 : ( ( 'null' ) ) ;
    public final void rule__Constant__NullAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5713:1: ( ( ( 'null' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5714:1: ( ( 'null' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5714:1: ( ( 'null' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5715:1: ( 'null' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNullNullKeyword_5_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5716:1: ( 'null' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5717:1: 'null'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNullNullKeyword_5_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__Constant__NullAssignment_511526); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNullNullKeyword_5_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getNullNullKeyword_5_0()); 
            }

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
    // $ANTLR end rule__Constant__NullAssignment_5


    // $ANTLR start rule__Constant__InfinityAssignment_6
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5732:1: rule__Constant__InfinityAssignment_6 : ( ( 'infty' ) ) ;
    public final void rule__Constant__InfinityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5736:1: ( ( ( 'infty' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ( ( 'infty' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5737:1: ( ( 'infty' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5738:1: ( 'infty' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5739:1: ( 'infty' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5740:1: 'infty'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__Constant__InfinityAssignment_611570); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0()); 
            }

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
    // $ANTLR end rule__Constant__InfinityAssignment_6


    // $ANTLR start rule__Real__RealAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5755:1: rule__Real__RealAssignment_0 : ( RULE_INT ) ;
    public final void rule__Real__RealAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5759:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5760:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5760:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5761:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRealAccess().getRealINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Real__RealAssignment_011609); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getRealAccess().getRealINTTerminalRuleCall_0_0()); 
            }

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
    // $ANTLR end rule__Real__RealAssignment_0


    // $ANTLR start rule__Real__RealAssignment_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5770:1: rule__Real__RealAssignment_2 : ( RULE_INT ) ;
    public final void rule__Real__RealAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5774:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5775:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5775:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5776:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRealAccess().getRealINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Real__RealAssignment_211640); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getRealAccess().getRealINTTerminalRuleCall_2_0()); 
            }

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
    // $ANTLR end rule__Real__RealAssignment_2

    // $ANTLR start synpred4
    public final void synpred4_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( ( rulefunctionCall ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( rulefunctionCall )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( rulefunctionCall )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: rulefunctionCall
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getFunctionCallParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_rulefunctionCall_in_synpred41489);
        rulefunctionCall();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public final void synpred5_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:729:6: ( ( ( rule__Statement__Group_2__0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:729:6: ( ( rule__Statement__Group_2__0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:729:6: ( ( rule__Statement__Group_2__0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:730:1: ( rule__Statement__Group_2__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGroup_2()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:1: ( rule__Statement__Group_2__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:2: rule__Statement__Group_2__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_2__0_in_synpred51506);
        rule__Statement__Group_2__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:6: ( ( ( rule__Statement__Group_3__0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:6: ( ( rule__Statement__Group_3__0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:735:6: ( ( rule__Statement__Group_3__0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:736:1: ( rule__Statement__Group_3__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGroup_3()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:1: ( rule__Statement__Group_3__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:2: rule__Statement__Group_3__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_3__0_in_synpred61524);
        rule__Statement__Group_3__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred21
    public final void synpred21_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:923:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_1_0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:924:1: ( rule__PostfixExpr__ExistingVariableAssignment_1_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_1_0()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:1: ( rule__PostfixExpr__ExistingVariableAssignment_1_0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:2: rule__PostfixExpr__ExistingVariableAssignment_1_0
        {
        pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_1_0_in_synpred211975);
        rule__PostfixExpr__ExistingVariableAssignment_1_0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred21

    // $ANTLR start synpred38
    public final void synpred38_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:2: ( rule__Statement__Group_5_4__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2351:2: rule__Statement__Group_5_4__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_5_4__0_in_synpred384844);
        rule__Statement__Group_5_4__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred38

    public final boolean synpred38() {
        backtracking++;
        int start = input.mark();
        try {
            synpred38_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred6() {
        backtracking++;
        int start = input.mark();
        try {
            synpred6_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred21() {
        backtracking++;
        int start = input.mark();
        try {
            synpred21_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_entryRulefunctionDefinition127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctionDefinition134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0_in_rulefunctionDefinition160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemainFunction_in_entryRulemainFunction187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemainFunction194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__0_in_rulemainFunction220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_entryRuleformalParams247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleformalParams254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__0_in_ruleformalParams280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_entryRuleparam307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleparam314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0_in_ruleparam340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_entryRuleblock367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleblock374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0_in_ruleblock400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_entryRuletype427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuletype434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypesAssignment_in_ruletype460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_entryRulestatement487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulestatement494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_rulestatement520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionCall_in_entryRulefunctionCall547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulefunctionCall554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0_in_rulefunctionCall580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruledeclaration640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_entryRuleassignment667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleassignment700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0_in_ruleexpr760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_entryRuleandExpr787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpr794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0_in_ruleandExpr820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_entryRuleeqExpr847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeqExpr854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__0_in_ruleeqExpr880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_entryRulerelExpr907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelExpr914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__0_in_rulerelExpr940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_entryRuleaddExpr967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaddExpr974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__0_in_ruleaddExpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_entryRulemulExpr1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemulExpr1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__0_in_rulemulExpr1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_entryRuleatom1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleatom1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleatom1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepostfixExpr1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__0_in_rulepostfixExpr1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_in_ruleconstant1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_in_entryRulereal1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulereal1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_rulereal1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_entryRuleendExpr1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendExpr1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndExpr__Alternatives_in_ruleendExpr1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__TypesAlternatives_01397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__TypesAlternatives_01417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__TypesAlternatives_01437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionCall_in_rule__Statement__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__0_in_rule__Statement__Alternatives1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0_in_rule__Statement__Alternatives1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Statement__Alternatives1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EqExpr__Alternatives_1_01647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EqExpr__Alternatives_1_01667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelExpr__Alternatives_1_01702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelExpr__Alternatives_1_01722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RelExpr__Alternatives_1_01742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RelExpr__Alternatives_1_01762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__MulExpr__Alternatives_1_01797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__MulExpr__Alternatives_1_01817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__MulExpr__Alternatives_1_01837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__0_in_rule__Atom__Alternatives1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__0_in_rule__Atom__Alternatives1907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Atom__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives1942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_1_0_in_rule__PostfixExpr__Alternatives_11975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_1_1_in_rule__PostfixExpr__Alternatives_11993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_0__0_in_rule__PostfixExpr__Alternatives_22026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1__0_in_rule__PostfixExpr__Alternatives_22044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_2__0_in_rule__PostfixExpr__Alternatives_22062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Constant__Alternatives2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Constant__Alternatives2116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__RealAssignment_2_in_rule__Constant__Alternatives2135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__IntegerAssignment_3_in_rule__Constant__Alternatives2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__StringAssignment_4_in_rule__Constant__Alternatives2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NullAssignment_5_in_rule__Constant__Alternatives2189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__InfinityAssignment_6_in_rule__Constant__Alternatives2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__EndExpr__Alternatives2241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EndExpr__Alternatives2261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02293 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionsAssignment_0_in_rule__Model__Group__0__Impl2323 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MainAssignment_1_in_rule__Model__Group__1__Impl2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02415 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__NameAssignment_0_in_rule__FunctionDefinition__Group__0__Impl2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12475 = new BitSet(new long[]{0x0000000020007000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionDefinition__Group__1__Impl2506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22537 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__FormalParamsAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32598 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionDefinition__Group__3__Impl2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42660 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__0_in_rule__FunctionDefinition__Group__4__Impl2690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__BlocksAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__0__Impl_in_rule__FunctionDefinition__Group_4__02790 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__1_in_rule__FunctionDefinition__Group_4__02793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionDefinition__Group_4__0__Impl2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__1__Impl_in_rule__FunctionDefinition__Group_4__12852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_4_1_in_rule__FunctionDefinition__Group_4__1__Impl2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__0__Impl_in_rule__MainFunction__Group__02913 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__1_in_rule__MainFunction__Group__02916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__MainAssignment_0_in_rule__MainFunction__Group__0__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__1__Impl_in_rule__MainFunction__Group__12973 = new BitSet(new long[]{0x0000000020007000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__2_in_rule__MainFunction__Group__12976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__MainFunction__Group__1__Impl3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__2__Impl_in_rule__MainFunction__Group__23035 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__3_in_rule__MainFunction__Group__23038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__FormalParamsAssignment_2_in_rule__MainFunction__Group__2__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__3__Impl_in_rule__MainFunction__Group__33096 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__4_in_rule__MainFunction__Group__33099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MainFunction__Group__3__Impl3127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__4__Impl_in_rule__MainFunction__Group__43158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__BlocksAssignment_4_in_rule__MainFunction__Group__4__Impl3185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__0__Impl_in_rule__FormalParams__Group__03225 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__1_in_rule__FormalParams__Group__03228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__ParamsAssignment_0_in_rule__FormalParams__Group__0__Impl3255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__1__Impl_in_rule__FormalParams__Group__13285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__0_in_rule__FormalParams__Group__1__Impl3312 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__0__Impl_in_rule__FormalParams__Group_1__03347 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__1_in_rule__FormalParams__Group_1__03350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FormalParams__Group_1__0__Impl3378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__1__Impl_in_rule__FormalParams__Group_1__13409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__ParamsAssignment_1_1_in_rule__FormalParams__Group_1__1__Impl3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Param__Group__0__Impl3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__13529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03590 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13651 = new BitSet(new long[]{0x0000005780007020L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__13654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Block__Group__1__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__23713 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__23716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StatementsAssignment_2_in_rule__Block__Group__2__Impl3743 = new BitSet(new long[]{0x0000005680007022L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__33774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Block__Group__3__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03841 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rule__Statement__Group_0__0__Impl3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__13900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_0__1__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__03960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__03963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__14021 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__14024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__PostFixExpressionAssignment_2_1_in_rule__Statement__Group_2__1__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__24081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_2__2__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__04143 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__04146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__14204 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__14207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__AssignmentsAssignment_3_1_in_rule__Statement__Group_3__1__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2__Impl_in_rule__Statement__Group_3__24264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_3__2__Impl4291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__04326 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__04329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__14387 = new BitSet(new long[]{0x000308001F0000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__14390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Statement__Group_4__1__Impl4418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__24449 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__24452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExprsAssignment_4_2_in_rule__Statement__Group_4__2__Impl4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__34510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_4__3__Impl4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__04574 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__04577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_5__0__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__14636 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__2_in_rule__Statement__Group_5__14639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__Group_5__1__Impl4666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__2__Impl_in_rule__Statement__Group_5__24695 = new BitSet(new long[]{0x0000005680007020L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__3_in_rule__Statement__Group_5__24698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_5__2__Impl4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__3__Impl_in_rule__Statement__Group_5__34757 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__4_in_rule__Statement__Group_5__34760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_5_3_in_rule__Statement__Group_5__3__Impl4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__4__Impl_in_rule__Statement__Group_5__44817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5_4__0_in_rule__Statement__Group_5__4__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5_4__0__Impl_in_rule__Statement__Group_5_4__04885 = new BitSet(new long[]{0x0000005680007020L});
    public static final BitSet FOLLOW_rule__Statement__Group_5_4__1_in_rule__Statement__Group_5_4__04888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_5_4__0__Impl4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5_4__1__Impl_in_rule__Statement__Group_5_4__14947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_5_4_1_in_rule__Statement__Group_5_4__1__Impl4974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__0__Impl_in_rule__Statement__Group_6__05008 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__1_in_rule__Statement__Group_6__05011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_6__0__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__1__Impl_in_rule__Statement__Group_6__15070 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__2_in_rule__Statement__Group_6__15073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__Statement__Group_6__1__Impl5100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__2__Impl_in_rule__Statement__Group_6__25129 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__3_in_rule__Statement__Group_6__25132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Statement__Group_6__2__Impl5160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__3__Impl_in_rule__Statement__Group_6__35191 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__4_in_rule__Statement__Group_6__35194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExprsAssignment_6_3_in_rule__Statement__Group_6__3__Impl5221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__4__Impl_in_rule__Statement__Group_6__45251 = new BitSet(new long[]{0x0000005680007020L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__5_in_rule__Statement__Group_6__45254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_6__4__Impl5282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__5__Impl_in_rule__Statement__Group_6__55313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_6_5_in_rule__Statement__Group_6__5__Impl5340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__0__Impl_in_rule__Statement__Group_7__05382 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1_in_rule__Statement__Group_7__05385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Statement__Group_7__0__Impl5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__1__Impl_in_rule__Statement__Group_7__15444 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2_in_rule__Statement__Group_7__15447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__Group_7__1__Impl5474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__2__Impl_in_rule__Statement__Group_7__25503 = new BitSet(new long[]{0x0000005680007020L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__3_in_rule__Statement__Group_7__25506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Statement__Group_7__2__Impl5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_7__3__Impl_in_rule__Statement__Group_7__35565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_7_3_in_rule__Statement__Group_7__3__Impl5592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__0__Impl_in_rule__FunctionCall__Group__05630 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1_in_rule__FunctionCall__Group__05633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__FunctionAssignment_0_in_rule__FunctionCall__Group__0__Impl5660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__1__Impl_in_rule__FunctionCall__Group__15690 = new BitSet(new long[]{0x00030800330000E0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2_in_rule__FunctionCall__Group__15693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__FunctionCall__Group__1__Impl5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__2__Impl_in_rule__FunctionCall__Group__25752 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3_in_rule__FunctionCall__Group__25755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2__0_in_rule__FunctionCall__Group__2__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__3__Impl_in_rule__FunctionCall__Group__35813 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4_in_rule__FunctionCall__Group__35816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionCall__Group__3__Impl5844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group__4__Impl_in_rule__FunctionCall__Group__45875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__FunctionCall__Group__4__Impl5902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2__0__Impl_in_rule__FunctionCall__Group_2__05941 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2__1_in_rule__FunctionCall__Group_2__05944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ExprsAssignment_2_0_in_rule__FunctionCall__Group_2__0__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2__1__Impl_in_rule__FunctionCall__Group_2__16001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2_1__0_in_rule__FunctionCall__Group_2__1__Impl6028 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2_1__0__Impl_in_rule__FunctionCall__Group_2_1__06063 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2_1__1_in_rule__FunctionCall__Group_2_1__06066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionCall__Group_2_1__0__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__Group_2_1__1__Impl_in_rule__FunctionCall__Group_2_1__16125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionCall__ExprsAssignment_2_1_1_in_rule__FunctionCall__Group_2_1__1__Impl6152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__06186 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__06189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl6218 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl6230 = new BitSet(new long[]{0x0000000000007002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__16263 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__16266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__26323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__06387 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__06390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VariableTypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__16447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Declaration__Group_0__1__Impl6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__06513 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__06516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Declaration__Group_2__0__Impl6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__16575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ExprsAssignment_2_1_in_rule__Declaration__Group_2__1__Impl6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__06636 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__06639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Assignment__Group__0__Impl6666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__16695 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__16698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Assignment__Group__1__Impl6726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__26757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExprsAssignment_2_in_rule__Assignment__Group__2__Impl6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__06820 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__06823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_rule__Expr__Group__0__Impl6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__16879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl6906 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__06941 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__06944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Expr__Group_1__0__Impl6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__17003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__AndExprsAssignment_1_1_in_rule__Expr__Group_1__1__Impl7030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__07064 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__07067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_rule__AndExpr__Group__0__Impl7094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__17123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl7150 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__07185 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__07188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__AndExpr__Group_1__0__Impl7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__17247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__EqExprsAssignment_1_1_in_rule__AndExpr__Group_1__1__Impl7274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__0__Impl_in_rule__EqExpr__Group__07308 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__1_in_rule__EqExpr__Group__07311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_rule__EqExpr__Group__0__Impl7338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__1__Impl_in_rule__EqExpr__Group__17367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__0_in_rule__EqExpr__Group__1__Impl7394 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__0__Impl_in_rule__EqExpr__Group_1__07429 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__1_in_rule__EqExpr__Group_1__07432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Alternatives_1_0_in_rule__EqExpr__Group_1__0__Impl7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__1__Impl_in_rule__EqExpr__Group_1__17489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__RelExprsAssignment_1_1_in_rule__EqExpr__Group_1__1__Impl7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__0__Impl_in_rule__RelExpr__Group__07550 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__1_in_rule__RelExpr__Group__07553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rule__RelExpr__Group__0__Impl7580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__1__Impl_in_rule__RelExpr__Group__17609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__0_in_rule__RelExpr__Group__1__Impl7636 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__0__Impl_in_rule__RelExpr__Group_1__07671 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__1_in_rule__RelExpr__Group_1__07674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Alternatives_1_0_in_rule__RelExpr__Group_1__0__Impl7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__1__Impl_in_rule__RelExpr__Group_1__17731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__AddExprAssignment_1_1_in_rule__RelExpr__Group_1__1__Impl7758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__0__Impl_in_rule__AddExpr__Group__07792 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__1_in_rule__AddExpr__Group__07795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_rule__AddExpr__Group__0__Impl7822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__1__Impl_in_rule__AddExpr__Group__17851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__0_in_rule__AddExpr__Group__1__Impl7878 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__0__Impl_in_rule__AddExpr__Group_1__07913 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__1_in_rule__AddExpr__Group_1__07916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGN_in_rule__AddExpr__Group_1__0__Impl7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__1__Impl_in_rule__AddExpr__Group_1__17972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__MulExprsAssignment_1_1_in_rule__AddExpr__Group_1__1__Impl7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__0__Impl_in_rule__MulExpr__Group__08033 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__1_in_rule__MulExpr__Group__08036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__AtomsAssignment_0_in_rule__MulExpr__Group__0__Impl8063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__1__Impl_in_rule__MulExpr__Group__18093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__0_in_rule__MulExpr__Group__1__Impl8120 = new BitSet(new long[]{0x0000000000E00002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__0__Impl_in_rule__MulExpr__Group_1__08155 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__1_in_rule__MulExpr__Group_1__08158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Alternatives_1_0_in_rule__MulExpr__Group_1__0__Impl8185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__1__Impl_in_rule__MulExpr__Group_1__18215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__AtomsAssignment_1_1_in_rule__MulExpr__Group_1__1__Impl8242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__0__Impl_in_rule__Atom__Group_0__08276 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__1_in_rule__Atom__Group_0__08279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Atom__Group_0__0__Impl8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__1__Impl_in_rule__Atom__Group_0__18338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__Atom__Group_0__1__Impl8365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__08398 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__08401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Atom__Group_1__0__Impl8429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__18460 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__18463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGN_in_rule__Atom__Group_1__1__Impl8490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__28519 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__3_in_rule__Atom__Group_1__28522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Atom__Group_1__2__Impl8549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__3__Impl_in_rule__Atom__Group_1__38578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atom__Group_1__3__Impl8606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__0__Impl_in_rule__Atom__Group_2__08645 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__1_in_rule__Atom__Group_2__08648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Atom__Group_2__0__Impl8676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__1__Impl_in_rule__Atom__Group_2__18707 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__2_in_rule__Atom__Group_2__18710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Atom__Group_2__1__Impl8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__2__Impl_in_rule__Atom__Group_2__28766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atom__Group_2__2__Impl8794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__08831 = new BitSet(new long[]{0x00030000030000C0L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__08834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__18892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__ConstantsAssignment_4_1_in_rule__Atom__Group_4__1__Impl8919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__0__Impl_in_rule__PostfixExpr__Group__08953 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__1_in_rule__PostfixExpr__Group__08956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__1__Impl_in_rule__PostfixExpr__Group__19014 = new BitSet(new long[]{0x0000300010000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__2_in_rule__PostfixExpr__Group__19017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Alternatives_1_in_rule__PostfixExpr__Group__1__Impl9044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__2__Impl_in_rule__PostfixExpr__Group__29074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Alternatives_2_in_rule__PostfixExpr__Group__2__Impl9101 = new BitSet(new long[]{0x0000300010000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_0__0__Impl_in_rule__PostfixExpr__Group_2_0__09138 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_0__1_in_rule__PostfixExpr__Group_2_0__09141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__PostfixExpr__Group_2_0__0__Impl9169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_0__1__Impl_in_rule__PostfixExpr__Group_2_0__19200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__Group_2_0__1__Impl9227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1__0__Impl_in_rule__PostfixExpr__Group_2_1__09260 = new BitSet(new long[]{0x00030800330000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1__1_in_rule__PostfixExpr__Group_2_1__09263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__PostfixExpr__Group_2_1__0__Impl9291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1__1__Impl_in_rule__PostfixExpr__Group_2_1__19322 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1__2_in_rule__PostfixExpr__Group_2_1__19325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1_1__0_in_rule__PostfixExpr__Group_2_1__1__Impl9352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1__2__Impl_in_rule__PostfixExpr__Group_2_1__29383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PostfixExpr__Group_2_1__2__Impl9411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1_1__0__Impl_in_rule__PostfixExpr__Group_2_1_1__09448 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1_1__1_in_rule__PostfixExpr__Group_2_1_1__09451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_2_1_1_0_in_rule__PostfixExpr__Group_2_1_1__0__Impl9478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1_1__1__Impl_in_rule__PostfixExpr__Group_2_1_1__19508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1_1_1__0_in_rule__PostfixExpr__Group_2_1_1__1__Impl9535 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1_1_1__0__Impl_in_rule__PostfixExpr__Group_2_1_1_1__09570 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1_1_1__1_in_rule__PostfixExpr__Group_2_1_1_1__09573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PostfixExpr__Group_2_1_1_1__0__Impl9601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_1_1_1__1__Impl_in_rule__PostfixExpr__Group_2_1_1_1__19632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_1_in_rule__PostfixExpr__Group_2_1_1_1__1__Impl9659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_2__0__Impl_in_rule__PostfixExpr__Group_2_2__09693 = new BitSet(new long[]{0x00030800130000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_2__1_in_rule__PostfixExpr__Group_2_2__09696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__PostfixExpr__Group_2_2__0__Impl9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_2__1__Impl_in_rule__PostfixExpr__Group_2_2__19755 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_2__2_in_rule__PostfixExpr__Group_2_2__19758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_2_2_1_in_rule__PostfixExpr__Group_2_2__1__Impl9785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_2_2__2__Impl_in_rule__PostfixExpr__Group_2_2__29815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__PostfixExpr__Group_2_2__2__Impl9843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__09880 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__09883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__RealAssignment_0_in_rule__Real__Group__0__Impl9910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__19940 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__19943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Real__Group__1__Impl9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__210002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__RealAssignment_2_in_rule__Real__Group__2__Impl10031 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__Real__RealAssignment_2_in_rule__Real__Group__2__Impl10043 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_rule__Model__FunctionsAssignment_010087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemainFunction_in_rule__Model__MainAssignment_110118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_010149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_rule__FunctionDefinition__FormalParamsAssignment_210180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__FunctionDefinition__ReturnTypeAssignment_4_110211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__FunctionDefinition__BlocksAssignment_510242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__MainFunction__MainAssignment_010278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_rule__MainFunction__FormalParamsAssignment_210317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__MainFunction__BlocksAssignment_410348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_010379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_1_110410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Param__NameAssignment_110441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Block__StatementsAssignment_210472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypesAlternatives_0_in_rule__Type__TypesAssignment10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Statement__PostFixExpressionAssignment_2_110536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_rule__Statement__AssignmentsAssignment_3_110567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_4_210598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_5_310629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_5_4_110660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_6_310691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_6_510722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_7_310753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionCall__FunctionAssignment_010788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__FunctionCall__ExprsAssignment_2_010823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__FunctionCall__ExprsAssignment_2_1_110854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Declaration__VariableTypeAssignment_0_010885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_110916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Declaration__ExprsAssignment_2_110947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Assignment__ExprsAssignment_210978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_rule__Expr__AndExprsAssignment_1_111009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_rule__AndExpr__EqExprsAssignment_1_111040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_rule__EqExpr__RelExprsAssignment_1_111071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rule__RelExpr__AddExprAssignment_1_111102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_rule__AddExpr__MulExprsAssignment_1_111133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_011164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_1_111195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rule__Atom__ConstantsAssignment_4_111226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_1_011261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_1_111300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_2_1_1_011335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_2_1_1_1_111366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_2_2_111397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulereal_in_rule__Constant__RealAssignment_211428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Constant__IntegerAssignment_311459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constant__StringAssignment_411490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Constant__NullAssignment_511526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Constant__InfinityAssignment_611570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Real__RealAssignment_011609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Real__RealAssignment_211640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulefunctionCall_in_synpred41489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_synpred51506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_synpred61524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_1_0_in_synpred211975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5_4__0_in_synpred384844 = new BitSet(new long[]{0x0000000000000002L});

}