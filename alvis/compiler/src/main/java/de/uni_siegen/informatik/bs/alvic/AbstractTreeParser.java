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

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

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
	
	public void checkAndPut(Map<String, Type> symbols, String id, Type type, TypedTree tree) throws DuplicateDeclarationException {
		if (symbols.containsKey(id))
			throw new DuplicateDeclarationException(id, tree);
		symbols.put(id, type);
	}
}
