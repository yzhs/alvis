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
 * This is a reimplementation of CommonErrorNode as a subclass of TypedError. We
 * need this, so we can use TypedTree as our AST type. Without TypedErrorNode
 * ANTLR would try to cast CommonErrorNodes to TypedTree which cannot work,
 * because CommonErrorNode is not a subtype of TypedTree.
 * 
 * All of this stuff has to be reimplemented because Java does not allow
 * multiple inheritance.
 * 
 * @author Colin Benner
 */
public class TypedErrorNode extends TypedTree {
	/**
	 * The input which the parser failed to parse.
	 */
	public IntStream inputStream;

	/**
	 * The first Token in the problematic subtree.
	 */
	public Token start;

	/**
	 * The last Token in the problematic subtree.
	 */
	public Token stop;

	/**
	 * The exception that was produced.
	 */
	public RecognitionException re;

	/**
	 * Create error node.
	 * 
	 * @param input
	 *            The stream of input tokens.
	 * @param start
	 *            The first token in the problematic subtree.
	 * @param stop
	 *            The last token in the problematic subtree.
	 * @param re
	 *            The exception that was thrown.
	 */
	public TypedErrorNode(TokenStream input, Token start, Token stop,
			RecognitionException re) {
		if (stop == null
				|| (stop.getTokenIndex() < start.getTokenIndex() && stop
						.getType() != Token.EOF))
			stop = start;

		this.inputStream = input;
		this.start = start;
		this.stop = stop;
		this.re = re;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	/**
	 * Return the token type.
	 * 
	 * @return Token.INVALID_TOKEN_TYPE because this is an error node.
	 */
	@Override
	public int getType() {
		return Token.INVALID_TOKEN_TYPE;
	}

	/**
	 * @return the source code in the problematic section
	 */
	@Override
	public String getText() {
		String badText = null;
		if (start instanceof Token) {
			int startIndex = ((Token) start).getTokenIndex();
			int stopIndex = ((Token) stop).getTokenIndex();
			if (((Token) stop).getType() == Token.EOF) {
				stopIndex = ((TokenStream) inputStream).size();
			}
			badText = ((TokenStream) inputStream).toString(startIndex,
					stopIndex);
		} else if (start instanceof Tree) {
			badText = ((TreeNodeStream) inputStream).toString(start, stop);
		} else {
			badText = "<unknown>";
		}
		return badText;
	}

	/**
	 * Create the error message that will be used by the toStringTree() method.
	 */
	@Override
	public String toString() {
		if (re instanceof UnwantedTokenException) {
			return "<extraneous: "
					+ ((UnwantedTokenException) re).getUnexpectedToken()
					+ ", resync=" + getText() + ">";
		} else if (re instanceof MissingTokenException) {
			return "<missing type: "
					+ ((MissingTokenException) re).getMissingType() + ">";
		} else if (re instanceof MismatchedTokenException) {
			return "<mismatched token: " + re.token + ", resync=" + getText()
					+ ">";
		} else if (re instanceof NoViableAltException) {
			return "<unexpected: " + re.token + ", resync=" + getText() + ">";
		}
		return "<error: " + getText() + ">";
	}
}
