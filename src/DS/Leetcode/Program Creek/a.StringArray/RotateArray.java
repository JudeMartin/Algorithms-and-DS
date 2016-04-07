package a.StringArray;

/**
 * Created by jude on 4/6/16.
 */
public class RotateArray {

    public void rotateArray(int[] arr, int k) {
        k = k % arr.length;

        if(arr== null || k < 0){
            throw new IllegalArgumentException("Illegal Argument");
        }
        /* subtract from length to make the window size large to get the last elements to front  */
        /* just use a = k to make smaller window size and maintain the front elements in front */

        int a = arr.length - k; /* get the window size for reverse */
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

    }

    public void reverse(int[] arr, int left, int right){


        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public void printArr(int[] arr){
        for(int a : arr){
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {

        RotateArray ra = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 2;
        ra.rotateArray(arr,k);/* 8 9 1 2 3 4 5 6 7 */
        ra.printArr(arr);
    }
}
