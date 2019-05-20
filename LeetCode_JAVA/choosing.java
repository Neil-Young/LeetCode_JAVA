import java.util.Scanner;

public class choosing {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请你选择最喜欢的人： 1.小咩，2.小喵，3.小叽");
		int i = sc.nextInt();
		if (i == 1 || i ==3){
			WrongAnswerMeow();
			System.out.println("");
			ChoosingMeow();
		}else if(i==2){
			
		}
			
	}
	
	public static void ChoosingMeow(){
		System.out.println("请你选择最喜欢的人： 1.小咩，2.小喵，3.小叽");
	}
	
	public static void ChoosingWong(){
		System.out.println("请你选择小喵最喜欢的人： 1.大狗，2.大汪，3.大臭臭");
	}
	
	public static void WrongAnswerMeow(){
		System.out.println("错了，选择小喵才对！");
		System.out.println("请重新选择");
	}
	
	public static void WrongAnswerWong(){
		System.out.println("答案不对！");
		System.out.println("请重新选择");
	}
	
	public static void CorrectAnswerMeow(){
		System.out.println("终于答对了，小喵最爱大汪");
	}

	public static void CorrectAnswerWong(){
		System.out.println("终于答对了，大汪最爱小喵");
	}
	
}
