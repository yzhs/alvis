package de.unisiegen.informatik.bs.alvis.vm.test;

import junit.framework.Assert;

import org.testng.annotations.Test;

import resources.FirstAlgo;
import resources.SecondAlgo;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeInteger;
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
		Assert.assertEquals(vm.isDone(), false);
	}
	
	@Test
	public void loadAlgoClassTrue() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(vm.setAlgoClassToRun(FirstAlgo.class), true);
	}
	
	@Test
	public void loadAlgoClassFalse() {
		VirtualMachine vm = VirtualMachine.getInstance();
		Assert.assertEquals(vm.setAlgoClassToRun(null), false);
	}
	
	@Test
	public void loadAlgoAndStartConstructor() {
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.setAlgoClassToRun(FirstAlgo.class);
		vm.startAutoRun();
	}
	
	@Test
	public void getStartTypes() {
		VirtualMachine vm = VirtualMachine.getInstance();
		vm.setAlgoClassToRun(SecondAlgo.class);
		Assert.assertEquals(((PseudoCodeInteger) vm.getStartParameters().get(0)).getTypeName(), "Integer");
	}
	
}
