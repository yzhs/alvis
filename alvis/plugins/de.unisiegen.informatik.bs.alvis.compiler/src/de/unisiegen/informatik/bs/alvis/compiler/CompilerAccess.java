package de.unisiegen.informatik.bs.alvis.compiler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;

import de.unisiegen.informatik.bs.alvis.io.files.FileCopy;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.uni_siegen.informatik.bs.alvic.AbstractTLexer;
import de.uni_siegen.informatik.bs.alvic.Compiler;

/**
 * @author mays
 * @author Colin
 * 
 */
public class CompilerAccess {
	/**
	 * The compiler used to do all the real work.
	 */
	private Compiler compiler;

	/**
	 * These are the types the user may use.
	 */
	private Collection<PCObject> types;

	/**
	 * These are the packages available to the user. They will automatically be
	 * imported by the compiler.
	 */
	private Collection<String> packages;

	/**
	 * This is the absolute path to the file that is to be compiled.
	 */
	private String algorithmPath = null;
	
	private static CompilerAccess instance;

	public static CompilerAccess getDefault() {
		if (instance == null)
			instance = new CompilerAccess();
		return instance;
	}

	/**
	 * Use the compiler to compile the source code found in the given file.
	 * Before calling this method you should provide the names of all packages
	 * and classes that the user may use (using the setDatatypes and
	 * setDatatypePackages methods).
	 * 
	 * @param path
	 *            path to the source code that
	 * @return path to the generated .java file if it exists, null otherwise
	 * 
	 * @throws IOException
	 * @throws RecognitionException
	 */
	public File compile(String path) throws IOException, RecognitionException {
		return compile(path,false);
		
	}
	
	/**
	 * Use the compiler to compile the source code found in the given file.
	 * Before calling this method you should provide the names of all packages
	 * and classes that the user may use (using the setDatatypes and
	 * setDatatypePackages methods).
	 * 
	 * @param path
	 *            path to the source code that
	 * @param isAbsolutePath true if the path is absolute.
	 * @return path to the generated .java file if it exists, null otherwise
	 * 
	 * @throws IOException
	 * @throws RecognitionException
	 */
	public File compile(String path, Boolean isAbsolutePath) throws RecognitionException, IOException
	{
		if(isAbsolutePath)
		{
			algorithmPath = path;
		}
		else
		{
			algorithmPath = currentPath() + path;
		}
		compiler = new Compiler(types, packages);
		String javaCode = compiler.compile(readFile(algorithmPath));

		if (null == javaCode) {
			System.err.println("Compiling code from " + algorithmPath
					+ " failed");
//			for (Exception e : compiler.getExceptions())
//				e.printStackTrace();
			return null;
		}

		File result = null;
		BufferedWriter out = null;
		try {
			result = new File(getWorkspacePath(algorithmPath)
					+ "Algorithm.java");
			// new File(path).getName().toString().replaceAll("\\.[^.]*$",
			// ".java"));
			FileWriter fstream;
			fstream = new FileWriter(result);
			out = new BufferedWriter(fstream);
			// out.write(javaCode.replaceAll("#ALGORITHM_NAME#",
			// result.getName().replaceAll("\\.java", "")));
			out.write(javaCode.replaceAll("#ALGORITHM_NAME#", "Algorithm"));
		} finally {
			if (out != null)
				out.close();
		}
		return result;		
	}

	private String currentPath() {
		return Platform.getInstanceLocation().getURL().getPath();
	}

	private String getWorkspacePath(String fileWithPath) {
		String[] splitPathToAlgorithm = fileWithPath.split("/");

		ArrayList<String> partsOfAlgoPath = new ArrayList<String>();
		for (String part : splitPathToAlgorithm) {
			partsOfAlgoPath.add(part);
		}

		partsOfAlgoPath.remove(partsOfAlgoPath.size() - 1);

		// getPath
		String algoWorkSpacePath = "";
		for (String part : partsOfAlgoPath) {
			algoWorkSpacePath += part + File.separator;
		}

		return algoWorkSpacePath;
	}

	/**
	 * Read a file given by its path into a String.
	 * 
	 * @param fileName
	 *            the file to read
	 * @return the contents of the file
	 * @throws IOException
	 */
	private String readFile(String fileName) throws IOException {
		BufferedReader fstream = new BufferedReader(new FileReader(fileName));
		String result = "";

		while (fstream.ready())
			result += fstream.readLine() + System.getProperty("line.separator");

		System.out.println("read file " + fileName);
		return result;
	}

	public List<Exception> getExceptions() {
		return compiler.getExceptions();
	}

