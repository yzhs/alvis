package de.unisiegen.informatik.bs.alvis.ui.navigator.views;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;

/**
 * Main Navigator class, which extends the CommonNavigator and add the Workspace folder as root.
 * 
 * @author Eduard Boos
 *
 */
public class Navigator extends CommonNavigator {
	public static final String ID = "de.unisiegen.informatik.bs.alvis.ui.navigator.views.navigator"; //$NON-NLS-1$

	@Override
	public CommonViewer getCommonViewer() {
		return super.getCommonViewer();
	}

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
	}

	@Override
	public void createPartControl(Composite aParent) {
		super.createPartControl(aParent);
		/** set initial input for the Navigator, otherwise it sometimes would be blank
		 *  even with the CNF fix.
		 */
		getCommonViewer().setInput(ResourcesPlugin.getWorkspace().getRoot());
	}
	public String getContributorId() {
		return ID;
	}
}