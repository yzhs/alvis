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

package de.unisiegen.informatik.bs.alvis.vm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import junit.framework.Assert;

import org.testng.annotations.Test;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCBoolean;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.VirtualMachine;

public class VMSingleThreadTest {

	/**
	 * no Threads should be running if nothing is started
	 */
	@Test
	public void checkDoneBeforeInit() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(vm.runningThreads(), false);
	}

	/**
	 * checking that PCObject will return there right TypeName
	 * 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@SuppressWarnings("static-access")
	@Test
	public void getTypeNames() throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		PCBoolean expr = new PCBoolean(false);
		PCInteger inte = new PCInteger(1);
		ArrayList<PCObject> pcobj = new ArrayList<PCObject>();
		pcobj.add(inte);
		pcobj.add(expr);

		Assert.assertEquals(true, pcobj.get(0).getTypeName().equals("Object"));
		Assert.assertEquals(true, pcobj.get(1).getTypeName().equals("Object"));
		Assert.assertEquals(
				true,
				pcobj.get(0).getClass()
						.getMethod("getTypeName", (Class<?>[]) null)
						.invoke(pcobj.get(0), (Object[]) null).toString()
						.equals("Integer"));
		Assert.assertEquals(
				true,
				pcobj.get(1).getClass()
						.getMethod("getTypeName", (Class<?>[]) null)
						.invoke(pcobj.get(1), (Object[]) null).toString()
						.equals("Boolean"));

	}

	/**
	 * loads an algo with success
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void loadAlgoClassTrue() throws IOException, ClassNotFoundException {
		String localpath = new String();
		File cdir = new File(".");

		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources", "FirstAlgo",
				dynamRef);

	}

	/**
	 * loads an empty fail so the algo will fail
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test(expectedExceptions = ClassNotFoundException.class)
	public void loadAlgoClassFalse() throws IOException, ClassNotFoundException {
		String localpath = new String();
		File cdir = new File(".");

		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources", "", dynamRef);
	}

	/**
	 * returns the Arguments for the Algo
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("static-access")
	@Test
	public void getStartTypes() throws IOException, ClassNotFoundException {
		String localpath = new String();
		File cdir = new File(".");

		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources", "ThreadAlgo",
				dynamRef);

		Assert.assertEquals("Integer",
				((PCInteger) (vm.getParametersTypesAlgo("algo").values()
						.toArray())[0]).getTypeName());
	}

	/**
	 * Runs the Thread forwards and backwards till Termination and checking the
	 * return value
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void runThreadWithBPBackwardsOnTermination() throws IOException,
			ClassNotFoundException {
		String localpath = new String();
		File cdir = new File(".");

		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources", "ThreadAlgo",
				dynamRef);

		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		Map<String, PCObject> paras = new HashMap<String, PCObject>();
		paras.put("counter", new PCInteger(0));
		vm.setParameter("algo", paras);
		vm.startAlgos();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepAlgoForward();
				if (!vm.runningThreads()) {
					toRun = false;
				}
			}
		}
		vm.waitForBreakPoint();
		Assert.assertEquals(4, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());
	}

	/**
	 * Runs the Thread forwards and backwards and checking the return value
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void runThreadWithBPBackwards() throws IOException,
			ClassNotFoundException {
		String localpath = new String();
		File cdir = new File(".");
		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources", "ThreadAlgo",
				dynamRef);
		Object lock = new Object();
		vm.addBPListener(new BPListener() {

			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		Map<String, PCObject> paras = new HashMap<String, PCObject>();
		paras.put("counter", new PCInteger(0));
		vm.setParameter("algo", paras);
		vm.startAlgos();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepAlgoForward();
				if (!vm.runningThreads()) {
					toRun = false;
				}
			}
		}
		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint();
		Assert.assertEquals(2, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());
	}

	/**
	 * Run the Algo and then back to the start.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void runThreadWithBPBackwardsError() throws IOException,
			ClassNotFoundException {
		String localpath = new String();
		File cdir = new File(".");
		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources", "ThreadAlgo",
				dynamRef);
		Object lock = new Object();
		vm.addBPListener(new BPListener() {

			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		Map<String, PCObject> paras = new HashMap<String, PCObject>();
		paras.put("counter", new PCInteger(0));
		vm.setParameter("algo", paras);
		vm.startAlgos();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepAlgoForward();
				if (!vm.runningThreads()) {
					toRun = false;
				}
			}
		}
		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint(); // now at 2:2

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint(); // now at 2:1

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint(); // now at 1

		Assert.assertEquals(0, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint(); // at the beginning

		Assert.assertEquals(null, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)));

	}

	/**
	 * Run the AlgoThread till Beginning
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void runThreadWithBPBackwardsTillBeginning() throws IOException,
			ClassNotFoundException {
		String localpath = new String();
		File cdir = new File(".");
		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources", "ThreadAlgo",
				dynamRef);
		Object lock = new Object();
		vm.addBPListener(new BPListener() {

			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		Map<String, PCObject> paras = new HashMap<String, PCObject>();
		paras.put("counter", new PCInteger(0));
		vm.setParameter("algo", paras);
		vm.startAlgos();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepAlgoForward();
				if (!vm.runningThreads()) {
					toRun = false;
				}
			}
		}
		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint(); // now at 2:2

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint(); // now at 2:1

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint(); // now at 1

		Assert.assertEquals(0, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());
	}

	/**
	 * Runs Thread with Breakpoints
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void runThreadWithBP() throws IOException, ClassNotFoundException {
		String localpath = new String();
		File cdir = new File(".");
		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources", "ThreadAlgo",
				dynamRef);
		Object lock = new Object();
		vm.addBPListener(new BPListener() {

			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		Map<String, PCObject> paras = new HashMap<String, PCObject>();
		paras.put("counter", new PCInteger(0));
		vm.setParameter("algo", paras);
		vm.startAlgos();
		while (true) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepAlgoForward();
				if (!vm.runningThreads()) {
					Assert.assertEquals(4, ((PCInteger) vm
							.getRunningReferences("algo").get(0))
							.getLiteralValue());
					return;
				}
			}
		}
	}

	/**
	 * changed the resources/template file to load a modified java file
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void changeCodeToRuntime2() throws IOException,
			ClassNotFoundException {
		String fileName = "";
		for (int i = 0; i < 8; i++) {
			fileName = fileName.concat(((new Character((char) (97 + (int) (Math
					.random() * 25))))).toString());
		}
		FileInputStream inputS = new FileInputStream(
				"src/resources/Template.txt");
		FileOutputStream outputS = new FileOutputStream("src/resources/"
				+ fileName + ".java");
		int b = inputS.read();
		while (b != -1) {
			if (b == 'G') {
				for (int i = 0; i < 7; i++) {
					outputS.write(fileName.charAt(i));
				}
				b = fileName.charAt(7);
			}
			if (b == 'X') {
				b = '0';
			}
			outputS.write(b);
			b = inputS.read();
		}
		inputS.close();
		outputS.close();

		String localpath = new String();
		File cdir = new File(".");
		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources/", fileName,
				dynamRef);
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		Map<String, PCObject> paras = new HashMap<String, PCObject>();
		vm.setParameter("algo", paras);
		vm.startAlgos();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepAlgoForward();
				if (!vm.runningThreads()) {
					toRun = false;
				}
			}
		}

		File output = new File("src/resources/" + fileName + ".java");
		if (output.exists()) {
			output.delete();
		}
		Assert.assertEquals(4, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());
	}

	/**
	 * changed the resources/template file to load a modified java file
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	@Test
	public void changeCodeToRuntime() throws IOException,
			ClassNotFoundException {
		String fileName = "";
		for (int i = 0; i < 8; i++) {
			fileName = fileName.concat(((new Character((char) (97 + (int) (Math
					.random() * 25))))).toString());
		}
		FileInputStream inputS = new FileInputStream(
				"src/resources/Template.txt");
		FileOutputStream outputS = new FileOutputStream("src/resources/"
				+ fileName + ".java");
		int b = inputS.read();
		while (b != -1) {
			if (b == 'G') {
				for (int i = 0; i < 7; i++) {
					outputS.write(fileName.charAt(i));
				}
				b = fileName.charAt(7);
			}
			if (b == 'X') {
				b = '3';
			}
			outputS.write(b);
			b = inputS.read();
		}
		inputS.close();
		outputS.close();

		String localpath = new String();
		File cdir = new File(".");
		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) primitives_package_DUMMY);
		TreeSet<String> dynamRef = new TreeSet<String>();
		for (Object obj : listOfPackages) {
			String path = obj.getClass().getProtectionDomain().getCodeSource()
					.getLocation().getFile().toString();
			if (path.endsWith(".jar"))
				dynamRef.add(path);
			else
				dynamRef.add(path + "src/");
		}
		localpath = cdir.getCanonicalPath();
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", localpath + "/src/resources/", fileName,
				dynamRef);
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		Map<String, PCObject> paras = new HashMap<String, PCObject>();
		vm.setParameter("algo", paras);
		vm.startAlgos();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepAlgoForward();
				if (!vm.runningThreads()) {
					toRun = false;
				}
			}
		}

		File output = new File("src/resources/" + fileName + ".java");
		if (output.exists()) {
			output.delete();
		}
		Assert.assertEquals(7, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());
	}
}
