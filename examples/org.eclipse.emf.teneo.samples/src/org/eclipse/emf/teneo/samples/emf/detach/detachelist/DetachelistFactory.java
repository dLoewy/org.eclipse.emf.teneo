/**
 * <copyright>
 * </copyright>
 *
 * $Id: DetachelistFactory.java,v 1.1 2006/07/11 16:57:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.detach.detachelist;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.detach.detachelist.DetachelistPackage
 * @generated
 */
public interface DetachelistFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DetachelistFactory eINSTANCE = new org.eclipse.emf.teneo.samples.emf.detach.detachelist.impl.DetachelistFactoryImpl();

	/**
	 * Returns a new object of class '<em>Contacts</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contacts</em>'.
	 * @generated
	 */
	Contacts createContacts();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DetachelistPackage getDetachelistPackage();

} //DetachelistFactory
