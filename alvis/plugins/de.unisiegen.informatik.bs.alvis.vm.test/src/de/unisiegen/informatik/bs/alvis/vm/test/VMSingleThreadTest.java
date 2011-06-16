package de.unisiegen.informatik.bs.alvis.vm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import junit.framework.Assert;

import org.testng.annotations.Test;

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

	@Test
	public void loadAlgoClassTrue() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(true,
				vm.addAlgoToVM("algo", path + "/src/resources", "FirstAlgo"));
	}

	@Test
	public void loadAlgoClassFalse() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(false,
				vm.addAlgoToVM("algo", path + "/src/resources", ""));
	}

	@Test
	public void loadAlgoAndStartConstructor() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources", "FirstAlgo");
	}

	@Test
	public void getStartTypes() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources/", "ThreadAlgo");
		Assert.assertEquals("Integer",
				((PCInteger) vm.getParametersTypesAlgo("algo").get(0))
						.getTypeName());
	}

	@Test
	public void runThreadWithBPBackwardsOnTermination() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources/", "ThreadAlgo");
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.setParameter("algo", new ArrayList<PCObject>());
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
	public void runThreadWithBPBackwards() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources/", "ThreadAlgo");
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.setParameter("algo", new ArrayList<PCObject>());
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
	public void runThreadWithBPBackwardsError() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources/", "ThreadAlgo");
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.setParameter("algo", new ArrayList<PCObject>());
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
		// now at 2:2

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint();
		// now at 2:1

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint();
		// now at 1

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint();
		// still at 1

		Assert.assertEquals(0, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());
	}

	@Test
	public void runThreadWithBPBackwardsTillBeginning() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources/", "ThreadAlgo");
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.setParameter("algo", new ArrayList<PCObject>());
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
		// now at 2:2

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint();
		// now at 2:1

		vm.stepAlgoBackward("algo");
		vm.waitForBreakPoint();
		// now at 1

		Assert.assertEquals(0, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());
	}

	@Test
	public void runThreadWithBP() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources/", "ThreadAlgo");
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.setParameter("algo", new ArrayList<PCObject>());
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
	public void changeCodeToRuntime2() {
		String fileName = "";
		for (int i = 0; i < 8; i++) {
			fileName = fileName.concat(((new Character((char) (97 + (int) (Math
					.random() * 25))))).toString());
		}

		try {
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources/", fileName);
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.setParameter("algo", new ArrayList<PCObject>());
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

		File output = new File("src/resources/" + fileName + ".java");
		if (output.exists()) {
			output.delete();
		}

		Assert.assertEquals(4, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());

	}

	@Test
	public void changeCodeToRuntime() {

		String fileName = "";
		for (int i = 0; i < 8; i++) {
			fileName = fileName.concat(((new Character((char) (97 + (int) (Math
					.random() * 25))))).toString());
		}

		try {
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("algo", path + "/src/resources/", fileName);
		Object lock = new Object();
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.setParameter("algo", new ArrayList<PCObject>());
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

		File output = new File("src/resources/" + fileName + ".java");
		if (output.exists()) {
			output.delete();
		}

		Assert.assertEquals(7, ((PCInteger) vm.getRunningReferences("algo")
				.get(0)).getLiteralValue());
	}
}
