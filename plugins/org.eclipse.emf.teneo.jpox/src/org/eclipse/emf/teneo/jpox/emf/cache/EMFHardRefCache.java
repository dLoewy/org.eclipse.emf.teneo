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
 * $Id: EMFHardRefCache.java,v 1.2 2006/08/22 22:23:29 mtaal Exp $
 */

package org.eclipse.emf.teneo.jpox.emf.cache;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.teneo.jpox.emf.JpoxUtil;
import org.jpox.cache.HardRefCache;

/**
 * Implementation of cache to add econtainer control for new objects.
 * 
 * @see java.lang.ref.WeakReference
 * @version $Revision: 1.2 $
 */
public class EMFHardRefCache extends HardRefCache {
	/** Is overridden to repair econtainer references for new objects */
	public Object put(Object key, Object value) {
		JpoxUtil.repairContainer(value);
		return super.put(key, value);
	}

	/** Is overridden to repair econtainer references */
	public void putAll(Map t) {
		final Iterator it = t.values().iterator();
		while (it.hasNext()) {
			JpoxUtil.repairContainer(it.next());
		}
		super.putAll(t);
	}
}