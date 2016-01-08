/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-8-dictionaries-and-maps */
package HackerRank.ThirtyDaysChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
	@SuppressWarnings("resource")
	public static void main(String[] argh) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		in.nextLine();
		for (int i = 0; i < N; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			in.nextLine();
			map.put(name, phone);
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			if (map.containsKey(s)) {
				System.out.println(s + "=" + map.get(s));
			} else {
				System.out.println("Not found");
			}
		}
	}
}
