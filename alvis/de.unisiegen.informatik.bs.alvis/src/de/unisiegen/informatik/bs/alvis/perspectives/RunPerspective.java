package de.unisiegen.informatik.bs.alvis.perspectives;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import de.unisiegen.informatik.bs.alvis.views.RunAlgorithm;
import de.unisiegen.informatik.bs.alvis.views.RunGraph;

public class RunPerspective implements IPerspectiveFactory {

	public static final String ID = "de.unisiegen.informatik.bs.alvis.perspective.run";
	
	public void createInitialLayout(IPageLayout layout) {
		// EditorArea?
		layout.setEditorAreaVisible(false);
		// This makes it possible to close and move the views
		layout.setFixed(false);
		
		IFolderLayout folder0 = layout.createFolder(
				"de.unisiegen.informatik.bs.alvis.perspectives.runperspecive.folder0",
				IPageLayout.LEFT, 0.382f, layout.getEditorArea());
		folder0.addView(RunAlgorithm.ID);
		layout.getViewLayout(RunAlgorithm.ID).setCloseable(false);
		
		// One for the Graph
		IFolderLayout folder1 = layout.createFolder(
				"de.unisiegen.informatik.bs.alvis.perspectives.runperspecive.folder1",
				IPageLayout.RIGHT, 0.618f, layout.getEditorArea());
		folder1.addView(RunGraph.ID);
		layout.getViewLayout(RunGraph.ID).setCloseable(false);

			

	}

}
