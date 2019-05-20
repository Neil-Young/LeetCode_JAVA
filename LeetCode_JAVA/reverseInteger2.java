
public class reverseInteger2 {
	public static void main(String[] args){
		reverseInt(1534236469);
	}
	
	public static int reverseInt(int x){
		int result = 0;
		while (x != 0) {
			result = result * 10 + x % 10; // 每一次都在原来结果的基础上变大10倍，再加上余数
			x = x / 10; // 对x不停除10
		}
		System.out.println(result);
		return result;
	}
}
