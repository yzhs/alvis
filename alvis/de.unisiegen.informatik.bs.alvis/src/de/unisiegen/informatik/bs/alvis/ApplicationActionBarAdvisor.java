package de.unisiegen.informatik.bs.alvis;

import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;

/**
 * An action bar advisor is responsible for creating, adding, and disposing of
 * the actions added to a workbench window. Each window will be populated with
 * new actions.
 */
public class ApplicationActionBarAdvisor extends ActionBarAdvisor {

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	// This is nessesary to activate the save button in the file menu
	// for all editors
	@Override
	protected void makeActions(final IWorkbenchWindow window) {
		register(ActionFactory.SAVE.create(window));
		
		
		/** START registering Actions, to be working with the Navigator */
		
		/** register delete Action */
		IWorkbenchAction action = ActionFactory.DELETE.create(window);
		register(action);
		/** register copy Action */
		action = ActionFactory.COPY.create(window);
		register(action);
		/** register paste Action */
		action = ActionFactory.PASTE.create(window);
		register(action);
		/** register cut Action */
		action = ActionFactory.CUT.create(window);
		register(action);
		/** register new Action */
		action = ActionFactory.NEW.create(window);
		register(action);
		
		/** END registering Actions */
	}

}
