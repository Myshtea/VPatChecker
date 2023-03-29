/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdl.cDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Providers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.cdl.cDL.Providers#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @see fr.lcis.castav.cdl.cDL.CDLPackage#getProviders()
 * @model
 * @generated
 */
public interface Providers extends EObject
{
  /**
   * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
   * The list contents are of type {@link fr.lcis.castav.cdl.cDL.Provider}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Providers</em>' containment reference list.
   * @see fr.lcis.castav.cdl.cDL.CDLPackage#getProviders_Providers()
   * @model containment="true"
   * @generated
   */
  EList<Provider> getProviders();

} // Providers