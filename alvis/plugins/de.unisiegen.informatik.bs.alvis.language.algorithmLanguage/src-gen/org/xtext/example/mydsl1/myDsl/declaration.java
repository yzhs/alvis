/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.declaration#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.declaration#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getdeclaration()
 * @model
 * @generated
 */
public interface declaration extends statement
{
  /**
   * Returns the value of the '<em><b>Variable Type</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable Type</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getdeclaration_VariableType()
   * @model containment="true"
   * @generated
   */
  EList<type> getVariableType();

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getdeclaration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.declaration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // declaration
