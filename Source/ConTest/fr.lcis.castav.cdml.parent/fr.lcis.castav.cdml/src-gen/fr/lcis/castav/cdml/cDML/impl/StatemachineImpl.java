/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdml.cDML.impl;

import fr.lcis.castav.cdml.cDML.CDMLPackage;
import fr.lcis.castav.cdml.cDML.Permission;
import fr.lcis.castav.cdml.cDML.State;
import fr.lcis.castav.cdml.cDML.Statemachine;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statemachine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.cdml.cDML.impl.StatemachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.lcis.castav.cdml.cDML.impl.StatemachineImpl#isExported <em>Exported</em>}</li>
 *   <li>{@link fr.lcis.castav.cdml.cDML.impl.StatemachineImpl#getPermission <em>Permission</em>}</li>
 *   <li>{@link fr.lcis.castav.cdml.cDML.impl.StatemachineImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatemachineImpl extends MinimalEObjectImpl.Container implements Statemachine
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
   * The default value of the '{@link #isExported() <em>Exported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExported()
   * @generated
   * @ordered
   */
  protected static final boolean EXPORTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExported() <em>Exported</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExported()
   * @generated
   * @ordered
   */
  protected boolean exported = EXPORTED_EDEFAULT;

  /**
   * The cached value of the '{@link #getPermission() <em>Permission</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPermission()
   * @generated
   * @ordered
   */
  protected Permission permission;

  /**
   * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStates()
   * @generated
   * @ordered
   */
  protected EList<State> states;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StatemachineImpl()
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
    return CDMLPackage.Literals.STATEMACHINE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDMLPackage.STATEMACHINE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isExported()
  {
    return exported;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExported(boolean newExported)
  {
    boolean oldExported = exported;
    exported = newExported;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDMLPackage.STATEMACHINE__EXPORTED, oldExported, exported));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Permission getPermission()
  {
    return permission;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPermission(Permission newPermission, NotificationChain msgs)
  {
    Permission oldPermission = permission;
    permission = newPermission;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CDMLPackage.STATEMACHINE__PERMISSION, oldPermission, newPermission);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPermission(Permission newPermission)
  {
    if (newPermission != permission)
    {
      NotificationChain msgs = null;
      if (permission != null)
        msgs = ((InternalEObject)permission).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CDMLPackage.STATEMACHINE__PERMISSION, null, msgs);
      if (newPermission != null)
        msgs = ((InternalEObject)newPermission).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CDMLPackage.STATEMACHINE__PERMISSION, null, msgs);
      msgs = basicSetPermission(newPermission, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDMLPackage.STATEMACHINE__PERMISSION, newPermission, newPermission));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<State> getStates()
  {
    if (states == null)
    {
      states = new EObjectContainmentEList<State>(State.class, this, CDMLPackage.STATEMACHINE__STATES);
    }
    return states;
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
      case CDMLPackage.STATEMACHINE__PERMISSION:
        return basicSetPermission(null, msgs);
      case CDMLPackage.STATEMACHINE__STATES:
        return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
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
      case CDMLPackage.STATEMACHINE__NAME:
        return getName();
      case CDMLPackage.STATEMACHINE__EXPORTED:
        return isExported();
      case CDMLPackage.STATEMACHINE__PERMISSION:
        return getPermission();
      case CDMLPackage.STATEMACHINE__STATES:
        return getStates();
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
      case CDMLPackage.STATEMACHINE__NAME:
        setName((String)newValue);
        return;
      case CDMLPackage.STATEMACHINE__EXPORTED:
        setExported((Boolean)newValue);
        return;
      case CDMLPackage.STATEMACHINE__PERMISSION:
        setPermission((Permission)newValue);
        return;
      case CDMLPackage.STATEMACHINE__STATES:
        getStates().clear();
        getStates().addAll((Collection<? extends State>)newValue);
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
      case CDMLPackage.STATEMACHINE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case CDMLPackage.STATEMACHINE__EXPORTED:
        setExported(EXPORTED_EDEFAULT);
        return;
      case CDMLPackage.STATEMACHINE__PERMISSION:
        setPermission((Permission)null);
        return;
      case CDMLPackage.STATEMACHINE__STATES:
        getStates().clear();
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
      case CDMLPackage.STATEMACHINE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case CDMLPackage.STATEMACHINE__EXPORTED:
        return exported != EXPORTED_EDEFAULT;
      case CDMLPackage.STATEMACHINE__PERMISSION:
        return permission != null;
      case CDMLPackage.STATEMACHINE__STATES:
        return states != null && !states.isEmpty();
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", exported: ");
    result.append(exported);
    result.append(')');
    return result.toString();
  }

} //StatemachineImpl