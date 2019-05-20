
public class Chocolate {
	public static void main(String[] args){
		breakChocolate(1,1);
	}
	
	public static int breakChocolate(int n, int m){
		int count = 0;
		count = n-1 + (m-1) * n;
		System.out.println(count);
		return count;
	}
}
