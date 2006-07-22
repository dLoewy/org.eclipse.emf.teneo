/*
 *	Copyright 2004-2006, Elver.org (http://www.elver.org).
 *
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *
 *		http://www.apache.org/licenses/LICENSE-2.0
 *
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 */
package org.eclipse.emf.teneo.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Runs all tests.
 * 
 * @author <a href="mailto:mtaal@elver.org">Martin Taal</a>
 * @version $Revision: 1.5 $
 */
public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("All tests for hibernate");
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.annotations.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.detach.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.elist.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.relation.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.sample.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.emf.schemaconstructs.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.issues.AllTests.suite());
		suite.addTest(org.eclipse.emf.teneo.hibernate.test.test.AllTests.suite());

//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.annotations.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.detach.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.elist.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.relation.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.sample.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs.AllGenerateTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.issues.AllGenerateTests.suite());
//
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.annotations.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.detach.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.elist.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.relation.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.sample.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.emf.schemaconstructs.AllTests.suite());
//		suite.addTest(org.eclipse.emf.teneo.jpox.test.issues.AllTests.suite());
		
		return suite;
	}

}
