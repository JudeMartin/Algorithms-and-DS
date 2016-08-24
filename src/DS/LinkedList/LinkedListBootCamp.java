package DS.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class LinkedListBootCamp {
	public static void main(String[] args) {
		// using the collection's
		List<Integer> q = new LinkedList<>();
		q.add(4);
		q.add(3);
		q.add(1);
		q.add(112);
		q.add(72);
		q.add(22);
		q.add(52);
		q.add(22);
		q.add(3);
		System.out.println(q.toString());
		// add another element at the given index
		q.add(2,314);
		// return the index of the element
		System.out.println(q.indexOf(4));
		// check if the list is empty
		System.out.println(q.isEmpty());
		// check if the value exits
		System.out.println(q.contains(2.71));
		// update at the position , value
		q.set(0,1);
		System.out.println(q.toString());
		// generate a smaller list with the second index - 1 
		System.out.println(q.subList(0,2));
		//Sort the Linked List
		Collections.sort(q);
		System.out.println(q.toString());
	}
}
// indexOf(), isEmpty(), removeAll, retainAll(), add(), addAll(), clear(), contains(), get(), set(),   