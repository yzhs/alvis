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
 * This exception is used when the user tries to use a function call as the left
 * argument of the assignment operator.
 * 
 * @author Colin Benner
 */
public class InvalidAssignmentException extends TypeException {
	private static final long serialVersionUID = 7488963207043957012L;

	/**
	 * The left side of the assignment.
	 */
	protected String left;

	/**
	 * The right side of the assignment.
	 */
	protected String right;

	/**
	 * @param left
	 *            The expression to the left of the assignment operator.
	 * @param right
	 *            The expression to the right of the assignment operator.
	 * @param tree
	 *            The tree of the assignment.
	 */
	public InvalidAssignmentException(String left, String right, TypedTree tree) {
		super(tree);
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "Syntax error " + getPos() + ": The left "
				+ "side '" + left + "' of the assignement '" + left + " = "
				+ right + "' is a function call and thus not "
				+ "allowed in this place.";
	}

	/**
	 * @return the type of the left argument of the operator
	 */
	public String getLeft() {
		return left;
	}

	/**
	 * @return the type of the right argument of the operator
	 */
	public String getRight() {
		return right;
	}
}
