package CaveOfProgramming.Collections;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {
	public static void main(String[] args) {
		List<Integer> aL = new ArrayList<>();
		/* add items to the ArrayList */
		aL.add(1);
		aL.add(21);
		aL.add(31);
		aL.add(41);
		/* get the value based of index */
		System.out.println(aL.get(3));

		/* for-each loop */
		System.out.println("Printing via For-Each");
		for (int i : aL) {
			System.out.print(" " + i);
		}

		/* index based iteration */
		System.out.println("\n" + "Printing via indexed based ");
		for (int j = 0; j < aL.size(); j++) {
			System.out.print(" " + aL.get(j));
		}
	}
}
