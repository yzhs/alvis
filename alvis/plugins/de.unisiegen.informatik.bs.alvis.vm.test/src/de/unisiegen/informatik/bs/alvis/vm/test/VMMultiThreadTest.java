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

public class VMMultiThreadTest {
	
	/**
	 * Runs the concurrency Test 500 times to check that the system is currently working
	 * @throws IOException, ClassNotFoundException
	 */
	@Test
	public void multipleCounter() throws IOException, ClassNotFoundException,
			InterruptedException {
		for (int i = 1; i < 500; i++) {
			System.out.println("---- NR " + i + " ----");
			this.counter();
		}
		Thread.sleep(5000);
	}


	/**
	 * The implemented Test
	 * @throws IOException and ClassNotFoundException
	 */
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
