/* https://leetcode.com/problems/nim-game/ */
package DS.Leetcode.Solutions.Easy;

public class NimGame {
	public boolean canWinNim(int n) {
		return !((n - 4 * (n / 4)) == 0);
	}
}