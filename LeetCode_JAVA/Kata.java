
public class Kata {
	public static void main(String[] args){
		TripleDouble(7778829323L,123951927L);
	}
	
	public static int TripleDouble(long num1, long num2){
		int flag = 0;
		char Pointer = 'g';
		String num01 = String.valueOf(num1);
		String num02 = String.valueOf(num2);
		char[] stringArr1 = num01.toCharArray();
		char[] stringArr2 = num02.toCharArray();
		for(int i = 0; i < num01.length()-2; i++){
			if(stringArr1[i] == stringArr1[i+1] && stringArr1[i] == stringArr1[i+2]){
				Pointer = stringArr1[i];
			}
		}
		for(int i = 0; i < num02.length()-1; i++){
			if(stringArr2[i] == stringArr2[i+1] && stringArr2[i] == Pointer){
				flag = 1;
			}
		}
		System.out.println(flag);
		return flag;
	}
}
