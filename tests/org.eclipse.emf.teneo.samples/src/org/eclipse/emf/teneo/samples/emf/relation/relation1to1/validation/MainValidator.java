/**
 * <copyright>
 * </copyright>
 *
 * $Id: MainValidator.java,v 1.1 2007/02/08 23:09:23 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.relation.relation1to1.validation;

import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.ContainedChildR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRT;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildNRTNR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildR;
import org.eclipse.emf.teneo.samples.emf.relation.relation1to1.NotContainedChildRTNR;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.relation.relation1to1.Main}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MainValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateContainedonewayrequired(ContainedChildR value);
	boolean validateContainedoneWaynotrequired(ContainedChildNR value);
	boolean validateNotcontainedonewayrequired(NotContainedChildR value);
	boolean validateNotcontainedonewaynotrequired(NotContainedChildNR value);
	boolean validateNotcontainedtwowaynotrequired(NotContainedChildNRT value);
	boolean validateNotcontainedtwowayrequirednr(NotContainedChildRTNR value);
	boolean validateNotcontainedtwowaynotrequirednr(NotContainedChildNRTNR value);
}