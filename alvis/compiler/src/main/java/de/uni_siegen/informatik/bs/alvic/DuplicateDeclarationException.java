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
 * This exception is used when the user tries do declare an identifier that was
 * already declared in that scope.
 * 
 * @author Colin Benner
 */
public class DuplicateDeclarationException extends TypeException {
	private static final long serialVersionUID = -7517459767870677237L;

	/**
	 * The identifier that was declared more than once.
	 */
	protected String id;

	/**
	 * @param identifier
	 *            The identifier that has already been declared.
	 * @param tree
	 *            The tree of the assignment.
	 */
	public DuplicateDeclarationException(String identifier, TypedTree tree) {
		super(tree);
		this.id = identifier;
	}

	@Override
	public String toString() {
		return "Syntax error " + getPos() + ": Trying to declare identifier '"
				+ id + "' which has already been declared.";
	}

	/**
	 * @return the type of the left argument of the operator
	 */
	public String getIdentifier() {
		return id;
	}
}
