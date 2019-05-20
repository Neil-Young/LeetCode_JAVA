
public class Prefix {
	public static void main(String[] args){
		String[] testing = {"asd","as","asdd"};
		longestCommonPrefix(testing);
	}
	
	public static String longestCommonPrefix(String[] strs){
		String result = "";
		int count = 0;
		int minLength = Integer.MAX_VALUE;
		for(int i = 0 ; i < strs.length; i++){
			if(strs[i].length() < minLength){
				minLength = strs[i].length();
			}
		}
		for(int i = 0; i < minLength; i++){
			for(int j = 0; j < strs.length - 1; j++){
				if(strs[j].charAt(i) == strs[j+1].charAt(i)){
					count += 1;
				}			
			}
			if(count != strs.length-1){
				break;
			}else{
				result += String.valueOf(strs[0].charAt(i));
				count = 0;
			}
		}
		System.out.println(minLength);
		System.out.println(result);
		return result;
	}
}
