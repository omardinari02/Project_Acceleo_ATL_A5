/**
 */
package homework4_ecommerce_project.EntityRelationships;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cardinality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getCardinality()
 * @model
 * @generated
 */
public enum Cardinality implements Enumerator {
	/**
	 * The '<em><b>ONE2ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE2ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE2ONE(0, "ONE2ONE", "ONE2ONE"),

	/**
	 * The '<em><b>ONE2MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE2MANY_VALUE
	 * @generated
	 * @ordered
	 */
	ONE2MANY(1, "ONE2MANY", "ONE2MANY"),

	/**
	 * The '<em><b>MANY2MANY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY2MANY_VALUE
	 * @generated
	 * @ordered
	 */
	MANY2MANY(3, "MANY2MANY", "MANY2MANY");

	/**
	 * The '<em><b>ONE2ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE2ONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE2ONE_VALUE = 0;

	/**
	 * The '<em><b>ONE2MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE2MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONE2MANY_VALUE = 1;

	/**
	 * The '<em><b>MANY2MANY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANY2MANY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANY2MANY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Cardinality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Cardinality[] VALUES_ARRAY =
		new Cardinality[] {
			ONE2ONE,
			ONE2MANY,
			MANY2MANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Cardinality</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Cardinality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Cardinality get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cardinality result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Cardinality getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Cardinality result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cardinality</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Cardinality get(int value) {
		switch (value) {
			case ONE2ONE_VALUE: return ONE2ONE;
			case ONE2MANY_VALUE: return ONE2MANY;
			case MANY2MANY_VALUE: return MANY2MANY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Cardinality(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Cardinality
