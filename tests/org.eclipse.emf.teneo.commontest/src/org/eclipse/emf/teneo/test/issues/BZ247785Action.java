/**
 * <copyright>
 *
 * Copyright (c) 2005, 2006, 2007, 2008 Springsite BV (The Netherlands) and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Martin Taal
 * </copyright>
 *
 * $Id: BZ247785Action.java,v 1.1 2008/09/20 21:20:11 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.teneo.samples.issues.bz247785.Bz247785Factory;
import org.eclipse.emf.teneo.samples.issues.bz247785.Bz247785Package;
import org.eclipse.emf.teneo.samples.issues.bz247785.Owner;
import org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Animal;
import org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Bz247785SubFactory;
import org.eclipse.emf.teneo.samples.issues.bz247785.bz247785Sub.Cat;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.stores.TestStore;

/**
 * Testcase for bugzilla 247939
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.1 $
 */
public class BZ247785Action extends AbstractTestAction {
	public BZ247785Action() {
		super(new EPackage[] { Bz247785Package.eINSTANCE });
	}

	@Override
	public void doAction(TestStore store) {
		final Bz247785Factory factory = Bz247785Factory.eINSTANCE;
		{
			store.beginTransaction();
			final Owner o = factory.createOwner();
			o.setName("n1");
			store.store(o);
			for (int i = 0; i < 10; i++) {
				final Cat c = Bz247785SubFactory.eINSTANCE.createCat();
				c.setOwner(o);
				store.store(c);
			}
			for (int i = 0; i < 10; i++) {
				final Animal a = Bz247785SubFactory.eINSTANCE.createAnimal();
				store.store(a);
			}
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			store.checkNumber(Cat.class, 10);
			store.checkNumber(Animal.class, 20);
			store.checkNumber(Owner.class, 1);
			store.commitTransaction();
		}
	}
}