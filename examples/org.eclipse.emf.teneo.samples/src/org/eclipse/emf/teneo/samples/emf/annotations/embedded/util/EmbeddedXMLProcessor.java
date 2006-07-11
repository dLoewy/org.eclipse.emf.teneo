/**
 * <copyright>
 * </copyright>
 *
 * $Id: EmbeddedXMLProcessor.java,v 1.1 2006/07/11 16:57:10 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.embedded.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.eclipse.emf.teneo.samples.emf.annotations.embedded.EmbeddedPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmbeddedXMLProcessor extends XMLProcessor {
	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		EmbeddedPackage.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the EmbeddedResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new EmbeddedResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new EmbeddedResourceFactoryImpl());
		}
		return registrations;
	}

} //EmbeddedXMLProcessor
