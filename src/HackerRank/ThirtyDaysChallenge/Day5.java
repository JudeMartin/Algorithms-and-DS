/*  https://www.hackerrank.com/contests/30-days-of-code/challenges/day-5-loops */
package HackerRank.ThirtyDaysChallenge;

import java.util.Scanner;

public class Day5 {
	public void looping(int a, int b, int N) {
		/*int sum = a;
		for (int i = 0; i < N; i++) {
			sum += ((int) Math.pow(2, i) * b);
			System.out.print(sum + " ");
		}
		
		*/
		
	}

	public static void main(String[] args) {
		/*Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int N = scn.nextInt();
		Day5 dy5 = new Day5();
		dy5.looping(a, b, N);*/
		Scanner s = new Scanner(System.in);
		for (int i = 0,c = s.nextInt(); i < c; ++i) {
             for (int k=0,a=s.nextInt(),b=s.nextInt(),n=s.nextInt(); k<n ;++k)
               System.out.print((a += b * (int)Math.pow(2, k)) + " ");
               System.out.println();
         }
	}
}