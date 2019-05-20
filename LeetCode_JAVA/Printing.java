import java.util.Scanner;

public class Printing {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要打印星星的行数：");
		int i = sc.nextInt();
		System.out.println("\t");
		PrintPic(i);
	}
	
	public static void PrintPic(int n){
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" ");
			}			
			for (int k = 0; k <= i-1; k++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
