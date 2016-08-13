package DS.Array;

public class FindDuplicates {
	public static void findDuplicates(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] > 0) {
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			} else {
				System.out.println("The element repeating is: "
						+ Math.abs(arr[i]));
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 5, 6, 7, 8, 1, 3 };
		
		findDuplicates(arr);

	}
}
