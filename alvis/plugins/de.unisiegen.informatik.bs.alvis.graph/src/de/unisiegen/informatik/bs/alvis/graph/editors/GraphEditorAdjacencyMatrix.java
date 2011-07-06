package de.unisiegen.informatik.bs.alvis.graph.editors;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StyledText;
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

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		myInput = input;

		if (myInput instanceof FileEditorInput) {
			FileEditorInput fileInput = (FileEditorInput) myInput;
			myInputFilePath = fileInput.getPath().toString();
			AlvisSerialize seri = (AlvisSerialize) GraphEditor
					.deserialize(myInputFilePath);
			if (seri != null) {
				mySeri = seri;
			}
		}
	}

	@Override
	public boolean isDirty() {
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}

	private Composite myParent;
	private static int y;

	String[] titleLine;
	ArrayList<String[]> matrix;
	
	public void createPartControl(Composite parent) {
		myParent = parent;
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));

		// new TableViewer
		TableViewer tableViewer = new TableViewer(myParent, SWT.BORDER
				| SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		// Settings
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		// ArrayContentProvider can be used, because matrix is a java collection
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());

		// The width of the colums
		int columWidth = 25;

		// Array of TableViewerColumn's
		TableViewerColumn[] tableViewerColumns = new TableViewerColumn[mySeri
				.getNodeId().length+1];
		// Array of TableColumn's
		TableColumn[] tblclmns = new TableColumn[mySeri.getNodeId().length+1];
		// ArrayList of String Array's for the Input
		matrix = new ArrayList<String[]>();
		
		titleLine = new String[mySeri.getNodeId().length+1];
		
		// Iterate over all Nodes
		for (y = 0; y < mySeri.getNodeId().length; y++) {
			String title = "";
			if(y == 0) {
				tableViewerColumns[y] = new TableViewerColumn(tableViewer, SWT.NONE);
				tblclmns[y] = tableViewerColumns[y].getColumn();
				tblclmns[y].setWidth(columWidth);
				tblclmns[y].setText("#");
				titleLine[y] = "#";
				tblclmns[y].setAlignment(SWT.CENTER);
				tableViewerColumns[y].setLabelProvider(new DynamicCellLabelProvider(y));
			}
			// Create a TableColumn
			tableViewerColumns[y+1] = new TableViewerColumn(tableViewer, SWT.NONE);
			tblclmns[y+1] = tableViewerColumns[y+1].getColumn();
			tblclmns[y+1].setWidth(columWidth);
			tblclmns[y+1].setText("" + mySeri.getNodeId()[y]);
			titleLine[y+1] = "" + mySeri.getNodeId()[y];
			tblclmns[y+1].setAlignment(SWT.CENTER);
			tableViewerColumns[y+1].setLabelProvider(new DynamicCellLabelProvider(y+1));

			// Add Input for each row
			String[] row = new String[mySeri.getNodeId().length+1];
			for (int x = 0; x < mySeri.getNodeId().length; x++) {
				if (x == 0) {
					row[x] = "" + mySeri.getNodeId()[y];
				}
				if (checkConnect(x, y) || checkConnect(y, x))
					row[x+1] = "" + 1;
				else
					row[x+1] = "" + 0;
			}
			matrix.add(row.clone());
		}

//		System.out.println(matrix);
//		
		tableViewer.setInput(matrix);
	}

	private boolean checkConnect(int x, int y) {
		for (int c = 0; c < mySeri.getConId().length; c++) {
			if (mySeri.getConNode1()[c] == mySeri.getNodeId()[x]) {
				if (mySeri.getConNode2()[c] == mySeri.getNodeId()[y]) {
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
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRun() {
		return false;
	}

	@Override
	public StyledText getSourceCode() {
		for(String tit : titleLine) {
			System.out.print(tit + ";");
		}
		System.out.println();
		for(String[] zeile : matrix) {
			for(String tit : zeile) {
				System.out.print(tit + ";");
			}
			System.out.println();
		}
		return null;
	}

}
