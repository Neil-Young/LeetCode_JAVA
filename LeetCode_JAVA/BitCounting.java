
public class BitCounting {
	public static void main(String[] args){
		countBits(1234);
	}
	
	public static int countBits(int n){
		/*int x = 0;
		char y = '1';
		String num = "";
		num = Integer.toBinaryString(n).toString();
		
		for(int i = 0; i < num.length(); i++){
			if (num.charAt(i) == y){
				x+=1;
			}
		}
		return x;*/
		System.out.println(Integer.bitCount(n));
		return Integer.bitCount(n);
	}
}
