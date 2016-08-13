/* http://www.geeksforgeeks.org/square-root-of-a-perfect-square/ */

package DS.Math;

/* babylonian method */

public class MathSqrtImplementation {

	public float generateSqrt(float n) {
		float x = n;
		float y = 1;
		float e = (float) 0.000001;

		while (x - y > e) {
			x = (x + y) / 2;
			y = n / x;
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("************** Generating Sqrt using Babylaon Method ***********");
		System.out.println();
		MathSqrtImplementation mi = new MathSqrtImplementation();
		int num = 49;
		float res = mi.generateSqrt(num);
		System.out.println("The Square Root of " + num + " is " + res);
	}
}
/*
 * idea is to take a number closer to the given number , x as the given number
 * average of the x and y get y closer to x;
 */