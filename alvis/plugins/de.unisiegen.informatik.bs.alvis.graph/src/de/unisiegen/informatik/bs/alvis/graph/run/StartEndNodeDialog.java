/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.run;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.graph.Activator;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.PCGraph;
import de.unisiegen.informatik.bs.alvis.graph.editors.GraphEditor;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraphNode;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSave;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSerialize;

/**
 * @author simon
 *
 */
public class StartEndNodeDialog extends Dialog {

	private String myInputFilePath;
	protected StartEndNodeDialog(Shell parentShell) {
		super(parentShell);
	       Composite composite = (Composite) super.createDialogArea(parentShell);
	}

	public StartEndNodeDialog(Shell shell, String myInputFilePath) {
		super(shell);
		this.myInputFilePath = myInputFilePath;
	}

	private int STARTNODE = 0;
	private int ENDNODE = 1;
	private int MODUS = 0;
	private AlvisGraph myGraph;
	private AlvisGraphNode startNode;
	private AlvisGraphNode endNode;
	private FieldEditorPreferencePage page;
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		Label lbl_instruction = new Label(composite, 0);
		lbl_instruction.setText("Choose a node to start and a node to end");
		Button btn_startnode = new Button(composite, 0);
		btn_startnode.setText("StartNode");
		btn_startnode.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				MODUS = STARTNODE;
			}
		});
		Button btn_endnode = new Button(composite, 0);
		btn_endnode.setText("EndNode");
		btn_endnode.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				MODUS = ENDNODE;
			}
		});
		
		
		AlvisSerialize seri = (AlvisSerialize)GraphEditor.deserialize(myInputFilePath);
		myGraph = new AlvisGraph(composite, 0);
		if (seri != null)
			new AlvisSave(myGraph, seri);

		myGraph.addMouseListener(new MouseListener() {
			
			protected void clickEndNode(AlvisGraphNode node, MouseEvent e) {
				if (node == myGraph.getStartNode())
					myGraph.setStartNode(null);
				if (node == null) {
					return;
				}
				if (myGraph.getEndNode() != null) {
					myGraph.getEndNode().unmarkAsStartOrEndNode();
				}
				myGraph.setEndNode(node);
				setStartNode(node);
				refreshGraphicalRepresentations();
				myGraph.resetMarking();
			}
			
			protected void clickStartNode(AlvisGraphNode node, MouseEvent e) {
				if (node == null)
					return;

				if (node == myGraph.getEndNode())
					myGraph.setEndNode(null);
				if (myGraph.getStartNode() != null) {
					myGraph.getStartNode().unmarkAsStartOrEndNode();
				}
				myGraph.setStartNode(node);
				setEndNode(node);
				refreshGraphicalRepresentations();
				myGraph.resetMarking();
			}
			
			protected void refreshGraphicalRepresentations() {
				PCGraph pseudoGraph = new PCGraph();
				
				Activator.getDefault().getTempPseudoCodeObjects().clear();
				if(startNode != null)
					Activator.getDefault().getTempPseudoCodeObjects().add(pseudoGraph.getVertexFromGraphic(startNode));
				if(endNode != null)
					Activator.getDefault().getTempPseudoCodeObjects().add(pseudoGraph.getVertexFromGraphic(endNode));
			}
			
			public void mouseDoubleClick(MouseEvent e) {
			}
			public void mouseDown(MouseEvent e) {
			}
			public void mouseUp(MouseEvent e) {
				AlvisGraphNode actNode = myGraph.getHighlightedNode();
				if(MODUS == STARTNODE) {
					clickStartNode(actNode, e);
				}
				else if(MODUS == ENDNODE) {
					clickEndNode(actNode, e);
				}
			}
		});
		
		page = new FieldEditorPreferencePage("Choose start and end node",
				FieldEditorPreferencePage.GRID) {
			protected void createFieldEditors() {
			}
		};
		
		page.createControl(composite);
		Control pageControl = page.getControl();
		pageControl.setLayoutData(new GridData(GridData.FILL_BOTH));
		return pageControl;
	}
	
	public void setStartNode(AlvisGraphNode startNode) {
		this.startNode = startNode;
	}

	public AlvisGraphNode getStartNode() {
		return startNode;
	}

	public void setEndNode(AlvisGraphNode endNode) {
		this.endNode = endNode;
	}

	public AlvisGraphNode getEndNode() {
		return endNode;
	}
}
