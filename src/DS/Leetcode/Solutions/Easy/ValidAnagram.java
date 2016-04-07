/* https://leetcode.com/problems/valid-anagram/ */
package DS.Leetcode.Solutions.Easy;

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] res = new int[256];
		for (int i = 0; i < s.length(); i++) {
			res[s.charAt(i)]++;
			res[t.charAt(i)]--;
		}
		for (int i = 0; i < res.length; i++) {
			if (res[i] != 0) {
				return false;
			}
		}

		return true;
	}
	public static void main(String[] args) {
		ValidAnagram va = new ValidAnagram();
		boolean res = va.isAnagram("cat", "tac");
		System.out.println(res);
	}
}
