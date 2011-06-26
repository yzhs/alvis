/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>add Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.addExpr#getAddExpr <em>Add Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getaddExpr()
 * @model
 * @generated
 */
public interface addExpr extends relExpr
{
  /**
   * Returns the value of the '<em><b>Add Expr</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.addExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Expr</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Expr</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getaddExpr_AddExpr()
   * @model containment="true"
   * @generated
   */
  EList<addExpr> getAddExpr();

} // addExpr
