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
 * A representation of the model object '<em><b>formal Params</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.formalParams#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getformalParams()
 * @model
 * @generated
 */
public interface formalParams extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.param}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getformalParams_Params()
   * @model containment="true"
   * @generated
   */
  EList<param> getParams();

} // formalParams
