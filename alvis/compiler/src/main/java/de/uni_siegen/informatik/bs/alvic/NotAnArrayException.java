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
 * This exception is used when trying to index something that is not an array.
 * 
 * @author Colin Benner
 */
public class NotAnArrayException extends TypeException {
	private static final long serialVersionUID = 8561795105957083725L;

	/**
	 * The type of the expression.
	 */
	protected Type type;

	/**
	 * This is what was indexed, but is not an array.
	 */
	protected String expr;

	/**
	 * @param type
	 *            The expressions actual type.
	 * @param expr
	 *            The expression that caused the problem itself.
	 * @param tree
	 *            The identifier that was used as an array.
	 */
	public NotAnArrayException(Type type, String expr, TypedTree tree) {
		super(tree);
		this.type = type;
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "Indexing error " + getPos() + ": "
				+ "Tried to index '" + expr + "', which has type '" + type
				+ "', which is not an array type.";
	}

	/**
	 * @return the type of the expression the user tried to use as if it was an array.
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @return the expression the user tried to use as if it was an array.
	 */
	public String getExpr() {
		return expr;
	}
}
