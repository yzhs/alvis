package de.uni_siegen.informatik.bs.alvic;

import java.util.List;
import java.util.ArrayList;
import org.antlr.runtime.*;

/**
 * The super class of the generated parser. It is extended by the generated code
 * because of the superClass option in the .g file.
 * 
 * This class contains any helper functions used within the parser grammar
 * itself, as well as any overrides of the standard ANTLR Java runtime methods,
 * such as an implementation of a custom error reporting method, symbol table
 * populating methods and so on.
 * 
 * @author Jim Idle - Temporal Wave LLC - jimi@temporal-wave.com
 */
public abstract class AbstractTParser extends Parser {
	/**
	 * List of all exceptions that are thrown while parsing.
	 */
	private List<RecognitionException> exceptions = new ArrayList<RecognitionException>();

	/**
	 * Create a new parser instance, pre-supplying the input token stream.
	 * 
	 * @param input
	 *            The stream of tokens that will be pulled from the lexer
	 */
	protected AbstractTParser(TokenStream input) {
		super(input);
	}

	/**
	 * Create a new parser instance, pre-supplying the input token stream and
	 * the shared state.
	 * 
	 * This is only used when a grammar is imported into another grammar, but we
	 * must supply this constructor to satisfy the super class contract.
	 * 
	 * @param input
	 *            The stream of tokens that will be pulled from the lexer
	 * @param state
	 *            The shared state object created by an interconnected grammar
	 */
	protected AbstractTParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	/**
	 * @return a list of all exceptions the parser encountered.
	 */
	public List<RecognitionException> getExceptions() {
		return exceptions;
	}

	/**
	 * This method is called whenever an exception occurs when parsing. It
	 * simply stores the exception in a list.
	 * 
	 * @param e
	 *            The exception that occurred
	 */
	@Override
	public void reportError(RecognitionException e) {
		exceptions.add(e);
	}
}
