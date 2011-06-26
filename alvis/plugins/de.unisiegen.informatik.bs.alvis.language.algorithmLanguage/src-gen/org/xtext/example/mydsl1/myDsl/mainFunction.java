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
 * A representation of the model object '<em><b>main Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.mainFunction#getMain <em>Main</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.mainFunction#getFormalParams <em>Formal Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.mainFunction#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getmainFunction()
 * @model
 * @generated
 */
public interface mainFunction extends EObject
{
  /**
   * Returns the value of the '<em><b>Main</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Main</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Main</em>' attribute.
   * @see #setMain(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getmainFunction_Main()
   * @model
   * @generated
   */
  String getMain();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.mainFunction#getMain <em>Main</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Main</em>' attribute.
   * @see #getMain()
   * @generated
   */
  void setMain(String value);

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
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getmainFunction_FormalParams()
   * @model containment="true"
   * @generated
   */
  formalParams getFormalParams();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.mainFunction#getFormalParams <em>Formal Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formal Params</em>' containment reference.
   * @see #getFormalParams()
   * @generated
   */
  void setFormalParams(formalParams value);

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
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getmainFunction_Blocks()
   * @model containment="true"
   * @generated
   */
  EList<block> getBlocks();

} // mainFunction
