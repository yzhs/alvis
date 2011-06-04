package de.unisiegen.informatik.bs.alvis.editors;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.part.FileEditorInput;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.Run;
import de.unisiegen.informatik.bs.alvis.commands.RunCompile;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunPreferences;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.tools.IO;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;

public class RunEditor extends EditorPart {
	public RunEditor() {
	}
	
	private Run myRun;
	private String myInputFilePath;
	private Boolean myDirty;
	private Text myAlgorithmFile;
	private Text myExampleFile;	
	private Composite composite_1;
	private ExpandBar expandBar;
	private ExpandItem xpndtmExample;
	private Group grpExampleFile;
	private ExpandItem xpndtmRun;
	private Group grpStartTheRun;
	private ExpandItem xpndtmAlgorithm;
	private Group grpAlgorithmFile;
	
	public void doSave(final IProgressMonitor monitor) {
		myRun.setAlgorithmFile(myAlgorithmFile.getText());
		myRun.setExampleFile(myExampleFile.getText());
		XStream xstream = new XStream(new DomDriver());
		BufferedOutputStream fos;
		try {
			fos = new BufferedOutputStream(
					new FileOutputStream(myInputFilePath));
			fos.write(xstream.toXML(myRun).getBytes());
			fos.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		checkDirty();
	}



	/**
	 * isSaveAsAllowed? Currently not!
	 */
	public boolean isSaveAsAllowed() {
		return false;
	}
	/**
	 * Save the Graph as...
	 * Currently not allowed
	 */
	public void doSaveAs() {

	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		setSite(site);
		setInput(input);
		setPartName(input.getName());
		FileEditorInput fileInput = (FileEditorInput)input;
		myInputFilePath = fileInput.getPath().toString();
		myRun = loadRun();
		checkDirty();
	}
	
	public boolean isDirty() {
		return myDirty;
	}

	private Run loadRun() {
		Run tempRun = null;
		
		tempRun = (Run)IO.deserialize(myInputFilePath);
		
		if(tempRun == null)		
			tempRun = new Run();
		return tempRun;
	}
	
	private void checkDirty() {
		if(!loadRun().equals(myRun)) {
			setDirty(true);
		}
		else
			setDirty(false);
	}



	/**
	 * Sets the current state of dirty
	 * firesPropertyChange
	 * @param b the state of dirty
	 */
	private void setDirty(boolean b) {
		this.myDirty = b;
		firePropertyChange(PROP_DIRTY);
	}
	
	// TODO diese Arraylist wird durch den button Preferences mit datentypen für 
	// die VM gefüllt. nachschauen, was damit passieren kann.
	private ArrayList<PCObject> pseudoCodeObjects;

	private EStartPoint myStartPoint = EStartPoint.RAND;
	private EDecisionPoint myDecisionPoint = EDecisionPoint.RAND;
	private EBreakPoint myBreakPoint = EBreakPoint.STOP;

	private boolean myLimitSteps = true;
	
	public void createPartControl(Composite parent) {
		
		composite_1 = new Composite(parent, SWT.NONE);
		composite_1.setFont(SWTResourceManager.getFont("Calibri", 10, SWT.BOLD));
		composite_1.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		expandBar = new ExpandBar(composite_1, SWT.NONE);
		expandBar.setFont(SWTResourceManager.getFont("Calibri", 10, SWT.NORMAL));
		expandBar.setSpacing(10);
		expandBar.setForeground(SWTResourceManager.getColor(SWT.COLOR_DARK_RED));
		expandBar.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		
		xpndtmAlgorithm = new ExpandItem(expandBar, SWT.NONE);
		xpndtmAlgorithm.setExpanded(true);
		xpndtmAlgorithm.setText("Algorithm");
		
		grpAlgorithmFile = new Group(expandBar, SWT.NONE);
		xpndtmAlgorithm.setControl(grpAlgorithmFile);
		grpAlgorithmFile.setText("Algorithm File");
		grpAlgorithmFile.setLayout(new FillLayout(SWT.HORIZONTAL));
		myAlgorithmFile = new Text(grpAlgorithmFile, SWT.NONE);
		myAlgorithmFile.setToolTipText("Choose a file relative to the workspace.");
		
		Button btnselectAlgorithmFile = new Button(grpAlgorithmFile, SWT.NONE);
		btnselectAlgorithmFile.setToolTipText("Select the algorithm file - this will be the algorithm that runs on the example.");
		btnselectAlgorithmFile.setText("Select...");
		btnselectAlgorithmFile.addListener(SWT.Selection, new Listener() {

			@Override
			public void handleEvent(Event event) {
				ElementTreeSelectionDialog dialog = 
					new ElementTreeSelectionDialog(
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
							new WorkbenchLabelProvider(), 
							new BaseWorkbenchContentProvider());
				dialog.setTitle("Select an \"Algorithm File\"");
				dialog.setMessage("Choose one file from the type .algo");
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.open();
				if(dialog.getResult() != null) {
					String result = "";
					for(Object o : dialog.getResult()) 
						result = o.toString();
					if(result.startsWith("L") & result.endsWith("algo")) {
						result = result.substring(2); // cut the first two chars
						myAlgorithmFile.setText(result);
						setDirty(true);
					}
				}
			}
			
		});
		
		myAlgorithmFile.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				myRun.setAlgorithmFile(myAlgorithmFile.getText());
				checkDirty();
				}
		});
		xpndtmAlgorithm.setHeight(xpndtmAlgorithm.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		
		xpndtmExample = new ExpandItem(expandBar, SWT.NONE);
		xpndtmExample.setExpanded(true);
		xpndtmExample.setText("Example");
		
		grpExampleFile = new Group(expandBar, SWT.SHADOW_OUT);
		grpExampleFile.setText("Example File");
		xpndtmExample.setControl(grpExampleFile);
		grpExampleFile.setLayout(new FillLayout(SWT.HORIZONTAL));
		myExampleFile = new Text(grpExampleFile, SWT.NONE);
		myExampleFile.setToolTipText("Choose a file relative to the workspace.");
		
		Button btnSelectExampleFile = new Button(grpExampleFile, SWT.NONE);
		btnSelectExampleFile.setToolTipText("Select the file that contains the run's example");
		btnSelectExampleFile.setText("Select...");
		btnSelectExampleFile.addListener(SWT.Selection, new Listener() {
			public void handleEvent(Event event) {
				ElementTreeSelectionDialog dialog = 
					new ElementTreeSelectionDialog(
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
							new WorkbenchLabelProvider(), 
							new BaseWorkbenchContentProvider());
				dialog.setTitle("Select an \"Example File\"");
				dialog.setMessage("Choose one file of the type .graph");
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.open();
				if(dialog.getResult() != null) {
					String result = "";
					for(Object o : dialog.getResult()) 
						result = o.toString();
					if(result.startsWith("L") & result.endsWith("graph")) {
						result = result.substring(2); // cut the first two chars
						myExampleFile.setText(result);
						setDirty(true);
					}
				}
			}
		});
		
		
		myExampleFile.addVerifyListener(new VerifyListener() {
			public void verifyText(VerifyEvent e) {
				myRun.setExampleFile(myExampleFile.getText());
				checkDirty();
			}
		});
		xpndtmExample.setHeight(xpndtmExample.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		
		xpndtmRun = new ExpandItem(expandBar, SWT.NONE);
		xpndtmRun.setExpanded(true);
		xpndtmRun.setText("Run");
		
		grpStartTheRun = new Group(expandBar, SWT.NONE);
		grpStartTheRun.setText("Start the Run");
		xpndtmRun.setControl(grpStartTheRun);
		grpStartTheRun.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Button run = new Button(grpStartTheRun, SWT.CENTER);
		run.setToolTipText("Click here to start the run.");
		run.setImage(ImageCache.getImage("icons/extension/ext_run.png"));
		run.setFont(SWTResourceManager.getFont("Calibri", 14, SWT.NORMAL));
		run.addListener(SWT.Selection, new Listener(){
			public void handleEvent(Event event) {
				try {
					new RunCompile().execute(null);
				} catch (ExecutionException e) {
					e.printStackTrace();
				}
			}
		});
		xpndtmRun.setHeight(xpndtmRun.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		
		ExpandItem xpndtmSettings = new ExpandItem(expandBar, SWT.NONE);
		xpndtmSettings.setExpanded(true);
		xpndtmSettings.setText("Settings");
		
		TabFolder tabFolder = new TabFolder(expandBar, SWT.NONE);
		xpndtmSettings.setControl(tabFolder);
		
		TabItem tbtmRun = new TabItem(tabFolder, SWT.NONE);
		tbtmRun.setText("Start point");
		
		Group grpRun = new Group(tabFolder, SWT.NONE);
		tbtmRun.setControl(grpRun);
		grpRun.setText("Start point settings");
		
		/*
		 * This section asks the plugins for parameters to add to the run. 
		 */
		pseudoCodeObjects = new ArrayList<PCObject>();
		grpRun.setLayout(new GridLayout(3, false));
		
		Label lblNewLabel = new Label(grpRun, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 3, 1));
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblNewLabel.setText("How do you want to choose the start configurations for the run?");
		
		Button btn_startpoint_rand = new Button(grpRun, SWT.RADIO);
		btn_startpoint_rand.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO STARTPOINT_RAND
				myStartPoint = EStartPoint.RAND;
				myRun.setOnStartPoint(myStartPoint);
				checkDirty();
			}
		});
		btn_startpoint_rand.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btn_startpoint_rand.setText("Randomly");
		
		Label lblLetThe_1 = new Label(grpRun, SWT.NONE);
		lblLetThe_1.setText("- let the computer decide.");
		new Label(grpRun, SWT.NONE);
		
		Button btn_startpoint_decide = new Button(grpRun, SWT.RADIO);
		btn_startpoint_decide.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btn_startpoint_decide.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				//TODO STARTPOINT_DECIDE
				myStartPoint = EStartPoint.DECIDE;
				myRun.setOnStartPoint(myStartPoint);
				checkDirty();
			}
		});
		btn_startpoint_decide.setText("Decide");
		
		Label lblSetThe = new Label(grpRun, SWT.NONE);
		lblSetThe.setText("- set the preferences first.");
		new Label(grpRun, SWT.NONE);
		Button btnSetPreferences = new Button(grpRun, SWT.NONE);
		btnSetPreferences.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnSetPreferences.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnSetPreferences.setToolTipText("Click here to set the preferences for the run.");
		btnSetPreferences.addListener(SWT.Selection, new Listener () {

			@Override
			public void handleEvent(Event event) {
				if(!myExampleFile.getText().equals("")) {
			        IExtensionRegistry registry = Platform.getExtensionRegistry();
			        IExtensionPoint extensionPoint = registry.getExtensionPoint(
			        		"de.unisiegen.informatik.bs.alvis.extensions.runpreferences");
			        IExtension[] extensions = extensionPoint.getExtensions();
			        
			        //	 * For all Extensions that contribute:
			        for (int i = 0; i < extensions.length; i++)
			        {
			            IExtension extension = extensions[i];
			            IConfigurationElement[] elements = extension.getConfigurationElements();
			            for (int j = 0; j < elements.length; j++)
			            {
			                try
			                {
			                    IConfigurationElement element = elements[j];
			                    IRunPreferences myRunPreferences = (IRunPreferences)element.
			                    	createExecutableExtension("class");
			                    
			                    // Get the PseudoCodeObjects the user choosed as Parameters
			                    ArrayList<PCObject> returnedPseudoCodeObjects = 
			                    	myRunPreferences.getRunPreferences(
			                    			Platform.getInstanceLocation()
			                    				.getURL().getPath() + 
			                    				myExampleFile.getText());
			                    // Add all PseudoCodeObjects to the Run.
			                    for(PCObject pseudo : returnedPseudoCodeObjects) {
			                    	Activator.getDefault().getPseudoCodeList().add(pseudo);
			                    }
			                }
			                catch (CoreException e)
			                {
			                	e.printStackTrace();
			                }
			            }
			        }
				}
			}
			
		});
		btnSetPreferences.setText("Set Preferences");
		new Label(grpRun, SWT.NONE);
		new Label(grpRun, SWT.NONE);
		
		TabItem tbtmDecisionPoint = new TabItem(tabFolder, SWT.NONE);
		tbtmDecisionPoint.setText("Decision point");
		
		Group grpDecisionPointSettings = new Group(tabFolder, SWT.NONE);
		tbtmDecisionPoint.setControl(grpDecisionPointSettings);
		grpDecisionPointSettings.setText("Decision point settings");
		grpDecisionPointSettings.setLayout(new GridLayout(2, false));
		
		Label lblHowDoYou = new Label(grpDecisionPointSettings, SWT.NONE);
		lblHowDoYou.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblHowDoYou.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblHowDoYou.setText("When more than one ways are possible. How do you want the run to choose the way it goes?");
		
		Button btn_decisionpoint_rand = new Button(grpDecisionPointSettings, SWT.RADIO);
		btn_decisionpoint_rand.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO DECISIONPOINT_RAND
				myDecisionPoint = EDecisionPoint.RAND;
				myRun.setOnDecisionPoint(myDecisionPoint);
				checkDirty();
			}
		});
		btn_decisionpoint_rand.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btn_decisionpoint_rand.setToolTipText("Set decision point settings to random");
		btn_decisionpoint_rand.setText("Randomly");
		
		Label lblLetThe = new Label(grpDecisionPointSettings, SWT.NONE);
		lblLetThe.setText("- let the computer decide.");
		
		Button btn_decisionpoint_once = new Button(grpDecisionPointSettings, SWT.RADIO);
		btn_decisionpoint_once.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO DECISIONPOINT_ONCE
				myDecisionPoint = EDecisionPoint.ONCE;
				myRun.setOnDecisionPoint(myDecisionPoint);
				checkDirty();
			}
		});
		btn_decisionpoint_once.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btn_decisionpoint_once.setToolTipText("Set decision point settings to once");
		btn_decisionpoint_once.setText("Once");
		
		Label lblChooseAn = new Label(grpDecisionPointSettings, SWT.NONE);
		lblChooseAn.setText("- configure an order first.");
		
		Button btn_decisionpoint_always = new Button(grpDecisionPointSettings, SWT.RADIO);
		btn_decisionpoint_always.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO DECISIONPOINT_ALWAYS
				myDecisionPoint = EDecisionPoint.ALWAYS;
				myRun.setOnDecisionPoint(myDecisionPoint);
				checkDirty();
			}
		});
		btn_decisionpoint_always.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btn_decisionpoint_always.setToolTipText("Set decision point settings to always");
		btn_decisionpoint_always.setText("Always");
		
		Label lblDecideWhat = new Label(grpDecisionPointSettings, SWT.NONE);
		lblDecideWhat.setText("- decide what way the run should go on each decision point.");
		
		TabItem tbtmBreakPoint = new TabItem(tabFolder, SWT.NONE);
		tbtmBreakPoint.setText("Break point");
		
		Group grpBreakPoint = new Group(tabFolder, SWT.NONE);
		tbtmBreakPoint.setControl(grpBreakPoint);
		grpBreakPoint.setText("Break point settings");
		grpBreakPoint.setLayout(new GridLayout(2, false));
		
		Label lblWhatShallHappen = new Label(grpBreakPoint, SWT.NONE);
		lblWhatShallHappen.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblWhatShallHappen.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblWhatShallHappen.setText("What shall happen on break points?");
		
		Button btn_breakpoint_stop = new Button(grpBreakPoint, SWT.RADIO);
		btn_breakpoint_stop.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO BREAKPOINT_STOP
				myBreakPoint = EBreakPoint.STOP;
				myRun.setOnBreakPoint(myBreakPoint);
				checkDirty();
			}
		});
		btn_breakpoint_stop.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btn_breakpoint_stop.setText("Stop");
		
		Label lblStopOnEvery = new Label(grpBreakPoint, SWT.NONE);
		lblStopOnEvery.setText("- on every break point. Use next and back buttons to navigate.");
		
		Button btn_breakpoint_run = new Button(grpBreakPoint, SWT.RADIO);
		btn_breakpoint_run.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO BREAKPOINT_RUN
				myBreakPoint = EBreakPoint.RUN;
				myRun.setOnBreakPoint(myBreakPoint);
				checkDirty();
			}
		});
		btn_breakpoint_run.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btn_breakpoint_run.setText("Run");
		
		Label lblThroughEvery = new Label(grpBreakPoint, SWT.NONE);
		lblThroughEvery.setText("- through every break points. Make a short pause - then go on.");
		
		TabItem tbtmSecurity = new TabItem(tabFolder, SWT.NONE);
		tbtmSecurity.setText("Security");
		
		Group grpSecurity = new Group(tabFolder, SWT.NONE);
		grpSecurity.setText("Security Settings");
		tbtmSecurity.setControl(grpSecurity);
		grpSecurity.setLayout(new GridLayout(2, false));
		
		Label lblIfTheAlgorithm = new Label(grpSecurity, SWT.NONE);
		lblIfTheAlgorithm.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		lblIfTheAlgorithm.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, false, false, 2, 1));
		lblIfTheAlgorithm.setText("If the algorithm turns into an infinity loop the program may be unable to respond.");
		
		Button btnLimitTo = new Button(grpSecurity, SWT.CHECK);
		btnLimitTo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// TODO Limit of Steps
				myLimitSteps = !myLimitSteps;
				myRun.setLimitSteps(myLimitSteps);
				checkDirty();
			}
		});
		btnLimitTo.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnLimitTo.setText("Limit");
		
		Label lblStepsIn = new Label(grpSecurity, SWT.NONE);
		lblStepsIn.setText("- run to 1000 steps.");
		xpndtmSettings.setHeight(140);
		
		ExpandItem xpndtmInformations = new ExpandItem(expandBar, SWT.NONE);
		xpndtmInformations.setText("Informations");
		
		Group grpI = new Group(expandBar, SWT.NONE);
		grpI.setText("Informations about this file");
		xpndtmInformations.setControl(grpI);
		grpI.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Label label = new Label(grpI, SWT.HORIZONTAL);
		label.setText("Here you can save the settings for a specific run. \n" +
				"Choose the algorithm you want to run on the example. \n" +
				"The first textbox need to contain the path to the *.algo file. \n" +
				"The path must be relative to your workspace. \n" +
				"The second textbox need to contain a *.graph file. \n" +
				"By clicking on the \"Run\"-button you can start the run.");
		label.setFont(SWTResourceManager.getFont("Calibri", 9, SWT.NORMAL));
		xpndtmInformations.setHeight(xpndtmInformations.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		
		/*
		 * INITIAL ALL FIELDS
		 */
		if(myRun.getAlgorithmFile() != null) 
			myAlgorithmFile.setText(myRun.getAlgorithmFile());
		if(myRun.getExampleFile() != null) 
			myExampleFile.setText(myRun.getExampleFile());
		
		if(myRun.getOnStartPoint().equals(EStartPoint.RAND)) {
			btn_startpoint_rand.setSelection(true);
			myStartPoint = EStartPoint.RAND;
		}
		if(myRun.getOnStartPoint().equals(EStartPoint.DECIDE)) {
			btn_startpoint_decide.setSelection(true);
			myStartPoint = EStartPoint.DECIDE;
		}
		if(myRun.getOnDecisionPoint().equals(EDecisionPoint.RAND)) {
			btn_decisionpoint_rand.setSelection(true);
			myDecisionPoint = EDecisionPoint.RAND;
		}
		if(myRun.getOnDecisionPoint().equals(EDecisionPoint.ONCE)) {
			btn_decisionpoint_once.setSelection(true);
			myDecisionPoint = EDecisionPoint.ONCE;
		}
		if(myRun.getOnDecisionPoint().equals(EDecisionPoint.ALWAYS)) {
			btn_decisionpoint_always.setSelection(true);
			myDecisionPoint = EDecisionPoint.ALWAYS;
		}
		if(myRun.getOnBreakPoint().equals(EBreakPoint.STOP)) {
			btn_breakpoint_stop.setSelection(true);
			myBreakPoint = EBreakPoint.STOP;
		}
		if(myRun.getOnBreakPoint().equals(EBreakPoint.RUN)) {
			btn_breakpoint_run.setSelection(true);
			myBreakPoint = EBreakPoint.RUN;
		}
		if(myRun.isLimitSteps() == true) {
			btnLimitTo.setSelection(true);
			myLimitSteps = true;
		}
		else {
			btnLimitTo.setSelection(false);
			myLimitSteps = false;
		}
	}

	public void setFocus() {

	}
}
