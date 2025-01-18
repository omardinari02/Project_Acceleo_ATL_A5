/**
 */
package homework4_ecommerce_project.EntityRelationships.impl;

import homework4_ecommerce_project.EntityRelationships.Attribute;
import homework4_ecommerce_project.EntityRelationships.Entity;
import homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage;
import homework4_ecommerce_project.EntityRelationships.Relation;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.impl.EntityImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.impl.EntityImpl#getIncomingRelation <em>Incoming Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends NamedElementImpl implements Entity {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getIncomingRelation() <em>Incoming Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingRelation()
	 * @generated
	 * @ordered
	 */
	protected Relation incomingRelation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityRelationshipsPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, EntityRelationshipsPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, EntityRelationshipsPackage.ENTITY__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Relation getIncomingRelation() {
		if (incomingRelation != null && incomingRelation.eIsProxy()) {
			InternalEObject oldIncomingRelation = (InternalEObject)incomingRelation;
			incomingRelation = (Relation)eResolveProxy(oldIncomingRelation);
			if (incomingRelation != oldIncomingRelation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityRelationshipsPackage.ENTITY__INCOMING_RELATION, oldIncomingRelation, incomingRelation));
			}
		}
		return incomingRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relation basicGetIncomingRelation() {
		return incomingRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncomingRelation(Relation newIncomingRelation) {
		Relation oldIncomingRelation = incomingRelation;
		incomingRelation = newIncomingRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityRelationshipsPackage.ENTITY__INCOMING_RELATION, oldIncomingRelation, incomingRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int NmAttributes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityRelationshipsPackage.ENTITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case EntityRelationshipsPackage.ENTITY__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
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
			case EntityRelationshipsPackage.ENTITY__ATTRIBUTES:
				return getAttributes();
			case EntityRelationshipsPackage.ENTITY__RELATIONS:
				return getRelations();
			case EntityRelationshipsPackage.ENTITY__INCOMING_RELATION:
				if (resolve) return getIncomingRelation();
				return basicGetIncomingRelation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityRelationshipsPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EntityRelationshipsPackage.ENTITY__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case EntityRelationshipsPackage.ENTITY__INCOMING_RELATION:
				setIncomingRelation((Relation)newValue);
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
			case EntityRelationshipsPackage.ENTITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case EntityRelationshipsPackage.ENTITY__RELATIONS:
				getRelations().clear();
				return;
			case EntityRelationshipsPackage.ENTITY__INCOMING_RELATION:
				setIncomingRelation((Relation)null);
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
			case EntityRelationshipsPackage.ENTITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case EntityRelationshipsPackage.ENTITY__RELATIONS:
				return relations != null && !relations.isEmpty();
			case EntityRelationshipsPackage.ENTITY__INCOMING_RELATION:
				return incomingRelation != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EntityRelationshipsPackage.ENTITY___NM_ATTRIBUTES:
				return NmAttributes();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntityImpl
