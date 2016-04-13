/* https://github.com/mission-peace/interview/blob/master/src/com/interview/graph/DisjointSet.java */
/* DisjointSet: using Path Compression and Union by rank*/
package OLD.MissionPeace.Graph;

import java.util.HashMap;
import java.util.Map;

public class DisjointSet {

	Map<Long, Node> map = new HashMap<Long, Node>();

	/* representation of a single vertex in the set */
	class Node {
		long data;
		int rank;
		Node parent;

	}
	/* add all the nodes to individual sets,initialize all the values and put to map */
	
	void makeSet(long data) {
		Node node = new Node();
		node.data = data;
		node.parent = node;
		node.rank = 0;
		map.put(data, node);
	}

	void union(long id1, long id2) {
		/* get the nodes */
		Node node1 = map.get(id1);
		Node node2 = map.get(id2);
		/* get the parents to compare their data */
		Node parent1 = findSet(node1);
		Node parent2 = findSet(node2);
		/* same set */
		if (parent1.data == parent2.data) {
			return;
		}
		/* different set */
		if (parent1.rank >= parent2.rank) {
			// increment rank only if both sets have same rank
			/* same rank - increment rank */
			parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1
					: parent1.rank;
			parent2.parent = parent1;
		} else {
			/* parent 2 has higher rank */
			parent1.parent = parent2;
		}
	}

	long findSet(long data) {
		/* to compare the nodes */
		return findSet(map.get(data)).data;
	}

	Node findSet(Node node) {
		/* the node should point to itself - till then assign the parent node and recurse  */
		Node parent = node.parent;
		if (parent == node) {
			return parent;
		}
		/* got the parent */
		node.parent = findSet(node.parent);
		return node.parent;
	}

	public static void main(String[] args) {
		DisjointSet ds = new DisjointSet();
		ds.makeSet(1);
		ds.makeSet(2);
		ds.makeSet(3);
		ds.makeSet(4);
		ds.makeSet(5);
		ds.makeSet(6);
		ds.makeSet(7);

		ds.union(1, 2);
		ds.union(2, 3);
		ds.union(4, 5);
		ds.union(6, 7);
		ds.union(5, 6);
		ds.union(3, 7);

		System.out.println(ds.findSet(1));
		System.out.println(ds.findSet(2));
		System.out.println(ds.findSet(3));
		System.out.println(ds.findSet(4));
		System.out.println(ds.findSet(5));
		System.out.println(ds.findSet(6));
		System.out.println(ds.findSet(7));

	}
}

/* Algorithm: 
 * Disjoint DataStructure: Supports three operations: 
 * 1) makeSet(long value) - create a set with single elements 
 *   a) make n sets each with one vertex for the all the given elements 
 * 2) union(id1,id2) - combines two set's 
 *   a) if the rank of both the parents are same them after union increment the rank by one. 
 *   b) if the ranks are different then the new rank will the highest rank among the 2 parents
 * 3) findSet(id) - returns the parent in the hierarchy
 */

/*
 *Notes:
 *  The reason we have multiple findSet methods - is to do optimization called PATH COMPRESSION.  
 *  we assign the parent to all the individual nodes in the findSet , to reduce the DEPTH OF THE TREE.
 *  compression occures in the findSet()
 * */
 