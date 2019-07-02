import java.util.*;

public class generateParenthesis {
    public static void main(String[] args){
        List<String> strings = generateParenthesis(2);
        System.out.println(strings);
    }

    public static List<String> generateParenthesis(int n){
        Set<String> findList = new HashSet<String>();
        if(n==0){
            findList.add("");
        }else {
            List<String> list = generateParenthesis(n - 1);
            for (String str : list) {
                for (int i = 0; i < str.length(); ++i) {
                    if (str.charAt(i) == '(') {
                        str = str.substring(0, i + 1) + "()" + str.substring(i + 1, str.length());
                        findList.add(str);
                        str = str.substring(0, i + 1) + str.substring(i + 3, str.length());
                    }
                }
                findList.add("()" + str);
            }
        }
        return new ArrayList<>(findList);
    }
}
