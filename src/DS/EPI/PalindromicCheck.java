package DS.EPI;

public class PalindromicCheck {
	
	private boolean isPalindromic(String str){
		
		for(int i = 0, j = str.length() - 1; i < j; ++i,--j){
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		PalindromicCheck pc = new PalindromicCheck();
		System.out.println("is the given word palindromic in nature: " + pc.isPalindromic("malayalam"));
	}
}
