/**
 * <copyright>
 * </copyright>
 *
 * $Id: NavigationElementImpl.java,v 1.1 2008/03/19 22:25:40 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.issues.top.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.teneo.samples.issues.top.NavigationElement;
import org.eclipse.emf.teneo.samples.issues.top.PageParams;
import org.eclipse.emf.teneo.samples.issues.top.TopPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Navigation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.impl.NavigationElementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.impl.NavigationElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.impl.NavigationElementImpl#getPageParams <em>Page Params</em>}</li>
 *   <li>{@link org.eclipse.emf.teneo.samples.issues.top.impl.NavigationElementImpl#getUniqueName <em>Unique Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NavigationElementImpl extends EObjectImpl implements NavigationElement {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPageParams() <em>Page Params</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageParams()
	 * @generated
	 * @ordered
	 */
	protected PageParams pageParams;

	/**
	 * The default value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueName() <em>Unique Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueName()
	 * @generated
	 * @ordered
	 */
	protected String uniqueName = UNIQUE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NavigationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TopPackage.Literals.NAVIGATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopPackage.NAVIGATION_ELEMENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopPackage.NAVIGATION_ELEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageParams getPageParams() {
		return pageParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPageParams(PageParams newPageParams, NotificationChain msgs) {
		PageParams oldPageParams = pageParams;
		pageParams = newPageParams;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS, oldPageParams, newPageParams);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageParams(PageParams newPageParams) {
		if (newPageParams != pageParams) {
			NotificationChain msgs = null;
			if (pageParams != null)
				msgs = ((InternalEObject)pageParams).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS, null, msgs);
			if (newPageParams != null)
				msgs = ((InternalEObject)newPageParams).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS, null, msgs);
			msgs = basicSetPageParams(newPageParams, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS, newPageParams, newPageParams));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueName() {
		return uniqueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueName(String newUniqueName) {
		String oldUniqueName = uniqueName;
		uniqueName = newUniqueName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopPackage.NAVIGATION_ELEMENT__UNIQUE_NAME, oldUniqueName, uniqueName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS:
				return basicSetPageParams(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TopPackage.NAVIGATION_ELEMENT__TITLE:
				return getTitle();
			case TopPackage.NAVIGATION_ELEMENT__DESCRIPTION:
				return getDescription();
			case TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS:
				return getPageParams();
			case TopPackage.NAVIGATION_ELEMENT__UNIQUE_NAME:
				return getUniqueName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TopPackage.NAVIGATION_ELEMENT__TITLE:
				setTitle((String)newValue);
				return;
			case TopPackage.NAVIGATION_ELEMENT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS:
				setPageParams((PageParams)newValue);
				return;
			case TopPackage.NAVIGATION_ELEMENT__UNIQUE_NAME:
				setUniqueName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TopPackage.NAVIGATION_ELEMENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case TopPackage.NAVIGATION_ELEMENT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS:
				setPageParams((PageParams)null);
				return;
			case TopPackage.NAVIGATION_ELEMENT__UNIQUE_NAME:
				setUniqueName(UNIQUE_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TopPackage.NAVIGATION_ELEMENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case TopPackage.NAVIGATION_ELEMENT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case TopPackage.NAVIGATION_ELEMENT__PAGE_PARAMS:
				return pageParams != null;
			case TopPackage.NAVIGATION_ELEMENT__UNIQUE_NAME:
				return UNIQUE_NAME_EDEFAULT == null ? uniqueName != null : !UNIQUE_NAME_EDEFAULT.equals(uniqueName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", uniqueName: ");
		result.append(uniqueName);
		result.append(')');
		return result.toString();
	}

} //NavigationElementImpl
