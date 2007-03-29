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
 * </copyright>
 *
 * $Id: MultipleInheritanceAction.java,v 1.6 2007/03/29 22:13:54 mtaal Exp $
 */

package org.eclipse.emf.teneo.test.issues;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.teneo.test.AbstractTestAction;
import org.eclipse.emf.teneo.test.StoreTestException;
import org.eclipse.emf.teneo.test.stores.TestStore;

import testinheritance.Child;
import testinheritance.Child2;
import testinheritance.NameValuePair;
import testinheritance.ParentOne;
import testinheritance.SomeReference;
import testinheritance.SomeResource;
import testinheritance.TestinheritanceFactory;
import testinheritance.TestinheritancePackage;

/**
 * Tests multiple inheritance.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.6 $
 */
public class MultipleInheritanceAction extends AbstractTestAction {
	/**
	 * Constructor.
	 * 
	 * @param arg0
	 */
	public MultipleInheritanceAction() {
		super(TestinheritancePackage.eINSTANCE);
	}

	/** Test */
	public void doAction(TestStore store) {
		store.disableDrop();
		try {
			Resource res = null;
			try {
				res = store.getResource();
				res.load(Collections.EMPTY_MAP);
		        SomeResource someResource = TestinheritanceFactory.eINSTANCE.createSomeResource();
		        someResource.setAnotherProperty(42);
		        someResource.setProperty("foo");
		        NameValuePair nv = TestinheritanceFactory.eINSTANCE.createNameValuePair();
		        nv.setName("foo1");
		        nv.setValue("bar");
		        someResource.getNameValuePairs().add(nv);
				res.getContents().add(someResource);
				res.save(null);
			} finally {
			}
			SomeResource someResource;
			try {
				res = store.getResource();
				res.load(Collections.EMPTY_MAP);
				someResource = TestinheritanceFactory.eINSTANCE.createSomeResource();
		        someResource.setAnotherProperty(13);
		        someResource.setProperty("baz");
				res.getContents().add(someResource);
				res.save(null);
			} finally {
			}
			try {
				res = store.getResource();
				res.load(Collections.EMPTY_MAP);
				assertNotNull(res.getContents());
				assertEquals(3, res.getContents().size());
		        someResource = (SomeResource)res.getContents().get(1);
		        assertNotNull(someResource);
		        NameValuePair nv = TestinheritanceFactory.eINSTANCE.createNameValuePair();
		        nv.setName("foo1");
		        nv.setValue("bar");
		        someResource.getNameValuePairs().add(nv);
				res.save(null);
			} finally {
			}
		} catch (IOException e) {
			throw new StoreTestException("IOException", e);
		}
		
		{
			store.beginTransaction();
			ParentOne po = TestinheritanceFactory.eINSTANCE.createParentOne();
			po.setAnotherProperty(5);
			store.store(po);
			store.commitTransaction();
		}
		
		// now test mappedsuperclasses
		{
			store.beginTransaction();
			final Child child = TestinheritanceFactory.eINSTANCE.createChild();
			final SomeReference sr = TestinheritanceFactory.eINSTANCE.createSomeReference();
			sr.setName("sr");
			child.setSomeReference(sr);
			child.setAge(10);
			child.setName("myName");
			child.setTestId(4); // this is the key!
			store.store(child);
		}
		
		try {
			store.beginTransaction();
			final Child child = TestinheritanceFactory.eINSTANCE.createChild();
			final SomeReference sr = TestinheritanceFactory.eINSTANCE.createSomeReference();
			sr.setName("sr1");
			child.setSomeReference(sr);
			child.setAge(11);
			child.setName("myName2");
			child.setTestId(4); // this is the key!
			store.store(child);
			fail("PK is not enforced!");
		} catch (Exception e) {
			// should fail
			store.rollbackTransaction();
		}
		
		// this child gets the id from the parent, which has a synthetic id
		{
			store.beginTransaction();
			final Child2 child = TestinheritanceFactory.eINSTANCE.createChild2();
			final SomeReference sr = TestinheritanceFactory.eINSTANCE.createSomeReference();
			sr.setName("sr3");
			store.store(sr);
			child.setSomeReference(sr);
			child.setAge(10);
			child.setAnotherProperty(40);
			child.setName("myName");
			child.setTestId(4); // this is not the key!
			store.store(child);
			store.commitTransaction();
		}
		{
			store.beginTransaction();
			final Child2 child = TestinheritanceFactory.eINSTANCE.createChild2();
			final SomeReference sr = TestinheritanceFactory.eINSTANCE.createSomeReference();
			sr.setName("sr2");
			store.store(sr);
			child.setSomeReference(sr);
			child.setAge(11);
			child.setAnotherProperty(41);
			child.setName("myName2");
			child.setTestId(4); // this is not the key!
			store.store(child);
		}
	}
}
