/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.atom;
import org.xtext.example.mydsl1.myDsl.constant;
import org.xtext.example.mydsl1.myDsl.expr;
import org.xtext.example.mydsl1.myDsl.postfixExpr;
import org.xtext.example.mydsl1.myDsl.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postfix Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.postfixExprImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.postfixExprImpl#getExprs <em>Exprs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.postfixExprImpl#getExistingVariable <em>Existing Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.postfixExprImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class postfixExprImpl extends assignmentImpl implements postfixExpr
{
  /**
   * The cached value of the '{@link #getConstants() <em>Constants</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstants()
   * @generated
   * @ordered
   */
  protected EList<constant> constants;

  /**
   * The cached value of the '{@link #getExprs() <em>Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExprs()
   * @generated
   * @ordered
   */
  protected EList<expr> exprs;

  /**
   * The cached value of the '{@link #getExistingVariable() <em>Existing Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExistingVariable()
   * @generated
   * @ordered
   */
  protected statement existingVariable;

  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<expr> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected postfixExprImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.POSTFIX_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<constant> getConstants()
  {
    if (constants == null)
    {
      constants = new EObjectContainmentEList<constant>(constant.class, this, MyDslPackage.POSTFIX_EXPR__CONSTANTS);
    }
    return constants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expr> getExprs()
  {
    if (exprs == null)
    {
      exprs = new EObjectContainmentEList<expr>(expr.class, this, MyDslPackage.POSTFIX_EXPR__EXPRS);
    }
    return exprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getExistingVariable()
  {
    if (existingVariable != null && existingVariable.eIsProxy())
    {
      InternalEObject oldExistingVariable = (InternalEObject)existingVariable;
      existingVariable = (statement)eResolveProxy(oldExistingVariable);
      if (existingVariable != oldExistingVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.POSTFIX_EXPR__EXISTING_VARIABLE, oldExistingVariable, existingVariable));
      }
    }
    return existingVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement basicGetExistingVariable()
  {
    return existingVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExistingVariable(statement newExistingVariable)
  {
    statement oldExistingVariable = existingVariable;
    existingVariable = newExistingVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.POSTFIX_EXPR__EXISTING_VARIABLE, oldExistingVariable, existingVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<expr> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<expr>(expr.class, this, MyDslPackage.POSTFIX_EXPR__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.POSTFIX_EXPR__CONSTANTS:
        return ((InternalEList<?>)getConstants()).basicRemove(otherEnd, msgs);
      case MyDslPackage.POSTFIX_EXPR__EXPRS:
        return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
      case MyDslPackage.POSTFIX_EXPR__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.POSTFIX_EXPR__CONSTANTS:
        return getConstants();
      case MyDslPackage.POSTFIX_EXPR__EXPRS:
        return getExprs();
      case MyDslPackage.POSTFIX_EXPR__EXISTING_VARIABLE:
        if (resolve) return getExistingVariable();
        return basicGetExistingVariable();
      case MyDslPackage.POSTFIX_EXPR__EXPRESSIONS:
        return getExpressions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.POSTFIX_EXPR__CONSTANTS:
        getConstants().clear();
        getConstants().addAll((Collection<? extends constant>)newValue);
        return;
      case MyDslPackage.POSTFIX_EXPR__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends expr>)newValue);
        return;
      case MyDslPackage.POSTFIX_EXPR__EXISTING_VARIABLE:
        setExistingVariable((statement)newValue);
        return;
      case MyDslPackage.POSTFIX_EXPR__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends expr>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.POSTFIX_EXPR__CONSTANTS:
        getConstants().clear();
        return;
      case MyDslPackage.POSTFIX_EXPR__EXPRS:
        getExprs().clear();
        return;
      case MyDslPackage.POSTFIX_EXPR__EXISTING_VARIABLE:
        setExistingVariable((statement)null);
        return;
      case MyDslPackage.POSTFIX_EXPR__EXPRESSIONS:
        getExpressions().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.POSTFIX_EXPR__CONSTANTS:
        return constants != null && !constants.isEmpty();
      case MyDslPackage.POSTFIX_EXPR__EXPRS:
        return exprs != null && !exprs.isEmpty();
      case MyDslPackage.POSTFIX_EXPR__EXISTING_VARIABLE:
        return existingVariable != null;
      case MyDslPackage.POSTFIX_EXPR__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == atom.class)
    {
      switch (derivedFeatureID)
      {
        case MyDslPackage.POSTFIX_EXPR__CONSTANTS: return MyDslPackage.ATOM__CONSTANTS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == atom.class)
    {
      switch (baseFeatureID)
      {
        case MyDslPackage.ATOM__CONSTANTS: return MyDslPackage.POSTFIX_EXPR__CONSTANTS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //postfixExprImpl
