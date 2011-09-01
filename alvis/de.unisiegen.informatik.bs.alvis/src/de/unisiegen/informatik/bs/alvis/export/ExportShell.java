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
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import de.unisiegen.informatik.bs.alvis.editors.Messages;

/**
 * class for creating a shell for selecting which content a run will export
 * 
 * @author Frank Weiler
 */
public class ExportShell extends Shell {

	private Button bOk, bCancel;
	private ArrayList<Button> checkButtons;
	private Composite composite;
	private ArrayList<Image> images;

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
	 */
	@SuppressWarnings("unchecked")
	public ExportShell(Display display, ArrayList<Image> imgs) {

		super(display);

		int maxPreviewWidth = 200;
		int maxPreviewHeight = (maxPreviewWidth * 7) / 10;

		images = (ArrayList<Image>) imgs.clone();
		checkButtons = new ArrayList<Button>();

		setLayout(new RowLayout());
		setText(Messages.getLabel("exportShellTag"));

		Canvas composite = new Canvas(this, SWT.NONE);
		composite.setLayout(new GridLayout(1, false));

		Composite imageContainer = new Composite(composite, SWT.BORDER);
		imageContainer.setLayout(new GridLayout(10, false));

		for (int i = 0; i < images.size(); i++) {

//			Canvas imgAndRadio = new Canvas(imageContainer, SWT.BORDER);
//			// resizing image and adding to composite
//			Label label = new Label(imgAndRadio, SWT.NONE);
			Label label = new Label(imageContainer, SWT.NONE);
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
//			Button check = new Button(imgAndRadio, SWT.CHECK);
			Button check = new Button(imageContainer, SWT.CHECK);
			check.setText(Messages.getLabel("exportImage") + " " + i);
			checkButtons.add(check);
			gc.dispose();

		}

		Composite buttonContainer = new Composite(composite, SWT.NONE);
		buttonContainer.setLayout(new GridLayout(2, false));

		bOk = new Button(buttonContainer, SWT.PUSH);
		bOk.setText(Messages.getLabel("buttonOk"));
		bOk.setSize(100, 20);
		bCancel = new Button(buttonContainer, SWT.PUSH);
		bCancel.setText(Messages.getLabel("buttonCancel"));
		bCancel.setSize(100, 20);

		bOk.addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				for (int i = checkButtons.size() - 1; i >= 0; i--) {
					System.out.println(checkButtons.get(i).getSelection());//TODO weg
					if (!checkButtons.get(i).getSelection()) {
						images.remove(i);
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
		bCancel.addMouseListener(new MouseListener() {
			@Override
			public void mouseUp(MouseEvent e) {
				images.clear();
				dispose();
			}

			@Override
			public void mouseDown(MouseEvent e) {
			}

			@Override
			public void mouseDoubleClick(MouseEvent e) {
			}
		});

		pack();
		open();
		while (!isDisposed()) {
			if (!getDisplay().readAndDispatch())
				getDisplay().sleep();
		}

		System.out.println(images);

	}

	/**
	 * 
	 * opens shell for selecting export content for alvis run
	 * 
	 * @return array list of images which shall be exported
	 */
	public ArrayList<Image> getWantedImages() {

		return images;

	}
}
