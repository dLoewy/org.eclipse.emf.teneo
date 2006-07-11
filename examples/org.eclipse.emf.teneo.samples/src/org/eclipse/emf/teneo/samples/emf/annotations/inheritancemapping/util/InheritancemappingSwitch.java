/**
 * <copyright>
 * </copyright>
 *
 * $Id: InheritancemappingSwitch.java,v 1.1 2006/07/11 16:57:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.annotations.inheritancemapping.InheritancemappingPackage
 * @generated
 */
public class InheritancemappingSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static InheritancemappingPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritancemappingSwitch() {
		if (modelPackage == null) {
			modelPackage = InheritancemappingPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case InheritancemappingPackage.ADDRESS: {
				Address address = (Address)theEObject;
				Object result = caseAddress(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InheritancemappingPackage.CONTENT_LIST: {
				ContentList contentList = (ContentList)theEObject;
				Object result = caseContentList(contentList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InheritancemappingPackage.DISTRICT_UK_ADDRESS: {
				DistrictUKAddress districtUKAddress = (DistrictUKAddress)theEObject;
				Object result = caseDistrictUKAddress(districtUKAddress);
				if (result == null) result = caseUKAddress(districtUKAddress);
				if (result == null) result = caseAddress(districtUKAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InheritancemappingPackage.INTERNATIONAL_PRICE: {
				InternationalPrice internationalPrice = (InternationalPrice)theEObject;
				Object result = caseInternationalPrice(internationalPrice);
				if (result == null) result = casePrice(internationalPrice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InheritancemappingPackage.PRICE: {
				Price price = (Price)theEObject;
				Object result = casePrice(price);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InheritancemappingPackage.UK_ADDRESS: {
				UKAddress ukAddress = (UKAddress)theEObject;
				Object result = caseUKAddress(ukAddress);
				if (result == null) result = caseAddress(ukAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case InheritancemappingPackage.US_ADDRESS: {
				USAddress usAddress = (USAddress)theEObject;
				Object result = caseUSAddress(usAddress);
				if (result == null) result = caseAddress(usAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Content List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Content List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseContentList(ContentList object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>District UK Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>District UK Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDistrictUKAddress(DistrictUKAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>International Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>International Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInternationalPrice(InternationalPrice object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Price</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Price</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePrice(Price object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>UK Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>UK Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUKAddress(UKAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>US Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>US Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseUSAddress(USAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //InheritancemappingSwitch
