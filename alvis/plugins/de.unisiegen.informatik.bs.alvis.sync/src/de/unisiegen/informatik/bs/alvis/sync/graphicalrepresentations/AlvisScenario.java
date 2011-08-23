package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationScenario;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCActor;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCBuffer;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCCondition;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCScenario;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.PCSemaphore;

/**
 * Create a synchronization scenario
 * @author Jan Bauerdick
 *
 */
public class AlvisScenario implements GraphicalRepresentationScenario, Listener {
	
	private PCScenario scenario;
	private Group vars;
	private Group output;
	private Group buffer;
	private Group control;
	private Combo strategy;
	private Button globalStep;
	private Composite actorVisualization;
	private ArrayList<AlvisSemaphore> semaphores;
	private ArrayList<AlvisCondition> conditions;
	private ArrayList<AlvisPrimitive> primitives;
	private ArrayList<AlvisActor> actors;
	private ArrayList<AlvisBuffer> buffers;
	
	/**
	 * Setup the parent composite for scenario
	 * @param parent
	 */
	public AlvisScenario(Composite parent) {
		GridLayout outerGL = new GridLayout();
		outerGL.makeColumnsEqualWidth = false;
		outerGL.numColumns = 2;
		parent.setLayout(outerGL);
		
		Composite left = new Composite(parent, SWT.CASCADE);
		FillLayout leftFL = new FillLayout();
		leftFL.type = SWT.VERTICAL;
		left.setLayout(leftFL);

		vars = new Group(left, SWT.CASCADE);
		vars.setText(Messages.AlvisScenario_vars);
		FillLayout varsFL = new FillLayout();
		varsFL.type = SWT.VERTICAL;
		vars.setLayout(varsFL);
		vars.setVisible(false);
		
		output = new Group(left, SWT.CASCADE);
		output.setText(Messages.AlvisScenario_output);
		FillLayout outputFL = new FillLayout();
		outputFL.type = SWT.VERTICAL;
		output.setLayout(outputFL);
		output.setVisible(false);
		
		buffer = new Group(left, SWT.CASCADE);
		buffer.setText(Messages.AlvisScenario_buffer);
		FillLayout bufferFL = new FillLayout();
		bufferFL.type = SWT.VERTICAL;
		buffer.setLayout(bufferFL);
		buffer.setVisible(false);
		
		control = new Group(left, SWT.CASCADE);
		control.setText(Messages.AlvisScenario_control);
		FillLayout controlFL = new FillLayout();
		controlFL.type = SWT.VERTICAL;
		control.setLayout(bufferFL);
		strategy = new Combo(control, SWT.READ_ONLY | SWT.DROP_DOWN);
		String[] comboValues = {Messages.AlvisScenario_random, Messages.AlvisScenario_roundrobin, Messages.AlvisScenario_fifo, Messages.AlvisScenario_prio, Messages.AlvisScenario_revPrio};
		strategy.setItems(comboValues);
		strategy.select(0);
		strategy.addListener(SWT.Selection, this);
		globalStep = new Button(control, SWT.PUSH);
		globalStep.setText(Messages.AlvisScenario_globalStep);
		globalStep.addListener(SWT.Selection, this);
		
		actorVisualization = new Composite(parent, SWT.CASCADE);
		FillLayout actorsFL = new FillLayout();
		actorsFL.type = SWT.HORIZONTAL;
		actorVisualization.setLayout(actorsFL);		
	}
	
	public void addActor(PCActor a) {
		AlvisActor aa = new AlvisActor(actorVisualization, a);
		actors.add(aa);
	}
	
	public void addSemaphore(PCSemaphore s) {
		AlvisSemaphore as = new AlvisSemaphore(vars, s);
		semaphores.add(as);
		hasVariables();
	}
	
	public void addCondition(PCCondition c) {
		AlvisCondition ac = new AlvisCondition(vars, c);
		conditions.add(ac);
		hasVariables();
	}
	
	public void addPrimitive(PCObject o) {
		AlvisPrimitive ap = new AlvisPrimitive(vars, o);
		primitives.add(ap);
		hasVariables();
	}
	
	public void addBuffer(PCBuffer b) {
		AlvisBuffer ab = new AlvisBuffer(buffer, b);
		buffers.add(ab);
	}

	@Override
	public void hasVariables() {
		vars.setVisible(true);
	}

	@Override
	public void hasBuffer() {
		buffer.setVisible(true);
	}

	@Override
	public void hasOutput() {
		output.setVisible(true);
	}

	@Override
	public void handleEvent(Event event) {
		Display d = Display.getDefault();
		d.syncExec(new Runnable() {
			public void run() {
				scenario.doGlobalStep();
			}
		});
	}

}
