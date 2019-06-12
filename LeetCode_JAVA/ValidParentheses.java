import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        isValid("({[]})");
    }

    public static boolean isValid(String s){
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == map.get(s.charAt(i))) {
                    stack.pop();
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty()? true:false;
    }
}
