package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationActor;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCActor;

/**
 * Graphical representation of an actor
 * 
 * @author Jan Bauerdick
 * 
 */
public class AlvisActor implements GraphicalRepresentationActor, Listener {

	/**
	 * Array of labels, showing the actor's source code
	 */
	private Label[] lines;

	/**
	 * Actor's name
	 */
	private String name;

	/**
	 * Actor's current line
	 */
	private int currentLine;

	/**
	 * Button below the source code to do a single step
	 */
	private Button nextStep;

	/**
	 * The represented actor
	 */
	private PCActor a;

	/**
	 * Construct a new graphical representation of an actor
	 * 
	 * @param parent
	 *            Composite where to display graphical representation
	 * @param act
	 *            Actor to show
	 */
	public AlvisActor(Composite parent, PCActor act) {
		FillLayout f = new FillLayout();
		f.type = SWT.VERTICAL;
		Group g = new Group(parent, SWT.CASCADE);
		g.setLayout(f);

		a = act;
		name = act.getName();
		currentLine = 0;

		g.setText(name);

		Font ft = new Font(Display.getDefault(), "Monospaced", 9, SWT.BOLD); //$NON-NLS-1$
		lines = new Label[act.getLines().length];
		for (int i = 0; i < act.getLines().length; i++) {
			lines[i] = new Label(g, SWT.LEFT);
			lines[i].setText(act.getLines()[i]);
			lines[i].setFont(ft);
			lines[i].setBackground(i == 0 ? HIGHLIGHT : NORMAL);
		}
		nextStep = new Button(g, SWT.PUSH);
		nextStep.setText(Messages.AlvisActor_nextStepButton);
		nextStep.addListener(SWT.Selection, this);
	}

	@Override
	/**
	 * Set a new line to highlight
	 * @param newLine line to highlight
	 */
	public void setLine(final int newLine) {
		if (currentLine != newLine) {
			Display d = Display.getDefault();
			d.syncExec(new Runnable() {
				public void run() {
					if (lines[currentLine].isDisposed())
						return;
					lines[currentLine].setBackground(NORMAL);
					currentLine = newLine;
					lines[currentLine].setBackground(HIGHLIGHT);
				}
			});
		}
	}

	@Override
	/**
	 * Set the actor as blocked or normal, enable/disable nextStep-button
	 * @param blocked True if actor is now blocked, false if not
	 * @param bySemaphore Color of blocking differs between semaphore or condition, true if blocked by semaphore, false if blocked by condition
	 */
	public void setBlocked(final boolean blocked, final boolean bySemaphore) {
		Display d = Display.getDefault();
		d.syncExec(new Runnable() {
			public void run() {
				Color c;
				if (blocked) {
					nextStep.setEnabled(false);
					c = (bySemaphore ? SEMA : BLOCKED);
				} else {
					nextStep.setEnabled(true);
					c = HIGHLIGHT;
				}
				lines[currentLine].setBackground(c);
			}
		});
	}

	@Override
	/**
	 * Get actor's current status
	 * @return Actor's current status
	 */
	public boolean isBlocked() {
		return nextStep.getEnabled();
	}

	@Override
	/**
	 * Perform a single step by clicking the button
	 */
	public void handleEvent(Event arg0) {
		a.step();
	}

}
