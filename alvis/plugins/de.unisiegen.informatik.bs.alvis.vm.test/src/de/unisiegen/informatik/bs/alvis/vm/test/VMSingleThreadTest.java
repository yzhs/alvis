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

/**
 * 
 * @author Dominik Dingel
 * 
 */

public class VMSingleThreadTest {
	@Test
	public void checkDoneBeforeInit() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(vm.runningThreads(), false);
	}

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
