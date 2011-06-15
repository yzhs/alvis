/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl2.testLanguage;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl2.testLanguage.Entity#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl2.testLanguage.TestLanguagePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Type
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl2.testLanguage.Feature}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' containment reference list.
   * @see org.xtext.example.mydsl2.testLanguage.TestLanguagePackage#getEntity_Features()
   * @model containment="true"
   * @generated
   */
  EList<Feature> getFeatures();

} // Entity
