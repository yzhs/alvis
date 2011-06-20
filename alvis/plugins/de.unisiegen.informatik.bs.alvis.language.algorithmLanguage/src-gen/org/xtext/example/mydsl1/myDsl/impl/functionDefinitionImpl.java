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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl1.myDsl.MyDslPackage;
import org.xtext.example.mydsl1.myDsl.block;
import org.xtext.example.mydsl1.myDsl.formalParams;
import org.xtext.example.mydsl1.myDsl.functionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.functionDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.functionDefinitionImpl#getFormalParams <em>Formal Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.functionDefinitionImpl#getIds <em>Ids</em>}</li>
 *   <li>{@link org.xtext.example.mydsl1.myDsl.impl.functionDefinitionImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class functionDefinitionImpl extends MinimalEObjectImpl.Container implements functionDefinition
{
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
   * The cached value of the '{@link #getFormalParams() <em>Formal Params</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalParams()
   * @generated
   * @ordered
   */
  protected formalParams formalParams;

  /**
   * The cached value of the '{@link #getIds() <em>Ids</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIds()
   * @generated
   * @ordered
   */
  protected EList<String> ids;

  /**
   * The cached value of the '{@link #getBlocks() <em>Blocks</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBlocks()
   * @generated
   * @ordered
   */
  protected EList<block> blocks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected functionDefinitionImpl()
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
    return MyDslPackage.Literals.FUNCTION_DEFINITION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION_DEFINITION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public formalParams getFormalParams()
  {
    return formalParams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormalParams(formalParams newFormalParams, NotificationChain msgs)
  {
    formalParams oldFormalParams = formalParams;
    formalParams = newFormalParams;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS, oldFormalParams, newFormalParams);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormalParams(formalParams newFormalParams)
  {
    if (newFormalParams != formalParams)
    {
      NotificationChain msgs = null;
      if (formalParams != null)
        msgs = ((InternalEObject)formalParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS, null, msgs);
      if (newFormalParams != null)
        msgs = ((InternalEObject)newFormalParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS, null, msgs);
      msgs = basicSetFormalParams(newFormalParams, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS, newFormalParams, newFormalParams));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIds()
  {
    if (ids == null)
    {
      ids = new EDataTypeEList<String>(String.class, this, MyDslPackage.FUNCTION_DEFINITION__IDS);
    }
    return ids;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<block> getBlocks()
  {
    if (blocks == null)
    {
      blocks = new EObjectContainmentEList<block>(block.class, this, MyDslPackage.FUNCTION_DEFINITION__BLOCKS);
    }
    return blocks;
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
      case MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS:
        return basicSetFormalParams(null, msgs);
      case MyDslPackage.FUNCTION_DEFINITION__BLOCKS:
        return ((InternalEList<?>)getBlocks()).basicRemove(otherEnd, msgs);
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
      case MyDslPackage.FUNCTION_DEFINITION__NAME:
        return getName();
      case MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS:
        return getFormalParams();
      case MyDslPackage.FUNCTION_DEFINITION__IDS:
        return getIds();
      case MyDslPackage.FUNCTION_DEFINITION__BLOCKS:
        return getBlocks();
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
      case MyDslPackage.FUNCTION_DEFINITION__NAME:
        setName((String)newValue);
        return;
      case MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS:
        setFormalParams((formalParams)newValue);
        return;
      case MyDslPackage.FUNCTION_DEFINITION__IDS:
        getIds().clear();
        getIds().addAll((Collection<? extends String>)newValue);
        return;
      case MyDslPackage.FUNCTION_DEFINITION__BLOCKS:
        getBlocks().clear();
        getBlocks().addAll((Collection<? extends block>)newValue);
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
      case MyDslPackage.FUNCTION_DEFINITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS:
        setFormalParams((formalParams)null);
        return;
      case MyDslPackage.FUNCTION_DEFINITION__IDS:
        getIds().clear();
        return;
      case MyDslPackage.FUNCTION_DEFINITION__BLOCKS:
        getBlocks().clear();
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
      case MyDslPackage.FUNCTION_DEFINITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MyDslPackage.FUNCTION_DEFINITION__FORMAL_PARAMS:
        return formalParams != null;
      case MyDslPackage.FUNCTION_DEFINITION__IDS:
        return ids != null && !ids.isEmpty();
      case MyDslPackage.FUNCTION_DEFINITION__BLOCKS:
        return blocks != null && !blocks.isEmpty();
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
    result.append(", ids: ");
    result.append(ids);
    result.append(')');
    return result.toString();
  }

} //functionDefinitionImpl
