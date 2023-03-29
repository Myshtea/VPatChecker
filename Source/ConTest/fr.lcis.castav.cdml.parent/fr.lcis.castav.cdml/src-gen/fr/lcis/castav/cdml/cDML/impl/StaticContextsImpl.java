/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdml.cDML.impl;

import fr.lcis.castav.cdml.cDML.CDMLPackage;
import fr.lcis.castav.cdml.cDML.StaticContext;
import fr.lcis.castav.cdml.cDML.StaticContexts;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Contexts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.cdml.cDML.impl.StaticContextsImpl#getStaticContexts <em>Static Contexts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticContextsImpl extends MinimalEObjectImpl.Container implements StaticContexts
{
  /**
   * The cached value of the '{@link #getStaticContexts() <em>Static Contexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticContexts()
   * @generated
   * @ordered
   */
  protected EList<StaticContext> staticContexts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaticContextsImpl()
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
    return CDMLPackage.Literals.STATIC_CONTEXTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StaticContext> getStaticContexts()
  {
    if (staticContexts == null)
    {
      staticContexts = new EObjectContainmentEList<StaticContext>(StaticContext.class, this, CDMLPackage.STATIC_CONTEXTS__STATIC_CONTEXTS);
    }
    return staticContexts;
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
      case CDMLPackage.STATIC_CONTEXTS__STATIC_CONTEXTS:
        return ((InternalEList<?>)getStaticContexts()).basicRemove(otherEnd, msgs);
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
      case CDMLPackage.STATIC_CONTEXTS__STATIC_CONTEXTS:
        return getStaticContexts();
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
      case CDMLPackage.STATIC_CONTEXTS__STATIC_CONTEXTS:
        getStaticContexts().clear();
        getStaticContexts().addAll((Collection<? extends StaticContext>)newValue);
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
      case CDMLPackage.STATIC_CONTEXTS__STATIC_CONTEXTS:
        getStaticContexts().clear();
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
      case CDMLPackage.STATIC_CONTEXTS__STATIC_CONTEXTS:
        return staticContexts != null && !staticContexts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StaticContextsImpl
