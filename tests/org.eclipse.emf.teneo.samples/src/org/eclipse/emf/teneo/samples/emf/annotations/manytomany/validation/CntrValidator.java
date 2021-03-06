/**
 * <copyright>
 * </copyright>
 *
 * $Id: CntrValidator.java,v 1.1 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.manytomany.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Lft;
import org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Rght;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.annotations.manytomany.Cntr}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CntrValidator {
	boolean validate();

	boolean validateRght(EList<Rght> value);
	boolean validateLft(EList<Lft> value);
}
