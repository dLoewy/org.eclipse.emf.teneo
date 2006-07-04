/**
 * <copyright>
 * </copyright>
 *
 * $Id: PannotationFactory.java,v 1.1 2006/07/04 21:37:00 mtaal Exp $
 */
package org.eclipse.emf.teneo.annotations.pannotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model. <!-- end-user-doc -->
 * 
 * @see org.eclipse.emf.teneo.annotations.pannotation.PannotationPackage
 * @generated
 */
public interface PannotationFactory extends EFactory {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "Copyright 2004-2006, Elver.org (http://www.eclipse.org/emf/teneo).\nLicensed under the Apache License, Version 2.0 (the \"License\");\n\nyou may not use this file except in compliance with the License.\nYou may obtain a copy of the License at\nhttp://www.apache.org/licenses/LICENSE-2.0\nUnless required by applicable law or agreed to in writing, software\ndistributed under the License is distributed on an \"AS IS\" BASIS,\nWITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.\nSee the License for the specific language governing permissions and\nlimitations under the License.";

	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	PannotationFactory eINSTANCE = new org.eclipse.emf.teneo.annotations.pannotation.impl.PannotationFactoryImpl();

	/**
	 * Returns a new object of class '<em>Attribute Override</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attribute Override</em>'.
	 * @generated
	 */
	AttributeOverride createAttributeOverride();

	/**
	 * Returns a new object of class '<em>Attribute Overrides</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attribute Overrides</em>'.
	 * @generated
	 */
	AttributeOverrides createAttributeOverrides();

	/**
	 * Returns a new object of class '<em>Basic</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Basic</em>'.
	 * @generated
	 */
	Basic createBasic();

	/**
	 * Returns a new object of class '<em>Column</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Column</em>'.
	 * @generated
	 */
	Column createColumn();

	/**
	 * Returns a new object of class '<em>Column Result</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Column Result</em>'.
	 * @generated
	 */
	ColumnResult createColumnResult();

	/**
	 * Returns a new object of class '<em>Discriminator Column</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Discriminator Column</em>'.
	 * @generated
	 */
	DiscriminatorColumn createDiscriminatorColumn();

	/**
	 * Returns a new object of class '<em>Discriminator Value</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Discriminator Value</em>'.
	 * @generated
	 */
	DiscriminatorValue createDiscriminatorValue();

	/**
	 * Returns a new object of class '<em>Embeddable</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Embeddable</em>'.
	 * @generated
	 */
	Embeddable createEmbeddable();

	/**
	 * Returns a new object of class '<em>Mapped Superclass</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Mapped Superclass</em>'.
	 * @generated
	 */
	MappedSuperclass createMappedSuperclass();

	/**
	 * Returns a new object of class '<em>Embedded</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Embedded</em>'.
	 * @generated
	 */
	Embedded createEmbedded();

	/**
	 * Returns a new object of class '<em>Embedded Id</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Embedded Id</em>'.
	 * @generated
	 */
	EmbeddedId createEmbeddedId();

	/**
	 * Returns a new object of class '<em>Enumerated</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Enumerated</em>'.
	 * @generated
	 */
	Enumerated createEnumerated();

	/**
	 * Returns a new object of class '<em>Entity</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Entity Listener</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Entity Listener</em>'.
	 * @generated
	 */
	EntityListener createEntityListener();

	/**
	 * Returns a new object of class '<em>Entity Result</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Entity Result</em>'.
	 * @generated
	 */
	EntityResult createEntityResult();

	/**
	 * Returns a new object of class '<em>Exclude Default Listeners</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Exclude Default Listeners</em>'.
	 * @generated
	 */
	ExcludeDefaultListeners createExcludeDefaultListeners();

	/**
	 * Returns a new object of class '<em>Exclude Superclass Listeners</em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return a new object of class '<em>Exclude Superclass Listeners</em>'.
	 * @generated
	 */
	ExcludeSuperclassListeners createExcludeSuperclassListeners();

	/**
	 * Returns a new object of class '<em>Field Result</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Field Result</em>'.
	 * @generated
	 */
	FieldResult createFieldResult();

