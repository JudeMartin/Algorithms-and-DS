/*  https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops */
package OLD.HackerRank.ThirtyDaysChallenge.e;

import java.util.Scanner;

public class fDay5 {
	public static void looping(int a, int b, int N) {
		int sum = a;
		for (int i = 0; i < N; i++) {
			sum += ((int) Math.pow(2, i) * b);
			System.out.print(sum + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int numberOfTestCases = scn.nextInt();
		while (numberOfTestCases > 0) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			int N = scn.nextInt();
			looping(a, b, N);
			numberOfTestCases--;
		}
	}
}
