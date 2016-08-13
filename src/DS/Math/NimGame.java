/* https://leetcode.com/problems/nim-game/ */
package DS.Math;

public class NimGame {
	public boolean canWinNim(int n) {
		return !((n - 4 * (n / 4)) == 0);
	}
}