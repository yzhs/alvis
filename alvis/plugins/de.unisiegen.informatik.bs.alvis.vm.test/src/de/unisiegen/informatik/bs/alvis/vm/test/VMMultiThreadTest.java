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
 * @author 
 * 
 */

public class VMMultiThreadTest {
	@Test
	public void counter() {
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.addAlgoToVM("first", "resources.FirstAlgoMVM");
		//vm.addAlgoToVM("second", "resources.SecondAlgoMVM");
		
		PCInteger tmp = new PCInteger(0);
		ArrayList<PCObject> tmpl = new ArrayList<PCObject>();
		tmpl.add(tmp);
		vm.addBPListener(new BPListener() {
			@Override
			public void onBreakPoint(int BreakPointNumber) {
				System.out.println(VirtualMachine.getInstance().getThreadState("first") + "" + VirtualMachine.getInstance().getThreadState("second"));
			}
		});
		
		vm.setParameter("first", tmpl);
		//vm.setParameter("second", tmpl);
		
		vm.startAlgos();
		//vm.waitForBreakPoint();
		
		System.out.println(vm.getRunningReferences("first").get(0));
		//vm.stepAlgoForward("second");
		//System.out.println(vm.getRunningReferences("first").get(0));
		
	}
}
