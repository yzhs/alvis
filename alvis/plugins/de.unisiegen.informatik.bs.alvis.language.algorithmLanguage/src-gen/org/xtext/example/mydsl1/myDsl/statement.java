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
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getTypes <em>Types</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getName <em>Name</em>}</li>
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
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getstatement_Statements()
   * @model containment="true"
   * @generated
   */
  EList<statement> getStatements();

  /**
   * Returns the value of the '<em><b>Types</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' reference.
   * @see #setTypes(EObject)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getstatement_Types()
   * @model
   * @generated
   */
  EObject getTypes();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.statement#getTypes <em>Types</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Types</em>' reference.
   * @see #getTypes()
   * @generated
   */
  void setTypes(EObject value);

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
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getstatement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.statement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // statement
