/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>and Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.andExpr#getAndExprs <em>And Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getandExpr()
 * @model
 * @generated
 */
public interface andExpr extends expr
{
  /**
   * Returns the value of the '<em><b>And Exprs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.andExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And Exprs</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getandExpr_AndExprs()
   * @model containment="true"
   * @generated
   */
  EList<andExpr> getAndExprs();

} // andExpr
