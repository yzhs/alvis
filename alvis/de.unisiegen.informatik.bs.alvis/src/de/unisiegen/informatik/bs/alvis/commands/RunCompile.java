package de.unisiegen.informatik.bs.alvis.commands;

import java.util.ArrayList;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.internal.Workbench;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.part.FileEditorInput;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.Run;
import de.unisiegen.informatik.bs.alvis.compiler.CompilerAccess;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IDatatypeList;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PCObject;
import de.unisiegen.informatik.bs.alvis.tools.IO;

@SuppressWarnings("restriction")
public class RunCompile extends AbstractHandler{

	public Object execute(ExecutionEvent event) throws ExecutionException {
		
		// Save all Editors
		Workbench.
		getInstance().
		getActiveWorkbenchWindow().
		getActivePage().
		saveAllEditors(true);
		
		IEditorInput input = null;
		
		for(PCObject obj : getAllDatatypes()) {
			System.out.println(obj.getClass());
		}
		
		try {
			// What to run? get the input (filepath)
			input = 
				Workbench.
				getInstance().
				getActiveWorkbenchWindow().
				getActivePage().
				getActiveEditor().
				getEditorInput();
		}
		catch(NullPointerException e) {
			
		}

		//instanciate a new Run object
		Run seri = null;
		
		/*
		 * GET THE RUN OBJECT
		 */
		// Check if the input is a FileEditorInput
		if(input != null & input instanceof FileEditorInput) {
			// cast to FileEditorInput
			FileEditorInput fileInput = (FileEditorInput) input;
			// If the user has choosen a graph to run...
			if(fileInput.getFile().getFileExtension().equals("run")) {
				// get the path in system
				String systemPath =
					fileInput.getPath().toString();
				// and deserialize the saved run to seri
				seri = (Run)IO.deserialize(systemPath);	
			}
			else {
				// ask for run settings
				seri = getUsersRun();
			}
			
		} else {
			// ask for run settings
			seri = getUsersRun();
		}

		// END OF GET THE RUN OBJECT
		
		if(seri != null) {
			// Set the ActiveRun field in the Activater to seri
			Activator.getDefault().setActiveRun(seri);
			
			// Compile 
			// TODO
			// GET THE ALGORITHM AS STRING code
			String pathToAlgoInJava = CompilerAccess.compileThisDummy("keinString", null);
			System.out.println(pathToAlgoInJava);
			if(Activator.getDefault().setJavaAlgorithmToVM(pathToAlgoInJava)) {
				// Then activate command SwitchToRunPerspective
				new SwitchToRunPerspective().execute(event);
			}
			else {
				System.out.println("Fehler");
				//TODO FEHLER AUSGEBEN MIT WINDOWS
			}
		} else {
			return null;
		}
		
		return null;
	}
	
	private ArrayList<PCObject> getAllDatatypes() {
		ArrayList<PCObject> allDatatypes = new ArrayList<PCObject>();
		
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        IExtensionPoint extensionPoint = registry.getExtensionPoint(
        		"de.unisiegen.informatik.bs.alvis.extensionpoints.datatypelist");
        IExtension[] extensions = extensionPoint.getExtensions();

        //     * For all Extensions that contribute:
        for (int i = 0; i < extensions.length; i++)
        {
            IExtension extension = extensions[i];
            IConfigurationElement[] elements = extension.getConfigurationElements();
            for (int j = 0; j < elements.length; j++)
            {
                try
                {
                    IConfigurationElement element = elements[j];
                    IDatatypeList datatypes = (IDatatypeList)element.
                        createExecutableExtension("class");
                    allDatatypes.addAll(datatypes.getAllDatatypesInThisPlugin());
                    // Save the found IRunVisualizer in a list
                    // HIER ALLE Objekte aus datatypes in deiner Globale Liste speichern
                }
                catch (CoreException e)
                {
                    e.printStackTrace();
                }
            }
        }
		return allDatatypes;
	}
	
	private Run getUsersRun() {
		
		Run seri = new Run();
		while(seri.getAlgorithmFile().equals("") | seri.getExampleFile().equals("")) {
			ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), 
					new WorkbenchLabelProvider(), 
					new BaseWorkbenchContentProvider());
			dialog.setTitle("Select the elements from the run.");
			dialog.setMessage("Select a .algo file or a .graph file or both by using the crlt key.");
			dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
			dialog.open();
			
			if(dialog.getResult() != null) {
				String result = "";
					for(Object o : dialog.getResult()) {
						result = o.toString();
					if(result.startsWith("L") & result.endsWith("graph")) {
						result = result.substring(2); // cut the first two chars
						seri.setExampleFile(result);
					}
					if(result.startsWith("L") & result.endsWith("algo")) {
						result = result.substring(2); // cut the first two chars
						seri.setAlgorithmFile(result);
					}
				}
			}
			if(dialog.getReturnCode() == 1) // the user clicked cancel
				return null;
		}
		
		return seri;
	}

}
