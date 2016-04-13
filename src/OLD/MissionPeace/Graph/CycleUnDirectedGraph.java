/* find the cycle in a graph that is not directed *
/
/* 1) using Disjoint Sets , 2) Using DFS */

/*  */
package OLD.MissionPeace.Graph;

public class CycleUnDirectedGraph<T> {

	boolean checkCycleUsingDisjointSet(Graph<Integer> graph) {

		DisjointSet ds = new DisjointSet();
		
		for (Vertex<Integer> vertex : graph.getAllVertices()) { /* store all the vertices as individual set's */
			ds.makeSet(vertex.getId());
		}
		for (Edge<Integer> edge : graph.getAllEdges()) {
			long parent1 = ds.findSet(edge.getVertex1().getId()); /* get all the edges */
			long parent2 = ds.findSet(edge.getVertex2().getId()); /* get the 2 parent's Id's from the edges */

			if (parent1 == parent2) { 	/* same Disjoint Set */
				return true;
			} else {
				
				ds.union(edge.getVertex1().getId(), edge.getVertex2().getId()); /* not in the same Set, hence union the Id's */
			}
		}
		return false;
	}

	public static void main(String[] args) {
		CycleUnDirectedGraph<Integer> cycle = new CycleUnDirectedGraph<Integer>();
		Graph<Integer> graph = new Graph<Integer>(false);
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		graph.addEdge(4, 5);
		graph.addEdge(5, 1);
		System.out.println("The Graph contains cycle: "
				+ cycle.checkCycleUsingDisjointSet(graph));
	}
}
/*
 * Algorithm: a) add all the nodes of the graph to individual single set's using
 * makeSet()  b) For all the vertices in the graph do a union, 
 *               1)If their parents match then there is a cycle
 */
/*
 * Notes: order of calling the methods
 *  makeSet - add all the individual nodes, ---> getAllVertices() 
 *  findSet - check for id's if match return true ,  -----> getAllEdges()
 *  unioun the id's if no match 
 *  
 *       
 * 
 * */
 