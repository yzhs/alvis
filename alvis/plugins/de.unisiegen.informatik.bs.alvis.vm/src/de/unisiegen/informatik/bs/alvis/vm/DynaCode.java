package de.unisiegen.informatik.bs.alvis.vm;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


public final class DynaCode {
	
	
	private String compileClasspath;

	private ClassLoader parentClassLoader;

	private ArrayList sourceDirs = new ArrayList();

	// class name => LoadedClass
	private HashMap loadedClasses = new HashMap();

	public DynaCode() {
		this(Thread.currentThread().getContextClassLoader());
	}

	public DynaCode(ClassLoader parentClassLoader) {
		this(extractClasspath(parentClassLoader), parentClassLoader);

	}

	/**
	 * @param compileClasspath
	 *            used to compile dynamic classes
	 * @param parentClassLoader
	 *            the parent of the class loader that loads all the dynamic
	 *            classes
	 */
	public DynaCode(String compileClasspath, ClassLoader parentClassLoader) {
		this.compileClasspath = compileClasspath;
		this.parentClassLoader = parentClassLoader;
		System.out.println(parentClassLoader.toString());
		this.compileClasspath = this.compileClasspath.concat(":"+":/home/basti/plugins/org.eclipse.draw2d_3.6.1.v20100913-2020.jar:" +
								"/home/basti/plugins/org.eclipse.swt.gtk.linux.x86_3.6.1.v3655c.jar:" +
								"/home/basti/plugins/org.eclipse.zest.core_1.2.0.v20101209-2020.jar:"+
								//"/home/basti/Programmierung/eclipse_java3/alviscopy/src/:" +
								"/home/basti/Studium/2010_11 WS/Softwaretechnik I/eclipse/plugins/:" +
								//"/home/basti/Programmierung/eclipse_java3/alviscopy/vm/:" +
								//"/home/basti/Programmierung/eclipse_java3/alviscopy/vm/src/:" +
								//"/home/basti/Programmierung/eclipse_java3/alviscopy/:" +
								this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+"src/:"+
								this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+":"+
								this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+"vm/:"+
								this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+"vm/src/:"+
								"/home/basti/Programmierung/runtime-alvis.product/bin/:" +
								"/home/basti/Programmierung/runtime-alvis.product/:" +
								"/usr/lib/jvm/java-6-sun-1.6.0.24/jre/lib/ext/localedata.jar:" +
								"/usr/lib/jvm/java-6-sun-1.6.0.24/jre/lib/ext/sunjce_provider.jar:" +
								"/usr/lib/jvm/java-6-sun-1.6.0.24/jre/lib/ext/sunpkcs11.jar:" +
								"/usr/lib/jvm/java-6-sun-1.6.0.24/jre/lib/ext/dnsns.jar"+
								"/home/basti/Downloads/eclipse/:"+
								"/home/basti/Downloads/eclipse/plugins"
								);
		this.compileClasspath = this.compileClasspath.concat(
				System.getProperty("path.separator")+this.getClass().getProtectionDomain().getCodeSource().getLocation().getFile().toString()+ "vm/src"
				);
		System.out.println("compileClasspath: " + this.compileClasspath);
	}

