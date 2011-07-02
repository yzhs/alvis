package de.unisiegen.informatik.bs.alvis.vm.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import junit.framework.Assert;

import org.testng.annotations.Test;

import de.unisiegen.informatik.bs.alvis.graph.datatypes.PCEdge;
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
	public void multipleCounter() {
		for(int i = 1; i < 500; i ++) {
			System.out.println("---- NR " + i + " ----");
			this.counter();
		}
	}
	
	
	@Test
	public void counter() {
		String path = new String();
		File cdir = new File(".");
		try {
			path = cdir.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Create list of packages (represented by datatypes belonging to them) for the Java Compiler
		PCEdge graph_package_DUMMY = new PCEdge();
		PCBoolean primitives_package_DUMMY = new PCBoolean(false);
		
		ArrayList<Object> listOfPackages = new ArrayList<Object>();
		listOfPackages.add((Object) graph_package_DUMMY);
		listOfPackages.add((Object)primitives_package_DUMMY);
		
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("first", path + "/src/resources", "FirstAlgoMVM", listOfPackages);
		vm.addAlgoToVM("second", path + "/src/resources", "SecondAlgoMVM", listOfPackages);

		PCInteger tmp = new PCInteger(0);
		ArrayList<PCObject> tmpl = new ArrayList<PCObject>();
		tmpl.add(tmp);

		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
				VirtualMachine vm = VirtualMachine.getInstance();
				System.out.println(VirtualMachine.getInstance().getThreadState(
						"first"));
				System.out.println(VirtualMachine.getInstance().getThreadState(
						"second"));
				// first start
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
		
		vm.waitForBreakPoint();
		
//		System.out.println(VirtualMachine.getInstance().getThreadState(
//				"first"));
//		System.out.println(VirtualMachine.getInstance().getThreadState(
//				"second"));
		
		
		Assert.assertEquals(true,
				vm.getThreadState("first").equals(Thread.State.TIMED_WAITING));
		Assert.assertEquals(true,
				vm.getThreadState("second").equals(Thread.State.TIMED_WAITING));

		vm.stepAlgoForward("second");
		vm.waitForBreakPoint();

		Assert.assertEquals(true,
				vm.getThreadState("first").equals(Thread.State.TIMED_WAITING));
		Assert.assertEquals(true,
				vm.getThreadState("second").equals(Thread.State.TIMED_WAITING));

		vm.stepAlgoForward("first");
		vm.waitForBreakPoint();

		Assert.assertEquals(true,
				vm.getThreadState("first").equals(Thread.State.TIMED_WAITING));
		Assert.assertEquals(true,
				vm.getThreadState("second").equals(Thread.State.TIMED_WAITING));

		vm.stepAlgoForward("second");
		vm.waitForBreakPoint();

		Assert.assertEquals(true,
				vm.getThreadState("first").equals(Thread.State.TIMED_WAITING));
		Assert.assertEquals(true,
				vm.getThreadState("second").equals(Thread.State.TIMED_WAITING));

	}
}
