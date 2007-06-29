/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Laurens Fridael
 *   Martin Taal
 * </copyright>
 *
 * $Id: XmlElementToEStructuralFeatureMapper.java,v 1.1 2007/06/29 07:31:47 mtaal Exp $
 */

package org.eclipse.emf.teneo.annotations.xml;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.teneo.annotations.StoreAnnotationsException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Helper class used internally for mapping XML element names to EStructuralFeature names.
 * 
 * @author <a href="lmfridael@elver.org">Laurens Fridael</a>
 * 
 */
class XmlElementToEStructuralFeatureMapper {
	private Map<String, String> eStructuralFeatureNamesByXmlElementName = new HashMap<String, String>();

	private String xmlElementName;

	private boolean appInfoValue;

	XmlElementToEStructuralFeatureMapper(InputStream schema) {
		try {
			final SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
			saxParserFactory.setNamespaceAware(true);
			final SAXParser saxParser = saxParserFactory.newSAXParser();
			saxParser.parse(this.getClass().getResourceAsStream("persistence-mapping.xsd"), new XmlContentHandler());
		} catch (Exception e) {
			throw new StoreAnnotationsException("Exception while parsing xsd", e);
		}
	}

	private class XmlContentHandler extends DefaultHandler {

		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
			if (localName.equals("attribute") || localName.equals("element")) {
				xmlElementName = attributes.getValue("name");
			} else if (localName.equals("appinfo")
					&& PersistenceMappingSchemaGenerator.ESTRUCTURAL_FEATURE_SOURCE_NAME.equals(attributes
							.getValue("source"))) {
				appInfoValue = true;
			}
		}

		public void characters(char[] ch, int start, int length) throws SAXException {
			if (appInfoValue && xmlElementName != null) {
				final String eStructuralFeatureName = new String(ch, start, length).trim();
				if (eStructuralFeatureName.length() > 0
						&& !eStructuralFeatureNamesByXmlElementName.containsKey(xmlElementName)) {
					eStructuralFeatureNamesByXmlElementName.put(xmlElementName, eStructuralFeatureName);
					appInfoValue = false;
					xmlElementName = null;
				}
			}
		}
	}

	public String getEStructuralFeatureName(String xmlElementName) {
		return (String) eStructuralFeatureNamesByXmlElementName.get(xmlElementName);
	}
}
