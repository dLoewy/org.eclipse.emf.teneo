/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleEnum.java,v 1.1 2006/07/11 16:57:08 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Simple Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simpletypes.SimpletypesPackage#getSimpleEnum()
 * @model
 * @generated
 */
public final class SimpleEnum extends AbstractEnumerator {
	/**
	 * The '<em><b>Enum1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM1_LITERAL
	 * @model name="Enum1"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM1 = 0;

	/**
	 * The '<em><b>Enum2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM2_LITERAL
	 * @model name="Enum2"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM2 = 1;

	/**
	 * The '<em><b>Enum1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM1
	 * @generated
	 * @ordered
	 */
	public static final SimpleEnum ENUM1_LITERAL = new SimpleEnum(ENUM1, "Enum1", "Enum1");

	/**
	 * The '<em><b>Enum2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM2
	 * @generated
	 * @ordered
	 */
	public static final SimpleEnum ENUM2_LITERAL = new SimpleEnum(ENUM2, "Enum2", "Enum2");

	/**
	 * An array of all the '<em><b>Simple Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SimpleEnum[] VALUES_ARRAY =
		new SimpleEnum[] {
			ENUM1_LITERAL,
			ENUM2_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Simple Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Simple Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SimpleEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Simple Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SimpleEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Simple Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimpleEnum get(int value) {
		switch (value) {
			case ENUM1: return ENUM1_LITERAL;
			case ENUM2: return ENUM2_LITERAL;
		}
		return null;	
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private SimpleEnum(int value, String name, String literal) {
		super(value, name, literal);
	}

} //SimpleEnum
