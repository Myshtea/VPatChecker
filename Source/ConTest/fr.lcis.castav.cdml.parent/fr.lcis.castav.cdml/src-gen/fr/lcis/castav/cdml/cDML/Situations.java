/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdml.cDML;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Situations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.cdml.cDML.Situations#getSituations <em>Situations</em>}</li>
 * </ul>
 *
 * @see fr.lcis.castav.cdml.cDML.CDMLPackage#getSituations()
 * @model
 * @generated
 */
public interface Situations extends EObject
{
  /**
   * Returns the value of the '<em><b>Situations</b></em>' containment reference list.
   * The list contents are of type {@link fr.lcis.castav.cdml.cDML.Situation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Situations</em>' containment reference list.
   * @see fr.lcis.castav.cdml.cDML.CDMLPackage#getSituations_Situations()
   * @model containment="true"
   * @generated
   */
  EList<Situation> getSituations();

} // Situations
