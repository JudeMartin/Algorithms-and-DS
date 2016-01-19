/* https://leetcode.com/problems/nim-game/ */
package Leetcode.Easy;

public class NimGame {
	public boolean canWinNim(int n) {
		return !((n - 4 * (n / 4)) == 0);
	}
}