/*
 * Copyright (c) 2011 Dominik Dingel
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in the
 * Software without restriction, including without limitation the rights to use, 
 * copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the 
 * Software, and to permit persons to whom the Software is furnished to do so, 
 * subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A 
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT 
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION 
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE 
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package de.unisiegen.informatik.bs.alvis.graph.datatypes;

import java.util.ArrayList;

import de.unisiegen.informatik.bs.alvis.primitive.datatypes.GraphicalRepresentation;

/**
 * 
 * @author Dominik Dingel
 * 
 */

public interface GraphicalRepresentationGraph extends GraphicalRepresentation {
	/**
	 * 
	 * @return a List of the Vertices from the graph
	 */
	public ArrayList<GraphicalRepresentationVertex> getVertex();

	/**
	 * currently unused method to allow manipulation of the complete graph
	 * object
	 * 
	 * if the pseudocode would modify the list of vertices it could be replaced
	 * by vertToSet
	 * 
	 * @param vertToSet
	 */
	public void setVertices(ArrayList<GraphicalRepresentationVertex> vertToSet);

	/**
	 * currently unused method to allow manipulation of the complete graph
	 * object
	 * 
	 * if the pseudocode would modify the list of edges (remove, add) the pc
	 * graoh could communicate this information by replacing the currently saved
	 * list of graph with edgeToSet
	 * 
	 * @param edgeToSet
	 */
	public void setEdges(ArrayList<GraphicalRepresentationEdge> edgeToSet);

	/**
	 * 
	 * @return a List of the Edges from the graph
	 */
	public ArrayList<GraphicalRepresentationEdge> getEdges();
}
