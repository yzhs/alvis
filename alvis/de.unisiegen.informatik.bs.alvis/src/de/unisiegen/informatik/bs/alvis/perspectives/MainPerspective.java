package de.unisiegen.informatik.bs.alvis.perspectives;

import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.osgi.framework.Bundle;

/**
 * The main/default perspective
 * 
 * @author simon
 * 
 */

public class MainPerspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.setFixed(false);

		IFolderLayout folder = layout
				.createFolder(
						"de.unisiegen.informatik.bs.alvis.perspectives.mainperspective.folder",
						IPageLayout.LEFT, 0.382f, layout.getEditorArea());

		/** get Bundle for the Navigator View */
		Bundle bundle = Platform
				.getBundle("de.unisiegen.informatik.bs.alvis.ui.navigator");
		/** load Navigator View into MainPerspective if Bundle is loaded */
		if (bundle != null) {
			folder.addView("de.unisiegen.informatik.bs.alvis.ui.navigator.views.navigator");

		}
	}
}
