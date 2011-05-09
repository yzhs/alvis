package de.unisiegen.informatik.bs.alvis.views;

import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;

/**
 * @author Eduard Boos
 */

/**
 * An IControlContentAdapter for SWT StyledText controls.
 * are
 */
public class StyledTextContentAdapter extends TextContentAdapter {
	public String getControlContents(Control control) {

		return ((StyledText) control).getText();
	}

	public void setControlContents(Control control, String text,
			int cursorPosition) {
		((StyledText) control).setText(text);
		((StyledText) control).setSelection(cursorPosition, cursorPosition);
	}

	public void insertControlContents(Control control, String text,
			int cursorPosition) {
		StyledText styledText = (StyledText) control;
		Point selection = ((StyledText) control).getSelection();
		int position = selection.x;
		do {
			position--;
		} while (!AutoCompletionProposalProvider.isWhitespace(
				styledText.getText(), position)
				&& position > 0);
		/** whitespace should not be replaced */
		if (position != 0) {
			position++;
		}
		styledText.setSelection(new Point(position, selection.x));
		((StyledText) control).insert(text);
		if (cursorPosition < text.length()) {
			((StyledText) control).setSelection(selection.x + cursorPosition,
					selection.x + cursorPosition);

		}
	}

	public int getCursorPosition(Control control) {
		return ((StyledText) control).getCaretOffset();
	}

	public Rectangle getInsertionBounds(Control control) {
		StyledText text = (StyledText) control;
		Point caretOrigin = text.getCaret().getLocation();

		return new Rectangle(caretOrigin.x + text.getClientArea().x,
				caretOrigin.y + text.getClientArea().y + 3, 1,
				text.getLineHeight());
	}

	public void setCursorPosition(Control control, int position) {
		((StyledText) control).setSelection(new Point(position, position));
	}

	public Point getSelection(Control control) {
		return ((StyledText) control).getSelection();
	}

	public void setSelection(Control control, Point range) {
		((StyledText) control).setSelection(range);
	}
	
}
