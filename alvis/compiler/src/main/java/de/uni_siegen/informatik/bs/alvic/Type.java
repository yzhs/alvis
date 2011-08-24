package de.uni_siegen.informatik.bs.alvic;

import java.util.List;

/**
 * Type is used to describe a type as it is used in Alvis' language.
 * 
 * @author Colin Benner
 */
public interface Type {
	/**
	 * If this Type object represents a generic class, this returns its type
	 * parameter, null otherwise.
	 * 
	 * @return the type argument
	 */
	public Type getTypeArgument();

	/**
	 * This indicates whether the class represented by this Type object has a
	 * member with the given name;
	 * 
	 * @param name
	 *            The name that is supposed to be checked.
	 * @return whether there is a member of this name.
	 */
	public boolean hasMember(String name);

	/**
	 * Return the type of a member.
	 * 
	 * @param name
	 *            The name of the member.
	 * @return the type of the member
	 */
	public List<Type> getMember(String name);

	/**
	 * Return whether an object of the type represented by this object can be
	 * used where something of a given type is expected.
	 * 
	 * @param other
	 *            the expected type
	 * @return whether this type is a subtype of other
	 */
	public boolean matches(Type other);

	/**
	 * @param other The type to compare 'this' with.
	 * @return whether 'this' and 'other' are exactly the same type 
	 */
	public boolean equals(Type other);

	/**
	 * Get a textual representation like the one used by the Alvis-user.
	 * 
	 * @return String representation of this type like it is used in the pseudo
	 *         code.
	 */
	public String toString();

	/**
	 * Get a textual representation of this type.
	 * 
	 * @return the name of a class in one of the packages available to the user.
	 */
	public String getJavaType();
}
