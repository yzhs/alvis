/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl1.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FUNCTION_DEFINITION:
      {
        functionDefinition functionDefinition = (functionDefinition)theEObject;
        T result = casefunctionDefinition(functionDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MAIN_FUNCTION:
      {
        mainFunction mainFunction = (mainFunction)theEObject;
        T result = casemainFunction(mainFunction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FORMAL_PARAMS:
      {
        formalParams formalParams = (formalParams)theEObject;
        T result = caseformalParams(formalParams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAM:
      {
        param param = (param)theEObject;
        T result = caseparam(param);
        if (result == null) result = casestatement(param);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BLOCK:
      {
        block block = (block)theEObject;
        T result = caseblock(block);
        if (result == null) result = casestatement(block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE:
      {
        type type = (type)theEObject;
        T result = casetype(type);
        if (result == null) result = caseparam(type);
        if (result == null) result = casestatement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATEMENT:
      {
        statement statement = (statement)theEObject;
        T result = casestatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DECLARATION:
      {
        declaration declaration = (declaration)theEObject;
        T result = casedeclaration(declaration);
        if (result == null) result = casestatement(declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ASSIGNMENT:
      {
        assignment assignment = (assignment)theEObject;
        T result = caseassignment(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPR:
      {
        expr expr = (expr)theEObject;
        T result = caseexpr(expr);
        if (result == null) result = casestatement(expr);
        if (result == null) result = caseatom(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.AND_EXPR:
      {
        andExpr andExpr = (andExpr)theEObject;
        T result = caseandExpr(andExpr);
        if (result == null) result = caseexpr(andExpr);
        if (result == null) result = casestatement(andExpr);
        if (result == null) result = caseatom(andExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EQ_EXPR:
      {
        eqExpr eqExpr = (eqExpr)theEObject;
        T result = caseeqExpr(eqExpr);
        if (result == null) result = caseandExpr(eqExpr);
        if (result == null) result = caseexpr(eqExpr);
        if (result == null) result = casestatement(eqExpr);
        if (result == null) result = caseatom(eqExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.REL_EXPR:
      {
        relExpr relExpr = (relExpr)theEObject;
        T result = caserelExpr(relExpr);
        if (result == null) result = caseeqExpr(relExpr);
        if (result == null) result = caseandExpr(relExpr);
        if (result == null) result = caseexpr(relExpr);
        if (result == null) result = casestatement(relExpr);
        if (result == null) result = caseatom(relExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ADD_EXPR:
      {
        addExpr addExpr = (addExpr)theEObject;
        T result = caseaddExpr(addExpr);
        if (result == null) result = caserelExpr(addExpr);
        if (result == null) result = caseeqExpr(addExpr);
        if (result == null) result = caseandExpr(addExpr);
        if (result == null) result = caseexpr(addExpr);
        if (result == null) result = casestatement(addExpr);
        if (result == null) result = caseatom(addExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MUL_EXPR:
      {
        mulExpr mulExpr = (mulExpr)theEObject;
        T result = casemulExpr(mulExpr);
        if (result == null) result = caseaddExpr(mulExpr);
        if (result == null) result = caserelExpr(mulExpr);
        if (result == null) result = caseeqExpr(mulExpr);
        if (result == null) result = caseandExpr(mulExpr);
        if (result == null) result = caseexpr(mulExpr);
        if (result == null) result = casestatement(mulExpr);
        if (result == null) result = caseatom(mulExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ATOM:
      {
        atom atom = (atom)theEObject;
        T result = caseatom(atom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.POSTFIX_EXPR:
      {
        postfixExpr postfixExpr = (postfixExpr)theEObject;
        T result = casepostfixExpr(postfixExpr);
        if (result == null) result = caseassignment(postfixExpr);
        if (result == null) result = caseatom(postfixExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONSTANT:
      {
        constant constant = (constant)theEObject;
        T result = caseconstant(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FLOAT:
      {
        FLOAT float_ = (FLOAT)theEObject;
        T result = caseFLOAT(float_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>function Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>function Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casefunctionDefinition(functionDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>main Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>main Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemainFunction(mainFunction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>formal Params</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>formal Params</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseformalParams(formalParams object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>param</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>param</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseparam(param object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseblock(block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype(type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casestatement(statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedeclaration(declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseassignment(assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexpr(expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>and Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>and Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseandExpr(andExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>eq Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>eq Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseeqExpr(eqExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>rel Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>rel Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caserelExpr(relExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>add Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>add Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseaddExpr(addExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mul Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mul Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemulExpr(mulExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>atom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>atom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseatom(atom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>postfix Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>postfix Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casepostfixExpr(postfixExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseconstant(constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FLOAT</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FLOAT</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFLOAT(FLOAT object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
