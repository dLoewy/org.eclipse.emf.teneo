/**
 * <copyright>
 * </copyright>
 *
 * $Id: Fetch.java,v 1.3 2007/02/01 12:35:55 mtaal Exp $
 */
package org.eclipse.emf.teneo.hibernate.hbannotation;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fetch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.hibernate.hbannotation.Fetch#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getFetch()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EStructuralFeature'"
 * @generated
 */
public interface Fetch extends HbAnnotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public\nLicense v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n   Martin Taal\n   Douglas Bitting\n";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType
	 * @see #setValue(HbFetchType)
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbAnnotationPackage#getFetch_Value()
	 * @model
	 * @generated
	 */
	HbFetchType getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.hibernate.hbannotation.Fetch#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see org.eclipse.emf.teneo.hibernate.hbannotation.HbFetchType
	 * @see #getValue()
	 * @generated
	 */
	void setValue(HbFetchType value);

} // Fetch