	/**
	 * This method copies the Dummy Algorithm file next to the PCAlgorithm file
	 * that is written by the user. To get the path of the created file see
	 * getAlgorithmPath().
	 * 
	 * @param pathToAlgorithm
	 *            relative to Alvis-workspace e.g.: "project/src/Algorithm.algo"
	 * @return Name of the Java Algorithm file
	 */
	public File compileThisDummy(String pathToAlgorithm) {
		String SLASH = File.separator;

		// the path were the translated java file is.
		String pathWhereTheJavaIs = "";
		try {
			pathWhereTheJavaIs = FileLocator
					.getBundleFile(Activator.getDefault().getBundle())
					.getCanonicalPath().toString();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// The compiled algorithm
		File source = new File(pathWhereTheJavaIs + SLASH + "Algorithm.java");

		// Get the path to algorithm and separate path and filename
		String[] splitPathToAlgorithm = pathToAlgorithm.split(Pattern
				.quote(File.separator));

		ArrayList<String> partsOfAlgoPath = new ArrayList<String>();
		for (String part : splitPathToAlgorithm) {
			partsOfAlgoPath.add(part);
		}

		partsOfAlgoPath.remove(partsOfAlgoPath.size() - 1);

		// getPath
		String algoWorkSpacePath = "";
		for (String part : partsOfAlgoPath) {
			algoWorkSpacePath += part + SLASH;
		}

		// for (String st : splitPathToAlgorithm)
		// System.out.println(st);

		// Destination
		File destination = new File(currentPath() + algoWorkSpacePath
				+ "Algorithm.java");
		algorithmPath = Platform.getInstanceLocation().getURL().getPath()
				+ algoWorkSpacePath + SLASH;

		// Copy compiled file into the workspace
		FileCopy fileCopy = new FileCopy();
		fileCopy.copy(source, destination);

		// Still hard Coded.
		return destination;
	}

	/* ******************************************
	 * The Datatypes and Packagenames
	 * ******************************************
	 */
	/**
	 * Tell the compiler which types are allowed.
	 * 
	 * @param datatypes
	 *            the types
	 */
	public void setDatatypes(Collection<PCObject> datatypes) {
		this.types = datatypes;
	}

	/**
	 * Tell the compiler which packages the user can use. I.e. what packages the
	 * compiler is supposed to import.
	 * 
	 * @param datatypePackages
	 *            the packages
	 */
	public void setDatatypePackages(Collection<String> datatypePackages) {
		this.packages = datatypePackages;
	}

	/**
	 * Tell the lexer to read the input stream so it can provide auto
	 * completion and help for syntax highlighting.
	 */
	public void reLex() {
		compiler.getLexer().scan();
	}

	/**
	 * Return probable completions for the given token.
	 * 
	 * @return List of String which could be useful
	 */
	public List<String> tryAutoCompletion(Token toComplete) {
		return compiler.getLexer().tryAutoCompletion(toComplete);
	}

	/**
	 * @return List of Tokens that are forbidden because they are Java keywords.
	 */
	public List<Token> getForbidden() {
		return compiler.getLexer().getForbidden();
	}

	/**
	 * @return List of all identifiers used in the code
	 */
	public List<Token> getIdentifiers() {
		return compiler.getLexer().getIdentifiers();
	}

	/**
	 * @return List of all keywords the compiler recognizes (e.g. 'if', 'else',
	 *         ...)
	 */
	public List<Token> getKeywords() {
		return compiler.getLexer().getKeywords();
	}

	/**
	 * Create a list of all the tokens in the given source code that mark the
	 * beginning of a block.
	 * @return List of tokens that mark the beginning of a block
	 */
	public List<Token> beginBlock() {
		return compiler.getLexer().beginBlock();
	}
	
	/**
	 * Create a list of all the tokens in the given source code that mark the
	 * end of a block.
	 * @return List of tokens that mark the end of a block
	 */
	public List<Token> endBlock() {
		return compiler.getLexer().endBlock();
	}

	/**
	 * @return List of all available keywords.
	 */
	public List<String> allKeywords() {

		return AbstractTLexer.allKeywords();
	}

	/**
	 * Return a list of all the Java keywords that the pseudo code does not
	 * use.
	 * 
	 * @return List of forbidden words
	 */
	public List<String> allForbidden() {
		return AbstractTLexer.allForbidden();
	}

	/**
	 * Method for checking whether the compiler is informed correctly about
	 * available packages and types.
	 */
	@SuppressWarnings("unchecked")
	public void testDatatypes() {
		try {
			System.out.println("Compiler shows its datatypes:");
			for (PCObject obj : types) {
				System.out.println(obj.getClass());
				List<String> tmp = ((List<String>) obj.getClass()
						.getMethod("getMembers").invoke(obj));
				System.out.println("available attributes:"
						+ (tmp == null ? "null" : tmp));
				tmp = ((List<String>) obj.getClass().getMethod("getMethods")
						.invoke(obj));
				System.out.println("available methods:"
						+ (tmp == null ? "null" : tmp));
			}
			System.out.println("Compiler shows its packages:");
			for (String obj : packages) {
				System.out.println(obj);
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		}
	}
}
