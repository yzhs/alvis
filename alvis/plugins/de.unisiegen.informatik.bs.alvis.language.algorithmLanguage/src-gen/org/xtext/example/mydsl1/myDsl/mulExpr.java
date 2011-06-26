/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>mul Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.mulExpr#getMulExprs <em>Mul Exprs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.mulExpr#getAtoms <em>Atoms</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getmulExpr()
 * @model
 * @generated
 */
public interface mulExpr extends addExpr
{
  /**
   * Returns the value of the '<em><b>Mul Exprs</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.mulExpr}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mul Exprs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mul Exprs</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getmulExpr_MulExprs()
   * @model containment="true"
   * @generated
   */
  EList<mulExpr> getMulExprs();

  /**
   * Returns the value of the '<em><b>Atoms</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.atom}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Atoms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atoms</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getmulExpr_Atoms()
   * @model containment="true"
   * @generated
   */
  EList<atom> getAtoms();

} // mulExpr
