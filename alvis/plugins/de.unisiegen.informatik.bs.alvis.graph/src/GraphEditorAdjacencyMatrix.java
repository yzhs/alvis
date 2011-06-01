import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;

import de.unisiegen.informatik.bs.alvis.graph.editors.GraphEditor;
import de.unisiegen.informatik.bs.alvis.graph.graphicalrepresentations.AlvisGraph;
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
		System.out.println("INIT");
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

	@Override
	public boolean isDirty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSaveAsAllowed() {
		// TODO Auto-generated method stub
		return false;
	}

	private Composite myParent;
	private static int y;
	public void createPartControl(Composite parent) {
		myParent = parent;
		parent.setLayout(new FillLayout(SWT.HORIZONTAL));
//

//		
//		TableViewer tableViewer = new TableViewer(parent, SWT.BORDER | SWT.FULL_SELECTION);
//		table = tableViewer.getTable();
//		table.setHeaderVisible(true);
//		
//		// ArrayContentProvider kann verwendet werden, da Input-Objekt eine Java Collection ist
//		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
//				
//		/*
//		 * HEADERS
//		 */
//		int columWidth = 20;
//		
//		TableViewerColumn tableViewerColumn_0 = new TableViewerColumn(tableViewer, SWT.NONE);
//		TableColumn tblclmnA = tableViewerColumn_0.getColumn();
//		tblclmnA.setWidth(columWidth);
//		tblclmnA.setText("+");
//		tableViewerColumn_0.setLabelProvider(new CellLabelProvider() {
//			public void update(ViewerCell cell) {
//				cell.setText(((String[])cell.getElement())[0]);
//			}
//		});
//		
//		
//		TableViewerColumn tableViewerColumn_1 = new TableViewerColumn(tableViewer, SWT.NONE);
//		TableColumn tblclmnB = tableViewerColumn_1.getColumn();
//		tblclmnB.setWidth(columWidth);
//		tblclmnB.setText("0");
//		tableViewerColumn_1.setLabelProvider(new CellLabelProvider() {
//			public void update(ViewerCell cell) {
//				cell.setText(((String[])cell.getElement())[1]);
//			}
//		});
//		
//		TableViewerColumn tableViewerColumn_2 = new TableViewerColumn(tableViewer, SWT.NONE);
//		TableColumn tblclmnC = tableViewerColumn_2.getColumn();
//		tblclmnC.setWidth(columWidth);
//		tblclmnC.setText("1");
//		tableViewerColumn_2.setLabelProvider(new CellLabelProvider() {
//			public void update(ViewerCell cell) {
//				cell.setText(((String[])cell.getElement())[2]);
//			}
//		});
//		
//		TableViewerColumn tableViewerColumn_3 = new TableViewerColumn(tableViewer, SWT.NONE);
//		TableColumn tblclmnD = tableViewerColumn_3.getColumn();
//		tblclmnD.setWidth(columWidth);
//		tblclmnD.setText("2");
//		tableViewerColumn_3.setLabelProvider(new CellLabelProvider() {
//			public void update(ViewerCell cell) {
//				cell.setText(((String[])cell.getElement())[3]);
//			}
//		});
//		
//		tableViewer.add(matrix);
		TableViewer tableViewer = new TableViewer(myParent, SWT.BORDER | SWT.FULL_SELECTION);
		table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		
		// ArrayContentProvider kann verwendet werden, da Input-Objekt eine Java Collection ist
		tableViewer.setContentProvider(ArrayContentProvider.getInstance());
		
		ArrayList<String[]> input = new ArrayList<String[]>();
		for(int j = 0; j<4;j++) {
			int i0 = j;
			int i1 = j*4+0;
			int i2 = j*4+1;
			int i3 = j*4+2;
			int i4 = j*4+3;
			String[] tempString = {""+i0,""+i1,""+i2,""+i3,""+i4};
			input.add(tempString);
		}
		
		int columWidth = 20;
		TableViewerColumn[] tableViewerColumns = new TableViewerColumn[mySeri.getNodeId().length];
		TableColumn[] tblclmns = new TableColumn[mySeri.getNodeId().length];
		ArrayList<String[]> matrix = new ArrayList<String[]>();
		final GraphEditorAdjacencyMatrix ptr = this;
		for(y = 0; y<mySeri.getNodeId().length; y++) {
			
			tableViewerColumns[y] = new TableViewerColumn(tableViewer, SWT.NONE);
			tblclmns[y] = tableViewerColumns[y].getColumn();
			tblclmns[y].setWidth(columWidth);
			tblclmns[y].setText("" + mySeri.getNodeId()[y]);
			tableViewerColumns[y].setLabelProvider(new CellLabelProvider() {
				public void update(ViewerCell cell) {
					int runi = 0;
					while(true) {
						if(runi < y-1)
							runi++;
						else
							break;
					}
					System.out.println(runi);
					cell.setText(((String[])cell.getElement())[y-1]);
				}
			});
			
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
