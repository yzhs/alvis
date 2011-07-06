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
 * A representation of the model object '<em><b>FLOAT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.FLOAT#getFLOAT <em>FLOAT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFLOAT()
 * @model
 * @generated
 */
public interface FLOAT extends EObject
{
  /**
   * Returns the value of the '<em><b>FLOAT</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>FLOAT</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>FLOAT</em>' attribute list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getFLOAT_FLOAT()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getFLOAT();

} // FLOAT
