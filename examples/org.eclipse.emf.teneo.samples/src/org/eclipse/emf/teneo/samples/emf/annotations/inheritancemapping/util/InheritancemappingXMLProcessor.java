/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritancemappingXMLProcessor.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InheritancemappingXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritancemappingXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		InheritancemappingPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the InheritancemappingResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new InheritancemappingResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new InheritancemappingResourceFactoryImpl());
		}
		return registrations;
	}

} //InheritancemappingXMLProcessor
