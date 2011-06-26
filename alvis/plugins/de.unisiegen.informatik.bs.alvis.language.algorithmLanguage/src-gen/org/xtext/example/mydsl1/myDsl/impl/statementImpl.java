/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.assignment;
import org.xtext.example.mydsl1.myDsl.expr;
import org.xtext.example.mydsl1.myDsl.postfixExpr;
import org.xtext.example.mydsl1.myDsl.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl#getPostFixExpression <em>Post Fix Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statementImpl extends MinimalEObjectImpl.Container implements statement
{
  /**
   * The cached value of the '{@link #getPostFixExpression() <em>Post Fix Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostFixExpression()
   * @generated
   * @ordered
   */
  protected EList<postfixExpr> postFixExpression;

  /**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<assignment> assignments;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statementImpl()
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
    return MyDslPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<postfixExpr> getPostFixExpression()
  {
    if (postFixExpression == null)
    {
      postFixExpression = new EObjectContainmentEList<postfixExpr>(postfixExpr.class, this, MyDslPackage.STATEMENT__POST_FIX_EXPRESSION);
    }
    return postFixExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<assignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<assignment>(assignment.class, this, MyDslPackage.STATEMENT__ASSIGNMENTS);
    }
    return assignments;
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
      exprs = new EObjectContainmentEList<expr>(expr.class, this, MyDslPackage.STATEMENT__EXPRS);
    }
    return exprs;
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
      case MyDslPackage.STATEMENT__POST_FIX_EXPRESSION:
        return ((InternalEList<?>)getPostFixExpression()).basicRemove(otherEnd, msgs);
      case MyDslPackage.STATEMENT__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
      case MyDslPackage.STATEMENT__EXPRS:
        return ((InternalEList<?>)getExprs()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.STATEMENT__POST_FIX_EXPRESSION:
        return getPostFixExpression();
      case MyDslPackage.STATEMENT__ASSIGNMENTS:
        return getAssignments();
      case MyDslPackage.STATEMENT__EXPRS:
        return getExprs();
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
      case MyDslPackage.STATEMENT__POST_FIX_EXPRESSION:
        getPostFixExpression().clear();
        getPostFixExpression().addAll((Collection<? extends postfixExpr>)newValue);
        return;
      case MyDslPackage.STATEMENT__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends assignment>)newValue);
        return;
      case MyDslPackage.STATEMENT__EXPRS:
        getExprs().clear();
        getExprs().addAll((Collection<? extends expr>)newValue);
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
      case MyDslPackage.STATEMENT__POST_FIX_EXPRESSION:
        getPostFixExpression().clear();
        return;
      case MyDslPackage.STATEMENT__ASSIGNMENTS:
        getAssignments().clear();
        return;
      case MyDslPackage.STATEMENT__EXPRS:
        getExprs().clear();
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
      case MyDslPackage.STATEMENT__POST_FIX_EXPRESSION:
        return postFixExpression != null && !postFixExpression.isEmpty();
      case MyDslPackage.STATEMENT__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
      case MyDslPackage.STATEMENT__EXPRS:
        return exprs != null && !exprs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //statementImpl
