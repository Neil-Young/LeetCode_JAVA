
public class LengthofLongestSubString {
	public static void main(String[] args){
		count("asfda");
	}
	
	public static void count(String s){
		int max = 0;
		if(s.length() == 1){
			System.out.println("0");
		}else if(s.length() == 0){
			System.out.println("1");
		}else{
			for(int i = 0; i < s.length(); i++){
				int count = 1;
				String sSub = String.valueOf(s.charAt(i));
				for(int j = i + 1; j < s.length(); j++){
					if(s.charAt(i) != s.charAt(j) && !sSub.contains(String.valueOf(s.charAt(j)))){
						sSub = sSub  + String.valueOf(s.charAt(j));
						count = sSub.length();
					}else{
						break;
					}
				}
				if(count > max){
					max = count;
				}
			}
			System.out.println(max);
		}
	}
}
