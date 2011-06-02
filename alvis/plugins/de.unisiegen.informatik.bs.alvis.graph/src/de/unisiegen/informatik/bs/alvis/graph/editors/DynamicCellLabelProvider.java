/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.editors;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;

/**
 * @author simon
 *
 */
public class DynamicCellLabelProvider extends CellLabelProvider {

	private int row;
	
	public DynamicCellLabelProvider(int row) {
		super();
		this.row = row;
	}
	
	public void update(ViewerCell cell) {
		cell.setText(((String[])cell.getElement())[row]);
	}

}
