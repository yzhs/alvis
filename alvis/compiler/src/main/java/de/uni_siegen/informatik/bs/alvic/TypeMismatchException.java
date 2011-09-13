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
 * This exception is used to indicate that something does not have the type it
 * is supposed to.
 * 
 * @author Colin Benner
 */
public class TypeMismatchException extends TypeException {
	private static final long serialVersionUID = 8394305381771635018L;

	/**
	 * The type that was expected when encountering the expression.
	 */
	protected Type expected;

	/**
	 * The type of the expression.
	 */
	protected Type given;

	/**
	 * The expression that has the wrong type.
	 */
	protected String expr;

	/**
	 * @param expected
	 *            The type that was expected.
	 * @param given
	 *            The type that was actually found.
	 * @param expr
	 *            The expression that has the wrong type.
	 * @param tree
	 *            The tree of the expression.
	 */
	public TypeMismatchException(Type expected, Type given, String expr, TypedTree tree) {
		super(tree);
		this.expected = expected;
		this.given = given;
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "Type error " + getPos() + ": Found '" + expr
				+ "' which has type '" + given + "', but expected "
				+ "an expression of type '" + expected + "'.";
	}

	/**
	 * @return the type that was expected.
	 */
	public Type getExpected() {
		return expected;
	}

	/**
	 * @return the type that was actually found.
	 */
	public Type getGiven() {
		return given;
	}

	/**
	 * @return the expression with that type.
	 */
	public String getExpr() {
		return expr;
	}
}
