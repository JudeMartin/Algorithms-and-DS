/* https://www.hackerrank.com/challenges/simple-array-sum */

package OLD.HackerRank.Algorithms.warmup;

import java.util.Scanner;

public class SimpleArraySum {
	public static void main(String[] args) {
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		for (int j : arr) {
			sum += j;
		}
		System.out.println(sum);
	}
}
