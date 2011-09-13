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

/**
 * This exception is used when the user tries to return something of the wrong
 * type, a function with return-type void contains a return statement with a
 * parameter or a non-void functions contains an empty return statement.
 * 
 * @author Colin Benner
 */
public class InvalidReturnException extends TypeException {
	private static final long serialVersionUID = -1434703988506333067L;

	/**
	 * The type that was expected when encountering the return statement.
	 */
	protected Type expected;

	/**
	 * What the user tried to return.
	 */
	protected Type given;

	/**
	 * The function the error occurred in.
	 */
	protected String function;

	/**
	 * The return statement.
	 */
	protected String stat;

	/**
	 * @param expected
	 *            The type that was expected.
	 * @param given
	 *            The type that was actually found.
	 * @param function
	 *            The function in question.
	 * @param stat
	 *            The actual return statement
	 * @param tree
	 *            The subtree with the return statement.
	 */
	public InvalidReturnException(Type expected, Type given, String function,
			String stat, TypedTree tree) {
		super(tree);
		this.expected = expected;
		this.given = given;
		this.function = function;
		this.stat = stat;
	}

	@Override
	public String toString() {
		if (expected.toString().equalsIgnoreCase("void"))
			return "Type error " + getPos() + ": Trying to return non-void "
					+ "value '" + stat + "' from function '" + function
					+ "' when an empty return statement was expected.";
		if (given == null)
			return "Type error " + getPos() + ": Trying to return 'void' from "
			        + " non-void function '" + function + "'.";
		return "Type error " + getPos() + ": Trying to return "
				+ "value '" + stat + "' of type '" + given
				+ "' when a value of " + "type '" + expected
				+ "' was expected.";
	}

	/**
	 * @return the type that was expected to be returned.
	 */
	public Type getExpected() {
		return expected;
	}
	
	/**
	 * @return the type that the used tried to return.
	 */
	public Type getGiven() {
		return given;
	}

	/**
	 * @return the function in which the invalid return statement is in.
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * @return the offending statement or the relevant part of it.
	 */
	public String getStat() {
		return stat;
	}
}
