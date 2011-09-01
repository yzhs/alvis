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
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.testng.annotations.Test;
import de.uni_siegen.informatik.bs.alvic.TLexer;
import org.antlr.runtime.*;

@Test
public class LexerTest {
	private String algorithm = "" + //$NON-NLS-1$
			"BFS(Graph G, Vertex s) begin\n" + //$NON-NLS-1$
			"\tfor Vertex v in G.vertices begin\n" + //$NON-NLS-1$
			"\t\tv.color = \"white\",\n" + //$NON-NLS-1$
			"\t\tv.distance = infty,\n" + //$NON-NLS-1$
			"\t\tv.pi = null,\n" + //$NON-NLS-1$
			"\tend\n" + //$NON-NLS-1$
			"\ts.color = \"grey\";\n" + //$NON-NLS-1$
			"\ts.distance = 0,\n" + //$NON-NLS-1$
			"\tQueue Q,\n" + //$NON-NLS-1$
			"\tQ.enqueue(s),\n" + //$NON-NLS-1$
			"\twhile ! Q.isEmpty() begin\n" + //$NON-NLS-1$
			"\t\tu = Q.dequeue(),\n" + //$NON-NLS-1$
			"\t\tfor Vertex v in u.adj() begin\n" + //$NON-NLS-1$
			"\t\t\tif v.color == \"white\" begin\n" + //$NON-NLS-1$
			"\t\t\t\tv.color = \"grey\";\n" + //$NON-NLS-1$
			"\t\t\t\tv.distance = u.distance + 1,\n" + //$NON-NLS-1$
			"\t\t\t\tv.pi = u,\n" + //$NON-NLS-1$
			"\t\t\t\tQ.enqueue(v),\n" + //$NON-NLS-1$
			"\t\t\tend\n" + //$NON-NLS-1$
			"\t\tend\n" + //$NON-NLS-1$
			"\tend\n" + //$NON-NLS-1$
			"end\n"; //$NON-NLS-1$

	private void printTestName() {
		System.out.println(Thread.currentThread().getStackTrace()[2]
				.getMethodName());
	}

	static {
		List<String> types = new ArrayList<String>();
		types.add("Boolean");
		types.add("Integer");
		types.add("Float");
		types.add("String");
		types.add("Graph");
		types.add("Vertex");
		types.add("Queue");
		TLexer.addTypes(types);
	}

	@Test
	public void loadValidCode() {
		printTestName();
		CharStream input = null;
		try {
			input = new ANTLRFileStream("target/test-classes/BFS.code");
		} catch (IOException e) {
			e.printStackTrace();
		}
		TLexer lexer = new TLexer(input);
		assert lexer.getExceptions().isEmpty() : "encountered an exception";
	}

	private String allTokens(TLexer lexer) {
		Token token;
		String result = "";
		while ((token = lexer.nextToken()) != Token.EOF_TOKEN) {
			result += token.getText() + "\n";
		}
		return result;
	}

	@Test
	public void loadInvalidCode() {
		printTestName();
		CharStream input = null;
		try {
			input = new ANTLRFileStream(
					"target/test-classes/InvalidTokens.code");
		} catch (IOException e) {
			e.printStackTrace();
		}
		TLexer lexer = new TLexer(input);
		String tok = allTokens(lexer);
		assert !lexer.getExceptions().isEmpty() : "sucessfully lexed invalid code:\n"
				+ tok;
	}

	@Test
	public void lexString() {
		printTestName();
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		assert lexer.getExceptions().isEmpty() : "encountered an exception";
	}

	@Test
	public void sortTokensID() {
		printTestName();
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		List<Token> ids = lexer.getIdentifiers();
		assert !ids.isEmpty() : "no identifiers found";
		assert ids.get(1).getText().equals("G") : "found wrong identifier '"
				+ ids.get(1).getText() + "' instead of the expected 'G'";
	}

	@Test
	public void sortTokensKW() {
		printTestName();
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		List<Token> kwds = lexer.getKeywords();
		assert !kwds.isEmpty() : "no keywords found";
		assert kwds.get(0).getText().equals("begin") : "found wrong keyword '"
				+ kwds.get(0).getText() + "' instead of 'begin'";
	}

