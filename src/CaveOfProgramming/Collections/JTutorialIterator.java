package CaveOfProgramming.Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class JTutorialIterator {
	public static void main(String[] args) {
		List<String> ll = new LinkedList<>();
		ll.add("Hello");
		ll.add("Bonjour");
		ll.add("Buen Dia");
		System.out.println("*****  For Each iteration   *****");
		for(String l : ll){
			System.out.println("Printing : " + l);
		}
		System.out.println("**** Iterator -> hasNext() - boolean, next(), remove()   *******");
		System.out
				.println("------> use Iterable for removing from the List while iterating  <-------");
		Iterator<String> itr = ll.iterator();
		while (itr.hasNext()) {
			System.out.println("Printing, Removing : " + itr.next());
			itr.remove();
		}
		System.out.println("List is empty, size : " + ll.size());
		System.out
				.println("------> use ListIterator to add to the List while iterating  <-------");

	}
}
