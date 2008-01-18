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
 *   Martin Taal
 *   Davide Marchignoli
 * </copyright>
 *
 * $Id: HbAnnotationUtil.java,v 1.2 2008/01/18 06:21:37 mtaal Exp $
 */

package org.eclipse.emf.teneo.hibernate.annotations;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.eclipse.emf.teneo.annotations.mapper.AbstractAnnotator;
import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEReference;
import org.eclipse.emf.teneo.hibernate.hbannotation.HbannotationFactory;
import org.eclipse.emf.teneo.hibernate.hbannotation.Index;
import org.eclipse.emf.teneo.hibernate.hbmodel.HbAnnotatedEReference;

/**
 * Some utility methods.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.2 $
 */

public class HbAnnotationUtil {

	// The logger
	protected static final Log log = LogFactory.getLog(HbAnnotationUtil.class);

	/** Adds an index */
	public static void setIndex(PAnnotatedEReference aReference, AbstractAnnotator annotator) {
		final String indexName =
				annotator.getEntityName(aReference.getModelEReference().getEContainingClass()) + "_" +
						aReference.getModelEReference().getName();
		final HbAnnotatedEReference haReference = (HbAnnotatedEReference) aReference;
		if (haReference.getHbIndex() == null) {
			final Index index = HbannotationFactory.eINSTANCE.createIndex();
			index.setName(indexName);
			haReference.setHbIndex(index);
		} else {
			final Index index = haReference.getHbIndex();
			if (index.getName() != null && index.getName().length() > 0) {
				index.setName(index.getName() + ",");
			}
			index.setName(index.getName() + indexName);
		}
	}

}
