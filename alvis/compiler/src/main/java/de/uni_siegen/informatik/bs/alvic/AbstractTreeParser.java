package de.uni_siegen.informatik.bs.alvic;

import java.util.List;

import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.TreeAdaptor;
import org.antlr.runtime.tree.TreeNodeStream;
import org.antlr.runtime.tree.TreeParser;

public abstract class AbstractTreeParser extends TreeParser {
	public AbstractTreeParser(TreeNodeStream input) {
		super(input);
	}

	public AbstractTreeParser(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public abstract void setTreeAdaptor(TreeAdaptor treeAdaptor);

	public abstract void setParser(Parser parser);
	
	public abstract Object program() throws RecognitionException;

	public abstract List<RecognitionException> getExceptions();
}
