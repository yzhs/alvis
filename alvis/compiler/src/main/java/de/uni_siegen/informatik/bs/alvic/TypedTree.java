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
	private Type type;

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
	 * @param type The new type
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
}
