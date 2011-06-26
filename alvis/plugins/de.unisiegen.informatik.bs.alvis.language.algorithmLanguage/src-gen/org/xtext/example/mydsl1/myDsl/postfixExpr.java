/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>postfix Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.postfixExpr#getExprs <em>Exprs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.postfixExpr#getExistingVariable <em>Existing Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.postfixExpr#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getpostfixExpr()
 * @model
 * @generated
 */
public interface postfixExpr extends assignment, atom
{
  /**
   * Returns the value of the '<em><b>Exprs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exprs</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getpostfixExpr_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<expr> getExprs();

  /**
   * Returns the value of the '<em><b>Existing Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Existing Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Existing Variable</em>' reference.
   * @see #setExistingVariable(statement)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getpostfixExpr_ExistingVariable()
   * @model
   * @generated
   */
  statement getExistingVariable();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.postfixExpr#getExistingVariable <em>Existing Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Existing Variable</em>' reference.
   * @see #getExistingVariable()
   * @generated
   */
  void setExistingVariable(statement value);

  /**
   * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.expr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expressions</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getpostfixExpr_Expressions()
   * @model containment="true"
   * @generated
   */
  EList<expr> getExpressions();

} // postfixExpr
