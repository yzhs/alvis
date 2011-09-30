package de.unisiegen.informatik.bs.alvis.sync.graphicalrepresentations;

import java.util.ArrayList;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;

import de.unisiegen.informatik.bs.alvis.sync.Activator;
import de.unisiegen.informatik.bs.alvis.sync.datatypes.GraphicalRepresentationScenario;
import de.unisiegen.informatik.bs.alvis.sync.dialogs.DeleteConditionDialog;
import de.unisiegen.informatik.bs.alvis.sync.dialogs.DeletePrimitiveDialog;
import de.unisiegen.informatik.bs.alvis.sync.dialogs.DeleteSemaphoreDialog;
import de.unisiegen.informatik.bs.alvis.sync.dialogs.DeleteThreadDialog;
import de.unisiegen.informatik.bs.alvis.sync.editors.ScenarioEditor;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewThreadWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewBufferWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewConditionWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewPrimitiveWizard;
import de.unisiegen.informatik.bs.alvis.sync.newwizards.NewSemaphoreWizard;

import org.eclipse.ui.IWorkbench;

public class AlvisScenario implements GraphicalRepresentationScenario, Listener {

	private Composite myParent;
	private Display myDisplay;
	private ArrayList<AlvisPrimitive> primitivesList;
	private ArrayList<AlvisSemaphore> semaphoresList;
	private ArrayList<AlvisCondition> conditionsList;
	private ArrayList<AlvisThread> threadsList;
	private AlvisBuffer buffer;
	private AlvisOutput output;
	public static AlvisScenario scenario;
	public Group primitives, semaphores, conditions, threads, bufferGroup, outputGroup;
	private AlvisSave admin;

