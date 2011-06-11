import java.util.HashMap;
import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.*;
import de.unisiegen.informatik.bs.alvis.vm.*;
import de.unisiegen.informatik.bs.alvis.graph.datatypes.*;

public class Algorithm implements AbstractAlgo {
    private PseudoCodeGraph G;
    private PseudoCodeVertex s;

    public Algorithm(PseudoCodeGraph G, PseudoCodeVertex s) {
        this.G = G;
        this.s = s;
    }

    public void run() {
        for (PseudoCodeVertex v : G.getVertices())
            {
                v.set("color", new PCString("white"));
                v.set("distance", PCInteger.getInfty());
                v.set("pi", PseudoCodeVertex.getNull());
            }
        s.set("color", new PCString("grey"));
        insertBreakpoint(7);
        s.set("distance", new PCInteger(0));
        PCQueue Q = new PCQueue();
        Q.enqueue(s);
        while ((Q.isEmpty().not()).getLiteralValue())
            {
                PseudoCodeVertex u = new PseudoCodeVertex();
                u = Q.dequeue();
                for (PseudoCodeVertex v : u.getAdjacents())
                    if ((v.get("color").equal(new PCString("white"))).getLiteralValue())
                        {
                            v.set("color", new PCString("grey"));
                            insertBreakpoint(17);
                            v.set("distance", u.get("distance").add(new PCInteger(1)));
                            v.set("pi", u);
                            Q.enqueue(v);
                        }
            }
    }

    private void insertBreakpoint(int lin) {} // for testing purposes only

    public ArrayList<PCObject> getVariableReferences() {return null;}
    public ArrayList<PCObject> getParameterTypes() {return null;}
    public void setParameters(ArrayList<PCObject> params) {}
    public void addBPListener(BPListener wantToListen) {}
    public void addDPListener(DPListener wantToListen) {}
    public void stopBreak() {}
}