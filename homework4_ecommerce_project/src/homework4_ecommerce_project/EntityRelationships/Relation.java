/**
 */
package homework4_ecommerce_project.EntityRelationships;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.Relation#getEntity <em>Entity</em>}</li>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.Relation#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getRelation_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link homework4_ecommerce_project.EntityRelationships.Relation#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' attribute.
	 * The literals are from the enumeration {@link homework4_ecommerce_project.EntityRelationships.Cardinality}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' attribute.
	 * @see homework4_ecommerce_project.EntityRelationships.Cardinality
	 * @see #setCardinality(Cardinality)
	 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getRelation_Cardinality()
	 * @model
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link homework4_ecommerce_project.EntityRelationships.Relation#getCardinality <em>Cardinality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' attribute.
	 * @see homework4_ecommerce_project.EntityRelationships.Cardinality
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

} // Relation
