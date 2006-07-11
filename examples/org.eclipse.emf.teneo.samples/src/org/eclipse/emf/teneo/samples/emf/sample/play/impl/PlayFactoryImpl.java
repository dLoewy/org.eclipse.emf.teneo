/**
 * <copyright>
 * </copyright>
 *
 * $Id: PlayFactoryImpl.java,v 1.1 2006/07/11 16:57:07 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.emf.teneo.samples.emf.sample.play.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PlayFactoryImpl extends EFactoryImpl implements PlayFactory {
	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PlayPackage.ACT_TYPE: return createActType();
			case PlayPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case PlayPackage.FM_TYPE: return createFmType();
			case PlayPackage.PERSONAE_TYPE: return createPersonaeType();
			case PlayPackage.PERSONA_GROUP_TYPE: return createPersonaGroupType();
			case PlayPackage.PLAY_TYPE: return createPlayType();
			case PlayPackage.SCENE_TYPE: return createSceneType();
			case PlayPackage.SPEECH_TYPE: return createSpeechType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case PlayPackage.PINDEX_TYPE:
				return createPindexTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case PlayPackage.PINDEX_TYPE:
				return convertPindexTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActType createActType() {
		ActTypeImpl actType = new ActTypeImpl();
		return actType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FmType createFmType() {
		FmTypeImpl fmType = new FmTypeImpl();
		return fmType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonaeType createPersonaeType() {
		PersonaeTypeImpl personaeType = new PersonaeTypeImpl();
		return personaeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonaGroupType createPersonaGroupType() {
		PersonaGroupTypeImpl personaGroupType = new PersonaGroupTypeImpl();
		return personaGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayType createPlayType() {
		PlayTypeImpl playType = new PlayTypeImpl();
		return playType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SceneType createSceneType() {
		SceneTypeImpl sceneType = new SceneTypeImpl();
		return sceneType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeechType createSpeechType() {
		SpeechTypeImpl speechType = new SpeechTypeImpl();
		return speechType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPindexTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.eINSTANCE.getNMTOKEN(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPindexTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.eINSTANCE.getNMTOKEN(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayPackage getPlayPackage() {
		return (PlayPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static PlayPackage getPackage() {
		return PlayPackage.eINSTANCE;
	}

} //PlayFactoryImpl
