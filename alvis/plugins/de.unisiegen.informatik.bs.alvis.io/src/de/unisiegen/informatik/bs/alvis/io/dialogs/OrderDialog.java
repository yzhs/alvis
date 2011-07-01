package de.unisiegen.informatik.bs.alvis.io.dialogs;

import java.util.ArrayList;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class OrderDialog extends TitleAreaDialog {

	/**
	 * Please use the OrderDialog(Shell parentShell, ArrayList<Object> toOrder)
	 * constructor.
	 * 
	 * @param parentShell
	 */
	protected OrderDialog(Shell parentShell) {
		super(parentShell);

	}

	private Shell myParent;
	@SuppressWarnings("rawtypes")
	private ArrayList myOrder;
	private String myWindowTitle;
	private String myTitle;
	private String myMessage;

	/**
	 * Shows an OrderDialog that helps to order an ArrayList. In this Dialog the
	 * elements of the list are shown as its toString method. The user can drag
	 * and drop the items to change the order. The change effects the ArrayList
	 * because of call by reference that after clicking the OK button the
	 * ArrayList has the order that the user choose.
	 * 
	 * Note that all items need to have a different toString value, otherwise
	 * the user and the order algorithm gets trouble.
	 * 
	 * The width of the window is 300px.
	 * The height of the window is from 170px to 600px - the more elements the higher.
	 * 
	 * @param parentShell
	 *            Shell to show
	 * @param toOrder
	 *            Objects that have an useful toString method.
	 * @param windowTitle
	 *            the title of the window
	 * @param title
	 *            title of the message
	 * @param message
	 *            the message
	 * @param layout
	 *            normally SWT.ERROR
	 */
	public OrderDialog(Shell parentShell, ArrayList toOrder,
			String windowTitle, String title, String message) {
		super(parentShell);
		myParent = parentShell;
		myWindowTitle = windowTitle;
		myTitle = title;
		myMessage = message;
		myOrder = toOrder;
	}

	// Label of the moving Item
	private String orderItemText;
	// the position the Item has to go
	private int newPosition;
	// The item itself
	private Object movingListItem;
	private final int UP = -10;
	private final int DOWN = -20;
	private TreeItem clckdTreeItem;
	Tree tree;
	/**
	 * Saves the order that is shown in the window to the ArrayList ,,myOrder''
	 */
	@SuppressWarnings("unchecked")
	private void order() {
		// the Position the item was
		int oldPosition = 0;
		// get the Position and get the movingItem
		for (int i = 0; i < myOrder.size(); i++) {
			if (myOrder.get(i).toString().equals(orderItemText)) {
				oldPosition = i;
				movingListItem = myOrder.get(i);
				// System.out.println("Hatten " + orderItem + " an " +
				// oldPosition);
				break;
			}
		}
		boolean wasUPDOWN = false;
		if(newPosition == UP) {
			newPosition = Math.max(0, oldPosition - 1);
			wasUPDOWN = true;
		}
		if(newPosition == DOWN) {
			newPosition = Math.min(myOrder.size()-1, oldPosition + 1);
			wasUPDOWN = true;
		}
		
		
		// System.out.println("______________FIRST___________");
		// System.out.println("Wollen " + orderItem + " an " + newPosition);
		// Declare a List that contains all Elements that were before the
		// newPosition.
		ArrayList<Object> firstList = new ArrayList<Object>();
		firstList.addAll(myOrder.subList(0, newPosition));
		// for(Object o : firstList) {
		// System.out.println(o.toString());
		// }
		// System.out.println("______________SECOND___________");
		// Declare a List that contains all Elements that were after the
		// newPosition.
		ArrayList<Object> secondList = new ArrayList<Object>();
		secondList.addAll(myOrder.subList(newPosition, myOrder.size()));
		// for(Object o : secondList) {
		// System.out.println(o.toString());
		// }
		// Delete the movingItem out of the two Lists
		if (firstList.contains(movingListItem)) {
			// System.out.println("Das Objekt wurde in der ersten Liste gefunden.");
			firstList.remove(movingListItem);
		}
		if (secondList.contains(movingListItem)) {
			// System.out.println("Das Objekt wurde in der ersten Liste gefunden.");
			secondList.remove(movingListItem);
		}

		if(wasUPDOWN) {
//			clckdItem = null;
			clckdTreeItem.dispose();
			clckdTreeItem = new TreeItem(tree, SWT.NONE, newPosition);
//			clckdTreeItem = newItem;
			clckdTreeItem.setText(orderItemText);
			tree.setSelection(clckdTreeItem);
			orderItemText = clckdTreeItem.getText();
		}
		
		// clear the old List
		myOrder.clear();
		// Add the items from the first list.
		myOrder.addAll(firstList);
		// Add the movingItem
		myOrder.add(movingListItem);
		// Add the items from the second list.
		myOrder.addAll(secondList);

//		printList(myOrder);
		
//		if(wasUPDOWN) {
//			tree.removeAll();
//			// Create the TreeItems
//			for (Object orderobj : myOrder) {
//				TreeItem item = new TreeItem(tree, SWT.NONE);
//				item.setText(orderobj.toString());
//			}
//		}
		

	}

	private void printList(ArrayList<Object> toPrint) {
		for (Object o : toPrint) {
			System.out.println(o.toString());
		}
	}
	
	int clickCount = 0;

	protected Control createDialogArea(Composite parent) {
		final Composite composite = (Composite) super.createDialogArea(parent);
		setTitle(myTitle);
		setMessage(myMessage, SWT.ERROR);
		if (myOrder == null) {
			return composite;
		}
		
		Composite cmpstMenu = new Composite(composite, SWT.NONE);
		cmpstMenu.setLayout(new FillLayout(SWT.HORIZONTAL));
		cmpstMenu.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		
		Button btnUp = new Button(cmpstMenu, SWT.NONE);
		btnUp.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				System.out.println("UP:");
				System.out.println(orderItemText);
				
				if(orderItemText != null) {
					newPosition = -10;
					order();
				}
			}
		});
		btnUp.setText("Up");
		
		Button btnDown = new Button(cmpstMenu, SWT.NONE);
		btnDown.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				System.out.println("DOWN:");
				System.out.println(orderItemText);
				
				if(orderItemText != null) {
					newPosition = -20;
					order();
				}
			}
		});
		btnDown.setText("Down");
		
		Button btnSort = new Button(cmpstMenu, SWT.NONE);
		btnSort.setText("Sort");
		
		Button btnRandom = new Button(cmpstMenu, SWT.NONE);
		btnRandom.setText("Random");


		
		// Create the Tree
		tree = new Tree(composite, SWT.BORDER);
		tree.setLayoutData(new GridData(GridData.FILL_BOTH));
	    tree.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				clckdTreeItem = ((TreeItem)event.item);
				orderItemText = clckdTreeItem.getText();
				System.out.println("clicked: " + orderItemText);
			}
		});
	    
		// Create the TreeItems
		for (Object orderobj : myOrder) {
			TreeItem item = new TreeItem(tree, SWT.NONE);
			item.setText(orderobj.toString());
		}

		Transfer[] types = new Transfer[] { TextTransfer.getInstance() };
		int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK;

		final DragSource source = new DragSource(tree, operations);
		source.setTransfer(types);
		final TreeItem[] dragSourceItem = new TreeItem[1];
		/*
		 * DRAG START
		 */
		source.addDragListener(new DragSourceListener() {
			public void dragStart(DragSourceEvent event) {
				TreeItem[] selection = tree.getSelection();
				if (selection.length > 0 && selection[0].getItemCount() == 0) {
					event.doit = true;
					dragSourceItem[0] = selection[0];
				} else {
					event.doit = false;
				}
			};

			public void dragSetData(DragSourceEvent event) {
				event.data = dragSourceItem[0].getText();
			}

			public void dragFinished(DragSourceEvent event) {
				orderItemText = dragSourceItem[0].getText();
				order();
				if (event.detail == DND.DROP_MOVE) {
					dragSourceItem[0].dispose();
				}
				dragSourceItem[0] = null;
			}
		});

		DropTarget target = new DropTarget(tree, operations);
		target.setTransfer(types);
		target.addDropListener(new DropTargetAdapter() {
			public void dragOver(DropTargetEvent event) {
				event.feedback = DND.FEEDBACK_EXPAND | DND.FEEDBACK_SCROLL;
				if (event.item != null) {
					TreeItem item = (TreeItem) event.item;
					Point pt = composite.getDisplay().map(null, tree, event.x,
							event.y);
					Rectangle bounds = item.getBounds();
					if (pt.y < bounds.y + bounds.height / 3) {
						event.feedback |= DND.FEEDBACK_INSERT_BEFORE;
					} else if (pt.y > bounds.y + 2 * bounds.height / 3) {
						event.feedback |= DND.FEEDBACK_INSERT_AFTER;
					} else {
						event.feedback |= DND.FEEDBACK_INSERT_AFTER; // VORHER
																		// ANDERS
					}
				}
			}

			public void drop(DropTargetEvent event) {
				if (event.data == null) {
					event.detail = DND.DROP_NONE;
					return;
				}

				String text = (String) event.data;
				if (event.item == null) {
					TreeItem item = new TreeItem(tree, SWT.NONE);
					item.setText(text);
				} else {
					TreeItem item = (TreeItem) event.item;
					Point pt = composite.getDisplay().map(null, tree, event.x,
							event.y);
					Rectangle bounds = item.getBounds();
					TreeItem parent = item.getParentItem();
					if (parent != null) {
						TreeItem[] items = parent.getItems();
						int index = 0;
						for (int i = 0; i < items.length; i++) {
							if (items[i] == item) {
								index = i;
								break;
							}
						}
						if (pt.y < bounds.y + bounds.height / 3) {
							TreeItem newItem = new TreeItem(parent, SWT.NONE,
									index);
							newItem.setText(text);
							newPosition = (index);
						} else if (pt.y > bounds.y + 2 * bounds.height / 3) {
							TreeItem newItem = new TreeItem(parent, SWT.NONE,
									index + 1);
							newItem.setText(text);
							newPosition = (index + 1);
						} else {
							// TreeItem newItem = new TreeItem(item, SWT.NONE);
							// // was before
							TreeItem newItem = new TreeItem(parent, SWT.NONE,
									index + 1);
							newItem.setText(text);
							newPosition = (index + 1);
						}

					} else {
						TreeItem[] items = tree.getItems();
						int index = 0;
						for (int i = 0; i < items.length; i++) {
							if (items[i] == item) {
								index = i;
								break;
							}
						}
						if (pt.y < bounds.y + bounds.height / 3) {
							TreeItem newItem = new TreeItem(tree, SWT.NONE,
									index);
							newItem.setText(text);
							newPosition = (index);
						} else if (pt.y > bounds.y + 2 * bounds.height / 3) {
							TreeItem newItem = new TreeItem(tree, SWT.NONE,
									index + 1);
							newItem.setText(text);
							newPosition = (index + 1);
						} else {
							// TreeItem newItem = new TreeItem(item, SWT.NONE);
							// // was before
							TreeItem newItem = new TreeItem(tree, SWT.NONE,
									index + 1);
							newPosition = (index + 1);
							newItem.setText(text);
						}
					}
				}
			}
		});
		return composite;
	}

	@Override
	protected Point getInitialSize() {
		int height = 250;
		if(myOrder != null) {
			for(Object o : myOrder) {
				height += 18;
			}
		}
		
		return new Point(400, Math.min(600, height));
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(myWindowTitle);
	}
}