/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdml.cDML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.cdml.cDML.Transition#getOn <em>On</em>}</li>
 *   <li>{@link fr.lcis.castav.cdml.cDML.Transition#isExternal <em>External</em>}</li>
 *   <li>{@link fr.lcis.castav.cdml.cDML.Transition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see fr.lcis.castav.cdml.cDML.CDMLPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>On</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>On</em>' containment reference.
   * @see #setOn(Event)
   * @see fr.lcis.castav.cdml.cDML.CDMLPackage#getTransition_On()
   * @model containment="true"
   * @generated
   */
  Event getOn();

  /**
   * Sets the value of the '{@link fr.lcis.castav.cdml.cDML.Transition#getOn <em>On</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>On</em>' containment reference.
   * @see #getOn()
   * @generated
   */
  void setOn(Event value);

  /**
   * Returns the value of the '<em><b>External</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>External</em>' attribute.
   * @see #setExternal(boolean)
   * @see fr.lcis.castav.cdml.cDML.CDMLPackage#getTransition_External()
   * @model
   * @generated
   */
  boolean isExternal();

  /**
   * Sets the value of the '{@link fr.lcis.castav.cdml.cDML.Transition#isExternal <em>External</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External</em>' attribute.
   * @see #isExternal()
   * @generated
   */
  void setExternal(boolean value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(State)
   * @see fr.lcis.castav.cdml.cDML.CDMLPackage#getTransition_Target()
   * @model
   * @generated
   */
  State getTarget();

  /**
   * Sets the value of the '{@link fr.lcis.castav.cdml.cDML.Transition#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(State value);

} // Transition