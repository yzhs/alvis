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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;

public class AddTreeWindow extends TitleAreaDialog {

	private Label lDepth, lWidth, lConWidth;
	private Spinner sConWeight, sDepth, sWidth;
	private Combo cAutoFill;
	private Group choose;
	private Group conWeightGroup;
	private Button bExactWidths, bExactWeights;
	private GridData gd;

	private boolean exactWeights, exactWidths;
	private boolean setConnectionWidhts;
	private int depth, width, weight;

	protected AddTreeWindow(Shell parentShell) {
		super(parentShell);

		exactWeights = false;
		exactWidths = false;
		setConnectionWidhts = false;
		depth = 4;
		width = 2;
		weight = -1;
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
		lDepth.setText(Messages.AddTreeWindow_depth);
		sDepth = new Spinner(choose, SWT.NONE);
		sDepth.setMinimum(2);
		sDepth.setSelection(depth);

		lWidth = new Label(choose, SWT.NONE);
		lWidth.setText(Messages.AddTreeWindow_averageWidth);
		sWidth = new Spinner(choose, SWT.NONE);
		sWidth.setMinimum(2);
		sWidth.setSelection(width);

		bExactWidths = new Button(choose, SWT.CHECK);
		bExactWidths.setText(Messages.AddTreeWindow_randomWidths);
		bExactWidths.setSelection(true);

		conWeightGroup = new Group(composite, SWT.NONE);
		conWeightGroup.setLayout(new GridLayout(2, false));

		lConWidth = new Label(conWeightGroup, SWT.NONE);
		lConWidth.setText(Messages.AddTreeWindow_conWidths);
		sConWeight = new Spinner(conWeightGroup, SWT.NONE);
		sConWeight.setMinimum(weight);
		sConWeight.setSelection(weight);

		bExactWeights = new Button(conWeightGroup, SWT.CHECK);
		bExactWeights.setText(Messages.AddTreeWindow_randomWeights);
		bExactWeights.setSelection(true);

		cAutoFill.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {

				int treeOrCircle = cAutoFill.getSelectionIndex();
				switch (treeOrCircle) {
				case 0: // tree
					lDepth.setText(Messages.AddTreeWindow_depth);
					sDepth.setMinimum(2); //$NON-NLS-1$
					sDepth.setSelection(4);

					lWidth.setEnabled(true);
					lWidth.setText(Messages.AddTreeWindow_averageWidth);
					sWidth.setEnabled(true);
					bExactWidths.setEnabled(true);
					break;
				case 1: // circle
					lDepth.setText(Messages.AddTreeWindow_amountOfNodes);
					sDepth.setMinimum(3); //$NON-NLS-1$
					sDepth.setMaximum(300);
					sDepth.setSelection(10);

					//					lWidth.setText(""); //$NON-NLS-1$
					// lWidth.setSize(0, 0);
					// sWidth.setSize(0, 0);
					lWidth.setEnabled(false);
					sWidth.setEnabled(false);
					bExactWidths.setEnabled(false);
					break;
				}
				choose.pack();
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		composite.pack();

		return composite;

	}

	@Override
	protected Point getInitialSize() {
		return new Point(400, 350);
	}

	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText(Messages.AddTreeWindow_NewRandomGraphWizard);
	}

	/**
	 * closes add-tree-window after setting variables for further access in
	 * graph editor
	 */
	@Override
	protected void okPressed() {

		boolean isTree = bExactWidths.getEnabled();
		exactWidths = isTree ? !bExactWidths.getSelection() : false;

		depth = sDepth.getSelection();
		width = isTree ? sWidth.getSelection() : 0;
		weight = sConWeight.getSelection();
		exactWeights = (weight == -1) ? true : !bExactWeights.getSelection();

		setReturnCode(isTree ? 1001 : 1002);

		close();
	}

	@Override
	protected void cancelPressed() {
		setReturnCode(1);
		close();
	}

	public boolean isExactWeights() {
		return exactWeights;
	}

	public boolean isSetConnectionWidhts() {
		return setConnectionWidhts;
	}

	public int getDepth() {
		return depth;
	}

	public int getWidth() {
		return width;
	}

	public int getWeight() {
		return weight;
	}

	public boolean isExactWidths() {
		return exactWidths;
	}

}