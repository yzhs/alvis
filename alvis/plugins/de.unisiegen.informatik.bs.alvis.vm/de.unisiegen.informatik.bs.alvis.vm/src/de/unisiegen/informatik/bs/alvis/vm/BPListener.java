package de.unisiegen.informatik.bs.alvis.vm;

/**
 * 
 * @author Dominik Dingel
 * 
 */
public interface BPListener {

	/**
	 * 
	 * @param BreakPointNumber
	 *            specifies behaviour on reaching breakpoint
	 */
	void onBreakPoint(int BreakPointNumber);
}
