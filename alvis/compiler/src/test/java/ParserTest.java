import java.util.List;
import java.util.ArrayList;
import org.testng.annotations.Test;
import de.uni_siegen.informatik.bs.alvic.TLexer;
import de.uni_siegen.informatik.bs.alvic.TParser;
//import de.uni_siegen.informatik.bs.alvic.TypeChecker;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

/**
 * @author Colin
 */
@Test
public class ParserTest {
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

	private void printTestName() {
		printTestName(1);
	}

	private void printTestName(int i) {
		System.out.println(Thread.currentThread().getStackTrace()[2+i].getMethodName());
	}

	private void printAndAssert(String message, boolean b) {
		if (!b)
			System.out.println(message);
		assert b;
	}

	private TParser createParser(String algorithm) {
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new TParser(tokens);
	}

	private void exprTest(String algorithm, String expected) {
		String stringTree = test("main() begin " + algorithm + ", end\n", 1);
		printAndAssert(stringTree, stringTree.contains(expected));
	}

	private String test(String algorithm) {
		return test(algorithm, 1);
	}

	private String test(String algorithm, int i) {
		printTestName(i+1);
		TParser.program_return program = null;
//		TypeChecker walker = null;
		CommonTree tree = null;
		try {
			program = createParser(algorithm).program();
			tree = (CommonTree)program.getTree();
//			walker = new TypeChecker(new CommonTreeNodeStream(tree));
//			tree = (CommonTree)walker.program().getTree();
		} catch (RecognitionException re) {
			re.printStackTrace();
			assert false;
		}
		return tree.toStringTree();
	}
	
	private void negativeTest(String algorithm) {
		printTestName(1);
		TParser parser = createParser(algorithm);
		CommonTree t = null;
		try {
			t = (CommonTree)parser.program().getTree();
		} catch (RecognitionException re) {
			re.printStackTrace();
		}
		assert parser.getExceptions().size() != 0;
		if (t != null)
			System.out.println(t.toStringTree());
	}

// Templates for parser tests
/*

	@Test
	public void <++>() {
		String algorithm = "main() begin <++> end\n"; //$NON-NLS-1$
		negativeTest(algorithm);
	}

	@Test
	public void <++>() {
		String algorithm = "main() begin\n" +
		                   "<++>\n" +
		                   "end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.<++>);
	}

*/

