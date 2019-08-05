public class myAtoiProblem {
    public static void main(String[] args) {
        int re = myAtoi("-");
        System.out.println(re);
    }
    //reference: https://www.cnblogs.com/grandyang/p/4125537.html

    //1. 若字符串开头是空格，则跳过所有空格，到第一个非空格字符，如果没有，则返回0.

    //2. 若第一个非空格字符是符号 +/-，则标记 sign 的真假

    //3. 若下一个字符不是数字，则返回0. 完全不考虑小数点和自然数的情况，不过这样也好，起码省事了不少。

    //4. 如果下一个字符是数字，则转为整形存下来，若接下来再有非数字出现，则返回目前的结果。

    //5. 还需要考虑边界问题，如果超过了整型数的范围，则用边界值替代当前值。

    public static int myAtoi(String str) {
        if (str.isEmpty()) return 0;
        int sign = 1, base = 0, i = 0, n = str.length();
        while (i < n && str.charAt(i) == ' ') ++i;
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i++) == '+') ? 1 : -1;
        }
        while (i < n && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            if (base > Integer.MAX_VALUE / 10 || (base == Integer.MAX_VALUE / 10 && str.charAt(i) - '0' > 7)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            base = 10 * base + (str.charAt(i++) - '0');
        }
        return base * sign;
    }
}
