package resources;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.PseudoCodeObject;
import de.unisiegen.informatik.bs.alvis.vm.AbstractAlgo;
import de.unisiegen.informatik.bs.alvis.vm.BPListener;
import de.unisiegen.informatik.bs.alvis.vm.DPListener;

public class FirstAlgo implements AbstractAlgo {
	public FirstAlgo() {
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
		return new ArrayList<PseudoCodeObject>();
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
