/**
 * 
 */
package de.unisiegen.informatik.bs.alvis.graph.editors;

import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;

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
	
	@Override
	public void update(ViewerCell cell) {
		String textToSet = ((String[])cell.getElement())[row];
		cell.setText(textToSet);
		if(row == 0) {
			cell.setBackground(new Color(null, 245, 245, 245));
//			cell.setFont(new Font(null,"Calibri", 10, SWT.CENTER));
		}
		else 
			cell.setFont(new Font(null,"Calibri", 12, SWT.CENTER));

	}

}
