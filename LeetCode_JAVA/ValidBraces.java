import java.util.Stack;

public class ValidBraces {
	public static void main(String[] args){
		isValid("[]");
	}
	
	public static boolean isValid(String braces){
		if ((braces.length() % 2) != 0){
			System.out.println(braces.length() % 2);
			System.out.println("1");
		    return false;
		}
		else if (")".equals(braces.charAt(0)) || "]".equals(braces.charAt(0)) || "}".equals(braces.charAt(0))){
			System.out.println("2");
			return false;
		}
		else if ("(".equals(braces.charAt(braces.length()-1)) || "[".equals(braces.charAt(braces.length()-1)) || "{".equals(braces.charAt(braces.length()-1))){
			System.out.println("3");
			return false;
		}else{
			Stack<Character> stackArr = new Stack<Character>();
			for (int i = 0; i < braces.length(); i++){
				if (stackArr.isEmpty()){
					stackArr.push(braces.charAt(i));
				}else if ((stackArr.peek() == '[' && braces.charAt(i) == ']')
						|| (stackArr.peek() == '{' && braces.charAt(i) == '}')
						|| (stackArr.peek() == '(' && braces.charAt(i) == ')')){
					stackArr.pop();
				}else{
					stackArr.push(braces.charAt(i));
				}
			}
			if (stackArr.isEmpty()){
				//return true;
				System.out.println("true");
				return true;
			}else{
				//return false;
				System.out.println("false");
				return false;
			}
		}
	}
}
