
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一组数字");
        String inputString = sc.nextLine();
        String[] stringArray = inputString.split(" ");

        int[] num = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            num[i] = Integer.parseInt(stringArray[i]);
        }
        solution(num);
    }

    public static int solution(int[] num){
        int theLargestNum = 0;
        Arrays.sort(num);
        for(int i = 0; i < num.length; i++){
            for(int j = i + 1; j< num.length; j++){
                for(int q = j + 1; q < num.length; q++){
                    if(num[i] + num[j] > num[q] && num[i] + num[q] > num[j] && num[q] + num[j] > num[i]){
                        if((num[i] + num[j]+num[q])> theLargestNum){
                            theLargestNum = num[i] + num[j] + num[q];
                        }
                    }
                }
            }
        }
        if (theLargestNum != 0) {
            System.out.print("最大的周长是" + theLargestNum);
        }else{
            System.out.print("输入的数据无法组成三角形");
        }
        return theLargestNum;
    }
}

/*class Solution{
    public int largest(int[] num){
      Arrays.sort(num);
        for (int a = num.length - 1; a >= 2; a--) {
        if (num[a] < num[a - 1] + num[a - 2]) return num[a] + num[a - 1] + num[a - 2];
    }
        return 0;
    }
}*/