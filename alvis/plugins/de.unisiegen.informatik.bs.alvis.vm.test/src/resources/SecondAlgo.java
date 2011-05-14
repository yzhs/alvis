package resources;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeInteger;
import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class SecondAlgo implements AbstractAlgo {
	public SecondAlgo() {
	}

	@Override
	public void run() {

	}

	@Override
	public ArrayList<PseudoCodeObject> getVariableReferences() {
		return null;
	}

	@Override
	public ArrayList<PseudoCodeObject> getParameterTypes() {
		ArrayList<PseudoCodeObject> result = new ArrayList<PseudoCodeObject>();
		result.add(PseudoCodeInteger.getNull());
		return result;
	}

	@Override
	public void setParameters(ArrayList<PseudoCodeObject> paras) {
	}

	@Override
	public void addBPListener(BPListener wantToListen) {
	}

	@Override
	public void addDPListener(DPListener wantToListen) {
	}

	@Override
	public void stopBreak() {
	}
}
