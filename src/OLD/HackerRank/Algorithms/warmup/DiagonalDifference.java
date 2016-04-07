/* https://www.hackerrank.com/challenges/diagonal-difference */

package HackerRank.Algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int principalDiag = 0;
		int remDiag = 0;
		int a[][] = new int[n][n];

		/* Main Diagonal */

		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
				if (a_i == a_j) {
					principalDiag += a[a_i][a_j];
				}
			}
		}

		/* Secondary Diagonal */

		for (int i = 0, j = a[i].length - 1; i < a.length; i++, j--) {
			remDiag += a[i][j];
		}

		/* Absolute Difference */

		System.out.println(Math.abs(principalDiag - remDiag));
	}
}
