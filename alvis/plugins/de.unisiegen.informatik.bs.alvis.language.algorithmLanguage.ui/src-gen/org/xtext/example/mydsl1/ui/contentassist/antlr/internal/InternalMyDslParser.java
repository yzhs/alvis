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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SIGN", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Boolean'", "'Graph'", "'Vertex'", "'Edge'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'*'", "'/'", "'%'", "','", "';'", "'('", "')'", "':'", "'begin'", "'end'", "'return'", "'if'", "'else'", "'for'", "'in'", "'while'", "'[]'", "'='", "'||'", "'&&'", "'!'", "'.'", "'['", "']'", "'true'", "'false'", "'main'", "'null'", "'infty'"
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
            ruleMemo = new HashMap[393+1];
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


    // $ANTLR start rule__Type__TypesAlternatives_0
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:650:1: rule__Type__TypesAlternatives_0 : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Graph' ) | ( 'Vertex' ) | ( 'Edge' ) );
    public final void rule__Type__TypesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:654:1: ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Graph' ) | ( 'Vertex' ) | ( 'Edge' ) )
            int alt1=6;
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
            case 15:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            case 17:
                {
                alt1=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("650:1: rule__Type__TypesAlternatives_0 : ( ( 'String' ) | ( 'Integer' ) | ( 'Boolean' ) | ( 'Graph' ) | ( 'Vertex' ) | ( 'Edge' ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: ( 'String' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:655:1: ( 'String' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:656:1: 'String'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesStringKeyword_0_0()); 
                    }
                    match(input,12,FOLLOW_12_in_rule__Type__TypesAlternatives_01337); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesStringKeyword_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:663:6: ( 'Integer' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:663:6: ( 'Integer' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:664:1: 'Integer'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesIntegerKeyword_0_1()); 
                    }
                    match(input,13,FOLLOW_13_in_rule__Type__TypesAlternatives_01357); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesIntegerKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:671:6: ( 'Boolean' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:671:6: ( 'Boolean' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:672:1: 'Boolean'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesBooleanKeyword_0_2()); 
                    }
                    match(input,14,FOLLOW_14_in_rule__Type__TypesAlternatives_01377); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesBooleanKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:6: ( 'Graph' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:679:6: ( 'Graph' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:680:1: 'Graph'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesGraphKeyword_0_3()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Type__TypesAlternatives_01397); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesGraphKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:687:6: ( 'Vertex' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:687:6: ( 'Vertex' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:688:1: 'Vertex'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesVertexKeyword_0_4()); 
                    }
                    match(input,16,FOLLOW_16_in_rule__Type__TypesAlternatives_01417); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesVertexKeyword_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:695:6: ( 'Edge' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:695:6: ( 'Edge' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:696:1: 'Edge'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTypeAccess().getTypesEdgeKeyword_0_5()); 
                    }
                    match(input,17,FOLLOW_17_in_rule__Type__TypesAlternatives_01437); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTypeAccess().getTypesEdgeKeyword_0_5()); 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:708:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ruleblock ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:712:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ruleblock ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA2_1 = input.LA(2);

                if ( (synpred6()) ) {
                    alt2=1;
                }
                else if ( (synpred8()) ) {
                    alt2=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("708:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ruleblock ) );", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=4;
                }
                break;
            case 35:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 39:
                {
                alt2=7;
                }
                break;
            case 32:
                {
                alt2=8;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("708:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ( rule__Statement__Group_2__0 ) ) | ( ( rule__Statement__Group_3__0 ) ) | ( ( rule__Statement__Group_4__0 ) ) | ( ( rule__Statement__Group_5__0 ) ) | ( ( rule__Statement__Group_6__0 ) ) | ( ruleblock ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( rule__Statement__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( rule__Statement__Group_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:715:2: rule__Statement__Group_0__0
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:719:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:719:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:720:1: ( rule__Statement__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:721:1: ( rule__Statement__Group_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:721:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1489);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:725:6: ( ( rule__Statement__Group_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:725:6: ( ( rule__Statement__Group_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( rule__Statement__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( rule__Statement__Group_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:727:2: rule__Statement__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1507);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:6: ( ( rule__Statement__Group_3__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:731:6: ( ( rule__Statement__Group_3__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:732:1: ( rule__Statement__Group_3__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_3()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:733:1: ( rule__Statement__Group_3__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:733:2: rule__Statement__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1525);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:6: ( ( rule__Statement__Group_4__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:737:6: ( ( rule__Statement__Group_4__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:738:1: ( rule__Statement__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:1: ( rule__Statement__Group_4__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:739:2: rule__Statement__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1543);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:743:6: ( ( rule__Statement__Group_5__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:743:6: ( ( rule__Statement__Group_5__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:744:1: ( rule__Statement__Group_5__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_5()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:745:1: ( rule__Statement__Group_5__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:745:2: rule__Statement__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives1561);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:749:6: ( ( rule__Statement__Group_6__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:749:6: ( ( rule__Statement__Group_6__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:750:1: ( rule__Statement__Group_6__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getGroup_6()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:751:1: ( rule__Statement__Group_6__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:751:2: rule__Statement__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_6__0_in_rule__Statement__Alternatives1579);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:755:6: ( ruleblock )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:755:6: ( ruleblock )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:756:1: ruleblock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getStatementAccess().getBlockParserRuleCall_7()); 
                    }
                    pushFollow(FOLLOW_ruleblock_in_rule__Statement__Alternatives1597);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:766:1: rule__EqExpr__Alternatives_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__EqExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:770:1: ( ( '==' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("766:1: rule__EqExpr__Alternatives_1_0 : ( ( '==' ) | ( '!=' ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( '==' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:771:1: ( '==' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:772:1: '=='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 
                    }
                    match(input,18,FOLLOW_18_in_rule__EqExpr__Alternatives_1_01630); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEqExprAccess().getEqualsSignEqualsSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:779:6: ( '!=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:779:6: ( '!=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:780:1: '!='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEqExprAccess().getExclamationMarkEqualsSignKeyword_1_0_1()); 
                    }
                    match(input,19,FOLLOW_19_in_rule__EqExpr__Alternatives_1_01650); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:792:1: rule__RelExpr__Alternatives_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );
    public final void rule__RelExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:796:1: ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt4=1;
                }
                break;
            case 21:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("792:1: rule__RelExpr__Alternatives_1_0 : ( ( '<' ) | ( '>' ) | ( '<=' ) | ( '>=' ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( '<' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:797:1: ( '<' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:798:1: '<'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0()); 
                    }
                    match(input,20,FOLLOW_20_in_rule__RelExpr__Alternatives_1_01685); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getLessThanSignKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:805:6: ( '>' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:805:6: ( '>' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:806:1: '>'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1()); 
                    }
                    match(input,21,FOLLOW_21_in_rule__RelExpr__Alternatives_1_01705); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getGreaterThanSignKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:813:6: ( '<=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:813:6: ( '<=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:814:1: '<='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 
                    }
                    match(input,22,FOLLOW_22_in_rule__RelExpr__Alternatives_1_01725); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getRelExprAccess().getLessThanSignEqualsSignKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:821:6: ( '>=' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:821:6: ( '>=' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:822:1: '>='
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getRelExprAccess().getGreaterThanSignEqualsSignKeyword_1_0_3()); 
                    }
                    match(input,23,FOLLOW_23_in_rule__RelExpr__Alternatives_1_01745); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:834:1: rule__MulExpr__Alternatives_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );
    public final void rule__MulExpr__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:838:1: ( ( '*' ) | ( '/' ) | ( '%' ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("834:1: rule__MulExpr__Alternatives_1_0 : ( ( '*' ) | ( '/' ) | ( '%' ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( '*' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:839:1: ( '*' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:840:1: '*'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0()); 
                    }
                    match(input,24,FOLLOW_24_in_rule__MulExpr__Alternatives_1_01780); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getAsteriskKeyword_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:847:6: ( '/' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:847:6: ( '/' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:848:1: '/'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1()); 
                    }
                    match(input,25,FOLLOW_25_in_rule__MulExpr__Alternatives_1_01800); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getMulExprAccess().getSolidusKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:855:6: ( '%' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:855:6: ( '%' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:856:1: '%'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMulExprAccess().getPercentSignKeyword_1_0_2()); 
                    }
                    match(input,26,FOLLOW_26_in_rule__MulExpr__Alternatives_1_01820); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:868:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );
    public final void rule__Atom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:872:1: ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==RULE_SIGN) ) {
                    alt6=2;
                }
                else if ( ((LA6_2>=RULE_ID && LA6_2<=RULE_STRING)||LA6_2==29||LA6_2==44||(LA6_2>=48 && LA6_2<=49)||(LA6_2>=51 && LA6_2<=52)) ) {
                    alt6=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("868:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );", 6, 2, input);

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
            case 48:
            case 49:
            case 51:
            case 52:
                {
                alt6=5;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("868:1: rule__Atom__Alternatives : ( ( ( rule__Atom__Group_0__0 ) ) | ( ( rule__Atom__Group_1__0 ) ) | ( ( rule__Atom__Group_2__0 ) ) | ( rulepostfixExpr ) | ( ( rule__Atom__Group_4__0 ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ( rule__Atom__Group_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:873:1: ( ( rule__Atom__Group_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:874:1: ( rule__Atom__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:875:1: ( rule__Atom__Group_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:875:2: rule__Atom__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_0__0_in_rule__Atom__Alternatives1854);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:879:6: ( ( rule__Atom__Group_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:879:6: ( ( rule__Atom__Group_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:880:1: ( rule__Atom__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:1: ( rule__Atom__Group_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:881:2: rule__Atom__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives1872);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:885:6: ( ( rule__Atom__Group_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:885:6: ( ( rule__Atom__Group_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:886:1: ( rule__Atom__Group_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:887:1: ( rule__Atom__Group_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:887:2: rule__Atom__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_2__0_in_rule__Atom__Alternatives1890);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:891:6: ( rulepostfixExpr )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:891:6: ( rulepostfixExpr )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:892:1: rulepostfixExpr
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getPostfixExprParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_rulepostfixExpr_in_rule__Atom__Alternatives1908);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:897:6: ( ( rule__Atom__Group_4__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:897:6: ( ( rule__Atom__Group_4__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:898:1: ( rule__Atom__Group_4__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAtomAccess().getGroup_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:899:1: ( rule__Atom__Group_4__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:899:2: rule__Atom__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives1925);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:908:1: rule__PostfixExpr__Alternatives_0 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) ) );
    public final void rule__PostfixExpr__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:912:1: ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) ) )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred23()) ) {
                    alt7=1;
                }
                else if ( (synpred24()) ) {
                    alt7=2;
                }
                else if ( (true) ) {
                    alt7=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("908:1: rule__PostfixExpr__Alternatives_0 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) ) );", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("908:1: rule__PostfixExpr__Alternatives_0 : ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) | ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:915:2: rule__PostfixExpr__ExistingVariableAssignment_0_0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_0_in_rule__PostfixExpr__Alternatives_01958);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_1 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_1 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:921:2: rule__PostfixExpr__ExistingVariableAssignment_0_1
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_1_in_rule__PostfixExpr__Alternatives_01976);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:925:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_2 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:926:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:927:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_2 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:927:2: rule__PostfixExpr__ExistingVariableAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_2_in_rule__PostfixExpr__Alternatives_01994);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:936:1: rule__PostfixExpr__Alternatives_1 : ( ( ( rule__PostfixExpr__Group_1_0__0 ) ) | ( ( rule__PostfixExpr__Group_1_1__0 ) ) | ( ( rule__PostfixExpr__Group_1_2__0 ) ) );
    public final void rule__PostfixExpr__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:940:1: ( ( ( rule__PostfixExpr__Group_1_0__0 ) ) | ( ( rule__PostfixExpr__Group_1_1__0 ) ) | ( ( rule__PostfixExpr__Group_1_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt8=1;
                }
                break;
            case 29:
                {
                alt8=2;
                }
                break;
            case 46:
                {
                alt8=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("936:1: rule__PostfixExpr__Alternatives_1 : ( ( ( rule__PostfixExpr__Group_1_0__0 ) ) | ( ( rule__PostfixExpr__Group_1_1__0 ) ) | ( ( rule__PostfixExpr__Group_1_2__0 ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( ( rule__PostfixExpr__Group_1_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:941:1: ( ( rule__PostfixExpr__Group_1_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:942:1: ( rule__PostfixExpr__Group_1_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_1_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:943:1: ( rule__PostfixExpr__Group_1_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:943:2: rule__PostfixExpr__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_0__0_in_rule__PostfixExpr__Alternatives_12027);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:947:6: ( ( rule__PostfixExpr__Group_1_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:947:6: ( ( rule__PostfixExpr__Group_1_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:948:1: ( rule__PostfixExpr__Group_1_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_1_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:949:1: ( rule__PostfixExpr__Group_1_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:949:2: rule__PostfixExpr__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__0_in_rule__PostfixExpr__Alternatives_12045);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:953:6: ( ( rule__PostfixExpr__Group_1_2__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:953:6: ( ( rule__PostfixExpr__Group_1_2__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:954:1: ( rule__PostfixExpr__Group_1_2__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPostfixExprAccess().getGroup_1_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:955:1: ( rule__PostfixExpr__Group_1_2__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:955:2: rule__PostfixExpr__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__0_in_rule__PostfixExpr__Alternatives_12063);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:964:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__FloatAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:968:1: ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__FloatAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt9=1;
                }
                break;
            case 49:
                {
                alt9=2;
                }
                break;
            case RULE_INT:
                {
                int LA9_3 = input.LA(2);

                if ( (LA9_3==45) ) {
                    alt9=3;
                }
                else if ( (LA9_3==EOF||LA9_3==RULE_SIGN||(LA9_3>=18 && LA9_3<=28)||(LA9_3>=30 && LA9_3<=31)||(LA9_3>=42 && LA9_3<=43)||LA9_3==47) ) {
                    alt9=4;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("964:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__FloatAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );", 9, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                alt9=5;
                }
                break;
            case 51:
                {
                alt9=6;
                }
                break;
            case 52:
                {
                alt9=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("964:1: rule__Constant__Alternatives : ( ( ( rule__Constant__Group_0__0 ) ) | ( ( rule__Constant__Group_1__0 ) ) | ( ( rule__Constant__FloatAssignment_2 ) ) | ( ( rule__Constant__IntegerAssignment_3 ) ) | ( ( rule__Constant__StringAssignment_4 ) ) | ( ( rule__Constant__NullAssignment_5 ) ) | ( ( rule__Constant__InfinityAssignment_6 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( ( rule__Constant__Group_0__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:969:1: ( ( rule__Constant__Group_0__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:970:1: ( rule__Constant__Group_0__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getGroup_0()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:971:1: ( rule__Constant__Group_0__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:971:2: rule__Constant__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_0__0_in_rule__Constant__Alternatives2096);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:6: ( ( rule__Constant__Group_1__0 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:975:6: ( ( rule__Constant__Group_1__0 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:976:1: ( rule__Constant__Group_1__0 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getGroup_1()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:977:1: ( rule__Constant__Group_1__0 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:977:2: rule__Constant__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Constant__Group_1__0_in_rule__Constant__Alternatives2114);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:6: ( ( rule__Constant__FloatAssignment_2 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:981:6: ( ( rule__Constant__FloatAssignment_2 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:982:1: ( rule__Constant__FloatAssignment_2 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getFloatAssignment_2()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:983:1: ( rule__Constant__FloatAssignment_2 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:983:2: rule__Constant__FloatAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Constant__FloatAssignment_2_in_rule__Constant__Alternatives2132);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:987:6: ( ( rule__Constant__IntegerAssignment_3 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:987:6: ( ( rule__Constant__IntegerAssignment_3 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:988:1: ( rule__Constant__IntegerAssignment_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getIntegerAssignment_3()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:989:1: ( rule__Constant__IntegerAssignment_3 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:989:2: rule__Constant__IntegerAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Constant__IntegerAssignment_3_in_rule__Constant__Alternatives2150);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:993:6: ( ( rule__Constant__StringAssignment_4 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:993:6: ( ( rule__Constant__StringAssignment_4 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:994:1: ( rule__Constant__StringAssignment_4 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getStringAssignment_4()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:995:1: ( rule__Constant__StringAssignment_4 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:995:2: rule__Constant__StringAssignment_4
                    {
                    pushFollow(FOLLOW_rule__Constant__StringAssignment_4_in_rule__Constant__Alternatives2168);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:999:6: ( ( rule__Constant__NullAssignment_5 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:999:6: ( ( rule__Constant__NullAssignment_5 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1000:1: ( rule__Constant__NullAssignment_5 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getNullAssignment_5()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:1: ( rule__Constant__NullAssignment_5 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1001:2: rule__Constant__NullAssignment_5
                    {
                    pushFollow(FOLLOW_rule__Constant__NullAssignment_5_in_rule__Constant__Alternatives2186);
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
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1005:6: ( ( rule__Constant__InfinityAssignment_6 ) )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1005:6: ( ( rule__Constant__InfinityAssignment_6 ) )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1006:1: ( rule__Constant__InfinityAssignment_6 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getConstantAccess().getInfinityAssignment_6()); 
                    }
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:1: ( rule__Constant__InfinityAssignment_6 )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1007:2: rule__Constant__InfinityAssignment_6
                    {
                    pushFollow(FOLLOW_rule__Constant__InfinityAssignment_6_in_rule__Constant__Alternatives2204);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1016:1: rule__EndExpr__Alternatives : ( ( ',' ) | ( ';' ) );
    public final void rule__EndExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1020:1: ( ( ',' ) | ( ';' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1016:1: rule__EndExpr__Alternatives : ( ( ',' ) | ( ';' ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: ( ',' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1021:1: ( ',' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1022:1: ','
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEndExprAccess().getCommaKeyword_0()); 
                    }
                    match(input,27,FOLLOW_27_in_rule__EndExpr__Alternatives2238); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getEndExprAccess().getCommaKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:6: ( ';' )
                    {
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1029:6: ( ';' )
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1030:1: ';'
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getEndExprAccess().getSemicolonKeyword_1()); 
                    }
                    match(input,28,FOLLOW_28_in_rule__EndExpr__Alternatives2258); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1044:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1048:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1049:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02290);
            rule__Model__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02293);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1056:1: rule__Model__Group__0__Impl : ( ( rule__Model__FunctionsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1060:1: ( ( ( rule__Model__FunctionsAssignment_0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ( ( rule__Model__FunctionsAssignment_0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1061:1: ( ( rule__Model__FunctionsAssignment_0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1062:1: ( rule__Model__FunctionsAssignment_0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:1: ( rule__Model__FunctionsAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1063:2: rule__Model__FunctionsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__FunctionsAssignment_0_in_rule__Model__Group__0__Impl2320);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1073:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1077:1: ( rule__Model__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1078:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12351);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1084:1: rule__Model__Group__1__Impl : ( ( rule__Model__MainAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1088:1: ( ( ( rule__Model__MainAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( ( rule__Model__MainAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1089:1: ( ( rule__Model__MainAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1090:1: ( rule__Model__MainAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMainAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:1: ( rule__Model__MainAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1091:2: rule__Model__MainAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__MainAssignment_1_in_rule__Model__Group__1__Impl2378);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1105:1: rule__FunctionDefinition__Group__0 : rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 ;
    public final void rule__FunctionDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1109:1: ( rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1110:2: rule__FunctionDefinition__Group__0__Impl rule__FunctionDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02412);
            rule__FunctionDefinition__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02415);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1117:1: rule__FunctionDefinition__Group__0__Impl : ( ( rule__FunctionDefinition__NameAssignment_0 ) ) ;
    public final void rule__FunctionDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1121:1: ( ( ( rule__FunctionDefinition__NameAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: ( ( rule__FunctionDefinition__NameAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1122:1: ( ( rule__FunctionDefinition__NameAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1123:1: ( rule__FunctionDefinition__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:1: ( rule__FunctionDefinition__NameAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1124:2: rule__FunctionDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__NameAssignment_0_in_rule__FunctionDefinition__Group__0__Impl2442);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1134:1: rule__FunctionDefinition__Group__1 : rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 ;
    public final void rule__FunctionDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1138:1: ( rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1139:2: rule__FunctionDefinition__Group__1__Impl rule__FunctionDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12472);
            rule__FunctionDefinition__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12475);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1146:1: rule__FunctionDefinition__Group__1__Impl : ( '(' ) ;
    public final void rule__FunctionDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1150:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1151:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1152:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__FunctionDefinition__Group__1__Impl2503); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1165:1: rule__FunctionDefinition__Group__2 : rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 ;
    public final void rule__FunctionDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1169:1: ( rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1170:2: rule__FunctionDefinition__Group__2__Impl rule__FunctionDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22534);
            rule__FunctionDefinition__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22537);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1177:1: rule__FunctionDefinition__Group__2__Impl : ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? ) ;
    public final void rule__FunctionDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1181:1: ( ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1182:1: ( ( rule__FunctionDefinition__FormalParamsAssignment_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1183:1: ( rule__FunctionDefinition__FormalParamsAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getFormalParamsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:1: ( rule__FunctionDefinition__FormalParamsAssignment_2 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=12 && LA12_0<=17)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1184:2: rule__FunctionDefinition__FormalParamsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__FormalParamsAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2564);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1194:1: rule__FunctionDefinition__Group__3 : rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 ;
    public final void rule__FunctionDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1198:1: ( rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1199:2: rule__FunctionDefinition__Group__3__Impl rule__FunctionDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32595);
            rule__FunctionDefinition__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32598);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1206:1: rule__FunctionDefinition__Group__3__Impl : ( ')' ) ;
    public final void rule__FunctionDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1210:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1211:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1212:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__FunctionDefinition__Group__3__Impl2626); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1225:1: rule__FunctionDefinition__Group__4 : rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 ;
    public final void rule__FunctionDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1229:1: ( rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1230:2: rule__FunctionDefinition__Group__4__Impl rule__FunctionDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42657);
            rule__FunctionDefinition__Group__4__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42660);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1237:1: rule__FunctionDefinition__Group__4__Impl : ( ( rule__FunctionDefinition__Group_4__0 )? ) ;
    public final void rule__FunctionDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1241:1: ( ( ( rule__FunctionDefinition__Group_4__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( ( rule__FunctionDefinition__Group_4__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1242:1: ( ( rule__FunctionDefinition__Group_4__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1243:1: ( rule__FunctionDefinition__Group_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getGroup_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:1: ( rule__FunctionDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1244:2: rule__FunctionDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__0_in_rule__FunctionDefinition__Group__4__Impl2687);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1254:1: rule__FunctionDefinition__Group__5 : rule__FunctionDefinition__Group__5__Impl ;
    public final void rule__FunctionDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1258:1: ( rule__FunctionDefinition__Group__5__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1259:2: rule__FunctionDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52718);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1265:1: rule__FunctionDefinition__Group__5__Impl : ( ( rule__FunctionDefinition__BlocksAssignment_5 ) ) ;
    public final void rule__FunctionDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1269:1: ( ( ( rule__FunctionDefinition__BlocksAssignment_5 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( ( rule__FunctionDefinition__BlocksAssignment_5 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1270:1: ( ( rule__FunctionDefinition__BlocksAssignment_5 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1271:1: ( rule__FunctionDefinition__BlocksAssignment_5 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getBlocksAssignment_5()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:1: ( rule__FunctionDefinition__BlocksAssignment_5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1272:2: rule__FunctionDefinition__BlocksAssignment_5
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__BlocksAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2745);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1294:1: rule__FunctionDefinition__Group_4__0 : rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1 ;
    public final void rule__FunctionDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1298:1: ( rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1299:2: rule__FunctionDefinition__Group_4__0__Impl rule__FunctionDefinition__Group_4__1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__0__Impl_in_rule__FunctionDefinition__Group_4__02787);
            rule__FunctionDefinition__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__1_in_rule__FunctionDefinition__Group_4__02790);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1306:1: rule__FunctionDefinition__Group_4__0__Impl : ( ':' ) ;
    public final void rule__FunctionDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1310:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1311:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1312:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getColonKeyword_4_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__FunctionDefinition__Group_4__0__Impl2818); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1325:1: rule__FunctionDefinition__Group_4__1 : rule__FunctionDefinition__Group_4__1__Impl ;
    public final void rule__FunctionDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1329:1: ( rule__FunctionDefinition__Group_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1330:2: rule__FunctionDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__Group_4__1__Impl_in_rule__FunctionDefinition__Group_4__12849);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1336:1: rule__FunctionDefinition__Group_4__1__Impl : ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) ) ;
    public final void rule__FunctionDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1340:1: ( ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1341:1: ( ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1342:1: ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:1: ( rule__FunctionDefinition__ReturnTypeAssignment_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1343:2: rule__FunctionDefinition__ReturnTypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_4_1_in_rule__FunctionDefinition__Group_4__1__Impl2876);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1357:1: rule__MainFunction__Group__0 : rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 ;
    public final void rule__MainFunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1361:1: ( rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1362:2: rule__MainFunction__Group__0__Impl rule__MainFunction__Group__1
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__0__Impl_in_rule__MainFunction__Group__02910);
            rule__MainFunction__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__1_in_rule__MainFunction__Group__02913);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1369:1: rule__MainFunction__Group__0__Impl : ( ( rule__MainFunction__MainAssignment_0 ) ) ;
    public final void rule__MainFunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1373:1: ( ( ( rule__MainFunction__MainAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: ( ( rule__MainFunction__MainAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1374:1: ( ( rule__MainFunction__MainAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1375:1: ( rule__MainFunction__MainAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:1: ( rule__MainFunction__MainAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1376:2: rule__MainFunction__MainAssignment_0
            {
            pushFollow(FOLLOW_rule__MainFunction__MainAssignment_0_in_rule__MainFunction__Group__0__Impl2940);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1386:1: rule__MainFunction__Group__1 : rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 ;
    public final void rule__MainFunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1390:1: ( rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1391:2: rule__MainFunction__Group__1__Impl rule__MainFunction__Group__2
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__1__Impl_in_rule__MainFunction__Group__12970);
            rule__MainFunction__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__2_in_rule__MainFunction__Group__12973);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1398:1: rule__MainFunction__Group__1__Impl : ( '(' ) ;
    public final void rule__MainFunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1402:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1403:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1404:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__MainFunction__Group__1__Impl3001); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1417:1: rule__MainFunction__Group__2 : rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 ;
    public final void rule__MainFunction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1421:1: ( rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1422:2: rule__MainFunction__Group__2__Impl rule__MainFunction__Group__3
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__2__Impl_in_rule__MainFunction__Group__23032);
            rule__MainFunction__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__3_in_rule__MainFunction__Group__23035);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1429:1: rule__MainFunction__Group__2__Impl : ( ( rule__MainFunction__FormalParamsAssignment_2 )? ) ;
    public final void rule__MainFunction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1433:1: ( ( ( rule__MainFunction__FormalParamsAssignment_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( ( rule__MainFunction__FormalParamsAssignment_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1434:1: ( ( rule__MainFunction__FormalParamsAssignment_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1435:1: ( rule__MainFunction__FormalParamsAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getFormalParamsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:1: ( rule__MainFunction__FormalParamsAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=12 && LA14_0<=17)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1436:2: rule__MainFunction__FormalParamsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MainFunction__FormalParamsAssignment_2_in_rule__MainFunction__Group__2__Impl3062);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1446:1: rule__MainFunction__Group__3 : rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 ;
    public final void rule__MainFunction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1450:1: ( rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1451:2: rule__MainFunction__Group__3__Impl rule__MainFunction__Group__4
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__3__Impl_in_rule__MainFunction__Group__33093);
            rule__MainFunction__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MainFunction__Group__4_in_rule__MainFunction__Group__33096);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1458:1: rule__MainFunction__Group__3__Impl : ( ')' ) ;
    public final void rule__MainFunction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1462:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1463:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1464:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__MainFunction__Group__3__Impl3124); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1477:1: rule__MainFunction__Group__4 : rule__MainFunction__Group__4__Impl ;
    public final void rule__MainFunction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1481:1: ( rule__MainFunction__Group__4__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1482:2: rule__MainFunction__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__MainFunction__Group__4__Impl_in_rule__MainFunction__Group__43155);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1488:1: rule__MainFunction__Group__4__Impl : ( ( rule__MainFunction__BlocksAssignment_4 ) ) ;
    public final void rule__MainFunction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1492:1: ( ( ( rule__MainFunction__BlocksAssignment_4 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: ( ( rule__MainFunction__BlocksAssignment_4 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1493:1: ( ( rule__MainFunction__BlocksAssignment_4 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1494:1: ( rule__MainFunction__BlocksAssignment_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getBlocksAssignment_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:1: ( rule__MainFunction__BlocksAssignment_4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1495:2: rule__MainFunction__BlocksAssignment_4
            {
            pushFollow(FOLLOW_rule__MainFunction__BlocksAssignment_4_in_rule__MainFunction__Group__4__Impl3182);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1515:1: rule__FormalParams__Group__0 : rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1 ;
    public final void rule__FormalParams__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1519:1: ( rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1520:2: rule__FormalParams__Group__0__Impl rule__FormalParams__Group__1
            {
            pushFollow(FOLLOW_rule__FormalParams__Group__0__Impl_in_rule__FormalParams__Group__03222);
            rule__FormalParams__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FormalParams__Group__1_in_rule__FormalParams__Group__03225);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1527:1: rule__FormalParams__Group__0__Impl : ( ( rule__FormalParams__ParamsAssignment_0 ) ) ;
    public final void rule__FormalParams__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1531:1: ( ( ( rule__FormalParams__ParamsAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( ( rule__FormalParams__ParamsAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1532:1: ( ( rule__FormalParams__ParamsAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1533:1: ( rule__FormalParams__ParamsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:1: ( rule__FormalParams__ParamsAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1534:2: rule__FormalParams__ParamsAssignment_0
            {
            pushFollow(FOLLOW_rule__FormalParams__ParamsAssignment_0_in_rule__FormalParams__Group__0__Impl3252);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1544:1: rule__FormalParams__Group__1 : rule__FormalParams__Group__1__Impl ;
    public final void rule__FormalParams__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1548:1: ( rule__FormalParams__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1549:2: rule__FormalParams__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FormalParams__Group__1__Impl_in_rule__FormalParams__Group__13282);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1555:1: rule__FormalParams__Group__1__Impl : ( ( rule__FormalParams__Group_1__0 )* ) ;
    public final void rule__FormalParams__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1559:1: ( ( ( rule__FormalParams__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: ( ( rule__FormalParams__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1560:1: ( ( rule__FormalParams__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1561:1: ( rule__FormalParams__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:1: ( rule__FormalParams__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1562:2: rule__FormalParams__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__FormalParams__Group_1__0_in_rule__FormalParams__Group__1__Impl3309);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1576:1: rule__FormalParams__Group_1__0 : rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1 ;
    public final void rule__FormalParams__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1580:1: ( rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1581:2: rule__FormalParams__Group_1__0__Impl rule__FormalParams__Group_1__1
            {
            pushFollow(FOLLOW_rule__FormalParams__Group_1__0__Impl_in_rule__FormalParams__Group_1__03344);
            rule__FormalParams__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FormalParams__Group_1__1_in_rule__FormalParams__Group_1__03347);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1588:1: rule__FormalParams__Group_1__0__Impl : ( ',' ) ;
    public final void rule__FormalParams__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1592:1: ( ( ',' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ',' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1593:1: ( ',' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1594:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getCommaKeyword_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__FormalParams__Group_1__0__Impl3375); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1607:1: rule__FormalParams__Group_1__1 : rule__FormalParams__Group_1__1__Impl ;
    public final void rule__FormalParams__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1611:1: ( rule__FormalParams__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1612:2: rule__FormalParams__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__FormalParams__Group_1__1__Impl_in_rule__FormalParams__Group_1__13406);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1618:1: rule__FormalParams__Group_1__1__Impl : ( ( rule__FormalParams__ParamsAssignment_1_1 ) ) ;
    public final void rule__FormalParams__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1622:1: ( ( ( rule__FormalParams__ParamsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( ( rule__FormalParams__ParamsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1623:1: ( ( rule__FormalParams__ParamsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1624:1: ( rule__FormalParams__ParamsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:1: ( rule__FormalParams__ParamsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1625:2: rule__FormalParams__ParamsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__FormalParams__ParamsAssignment_1_1_in_rule__FormalParams__Group_1__1__Impl3433);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1639:1: rule__Param__Group__0 : rule__Param__Group__0__Impl rule__Param__Group__1 ;
    public final void rule__Param__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1643:1: ( rule__Param__Group__0__Impl rule__Param__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1644:2: rule__Param__Group__0__Impl rule__Param__Group__1
            {
            pushFollow(FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03467);
            rule__Param__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03470);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1651:1: rule__Param__Group__0__Impl : ( ruletype ) ;
    public final void rule__Param__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1655:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1656:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1657:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getTypeParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__Param__Group__0__Impl3497);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1668:1: rule__Param__Group__1 : rule__Param__Group__1__Impl ;
    public final void rule__Param__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1672:1: ( rule__Param__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1673:2: rule__Param__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__13526);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1679:1: rule__Param__Group__1__Impl : ( ( rule__Param__NameAssignment_1 ) ) ;
    public final void rule__Param__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1683:1: ( ( ( rule__Param__NameAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ( rule__Param__NameAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1684:1: ( ( rule__Param__NameAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1685:1: ( rule__Param__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:1: ( rule__Param__NameAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1686:2: rule__Param__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl3553);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1700:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1704:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1705:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03587);
            rule__Block__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03590);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1712:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1716:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1717:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1718:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1719:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1721:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1731:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1735:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1736:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13648);
            rule__Block__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__2_in_rule__Block__Group__13651);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1743:1: rule__Block__Group__1__Impl : ( 'begin' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1747:1: ( ( 'begin' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:1: ( 'begin' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1748:1: ( 'begin' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1749:1: 'begin'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getBeginKeyword_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Block__Group__1__Impl3679); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1762:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1766:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1767:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__23710);
            rule__Block__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Block__Group__3_in_rule__Block__Group__23713);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1774:1: rule__Block__Group__2__Impl : ( ( rule__Block__StatementsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1778:1: ( ( ( rule__Block__StatementsAssignment_2 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( rule__Block__StatementsAssignment_2 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1779:1: ( ( rule__Block__StatementsAssignment_2 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1780:1: ( rule__Block__StatementsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:1: ( rule__Block__StatementsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||(LA16_0>=12 && LA16_0<=17)||LA16_0==32||(LA16_0>=34 && LA16_0<=35)||LA16_0==37||LA16_0==39) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1781:2: rule__Block__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Block__StatementsAssignment_2_in_rule__Block__Group__2__Impl3740);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1791:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1795:1: ( rule__Block__Group__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1796:2: rule__Block__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__33771);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1802:1: rule__Block__Group__3__Impl : ( 'end' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1806:1: ( ( 'end' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( 'end' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1807:1: ( 'end' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1808:1: 'end'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getEndKeyword_3()); 
            }
            match(input,33,FOLLOW_33_in_rule__Block__Group__3__Impl3799); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1829:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1833:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1834:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03838);
            rule__Statement__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03841);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1841:1: rule__Statement__Group_0__0__Impl : ( () ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1845:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1846:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1847:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1848:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1850:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1860:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1864:1: ( rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1865:2: rule__Statement__Group_0__1__Impl rule__Statement__Group_0__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__13899);
            rule__Statement__Group_0__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_0__2_in_rule__Statement__Group_0__13902);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1872:1: rule__Statement__Group_0__1__Impl : ( ( rule__Statement__PostFixExpressionAssignment_0_1 ) ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1876:1: ( ( ( rule__Statement__PostFixExpressionAssignment_0_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( ( rule__Statement__PostFixExpressionAssignment_0_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1877:1: ( ( rule__Statement__PostFixExpressionAssignment_0_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1878:1: ( rule__Statement__PostFixExpressionAssignment_0_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPostFixExpressionAssignment_0_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:1: ( rule__Statement__PostFixExpressionAssignment_0_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1879:2: rule__Statement__PostFixExpressionAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Statement__PostFixExpressionAssignment_0_1_in_rule__Statement__Group_0__1__Impl3929);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1889:1: rule__Statement__Group_0__2 : rule__Statement__Group_0__2__Impl ;
    public final void rule__Statement__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1893:1: ( rule__Statement__Group_0__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1894:2: rule__Statement__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__2__Impl_in_rule__Statement__Group_0__23959);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1900:1: rule__Statement__Group_0__2__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1904:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1905:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1906:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_0_2()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_0__2__Impl3986);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1923:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1927:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1928:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__04021);
            rule__Statement__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__04024);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1935:1: rule__Statement__Group_1__0__Impl : ( ruledeclaration ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1939:1: ( ( ruledeclaration ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ruledeclaration )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1940:1: ( ruledeclaration )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1941:1: ruledeclaration
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getDeclarationParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruledeclaration_in_rule__Statement__Group_1__0__Impl4051);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1952:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1956:1: ( rule__Statement__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1957:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__14080);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1963:1: rule__Statement__Group_1__1__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1967:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1968:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1969:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_1__1__Impl4107);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1984:1: rule__Statement__Group_2__0 : rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 ;
    public final void rule__Statement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1988:1: ( rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1989:2: rule__Statement__Group_2__0__Impl rule__Statement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__04140);
            rule__Statement__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__04143);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:1996:1: rule__Statement__Group_2__0__Impl : ( () ) ;
    public final void rule__Statement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2000:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2001:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2002:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_2_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2003:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2005:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2015:1: rule__Statement__Group_2__1 : rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 ;
    public final void rule__Statement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2019:1: ( rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2020:2: rule__Statement__Group_2__1__Impl rule__Statement__Group_2__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__14201);
            rule__Statement__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__14204);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2027:1: rule__Statement__Group_2__1__Impl : ( ( rule__Statement__AssignmentsAssignment_2_1 ) ) ;
    public final void rule__Statement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2031:1: ( ( ( rule__Statement__AssignmentsAssignment_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: ( ( rule__Statement__AssignmentsAssignment_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2032:1: ( ( rule__Statement__AssignmentsAssignment_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2033:1: ( rule__Statement__AssignmentsAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentsAssignment_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:1: ( rule__Statement__AssignmentsAssignment_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2034:2: rule__Statement__AssignmentsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Statement__AssignmentsAssignment_2_1_in_rule__Statement__Group_2__1__Impl4231);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2044:1: rule__Statement__Group_2__2 : rule__Statement__Group_2__2__Impl ;
    public final void rule__Statement__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2048:1: ( rule__Statement__Group_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2049:2: rule__Statement__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__24261);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2055:1: rule__Statement__Group_2__2__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2059:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2060:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2061:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_2_2()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_2__2__Impl4288);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2078:1: rule__Statement__Group_3__0 : rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 ;
    public final void rule__Statement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2082:1: ( rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2083:2: rule__Statement__Group_3__0__Impl rule__Statement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__04323);
            rule__Statement__Group_3__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__04326);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2090:1: rule__Statement__Group_3__0__Impl : ( () ) ;
    public final void rule__Statement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2094:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2095:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2096:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementAction_3_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2097:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2099:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2109:1: rule__Statement__Group_3__1 : rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 ;
    public final void rule__Statement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2113:1: ( rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2114:2: rule__Statement__Group_3__1__Impl rule__Statement__Group_3__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__14384);
            rule__Statement__Group_3__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__14387);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2121:1: rule__Statement__Group_3__1__Impl : ( 'return' ) ;
    public final void rule__Statement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2125:1: ( ( 'return' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:1: ( 'return' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2126:1: ( 'return' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2127:1: 'return'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getReturnKeyword_3_1()); 
            }
            match(input,34,FOLLOW_34_in_rule__Statement__Group_3__1__Impl4415); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2140:1: rule__Statement__Group_3__2 : rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 ;
    public final void rule__Statement__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2144:1: ( rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2145:2: rule__Statement__Group_3__2__Impl rule__Statement__Group_3__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__2__Impl_in_rule__Statement__Group_3__24446);
            rule__Statement__Group_3__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_3__3_in_rule__Statement__Group_3__24449);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2152:1: rule__Statement__Group_3__2__Impl : ( ( rule__Statement__ExprsAssignment_3_2 )? ) ;
    public final void rule__Statement__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2156:1: ( ( ( rule__Statement__ExprsAssignment_3_2 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: ( ( rule__Statement__ExprsAssignment_3_2 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2157:1: ( ( rule__Statement__ExprsAssignment_3_2 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2158:1: ( rule__Statement__ExprsAssignment_3_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsAssignment_3_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:1: ( rule__Statement__ExprsAssignment_3_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_ID && LA17_0<=RULE_STRING)||LA17_0==29||LA17_0==44||(LA17_0>=48 && LA17_0<=49)||(LA17_0>=51 && LA17_0<=52)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2159:2: rule__Statement__ExprsAssignment_3_2
                    {
                    pushFollow(FOLLOW_rule__Statement__ExprsAssignment_3_2_in_rule__Statement__Group_3__2__Impl4476);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2169:1: rule__Statement__Group_3__3 : rule__Statement__Group_3__3__Impl ;
    public final void rule__Statement__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2173:1: ( rule__Statement__Group_3__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2174:2: rule__Statement__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_3__3__Impl_in_rule__Statement__Group_3__34507);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2180:1: rule__Statement__Group_3__3__Impl : ( ruleendExpr ) ;
    public final void rule__Statement__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2184:1: ( ( ruleendExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ruleendExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2185:1: ( ruleendExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2186:1: ruleendExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getEndExprParserRuleCall_3_3()); 
            }
            pushFollow(FOLLOW_ruleendExpr_in_rule__Statement__Group_3__3__Impl4534);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2205:1: rule__Statement__Group_4__0 : rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 ;
    public final void rule__Statement__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2209:1: ( rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2210:2: rule__Statement__Group_4__0__Impl rule__Statement__Group_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__04571);
            rule__Statement__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__04574);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2217:1: rule__Statement__Group_4__0__Impl : ( 'if' ) ;
    public final void rule__Statement__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2221:1: ( ( 'if' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( 'if' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2222:1: ( 'if' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2223:1: 'if'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getIfKeyword_4_0()); 
            }
            match(input,35,FOLLOW_35_in_rule__Statement__Group_4__0__Impl4602); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2236:1: rule__Statement__Group_4__1 : rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 ;
    public final void rule__Statement__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2240:1: ( rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2241:2: rule__Statement__Group_4__1__Impl rule__Statement__Group_4__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__14633);
            rule__Statement__Group_4__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__14636);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2248:1: rule__Statement__Group_4__1__Impl : ( ruleexpr ) ;
    public final void rule__Statement__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2252:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2253:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2254:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprParserRuleCall_4_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__Group_4__1__Impl4663);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2265:1: rule__Statement__Group_4__2 : rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 ;
    public final void rule__Statement__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2269:1: ( rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2270:2: rule__Statement__Group_4__2__Impl rule__Statement__Group_4__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__24692);
            rule__Statement__Group_4__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__24695);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2277:1: rule__Statement__Group_4__2__Impl : ( ':' ) ;
    public final void rule__Statement__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2281:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2282:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2283:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_4_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Statement__Group_4__2__Impl4723); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2296:1: rule__Statement__Group_4__3 : rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4 ;
    public final void rule__Statement__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2300:1: ( rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2301:2: rule__Statement__Group_4__3__Impl rule__Statement__Group_4__4
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__34754);
            rule__Statement__Group_4__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4__4_in_rule__Statement__Group_4__34757);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2308:1: rule__Statement__Group_4__3__Impl : ( ( rule__Statement__StatementsAssignment_4_3 ) ) ;
    public final void rule__Statement__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2312:1: ( ( ( rule__Statement__StatementsAssignment_4_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: ( ( rule__Statement__StatementsAssignment_4_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2313:1: ( ( rule__Statement__StatementsAssignment_4_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2314:1: ( rule__Statement__StatementsAssignment_4_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_4_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:1: ( rule__Statement__StatementsAssignment_4_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2315:2: rule__Statement__StatementsAssignment_4_3
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_4_3_in_rule__Statement__Group_4__3__Impl4784);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2325:1: rule__Statement__Group_4__4 : rule__Statement__Group_4__4__Impl ;
    public final void rule__Statement__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2329:1: ( rule__Statement__Group_4__4__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2330:2: rule__Statement__Group_4__4__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4__4__Impl_in_rule__Statement__Group_4__44814);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2336:1: rule__Statement__Group_4__4__Impl : ( ( rule__Statement__Group_4_4__0 )? ) ;
    public final void rule__Statement__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2340:1: ( ( ( rule__Statement__Group_4_4__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( rule__Statement__Group_4_4__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2341:1: ( ( rule__Statement__Group_4_4__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2342:1: ( rule__Statement__Group_4_4__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getGroup_4_4()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:1: ( rule__Statement__Group_4_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                int LA18_1 = input.LA(2);

                if ( (synpred41()) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:2: rule__Statement__Group_4_4__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_4_4__0_in_rule__Statement__Group_4__4__Impl4841);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2363:1: rule__Statement__Group_4_4__0 : rule__Statement__Group_4_4__0__Impl rule__Statement__Group_4_4__1 ;
    public final void rule__Statement__Group_4_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2367:1: ( rule__Statement__Group_4_4__0__Impl rule__Statement__Group_4_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2368:2: rule__Statement__Group_4_4__0__Impl rule__Statement__Group_4_4__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_4_4__0__Impl_in_rule__Statement__Group_4_4__04882);
            rule__Statement__Group_4_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_4_4__1_in_rule__Statement__Group_4_4__04885);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2375:1: rule__Statement__Group_4_4__0__Impl : ( 'else' ) ;
    public final void rule__Statement__Group_4_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2379:1: ( ( 'else' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: ( 'else' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2380:1: ( 'else' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2381:1: 'else'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getElseKeyword_4_4_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__Statement__Group_4_4__0__Impl4913); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2394:1: rule__Statement__Group_4_4__1 : rule__Statement__Group_4_4__1__Impl ;
    public final void rule__Statement__Group_4_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2398:1: ( rule__Statement__Group_4_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2399:2: rule__Statement__Group_4_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_4_4__1__Impl_in_rule__Statement__Group_4_4__14944);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2405:1: rule__Statement__Group_4_4__1__Impl : ( ( rule__Statement__StatementsAssignment_4_4_1 ) ) ;
    public final void rule__Statement__Group_4_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2409:1: ( ( ( rule__Statement__StatementsAssignment_4_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: ( ( rule__Statement__StatementsAssignment_4_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2410:1: ( ( rule__Statement__StatementsAssignment_4_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2411:1: ( rule__Statement__StatementsAssignment_4_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_4_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:1: ( rule__Statement__StatementsAssignment_4_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2412:2: rule__Statement__StatementsAssignment_4_4_1
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_4_4_1_in_rule__Statement__Group_4_4__1__Impl4971);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2426:1: rule__Statement__Group_5__0 : rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 ;
    public final void rule__Statement__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2430:1: ( rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2431:2: rule__Statement__Group_5__0__Impl rule__Statement__Group_5__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__05005);
            rule__Statement__Group_5__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__05008);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2438:1: rule__Statement__Group_5__0__Impl : ( 'for' ) ;
    public final void rule__Statement__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2442:1: ( ( 'for' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:1: ( 'for' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2443:1: ( 'for' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2444:1: 'for'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getForKeyword_5_0()); 
            }
            match(input,37,FOLLOW_37_in_rule__Statement__Group_5__0__Impl5036); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2457:1: rule__Statement__Group_5__1 : rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 ;
    public final void rule__Statement__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2461:1: ( rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2462:2: rule__Statement__Group_5__1__Impl rule__Statement__Group_5__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__15067);
            rule__Statement__Group_5__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__2_in_rule__Statement__Group_5__15070);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2469:1: rule__Statement__Group_5__1__Impl : ( ruleparam ) ;
    public final void rule__Statement__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2473:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2474:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2475:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getParamParserRuleCall_5_1()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__Statement__Group_5__1__Impl5097);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2486:1: rule__Statement__Group_5__2 : rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 ;
    public final void rule__Statement__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2490:1: ( rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2491:2: rule__Statement__Group_5__2__Impl rule__Statement__Group_5__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__2__Impl_in_rule__Statement__Group_5__25126);
            rule__Statement__Group_5__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__3_in_rule__Statement__Group_5__25129);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2498:1: rule__Statement__Group_5__2__Impl : ( 'in' ) ;
    public final void rule__Statement__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2502:1: ( ( 'in' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( 'in' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2503:1: ( 'in' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2504:1: 'in'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getInKeyword_5_2()); 
            }
            match(input,38,FOLLOW_38_in_rule__Statement__Group_5__2__Impl5157); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2517:1: rule__Statement__Group_5__3 : rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 ;
    public final void rule__Statement__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2521:1: ( rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2522:2: rule__Statement__Group_5__3__Impl rule__Statement__Group_5__4
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__3__Impl_in_rule__Statement__Group_5__35188);
            rule__Statement__Group_5__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__4_in_rule__Statement__Group_5__35191);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2529:1: rule__Statement__Group_5__3__Impl : ( ( rule__Statement__ExprsAssignment_5_3 ) ) ;
    public final void rule__Statement__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2533:1: ( ( ( rule__Statement__ExprsAssignment_5_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( ( rule__Statement__ExprsAssignment_5_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2534:1: ( ( rule__Statement__ExprsAssignment_5_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2535:1: ( rule__Statement__ExprsAssignment_5_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsAssignment_5_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:1: ( rule__Statement__ExprsAssignment_5_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2536:2: rule__Statement__ExprsAssignment_5_3
            {
            pushFollow(FOLLOW_rule__Statement__ExprsAssignment_5_3_in_rule__Statement__Group_5__3__Impl5218);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2546:1: rule__Statement__Group_5__4 : rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5 ;
    public final void rule__Statement__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2550:1: ( rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2551:2: rule__Statement__Group_5__4__Impl rule__Statement__Group_5__5
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__4__Impl_in_rule__Statement__Group_5__45248);
            rule__Statement__Group_5__4__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_5__5_in_rule__Statement__Group_5__45251);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2558:1: rule__Statement__Group_5__4__Impl : ( ':' ) ;
    public final void rule__Statement__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2562:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2563:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2564:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_5_4()); 
            }
            match(input,31,FOLLOW_31_in_rule__Statement__Group_5__4__Impl5279); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2577:1: rule__Statement__Group_5__5 : rule__Statement__Group_5__5__Impl ;
    public final void rule__Statement__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2581:1: ( rule__Statement__Group_5__5__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2582:2: rule__Statement__Group_5__5__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_5__5__Impl_in_rule__Statement__Group_5__55310);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2588:1: rule__Statement__Group_5__5__Impl : ( ( rule__Statement__StatementsAssignment_5_5 ) ) ;
    public final void rule__Statement__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2592:1: ( ( ( rule__Statement__StatementsAssignment_5_5 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( ( rule__Statement__StatementsAssignment_5_5 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2593:1: ( ( rule__Statement__StatementsAssignment_5_5 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2594:1: ( rule__Statement__StatementsAssignment_5_5 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_5_5()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:1: ( rule__Statement__StatementsAssignment_5_5 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2595:2: rule__Statement__StatementsAssignment_5_5
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_5_5_in_rule__Statement__Group_5__5__Impl5337);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2617:1: rule__Statement__Group_6__0 : rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 ;
    public final void rule__Statement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2621:1: ( rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2622:2: rule__Statement__Group_6__0__Impl rule__Statement__Group_6__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__0__Impl_in_rule__Statement__Group_6__05379);
            rule__Statement__Group_6__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__1_in_rule__Statement__Group_6__05382);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2629:1: rule__Statement__Group_6__0__Impl : ( 'while' ) ;
    public final void rule__Statement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2633:1: ( ( 'while' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( 'while' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2634:1: ( 'while' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2635:1: 'while'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getWhileKeyword_6_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__Statement__Group_6__0__Impl5410); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2648:1: rule__Statement__Group_6__1 : rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2 ;
    public final void rule__Statement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2652:1: ( rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2653:2: rule__Statement__Group_6__1__Impl rule__Statement__Group_6__2
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__1__Impl_in_rule__Statement__Group_6__15441);
            rule__Statement__Group_6__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__2_in_rule__Statement__Group_6__15444);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2660:1: rule__Statement__Group_6__1__Impl : ( ruleexpr ) ;
    public final void rule__Statement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2664:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2665:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2666:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprParserRuleCall_6_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__Group_6__1__Impl5471);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2677:1: rule__Statement__Group_6__2 : rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3 ;
    public final void rule__Statement__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2681:1: ( rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2682:2: rule__Statement__Group_6__2__Impl rule__Statement__Group_6__3
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__2__Impl_in_rule__Statement__Group_6__25500);
            rule__Statement__Group_6__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Statement__Group_6__3_in_rule__Statement__Group_6__25503);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2689:1: rule__Statement__Group_6__2__Impl : ( ':' ) ;
    public final void rule__Statement__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2693:1: ( ( ':' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( ':' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2694:1: ( ':' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2695:1: ':'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getColonKeyword_6_2()); 
            }
            match(input,31,FOLLOW_31_in_rule__Statement__Group_6__2__Impl5531); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2708:1: rule__Statement__Group_6__3 : rule__Statement__Group_6__3__Impl ;
    public final void rule__Statement__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2712:1: ( rule__Statement__Group_6__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2713:2: rule__Statement__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_6__3__Impl_in_rule__Statement__Group_6__35562);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2719:1: rule__Statement__Group_6__3__Impl : ( ( rule__Statement__StatementsAssignment_6_3 ) ) ;
    public final void rule__Statement__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2723:1: ( ( ( rule__Statement__StatementsAssignment_6_3 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: ( ( rule__Statement__StatementsAssignment_6_3 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2724:1: ( ( rule__Statement__StatementsAssignment_6_3 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2725:1: ( rule__Statement__StatementsAssignment_6_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsAssignment_6_3()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:1: ( rule__Statement__StatementsAssignment_6_3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2726:2: rule__Statement__StatementsAssignment_6_3
            {
            pushFollow(FOLLOW_rule__Statement__StatementsAssignment_6_3_in_rule__Statement__Group_6__3__Impl5589);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2744:1: rule__Declaration__Group__0 : rule__Declaration__Group__0__Impl rule__Declaration__Group__1 ;
    public final void rule__Declaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2748:1: ( rule__Declaration__Group__0__Impl rule__Declaration__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2749:2: rule__Declaration__Group__0__Impl rule__Declaration__Group__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__05627);
            rule__Declaration__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__05630);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2756:1: rule__Declaration__Group__0__Impl : ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) ) ;
    public final void rule__Declaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2760:1: ( ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2761:1: ( ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( ( rule__Declaration__Group_0__0 ) ) ( ( rule__Declaration__Group_0__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2762:1: ( ( rule__Declaration__Group_0__0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2763:1: ( rule__Declaration__Group_0__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:1: ( rule__Declaration__Group_0__0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2764:2: rule__Declaration__Group_0__0
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl5659);
            rule__Declaration__Group_0__0();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2767:1: ( ( rule__Declaration__Group_0__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2768:1: ( rule__Declaration__Group_0__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:1: ( rule__Declaration__Group_0__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=12 && LA19_0<=17)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2769:2: rule__Declaration__Group_0__0
            	    {
            	    pushFollow(FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl5671);
            	    rule__Declaration__Group_0__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2780:1: rule__Declaration__Group__1 : rule__Declaration__Group__1__Impl rule__Declaration__Group__2 ;
    public final void rule__Declaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2784:1: ( rule__Declaration__Group__1__Impl rule__Declaration__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2785:2: rule__Declaration__Group__1__Impl rule__Declaration__Group__2
            {
            pushFollow(FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__15704);
            rule__Declaration__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__15707);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2792:1: rule__Declaration__Group__1__Impl : ( ( rule__Declaration__NameAssignment_1 ) ) ;
    public final void rule__Declaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2796:1: ( ( ( rule__Declaration__NameAssignment_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: ( ( rule__Declaration__NameAssignment_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2797:1: ( ( rule__Declaration__NameAssignment_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2798:1: ( rule__Declaration__NameAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameAssignment_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:1: ( rule__Declaration__NameAssignment_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2799:2: rule__Declaration__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl5734);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2809:1: rule__Declaration__Group__2 : rule__Declaration__Group__2__Impl ;
    public final void rule__Declaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2813:1: ( rule__Declaration__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2814:2: rule__Declaration__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__25764);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2820:1: rule__Declaration__Group__2__Impl : ( ( rule__Declaration__Group_2__0 )? ) ;
    public final void rule__Declaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2824:1: ( ( ( rule__Declaration__Group_2__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:1: ( ( rule__Declaration__Group_2__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2825:1: ( ( rule__Declaration__Group_2__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2826:1: ( rule__Declaration__Group_2__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getGroup_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:1: ( rule__Declaration__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2827:2: rule__Declaration__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl5791);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2843:1: rule__Declaration__Group_0__0 : rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 ;
    public final void rule__Declaration__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2847:1: ( rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2848:2: rule__Declaration__Group_0__0__Impl rule__Declaration__Group_0__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__05828);
            rule__Declaration__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__05831);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2855:1: rule__Declaration__Group_0__0__Impl : ( ( rule__Declaration__VariableTypeAssignment_0_0 ) ) ;
    public final void rule__Declaration__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2859:1: ( ( ( rule__Declaration__VariableTypeAssignment_0_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: ( ( rule__Declaration__VariableTypeAssignment_0_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2860:1: ( ( rule__Declaration__VariableTypeAssignment_0_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2861:1: ( rule__Declaration__VariableTypeAssignment_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getVariableTypeAssignment_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:1: ( rule__Declaration__VariableTypeAssignment_0_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2862:2: rule__Declaration__VariableTypeAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Declaration__VariableTypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl5858);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2872:1: rule__Declaration__Group_0__1 : rule__Declaration__Group_0__1__Impl ;
    public final void rule__Declaration__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2876:1: ( rule__Declaration__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2877:2: rule__Declaration__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__15888);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2883:1: rule__Declaration__Group_0__1__Impl : ( ( '[]' )? ) ;
    public final void rule__Declaration__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2887:1: ( ( ( '[]' )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( ( '[]' )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2888:1: ( ( '[]' )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2889:1: ( '[]' )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getLeftSquareBracketRightSquareBracketKeyword_0_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2890:1: ( '[]' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2891:2: '[]'
                    {
                    match(input,40,FOLLOW_40_in_rule__Declaration__Group_0__1__Impl5917); if (failed) return ;

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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2906:1: rule__Declaration__Group_2__0 : rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 ;
    public final void rule__Declaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2910:1: ( rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2911:2: rule__Declaration__Group_2__0__Impl rule__Declaration__Group_2__1
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__05954);
            rule__Declaration__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__05957);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2918:1: rule__Declaration__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Declaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2922:1: ( ( '=' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: ( '=' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2923:1: ( '=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2924:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getEqualsSignKeyword_2_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__Declaration__Group_2__0__Impl5985); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2937:1: rule__Declaration__Group_2__1 : rule__Declaration__Group_2__1__Impl ;
    public final void rule__Declaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2941:1: ( rule__Declaration__Group_2__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2942:2: rule__Declaration__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__16016);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2948:1: rule__Declaration__Group_2__1__Impl : ( ( rule__Declaration__ExprsAssignment_2_1 ) ) ;
    public final void rule__Declaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2952:1: ( ( ( rule__Declaration__ExprsAssignment_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ( rule__Declaration__ExprsAssignment_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2953:1: ( ( rule__Declaration__ExprsAssignment_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2954:1: ( rule__Declaration__ExprsAssignment_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getExprsAssignment_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:1: ( rule__Declaration__ExprsAssignment_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2955:2: rule__Declaration__ExprsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Declaration__ExprsAssignment_2_1_in_rule__Declaration__Group_2__1__Impl6043);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2969:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2973:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2974:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__06077);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__06080);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2981:1: rule__Assignment__Group__0__Impl : ( rulepostfixExpr ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2985:1: ( ( rulepostfixExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( rulepostfixExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2986:1: ( rulepostfixExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2987:1: rulepostfixExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getPostfixExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_rule__Assignment__Group__0__Impl6107);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2998:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3002:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3003:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__16136);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__16139);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3010:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3014:1: ( ( '=' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:1: ( '=' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3015:1: ( '=' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3016:1: '='
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,41,FOLLOW_41_in_rule__Assignment__Group__1__Impl6167); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3029:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3033:1: ( rule__Assignment__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3034:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__26198);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3040:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ExprsAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3044:1: ( ( ( rule__Assignment__ExprsAssignment_2 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:1: ( ( rule__Assignment__ExprsAssignment_2 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3045:1: ( ( rule__Assignment__ExprsAssignment_2 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3046:1: ( rule__Assignment__ExprsAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExprsAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:1: ( rule__Assignment__ExprsAssignment_2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3047:2: rule__Assignment__ExprsAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ExprsAssignment_2_in_rule__Assignment__Group__2__Impl6225);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3063:1: rule__Expr__Group__0 : rule__Expr__Group__0__Impl rule__Expr__Group__1 ;
    public final void rule__Expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3067:1: ( rule__Expr__Group__0__Impl rule__Expr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3068:2: rule__Expr__Group__0__Impl rule__Expr__Group__1
            {
            pushFollow(FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__06261);
            rule__Expr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__06264);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3075:1: rule__Expr__Group__0__Impl : ( ruleandExpr ) ;
    public final void rule__Expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3079:1: ( ( ruleandExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: ( ruleandExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3080:1: ( ruleandExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3081:1: ruleandExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_rule__Expr__Group__0__Impl6291);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3092:1: rule__Expr__Group__1 : rule__Expr__Group__1__Impl ;
    public final void rule__Expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3096:1: ( rule__Expr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3097:2: rule__Expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__16320);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3103:1: rule__Expr__Group__1__Impl : ( ( rule__Expr__Group_1__0 )* ) ;
    public final void rule__Expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3107:1: ( ( ( rule__Expr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: ( ( rule__Expr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3108:1: ( ( rule__Expr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3109:1: ( rule__Expr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:1: ( rule__Expr__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==42) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3110:2: rule__Expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl6347);
            	    rule__Expr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3124:1: rule__Expr__Group_1__0 : rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 ;
    public final void rule__Expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3128:1: ( rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3129:2: rule__Expr__Group_1__0__Impl rule__Expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__06382);
            rule__Expr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__06385);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3136:1: rule__Expr__Group_1__0__Impl : ( '||' ) ;
    public final void rule__Expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3140:1: ( ( '||' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:1: ( '||' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3141:1: ( '||' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3142:1: '||'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getVerticalLineVerticalLineKeyword_1_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__Expr__Group_1__0__Impl6413); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3155:1: rule__Expr__Group_1__1 : rule__Expr__Group_1__1__Impl ;
    public final void rule__Expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3159:1: ( rule__Expr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3160:2: rule__Expr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__16444);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3166:1: rule__Expr__Group_1__1__Impl : ( ( rule__Expr__AndExprsAssignment_1_1 ) ) ;
    public final void rule__Expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3170:1: ( ( ( rule__Expr__AndExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: ( ( rule__Expr__AndExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3171:1: ( ( rule__Expr__AndExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3172:1: ( rule__Expr__AndExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:1: ( rule__Expr__AndExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3173:2: rule__Expr__AndExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expr__AndExprsAssignment_1_1_in_rule__Expr__Group_1__1__Impl6471);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3187:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3191:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3192:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__06505);
            rule__AndExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__06508);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3199:1: rule__AndExpr__Group__0__Impl : ( ruleeqExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3203:1: ( ( ruleeqExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: ( ruleeqExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3204:1: ( ruleeqExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3205:1: ruleeqExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_rule__AndExpr__Group__0__Impl6535);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3216:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3220:1: ( rule__AndExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3221:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__16564);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3227:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3231:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3232:1: ( ( rule__AndExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3233:1: ( rule__AndExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3234:1: ( rule__AndExpr__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==43) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3234:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl6591);
            	    rule__AndExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3248:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3252:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3253:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__06626);
            rule__AndExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__06629);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3260:1: rule__AndExpr__Group_1__0__Impl : ( '&&' ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3264:1: ( ( '&&' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( '&&' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3265:1: ( '&&' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3266:1: '&&'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getAmpersandAmpersandKeyword_1_0()); 
            }
            match(input,43,FOLLOW_43_in_rule__AndExpr__Group_1__0__Impl6657); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3279:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3283:1: ( rule__AndExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3284:2: rule__AndExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__16688);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3290:1: rule__AndExpr__Group_1__1__Impl : ( ( rule__AndExpr__EqExprsAssignment_1_1 ) ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3294:1: ( ( ( rule__AndExpr__EqExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:1: ( ( rule__AndExpr__EqExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3295:1: ( ( rule__AndExpr__EqExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3296:1: ( rule__AndExpr__EqExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:1: ( rule__AndExpr__EqExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3297:2: rule__AndExpr__EqExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AndExpr__EqExprsAssignment_1_1_in_rule__AndExpr__Group_1__1__Impl6715);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3311:1: rule__EqExpr__Group__0 : rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1 ;
    public final void rule__EqExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3315:1: ( rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3316:2: rule__EqExpr__Group__0__Impl rule__EqExpr__Group__1
            {
            pushFollow(FOLLOW_rule__EqExpr__Group__0__Impl_in_rule__EqExpr__Group__06749);
            rule__EqExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EqExpr__Group__1_in_rule__EqExpr__Group__06752);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3323:1: rule__EqExpr__Group__0__Impl : ( rulerelExpr ) ;
    public final void rule__EqExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3327:1: ( ( rulerelExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: ( rulerelExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3328:1: ( rulerelExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3329:1: rulerelExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_rule__EqExpr__Group__0__Impl6779);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3340:1: rule__EqExpr__Group__1 : rule__EqExpr__Group__1__Impl ;
    public final void rule__EqExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3344:1: ( rule__EqExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3345:2: rule__EqExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EqExpr__Group__1__Impl_in_rule__EqExpr__Group__16808);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3351:1: rule__EqExpr__Group__1__Impl : ( ( rule__EqExpr__Group_1__0 )* ) ;
    public final void rule__EqExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3355:1: ( ( ( rule__EqExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( ( rule__EqExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3356:1: ( ( rule__EqExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3357:1: ( rule__EqExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:1: ( rule__EqExpr__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=18 && LA24_0<=19)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3358:2: rule__EqExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__EqExpr__Group_1__0_in_rule__EqExpr__Group__1__Impl6835);
            	    rule__EqExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3372:1: rule__EqExpr__Group_1__0 : rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1 ;
    public final void rule__EqExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3376:1: ( rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3377:2: rule__EqExpr__Group_1__0__Impl rule__EqExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__EqExpr__Group_1__0__Impl_in_rule__EqExpr__Group_1__06870);
            rule__EqExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__EqExpr__Group_1__1_in_rule__EqExpr__Group_1__06873);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3384:1: rule__EqExpr__Group_1__0__Impl : ( ( rule__EqExpr__Alternatives_1_0 ) ) ;
    public final void rule__EqExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3388:1: ( ( ( rule__EqExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3389:1: ( ( rule__EqExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3389:1: ( ( rule__EqExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3390:1: ( rule__EqExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:1: ( rule__EqExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3391:2: rule__EqExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__EqExpr__Alternatives_1_0_in_rule__EqExpr__Group_1__0__Impl6900);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3401:1: rule__EqExpr__Group_1__1 : rule__EqExpr__Group_1__1__Impl ;
    public final void rule__EqExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3405:1: ( rule__EqExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3406:2: rule__EqExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EqExpr__Group_1__1__Impl_in_rule__EqExpr__Group_1__16930);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3412:1: rule__EqExpr__Group_1__1__Impl : ( ( rule__EqExpr__RelExprsAssignment_1_1 ) ) ;
    public final void rule__EqExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3416:1: ( ( ( rule__EqExpr__RelExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: ( ( rule__EqExpr__RelExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3417:1: ( ( rule__EqExpr__RelExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3418:1: ( rule__EqExpr__RelExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:1: ( rule__EqExpr__RelExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3419:2: rule__EqExpr__RelExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EqExpr__RelExprsAssignment_1_1_in_rule__EqExpr__Group_1__1__Impl6957);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3433:1: rule__RelExpr__Group__0 : rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1 ;
    public final void rule__RelExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3437:1: ( rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3438:2: rule__RelExpr__Group__0__Impl rule__RelExpr__Group__1
            {
            pushFollow(FOLLOW_rule__RelExpr__Group__0__Impl_in_rule__RelExpr__Group__06991);
            rule__RelExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__RelExpr__Group__1_in_rule__RelExpr__Group__06994);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3445:1: rule__RelExpr__Group__0__Impl : ( ruleaddExpr ) ;
    public final void rule__RelExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3449:1: ( ( ruleaddExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ( ruleaddExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3450:1: ( ruleaddExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3451:1: ruleaddExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rule__RelExpr__Group__0__Impl7021);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3462:1: rule__RelExpr__Group__1 : rule__RelExpr__Group__1__Impl ;
    public final void rule__RelExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3466:1: ( rule__RelExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3467:2: rule__RelExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RelExpr__Group__1__Impl_in_rule__RelExpr__Group__17050);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3473:1: rule__RelExpr__Group__1__Impl : ( ( rule__RelExpr__Group_1__0 )* ) ;
    public final void rule__RelExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3477:1: ( ( ( rule__RelExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3478:1: ( ( rule__RelExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3478:1: ( ( rule__RelExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3479:1: ( rule__RelExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:1: ( rule__RelExpr__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=20 && LA25_0<=23)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3480:2: rule__RelExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RelExpr__Group_1__0_in_rule__RelExpr__Group__1__Impl7077);
            	    rule__RelExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3494:1: rule__RelExpr__Group_1__0 : rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1 ;
    public final void rule__RelExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3498:1: ( rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3499:2: rule__RelExpr__Group_1__0__Impl rule__RelExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__RelExpr__Group_1__0__Impl_in_rule__RelExpr__Group_1__07112);
            rule__RelExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__RelExpr__Group_1__1_in_rule__RelExpr__Group_1__07115);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3506:1: rule__RelExpr__Group_1__0__Impl : ( ( rule__RelExpr__Alternatives_1_0 ) ) ;
    public final void rule__RelExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3510:1: ( ( ( rule__RelExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ( rule__RelExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3511:1: ( ( rule__RelExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3512:1: ( rule__RelExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:1: ( rule__RelExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3513:2: rule__RelExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__RelExpr__Alternatives_1_0_in_rule__RelExpr__Group_1__0__Impl7142);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3523:1: rule__RelExpr__Group_1__1 : rule__RelExpr__Group_1__1__Impl ;
    public final void rule__RelExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3527:1: ( rule__RelExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3528:2: rule__RelExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RelExpr__Group_1__1__Impl_in_rule__RelExpr__Group_1__17172);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3534:1: rule__RelExpr__Group_1__1__Impl : ( ( rule__RelExpr__AddExprAssignment_1_1 ) ) ;
    public final void rule__RelExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3538:1: ( ( ( rule__RelExpr__AddExprAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ( ( rule__RelExpr__AddExprAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3539:1: ( ( rule__RelExpr__AddExprAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3540:1: ( rule__RelExpr__AddExprAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:1: ( rule__RelExpr__AddExprAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3541:2: rule__RelExpr__AddExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RelExpr__AddExprAssignment_1_1_in_rule__RelExpr__Group_1__1__Impl7199);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3555:1: rule__AddExpr__Group__0 : rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1 ;
    public final void rule__AddExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3559:1: ( rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3560:2: rule__AddExpr__Group__0__Impl rule__AddExpr__Group__1
            {
            pushFollow(FOLLOW_rule__AddExpr__Group__0__Impl_in_rule__AddExpr__Group__07233);
            rule__AddExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpr__Group__1_in_rule__AddExpr__Group__07236);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3567:1: rule__AddExpr__Group__0__Impl : ( rulemulExpr ) ;
    public final void rule__AddExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3571:1: ( ( rulemulExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( rulemulExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3572:1: ( rulemulExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3573:1: rulemulExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_rule__AddExpr__Group__0__Impl7263);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3584:1: rule__AddExpr__Group__1 : rule__AddExpr__Group__1__Impl ;
    public final void rule__AddExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3588:1: ( rule__AddExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3589:2: rule__AddExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpr__Group__1__Impl_in_rule__AddExpr__Group__17292);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3595:1: rule__AddExpr__Group__1__Impl : ( ( rule__AddExpr__Group_1__0 )* ) ;
    public final void rule__AddExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3599:1: ( ( ( rule__AddExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( ( rule__AddExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3600:1: ( ( rule__AddExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3601:1: ( rule__AddExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:1: ( rule__AddExpr__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_SIGN) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3602:2: rule__AddExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AddExpr__Group_1__0_in_rule__AddExpr__Group__1__Impl7319);
            	    rule__AddExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3616:1: rule__AddExpr__Group_1__0 : rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1 ;
    public final void rule__AddExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3620:1: ( rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3621:2: rule__AddExpr__Group_1__0__Impl rule__AddExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__AddExpr__Group_1__0__Impl_in_rule__AddExpr__Group_1__07354);
            rule__AddExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__AddExpr__Group_1__1_in_rule__AddExpr__Group_1__07357);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3628:1: rule__AddExpr__Group_1__0__Impl : ( RULE_SIGN ) ;
    public final void rule__AddExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3632:1: ( ( RULE_SIGN ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( RULE_SIGN )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3633:1: ( RULE_SIGN )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3634:1: RULE_SIGN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getSignTerminalRuleCall_1_0()); 
            }
            match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_rule__AddExpr__Group_1__0__Impl7384); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3645:1: rule__AddExpr__Group_1__1 : rule__AddExpr__Group_1__1__Impl ;
    public final void rule__AddExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3649:1: ( rule__AddExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3650:2: rule__AddExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AddExpr__Group_1__1__Impl_in_rule__AddExpr__Group_1__17413);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3656:1: rule__AddExpr__Group_1__1__Impl : ( ( rule__AddExpr__MulExprsAssignment_1_1 ) ) ;
    public final void rule__AddExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3660:1: ( ( ( rule__AddExpr__MulExprsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( ( rule__AddExpr__MulExprsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3661:1: ( ( rule__AddExpr__MulExprsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3662:1: ( rule__AddExpr__MulExprsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:1: ( rule__AddExpr__MulExprsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3663:2: rule__AddExpr__MulExprsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AddExpr__MulExprsAssignment_1_1_in_rule__AddExpr__Group_1__1__Impl7440);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3677:1: rule__MulExpr__Group__0 : rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1 ;
    public final void rule__MulExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3681:1: ( rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3682:2: rule__MulExpr__Group__0__Impl rule__MulExpr__Group__1
            {
            pushFollow(FOLLOW_rule__MulExpr__Group__0__Impl_in_rule__MulExpr__Group__07474);
            rule__MulExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MulExpr__Group__1_in_rule__MulExpr__Group__07477);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3689:1: rule__MulExpr__Group__0__Impl : ( ( rule__MulExpr__AtomsAssignment_0 ) ) ;
    public final void rule__MulExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3693:1: ( ( ( rule__MulExpr__AtomsAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( ( rule__MulExpr__AtomsAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3694:1: ( ( rule__MulExpr__AtomsAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3695:1: ( rule__MulExpr__AtomsAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:1: ( rule__MulExpr__AtomsAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3696:2: rule__MulExpr__AtomsAssignment_0
            {
            pushFollow(FOLLOW_rule__MulExpr__AtomsAssignment_0_in_rule__MulExpr__Group__0__Impl7504);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3706:1: rule__MulExpr__Group__1 : rule__MulExpr__Group__1__Impl ;
    public final void rule__MulExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3710:1: ( rule__MulExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3711:2: rule__MulExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MulExpr__Group__1__Impl_in_rule__MulExpr__Group__17534);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3717:1: rule__MulExpr__Group__1__Impl : ( ( rule__MulExpr__Group_1__0 )* ) ;
    public final void rule__MulExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3721:1: ( ( ( rule__MulExpr__Group_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( ( rule__MulExpr__Group_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3722:1: ( ( rule__MulExpr__Group_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3723:1: ( rule__MulExpr__Group_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getGroup_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:1: ( rule__MulExpr__Group_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=24 && LA27_0<=26)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3724:2: rule__MulExpr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__MulExpr__Group_1__0_in_rule__MulExpr__Group__1__Impl7561);
            	    rule__MulExpr__Group_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3738:1: rule__MulExpr__Group_1__0 : rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 ;
    public final void rule__MulExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3742:1: ( rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3743:2: rule__MulExpr__Group_1__0__Impl rule__MulExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__MulExpr__Group_1__0__Impl_in_rule__MulExpr__Group_1__07596);
            rule__MulExpr__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MulExpr__Group_1__1_in_rule__MulExpr__Group_1__07599);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3750:1: rule__MulExpr__Group_1__0__Impl : ( ( rule__MulExpr__Alternatives_1_0 ) ) ;
    public final void rule__MulExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3754:1: ( ( ( rule__MulExpr__Alternatives_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ( rule__MulExpr__Alternatives_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3755:1: ( ( rule__MulExpr__Alternatives_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3756:1: ( rule__MulExpr__Alternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAlternatives_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:1: ( rule__MulExpr__Alternatives_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3757:2: rule__MulExpr__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__MulExpr__Alternatives_1_0_in_rule__MulExpr__Group_1__0__Impl7626);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3767:1: rule__MulExpr__Group_1__1 : rule__MulExpr__Group_1__1__Impl ;
    public final void rule__MulExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3771:1: ( rule__MulExpr__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3772:2: rule__MulExpr__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__MulExpr__Group_1__1__Impl_in_rule__MulExpr__Group_1__17656);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3778:1: rule__MulExpr__Group_1__1__Impl : ( ( rule__MulExpr__AtomsAssignment_1_1 ) ) ;
    public final void rule__MulExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3782:1: ( ( ( rule__MulExpr__AtomsAssignment_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( ( rule__MulExpr__AtomsAssignment_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3783:1: ( ( rule__MulExpr__AtomsAssignment_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3784:1: ( rule__MulExpr__AtomsAssignment_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAssignment_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:1: ( rule__MulExpr__AtomsAssignment_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3785:2: rule__MulExpr__AtomsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__MulExpr__AtomsAssignment_1_1_in_rule__MulExpr__Group_1__1__Impl7683);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3799:1: rule__Atom__Group_0__0 : rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1 ;
    public final void rule__Atom__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3803:1: ( rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3804:2: rule__Atom__Group_0__0__Impl rule__Atom__Group_0__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_0__0__Impl_in_rule__Atom__Group_0__07717);
            rule__Atom__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_0__1_in_rule__Atom__Group_0__07720);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3811:1: rule__Atom__Group_0__0__Impl : ( '!' ) ;
    public final void rule__Atom__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3815:1: ( ( '!' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: ( '!' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3816:1: ( '!' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3817:1: '!'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExclamationMarkKeyword_0_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__Atom__Group_0__0__Impl7748); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3830:1: rule__Atom__Group_0__1 : rule__Atom__Group_0__1__Impl ;
    public final void rule__Atom__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3834:1: ( rule__Atom__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3835:2: rule__Atom__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_0__1__Impl_in_rule__Atom__Group_0__17779);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3841:1: rule__Atom__Group_0__1__Impl : ( ruleatom ) ;
    public final void rule__Atom__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3845:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3846:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3847:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAtomParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__Atom__Group_0__1__Impl7806);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3862:1: rule__Atom__Group_1__0 : rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 ;
    public final void rule__Atom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3866:1: ( rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3867:2: rule__Atom__Group_1__0__Impl rule__Atom__Group_1__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__07839);
            rule__Atom__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__07842);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3874:1: rule__Atom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3878:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3879:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3880:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Atom__Group_1__0__Impl7870); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3893:1: rule__Atom__Group_1__1 : rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 ;
    public final void rule__Atom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3897:1: ( rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3898:2: rule__Atom__Group_1__1__Impl rule__Atom__Group_1__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__17901);
            rule__Atom__Group_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__17904);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3905:1: rule__Atom__Group_1__1__Impl : ( RULE_SIGN ) ;
    public final void rule__Atom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3909:1: ( ( RULE_SIGN ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( RULE_SIGN )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3910:1: ( RULE_SIGN )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3911:1: RULE_SIGN
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getSignTerminalRuleCall_1_1()); 
            }
            match(input,RULE_SIGN,FOLLOW_RULE_SIGN_in_rule__Atom__Group_1__1__Impl7931); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3922:1: rule__Atom__Group_1__2 : rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 ;
    public final void rule__Atom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3926:1: ( rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3927:2: rule__Atom__Group_1__2__Impl rule__Atom__Group_1__3
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__27960);
            rule__Atom__Group_1__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_1__3_in_rule__Atom__Group_1__27963);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3934:1: rule__Atom__Group_1__2__Impl : ( ruleexpr ) ;
    public final void rule__Atom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3938:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3939:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3940:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExprParserRuleCall_1_2()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Atom__Group_1__2__Impl7990);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3951:1: rule__Atom__Group_1__3 : rule__Atom__Group_1__3__Impl ;
    public final void rule__Atom__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3955:1: ( rule__Atom__Group_1__3__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3956:2: rule__Atom__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_1__3__Impl_in_rule__Atom__Group_1__38019);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3962:1: rule__Atom__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Atom__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3966:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3967:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3968:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,30,FOLLOW_30_in_rule__Atom__Group_1__3__Impl8047); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3989:1: rule__Atom__Group_2__0 : rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 ;
    public final void rule__Atom__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3993:1: ( rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:3994:2: rule__Atom__Group_2__0__Impl rule__Atom__Group_2__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__0__Impl_in_rule__Atom__Group_2__08086);
            rule__Atom__Group_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_2__1_in_rule__Atom__Group_2__08089);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4001:1: rule__Atom__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Atom__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4005:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4006:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4007:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Atom__Group_2__0__Impl8117); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4020:1: rule__Atom__Group_2__1 : rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2 ;
    public final void rule__Atom__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4024:1: ( rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4025:2: rule__Atom__Group_2__1__Impl rule__Atom__Group_2__2
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__1__Impl_in_rule__Atom__Group_2__18148);
            rule__Atom__Group_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_2__2_in_rule__Atom__Group_2__18151);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4032:1: rule__Atom__Group_2__1__Impl : ( ruleexpr ) ;
    public final void rule__Atom__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4036:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4037:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4038:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getExprParserRuleCall_2_1()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Atom__Group_2__1__Impl8178);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4049:1: rule__Atom__Group_2__2 : rule__Atom__Group_2__2__Impl ;
    public final void rule__Atom__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4053:1: ( rule__Atom__Group_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4054:2: rule__Atom__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_2__2__Impl_in_rule__Atom__Group_2__28207);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4060:1: rule__Atom__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Atom__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4064:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4065:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4066:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__Atom__Group_2__2__Impl8235); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4085:1: rule__Atom__Group_4__0 : rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 ;
    public final void rule__Atom__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4089:1: ( rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4090:2: rule__Atom__Group_4__0__Impl rule__Atom__Group_4__1
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__08272);
            rule__Atom__Group_4__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__08275);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4097:1: rule__Atom__Group_4__0__Impl : ( () ) ;
    public final void rule__Atom__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4101:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4102:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4103:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getAtomAction_4_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4104:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4106:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4116:1: rule__Atom__Group_4__1 : rule__Atom__Group_4__1__Impl ;
    public final void rule__Atom__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4120:1: ( rule__Atom__Group_4__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4121:2: rule__Atom__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__18333);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4127:1: rule__Atom__Group_4__1__Impl : ( ( rule__Atom__ConstantsAssignment_4_1 ) ) ;
    public final void rule__Atom__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4131:1: ( ( ( rule__Atom__ConstantsAssignment_4_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4132:1: ( ( rule__Atom__ConstantsAssignment_4_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4132:1: ( ( rule__Atom__ConstantsAssignment_4_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4133:1: ( rule__Atom__ConstantsAssignment_4_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getConstantsAssignment_4_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:1: ( rule__Atom__ConstantsAssignment_4_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4134:2: rule__Atom__ConstantsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Atom__ConstantsAssignment_4_1_in_rule__Atom__Group_4__1__Impl8360);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4148:1: rule__PostfixExpr__Group__0 : rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1 ;
    public final void rule__PostfixExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4152:1: ( rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4153:2: rule__PostfixExpr__Group__0__Impl rule__PostfixExpr__Group__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__0__Impl_in_rule__PostfixExpr__Group__08394);
            rule__PostfixExpr__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group__1_in_rule__PostfixExpr__Group__08397);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4160:1: rule__PostfixExpr__Group__0__Impl : ( ( rule__PostfixExpr__Alternatives_0 ) ) ;
    public final void rule__PostfixExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4164:1: ( ( ( rule__PostfixExpr__Alternatives_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4165:1: ( ( rule__PostfixExpr__Alternatives_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4165:1: ( ( rule__PostfixExpr__Alternatives_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4166:1: ( rule__PostfixExpr__Alternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getAlternatives_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:1: ( rule__PostfixExpr__Alternatives_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4167:2: rule__PostfixExpr__Alternatives_0
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Alternatives_0_in_rule__PostfixExpr__Group__0__Impl8424);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4177:1: rule__PostfixExpr__Group__1 : rule__PostfixExpr__Group__1__Impl ;
    public final void rule__PostfixExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4181:1: ( rule__PostfixExpr__Group__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4182:2: rule__PostfixExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group__1__Impl_in_rule__PostfixExpr__Group__18454);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4188:1: rule__PostfixExpr__Group__1__Impl : ( ( rule__PostfixExpr__Alternatives_1 )* ) ;
    public final void rule__PostfixExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4192:1: ( ( ( rule__PostfixExpr__Alternatives_1 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: ( ( rule__PostfixExpr__Alternatives_1 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4193:1: ( ( rule__PostfixExpr__Alternatives_1 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4194:1: ( rule__PostfixExpr__Alternatives_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getAlternatives_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:1: ( rule__PostfixExpr__Alternatives_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==29||(LA28_0>=45 && LA28_0<=46)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4195:2: rule__PostfixExpr__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__PostfixExpr__Alternatives_1_in_rule__PostfixExpr__Group__1__Impl8481);
            	    rule__PostfixExpr__Alternatives_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4209:1: rule__PostfixExpr__Group_1_0__0 : rule__PostfixExpr__Group_1_0__0__Impl rule__PostfixExpr__Group_1_0__1 ;
    public final void rule__PostfixExpr__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4213:1: ( rule__PostfixExpr__Group_1_0__0__Impl rule__PostfixExpr__Group_1_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4214:2: rule__PostfixExpr__Group_1_0__0__Impl rule__PostfixExpr__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_0__0__Impl_in_rule__PostfixExpr__Group_1_0__08516);
            rule__PostfixExpr__Group_1_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_0__1_in_rule__PostfixExpr__Group_1_0__08519);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4221:1: rule__PostfixExpr__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__PostfixExpr__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4225:1: ( ( '.' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: ( '.' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4226:1: ( '.' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4227:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getFullStopKeyword_1_0_0()); 
            }
            match(input,45,FOLLOW_45_in_rule__PostfixExpr__Group_1_0__0__Impl8547); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4240:1: rule__PostfixExpr__Group_1_0__1 : rule__PostfixExpr__Group_1_0__1__Impl ;
    public final void rule__PostfixExpr__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4244:1: ( rule__PostfixExpr__Group_1_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4245:2: rule__PostfixExpr__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_0__1__Impl_in_rule__PostfixExpr__Group_1_0__18578);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4251:1: rule__PostfixExpr__Group_1_0__1__Impl : ( RULE_ID ) ;
    public final void rule__PostfixExpr__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4255:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4256:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4257:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__Group_1_0__1__Impl8605); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4272:1: rule__PostfixExpr__Group_1_1__0 : rule__PostfixExpr__Group_1_1__0__Impl rule__PostfixExpr__Group_1_1__1 ;
    public final void rule__PostfixExpr__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4276:1: ( rule__PostfixExpr__Group_1_1__0__Impl rule__PostfixExpr__Group_1_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4277:2: rule__PostfixExpr__Group_1_1__0__Impl rule__PostfixExpr__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1__08638);
            rule__PostfixExpr__Group_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__1_in_rule__PostfixExpr__Group_1_1__08641);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4284:1: rule__PostfixExpr__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__PostfixExpr__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4288:1: ( ( '(' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4289:1: ( '(' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4289:1: ( '(' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4290:1: '('
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getLeftParenthesisKeyword_1_1_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__PostfixExpr__Group_1_1__0__Impl8669); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4303:1: rule__PostfixExpr__Group_1_1__1 : rule__PostfixExpr__Group_1_1__1__Impl rule__PostfixExpr__Group_1_1__2 ;
    public final void rule__PostfixExpr__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4307:1: ( rule__PostfixExpr__Group_1_1__1__Impl rule__PostfixExpr__Group_1_1__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4308:2: rule__PostfixExpr__Group_1_1__1__Impl rule__PostfixExpr__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1__18700);
            rule__PostfixExpr__Group_1_1__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__2_in_rule__PostfixExpr__Group_1_1__18703);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4315:1: rule__PostfixExpr__Group_1_1__1__Impl : ( ( rule__PostfixExpr__Group_1_1_1__0 )? ) ;
    public final void rule__PostfixExpr__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4319:1: ( ( ( rule__PostfixExpr__Group_1_1_1__0 )? ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:1: ( ( rule__PostfixExpr__Group_1_1_1__0 )? )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4320:1: ( ( rule__PostfixExpr__Group_1_1_1__0 )? )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4321:1: ( rule__PostfixExpr__Group_1_1_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getGroup_1_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:1: ( rule__PostfixExpr__Group_1_1_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_STRING)||LA29_0==29||LA29_0==44||(LA29_0>=48 && LA29_0<=49)||(LA29_0>=51 && LA29_0<=52)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4322:2: rule__PostfixExpr__Group_1_1_1__0
                    {
                    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1__0_in_rule__PostfixExpr__Group_1_1__1__Impl8730);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4332:1: rule__PostfixExpr__Group_1_1__2 : rule__PostfixExpr__Group_1_1__2__Impl ;
    public final void rule__PostfixExpr__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4336:1: ( rule__PostfixExpr__Group_1_1__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4337:2: rule__PostfixExpr__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1__2__Impl_in_rule__PostfixExpr__Group_1_1__28761);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4343:1: rule__PostfixExpr__Group_1_1__2__Impl : ( ')' ) ;
    public final void rule__PostfixExpr__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4347:1: ( ( ')' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4348:1: ( ')' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4348:1: ( ')' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4349:1: ')'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getRightParenthesisKeyword_1_1_2()); 
            }
            match(input,30,FOLLOW_30_in_rule__PostfixExpr__Group_1_1__2__Impl8789); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4368:1: rule__PostfixExpr__Group_1_1_1__0 : rule__PostfixExpr__Group_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1__1 ;
    public final void rule__PostfixExpr__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4372:1: ( rule__PostfixExpr__Group_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4373:2: rule__PostfixExpr__Group_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1_1__08826);
            rule__PostfixExpr__Group_1_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1__1_in_rule__PostfixExpr__Group_1_1_1__08829);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4380:1: rule__PostfixExpr__Group_1_1_1__0__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 ) ) ;
    public final void rule__PostfixExpr__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4384:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4385:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4386:1: ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_1_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:1: ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4387:2: rule__PostfixExpr__ExpressionsAssignment_1_1_1_0
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_1_1_0_in_rule__PostfixExpr__Group_1_1_1__0__Impl8856);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4397:1: rule__PostfixExpr__Group_1_1_1__1 : rule__PostfixExpr__Group_1_1_1__1__Impl ;
    public final void rule__PostfixExpr__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4401:1: ( rule__PostfixExpr__Group_1_1_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4402:2: rule__PostfixExpr__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1_1__18886);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4408:1: rule__PostfixExpr__Group_1_1_1__1__Impl : ( ( rule__PostfixExpr__Group_1_1_1_1__0 )* ) ;
    public final void rule__PostfixExpr__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4412:1: ( ( ( rule__PostfixExpr__Group_1_1_1_1__0 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: ( ( rule__PostfixExpr__Group_1_1_1_1__0 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4413:1: ( ( rule__PostfixExpr__Group_1_1_1_1__0 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4414:1: ( rule__PostfixExpr__Group_1_1_1_1__0 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getGroup_1_1_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:1: ( rule__PostfixExpr__Group_1_1_1_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==27) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4415:2: rule__PostfixExpr__Group_1_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1_1__0_in_rule__PostfixExpr__Group_1_1_1__1__Impl8913);
            	    rule__PostfixExpr__Group_1_1_1_1__0();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4429:1: rule__PostfixExpr__Group_1_1_1_1__0 : rule__PostfixExpr__Group_1_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1_1__1 ;
    public final void rule__PostfixExpr__Group_1_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4433:1: ( rule__PostfixExpr__Group_1_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4434:2: rule__PostfixExpr__Group_1_1_1_1__0__Impl rule__PostfixExpr__Group_1_1_1_1__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1_1_1__08948);
            rule__PostfixExpr__Group_1_1_1_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1_1__1_in_rule__PostfixExpr__Group_1_1_1_1__08951);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4441:1: rule__PostfixExpr__Group_1_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__PostfixExpr__Group_1_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4445:1: ( ( ',' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4446:1: ( ',' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4446:1: ( ',' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4447:1: ','
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getCommaKeyword_1_1_1_1_0()); 
            }
            match(input,27,FOLLOW_27_in_rule__PostfixExpr__Group_1_1_1_1__0__Impl8979); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4460:1: rule__PostfixExpr__Group_1_1_1_1__1 : rule__PostfixExpr__Group_1_1_1_1__1__Impl ;
    public final void rule__PostfixExpr__Group_1_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4464:1: ( rule__PostfixExpr__Group_1_1_1_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4465:2: rule__PostfixExpr__Group_1_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_1_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1_1_1__19010);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4471:1: rule__PostfixExpr__Group_1_1_1_1__1__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 ) ) ;
    public final void rule__PostfixExpr__Group_1_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4475:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4476:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4477:1: ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_1_1_1_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:1: ( rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4478:2: rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1_in_rule__PostfixExpr__Group_1_1_1_1__1__Impl9037);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4492:1: rule__PostfixExpr__Group_1_2__0 : rule__PostfixExpr__Group_1_2__0__Impl rule__PostfixExpr__Group_1_2__1 ;
    public final void rule__PostfixExpr__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4496:1: ( rule__PostfixExpr__Group_1_2__0__Impl rule__PostfixExpr__Group_1_2__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4497:2: rule__PostfixExpr__Group_1_2__0__Impl rule__PostfixExpr__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__0__Impl_in_rule__PostfixExpr__Group_1_2__09071);
            rule__PostfixExpr__Group_1_2__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__1_in_rule__PostfixExpr__Group_1_2__09074);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4504:1: rule__PostfixExpr__Group_1_2__0__Impl : ( '[' ) ;
    public final void rule__PostfixExpr__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4508:1: ( ( '[' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:1: ( '[' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4509:1: ( '[' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4510:1: '['
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getLeftSquareBracketKeyword_1_2_0()); 
            }
            match(input,46,FOLLOW_46_in_rule__PostfixExpr__Group_1_2__0__Impl9102); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4523:1: rule__PostfixExpr__Group_1_2__1 : rule__PostfixExpr__Group_1_2__1__Impl rule__PostfixExpr__Group_1_2__2 ;
    public final void rule__PostfixExpr__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4527:1: ( rule__PostfixExpr__Group_1_2__1__Impl rule__PostfixExpr__Group_1_2__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4528:2: rule__PostfixExpr__Group_1_2__1__Impl rule__PostfixExpr__Group_1_2__2
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__1__Impl_in_rule__PostfixExpr__Group_1_2__19133);
            rule__PostfixExpr__Group_1_2__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__2_in_rule__PostfixExpr__Group_1_2__19136);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4535:1: rule__PostfixExpr__Group_1_2__1__Impl : ( ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 ) ) ;
    public final void rule__PostfixExpr__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4539:1: ( ( ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4540:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4540:1: ( ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4541:1: ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_2_1()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:1: ( rule__PostfixExpr__ExpressionsAssignment_1_2_1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4542:2: rule__PostfixExpr__ExpressionsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_2_1_in_rule__PostfixExpr__Group_1_2__1__Impl9163);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4552:1: rule__PostfixExpr__Group_1_2__2 : rule__PostfixExpr__Group_1_2__2__Impl ;
    public final void rule__PostfixExpr__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4556:1: ( rule__PostfixExpr__Group_1_2__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4557:2: rule__PostfixExpr__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PostfixExpr__Group_1_2__2__Impl_in_rule__PostfixExpr__Group_1_2__29193);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4563:1: rule__PostfixExpr__Group_1_2__2__Impl : ( ']' ) ;
    public final void rule__PostfixExpr__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4567:1: ( ( ']' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: ( ']' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4568:1: ( ']' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4569:1: ']'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getRightSquareBracketKeyword_1_2_2()); 
            }
            match(input,47,FOLLOW_47_in_rule__PostfixExpr__Group_1_2__2__Impl9221); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4588:1: rule__Constant__Group_0__0 : rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 ;
    public final void rule__Constant__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4592:1: ( rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4593:2: rule__Constant__Group_0__0__Impl rule__Constant__Group_0__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_0__0__Impl_in_rule__Constant__Group_0__09258);
            rule__Constant__Group_0__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group_0__1_in_rule__Constant__Group_0__09261);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4600:1: rule__Constant__Group_0__0__Impl : ( () ) ;
    public final void rule__Constant__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4604:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4605:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4605:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4606:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstantAction_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4607:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4609:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4619:1: rule__Constant__Group_0__1 : rule__Constant__Group_0__1__Impl ;
    public final void rule__Constant__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4623:1: ( rule__Constant__Group_0__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4624:2: rule__Constant__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_0__1__Impl_in_rule__Constant__Group_0__19319);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4630:1: rule__Constant__Group_0__1__Impl : ( 'true' ) ;
    public final void rule__Constant__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4634:1: ( ( 'true' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:1: ( 'true' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4635:1: ( 'true' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4636:1: 'true'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTrueKeyword_0_1()); 
            }
            match(input,48,FOLLOW_48_in_rule__Constant__Group_0__1__Impl9347); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4653:1: rule__Constant__Group_1__0 : rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 ;
    public final void rule__Constant__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4657:1: ( rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4658:2: rule__Constant__Group_1__0__Impl rule__Constant__Group_1__1
            {
            pushFollow(FOLLOW_rule__Constant__Group_1__0__Impl_in_rule__Constant__Group_1__09382);
            rule__Constant__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Constant__Group_1__1_in_rule__Constant__Group_1__09385);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4665:1: rule__Constant__Group_1__0__Impl : ( () ) ;
    public final void rule__Constant__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4669:1: ( ( () ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:1: ( () )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4670:1: ( () )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4671:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstantAction_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4672:1: ()
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4674:1: 
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4684:1: rule__Constant__Group_1__1 : rule__Constant__Group_1__1__Impl ;
    public final void rule__Constant__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4688:1: ( rule__Constant__Group_1__1__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4689:2: rule__Constant__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Constant__Group_1__1__Impl_in_rule__Constant__Group_1__19443);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4695:1: rule__Constant__Group_1__1__Impl : ( 'false' ) ;
    public final void rule__Constant__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4699:1: ( ( 'false' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4700:1: ( 'false' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4700:1: ( 'false' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4701:1: 'false'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getFalseKeyword_1_1()); 
            }
            match(input,49,FOLLOW_49_in_rule__Constant__Group_1__1__Impl9471); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4718:1: rule__FLOAT__Group__0 : rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 ;
    public final void rule__FLOAT__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4722:1: ( rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4723:2: rule__FLOAT__Group__0__Impl rule__FLOAT__Group__1
            {
            pushFollow(FOLLOW_rule__FLOAT__Group__0__Impl_in_rule__FLOAT__Group__09506);
            rule__FLOAT__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FLOAT__Group__1_in_rule__FLOAT__Group__09509);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4730:1: rule__FLOAT__Group__0__Impl : ( ( rule__FLOAT__FLOATAssignment_0 ) ) ;
    public final void rule__FLOAT__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4734:1: ( ( ( rule__FLOAT__FLOATAssignment_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( ( rule__FLOAT__FLOATAssignment_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4735:1: ( ( rule__FLOAT__FLOATAssignment_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4736:1: ( rule__FLOAT__FLOATAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATAssignment_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:1: ( rule__FLOAT__FLOATAssignment_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4737:2: rule__FLOAT__FLOATAssignment_0
            {
            pushFollow(FOLLOW_rule__FLOAT__FLOATAssignment_0_in_rule__FLOAT__Group__0__Impl9536);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4747:1: rule__FLOAT__Group__1 : rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 ;
    public final void rule__FLOAT__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4751:1: ( rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4752:2: rule__FLOAT__Group__1__Impl rule__FLOAT__Group__2
            {
            pushFollow(FOLLOW_rule__FLOAT__Group__1__Impl_in_rule__FLOAT__Group__19566);
            rule__FLOAT__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__FLOAT__Group__2_in_rule__FLOAT__Group__19569);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4759:1: rule__FLOAT__Group__1__Impl : ( '.' ) ;
    public final void rule__FLOAT__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4763:1: ( ( '.' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: ( '.' )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4764:1: ( '.' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4765:1: '.'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFullStopKeyword_1()); 
            }
            match(input,45,FOLLOW_45_in_rule__FLOAT__Group__1__Impl9597); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4778:1: rule__FLOAT__Group__2 : rule__FLOAT__Group__2__Impl ;
    public final void rule__FLOAT__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4782:1: ( rule__FLOAT__Group__2__Impl )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4783:2: rule__FLOAT__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__FLOAT__Group__2__Impl_in_rule__FLOAT__Group__29628);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4789:1: rule__FLOAT__Group__2__Impl : ( ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* ) ) ;
    public final void rule__FLOAT__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4793:1: ( ( ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4794:1: ( ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( ( rule__FLOAT__FLOATAssignment_2 ) ) ( ( rule__FLOAT__FLOATAssignment_2 )* )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4795:1: ( ( rule__FLOAT__FLOATAssignment_2 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4796:1: ( rule__FLOAT__FLOATAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:1: ( rule__FLOAT__FLOATAssignment_2 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4797:2: rule__FLOAT__FLOATAssignment_2
            {
            pushFollow(FOLLOW_rule__FLOAT__FLOATAssignment_2_in_rule__FLOAT__Group__2__Impl9657);
            rule__FLOAT__FLOATAssignment_2();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getFLOATAccess().getFLOATAssignment_2()); 
            }

            }

            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4800:1: ( ( rule__FLOAT__FLOATAssignment_2 )* )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4801:1: ( rule__FLOAT__FLOATAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATAssignment_2()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4802:1: ( rule__FLOAT__FLOATAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_INT) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4802:2: rule__FLOAT__FLOATAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__FLOAT__FLOATAssignment_2_in_rule__FLOAT__Group__2__Impl9669);
            	    rule__FLOAT__FLOATAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4820:1: rule__Model__FunctionsAssignment_0 : ( rulefunctionDefinition ) ;
    public final void rule__Model__FunctionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4824:1: ( ( rulefunctionDefinition ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( rulefunctionDefinition )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4825:1: ( rulefunctionDefinition )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4826:1: rulefunctionDefinition
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFunctionsFunctionDefinitionParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_rulefunctionDefinition_in_rule__Model__FunctionsAssignment_09713);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4835:1: rule__Model__MainAssignment_1 : ( rulemainFunction ) ;
    public final void rule__Model__MainAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4839:1: ( ( rulemainFunction ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: ( rulemainFunction )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4840:1: ( rulemainFunction )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4841:1: rulemainFunction
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getModelAccess().getMainMainFunctionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_rulemainFunction_in_rule__Model__MainAssignment_19744);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4850:1: rule__FunctionDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FunctionDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4854:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4855:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4856:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_09775); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4865:1: rule__FunctionDefinition__FormalParamsAssignment_2 : ( ruleformalParams ) ;
    public final void rule__FunctionDefinition__FormalParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4869:1: ( ( ruleformalParams ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: ( ruleformalParams )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4870:1: ( ruleformalParams )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4871:1: ruleformalParams
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getFormalParamsFormalParamsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_rule__FunctionDefinition__FormalParamsAssignment_29806);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4880:1: rule__FunctionDefinition__ReturnTypeAssignment_4_1 : ( ruletype ) ;
    public final void rule__FunctionDefinition__ReturnTypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4884:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4885:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4886:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__FunctionDefinition__ReturnTypeAssignment_4_19837);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4895:1: rule__FunctionDefinition__BlocksAssignment_5 : ( ruleblock ) ;
    public final void rule__FunctionDefinition__BlocksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4899:1: ( ( ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: ( ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4900:1: ( ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4901:1: ruleblock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFunctionDefinitionAccess().getBlocksBlockParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleblock_in_rule__FunctionDefinition__BlocksAssignment_59868);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4910:1: rule__MainFunction__MainAssignment_0 : ( ( 'main' ) ) ;
    public final void rule__MainFunction__MainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4914:1: ( ( ( 'main' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: ( ( 'main' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4915:1: ( ( 'main' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4916:1: ( 'main' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4917:1: ( 'main' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4918:1: 'main'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getMainMainKeyword_0_0()); 
            }
            match(input,50,FOLLOW_50_in_rule__MainFunction__MainAssignment_09904); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4933:1: rule__MainFunction__FormalParamsAssignment_2 : ( ruleformalParams ) ;
    public final void rule__MainFunction__FormalParamsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4937:1: ( ( ruleformalParams ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: ( ruleformalParams )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4938:1: ( ruleformalParams )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4939:1: ruleformalParams
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getFormalParamsFormalParamsParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleformalParams_in_rule__MainFunction__FormalParamsAssignment_29943);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4948:1: rule__MainFunction__BlocksAssignment_4 : ( ruleblock ) ;
    public final void rule__MainFunction__BlocksAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4952:1: ( ( ruleblock ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: ( ruleblock )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4953:1: ( ruleblock )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4954:1: ruleblock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMainFunctionAccess().getBlocksBlockParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleblock_in_rule__MainFunction__BlocksAssignment_49974);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4963:1: rule__FormalParams__ParamsAssignment_0 : ( ruleparam ) ;
    public final void rule__FormalParams__ParamsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4967:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4968:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4968:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4969:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_010005);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4978:1: rule__FormalParams__ParamsAssignment_1_1 : ( ruleparam ) ;
    public final void rule__FormalParams__ParamsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4982:1: ( ( ruleparam ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ruleparam )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4983:1: ( ruleparam )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4984:1: ruleparam
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFormalParamsAccess().getParamsParamParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_1_110036);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4993:1: rule__Param__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Param__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4997:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4998:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:4999:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Param__NameAssignment_110067); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5008:1: rule__Block__StatementsAssignment_2 : ( rulestatement ) ;
    public final void rule__Block__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5012:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5013:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5014:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Block__StatementsAssignment_210098);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5023:1: rule__Type__TypesAssignment : ( ( rule__Type__TypesAlternatives_0 ) ) ;
    public final void rule__Type__TypesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5027:1: ( ( ( rule__Type__TypesAlternatives_0 ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: ( ( rule__Type__TypesAlternatives_0 ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5028:1: ( ( rule__Type__TypesAlternatives_0 ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5029:1: ( rule__Type__TypesAlternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTypeAccess().getTypesAlternatives_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5030:1: ( rule__Type__TypesAlternatives_0 )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5030:2: rule__Type__TypesAlternatives_0
            {
            pushFollow(FOLLOW_rule__Type__TypesAlternatives_0_in_rule__Type__TypesAssignment10129);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5039:1: rule__Statement__PostFixExpressionAssignment_0_1 : ( rulepostfixExpr ) ;
    public final void rule__Statement__PostFixExpressionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5043:1: ( ( rulepostfixExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5044:1: ( rulepostfixExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5044:1: ( rulepostfixExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5045:1: rulepostfixExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getPostFixExpressionPostfixExprParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_rulepostfixExpr_in_rule__Statement__PostFixExpressionAssignment_0_110162);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5054:1: rule__Statement__AssignmentsAssignment_2_1 : ( ruleassignment ) ;
    public final void rule__Statement__AssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5058:1: ( ( ruleassignment ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5059:1: ( ruleassignment )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5059:1: ( ruleassignment )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5060:1: ruleassignment
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getAssignmentsAssignmentParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleassignment_in_rule__Statement__AssignmentsAssignment_2_110193);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5069:1: rule__Statement__ExprsAssignment_3_2 : ( ruleexpr ) ;
    public final void rule__Statement__ExprsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5073:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5074:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5074:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5075:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_3_210224);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5084:1: rule__Statement__StatementsAssignment_4_3 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5088:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5089:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5089:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5090:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_4_310255);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5099:1: rule__Statement__StatementsAssignment_4_4_1 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_4_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5103:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5104:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5105:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_4_4_1_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_4_4_110286);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5114:1: rule__Statement__ExprsAssignment_5_3 : ( ruleexpr ) ;
    public final void rule__Statement__ExprsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5118:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5119:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5119:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5120:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getExprsExprParserRuleCall_5_3_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_5_310317);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5129:1: rule__Statement__StatementsAssignment_5_5 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_5_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5133:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5134:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5135:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_5_5_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_5_510348);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5144:1: rule__Statement__StatementsAssignment_6_3 : ( rulestatement ) ;
    public final void rule__Statement__StatementsAssignment_6_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5148:1: ( ( rulestatement ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5149:1: ( rulestatement )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5149:1: ( rulestatement )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5150:1: rulestatement
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getStatementAccess().getStatementsStatementParserRuleCall_6_3_0()); 
            }
            pushFollow(FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_6_310379);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5159:1: rule__Declaration__VariableTypeAssignment_0_0 : ( ruletype ) ;
    public final void rule__Declaration__VariableTypeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5163:1: ( ( ruletype ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5164:1: ( ruletype )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5164:1: ( ruletype )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5165:1: ruletype
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getVariableTypeTypeParserRuleCall_0_0_0()); 
            }
            pushFollow(FOLLOW_ruletype_in_rule__Declaration__VariableTypeAssignment_0_010410);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5174:1: rule__Declaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Declaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5178:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5179:1: ( RULE_ID )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5179:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5180:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_110441); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5189:1: rule__Declaration__ExprsAssignment_2_1 : ( ruleexpr ) ;
    public final void rule__Declaration__ExprsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5193:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5194:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5194:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5195:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getDeclarationAccess().getExprsExprParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Declaration__ExprsAssignment_2_110472);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5204:1: rule__Assignment__ExprsAssignment_2 : ( ruleexpr ) ;
    public final void rule__Assignment__ExprsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5208:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5209:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5209:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5210:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getExprsExprParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__Assignment__ExprsAssignment_210503);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5219:1: rule__Expr__AndExprsAssignment_1_1 : ( ruleandExpr ) ;
    public final void rule__Expr__AndExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5223:1: ( ( ruleandExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:1: ( ruleandExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5224:1: ( ruleandExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5225:1: ruleandExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExprAccess().getAndExprsAndExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleandExpr_in_rule__Expr__AndExprsAssignment_1_110534);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5234:1: rule__AndExpr__EqExprsAssignment_1_1 : ( ruleeqExpr ) ;
    public final void rule__AndExpr__EqExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5238:1: ( ( ruleeqExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5239:1: ( ruleeqExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5239:1: ( ruleeqExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5240:1: ruleeqExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getEqExprsEqExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleeqExpr_in_rule__AndExpr__EqExprsAssignment_1_110565);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5249:1: rule__EqExpr__RelExprsAssignment_1_1 : ( rulerelExpr ) ;
    public final void rule__EqExpr__RelExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5253:1: ( ( rulerelExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5254:1: ( rulerelExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5254:1: ( rulerelExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5255:1: rulerelExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getEqExprAccess().getRelExprsRelExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulerelExpr_in_rule__EqExpr__RelExprsAssignment_1_110596);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5264:1: rule__RelExpr__AddExprAssignment_1_1 : ( ruleaddExpr ) ;
    public final void rule__RelExpr__AddExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5268:1: ( ( ruleaddExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5269:1: ( ruleaddExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5269:1: ( ruleaddExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5270:1: ruleaddExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getRelExprAccess().getAddExprAddExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleaddExpr_in_rule__RelExpr__AddExprAssignment_1_110627);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5279:1: rule__AddExpr__MulExprsAssignment_1_1 : ( rulemulExpr ) ;
    public final void rule__AddExpr__MulExprsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5283:1: ( ( rulemulExpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: ( rulemulExpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5284:1: ( rulemulExpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5285:1: rulemulExpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAddExprAccess().getMulExprsMulExprParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulemulExpr_in_rule__AddExpr__MulExprsAssignment_1_110658);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5294:1: rule__MulExpr__AtomsAssignment_0 : ( ruleatom ) ;
    public final void rule__MulExpr__AtomsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5298:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5299:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5300:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_010689);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5309:1: rule__MulExpr__AtomsAssignment_1_1 : ( ruleatom ) ;
    public final void rule__MulExpr__AtomsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5313:1: ( ( ruleatom ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5314:1: ( ruleatom )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5314:1: ( ruleatom )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5315:1: ruleatom
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMulExprAccess().getAtomsAtomParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_1_110720);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5324:1: rule__Atom__ConstantsAssignment_4_1 : ( ruleconstant ) ;
    public final void rule__Atom__ConstantsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5328:1: ( ( ruleconstant ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: ( ruleconstant )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5329:1: ( ruleconstant )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5330:1: ruleconstant
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAtomAccess().getConstantsConstantParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_ruleconstant_in_rule__Atom__ConstantsAssignment_4_110751);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5339:1: rule__PostfixExpr__ExistingVariableAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixExpr__ExistingVariableAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5343:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5344:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5344:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5345:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationCrossReference_0_0_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5346:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5347:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableDeclarationIDTerminalRuleCall_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_010786); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5358:1: rule__PostfixExpr__ExistingVariableAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixExpr__ExistingVariableAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5362:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5363:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5364:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableParamCrossReference_0_1_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5365:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5366:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableParamIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_110825); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5377:1: rule__PostfixExpr__ExistingVariableAssignment_0_2 : ( ( RULE_ID ) ) ;
    public final void rule__PostfixExpr__ExistingVariableAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5381:1: ( ( ( RULE_ID ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: ( ( RULE_ID ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5382:1: ( ( RULE_ID ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5383:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableFunctionDefinitionCrossReference_0_2_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5384:1: ( RULE_ID )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5385:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExistingVariableFunctionDefinitionIDTerminalRuleCall_0_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_210864); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5396:1: rule__PostfixExpr__ExpressionsAssignment_1_1_1_0 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_1_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5400:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5401:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5401:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5402:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_1_1_010899);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5411:1: rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5415:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5416:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5417:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_110930);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5426:1: rule__PostfixExpr__ExpressionsAssignment_1_2_1 : ( ruleexpr ) ;
    public final void rule__PostfixExpr__ExpressionsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5430:1: ( ( ruleexpr ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: ( ruleexpr )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5431:1: ( ruleexpr )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5432:1: ruleexpr
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPostfixExprAccess().getExpressionsExprParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_2_110961);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5441:1: rule__Constant__FloatAssignment_2 : ( ruleFLOAT ) ;
    public final void rule__Constant__FloatAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5445:1: ( ( ruleFLOAT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:1: ( ruleFLOAT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5446:1: ( ruleFLOAT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5447:1: ruleFLOAT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getFloatFLOATParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleFLOAT_in_rule__Constant__FloatAssignment_210992);
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5456:1: rule__Constant__IntegerAssignment_3 : ( RULE_INT ) ;
    public final void rule__Constant__IntegerAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5460:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5461:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5462:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getIntegerINTTerminalRuleCall_3_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Constant__IntegerAssignment_311023); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5471:1: rule__Constant__StringAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Constant__StringAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5475:1: ( ( RULE_STRING ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: ( RULE_STRING )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5476:1: ( RULE_STRING )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5477:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getStringSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Constant__StringAssignment_411054); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5486:1: rule__Constant__NullAssignment_5 : ( ( 'null' ) ) ;
    public final void rule__Constant__NullAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5490:1: ( ( ( 'null' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: ( ( 'null' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5491:1: ( ( 'null' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5492:1: ( 'null' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNullNullKeyword_5_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5493:1: ( 'null' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5494:1: 'null'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNullNullKeyword_5_0()); 
            }
            match(input,51,FOLLOW_51_in_rule__Constant__NullAssignment_511090); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5509:1: rule__Constant__InfinityAssignment_6 : ( ( 'infty' ) ) ;
    public final void rule__Constant__InfinityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5513:1: ( ( ( 'infty' ) ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5514:1: ( ( 'infty' ) )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5514:1: ( ( 'infty' ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5515:1: ( 'infty' )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0()); 
            }
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5516:1: ( 'infty' )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5517:1: 'infty'
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getInfinityInftyKeyword_6_0()); 
            }
            match(input,52,FOLLOW_52_in_rule__Constant__InfinityAssignment_611134); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5532:1: rule__FLOAT__FLOATAssignment_0 : ( RULE_INT ) ;
    public final void rule__FLOAT__FLOATAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5536:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5537:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5537:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5538:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_0_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FLOAT__FLOATAssignment_011173); if (failed) return ;
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
    // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5547:1: rule__FLOAT__FLOATAssignment_2 : ( RULE_INT ) ;
    public final void rule__FLOAT__FLOATAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5551:1: ( ( RULE_INT ) )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( RULE_INT )
            {
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5552:1: ( RULE_INT )
            // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:5553:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getFLOATAccess().getFLOATINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__FLOAT__FLOATAssignment_211204); if (failed) return ;
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

    // $ANTLR start synpred6
    public final void synpred6_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( ( ( rule__Statement__Group_0__0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( ( rule__Statement__Group_0__0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:713:1: ( ( rule__Statement__Group_0__0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:714:1: ( rule__Statement__Group_0__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGroup_0()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:715:1: ( rule__Statement__Group_0__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:715:2: rule__Statement__Group_0__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_0__0_in_synpred61471);
        rule__Statement__Group_0__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6

    // $ANTLR start synpred8
    public final void synpred8_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:725:6: ( ( ( rule__Statement__Group_2__0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:725:6: ( ( rule__Statement__Group_2__0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:725:6: ( ( rule__Statement__Group_2__0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:726:1: ( rule__Statement__Group_2__0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getStatementAccess().getGroup_2()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:727:1: ( rule__Statement__Group_2__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:727:2: rule__Statement__Group_2__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_2__0_in_synpred81507);
        rule__Statement__Group_2__0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred23
    public final void synpred23_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:913:1: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_0 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:914:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_0 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_0()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:915:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:915:2: rule__PostfixExpr__ExistingVariableAssignment_0_0
        {
        pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_0_in_synpred231958);
        rule__PostfixExpr__ExistingVariableAssignment_0_0();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23

    // $ANTLR start synpred24
    public final void synpred24_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:6: ( ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) )
        {
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:919:6: ( ( rule__PostfixExpr__ExistingVariableAssignment_0_1 ) )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:920:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_1 )
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_1()); 
        }
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:921:1: ( rule__PostfixExpr__ExistingVariableAssignment_0_1 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:921:2: rule__PostfixExpr__ExistingVariableAssignment_0_1
        {
        pushFollow(FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_1_in_synpred241976);
        rule__PostfixExpr__ExistingVariableAssignment_0_1();
        _fsp--;
        if (failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred24

    // $ANTLR start synpred41
    public final void synpred41_fragment() throws RecognitionException {   
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:2: ( rule__Statement__Group_4_4__0 )
        // ../de.unisiegen.informatik.bs.alvis.language.algorithmLanguage.ui/src-gen/org/xtext/example/mydsl1/ui/contentassist/antlr/internal/InternalMyDsl.g:2343:2: rule__Statement__Group_4_4__0
        {
        pushFollow(FOLLOW_rule__Statement__Group_4_4__0_in_synpred414841);
        rule__Statement__Group_4_4__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred41

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
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred24() {
        backtracking++;
        int start = input.mark();
        try {
            synpred24_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_12_in_rule__Type__TypesAlternatives_01337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__TypesAlternatives_01357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__TypesAlternatives_01377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__TypesAlternatives_01397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__TypesAlternatives_01417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__TypesAlternatives_01437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives1471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_rule__Statement__Alternatives1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0_in_rule__Statement__Alternatives1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0_in_rule__Statement__Alternatives1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0_in_rule__Statement__Alternatives1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__0_in_rule__Statement__Alternatives1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__Statement__Alternatives1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EqExpr__Alternatives_1_01630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EqExpr__Alternatives_1_01650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RelExpr__Alternatives_1_01685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RelExpr__Alternatives_1_01705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RelExpr__Alternatives_1_01725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RelExpr__Alternatives_1_01745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__MulExpr__Alternatives_1_01780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__MulExpr__Alternatives_1_01800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__MulExpr__Alternatives_1_01820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__0_in_rule__Atom__Alternatives1854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0_in_rule__Atom__Alternatives1872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__0_in_rule__Atom__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Atom__Alternatives1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0_in_rule__Atom__Alternatives1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_0_in_rule__PostfixExpr__Alternatives_01958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_1_in_rule__PostfixExpr__Alternatives_01976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_2_in_rule__PostfixExpr__Alternatives_01994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_0__0_in_rule__PostfixExpr__Alternatives_12027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__0_in_rule__PostfixExpr__Alternatives_12045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__0_in_rule__PostfixExpr__Alternatives_12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__0_in_rule__Constant__Alternatives2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_1__0_in_rule__Constant__Alternatives2114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__FloatAssignment_2_in_rule__Constant__Alternatives2132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__IntegerAssignment_3_in_rule__Constant__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__StringAssignment_4_in_rule__Constant__Alternatives2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__NullAssignment_5_in_rule__Constant__Alternatives2186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__InfinityAssignment_6_in_rule__Constant__Alternatives2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__EndExpr__Alternatives2238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__EndExpr__Alternatives2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02290 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__FunctionsAssignment_0_in_rule__Model__Group__0__Impl2320 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__MainAssignment_1_in_rule__Model__Group__1__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__0__Impl_in_rule__FunctionDefinition__Group__02412 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1_in_rule__FunctionDefinition__Group__02415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__NameAssignment_0_in_rule__FunctionDefinition__Group__0__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__1__Impl_in_rule__FunctionDefinition__Group__12472 = new BitSet(new long[]{0x000000004003F000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2_in_rule__FunctionDefinition__Group__12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__FunctionDefinition__Group__1__Impl2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__2__Impl_in_rule__FunctionDefinition__Group__22534 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3_in_rule__FunctionDefinition__Group__22537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__FormalParamsAssignment_2_in_rule__FunctionDefinition__Group__2__Impl2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__3__Impl_in_rule__FunctionDefinition__Group__32595 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4_in_rule__FunctionDefinition__Group__32598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__FunctionDefinition__Group__3__Impl2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__4__Impl_in_rule__FunctionDefinition__Group__42657 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5_in_rule__FunctionDefinition__Group__42660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__0_in_rule__FunctionDefinition__Group__4__Impl2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group__5__Impl_in_rule__FunctionDefinition__Group__52718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__BlocksAssignment_5_in_rule__FunctionDefinition__Group__5__Impl2745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__0__Impl_in_rule__FunctionDefinition__Group_4__02787 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__1_in_rule__FunctionDefinition__Group_4__02790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__FunctionDefinition__Group_4__0__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__Group_4__1__Impl_in_rule__FunctionDefinition__Group_4__12849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionDefinition__ReturnTypeAssignment_4_1_in_rule__FunctionDefinition__Group_4__1__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__0__Impl_in_rule__MainFunction__Group__02910 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__1_in_rule__MainFunction__Group__02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__MainAssignment_0_in_rule__MainFunction__Group__0__Impl2940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__1__Impl_in_rule__MainFunction__Group__12970 = new BitSet(new long[]{0x000000004003F000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__2_in_rule__MainFunction__Group__12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__MainFunction__Group__1__Impl3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__2__Impl_in_rule__MainFunction__Group__23032 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__3_in_rule__MainFunction__Group__23035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__FormalParamsAssignment_2_in_rule__MainFunction__Group__2__Impl3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__3__Impl_in_rule__MainFunction__Group__33093 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__4_in_rule__MainFunction__Group__33096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__MainFunction__Group__3__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__Group__4__Impl_in_rule__MainFunction__Group__43155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MainFunction__BlocksAssignment_4_in_rule__MainFunction__Group__4__Impl3182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__0__Impl_in_rule__FormalParams__Group__03222 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__1_in_rule__FormalParams__Group__03225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__ParamsAssignment_0_in_rule__FormalParams__Group__0__Impl3252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group__1__Impl_in_rule__FormalParams__Group__13282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__0_in_rule__FormalParams__Group__1__Impl3309 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__0__Impl_in_rule__FormalParams__Group_1__03344 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__1_in_rule__FormalParams__Group_1__03347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__FormalParams__Group_1__0__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__Group_1__1__Impl_in_rule__FormalParams__Group_1__13406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormalParams__ParamsAssignment_1_1_in_rule__FormalParams__Group_1__1__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__0__Impl_in_rule__Param__Group__03467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Param__Group__1_in_rule__Param__Group__03470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Param__Group__0__Impl3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__Group__1__Impl_in_rule__Param__Group__13526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Param__NameAssignment_1_in_rule__Param__Group__1__Impl3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__0__Impl_in_rule__Block__Group__03587 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Block__Group__1_in_rule__Block__Group__03590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__1__Impl_in_rule__Block__Group__13648 = new BitSet(new long[]{0x000000AF0003F020L});
    public static final BitSet FOLLOW_rule__Block__Group__2_in_rule__Block__Group__13651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Block__Group__1__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__Group__2__Impl_in_rule__Block__Group__23710 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Block__Group__3_in_rule__Block__Group__23713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Block__StatementsAssignment_2_in_rule__Block__Group__2__Impl3740 = new BitSet(new long[]{0x000000AD0003F022L});
    public static final BitSet FOLLOW_rule__Block__Group__3__Impl_in_rule__Block__Group__33771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Block__Group__3__Impl3799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__03838 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__03841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__13899 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__2_in_rule__Statement__Group_0__13902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__PostFixExpressionAssignment_0_1_in_rule__Statement__Group_0__1__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__2__Impl_in_rule__Statement__Group_0__23959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_0__2__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__04021 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__04024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruledeclaration_in_rule__Statement__Group_1__0__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__14080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_1__1__Impl4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0__Impl_in_rule__Statement__Group_2__04140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1_in_rule__Statement__Group_2__04143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__1__Impl_in_rule__Statement__Group_2__14201 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2_in_rule__Statement__Group_2__14204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__AssignmentsAssignment_2_1_in_rule__Statement__Group_2__1__Impl4231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__2__Impl_in_rule__Statement__Group_2__24261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_2__2__Impl4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__0__Impl_in_rule__Statement__Group_3__04323 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1_in_rule__Statement__Group_3__04326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__1__Impl_in_rule__Statement__Group_3__14384 = new BitSet(new long[]{0x001B1000380000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2_in_rule__Statement__Group_3__14387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Statement__Group_3__1__Impl4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__2__Impl_in_rule__Statement__Group_3__24446 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__3_in_rule__Statement__Group_3__24449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExprsAssignment_3_2_in_rule__Statement__Group_3__2__Impl4476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_3__3__Impl_in_rule__Statement__Group_3__34507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleendExpr_in_rule__Statement__Group_3__3__Impl4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__0__Impl_in_rule__Statement__Group_4__04571 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1_in_rule__Statement__Group_4__04574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Statement__Group_4__0__Impl4602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__1__Impl_in_rule__Statement__Group_4__14633 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2_in_rule__Statement__Group_4__14636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__Group_4__1__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__2__Impl_in_rule__Statement__Group_4__24692 = new BitSet(new long[]{0x000000AD0003F020L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3_in_rule__Statement__Group_4__24695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_4__2__Impl4723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__3__Impl_in_rule__Statement__Group_4__34754 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__4_in_rule__Statement__Group_4__34757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_4_3_in_rule__Statement__Group_4__3__Impl4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4__4__Impl_in_rule__Statement__Group_4__44814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__0_in_rule__Statement__Group_4__4__Impl4841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__0__Impl_in_rule__Statement__Group_4_4__04882 = new BitSet(new long[]{0x000000AD0003F020L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__1_in_rule__Statement__Group_4_4__04885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Statement__Group_4_4__0__Impl4913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__1__Impl_in_rule__Statement__Group_4_4__14944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_4_4_1_in_rule__Statement__Group_4_4__1__Impl4971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__0__Impl_in_rule__Statement__Group_5__05005 = new BitSet(new long[]{0x000000000003F000L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1_in_rule__Statement__Group_5__05008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Statement__Group_5__0__Impl5036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__1__Impl_in_rule__Statement__Group_5__15067 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__2_in_rule__Statement__Group_5__15070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__Statement__Group_5__1__Impl5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__2__Impl_in_rule__Statement__Group_5__25126 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__3_in_rule__Statement__Group_5__25129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Statement__Group_5__2__Impl5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__3__Impl_in_rule__Statement__Group_5__35188 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__4_in_rule__Statement__Group_5__35191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__ExprsAssignment_5_3_in_rule__Statement__Group_5__3__Impl5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__4__Impl_in_rule__Statement__Group_5__45248 = new BitSet(new long[]{0x000000AD0003F020L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__5_in_rule__Statement__Group_5__45251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_5__4__Impl5279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_5__5__Impl_in_rule__Statement__Group_5__55310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_5_5_in_rule__Statement__Group_5__5__Impl5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__0__Impl_in_rule__Statement__Group_6__05379 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__1_in_rule__Statement__Group_6__05382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Statement__Group_6__0__Impl5410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__1__Impl_in_rule__Statement__Group_6__15441 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__2_in_rule__Statement__Group_6__15444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__Group_6__1__Impl5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__2__Impl_in_rule__Statement__Group_6__25500 = new BitSet(new long[]{0x000000AD0003F020L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__3_in_rule__Statement__Group_6__25503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Statement__Group_6__2__Impl5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_6__3__Impl_in_rule__Statement__Group_6__35562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__StatementsAssignment_6_3_in_rule__Statement__Group_6__3__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__0__Impl_in_rule__Declaration__Group__05627 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1_in_rule__Declaration__Group__05630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl5659 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0_in_rule__Declaration__Group__0__Impl5671 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__1__Impl_in_rule__Declaration__Group__15704 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2_in_rule__Declaration__Group__15707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__NameAssignment_1_in_rule__Declaration__Group__1__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group__2__Impl_in_rule__Declaration__Group__25764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0_in_rule__Declaration__Group__2__Impl5791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__0__Impl_in_rule__Declaration__Group_0__05828 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1_in_rule__Declaration__Group_0__05831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__VariableTypeAssignment_0_0_in_rule__Declaration__Group_0__0__Impl5858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_0__1__Impl_in_rule__Declaration__Group_0__15888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Declaration__Group_0__1__Impl5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__0__Impl_in_rule__Declaration__Group_2__05954 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1_in_rule__Declaration__Group_2__05957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Declaration__Group_2__0__Impl5985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Group_2__1__Impl_in_rule__Declaration__Group_2__16016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__ExprsAssignment_2_1_in_rule__Declaration__Group_2__1__Impl6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__06077 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__06080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Assignment__Group__0__Impl6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__16136 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__16139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Assignment__Group__1__Impl6167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__26198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ExprsAssignment_2_in_rule__Assignment__Group__2__Impl6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__0__Impl_in_rule__Expr__Group__06261 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1_in_rule__Expr__Group__06264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_rule__Expr__Group__0__Impl6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group__1__Impl_in_rule__Expr__Group__16320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0_in_rule__Expr__Group__1__Impl6347 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__0__Impl_in_rule__Expr__Group_1__06382 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1_in_rule__Expr__Group_1__06385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Expr__Group_1__0__Impl6413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__Group_1__1__Impl_in_rule__Expr__Group_1__16444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expr__AndExprsAssignment_1_1_in_rule__Expr__Group_1__1__Impl6471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__0__Impl_in_rule__AndExpr__Group__06505 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1_in_rule__AndExpr__Group__06508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_rule__AndExpr__Group__0__Impl6535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group__1__Impl_in_rule__AndExpr__Group__16564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0_in_rule__AndExpr__Group__1__Impl6591 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__0__Impl_in_rule__AndExpr__Group_1__06626 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1_in_rule__AndExpr__Group_1__06629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__AndExpr__Group_1__0__Impl6657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__Group_1__1__Impl_in_rule__AndExpr__Group_1__16688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExpr__EqExprsAssignment_1_1_in_rule__AndExpr__Group_1__1__Impl6715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__0__Impl_in_rule__EqExpr__Group__06749 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__1_in_rule__EqExpr__Group__06752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_rule__EqExpr__Group__0__Impl6779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group__1__Impl_in_rule__EqExpr__Group__16808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__0_in_rule__EqExpr__Group__1__Impl6835 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__0__Impl_in_rule__EqExpr__Group_1__06870 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__1_in_rule__EqExpr__Group_1__06873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Alternatives_1_0_in_rule__EqExpr__Group_1__0__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__Group_1__1__Impl_in_rule__EqExpr__Group_1__16930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EqExpr__RelExprsAssignment_1_1_in_rule__EqExpr__Group_1__1__Impl6957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__0__Impl_in_rule__RelExpr__Group__06991 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__1_in_rule__RelExpr__Group__06994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rule__RelExpr__Group__0__Impl7021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group__1__Impl_in_rule__RelExpr__Group__17050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__0_in_rule__RelExpr__Group__1__Impl7077 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__0__Impl_in_rule__RelExpr__Group_1__07112 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__1_in_rule__RelExpr__Group_1__07115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Alternatives_1_0_in_rule__RelExpr__Group_1__0__Impl7142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__Group_1__1__Impl_in_rule__RelExpr__Group_1__17172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelExpr__AddExprAssignment_1_1_in_rule__RelExpr__Group_1__1__Impl7199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__0__Impl_in_rule__AddExpr__Group__07233 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__1_in_rule__AddExpr__Group__07236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_rule__AddExpr__Group__0__Impl7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group__1__Impl_in_rule__AddExpr__Group__17292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__0_in_rule__AddExpr__Group__1__Impl7319 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__0__Impl_in_rule__AddExpr__Group_1__07354 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__1_in_rule__AddExpr__Group_1__07357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGN_in_rule__AddExpr__Group_1__0__Impl7384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__Group_1__1__Impl_in_rule__AddExpr__Group_1__17413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AddExpr__MulExprsAssignment_1_1_in_rule__AddExpr__Group_1__1__Impl7440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__0__Impl_in_rule__MulExpr__Group__07474 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__1_in_rule__MulExpr__Group__07477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__AtomsAssignment_0_in_rule__MulExpr__Group__0__Impl7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group__1__Impl_in_rule__MulExpr__Group__17534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__0_in_rule__MulExpr__Group__1__Impl7561 = new BitSet(new long[]{0x0000000007000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__0__Impl_in_rule__MulExpr__Group_1__07596 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__1_in_rule__MulExpr__Group_1__07599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Alternatives_1_0_in_rule__MulExpr__Group_1__0__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__Group_1__1__Impl_in_rule__MulExpr__Group_1__17656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MulExpr__AtomsAssignment_1_1_in_rule__MulExpr__Group_1__1__Impl7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__0__Impl_in_rule__Atom__Group_0__07717 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__1_in_rule__Atom__Group_0__07720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Atom__Group_0__0__Impl7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_0__1__Impl_in_rule__Atom__Group_0__17779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__Atom__Group_0__1__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__0__Impl_in_rule__Atom__Group_1__07839 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1_in_rule__Atom__Group_1__07842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atom__Group_1__0__Impl7870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__1__Impl_in_rule__Atom__Group_1__17901 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2_in_rule__Atom__Group_1__17904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SIGN_in_rule__Atom__Group_1__1__Impl7931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__2__Impl_in_rule__Atom__Group_1__27960 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__3_in_rule__Atom__Group_1__27963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Atom__Group_1__2__Impl7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_1__3__Impl_in_rule__Atom__Group_1__38019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Atom__Group_1__3__Impl8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__0__Impl_in_rule__Atom__Group_2__08086 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__1_in_rule__Atom__Group_2__08089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Atom__Group_2__0__Impl8117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__1__Impl_in_rule__Atom__Group_2__18148 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__2_in_rule__Atom__Group_2__18151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Atom__Group_2__1__Impl8178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_2__2__Impl_in_rule__Atom__Group_2__28207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Atom__Group_2__2__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__0__Impl_in_rule__Atom__Group_4__08272 = new BitSet(new long[]{0x001B0000000000C0L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1_in_rule__Atom__Group_4__08275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__Group_4__1__Impl_in_rule__Atom__Group_4__18333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Atom__ConstantsAssignment_4_1_in_rule__Atom__Group_4__1__Impl8360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__0__Impl_in_rule__PostfixExpr__Group__08394 = new BitSet(new long[]{0x0000600020000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__1_in_rule__PostfixExpr__Group__08397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Alternatives_0_in_rule__PostfixExpr__Group__0__Impl8424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group__1__Impl_in_rule__PostfixExpr__Group__18454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Alternatives_1_in_rule__PostfixExpr__Group__1__Impl8481 = new BitSet(new long[]{0x0000600020000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_0__0__Impl_in_rule__PostfixExpr__Group_1_0__08516 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_0__1_in_rule__PostfixExpr__Group_1_0__08519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__PostfixExpr__Group_1_0__0__Impl8547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_0__1__Impl_in_rule__PostfixExpr__Group_1_0__18578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__Group_1_0__1__Impl8605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1__08638 = new BitSet(new long[]{0x001B1000600000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__1_in_rule__PostfixExpr__Group_1_1__08641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PostfixExpr__Group_1_1__0__Impl8669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1__18700 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__2_in_rule__PostfixExpr__Group_1_1__18703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1__0_in_rule__PostfixExpr__Group_1_1__1__Impl8730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1__2__Impl_in_rule__PostfixExpr__Group_1_1__28761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PostfixExpr__Group_1_1__2__Impl8789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1_1__08826 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1__1_in_rule__PostfixExpr__Group_1_1_1__08829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_1_1_0_in_rule__PostfixExpr__Group_1_1_1__0__Impl8856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1_1__18886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1_1__0_in_rule__PostfixExpr__Group_1_1_1__1__Impl8913 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1_1__0__Impl_in_rule__PostfixExpr__Group_1_1_1_1__08948 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1_1__1_in_rule__PostfixExpr__Group_1_1_1_1__08951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__PostfixExpr__Group_1_1_1_1__0__Impl8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_1_1_1__1__Impl_in_rule__PostfixExpr__Group_1_1_1_1__19010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1_in_rule__PostfixExpr__Group_1_1_1_1__1__Impl9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__0__Impl_in_rule__PostfixExpr__Group_1_2__09071 = new BitSet(new long[]{0x001B1000200000E0L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__1_in_rule__PostfixExpr__Group_1_2__09074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__PostfixExpr__Group_1_2__0__Impl9102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__1__Impl_in_rule__PostfixExpr__Group_1_2__19133 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__2_in_rule__PostfixExpr__Group_1_2__19136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExpressionsAssignment_1_2_1_in_rule__PostfixExpr__Group_1_2__1__Impl9163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__Group_1_2__2__Impl_in_rule__PostfixExpr__Group_1_2__29193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__PostfixExpr__Group_1_2__2__Impl9221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__0__Impl_in_rule__Constant__Group_0__09258 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__1_in_rule__Constant__Group_0__09261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_0__1__Impl_in_rule__Constant__Group_0__19319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Constant__Group_0__1__Impl9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_1__0__Impl_in_rule__Constant__Group_1__09382 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Constant__Group_1__1_in_rule__Constant__Group_1__09385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Constant__Group_1__1__Impl_in_rule__Constant__Group_1__19443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Constant__Group_1__1__Impl9471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__0__Impl_in_rule__FLOAT__Group__09506 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__1_in_rule__FLOAT__Group__09509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__FLOATAssignment_0_in_rule__FLOAT__Group__0__Impl9536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__1__Impl_in_rule__FLOAT__Group__19566 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__2_in_rule__FLOAT__Group__19569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__FLOAT__Group__1__Impl9597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__Group__2__Impl_in_rule__FLOAT__Group__29628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FLOAT__FLOATAssignment_2_in_rule__FLOAT__Group__2__Impl9657 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rule__FLOAT__FLOATAssignment_2_in_rule__FLOAT__Group__2__Impl9669 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_rulefunctionDefinition_in_rule__Model__FunctionsAssignment_09713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemainFunction_in_rule__Model__MainAssignment_19744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionDefinition__NameAssignment_09775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_rule__FunctionDefinition__FormalParamsAssignment_29806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__FunctionDefinition__ReturnTypeAssignment_4_19837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__FunctionDefinition__BlocksAssignment_59868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__MainFunction__MainAssignment_09904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleformalParams_in_rule__MainFunction__FormalParamsAssignment_29943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleblock_in_rule__MainFunction__BlocksAssignment_49974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_010005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleparam_in_rule__FormalParams__ParamsAssignment_1_110036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Param__NameAssignment_110067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Block__StatementsAssignment_210098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__TypesAlternatives_0_in_rule__Type__TypesAssignment10129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulepostfixExpr_in_rule__Statement__PostFixExpressionAssignment_0_110162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleassignment_in_rule__Statement__AssignmentsAssignment_2_110193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_3_210224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_4_310255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_4_4_110286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Statement__ExprsAssignment_5_310317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_5_510348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulestatement_in_rule__Statement__StatementsAssignment_6_310379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruletype_in_rule__Declaration__VariableTypeAssignment_0_010410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Declaration__NameAssignment_110441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Declaration__ExprsAssignment_2_110472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__Assignment__ExprsAssignment_210503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleandExpr_in_rule__Expr__AndExprsAssignment_1_110534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleeqExpr_in_rule__AndExpr__EqExprsAssignment_1_110565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulerelExpr_in_rule__EqExpr__RelExprsAssignment_1_110596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleaddExpr_in_rule__RelExpr__AddExprAssignment_1_110627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulemulExpr_in_rule__AddExpr__MulExprsAssignment_1_110658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_010689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleatom_in_rule__MulExpr__AtomsAssignment_1_110720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleconstant_in_rule__Atom__ConstantsAssignment_4_110751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_010786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_110825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PostfixExpr__ExistingVariableAssignment_0_210864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_1_1_010899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_110930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleexpr_in_rule__PostfixExpr__ExpressionsAssignment_1_2_110961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFLOAT_in_rule__Constant__FloatAssignment_210992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Constant__IntegerAssignment_311023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Constant__StringAssignment_411054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Constant__NullAssignment_511090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Constant__InfinityAssignment_611134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FLOAT__FLOATAssignment_011173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__FLOAT__FLOATAssignment_211204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_synpred61471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_2__0_in_synpred81507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_0_in_synpred231958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PostfixExpr__ExistingVariableAssignment_0_1_in_synpred241976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_4_4__0_in_synpred414841 = new BitSet(new long[]{0x0000000000000002L});

}