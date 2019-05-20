
public class zigzag {
	public static void main(String[] args){
		convert("ab", 1);
	}
	
	public static String convert(String s, int numRows){
		String newStr = "";
		if(s.length() == 0 || numRows < 2){
			System.out.println(s);
			return s;
		}else{
			for(int i = 0; i < numRows; i++){
				for(int j = i; j < s.length(); j+=(2*numRows-2)){
					newStr += s.charAt(j);
					 if (i > 0 && i < numRows-1) {
		                    int t = j + (2*numRows-2) - 2*i;
		                    if (t < s.length()) {
		                        newStr += s.charAt(t);
		                    }
		                }
				}
			}
			
		}
		System.out.println(newStr);
		return newStr;
	}
}
