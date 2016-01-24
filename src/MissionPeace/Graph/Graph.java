/* https://github.com/mission-peace/interview/blob/master/src/com/interview/graph/Graph.java */
package MissionPeace.Graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Graph<T> {

	private List<Edge<T>> allEdges;
	private Map<Long, Vertex<T>> allVertex;
	boolean isDirected = false;

	// declare if the graph is a directed one or not during the instantiation
	public Graph(boolean isDirected) {
		allEdges = new ArrayList<Edge<T>>();
		allVertex = new HashMap<Long, Vertex<T>>();
		this.isDirected = isDirected;
	}

	public void addVertex(Vertex<T> vertex) {
		if (allVertex.containsKey(vertex.getId())) {
			return;
		}
		/* add to the vertex collection */
		allVertex.put(vertex.getId(), vertex);
		for (Edge<T> edge : allEdges) {
			/*
			 * get all the edges for the vertex and them add to the edge
			 * collection
			 */
			allEdges.add(edge);
		}
	}

	/* add a single vertex with id */
	public Vertex<T> addSingleVertex(long id) {
		if (allVertex.containsKey(id)) {
			return allVertex.get(id);
		}
		Vertex<T> v = new Vertex<T>(id);
		allVertex.put(id, v);
		return v;
	}

	// get a particular vertex
	public Vertex<T> getVertex(long id) {
		return allVertex.get(id);
	}

	/*
	 * connect vertices without weight, basically calling the addEdge methoh
	 * with (3 parameters) passing 0 as the weight
	 */

	public void addEdge(long id1, long id2) {
		addEdge(id1, id2, 0);
	}

	/* connect two vertices with the weight */
	public void addEdge(long id1, long id2, int weight) {
		Vertex<T> vertex1 = null;
		Vertex<T> vertex2 = null;
		if (allVertex.containsKey(id1)) {
			vertex1 = allVertex.get(id1);
		} else {
			vertex1 = new Vertex<T>(id1);
			allVertex.put(id1, vertex1);
		}
		if (allVertex.containsKey(id2)) {
			vertex2 = allVertex.get(id2);
		} else {
			vertex2 = new Vertex<T>(id2);
			allVertex.put(id2, vertex2);
		}
		/* add the edge with the vertices and the weight wiht the direction */
		Edge<T> edge = new Edge<T>(vertex1, vertex2, isDirected, weight);
		allEdges.add(edge);
		/* add the adajecent for a particular vertex */
		vertex1.addAdjacentVertex(vertex2, edge);
		/* not directed edge */
		if (!isDirected) {
			vertex2.addAdjacentVertex(vertex1, edge);
		}
	}

	/* Return a list of all the edges as a List */
	public List<Edge<T>> getAllEdges() {
		return allEdges;

	}

	// Return a list of all the vertices as a List
	public Collection<Vertex<T>> getAllVertices() {
		return allVertex.values();
	}

	// set the values for the specified vertex
	/* retrieve from the collection and assign the value */
	public void setDataForVertex(long id, T data) {
		if (allVertex.containsKey(id)) {
			Vertex<T> vertex = allVertex.get(id);
			vertex.setData(data);
		}
	}

	public String toString() {
		StringBuffer buffer = new StringBuffer();
		for (Edge<T> edge : getAllEdges()) {
			buffer.append(edge.getVertex1() + " " + edge.getVertex2() + " "
					+ edge.getWeight());
			buffer.append("\n");
		}
		return buffer.toString();
	}
}

class Vertex<T> {
	long id;
	private T data;
	private List<Edge<T>> edges = new ArrayList<Edge<T>>();
	private List<Vertex<T>> adjacentVertex = new ArrayList<Vertex<T>>();

	/* only one constructor , Passing the id */
	Vertex(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	/* To add a vertex, we need the actual vertex and the edge to connect to it */
	public void addAdjacentVertex(Vertex<T> v, Edge<T> e) {
		edges.add(e);
		adjacentVertex.add(v);
	}

	/* Return the list of the edges */
	public List<Edge<T>> getEdges() {
		return edges;
	}

	/* return the list of vertex */
	public List<Vertex<T>> getAdjacentVertexes() {

		return adjacentVertex;
	}

	/* size of the edges */
	public int getDegree() {
		return edges.size();
	}

	/* 3 overridden methods */
	/* Sting toString(), int hashCode(), boolean equals() */
	/* equals() = check for { null obj , same numeric value, same obj } */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Vertex other = (Vertex) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}

	@Override
	public int hashCode() {
		int result = 1;
		final int prime = 31;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
}

class Edge<T> {

	private Vertex<T> vertex1;
	private Vertex<T> vertex2;
	private int weight;
	private boolean isDirected = false;

	/* Three different Edge - constructors */
	/* 1 : vertex's only */
	/* 2 : vertex's and their direction */
	/* 3 : Vertex's, direction and the weight */
	Edge(Vertex<T> vertex1, Vertex<T> vertex2) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
	}

	Edge(Vertex<T> vertex1, Vertex<T> vertex2, boolean isDirected) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.isDirected = isDirected;
	}

	Edge(Vertex<T> vertex1, Vertex<T> vertex2, boolean isDirected, int weight) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.isDirected = isDirected;
		this.weight = weight;
	}

	// returns the first vertex
	Vertex<T> getVertex1() {
		return vertex1;
	}

	// returns the second vertex
	Vertex<T> getVertex2() {
		return vertex2;
	}

	int getWeight() {
		return weight;
	}

	// returns if the particular is a directed on or not
	public boolean isDirected() {
		return isDirected;
	}

	// check for the same hashValue
	public int hashCode() {
		return 0;
	}

	/* checks for null, same type and same numeric value */
	public boolean equals() {
		return false;
	}

	public String toString() {
		return "Edge [is Directed " + isDirected + ", vertex 1=" + vertex1
				+ ", vertex2=" + vertex2 + ", weight=" + weight + "]";

	}
}