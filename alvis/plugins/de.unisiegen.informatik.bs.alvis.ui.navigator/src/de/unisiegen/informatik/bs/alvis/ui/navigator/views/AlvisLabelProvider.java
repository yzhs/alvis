/**
 * The AlvisLabelProvider implements the ILabelProvider Interface to
 * add the icons in the alvis navigator.
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
			IFolder src = project.getFolder(new Path("src"));
			IFolder data = project.getFolder(new Path("data"));
			if (src.exists() && data.exists()) {
				input = ImageDescriptor.createFromURL(FileLocator.find(
						Activator.getDefault().getBundle(), new Path(
								"icons/navigator/alvis_project.png"), null));
			}
		}
		return super.decorateImage(input, element);
	}
}
