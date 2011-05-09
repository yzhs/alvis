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

import de.unisiegen.informatik.bs.alvis.commands.RunCompile;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IRunPreferences;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;
import de.unisiegen.informatik.bs.alvis.tools.IO;
import de.unisiegen.informatik.bs.alvis.virtualmachine.Run;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;

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
	private Text text;
	
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
	private ArrayList<GraphicalRepresentation> graphicalRepresentations;
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
		tbtmRun.setText("Run");
		
		Group grpRun = new Group(tabFolder, SWT.NONE);
		tbtmRun.setControl(grpRun);
		grpRun.setText("Run Settings");
		grpRun.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		graphicalRepresentations = new ArrayList<GraphicalRepresentation>();
		Button btnSetPreferences = new Button(grpRun, SWT.NONE);
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
			                    //	* Save the IRunVisualizer
			                    GraphicalRepresentation[] returnedGraphReps = 
			                    	myRunPreferences.getRunPreferences(
			                    			Platform.getInstanceLocation()
			                    				.getURL().getPath() + 
			                    				myExampleFile.getText());
			                    
			                    for(GraphicalRepresentation rep : returnedGraphReps) {
			                    	graphicalRepresentations.add(rep);
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
		
		Button btnCheckButton = new Button(grpRun, SWT.CHECK);
		btnCheckButton.setSelection(true);
		btnCheckButton.setText("Stop on Breakpoints");
		
		Button btnInstantStart = new Button(grpRun, SWT.CHECK);
		btnInstantStart.setText("Instant Start");
		
		Button btnEnableTolog = new Button(grpRun, SWT.CHECK);
		btnEnableTolog.setText("Enable to .log");
		
		TabItem tbtmSave = new TabItem(tabFolder, SWT.NONE);
		tbtmSave.setText("Save");
		
		Group grpSaveOptions = new Group(tabFolder, SWT.NONE);
		grpSaveOptions.setText("Save Options");
		tbtmSave.setControl(grpSaveOptions);
		grpSaveOptions.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Button btnSaveAspdf = new Button(grpSaveOptions, SWT.CHECK);
		btnSaveAspdf.setText("Save as .pdf");
		
		Button btnSaveAstex = new Button(grpSaveOptions, SWT.CHECK);
		btnSaveAstex.setText("Save as .tex");
		
		Button btnSaveEachBreakpoint = new Button(grpSaveOptions, SWT.CHECK);
		btnSaveEachBreakpoint.setText("Save each Breakpoint");
		
		TabItem tbtmThisrun = new TabItem(tabFolder, SWT.NONE);
		tbtmThisrun.setText("Content");
		
		text = new Text(tabFolder, SWT.BORDER);
		tbtmThisrun.setControl(text);
		xpndtmSettings.setHeight(xpndtmSettings.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		
		ExpandItem xpndtmInformations = new ExpandItem(expandBar, SWT.NONE);
		xpndtmInformations.setExpanded(false);
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
//		label.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		xpndtmInformations.setHeight(xpndtmInformations.getControl().computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		if(myRun.getAlgorithmFile() != null) 
			myAlgorithmFile.setText(myRun.getAlgorithmFile());
		if(myRun.getExampleFile() != null) 
			myExampleFile.setText(myRun.getExampleFile());
	}

	public void setFocus() {

	}
}
