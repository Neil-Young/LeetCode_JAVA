public class myAtoiProblem {
    public static void main(String[] args) {
        int re = myAtoi("-03.14159");
        System.out.println(re);
    }

    //reference: http://www.programcreek.com/2012/12/leetcode-string-to-integer-atoi/
    public static int myAtoi(String str){
        if (str == null || str.length() < 1)
            return 0;

        // trim white spaces
        str = str.trim();
        char flag = '+';

        // check negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        // use double to store result
        double result = 0;

        // calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        if (flag == '-')
            result = -result;

        // handle max and min
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int) result;
    }

    /*public static int myAtoi(String str) {
        int result = 0;
        str = str.trim();
        String[] s = str.split(" ");
        if (s[0].substring(0,1).equals("1") ||
                s[0].substring(0,1).equals("2") ||
                s[0].substring(0,1).equals("3") ||
                s[0].substring(0,1).equals("4") ||
                s[0].substring(0,1).equals("5") ||
                s[0].substring(0,1).equals("6") ||
                s[0].substring(0,1).equals("7") ||
                s[0].substring(0,1).equals("8") ||
                s[0].substring(0,1).equals("9") ||
                s[0].substring(0,1).equals("-")
        ) {
            if (Long.valueOf(s[0]) <= Integer.MAX_VALUE && Long.valueOf(s[0]) > Integer.MIN_VALUE) {
                result = Integer.valueOf(s[0]);
            } else if (Long.valueOf(s[0]) > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
            } else if (Long.valueOf(s[0]) <= Integer.MIN_VALUE) {
                result = Integer.MIN_VALUE;
            }
        } else if (s[0].substring(0,1).equals("0")) {
            return myAtoi(s[0].replaceFirst("0", ""));
        } else if (s[0].substring(0, 1).equals("-") && s[0].substring(1,2).equals("0")) {
            return myAtoi(s[0].replaceFirst("0", ""));
        } else {
            return 0;
        }
        return result;
    }*/
}
