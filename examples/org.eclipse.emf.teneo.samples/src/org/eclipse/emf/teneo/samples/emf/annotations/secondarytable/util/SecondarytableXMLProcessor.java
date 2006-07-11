/**
 * <copyright>
 * </copyright>
 *
 * $Id: SecondarytableXMLProcessor.java,v 1.1 2006/07/11 16:57:17 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.secondarytable.SecondarytablePackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondarytableXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondarytableXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		SecondarytablePackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the SecondarytableResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new SecondarytableResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new SecondarytableResourceFactoryImpl());
		}
		return registrations;
	}

} //SecondarytableXMLProcessor