	/**
	 * Returns a new object of class '<em>Flush Mode</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Flush Mode</em>'.
	 * @generated
	 */
	FlushMode createFlushMode();

	/**
	 * Returns a new object of class '<em>Generated Value</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Generated Value</em>'.
	 * @generated
	 */
	GeneratedValue createGeneratedValue();

	/**
	 * Returns a new object of class '<em>Id</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Id</em>'.
	 * @generated
	 */
	Id createId();

	/**
	 * Returns a new object of class '<em>Id Class</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Id Class</em>'.
	 * @generated
	 */
	IdClass createIdClass();

	/**
	 * Returns a new object of class '<em>Inheritance</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Inheritance</em>'.
	 * @generated
	 */
	Inheritance createInheritance();

	/**
	 * Returns a new object of class '<em>Join Column</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Join Column</em>'.
	 * @generated
	 */
	JoinColumn createJoinColumn();

	/**
	 * Returns a new object of class '<em>Join Columns</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Join Columns</em>'.
	 * @generated
	 */
	JoinColumns createJoinColumns();

	/**
	 * Returns a new object of class '<em>Join Table</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Join Table</em>'.
	 * @generated
	 */
	JoinTable createJoinTable();

	/**
	 * Returns a new object of class '<em>Lob</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Lob</em>'.
	 * @generated
	 */
	Lob createLob();

	/**
	 * Returns a new object of class '<em>Many To Many</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Many To Many</em>'.
	 * @generated
	 */
	ManyToMany createManyToMany();

	/**
	 * Returns a new object of class '<em>Many To One</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Many To One</em>'.
	 * @generated
	 */
	ManyToOne createManyToOne();

	/**
	 * Returns a new object of class '<em>Map Key</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Map Key</em>'.
	 * @generated
	 */
	MapKey createMapKey();

	/**
	 * Returns a new object of class '<em>Named Native Queries</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Native Queries</em>'.
	 * @generated
	 */
	NamedNativeQueries createNamedNativeQueries();

	/**
	 * Returns a new object of class '<em>Named Native Query</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Native Query</em>'.
	 * @generated
	 */
	NamedNativeQuery createNamedNativeQuery();

	/**
	 * Returns a new object of class '<em>Named Queries</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Queries</em>'.
	 * @generated
	 */
	NamedQueries createNamedQueries();

	/**
	 * Returns a new object of class '<em>Named Query</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Query</em>'.
	 * @generated
	 */
	NamedQuery createNamedQuery();

	/**
	 * Returns a new object of class '<em>One To Many</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>One To Many</em>'.
	 * @generated
	 */
	OneToMany createOneToMany();

	/**
	 * Returns a new object of class '<em>One To One</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>One To One</em>'.
	 * @generated
	 */
	OneToOne createOneToOne();

	/**
	 * Returns a new object of class '<em>Order By</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Order By</em>'.
	 * @generated
	 */
	OrderBy createOrderBy();

	/**
	 * Returns a new object of class '<em>Persistence Context</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Persistence Context</em>'.
	 * @generated
	 */
	PersistenceContext createPersistenceContext();

	/**
	 * Returns a new object of class '<em>Persistence Contexts</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Persistence Contexts</em>'.
	 * @generated
	 */
	PersistenceContexts createPersistenceContexts();

	/**
	 * Returns a new object of class '<em>Persistence Unit</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Persistence Unit</em>'.
	 * @generated
	 */
	PersistenceUnit createPersistenceUnit();

	/**
	 * Returns a new object of class '<em>Persistence Units</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Persistence Units</em>'.
	 * @generated
	 */
	PersistenceUnits createPersistenceUnits();

	/**
	 * Returns a new object of class '<em>Post Load</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Post Load</em>'.
	 * @generated
	 */
	PostLoad createPostLoad();

	/**
	 * Returns a new object of class '<em>Post Persist</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Post Persist</em>'.
	 * @generated
	 */
	PostPersist createPostPersist();

