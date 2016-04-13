package OLD.MissionPeace.Tutorials;

import java.util.Arrays;

public class CheckValidSum {
	public boolean isValidSumTarget(int[] arr, int target) {

		if (arr.length == 0 || arr == null) {
			return false;
		}

		for (int i = 0; i < arr.length; i++) {
			int j = i + 1;
			int k = arr.length - 1;
			while (j < k) {
				if (arr[i] + arr[j] + arr[k] == target) {
					return true;
				} else if (arr[i] + arr[j] + arr[k] < target) {
					j++;
				} else {
					k--;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int arr[] = { -1, 0, 1, 2, -1, -4 };
		int target = -6;
		System.out.println("The array before sorting : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		Arrays.sort(arr);
		System.out.println("\n" + "The array after sorting : ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		CheckValidSum cvs = new CheckValidSum();
		System.out.println("\n" + "Given target " + target);
		System.out.println("There is a target exists in the array: " + cvs.isValidSumTarget(arr, target));
	}
}
