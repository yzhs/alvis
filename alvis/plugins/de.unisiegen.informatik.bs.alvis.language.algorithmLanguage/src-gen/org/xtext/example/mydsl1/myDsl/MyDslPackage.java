/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl1.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "de.unisiegen.informatik.bs.alvis.language.algorithmLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUNCTIONS = 0;

  /**
   * The feature id for the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MAIN = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.functionDefinitionImpl <em>function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.functionDefinitionImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getfunctionDefinition()
   * @generated
   */
  int FUNCTION_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Formal Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__FORMAL_PARAMS = 1;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__RETURN_TYPE = 2;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__BLOCKS = 3;

  /**
   * The number of structural features of the '<em>function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.mainFunctionImpl <em>main Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.mainFunctionImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getmainFunction()
   * @generated
   */
  int MAIN_FUNCTION = 2;

  /**
   * The feature id for the '<em><b>Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION__MAIN = 0;

  /**
   * The feature id for the '<em><b>Formal Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION__FORMAL_PARAMS = 1;

  /**
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION__BLOCKS = 2;

  /**
   * The number of structural features of the '<em>main Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.formalParamsImpl <em>formal Params</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.formalParamsImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getformalParams()
   * @generated
   */
  int FORMAL_PARAMS = 3;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMS__PARAMS = 0;

  /**
   * The number of structural features of the '<em>formal Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.statementImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__POST_FIX_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__ASSIGNMENTS = 1;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRS = 2;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.paramImpl <em>param</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.paramImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getparam()
   * @generated
   */
  int PARAM = 4;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__POST_FIX_EXPRESSION = STATEMENT__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__ASSIGNMENTS = STATEMENT__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__EXPRS = STATEMENT__EXPRS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.blockImpl <em>block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.blockImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getblock()
   * @generated
   */
  int BLOCK = 5;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__POST_FIX_EXPRESSION = STATEMENT__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__ASSIGNMENTS = STATEMENT__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__EXPRS = STATEMENT__EXPRS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.typeImpl <em>type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.typeImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#gettype()
   * @generated
   */
  int TYPE = 6;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__POST_FIX_EXPRESSION = PARAM__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ASSIGNMENTS = PARAM__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EXPRS = PARAM__EXPRS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__STATEMENTS = PARAM__STATEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = PARAM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPES = PARAM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = PARAM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.functionCallImpl <em>function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.functionCallImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getfunctionCall()
   * @generated
   */
  int FUNCTION_CALL = 8;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__POST_FIX_EXPRESSION = STATEMENT__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__ASSIGNMENTS = STATEMENT__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__EXPRS = STATEMENT__EXPRS;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL__FUNCTION = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.declarationImpl <em>declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.declarationImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getdeclaration()
   * @generated
   */
  int DECLARATION = 9;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__POST_FIX_EXPRESSION = STATEMENT__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__ASSIGNMENTS = STATEMENT__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__EXPRS = STATEMENT__EXPRS;

  /**
   * The feature id for the '<em><b>Variable Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__VARIABLE_TYPE = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.assignmentImpl <em>assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.assignmentImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getassignment()
   * @generated
   */
  int ASSIGNMENT = 10;

  /**
   * The number of structural features of the '<em>assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSIGNMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.exprImpl <em>expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.exprImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getexpr()
   * @generated
   */
  int EXPR = 11;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__POST_FIX_EXPRESSION = STATEMENT__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__ASSIGNMENTS = STATEMENT__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__EXPRS = STATEMENT__EXPRS;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__CONSTANTS = STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.andExprImpl <em>and Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.andExprImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getandExpr()
   * @generated
   */
  int AND_EXPR = 12;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__POST_FIX_EXPRESSION = EXPR__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__ASSIGNMENTS = EXPR__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__EXPRS = EXPR__EXPRS;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__CONSTANTS = EXPR__CONSTANTS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__STATEMENTS = EXPR__STATEMENTS;

  /**
   * The feature id for the '<em><b>And Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__AND_EXPRS = EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>and Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.eqExprImpl <em>eq Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.eqExprImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#geteqExpr()
   * @generated
   */
  int EQ_EXPR = 13;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__POST_FIX_EXPRESSION = AND_EXPR__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__ASSIGNMENTS = AND_EXPR__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__EXPRS = AND_EXPR__EXPRS;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__CONSTANTS = AND_EXPR__CONSTANTS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__STATEMENTS = AND_EXPR__STATEMENTS;

  /**
   * The feature id for the '<em><b>And Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__AND_EXPRS = AND_EXPR__AND_EXPRS;

  /**
   * The feature id for the '<em><b>Eq Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR__EQ_EXPRS = AND_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>eq Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQ_EXPR_FEATURE_COUNT = AND_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.relExprImpl <em>rel Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.relExprImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getrelExpr()
   * @generated
   */
  int REL_EXPR = 14;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR__POST_FIX_EXPRESSION = EQ_EXPR__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR__ASSIGNMENTS = EQ_EXPR__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR__EXPRS = EQ_EXPR__EXPRS;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR__CONSTANTS = EQ_EXPR__CONSTANTS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR__STATEMENTS = EQ_EXPR__STATEMENTS;

  /**
   * The feature id for the '<em><b>And Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR__AND_EXPRS = EQ_EXPR__AND_EXPRS;

  /**
   * The feature id for the '<em><b>Eq Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR__EQ_EXPRS = EQ_EXPR__EQ_EXPRS;

  /**
   * The feature id for the '<em><b>Rel Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR__REL_EXPRS = EQ_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>rel Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REL_EXPR_FEATURE_COUNT = EQ_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.addExprImpl <em>add Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.addExprImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getaddExpr()
   * @generated
   */
  int ADD_EXPR = 15;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__POST_FIX_EXPRESSION = REL_EXPR__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__ASSIGNMENTS = REL_EXPR__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__EXPRS = REL_EXPR__EXPRS;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__CONSTANTS = REL_EXPR__CONSTANTS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__STATEMENTS = REL_EXPR__STATEMENTS;

  /**
   * The feature id for the '<em><b>And Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__AND_EXPRS = REL_EXPR__AND_EXPRS;

  /**
   * The feature id for the '<em><b>Eq Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__EQ_EXPRS = REL_EXPR__EQ_EXPRS;

  /**
   * The feature id for the '<em><b>Rel Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__REL_EXPRS = REL_EXPR__REL_EXPRS;

  /**
   * The feature id for the '<em><b>Add Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR__ADD_EXPR = REL_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>add Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADD_EXPR_FEATURE_COUNT = REL_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.mulExprImpl <em>mul Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.mulExprImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getmulExpr()
   * @generated
   */
  int MUL_EXPR = 16;

  /**
   * The feature id for the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__POST_FIX_EXPRESSION = ADD_EXPR__POST_FIX_EXPRESSION;

  /**
   * The feature id for the '<em><b>Assignments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__ASSIGNMENTS = ADD_EXPR__ASSIGNMENTS;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__EXPRS = ADD_EXPR__EXPRS;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__CONSTANTS = ADD_EXPR__CONSTANTS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__STATEMENTS = ADD_EXPR__STATEMENTS;

  /**
   * The feature id for the '<em><b>And Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__AND_EXPRS = ADD_EXPR__AND_EXPRS;

  /**
   * The feature id for the '<em><b>Eq Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__EQ_EXPRS = ADD_EXPR__EQ_EXPRS;

  /**
   * The feature id for the '<em><b>Rel Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__REL_EXPRS = ADD_EXPR__REL_EXPRS;

  /**
   * The feature id for the '<em><b>Add Expr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__ADD_EXPR = ADD_EXPR__ADD_EXPR;

  /**
   * The feature id for the '<em><b>Mul Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__MUL_EXPRS = ADD_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR__ATOMS = ADD_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>mul Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_EXPR_FEATURE_COUNT = ADD_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.atomImpl <em>atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.atomImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getatom()
   * @generated
   */
  int ATOM = 17;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM__CONSTANTS = 0;

  /**
   * The number of structural features of the '<em>atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.postfixExprImpl <em>postfix Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.postfixExprImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getpostfixExpr()
   * @generated
   */
  int POSTFIX_EXPR = 18;

  /**
   * The feature id for the '<em><b>Constants</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPR__CONSTANTS = ASSIGNMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exprs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPR__EXPRS = ASSIGNMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Existing Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPR__EXISTING_VARIABLE = ASSIGNMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPR__EXPRESSIONS = ASSIGNMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>postfix Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POSTFIX_EXPR_FEATURE_COUNT = ASSIGNMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.constantImpl <em>constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.constantImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getconstant()
   * @generated
   */
  int CONSTANT = 19;

  /**
   * The feature id for the '<em><b>Real</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__REAL = 0;

  /**
   * The feature id for the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__INTEGER = 1;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__STRING = 2;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__NULL = 3;

  /**
   * The feature id for the '<em><b>Infinity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT__INFINITY = 4;

  /**
   * The number of structural features of the '<em>constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.realImpl <em>real</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.realImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getreal()
   * @generated
   */
  int REAL = 20;

  /**
   * The feature id for the '<em><b>Real</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL__REAL = 0;

  /**
   * The number of structural features of the '<em>real</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REAL_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.Model#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Model#getFunctions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Functions();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl1.myDsl.Model#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Main</em>'.
   * @see org.xtext.example.mydsl1.myDsl.Model#getMain()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Main();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.functionDefinition <em>function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Definition</em>'.
   * @see org.xtext.example.mydsl1.myDsl.functionDefinition
   * @generated
   */
  EClass getfunctionDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl1.myDsl.functionDefinition#getName()
   * @see #getfunctionDefinition()
   * @generated
   */
  EAttribute getfunctionDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getFormalParams <em>Formal Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Params</em>'.
   * @see org.xtext.example.mydsl1.myDsl.functionDefinition#getFormalParams()
   * @see #getfunctionDefinition()
   * @generated
   */
  EReference getfunctionDefinition_FormalParams();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see org.xtext.example.mydsl1.myDsl.functionDefinition#getReturnType()
   * @see #getfunctionDefinition()
   * @generated
   */
  EReference getfunctionDefinition_ReturnType();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.xtext.example.mydsl1.myDsl.functionDefinition#getBlocks()
   * @see #getfunctionDefinition()
   * @generated
   */
  EReference getfunctionDefinition_Blocks();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.mainFunction <em>main Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>main Function</em>'.
   * @see org.xtext.example.mydsl1.myDsl.mainFunction
   * @generated
   */
  EClass getmainFunction();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.mainFunction#getMain <em>Main</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Main</em>'.
   * @see org.xtext.example.mydsl1.myDsl.mainFunction#getMain()
   * @see #getmainFunction()
   * @generated
   */
  EAttribute getmainFunction_Main();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl1.myDsl.mainFunction#getFormalParams <em>Formal Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal Params</em>'.
   * @see org.xtext.example.mydsl1.myDsl.mainFunction#getFormalParams()
   * @see #getmainFunction()
   * @generated
   */
  EReference getmainFunction_FormalParams();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.mainFunction#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see org.xtext.example.mydsl1.myDsl.mainFunction#getBlocks()
   * @see #getmainFunction()
   * @generated
   */
  EReference getmainFunction_Blocks();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.formalParams <em>formal Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>formal Params</em>'.
   * @see org.xtext.example.mydsl1.myDsl.formalParams
   * @generated
   */
  EClass getformalParams();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.formalParams#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.example.mydsl1.myDsl.formalParams#getParams()
   * @see #getformalParams()
   * @generated
   */
  EReference getformalParams_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.param <em>param</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>param</em>'.
   * @see org.xtext.example.mydsl1.myDsl.param
   * @generated
   */
  EClass getparam();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.param#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.example.mydsl1.myDsl.param#getStatements()
   * @see #getparam()
   * @generated
   */
  EReference getparam_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.block <em>block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>block</em>'.
   * @see org.xtext.example.mydsl1.myDsl.block
   * @generated
   */
  EClass getblock();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.block#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.example.mydsl1.myDsl.block#getStatements()
   * @see #getblock()
   * @generated
   */
  EReference getblock_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type</em>'.
   * @see org.xtext.example.mydsl1.myDsl.type
   * @generated
   */
  EClass gettype();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl1.myDsl.type#getName()
   * @see #gettype()
   * @generated
   */
  EAttribute gettype_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.type#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Types</em>'.
   * @see org.xtext.example.mydsl1.myDsl.type#getTypes()
   * @see #gettype()
   * @generated
   */
  EAttribute gettype_Types();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see org.xtext.example.mydsl1.myDsl.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.statement#getPostFixExpression <em>Post Fix Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Post Fix Expression</em>'.
   * @see org.xtext.example.mydsl1.myDsl.statement#getPostFixExpression()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_PostFixExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.statement#getAssignments <em>Assignments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assignments</em>'.
   * @see org.xtext.example.mydsl1.myDsl.statement#getAssignments()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Assignments();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.statement#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.xtext.example.mydsl1.myDsl.statement#getExprs()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Exprs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.functionCall <em>function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>function Call</em>'.
   * @see org.xtext.example.mydsl1.myDsl.functionCall
   * @generated
   */
  EClass getfunctionCall();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl1.myDsl.functionCall#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.xtext.example.mydsl1.myDsl.functionCall#getFunction()
   * @see #getfunctionCall()
   * @generated
   */
  EReference getfunctionCall_Function();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.declaration <em>declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>declaration</em>'.
   * @see org.xtext.example.mydsl1.myDsl.declaration
   * @generated
   */
  EClass getdeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.declaration#getVariableType <em>Variable Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variable Type</em>'.
   * @see org.xtext.example.mydsl1.myDsl.declaration#getVariableType()
   * @see #getdeclaration()
   * @generated
   */
  EReference getdeclaration_VariableType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl1.myDsl.declaration#getName()
   * @see #getdeclaration()
   * @generated
   */
  EAttribute getdeclaration_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.assignment <em>assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>assignment</em>'.
   * @see org.xtext.example.mydsl1.myDsl.assignment
   * @generated
   */
  EClass getassignment();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.expr <em>expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>expr</em>'.
   * @see org.xtext.example.mydsl1.myDsl.expr
   * @generated
   */
  EClass getexpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.expr#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.example.mydsl1.myDsl.expr#getStatements()
   * @see #getexpr()
   * @generated
   */
  EReference getexpr_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.andExpr <em>and Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>and Expr</em>'.
   * @see org.xtext.example.mydsl1.myDsl.andExpr
   * @generated
   */
  EClass getandExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.andExpr#getAndExprs <em>And Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>And Exprs</em>'.
   * @see org.xtext.example.mydsl1.myDsl.andExpr#getAndExprs()
   * @see #getandExpr()
   * @generated
   */
  EReference getandExpr_AndExprs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.eqExpr <em>eq Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>eq Expr</em>'.
   * @see org.xtext.example.mydsl1.myDsl.eqExpr
   * @generated
   */
  EClass geteqExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.eqExpr#getEqExprs <em>Eq Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Eq Exprs</em>'.
   * @see org.xtext.example.mydsl1.myDsl.eqExpr#getEqExprs()
   * @see #geteqExpr()
   * @generated
   */
  EReference geteqExpr_EqExprs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.relExpr <em>rel Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>rel Expr</em>'.
   * @see org.xtext.example.mydsl1.myDsl.relExpr
   * @generated
   */
  EClass getrelExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.relExpr#getRelExprs <em>Rel Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rel Exprs</em>'.
   * @see org.xtext.example.mydsl1.myDsl.relExpr#getRelExprs()
   * @see #getrelExpr()
   * @generated
   */
  EReference getrelExpr_RelExprs();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.addExpr <em>add Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>add Expr</em>'.
   * @see org.xtext.example.mydsl1.myDsl.addExpr
   * @generated
   */
  EClass getaddExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.addExpr#getAddExpr <em>Add Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Add Expr</em>'.
   * @see org.xtext.example.mydsl1.myDsl.addExpr#getAddExpr()
   * @see #getaddExpr()
   * @generated
   */
  EReference getaddExpr_AddExpr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.mulExpr <em>mul Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>mul Expr</em>'.
   * @see org.xtext.example.mydsl1.myDsl.mulExpr
   * @generated
   */
  EClass getmulExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.mulExpr#getMulExprs <em>Mul Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mul Exprs</em>'.
   * @see org.xtext.example.mydsl1.myDsl.mulExpr#getMulExprs()
   * @see #getmulExpr()
   * @generated
   */
  EReference getmulExpr_MulExprs();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.mulExpr#getAtoms <em>Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atoms</em>'.
   * @see org.xtext.example.mydsl1.myDsl.mulExpr#getAtoms()
   * @see #getmulExpr()
   * @generated
   */
  EReference getmulExpr_Atoms();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.atom <em>atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>atom</em>'.
   * @see org.xtext.example.mydsl1.myDsl.atom
   * @generated
   */
  EClass getatom();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.atom#getConstants <em>Constants</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constants</em>'.
   * @see org.xtext.example.mydsl1.myDsl.atom#getConstants()
   * @see #getatom()
   * @generated
   */
  EReference getatom_Constants();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.postfixExpr <em>postfix Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>postfix Expr</em>'.
   * @see org.xtext.example.mydsl1.myDsl.postfixExpr
   * @generated
   */
  EClass getpostfixExpr();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.postfixExpr#getExprs <em>Exprs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exprs</em>'.
   * @see org.xtext.example.mydsl1.myDsl.postfixExpr#getExprs()
   * @see #getpostfixExpr()
   * @generated
   */
  EReference getpostfixExpr_Exprs();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl1.myDsl.postfixExpr#getExistingVariable <em>Existing Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Existing Variable</em>'.
   * @see org.xtext.example.mydsl1.myDsl.postfixExpr#getExistingVariable()
   * @see #getpostfixExpr()
   * @generated
   */
  EReference getpostfixExpr_ExistingVariable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.postfixExpr#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.xtext.example.mydsl1.myDsl.postfixExpr#getExpressions()
   * @see #getpostfixExpr()
   * @generated
   */
  EReference getpostfixExpr_Expressions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.constant <em>constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>constant</em>'.
   * @see org.xtext.example.mydsl1.myDsl.constant
   * @generated
   */
  EClass getconstant();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl1.myDsl.constant#getReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Real</em>'.
   * @see org.xtext.example.mydsl1.myDsl.constant#getReal()
   * @see #getconstant()
   * @generated
   */
  EReference getconstant_Real();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.constant#getInteger <em>Integer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Integer</em>'.
   * @see org.xtext.example.mydsl1.myDsl.constant#getInteger()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_Integer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.constant#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.mydsl1.myDsl.constant#getString()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_String();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.constant#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see org.xtext.example.mydsl1.myDsl.constant#getNull()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_Null();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.constant#getInfinity <em>Infinity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Infinity</em>'.
   * @see org.xtext.example.mydsl1.myDsl.constant#getInfinity()
   * @see #getconstant()
   * @generated
   */
  EAttribute getconstant_Infinity();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.real <em>real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>real</em>'.
   * @see org.xtext.example.mydsl1.myDsl.real
   * @generated
   */
  EClass getreal();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl1.myDsl.real#getReal <em>Real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Real</em>'.
   * @see org.xtext.example.mydsl1.myDsl.real#getReal()
   * @see #getreal()
   * @generated
   */
  EAttribute getreal_Real();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FUNCTIONS = eINSTANCE.getModel_Functions();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MAIN = eINSTANCE.getModel_Main();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.functionDefinitionImpl <em>function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.functionDefinitionImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getfunctionDefinition()
     * @generated
     */
    EClass FUNCTION_DEFINITION = eINSTANCE.getfunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__NAME = eINSTANCE.getfunctionDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Formal Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__FORMAL_PARAMS = eINSTANCE.getfunctionDefinition_FormalParams();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__RETURN_TYPE = eINSTANCE.getfunctionDefinition_ReturnType();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__BLOCKS = eINSTANCE.getfunctionDefinition_Blocks();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.mainFunctionImpl <em>main Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.mainFunctionImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getmainFunction()
     * @generated
     */
    EClass MAIN_FUNCTION = eINSTANCE.getmainFunction();

    /**
     * The meta object literal for the '<em><b>Main</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAIN_FUNCTION__MAIN = eINSTANCE.getmainFunction_Main();

    /**
     * The meta object literal for the '<em><b>Formal Params</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_FUNCTION__FORMAL_PARAMS = eINSTANCE.getmainFunction_FormalParams();

    /**
     * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAIN_FUNCTION__BLOCKS = eINSTANCE.getmainFunction_Blocks();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.formalParamsImpl <em>formal Params</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.formalParamsImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getformalParams()
     * @generated
     */
    EClass FORMAL_PARAMS = eINSTANCE.getformalParams();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMAL_PARAMS__PARAMS = eINSTANCE.getformalParams_Params();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.paramImpl <em>param</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.paramImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getparam()
     * @generated
     */
    EClass PARAM = eINSTANCE.getparam();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__STATEMENTS = eINSTANCE.getparam_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.blockImpl <em>block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.blockImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getblock()
     * @generated
     */
    EClass BLOCK = eINSTANCE.getblock();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BLOCK__STATEMENTS = eINSTANCE.getblock_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.typeImpl <em>type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.typeImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#gettype()
     * @generated
     */
    EClass TYPE = eINSTANCE.gettype();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.gettype_Name();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPES = eINSTANCE.gettype_Types();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.statementImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>Post Fix Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__POST_FIX_EXPRESSION = eINSTANCE.getstatement_PostFixExpression();

    /**
     * The meta object literal for the '<em><b>Assignments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__ASSIGNMENTS = eINSTANCE.getstatement_Assignments();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRS = eINSTANCE.getstatement_Exprs();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.functionCallImpl <em>function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.functionCallImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getfunctionCall()
     * @generated
     */
    EClass FUNCTION_CALL = eINSTANCE.getfunctionCall();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL__FUNCTION = eINSTANCE.getfunctionCall_Function();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.declarationImpl <em>declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.declarationImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getdeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getdeclaration();

    /**
     * The meta object literal for the '<em><b>Variable Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECLARATION__VARIABLE_TYPE = eINSTANCE.getdeclaration_VariableType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getdeclaration_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.assignmentImpl <em>assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.assignmentImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getassignment()
     * @generated
     */
    EClass ASSIGNMENT = eINSTANCE.getassignment();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.exprImpl <em>expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.exprImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getexpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getexpr();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR__STATEMENTS = eINSTANCE.getexpr_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.andExprImpl <em>and Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.andExprImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getandExpr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getandExpr();

    /**
     * The meta object literal for the '<em><b>And Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__AND_EXPRS = eINSTANCE.getandExpr_AndExprs();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.eqExprImpl <em>eq Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.eqExprImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#geteqExpr()
     * @generated
     */
    EClass EQ_EXPR = eINSTANCE.geteqExpr();

    /**
     * The meta object literal for the '<em><b>Eq Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQ_EXPR__EQ_EXPRS = eINSTANCE.geteqExpr_EqExprs();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.relExprImpl <em>rel Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.relExprImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getrelExpr()
     * @generated
     */
    EClass REL_EXPR = eINSTANCE.getrelExpr();

    /**
     * The meta object literal for the '<em><b>Rel Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REL_EXPR__REL_EXPRS = eINSTANCE.getrelExpr_RelExprs();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.addExprImpl <em>add Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.addExprImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getaddExpr()
     * @generated
     */
    EClass ADD_EXPR = eINSTANCE.getaddExpr();

    /**
     * The meta object literal for the '<em><b>Add Expr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADD_EXPR__ADD_EXPR = eINSTANCE.getaddExpr_AddExpr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.mulExprImpl <em>mul Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.mulExprImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getmulExpr()
     * @generated
     */
    EClass MUL_EXPR = eINSTANCE.getmulExpr();

    /**
     * The meta object literal for the '<em><b>Mul Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_EXPR__MUL_EXPRS = eINSTANCE.getmulExpr_MulExprs();

    /**
     * The meta object literal for the '<em><b>Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_EXPR__ATOMS = eINSTANCE.getmulExpr_Atoms();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.atomImpl <em>atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.atomImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getatom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getatom();

    /**
     * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOM__CONSTANTS = eINSTANCE.getatom_Constants();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.postfixExprImpl <em>postfix Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.postfixExprImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getpostfixExpr()
     * @generated
     */
    EClass POSTFIX_EXPR = eINSTANCE.getpostfixExpr();

    /**
     * The meta object literal for the '<em><b>Exprs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPR__EXPRS = eINSTANCE.getpostfixExpr_Exprs();

    /**
     * The meta object literal for the '<em><b>Existing Variable</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPR__EXISTING_VARIABLE = eINSTANCE.getpostfixExpr_ExistingVariable();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POSTFIX_EXPR__EXPRESSIONS = eINSTANCE.getpostfixExpr_Expressions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.constantImpl <em>constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.constantImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getconstant()
     * @generated
     */
    EClass CONSTANT = eINSTANCE.getconstant();

    /**
     * The meta object literal for the '<em><b>Real</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTANT__REAL = eINSTANCE.getconstant_Real();

    /**
     * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__INTEGER = eINSTANCE.getconstant_Integer();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__STRING = eINSTANCE.getconstant_String();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__NULL = eINSTANCE.getconstant_Null();

    /**
     * The meta object literal for the '<em><b>Infinity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT__INFINITY = eINSTANCE.getconstant_Infinity();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.realImpl <em>real</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.realImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getreal()
     * @generated
     */
    EClass REAL = eINSTANCE.getreal();

    /**
     * The meta object literal for the '<em><b>Real</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REAL__REAL = eINSTANCE.getreal_Real();

  }

} //MyDslPackage
