/**
 * <copyright>
 * </copyright>
 *
 * $Id: JoinColumn.java,v 1.1 2006/07/04 21:37:01 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Join Column</b></em>'. <!-- end-user-doc
 * -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getName <em>Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isUnique <em>Unique</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isNullable <em>Nullable</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isInsertable <em>Insertable</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isUpdatable <em>Updatable</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getColumnDefinition <em>Column Definition</em>}</li>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EClass' 1='EReference'"
 *        annotation="http://annotation.elver.org/internal/Collection name='JoinColumns'"
 * @generated
 */
public interface JoinColumn extends PAnnotation {
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
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getName <em>Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Unique</b></em>' attribute. The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Unique</em>' attribute.
	 * @see #setUnique(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn_Unique()
	 * @model default="false"
	 * @generated
	 */
	boolean isUnique();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isUnique <em>Unique</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Unique</em>' attribute.
	 * @see #isUnique()
	 * @generated
	 */
	void setUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>Nullable</b></em>' attribute. The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nullable</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nullable</em>' attribute.
	 * @see #setNullable(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn_Nullable()
	 * @model default="true"
	 * @generated
	 */
	boolean isNullable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isNullable <em>Nullable</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Nullable</em>' attribute.
	 * @see #isNullable()
	 * @generated
	 */
	void setNullable(boolean value);

	/**
	 * Returns the value of the '<em><b>Insertable</b></em>' attribute. The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertable</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Insertable</em>' attribute.
	 * @see #setInsertable(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn_Insertable()
	 * @model default="true"
	 * @generated
	 */
	boolean isInsertable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isInsertable <em>Insertable</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Insertable</em>' attribute.
	 * @see #isInsertable()
	 * @generated
	 */
	void setInsertable(boolean value);

	/**
	 * Returns the value of the '<em><b>Updatable</b></em>' attribute. The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Updatable</em>' attribute isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Updatable</em>' attribute.
	 * @see #setUpdatable(boolean)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn_Updatable()
	 * @model default="true"
	 * @generated
	 */
	boolean isUpdatable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#isUpdatable <em>Updatable</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Updatable</em>' attribute.
	 * @see #isUpdatable()
	 * @generated
	 */
	void setUpdatable(boolean value);

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
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn_ColumnDefinition()
	 * @model
	 * @generated
	 */
	String getColumnDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getColumnDefinition <em>Column Definition</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Column Definition</em>' attribute.
	 * @see #getColumnDefinition()
	 * @generated
	 */
	void setColumnDefinition(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn_Table()
	 * @model
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getTable <em>Table</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

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
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getJoinColumn_ReferencedColumnName()
	 * @model
	 * @generated
	 */
	String getReferencedColumnName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.annotations.pannotation.JoinColumn#getReferencedColumnName <em>Referenced Column Name</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Referenced Column Name</em>' attribute.
	 * @see #getReferencedColumnName()
	 * @generated
	 */
	void setReferencedColumnName(String value);

} // JoinColumn
