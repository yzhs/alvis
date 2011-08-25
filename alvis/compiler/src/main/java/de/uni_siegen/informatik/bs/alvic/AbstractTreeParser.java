package de.uni_siegen.informatik.bs.alvic;

import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

/**
 * Used to avoid excessive reflection usage that could theoretically lead to
 * exceptions being thrown.
 *
 * @author Colin Benner
 */
public abstract class AbstractTreeParser extends TreeParser {
	protected List<RecognitionException> exceptions = new ArrayList<RecognitionException>();
	protected Parser parser;

	public AbstractTreeParser(TreeNodeStream input) {
		super(input);
	}

	public AbstractTreeParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public abstract void setTreeAdaptor(TreeAdaptor treeAdaptor);

	/**
	 * Parse the entire AST.
	 */
	public abstract Object program() throws RecognitionException;

	public List<RecognitionException> getExceptions() {
		return exceptions;
	}

	@Override
	public void reportError(RecognitionException re) {
		exceptions.add(re);
	}

	public void setParser(Parser p) {
		parser = p;
	}
}
