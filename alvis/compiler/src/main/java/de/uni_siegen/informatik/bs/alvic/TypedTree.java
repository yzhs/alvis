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
 * This is a variant of CommonTree that allows us to pass the type of a subtree
 * in the AST around. We actually use this to tell the code generator what types
 * the 'null' and 'infty' literals are.
 * 
 * @author Colin Benner
 */
public class TypedTree extends CommonTree {
	/**
	 * The type of this tree.
	 */
	protected Type type;

	/**
	 * This is needed only for the constructor of TypedErrorNode.
	 */
	public TypedTree() {
	}

	/**
	 * Create new TypedTree without setting the type attribute.
	 * 
	 * @param token
	 *            The payload token.
	 */
	public TypedTree(Token token) {
		super(token);
	}

	/**
	 * Make a copy of a TypedTree object.
	 * 
	 * @param tree
	 *            The tree to duplicate.
	 */
	public TypedTree(TypedTree tree) {
		super(tree);
		this.type = tree.getVarType();
	}

	/**
	 * Set the type of this node.
	 * 
	 * @param type
	 *            The new type
	 */
	public void setVarType(Type type) {
		this.type = type;
	}

	/**
	 * Get the type of this node.
	 * 
	 * @return the type of this node.
	 */
	public Type getVarType() {
		return type;
	}

	/**
	 * Duplicate this tree.
	 * 
	 * @return a new copy of 'this'.
	 */
	public Tree dupNode() {
		return new TypedTree(this);
	}

	/**
	 * @return the line in which the leftmost descendant of this node begins.
	 */
	@Override
	public int getLine() {
		return getStart().getLine();
	}

	/**
	 * @return the column in which the leftmost descendant of this node begins.
	 */
	@Override
	public int getCharPositionInLine() {
		return getStart().getCharPositionInLine();
	}

	/**
	 * @return the line in which the rightmost descendant of this node begins.
	 */
	public int getEndLine() {
		return getEnd().getLine();
	}

	/**
	 * @return the column in which the rightmost descendant of this node begins.
	 */
	public int getEndCharPositionInLine() {
		CommonToken end = (CommonToken) getEnd();
		return end.getCharPositionInLine() + end.getStopIndex()
				- end.getStartIndex();
	}

	/**
	 * @return last token in this tree.
	 */
	public Token getEnd() {
		if (getChildCount() > 0)
			return ((TypedTree) getChild(getChildCount() - 1)).getEnd();
		return token;
	}

	/**
	 * @return first token in this tree.
	 */
	public Token getStart() {
		if (getChildCount() > 0)
			return ((TypedTree) getChild(0)).getStart();
		return token;
	}

	/**
	 * Print this tree.
	 * 
	 * @param parser
	 *            The TParser instance used by the compiler.
	 * @return the original source code from which this tree was created
	 */
	public String treeToString(Parser parser) {
		if (getChildCount() > 0) {
			return parser.getTokenStream().toString(getStart(), getEnd());
		}
		if (null == token)
			return "";
		return token.getText();
	}
}
