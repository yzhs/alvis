/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getTypes <em>Types</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.statement#getThisone <em>Thisone</em>}</li>
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

  /**
   * Returns the value of the '<em><b>Thisone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thisone</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thisone</em>' attribute.
   * @see #setThisone(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getstatement_Thisone()
   * @model
   * @generated
   */
  String getThisone();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.statement#getThisone <em>Thisone</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thisone</em>' attribute.
   * @see #getThisone()
   * @generated
   */
  void setThisone(String value);

} // statement
