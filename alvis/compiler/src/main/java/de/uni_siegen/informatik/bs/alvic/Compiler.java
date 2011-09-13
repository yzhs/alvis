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

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;
import java.lang.reflect.InvocationTargetException;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

import java.io.*;

import de.uni_siegen.informatik.bs.alvic.TParser.program_return;

/**
 * @author Colin Benner
 */
public class Compiler {
	private static final TreeAdaptor adaptor = new TypedTreeAdaptor();
	private static Compiler instance;
	public static Locale currentLocale;

	private TLexer lexer;
	private TParser parser;
	private TokenStream tokens;

	/**
	 * List of packages provided by plug-ins.
	 */
	private List<String> packageNames = new ArrayList<String>();

	/**
	 * Each type represented by an object of that type is stored under its name.
	 */
	private Map<String, Object> types = new HashMap<String, Object>();

	/**
	 * @return all the types available to the user.
	 */
	public Collection<String> getDatatypes() {
		return types.keySet();
	}

	private List<RecognitionException> exceptions = new ArrayList<RecognitionException>();

	/**
	 * @param datatypes
	 *            all the types provided by the plug-ins.
	 * @param packages
	 *            all the packages the generated Java code might want to import.
	 */
	public Compiler(Collection<? extends Object> datatypes,
			Collection<String> packages) {
		try {
			for (Object o : datatypes) {
				Class<?> c = o.getClass();
				types.put(c.getName().replaceAll(".*\\.PC", ""), o);
			}
			TLexer.addTypes(types.keySet());
			for (String s : packages)
				packageNames.add(s);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		instance = this;
	}

	/**
	 * Generate code for importing all the packages provided by plug-ins.
	 * 
	 * @return Java code to import all the packages the user can use.
	 */
	private String imports() {
		String result = "";
		for (String name : packageNames)
			result += "import " + name + ".*;\n";
		return result;
	}

	/**
	 * Load a StringTemplateGroup from a file.
	 * 
	 * @param resources
	 *            the file from which the template definitions are loaded
	 */
	private StringTemplateGroup readTemplates(InputStream resources)
			throws IOException {
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
	 * @param treeParser
	 *            The tree parser's Class (must be tree parser that outputs an
	 *            AST)
	 * @param tree
	 *            The tree that the tree parser is supposed to walk
	 * @return The AST produced by the tree parser
	 */
	private CommonTree runTreeParser(
			Class<? extends AbstractTreeParser> treeParser, CommonTree tree) {
		// Since Java does not allow to use generics parameters as
		// constructors, this is done using reflection.
		try {
			CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(tree);
			nodeStream.setTokenStream(tokens);
			nodeStream.setTreeAdaptor(adaptor);
			// treeParser walker = new treeParser(nodeStream);
			TreeParser walker = (TreeParser) treeParser.getConstructor(
					TreeNodeStream.class).newInstance(nodeStream);
			treeParser.cast(walker).setTreeAdaptor(adaptor);

			// This is needed to be able to give the tree parser access to the
			// token stream.
			treeParser.cast(walker).setParser(parser);

			Object psrReturn = null;
			try {
				psrReturn = treeParser.cast(walker).program();
			} catch (RecognitionException e) {
				exceptions.add(e);
			}
			exceptions.addAll(treeParser.cast(walker).getExceptions());
			// return (CommonTree)psrRturn.getTree();
			return (CommonTree) psrReturn.getClass().getMethod("getTree")
					.invoke(psrReturn);
		} catch (InvocationTargetException e) {
			if (e.getCause() instanceof RecognitionException) {
				exceptions.add((RecognitionException) e.getCause());
				System.err.println(((RecognitionException) e.getCause())
						.getMessage());
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

	/**
	 * Compile the given code and generate Java code.
	 * 
	 * @param code
	 *            The code we want to translate.
	 * @return The generated Java code.
	 * @throws IOException
	 */
	public String compile(String code) throws IOException {
		return compile(code, "Java.stg");
	}

	/**
	 * Compile the given code and generate Java code.
	 * 
	 * @param code
	 *            The code we want to translate.
	 * @param templateFile
	 * 			  The template file used to generate the code.
	 * @return The generated Java code.
	 * @throws IOException
	 */
	public String compile(String code, String templateFile) throws IOException {
		return compile(code,
				getClass().getClassLoader().getResourceAsStream(templateFile));
	}
	
	/**
	 * Compile the given code and generate output using the template group
	 * specified.
	 * 
	 * @param code
	 *            The code we want to translate.
	 * @param templates
	 *            The set of templates used to generate the output code.
	 * @return The generated code.
	 * @throws IOException
	 */
	public String compile(String code, InputStream templates)
			throws IOException {
		if (templates == null)
			System.err.println("error: could not load template file from jar");
		String result = null;
		lexer = new TLexer(new ANTLRStringStream(code));
		tokens = new CommonTokenStream(lexer);
		parser = new TParser(tokens);
		parser.setTreeAdaptor(adaptor);
		program_return psrReturn = null;
		try {
			psrReturn = parser.program();
			exceptions.addAll(lexer.getExceptions());
			exceptions.addAll(parser.getExceptions());
		} catch (RecognitionException e) {
			exceptions.add(e);
		}
		if (0 != exceptions.size())
			return null;

		CommonTree tree = (CommonTree) psrReturn.getTree();
		runTreeParser(FunctionPass.class, tree);
		tree = runTreeParser(TypeChecker.class, tree);
		CommonTreeNodeStream nodeStream = new CommonTreeNodeStream(tree);
		nodeStream.setTokenStream(tokens);

		CodeGenerator codeGenerator = new CodeGenerator(nodeStream);
		codeGenerator.setTemplateLib(readTemplates(templates));
		CodeGenerator.prog_return r = null;
		try {
			r = codeGenerator.prog();
		} catch (RecognitionException e) {
			exceptions.add(e);
		}
		if (r != null) {
			StringTemplate st = (StringTemplate) r.getTemplate();
			result = imports() + st.toString();
		}

		if (0 != exceptions.size())
			result = null;

		return result;
	}

	/**
	 * Use lexer, parser and type checker to check the code without generating
	 * any Java code.
	 * 
	 * @param code
	 *            The code to check
	 * @return a list of the exceptions that occurred when lexing, parsing and
	 *         type checking.
	 */
	public List<RecognitionException> check(String code) {
		lexer = new TLexer(new ANTLRStringStream(code));
		tokens = new CommonTokenStream(lexer);
		parser = new TParser(tokens);
		parser.setTreeAdaptor(adaptor);
		program_return psrReturn = null;
		try {
			psrReturn = parser.program();
			exceptions.addAll(lexer.getExceptions());
			exceptions.addAll(parser.getExceptions());
		} catch (RecognitionException e) {
			exceptions.add(e);
		}
		if (0 != exceptions.size())
			return null;

		runTreeParser(FunctionPass.class, (CommonTree) psrReturn.getTree());
		runTreeParser(TypeChecker.class, (CommonTree) psrReturn.getTree());

		return getExceptions();
	}

	public List<RecognitionException> getExceptions() {
		return exceptions;
	}

	public static Compiler getInstance() {
		return instance;
	}

	/**
	 * Get an object of the given type.
	 * 
	 * @param className
	 *            The type of the object to be returned.
	 * @return an object of that type.
	 */
	public Object getObject(String className) {
		return types.get(className);
	}

	public TLexer getLexer() {
		return lexer;
	}

	public TParser getParser() {
		return parser;
	}

	/**
	 * Names and types of all the functions in the program being compiled.
	 */
	private Map<String, Type> functions;

	/**
	 * Add built-in functions like print() to the list of functions available.
	 */
	private void addBuiltInFunctions() {
		List<Type> args = new ArrayList<Type>();
		args.add(SimpleType.wildcard);
		functions.put("print",
				FunctionType.create(args, SimpleType.create("Void")));
	}

	/**
	 * Set the available functions. This includes adding built-in functions. We
	 * need this to allow the functions in the pseudo code to be in arbitrary
	 * order. Without this mutual recursion would be completely impossible. The
	 * functions are recorded by a separate tree parser and later used to
	 * initialize the outermost scope of the type checker.
	 * 
	 * @param functions
	 *            The functions found in the source.
	 */
	public void setFunctions(Map<String, Type> functions) {
		this.functions = functions;
		addBuiltInFunctions();
	}

	/**
	 * Get the available functions. This method is used by the type checker to
	 * get all the function's names and types. We need this to allow the
	 * functions in the pseudo code to be in arbitrary order. Without this
	 * mutual recursion would be completely impossible. The functions are
	 * recorded by a separate tree parser and later used to initialize the
	 * outermost scope of the type checker.
	 * 
	 * @return The functions found in the source.
	 */
	public Map<String, Type> getFunctions() {
		return functions;
	}
}
