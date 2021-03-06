/**
 * <copyright>
 * </copyright>
 *
 * $Id: AddressListValidator.java,v 1.1 2007/02/08 23:09:26 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.Address;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.FirstAddressHolder;

/**
 * A sample validator interface for {@link org.eclipse.emf.teneo.samples.emf.schemaconstructs.extension.AddressList}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AddressListValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateFirstAddress(FirstAddressHolder value);
	boolean validateSecondAddress(EList<Address> value);
}
