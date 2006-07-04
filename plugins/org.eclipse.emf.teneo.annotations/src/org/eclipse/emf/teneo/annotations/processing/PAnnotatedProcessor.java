/*
 *	Copyright 2004-2005, Elver.org (http://www.eclipse.org/emf/teneo).
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

package org.eclipse.emf.teneo.annotations.processing;

import org.eclipse.emf.teneo.annotations.pamodel.PAnnotatedEModelElement;
import org.eclipse.emf.teneo.annotations.pannotation.PAnnotation;

/**
 * Processor of annotated element.
 * 
 * @author <a href="mailto:marchign at elver.org">Davide Marchignoli</a>
 */
public interface PAnnotatedProcessor {

	/**
	 * Invoked to report an ill formed annotated element.
	 * 
	 * @param paElement
	 *            the ill formed element.
	 * @param cause
	 *            a description of the error.
	 * @param offendingAnnotation
	 *            the annotation which makes the element illformed
	 */
	void processIllFormed(PAnnotatedEModelElement paElement, String cause, PAnnotation offendingAnnotation);

}
