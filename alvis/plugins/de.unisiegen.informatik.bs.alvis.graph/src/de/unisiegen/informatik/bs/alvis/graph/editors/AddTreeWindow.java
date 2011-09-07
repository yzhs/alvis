/*
 * Copyright (c) 2011 Frank Weiler
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
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
		cAutoFill.add(Messages.AddTreeWindow_tree);
		cAutoFill.add(Messages.AddTreeWindow_circle);
		cAutoFill.select(0);
		
		choose = new Group(composite, SWT.NONE);
		choose.setLayout(new GridLayout(2, false));
		choose.setLayoutData(gd);

		setTitle(Messages.AddTreeWindow_autoFill);
		setMessage(Messages.AddTreeWindow_chooseOptions + ":", SWT.ERROR); 

		lDepth = new Label(choose, SWT.NONE);
		lDepth.setText(Messages.AddTreeWindow_chooseOptions);
		tDepth = new Text(choose, SWT.NONE);
		tDepth.setText("4"); //$NON-NLS-1$

		lWidth = new Label(choose, SWT.NONE);
		lWidth.setText(Messages.AddTreeWindow_averageWidth);
		tWidth = new Text(choose, SWT.NONE);
		tWidth.setText("2"); //$NON-NLS-1$

		cAutoFill.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				int treeOrCircle = cAutoFill.getSelectionIndex();
				switch (treeOrCircle) {
				case 0: // tree
					lDepth.setText(Messages.AddTreeWindow_depth);
					tDepth.setText("4"); //$NON-NLS-1$

					lWidth.setText(Messages.AddTreeWindow_averageWidth);
					tWidth.setEnabled(true);
					tWidth.setText("2"); //$NON-NLS-1$
					break;
				case 1: // circle
					lDepth.setText(Messages.AddTreeWindow_amountOfNodes);
					tDepth.setText("10"); //$NON-NLS-1$

					lWidth.setText(""); //$NON-NLS-1$
					lWidth.setSize(0, 0);
					tWidth.setText(""); //$NON-NLS-1$
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
		newShell.setText(Messages.AddTreeWindow_NewRandomGraphWizard);
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