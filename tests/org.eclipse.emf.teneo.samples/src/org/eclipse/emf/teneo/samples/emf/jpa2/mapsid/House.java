/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.teneo.samples.emf.jpa2.mapsid;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.House#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.House#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getHouse()
 * @model extendedMetaData="name='House' kind='elementOnly'"
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #setId(long)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getHouse_Id()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Long" required="true"
	 *        annotation="teneo.jpa appinfo='@Id'"
	 *        extendedMetaData="kind='element' name='id'"
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.House#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Unsets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.House#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.House#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(long)
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.MapsidPackage#getHouse_Address()
	 * @model required="true"
	 *        annotation="teneo.jpa appinfo='@MapsId'"
	 *        extendedMetaData="kind='element' name='address'"
	 * @generated
	 */
	Address getAddress();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.jpa2.mapsid.House#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(Address value);

} // House
