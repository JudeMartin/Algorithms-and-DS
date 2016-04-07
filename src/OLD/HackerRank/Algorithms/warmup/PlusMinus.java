/* https://www.hackerrank.com/challenges/plus-minus */

package HackerRank.Algorithms.warmup;

import java.util.Scanner;

public class PlusMinus {
	public static void plusMinus(int[] arr) {

		double positive = 0;
		double negative = 0;
		double zero = 0;

		for (int i : arr) {
			if (i == 0) {
				zero++;
			}
			if (i > 0) {
				positive++;
			}
			if (i < 0) {
				negative++;
			}
		}

		System.out.println(positive / arr.length);
		System.out.println(negative / arr.length);
		System.out.println(zero / arr.length);

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		plusMinus(arr);
	}
}
