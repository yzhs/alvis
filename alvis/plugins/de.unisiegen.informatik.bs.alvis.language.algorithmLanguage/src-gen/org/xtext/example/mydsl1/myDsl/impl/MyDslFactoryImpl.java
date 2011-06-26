/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl1.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory("de.unisiegen.informatik.bs.alvis.language.algorithmLanguage"); 
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.FUNCTION_DEFINITION: return createfunctionDefinition();
      case MyDslPackage.MAIN_FUNCTION: return createmainFunction();
      case MyDslPackage.FORMAL_PARAMS: return createformalParams();
      case MyDslPackage.PARAM: return createparam();
      case MyDslPackage.BLOCK: return createblock();
      case MyDslPackage.TYPE: return createtype();
      case MyDslPackage.STATEMENT: return createstatement();
      case MyDslPackage.FUNCTION_CALL: return createfunctionCall();
      case MyDslPackage.DECLARATION: return createdeclaration();
      case MyDslPackage.ASSIGNMENT: return createassignment();
      case MyDslPackage.EXPR: return createexpr();
      case MyDslPackage.AND_EXPR: return createandExpr();
      case MyDslPackage.EQ_EXPR: return createeqExpr();
      case MyDslPackage.REL_EXPR: return createrelExpr();
      case MyDslPackage.ADD_EXPR: return createaddExpr();
      case MyDslPackage.MUL_EXPR: return createmulExpr();
      case MyDslPackage.ATOM: return createatom();
      case MyDslPackage.POSTFIX_EXPR: return createpostfixExpr();
      case MyDslPackage.CONSTANT: return createconstant();
      case MyDslPackage.REAL: return createreal();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionDefinition createfunctionDefinition()
  {
    functionDefinitionImpl functionDefinition = new functionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mainFunction createmainFunction()
  {
    mainFunctionImpl mainFunction = new mainFunctionImpl();
    return mainFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formalParams createformalParams()
  {
    formalParamsImpl formalParams = new formalParamsImpl();
    return formalParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public param createparam()
  {
    paramImpl param = new paramImpl();
    return param;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block createblock()
  {
    blockImpl block = new blockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionCall createfunctionCall()
  {
    functionCallImpl functionCall = new functionCallImpl();
    return functionCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration createdeclaration()
  {
    declarationImpl declaration = new declarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment createassignment()
  {
    assignmentImpl assignment = new assignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expr createexpr()
  {
    exprImpl expr = new exprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public andExpr createandExpr()
  {
    andExprImpl andExpr = new andExprImpl();
    return andExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public eqExpr createeqExpr()
  {
    eqExprImpl eqExpr = new eqExprImpl();
    return eqExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relExpr createrelExpr()
  {
    relExprImpl relExpr = new relExprImpl();
    return relExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public addExpr createaddExpr()
  {
    addExprImpl addExpr = new addExprImpl();
    return addExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mulExpr createmulExpr()
  {
    mulExprImpl mulExpr = new mulExprImpl();
    return mulExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public atom createatom()
  {
    atomImpl atom = new atomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public postfixExpr createpostfixExpr()
  {
    postfixExprImpl postfixExpr = new postfixExprImpl();
    return postfixExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constant createconstant()
  {
    constantImpl constant = new constantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public real createreal()
  {
    realImpl real = new realImpl();
    return real;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
