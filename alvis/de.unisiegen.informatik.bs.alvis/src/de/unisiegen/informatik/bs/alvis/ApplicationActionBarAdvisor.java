package de.unisiegen.informatik.bs.alvis;

import org.eclipse.core.runtime.IExtension;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.internal.WorkbenchPlugin;
import org.eclipse.ui.internal.registry.ActionSetRegistry;
import org.eclipse.ui.internal.registry.IActionSetDescriptor;

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
		removeUnWantedActions();
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
		
//		 aboutAction = ActionFactory.ABOUT.create(window);
//	        register(aboutAction);
//		
		IWorkbenchAction showHelpAction = ActionFactory.HELP_CONTENTS.create(window); 
        register(showHelpAction); 
	}
	
	
    protected void fillMenuBar(IMenuManager menuBar) {
//        MenuManager helpMenu = new MenuManager(Messages.ApplicationActionBarAdvisor_MenuBar_help, IWorkbenchActionConstants.M_HELP);
//        // Add a group marker indicating where action set menus will appear.
//        menuBar.add(new GroupMarker(IWorkbenchActionConstants.MB_ADDITIONS));
//        menuBar.add(helpMenu);
//        
//        // Help
//        helpMenu.add(aboutAction);
//        helpMenu.add(showHelpAction);
    }
    private void removeUnWantedActions() {

        ActionSetRegistry asr = WorkbenchPlugin.getDefault().getActionSetRegistry();
        IActionSetDescriptor[] actionSets = asr.getActionSets();
  
        IExtension ext = null;
        for (IActionSetDescriptor actionSet : actionSets) {
        		if( actionSet.getId().equals("org.eclipse.search.searchActionSet")){
                 ext = actionSet.getConfigurationElement().getDeclaringExtension();
                 asr.removeExtension(ext, new Object[] { actionSet });

           }
        }
     }



}
