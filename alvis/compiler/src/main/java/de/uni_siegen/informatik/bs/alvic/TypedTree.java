package de.uni_siegen.informatik.bs.alvic;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 * This is a variant of CommonTree that allows us to pass the type of a subtree
 * in the AST around. We actually use this to tell the code generator what types
 * the 'null' and 'infty' literals are.
 * 
 * @author Colin
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

	public int getEndLine() {
		return getEnd().getLine();
	}

	public int getEndCharPositionInLine() {
		CommonToken end = (CommonToken)getEnd();
		return end.getCharPositionInLine() + end.getStopIndex() - end.getStartIndex();
	}

	public Token getEnd() {
		if (null == token && getChildCount() > 0)
			return ((TypedTree) getChild(getChildCount() - 1)).getEnd();
		return token;
	}

	public Token getStart() {
		if (null == token && getChildCount() > 0)
			return ((TypedTree) getChild(0)).getStart();
		return token;
	}

	public String treeToString() {
		if (null == token)
			if (getChildCount() > 0)
				return ((TokenStream) ((TypedTree) getChild(0)).getToken()
						.getInputStream()).toString(getStart(), getEnd());
		return token.toString();
	}
}
