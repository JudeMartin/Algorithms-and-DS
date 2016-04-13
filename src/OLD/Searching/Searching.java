package OLD.Searching;
/*
 * If there is a match return corresponding element else return 0 
 **/
public class Searching {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,5,6};
		int key = 2;
		System.out.println("At the position"+" => "+iterativeBinarySearch(a, key));
	}
	public static int iterativeBinarySearch(int[] a,int key){
		int low=0,high=a.length-1,mid=0;
		while(low<=high){
			mid = (low+high)/2;
			if(key>a[mid]){
				low = mid+1;
			}else if(key< a[mid]){
				high = mid-1;
			} else if(a[mid]==key) return mid;
		}
		return 0;
	}
	void RecursiveBinarySearch(int[] ary, int n){
	}
	public static int linearSearch(int[] ary,int n){
		for (int i = 0; i < ary.length; i++) {
			if(ary[i] == n){
				return ary[i];
			}
		}
		return 0;
	}
}

