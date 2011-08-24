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
