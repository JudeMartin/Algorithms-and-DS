/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-21-generics */
package OLD.HackerRank.ThirtyDaysChallenge.u;

public class Day21 {
	class Printer {
		Printer() {

		}

		public <E> void printArray(E[] arry) {
			for (E ar : arry) {
				System.out.println(ar);
			}
		}

	}

}
