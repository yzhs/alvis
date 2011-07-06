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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.FLOAT;
import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.constant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.constantImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.constantImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.constantImpl#getString <em>String</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.constantImpl#getNull <em>Null</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.constantImpl#getInfinity <em>Infinity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class constantImpl extends MinimalEObjectImpl.Container implements constant
{
  /**
   * The cached value of the '{@link #getFloat() <em>Float</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloat()
   * @generated
   * @ordered
   */
  protected EList<FLOAT> float_;

  /**
   * The default value of the '{@link #getInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected static final int INTEGER_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected int integer = INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The default value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected static final String NULL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNull() <em>Null</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNull()
   * @generated
   * @ordered
   */
  protected String null_ = NULL_EDEFAULT;

  /**
   * The default value of the '{@link #getInfinity() <em>Infinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfinity()
   * @generated
   * @ordered
   */
  protected static final String INFINITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInfinity() <em>Infinity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfinity()
   * @generated
   * @ordered
   */
  protected String infinity = INFINITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected constantImpl()
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
    return MyDslPackage.Literals.CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FLOAT> getFloat()
  {
    if (float_ == null)
    {
      float_ = new EObjectContainmentEList<FLOAT>(FLOAT.class, this, MyDslPackage.CONSTANT__FLOAT);
    }
    return float_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInteger()
  {
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteger(int newInteger)
  {
    int oldInteger = integer;
    integer = newInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT__INTEGER, oldInteger, integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNull()
  {
    return null_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNull(String newNull)
  {
    String oldNull = null_;
    null_ = newNull;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT__NULL, oldNull, null_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInfinity()
  {
    return infinity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfinity(String newInfinity)
  {
    String oldInfinity = infinity;
    infinity = newInfinity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.CONSTANT__INFINITY, oldInfinity, infinity));
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
      case MyDslPackage.CONSTANT__FLOAT:
        return ((InternalEList<?>)getFloat()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.CONSTANT__FLOAT:
        return getFloat();
      case MyDslPackage.CONSTANT__INTEGER:
        return getInteger();
      case MyDslPackage.CONSTANT__STRING:
        return getString();
      case MyDslPackage.CONSTANT__NULL:
        return getNull();
      case MyDslPackage.CONSTANT__INFINITY:
        return getInfinity();
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
      case MyDslPackage.CONSTANT__FLOAT:
        getFloat().clear();
        getFloat().addAll((Collection<? extends FLOAT>)newValue);
        return;
      case MyDslPackage.CONSTANT__INTEGER:
        setInteger((Integer)newValue);
        return;
      case MyDslPackage.CONSTANT__STRING:
        setString((String)newValue);
        return;
      case MyDslPackage.CONSTANT__NULL:
        setNull((String)newValue);
        return;
      case MyDslPackage.CONSTANT__INFINITY:
        setInfinity((String)newValue);
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
      case MyDslPackage.CONSTANT__FLOAT:
        getFloat().clear();
        return;
      case MyDslPackage.CONSTANT__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case MyDslPackage.CONSTANT__STRING:
        setString(STRING_EDEFAULT);
        return;
      case MyDslPackage.CONSTANT__NULL:
        setNull(NULL_EDEFAULT);
        return;
      case MyDslPackage.CONSTANT__INFINITY:
        setInfinity(INFINITY_EDEFAULT);
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
      case MyDslPackage.CONSTANT__FLOAT:
        return float_ != null && !float_.isEmpty();
      case MyDslPackage.CONSTANT__INTEGER:
        return integer != INTEGER_EDEFAULT;
      case MyDslPackage.CONSTANT__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case MyDslPackage.CONSTANT__NULL:
        return NULL_EDEFAULT == null ? null_ != null : !NULL_EDEFAULT.equals(null_);
      case MyDslPackage.CONSTANT__INFINITY:
        return INFINITY_EDEFAULT == null ? infinity != null : !INFINITY_EDEFAULT.equals(infinity);
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
    result.append(" (Integer: ");
    result.append(integer);
    result.append(", String: ");
    result.append(string);
    result.append(", Null: ");
    result.append(null_);
    result.append(", Infinity: ");
    result.append(infinity);
    result.append(')');
    return result.toString();
  }

} //constantImpl
