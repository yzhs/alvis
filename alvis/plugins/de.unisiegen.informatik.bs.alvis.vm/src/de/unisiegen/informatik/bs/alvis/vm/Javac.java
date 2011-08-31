/*
 * Copyright (c) 2011 Sebastian Schmitz
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

package de.unisiegen.informatik.bs.alvis.vm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticCollector;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import de.unisiegen.informatik.bs.alvis.io.logger.Logger;

/**
 * A wrapper to ease the use of ToolProvider.getSystemJavaCompiler();
 * Uses com.sun.tools.javac.Main as fallback, if the ToolProvider does
 * not provide a compiler.
 * As mentioned in the developers documentation: The call to compile(String srcFiles[])
 * will simply stop, if tools.jar is not on the path.
 * 
 * @author Sebastian Schmitz
 */
public final class Javac {

	static String classpath;

	static String outputdir;

	String sourcepath;

	String bootclasspath;

	String extdirs;

	String encoding;

	String target;

	static JavaCompiler compiler;

	public Javac(String classpath, String outputdir) {
		Javac.classpath = classpath;
		Javac.outputdir = outputdir;
	}

	
	/**
	 * Compiles the source code using the systems java
	 * compiler
	 * @param source
	 * @return true -> compiling worked flawlessly
	 */
	private static boolean compile(JavaFileObject... source) {
		final ArrayList<String> options = new ArrayList<String>();
		if (classpath != null) {
			options.add("-classpath");
			options.add(System.getProperty("java.class.path") + classpath);
		}
		if (outputdir != null) {
			options.add("-d");
			options.add(outputdir);
		}

		DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<JavaFileObject>();

		/**
		 * Retrieving the standard file manager from compiler object, which is
		 * used to provide basic building block for customizing how a compiler
		 * reads and writes to files.
		 * 
		 * The same file manager can be reopened for another compiler task. Thus
		 * we reduce the overhead of scanning through file system and jar files
		 * each time
		 */
		StandardJavaFileManager stdFileManager = compiler
				.getStandardFileManager(null, Locale.getDefault(), null);

		final JavaCompiler.CompilationTask task = compiler.getTask(null,
				stdFileManager, diagnostics, options, null,
				Arrays.asList(source));
		boolean result = task.call();

		if (!result)
			for (@SuppressWarnings("rawtypes") Diagnostic diagnostic : diagnostics.getDiagnostics())
				System.out.format("Error on line %d in %s",
						diagnostic.getLineNumber(), diagnostic);
		try {
			stdFileManager.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Final preparations for the system's compiler, if 
	 * it could be fetched. If not, compiling is down
	 * by the compiler from com.sun.tools.javac.Main
	 * 
	 * @param srcFiles
	 * @return null if success; or compilation errors
	 */
	public String compile(String srcFiles[]) {
		Logger.getInstance().log("de.~.vm.Javac.compile(String)", Logger.DEBUG,
				"Begin of function");

		StringWriter err = new StringWriter();
		PrintWriter errPrinter = new PrintWriter(err);

		String args[] = buildJavacArgs(srcFiles);

		// Fetch the systems JavaCompiler. Fails, if Eclipse is startet
		// with the VM from JRE. Works with JDK.
		compiler = ToolProvider.getSystemJavaCompiler();
		
		if (compiler != null) {
			String algorithmAsSourceCode = readfile(args[args.length - 1]);
			
			// extract the name of the algorithm. The name is always at the last position of this array
			String algorithmName = args[args.length - 1].split("/")[args[args.length - 1]
					.split("/").length - 1];

			boolean result = false;
			
			// Create a new AlvisFileObject containing the source code and let the compiler compile it
			try {
				result = compile(new AlvisFileObject(algorithmName,
						algorithmAsSourceCode));
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}

			 Logger.getInstance().log("de.~.vm.Javac.compile(String)", Logger.DEBUG, "Compile with ToolsProvider compiler was successful");

			errPrinter.close();
			 Logger.getInstance().log("de.~.vm.Javac.compile(String)", Logger.DEBUG,
			 "Error? " + err.toString());

			return result ? null : err.toString();
		}

		else {
			Logger.getInstance().log("de.~.vm.Javac.compile(String)", Logger.DEBUG,
					 "ToolsProvider did not provide a compiler, using fallback");
			// Grabbing the standard compiler did not work, compiling "by hand"
			// FIXME: 1. Find a way, so that
			// ToolProvider.getSystemJavaCompiler() cannot return null
			// 2. Delete the call to com.sun.tools.javac.Main
			int resultCode = com.sun.tools.javac.Main.compile(args, errPrinter);
			return (resultCode == 0) ? null : err.toString();
		}
	}

	
	/**
	 * Reads and returns the file corresponding to the given path.
	 * @param string
	 * @return
	 */
	private String readfile(String string) {
		FileInputStream fis = null;
		String algorithmAsString = "";
		try {
			fis = new FileInputStream(string);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}

		int b = 1;
		try {
			b = fis.read();
		} catch (IOException e) {
			e.printStackTrace();
		}

		while (b > 0) {
			algorithmAsString += (char) b;
			try {
				b = fis.read();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return algorithmAsString;
	}

	/**
	 * Prepare the paths for compiling
	 * 
	 * @param srcFiles
	 * @return String describing error if something went wrong
	 */
	public String compile(File srcFiles[]) {
		String paths[] = new String[srcFiles.length];
		for (int i = 0; i < paths.length; i++) {
			paths[i] = srcFiles[i].getAbsolutePath();
		}
		for (String path : paths) {
			Logger.getInstance().log("de.~.vm.Javac.compile(File)", Logger.DEBUG,
					"Content of paths: " + path);
		}
		Logger.getInstance().log("de.~.vm.Javac.compile(File)", Logger.DEBUG,
				"Extracted paths, starting compiler");
		Logger.getInstance().log(
				"de.~.vm.Javac.compile(File)",
				Logger.DEBUG,
				"Path to Javac.javac: "
						+ this.getClass().getProtectionDomain().getCodeSource()
								.getLocation().getFile().toString());

		return compile(paths);
	}
	
	/**
	 * Assembles the given arguments into compiler options
	 * @param srcFiles
	 * @return array of compiler options
	 */

	private String[] buildJavacArgs(String srcFiles[]) {
		ArrayList<String> args = new ArrayList<String>();

		if (classpath != null) {
			args.add("-classpath");
			args.add(classpath);
		}
		if (outputdir != null) {
			args.add("-d");
			args.add(outputdir);
		}
		if (sourcepath != null) {
			args.add("-sourcepath");
			args.add(sourcepath);
		}
		for (int i = 0; i < srcFiles.length; i++) {
			args.add(srcFiles[i]);
		}

		return args.toArray(new String[args.size()]);
	}

}