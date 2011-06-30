package de.unisiegen.informatik.bs.alvis.commands;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.PlatformUI;

import de.unisiegen.informatik.bs.alvis.perspectives.RunPerspective;

public class CloseRunPerspective extends AbstractHandler {

	/**
	 * @author simon
	 * Executing this method closes the RunPerspective, if open.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IPerspectiveDescriptor runPerspective = null;
		for (IPerspectiveDescriptor perspective : PlatformUI.getWorkbench()
				.getPerspectiveRegistry().getPerspectives()) {
			if (perspective.getId().equals(RunPerspective.ID))
				runPerspective = perspective;
		}
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.closePerspective(runPerspective, false, true);
		return null;
	}

}
