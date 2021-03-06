/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimplefeaturemapPackageImpl.java,v 1.1 2006/07/11 16:57:13 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.PurchaseOrder;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapFactory;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage;
import org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.Supplier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplefeaturemapPackageImpl extends EPackageImpl implements SimplefeaturemapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass purchaseOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass supplierEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.emf.teneo.samples.emf.schemaconstructs.simplefeaturemap.SimplefeaturemapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimplefeaturemapPackageImpl() {
		super(eNS_URI, SimplefeaturemapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimplefeaturemapPackage init() {
		if (isInited) return (SimplefeaturemapPackage)EPackage.Registry.INSTANCE.getEPackage(SimplefeaturemapPackage.eNS_URI);

		// Obtain or create and register package
		SimplefeaturemapPackageImpl theSimplefeaturemapPackage = (SimplefeaturemapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SimplefeaturemapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SimplefeaturemapPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackageImpl.init();

		// Create package meta-data objects
		theSimplefeaturemapPackage.createPackageContents();

		// Initialize created meta-data
		theSimplefeaturemapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimplefeaturemapPackage.freeze();

		return theSimplefeaturemapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPurchaseOrder() {
		return purchaseOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPurchaseOrder_Name() {
		return (EAttribute)purchaseOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSupplier() {
		return supplierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplier_Name() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplier_Orders() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplier_PreferredOrders() {
		return (EReference)supplierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSupplier_StandardOrders() {
		return (EReference)supplierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplier_HardCopyOrderReference() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSupplier_HardCopyOrderNumber() {
		return (EAttribute)supplierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplefeaturemapFactory getSimplefeaturemapFactory() {
		return (SimplefeaturemapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		purchaseOrderEClass = createEClass(PURCHASE_ORDER);
		createEAttribute(purchaseOrderEClass, PURCHASE_ORDER__NAME);

		supplierEClass = createEClass(SUPPLIER);
		createEAttribute(supplierEClass, SUPPLIER__NAME);
		createEAttribute(supplierEClass, SUPPLIER__ORDERS);
		createEReference(supplierEClass, SUPPLIER__PREFERRED_ORDERS);
		createEReference(supplierEClass, SUPPLIER__STANDARD_ORDERS);
		createEAttribute(supplierEClass, SUPPLIER__HARD_COPY_ORDER_REFERENCE);
		createEAttribute(supplierEClass, SUPPLIER__HARD_COPY_ORDER_NUMBER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(purchaseOrderEClass, PurchaseOrder.class, "PurchaseOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPurchaseOrder_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PurchaseOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(supplierEClass, Supplier.class, "Supplier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSupplier_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplier_Orders(), ecorePackage.getEFeatureMapEntry(), "orders", null, 0, -1, Supplier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSupplier_PreferredOrders(), this.getPurchaseOrder(), null, "preferredOrders", null, 0, -1, Supplier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSupplier_StandardOrders(), this.getPurchaseOrder(), null, "standardOrders", null, 0, -1, Supplier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplier_HardCopyOrderReference(), theXMLTypePackage.getString(), "hardCopyOrderReference", null, 0, -1, Supplier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSupplier_HardCopyOrderNumber(), theXMLTypePackage.getLong(), "hardCopyOrderNumber", null, 0, -1, Supplier.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (purchaseOrderEClass, 
		   source, 
		   new String[] {
			 "name", "PurchaseOrder",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPurchaseOrder_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (supplierEClass, 
		   source, 
		   new String[] {
			 "name", "Supplier",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSupplier_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "name"
		   });		
		addAnnotation
		  (getSupplier_Orders(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "orders:1"
		   });		
		addAnnotation
		  (getSupplier_PreferredOrders(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preferredOrders",
			 "group", "#orders:1"
		   });		
		addAnnotation
		  (getSupplier_StandardOrders(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "standardOrders",
			 "group", "#orders:1"
		   });		
		addAnnotation
		  (getSupplier_HardCopyOrderReference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hardCopyOrderReference",
			 "group", "#orders:1"
		   });		
		addAnnotation
		  (getSupplier_HardCopyOrderNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "hardCopyOrderNumber",
			 "group", "#orders:1"
		   });
	}

} //SimplefeaturemapPackageImpl
