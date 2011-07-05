package de.unisiegen.informatik.bs.alvis.perspectives;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.views.RunAlgorithm;
import de.unisiegen.informatik.bs.alvis.views.RunGraph;

public class RunPerspective implements IPerspectiveFactory, IExportItem {

	public static final String ID = "de.unisiegen.informatik.bs.alvis.perspective.run";
	
	@Override
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

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRun() {
		return true;
	}

	@Override
	public StyledText getSourceCode() {
		// TODO Auto-generated method stub
		return null;
	}

}
