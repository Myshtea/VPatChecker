/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdml.cDML.impl;

import fr.lcis.castav.cdml.cDML.AtomicState;
import fr.lcis.castav.cdml.cDML.CDMLPackage;
import fr.lcis.castav.cdml.cDML.Context;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.cdml.cDML.impl.AtomicStateImpl#isContextAware <em>Context Aware</em>}</li>
 *   <li>{@link fr.lcis.castav.cdml.cDML.impl.AtomicStateImpl#getContexts <em>Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AtomicStateImpl extends StateImpl implements AtomicState
{
  /**
   * The default value of the '{@link #isContextAware() <em>Context Aware</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isContextAware()
   * @generated
   * @ordered
   */
  protected static final boolean CONTEXT_AWARE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isContextAware() <em>Context Aware</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isContextAware()
   * @generated
   * @ordered
   */
  protected boolean contextAware = CONTEXT_AWARE_EDEFAULT;

  /**
   * The cached value of the '{@link #getContexts() <em>Contexts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContexts()
   * @generated
   * @ordered
   */
  protected EList<Context> contexts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicStateImpl()
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
    return CDMLPackage.Literals.ATOMIC_STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isContextAware()
  {
    return contextAware;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContextAware(boolean newContextAware)
  {
    boolean oldContextAware = contextAware;
    contextAware = newContextAware;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CDMLPackage.ATOMIC_STATE__CONTEXT_AWARE, oldContextAware, contextAware));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Context> getContexts()
  {
    if (contexts == null)
    {
      contexts = new EObjectResolvingEList<Context>(Context.class, this, CDMLPackage.ATOMIC_STATE__CONTEXTS);
    }
    return contexts;
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
      case CDMLPackage.ATOMIC_STATE__CONTEXT_AWARE:
        return isContextAware();
      case CDMLPackage.ATOMIC_STATE__CONTEXTS:
        return getContexts();
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
      case CDMLPackage.ATOMIC_STATE__CONTEXT_AWARE:
        setContextAware((Boolean)newValue);
        return;
      case CDMLPackage.ATOMIC_STATE__CONTEXTS:
        getContexts().clear();
        getContexts().addAll((Collection<? extends Context>)newValue);
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
      case CDMLPackage.ATOMIC_STATE__CONTEXT_AWARE:
        setContextAware(CONTEXT_AWARE_EDEFAULT);
        return;
      case CDMLPackage.ATOMIC_STATE__CONTEXTS:
        getContexts().clear();
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
      case CDMLPackage.ATOMIC_STATE__CONTEXT_AWARE:
        return contextAware != CONTEXT_AWARE_EDEFAULT;
      case CDMLPackage.ATOMIC_STATE__CONTEXTS:
        return contexts != null && !contexts.isEmpty();
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
    result.append(" (contextAware: ");
    result.append(contextAware);
    result.append(')');
    return result.toString();
  }

} //AtomicStateImpl
