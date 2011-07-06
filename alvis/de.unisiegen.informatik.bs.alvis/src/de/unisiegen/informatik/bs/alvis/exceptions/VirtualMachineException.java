package de.unisiegen.informatik.bs.alvis.exceptions;

public class VirtualMachineException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1468295770045435275L;

	/**
	 * VirtualMachineException if something goes wrong with the VM
	 */
	public VirtualMachineException() {
	}

	/**
	 * VirtualMachineException if something goes wrong with the VM
	 */
	public VirtualMachineException(String s) {
		super(s);
	}
}
