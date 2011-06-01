package de.unisiegen.informatik.bs.alvis.vm.test;

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

public class VMMultiThreadTest {
	@Test
	public void counter() {
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("first", "resources.FirstAlgoMVM");
		vm.addAlgoToVM("second", "resources.SecondAlgoMVM");

		PCInteger tmp = new PCInteger(0);
		ArrayList<PCObject> tmpl = new ArrayList<PCObject>();
		tmpl.add(tmp);

		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
				if (VirtualMachine.getInstance().getThreadState("first")
						.equals(Thread.State.TIMED_WAITING)
						|| VirtualMachine.getInstance().getThreadState("first")
								.equals(Thread.State.NEW)) {
					Assert.assertEquals(
							true,
							VirtualMachine.getInstance()
									.getThreadState("first")
									.equals(Thread.State.TIMED_WAITING)
									|| VirtualMachine.getInstance()
											.getThreadState("first")
											.equals(Thread.State.NEW));
					Assert.assertEquals(
							true,
							VirtualMachine.getInstance()
									.getThreadState("second")
									.equals(Thread.State.RUNNABLE));

				} else {
					Assert.assertEquals(
							true,
							VirtualMachine.getInstance()
									.getThreadState("first")
									.equals(Thread.State.RUNNABLE));
					Assert.assertEquals(
							true,
							VirtualMachine.getInstance()
									.getThreadState("second")
									.equals(Thread.State.TIMED_WAITING));
				}
			}
		});

		vm.setParameter("first", tmpl);
		vm.setParameter("second", tmpl);
		vm.startAlgos();
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
