import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

import org.testng.annotations.Test;
import de.uni_siegen.informatik.bs.alvic.TLexer;
import org.antlr.runtime.*;

@Test
public class LexerTest {
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
		CharStream input = null;
		try {
			input = new ANTLRFileStream("target/test-classes/BFS.code");
		} catch (IOException e) {
			e.printStackTrace();
		}
		TLexer lexer = new TLexer(input);
		assert lexer.getExceptions().isEmpty();
	}

	@Test
	public void loadInvalidCode() {
		CharStream input = null;
		try {
			input = new ANTLRFileStream(
					"target/test-classes/InvalidTokens.code");
		} catch (IOException e) {
			e.printStackTrace();
		}
		TLexer lexer = new TLexer(input);
		Token token = null;
		while ((token = lexer.nextToken()) != Token.EOF_TOKEN) {
			System.out.println(token.getText());
		}
		assert !lexer.getExceptions().isEmpty();
	}

	@Test
	public void lexString() {
		String algorithm = "" + //$NON-NLS-1$
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
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		assert lexer.getExceptions().isEmpty();
	}

	@Test
	public void sortTokensID() {
		String algorithm = "" + //$NON-NLS-1$
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
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		List<Token> ids = lexer.getIdentifier();
		System.out.println("-----------------");
		System.out.println(ids.get(1).getText());
		System.out.println("-----------------");
		assert !ids.isEmpty() && ids.get(1).getText().equals("G");
	}

	@Test
	public void sortTokensKW() {
		String algorithm = "" + //$NON-NLS-1$
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
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		List<Token> ids = lexer.getKeywords();
		System.out.println("-----------------");
		System.out.println(ids.get(0).getText());
		System.out.println("-----------------");
		assert !ids.isEmpty() && ids.get(0).getText().equals("begin");
	}

	@Test
	public void multipleRuns() {
		String algorithm = "" + //$NON-NLS-1$
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
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		List<Token> keys = lexer.getKeywords();
		List<Token> ids = lexer.getIdentifier();
		assert (!ids.isEmpty()) && (!keys.isEmpty());
	}

	@Test
	public void getTokenByNumbers1() {
		String algorithm = "" + //$NON-NLS-1$
				"BFS(Graph G, Vertex s) begin\n"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		Token toGet = lexer.getTokenByNumbers(1, 0);
		System.out.println(toGet);
		assert (toGet.getText().equals("BFS"));
	}

	@Test
	public void getTokenByNumbers2() {
		String algorithm = "" + //$NON-NLS-1$
				"BFS(Graph G, Vertex s) begin\n"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		Token toGet = lexer.getTokenByNumbers(1, 8);
		System.out.println(toGet);
		assert (toGet.getText().equals("Graph"));
	}

	@Test
	public void getTokenByNumbers3() {
		String algorithm = "" + //$NON-NLS-1$
				"BFS(Graph G, Vertex s) begin\n"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		Token toGet = lexer.getTokenByNumbers(1, 24);
		System.out.println(toGet);
		assert (toGet.getText().equals("begin"));
	}

	@Test
	public void getTokenByNumbers4() {
		String algorithm = "" + //$NON-NLS-1$
				"BFS(Graph G, Vertex s) begin\n" + //$NON-NLS-1$
				"\tfor Vertex v in G.vertices begin\n" + //$NON-NLS-1$
				"\t\tv.color = \"white\",\n" + //$NON-NLS-1$
				"\t\tv.distance = infty,\n" + //$NON-NLS-1$
				"\t\tv.pi = null,\n" + //$NON-NLS-1$
				"\tend\n"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		Token toGet = lexer.getTokenByNumbers(7, 24);
		System.out.println(toGet);
		assert (toGet == null);
	}

	@Test
	public void getTokenByNumbers5() {
		String algorithm = "" + //$NON-NLS-1$
				"BFS(Graph G, Vertex s) begin\n" + //$NON-NLS-1$
				"\tfor Vertex v in G.vertices begin\n" + //$NON-NLS-1$
				"\t\tv.color = \"white\",\n" + //$NON-NLS-1$
				"\t\tv.distance = infty,\n" + //$NON-NLS-1$
				"\t\tv.pi = null,\n" + //$NON-NLS-1$
				"\tend\n"; //$NON-NLS-1$
		System.out.println("getTokenByNumbers5");
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		Token toGet = lexer.getTokenByNumbers(6, 1);
		System.out.println(toGet);
		assert (toGet.getText().equals("end"));
	}

	@Test
	public void autoCompletionKeyWords1() {
		String algorithm = "" + //$NON-NLS-1$
				"whil"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		System.out.println("-----------");
		System.out.println(lexer.tryAutoCompletion(lexer
				.getTokenByNumbers(1, 0)));
		System.out.println("-----------");
		assert (lexer.tryAutoCompletion(lexer.getTokenByNumbers(1, 0)).get(0)
				.equals("while"));
	}

	@Test
	public void zautoCompletionKeyWords2() {
		String algorithm = "" + //$NON-NLS-1$
				"ganz viele tolle Tokens die hier dann stehen koennen \n" + //$NON-NLS-1$
				"wie viele Tok"; //$NON-NLS-1$
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		System.out.println("-----------");
		System.out.println(lexer.getTokenByNumbers(2,11));
		System.out.println(lexer.tryAutoCompletion(lexer
				.getTokenByNumbers(2, 11)));
		System.out.println("-----------");
		assert (lexer.tryAutoCompletion(lexer.getTokenByNumbers(2, 11)).get(0)
				.equals("Tokens"));
	}

	@Test
	public void checkTypeNames() {
		assert TLexer.isTypeName("Integer");
		assert TLexer.isTypeName("Float");
		assert TLexer.isTypeName("Boolean");
		assert TLexer.isTypeName("String");
		assert TLexer.isTypeName("Graph");
		assert TLexer.isTypeName("Vertex");
		assert TLexer.isTypeName("Queue");
	}

	@Test public void checkIdentifiers() {
		assert !TLexer.isTypeName("foo");
		assert !TLexer.isTypeName("a");
		assert !TLexer.isTypeName("if_");
	}
}
