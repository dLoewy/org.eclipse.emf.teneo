/**
 * <copyright>
 * </copyright>
 *
 * $Id: TypeWriter.java,v 1.2 2009/01/21 21:34:20 seberle Exp $
 */
package org.eclipse.emf.teneo.eclipselink.examples.library;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Writer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter#getMaker <em>Maker</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getTypeWriter()
 * @model
 * @generated
 */
public interface TypeWriter extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Maker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maker</em>' attribute.
	 * @see #setMaker(String)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getTypeWriter_Maker()
	 * @model
	 * @generated
	 */
	String getMaker();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter#getMaker <em>Maker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maker</em>' attribute.
	 * @see #getMaker()
	 * @generated
	 */
	void setMaker(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType
	 * @see #setType(TWriterType)
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.LibraryPackage#getTypeWriter_Type()
	 * @model
	 * @generated
	 */
	TWriterType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.eclipselink.examples.library.TypeWriter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.emf.teneo.eclipselink.examples.library.TWriterType
	 * @see #getType()
	 * @generated
	 */
	void setType(TWriterType value);

} // TypeWriter
