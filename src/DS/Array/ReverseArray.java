package DS.Array;

import java.util.Arrays;

public class ReverseArray {
	public void recursiveReverse(int[] arr, int start, int end) {
		if(start >= end) {
			return;
		}
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		recursiveReverse(arr, start + 1, end - 1);
	}
	public void iterativeReverse(int[] arr){
		for(int start = 0, end = arr.length - 1; start <= end; ++start, --end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		
	}
	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		int[] arr = {1, 2, 3, 4, 5, 6};

		System.out.println("Before Recursively Reversing array: " + Arrays.toString(arr));
		ra.recursiveReverse(arr, 0, arr.length - 1);
		System.out.println("After Recursively Reversing array: " + Arrays.toString(arr));
		
		System.out.println("Before Iteratively Reversing array: " + Arrays.toString(arr));
		ra.iterativeReverse(arr);
		System.out.println("After Iteratively Reversing array: " + Arrays.toString(arr));
	}
}
