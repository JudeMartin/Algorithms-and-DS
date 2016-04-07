/* http://www.geeksforgeeks.org/write-you-own-power-without-using-multiplication-and-division/ */
/* DOSENT WORK FOR DOUBLE ONLY FOR INT'S */
package GeeksForGeeks.Mathematical;

public class Pow {
	int pow(int a, int b) {
		int res = a;
		int inc = a;
		for (int i = 1; i < b; i++) {
			for (int j = 1; j < a; j++) {
				res += inc;
			}
			inc = res;
		}
		return res;
	}

	public static void main(String[] args) {
		Pow p = new Pow();
		double res = p.pow(2, 3);
		System.out.println(res);
	}
}