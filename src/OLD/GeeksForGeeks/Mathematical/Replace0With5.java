/* http://geeksquiz.com/replace-0-5-input-integer/ */
package GeeksForGeeks.Mathematical;

import java.util.Scanner;

public class Replace0With5 {

	public int replace5With0(int num) {
		int d = 1;
		int result = 0;
		while (num > 0) {

			int carry = num % 10;
			if (carry == 0) {
				carry = 5;
			}
			result = (carry * d) + result;
			d *= 10;
			num = num / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		Replace0With5 rep = new Replace0With5();
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println("The number before replacing is: " + num);
		System.out.println("The number after replacing is: "
				+ rep.replace5With0(num));
	}
}
// keep a track of the units places using variable d
