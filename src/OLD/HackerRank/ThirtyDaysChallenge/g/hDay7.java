/* https://www.hackerrank.com/contests/30-days-of-code/challenges/day-7-arrays */
package OLD.HackerRank.ThirtyDaysChallenge.g;

import java.util.Scanner;

public class hDay7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        for(int i = arr.length - 1;i >= 0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}
