/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-14-scope-and-imports */
package HackerRank.ThirtyDaysChallenge;

public class Day14 {

	class Difference {
		private int[] elements;
		public int maximumDifference;

		Difference(int[] arry) {
			elements = arry;
			maximumDifference = 0;
		}

		void computeDifference() {
			int max = Integer.MAX_VALUE;
			int min = Integer.MIN_VALUE;
			for (int i : elements) {
				if (i < min) {
					min = i;
				}
				if (i > max) {
					max = i;
				}
			}
			maximumDifference = max - min;
		}
	}
}
