/**
 * <copyright>
 * </copyright>
 *
 * $Id: IdPackageImpl.java,v 1.1 2006/07/11 16:57:06 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.annotations.id.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.teneo.samples.emf.annotations.id.IdFactory;
import org.eclipse.emf.teneo.samples.emf.annotations.id.IdPackage;
import org.eclipse.emf.teneo.samples.emf.annotations.id.IdentityID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.SimpleID;
import org.eclipse.emf.teneo.samples.emf.annotations.id.TableID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IdPackageImpl extends EPackageImpl implements IdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identityIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleIDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableIDEClass = null;

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
	 * @see org.eclipse.emf.teneo.samples.emf.annotations.id.IdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IdPackageImpl() {
		super(eNS_URI, IdFactory.eINSTANCE);
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
	public static IdPackage init() {
		if (isInited) return (IdPackage)EPackage.Registry.INSTANCE.getEPackage(IdPackage.eNS_URI);

		// Obtain or create and register package
		IdPackageImpl theIdPackage = (IdPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof IdPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new IdPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theIdPackage.createPackageContents();

		// Initialize created meta-data
		theIdPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIdPackage.freeze();

		return theIdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentityID() {
		return identityIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentityID_Myid() {
		return (EAttribute)identityIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleID() {
		return simpleIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleID_AutoID() {
		return (EAttribute)simpleIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableID() {
		return tableIDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableID_Myid() {
		return (EAttribute)tableIDEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdFactory getIdFactory() {
		return (IdFactory)getEFactoryInstance();
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
		identityIDEClass = createEClass(IDENTITY_ID);
		createEAttribute(identityIDEClass, IDENTITY_ID__MYID);

		simpleIDEClass = createEClass(SIMPLE_ID);
		createEAttribute(simpleIDEClass, SIMPLE_ID__AUTO_ID);

		tableIDEClass = createEClass(TABLE_ID);
		createEAttribute(tableIDEClass, TABLE_ID__MYID);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(identityIDEClass, IdentityID.class, "IdentityID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentityID_Myid(), theXMLTypePackage.getLong(), "myid", null, 1, 1, IdentityID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleIDEClass, SimpleID.class, "SimpleID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleID_AutoID(), theXMLTypePackage.getLong(), "autoID", null, 1, 1, SimpleID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableIDEClass, TableID.class, "TableID", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTableID_Myid(), theXMLTypePackage.getLong(), "myid", null, 1, 1, TableID.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://ejb.elver.org/SequenceGenerator
		createSequenceGeneratorAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://ejb.elver.org/Id
		createIdAnnotations();
		// http://ejb.elver.org/GeneratedValue
		createGeneratedValueAnnotations();
		// http://ejb.elver.org/Column
		createColumnAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/SequenceGenerator</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSequenceGeneratorAnnotations() {
		String source = "http://ejb.elver.org/SequenceGenerator";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "name", "GENERATOR",
			 "sequenceName", "mySequenceName"
		   });													
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
		  (identityIDEClass, 
		   source, 
		   new String[] {
			 "name", "IdentityID",
			 "kind", "elementOnly"
		   });				
		addAnnotation
		  (getIdentityID_Myid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myid"
		   });		
		addAnnotation
		  (simpleIDEClass, 
		   source, 
		   new String[] {
			 "name", "SimpleID",
			 "kind", "elementOnly"
		   });					
		addAnnotation
		  (getSimpleID_AutoID(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "autoID"
		   });		
		addAnnotation
		  (tableIDEClass, 
		   source, 
		   new String[] {
			 "name", "TableID",
			 "kind", "elementOnly"
		   });				
		addAnnotation
		  (getTableID_Myid(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "myid"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/Id</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createIdAnnotations() {
		String source = "http://ejb.elver.org/Id";				
		addAnnotation
		  (getIdentityID_Myid(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });					
		addAnnotation
		  (getSimpleID_AutoID(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });						
		addAnnotation
		  (getTableID_Myid(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });		
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/GeneratedValue</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGeneratedValueAnnotations() {
		String source = "http://ejb.elver.org/GeneratedValue";					
		addAnnotation
		  (getIdentityID_Myid(), 
		   source, 
		   new String[] {
			 "strategy", "IDENTITY"
		   });					
		addAnnotation
		  (getSimpleID_AutoID(), 
		   source, 
		   new String[] {
			 "appinfo", "true"
		   });						
		addAnnotation
		  (getTableID_Myid(), 
		   source, 
		   new String[] {
			 "strategy", "TABLE"
		   });	
	}

	/**
	 * Initializes the annotations for <b>http://ejb.elver.org/Column</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createColumnAnnotations() {
		String source = "http://ejb.elver.org/Column";										
		addAnnotation
		  (getSimpleID_AutoID(), 
		   source, 
		   new String[] {
			 "name", "AUTOD",
			 "nullable", "false"
		   });					
	}

} //IdPackageImpl
