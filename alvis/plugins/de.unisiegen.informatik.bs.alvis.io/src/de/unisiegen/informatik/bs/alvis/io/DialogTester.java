package de.unisiegen.informatik.bs.alvis.io;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.io.dialogs.CheckDialog;
import de.unisiegen.informatik.bs.alvis.io.dialogs.OrderDialog;
import de.unisiegen.informatik.bs.alvis.io.dialogs.SettingsDialog;

public class DialogTester {
	public DialogTester() {
	}

	private static Shell parentShell;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = new Display ();
		parentShell = new Shell(display);
		parentShell.setMinimumSize(new Point(400, 300));
		parentShell.setSize(291, 190);
		parentShell.setLayout(new GridLayout(4, false));
		
		parentShell.pack();
		Button openDialogSettings = new Button(parentShell, SWT.NONE);
		openDialogSettings.setText("Settings");
		openDialogSettings.pack();
		openDialogSettings.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				SettingsDialog diaSet = new SettingsDialog(parentShell);
				diaSet.open(); 
			}
		});
		
		Button openDialogOrder = new Button(parentShell, SWT.NONE);
		openDialogOrder.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				ArrayList<Object> toOrder = new ArrayList<Object>();
				for(int i = 0; i<4; i++) {
					toOrder.add(i);
				}
				OrderDialog diaSet2 = new OrderDialog(
						parentShell,
						toOrder,
						"Einstellungen",
						"Festlegen der Reihenfolge",
						"W�hlen Sie eine Reihenfolge f�r die Elemente.\n" +
						"Das oberste Element wird als erstes verarbeitet.");
				diaSet2.open(); 
				for(Object i : toOrder) {
					System.out.println(i.toString());
				}
			}
		});
		openDialogOrder.setText("Order");
		
		Button btnChooseone = new Button(parentShell, SWT.NONE);
		btnChooseone.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				ArrayList<Object> source = new ArrayList<Object>();
				for(int i = 0; i<10; i++) {
					source.add("Knoten " + i);
				}
				ArrayList<Object> drain = new ArrayList<Object>();
				CheckDialog dialog = new CheckDialog(
						parentShell,
						source,
						drain,
						1,
						"Auswahl",
						"Startpunkt",
						"Wählen Sie einen Startpunkt aus");
				dialog.open();
						
				for(Object o : drain) {
					System.out.println(o.toString());
				}
			}
		});
		btnChooseone.setText("ChooseOne");
		
		Button btnChoosemulti = new Button(parentShell, SWT.NONE);
		btnChoosemulti.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ArrayList<Object> source = new ArrayList<Object>();
				for(int i = 0; i<10; i++) {
					source.add("Knoten " + i);
				}
				ArrayList<Object> drain = new ArrayList<Object>();
				CheckDialog dialog = new CheckDialog(
						parentShell,
						source,
						drain,
						3,
						"Auswahl",
						"Besuche",
						"Wählen Sie drei Knoten aus.");
				dialog.open();
						
				for(Object o : drain) {
					System.out.println(o.toString());
				}
			}
		});
		btnChoosemulti.setText("ChooseMulti");
		parentShell.open();
		
		
		
				
//		TitleAreaDialog titleAreaDialog = new TitleAreaDialog(parentShell) {
//
//		    @Override
//		    protected Control createDialogArea(Composite parent) {
//		        LocalResourceManager resources
//		                = new LocalResourceManager(JFaceResources.getResources(), getShell());
//		        
//		        setTitle("Bitte Wählen!");
////		        setErrorMessage("Error message");
//		        setMessage("Wählen Sie bitte einen dieser Knoten als Startknoten.", SWT.ERROR);
////		        ImageDescriptor title = de.unisiegen.informatik.bs.alvis.Activator.getImageDescriptor("/icons/imagetitle.png");
////		        setTitleImage(resources.createImage(title));                    
//		        
//		        Composite composite = (Composite) super.createDialogArea(parent);
//		        Label label = new Label(composite, SWT.NONE);
//		        label.setText("Dialog Area");
//		        return composite;
//		    }
//
//		};
//		titleAreaDialog.open();
		
//		OrderDialog order = new OrderDialog(parentShell);
//		order.open();
		
		while (!parentShell.isDisposed ()) {
			if (!display.readAndDispatch ()) display.sleep ();
		}
		display.dispose();
	}

	
//	Dialog dialog = new Dialog(parentShell) {
//    protected Control createDialogArea(Composite parent) {
//        Composite composite = (Composite) super.createDialogArea(parent);
//        composite.setLayout(new FillLayout(SWT.HORIZONTAL));
//        
////        Group grpExample = new Group(composite, SWT.NONE);
////		grpExample.setText("Example");
////		grpExample.setLayout(new FillLayout(SWT.HORIZONTAL));
//        
//        AlvisGraph graph = new AlvisGraph(composite, SWT.NONE);
//        ArrayList<AlvisGraphNode> tree = new ArrayList<AlvisGraphNode>();
//        tree.add(new AlvisGraphNode(graph, "1", null));
//        tree.add(new AlvisGraphNode(graph, "2", null));
//        tree.add(new AlvisGraphNode(graph, "3", null));
//        graph.addTree(tree);
//        return composite;
//    }
//
//    @Override
//    protected Point getInitialSize() {
//        return new Point(400, 300);
//    }
//
//    @Override
//    protected void configureShell(Shell newShell) {
//        super.configureShell(newShell);
//        newShell.setText("Dialog");
//    }
//};
//if (dialog.open() == Dialog.OK)
//    System.out.println("User clicked ok.");

}
