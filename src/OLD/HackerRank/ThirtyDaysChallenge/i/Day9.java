/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-9-recursion */
package OLD.HackerRank.ThirtyDaysChallenge.i;

import java.util.Scanner;

public class Day9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = find_gcd(a, b);
		System.out.println(gcd);
		int gcdEuclid = find_gcd_euclid_style(a, b);
		System.out.println(gcdEuclid);
	}

	/* Dikstra's Algorithm for GCD */
	/* keep subracting the numbers */
	static int find_gcd(int a, int b) {
		// Write the base condition
		if (a == b) {
			return a;
		} else if (a > b) {
			return find_gcd(a - b, b);
		} else {
			return find_gcd(a, b - a);
		}
	}

	/* euclid's algorithm */
	/* % operation = Euclid */
	static int find_gcd_euclid_style(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		if (max % min == 0) {
			return min;
		} else {
			return find_gcd_euclid_style(min, max % min);
		}
	}
}
