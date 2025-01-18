/**
 */
package homework4_ecommerce_project.EntityRelationships;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Primitive Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see homework4_ecommerce_project.EntityRelationships.EntityRelationshipsPackage#getPrimitiveTypes()
 * @model
 * @generated
 */
public enum PrimitiveTypes implements Enumerator {
	/**
	 * The '<em><b>String</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING_VALUE
	 * @generated
	 * @ordered
	 */
	STRING(0, "String", "String"),

	/**
	 * The '<em><b>Int</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT_VALUE
	 * @generated
	 * @ordered
	 */
	INT(1, "Int", "Int"),

	/**
	 * The '<em><b>Float</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLOAT(2, "Float", "Float"),

	/**
	 * The '<em><b>Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(3, "Date", "Date");

	/**
	 * The '<em><b>String</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRING
	 * @model name="String"
	 * @generated
	 * @ordered
	 */
	public static final int STRING_VALUE = 0;

	/**
	 * The '<em><b>Int</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INT
	 * @model name="Int"
	 * @generated
	 * @ordered
	 */
	public static final int INT_VALUE = 1;

	/**
	 * The '<em><b>Float</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOAT
	 * @model name="Float"
	 * @generated
	 * @ordered
	 */
	public static final int FLOAT_VALUE = 2;

	/**
	 * The '<em><b>Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model name="Date"
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Primitive Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrimitiveTypes[] VALUES_ARRAY =
		new PrimitiveTypes[] {
			STRING,
			INT,
			FLOAT,
			DATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Primitive Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrimitiveTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Primitive Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrimitiveTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Primitive Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PrimitiveTypes get(int value) {
		switch (value) {
			case STRING_VALUE: return STRING;
			case INT_VALUE: return INT;
			case FLOAT_VALUE: return FLOAT;
			case DATE_VALUE: return DATE;
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
	private PrimitiveTypes(int value, String name, String literal) {
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
	
} //PrimitiveTypes
