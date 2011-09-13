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
 * This exception is used when the user writes something like 'x,', that is some
 * expression 'x' that is not a function call where a statement was expected.
 * 
 * @author Colin Benner
 */
public class InvalidStatementException extends TypeException {
	private static final long serialVersionUID = -2667840149739205105L;
	/**
	 * The invalid statement.
	 */
	protected String expr;

	/**
	 * @param expr
	 *            The expression that is no statement but used as one.
	 * @param token
	 *            A token of the expression.
	 */
	public InvalidStatementException(String expr, TypedTree tree) {
		super(tree);
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "Syntax error " + getPos() + ": Found '" + expr
				+ "' which is not a valid statement but used where a statement"
				+ " was expected.";
	}

	/**
	 * @return the expression that is used as if it were a statement.
	 */
	public String getExpr() {
		return expr;
	}
}
