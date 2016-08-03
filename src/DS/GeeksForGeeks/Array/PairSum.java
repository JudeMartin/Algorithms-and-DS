package DS.GeeksForGeeks.Array;

public class PairSum {
	public static final int MAX = 100000;
	public void checkPairs(int[] arr, int sum) {
		boolean[] boolArr = new boolean[MAX];
		for(int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if(temp >= 0 && boolArr[temp]) {
				System.out.println("Pair in the arr with the Sum " + sum + " exits (" + temp + ", " +arr[i] +")");
			}
			boolArr[arr[i]] = true;
		}
	}

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int n = 16;
		PairSum ps = new PairSum();
		ps.checkPairs(A, n);
	}
}
