package de.unisiegen.informatik.bs.alvis.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.unisiegen.informatik.bs.alvis.Activator;

/**
 * @author Simon Groth
 *
 */
public class RunStart extends AbstractHandler {
	public static final String HANDLING_COMMAND_ID =
		"de.unisiegen.informatik.bs.alvis.commands.runStart";
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Activator.getDefault().runStart();
		return null;
	}

}
