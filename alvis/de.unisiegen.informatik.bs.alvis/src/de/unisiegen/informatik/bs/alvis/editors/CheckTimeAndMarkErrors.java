/*
 * Copyright (c) 2011 Eduard Boos
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
package de.unisiegen.informatik.bs.alvis.editors;

import de.unisiegen.informatik.bs.alvis.io.logger.Logger;

/**
 * This class should be started as a Thread to check the time when the last
 * keystroke happened and compile + markErrors if this time was longer than
 * 499ms. This will be the case when no keystroke happened the last 500ms.
 * 
 * 
 * @author Eduard Boos
 * 
 */
public class CheckTimeAndMarkErrors implements Runnable {

	private AlgorithmEditor editor;
	private String code;

	/**
	 * Create a new CheckTimeAndMarkErrors, editor is the Editor to check the
	 * last keystroke and code the current content.
	 * 
	 * @param editor
	 *            the AlgorithmEditor to check and markErrors.
	 * @param code
	 *            String the current content of the editor.
	 */
	public CheckTimeAndMarkErrors(AlgorithmEditor editor, String code) {
		this.editor = editor;
		this.code = code;
	}

	public void run() {
		editor.lastKeyStroke = System.currentTimeMillis();
		synchronized (this) {
			try {
				wait(500);
			} catch (InterruptedException e) {
				Logger.getInstance().log("AlgorithmEditorCompletionsProcessor->CheckTimeAndMarkErrors", Logger.ERROR, "CheckTimeAndMarkErrors thread was interrupted."); //$NON-NLS-1$ //$NON-NLS-2$
			}
			if ((System.currentTimeMillis() - editor.lastKeyStroke) > 499) {
				if (editor.isCompilationNeeded(code)) {
					editor.compileCode(code);
					editor.markErrors();
				}
			}
		}
	}

}
