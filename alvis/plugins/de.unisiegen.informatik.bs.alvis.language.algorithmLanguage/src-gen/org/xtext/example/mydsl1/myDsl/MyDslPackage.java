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
   * The feature id for the '<em><b>Ids</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__IDS = 2;

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
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION__BLOCKS = 0;

  /**
   * The number of structural features of the '<em>main Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_FUNCTION_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMS__BLOCKS = MAIN_FUNCTION__BLOCKS;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMS__PARAMS = MAIN_FUNCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>formal Params</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAL_PARAMS_FEATURE_COUNT = MAIN_FUNCTION_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM__NAME = 1;

  /**
   * The number of structural features of the '<em>param</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAM_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl <em>statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.statementImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getstatement()
   * @generated
   */
  int STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Types</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__TYPES = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Thisone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__THISONE = 2;

  /**
   * The number of structural features of the '<em>statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl1.myDsl.impl.declarationImpl <em>declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl1.myDsl.impl.declarationImpl
   * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getdeclaration()
   * @generated
   */
  int DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Types</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__TYPES = STATEMENT__TYPES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = STATEMENT__NAME;

  /**
   * The feature id for the '<em><b>Thisone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__THISONE = STATEMENT__THISONE;

  /**
   * The number of structural features of the '<em>declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;


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
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getIds <em>Ids</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Ids</em>'.
   * @see org.xtext.example.mydsl1.myDsl.functionDefinition#getIds()
   * @see #getfunctionDefinition()
   * @generated
   */
  EAttribute getfunctionDefinition_Ids();

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
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl1.myDsl.param#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl1.myDsl.param#getType()
   * @see #getparam()
   * @generated
   */
  EReference getparam_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.param#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl1.myDsl.param#getName()
   * @see #getparam()
   * @generated
   */
  EAttribute getparam_Name();

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
   * Returns the meta object for class '{@link org.xtext.example.mydsl1.myDsl.statement <em>statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>statement</em>'.
   * @see org.xtext.example.mydsl1.myDsl.statement
   * @generated
   */
  EClass getstatement();

  /**
   * Returns the meta object for the reference '{@link org.xtext.example.mydsl1.myDsl.statement#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Types</em>'.
   * @see org.xtext.example.mydsl1.myDsl.statement#getTypes()
   * @see #getstatement()
   * @generated
   */
  EReference getstatement_Types();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl1.myDsl.statement#getName()
   * @see #getstatement()
   * @generated
   */
  EAttribute getstatement_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl1.myDsl.statement#getThisone <em>Thisone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Thisone</em>'.
   * @see org.xtext.example.mydsl1.myDsl.statement#getThisone()
   * @see #getstatement()
   * @generated
   */
  EAttribute getstatement_Thisone();

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
     * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__IDS = eINSTANCE.getfunctionDefinition_Ids();

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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAM__TYPE = eINSTANCE.getparam_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAM__NAME = eINSTANCE.getparam_Name();

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
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl <em>statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.statementImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getstatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getstatement();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__TYPES = eINSTANCE.getstatement_Types();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getstatement_Name();

    /**
     * The meta object literal for the '<em><b>Thisone</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__THISONE = eINSTANCE.getstatement_Thisone();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl1.myDsl.impl.declarationImpl <em>declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl1.myDsl.impl.declarationImpl
     * @see org.xtext.example.mydsl1.myDsl.impl.MyDslPackageImpl#getdeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getdeclaration();

  }

} //MyDslPackage
