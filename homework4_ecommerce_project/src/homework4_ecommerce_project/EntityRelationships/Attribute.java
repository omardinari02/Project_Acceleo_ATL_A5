/**
 */
package homework4_ecommerce_project.EntityRelationships;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AnAttributeNameMustBeUniqueWithinItsContainingEntity'"
 * @generated
 */
public interface Attribute extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link homework4_ecommerce_project.EntityRelationships.PrimitiveTypes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see homework4_ecommerce_project.EntityRelationships.PrimitiveTypes
	 * @see #setType(PrimitiveTypes)
	 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getAttribute_Type()
	 * @model
	 * @generated
	 */
	PrimitiveTypes getType();

	/**
	 * Sets the value of the '{@link homework4_ecommerce_project.EntityRelationships.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see homework4_ecommerce_project.EntityRelationships.PrimitiveTypes
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveTypes value);

} // Attribute
