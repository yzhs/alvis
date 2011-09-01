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

/**
 * A FunctionType describes what type a function returns and what types of
 * parameters it accepts.
 * 
 * @author Colin Benner
 */
public class FunctionType implements Type {
	/**
	 * This will always be null, as long as we do not allow functions to have
	 * type arguments.
	 */
	private List<Type> argumentTypes = null;

	/**
	 * The type returned by this function.
	 */
	private Type returnType = null;

	/**
	 * This is needed to run the tests and to create the wild card function
	 * type.
	 */
	private FunctionType() {
	}

	/**
	 * This object matches any type object that is a FunctionType.
	 */
	public static final FunctionType wildcard = new FunctionType();

	/**
	 * Create a function type representing a function with the given argument
	 * and return types.
	 * 
	 * @param argumentTypes
	 *            the types of arguments the function expects (in order)
	 * @param returnType
	 *            the type of the value the function returns
	 */
	private FunctionType(List<Type> argumentTypes, Type returnType) {
		this.argumentTypes = argumentTypes;
		this.returnType = returnType;
	}

	/**
	 * This method is only here, so FunctionType objects can be created in the
	 * same way as SimpleType objects.
	 * 
	 * @param args
	 *            list of the argument types of the function represented by this
	 *            FunctionType
	 * @param ret
	 *            the return type of this function
	 * @return a new FunctionType object representing a function taking
	 *         arguments of the given types and returning a result of the given
	 *         type
	 */
	public static FunctionType create(List<Type> args, Type ret) {
		return new FunctionType(args, ret);
	}

	/**
	 * Create a representation of this type that is equal for two types if and
	 * only if they are exactly the same.
	 * 
	 * @return a nice textual representation of this type
	 */
	public String toString() {
		if (this == wildcard)
			return "(*) -> *";

		String result = "(";
		if (argumentTypes.size() == 0)
			return "() -> " + returnType.toString();

		for (Type t : argumentTypes)
			result += t + ", ";
		result = result.substring(0, result.length() - 2);
		result += ") -> " + returnType.toString();

		return result;
	}

	/**
	 * Check whether a function of this type can be used where a function of
	 * type other is expected.
	 * 
	 * @param other
	 *            the type to compare this to
	 * @return true if and only if 'this' can be used where 'other' is expected
	 */
	public boolean matches(Type other) {
		if (!(other instanceof FunctionType))
			return false;

		if (other == wildcard)
			return true;

		if (this == wildcard)
			return false;

		FunctionType tmp = (FunctionType) other;
		if (argumentTypes.size() != tmp.getArgumentTypes().size())
			return false;

		int i = 0;
		for (Type t : tmp.getArgumentTypes())
			if (!argumentTypes.get(i++).matches(t))
				return false;

		return tmp.getReturnType().matches(returnType);
	}

	/**
	 * @return true if and only if the other is a function type and both
	 *         describe a function of the exact same type.
	 */
	public boolean equals(Type other) {
		return toString().equals(other.toString());
	}

	/**
	 * This function will always return false because in Alvis, as in Java,
	 * functions are not objects and therefore do not have either attributes or
	 * methods.
	 * 
	 * @param name
	 *            is just ignored
	 * @return false
	 */
	public boolean hasMember(String name) {
		return false;
	}

	/**
	 * This function will always return the empty list because in Alvis, as in
	 * Java, functions do not have any attributes or methods.
	 * 
	 * @param name
	 *            is simply ignored
	 * @return empty list
	 */
	public List<Type> getMember(String name) {
		// Functions do not have members
		return new ArrayList<Type>();
	}

	/**
	 * Get a list of types that the function accepts as arguments.
	 * 
	 * @return the argument types of this function
	 */
	public List<Type> getArgumentTypes() {
		return argumentTypes;
	}

	/**
	 * @return the function's return type.
	 */
	public Type getReturnType() {
		return returnType;
	}

	/**
	 * We do not use this method at the moment. We will need it if we allow
	 * functions to generic arguments.
	 * 
	 * @return null because we do not allow generic functions
	 */
	public Type getTypeArgument() {
		return null;
	}

	/**
	 * We do not use this method at the moment. We will need it if we allow
	 * functions to generic arguments.
	 * 
	 * @param arg
	 *            this is simply ignored because we do not allow generic
	 *            functions
	 */
	public void setTypeArgument(Type arg) {
	}

	/**
	 * In Java functions (or methods) can not be stored in a variable and thus
	 * there is no need to write down the type of a function. That is only done
	 * implicitly when defining or declaring a function, for which parameter
	 * names are needed, but here we only have their types.
	 * 
	 * @return null
	 */
	public String getJavaType() {
		return null;
	}
}
