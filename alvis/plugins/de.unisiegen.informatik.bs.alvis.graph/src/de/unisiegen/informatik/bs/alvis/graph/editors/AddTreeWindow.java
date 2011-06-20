package de.unisiegen.informatik.bs.alvis.graph.editors;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class AddTreeWindow extends TitleAreaDialog {

	private Text tDepth, tWidth;
	private Label lDepth, lWidth;
	private Combo cAutoFill;
	private Group choose;
	private GridData gd;

	protected AddTreeWindow(Shell parentShell) {
		super(parentShell);

	}

	@Override
	protected Control createDialogArea(Composite parentShell) {

		gd = new GridData();
		gd.horizontalAlignment = SWT.FILL;
		gd.grabExcessHorizontalSpace = true;

		Composite composite = (Composite) super.createDialogArea(parentShell);
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(gd);

		cAutoFill = new Combo(composite, SWT.READ_ONLY);
		cAutoFill.add(Messages.getLabel("makeTree"));
		cAutoFill.add(Messages.getLabel("makeCircle"));
		cAutoFill.select(0);
		
		choose = new Group(composite, SWT.NONE);
		choose.setLayout(new GridLayout(2, false));
		choose.setLayoutData(gd);

		setTitle(Messages.getLabel("autoFill"));
		setMessage(Messages.getLabel("pleaseAutoFill") + ":", SWT.ERROR);

		lDepth = new Label(choose, SWT.NONE);
		lDepth.setText(Messages.getLabel("button_depth"));
		tDepth = new Text(choose, SWT.NONE);
		tDepth.setText("4");

		lWidth = new Label(choose, SWT.NONE);
		lWidth.setText(Messages.getLabel("button_width"));
		tWidth = new Text(choose, SWT.NONE);
		tWidth.setText("2");

		cAutoFill.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				int treeOrCircle = cAutoFill.getSelectionIndex();
				switch (treeOrCircle) {
				case 0: // tree
					lDepth.setText(Messages.getLabel("button_depth"));
					tDepth.setText("4");

					lWidth.setText(Messages.getLabel("button_width"));
					tWidth.setEnabled(true);
					tWidth.setText("2");
					break;
				case 1: // circle
					lDepth.setText(Messages.getLabel("circleAmount"));
					tDepth.setText("10");

					lWidth.setText("");
					lWidth.setSize(0, 0);
					tWidth.setText("");
					tWidth.setSize(0, 0);
					tWidth.setEnabled(false);
					break;
				}
				choose.pack();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

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

	@Override
	protected void okPressed() {
		concatReturnCode();
		close();
	}

	/**
	 * parses text field to integers and concats them to one int, because window
	 * only returns one int
	 */
	private void concatReturnCode() {

		int width = 0, depth = 0, result;
		if (tWidth.isEnabled()) { // tree
			try {
				width = Integer.parseInt(tWidth.getText());
				if (width < 1 || width > 4)
					width = 4;
			} catch (NumberFormatException nfe) {
				width = 4;
			}
			try {
				depth = Integer.parseInt(tDepth.getText());
				if (depth < 1)
					depth = 5;
				else if (depth > 8)
					depth = 8;
			} catch (NumberFormatException nfe) {
				width = 5;
			}
		} else { // circle
			width = 0;// circle has no width
			try {
				depth = Integer.parseInt(tDepth.getText());
				if (depth < 1)
					depth = 16;
				else if (depth > 200)
					depth = 200;
			} catch (NumberFormatException nfe) {
				depth = 16;
			}
		}

		result = depth + (width * 65536/* (2^16) */);
		setReturnCode(result);

	}

	@Override
	protected void cancelPressed() {
		setReturnCode(-1);
		close();
	}

}