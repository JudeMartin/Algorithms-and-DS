package CaveOfProgramming.Collections;

import java.util.ArrayList;
import java.util.List;

public class ATutorialArrayList {
	public static void main(String[] args) {
		/* Declaring as List interface and ArrayList implementation */
		List<Integer> arrayList = new ArrayList<>();

		/* adding */
		arrayList.add(1);
		arrayList.add(21);
		arrayList.add(31);
		arrayList.add(51);

		/* retrieving */
		System.out.println(arrayList.get(2) + "\n");

		/* iteration with indexes */
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println("\n");

		/* iteration without indexes */
		for (Integer value : arrayList) {
			System.out.print(value + " ");
		}

		/* removing */
		/* very slow -> removing the first item */
		arrayList.remove(0);
		/* careful -> removing the last item */
		arrayList.remove(arrayList.size() - 1);
	}
}
