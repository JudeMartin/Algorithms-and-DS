package DS.GeeksForGeeks.Array;

import java.util.HashMap;
import java.util.Map;

public class OddElement {
	//O(n^2) time complexity
	public static int findOddElement1(int[] arr) {
		int res = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() % 2 != 0){
				res = entry.getKey();
			}
		}
		return res;
	}
	//O(n) complexity
	public static int findOddElement2(int[] arr) {
		int res = 0;
		for(int a : arr) {
			res = res ^ a;
		}
		return res; 
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,3,1,3 };
		System.out.println("The element occuring odd number of times: " + findOddElement1(arr));
		System.out.println("The element occuring odd number of times: " +findOddElement2(arr));
	}
}
