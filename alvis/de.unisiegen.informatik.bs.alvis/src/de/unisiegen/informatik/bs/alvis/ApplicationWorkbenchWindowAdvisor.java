package de.unisiegen.informatik.bs.alvis;

import java.awt.Dimension;
import java.awt.Toolkit;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.application.ActionBarAdvisor;
import org.eclipse.ui.application.IActionBarConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

import de.unisiegen.informatik.bs.alvis.commands.SwitchToAlvisPerspective;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

	public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
		super(configurer);
	}

	@Override
	public ActionBarAdvisor createActionBarAdvisor(
			IActionBarConfigurer configurer) {
		return new ApplicationActionBarAdvisor(configurer);
	}

	@Override
	public void preWindowOpen() {
		IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
		configurer.setShowPerspectiveBar(true);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		configurer.setInitialSize(new Point(screen.width, screen.height));
		configurer.setShowCoolBar(true);
		configurer.setShowStatusLine(false);
		configurer.setShowMenuBar(true);
		configurer.setTitle(Messages.ApplicationWorkbenchWindowAdvisor_0);
	}
	
	/*
	 * What is to do before closing the window? (non-Javadoc)
	 * @see org.eclipse.ui.application.WorkbenchWindowAdvisor#preWindowShellClose()
	 */
	@Override
	public boolean preWindowShellClose() {
		try {
			new SwitchToAlvisPerspective().execute(null);
			
			// Save the workspace is important, because otherwise restarting the
			// application is making errors
			ResourcesPlugin.getWorkspace().save(true, null);
		} catch (CoreException e) {
			//TODO EXCEPTIONHANDLING
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true; 
	}
}
