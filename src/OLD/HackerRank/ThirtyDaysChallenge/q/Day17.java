/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-17-exceptions */
package OLD.HackerRank.ThirtyDaysChallenge.q;

public class Day17 {
	class Calculator {
		Calculator() {

		}

		int power(int n, int p) throws Exception {
			if (n < 0 || p < 0) {
				throw new Exception("n and p should be non-negative");
			}

			return (int) Math.pow(n, p);
		}
	}
}
