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
 * A representation of the model object '<em><b>constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.constant#getReal <em>Real</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.constant#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.constant#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.constant#getNull <em>Null</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.constant#getInfinity <em>Infinity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getconstant()
 * @model
 * @generated
 */
public interface constant extends EObject
{
  /**
   * Returns the value of the '<em><b>Real</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl1.myDsl.real}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Real</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Real</em>' containment reference list.
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getconstant_Real()
   * @model containment="true"
   * @generated
   */
  EList<real> getReal();

  /**
   * Returns the value of the '<em><b>Integer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Integer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Integer</em>' attribute.
   * @see #setInteger(int)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getconstant_Integer()
   * @model
   * @generated
   */
  int getInteger();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.constant#getInteger <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Integer</em>' attribute.
   * @see #getInteger()
   * @generated
   */
  void setInteger(int value);

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getconstant_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.constant#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Null</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Null</em>' attribute.
   * @see #setNull(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getconstant_Null()
   * @model
   * @generated
   */
  String getNull();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.constant#getNull <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Null</em>' attribute.
   * @see #getNull()
   * @generated
   */
  void setNull(String value);

  /**
   * Returns the value of the '<em><b>Infinity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infinity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infinity</em>' attribute.
   * @see #setInfinity(String)
   * @see org.xtext.example.mydsl1.myDsl.MyDslPackage#getconstant_Infinity()
   * @model
   * @generated
   */
  String getInfinity();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl1.myDsl.constant#getInfinity <em>Infinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infinity</em>' attribute.
   * @see #getInfinity()
   * @generated
   */
  void setInfinity(String value);

} // constant
