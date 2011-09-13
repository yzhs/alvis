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
public class ArgumentNumberException extends TypeException {
	private static final long serialVersionUID = 6261123203257225538L;

	/**
	 * This is the name of the method being called.
	 */
	protected String method;

	/**
	 * The number of arguments the function would have accepted.
	 */
	protected int given;

	/**
	 * The number of the arguments the method expected.
	 */
	protected int expected;

	/**
	 * Create new ArgumentNumberException instance.
	 * 
	 * @param method
	 *            The name of the method or function that is called with the
	 *            wrong number of arguments.
	 * @param expected
	 *            The number of arguments the method or function expects.
	 * @param given
	 *            The actual number of arguments given.
	 * @param tree
	 *            The tree containing the function call.
	 */
	public ArgumentNumberException(String method, int expected, int given,
			TypedTree tree) {
		super(tree);
		this.method = method;
		this.expected = expected;
		this.given = given;
	}

	/**
	 * @return a textual representation of the problem.
	 */
	@Override
	public String toString() {
		return "Argument error " + getPos() + ": Method " + " '" + method
				+ "' expects " + expected + " parameters "
				+ "but is called with " + given + " arguments.";
	}

	public String getMethod() {
		return method;
	}

	public int getGiven() {
		return given;
	}

	public int getExpected() {
		return expected;
	}
}
