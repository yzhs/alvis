/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>rel Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.relExpr#getRelExprs <em>Rel Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getrelExpr()
 * @model
 * @generated
 */
public interface relExpr extends eqExpr
{
  /**
   * Returns the value of the '<em><b>Rel Exprs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.relExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel Exprs</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getrelExpr_RelExprs()
   * @model containment="true"
   * @generated
   */
  EList<relExpr> getRelExprs();

} // relExpr
