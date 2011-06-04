package de.unisiegen.informatik.bs.alvis.graph.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisSerialize;


public class GraphEditorAdjacencyMatrix extends EditorPart implements
		PropertyChangeListener, IExportItem {
	private Table table;

	public GraphEditorAdjacencyMatrix() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSaveAs() {
		// TODO Auto-generated method stub

	}

	private IEditorInput myInput;
	private String myInputFilePath;
	private AlvisSerialize mySeri;
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		myInput = input;
		
		if (myInput instanceof FileEditorInput) {
			FileEditorInput fileInput = (FileEditorInput) myInput;
			myInputFilePath = fileInput.getPath().toString();
			AlvisSerialize seri = (AlvisSerialize) GraphEditor.deserialize(myInputFilePath);
			if (seri != null) {
				mySeri = seri;
			}
		}
	}

	public boolean isDirty() {
		return false;
	}

	public boolean isSaveAsAllowed() {
		return false;
	}

	private Composite myParent;
	private static int y;
	public void createPartControl(Composite parent) {
		myParent = parent;
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));

		// new TableViewer
		TableViewer tableViewer = new TableViewer(myParent, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		// Settings 
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		// ArrayContentProvider can be used, because matrix is a java collection
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		// The width of the colums
		int columWidth = 20;
		
		// Array of TableViewerColumn's
		TableViewerColumn[] tableViewerColumns = new TableViewerColumn[mySeri.getNodeId().length];
		// Array of TableColumn's
		TableColumn[] tblclmns = new TableColumn[mySeri.getNodeId().length];
		// ArrayList of String Array's for the Input
		ArrayList<String[]> matrix = new ArrayList<String[]>();
		
		// Iterate over all Nodes
		for(y = 0; y<mySeri.getNodeId().length; y++) {
			
			// Create a TableColumn
			tableViewerColumns[y] = new TableViewerColumn(tableViewer, SWT.NONE);
			tblclmns[y] = tableViewerColumns[y].getColumn();
			tblclmns[y].setWidth(columWidth);
			tblclmns[y].setText("" + mySeri.getNodeId()[y]);
			tableViewerColumns[y].setLabelProvider(new DynamicCellLabelProvider(y));
			
			// Add Input for each row
			String[] row = new String[mySeri.getNodeId().length];
			for(int x = 0; x<mySeri.getNodeId().length; x++) {
				if(x==0) {
					row[x] = "" + mySeri.getNodeId()[y];
				}
				if(checkConnect(x,y) || checkConnect(y,x))
					row[x] = "" + 1;
				else
					row[x] = "" + 0;
			}
			matrix.add(row.clone());
		}
		
		tableViewer.setInput(matrix);
	}

	private boolean checkConnect(int x, int y) {
		for(int c = 0; c<mySeri.getConId().length; c++) {
			if(mySeri.getConNode1()[c] == mySeri.getNodeId()[x]) {
				if(mySeri.getConNode2()[c] == mySeri.getNodeId()[y]) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void setFocus() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getSourceCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

}
