/**
 * <copyright>
 * </copyright>
 *
 * $Id: JournalGroup.java,v 1.2 2007/02/08 23:09:21 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.accounting;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Journal Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getJournalGroups <em>Journal Groups</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getJournalStatements <em>Journal Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalGroup()
 * @model extendedMetaData="name='JournalGroup' kind='elementOnly'"
 * @generated
 */
public interface JournalGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalGroup_Name()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Journal Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal Groups</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalGroup_JournalGroups()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalGroup" containment="true"
	 *        extendedMetaData="kind='element' name='journalGroups'"
	 * @generated
	 */
	EList<JournalGroup> getJournalGroups();

	/**
	 * Returns the value of the '<em><b>Journal Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Journal Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Journal Statements</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.accounting.AccountingPackage#getJournalGroup_JournalStatements()
	 * @model type="org.eclipse.emf.teneo.samples.emf.sample.accounting.JournalStatement" containment="true"
	 *        extendedMetaData="kind='element' name='journalStatements'"
	 * @generated
	 */
	EList<JournalStatement> getJournalStatements();

} // JournalGroup
