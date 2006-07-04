/**
 * <copyright>
 * </copyright>
 *
 * $Id: PrimaryKeyJoinColumn.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Primary Key Join Column</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPrimaryKeyJoinColumn()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EClass' 1='EReference'"
 *        annotation="http://annotation.elver.org/internal/Collection name='PrimaryKeyJoinColumns'"
 * @generated
 */
public interface PrimaryKeyJoinColumn extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPrimaryKeyJoinColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Column Definition</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Definition</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Column Definition</em>' attribute.
	 * @see #setColumnDefinition(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPrimaryKeyJoinColumn_ColumnDefinition()
	 * @model
	 * @generated
	 */
	String getColumnDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getColumnDefinition <em>Column Definition</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Column Definition</em>' attribute.
	 * @see #getColumnDefinition()
	 * @generated
	 */
	void setColumnDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Referenced Column Name</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Column Name</em>' attribute isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Referenced Column Name</em>' attribute.
	 * @see #setReferencedColumnName(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPrimaryKeyJoinColumn_ReferencedColumnName()
	 * @model
	 * @generated
	 */
	String getReferencedColumnName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.PrimaryKeyJoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Referenced Column Name</em>' attribute.
	 * @see #getReferencedColumnName()
	 * @generated
	 */
	void setReferencedColumnName(String value);

} // PrimaryKeyJoinColumn
