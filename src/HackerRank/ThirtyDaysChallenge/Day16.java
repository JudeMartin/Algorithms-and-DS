package HackerRank.ThirtyDaysChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Day16 {
	public static void main(String[] args) {
		int[] elements = getInputElements();
		int minAbsoluteValue = Integer.MAX_VALUE;
		sortInputArray(elements);
		minAbsoluteValue = generateMinAbsoluteValue(elements, minAbsoluteValue);
		printAbsoluteElements(elements, minAbsoluteValue);
	}

	private static int[] getInputElements() {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		int[] elements = new int[T];
		int i = 0;
		while (T-- > 0) {
			elements[i++] = scn.nextInt();

		}
		return elements;
	}

	private static void sortInputArray(int[] elements) {
		Arrays.sort(elements);
	}

	private static int generateMinAbsoluteValue(int[] elements, int max) {
		for (int a = 0; a < elements.length - 1; a++) {
			int b = a + 1;
			int tmp = Math.abs(elements[a] - elements[b]);
			if (tmp < max) {
				max = tmp;
			}

		}
		return max;
	}

	private static void printAbsoluteElements(int[] elements, int max) {
		for (int j = 0; j < elements.length - 1; j++) {
			int jj = j + 1;
			if (Math.abs(elements[j] - elements[jj]) == max) {
				System.out.print(elements[j] + " " + elements[jj] + " ");
			}
		}
	}

}

/*
 * 1. Array Sorted ? 2. Difference is absolute ? (Math.abs) 3. Used single loop
 * to find min. abs. difference ? 4. Used another loop to find pairs of numbers
 * having the min. difference obtained in (3) ? 5. Only consecutive elements
 * need to be checked to get the difference once the array is sorted (by obvious
 * logic).
 */
