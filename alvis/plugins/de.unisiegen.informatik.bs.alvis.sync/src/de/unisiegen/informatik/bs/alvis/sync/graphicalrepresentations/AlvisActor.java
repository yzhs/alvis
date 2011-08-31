package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationActor;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCActor;

/**
 * Graphical representation of an actor
 * 
 * @author Jan Bauerdick
 * 
 */
public class AlvisActor implements GraphicalRepresentationActor {

	private String name;
	private Label lName;
	private int currentLine;
	private boolean blocked;
	private PCActor a;
	private Display d;
	private AlvisScenario myScenario;
	private final int id;

//	public AlvisActor(AlvisScenario scenario, PCActor act) {
////		d = scenario;
//		FillLayout f = new FillLayout();
//		f.type = SWT.VERTICAL;
//		Group g = new Group(parent, SWT.CASCADE);
//		g.setLayout(f);
//
//		a = act;
//		name = act.getName();
//		currentLine = 0;
//
//		g.setText(name);
//
//		Font ft = new Font(Display.getDefault(), "Monospaced", 9, SWT.BOLD); //$NON-NLS-1$
//		lines = new Label[act.getLines().length];
//		for (int i = 0; i < act.getLines().length; i++) {
//			lines[i] = new Label(g, SWT.LEFT);
//			lines[i].setText(act.getLines()[i]);
//			lines[i].setFont(ft);
//			lines[i].setBackground(i == 0 ? HIGHLIGHT : NORMAL);
//		}
//		nextStep = new Button(g, SWT.PUSH);
//		nextStep.setText(Messages.AlvisActor_nextStepButton);
//		nextStep.addListener(SWT.Selection, this);
//	}
	
	public AlvisActor(AlvisScenario scenario, String name, boolean status) {
		myScenario = scenario;
		d = scenario.getMyDisplay();
		id = scenario.getAdmin().requestId();
		this.name = name;
		blocked = status;
		lName = new Label(myScenario.getActorsScroll(), SWT.NONE);
		lName.setText(name);
		lName.setBackground(status ? BLOCKED : NORMAL);
	}
	
	public AlvisActor(AlvisScenario scenario, String name, boolean status, int id) {
		myScenario = scenario;
		d = scenario.getMyDisplay();
		this.id = id;
		this.name = name;
		blocked = status;
		lName = new Label(myScenario.getActorsScroll(), SWT.NONE);
		lName.setText(name);
		lName.setBackground(status ? BLOCKED : NORMAL);
	}

	@Override
	/**
	 * Set a new line to highlight
	 * @param newLine line to highlight
	 */
	public void setLine(final int newLine) {
		if (currentLine != newLine) {
			
		}
	}

	@Override
	/**
	 * Set the actor as blocked or normal, enable/disable nextStep-button
	 * @param blocked True if actor is now blocked, false if not
	 * @param bySemaphore Color of blocking differs between semaphore or condition, true if blocked by semaphore, false if blocked by condition
	 */
	public void setBlocked(final boolean blocked, final boolean bySemaphore) {
		this.blocked = blocked;
		d.syncExec(new Runnable() {
			public void run() {
				Color c;
				if (blocked) {
					c = (bySemaphore ? SEMA : BLOCKED);
				} else {
					c = HIGHLIGHT;
				}
				lName.setBackground(c);
			}
		});
	}

	@Override
	/**
	 * Get actor's current status
	 * @return Actor's current status
	 */
	public boolean isBlocked() {
		return blocked;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentLine() {
		return currentLine;
	}

	public void setCurrentLine(int currentLine) {
		this.currentLine = currentLine;
	}

	public PCActor getA() {
		return a;
	}

	public void setA(PCActor a) {
		this.a = a;
	}

	public int getId() {
		return id;
	}
	
	public Label getlName() {
		return lName;
	}

	public void setlName(Label lName) {
		this.lName = lName;
	}

	public boolean equals(AlvisActor a) {
		if (a == null) {
			return false;
		} else {
			return (a.getId() == id);
		}
	}

}
