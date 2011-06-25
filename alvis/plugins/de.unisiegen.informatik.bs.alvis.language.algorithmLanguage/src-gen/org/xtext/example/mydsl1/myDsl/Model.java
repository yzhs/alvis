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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Model#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.Model#getMain <em>Main</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.functionDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getModel_Functions()
   * @model containment="true"
   * @generated
   */
  EList<functionDefinition> getFunctions();

  /**
   * Returns the value of the '<em><b>Main</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' containment reference.
   * @see #setMain(mainFunction)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getModel_Main()
   * @model containment="true"
   * @generated
   */
  mainFunction getMain();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.Model#getMain <em>Main</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' containment reference.
   * @see #getMain()
   * @generated
   */
  void setMain(mainFunction value);

} // Model
