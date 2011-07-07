package de.unisiegen.informatik.bs.alvis.io.dialogs;

import java.util.ArrayList;
import java.util.List;

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

public class CheckDialog extends TitleAreaDialog {

	/**
	 * Please use the OrderDialog(Shell parentShell, ArrayList<Object> toOrder)
	 * constructor.
	 * 
	 * @param parentShell
	 */
	protected CheckDialog(Shell parentShell) {
		super(parentShell);

	}

	private List mySource;
	private List myDrain;
	private int myLimit;
	private String myWindowTitle;
	private String myTitle;
	private String myMessage;
	private AskMeAgain myAsk;

	/**
	 * Shows an CheckDialog that offers the user to choose as much Objects as
	 * limit is. The Objects are given in an ArrayList source and the chosen
	 * Objects are returned in the ArrayList drain. Drain is sort by
	 * FirstInLastOut.
	 * 
	 * @param parentShell
	 * @param source
	 * @param drain
	 * @param limit
	 *            - how much items can be chosen, -1 is unlimited.
	 * @param windowTitle
	 * @param messageTitle
	 * @param message
	 * @wbp.parser.constructor
	 */
	public CheckDialog(Shell parentShell, List source, List drain,
			AskMeAgain ask, int limit, String windowTitle, String messageTitle,
			String message) {
		super(parentShell);
		mySource = source;
		myDrain = drain;
		myLimit = limit;
		myWindowTitle = windowTitle;
		myTitle = messageTitle;
		myMessage = message;
		myAsk = ask;
	}

	private Tree tree;
	private ArrayList<TreeItem> treeItems;

	protected Control createDialogArea(Composite parent) {
		setReturnCode(SWT.OK);
		final Composite composite = (Composite) super.createDialogArea(parent);
		setTitle(myTitle);
		setMessage(myMessage, SWT.ERROR);
		if (mySource == null) {
			// TODO thorw nullpointer exception
			return composite;
		}
		composite.setLayout(new GridLayout(1, false));

		// Create the Tree
		tree = new Tree(composite, SWT.CHECK | SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tree.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				TreeItem item = (TreeItem) event.item;
				if (event.detail == SWT.NONE /* SELECTED? */)
					item.setChecked(!item.getChecked());

				// check if there is a limit
				if (myLimit == -1) {
					if (item.getChecked()) {
						if (myDrain.contains(item.getData()))
							myDrain.remove(item.getData());
						myDrain.add(0, item.getData());
					} else {
						myDrain.remove(item.getData());
					}
				} else { // there is a limit
					if (item.getChecked()) {
						if (myDrain.contains(item.getData()))
							myDrain.remove(item.getData());
						myDrain.add(0, item.getData());
					} else {
						myDrain.remove(item.getData());
					}
					try { // to deleted the last allowed item from drain and
							// uncheck it.
						for (TreeItem treeItem : treeItems) {
							if (myDrain.get(myLimit).equals(treeItem.getData()))
								treeItem.setChecked(false);
						}
						myDrain.remove(myLimit);
					} catch (IndexOutOfBoundsException e) {
						// Do nothing because there is still space in myDrain
					}
				}
			}
		});

		Button btnDoNotAsk = new Button(composite, SWT.CHECK);
		btnDoNotAsk
				.setToolTipText("Hit this box and for this run Alvis will not bug you anymore with this window.");
		btnDoNotAsk.setLayoutData(new GridData(SWT.RIGHT, SWT.BOTTOM, false,
				false, 1, 1));
		btnDoNotAsk.setSelection(!myAsk.getAsk());
		btnDoNotAsk.addListener(SWT.Selection, new Listener() {

			public void handleEvent(Event event) {
				// TODO
				myAsk.setAsk(!myAsk.getAsk());
			}

		});
		btnDoNotAsk.setText("Do not ask me again.");

		treeItems = new ArrayList<TreeItem>();
		// Create the TreeItems
		for (Object orderobj : mySource) {
			TreeItem item = new TreeItem(tree, SWT.NONE);
			treeItems.add(item);
			item.setData(orderobj);
			item.setText(orderobj.toString());
		}

		return composite;
	}

	@Override
	protected Point getInitialSize() {
		int height = 250;
		if (mySource != null) {
			for (Object o : mySource) {
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