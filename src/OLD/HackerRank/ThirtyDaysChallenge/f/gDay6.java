/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-6-lets-review */
package OLD.HackerRank.ThirtyDaysChallenge.f;

import java.util.Scanner;

public class gDay6 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			int stairs = i;
			while (stairs > 0) {
				System.out.print("#");
				stairs--;
			}
			System.out.println();
		}
	}
}
