package OLD.Arrays;
public class RotateArray {
	public static void rotateArray(int a[],int k){
		/* reverse first half 
		 * reverse second half
		 * reverse the whole array
		 * */
		reverse(a,0,k-1);
		reverse(a,k,a.length-1);
		reverse(a,0,a.length-1);
	}
	public static void reverse(int[] arr, int left,int right){
		while(left<right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	public static void displayElements(int a[]){
		System.out.print("[");
		for(int i=0;i < a.length;i++){
			System.out.print(" "+a[i]+",");
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,4,3,1,3,4,2,1};
		rotateArray(a,3);
		displayElements(a);
	}
}
