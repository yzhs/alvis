package de.unisiegen.informatik.bs.alvis.io.dialogs;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;

//import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
//import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;

public class SettingsDialog extends TitleAreaDialog {

	public SettingsDialog(Shell parentShell) {
		super(parentShell);
	}
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);		
		setTitle("Bitte wählen!");
		setMessage("Wählen Sie bitte einen dieser Knoten als Startknoten.", SWT.ERROR);
		
//		AlvisGraph graph = new AlvisGraph(composite, SWT.NONE);
//		graph.setLayoutData(new GridData(GridData.FILL_BOTH));
//		
//		ArrayList<AlvisGraphNode> tree = new ArrayList<AlvisGraphNode>();
//		tree.add(new AlvisGraphNode(graph, "1", null));
//		tree.add(new AlvisGraphNode(graph, "2", null));
//		tree.add(new AlvisGraphNode(graph, "3", null));
//		graph.addTree(tree);
		return composite;
    }

    @Override
    protected Point getInitialSize() {
        return new Point(400, 300);
    }

    @Override
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText("Einstellungen");
    }
}