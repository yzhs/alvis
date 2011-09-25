/*
 * Copyright (c) 2011 Colin Benner
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the
 * Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
	public boolean isSubtypeOf(Type other);

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
