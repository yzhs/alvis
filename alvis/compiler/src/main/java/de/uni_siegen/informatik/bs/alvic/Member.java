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
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

/**
 * Represents members of classes.
 * 
 * @author Colin Benner
 */
public class Member {
	/**
	 * The name of the member.
	 */
	private String name;

	/**
	 * Its type.
	 */
	private Type type;

	/**
	 * Construct new member with given name and type.
	 * 
	 * @param name
	 *            The name of the member
	 * @param type
	 *            The type of the member
	 */
	public Member(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	/**
	 * Create a Member object representing a function given its return- and
	 * argument types and a name. This method is just a helper to allow the user
	 * to conveniently just give an arbitrary list of argument types without the
	 * need to created a List of those explicitly.
	 * 
	 * @param name
	 *            the function's name
	 * @param returnType
	 *            the type the function returns
	 * @param argTypes
	 *            the types of arguments (in correct order) the function takes
	 * @return a Member representing that function
	 */
	public static Member method(String name, Type returnType, Type... argTypes) {
		List<Type> arguments = new ArrayList<Type>();
		for (Type t : argTypes)
			arguments.add(t);

		return new Member(name, FunctionType.create(arguments, returnType));
	}

	/**
	 * Create a new Member representing the given a Java Method object.
	 * 
	 * @param type
	 *            the object to which this function is going to be added as a
	 *            method
	 * @param method
	 *            the Method object used to represent the function
	 * @return a Member representing that function.
	 */
	public static Member method(SimpleType type, Method method, String name) {
		Type returnType;
		List<Type> argumentTypes = new ArrayList<Type>();

		String ret = method.getGenericReturnType().toString();
		if (method.getReturnType().toString().equals("void"))
			returnType = SimpleType.create("Void");
		else if (ret.startsWith("class "))
			returnType = SimpleType.create(ret);
		else
			// treat the return type as being given by the type argument
			// this only works with classes that only have one type argument
			returnType = type.getTypeArgument();

		for (java.lang.reflect.Type foo : method.getGenericParameterTypes())
			if (foo.toString().startsWith("class"))
				argumentTypes.add(SimpleType.create(foo.toString()));
			else
				// treat the parameter type as being given by the type argument
				// this only works with classes that only have one type argument
				argumentTypes.add(type.getTypeArgument());

		return new Member(name, FunctionType.create(argumentTypes,
				returnType));
	}

	/**
	 * Creates a new Member representing the attribute given.
	 * 
	 * @param type
	 *            this class is the one with this attribute
	 * @param repr
	 *            this is a representative of what can be stored in this
	 *            attribute
	 * @param field
	 *            the attribute given given as a Java Field
	 * @return the Member representing this attribute
	 */
	public static Member attribute(SimpleType type, Object repr, Field field, String name) {
		String typeName = field.getType().getName();

		if (type.getTypeArgument() == null) {
			if (typeName
					.equals("de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList"))
				return new Member(name, ArrayType.create(field.getGenericType()
						.toString().replaceAll("[^<]*<", "")
						.replaceAll(">$", "")));
			else
				// TODO handle attributes like Queue<Integer>
				return new Member(name, SimpleType.create(typeName));
		} else if (typeName
				.equals("de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCList"))
			// FIXME this only works correctly, if the class has only one type argument
			return new Member(name,
					ArrayType.create(((Class<?>) ((ParameterizedType) field
							.getGenericType()).getActualTypeArguments()[0])
							.getName()));
		else if (repr.getClass().getTypeParameters().length > 0)
			return new Member(name, SimpleType.create(typeName,
					SimpleType.create(field.getGenericType().toString())));
		else
			return new Member(name, SimpleType.create(typeName));
	}

	/**
	 * @return the name of the member.
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the type of the member.
	 */
	public Type getType() {
		return type;
	}
}
