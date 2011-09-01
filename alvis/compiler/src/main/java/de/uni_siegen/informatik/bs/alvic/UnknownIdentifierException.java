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
 * This exception is thrown when encountering an identifier that was not defined
 * in the current scope.
 * 
 * @author Colin Benner
 */
public class UnknownIdentifierException extends TypeException {
	private static final long serialVersionUID = -2452015985530518766L;

	/**
	 * The identifier that was used before being used in the current scope.
	 */
	protected String identifier;

	/**
	 * Describes the problem that the given identifier was used but not
	 * declared.
	 * 
	 * @param identifier
	 *            The name of the identifier in question.
	 * @param tree
	 *            The token containing the identifier.
	 */
	public UnknownIdentifierException(String identifier, TypedTree tree) {
		super(tree);
		this.identifier = identifier;
	}

	@Override
	public String toString() {
		return "Type error " + getPos() + ": Identifier '"
				+ identifier + "' was used before being declared in the "
				+ "current scope.";
	}

	/**
	 * @return the unknown identifier. 
	 */
	public String getIdentifier() {
		return identifier;
	}
}
