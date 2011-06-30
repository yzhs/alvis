/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.views;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.util.ArrayList;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.LineStyleEvent;
import org.eclipse.swt.custom.LineStyleListener;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

import de.uni_siegen.informatik.bs.alvic.TLexer;
import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.tools.IO;

/**
 * @author simon
 * 
 */
public class RunAlgorithm extends ViewPart implements PropertyChangeListener {

	public static final String ID = "de.unisiegen.informatik.bs.alvis.views.run.algorithm";
	public static StyledText text;
	public static AlgorithmContainer myAlgorithm;

	/**
	 * 
	 */
	public RunAlgorithm() {
		myAlgorithm = new AlgorithmContainer();
	}

	@Override
	public void createPartControl(Composite parent) {
		RowLayout rowLayout = new RowLayout();
		rowLayout.type = SWT.VERTICAL;
		parent.setLayout(new GridLayout(1, false));

		text = new StyledText(parent, SWT.MULTI | SWT.BORDER | SWT.WRAP
				| SWT.V_SCROLL);
		text.setEditable(false);
		text.setFont(new Font(null, "Courier New", 12, SWT.NORMAL));
		text.setBackground(new Color(null, 255, 255, 255));

		GridData gridData = new GridData();
		gridData.horizontalAlignment = SWT.FILL;
		gridData.verticalAlignment = SWT.FILL;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		text.setLayoutData(gridData);

		initText();

		// Content Assist
		text.addVerifyListener(new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent event) {

				// Only expand when text is inserted.
				if (event.end - event.start == 0) {
					for (String[] assistToken : myAlgorithm.getAssistTokens()) {
						if (event.text.equals(assistToken[0].toString())) {
							if (event.text.equals("{")) {
								text.insert(assistToken[1]);
								text.insert("\t");
								text.insert("\n");
							} else
								text.insert(assistToken[1]);
							break;
						}
					}
				}
			}
		});

		/*
		 * This highlights all words that are in the highlightlist in the
		 * algorithm class
		 */
		text.addLineStyleListener(new LineStyleListener() {
			@Override
			public void lineGetStyle(LineStyleEvent event) {
				ArrayList<StyleRange> styles = new ArrayList<StyleRange>();
				for (String regex : myAlgorithm.getHighlightTokens()) {
					int start = 0;
					while (start >= 0) {
						boolean highlight = true;
						// get the position of the regular expression
						start = event.lineText.indexOf(regex, start);
						// if regEx exists
						if (start >= 0) {
							int posOfPrevChar = start - 1;
							int posOfNextChar = start + regex.length();

							if (posOfPrevChar > 0) {
								char prevChar = event.lineText
										.charAt(posOfPrevChar);
								// is a Letter?
								if ((65 <= prevChar && prevChar <= 90)
										|| (97 <= prevChar && prevChar <= 122)) {
									highlight = false;
								}
							}

							if (highlight
									&& posOfNextChar < event.lineText.length()) {
								char nextChar = event.lineText
										.charAt(posOfNextChar);
								// is a Letter?
								if ((65 <= nextChar && nextChar <= 90)
										|| (97 <= nextChar && nextChar <= 122)) {
									highlight = false;
								}
							}

							if (highlight) {
								StyleRange style = new StyleRange(
										event.lineOffset + start, regex
												.length(), new Color(null, 171,
												0, 85), null);
								style.fontStyle = SWT.BOLD;
								styles.add(style);
							}

							// do an increment
							start += regex.length();
						}
					}
				}
				event.styles = styles.toArray(new StyleRange[0]);
			}
		});

	}

	/**
	 * Initials a dummy algorithm
	 */
	private void initText() {
		// Set the initial algorithm
		String algorithm = "" + //$NON-NLS-1$
				"BFS(Graph G, Vertex s) begin\n" + //$NON-NLS-1$
				"\tfor Vertex v in G.vertices begin\n" + //$NON-NLS-1$
				"\t\tv.color = \"white\",\n" + //$NON-NLS-1$
				"\t\tv.distance = infty,\n" + //$NON-NLS-1$
				"\t\tv.pi = null,\n" + //$NON-NLS-1$
				"\tend\n" + //$NON-NLS-1$
				"\ts.color = \"grey\";\n" + //$NON-NLS-1$
				"\ts.distance = 0,\n" + //$NON-NLS-1$
				"\tQueue Q,\n" + //$NON-NLS-1$
				"\tQ.enqueue(s),\n" + //$NON-NLS-1$
				"\twhile ! Q.isEmpty() begin\n" + //$NON-NLS-1$
				"\t\tu = Q.dequeue(),\n" + //$NON-NLS-1$
				"\t\tfor Vertex v in u.adj() begin\n" + //$NON-NLS-1$
				"\t\t\tif v.color == \"white\" begin\n" + //$NON-NLS-1$
				"\t\t\t\tv.color = \"grey\";\n" + //$NON-NLS-1$
				"\t\t\t\tv.distance = u.distance + 1,\n" + //$NON-NLS-1$
				"\t\t\t\tv.pi = u,\n" + //$NON-NLS-1$
				"\t\t\t\tQ.enqueue(v),\n" + //$NON-NLS-1$
				"\t\t\tend\n" + //$NON-NLS-1$
				"\t\tend\n" + //$NON-NLS-1$
				"\tend\n" + //$NON-NLS-1$
				"end\n"; //$NON-NLS-1$

		text.setText(algorithm);

		try {
			byte[] bytesFromAlgoFile = IO.read(IO.pathToAlvisWorkspace()
					+ Activator.getDefault().getActiveRun().getAlgorithmFile());
			String textFromALgoFile = IO.byteToString(bytesFromAlgoFile);
			text.setText(textFromALgoFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// updateText(algorithm);
		Activator.getDefault().getAlgorithmContainer()
				.addPropertyChangeListener(this);
		text.redraw();
	}

	/**
	 * Update the StyledText Syntax Highlighting Autocompletion
	 * 
	 * @param algorithm
	 */
	private void updateText(String algorithm) {
		CharStream cs = new ANTLRStringStream(algorithm);
		TLexer lexer = new TLexer(cs);
		ArrayList<Token> keywords = lexer.getKeywords();

		/*
		 * Begin Highlight
		 */
		ArrayList<String> highlightToken = new ArrayList<String>();
		for (Token token : keywords) {
			if (!highlightToken.contains(token.getText())) {
				highlightToken.add(token.getText());
			}
		}
		myAlgorithm.setHighlightTokens(highlightToken);
		// End Highlight

		/*
		 * Begin errorlinehighlight
		 */
		myAlgorithm.setErrorLines((ArrayList<RecognitionException>) lexer
				.getExceptions());
		// End errorlinehighlight
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void propertyChange(final PropertyChangeEvent event) {
		final Color orange = new Color(null, 204, 217, 232);
		try {
			if (event.getPropertyName().equals("ADD_LINE"))
				text.getDisplay().syncExec(new Runnable() {
					public void run() {
						text.setLineBackground((Integer) event.getNewValue(),
								1, orange);
					}
				});

			if (event.getPropertyName().equals("REMOVE_LINE"))
				text.getDisplay().syncExec(new Runnable() {
					public void run() {
						text.setLineBackground((Integer) event.getOldValue(),
								1, null);
					}
				});

			if (event.getPropertyName().equals("REMOVE_LINE_ALL")) {
				text.getDisplay().syncExec(new Runnable() {
					public void run() {
						for (int i = 0; i < text.getLineCount(); i++)
							text.setLineBackground(i, 1, null);
					}
				});

			}
		} catch (IllegalArgumentException e) {
			// The line to highlight did not exist.
			// We do not do anything
		}
		// System.out.println(event.getPropertyName());
		// System.out.println(event.getNewValue());
		// System.out.println(event.getOldValue());
	}

}