	public AlvisScenario(Composite parent) {
		admin = new AlvisSave();
		primitivesList = new ArrayList<AlvisPrimitive>();
		semaphoresList = new ArrayList<AlvisSemaphore>();
		conditionsList = new ArrayList<AlvisCondition>();
		threadsList = new ArrayList<AlvisThread>();
		buffer = null;
		output = null;
		scenario = this;
		myParent = parent;
		myDisplay = myParent.getDisplay();
		Composite container = new Composite(myParent, SWT.NULL);
		container.setLayout(null);

		primitives = new Group(container, SWT.NONE);
		primitives.setBounds(5, 5, 192, 294);
		primitives.setText(Messages.AlvisScenario_primitives);

		Button primAdd = new Button(primitives, SWT.NONE);
		primAdd.setBounds(10, 266, 90, 26);
		primAdd.setText(Messages.AlvisScenario_add);
		primAdd.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewPrimitiveWizard w = new NewPrimitiveWizard();
				WizardDialog d = new WizardDialog(Activator.getDefault()
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						w);
				IWorkbench workbench = Activator.getDefault().getWorkbench();
				ISelection selection = Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getSelectionService()
						.getSelection();
				if (selection instanceof IStructuredSelection) {
					w.init(workbench, (IStructuredSelection) selection);
				} else {
					w.init(workbench, null);
				}
				d.open();
				ScenarioEditor.edit.checkDirty();
			}
		});

		Button primDel = new Button(primitives, SWT.NONE);
		primDel.setBounds(106, 266, 82, 26);
		primDel.setText(Messages.AlvisScenario_delete);
		
		primDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				ApplicationWindow window = new DeletePrimitiveDialog(null);
			    window.setBlockOnOpen(true);
			    window.open();
			    ScenarioEditor.edit.checkDirty();
			}
		});

		semaphores = new Group(container, SWT.NONE);
		semaphores.setBounds(202, 5, 194, 294);
		semaphores.setText(Messages.AlvisScenario_semaphores);

		Button semaAdd = new Button(semaphores, SWT.NONE);
		semaAdd.setText(Messages.AlvisScenario_add);
		semaAdd.setBounds(12, 266, 90, 26);
		semaAdd.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewSemaphoreWizard w = new NewSemaphoreWizard();
				WizardDialog d = new WizardDialog(Activator.getDefault()
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						w);
				IWorkbench workbench = Activator.getDefault().getWorkbench();
				ISelection selection = Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getSelectionService()
						.getSelection();
				if (selection instanceof IStructuredSelection) {
					w.init(workbench, (IStructuredSelection) selection);
				} else {
					w.init(workbench, null);
				}
				d.open();
				ScenarioEditor.edit.checkDirty();
			}
		});

		Button semaDel = new Button(semaphores, SWT.NONE);
		semaDel.setText(Messages.AlvisScenario_delete);
		semaDel.setBounds(108, 266, 82, 26);
		
		semaDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				ApplicationWindow window = new DeleteSemaphoreDialog(null);
			    window.setBlockOnOpen(true);
			    window.open();
			}
		});

		conditions = new Group(container, SWT.NONE);
		conditions.setBounds(401, 5, 194, 294);
		conditions.setText(Messages.AlvisScenario_conditions);

		Button condAdd = new Button(conditions, SWT.NONE);
		condAdd.setText(Messages.AlvisScenario_add);
		condAdd.setBounds(10, 266, 90, 26);
		condAdd.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewConditionWizard w = new NewConditionWizard();
				WizardDialog d = new WizardDialog(Activator.getDefault()
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						w);
				IWorkbench workbench = Activator.getDefault().getWorkbench();
				ISelection selection = Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getSelectionService()
						.getSelection();
				if (selection instanceof IStructuredSelection) {
					w.init(workbench, (IStructuredSelection) selection);
				} else {
					w.init(workbench, null);
				}
				d.open();
				ScenarioEditor.edit.checkDirty();
			}
		});

		Button condDel = new Button(conditions, SWT.NONE);
		condDel.setText(Messages.AlvisScenario_delete);
		condDel.setBounds(106, 266, 82, 26);
		
		condDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				ApplicationWindow window = new DeleteConditionDialog(null);
			    window.setBlockOnOpen(true);
			    window.open();
			}
		});

		threads = new Group(container, SWT.NONE);
		threads.setBounds(604, 5, 190, 294);
		threads.setText(Messages.AlvisScenario_threads);

		Button threadAdd = new Button(threads, SWT.NONE);
		threadAdd.setText(Messages.AlvisScenario_add);
		threadAdd.setBounds(10, 266, 90, 26);
		threadAdd.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				NewThreadWizard w = new NewThreadWizard();
				WizardDialog d = new WizardDialog(Activator.getDefault()
						.getWorkbench().getActiveWorkbenchWindow().getShell(),
						w);
				IWorkbench workbench = Activator.getDefault().getWorkbench();
				ISelection selection = Activator.getDefault().getWorkbench()
						.getActiveWorkbenchWindow().getSelectionService()
						.getSelection();
				if (selection instanceof IStructuredSelection) {
					w.init(workbench, (IStructuredSelection) selection);
				} else {
					w.init(workbench, null);
				}
				d.open();
				ScenarioEditor.edit.checkDirty();
			}
		});

		Button threadDel = new Button(threads, SWT.NONE);
		threadDel.setText(Messages.AlvisScenario_delete);
		threadDel.setBounds(106, 266, 82, 26);
		
		threadDel.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				ApplicationWindow window = new DeleteThreadDialog(null);
			    window.setBlockOnOpen(true);
			    window.open();
			}
		});

		final Button needBuffer = new Button(container, SWT.CHECK);
		needBuffer.setBounds(15, 322, 164, 23);
		needBuffer.setText(Messages.AlvisScenario_needBuffer);

		final Button needOutput = new Button(container, SWT.CHECK);
		needOutput.setBounds(15, 350, 169, 23);
		needOutput.setText(Messages.AlvisScenario_needOutput);

		bufferGroup = new Group(container, SWT.NONE);
		bufferGroup.setBounds(202, 305, 198, 244);
		bufferGroup.setText(Messages.AlvisScenario_buffer);
		bufferGroup.setVisible(false);

		final Group grpOutput = new Group(container, SWT.NONE);
		grpOutput.setText(Messages.AlvisScenario_output);
		grpOutput.setBounds(411, 305, 184, 244);
		grpOutput.setVisible(false);

		needBuffer.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (needBuffer.getSelection()) {
					NewBufferWizard w = new NewBufferWizard();
					WizardDialog d = new WizardDialog(Activator.getDefault()
							.getWorkbench().getActiveWorkbenchWindow()
							.getShell(), w);
					IWorkbench workbench = Activator.getDefault()
							.getWorkbench();
					ISelection selection = Activator.getDefault()
							.getWorkbench().getActiveWorkbenchWindow()
							.getSelectionService().getSelection();
					if (selection instanceof IStructuredSelection) {
						w.init(workbench, (IStructuredSelection) selection);
					} else {
						w.init(workbench, null);
					}
					d.open();
				} else {
					setBuffer(null);
					admin.setBuffer(null);
				}
				ScenarioEditor.edit.checkDirty();
				bufferGroup.setVisible(needBuffer.getSelection());
			}
		});

		needOutput.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event e) {
				if (needOutput.getSelection()) {
					AlvisOutput o = new AlvisOutput(scenario, ""); //$NON-NLS-1$
					setOutput(o);
					admin.setOutput(o);
				} else {
					setOutput(null);
					admin.setOutput(null);
				}
				ScenarioEditor.edit.checkDirty();
				grpOutput.setVisible(needOutput.getSelection());
			}
		});
	}

	public AlvisSave getAdmin() {
		return admin;
	}

	public void setAdmin(AlvisSave admin) {
		this.admin = admin;
	}

	public ArrayList<AlvisPrimitive> getPrimitivesList() {
		return primitivesList;
	}

	public void setPrimitivesList(ArrayList<AlvisPrimitive> primitivesList) {
		this.primitivesList = primitivesList;
	}

	public ArrayList<AlvisSemaphore> getSemaphoresList() {
		return semaphoresList;
	}

	public void setSemaphoresList(ArrayList<AlvisSemaphore> semaphoresList) {
		this.semaphoresList = semaphoresList;
	}

	public ArrayList<AlvisCondition> getConditionsList() {
		return conditionsList;
	}

	public void setConditionsList(ArrayList<AlvisCondition> conditionsList) {
		this.conditionsList = conditionsList;
	}

	public ArrayList<AlvisThread> getThreadsList() {
		return threadsList;
	}

	public void setThreadsList(ArrayList<AlvisThread> threadsList) {
		this.threadsList = threadsList;
	}

	public Display getMyDisplay() {
		return myDisplay;
	}

	public void setMyDisplay(Display myDisplay) {
		this.myDisplay = myDisplay;
	}

	public Group getPrimitivesGroup() {
		return primitives;
	}

	public void setPrimitivesGroup(Group primitives) {
		this.primitives = primitives;
	}

	public Group getSemaphoresGroup() {
		return semaphores;
	}

	public void setSemaphoresGroup(Group semaphores) {
		this.semaphores = semaphores;
	}

	public Group getConditionsGroup() {
		return conditions;
	}

	public void setConditionsGroup(Group conditions) {
		this.conditions = conditions;
	}

	public Group getThreadsGroup() {
		return threads;
	}

	public void setThreadsScroll(Group threads) {
		this.threads = threads;
	}

	public AlvisBuffer getBuffer() {
		return buffer;
	}

	public void setBuffer(AlvisBuffer buffer) {
		this.buffer = buffer;
	}

	public AlvisOutput getOutput() {
		return output;
	}

	public void setOutput(AlvisOutput output) {
		this.output = output;
	}
	
	public void addBuffer(AlvisBuffer b) {
		admin.addBuffer(b);
//		b.getBuffer().setParent(bufferGroup);
//		b.getBuffer().setBounds(5, 10, 180, 220);
	}
	
	public void removeBuffer(AlvisBuffer b) {
		admin.removeBuffer();
		b.remove();
//		b.getBuffer().dispose();
	}
	
	public void addPrimitive(AlvisPrimitive p) {
		admin.addPrimitive(p);
		p.getLabel().setBounds(5, 10 + primitivesList.size() * 15, 180, 15);
	}
	
	public void removePrimitive(AlvisPrimitive p) {
		admin.removePrimitive(p);
		p.getLabel().dispose();
	}
	
	public void addSemaphore(AlvisSemaphore s) {
		admin.addSemaphore(s);
		s.getLabel().setBounds(5, 10 + semaphoresList.size() * 15, 180, 15);
		s.getLabel().setBackground(AlvisColor.green.color());
	}
	
	public void removeSemaphore(AlvisSemaphore s) {
		admin.removeSemaphore(s);
		s.getLabel().dispose();
	}
	
	public void addCondition(AlvisCondition c) {
		admin.addCondition(c);
		c.getLabel().setBounds(5, 10 + conditionsList.size() * 15, 180, 15);
		c.getLabel().setBackground(AlvisColor.green.color());
	}
	
	public void removeCondition(AlvisCondition c) {
		admin.removeCondition(c);
		c.getLabel().dispose();
	}
	
	public void addThread(AlvisThread a) {
		admin.addThread(a);
		a.getlName().setBounds(5, 10 + threadsList.size() + 15, 180, 15);
		a.getlName().setBackground(AlvisColor.green.color());
	}
	
	public void removeThread(AlvisThread a) {
		admin.removeThread(a);
		a.getlName().dispose();
	}

	public void resetContent() {
		ScenarioEditor.threadsList.removeAll();
		ScenarioEditor.semaphoresList.removeAll();
		ScenarioEditor.conditionsList.removeAll();
		ScenarioEditor.primitivesList.removeAll();
		admin = new AlvisSave();
	}

	@Override
	public void handleEvent(Event event) {
		// TODO Auto-generated method stub

	}

}
