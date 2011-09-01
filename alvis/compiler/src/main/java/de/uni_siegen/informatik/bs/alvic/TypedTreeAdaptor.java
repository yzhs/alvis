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

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 * This class is used to replace the CommonTree-producing CommonTreeAdaptor by a
 * tree adaptor that produces TypedTree nodes. We need to do this so that the
 * type checker can pass its results (especially the types it inferred for the
 * 'null' and 'infty' literals) to the code generator.
 * 
 * @author Colin Benner
 */
public class TypedTreeAdaptor extends CommonTreeAdaptor {
	/**
	 * Create the tree node that represents the end of a list.
	 * 
	 * @return empty TypedTree
	 */
	@Override
	public Object nil() {
		return create(null);
	}

	/**
	 * Create TypedTree given the desired payload.
	 * 
	 * @param payload
	 *            The token to be stored in the TypedTree.
	 * @return new TypedTree with the given payload.
	 */
	@Override
	public Object create(Token payload) {
		return new TypedTree(payload);
	}

	/**
	 * Duplicate a given tree.
	 * 
	 * @param t
	 *            The tree to be duplicated.
	 * @return a copy of that tree.
	 */
	@Override
	public Object dupNode(Object t) {
		if (t == null)
			return null;
		return ((Tree) t).dupNode();
	}

	/**
	 * Create an error node to represent a parsing problem.
	 * 
	 * @param input
	 *            The token stream
	 * @param start
	 *            The first token in the subtree
	 * @param stop
	 *            The last token in the subtree
	 * @param e
	 *            The exception that occurred.
	 * @return new TypedErrorNode describing the problem.
	 */
	@Override
	public Object errorNode(TokenStream input, Token start, Token stop,
			RecognitionException e) {
		return new TypedErrorNode(input, start, stop, e);
	}
}
