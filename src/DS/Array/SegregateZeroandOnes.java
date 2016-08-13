package DS.Array;

import java.util.Arrays;

public class SegregateZeroandOnes {
	public static void segregateArray(int[] nums) {
		int start = 0, end = nums.length - 1;
		while(start <= end) {
			while(nums[start] == 0) {
				++start;
			}
			while(nums[end] == 1) {
				--end;
			}
			if(start < end) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				++start;
				--end;
			}
		}
	}
	public static void main(String[] args) {
		int[] nums = {1,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0};
		segregateArray(nums);
		System.out.println(Arrays.toString(nums));
	}
}