	@Test
	public void multipleRuns() {
		printTestName();
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		List<Token> kwds = lexer.getKeywords();
		List<Token> ids = lexer.getIdentifiers();
		assert !ids.isEmpty() : "no identifiers found";
		assert !kwds.isEmpty() : "no keywords found";
	}

	@Test
	public void getTokenByNumbers1() {
		printTestName();
		String algorithm = "BFS(Graph G, Vertex s) begin\n"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		Token toGet = lexer.getTokenByNumbers(1, 0);
		assert "BFS".equals(toGet.getText()) : "found wrong token '"
				+ toGet.getText() + "' instead of 'BFS'";
	}

	@Test
	public void getTokenByNumbers2() {
		printTestName();
		String algorithm = "BFS(Graph G, Vertex s) begin\n"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		Token toGet = lexer.getTokenByNumbers(1, 8);
		assert "Graph".equals(toGet.getText()) : "found wrong token '"
				+ toGet.getText() + "' instead of 'Graph'";
	}

	@Test
	public void getTokenByNumbers3() {
		printTestName();
		String algorithm = "BFS(Graph G, Vertex s) begin\n"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		Token toGet = lexer.getTokenByNumbers(1, 24);
		assert "begin".equals(toGet.getText()) : "found wrong token '"
				+ toGet.getText() + "' instead of 'begin'";
	}

	@Test
	public void getTokenByNumbers4() {
		printTestName();
		String algorithm = "" + //$NON-NLS-1$
				"BFS(Graph G, Vertex s) begin\n" + //$NON-NLS-1$
				"\tfor Vertex v in G.vertices begin\n" + //$NON-NLS-1$
				"\t\tv.color = \"white\",\n" + //$NON-NLS-1$
				"\t\tv.distance = infty,\n" + //$NON-NLS-1$
				"\t\tv.pi = null,\n" + //$NON-NLS-1$
				"\tend\n"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		Token toGet = lexer.getTokenByNumbers(6, 1);
		assert "end".equals(toGet.getText()) : "found token '"
				+ toGet.getText() + "' instead of 'end'";
	}

/*
	@Test
	public void autoCompletionKeyWords1() {
		printTestName();
		String algorithm = "whil"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		assert lexer.tryAutoCompletion(lexer.getTokenByNumbers(1, 0)).get(0)
				.equals("while") : "auto completion gave an unexpected result: "
				+ lexer.tryAutoCompletion(lexer.getTokenByNumbers(1, 0))
				+ " instead of some list starting with 'while'";
	}

	@Test
	public void zautoCompletionKeyWords2() {
		printTestName();
		String algorithm = "" + //$NON-NLS-1$
				"ganz viele tolle Tokens die hier dann stehen koennen \n" + //$NON-NLS-1$
				"wie viele Tok"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		lexer.scan();
		assert lexer.tryAutoCompletion(lexer.getTokenByNumbers(2, 11)).get(0)
				.equals("Tokens") : "expected to find 'Tokens' but found '"
				+ lexer.tryAutoCompletion(lexer.getTokenByNumbers(2, 11))
						.get(0) + "' when trying to complete '"
				+ lexer.getTokenByNumbers(2, 11) + "'";
	}
*/

	@Test
	public void checkTypeNames() {
		printTestName();
		assert TLexer.isTypeName("Integer") : "expected 'Integer' to be a type";
		assert TLexer.isTypeName("Float") : "expected 'Float' to be a type";
		assert TLexer.isTypeName("Boolean") : "expected 'Boolean' to be a type";
		assert TLexer.isTypeName("String") : "expected 'String' to be a type";
		assert TLexer.isTypeName("Graph") : "expected 'Graph' to be a type";
		assert TLexer.isTypeName("Vertex") : "expected 'Vertex' to be a type";
		assert TLexer.isTypeName("Queue") : "expected 'Queue' to be a type";
	}

	@Test
	public void checkIdentifiers() {
		printTestName();
		assert !TLexer.isTypeName("foo") : "expected 'foo' to be an identifier";
		assert !TLexer.isTypeName("a") : "expected 'a' to be an identifier";
		assert !TLexer.isTypeName("if_") : "expected 'if_' to be an identifier";
	}
}
