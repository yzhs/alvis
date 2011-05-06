package de.unisiegen.informatik.bs.alvis.ui.navigator.views;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.navigator.CommonNavigator;
import org.eclipse.ui.navigator.CommonViewer;

/**
 *
 * @author Eduard Boos
 *
 */
public class Navigator extends CommonNavigator {
	public static final String ID = "de.unisiegen.informatik.bs.alvis.views.navigator";

	public CommonViewer getCommonViewer() {
		return super.getCommonViewer();
	}

	public void init(IViewSite site) throws PartInitException {
		super.init(site);
	}

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