	@Test
	public void functionDefinitionSuccess1() {
		String algorithm = "fact(Integer n) : Integer\n" + //$NON-NLS-1$
		                   "begin\n" + //$NON-NLS-1$
		                   "  if n == 0:\n" + //$NON-NLS-1$
				   "    return 1;\n" + //$NON-NLS-1$
				   "  else\n" + //$NON-NLS-1$
				   "    return n*fact(n-1);\n" + //$NON-NLS-1$
				   "end\n" + //$NON-NLS-1$
		                   "main() begin fact(5); end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree,
		               stringTree.startsWith("(PROG (FUNC fact (TYPE Integer) " //$NON-NLS-1$
		                                     +"(PARAMS (DECL Integer n)) (BLOCK")); //$NON-NLS-1$
	}

	@Test
	public void functionDefinitionSuccess2() {
		String algorithm = "main() begin end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.equals("(PROG (FUNC main PARAMS BLOCK))")); //$NON-NLS-1$
	}

	@Test
	public void declarationSuccess() {
		String algorithm = "main() begin Integer x, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(DECL Integer x)")); //$NON-NLS-1$
	}

	@Test
	public void declarationFailure1() {
		String algorithm = "main() begin foo a, end\n"; //$NON-NLS-1$
		negativeTest(algorithm);
	}

	@Test
	public void declarationFailure2() {
		String algorithm = "main() begin Integer String; end\n"; //$NON-NLS-1$
		negativeTest(algorithm);
	}

	@Test
	public void assignmentSuccess() {
		String algorithm = "main() begin String x, Integer a, x().y = a, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(ASSIGN (. (CALL x) y) a)")); //$NON-NLS-1$
	}

	@Test
	public void assignmentFailure() {
		String algorithm = "main() begin String x, Integer a, x.y() = a; end\n"; //$NON-NLS-1$
		negativeTest(algorithm);
	}

	@Test
	public void exprSuccess1() {
		exprTest("Boolean b = !true", "(! true)");
	}

	@Test
	public void exprSuccess2() {
		exprTest("String foo, foo.length()", "(CALL (. foo length))");
	}

	@Test
	public void exprSuccess3() {
		exprTest("String s = \"abc\"", "\"abc\"");
	}

	@Test
	public void precedence1() {
		String algorithm = "main() begin" + //$NON-NLS-1$
		                   "\tBoolean a = false," + //$NON-NLS-1$
		                   "\ta = a || true && false," + //$NON-NLS-1$
		                   "end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(|| a (&& true false))")); //$NON-NLS-1$
	}

	@Test
	public void precedence2() {
		String algorithm = "main() begin Boolean b = true && 1 == 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(&& true (== 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence3() {
		String algorithm = "main() begin Boolean b = true && 1 != 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(&& true (!= 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence4() {
		String algorithm = "main() begin Boolean b = true == 1 < 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(== true (< 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence5() {
		String algorithm = "main() begin Boolean b = true == 1 > 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(== true (> 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence6() {
		String algorithm = "main() begin Boolean b = true == 1 >= 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(== true (>= 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence7() {
		String algorithm = "main() begin Boolean b = true == 1 <= 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(== true (<= 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence8() {
		String algorithm = "main() begin Boolean b = true != 1 < 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(!= true (< 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence9() {
		String algorithm = "main() begin Boolean b = true != 1 > 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(!= true (> 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence10() {
		String algorithm = "main() begin Boolean b = true != 1 <= 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(!= true (<= 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence11() {
		String algorithm = "main() begin Boolean b = true != 1 >= 2, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(!= true (>= 1 2))")); //$NON-NLS-1$
	}

	@Test
	public void precedence12() {
		String algorithm = "main() begin Integer x = 1 < 2 + 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(< 1 (+ 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence13() {
		String algorithm = "main() begin Integer x = 1 < 2 - 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(< 1 (- 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence14() {
		String algorithm = "main() begin Integer x = 1 > 2 + 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(> 1 (+ 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence15() {
		String algorithm = "main() begin Integer x = 1 > 2 - 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(> 1 (- 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence16() {
		String algorithm = "main() begin Integer x = 1 <= 2 + 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(<= 1 (+ 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence17() {
		String algorithm = "main() begin Integer x = 1 <= 2 - 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(<= 1 (- 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence18() {
		String algorithm = "main() begin Integer x = 1 >= 2 + 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(>= 1 (+ 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence19() {
		String algorithm = "main() begin Integer x = 1 >= 2 - 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(>= 1 (- 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence20() {
		String algorithm = "main() begin Integer x = 1 + 2 * 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(+ 1 (* 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence21() {
		String algorithm = "main() begin Integer x = 1 + 2 / 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(+ 1 (/ 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence22() {
		String algorithm = "main() begin Integer x = 1 + 2 % 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(+ 1 (% 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence23() {
		String algorithm = "main() begin Integer x = 1 - 2 * 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(- 1 (* 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence24() {
		String algorithm = "main() begin Integer x = 1 - 2 / 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(- 1 (/ 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void precedence25() {
		String algorithm = "main() begin Integer x = 1 - 2 % 3, end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(- 1 (% 2 3))")); //$NON-NLS-1$
	}

	@Test
	public void argumentsFailure1() {
		String algorithm = "f() begin end\n" + //$NON-NLS-1$
		                   "main() begin f(123; true), end\n"; //$NON-NLS-1$
		negativeTest(algorithm);
	}

	@Test
	public void argumentsFailure2() {
		String algorithm = "f() begin end\n" + //$NON-NLS-1$
		                   "main() begin f(0 123), end\n"; //$NON-NLS-1$
		negativeTest(algorithm);
	}

	@Test
	public void argumentsFailure3() {
		String algorithm = "f() begin end\n" + //$NON-NLS-1$
		                   "main() begin f(,), end\n"; //$NON-NLS-1$
		negativeTest(algorithm);
	}

	@Test
	public void functionCallSuccess1() {
		String algorithm = "f() begin end\n" + //$NON-NLS-1$
		                   "main() begin f(), end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(CALL f)")); //$NON-NLS-1$
	}

	@Test
	public void functionCallSuccess2() {
		String algorithm = "f(Integer a) begin end\n" + //$NON-NLS-1$
		                   "main() begin f(1), end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(CALL f 1)")); //$NON-NLS-1$
	}

	@Test
	public void functionCallSuccess3() {
		String algorithm = "f(Integer a, Float b, String c) begin end\n" + //$NON-NLS-1$
		                   "main() begin f(1, 2.3, \"abc\"), end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(CALL f 1 2.3 \"abc\")")); //$NON-NLS-1$
	}

/*
 * These tests are disabled as the type checker does not care about arguments
 * at the moment. They should be enabled once the type checker makes sure that
 * arguments have the correct type.
 */
