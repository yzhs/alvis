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

import org.antlr.runtime.RecognitionException;

/**
 * Implementations of this exception are used to handle all type checker
 * generated problems.
 *
 * @author Colin Benner
 */
public abstract class TypeException extends RecognitionException {
	private static final long serialVersionUID = -2651349912464757271L;

	/**
	 * The last line containing part of the invalid code.
	 */
	public int endLine;
	
	/**
	 * The last column containing part of the invalid code in the last line.
	 */
	public int endCharPositionInLine;

	public abstract String toString();

	/**
	 * @param tree the tree in which the error occurred.
	 */
	protected TypeException(TypedTree tree) {
		this.token = tree.getToken();
		this.line = tree.getLine();
		this.endLine = tree.getEndLine();
		this.charPositionInLine = tree.getCharPositionInLine();
		this.endCharPositionInLine = tree.getEndCharPositionInLine();
	}

	/**
	 * 
	 * @return a textual representation of the range in which which the error occurred.
	 */
	public String getPos() {
		return "(from " + line + ":" + charPositionInLine + " to " + endLine + ":" + endCharPositionInLine + ")";
	}
}
