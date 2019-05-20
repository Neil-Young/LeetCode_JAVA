
public class myAtoi {
	public static void main(String[] args){
		isPalindrome(121);
	}
	
	public static boolean isPalindrome(int x){
		String Str = String.valueOf(x);
		boolean flag = true;
		if(Str.length() == 1){
			flag = true;
		}else if (Str.length() == 0){
			flag = false;
		}else{
			StringBuffer reverseSB = new StringBuffer(Str).reverse();
			if(Str.contentEquals(reverseSB)){
				flag = true;
			}else{
				flag = false;
			}
		}
		return flag;
	}
}
