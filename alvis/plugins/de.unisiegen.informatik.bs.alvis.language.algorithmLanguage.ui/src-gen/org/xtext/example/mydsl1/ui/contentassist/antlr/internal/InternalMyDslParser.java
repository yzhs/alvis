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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIGN", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'begin'", "'{'", "'end'", "'}'", "'String'", "'Integer'", "'Boolean'", "'Graph'", "'Vertex'", "'Edge'", "'Queue'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'%'", "','", "';'", "'('", "')'", "':'", "'return'", "'if'", "'else'", "'for'", "'in'", "'while'", "'[]'", "'='", "'||'", "'&&'", "'!'", "'.'", "'['", "']'", "'true'", "'false'", "'main'", "'null'", "'infty'"
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
            ruleMemo = new HashMap[398+1];
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


    // $ANTLR start entryRuledeclaration
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:286:1: entryRuledeclaration : ruledeclaration EOF ;
    public final void entryRuledeclaration() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:287:1: ( ruledeclaration EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:288:1: ruledeclaration EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_entryRuledeclaration547);
            ruledeclaration();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuledeclaration554); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:295:1: ruledeclaration : ( ( rule__Declaration__Group__0 ) ) ;
    public final void ruledeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:299:2: ( ( ( rule__Declaration__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( ( rule__Declaration__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:300:1: ( ( rule__Declaration__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:301:1: ( rule__Declaration__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:302:1: ( rule__Declaration__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:302:2: rule__Declaration__Group__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0_in_ruledeclaration580);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:314:1: entryRuleassignment : ruleassignment EOF ;
    public final void entryRuleassignment() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:315:1: ( ruleassignment EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:316:1: ruleassignment EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleassignment_in_entryRuleassignment607);
            ruleassignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAssignmentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleassignment614); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:323:1: ruleassignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleassignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:327:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:328:1: ( ( rule__Assignment__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:329:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:330:1: ( rule__Assignment__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:330:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleassignment640);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:342:1: entryRuleexpr : ruleexpr EOF ;
    public final void entryRuleexpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:343:1: ( ruleexpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:344:1: ruleexpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprRule()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_entryRuleexpr667);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleexpr674); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:351:1: ruleexpr : ( ( rule__Expr__Group__0 ) ) ;
    public final void ruleexpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:355:2: ( ( ( rule__Expr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( ( rule__Expr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:356:1: ( ( rule__Expr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:357:1: ( rule__Expr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:358:1: ( rule__Expr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:358:2: rule__Expr__Group__0
            {
            pushFollow(FOLLOW_rule__Expr__Group__0_in_ruleexpr700);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:370:1: entryRuleandExpr : ruleandExpr EOF ;
    public final void entryRuleandExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:371:1: ( ruleandExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:372:1: ruleandExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_entryRuleandExpr727);
            ruleandExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAndExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleandExpr734); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:379:1: ruleandExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleandExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:383:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:384:1: ( ( rule__AndExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:385:1: ( rule__AndExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:386:1: ( rule__AndExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:386:2: rule__AndExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0_in_ruleandExpr760);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:398:1: entryRuleeqExpr : ruleeqExpr EOF ;
    public final void entryRuleeqExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:399:1: ( ruleeqExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:400:1: ruleeqExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprRule()); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_entryRuleeqExpr787);
            ruleeqExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEqExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleeqExpr794); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:407:1: ruleeqExpr : ( ( rule__EqExpr__Group__0 ) ) ;
    public final void ruleeqExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:411:2: ( ( ( rule__EqExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( ( rule__EqExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:412:1: ( ( rule__EqExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:413:1: ( rule__EqExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:414:1: ( rule__EqExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:414:2: rule__EqExpr__Group__0
            {
            pushFollow(FOLLOW_rule__EqExpr__Group__0_in_ruleeqExpr820);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:426:1: entryRulerelExpr : rulerelExpr EOF ;
    public final void entryRulerelExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:427:1: ( rulerelExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:428:1: rulerelExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprRule()); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_entryRulerelExpr847);
            rulerelExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getRelExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulerelExpr854); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:435:1: rulerelExpr : ( ( rule__RelExpr__Group__0 ) ) ;
    public final void rulerelExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:439:2: ( ( ( rule__RelExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( ( rule__RelExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:440:1: ( ( rule__RelExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:441:1: ( rule__RelExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:442:1: ( rule__RelExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:442:2: rule__RelExpr__Group__0
            {
            pushFollow(FOLLOW_rule__RelExpr__Group__0_in_rulerelExpr880);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:454:1: entryRuleaddExpr : ruleaddExpr EOF ;
    public final void entryRuleaddExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:455:1: ( ruleaddExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:456:1: ruleaddExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprRule()); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_entryRuleaddExpr907);
            ruleaddExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAddExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleaddExpr914); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:463:1: ruleaddExpr : ( ( rule__AddExpr__Group__0 ) ) ;
    public final void ruleaddExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:467:2: ( ( ( rule__AddExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( rule__AddExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:468:1: ( ( rule__AddExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:469:1: ( rule__AddExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:470:1: ( rule__AddExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:470:2: rule__AddExpr__Group__0
            {
            pushFollow(FOLLOW_rule__AddExpr__Group__0_in_ruleaddExpr940);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:482:1: entryRulemulExpr : rulemulExpr EOF ;
    public final void entryRulemulExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:483:1: ( rulemulExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:484:1: rulemulExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprRule()); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_entryRulemulExpr967);
            rulemulExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getMulExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulemulExpr974); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:491:1: rulemulExpr : ( ( rule__MulExpr__Group__0 ) ) ;
    public final void rulemulExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:495:2: ( ( ( rule__MulExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__MulExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:496:1: ( ( rule__MulExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:497:1: ( rule__MulExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:498:1: ( rule__MulExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:498:2: rule__MulExpr__Group__0
            {
            pushFollow(FOLLOW_rule__MulExpr__Group__0_in_rulemulExpr1000);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:510:1: entryRuleatom : ruleatom EOF ;
    public final void entryRuleatom() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:511:1: ( ruleatom EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:512:1: ruleatom EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomRule()); 
            }
            pushFollow(FOLLOW_ruleatom_in_entryRuleatom1027);
            ruleatom();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getAtomRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleatom1034); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:519:1: ruleatom : ( ( rule__Atom__Alternatives ) ) ;
    public final void ruleatom() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:523:2: ( ( ( rule__Atom__Alternatives ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( ( rule__Atom__Alternatives ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:524:1: ( ( rule__Atom__Alternatives ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:525:1: ( rule__Atom__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAlternatives()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:526:1: ( rule__Atom__Alternatives )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:526:2: rule__Atom__Alternatives
            {
            pushFollow(FOLLOW_rule__Atom__Alternatives_in_ruleatom1060);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:538:1: entryRulepostfixExpr : rulepostfixExpr EOF ;
    public final void entryRulepostfixExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:539:1: ( rulepostfixExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:540:1: rulepostfixExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprRule()); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr1087);
            rulepostfixExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulepostfixExpr1094); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:547:1: rulepostfixExpr : ( ( rule__PostfixExpr__Group__0 ) ) ;
    public final void rulepostfixExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:551:2: ( ( ( rule__PostfixExpr__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rule__PostfixExpr__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:552:1: ( ( rule__PostfixExpr__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:553:1: ( rule__PostfixExpr__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:554:1: ( rule__PostfixExpr__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:554:2: rule__PostfixExpr__Group__0
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__0_in_rulepostfixExpr1120);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:566:1: entryRuleconstant : ruleconstant EOF ;
    public final void entryRuleconstant() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:567:1: ( ruleconstant EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:568:1: ruleconstant EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_ruleconstant_in_entryRuleconstant1147);
            ruleconstant();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleconstant1154); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:575:1: ruleconstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleconstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:579:2: ( ( ( rule__Constant__Alternatives ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( ( rule__Constant__Alternatives ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:580:1: ( ( rule__Constant__Alternatives ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:581:1: ( rule__Constant__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getAlternatives()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:582:1: ( rule__Constant__Alternatives )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:582:2: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_rule__Constant__Alternatives_in_ruleconstant1180);
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


    // $ANTLR start entryRuleFLOAT
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:594:1: entryRuleFLOAT : ruleFLOAT EOF ;
    public final void entryRuleFLOAT() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:595:1: ( ruleFLOAT EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:596:1: ruleFLOAT EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATRule()); 
            }
            pushFollow(FOLLOW_ruleFLOAT_in_entryRuleFLOAT1207);
            ruleFLOAT();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFLOAT1214); if (failed) return ;

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
    // $ANTLR end entryRuleFLOAT


    // $ANTLR start ruleFLOAT
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:603:1: ruleFLOAT : ( ( rule__FLOAT__Group__0 ) ) ;
    public final void ruleFLOAT() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:607:2: ( ( ( rule__FLOAT__Group__0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ( rule__FLOAT__Group__0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:608:1: ( ( rule__FLOAT__Group__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:609:1: ( rule__FLOAT__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getGroup()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:610:1: ( rule__FLOAT__Group__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:610:2: rule__FLOAT__Group__0
            {
            pushFollow(FOLLOW_rule__FLOAT__Group__0_in_ruleFLOAT1240);
            rule__FLOAT__Group__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getGroup()); 
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
    // $ANTLR end ruleFLOAT


    // $ANTLR start entryRuleendExpr
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:622:1: entryRuleendExpr : ruleendExpr EOF ;
    public final void entryRuleendExpr() throws RecognitionException {
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:623:1: ( ruleendExpr EOF )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:624:1: ruleendExpr EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEndExprRule()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_entryRuleendExpr1267);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getEndExprRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleendExpr1274); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:631:1: ruleendExpr : ( ( rule__EndExpr__Alternatives ) ) ;
    public final void ruleendExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:635:2: ( ( ( rule__EndExpr__Alternatives ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( rule__EndExpr__Alternatives ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:636:1: ( ( rule__EndExpr__Alternatives ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:637:1: ( rule__EndExpr__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEndExprAccess().getAlternatives()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:638:1: ( rule__EndExpr__Alternatives )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:638:2: rule__EndExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__EndExpr__Alternatives_in_ruleendExpr1300);
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


    // $ANTLR start rule__Block__Alternatives_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: rule__Block__Alternatives_1 : ( ( 'begin' ) | ( '{' ) );
    public final void rule__Block__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ( ( 'begin' ) | ( '{' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( (LA1_0==13) ) {
                alt1=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("650:1: rule__Block__Alternatives_1 : ( ( 'begin' ) | ( '{' ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: ( 'begin' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: ( 'begin' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: 'begin'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getBeginKeyword_1_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Block__Alternatives_11337); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getBeginKeyword_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:663:6: ( '{' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:663:6: ( '{' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: '{'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Block__Alternatives_11357); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1_1()); 
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
    // $ANTLR end rule__Block__Alternatives_1


    // $ANTLR start rule__Block__Alternatives_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:676:1: rule__Block__Alternatives_3 : ( ( 'end' ) | ( '}' ) );
    public final void rule__Block__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: ( ( 'end' ) | ( '}' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("676:1: rule__Block__Alternatives_3 : ( ( 'end' ) | ( '}' ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: ( 'end' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:681:1: ( 'end' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:682:1: 'end'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getEndKeyword_3_0()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Block__Alternatives_31392); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getEndKeyword_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:689:6: ( '}' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:689:6: ( '}' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:690:1: '}'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Block__Alternatives_31412); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_1()); 
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
    // $ANTLR end rule__Block__Alternatives_3


    // $ANTLR start rule__Type__TypesAlternatives_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:702:1: rule__Type__TypesAlternatives_0 : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Graph' ) | ( 'Vertex' ) | ( 'Edge' ) | ( 'Queue' ) );
    public final void rule__Type__TypesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:706:1: ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Graph' ) | ( 'Vertex' ) | ( 'Edge' ) | ( 'Queue' ) )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            case 22:
                {
                alt3=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("702:1: rule__Type__TypesAlternatives_0 : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Graph' ) | ( 'Vertex' ) | ( 'Edge' ) | ( 'Queue' ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( 'String' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:707:1: ( 'String' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: 'String'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesStringKeyword_0_0()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Type__TypesAlternatives_01447); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesStringKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:715:6: ( 'Integer' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:715:6: ( 'Integer' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:716:1: 'Integer'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesIntegerKeyword_0_1()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Type__TypesAlternatives_01467); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesIntegerKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( 'Boolean' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:723:6: ( 'Boolean' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:724:1: 'Boolean'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesBooleanKeyword_0_2()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__Type__TypesAlternatives_01487); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesBooleanKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:6: ( 'Graph' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:6: ( 'Graph' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: 'Graph'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesGraphKeyword_0_3()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__Type__TypesAlternatives_01507); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesGraphKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:6: ( 'Vertex' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:6: ( 'Vertex' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:740:1: 'Vertex'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesVertexKeyword_0_4()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__Type__TypesAlternatives_01527); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesVertexKeyword_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( 'Edge' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:747:6: ( 'Edge' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:748:1: 'Edge'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesEdgeKeyword_0_5()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__Type__TypesAlternatives_01547); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesEdgeKeyword_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:755:6: ( 'Queue' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:755:6: ( 'Queue' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: 'Queue'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesQueueKeyword_0_6()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__Type__TypesAlternatives_01567); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesQueueKeyword_0_6()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:768:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ruleblock ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ruleblock ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred9()) ) {
                    alt4=1;
                }
                else if ( (synpred11()) ) {
                    alt4=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("768:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ruleblock ) );", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=4;
                }
                break;
            case 38:
                {
                alt4=5;
                }
                break;
            case 40:
                {
                alt4=6;
                }
                break;
            case 42:
                {
                alt4=7;
                }
                break;
            case 12:
            case 13:
                {
                alt4=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("768:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ruleblock ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( rule__Statement__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rule__Statement__Group_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:775:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1601);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:779:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:779:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:781:1: ( rule__Statement__Group_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:781:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1619);
                    rule__Statement__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ( rule__Statement__Group_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:787:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1637);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:791:6: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:791:6: ( ( rule__Statement__Group_3__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: ( rule__Statement__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_3()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:793:1: ( rule__Statement__Group_3__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:793:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1655);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:6: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:6: ( ( rule__Statement__Group_4__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: ( rule__Statement__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:799:1: ( rule__Statement__Group_4__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:799:2: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1673);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:803:6: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:803:6: ( ( rule__Statement__Group_5__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:804:1: ( rule__Statement__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:805:1: ( rule__Statement__Group_5__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:805:2: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives1691);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:809:6: ( ( rule__Statement__Group_6__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:809:6: ( ( rule__Statement__Group_6__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:810:1: ( rule__Statement__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_6()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:811:1: ( rule__Statement__Group_6__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:811:2: rule__Statement__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_6__0_in_rule__Statement__Alternatives1709);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:815:6: ( ruleblock )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:815:6: ( ruleblock )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:816:1: ruleblock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getBlockParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleblock_in_rule__Statement__Alternatives1727);
                    ruleblock();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getStatementAccess().getBlockParserRuleCall_7()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:826:1: rule__EqExpr__Alternatives_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__EqExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:830:1: ( ( '==' ) | ( '!=' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==24) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("826:1: rule__EqExpr__Alternatives_1_0 : ( ( '==' ) | ( '!=' ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( '==' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:831:1: ( '==' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:832:1: '=='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__EqExpr__Alternatives_1_01760); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:839:6: ( '!=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:839:6: ( '!=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: '!='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEqExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__EqExpr__Alternatives_1_01780); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:852:1: rule__RelExpr__Alternatives_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__RelExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt6=1;
                }
                break;
            case 26:
                {
                alt6=2;
                }
                break;
            case 27:
                {
                alt6=3;
                }
                break;
            case 28:
                {
                alt6=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("852:1: rule__RelExpr__Alternatives_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( '<' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:857:1: ( '<' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:858:1: '<'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__RelExpr__Alternatives_1_01815); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:865:6: ( '>' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:865:6: ( '>' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:866:1: '>'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__RelExpr__Alternatives_1_01835); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:873:6: ( '<=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:873:6: ( '<=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: '<='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__RelExpr__Alternatives_1_01855); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:6: ( '>=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:6: ( '>=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:882:1: '>='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getGreaterThanSignEqualsSignKeyword_1_0_3()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__RelExpr__Alternatives_1_01875); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:894:1: rule__MulExpr__Alternatives_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MulExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 30:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("894:1: rule__MulExpr__Alternatives_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( '*' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( '*' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:900:1: '*'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0()); 
                    }
                    match(input,29,FOLLOW_29_in_rule__MulExpr__Alternatives_1_01910); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:907:6: ( '/' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:907:6: ( '/' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: '/'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1()); 
                    }
                    match(input,30,FOLLOW_30_in_rule__MulExpr__Alternatives_1_01930); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:915:6: ( '%' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:915:6: ( '%' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:916:1: '%'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getPercentSignKeyword_1_0_2()); 
                    }
                    match(input,31,FOLLOW_31_in_rule__MulExpr__Alternatives_1_01950); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:928:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:932:1: ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_SIGN) ) {
                    alt8=2;
                }
                else if ( ((LA8_2>=RULE_ID && LA8_2<=RULE_STRING)||LA8_2==34||LA8_2==47||(LA8_2>=51 && LA8_2<=52)||(LA8_2>=54 && LA8_2<=55)) ) {
                    alt8=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("928:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                alt8=4;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case 51:
            case 52:
            case 54:
            case 55:
                {
                alt8=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("928:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( ( rule__Atom__Group_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:933:1: ( ( rule__Atom__Group_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:934:1: ( rule__Atom__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:935:1: ( rule__Atom__Group_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:935:2: rule__Atom__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_0__0_in_rule__Atom__Alternatives1984);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:939:6: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:939:6: ( ( rule__Atom__Group_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( rule__Atom__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( rule__Atom__Group_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:941:2: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives2002);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:945:6: ( ( rule__Atom__Group_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:945:6: ( ( rule__Atom__Group_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:946:1: ( rule__Atom__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:947:1: ( rule__Atom__Group_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:947:2: rule__Atom__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_2__0_in_rule__Atom__Alternatives2020);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:951:6: ( rulepostfixExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:951:6: ( rulepostfixExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:952:1: rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getPostfixExprParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_rule__Atom__Alternatives2038);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:957:6: ( ( rule__Atom__Group_4__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:957:6: ( ( rule__Atom__Group_4__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:958:1: ( rule__Atom__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:959:1: ( rule__Atom__Group_4__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:959:2: rule__Atom__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives2055);
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


    // $ANTLR start rule__PostfixExpr__Alternatives_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: rule__PostfixExpr__Alternatives_0 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) ) );
    public final void rule__PostfixExpr__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:972:1: ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (synpred26()) ) {
                    alt9=1;
                }
                else if ( (synpred27()) ) {
                    alt9=2;
                }
                else if ( (true) ) {
                    alt9=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("968:1: rule__PostfixExpr__Alternatives_0 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) ) );", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("968:1: rule__PostfixExpr__Alternatives_0 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:2: rule__PostfixExpr__ExistingVariableAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_0_in_rule__PostfixExpr__Alternatives_02088);
                    rule__PostfixExpr__ExistingVariableAssignment_0_0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:979:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:979:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_1 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:2: rule__PostfixExpr__ExistingVariableAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_1_in_rule__PostfixExpr__Alternatives_02106);
                    rule__PostfixExpr__ExistingVariableAssignment_0_1();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:985:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:985:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:986:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:987:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_2 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:987:2: rule__PostfixExpr__ExistingVariableAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_2_in_rule__PostfixExpr__Alternatives_02124);
                    rule__PostfixExpr__ExistingVariableAssignment_0_2();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_2()); 
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
    // $ANTLR end rule__PostfixExpr__Alternatives_0


    // $ANTLR start rule__PostfixExpr__Alternatives_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:996:1: rule__PostfixExpr__Alternatives_1 : ( ( ( rule__PostfixExpr__Group_1_0__0 ) ) | ( ( rule__PostfixExpr__Group_1_1__0 ) ) | ( ( rule__PostfixExpr__Group_1_2__0 ) ) );
    public final void rule__PostfixExpr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( ( ( rule__PostfixExpr__Group_1_0__0 ) ) | ( ( rule__PostfixExpr__Group_1_1__0 ) ) | ( ( rule__PostfixExpr__Group_1_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt10=1;
                }
                break;
            case 34:
                {
                alt10=2;
                }
                break;
            case 49:
                {
                alt10=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("996:1: rule__PostfixExpr__Alternatives_1 : ( ( ( rule__PostfixExpr__Group_1_0__0 ) ) | ( ( rule__PostfixExpr__Group_1_1__0 ) ) | ( ( rule__PostfixExpr__Group_1_2__0 ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( ( rule__PostfixExpr__Group_1_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( ( rule__PostfixExpr__Group_1_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1002:1: ( rule__PostfixExpr__Group_1_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_1_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:1: ( rule__PostfixExpr__Group_1_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1003:2: rule__PostfixExpr__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_0__0_in_rule__PostfixExpr__Alternatives_12157);
                    rule__PostfixExpr__Group_1_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:6: ( ( rule__PostfixExpr__Group_1_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:6: ( ( rule__PostfixExpr__Group_1_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1008:1: ( rule__PostfixExpr__Group_1_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_1_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:1: ( rule__PostfixExpr__Group_1_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1009:2: rule__PostfixExpr__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__0_in_rule__PostfixExpr__Alternatives_12175);
                    rule__PostfixExpr__Group_1_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:6: ( ( rule__PostfixExpr__Group_1_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1013:6: ( ( rule__PostfixExpr__Group_1_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1014:1: ( rule__PostfixExpr__Group_1_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_1_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:1: ( rule__PostfixExpr__Group_1_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1015:2: rule__PostfixExpr__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__0_in_rule__PostfixExpr__Alternatives_12193);
                    rule__PostfixExpr__Group_1_2__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getPostfixExprAccess().getGroup_1_2()); 
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


    // $ANTLR start rule__Constant__Alternatives
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1024:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__FloatAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1028:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__FloatAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt11=1;
                }
                break;
            case 52:
                {
                alt11=2;
                }
                break;
            case RULE_INT:
                {
                int LA11_3 = input.LA(2);

                if ( (LA11_3==48) ) {
                    alt11=3;
                }
                else if ( (LA11_3==EOF||LA11_3==RULE_SIGN||(LA11_3>=23 && LA11_3<=33)||(LA11_3>=35 && LA11_3<=36)||(LA11_3>=45 && LA11_3<=46)||LA11_3==50) ) {
                    alt11=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1024:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__FloatAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt11=5;
                }
                break;
            case 54:
                {
                alt11=6;
                }
                break;
            case 55:
                {
                alt11=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1024:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__FloatAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:1: ( ( rule__Constant__Group_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ( rule__Constant__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getGroup_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:1: ( rule__Constant__Group_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1031:2: rule__Constant__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_0__0_in_rule__Constant__Alternatives2226);
                    rule__Constant__Group_0__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:6: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1035:6: ( ( rule__Constant__Group_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1036:1: ( rule__Constant__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getGroup_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:1: ( rule__Constant__Group_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1037:2: rule__Constant__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_1__0_in_rule__Constant__Alternatives2244);
                    rule__Constant__Group_1__0();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:6: ( ( rule__Constant__FloatAssignment_2 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1041:6: ( ( rule__Constant__FloatAssignment_2 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1042:1: ( rule__Constant__FloatAssignment_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getFloatAssignment_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:1: ( rule__Constant__FloatAssignment_2 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1043:2: rule__Constant__FloatAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Constant__FloatAssignment_2_in_rule__Constant__Alternatives2262);
                    rule__Constant__FloatAssignment_2();
                    _fsp--;
                    if (failed) return ;

                    }

                    if ( backtracking==0 ) {
                       after(grammarAccess.getConstantAccess().getFloatAssignment_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:6: ( ( rule__Constant__IntegerAssignment_3 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1047:6: ( ( rule__Constant__IntegerAssignment_3 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ( rule__Constant__IntegerAssignment_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getIntegerAssignment_3()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:1: ( rule__Constant__IntegerAssignment_3 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:2: rule__Constant__IntegerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constant__IntegerAssignment_3_in_rule__Constant__Alternatives2280);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:6: ( ( rule__Constant__StringAssignment_4 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1053:6: ( ( rule__Constant__StringAssignment_4 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1054:1: ( rule__Constant__StringAssignment_4 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringAssignment_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:1: ( rule__Constant__StringAssignment_4 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1055:2: rule__Constant__StringAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Constant__StringAssignment_4_in_rule__Constant__Alternatives2298);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:6: ( ( rule__Constant__NullAssignment_5 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1059:6: ( ( rule__Constant__NullAssignment_5 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( rule__Constant__NullAssignment_5 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNullAssignment_5()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ( rule__Constant__NullAssignment_5 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:2: rule__Constant__NullAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Constant__NullAssignment_5_in_rule__Constant__Alternatives2316);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:6: ( ( rule__Constant__InfinityAssignment_6 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1065:6: ( ( rule__Constant__InfinityAssignment_6 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1066:1: ( rule__Constant__InfinityAssignment_6 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getInfinityAssignment_6()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:1: ( rule__Constant__InfinityAssignment_6 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1067:2: rule__Constant__InfinityAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Constant__InfinityAssignment_6_in_rule__Constant__Alternatives2334);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1076:1: rule__EndExpr__Alternatives : ( ( ',' ) | ( ';' ) );
    public final void rule__EndExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1080:1: ( ( ',' ) | ( ';' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            else if ( (LA12_0==33) ) {
                alt12=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1076:1: rule__EndExpr__Alternatives : ( ( ',' ) | ( ';' ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ',' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1081:1: ( ',' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1082:1: ','
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEndExprAccess().getCommaKeyword_0()); 
                    }
                    match(input,32,FOLLOW_32_in_rule__EndExpr__Alternatives2368); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEndExprAccess().getCommaKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:6: ( ';' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:6: ( ';' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ';'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEndExprAccess().getSemicolonKeyword_1()); 
                    }
                    match(input,33,FOLLOW_33_in_rule__EndExpr__Alternatives2388); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1104:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1108:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02420);
            rule__Model__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02423);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1116:1: rule__Model__Group__0__Impl : ( ( rule__Model__FunctionsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1120:1: ( ( ( rule__Model__FunctionsAssignment_0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( ( rule__Model__FunctionsAssignment_0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( ( rule__Model__FunctionsAssignment_0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: ( rule__Model__FunctionsAssignment_0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: ( rule__Model__FunctionsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:2: rule__Model__FunctionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__FunctionsAssignment_0_in_rule__Model__Group__0__Impl2450);
            	    rule__Model__FunctionsAssignment_0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1133:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1137:1: ( rule__Model__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12481);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1144:1: rule__Model__Group__1__Impl : ( ( rule__Model__MainAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1148:1: ( ( ( rule__Model__MainAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( ( rule__Model__MainAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1149:1: ( ( rule__Model__MainAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( rule__Model__MainAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMainAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( rule__Model__MainAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:2: rule__Model__MainAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__MainAssignment_1_in_rule__Model__Group__1__Impl2508);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: rule__FunctionDefinition__Group__0 : rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 ;
    public final void rule__FunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:2: rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02542);
            rule__FunctionDefinition__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02545);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: rule__FunctionDefinition__Group__0__Impl : ( ( rule__FunctionDefinition__NameAssignment_0 ) ) ;
    public final void rule__FunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( ( ( rule__FunctionDefinition__NameAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( ( rule__FunctionDefinition__NameAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( ( rule__FunctionDefinition__NameAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: ( rule__FunctionDefinition__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: ( rule__FunctionDefinition__NameAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:2: rule__FunctionDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__NameAssignment_0_in_rule__FunctionDefinition__Group__0__Impl2572);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: rule__FunctionDefinition__Group__1 : rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 ;
    public final void rule__FunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: ( rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:2: rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12602);
            rule__FunctionDefinition__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12605);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: rule__FunctionDefinition__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__FunctionDefinition__Group__1__Impl2633); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: rule__FunctionDefinition__Group__2 : rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 ;
    public final void rule__FunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:2: rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22664);
            rule__FunctionDefinition__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22667);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: rule__FunctionDefinition__Group__2__Impl : ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? ) ;
    public final void rule__FunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: ( ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:1: ( rule__FunctionDefinition__FormalParamsAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getFormalParamsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( rule__FunctionDefinition__FormalParamsAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=16 && LA14_0<=22)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:2: rule__FunctionDefinition__FormalParamsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__FormalParamsAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2694);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: rule__FunctionDefinition__Group__3 : rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 ;
    public final void rule__FunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:2: rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32725);
            rule__FunctionDefinition__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32728);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1266:1: rule__FunctionDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__FunctionDefinition__Group__3__Impl2756); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1285:1: rule__FunctionDefinition__Group__4 : rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 ;
    public final void rule__FunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1289:1: ( rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1290:2: rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42787);
            rule__FunctionDefinition__Group__4__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42790);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1297:1: rule__FunctionDefinition__Group__4__Impl : ( ( rule__FunctionDefinition__Group_4__0 )? ) ;
    public final void rule__FunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1301:1: ( ( ( rule__FunctionDefinition__Group_4__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( ( rule__FunctionDefinition__Group_4__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1302:1: ( ( rule__FunctionDefinition__Group_4__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1303:1: ( rule__FunctionDefinition__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getGroup_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:1: ( rule__FunctionDefinition__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==36) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1304:2: rule__FunctionDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__0_in_rule__FunctionDefinition__Group__4__Impl2817);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1314:1: rule__FunctionDefinition__Group__5 : rule__FunctionDefinition__Group__5__Impl ;
    public final void rule__FunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1318:1: ( rule__FunctionDefinition__Group__5__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1319:2: rule__FunctionDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52848);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: rule__FunctionDefinition__Group__5__Impl : ( ( rule__FunctionDefinition__BlocksAssignment_5 ) ) ;
    public final void rule__FunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( ( ( rule__FunctionDefinition__BlocksAssignment_5 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( ( rule__FunctionDefinition__BlocksAssignment_5 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:1: ( ( rule__FunctionDefinition__BlocksAssignment_5 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1331:1: ( rule__FunctionDefinition__BlocksAssignment_5 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getBlocksAssignment_5()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:1: ( rule__FunctionDefinition__BlocksAssignment_5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1332:2: rule__FunctionDefinition__BlocksAssignment_5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__BlocksAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2875);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1354:1: rule__FunctionDefinition__Group_4__0 : rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1 ;
    public final void rule__FunctionDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1358:1: ( rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1359:2: rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__0__Impl_in_rule__FunctionDefinition__Group_4__02917);
            rule__FunctionDefinition__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__1_in_rule__FunctionDefinition__Group_4__02920);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1366:1: rule__FunctionDefinition__Group_4__0__Impl : ( ':' ) ;
    public final void rule__FunctionDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1370:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1371:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1372:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getColonKeyword_4_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__FunctionDefinition__Group_4__0__Impl2948); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1385:1: rule__FunctionDefinition__Group_4__1 : rule__FunctionDefinition__Group_4__1__Impl ;
    public final void rule__FunctionDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1389:1: ( rule__FunctionDefinition__Group_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:2: rule__FunctionDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__1__Impl_in_rule__FunctionDefinition__Group_4__12979);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1396:1: rule__FunctionDefinition__Group_4__1__Impl : ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) ) ;
    public final void rule__FunctionDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1400:1: ( ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1401:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:2: rule__FunctionDefinition__ReturnTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_4_1_in_rule__FunctionDefinition__Group_4__1__Impl3006);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: rule__MainFunction__Group__0 : rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 ;
    public final void rule__MainFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:2: rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__0__Impl_in_rule__MainFunction__Group__03040);
            rule__MainFunction__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__1_in_rule__MainFunction__Group__03043);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: rule__MainFunction__Group__0__Impl : ( ( rule__MainFunction__MainAssignment_0 ) ) ;
    public final void rule__MainFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: ( ( ( rule__MainFunction__MainAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( ( rule__MainFunction__MainAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( ( rule__MainFunction__MainAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( rule__MainFunction__MainAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( rule__MainFunction__MainAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:2: rule__MainFunction__MainAssignment_0
            {
            pushFollow(FOLLOW_rule__MainFunction__MainAssignment_0_in_rule__MainFunction__Group__0__Impl3070);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: rule__MainFunction__Group__1 : rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 ;
    public final void rule__MainFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:2: rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__1__Impl_in_rule__MainFunction__Group__13100);
            rule__MainFunction__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__2_in_rule__MainFunction__Group__13103);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: rule__MainFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__MainFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1462:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__MainFunction__Group__1__Impl3131); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: rule__MainFunction__Group__2 : rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 ;
    public final void rule__MainFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:2: rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__2__Impl_in_rule__MainFunction__Group__23162);
            rule__MainFunction__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__3_in_rule__MainFunction__Group__23165);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1489:1: rule__MainFunction__Group__2__Impl : ( ( rule__MainFunction__FormalParamsAssignment_2 )? ) ;
    public final void rule__MainFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: ( ( ( rule__MainFunction__FormalParamsAssignment_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( ( rule__MainFunction__FormalParamsAssignment_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( ( rule__MainFunction__FormalParamsAssignment_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( rule__MainFunction__FormalParamsAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getFormalParamsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:1: ( rule__MainFunction__FormalParamsAssignment_2 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=16 && LA16_0<=22)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1496:2: rule__MainFunction__FormalParamsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MainFunction__FormalParamsAssignment_2_in_rule__MainFunction__Group__2__Impl3192);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1506:1: rule__MainFunction__Group__3 : rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 ;
    public final void rule__MainFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1510:1: ( rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1511:2: rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__3__Impl_in_rule__MainFunction__Group__33223);
            rule__MainFunction__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__4_in_rule__MainFunction__Group__33226);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1518:1: rule__MainFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__MainFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1522:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1523:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1524:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__MainFunction__Group__3__Impl3254); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1537:1: rule__MainFunction__Group__4 : rule__MainFunction__Group__4__Impl ;
    public final void rule__MainFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1541:1: ( rule__MainFunction__Group__4__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1542:2: rule__MainFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__4__Impl_in_rule__MainFunction__Group__43285);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: rule__MainFunction__Group__4__Impl : ( ( rule__MainFunction__BlocksAssignment_4 ) ) ;
    public final void rule__MainFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1552:1: ( ( ( rule__MainFunction__BlocksAssignment_4 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: ( ( rule__MainFunction__BlocksAssignment_4 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1553:1: ( ( rule__MainFunction__BlocksAssignment_4 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1554:1: ( rule__MainFunction__BlocksAssignment_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getBlocksAssignment_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: ( rule__MainFunction__BlocksAssignment_4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:2: rule__MainFunction__BlocksAssignment_4
            {
            pushFollow(FOLLOW_rule__MainFunction__BlocksAssignment_4_in_rule__MainFunction__Group__4__Impl3312);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1575:1: rule__FormalParams__Group__0 : rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1 ;
    public final void rule__FormalParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1579:1: ( rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:2: rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1
            {
            pushFollow(FOLLOW_rule__FormalParams__Group__0__Impl_in_rule__FormalParams__Group__03352);
            rule__FormalParams__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FormalParams__Group__1_in_rule__FormalParams__Group__03355);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1587:1: rule__FormalParams__Group__0__Impl : ( ( rule__FormalParams__ParamsAssignment_0 ) ) ;
    public final void rule__FormalParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1591:1: ( ( ( rule__FormalParams__ParamsAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ( ( rule__FormalParams__ParamsAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ( ( rule__FormalParams__ParamsAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( rule__FormalParams__ParamsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ( rule__FormalParams__ParamsAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:2: rule__FormalParams__ParamsAssignment_0
            {
            pushFollow(FOLLOW_rule__FormalParams__ParamsAssignment_0_in_rule__FormalParams__Group__0__Impl3382);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1604:1: rule__FormalParams__Group__1 : rule__FormalParams__Group__1__Impl ;
    public final void rule__FormalParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1608:1: ( rule__FormalParams__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1609:2: rule__FormalParams__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FormalParams__Group__1__Impl_in_rule__FormalParams__Group__13412);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1615:1: rule__FormalParams__Group__1__Impl : ( ( rule__FormalParams__Group_1__0 )* ) ;
    public final void rule__FormalParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1619:1: ( ( ( rule__FormalParams__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( ( rule__FormalParams__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1620:1: ( ( rule__FormalParams__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1621:1: ( rule__FormalParams__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( rule__FormalParams__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:2: rule__FormalParams__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FormalParams__Group_1__0_in_rule__FormalParams__Group__1__Impl3439);
            	    rule__FormalParams__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1636:1: rule__FormalParams__Group_1__0 : rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1 ;
    public final void rule__FormalParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1640:1: ( rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1641:2: rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1
            {
            pushFollow(FOLLOW_rule__FormalParams__Group_1__0__Impl_in_rule__FormalParams__Group_1__03474);
            rule__FormalParams__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FormalParams__Group_1__1_in_rule__FormalParams__Group_1__03477);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1648:1: rule__FormalParams__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FormalParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1652:1: ( ( ',' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:1: ( ',' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1653:1: ( ',' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1654:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getCommaKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__FormalParams__Group_1__0__Impl3505); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1667:1: rule__FormalParams__Group_1__1 : rule__FormalParams__Group_1__1__Impl ;
    public final void rule__FormalParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1671:1: ( rule__FormalParams__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:2: rule__FormalParams__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FormalParams__Group_1__1__Impl_in_rule__FormalParams__Group_1__13536);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1678:1: rule__FormalParams__Group_1__1__Impl : ( ( rule__FormalParams__ParamsAssignment_1_1 ) ) ;
    public final void rule__FormalParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1682:1: ( ( ( rule__FormalParams__ParamsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( ( rule__FormalParams__ParamsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( ( rule__FormalParams__ParamsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( rule__FormalParams__ParamsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( rule__FormalParams__ParamsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:2: rule__FormalParams__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FormalParams__ParamsAssignment_1_1_in_rule__FormalParams__Group_1__1__Impl3563);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1699:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1703:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03597);
            rule__Param__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03600);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1711:1: rule__Param__Group__0__Impl : ( ruletype ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1715:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1716:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1716:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__Param__Group__0__Impl3627);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1728:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1732:1: ( rule__Param__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1733:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__13656);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1739:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1744:1: ( ( rule__Param__NameAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1745:1: ( rule__Param__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:1: ( rule__Param__NameAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1746:2: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl3683);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1760:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1764:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1765:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03717);
            rule__Block__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03720);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1772:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1776:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1777:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1777:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13778);
            rule__Block__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__13781);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1803:1: rule__Block__Group__1__Impl : ( ( rule__Block__Alternatives_1 ) ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( ( ( rule__Block__Alternatives_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ( rule__Block__Alternatives_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: ( ( rule__Block__Alternatives_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1809:1: ( rule__Block__Alternatives_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:1: ( rule__Block__Alternatives_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1810:2: rule__Block__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Block__Alternatives_1_in_rule__Block__Group__1__Impl3808);
            rule__Block__Alternatives_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getAlternatives_1()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1820:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1824:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1825:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__23838);
            rule__Block__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__23841);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1832:1: rule__Block__Group__2__Impl : ( ( rule__Block__StatementsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1836:1: ( ( ( rule__Block__StatementsAssignment_2 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: ( ( rule__Block__StatementsAssignment_2 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1837:1: ( ( rule__Block__StatementsAssignment_2 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1838:1: ( rule__Block__StatementsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:1: ( rule__Block__StatementsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID||(LA18_0>=12 && LA18_0<=13)||(LA18_0>=16 && LA18_0<=22)||(LA18_0>=37 && LA18_0<=38)||LA18_0==40||LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1839:2: rule__Block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__StatementsAssignment_2_in_rule__Block__Group__2__Impl3868);
            	    rule__Block__StatementsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1849:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1853:1: ( rule__Block__Group__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1854:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__33899);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: rule__Block__Group__3__Impl : ( ( rule__Block__Alternatives_3 ) ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( ( ( rule__Block__Alternatives_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( rule__Block__Alternatives_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:1: ( ( rule__Block__Alternatives_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1866:1: ( rule__Block__Alternatives_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:1: ( rule__Block__Alternatives_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1867:2: rule__Block__Alternatives_3
            {
            pushFollow(FOLLOW_rule__Block__Alternatives_3_in_rule__Block__Group__3__Impl3926);
            rule__Block__Alternatives_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getBlockAccess().getAlternatives_3()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1885:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1890:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03964);
            rule__Statement__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03967);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1897:1: rule__Statement__Group_0__0__Impl : ( () ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1901:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1902:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1903:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_0__0__Impl


    // $ANTLR start rule__Statement__Group_0__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1916:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1920:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1921:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__14025);
            rule__Statement__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__2_in_rule__Statement__Group_0__14028);
            rule__Statement__Group_0__2();
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__PostFixExpressionAssignment_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1932:1: ( ( ( rule__Statement__PostFixExpressionAssignment_0_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( rule__Statement__PostFixExpressionAssignment_0_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1933:1: ( ( rule__Statement__PostFixExpressionAssignment_0_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1934:1: ( rule__Statement__PostFixExpressionAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPostFixExpressionAssignment_0_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: ( rule__Statement__PostFixExpressionAssignment_0_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:2: rule__Statement__PostFixExpressionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Statement__PostFixExpressionAssignment_0_1_in_rule__Statement__Group_0__1__Impl4055);
            rule__Statement__PostFixExpressionAssignment_0_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getPostFixExpressionAssignment_0_1()); 
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


    // $ANTLR start rule__Statement__Group_0__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1945:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1949:1: ( rule__Statement__Group_0__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1950:2: rule__Statement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__2__Impl_in_rule__Statement__Group_0__24085);
            rule__Statement__Group_0__2__Impl();
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
    // $ANTLR end rule__Statement__Group_0__2


    // $ANTLR start rule__Statement__Group_0__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: rule__Statement__Group_0__2__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1960:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1961:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1962:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_0_2()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_0__2__Impl4112);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEndExprParserRuleCall_0_2()); 
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
    // $ANTLR end rule__Statement__Group_0__2__Impl


    // $ANTLR start rule__Statement__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1979:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1983:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__04147);
            rule__Statement__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__04150);
            rule__Statement__Group_1__1();
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
    // $ANTLR end rule__Statement__Group_1__0


    // $ANTLR start rule__Statement__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1991:1: rule__Statement__Group_1__0__Impl : ( ruledeclaration ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1995:1: ( ( ruledeclaration ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ruledeclaration )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: ( ruledeclaration )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1997:1: ruledeclaration
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_rule__Statement__Group_1__0__Impl4177);
            ruledeclaration();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_1_0()); 
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
    // $ANTLR end rule__Statement__Group_1__0__Impl


    // $ANTLR start rule__Statement__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2008:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2012:1: ( rule__Statement__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2013:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__14206);
            rule__Statement__Group_1__1__Impl();
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
    // $ANTLR end rule__Statement__Group_1__1


    // $ANTLR start rule__Statement__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: rule__Statement__Group_1__1__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2023:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2024:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2025:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_1__1__Impl4233);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEndExprParserRuleCall_1_1()); 
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
    // $ANTLR end rule__Statement__Group_1__1__Impl


    // $ANTLR start rule__Statement__Group_2__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2040:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2045:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__04266);
            rule__Statement__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__04269);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2052:1: rule__Statement__Group_2__0__Impl : ( () ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2056:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2057:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2058:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_2_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2071:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2075:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2076:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__14327);
            rule__Statement__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__14330);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:1: rule__Statement__Group_2__1__Impl : ( ( rule__Statement__AssignmentsAssignment_2_1 ) ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2087:1: ( ( ( rule__Statement__AssignmentsAssignment_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( ( rule__Statement__AssignmentsAssignment_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2088:1: ( ( rule__Statement__AssignmentsAssignment_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2089:1: ( rule__Statement__AssignmentsAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentsAssignment_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: ( rule__Statement__AssignmentsAssignment_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:2: rule__Statement__AssignmentsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Statement__AssignmentsAssignment_2_1_in_rule__Statement__Group_2__1__Impl4357);
            rule__Statement__AssignmentsAssignment_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAssignmentsAssignment_2_1()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2100:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2104:1: ( rule__Statement__Group_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2105:2: rule__Statement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__24387);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2111:1: rule__Statement__Group_2__2__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2115:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2116:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2117:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_2_2()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_2__2__Impl4414);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2134:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2138:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2139:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__04449);
            rule__Statement__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__04452);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2146:1: rule__Statement__Group_3__0__Impl : ( () ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2150:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2151:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_3_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2153:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2155:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2165:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2170:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__14510);
            rule__Statement__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__14513);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2177:1: rule__Statement__Group_3__1__Impl : ( 'return' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2181:1: ( ( 'return' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( 'return' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2182:1: ( 'return' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2183:1: 'return'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnKeyword_3_1()); 
            }
            match(input,37,FOLLOW_37_in_rule__Statement__Group_3__1__Impl4541); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getReturnKeyword_3_1()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2196:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2200:1: ( rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2201:2: rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__2__Impl_in_rule__Statement__Group_3__24572);
            rule__Statement__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__3_in_rule__Statement__Group_3__24575);
            rule__Statement__Group_3__3();
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2208:1: rule__Statement__Group_3__2__Impl : ( ( rule__Statement__ExprsAssignment_3_2 )? ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2212:1: ( ( ( rule__Statement__ExprsAssignment_3_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: ( ( rule__Statement__ExprsAssignment_3_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2213:1: ( ( rule__Statement__ExprsAssignment_3_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2214:1: ( rule__Statement__ExprsAssignment_3_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsAssignment_3_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:1: ( rule__Statement__ExprsAssignment_3_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)||LA19_0==34||LA19_0==47||(LA19_0>=51 && LA19_0<=52)||(LA19_0>=54 && LA19_0<=55)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2215:2: rule__Statement__ExprsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Statement__ExprsAssignment_3_2_in_rule__Statement__Group_3__2__Impl4602);
                    rule__Statement__ExprsAssignment_3_2();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprsAssignment_3_2()); 
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


    // $ANTLR start rule__Statement__Group_3__3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2225:1: rule__Statement__Group_3__3 : rule__Statement__Group_3__3__Impl ;
    public final void rule__Statement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2229:1: ( rule__Statement__Group_3__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2230:2: rule__Statement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__3__Impl_in_rule__Statement__Group_3__34633);
            rule__Statement__Group_3__3__Impl();
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
    // $ANTLR end rule__Statement__Group_3__3


    // $ANTLR start rule__Statement__Group_3__3__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: rule__Statement__Group_3__3__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2242:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_3_3()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_3__3__Impl4660);
            ruleendExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getEndExprParserRuleCall_3_3()); 
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
    // $ANTLR end rule__Statement__Group_3__3__Impl


    // $ANTLR start rule__Statement__Group_4__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2261:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2266:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__04697);
            rule__Statement__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__04700);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2273:1: rule__Statement__Group_4__0__Impl : ( 'if' ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: ( ( 'if' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( 'if' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2278:1: ( 'if' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2279:1: 'if'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getIfKeyword_4_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Statement__Group_4__0__Impl4728); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getIfKeyword_4_0()); 
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
    // $ANTLR end rule__Statement__Group_4__0__Impl


    // $ANTLR start rule__Statement__Group_4__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2292:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2297:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__14759);
            rule__Statement__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__14762);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2304:1: rule__Statement__Group_4__1__Impl : ( ruleexpr ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2309:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2310:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__Group_4__1__Impl4789);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprParserRuleCall_4_1()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2321:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2326:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__24818);
            rule__Statement__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__24821);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2333:1: rule__Statement__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2337:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2338:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2339:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_4_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__Statement__Group_4__2__Impl4849); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_4_2()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2352:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4 ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2356:1: ( rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2357:2: rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__34880);
            rule__Statement__Group_4__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__4_in_rule__Statement__Group_4__34883);
            rule__Statement__Group_4__4();
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2364:1: rule__Statement__Group_4__3__Impl : ( ( rule__Statement__StatementsAssignment_4_3 ) ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:1: ( ( ( rule__Statement__StatementsAssignment_4_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( ( rule__Statement__StatementsAssignment_4_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2369:1: ( ( rule__Statement__StatementsAssignment_4_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2370:1: ( rule__Statement__StatementsAssignment_4_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_4_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:1: ( rule__Statement__StatementsAssignment_4_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2371:2: rule__Statement__StatementsAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_4_3_in_rule__Statement__Group_4__3__Impl4910);
            rule__Statement__StatementsAssignment_4_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsAssignment_4_3()); 
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


    // $ANTLR start rule__Statement__Group_4__4
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: rule__Statement__Group_4__4 : rule__Statement__Group_4__4__Impl ;
    public final void rule__Statement__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2385:1: ( rule__Statement__Group_4__4__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2386:2: rule__Statement__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__4__Impl_in_rule__Statement__Group_4__44940);
            rule__Statement__Group_4__4__Impl();
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
    // $ANTLR end rule__Statement__Group_4__4


    // $ANTLR start rule__Statement__Group_4__4__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2392:1: rule__Statement__Group_4__4__Impl : ( ( rule__Statement__Group_4_4__0 )? ) ;
    public final void rule__Statement__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2396:1: ( ( ( rule__Statement__Group_4_4__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( ( rule__Statement__Group_4_4__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2397:1: ( ( rule__Statement__Group_4_4__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( rule__Statement__Group_4_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup_4_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:1: ( rule__Statement__Group_4_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred44()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:2: rule__Statement__Group_4_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4_4__0_in_rule__Statement__Group_4__4__Impl4967);
                    rule__Statement__Group_4_4__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getGroup_4_4()); 
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
    // $ANTLR end rule__Statement__Group_4__4__Impl


    // $ANTLR start rule__Statement__Group_4_4__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2419:1: rule__Statement__Group_4_4__0 : rule__Statement__Group_4_4__0__Impl rule__Statement__Group_4_4__1 ;
    public final void rule__Statement__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2423:1: ( rule__Statement__Group_4_4__0__Impl rule__Statement__Group_4_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2424:2: rule__Statement__Group_4_4__0__Impl rule__Statement__Group_4_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4_4__0__Impl_in_rule__Statement__Group_4_4__05008);
            rule__Statement__Group_4_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4_4__1_in_rule__Statement__Group_4_4__05011);
            rule__Statement__Group_4_4__1();
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
    // $ANTLR end rule__Statement__Group_4_4__0


    // $ANTLR start rule__Statement__Group_4_4__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:1: rule__Statement__Group_4_4__0__Impl : ( 'else' ) ;
    public final void rule__Statement__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2435:1: ( ( 'else' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( 'else' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2436:1: ( 'else' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2437:1: 'else'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getElseKeyword_4_4_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Statement__Group_4_4__0__Impl5039); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getElseKeyword_4_4_0()); 
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
    // $ANTLR end rule__Statement__Group_4_4__0__Impl


    // $ANTLR start rule__Statement__Group_4_4__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2450:1: rule__Statement__Group_4_4__1 : rule__Statement__Group_4_4__1__Impl ;
    public final void rule__Statement__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2454:1: ( rule__Statement__Group_4_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2455:2: rule__Statement__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4_4__1__Impl_in_rule__Statement__Group_4_4__15070);
            rule__Statement__Group_4_4__1__Impl();
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
    // $ANTLR end rule__Statement__Group_4_4__1


    // $ANTLR start rule__Statement__Group_4_4__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: rule__Statement__Group_4_4__1__Impl : ( ( rule__Statement__StatementsAssignment_4_4_1 ) ) ;
    public final void rule__Statement__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2465:1: ( ( ( rule__Statement__StatementsAssignment_4_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ( rule__Statement__StatementsAssignment_4_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2466:1: ( ( rule__Statement__StatementsAssignment_4_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2467:1: ( rule__Statement__StatementsAssignment_4_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_4_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:1: ( rule__Statement__StatementsAssignment_4_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2468:2: rule__Statement__StatementsAssignment_4_4_1
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_4_4_1_in_rule__Statement__Group_4_4__1__Impl5097);
            rule__Statement__StatementsAssignment_4_4_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsAssignment_4_4_1()); 
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
    // $ANTLR end rule__Statement__Group_4_4__1__Impl


    // $ANTLR start rule__Statement__Group_5__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2482:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2487:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__05131);
            rule__Statement__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__05134);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2494:1: rule__Statement__Group_5__0__Impl : ( 'for' ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: ( ( 'for' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: ( 'for' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2499:1: ( 'for' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2500:1: 'for'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getForKeyword_5_0()); 
            }
            match(input,40,FOLLOW_40_in_rule__Statement__Group_5__0__Impl5162); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getForKeyword_5_0()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2513:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: ( rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2518:2: rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__15193);
            rule__Statement__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__2_in_rule__Statement__Group_5__15196);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2525:1: rule__Statement__Group_5__1__Impl : ( ruleparam ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2530:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2531:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getParamParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__Statement__Group_5__1__Impl5223);
            ruleparam();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getParamParserRuleCall_5_1()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2542:1: rule__Statement__Group_5__2 : rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 ;
    public final void rule__Statement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: ( rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2547:2: rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__2__Impl_in_rule__Statement__Group_5__25252);
            rule__Statement__Group_5__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__3_in_rule__Statement__Group_5__25255);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2554:1: rule__Statement__Group_5__2__Impl : ( 'in' ) ;
    public final void rule__Statement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:1: ( ( 'in' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2559:1: ( 'in' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2559:1: ( 'in' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2560:1: 'in'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getInKeyword_5_2()); 
            }
            match(input,41,FOLLOW_41_in_rule__Statement__Group_5__2__Impl5283); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getInKeyword_5_2()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2573:1: rule__Statement__Group_5__3 : rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 ;
    public final void rule__Statement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: ( rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2578:2: rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__3__Impl_in_rule__Statement__Group_5__35314);
            rule__Statement__Group_5__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__4_in_rule__Statement__Group_5__35317);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2585:1: rule__Statement__Group_5__3__Impl : ( ( rule__Statement__ExprsAssignment_5_3 ) ) ;
    public final void rule__Statement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2589:1: ( ( ( rule__Statement__ExprsAssignment_5_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( ( rule__Statement__ExprsAssignment_5_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2590:1: ( ( rule__Statement__ExprsAssignment_5_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2591:1: ( rule__Statement__ExprsAssignment_5_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsAssignment_5_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: ( rule__Statement__ExprsAssignment_5_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:2: rule__Statement__ExprsAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Statement__ExprsAssignment_5_3_in_rule__Statement__Group_5__3__Impl5344);
            rule__Statement__ExprsAssignment_5_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprsAssignment_5_3()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2602:1: rule__Statement__Group_5__4 : rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5 ;
    public final void rule__Statement__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2606:1: ( rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2607:2: rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__4__Impl_in_rule__Statement__Group_5__45374);
            rule__Statement__Group_5__4__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__5_in_rule__Statement__Group_5__45377);
            rule__Statement__Group_5__5();
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2614:1: rule__Statement__Group_5__4__Impl : ( ':' ) ;
    public final void rule__Statement__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2618:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2619:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2620:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_5_4()); 
            }
            match(input,36,FOLLOW_36_in_rule__Statement__Group_5__4__Impl5405); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_5_4()); 
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


    // $ANTLR start rule__Statement__Group_5__5
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: rule__Statement__Group_5__5 : rule__Statement__Group_5__5__Impl ;
    public final void rule__Statement__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2637:1: ( rule__Statement__Group_5__5__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2638:2: rule__Statement__Group_5__5__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__5__Impl_in_rule__Statement__Group_5__55436);
            rule__Statement__Group_5__5__Impl();
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
    // $ANTLR end rule__Statement__Group_5__5


    // $ANTLR start rule__Statement__Group_5__5__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2644:1: rule__Statement__Group_5__5__Impl : ( ( rule__Statement__StatementsAssignment_5_5 ) ) ;
    public final void rule__Statement__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: ( ( ( rule__Statement__StatementsAssignment_5_5 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: ( ( rule__Statement__StatementsAssignment_5_5 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2649:1: ( ( rule__Statement__StatementsAssignment_5_5 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2650:1: ( rule__Statement__StatementsAssignment_5_5 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_5_5()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:1: ( rule__Statement__StatementsAssignment_5_5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2651:2: rule__Statement__StatementsAssignment_5_5
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_5_5_in_rule__Statement__Group_5__5__Impl5463);
            rule__Statement__StatementsAssignment_5_5();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsAssignment_5_5()); 
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
    // $ANTLR end rule__Statement__Group_5__5__Impl


    // $ANTLR start rule__Statement__Group_6__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2673:1: rule__Statement__Group_6__0 : rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 ;
    public final void rule__Statement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: ( rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2678:2: rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__0__Impl_in_rule__Statement__Group_6__05505);
            rule__Statement__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__1_in_rule__Statement__Group_6__05508);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2685:1: rule__Statement__Group_6__0__Impl : ( 'while' ) ;
    public final void rule__Statement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: ( ( 'while' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: ( 'while' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2690:1: ( 'while' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2691:1: 'while'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getWhileKeyword_6_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Statement__Group_6__0__Impl5536); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getWhileKeyword_6_0()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2704:1: rule__Statement__Group_6__1 : rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2 ;
    public final void rule__Statement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: ( rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2709:2: rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__1__Impl_in_rule__Statement__Group_6__15567);
            rule__Statement__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__2_in_rule__Statement__Group_6__15570);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2716:1: rule__Statement__Group_6__1__Impl : ( ruleexpr ) ;
    public final void rule__Statement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2720:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2721:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2722:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__Group_6__1__Impl5597);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprParserRuleCall_6_1()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2733:1: rule__Statement__Group_6__2 : rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3 ;
    public final void rule__Statement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2737:1: ( rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2738:2: rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__2__Impl_in_rule__Statement__Group_6__25626);
            rule__Statement__Group_6__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__3_in_rule__Statement__Group_6__25629);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2745:1: rule__Statement__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Statement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2750:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2751:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_6_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__Statement__Group_6__2__Impl5657); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getColonKeyword_6_2()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:1: rule__Statement__Group_6__3 : rule__Statement__Group_6__3__Impl ;
    public final void rule__Statement__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: ( rule__Statement__Group_6__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:2: rule__Statement__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__3__Impl_in_rule__Statement__Group_6__35688);
            rule__Statement__Group_6__3__Impl();
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2775:1: rule__Statement__Group_6__3__Impl : ( ( rule__Statement__StatementsAssignment_6_3 ) ) ;
    public final void rule__Statement__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2779:1: ( ( ( rule__Statement__StatementsAssignment_6_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: ( ( rule__Statement__StatementsAssignment_6_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: ( ( rule__Statement__StatementsAssignment_6_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2781:1: ( rule__Statement__StatementsAssignment_6_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_6_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:1: ( rule__Statement__StatementsAssignment_6_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2782:2: rule__Statement__StatementsAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_6_3_in_rule__Statement__Group_6__3__Impl5715);
            rule__Statement__StatementsAssignment_6_3();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsAssignment_6_3()); 
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


    // $ANTLR start rule__Declaration__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2800:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2804:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2805:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__05753);
            rule__Declaration__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__05756);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2812:1: rule__Declaration__Group__0__Impl : ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2816:1: ( ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2817:1: ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2818:1: ( ( rule__Declaration__Group_0__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2819:1: ( rule__Declaration__Group_0__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: ( rule__Declaration__Group_0__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:2: rule__Declaration__Group_0__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl5785);
            rule__Declaration__Group_0__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2823:1: ( ( rule__Declaration__Group_0__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: ( rule__Declaration__Group_0__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:1: ( rule__Declaration__Group_0__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=16 && LA21_0<=22)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:2: rule__Declaration__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl5797);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2836:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2840:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2841:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__15830);
            rule__Declaration__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__15833);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2852:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2853:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2854:1: ( rule__Declaration__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: ( rule__Declaration__NameAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl5860);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2865:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2869:1: ( rule__Declaration__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2870:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__25890);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__Group_2__0 )? ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2880:1: ( ( ( rule__Declaration__Group_2__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( ( rule__Declaration__Group_2__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2881:1: ( ( rule__Declaration__Group_2__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2882:1: ( rule__Declaration__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: ( rule__Declaration__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:2: rule__Declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl5917);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2899:1: rule__Declaration__Group_0__0 : rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 ;
    public final void rule__Declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2903:1: ( rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2904:2: rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__05954);
            rule__Declaration__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__05957);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:1: rule__Declaration__Group_0__0__Impl : ( ( rule__Declaration__VariableTypeAssignment_0_0 ) ) ;
    public final void rule__Declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2915:1: ( ( ( rule__Declaration__VariableTypeAssignment_0_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: ( ( rule__Declaration__VariableTypeAssignment_0_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2916:1: ( ( rule__Declaration__VariableTypeAssignment_0_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2917:1: ( rule__Declaration__VariableTypeAssignment_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getVariableTypeAssignment_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: ( rule__Declaration__VariableTypeAssignment_0_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:2: rule__Declaration__VariableTypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Declaration__VariableTypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl5984);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2928:1: rule__Declaration__Group_0__1 : rule__Declaration__Group_0__1__Impl ;
    public final void rule__Declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2932:1: ( rule__Declaration__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2933:2: rule__Declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__16014);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2939:1: rule__Declaration__Group_0__1__Impl : ( ( '[]' )? ) ;
    public final void rule__Declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2943:1: ( ( ( '[]' )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( ( '[]' )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2944:1: ( ( '[]' )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2945:1: ( '[]' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getLeftSquareBracketRightSquareBracketKeyword_0_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2946:1: ( '[]' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2947:2: '[]'
                    {
                    match(input,43,FOLLOW_43_in_rule__Declaration__Group_0__1__Impl6043); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2962:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2966:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2967:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__06080);
            rule__Declaration__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__06083);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:1: rule__Declaration__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2978:1: ( ( '=' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( '=' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2979:1: ( '=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2980:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Declaration__Group_2__0__Impl6111); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2993:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2997:1: ( rule__Declaration__Group_2__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:2: rule__Declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__16142);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3004:1: rule__Declaration__Group_2__1__Impl : ( ( rule__Declaration__ExprsAssignment_2_1 ) ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3008:1: ( ( ( rule__Declaration__ExprsAssignment_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ( rule__Declaration__ExprsAssignment_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3009:1: ( ( rule__Declaration__ExprsAssignment_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: ( rule__Declaration__ExprsAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getExprsAssignment_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:1: ( rule__Declaration__ExprsAssignment_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3011:2: rule__Declaration__ExprsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Declaration__ExprsAssignment_2_1_in_rule__Declaration__Group_2__1__Impl6169);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3025:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3030:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__06203);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__06206);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3037:1: rule__Assignment__Group__0__Impl : ( rulepostfixExpr ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3041:1: ( ( rulepostfixExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( rulepostfixExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3042:1: ( rulepostfixExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3043:1: rulepostfixExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getPostfixExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_rule__Assignment__Group__0__Impl6233);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3054:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3058:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3059:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__16262);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__16265);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3066:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3070:1: ( ( '=' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: ( '=' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3071:1: ( '=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3072:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,44,FOLLOW_44_in_rule__Assignment__Group__1__Impl6293); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3085:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3089:1: ( rule__Assignment__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3090:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__26324);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExprsAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3100:1: ( ( ( rule__Assignment__ExprsAssignment_2 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( ( rule__Assignment__ExprsAssignment_2 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3101:1: ( ( rule__Assignment__ExprsAssignment_2 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3102:1: ( rule__Assignment__ExprsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExprsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: ( rule__Assignment__ExprsAssignment_2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:2: rule__Assignment__ExprsAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExprsAssignment_2_in_rule__Assignment__Group__2__Impl6351);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3119:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3123:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__06387);
            rule__Expr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__06390);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3131:1: rule__Expr__Group__0__Impl : ( ruleandExpr ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3135:1: ( ( ruleandExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( ruleandExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: ( ruleandExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3137:1: ruleandExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_rule__Expr__Group__0__Impl6417);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3148:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3152:1: ( rule__Expr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3153:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__16446);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3163:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3164:1: ( ( rule__Expr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3165:1: ( rule__Expr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: ( rule__Expr__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl6473);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3180:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3184:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3185:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__06508);
            rule__Expr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__06511);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:1: rule__Expr__Group_1__0__Impl : ( '||' ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3196:1: ( ( '||' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:1: ( '||' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3197:1: ( '||' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3198:1: '||'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__Expr__Group_1__0__Impl6539); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3211:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3215:1: ( rule__Expr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__16570);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3222:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__AndExprsAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3226:1: ( ( ( rule__Expr__AndExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( ( rule__Expr__AndExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: ( ( rule__Expr__AndExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3228:1: ( rule__Expr__AndExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:1: ( rule__Expr__AndExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3229:2: rule__Expr__AndExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__AndExprsAssignment_1_1_in_rule__Expr__Group_1__1__Impl6597);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3243:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3247:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__06631);
            rule__AndExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__06634);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3255:1: rule__AndExpr__Group__0__Impl : ( ruleeqExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3259:1: ( ( ruleeqExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: ( ruleeqExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: ( ruleeqExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3261:1: ruleeqExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_rule__AndExpr__Group__0__Impl6661);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3272:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3276:1: ( rule__AndExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3277:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__16690);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3287:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3288:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3289:1: ( rule__AndExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:1: ( rule__AndExpr__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==46) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl6717);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3304:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3308:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3309:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__06752);
            rule__AndExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__06755);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:1: rule__AndExpr__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3320:1: ( ( '&&' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: ( '&&' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3321:1: ( '&&' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3322:1: '&&'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__AndExpr__Group_1__0__Impl6783); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3335:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3339:1: ( rule__AndExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:2: rule__AndExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__16814);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3346:1: rule__AndExpr__Group_1__1__Impl : ( ( rule__AndExpr__EqExprsAssignment_1_1 ) ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3350:1: ( ( ( rule__AndExpr__EqExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3351:1: ( ( rule__AndExpr__EqExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3351:1: ( ( rule__AndExpr__EqExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3352:1: ( rule__AndExpr__EqExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3353:1: ( rule__AndExpr__EqExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3353:2: rule__AndExpr__EqExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpr__EqExprsAssignment_1_1_in_rule__AndExpr__Group_1__1__Impl6841);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3367:1: rule__EqExpr__Group__0 : rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1 ;
    public final void rule__EqExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3371:1: ( rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:2: rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1
            {
            pushFollow(FOLLOW_rule__EqExpr__Group__0__Impl_in_rule__EqExpr__Group__06875);
            rule__EqExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EqExpr__Group__1_in_rule__EqExpr__Group__06878);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3379:1: rule__EqExpr__Group__0__Impl : ( rulerelExpr ) ;
    public final void rule__EqExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3383:1: ( ( rulerelExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: ( rulerelExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: ( rulerelExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3385:1: rulerelExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_rule__EqExpr__Group__0__Impl6905);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3396:1: rule__EqExpr__Group__1 : rule__EqExpr__Group__1__Impl ;
    public final void rule__EqExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3400:1: ( rule__EqExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:2: rule__EqExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EqExpr__Group__1__Impl_in_rule__EqExpr__Group__16934);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3407:1: rule__EqExpr__Group__1__Impl : ( ( rule__EqExpr__Group_1__0 )* ) ;
    public final void rule__EqExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3411:1: ( ( ( rule__EqExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: ( ( rule__EqExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: ( ( rule__EqExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3413:1: ( rule__EqExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:1: ( rule__EqExpr__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=23 && LA26_0<=24)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3414:2: rule__EqExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EqExpr__Group_1__0_in_rule__EqExpr__Group__1__Impl6961);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3428:1: rule__EqExpr__Group_1__0 : rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1 ;
    public final void rule__EqExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3432:1: ( rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:2: rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__EqExpr__Group_1__0__Impl_in_rule__EqExpr__Group_1__06996);
            rule__EqExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EqExpr__Group_1__1_in_rule__EqExpr__Group_1__06999);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3440:1: rule__EqExpr__Group_1__0__Impl : ( ( rule__EqExpr__Alternatives_1_0 ) ) ;
    public final void rule__EqExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3444:1: ( ( ( rule__EqExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: ( ( rule__EqExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: ( ( rule__EqExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3446:1: ( rule__EqExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:1: ( rule__EqExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3447:2: rule__EqExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EqExpr__Alternatives_1_0_in_rule__EqExpr__Group_1__0__Impl7026);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3457:1: rule__EqExpr__Group_1__1 : rule__EqExpr__Group_1__1__Impl ;
    public final void rule__EqExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3461:1: ( rule__EqExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:2: rule__EqExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EqExpr__Group_1__1__Impl_in_rule__EqExpr__Group_1__17056);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3468:1: rule__EqExpr__Group_1__1__Impl : ( ( rule__EqExpr__RelExprsAssignment_1_1 ) ) ;
    public final void rule__EqExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3472:1: ( ( ( rule__EqExpr__RelExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: ( ( rule__EqExpr__RelExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: ( ( rule__EqExpr__RelExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3474:1: ( rule__EqExpr__RelExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:1: ( rule__EqExpr__RelExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3475:2: rule__EqExpr__RelExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EqExpr__RelExprsAssignment_1_1_in_rule__EqExpr__Group_1__1__Impl7083);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3489:1: rule__RelExpr__Group__0 : rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1 ;
    public final void rule__RelExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3493:1: ( rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:2: rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1
            {
            pushFollow(FOLLOW_rule__RelExpr__Group__0__Impl_in_rule__RelExpr__Group__07117);
            rule__RelExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__RelExpr__Group__1_in_rule__RelExpr__Group__07120);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3501:1: rule__RelExpr__Group__0__Impl : ( ruleaddExpr ) ;
    public final void rule__RelExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3505:1: ( ( ruleaddExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: ( ruleaddExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: ( ruleaddExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3507:1: ruleaddExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rule__RelExpr__Group__0__Impl7147);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3518:1: rule__RelExpr__Group__1 : rule__RelExpr__Group__1__Impl ;
    public final void rule__RelExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3522:1: ( rule__RelExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:2: rule__RelExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelExpr__Group__1__Impl_in_rule__RelExpr__Group__17176);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3529:1: rule__RelExpr__Group__1__Impl : ( ( rule__RelExpr__Group_1__0 )* ) ;
    public final void rule__RelExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3533:1: ( ( ( rule__RelExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ( ( rule__RelExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: ( ( rule__RelExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3535:1: ( rule__RelExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:1: ( rule__RelExpr__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=25 && LA27_0<=28)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3536:2: rule__RelExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RelExpr__Group_1__0_in_rule__RelExpr__Group__1__Impl7203);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3550:1: rule__RelExpr__Group_1__0 : rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1 ;
    public final void rule__RelExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3554:1: ( rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:2: rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__RelExpr__Group_1__0__Impl_in_rule__RelExpr__Group_1__07238);
            rule__RelExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__RelExpr__Group_1__1_in_rule__RelExpr__Group_1__07241);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3562:1: rule__RelExpr__Group_1__0__Impl : ( ( rule__RelExpr__Alternatives_1_0 ) ) ;
    public final void rule__RelExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3566:1: ( ( ( rule__RelExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( ( rule__RelExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: ( ( rule__RelExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3568:1: ( rule__RelExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:1: ( rule__RelExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3569:2: rule__RelExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__RelExpr__Alternatives_1_0_in_rule__RelExpr__Group_1__0__Impl7268);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3579:1: rule__RelExpr__Group_1__1 : rule__RelExpr__Group_1__1__Impl ;
    public final void rule__RelExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3583:1: ( rule__RelExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:2: rule__RelExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RelExpr__Group_1__1__Impl_in_rule__RelExpr__Group_1__17298);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3590:1: rule__RelExpr__Group_1__1__Impl : ( ( rule__RelExpr__AddExprAssignment_1_1 ) ) ;
    public final void rule__RelExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3594:1: ( ( ( rule__RelExpr__AddExprAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: ( ( rule__RelExpr__AddExprAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: ( ( rule__RelExpr__AddExprAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3596:1: ( rule__RelExpr__AddExprAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:1: ( rule__RelExpr__AddExprAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3597:2: rule__RelExpr__AddExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RelExpr__AddExprAssignment_1_1_in_rule__RelExpr__Group_1__1__Impl7325);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3611:1: rule__AddExpr__Group__0 : rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1 ;
    public final void rule__AddExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3615:1: ( rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:2: rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AddExpr__Group__0__Impl_in_rule__AddExpr__Group__07359);
            rule__AddExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpr__Group__1_in_rule__AddExpr__Group__07362);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3623:1: rule__AddExpr__Group__0__Impl : ( rulemulExpr ) ;
    public final void rule__AddExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3627:1: ( ( rulemulExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: ( rulemulExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: ( rulemulExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3629:1: rulemulExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_rule__AddExpr__Group__0__Impl7389);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3640:1: rule__AddExpr__Group__1 : rule__AddExpr__Group__1__Impl ;
    public final void rule__AddExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3644:1: ( rule__AddExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:2: rule__AddExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpr__Group__1__Impl_in_rule__AddExpr__Group__17418);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3651:1: rule__AddExpr__Group__1__Impl : ( ( rule__AddExpr__Group_1__0 )* ) ;
    public final void rule__AddExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3655:1: ( ( ( rule__AddExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( ( rule__AddExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: ( ( rule__AddExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3657:1: ( rule__AddExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3658:1: ( rule__AddExpr__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_SIGN) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3658:2: rule__AddExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExpr__Group_1__0_in_rule__AddExpr__Group__1__Impl7445);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3672:1: rule__AddExpr__Group_1__0 : rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1 ;
    public final void rule__AddExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3676:1: ( rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:2: rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExpr__Group_1__0__Impl_in_rule__AddExpr__Group_1__07480);
            rule__AddExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpr__Group_1__1_in_rule__AddExpr__Group_1__07483);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3684:1: rule__AddExpr__Group_1__0__Impl : ( RULE_SIGN ) ;
    public final void rule__AddExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3688:1: ( ( RULE_SIGN ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( RULE_SIGN )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: ( RULE_SIGN )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3690:1: RULE_SIGN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getSignTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_rule__AddExpr__Group_1__0__Impl7510); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3701:1: rule__AddExpr__Group_1__1 : rule__AddExpr__Group_1__1__Impl ;
    public final void rule__AddExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3705:1: ( rule__AddExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:2: rule__AddExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpr__Group_1__1__Impl_in_rule__AddExpr__Group_1__17539);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3712:1: rule__AddExpr__Group_1__1__Impl : ( ( rule__AddExpr__MulExprsAssignment_1_1 ) ) ;
    public final void rule__AddExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3716:1: ( ( ( rule__AddExpr__MulExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3717:1: ( ( rule__AddExpr__MulExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3717:1: ( ( rule__AddExpr__MulExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3718:1: ( rule__AddExpr__MulExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:1: ( rule__AddExpr__MulExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3719:2: rule__AddExpr__MulExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExpr__MulExprsAssignment_1_1_in_rule__AddExpr__Group_1__1__Impl7566);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3733:1: rule__MulExpr__Group__0 : rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1 ;
    public final void rule__MulExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3737:1: ( rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:2: rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1
            {
            pushFollow(FOLLOW_rule__MulExpr__Group__0__Impl_in_rule__MulExpr__Group__07600);
            rule__MulExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MulExpr__Group__1_in_rule__MulExpr__Group__07603);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3745:1: rule__MulExpr__Group__0__Impl : ( ( rule__MulExpr__AtomsAssignment_0 ) ) ;
    public final void rule__MulExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3749:1: ( ( ( rule__MulExpr__AtomsAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:1: ( ( rule__MulExpr__AtomsAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:1: ( ( rule__MulExpr__AtomsAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3751:1: ( rule__MulExpr__AtomsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:1: ( rule__MulExpr__AtomsAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3752:2: rule__MulExpr__AtomsAssignment_0
            {
            pushFollow(FOLLOW_rule__MulExpr__AtomsAssignment_0_in_rule__MulExpr__Group__0__Impl7630);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3762:1: rule__MulExpr__Group__1 : rule__MulExpr__Group__1__Impl ;
    public final void rule__MulExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3766:1: ( rule__MulExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:2: rule__MulExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulExpr__Group__1__Impl_in_rule__MulExpr__Group__17660);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3773:1: rule__MulExpr__Group__1__Impl : ( ( rule__MulExpr__Group_1__0 )* ) ;
    public final void rule__MulExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3777:1: ( ( ( rule__MulExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( ( rule__MulExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: ( ( rule__MulExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3779:1: ( rule__MulExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:1: ( rule__MulExpr__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=29 && LA29_0<=31)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3780:2: rule__MulExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulExpr__Group_1__0_in_rule__MulExpr__Group__1__Impl7687);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3794:1: rule__MulExpr__Group_1__0 : rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 ;
    public final void rule__MulExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3798:1: ( rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:2: rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulExpr__Group_1__0__Impl_in_rule__MulExpr__Group_1__07722);
            rule__MulExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MulExpr__Group_1__1_in_rule__MulExpr__Group_1__07725);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3806:1: rule__MulExpr__Group_1__0__Impl : ( ( rule__MulExpr__Alternatives_1_0 ) ) ;
    public final void rule__MulExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3810:1: ( ( ( rule__MulExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: ( ( rule__MulExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: ( ( rule__MulExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3812:1: ( rule__MulExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3813:1: ( rule__MulExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3813:2: rule__MulExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__MulExpr__Alternatives_1_0_in_rule__MulExpr__Group_1__0__Impl7752);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3823:1: rule__MulExpr__Group_1__1 : rule__MulExpr__Group_1__1__Impl ;
    public final void rule__MulExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3827:1: ( rule__MulExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3828:2: rule__MulExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MulExpr__Group_1__1__Impl_in_rule__MulExpr__Group_1__17782);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: rule__MulExpr__Group_1__1__Impl : ( ( rule__MulExpr__AtomsAssignment_1_1 ) ) ;
    public final void rule__MulExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3838:1: ( ( ( rule__MulExpr__AtomsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( ( rule__MulExpr__AtomsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3839:1: ( ( rule__MulExpr__AtomsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3840:1: ( rule__MulExpr__AtomsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: ( rule__MulExpr__AtomsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:2: rule__MulExpr__AtomsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulExpr__AtomsAssignment_1_1_in_rule__MulExpr__Group_1__1__Impl7809);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3855:1: rule__Atom__Group_0__0 : rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1 ;
    public final void rule__Atom__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3859:1: ( rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3860:2: rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_0__0__Impl_in_rule__Atom__Group_0__07843);
            rule__Atom__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_0__1_in_rule__Atom__Group_0__07846);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:1: rule__Atom__Group_0__0__Impl : ( '!' ) ;
    public final void rule__Atom__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3871:1: ( ( '!' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: ( '!' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3872:1: ( '!' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3873:1: '!'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExclamationMarkKeyword_0_0()); 
            }
            match(input,47,FOLLOW_47_in_rule__Atom__Group_0__0__Impl7874); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3886:1: rule__Atom__Group_0__1 : rule__Atom__Group_0__1__Impl ;
    public final void rule__Atom__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3890:1: ( rule__Atom__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3891:2: rule__Atom__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_0__1__Impl_in_rule__Atom__Group_0__17905);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3897:1: rule__Atom__Group_0__1__Impl : ( ruleatom ) ;
    public final void rule__Atom__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3901:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3902:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3903:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAtomParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__Atom__Group_0__1__Impl7932);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3918:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3923:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__07965);
            rule__Atom__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__07968);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3930:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3935:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3936:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Atom__Group_1__0__Impl7996); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3949:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3953:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3954:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__18027);
            rule__Atom__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__18030);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3961:1: rule__Atom__Group_1__1__Impl : ( RULE_SIGN ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3965:1: ( ( RULE_SIGN ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: ( RULE_SIGN )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: ( RULE_SIGN )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:1: RULE_SIGN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getSignTerminalRuleCall_1_1()); 
            }
            match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_rule__Atom__Group_1__1__Impl8057); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3978:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3982:1: ( rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3983:2: rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__28086);
            rule__Atom__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__3_in_rule__Atom__Group_1__28089);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3990:1: rule__Atom__Group_1__2__Impl : ( ruleexpr ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3995:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3996:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExprParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Atom__Group_1__2__Impl8116);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: rule__Atom__Group_1__3 : rule__Atom__Group_1__3__Impl ;
    public final void rule__Atom__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4011:1: ( rule__Atom__Group_1__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4012:2: rule__Atom__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__3__Impl_in_rule__Atom__Group_1__38145);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4018:1: rule__Atom__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4022:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4023:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,35,FOLLOW_35_in_rule__Atom__Group_1__3__Impl8173); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4045:1: rule__Atom__Group_2__0 : rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 ;
    public final void rule__Atom__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: ( rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4050:2: rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__0__Impl_in_rule__Atom__Group_2__08212);
            rule__Atom__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_2__1_in_rule__Atom__Group_2__08215);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4057:1: rule__Atom__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4061:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4062:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4063:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__Atom__Group_2__0__Impl8243); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4076:1: rule__Atom__Group_2__1 : rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2 ;
    public final void rule__Atom__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4080:1: ( rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4081:2: rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__1__Impl_in_rule__Atom__Group_2__18274);
            rule__Atom__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_2__2_in_rule__Atom__Group_2__18277);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4088:1: rule__Atom__Group_2__1__Impl : ( ruleexpr ) ;
    public final void rule__Atom__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4092:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4093:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4094:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExprParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Atom__Group_2__1__Impl8304);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4105:1: rule__Atom__Group_2__2 : rule__Atom__Group_2__2__Impl ;
    public final void rule__Atom__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4109:1: ( rule__Atom__Group_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4110:2: rule__Atom__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__2__Impl_in_rule__Atom__Group_2__28333);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: rule__Atom__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4122:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__Atom__Group_2__2__Impl8361); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4141:1: rule__Atom__Group_4__0 : rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 ;
    public final void rule__Atom__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4145:1: ( rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4146:2: rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__08398);
            rule__Atom__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__08401);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:1: rule__Atom__Group_4__0__Impl : ( () ) ;
    public final void rule__Atom__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4157:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4158:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4158:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4159:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAtomAction_4_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4162:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4172:1: rule__Atom__Group_4__1 : rule__Atom__Group_4__1__Impl ;
    public final void rule__Atom__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4176:1: ( rule__Atom__Group_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4177:2: rule__Atom__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__18459);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4183:1: rule__Atom__Group_4__1__Impl : ( ( rule__Atom__ConstantsAssignment_4_1 ) ) ;
    public final void rule__Atom__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4187:1: ( ( ( rule__Atom__ConstantsAssignment_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:1: ( ( rule__Atom__ConstantsAssignment_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:1: ( ( rule__Atom__ConstantsAssignment_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4189:1: ( rule__Atom__ConstantsAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getConstantsAssignment_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4190:1: ( rule__Atom__ConstantsAssignment_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4190:2: rule__Atom__ConstantsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atom__ConstantsAssignment_4_1_in_rule__Atom__Group_4__1__Impl8486);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4204:1: rule__PostfixExpr__Group__0 : rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1 ;
    public final void rule__PostfixExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4208:1: ( rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:2: rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__0__Impl_in_rule__PostfixExpr__Group__08520);
            rule__PostfixExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group__1_in_rule__PostfixExpr__Group__08523);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4216:1: rule__PostfixExpr__Group__0__Impl : ( ( rule__PostfixExpr__Alternatives_0 ) ) ;
    public final void rule__PostfixExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4220:1: ( ( ( rule__PostfixExpr__Alternatives_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( ( rule__PostfixExpr__Alternatives_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: ( ( rule__PostfixExpr__Alternatives_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4222:1: ( rule__PostfixExpr__Alternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getAlternatives_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4223:1: ( rule__PostfixExpr__Alternatives_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4223:2: rule__PostfixExpr__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Alternatives_0_in_rule__PostfixExpr__Group__0__Impl8550);
            rule__PostfixExpr__Alternatives_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getAlternatives_0()); 
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
    // $ANTLR end rule__PostfixExpr__Group__0__Impl


    // $ANTLR start rule__PostfixExpr__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4233:1: rule__PostfixExpr__Group__1 : rule__PostfixExpr__Group__1__Impl ;
    public final void rule__PostfixExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4237:1: ( rule__PostfixExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4238:2: rule__PostfixExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__1__Impl_in_rule__PostfixExpr__Group__18580);
            rule__PostfixExpr__Group__1__Impl();
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: rule__PostfixExpr__Group__1__Impl : ( ( rule__PostfixExpr__Alternatives_1 )* ) ;
    public final void rule__PostfixExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4248:1: ( ( ( rule__PostfixExpr__Alternatives_1 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: ( ( rule__PostfixExpr__Alternatives_1 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4249:1: ( ( rule__PostfixExpr__Alternatives_1 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4250:1: ( rule__PostfixExpr__Alternatives_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getAlternatives_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:1: ( rule__PostfixExpr__Alternatives_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34||(LA30_0>=48 && LA30_0<=49)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:2: rule__PostfixExpr__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__PostfixExpr__Alternatives_1_in_rule__PostfixExpr__Group__1__Impl8607);
            	    rule__PostfixExpr__Alternatives_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

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


    // $ANTLR start rule__PostfixExpr__Group_1_0__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4265:1: rule__PostfixExpr__Group_1_0__0 : rule__PostfixExpr__Group_1_0__0__Impl rule__PostfixExpr__Group_1_0__1 ;
    public final void rule__PostfixExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4269:1: ( rule__PostfixExpr__Group_1_0__0__Impl rule__PostfixExpr__Group_1_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4270:2: rule__PostfixExpr__Group_1_0__0__Impl rule__PostfixExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_0__0__Impl_in_rule__PostfixExpr__Group_1_0__08642);
            rule__PostfixExpr__Group_1_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_0__1_in_rule__PostfixExpr__Group_1_0__08645);
            rule__PostfixExpr__Group_1_0__1();
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
    // $ANTLR end rule__PostfixExpr__Group_1_0__0


    // $ANTLR start rule__PostfixExpr__Group_1_0__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:1: rule__PostfixExpr__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__PostfixExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4281:1: ( ( '.' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ( '.' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4282:1: ( '.' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4283:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getFullStopKeyword_1_0_0()); 
            }
            match(input,48,FOLLOW_48_in_rule__PostfixExpr__Group_1_0__0__Impl8673); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getFullStopKeyword_1_0_0()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_0__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_0__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4296:1: rule__PostfixExpr__Group_1_0__1 : rule__PostfixExpr__Group_1_0__1__Impl ;
    public final void rule__PostfixExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4300:1: ( rule__PostfixExpr__Group_1_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4301:2: rule__PostfixExpr__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_0__1__Impl_in_rule__PostfixExpr__Group_1_0__18704);
            rule__PostfixExpr__Group_1_0__1__Impl();
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
    // $ANTLR end rule__PostfixExpr__Group_1_0__1


    // $ANTLR start rule__PostfixExpr__Group_1_0__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4307:1: rule__PostfixExpr__Group_1_0__1__Impl : ( RULE_ID ) ;
    public final void rule__PostfixExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4311:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4312:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4313:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__Group_1_0__1__Impl8731); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_1_0_1()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_0__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4328:1: rule__PostfixExpr__Group_1_1__0 : rule__PostfixExpr__Group_1_1__0__Impl rule__PostfixExpr__Group_1_1__1 ;
    public final void rule__PostfixExpr__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: ( rule__PostfixExpr__Group_1_1__0__Impl rule__PostfixExpr__Group_1_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4333:2: rule__PostfixExpr__Group_1_1__0__Impl rule__PostfixExpr__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1__08764);
            rule__PostfixExpr__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__1_in_rule__PostfixExpr__Group_1_1__08767);
            rule__PostfixExpr__Group_1_1__1();
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
    // $ANTLR end rule__PostfixExpr__Group_1_1__0


    // $ANTLR start rule__PostfixExpr__Group_1_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4340:1: rule__PostfixExpr__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__PostfixExpr__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4344:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4345:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4346:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,34,FOLLOW_34_in_rule__PostfixExpr__Group_1_1__0__Impl8795); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_1_1_0()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_1__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4359:1: rule__PostfixExpr__Group_1_1__1 : rule__PostfixExpr__Group_1_1__1__Impl rule__PostfixExpr__Group_1_1__2 ;
    public final void rule__PostfixExpr__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4363:1: ( rule__PostfixExpr__Group_1_1__1__Impl rule__PostfixExpr__Group_1_1__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4364:2: rule__PostfixExpr__Group_1_1__1__Impl rule__PostfixExpr__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1__18826);
            rule__PostfixExpr__Group_1_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__2_in_rule__PostfixExpr__Group_1_1__18829);
            rule__PostfixExpr__Group_1_1__2();
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
    // $ANTLR end rule__PostfixExpr__Group_1_1__1


    // $ANTLR start rule__PostfixExpr__Group_1_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4371:1: rule__PostfixExpr__Group_1_1__1__Impl : ( ( rule__PostfixExpr__Group_1_1_1__0 )? ) ;
    public final void rule__PostfixExpr__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4375:1: ( ( ( rule__PostfixExpr__Group_1_1_1__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: ( ( rule__PostfixExpr__Group_1_1_1__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4376:1: ( ( rule__PostfixExpr__Group_1_1_1__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4377:1: ( rule__PostfixExpr__Group_1_1_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getGroup_1_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:1: ( rule__PostfixExpr__Group_1_1_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_STRING)||LA31_0==34||LA31_0==47||(LA31_0>=51 && LA31_0<=52)||(LA31_0>=54 && LA31_0<=55)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4378:2: rule__PostfixExpr__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1__0_in_rule__PostfixExpr__Group_1_1__1__Impl8856);
                    rule__PostfixExpr__Group_1_1_1__0();
                    _fsp--;
                    if (failed) return ;

                    }
                    break;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getGroup_1_1_1()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_1__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_1__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4388:1: rule__PostfixExpr__Group_1_1__2 : rule__PostfixExpr__Group_1_1__2__Impl ;
    public final void rule__PostfixExpr__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4392:1: ( rule__PostfixExpr__Group_1_1__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4393:2: rule__PostfixExpr__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__2__Impl_in_rule__PostfixExpr__Group_1_1__28887);
            rule__PostfixExpr__Group_1_1__2__Impl();
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
    // $ANTLR end rule__PostfixExpr__Group_1_1__2


    // $ANTLR start rule__PostfixExpr__Group_1_1__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4399:1: rule__PostfixExpr__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__PostfixExpr__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4403:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4404:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4405:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,35,FOLLOW_35_in_rule__PostfixExpr__Group_1_1__2__Impl8915); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_1_1_2()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_1__2__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_1_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4424:1: rule__PostfixExpr__Group_1_1_1__0 : rule__PostfixExpr__Group_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1__1 ;
    public final void rule__PostfixExpr__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4428:1: ( rule__PostfixExpr__Group_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:2: rule__PostfixExpr__Group_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1_1__08952);
            rule__PostfixExpr__Group_1_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1__1_in_rule__PostfixExpr__Group_1_1_1__08955);
            rule__PostfixExpr__Group_1_1_1__1();
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
    // $ANTLR end rule__PostfixExpr__Group_1_1_1__0


    // $ANTLR start rule__PostfixExpr__Group_1_1_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4436:1: rule__PostfixExpr__Group_1_1_1__0__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 ) ) ;
    public final void rule__PostfixExpr__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4440:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4442:1: ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_1_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:1: ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4443:2: rule__PostfixExpr__ExpressionsAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_1_1_0_in_rule__PostfixExpr__Group_1_1_1__0__Impl8982);
            rule__PostfixExpr__ExpressionsAssignment_1_1_1_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_1_1_0()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_1_1__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_1_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4453:1: rule__PostfixExpr__Group_1_1_1__1 : rule__PostfixExpr__Group_1_1_1__1__Impl ;
    public final void rule__PostfixExpr__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4457:1: ( rule__PostfixExpr__Group_1_1_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4458:2: rule__PostfixExpr__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1_1__19012);
            rule__PostfixExpr__Group_1_1_1__1__Impl();
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
    // $ANTLR end rule__PostfixExpr__Group_1_1_1__1


    // $ANTLR start rule__PostfixExpr__Group_1_1_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:1: rule__PostfixExpr__Group_1_1_1__1__Impl : ( ( rule__PostfixExpr__Group_1_1_1_1__0 )* ) ;
    public final void rule__PostfixExpr__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4468:1: ( ( ( rule__PostfixExpr__Group_1_1_1_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: ( ( rule__PostfixExpr__Group_1_1_1_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4469:1: ( ( rule__PostfixExpr__Group_1_1_1_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4470:1: ( rule__PostfixExpr__Group_1_1_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getGroup_1_1_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: ( rule__PostfixExpr__Group_1_1_1_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:2: rule__PostfixExpr__Group_1_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1_1__0_in_rule__PostfixExpr__Group_1_1_1__1__Impl9039);
            	    rule__PostfixExpr__Group_1_1_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getGroup_1_1_1_1()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_1_1__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_1_1_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4485:1: rule__PostfixExpr__Group_1_1_1_1__0 : rule__PostfixExpr__Group_1_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1_1__1 ;
    public final void rule__PostfixExpr__Group_1_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4489:1: ( rule__PostfixExpr__Group_1_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4490:2: rule__PostfixExpr__Group_1_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1_1_1__09074);
            rule__PostfixExpr__Group_1_1_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1_1__1_in_rule__PostfixExpr__Group_1_1_1_1__09077);
            rule__PostfixExpr__Group_1_1_1_1__1();
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
    // $ANTLR end rule__PostfixExpr__Group_1_1_1_1__0


    // $ANTLR start rule__PostfixExpr__Group_1_1_1_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:1: rule__PostfixExpr__Group_1_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__PostfixExpr__Group_1_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4501:1: ( ( ',' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:1: ( ',' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4502:1: ( ',' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4503:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getCommaKeyword_1_1_1_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__PostfixExpr__Group_1_1_1_1__0__Impl9105); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getCommaKeyword_1_1_1_1_0()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_1_1_1__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_1_1_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4516:1: rule__PostfixExpr__Group_1_1_1_1__1 : rule__PostfixExpr__Group_1_1_1_1__1__Impl ;
    public final void rule__PostfixExpr__Group_1_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4520:1: ( rule__PostfixExpr__Group_1_1_1_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4521:2: rule__PostfixExpr__Group_1_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1_1_1__19136);
            rule__PostfixExpr__Group_1_1_1_1__1__Impl();
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
    // $ANTLR end rule__PostfixExpr__Group_1_1_1_1__1


    // $ANTLR start rule__PostfixExpr__Group_1_1_1_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4527:1: rule__PostfixExpr__Group_1_1_1_1__1__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 ) ) ;
    public final void rule__PostfixExpr__Group_1_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4531:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4532:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4533:1: ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_1_1_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4534:1: ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4534:2: rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1_in_rule__PostfixExpr__Group_1_1_1_1__1__Impl9163);
            rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_1_1_1_1()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_1_1_1__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_2__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4548:1: rule__PostfixExpr__Group_1_2__0 : rule__PostfixExpr__Group_1_2__0__Impl rule__PostfixExpr__Group_1_2__1 ;
    public final void rule__PostfixExpr__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: ( rule__PostfixExpr__Group_1_2__0__Impl rule__PostfixExpr__Group_1_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4553:2: rule__PostfixExpr__Group_1_2__0__Impl rule__PostfixExpr__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__0__Impl_in_rule__PostfixExpr__Group_1_2__09197);
            rule__PostfixExpr__Group_1_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__1_in_rule__PostfixExpr__Group_1_2__09200);
            rule__PostfixExpr__Group_1_2__1();
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
    // $ANTLR end rule__PostfixExpr__Group_1_2__0


    // $ANTLR start rule__PostfixExpr__Group_1_2__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4560:1: rule__PostfixExpr__Group_1_2__0__Impl : ( '[' ) ;
    public final void rule__PostfixExpr__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4564:1: ( ( '[' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: ( '[' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4565:1: ( '[' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4566:1: '['
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_1_2_0()); 
            }
            match(input,49,FOLLOW_49_in_rule__PostfixExpr__Group_1_2__0__Impl9228); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_1_2_0()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_2__0__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_2__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4579:1: rule__PostfixExpr__Group_1_2__1 : rule__PostfixExpr__Group_1_2__1__Impl rule__PostfixExpr__Group_1_2__2 ;
    public final void rule__PostfixExpr__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4583:1: ( rule__PostfixExpr__Group_1_2__1__Impl rule__PostfixExpr__Group_1_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4584:2: rule__PostfixExpr__Group_1_2__1__Impl rule__PostfixExpr__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__1__Impl_in_rule__PostfixExpr__Group_1_2__19259);
            rule__PostfixExpr__Group_1_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__2_in_rule__PostfixExpr__Group_1_2__19262);
            rule__PostfixExpr__Group_1_2__2();
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
    // $ANTLR end rule__PostfixExpr__Group_1_2__1


    // $ANTLR start rule__PostfixExpr__Group_1_2__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4591:1: rule__PostfixExpr__Group_1_2__1__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__PostfixExpr__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4595:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4596:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4597:1: ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:1: ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4598:2: rule__PostfixExpr__ExpressionsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_2_1_in_rule__PostfixExpr__Group_1_2__1__Impl9289);
            rule__PostfixExpr__ExpressionsAssignment_1_2_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_2_1()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_2__1__Impl


    // $ANTLR start rule__PostfixExpr__Group_1_2__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4608:1: rule__PostfixExpr__Group_1_2__2 : rule__PostfixExpr__Group_1_2__2__Impl ;
    public final void rule__PostfixExpr__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4612:1: ( rule__PostfixExpr__Group_1_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4613:2: rule__PostfixExpr__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__2__Impl_in_rule__PostfixExpr__Group_1_2__29319);
            rule__PostfixExpr__Group_1_2__2__Impl();
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
    // $ANTLR end rule__PostfixExpr__Group_1_2__2


    // $ANTLR start rule__PostfixExpr__Group_1_2__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:1: rule__PostfixExpr__Group_1_2__2__Impl : ( ']' ) ;
    public final void rule__PostfixExpr__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4623:1: ( ( ']' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4624:1: ( ']' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4624:1: ( ']' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4625:1: ']'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_1_2_2()); 
            }
            match(input,50,FOLLOW_50_in_rule__PostfixExpr__Group_1_2__2__Impl9347); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_1_2_2()); 
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
    // $ANTLR end rule__PostfixExpr__Group_1_2__2__Impl


    // $ANTLR start rule__Constant__Group_0__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4644:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4648:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4649:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_0__0__Impl_in_rule__Constant__Group_0__09384);
            rule__Constant__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group_0__1_in_rule__Constant__Group_0__09387);
            rule__Constant__Group_0__1();
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
    // $ANTLR end rule__Constant__Group_0__0


    // $ANTLR start rule__Constant__Group_0__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4656:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4660:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4661:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4662:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstantAction_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4663:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4665:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getConstantAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group_0__0__Impl


    // $ANTLR start rule__Constant__Group_0__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4675:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4679:1: ( rule__Constant__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4680:2: rule__Constant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_0__1__Impl_in_rule__Constant__Group_0__19445);
            rule__Constant__Group_0__1__Impl();
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
    // $ANTLR end rule__Constant__Group_0__1


    // $ANTLR start rule__Constant__Group_0__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4686:1: rule__Constant__Group_0__1__Impl : ( 'true' ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4690:1: ( ( 'true' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: ( 'true' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4691:1: ( 'true' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4692:1: 'true'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTrueKeyword_0_1()); 
            }
            match(input,51,FOLLOW_51_in_rule__Constant__Group_0__1__Impl9473); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getTrueKeyword_0_1()); 
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
    // $ANTLR end rule__Constant__Group_0__1__Impl


    // $ANTLR start rule__Constant__Group_1__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4709:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4713:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4714:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_1__0__Impl_in_rule__Constant__Group_1__09508);
            rule__Constant__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group_1__1_in_rule__Constant__Group_1__09511);
            rule__Constant__Group_1__1();
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
    // $ANTLR end rule__Constant__Group_1__0


    // $ANTLR start rule__Constant__Group_1__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4721:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4725:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4726:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4726:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4727:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstantAction_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4728:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4730:1: 
            {
            }

            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Constant__Group_1__0__Impl


    // $ANTLR start rule__Constant__Group_1__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4740:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4744:1: ( rule__Constant__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4745:2: rule__Constant__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_1__1__Impl_in_rule__Constant__Group_1__19569);
            rule__Constant__Group_1__1__Impl();
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
    // $ANTLR end rule__Constant__Group_1__1


    // $ANTLR start rule__Constant__Group_1__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: rule__Constant__Group_1__1__Impl : ( 'false' ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4755:1: ( ( 'false' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: ( 'false' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4756:1: ( 'false' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4757:1: 'false'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getFalseKeyword_1_1()); 
            }
            match(input,52,FOLLOW_52_in_rule__Constant__Group_1__1__Impl9597); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getFalseKeyword_1_1()); 
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
    // $ANTLR end rule__Constant__Group_1__1__Impl


    // $ANTLR start rule__FLOAT__Group__0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4774:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4779:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_rule__FLOAT__Group__0__Impl_in_rule__FLOAT__Group__09632);
            rule__FLOAT__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FLOAT__Group__1_in_rule__FLOAT__Group__09635);
            rule__FLOAT__Group__1();
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
    // $ANTLR end rule__FLOAT__Group__0


    // $ANTLR start rule__FLOAT__Group__0__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4786:1: rule__FLOAT__Group__0__Impl : ( ( rule__FLOAT__FLOATAssignment_0 ) ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4790:1: ( ( ( rule__FLOAT__FLOATAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4791:1: ( ( rule__FLOAT__FLOATAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4791:1: ( ( rule__FLOAT__FLOATAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4792:1: ( rule__FLOAT__FLOATAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4793:1: ( rule__FLOAT__FLOATAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4793:2: rule__FLOAT__FLOATAssignment_0
            {
            pushFollow(FOLLOW_rule__FLOAT__FLOATAssignment_0_in_rule__FLOAT__Group__0__Impl9662);
            rule__FLOAT__FLOATAssignment_0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getFLOATAssignment_0()); 
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
    // $ANTLR end rule__FLOAT__Group__0__Impl


    // $ANTLR start rule__FLOAT__Group__1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4803:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4807:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4808:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_rule__FLOAT__Group__1__Impl_in_rule__FLOAT__Group__19692);
            rule__FLOAT__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FLOAT__Group__2_in_rule__FLOAT__Group__19695);
            rule__FLOAT__Group__2();
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
    // $ANTLR end rule__FLOAT__Group__1


    // $ANTLR start rule__FLOAT__Group__1__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4815:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4819:1: ( ( '.' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: ( '.' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: ( '.' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4821:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__FLOAT__Group__1__Impl9723); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
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
    // $ANTLR end rule__FLOAT__Group__1__Impl


    // $ANTLR start rule__FLOAT__Group__2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4834:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4838:1: ( rule__FLOAT__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4839:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FLOAT__Group__2__Impl_in_rule__FLOAT__Group__29754);
            rule__FLOAT__Group__2__Impl();
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
    // $ANTLR end rule__FLOAT__Group__2


    // $ANTLR start rule__FLOAT__Group__2__Impl
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4845:1: rule__FLOAT__Group__2__Impl : ( ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* ) ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4849:1: ( ( ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: ( ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: ( ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4851:1: ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4851:1: ( ( rule__FLOAT__FLOATAssignment_2 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4852:1: ( rule__FLOAT__FLOATAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4853:1: ( rule__FLOAT__FLOATAssignment_2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4853:2: rule__FLOAT__FLOATAssignment_2
            {
            pushFollow(FOLLOW_rule__FLOAT__FLOATAssignment_2_in_rule__FLOAT__Group__2__Impl9783);
            rule__FLOAT__FLOATAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getFLOATAssignment_2()); 
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: ( ( rule__FLOAT__FLOATAssignment_2 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4857:1: ( rule__FLOAT__FLOATAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:1: ( rule__FLOAT__FLOATAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_INT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4858:2: rule__FLOAT__FLOATAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__FLOAT__FLOATAssignment_2_in_rule__FLOAT__Group__2__Impl9795);
            	    rule__FLOAT__FLOATAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getFLOATAssignment_2()); 
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
    // $ANTLR end rule__FLOAT__Group__2__Impl


    // $ANTLR start rule__Model__FunctionsAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4876:1: rule__Model__FunctionsAssignment_0 : ( rulefunctionDefinition ) ;
    public final void rule__Model__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: ( ( rulefunctionDefinition ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: ( rulefunctionDefinition )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4881:1: ( rulefunctionDefinition )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4882:1: rulefunctionDefinition
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionsFunctionDefinitionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulefunctionDefinition_in_rule__Model__FunctionsAssignment_09839);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4891:1: rule__Model__MainAssignment_1 : ( rulemainFunction ) ;
    public final void rule__Model__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4895:1: ( ( rulemainFunction ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4896:1: ( rulemainFunction )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4896:1: ( rulemainFunction )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4897:1: rulemainFunction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMainMainFunctionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulemainFunction_in_rule__Model__MainAssignment_19870);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4906:1: rule__FunctionDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4911:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4912:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_09901); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4921:1: rule__FunctionDefinition__FormalParamsAssignment_2 : ( ruleformalParams ) ;
    public final void rule__FunctionDefinition__FormalParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4925:1: ( ( ruleformalParams ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: ( ruleformalParams )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4926:1: ( ruleformalParams )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4927:1: ruleformalParams
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getFormalParamsFormalParamsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_rule__FunctionDefinition__FormalParamsAssignment_29932);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4936:1: rule__FunctionDefinition__ReturnTypeAssignment_4_1 : ( ruletype ) ;
    public final void rule__FunctionDefinition__ReturnTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4940:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4941:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4942:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__FunctionDefinition__ReturnTypeAssignment_4_19963);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4951:1: rule__FunctionDefinition__BlocksAssignment_5 : ( ruleblock ) ;
    public final void rule__FunctionDefinition__BlocksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4955:1: ( ( ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4956:1: ( ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4956:1: ( ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4957:1: ruleblock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getBlocksBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleblock_in_rule__FunctionDefinition__BlocksAssignment_59994);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4966:1: rule__MainFunction__MainAssignment_0 : ( ( 'main' ) ) ;
    public final void rule__MainFunction__MainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4970:1: ( ( ( 'main' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( ( 'main' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4971:1: ( ( 'main' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4972:1: ( 'main' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4973:1: ( 'main' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4974:1: 'main'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0()); 
            }
            match(input,53,FOLLOW_53_in_rule__MainFunction__MainAssignment_010030); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4989:1: rule__MainFunction__FormalParamsAssignment_2 : ( ruleformalParams ) ;
    public final void rule__MainFunction__FormalParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: ( ( ruleformalParams ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4994:1: ( ruleformalParams )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4994:1: ( ruleformalParams )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4995:1: ruleformalParams
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getFormalParamsFormalParamsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_rule__MainFunction__FormalParamsAssignment_210069);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5004:1: rule__MainFunction__BlocksAssignment_4 : ( ruleblock ) ;
    public final void rule__MainFunction__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: ( ( ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:1: ( ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5009:1: ( ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5010:1: ruleblock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getBlocksBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleblock_in_rule__MainFunction__BlocksAssignment_410100);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5019:1: rule__FormalParams__ParamsAssignment_0 : ( ruleparam ) ;
    public final void rule__FormalParams__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5023:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5024:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5025:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_010131);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5034:1: rule__FormalParams__ParamsAssignment_1_1 : ( ruleparam ) ;
    public final void rule__FormalParams__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5038:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5040:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_1_110162);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5049:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5053:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5054:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5054:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5055:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Param__NameAssignment_110193); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5064:1: rule__Block__StatementsAssignment_2 : ( rulestatement ) ;
    public final void rule__Block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5068:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5070:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Block__StatementsAssignment_210224);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5079:1: rule__Type__TypesAssignment : ( ( rule__Type__TypesAlternatives_0 ) ) ;
    public final void rule__Type__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5083:1: ( ( ( rule__Type__TypesAlternatives_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: ( ( rule__Type__TypesAlternatives_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: ( ( rule__Type__TypesAlternatives_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5085:1: ( rule__Type__TypesAlternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypesAlternatives_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5086:1: ( rule__Type__TypesAlternatives_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5086:2: rule__Type__TypesAlternatives_0
            {
            pushFollow(FOLLOW_rule__Type__TypesAlternatives_0_in_rule__Type__TypesAssignment10255);
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


    // $ANTLR start rule__Statement__PostFixExpressionAssignment_0_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5095:1: rule__Statement__PostFixExpressionAssignment_0_1 : ( rulepostfixExpr ) ;
    public final void rule__Statement__PostFixExpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: ( ( rulepostfixExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5100:1: ( rulepostfixExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5100:1: ( rulepostfixExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5101:1: rulepostfixExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_rule__Statement__PostFixExpressionAssignment_0_110288);
            rulepostfixExpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_0_1_0()); 
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
    // $ANTLR end rule__Statement__PostFixExpressionAssignment_0_1


    // $ANTLR start rule__Statement__AssignmentsAssignment_2_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5110:1: rule__Statement__AssignmentsAssignment_2_1 : ( ruleassignment ) ;
    public final void rule__Statement__AssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: ( ( ruleassignment ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5115:1: ( ruleassignment )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5115:1: ( ruleassignment )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5116:1: ruleassignment
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleassignment_in_rule__Statement__AssignmentsAssignment_2_110319);
            ruleassignment();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_2_1_0()); 
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
    // $ANTLR end rule__Statement__AssignmentsAssignment_2_1


    // $ANTLR start rule__Statement__ExprsAssignment_3_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5125:1: rule__Statement__ExprsAssignment_3_2 : ( ruleexpr ) ;
    public final void rule__Statement__ExprsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5130:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5131:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_3_210350);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_3_2_0()); 
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
    // $ANTLR end rule__Statement__ExprsAssignment_3_2


    // $ANTLR start rule__Statement__StatementsAssignment_4_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5140:1: rule__Statement__StatementsAssignment_4_3 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5145:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5146:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_4_310381);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_3_0()); 
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
    // $ANTLR end rule__Statement__StatementsAssignment_4_3


    // $ANTLR start rule__Statement__StatementsAssignment_4_4_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5155:1: rule__Statement__StatementsAssignment_4_4_1 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5160:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5161:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_4_4_110412);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0()); 
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
    // $ANTLR end rule__Statement__StatementsAssignment_4_4_1


    // $ANTLR start rule__Statement__ExprsAssignment_5_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5170:1: rule__Statement__ExprsAssignment_5_3 : ( ruleexpr ) ;
    public final void rule__Statement__ExprsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5175:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5176:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_5_3_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_5_310443);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_5_3_0()); 
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
    // $ANTLR end rule__Statement__ExprsAssignment_5_3


    // $ANTLR start rule__Statement__StatementsAssignment_5_5
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5185:1: rule__Statement__StatementsAssignment_5_5 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5190:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5190:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5191:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_5_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_5_510474);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_5_0()); 
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
    // $ANTLR end rule__Statement__StatementsAssignment_5_5


    // $ANTLR start rule__Statement__StatementsAssignment_6_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5200:1: rule__Statement__StatementsAssignment_6_3 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5205:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5206:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_6_310505);
            rulestatement();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_6_3_0()); 
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
    // $ANTLR end rule__Statement__StatementsAssignment_6_3


    // $ANTLR start rule__Declaration__VariableTypeAssignment_0_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5215:1: rule__Declaration__VariableTypeAssignment_0_0 : ( ruletype ) ;
    public final void rule__Declaration__VariableTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5220:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5220:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5221:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getVariableTypeTypeParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__Declaration__VariableTypeAssignment_0_010536);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5230:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5235:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5236:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_110567); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5245:1: rule__Declaration__ExprsAssignment_2_1 : ( ruleexpr ) ;
    public final void rule__Declaration__ExprsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5250:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5251:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getExprsExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Declaration__ExprsAssignment_2_110598);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5260:1: rule__Assignment__ExprsAssignment_2 : ( ruleexpr ) ;
    public final void rule__Assignment__ExprsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5265:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5266:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExprsExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Assignment__ExprsAssignment_210629);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5275:1: rule__Expr__AndExprsAssignment_1_1 : ( ruleandExpr ) ;
    public final void rule__Expr__AndExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: ( ( ruleandExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:1: ( ruleandExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5280:1: ( ruleandExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5281:1: ruleandExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprsAndExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_rule__Expr__AndExprsAssignment_1_110660);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5290:1: rule__AndExpr__EqExprsAssignment_1_1 : ( ruleeqExpr ) ;
    public final void rule__AndExpr__EqExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5294:1: ( ( ruleeqExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( ruleeqExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5295:1: ( ruleeqExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5296:1: ruleeqExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprsEqExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_rule__AndExpr__EqExprsAssignment_1_110691);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5305:1: rule__EqExpr__RelExprsAssignment_1_1 : ( rulerelExpr ) ;
    public final void rule__EqExpr__RelExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: ( ( rulerelExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: ( rulerelExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5310:1: ( rulerelExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5311:1: rulerelExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprsRelExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_rule__EqExpr__RelExprsAssignment_1_110722);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5320:1: rule__RelExpr__AddExprAssignment_1_1 : ( ruleaddExpr ) ;
    public final void rule__RelExpr__AddExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: ( ( ruleaddExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ( ruleaddExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5325:1: ( ruleaddExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5326:1: ruleaddExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprAddExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rule__RelExpr__AddExprAssignment_1_110753);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5335:1: rule__AddExpr__MulExprsAssignment_1_1 : ( rulemulExpr ) ;
    public final void rule__AddExpr__MulExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5339:1: ( ( rulemulExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: ( rulemulExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5340:1: ( rulemulExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5341:1: rulemulExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprsMulExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_rule__AddExpr__MulExprsAssignment_1_110784);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5350:1: rule__MulExpr__AtomsAssignment_0 : ( ruleatom ) ;
    public final void rule__MulExpr__AtomsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5354:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5355:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5356:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_010815);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5365:1: rule__MulExpr__AtomsAssignment_1_1 : ( ruleatom ) ;
    public final void rule__MulExpr__AtomsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5369:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5370:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5371:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_1_110846);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5380:1: rule__Atom__ConstantsAssignment_4_1 : ( ruleconstant ) ;
    public final void rule__Atom__ConstantsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5384:1: ( ( ruleconstant ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5385:1: ( ruleconstant )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5385:1: ( ruleconstant )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5386:1: ruleconstant
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getConstantsConstantParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleconstant_in_rule__Atom__ConstantsAssignment_4_110877);
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


    // $ANTLR start rule__PostfixExpr__ExistingVariableAssignment_0_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5395:1: rule__PostfixExpr__ExistingVariableAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixExpr__ExistingVariableAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5399:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5401:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationCrossReference_0_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5402:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5403:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_010912); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationIDTerminalRuleCall_0_0_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationCrossReference_0_0_0()); 
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
    // $ANTLR end rule__PostfixExpr__ExistingVariableAssignment_0_0


    // $ANTLR start rule__PostfixExpr__ExistingVariableAssignment_0_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5414:1: rule__PostfixExpr__ExistingVariableAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixExpr__ExistingVariableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5418:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5419:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5419:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5420:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableParamCrossReference_0_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5421:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5422:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableParamIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_110951); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableParamIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableParamCrossReference_0_1_0()); 
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
    // $ANTLR end rule__PostfixExpr__ExistingVariableAssignment_0_1


    // $ANTLR start rule__PostfixExpr__ExistingVariableAssignment_0_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5433:1: rule__PostfixExpr__ExistingVariableAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixExpr__ExistingVariableAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5437:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5438:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5438:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5439:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableFunctionDefinitionCrossReference_0_2_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5440:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5441:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableFunctionDefinitionIDTerminalRuleCall_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_210990); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableFunctionDefinitionIDTerminalRuleCall_0_2_0_1()); 
            }

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExistingVariableFunctionDefinitionCrossReference_0_2_0()); 
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
    // $ANTLR end rule__PostfixExpr__ExistingVariableAssignment_0_2


    // $ANTLR start rule__PostfixExpr__ExpressionsAssignment_1_1_1_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5452:1: rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5457:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5458:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_1_1_011025);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_0_0()); 
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
    // $ANTLR end rule__PostfixExpr__ExpressionsAssignment_1_1_1_0


    // $ANTLR start rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5467:1: rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5471:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5472:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5473:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_111056);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_1_1_0()); 
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
    // $ANTLR end rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1


    // $ANTLR start rule__PostfixExpr__ExpressionsAssignment_1_2_1
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5482:1: rule__PostfixExpr__ExpressionsAssignment_1_2_1 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5486:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5487:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5488:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_2_111087);
            ruleexpr();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_2_1_0()); 
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
    // $ANTLR end rule__PostfixExpr__ExpressionsAssignment_1_2_1


    // $ANTLR start rule__Constant__FloatAssignment_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5497:1: rule__Constant__FloatAssignment_2 : ( ruleFLOAT ) ;
    public final void rule__Constant__FloatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5501:1: ( ( ruleFLOAT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5502:1: ( ruleFLOAT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5502:1: ( ruleFLOAT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5503:1: ruleFLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getFloatFLOATParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFLOAT_in_rule__Constant__FloatAssignment_211118);
            ruleFLOAT();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getConstantAccess().getFloatFLOATParserRuleCall_2_0()); 
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
    // $ANTLR end rule__Constant__FloatAssignment_2


    // $ANTLR start rule__Constant__IntegerAssignment_3
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5512:1: rule__Constant__IntegerAssignment_3 : ( RULE_INT ) ;
    public final void rule__Constant__IntegerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5518:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getIntegerINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Constant__IntegerAssignment_311149); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5527:1: rule__Constant__StringAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5531:1: ( ( RULE_STRING ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: ( RULE_STRING )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: ( RULE_STRING )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5533:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constant__StringAssignment_411180); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5542:1: rule__Constant__NullAssignment_5 : ( ( 'null' ) ) ;
    public final void rule__Constant__NullAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5546:1: ( ( ( 'null' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ( 'null' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: ( ( 'null' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5548:1: ( 'null' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNullNullKeyword_5_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5549:1: ( 'null' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5550:1: 'null'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNullNullKeyword_5_0()); 
            }
            match(input,54,FOLLOW_54_in_rule__Constant__NullAssignment_511216); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5565:1: rule__Constant__InfinityAssignment_6 : ( ( 'infty' ) ) ;
    public final void rule__Constant__InfinityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5569:1: ( ( ( 'infty' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5570:1: ( ( 'infty' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5570:1: ( ( 'infty' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5571:1: ( 'infty' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5572:1: ( 'infty' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5573:1: 'infty'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0()); 
            }
            match(input,55,FOLLOW_55_in_rule__Constant__InfinityAssignment_611260); if (failed) return ;
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


    // $ANTLR start rule__FLOAT__FLOATAssignment_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5588:1: rule__FLOAT__FLOATAssignment_0 : ( RULE_INT ) ;
    public final void rule__FLOAT__FLOATAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5592:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5593:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5593:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5594:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FLOAT__FLOATAssignment_011299); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_0_0()); 
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
    // $ANTLR end rule__FLOAT__FLOATAssignment_0


    // $ANTLR start rule__FLOAT__FLOATAssignment_2
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5603:1: rule__FLOAT__FLOATAssignment_2 : ( RULE_INT ) ;
    public final void rule__FLOAT__FLOATAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5607:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5608:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5608:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5609:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FLOAT__FLOATAssignment_211330); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_2_0()); 
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
    // $ANTLR end rule__FLOAT__FLOATAssignment_2

    // $ANTLR start synpred9
    public final void synpred9_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ( ( rule__Statement__Group_0__0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ( rule__Statement__Group_0__0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:773:1: ( ( rule__Statement__Group_0__0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:774:1: ( rule__Statement__Group_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGroup_0()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:775:1: ( rule__Statement__Group_0__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:775:2: rule__Statement__Group_0__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_0__0_in_synpred91601);
        rule__Statement__Group_0__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred11
    public final void synpred11_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:6: ( ( ( rule__Statement__Group_2__0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:6: ( ( rule__Statement__Group_2__0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:785:6: ( ( rule__Statement__Group_2__0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:786:1: ( rule__Statement__Group_2__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGroup_2()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:787:1: ( rule__Statement__Group_2__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:787:2: rule__Statement__Group_2__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_2__0_in_synpred111637);
        rule__Statement__Group_2__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11

    // $ANTLR start synpred26
    public final void synpred26_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:973:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:974:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_0()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:2: rule__PostfixExpr__ExistingVariableAssignment_0_0
        {
        pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_0_in_synpred262088);
        rule__PostfixExpr__ExistingVariableAssignment_0_0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred26

    // $ANTLR start synpred27
    public final void synpred27_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:979:6: ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:979:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:979:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:980:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_1 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_1()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_1 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:2: rule__PostfixExpr__ExistingVariableAssignment_0_1
        {
        pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_1_in_synpred272106);
        rule__PostfixExpr__ExistingVariableAssignment_0_1();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27

    // $ANTLR start synpred44
    public final void synpred44_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:2: ( rule__Statement__Group_4_4__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:2: rule__Statement__Group_4_4__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_4_4__0_in_synpred444967);
        rule__Statement__Group_4_4__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred44

    public final boolean synpred44() {
        backtracking++;
        int start = input.mark();
        try {
            synpred44_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred27() {
        backtracking++;
        int start = input.mark();
        try {
            synpred27_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred26() {
        backtracking++;
        int start = input.mark();
        try {
            synpred26_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_ruledeclaration_in_entryRuledeclaration547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuledeclaration554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0_in_ruledeclaration580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_entryRuleassignment607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleassignment614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleassignment640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_entryRuleexpr667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleexpr674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0_in_ruleexpr700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_entryRuleandExpr727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleandExpr734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0_in_ruleandExpr760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_entryRuleeqExpr787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleeqExpr794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__0_in_ruleeqExpr820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_entryRulerelExpr847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulerelExpr854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__0_in_rulerelExpr880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_entryRuleaddExpr907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleaddExpr914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__0_in_ruleaddExpr940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_entryRulemulExpr967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulemulExpr974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__0_in_rulemulExpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_entryRuleatom1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleatom1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Alternatives_in_ruleatom1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_entryRulepostfixExpr1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulepostfixExpr1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__0_in_rulepostfixExpr1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_entryRuleconstant1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleconstant1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Alternatives_in_ruleconstant1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_entryRuleFLOAT1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFLOAT1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__0_in_ruleFLOAT1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_entryRuleendExpr1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleendExpr1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EndExpr__Alternatives_in_ruleendExpr1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Block__Alternatives_11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Block__Alternatives_11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Block__Alternatives_31392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Block__Alternatives_31412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__TypesAlternatives_01447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__TypesAlternatives_01467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__TypesAlternatives_01487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__TypesAlternatives_01507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type__TypesAlternatives_01527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__TypesAlternatives_01547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__TypesAlternatives_01567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives1691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__0_in_rule__Statement__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Statement__Alternatives1727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EqExpr__Alternatives_1_01760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EqExpr__Alternatives_1_01780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RelExpr__Alternatives_1_01815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RelExpr__Alternatives_1_01835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RelExpr__Alternatives_1_01855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RelExpr__Alternatives_1_01875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MulExpr__Alternatives_1_01910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MulExpr__Alternatives_1_01930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__MulExpr__Alternatives_1_01950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__0_in_rule__Atom__Alternatives1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives2002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__0_in_rule__Atom__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Atom__Alternatives2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_0_in_rule__PostfixExpr__Alternatives_02088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_1_in_rule__PostfixExpr__Alternatives_02106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_2_in_rule__PostfixExpr__Alternatives_02124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_0__0_in_rule__PostfixExpr__Alternatives_12157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__0_in_rule__PostfixExpr__Alternatives_12175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__0_in_rule__PostfixExpr__Alternatives_12193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__0_in_rule__Constant__Alternatives2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_1__0_in_rule__Constant__Alternatives2244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__FloatAssignment_2_in_rule__Constant__Alternatives2262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__IntegerAssignment_3_in_rule__Constant__Alternatives2280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__StringAssignment_4_in_rule__Constant__Alternatives2298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NullAssignment_5_in_rule__Constant__Alternatives2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__InfinityAssignment_6_in_rule__Constant__Alternatives2334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__EndExpr__Alternatives2368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__EndExpr__Alternatives2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02420 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionsAssignment_0_in_rule__Model__Group__0__Impl2450 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MainAssignment_1_in_rule__Model__Group__1__Impl2508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02542 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__NameAssignment_0_in_rule__FunctionDefinition__Group__0__Impl2572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12602 = new BitSet(new long[]{0x00000008007F0000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__FunctionDefinition__Group__1__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22664 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__FormalParamsAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32725 = new BitSet(new long[]{0x0000001000003000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__FunctionDefinition__Group__3__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42787 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__0_in_rule__FunctionDefinition__Group__4__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__BlocksAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__0__Impl_in_rule__FunctionDefinition__Group_4__02917 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__1_in_rule__FunctionDefinition__Group_4__02920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__FunctionDefinition__Group_4__0__Impl2948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__1__Impl_in_rule__FunctionDefinition__Group_4__12979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_4_1_in_rule__FunctionDefinition__Group_4__1__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__0__Impl_in_rule__MainFunction__Group__03040 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__1_in_rule__MainFunction__Group__03043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__MainAssignment_0_in_rule__MainFunction__Group__0__Impl3070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__1__Impl_in_rule__MainFunction__Group__13100 = new BitSet(new long[]{0x00000008007F0000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__2_in_rule__MainFunction__Group__13103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__MainFunction__Group__1__Impl3131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__2__Impl_in_rule__MainFunction__Group__23162 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__3_in_rule__MainFunction__Group__23165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__FormalParamsAssignment_2_in_rule__MainFunction__Group__2__Impl3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__3__Impl_in_rule__MainFunction__Group__33223 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__4_in_rule__MainFunction__Group__33226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__MainFunction__Group__3__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__4__Impl_in_rule__MainFunction__Group__43285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__BlocksAssignment_4_in_rule__MainFunction__Group__4__Impl3312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__0__Impl_in_rule__FormalParams__Group__03352 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__1_in_rule__FormalParams__Group__03355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__ParamsAssignment_0_in_rule__FormalParams__Group__0__Impl3382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__1__Impl_in_rule__FormalParams__Group__13412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__0_in_rule__FormalParams__Group__1__Impl3439 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__0__Impl_in_rule__FormalParams__Group_1__03474 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__1_in_rule__FormalParams__Group_1__03477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__FormalParams__Group_1__0__Impl3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__1__Impl_in_rule__FormalParams__Group_1__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__ParamsAssignment_1_1_in_rule__FormalParams__Group_1__1__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Param__Group__0__Impl3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__13656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl3683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03717 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13778 = new BitSet(new long[]{0x00000560007FF020L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__13781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_1_in_rule__Block__Group__1__Impl3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__23838 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__23841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StatementsAssignment_2_in_rule__Block__Group__2__Impl3868 = new BitSet(new long[]{0x00000560007F3022L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__33899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Alternatives_3_in_rule__Block__Group__3__Impl3926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03964 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__14025 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__2_in_rule__Statement__Group_0__14028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__PostFixExpressionAssignment_0_1_in_rule__Statement__Group_0__1__Impl4055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__2__Impl_in_rule__Statement__Group_0__24085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_0__2__Impl4112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__04147 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__04150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rule__Statement__Group_1__0__Impl4177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__14206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_1__1__Impl4233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__04266 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__04269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__14327 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__14330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__AssignmentsAssignment_2_1_in_rule__Statement__Group_2__1__Impl4357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__24387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_2__2__Impl4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__04449 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__04452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__14510 = new BitSet(new long[]{0x00D88007000000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__14513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Statement__Group_3__1__Impl4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2__Impl_in_rule__Statement__Group_3__24572 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__3_in_rule__Statement__Group_3__24575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExprsAssignment_3_2_in_rule__Statement__Group_3__2__Impl4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__3__Impl_in_rule__Statement__Group_3__34633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_3__3__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__04697 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__04700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Statement__Group_4__0__Impl4728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__14759 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__14762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__Group_4__1__Impl4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__24818 = new BitSet(new long[]{0x00000560007F3020L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__24821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_4__2__Impl4849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__34880 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__4_in_rule__Statement__Group_4__34883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_4_3_in_rule__Statement__Group_4__3__Impl4910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__4__Impl_in_rule__Statement__Group_4__44940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__0_in_rule__Statement__Group_4__4__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__0__Impl_in_rule__Statement__Group_4_4__05008 = new BitSet(new long[]{0x00000560007F3020L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__1_in_rule__Statement__Group_4_4__05011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Statement__Group_4_4__0__Impl5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__1__Impl_in_rule__Statement__Group_4_4__15070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_4_4_1_in_rule__Statement__Group_4_4__1__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__05131 = new BitSet(new long[]{0x00000000007F0000L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__05134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Statement__Group_5__0__Impl5162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__15193 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__2_in_rule__Statement__Group_5__15196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__Statement__Group_5__1__Impl5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__2__Impl_in_rule__Statement__Group_5__25252 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__3_in_rule__Statement__Group_5__25255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Statement__Group_5__2__Impl5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__3__Impl_in_rule__Statement__Group_5__35314 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__4_in_rule__Statement__Group_5__35317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExprsAssignment_5_3_in_rule__Statement__Group_5__3__Impl5344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__4__Impl_in_rule__Statement__Group_5__45374 = new BitSet(new long[]{0x00000560007F3020L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__5_in_rule__Statement__Group_5__45377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_5__4__Impl5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__5__Impl_in_rule__Statement__Group_5__55436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_5_5_in_rule__Statement__Group_5__5__Impl5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__0__Impl_in_rule__Statement__Group_6__05505 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__1_in_rule__Statement__Group_6__05508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Statement__Group_6__0__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__1__Impl_in_rule__Statement__Group_6__15567 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__2_in_rule__Statement__Group_6__15570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__Group_6__1__Impl5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__2__Impl_in_rule__Statement__Group_6__25626 = new BitSet(new long[]{0x00000560007F3020L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__3_in_rule__Statement__Group_6__25629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_6__2__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__3__Impl_in_rule__Statement__Group_6__35688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_6_3_in_rule__Statement__Group_6__3__Impl5715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__05753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__05756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl5785 = new BitSet(new long[]{0x00000000007F0002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl5797 = new BitSet(new long[]{0x00000000007F0002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__15830 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__15833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__25890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__05954 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__05957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VariableTypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__16014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Declaration__Group_0__1__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__06080 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__06083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Declaration__Group_2__0__Impl6111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__16142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ExprsAssignment_2_1_in_rule__Declaration__Group_2__1__Impl6169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__06203 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__06206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Assignment__Group__0__Impl6233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__16262 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__16265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Assignment__Group__1__Impl6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__26324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExprsAssignment_2_in_rule__Assignment__Group__2__Impl6351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__06387 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__06390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_rule__Expr__Group__0__Impl6417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__16446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl6473 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__06508 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__06511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Expr__Group_1__0__Impl6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__16570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__AndExprsAssignment_1_1_in_rule__Expr__Group_1__1__Impl6597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__06631 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__06634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_rule__AndExpr__Group__0__Impl6661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__16690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl6717 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__06752 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__06755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__AndExpr__Group_1__0__Impl6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__16814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__EqExprsAssignment_1_1_in_rule__AndExpr__Group_1__1__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__0__Impl_in_rule__EqExpr__Group__06875 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__1_in_rule__EqExpr__Group__06878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_rule__EqExpr__Group__0__Impl6905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__1__Impl_in_rule__EqExpr__Group__16934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__0_in_rule__EqExpr__Group__1__Impl6961 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__0__Impl_in_rule__EqExpr__Group_1__06996 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__1_in_rule__EqExpr__Group_1__06999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Alternatives_1_0_in_rule__EqExpr__Group_1__0__Impl7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__1__Impl_in_rule__EqExpr__Group_1__17056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__RelExprsAssignment_1_1_in_rule__EqExpr__Group_1__1__Impl7083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__0__Impl_in_rule__RelExpr__Group__07117 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__1_in_rule__RelExpr__Group__07120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rule__RelExpr__Group__0__Impl7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__1__Impl_in_rule__RelExpr__Group__17176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__0_in_rule__RelExpr__Group__1__Impl7203 = new BitSet(new long[]{0x000000001E000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__0__Impl_in_rule__RelExpr__Group_1__07238 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__1_in_rule__RelExpr__Group_1__07241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Alternatives_1_0_in_rule__RelExpr__Group_1__0__Impl7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__1__Impl_in_rule__RelExpr__Group_1__17298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__AddExprAssignment_1_1_in_rule__RelExpr__Group_1__1__Impl7325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__0__Impl_in_rule__AddExpr__Group__07359 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__1_in_rule__AddExpr__Group__07362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_rule__AddExpr__Group__0__Impl7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__1__Impl_in_rule__AddExpr__Group__17418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__0_in_rule__AddExpr__Group__1__Impl7445 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__0__Impl_in_rule__AddExpr__Group_1__07480 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__1_in_rule__AddExpr__Group_1__07483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGN_in_rule__AddExpr__Group_1__0__Impl7510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__1__Impl_in_rule__AddExpr__Group_1__17539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__MulExprsAssignment_1_1_in_rule__AddExpr__Group_1__1__Impl7566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__0__Impl_in_rule__MulExpr__Group__07600 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__1_in_rule__MulExpr__Group__07603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__AtomsAssignment_0_in_rule__MulExpr__Group__0__Impl7630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__1__Impl_in_rule__MulExpr__Group__17660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__0_in_rule__MulExpr__Group__1__Impl7687 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__0__Impl_in_rule__MulExpr__Group_1__07722 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__1_in_rule__MulExpr__Group_1__07725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Alternatives_1_0_in_rule__MulExpr__Group_1__0__Impl7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__1__Impl_in_rule__MulExpr__Group_1__17782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__AtomsAssignment_1_1_in_rule__MulExpr__Group_1__1__Impl7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__0__Impl_in_rule__Atom__Group_0__07843 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__1_in_rule__Atom__Group_0__07846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Atom__Group_0__0__Impl7874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__1__Impl_in_rule__Atom__Group_0__17905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__Atom__Group_0__1__Impl7932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__07965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__07968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Atom__Group_1__0__Impl7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__18027 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__18030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGN_in_rule__Atom__Group_1__1__Impl8057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__28086 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__3_in_rule__Atom__Group_1__28089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Atom__Group_1__2__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__3__Impl_in_rule__Atom__Group_1__38145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Atom__Group_1__3__Impl8173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__0__Impl_in_rule__Atom__Group_2__08212 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__1_in_rule__Atom__Group_2__08215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Atom__Group_2__0__Impl8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__1__Impl_in_rule__Atom__Group_2__18274 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__2_in_rule__Atom__Group_2__18277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Atom__Group_2__1__Impl8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__2__Impl_in_rule__Atom__Group_2__28333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Atom__Group_2__2__Impl8361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__08398 = new BitSet(new long[]{0x00D80000000000C0L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__08401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__18459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__ConstantsAssignment_4_1_in_rule__Atom__Group_4__1__Impl8486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__0__Impl_in_rule__PostfixExpr__Group__08520 = new BitSet(new long[]{0x0003000400000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__1_in_rule__PostfixExpr__Group__08523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Alternatives_0_in_rule__PostfixExpr__Group__0__Impl8550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__1__Impl_in_rule__PostfixExpr__Group__18580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Alternatives_1_in_rule__PostfixExpr__Group__1__Impl8607 = new BitSet(new long[]{0x0003000400000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_0__0__Impl_in_rule__PostfixExpr__Group_1_0__08642 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_0__1_in_rule__PostfixExpr__Group_1_0__08645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PostfixExpr__Group_1_0__0__Impl8673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_0__1__Impl_in_rule__PostfixExpr__Group_1_0__18704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__Group_1_0__1__Impl8731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1__08764 = new BitSet(new long[]{0x00D8800C000000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__1_in_rule__PostfixExpr__Group_1_1__08767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PostfixExpr__Group_1_1__0__Impl8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1__18826 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__2_in_rule__PostfixExpr__Group_1_1__18829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1__0_in_rule__PostfixExpr__Group_1_1__1__Impl8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__2__Impl_in_rule__PostfixExpr__Group_1_1__28887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__PostfixExpr__Group_1_1__2__Impl8915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1_1__08952 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1__1_in_rule__PostfixExpr__Group_1_1_1__08955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_1_1_0_in_rule__PostfixExpr__Group_1_1_1__0__Impl8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1_1__19012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1_1__0_in_rule__PostfixExpr__Group_1_1_1__1__Impl9039 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1_1_1__09074 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1_1__1_in_rule__PostfixExpr__Group_1_1_1_1__09077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PostfixExpr__Group_1_1_1_1__0__Impl9105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1_1_1__19136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1_in_rule__PostfixExpr__Group_1_1_1_1__1__Impl9163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__0__Impl_in_rule__PostfixExpr__Group_1_2__09197 = new BitSet(new long[]{0x00D88004000000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__1_in_rule__PostfixExpr__Group_1_2__09200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__PostfixExpr__Group_1_2__0__Impl9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__1__Impl_in_rule__PostfixExpr__Group_1_2__19259 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__2_in_rule__PostfixExpr__Group_1_2__19262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_2_1_in_rule__PostfixExpr__Group_1_2__1__Impl9289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__2__Impl_in_rule__PostfixExpr__Group_1_2__29319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__PostfixExpr__Group_1_2__2__Impl9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__0__Impl_in_rule__Constant__Group_0__09384 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__1_in_rule__Constant__Group_0__09387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__1__Impl_in_rule__Constant__Group_0__19445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Constant__Group_0__1__Impl9473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_1__0__Impl_in_rule__Constant__Group_1__09508 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group_1__1_in_rule__Constant__Group_1__09511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_1__1__Impl_in_rule__Constant__Group_1__19569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Constant__Group_1__1__Impl9597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__0__Impl_in_rule__FLOAT__Group__09632 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__1_in_rule__FLOAT__Group__09635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__FLOATAssignment_0_in_rule__FLOAT__Group__0__Impl9662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__1__Impl_in_rule__FLOAT__Group__19692 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__2_in_rule__FLOAT__Group__19695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__FLOAT__Group__1__Impl9723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__2__Impl_in_rule__FLOAT__Group__29754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__FLOATAssignment_2_in_rule__FLOAT__Group__2__Impl9783 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__FLOAT__FLOATAssignment_2_in_rule__FLOAT__Group__2__Impl9795 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_rule__Model__FunctionsAssignment_09839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemainFunction_in_rule__Model__MainAssignment_19870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_09901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_rule__FunctionDefinition__FormalParamsAssignment_29932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__FunctionDefinition__ReturnTypeAssignment_4_19963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__FunctionDefinition__BlocksAssignment_59994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__MainFunction__MainAssignment_010030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_rule__MainFunction__FormalParamsAssignment_210069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__MainFunction__BlocksAssignment_410100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_010131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_1_110162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Param__NameAssignment_110193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Block__StatementsAssignment_210224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypesAlternatives_0_in_rule__Type__TypesAssignment10255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Statement__PostFixExpressionAssignment_0_110288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_rule__Statement__AssignmentsAssignment_2_110319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_3_210350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_4_310381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_4_4_110412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_5_310443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_5_510474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_6_310505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Declaration__VariableTypeAssignment_0_010536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_110567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Declaration__ExprsAssignment_2_110598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Assignment__ExprsAssignment_210629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_rule__Expr__AndExprsAssignment_1_110660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_rule__AndExpr__EqExprsAssignment_1_110691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_rule__EqExpr__RelExprsAssignment_1_110722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rule__RelExpr__AddExprAssignment_1_110753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_rule__AddExpr__MulExprsAssignment_1_110784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_010815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_1_110846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rule__Atom__ConstantsAssignment_4_110877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_010912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_110951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_210990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_1_1_011025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_111056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_2_111087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_rule__Constant__FloatAssignment_211118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Constant__IntegerAssignment_311149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constant__StringAssignment_411180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__Constant__NullAssignment_511216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__Constant__InfinityAssignment_611260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FLOAT__FLOATAssignment_011299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FLOAT__FLOATAssignment_211330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_synpred91601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_synpred111637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_0_in_synpred262088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_1_in_synpred272106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__0_in_synpred444967 = new BitSet(new long[]{0x0000000000000002L});

}