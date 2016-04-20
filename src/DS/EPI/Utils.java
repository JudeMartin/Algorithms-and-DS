package DS.EPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Utils {
	private Random random;

	public static <T> List<List<T>> copy(List<List<T>> list) {
		List<List<T>> copy = new ArrayList<>(list.size());

		for (List<T> element : list) {
			copy.add(new ArrayList<>(element));
		}

		return copy;
	}

	public static void copy(int[] a1, int from, int to, int[] a2, int start) {
		for (int i = 0; i < to - from; i++) {
			if (start + i < a2.length) {
				a2[start + i] = a1[from + i];
			}
		}
	}

	/* print boolean array */
	public static void simplePrint(boolean[] array) {
		if(array == null || array.length == 0){
			return;
		}
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
			if (i < array.length - 1) {
				System.out.println(" ");
			}
		}
	}

	/* print int array */
	public static void simplePrint(int[] array) {
		if(array == null || array.length == 0){
			return;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if(i < array.length - 1){
				System.out.println(" ");
			}
		}
	}

	/* print collection */
	public static <T> void simplePrint(Collection<T> collection) {
		if (collection == null || collection.isEmpty()) {
			return;
		}
		for (Iterator<T> iterator = collection.iterator(); iterator.hasNext();) {
			T t = iterator.next();
			System.out.print(t);
			if (iterator.hasNext()) {
				System.out.println(" ");
			}
		}

	}

}
