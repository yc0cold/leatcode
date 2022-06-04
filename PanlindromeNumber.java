package daily;

//9. Palindrome Number
public class PanlindromeNumber {
	
	public boolean isPalindrome(int x) {
		boolean result = true;
		
		if(x < 0 ) { result = false; return result;}
		
		String str  = Integer.toString(x);
		
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i)) {
				return false;
			}
		}
		
		return result;
	}

}
