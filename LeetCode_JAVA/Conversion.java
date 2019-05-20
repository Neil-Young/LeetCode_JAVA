
public class Conversion {
	public static void main(String[] args){
		solution(9978);
	}
	
	public static String solution(int n){
		String FinalResult = "";
		//String ThousandCount = (n/1000) >= 1 ? (int)Math.ceil(n/1000)+"" : "";
		for(int i = 1; i <= (int)Math.ceil(n/1000); i++){
			FinalResult = FinalResult + "M";	
		}
		//String HunderedCount = n%1000/100 >=1 ? (int)Math.ceil(n%1000/100)+"": "";
		if (n%1000/100 <= 3){
			for(int i = 1; i <= (int)Math.ceil(n%1000/100); i++){
				FinalResult = FinalResult + "C";	
			}
		}else if (n%1000/100 == 4){
			FinalResult = FinalResult + "CD";
		}else if (n%1000/100 == 5){
			FinalResult = FinalResult + "D";
		}else if (n%1000/100 == 6){
			FinalResult = FinalResult + "DC";
		}else if (n%1000/100 == 7){
			FinalResult = FinalResult + "DCC";
		}else if (n%1000/100 == 8){
			FinalResult = FinalResult + "DCCC";
		}else if (n%1000/100 == 9){
			FinalResult = FinalResult + "CM";
		}
		
		if (n%100/10 <= 3){
			for(int i = 1; i <= (int)Math.ceil(n%100/10); i++){
				FinalResult = FinalResult + "X";	
			}
		}else if (n%100/10 == 4){
			FinalResult = FinalResult + "XL";
		}else if (n%100/10 == 5){
			FinalResult = FinalResult + "L";
		}else if (n%100/10 == 6){
			FinalResult = FinalResult + "LX";
		}else if (n%100/10 == 7){
			FinalResult = FinalResult + "LXX";
		}else if (n%100/10 == 8){
			FinalResult = FinalResult + "LXXX";
		}else if (n%100/10 == 9){
			FinalResult = FinalResult + "XC";
		}
		
		if (n%10 <= 3){
			for(int i = 1; i <= (int)Math.ceil(n%10); i++){
				FinalResult = FinalResult + "I";	
			}
		}else if (n%10 == 4){
			FinalResult = FinalResult + "IV";
		}else if (n%10 == 5){
			FinalResult = FinalResult + "V";
		}else if (n%10 == 6){
			FinalResult = FinalResult + "VI";
		}else if (n%10 == 7){
			FinalResult = FinalResult + "VII";
		}else if (n%10 == 8){
			FinalResult = FinalResult + "VIII";
		}else if (n%10 == 9){
			FinalResult = FinalResult + "IX";
		}
		
		
		System.out.print(FinalResult);
		//System.out.println(ThousandCount);
		return "";
	}
}
