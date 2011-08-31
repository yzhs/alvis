/*
 * Copyright (c) 2011 Dominik Dingel
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
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

import de.unisiegen.informatik.bs.alvis.io.logger.Logger;



/**
 * Class which handles the class path in order to be able to compile Java Code
 * at runtime
 * 
 * @author Sebastian Schmitz Disclaimer: This class and Javac are an adaption of
 *         the classes distributed by Li Yang in his tutorial "add dynamic Java
 *         Code to your application" published at www.javaworld.com
 */

public final class DynaCode {

	// Every datatype needed to compile for the current algorithm must
	// be on the compileClasspath. Especially the path to the VM-plugin
	// itself must be on it, since it contains tools.jar
	private String compileClasspath;

	private ClassLoader parentClassLoader;
	
	// This array contains every directory, where dynamic code is located
	private ArrayList<SourceDir> sourceDirs = new ArrayList<SourceDir>();

	TreeSet<String> dynamicallyReferencedPackagesNeededToCompile; // what a long
																	// self-explanatory
																	// name!

	// class name => LoadedClass
	private HashMap<String, LoadedClass> loadedClasses = new HashMap<String, LoadedClass>();

	public DynaCode(TreeSet<String> dynamicallyReferencedPackagesNeededToCompile) {
		this(DynaCode.class.getClassLoader(),
				dynamicallyReferencedPackagesNeededToCompile);
	}

	public DynaCode(ClassLoader parentClassLoader,
			TreeSet<String> dynamicallyReferencedPackagesNeededToCompile) {
		this(extractClasspath(parentClassLoader), parentClassLoader,
				dynamicallyReferencedPackagesNeededToCompile);
		Logger.getInstance().setLogLevel(Logger.DEBUG);
		Logger.getInstance().log("de.~.vm.AlgoThread.loadAlgo()", Logger.DEBUG, "Created a new DynaCode");
				

	}

	/**
	 * @param compileClasspath
	 *            used to compile dynamic classes
	 * @param parentClassLoader
	 *            the parent of the class loader that loads all the dynamic
	 *            classes
	 * @param List
	 *            of datatypes used in Algorithm.java provided by the main
	 *            (de.~.alvis) activator
	 */
	public DynaCode(String compileClasspath, ClassLoader parentClassLoader,
			TreeSet<String> dynamicallyReferencedPackagesNeededToCompile) {


		this.compileClasspath = compileClasspath;

		this.parentClassLoader = parentClassLoader;

		// the compiler must know about the data types provided by the VM as
		// well as the given ones
		// so add this class to the datatypesToAddToClasspath and the method
		// will extract the VM-package

		String pathToVMPackage = this.getClass().getProtectionDomain()
				.getCodeSource().getLocation().getFile().toString();
		if (pathToVMPackage.endsWith(".jar"))
			dynamicallyReferencedPackagesNeededToCompile.add(pathToVMPackage);
		else
			dynamicallyReferencedPackagesNeededToCompile.add(pathToVMPackage
					+ "src/");

		// add these packages to the classpath
		for (String str : dynamicallyReferencedPackagesNeededToCompile) {
			this.compileClasspath += System.getProperty("path.separator") + str;
		}
	}

	/**
	 * Add a directory that contains the source of dynamic java code.
	 * 
	 * @param srcDir
	 * @param pathToFile
	 *            path to file
	 * @return true if the add is successful
	 * @throws IOException
	 */
	public boolean addSourceDir(String pathToFile) {
		File srcDir = new File(pathToFile);
		synchronized (sourceDirs) {
			
			// check whether the new srcDir already exists
			for(SourceDir src : sourceDirs){
				if(src.srcDir.equals(srcDir)){
					return false;
				}
			}
			// add new
			sourceDirs.add(new SourceDir(srcDir));
		}
		return true;
	}

	/**
	 * Returns the up-to-date dynamic class by name.
	 * 
	 * @param className
	 * @return
	 * @throws ClassNotFoundException
	 *             if source file not found or compilation error
	 */
	@SuppressWarnings("unchecked")
	public Class<AbstractAlgo> loadClass(String className)
			throws ClassNotFoundException {
		LoadedClass loadedClass = null;
		synchronized (loadedClasses) {
			loadedClass = loadedClasses.get(className);
		}
		Logger.getInstance().log("de.~.vm.DynaCode.loadClass()", Logger.DEBUG, "Begin of function");
		
		// first access of a class
		if (loadedClass == null) {
			String resource = className.replace('.', '/') + ".java";
			SourceDir src = locateResource(resource);
			if (src == null) {
				Logger.getInstance().log("de.~.vm.DynaCode.loadClass()", Logger.DEBUG, "Class not found");
				throw new ClassNotFoundException("DynaCode class not found "
						+ className);
			} else

			synchronized (this) {

				Logger.getInstance().log("de.~.vm.DynaCode.loadClass()", Logger.DEBUG, "Starting compile");

				// compile and load class
				loadedClass = new LoadedClass(className, src);

				synchronized (loadedClasses) {
					loadedClasses.put(className, loadedClass);
				}
			}
			Logger.getInstance().log("de.~.vm.DynaCode.loadClass()", Logger.DEBUG, "class loaded");

			return loadedClass.clazz;
		}

		// subsequent access
		if (loadedClass.isChanged()) {
			// unload and load again
			unload(loadedClass.srcDir);
			return loadClass(className);
		}

		return loadedClass.clazz;
	}

