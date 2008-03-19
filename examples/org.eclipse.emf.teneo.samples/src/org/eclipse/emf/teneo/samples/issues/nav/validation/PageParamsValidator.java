/**
 * <copyright>
 * </copyright>
 *
 * $Id: PageParamsValidator.java,v 1.1 2008/03/19 22:25:41 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.nav.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.issues.nav.RenderParam;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.issues.nav.PageParams}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PageParamsValidator {
	boolean validate();

	boolean validateRenderParam(EList<RenderParam> value);
	boolean validatePageHeader(EList<String> value);
}
