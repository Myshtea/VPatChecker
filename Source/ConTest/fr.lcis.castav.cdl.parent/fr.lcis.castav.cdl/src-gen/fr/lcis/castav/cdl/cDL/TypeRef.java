/**
 * generated by Xtext 2.29.0
 */
package fr.lcis.castav.cdl.cDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.lcis.castav.cdl.cDL.TypeRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see fr.lcis.castav.cdl.cDL.CDLPackage#getTypeRef()
 * @model
 * @generated
 */
public interface TypeRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(DefinedType)
   * @see fr.lcis.castav.cdl.cDL.CDLPackage#getTypeRef_Ref()
   * @model
   * @generated
   */
  DefinedType getRef();

  /**
   * Sets the value of the '{@link fr.lcis.castav.cdl.cDL.TypeRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(DefinedType value);

} // TypeRef
