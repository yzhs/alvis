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
 * This exception describes the problem that the user tries to use an operator
 * of a given class when no operator with that name exists.
 * 
 * @author Colin Benner
 */
public class UnknownOperatorException extends UnknownMemberException {
	private static final long serialVersionUID = 3837290428993154987L;

	/**
	 * @param object
	 *            The left argument of the operator.
	 * @param op
	 *            The operator that is not available with this left argument.
	 * @param tree
	 *            The tree of which the operator is the root.
	 */
	public UnknownOperatorException(Type object, String op, TypedTree tree) {
		super(object, op, tree);
	}

	@Override
	public String toString() {
		return "Operator error " + getPos() + ": Class '" + object
				+ "' does not have any operator called '" + member + "'.";
	}
}
