/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappedsuperclassFactory.java,v 1.4 2007/08/10 20:30:43 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.MappedsuperclassPackage
 * @generated
 */
public interface MappedsuperclassFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappedsuperclassFactory eINSTANCE = org.eclipse.emf.teneo.samples.emf.annotations.mappedsuperclass.impl.MappedsuperclassFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Add ID Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add ID Document</em>'.
	 * @generated
	 */
	AddIDDocument createAddIDDocument();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Parent Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parent Document</em>'.
	 * @generated
	 */
	ParentDocument createParentDocument();

	/**
	 * Returns a new object of class '<em>Specific Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Document</em>'.
	 * @generated
	 */
	SpecificDocument createSpecificDocument();

	/**
	 * Returns a new object of class '<em>Test Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Reference</em>'.
	 * @generated
	 */
	TestReference createTestReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MappedsuperclassPackage getMappedsuperclassPackage();

} //MappedsuperclassFactory
