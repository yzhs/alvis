/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.ui.navigator.views;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.navigator.IDescriptionProvider;

import de.unisiegen.informatik.bs.alvis.ui.navigator.Activator;


/**
 * The AlvisLabelProvider implements the ILabelProvider Interface to
 * contribute alvis specific icons to the navigator.
 * 
 * @author Eduard Boos
 * 
 */
public class AlvisLabelProvider extends WorkbenchLabelProvider implements
		ILabelProvider, IDescriptionProvider {

	@Override
	public void addListener(ILabelProviderListener listener) {
		super.addListener(listener);

	}

	@Override
	public void dispose() {
		super.dispose();

	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return super.isLabelProperty(element, property);
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		super.removeListener(listener);

	}

	@Override
	public String getDescription(Object anElement) {
		if (anElement instanceof IResource) {
			return ((IResource) anElement).getFullPath().makeRelative()
					.toString();
		}
		return null;
	}

	@Override
	protected ImageDescriptor decorateImage(ImageDescriptor input,
			Object element) {
			if (element instanceof IProject) {
			IProject project = (IProject) element;
			IFolder src = project.getFolder(new Path("src")); //$NON-NLS-1$
			IFolder data = project.getFolder(new Path("data")); //$NON-NLS-1$
			if (src.exists() && data.exists()) {
				input = ImageDescriptor.createFromURL(FileLocator.find(
						Activator.getDefault().getBundle(), new Path(
								"icons/navigator/alvis_project.png"), null)); //$NON-NLS-1$
			}
		}
		return super.decorateImage(input, element);
	}
}
