package DS.Array;

import java.util.ArrayList;
import java.util.List;

public class Pascals2 {
	public static List<Integer> getRow(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (rowIndex < 0)
			return result;

		result.add(1);
		for (int i = 1; i <= rowIndex; i++) {
			for (int j = result.size() - 2; j >= 0; j--) {
				int temp = j + 1;
				result.set(temp, result.get(j) + result.get(temp));
			}
			result.add(1);
		}
		return result;
	}
	public static void main(String[] args) {
		List<Integer> res = getRow(3);
		System.out.println(res.toString());
	}
}
