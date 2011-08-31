package de.unisiegen.informatik.bs.alvis.vm.test;

import java.io.File;
import java.io.IOException;
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
public class VMMultiThreadTest {
	@Test
	public void multipleCounter() throws IOException, ClassNotFoundException,
			InterruptedException {
		for (int i = 1; i < 500; i++) {
			System.out.println("---- NR " + i + " ----");
			this.counter();
		}
		Thread.sleep(5000);
	}

	@Test
	public void counter() throws IOException, ClassNotFoundException {
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
		vm.clear();
		vm.addAlgoToVM("first", localpath + "/src/resources", "FirstAlgoMVM",
				dynamRef);
		vm.addAlgoToVM("second", localpath + "/src/resources", "SecondAlgoMVM",
				dynamRef);

		PCInteger tmp = new PCInteger(0);
		Map<String, PCObject> tmpl = new HashMap<String, PCObject>();
		tmpl.put("C", tmp);

		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
				VirtualMachine vm = VirtualMachine.getInstance();
//				System.out.println(VirtualMachine.getInstance().getThreadState(
//						"first"));
//				System.out.println(VirtualMachine.getInstance().getThreadState(
//						"second"));
				// // first start
				if (vm.getThreadState("first").equals(Thread.State.NEW)
						|| vm.getThreadState("second").equals(Thread.State.NEW)) {
					if (vm.getThreadState("first").equals(Thread.State.NEW)) {
						Assert.assertEquals(true, vm.getThreadState("second")
								.equals(Thread.State.RUNNABLE));
					}
					if (vm.getThreadState("second").equals(Thread.State.NEW)) {
						Assert.assertEquals(true, vm.getThreadState("first")
								.equals(Thread.State.RUNNABLE));
					}
				} else {
					// after that any breakpoint, only one is allowed to be
					// runnable
					if (vm.getThreadState("first")
							.equals(Thread.State.RUNNABLE)
							|| vm.getThreadState("second").equals(
									Thread.State.RUNNABLE)) {
						if (vm.getThreadState("first").equals(
								Thread.State.RUNNABLE)) {
							Assert.assertEquals(
									false,
									vm.getThreadState("second").equals(
											Thread.State.RUNNABLE));
						}
						if (vm.getThreadState("second").equals(
								Thread.State.RUNNABLE)) {
							Assert.assertEquals(
									false,
									vm.getThreadState("first").equals(
											Thread.State.RUNNABLE));
						}
					}
				}
			}
		});

		vm.setParameter("first", tmpl);
		vm.setParameter("second", tmpl);

		vm.startAlgos();

//		System.out
//				.println(VirtualMachine.getInstance().getThreadState("first"));
//		System.out.println(VirtualMachine.getInstance()
//				.getThreadState("second"));

		Assert.assertEquals(true,
				vm.getThreadState("first").equals(Thread.State.WAITING));
		Assert.assertEquals(true,
				vm.getThreadState("second").equals(Thread.State.WAITING));

		vm.stepAlgoForward("second");
		vm.waitForBreakPoint();

		Assert.assertEquals(true,
				vm.getThreadState("first").equals(Thread.State.WAITING));
		Assert.assertEquals(true,
				vm.getThreadState("second").equals(Thread.State.WAITING));

		vm.stepAlgoForward("first");
		vm.waitForBreakPoint();

		Assert.assertEquals(true,
				vm.getThreadState("first").equals(Thread.State.WAITING));
		Assert.assertEquals(true,
				vm.getThreadState("second").equals(Thread.State.WAITING));

		vm.stepAlgoForward("second");
		vm.waitForBreakPoint();

		Assert.assertEquals(true,
				vm.getThreadState("first").equals(Thread.State.WAITING));
		Assert.assertEquals(true,
				vm.getThreadState("second").equals(Thread.State.WAITING));

	}
}
