/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-19-interfaces */
package HackerRank.ThirtyDaysChallenge;

public class Day19 {
	interface AdvancedArithmetic {
		int divisorSum(int n);
	}

	class Calculator implements AdvancedArithmetic {
		public int divisorSum(int n) {
			int sum = 1 + n;
			if (n == 1) {
				return sum = 1;
			}

			for (int i = 2; i <= n - 1; i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			return sum;
		}
	}
}
