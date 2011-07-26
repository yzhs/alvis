/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.editors;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.antlr.runtime.RecognitionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.AnnotationModel;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionAnnotation;
import org.eclipse.jface.text.source.projection.ProjectionAnnotationModel;
import org.eclipse.jface.text.source.projection.ProjectionSupport;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.texteditor.AbstractDecoratedTextEditor;

import de.unisiegen.informatik.bs.alvis.Activator;
import de.unisiegen.informatik.bs.alvis.compiler.CompilerAccess;
import de.unisiegen.informatik.bs.alvis.extensionpoints.IExportItem;

/**
 * @author Eduard Boos
 * 
 */
public class AlgorithmEditor extends AbstractDecoratedTextEditor implements
		IExportItem {

	/**
	 * 
	 */
	private ProjectionAnnotationModel annotationModel;
	private ProjectionSupport projectionSupport;
	private Annotation[] oldAnnotations;
	private ArrayList<Position> fPositions = new ArrayList<Position>();
	private ArrayList<Position> oldList = new ArrayList<Position>();

	/**
	 * 
	 */
	public AlgorithmEditor() {

		// Activator.getDefault().registerExport(this);
		// Activator.getDefault().getWorkbench().getEditorRegistry().

		PlatformUI.getWorkbench().getDisplay();
		Color highlightColor = new Color(Display.getCurrent(), new RGB(111, 33,
				152));
		/** filling Tokens to highlight */

		ArrayList<String> highlightTokens = new ArrayList<String>();
		String[] proposals = { "abstract", "boolean", "break", "byte", "case",
				"catch", "char", "class", "continue", "default", "do",
				"double", "else", "extends", "false", "final", "finally",
				"float", "for", "if", "implements", "import", "instanceof",
				"int", "interface", "long", "native", "new", "null", "package",
				"private", "protected", "public", "return", "short", "static",
				"super", "switch", "synchronized", "this", "throw", "throws",
				"transient", "true", "try", "void", "volatile", "while" };
		for (String proposal : proposals) {
			highlightTokens.add(proposal);
		}
		/** endof filling */

		AlgorithmEditorSourceViewerConfiguration sourceViewerConfiguration = new AlgorithmEditorSourceViewerConfiguration(
				highlightColor, highlightTokens);
		setSourceViewerConfiguration(sourceViewerConfiguration);
		setDocumentProvider(new AlgorithmDocumentProvider());
	}

	/**
	 * Returns the Editors TextWidget
	 * 
	 * @return the StyledText represented by the TextWidget
	 */
	public StyledText getTextWidget() {
		return getSourceViewer().getTextWidget();
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		ProjectionViewer viewer = (ProjectionViewer) getSourceViewer();
		projectionSupport = new ProjectionSupport(viewer,
				getAnnotationAccess(), getSharedColors());
		projectionSupport.install();

		// turn projection mode on
		viewer.doOperation(ProjectionViewer.TOGGLE);

		annotationModel = viewer.getProjectionAnnotationModel();
//		CompilerAccess.getDefault().setDatatypePackages(Activator.getDefault().getAllDatatypesPackagesInPlugIns());
//		CompilerAccess.getDefault().setDatatypes(Activator.getDefault().getAllDatatypesInPlugIns());
//		IFileEditorInput input = (IFileEditorInput) getEditorInput();
//		try {
//			CompilerAccess.getDefault().compile(input.getFile().getRawLocation().toString(),true);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (RecognitionException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent,
			IVerticalRuler ruler, int styles) {
		ISourceViewer viewer = new ProjectionViewer(parent, ruler,
				getOverviewRuler(), isOverviewRulerVisible(), styles);

		// ensure decoration support has been created and configured.
		getSourceViewerDecorationSupport(viewer).install(getPreferenceStore());

		return viewer;
	}

	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		super.doSave(progressMonitor);
		// TODO rethink the calling of these two methods, to better "timings"
		calculatePositions();
		markErrors();		

	}

	/**
	 * this method is temporary for update the folding structure until the
	 * compiler frontend is created
	 * 
	 * @param positions
	 */
	public void updateFoldingStructure(ArrayList<Position> positions) {
		Annotation[] annotations = new Annotation[positions.size()];

		// this will hold the new annotations along
		// with their corresponding positions
		HashMap<ProjectionAnnotation, Position> newAnnotations = new HashMap<ProjectionAnnotation, Position>();

		for (int i = 0; i < positions.size(); i++) {
			ProjectionAnnotation annotation = new ProjectionAnnotation(true);

			newAnnotations.put(annotation, positions.get(i));

			annotations[i] = annotation;
		}

		annotationModel.modifyAnnotations(oldAnnotations, newAnnotations, null);

		oldAnnotations = annotations;
	}

	/**
	 * this method is temporary until the compiler frontend is created, it will
	 * calculate and add the ProjectionsAnnotations for the folding feature
	 */
	protected void calculatePositions() {
		final AlgorithmEditor editor = this;
		try {
			ITypedRegion[] partitions = getSourceViewer().getDocument()
					.computePartitioning(0,
							getSourceViewer().getDocument().getLength());
			for (ITypedRegion region : partitions) {
				if (region.getType().equals(
						AlgorithmPartitionScanner.MULTILINE_COMMENT)
						|| region.getType().equals(
								AlgorithmPartitionScanner.BEGIN_END)) {
					if (fPositions.contains(region)) {

					} else {

						@SuppressWarnings("unchecked")
						Iterator<Annotation> iter = annotationModel
								.getAnnotationIterator();
						while (iter.hasNext()) {
							Annotation currAnnotation = iter.next();
							if (currAnnotation.getType().equals(
									ProjectionAnnotation.TYPE))
								;
							{
								// this is how to get the information, whether
								// folding area is collapsed(folded).
								((ProjectionAnnotation) currAnnotation)
										.isCollapsed();
							}
						}
						fPositions.add(new Position(region.getOffset(), region
								.getLength() + 1));
						oldList.add(new Position(region.getOffset(), region
								.getLength() + 1));

					}
				}
			}
		} catch (BadLocationException e) {
		}
		Display.getDefault().asyncExec(new Runnable() {
			@Override
			public void run() {
				editor.updateFoldingStructure(oldList);
			}

		});
	}

	/**
	 * This method will delegate the call to AlgorithmErrorMarker and mark the
	 * file/document opened by the editor
	 */
	protected void markErrors() {
		AlgorithmErrorMarker errorMarker = new AlgorithmErrorMarker(
				getInputFile(), getSourceViewer().getDocument());
		errorMarker.markErrors();
	}

	/**
	 * return the input File for the Editor
	 * 
	 * @return the IFile representing the input File for the Editor
	 */
	protected IFile getInputFile() {
		IFileEditorInput fileEditorInput = (IFileEditorInput) getEditorInput();
		IFile file = fileEditorInput.getFile();
		return file;
	}

	@Override
	public Image getImage() {
		// no image in this editor
		return null;
	}

	public AnnotationModel getAnnotationModel() {
		return annotationModel;
	}

	@Override
	public boolean isRun() {
		return false;
	}

	@Override
	public StyledText getSourceCode() {
		return null;
	}
}
