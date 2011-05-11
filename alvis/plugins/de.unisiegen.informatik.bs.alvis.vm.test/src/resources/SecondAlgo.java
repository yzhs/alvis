package resources;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;

public class SecondAlgo extends AbstractAlgo {
	public SecondAlgo(ArrayList<PseudoCodeObject> parameters) {
		System.out.println("hello world");
	}
	
	@Override
	public ArrayList<PseudoCodeObject> getRunningRef() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static ArrayList<PseudoCodeObject> getStartParameters() {
		ArrayList<PseudoCodeObject> result = new ArrayList<PseudoCodeObject>();
		result.add(PseudoCodeInteger.getNull());
		return result;
	}
	
	@Override
	public void run() {
		
	}
}
