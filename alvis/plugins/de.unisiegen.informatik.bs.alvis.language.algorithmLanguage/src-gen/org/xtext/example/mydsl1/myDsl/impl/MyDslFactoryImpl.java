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
      case MyDslPackage.DECLARATION: return createdeclaration();
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
