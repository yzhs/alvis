package de.unisiegen.informatik.bs.alvis.virtualmachine;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.datatypes.Datatype;
import de.unisiegen.informatik.bs.alvis.datatypes.Graph;
import de.unisiegen.informatik.bs.alvis.datatypes.Queue;
import de.unisiegen.informatik.bs.alvis.datatypes.SortableCollection;
import de.unisiegen.informatik.bs.alvis.datatypes.Vertex;

// 
public class Algo extends AbstractAlgo {

	// running Variables
	private Vertex v;
	private Queue Q;
	private Vertex u;
	private Vertex endVertex;

	// Parameters
	private Graph G;
	private Vertex s;

	public Algo(ArrayList<Datatype> parameters) {
		bplisten = null;
		dplisten = null;
		onBreak = false;
		endVertex = null;
		G = (Graph) parameters.get(0);
		s = (Vertex) parameters.get(1);
		if (parameters.size() > 2) {
			endVertex = (Vertex) parameters.get(2);
		}
		v = null;
		Q = new Queue();
		u = null;
	}

	public ArrayList<Datatype> getRunningRef() {
		ArrayList<Datatype> result = new ArrayList<Datatype>();
		result.add(G);
		result.add(s);
		result.add(v);
		result.add(Q);
		result.add(u);
		return result;
	}

	public void run() {
		for (int i = 0; i < G.getVertices().size(); i++) {
			v = G.getVertices().get(i);
			v.setColor("white");
			v.setDistanceToInfty();
			v.setParentId(null);
		}
		s.setColor("grey");
		this.reachedBreakPoint(1);
		s.setDistance(0);
		Q.enqueue(s);
		while (!Q.isEmpty()) {
			u = (Vertex) Q.dequeue();
				dplisten.onDecisionPoint(0,
						(SortableCollection) u.getAdjacents());
				for (int i = 0; i < u.getAdjacents().size(); i++) {
					v = u.getAdjacents().get(i);
					if (v.equals(endVertex)) {
						v.setColor("green");
						return;
					}
					if (v.getColor().equals("white")) {
						v.setColor("grey");
						this.reachedBreakPoint(2);
						v.setDistance(u.getDistance() + 1);
						v.setParentId(u);
						Q.enqueue(v);
					}
				
			}
		}
	}
}
