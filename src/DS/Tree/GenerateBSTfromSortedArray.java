package DS.Tree;

public class GenerateBSTfromSortedArray {
	public static TreeNode generateBSTfromSortedArray(int[] nums, int low, int high) {
		if(low > high) {
			return null;
		}
		int mid = low + (high - low) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = generateBSTfromSortedArray(nums, low, mid - 1);
		root.right = generateBSTfromSortedArray(nums, mid + 1, high);
		return root;
	}
	public static TreeNode generateBSTfromSortedArray(int[] nums) {
		return generateBSTfromSortedArray(nums, 0, nums.length - 1);
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		TreeNode result = generateBSTfromSortedArray(nums);
		System.out.println(result);
	}
}
