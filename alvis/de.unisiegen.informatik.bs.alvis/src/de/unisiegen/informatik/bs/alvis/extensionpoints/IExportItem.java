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
package de.unisiegen.informatik.bs.alvis.extensionpoints;

/**
 * @author Frank Weiler
 */
import org.eclipse.swt.graphics.Image;

/**
 * 
 * @author Frank Weiler
 * @description the export object interface. every exportable object (i.e.
 *              text-> source code, images-> graph, etc) needs to be implement
 *              this
 */
public interface IExportItem {

	/**
	 * returns image for export
	 * 
	 * @return image for export, null if object does not contain any image
	 */
	public Image getImage();

	/**
	 * returns styled text for exporting source code
	 * 
	 * @return styled text for exporting source code
	 */

	public Object getSourceCode();

	/**
	 * returns true if export item is a run, which implies a more complex
	 * export, false otherwise
	 * 
	 * @return true if export item is a run, false otherwise
	 */
	public boolean isRun();

}