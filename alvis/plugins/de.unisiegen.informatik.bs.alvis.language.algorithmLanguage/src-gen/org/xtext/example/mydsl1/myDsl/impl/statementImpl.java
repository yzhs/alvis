/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtext.example.mydsl1.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.statementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class statementImpl extends MinimalEObjectImpl.Container implements statement
{
  /**
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<statement> statements;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EObject types;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected statementImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MyDslPackage.Literals.STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList<statement>(statement.class, this, MyDslPackage.STATEMENT__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getTypes()
  {
    if (types != null && types.eIsProxy())
    {
      InternalEObject oldTypes = (InternalEObject)types;
      types = eResolveProxy(oldTypes);
      if (types != oldTypes)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MyDslPackage.STATEMENT__TYPES, oldTypes, types));
      }
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetTypes()
  {
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypes(EObject newTypes)
  {
    EObject oldTypes = types;
    types = newTypes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__TYPES, oldTypes, types));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.STATEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__STATEMENTS:
        return getStatements();
      case MyDslPackage.STATEMENT__TYPES:
        if (resolve) return getTypes();
        return basicGetTypes();
      case MyDslPackage.STATEMENT__NAME:
        return getName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends statement>)newValue);
        return;
      case MyDslPackage.STATEMENT__TYPES:
        setTypes((EObject)newValue);
        return;
      case MyDslPackage.STATEMENT__NAME:
        setName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__STATEMENTS:
        getStatements().clear();
        return;
      case MyDslPackage.STATEMENT__TYPES:
        setTypes((EObject)null);
        return;
      case MyDslPackage.STATEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MyDslPackage.STATEMENT__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case MyDslPackage.STATEMENT__TYPES:
        return types != null;
      case MyDslPackage.STATEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //statementImpl
