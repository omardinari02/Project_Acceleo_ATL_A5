/**
 */
package homework4_ecommerce_project.EntityRelationships;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link homework4_ecommerce_project.EntityRelationships.DataBase#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getDataBase()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='EachDataBaseMustHaveAtLeastOneEntity'"
 * @generated
 */
public interface DataBase extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link homework4_ecommerce_project.EntityRelationships.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getDataBase_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int NmEntities();

} // DataBase