	/**
	 * Add a directory that contains the source of dynamic java code.
	 * 
	 * @param srcDir
	 * @return true if the add is successful
	 * @throws IOException 
	 */
	public boolean addSourceDir(File srcDir) {
		try {
			System.out.println("srcDir Pre: " +  srcDir.toString());
			srcDir = srcDir.getCanonicalFile();
			System.out.println("srcDir After: " +  srcDir.toString());
			
		} catch (IOException e) {
			// ignore
		}

		synchronized (sourceDirs) {

			// check existence
			for (int i = 0; i < sourceDirs.size(); i++) {
				SourceDir src = (SourceDir) sourceDirs.get(i);
				if (src.srcDir.equals(srcDir)) {
					return false;
				}
			}

			// add new
			SourceDir src = new SourceDir(srcDir);
			sourceDirs.add(src);

			info("Add source dir " + srcDir);
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
	public Class loadClass(String className) throws ClassNotFoundException {

		LoadedClass loadedClass = null;
		synchronized (loadedClasses) {
			loadedClass = (LoadedClass) loadedClasses.get(className);
		}

		// first access of a class
		if (loadedClass == null) {

			String resource = className.replace('.', '/') + ".java";
			SourceDir src = locateResource(resource);
			if (src == null) {
				throw new ClassNotFoundException("DynaCode class not found "
						+ className);
			}

			synchronized (this) {

				// compile and load class
				loadedClass = new LoadedClass(className, src);

				synchronized (loadedClasses) {
					loadedClasses.put(className, loadedClass);
				}
			}

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
			SourceDir src = (SourceDir) sourceDirs.get(i);
			if (new File(src.srcDir, resource).exists()) {
				return src;
			}
		}
		return null;
	}

	private void unload(SourceDir src) {
		// clear loaded classes
		synchronized (loadedClasses) {
			for (Iterator iter = loadedClasses.values().iterator(); iter
					.hasNext();) {
				LoadedClass loadedClass = (LoadedClass) iter.next();
				if (loadedClass.srcDir == src) {
					iter.remove();
				}
			}
		}

		// create new class loader
		src.recreateClassLoader();
	}

	/**
	 * Get a resource from added source directories.
	 * 
	 * @param resource
	 * @return the resource URL, or null if resource not found
	 */
	public URL getResource(String resource) {
		try {

			SourceDir src = locateResource(resource);
			return src == null ? null : new File(src.srcDir, resource).toURL();

		} catch (MalformedURLException e) {
			// should not happen
			return null;
		}
	}

	/**
	 * Get a resource stream from added source directories.
	 * 
	 * @param resource
	 * @return the resource stream, or null if resource not found
	 */
	public InputStream getResourceAsStream(String resource) {
		try {

			SourceDir src = locateResource(resource);
			return src == null ? null : new FileInputStream(new File(
					src.srcDir, resource));

		} catch (FileNotFoundException e) {
			// should not happen
			return null;
		}
	}

	/**
	 * Create a proxy instance that implements the specified access interface
	 * and delegates incoming invocations to the specified dynamic
	 * implementation. The dynamic implementation may change at run-time, and
	 * the proxy will always delegates to the up-to-date implementation.
	 * 
	 * @param interfaceClass
	 *            the access interface
	 * @param implClassName
	 *            the backend dynamic implementation
	 * @return
	 * @throws RuntimeException
	 *             if an instance cannot be created, because of class not found
	 *             for example
	 */
	public Object newProxyInstance(Class interfaceClass, String implClassName)
			throws RuntimeException {
		MyInvocationHandler handler = new MyInvocationHandler(
				implClassName);
		return Proxy.newProxyInstance(interfaceClass.getClassLoader(),
				new Class[] { interfaceClass }, handler);
	}

	private class SourceDir {
		File srcDir;

		File binDir;

		Javac javac;

		URLClassLoader classLoader;

		SourceDir(File srcDir) {
			this.srcDir = srcDir;

			String subdir = srcDir.getAbsolutePath().replace(':', '_').replace(
					'/', '_').replace('\\', '_');
			this.binDir = new File(System.getProperty("java.io.tmpdir"),
					"dynacode/" + subdir);
			this.binDir.mkdirs();

			// prepare compiler
			System.out.println("In SourceDir: " + binDir.getAbsolutePath());
			System.out.println("binDir: " + binDir);
			this.javac = new Javac(compileClasspath, binDir.getAbsolutePath());
			
			// class loader
			recreateClassLoader();
		}
		
		void recreateClassLoader() {
			try {
				classLoader = new URLClassLoader(new URL[] { binDir.toURL() },
						parentClassLoader);
			} catch (MalformedURLException e) {
				// should not happen
			}
		}

	}

	private static class LoadedClass {
		String className;

		SourceDir srcDir;

		File srcFile;

		File binFile;

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

		void compileAndLoadClass() {

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

			info("Init " + clazz);
		}
	}

	private class MyInvocationHandler implements InvocationHandler {

		String backendClassName;

		Object backend;

		MyInvocationHandler(String className) {
			backendClassName = className;

			try {
				Class clz = loadClass(backendClassName);
				backend = newDynaCodeInstance(clz);

			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		}

		public Object invoke(Object proxy, Method method, Object[] args)
				throws Throwable {

			// check if class has been updated
			Class clz = loadClass(backendClassName);
			if (backend.getClass() != clz) {
				backend = newDynaCodeInstance(clz);
			}

			try {
				// invoke on backend
				return method.invoke(backend, args);

			} catch (InvocationTargetException e) {
				throw e.getTargetException();
			}
		}

		private Object newDynaCodeInstance(Class clz) {
			try {
				return clz.newInstance();
			} catch (Exception e) {
				throw new RuntimeException(
						"Failed to new instance of DynaCode class "
								+ clz.getName(), e);
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

	/**
	 * Log a message.
	 */
	private static void info(String msg) {
		System.out.println("[DynaCode] " + msg);
	}

}