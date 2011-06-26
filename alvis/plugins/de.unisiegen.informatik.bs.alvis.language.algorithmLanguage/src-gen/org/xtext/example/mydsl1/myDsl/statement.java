/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getPostFixExpression <em>Post Fix Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getExprs <em>Exprs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getstatement()
 * @model
 * @generated
 */
public interface statement extends EObject
{
  /**
   * Returns the value of the '<em><b>Post Fix Expression</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.postfixExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Post Fix Expression</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Post Fix Expression</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getstatement_PostFixExpression()
   * @model containment="true"
   * @generated
   */
  EList<postfixExpr> getPostFixExpression();

  /**
   * Returns the value of the '<em><b>Assignments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.assignment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignments</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getstatement_Assignments()
   * @model containment="true"
   * @generated
   */
  EList<assignment> getAssignments();

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
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getstatement_Exprs()
   * @model containment="true"
   * @generated
   */
  EList<expr> getExprs();

} // statement
