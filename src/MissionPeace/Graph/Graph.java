/* https://github.com/mission-peace/interview/blob/master/src/com/interview/graph/Graph.java */
package MissionPeace.Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	// get the edge and assign to the vertex
	public void addVertex(Vertex<T> vertex) {
	}

	// add a single vertex with id
	public void addSingleVertex(long id) {

	}

	// get a particular vertex
	public Vertex<T> getVertex(long id) {
		return null;
	}

	// * connect vertices without weight, basically calling the addEdge method
	// * with (3 parameters) passing 0 as the weight

	public void addEdge(long id1, long id2) {
		addEdge(id1, id2, 0);
	}

	// connect two vertices with the weight
	public void addEdge(long id1, long id2, int weight) {
	}

	// Return a list of all the edges as a List
	public List<Edge<T>> getAllEdges() {
		return null;
	}

	// Return a list of all the vertices as a List
	public List<Vertex<T>> getAllVertices() {
		return null;
	}

	// set the values for the specified vertex
	public void setDataForVertex(long id, T data) {

	}

	public String toString() {
		return "";
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

	/* 3 overridden methods */
	/* Sting toString(), int hashCode(), boolean equals() */
	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public String toString() {
		return "";
	}

	@Override
	public int hashCode() {
		return 0;
	}

	/* setter and getter for Data only as Id will be auto genetared */
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
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
	}

	Edge(Vertex<T> vertex1, Vertex<T> vertex2, boolean isDirected) {

	}

	Edge(Vertex<T> vertex1, Vertex<T> vertex2, boolean isDirected, int weight) {

	}

	// returns the first vertex
	Vertex<T> getVertex1() {
		return null;
	}

	// returns the second vertex
	Vertex<T> getVertex2() {
		return null;
	}

	int weight() {
		return 0;
	}

	// returns if the particular is a directed on or not
	public boolean isDirected() {
		return false;
	}

	// check for the same hashValue
	public int hashCode() {
		return 0;
	}

	// checks for null, same type and same numeric value
	public boolean equals() {
		return false;
	}

	public String toString() {
		return "";
	}
}