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
 * A representation of the model object '<em><b>function Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getFormalParams <em>Formal Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getfunctionDefinition()
 * @model
 * @generated
 */
public interface functionDefinition extends EObject
{
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
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getfunctionDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Formal Params</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Formal Params</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formal Params</em>' containment reference.
   * @see #setFormalParams(formalParams)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getfunctionDefinition_FormalParams()
   * @model containment="true"
   * @generated
   */
  formalParams getFormalParams();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getFormalParams <em>Formal Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Params</em>' containment reference.
   * @see #getFormalParams()
   * @generated
   */
  void setFormalParams(formalParams value);

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(type)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getfunctionDefinition_ReturnType()
   * @model containment="true"
   * @generated
   */
  type getReturnType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(type value);

  /**
   * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.block}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Blocks</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getfunctionDefinition_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<block> getBlocks();

} // functionDefinition
