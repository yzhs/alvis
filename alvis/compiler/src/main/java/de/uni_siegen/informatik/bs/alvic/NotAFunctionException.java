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
 * This exception is used when the user tries to call something that is not a
 * function.
 * 
 * @author Colin Benner
 */
public class NotAFunctionException extends TypeException {
	private static final long serialVersionUID = 2290856303317891280L;

	/**
	 * The type of the expression.
	 */
	protected Type type;

	/**
	 * This is what was called, but is not a function.
	 */
	protected String expr;

	/**
	 * @param type
	 *            The type of the expression that was called.
	 * @param expr
	 *            The actual expression that was called.
	 * @param tree
	 *            The function's identifier
	 */
	public NotAFunctionException(Type type, String expr, TypedTree tree) {
		super(tree);
		this.type = type;
		this.expr = expr;
	}

	@Override
	public String toString() {
		return "Function call error " + getPos() + ": "
				+ "Tried to call '" + expr + "', which has type '" + type
				+ "', which is not a function type.";
	}

	/**
	 * @return the type of the expression the user tried to call.
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @return the expression the user tried to call.
	 */
	public String getExpr() {
		return expr;
	}
}
