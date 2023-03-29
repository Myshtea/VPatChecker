/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.vpat.vPAT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.vpat.vPAT.Parameter#getOrigin <em>Origin</em>}</li>
 *   <li>{@link fr.lcis.castav.vpat.vPAT.Parameter#isStatic <em>Static</em>}</li>
 *   <li>{@link fr.lcis.castav.vpat.vPAT.Parameter#isAnyValue <em>Any Value</em>}</li>
 *   <li>{@link fr.lcis.castav.vpat.vPAT.Parameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.lcis.castav.vpat.vPAT.VPATPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Origin</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Origin</em>' reference.
   * @see #setOrigin(Function)
   * @see fr.lcis.castav.vpat.vPAT.VPATPackage#getParameter_Origin()
   * @model
   * @generated
   */
  Function getOrigin();

  /**
   * Sets the value of the '{@link fr.lcis.castav.vpat.vPAT.Parameter#getOrigin <em>Origin</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Origin</em>' reference.
   * @see #getOrigin()
   * @generated
   */
  void setOrigin(Function value);

  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see fr.lcis.castav.vpat.vPAT.VPATPackage#getParameter_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link fr.lcis.castav.vpat.vPAT.Parameter#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Any Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Any Value</em>' attribute.
   * @see #setAnyValue(boolean)
   * @see fr.lcis.castav.vpat.vPAT.VPATPackage#getParameter_AnyValue()
   * @model
   * @generated
   */
  boolean isAnyValue();

  /**
   * Sets the value of the '{@link fr.lcis.castav.vpat.vPAT.Parameter#isAnyValue <em>Any Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Any Value</em>' attribute.
   * @see #isAnyValue()
   * @generated
   */
  void setAnyValue(boolean value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see fr.lcis.castav.vpat.vPAT.VPATPackage#getParameter_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link fr.lcis.castav.vpat.vPAT.Parameter#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // Parameter
