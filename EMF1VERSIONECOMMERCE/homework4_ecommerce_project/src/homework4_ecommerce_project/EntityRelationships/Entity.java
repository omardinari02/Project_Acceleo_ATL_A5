/**
 */
package homework4_ecommerce_project.EntityRelationships;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.Entity#getRelations <em>Relations</em>}</li>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.Entity#getIncomingRelation <em>Incoming Relation</em>}</li>
 * </ul>
 *
 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EachEntityMustHaveAtLeastOneAttribute'"
 * @generated
 */
public interface Entity extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link homework4_ecommerce_project.EntityRelationships.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
	 * The list contents are of type {@link homework4_ecommerce_project.EntityRelationships.Relation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relations</em>' containment reference list.
	 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getEntity_Relations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relation> getRelations();

	/**
	 * Returns the value of the '<em><b>Incoming Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Relation</em>' reference.
	 * @see #setIncomingRelation(Relation)
	 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getEntity_IncomingRelation()
	 * @model
	 * @generated
	 */
	Relation getIncomingRelation();

	/**
	 * Sets the value of the '{@link homework4_ecommerce_project.EntityRelationships.Entity#getIncomingRelation <em>Incoming Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Relation</em>' reference.
	 * @see #getIncomingRelation()
	 * @generated
	 */
	void setIncomingRelation(Relation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	default int NmAttributes() {
		    return getAttributes().size();  // Returns the number of attributes in the entity
		

	}

} // Entity
