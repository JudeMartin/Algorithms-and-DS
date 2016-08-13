package DS.Array;
/* https://leetcode.com/problems/sort-colors/ */
public class SortColors {
    public void sortColors(int[] A) {
     int low = 0,mid = 0, high = A.length - 1;
     while(mid <= high){
             if (A[mid] == 1) {
                 mid++;
             } else if (A[mid] == 0) {
                 swap(A, mid, low);
                 low++;
                 mid++;
             } else if (A[mid] == 2) {
                 swap(A,mid,high);
                 high--;
                 
                 
             }
         
         }    
     }
     public void swap(int[] A, int a, int b) {
         int temp = A[a];
         A[a] = A[b];
         A[b] = temp;
     }
}
