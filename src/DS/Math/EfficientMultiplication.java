/* http://www.geeksforgeeks.org/efficient-way-to-multiply-with-7/ */
package DS.Math;

public class EfficientMultiplication {
	public int efficientMultiplication(int num, int multplyBy) {
		int result = 0;
		switch (multplyBy) {
		case 2:
			result = num << 1;
			break;
		case 3:
			result = (num << 1) + num;
			break;

		case 4:
			result = num << 2;
			break;

		case 5:
			result = (num << 2) + num;
			break;

		case 6:
			result = (num << 1) + (num << 2);
			break;

		case 7:
			result = (num << 3) - num;
			break;

		case 8:
			result = num << 3;
			break;

		case 9:
			result = (num << 3) + num;
			break;

		case 10:
			result = ((num << 2) + num) + ((num << 2) + num);
			break;

		default:
			break;
		}
		return result;
	}

	public static void main(String[] args) {
		EfficientMultiplication eM = new EfficientMultiplication();
		int res = eM.efficientMultiplication(20, 10);
		System.out.println(res);
	}
}
// idea is to remember 2^1,2^2,2^3
// as left shift as 2 power x
// and the rest are easy - num and + num respectively
// 6 = 2 + 4
//