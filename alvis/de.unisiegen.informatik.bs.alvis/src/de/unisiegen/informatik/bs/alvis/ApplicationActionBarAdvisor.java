package de.unisiegen.informatik.bs.alvis;

import org.eclipse.jface.action.GroupMarker;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.ui.IWorkbenchActionConstants;
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
	
    private IWorkbenchAction showHelpAction;
    private IWorkbenchAction aboutAction;

	// Actions - important to allocate these only in makeActions, and then use
	// them
	// in the fill methods. This ensures that the actions aren't recreated
	// when fillActionBars is called with FILL_PROXY.

	public ApplicationActionBarAdvisor(IActionBarConfigurer configurer) {
		super(configurer);
	}
	
	// This is necessary to activate the save button in the file menu
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
		
		 aboutAction = ActionFactory.ABOUT.create(window);
	        register(aboutAction);
		
        showHelpAction = ActionFactory.HELP_CONTENTS.create(window); 
        register(showHelpAction); 
	}
	
	
    protected void fillMenuBar(IMenuManager menuBar) {
        MenuManager helpMenu = new MenuManager("&Help", IWorkbenchActionConstants.M_HELP); // TODO: Externalize String!
        
        // Add a group marker indicating where action set menus will appear.
        menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
        menuBar.add(helpMenu);
        
        // Help
        helpMenu.add(aboutAction);
        helpMenu.add(showHelpAction);
    }

}
