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
 *   <li>{@link org.xtext.example.mydsl1.myDsl.functionDefinition#getIds <em>Ids</em>}</li>
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
   * Returns the value of the '<em><b>Ids</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ids</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ids</em>' attribute list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getfunctionDefinition_Ids()
   * @model unique="false"
   * @generated
   */
  EList<String> getIds();

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
