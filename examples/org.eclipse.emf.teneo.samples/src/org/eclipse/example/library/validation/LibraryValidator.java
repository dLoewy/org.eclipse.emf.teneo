/**
 * <copyright>
 * </copyright>
 *
 * $Id: LibraryValidator.java,v 1.1 2007/11/16 13:38:07 mtaal Exp $
 */
package org.eclipse.example.library.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.example.library.Book;
import org.eclipse.example.library.Writer;

/**
 * A sample validator interface for {@link org.eclipse.example.library.Library}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LibraryValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateWriters(EList<Writer> value);
	boolean validateBooks(EList<Book> value);
}
