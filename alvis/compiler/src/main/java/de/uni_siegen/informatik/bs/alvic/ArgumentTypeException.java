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
 * This exception describes the problem that a function is called with the wrong
 * number of arguments.
 *
 * @author Colin Benner
 */
public class ArgumentTypeException extends TypeMismatchException {
	private static final long serialVersionUID = -6914907729944478299L;

	/**
	 * The number of the argument that caused the exception.
	 */
	protected int n;

	/**
	 * Create new ArgumentTypeException instance.
	 *
	 * @param method
	 *            The method which was called with the wrongly typed argument.
	 * @param expected
	 *            The type the argument should have had.
	 * @param n
	 *            The position of the offending argument in the argument list.
	 * @param given
	 *            The type the argument actually has.
	 * @param tree
	 *            The subtree of the function call, might be changed to the
	 *            subtree of the n-th argument.
	 */
	public ArgumentTypeException(String method, Type expected, int n,
			Type given, TypedTree tree) {
		super(expected, given, method, tree);
		this.expected = expected;
		this.n = n;
		this.given = given;
	}

	@Override
	public String toString() {
		return "Type error " + getPos() + ": Argument " + n + " of method '"
				+ expr + "' is expected to be of type '" + expected
				+ "' but is of type '" + given + "'.";
	}

	/**
	 * @return the number of the argument that has the wrong type.
	 */
	public int getArgumentNumber() {
		return n;
	}

	public String getMethod() {
		return getExpr();
	}
}
