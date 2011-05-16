package de.unisiegen.informatik.bs.alvis.vm.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import junit.framework.Assert;

import org.testng.annotations.Test;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeInteger;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.VirtualMachine;

/**
 * 
 * @author Dominik Dingel
 * 
 */

public class VirtualMachineTest {
	@Test
	public void checkDoneBeforeInit() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(vm.isAlive(), false);
	}

	@Test
	public void loadAlgoClassTrue() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(true, vm.classCompileAndLoad("resources.FirstAlgo"));
	}

	@Test
	public void loadAlgoClassFalse() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(vm.classCompileAndLoad(""), false);
	}

	@Test
	public void loadAlgoAndStartConstructor() {
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.classCompileAndLoad("resources.FirstAlgo");
		vm.startAutoRun();
	}

	@Test
	public void getStartTypes() {
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.classCompileAndLoad("resources.SecondAlgo");
		Assert.assertEquals(
				((PseudoCodeInteger) vm.getStartParameters().get(0))
						.getTypeName(), "Integer");
	}

	@Test
	public void runThreadWithBPBackwardsOnTermination() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Object lock = new Object();
		vm.classCompileAndLoad("resources.ThreadAlgo");
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.startDefaultRun();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepForward();
				if (!vm.isAlive()) {
					toRun = false;
				}
			}
		}
		vm.waitForBreakPoint();
		Assert.assertEquals(4, ((PseudoCodeInteger) vm.getRunningRef().get(0))
				.getLiteralValue());

	}

	@Test
	public void runThreadWithBPBackwards() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Object lock = new Object();
		vm.classCompileAndLoad("resources.ThreadAlgo");
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.startDefaultRun();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepForward();
				if (!vm.isAlive()) {
					toRun = false;
				}
			}
		}
		vm.stepBackward();
		vm.waitForBreakPoint();
		Assert.assertEquals(2, ((PseudoCodeInteger) vm.getRunningRef().get(0))
				.getLiteralValue());
	}

	@Test
	public void runThreadWithBP() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Object lock = new Object();
		vm.classCompileAndLoad("resources.ThreadAlgo");
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.startDefaultRun();
		while (true) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepForward();
				if (!vm.isAlive()) {
					Assert.assertEquals(4, ((PseudoCodeInteger) vm
							.getRunningRef().get(0)).getLiteralValue());
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

		VirtualMachine vm = VirtualMachine.getInstance();
		Object lock = new Object();
		vm.classCompileAndLoad("resources." + fileName);
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.startDefaultRun();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepForward();
				if (!vm.isAlive()) {
					toRun = false;
				}
			}
		}
		vm.waitForBreakPoint();

		File output = new File("src/resources/" + fileName + ".java");
		if (output.exists()) {
			output.delete();
		}

		Assert.assertEquals(4, ((PseudoCodeInteger) vm.getRunningRef().get(0))
				.getLiteralValue());

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

		VirtualMachine vm = VirtualMachine.getInstance();
		Object lock = new Object();
		vm.classCompileAndLoad("resources." + fileName);
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
			}
		});
		vm.startDefaultRun();
		boolean toRun = true;
		while (toRun) {
			synchronized (lock) {
				try {
					lock.wait(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				vm.stepForward();
				if (!vm.isAlive()) {
					toRun = false;
				}
			}
		}
		vm.waitForBreakPoint();

		File output = new File("src/resources/" + fileName + ".java");
		if (output.exists()) {
			output.delete();
		}

		Assert.assertEquals(7, ((PseudoCodeInteger) vm.getRunningRef().get(0))
				.getLiteralValue());
	}
}
