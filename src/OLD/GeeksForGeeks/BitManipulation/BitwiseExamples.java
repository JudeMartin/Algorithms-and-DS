package OLD.GeeksForGeeks.BitManipulation;

public class BitwiseExamples {
	public static void main(String[] args) {
		int a = 5, b = 9; // a = 5(00000101), b = 9(00001001)
		System.out.println("a: " + a + ", b: " + b);
		System.out.println("a AND b: " + (a & b)); // The result is 00000001
		System.out.println("a OR b: " + (a | b));// // The result is 00001101
		System.out.println("a XOR b: " + (a ^ b)); // The result is 00001100
		System.out.println("NOT a: " + (a = ~a)); // The result is 11111010
		System.out.println("Left shift b by 1: " + (b << 1)); // The result is  00010010
		System.out.println("Right shift b by 1: " + (b >> 1)); // The result is 00000100
	}
}
//    a = 00000101
//    b = 00001001
//************************
//************************
//    & = 00000001
//    | = 00001101
//    ^ = 00001100
//   ~a = 11111010
// b<<1 = 00010010   // add zero to the end and move the elements to the left by 1
// b>>1 = 00000100   // add zero to the front and move the elements to the right by 1