//	@Test
//	public void functionCallFailure1() {
//		String algorithm = "f() begin end\n" + //$NON-NLS-1$
//		                   "main() begin f(1), end\n"; //$NON-NLS-1$
//		negativeTest(algorithm);
//	}
//
//	@Test
//	public void functionCallFailure2() {
//		String algorithm = "f(Integer i) begin end\n" + //$NON-NLS-1$
//		                   "main() begin f(), end\n"; //$NON-NLS-1$
//		negativeTest(algorithm);
//	}
//
//	@Test
//	public void functionCallFailure3() {
//		String algorithm = "f(Integer i) begin end\n" + //$NON-NLS-1$
//		                   "main() begin f(1.5), end\n"; //$NON-NLS-1$
//		negativeTest(algorithm);
//	}

	@Test
	public void memberAccessSuccess() {
		String algorithm = "main() begin\n" + //$NON-NLS-1$
		                   "Integer s,\n" + //$NON-NLS-1$
		                   "s.size,\n" + //$NON-NLS-1$
		                   "end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(. s size)")); //$NON-NLS-1$
	}

//	@Test
//	public void memberAccessFailure() {
//		String algorithm = "main() begin\n" + //$NON-NLS-1$
//		                   "String s,\n" + //$NON-NLS-1$
//		                   "s.nuihkoghaepmincw,\n" + //$NON-NLS-1$
//		                   "end\n"; //$NON-NLS-1$
//		negativeTest(algorithm);
//	}

	@Test
	public void arrayIndexSucces() {
		String algorithm = "main() begin\n" + //$NON-NLS-1$
		                   "Integer[] a,\n" + //$NON-NLS-1$
		                   "a[0],\n" + //$NON-NLS-1$
		                   "end\n"; //$NON-NLS-1$
		String stringTree = test(algorithm);
		printAndAssert(stringTree, stringTree.contains("(INDEX a 0)")); //$NON-NLS-1$
	}


//	@Test
//	public void methodCallSuccess1() {
//		String algorithm = "main() begin\n" + //$NON-NLS-1$
//		                   "String s,\n" + //$NON-NLS-1$
//		                   "s.length(),\n" + //$NON-NLS-1$
//		                   "end\n"; //$NON-NLS-1$
//		String stringTree = test(algorithm);
//		printAndAssert(stringTree, stringTree.contains("(CALL (. s length))")); //$NON-NLS-1$
//	}
//
//	@Test
//	public void methodCallSuccess2() {
//		String algorithm = "main() begin\n" + //$NON-NLS-1$
//		                   "String s,\n" + //$NON-NLS-1$
//		                   "s.concat(\"abc\"),\n" + //$NON-NLS-1$
//		                   "end\n"; //$NON-NLS-1$
//		String stringTree = test(algorithm);
//		printAndAssert(stringTree, stringTree.contains("(CALL (. s concat) \"abc\")")); //$NON-NLS-1$
//	}
//
//	@Test
//	public void methodCallFailure1() {
//		String algorithm = "main() begin\n" + //$NON-NLS-1$
//		                   "String s,\n" + //$NON-NLS-1$
//		                   "s.length(1),\n" + //$NON-NLS-1$
//		                   "end\n"; //$NON-NLS-1$
//		negativeTest(algorithm);
//	}
//
//	@Test
//	public void methodCallFailure2() {
//		String algorithm = "main() begin\n" + //$NON-NLS-1$
//		                   "String s,\n" + //$NON-NLS-1$
//		                   "s.concat(),\n" + //$NON-NLS-1$
//		                   "end\n"; //$NON-NLS-1$
//		negativeTest(algorithm);
//	}
//
//	@Test
//	public void methodCallFailure3() {
//		String algorithm = "main() begin\n" + //$NON-NLS-1$
//		                   "String s,\n" + //$NON-NLS-1$
//		                   "s.concat(1),\n" + //$NON-NLS-1$
//		                   "end\n"; //$NON-NLS-1$
//		negativeTest(algorithm);
//	}

	@Test
	public void terminator1() {
		String algorithm = ";"; //$NON-NLS-1$
		TParser.terminator_return rule = null;
		printTestName();
		try {
			rule = createParser(algorithm).terminator();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		CommonTree tree = (CommonTree)rule.getTree();
		assert tree.toStringTree().equals(";");
	}

	@Test
	public void terminator2() {
		String algorithm = ","; //$NON-NLS-1$
		TParser.terminator_return rule = null;
		printTestName();
		try {
			rule = createParser(algorithm).terminator();
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		assert rule.getTree() == null;
	}
}
