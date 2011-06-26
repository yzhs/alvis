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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.atom;
import org.xtext.example.mydsl1.myDsl.mulExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>mul Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.mulExprImpl#getMulExprs <em>Mul Exprs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.mulExprImpl#getAtoms <em>Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class mulExprImpl extends addExprImpl implements mulExpr
{
  /**
   * The cached value of the '{@link #getMulExprs() <em>Mul Exprs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMulExprs()
   * @generated
   * @ordered
   */
  protected EList<mulExpr> mulExprs;

  /**
   * The cached value of the '{@link #getAtoms() <em>Atoms</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtoms()
   * @generated
   * @ordered
   */
  protected EList<atom> atoms;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected mulExprImpl()
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
    return MyDslPackage.Literals.MUL_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<mulExpr> getMulExprs()
  {
    if (mulExprs == null)
    {
      mulExprs = new EObjectContainmentEList<mulExpr>(mulExpr.class, this, MyDslPackage.MUL_EXPR__MUL_EXPRS);
    }
    return mulExprs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<atom> getAtoms()
  {
    if (atoms == null)
    {
      atoms = new EObjectContainmentEList<atom>(atom.class, this, MyDslPackage.MUL_EXPR__ATOMS);
    }
    return atoms;
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
      case MyDslPackage.MUL_EXPR__MUL_EXPRS:
        return ((InternalEList<?>)getMulExprs()).basicRemove(otherEnd, msgs);
      case MyDslPackage.MUL_EXPR__ATOMS:
        return ((InternalEList<?>)getAtoms()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.MUL_EXPR__MUL_EXPRS:
        return getMulExprs();
      case MyDslPackage.MUL_EXPR__ATOMS:
        return getAtoms();
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
      case MyDslPackage.MUL_EXPR__MUL_EXPRS:
        getMulExprs().clear();
        getMulExprs().addAll((Collection<? extends mulExpr>)newValue);
        return;
      case MyDslPackage.MUL_EXPR__ATOMS:
        getAtoms().clear();
        getAtoms().addAll((Collection<? extends atom>)newValue);
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
      case MyDslPackage.MUL_EXPR__MUL_EXPRS:
        getMulExprs().clear();
        return;
      case MyDslPackage.MUL_EXPR__ATOMS:
        getAtoms().clear();
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
      case MyDslPackage.MUL_EXPR__MUL_EXPRS:
        return mulExprs != null && !mulExprs.isEmpty();
      case MyDslPackage.MUL_EXPR__ATOMS:
        return atoms != null && !atoms.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //mulExprImpl
