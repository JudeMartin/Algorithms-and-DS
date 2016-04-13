/* https://www.hackerrank.com/challenges/a-very-big-sum */

package OLD.HackerRank.Algorithms.warmup;

import java.util.Scanner;

public class AVeryBigSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		long total = 0;
		for (int k : arr) {
			total += (long) k;
		}
		System.out.println(total);
	}
}