	private SourceDir locateResource(String resource) {
		for (int i = 0; i < sourceDirs.size(); i++) {
			SourceDir src = sourceDirs.get(i);
			if (new File(src.srcDir, resource).exists()) {
				return src;
			}
		}
		return null;
	}

	/**
	 * If a class is changed, the old version must be deleted
	 * from the list of loaded classes.
	 * @param src
	 */
	private void unload(SourceDir src) {
		// clear loaded classes
		synchronized (loadedClasses) {
			for (Iterator<LoadedClass> iter = loadedClasses.values().iterator(); iter
					.hasNext();) {
				LoadedClass loadedClass = iter.next();
				if (loadedClass.srcDir == src) {
					iter.remove();
				}
			}
		}

		// create new class loader
		src.recreateClassLoader();
	}

	/**
	 * Class to handle the directories relevant for compiling.
	 * This class is responsible for setting the right parameters
	 * of the compiler. This specifically includes the classpath,
	 * make sure tools.jar is on the classpath (compileClasspath),
	 * otherwise things in Javac will go horribly wrong.
	 */
	private class SourceDir {
		File srcDir;

		File binDir;

		Javac javac;

		URLClassLoader classLoader;

		SourceDir(File srcDir) {
			this.srcDir = srcDir;

			String subdir = srcDir.getAbsolutePath().replace(':', '_')
					.replace('/', '_').replace('\\', '_');
			this.binDir = new File(System.getProperty("java.io.tmpdir"), subdir);
			this.binDir.mkdirs();

			// prepare compiler
			this.javac = new Javac(compileClasspath, binDir.getAbsolutePath());

			// class loader
			recreateClassLoader();

		}

		void recreateClassLoader() {
			try {
				classLoader = new URLClassLoader(
						new URL[] { binDir.toURI().toURL() }, parentClassLoader);
			} catch (MalformedURLException e) {
				// should not happen
				e.printStackTrace();
			} 
		}

	}
	
	/**
	 *  A wrapper around a class-Object.
	 *  Always knows the last time it was changed and the complete path to file
	 *  it was compiled from (srcDir).
	 *  The constructor automatically triggers the compiler, so make sure every
	 *  parameters are set, before creating a file of this type. 
	 */

	private static class LoadedClass {
		String className;

		SourceDir srcDir;

		File srcFile;

		File binFile;

		@SuppressWarnings("rawtypes")
		Class clazz;

		long lastModified;

		LoadedClass(String className, SourceDir src) {
			this.className = className;
			this.srcDir = src;

			String path = className.replace('.', '/');
			this.srcFile = new File(src.srcDir, path + ".java");
			this.binFile = new File(src.binDir, path + ".class");
			compileAndLoadClass();
		}

		boolean isChanged() {
			return srcFile.lastModified() != lastModified;
		}

		
		/**
		 * Compiles and loads the given class, if necessary.
		 * Typical scnenario of a ClassNotFoundException is a wrong 
		 * classloader in DynaCode's constructor.
		 */
		void compileAndLoadClass() {

			Logger.getInstance().log("de.~.vm.DynaCode.compileAndLoadClass()", Logger.DEBUG, "Begin of function");

			if (clazz != null) {
				return; // class already loaded
			}

			// compile, if required
			String error = null;
			if (binFile.lastModified() < srcFile.lastModified()) {
				error = srcDir.javac.compile(new File[] { srcFile });
			}

			if (error != null) {
				throw new RuntimeException("Failed to compile "
						+ srcFile.getAbsolutePath() + ". Error: " + error);
			}

			try {
				// load class
				clazz = srcDir.classLoader.loadClass(className);
				// load class success, remember timestamp
				lastModified = srcFile.lastModified();

			} catch (ClassNotFoundException e) {
				throw new RuntimeException("Failed to load DynaCode class "
						+ srcFile.getAbsolutePath());
			}
		}
	}

	/**
	 * Extracts a classpath string from a given class loader. Recognizes only
	 * URLClassLoader.
	 */
	private static String extractClasspath(ClassLoader cl) {
		StringBuffer buf = new StringBuffer();
		while (cl != null) {
			if (cl instanceof URLClassLoader) {
				URL urls[] = ((URLClassLoader) cl).getURLs();
				for (int i = 0; i < urls.length; i++) {
					if (buf.length() > 0) {
						buf.append(File.pathSeparatorChar);
					}
					buf.append(urls[i].getFile().toString());
				}
			}
			cl = cl.getParent();
		}

		return buf.toString();
	}
}