/* http://www.geeksforgeeks.org/write-a-c-program-that-given-a-set-a-of-n-numbers-and-another-number-x-determines-whether-or-not-there-exist-two-elements-in-s-whose-sum-is-exactly-x/ */
package DS.Random;

// Binary Search variant
public class TwoSumArray {
	public boolean twoSum(int[] arr, int sum) {

		if (arr == null || arr.length == 0) {
			return false;
		}

		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			if (arr[low] + arr[high] == sum) {
				return true;
			}
			if (arr[low] + arr[high] > sum) {
				high--;
			}
			if (arr[low] + arr[high] < sum) {
				low++;
			}

		}

		return null != null;
	}

	public static void displayElements(int a[]) {
		System.out.println("The Elements of the array are:");
		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i] + ",");
		}
		System.out.print("]");
		System.out.println("");
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		displayElements(arr);
		int sum = 11;
		TwoSumArray tSA = new TwoSumArray();
		System.out.println(tSA.twoSum(arr, sum) ? "Yes the sum: " + sum
				+ " exists" : "No the sum: " + sum + " does not exist");
	}
}
