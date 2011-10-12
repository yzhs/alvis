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
package de.unisiegen.informatik.bs.alvis.export;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import de.unisiegen.informatik.bs.alvis.editors.Messages;

/**
 * class for creating a shell for selecting which content a run will export
 * 
 * @author Frank Weiler
 */
public class ExportShell extends Shell {

	private final ArrayList<Button> checkButtons;
	private ArrayList<Image> images;
	private ArrayList<Integer> sourceCodeLines;
	private ArrayList<StyledText> sourceCodes;
	private final Color grey, blue;
	private Button bCheckAll, bCheckRange;
	private Text edit;

	@Override
	protected void checkSubclass() {
		// important, without this (empty) method subclassing is not allowed
	}

	/**
	 * constructor, creates shell for selecting export content for alvis run
	 * 
	 * @param display
	 *            the display to display the shell on
	 * @param imgs
	 *            the images of the example of the run
	 * @param sourceCodeParts
	 *            the source code parts which cause the change in the example,
	 *            each source code part must belong to the according image, i.e.
	 *            sourceCodeParts.get(i) fits to imgs.get(i)
	 * @param sourceCodeLineIndices
	 *            the source code line numbers which cause the change in the
	 *            example, each source code line number must belong to the
	 *            according image, i.e. sourceCodeLineIndices.get(i) fits to
	 *            imgs.get(i)
	 */
	@SuppressWarnings("unchecked")
	public ExportShell(Display display, ArrayList<Image> imgs,
			ArrayList<StyledText> sourceCodeParts,
			ArrayList<Integer> sourceCodeLineIndices) {

		super(display);

		int maxPreviewWidth = 200;
		int maxPreviewHeight = (maxPreviewWidth * 7) / 10;

		images = (ArrayList<Image>) imgs.clone();
		sourceCodeLines = (ArrayList<Integer>) sourceCodeLineIndices.clone();
		sourceCodes = (ArrayList<StyledText>) sourceCodeParts.clone();
		checkButtons = new ArrayList<Button>();

		grey = new Color(null, new RGB(240, 240, 240));
		blue = new Color(null, new RGB(96, 96, 255));

		this.setLayout(new GridLayout(1, false));
		this.setText(Messages.exportShellTag);

		// info texts:
		Composite info = new Composite(this, SWT.NONE);
		info.setLayout(new FillLayout());
		Label infoText = new Label(info, SWT.NONE);
		infoText.setFont(new Font(null, "calibri", 14, SWT.BOLD));
		infoText.setText(Messages.exportShellChooseImages + ":");

		// images in scrolled composite:
		Composite scrollContainer = new Composite(this, SWT.BORDER);
		FillLayout filly = new FillLayout(SWT.VERTICAL);
		scrollContainer.setLayout(filly);
		scrollContainer.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true,
				true));

		ScrolledComposite scroll = new ScrolledComposite(scrollContainer,
				SWT.V_SCROLL);
		scroll.setLayout(new GridLayout(1, true));

		Composite imageContainer = new Composite(scroll, SWT.NONE);
		imageContainer.setLayout(new GridLayout(5, true));
		scroll.setContent(imageContainer);

		for (int i = 0; i < images.size(); i++) {

			Composite imgFrame = new Composite(imageContainer, SWT.BORDER);
			imgFrame.setLayout(new GridLayout(1, false));
			imgFrame.setBackground(grey);

			// resizing image and adding to composite
			Label label = new Label(imgFrame, SWT.NONE);
			int width = images.get(i).getBounds().width;
			int height = images.get(i).getBounds().height;
			int newWidth = maxPreviewWidth;
			int newHeight = (newWidth * height) / width;
			if (newHeight > maxPreviewHeight) {
				newHeight = maxPreviewHeight;
				newWidth = (newHeight * width) / height;
			}
			Image myImage = new Image(images.get(i).getDevice(), newWidth,
					newHeight);
			GC gc = new GC(myImage);
			gc.drawImage(images.get(i), 0, 0, width, height, 0, 0, newWidth,
					newHeight);
			label.setImage(myImage);
			label.setSize(myImage.getBounds().width, myImage.getBounds().height);

			gc.dispose();

			Button check = new Button(imgFrame, SWT.CHECK);
			String text = (i == 0) ? Messages.exportShellStart
					: Messages.exportShellStep + " " + i;
			check.setText(text);
			checkButtons.add(check);

			imgFrame.addMouseListener(new MouseListener() {
				@Override
				public void mouseUp(MouseEvent e) {
					Composite c = (Composite) (e.getSource());
					Button check = (Button) c.getChildren()[1];
					switchImageSelection(check, !check.getSelection());
				}

				@Override
				public void mouseDown(MouseEvent e) {
				}

				@Override
				public void mouseDoubleClick(MouseEvent e) {
				}
			});

			label.addMouseListener(new MouseListener() {
				@Override
				public void mouseUp(MouseEvent e) {
					Label caller = (Label) (e.getSource());
					Composite c = caller.getParent();
					Button check = (Button) c.getChildren()[1];
					switchImageSelection(check, !check.getSelection());
				}

				@Override
				public void mouseDown(MouseEvent e) {
				}

				@Override
				public void mouseDoubleClick(MouseEvent e) {
				}
			});

			check.addSelectionListener(new SelectionListener() {

				@Override
				public void widgetSelected(SelectionEvent e) {
					Button check = (Button) e.getSource();
					switchImageSelection(check, check.getSelection());
				}

				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
				}
			});
		}

		imageContainer.pack();

		// button and options:
		Group optionGroup = new Group(this, SWT.NONE);
		GridLayout griddy = new GridLayout(3, false);
		optionGroup.setLayout(griddy);

		bCheckAll = new Button(optionGroup, SWT.TOGGLE);
		bCheckAll.setText(Messages.exportShellSelectAll);
		bCheckAll.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Boolean isSelected = ((Button) e.getSource()).getSelection();
				for (Button check : checkButtons) {
					switchImageSelection(check, isSelected);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		bCheckRange = new Button(optionGroup, SWT.TOGGLE);
		bCheckRange.setText(Messages.exportShellSelectRange + ":");

		edit = new Text(optionGroup, SWT.SINGLE | SWT.BORDER);
		edit.setSize(100, 16);
		edit.setText(" 1 - 3 , 4                     ");

		bCheckRange.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ArrayList<Integer> indices = computeTextField();
				for (int i = 0; i < checkButtons.size(); i++) {
					if (indices.contains(i)) {
						switchImageSelection(checkButtons.get(i), true);
					} else {
						switchImageSelection(checkButtons.get(i), false);
					}
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		Button bOk = new Button(this, SWT.PUSH);
		bOk.setText(Messages.exportShellOk);
		bOk.addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				for (int i = checkButtons.size() - 1; i >= 0; i--) {
					if (!checkButtons.get(i).getSelection()) {
						images.remove(i);
						sourceCodeLines.remove(i);
						sourceCodes.remove(i);
					}
				}
				dispose();
			}

			@Override
			public void mouseDown(MouseEvent e) {
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});

		// Button bCancel = new Button(optionGroup, SWT.PUSH);
		// bCancel.setText(Messages.exportShellCancel);
		// bCancel.setSize(100, 20);
		// bCancel.addMouseListener(new MouseListener() {
		// @Override
		// public void mouseUp(MouseEvent e) {
		// images.clear();
		// sourceCode.clear();
		// dispose();
		// }
		//
		// @Override
		// public void mouseDown(MouseEvent e) {
		// }
		//
		// @Override
		// public void mouseDoubleClick(MouseEvent e) {
		// }
		// });

		this.pack();
		this.setSize(this.getSize().x, 600);
		this.open();
		while (!this.isDisposed()) {
			if (!this.getDisplay().readAndDispatch())
				this.getDisplay().sleep();
		}

	}

	/**
	 * interprets text field "edit"
	 * 
	 * @return array list with indices of images to be selected
	 */
	protected ArrayList<Integer> computeTextField() {
		ArrayList<Integer> result = new ArrayList<Integer>();

		String textToEdit = edit.getText();
		textToEdit = textToEdit.replace(";", ",");
		textToEdit = textToEdit.replace("+", ",");
		textToEdit = textToEdit.replace(Messages.exportShellStart, "0");
		textToEdit = textToEdit.replace(Messages.exportShellStep, "");
		String[] chars = textToEdit.split("");
		textToEdit = "";
		for (String c : chars) {
			if (!c.equals("0") && !c.equals("1") && !c.equals("2")
					&& !c.equals("3") && !c.equals("4") && !c.equals("5")
					&& !c.equals("6") && !c.equals("7") && !c.equals("8")
					&& !c.equals("9") && !c.equals(" ") && !c.equals(",")
					&& !c.equals("-")) {
				c = "";
			}
			textToEdit += c;
		}
		edit.setText(textToEdit);

		String[] parts = textToEdit.split(",");
		for (String subPart : parts) {
			try {
				subPart = subPart.replace(" ", "");
				String[] subSubParts = subPart.split("-");
				if (subSubParts.length == 1) { // without "-"
					int index = Integer.parseInt(subSubParts[0]);
					if (index >= 0) {
						if (!result.contains(index)
								&& checkButtons.size() > index) {
							result.add(index);
						}
					}
				} else if (subSubParts.length == 2) { // with "-"
					int from = Integer.parseInt(subSubParts[0]);
					int to = Integer.parseInt(subSubParts[1]);
					if (from > to) {
						int tmp = from;
						from = to;
						to = tmp;
					}

					if (from >= 0 && from != to) {
						for (int index = from; index <= to; index++) {
							if (!result.contains(index)
									&& checkButtons.size() > index) {
								result.add(index);
							}
						}
					}
				}
			} catch (NumberFormatException nfe) {
			}
		}

		return result;
	}

	/**
	 * switches selection and surrounding background color of given check box
	 * 
	 * @param check
	 *            check box to switch
	 * @param selectIt
	 *            whether to select or deselect the check box
	 */
	protected void switchImageSelection(Button check, boolean selectIt) {

		Composite c = check.getParent();
		check.setSelection(selectIt);
		if (selectIt) {
			c.setBackground(blue);
			check.setBackground(blue);
		} else {
			bCheckAll.setSelection(false);
			bCheckRange.setSelection(false);
			c.setBackground(grey);
			check.setBackground(grey);
		}
	}

	/**
	 * @return array list of images which shall be exported
	 */
	public ArrayList<Image> getWantedImages() {
		return images;
	}

	/**
	 * @return array list of line indices according to getWantedImages() which
	 *         shall be exported
	 */
	public ArrayList<Integer> getWantedSourceCodeLineIndices() {
		return sourceCodeLines;
	}

	/**
	 * @return array list of source code parts according to getWantedImages()
	 *         which shall be exported
	 */
	public ArrayList<StyledText> getWantedSourceCodeParts() {
		return sourceCodes;
	}

	// TODO remove main method
	public static void main(String args[]) {

		Display d = new Display();
		Image img;
		GC gc = new GC(d);
		img = new Image(Display.getCurrent(), 200, 200);
		gc.copyArea(img, 0, 0);
		gc.dispose();

		ArrayList<Image> imgs = new ArrayList<Image>();
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		imgs.add(img);
		ArrayList<Integer> indices = new ArrayList<Integer>();
		indices.add(1);
		ArrayList<StyledText> code = new ArrayList<StyledText>();
		code.add(null);
		new ExportShell(d, imgs, code, indices);
	}
}
