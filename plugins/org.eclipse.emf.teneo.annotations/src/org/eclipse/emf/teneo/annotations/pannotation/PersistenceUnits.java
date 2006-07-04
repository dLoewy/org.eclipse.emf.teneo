/**
 * <copyright>
 * </copyright>
 *
 * $Id: PersistenceUnits.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Persistence Units</b></em>'. <!--
 * end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnits#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPersistenceUnits()
 * @model annotation="http://annotation.elver.org/internal/Target 0='EClass'"
 * @generated
 */
public interface PersistenceUnits extends PAnnotation {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference list. The list contents are of type
	 * {@link org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference list isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' containment reference list.
	 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage#getPersistenceUnits_Value()
	 * @model type="org.eclipse.emf.teneo.annotations.pannotation.PersistenceUnit" containment="true"
	 * @generated
	 */
	EList getValue();

} // PersistenceUnits
