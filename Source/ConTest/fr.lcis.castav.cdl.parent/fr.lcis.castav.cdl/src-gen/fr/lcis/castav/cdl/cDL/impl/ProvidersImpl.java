/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdl.cDL.impl;

import fr.lcis.castav.cdl.cDL.CDLPackage;
import fr.lcis.castav.cdl.cDL.Provider;
import fr.lcis.castav.cdl.cDL.Providers;

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
 * An implementation of the model object '<em><b>Providers</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.cdl.cDL.impl.ProvidersImpl#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProvidersImpl extends MinimalEObjectImpl.Container implements Providers
{
  /**
   * The cached value of the '{@link #getProviders() <em>Providers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProviders()
   * @generated
   * @ordered
   */
  protected EList<Provider> providers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProvidersImpl()
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
    return CDLPackage.Literals.PROVIDERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Provider> getProviders()
  {
    if (providers == null)
    {
      providers = new EObjectContainmentEList<Provider>(Provider.class, this, CDLPackage.PROVIDERS__PROVIDERS);
    }
    return providers;
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
      case CDLPackage.PROVIDERS__PROVIDERS:
        return ((InternalEList<?>)getProviders()).basicRemove(otherEnd, msgs);
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
      case CDLPackage.PROVIDERS__PROVIDERS:
        return getProviders();
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
      case CDLPackage.PROVIDERS__PROVIDERS:
        getProviders().clear();
        getProviders().addAll((Collection<? extends Provider>)newValue);
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
      case CDLPackage.PROVIDERS__PROVIDERS:
        getProviders().clear();
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
      case CDLPackage.PROVIDERS__PROVIDERS:
        return providers != null && !providers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProvidersImpl
