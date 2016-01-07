/* http://www.geeksforgeeks.org/lucky-numbers/ */
package GeeksForGeeks.Mathematical;

public class LuckyNumbers {

	boolean isLucky(int n) {
		int pos = n;
		int del = 2;
		while(pos >= del){
			if(pos % del == 0){
				return false;
			}
			pos = pos - pos/del;
			del++;
		}
		return true;
	}

	public static void main(String[] args) {
		LuckyNumbers ln = new LuckyNumbers();
		int num = 100;
		for (int i = 1; i < num; i++) {
			if(ln.isLucky(i)){
				System.out.print(i+" ");
			}
		}
	}
}
//trick is to use the 2 as the starting point.
// get the pos and del as close to each other.