	/**
	 * Returns a new object of class '<em>Post Remove</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Post Remove</em>'.
	 * @generated
	 */
	PostRemove createPostRemove();

	/**
	 * Returns a new object of class '<em>Post Update</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Post Update</em>'.
	 * @generated
	 */
	PostUpdate createPostUpdate();

	/**
	 * Returns a new object of class '<em>Pre Persist</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Pre Persist</em>'.
	 * @generated
	 */
	PrePersist createPrePersist();

	/**
	 * Returns a new object of class '<em>Pre Remove</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Pre Remove</em>'.
	 * @generated
	 */
	PreRemove createPreRemove();

	/**
	 * Returns a new object of class '<em>Pre Update</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Pre Update</em>'.
	 * @generated
	 */
	PreUpdate createPreUpdate();

	/**
	 * Returns a new object of class '<em>Primary Key Join Column</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Primary Key Join Column</em>'.
	 * @generated
	 */
	PrimaryKeyJoinColumn createPrimaryKeyJoinColumn();

	/**
	 * Returns a new object of class '<em>Primary Key Join Columns</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Primary Key Join Columns</em>'.
	 * @generated
	 */
	PrimaryKeyJoinColumns createPrimaryKeyJoinColumns();

	/**
	 * Returns a new object of class '<em>Query Hint</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Query Hint</em>'.
	 * @generated
	 */
	QueryHint createQueryHint();

	/**
	 * Returns a new object of class '<em>Secondary Table</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Secondary Table</em>'.
	 * @generated
	 */
	SecondaryTable createSecondaryTable();

	/**
	 * Returns a new object of class '<em>Secondary Tables</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Secondary Tables</em>'.
	 * @generated
	 */
	SecondaryTables createSecondaryTables();

	/**
	 * Returns a new object of class '<em>Sequence Generator</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Sequence Generator</em>'.
	 * @generated
	 */
	SequenceGenerator createSequenceGenerator();

	/**
	 * Returns a new object of class '<em>Sql Result Set Mapping</em>'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return a new object of class '<em>Sql Result Set Mapping</em>'.
	 * @generated
	 */
	SqlResultSetMapping createSqlResultSetMapping();

	/**
	 * Returns a new object of class '<em>Table</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Table</em>'.
	 * @generated
	 */
	Table createTable();

	/**
	 * Returns a new object of class '<em>Table Generator</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Table Generator</em>'.
	 * @generated
	 */
	TableGenerator createTableGenerator();

	/**
	 * Returns a new object of class '<em>Temporal</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Temporal</em>'.
	 * @generated
	 */
	Temporal createTemporal();

	/**
	 * Returns a new object of class '<em>Transient</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transient</em>'.
	 * @generated
	 */
	Transient createTransient();

	/**
	 * Returns a new object of class '<em>Unique Constraint</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Unique Constraint</em>'.
	 * @generated
	 */
	UniqueConstraint createUniqueConstraint();

	/**
	 * Returns a new object of class '<em>Version</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Version</em>'.
	 * @generated
	 */
	Version createVersion();

	/**
	 * Returns a new object of class '<em>Indexed</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Indexed</em>'.
	 * @generated
	 */
	Indexed createIndexed();

	/**
	 * Returns a new object of class '<em>Unique</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Unique</em>'.
	 * @generated
	 */
	Unique createUnique();

	/**
	 * Returns a new object of class '<em>Columns</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Columns</em>'.
	 * @generated
	 */
	Columns createColumns();

	/**
	 * Returns a new object of class '<em>Parameter</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Type</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Id Bag</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Id Bag</em>'.
	 * @generated
	 */
	IdBag createIdBag();

	/**
	 * Returns a new object of class '<em>Association Override</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Association Override</em>'.
	 * @generated
	 */
	AssociationOverride createAssociationOverride();

	/**
	 * Returns a new object of class '<em>Association Overrides</em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Association Overrides</em>'.
	 * @generated
	 */
	AssociationOverrides createAssociationOverrides();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	PannotationPackage getPannotationPackage();

} // PannotationFactory
