/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.unisiegen.informatik.bs.alvis.Activator;

/**
 * @author simon
 *
 */
public class RunNext extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
//		Activator.getDefault().getAlgorithmContainer().removeAllCurrentLine();
//		double line = Math.random()*14;
//		int theLine = (int)Math.abs(Math.round(line));
//		System.out.println(theLine);
//		Activator.getDefault().getAlgorithmContainer().addCurrentLine(theLine);
		Activator.getDefault().runNext();
		return null;
	}

}
