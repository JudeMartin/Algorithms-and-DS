/* http://www.geeksforgeeks.org/write-an-efficient-method-to-check-if-a-number-is-multiple-of-3/ */
package GeeksForGeeks.Mathematical;

public class Multipleof3 {

	// without the modulo operator
	// essentially the modulo operator using
	//just int subtraction and division.
	public boolean isMuplitpleOf3(int n) {
		return (n - 3 * (n / 3)) == 0;
	}
	public static void main(String[] args) {
		Multipleof3 mo3 = new Multipleof3();
		int n = 271;
		if (mo3.isMuplitpleOf3(n)) {
			System.out.println("The given number is divisible by 3:");
		} else {
			System.out.println("!true");
		}
	}
}
