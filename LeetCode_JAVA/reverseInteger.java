
public class reverseInteger {
	public static void main(String[] args){
		reverse(-901000);
	}
	
	public static int reverse(int x){
		String s = String.valueOf(x);
		String reS = new StringBuffer(s).reverse().toString();
		String newreS = "x"+reS;
        int finalreS = 0;
		if( x == 0 || x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
			 finalreS = 0;
		}else if(x > 0 && x % 10 == 0){
			finalreS = Integer.parseInt(reS);
		}else if(x > 0 && x % 10 != 0){
			if(Long.parseLong(reS) > Integer.MAX_VALUE){
				finalreS = 0;
			}
			else{
				finalreS = Integer.parseInt(reS);
			}
				
		}else if (x < 0){
			int newX = Math.abs(x);
			if(newX > 0 && newX % 10 != 0){
				reS = "-"+reS.replace("-", "");
				if(Long.parseLong(reS) < Integer.MIN_VALUE){
					finalreS = 0;
				}
				else{
					finalreS = Integer.parseInt(reS);
				}
			}else if(newX > 0 && newX % 10 == 0){
				StringBuilder sb = new StringBuilder(newreS);
				for(int i = 1; i < s.length(); i++){
					if(sb.charAt(i) == '0' && sb.charAt(i-1)=='x'){
						sb = sb.replace(i, i+1, "x");
					}
				}
				newreS = "-" + sb.toString().replaceAll("x", "").replaceAll("-", "");
				finalreS = Integer.parseInt(newreS);
			}
		}
		System.out.println(finalreS);
        return finalreS;
	}
}
