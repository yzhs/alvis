package de.uni_siegen.informatik.bs.alvic;

import java.util.List;
import java.util.ArrayList;

/**
 * An ArrayType is a type of the form "elementType[]" or List<elementType>"
 * where 'elementType' is an arbitrary type.
 * 
 * @author Colin
 */
public class ArrayType implements Type {
	/**
	 * This is the type of elements contained in this list.
	 */
	private Type elementType = null;

	/**
	 * A list of all attributes and methods this type provides.
	 */
	private List<Member> members = new ArrayList<Member>();

	/**
	 * The methods arrays provide are added in this method. Arrays have only
	 * three public methods and no public attributes.
	 */
	private void addDefaultMembers() {
		members.add(Member.method("get", elementType,
				SimpleType.create("Integer")));
		members.add(Member.method("add", SimpleType.create("Void"), elementType));
		members.add(Member.method("size", SimpleType.create("Integer")));
	}

	/**
	 * Create a type representing something like elementType[] or
	 * List<elmentType>.
	 * 
	 * @param elementType
	 *            the type of the elements in this list
	 */
	private ArrayType(Type elementType) {
		this.elementType = elementType;
		addDefaultMembers();
	}

	/**
	 * Every array type can be used where wild card is expected.
	 */
	public static final Type wildcard = new ArrayType(SimpleType.wildcard);

	/**
	 * Return a new array type for the given element type. This method only
	 * exists, so that ArrayType, SimpleType and FunctionType objects can be
	 * created in the same way (using the create()-method).
	 * 
	 * @param base
	 *            The element type
	 */
	public static Type create(Type base) {
		return new ArrayType(base);
	}

	/**
	 * @return the element type
	 */
	public Type getTypeArgument() {
		return elementType;
	}

	/**
	 * Checks whether this can be treated as a subtype of the other type given.
	 * 
	 * @param other
	 *            The type to compare this to
	 * @return true if and only if this can be treated as a subtype of other
	 */
	public boolean matches(Type other) {
		return other instanceof ArrayType
				&& elementType.matches(((ArrayType) other).getTypeArgument());
	}

	public boolean equals(Type other) {
		if (other == null || !(other instanceof ArrayType))
			return false;
		return toString().equals(other.toString());
	}

	/**
	 * Check whether this as a member with name given.
	 * 
	 * @param name
	 *            the name of the member to look for
	 * @return true if and only if the type represented by this object has a
	 *         member with given name
	 */
	public boolean hasMember(String name) {
		return 0 != getMember(name).size();
	}

	/**
	 * Get members by their name. If there are several methods with the same
	 * name a list of all of their types is returned.
	 * 
	 * @param name
	 *            the name to search for in the members list
	 * @return all members with that name
	 */
	public List<Type> getMember(String name) {
		List<Type> result = new ArrayList<Type>();
		for (Member m : members)
			if (m.getName().equals(name))
				result.add(m.getType());
		return result;
	}

	public String toString() {
		return elementType.toString() + "[]";
	}

	/**
	 * Creates a representation of this type that can be used in the generated
	 * Java code.
	 * 
	 * @return internal representation of this type
	 */
	public String getJavaType() {
		return "PCList<" + elementType.getJavaType() + ">";
	}

	/**
	 * This method is used to create a new ArrayType given the fully qualified
	 * name of the the element class.
	 * 
	 * @return that new ArrayType
	 */
	public static Type create(String typeName) {
		return create(SimpleType.create(typeName));
	}
}
