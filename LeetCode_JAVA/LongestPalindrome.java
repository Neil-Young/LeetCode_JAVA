
public class LongestPalindrome {
	public static void main(String[] args){
		LongestPalindromeString("abcddcba");
	}
	
	public static String FindPalindrome(String s, int left, int right){
		int l = left;
		int r = right;
		while (l >= 0 && r <= s.length() - 1 && s.charAt(l) == s.charAt(r)) {  
            l--;  
            r++;  
        }
		return s.substring(l+1, r);
	}
	
	public static String LongestPalindromeString(String s){
		String LongestString = "";
		String subStr;
		int n = s.length();
		if(n<=1){
			return s;
		}
		for(int i = 0; i < n -1; i++){
			subStr = FindPalindrome(s,i,i);
			if (subStr.length() > LongestString.length()){  
                LongestString = subStr;  
            }
			subStr = FindPalindrome(s, i, i + 1);  
            if (subStr.length() > LongestString.length()){  
                LongestString = subStr;  
            }  
		}
		System.out.println(LongestString);
		return LongestString;
	}
}
