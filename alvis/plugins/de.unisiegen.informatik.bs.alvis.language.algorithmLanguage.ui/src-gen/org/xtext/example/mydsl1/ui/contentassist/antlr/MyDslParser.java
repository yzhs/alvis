/*
* generated by Xtext
*/
package org.xtext.example.mydsl1.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getTypeAccess().getTypesAlternatives_0(), "rule__Type__TypesAlternatives_0");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getEqExprAccess().getAlternatives_1_0(), "rule__EqExpr__Alternatives_1_0");
					put(grammarAccess.getRelExprAccess().getAlternatives_1_0(), "rule__RelExpr__Alternatives_1_0");
					put(grammarAccess.getMulExprAccess().getAlternatives_1_0(), "rule__MulExpr__Alternatives_1_0");
					put(grammarAccess.getAtomAccess().getAlternatives(), "rule__Atom__Alternatives");
					put(grammarAccess.getPostfixExprAccess().getAlternatives_0(), "rule__PostfixExpr__Alternatives_0");
					put(grammarAccess.getPostfixExprAccess().getAlternatives_1(), "rule__PostfixExpr__Alternatives_1");
					put(grammarAccess.getConstantAccess().getAlternatives(), "rule__Constant__Alternatives");
					put(grammarAccess.getEndExprAccess().getAlternatives(), "rule__EndExpr__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
					put(grammarAccess.getFunctionDefinitionAccess().getGroup_4(), "rule__FunctionDefinition__Group_4__0");
					put(grammarAccess.getMainFunctionAccess().getGroup(), "rule__MainFunction__Group__0");
					put(grammarAccess.getFormalParamsAccess().getGroup(), "rule__FormalParams__Group__0");
					put(grammarAccess.getFormalParamsAccess().getGroup_1(), "rule__FormalParams__Group_1__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getStatementAccess().getGroup_0(), "rule__Statement__Group_0__0");
					put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
					put(grammarAccess.getStatementAccess().getGroup_2(), "rule__Statement__Group_2__0");
					put(grammarAccess.getStatementAccess().getGroup_3(), "rule__Statement__Group_3__0");
					put(grammarAccess.getStatementAccess().getGroup_4(), "rule__Statement__Group_4__0");
					put(grammarAccess.getStatementAccess().getGroup_4_4(), "rule__Statement__Group_4_4__0");
					put(grammarAccess.getStatementAccess().getGroup_5(), "rule__Statement__Group_5__0");
					put(grammarAccess.getStatementAccess().getGroup_6(), "rule__Statement__Group_6__0");
					put(grammarAccess.getDeclarationAccess().getGroup(), "rule__Declaration__Group__0");
					put(grammarAccess.getDeclarationAccess().getGroup_0(), "rule__Declaration__Group_0__0");
					put(grammarAccess.getDeclarationAccess().getGroup_2(), "rule__Declaration__Group_2__0");
					put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
					put(grammarAccess.getExprAccess().getGroup(), "rule__Expr__Group__0");
					put(grammarAccess.getExprAccess().getGroup_1(), "rule__Expr__Group_1__0");
					put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
					put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
					put(grammarAccess.getEqExprAccess().getGroup(), "rule__EqExpr__Group__0");
					put(grammarAccess.getEqExprAccess().getGroup_1(), "rule__EqExpr__Group_1__0");
					put(grammarAccess.getRelExprAccess().getGroup(), "rule__RelExpr__Group__0");
					put(grammarAccess.getRelExprAccess().getGroup_1(), "rule__RelExpr__Group_1__0");
					put(grammarAccess.getAddExprAccess().getGroup(), "rule__AddExpr__Group__0");
					put(grammarAccess.getAddExprAccess().getGroup_1(), "rule__AddExpr__Group_1__0");
					put(grammarAccess.getMulExprAccess().getGroup(), "rule__MulExpr__Group__0");
					put(grammarAccess.getMulExprAccess().getGroup_1(), "rule__MulExpr__Group_1__0");
					put(grammarAccess.getAtomAccess().getGroup_0(), "rule__Atom__Group_0__0");
					put(grammarAccess.getAtomAccess().getGroup_1(), "rule__Atom__Group_1__0");
					put(grammarAccess.getAtomAccess().getGroup_2(), "rule__Atom__Group_2__0");
					put(grammarAccess.getAtomAccess().getGroup_4(), "rule__Atom__Group_4__0");
					put(grammarAccess.getPostfixExprAccess().getGroup(), "rule__PostfixExpr__Group__0");
					put(grammarAccess.getPostfixExprAccess().getGroup_1_0(), "rule__PostfixExpr__Group_1_0__0");
					put(grammarAccess.getPostfixExprAccess().getGroup_1_1(), "rule__PostfixExpr__Group_1_1__0");
					put(grammarAccess.getPostfixExprAccess().getGroup_1_1_1(), "rule__PostfixExpr__Group_1_1_1__0");
					put(grammarAccess.getPostfixExprAccess().getGroup_1_1_1_1(), "rule__PostfixExpr__Group_1_1_1_1__0");
					put(grammarAccess.getPostfixExprAccess().getGroup_1_2(), "rule__PostfixExpr__Group_1_2__0");
					put(grammarAccess.getConstantAccess().getGroup_0(), "rule__Constant__Group_0__0");
					put(grammarAccess.getConstantAccess().getGroup_1(), "rule__Constant__Group_1__0");
					put(grammarAccess.getFLOATAccess().getGroup(), "rule__FLOAT__Group__0");
					put(grammarAccess.getModelAccess().getFunctionsAssignment_0(), "rule__Model__FunctionsAssignment_0");
					put(grammarAccess.getModelAccess().getMainAssignment_1(), "rule__Model__MainAssignment_1");
					put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_0(), "rule__FunctionDefinition__NameAssignment_0");
					put(grammarAccess.getFunctionDefinitionAccess().getFormalParamsAssignment_2(), "rule__FunctionDefinition__FormalParamsAssignment_2");
					put(grammarAccess.getFunctionDefinitionAccess().getReturnTypeAssignment_4_1(), "rule__FunctionDefinition__ReturnTypeAssignment_4_1");
					put(grammarAccess.getFunctionDefinitionAccess().getBlocksAssignment_5(), "rule__FunctionDefinition__BlocksAssignment_5");
					put(grammarAccess.getMainFunctionAccess().getMainAssignment_0(), "rule__MainFunction__MainAssignment_0");
					put(grammarAccess.getMainFunctionAccess().getFormalParamsAssignment_2(), "rule__MainFunction__FormalParamsAssignment_2");
					put(grammarAccess.getMainFunctionAccess().getBlocksAssignment_4(), "rule__MainFunction__BlocksAssignment_4");
					put(grammarAccess.getFormalParamsAccess().getParamsAssignment_0(), "rule__FormalParams__ParamsAssignment_0");
					put(grammarAccess.getFormalParamsAccess().getParamsAssignment_1_1(), "rule__FormalParams__ParamsAssignment_1_1");
					put(grammarAccess.getParamAccess().getNameAssignment_1(), "rule__Param__NameAssignment_1");
					put(grammarAccess.getBlockAccess().getStatementsAssignment_2(), "rule__Block__StatementsAssignment_2");
					put(grammarAccess.getTypeAccess().getTypesAssignment(), "rule__Type__TypesAssignment");
					put(grammarAccess.getStatementAccess().getPostFixExpressionAssignment_0_1(), "rule__Statement__PostFixExpressionAssignment_0_1");
					put(grammarAccess.getStatementAccess().getAssignmentsAssignment_2_1(), "rule__Statement__AssignmentsAssignment_2_1");
					put(grammarAccess.getStatementAccess().getExprsAssignment_3_2(), "rule__Statement__ExprsAssignment_3_2");
					put(grammarAccess.getStatementAccess().getStatementsAssignment_4_3(), "rule__Statement__StatementsAssignment_4_3");
					put(grammarAccess.getStatementAccess().getStatementsAssignment_4_4_1(), "rule__Statement__StatementsAssignment_4_4_1");
					put(grammarAccess.getStatementAccess().getExprsAssignment_5_3(), "rule__Statement__ExprsAssignment_5_3");
					put(grammarAccess.getStatementAccess().getStatementsAssignment_5_5(), "rule__Statement__StatementsAssignment_5_5");
					put(grammarAccess.getStatementAccess().getStatementsAssignment_6_3(), "rule__Statement__StatementsAssignment_6_3");
					put(grammarAccess.getDeclarationAccess().getVariableTypeAssignment_0_0(), "rule__Declaration__VariableTypeAssignment_0_0");
					put(grammarAccess.getDeclarationAccess().getNameAssignment_1(), "rule__Declaration__NameAssignment_1");
					put(grammarAccess.getDeclarationAccess().getExprsAssignment_2_1(), "rule__Declaration__ExprsAssignment_2_1");
					put(grammarAccess.getAssignmentAccess().getExprsAssignment_2(), "rule__Assignment__ExprsAssignment_2");
					put(grammarAccess.getExprAccess().getAndExprsAssignment_1_1(), "rule__Expr__AndExprsAssignment_1_1");
					put(grammarAccess.getAndExprAccess().getEqExprsAssignment_1_1(), "rule__AndExpr__EqExprsAssignment_1_1");
					put(grammarAccess.getEqExprAccess().getRelExprsAssignment_1_1(), "rule__EqExpr__RelExprsAssignment_1_1");
					put(grammarAccess.getRelExprAccess().getAddExprAssignment_1_1(), "rule__RelExpr__AddExprAssignment_1_1");
					put(grammarAccess.getAddExprAccess().getMulExprsAssignment_1_1(), "rule__AddExpr__MulExprsAssignment_1_1");
					put(grammarAccess.getMulExprAccess().getAtomsAssignment_0(), "rule__MulExpr__AtomsAssignment_0");
					put(grammarAccess.getMulExprAccess().getAtomsAssignment_1_1(), "rule__MulExpr__AtomsAssignment_1_1");
					put(grammarAccess.getAtomAccess().getConstantsAssignment_4_1(), "rule__Atom__ConstantsAssignment_4_1");
					put(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_0(), "rule__PostfixExpr__ExistingVariableAssignment_0_0");
					put(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_1(), "rule__PostfixExpr__ExistingVariableAssignment_0_1");
					put(grammarAccess.getPostfixExprAccess().getExistingVariableAssignment_0_2(), "rule__PostfixExpr__ExistingVariableAssignment_0_2");
					put(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_1_1_0(), "rule__PostfixExpr__ExpressionsAssignment_1_1_1_0");
					put(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_1_1_1_1(), "rule__PostfixExpr__ExpressionsAssignment_1_1_1_1_1");
					put(grammarAccess.getPostfixExprAccess().getExpressionsAssignment_1_2_1(), "rule__PostfixExpr__ExpressionsAssignment_1_2_1");
					put(grammarAccess.getConstantAccess().getFloatAssignment_2(), "rule__Constant__FloatAssignment_2");
					put(grammarAccess.getConstantAccess().getIntegerAssignment_3(), "rule__Constant__IntegerAssignment_3");
					put(grammarAccess.getConstantAccess().getStringAssignment_4(), "rule__Constant__StringAssignment_4");
					put(grammarAccess.getConstantAccess().getNullAssignment_5(), "rule__Constant__NullAssignment_5");
					put(grammarAccess.getConstantAccess().getInfinityAssignment_6(), "rule__Constant__InfinityAssignment_6");
					put(grammarAccess.getFLOATAccess().getFLOATAssignment_0(), "rule__FLOAT__FLOATAssignment_0");
					put(grammarAccess.getFLOATAccess().getFLOATAssignment_2(), "rule__FLOAT__FLOATAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
