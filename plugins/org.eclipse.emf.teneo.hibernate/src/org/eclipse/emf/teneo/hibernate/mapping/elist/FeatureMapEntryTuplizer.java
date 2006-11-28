/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: FeatureMapEntryTuplizer.java,v 1.6 2006/11/28 06:14:04 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.mapping.elist;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.teneo.Constants;
import org.eclipse.emf.teneo.hibernate.HbDataStore;
import org.eclipse.emf.teneo.hibernate.HbHelper;
import org.eclipse.emf.teneo.hibernate.HbMapperException;
import org.eclipse.emf.teneo.hibernate.HbUtil;
import org.eclipse.emf.teneo.hibernate.mapper.HbMapperConstants;
import org.eclipse.emf.teneo.hibernate.tuplizer.EMFTuplizer;
import org.eclipse.emf.teneo.util.StoreUtil;
import org.hibernate.mapping.PersistentClass;
import org.hibernate.mapping.Property;
import org.hibernate.property.PropertyAccessor;
import org.hibernate.tuple.entity.EntityMetamodel;
import org.hibernate.tuple.Instantiator;

/**
 * Tuplizer for feature map entries. These types are mapped using the dynamic capabilities of Hibernate.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */

public class FeatureMapEntryTuplizer extends EMFTuplizer {

	/** The logger */
	private static Log log = LogFactory.getLog(FeatureMapEntryTuplizer.class);

	/** Constructor */
	public FeatureMapEntryTuplizer(EntityMetamodel entityMetamodel, PersistentClass mappedEntity) {
		super(entityMetamodel, mappedEntity);
	}

	/** Creates an EMF Instantiator */
	protected Instantiator buildInstantiator(PersistentClass persistentClass) {
		return new FeatureMapEntryInstantiator(persistentClass);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.EntityTuplizer#getConcreteProxyClass()
	 */
	public Class getConcreteProxyClass() {
		return EObject.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.hibernate.tuple.Tuplizer#getMappedClass()
	 */
	public Class getMappedClass() {
		return EObject.class;
	}

	/** Returns the correct accessor on the basis of the type of property */
	protected PropertyAccessor getPropertyAccessor(Property mappedProperty, PersistentClass pc) {
		final HbDataStore hds = HbHelper.INSTANCE.getDataStore(pc);
		final String versionPropertyName = hds.getPersistenceOptions().getVersionColumnName();
		if (mappedProperty.getName().compareToIgnoreCase(versionPropertyName) == 0) {
			return hds.getHbContext().createVersionAccessor();
		} else if (mappedProperty.getName().compareToIgnoreCase(HbMapperConstants.PROPERTY_FEATURE) == 0) {
			return hds.getHbContext().createFeatureMapEntryFeatureURIAccessor();
		} else if (mappedProperty.getName().compareToIgnoreCase(HbMapperConstants.PROPERTY_MIXED_CDATA) == 0) {
			return hds.getHbContext().createFeatureMapEntryAccessor(Constants.CDATA);
		} else if (mappedProperty.getName().compareToIgnoreCase(HbMapperConstants.PROPERTY_MIXED_COMMENT) == 0) {
			return hds.getHbContext().createFeatureMapEntryAccessor(Constants.COMMENT);
		} else if (mappedProperty.getName().compareToIgnoreCase(HbMapperConstants.PROPERTY_MIXED_TEXT) == 0) {
			return hds.getHbContext().createFeatureMapEntryAccessor(Constants.TEXT);
		}

		final HbDataStore ds = HbHelper.INSTANCE.getDataStore(pc);
		final String eclassUri = HbUtil.getEClassNameFromFeatureMapMeta(pc);
		final EClass eClass = ds.getPersistenceOptions().getEClassNameStrategy().toEClass(eclassUri, ds.getEPackages());
		final EStructuralFeature efeature = StoreUtil.getEStructuralFeature(eClass, mappedProperty.getName());

		if (efeature == null) {
			throw new HbMapperException("Feature not found for entity/property " + pc.getEntityName() + "/"
					+ mappedProperty.getName());
		}

		log.debug("Creating property accessor for " + mappedProperty.getName() + "/" + pc.getEntityName() + "/"
				+ eclassUri + "/" + efeature.getName());

		return hds.getHbContext().createFeatureMapEntryAccessor(efeature);
	}
}