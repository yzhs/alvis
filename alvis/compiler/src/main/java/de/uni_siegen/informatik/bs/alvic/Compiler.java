package de.uni_siegen.informatik.bs.alvic;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.InvocationTargetException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.io.*;

import de.uni_siegen.informatik.bs.alvic.TParser.program_return;

/**
 * @author Colin
 */
public class Compiler {
	private static final TreeAdaptor adaptor = new TypedTreeAdaptor();
	private static Compiler instance;

	private TLexer lexer;
	private TParser parser;
	private TokenStream tokens;

	/**
	 * List of packages provided by plug-ins.
	 */
	private List<String> packageNames = new ArrayList<String>();

	/**
	 * Each type represented by an object of that type is stored under its
	 * name.
	 */
	private Map<String, Object> types = new HashMap<String, Object>();

	private List<Exception> exceptions = new ArrayList<Exception>();

	public Compiler(Collection<? extends Object> datatypes, Collection<String> packages) {
		try {
			for (Object o : datatypes) {
				Class<?> c = o.getClass();
				types.put((String)c.getMethod("getTypeName").invoke(null), o);
			}
			TLexer.addTypes(types.keySet());
			for (String s : packages)
				packageNames.add(s);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		instance = this;
	}

//	/**
//	 * Create Graphviz file and a PNG image created from that containing the
//	 * AST given.
//	 * @param baseName	filename of the program
//	 * @param code		the AST
//	 */
//	private void createDOT(String baseName, String code) {
//		DOTTreeGenerator gen = new DOTTreeGenerator();
//		StringTemplate st = gen.toDOT(code, new CommonTreeAdaptor());
//		
//		try {
//			// write .dot file
//			FileWriter outputStream = new FileWriter(baseName + ".dot");
//			outputStream.write(st.toString());
//			outputStream.close();
//			
//			// create PNG using Graphviz' 'dot' command
//			Process proc = Runtime.getRuntime().exec("dot -Tpng -o" + baseName + ".png " + baseName + ".dot");
//			proc.waitFor();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	private String imports() {
		String result = "";
		for (String name : packageNames)
			result += "import " + name + ".*;\n";
		return result;
	}

	/**
	 * Load a StringTemplateGroup from a file.
	 *
	 * @param resources	the file from which the template definitions
	 *			are loaded
	 */
	private StringTemplateGroup readTemplates(InputStream resources) throws IOException {
		StringTemplateGroup templates = null;
		InputStreamReader groupFile = null;
		groupFile = new InputStreamReader(resources);
		templates = new StringTemplateGroup(groupFile);
		groupFile.close();
		return templates;
	}

	/**
	 * This method applies an AST emitting tree parser to an AST.
	 *
	 * @param treeParser	The tree parser's Class (must be tree parser that outputs an AST)
	 * @param tree		The tree that the tree parser is supposed to walk
	 * @return		The AST produced by the tree parser
	 */
	@SuppressWarnings("unchecked")
	private CommonTree runTreeParser(Class<? extends TreeParser> treeParser, CommonTree tree) {
		// Since Java does not allow to use Generics parameters as
		// constructors, this is done using reflection.
		try {
			CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(tree);
			nodeStream.setTokenStream(tokens);
			nodeStream.setTreeAdaptor(adaptor);
			// treeParser walker = new treeParser(nodeStream);
			TreeParser walker = (TreeParser) treeParser.getConstructor(TreeNodeStream.class)
					.newInstance(nodeStream);
			treeParser.getMethod("setTreeAdaptor", TreeAdaptor.class).invoke(walker, adaptor);

			// psrReturn = walker.program();
			Object psrReturn = treeParser.getMethod("program").invoke(walker);
			exceptions.addAll((List<Exception>) treeParser.getMethod("getExceptions").invoke(walker));
			// return (CommonTree)psrRturn.getTree();
			return (CommonTree) psrReturn.getClass().getMethod("getTree").invoke(psrReturn);
		} catch (InvocationTargetException e) {
			if (e.getCause() instanceof RecognitionException) {
				exceptions.add((RecognitionException)e.getCause());
				System.err.println(((RecognitionException)e.getCause()).getMessage());
			} else
				e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
		return tree;
	}

	public String compile(String code) throws RecognitionException, IOException {
		return compile(code, getClass().getClassLoader().getResourceAsStream("Java.stg"));
	}

	public String compile(String code, InputStream templates) throws RecognitionException, IOException {
		if (templates == null)
			System.err.println("error: could not load template file");
		String result = null;
		lexer = new TLexer(new ANTLRStringStream(code));
		tokens = new CommonTokenStream(lexer);
		parser = new TParser(tokens);
		parser.setTreeAdaptor(adaptor);
		program_return psrReturn = parser.program();
		exceptions.addAll(lexer.getExceptions());
		exceptions.addAll(parser.getExceptions());
		if (0 != exceptions.size())
			return null;

		CommonTree tree = (CommonTree) psrReturn.getTree();
		tree = runTreeParser(TypeChecker.class, tree);
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(tree);
		nodeStream.setTokenStream(tokens);

		CodeGenerator codeGenerator = new CodeGenerator(nodeStream);
		codeGenerator.setTemplateLib(readTemplates(templates));
		CodeGenerator.prog_return r = codeGenerator.prog();
		StringTemplate st = (StringTemplate) r.getTemplate();
		if (st != null)
			result = imports() + st.toString();
//		else
//			exceptions.add(new NullPointerException());

		if (0 != exceptions.size()) {
			System.err.println(exceptions.size() + " exception(s) occured");
			return null;
		}
		return result;
	}

	public List<Exception> getExceptions() {
		return exceptions;
	}

	public static Compiler getInstance() {
		return instance;
	}

	public Object getObject(String className) {
		return types.get(className);
	}

	public TLexer getLexer() {
		return lexer;
	}

	public TParser getParser() {
		return parser;
	}
}
