public class FindQuotient {
    public static void main(String[] args) {
        int answer = divide(2147483647, 2);
        System.out.println(answer);
    }

    //reference: https://www.csdn.net/gather_2d/NtDakgxsNTI5LWJsb2cO0O0O.html
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == 0) return 0;
        long tempdividend = dividend;
        long tempdivisor = divisor;
        tempdividend = Math.abs(tempdividend);
        tempdivisor = Math.abs(tempdivisor);
        if (tempdividend < tempdivisor) return 0;
        long tempres = 0;
        long sum;
        long count;
        while (tempdividend >= tempdivisor) {
            count = 1;
            sum = tempdivisor;
            while (sum + sum <= tempdividend) {
                sum = sum + sum;
                count = count + count;
            }
            tempdividend = tempdividend - sum;
            tempres = tempres + count;
        }

        if ((dividend > 0) ^ (divisor > 0)) tempres = -tempres;
        if (tempres > Integer.MAX_VALUE || tempres < Integer.MIN_VALUE) return Integer.MAX_VALUE;
        else return (int) tempres;
    }



    //divide two integers without using multiplication, division and mod operator.
    //Using While loop to solve this question.
    /*public static int divide(int dividend, int divisor) {
        int count = 0;
        //当被除数是1的时候
        if (divisor == 1 && (dividend <= Integer.MAX_VALUE && dividend >= Integer.MIN_VALUE)) {
            count = dividend;
        } else if (divisor == 1 && dividend < Integer.MIN_VALUE) {
            count = Integer.MIN_VALUE;
        } else if (divisor == 1 && dividend > Integer.MAX_VALUE) {
            count = Integer.MAX_VALUE;
        }
        //当被除数是-1的时候
        else if (divisor == -1 && (dividend < Integer.MAX_VALUE && dividend > Integer.MIN_VALUE)) {
            count = -dividend;
        } else if (divisor == -1 && dividend <= Integer.MIN_VALUE) {
            count = Integer.MAX_VALUE;
        } else if (divisor == -1 && dividend >= Integer.MAX_VALUE + 1) {
            count = Integer.MIN_VALUE;
        }

        //正常情况下
        else {
            int sum = 0;
            int quotient = -1;
            while (sum <= Math.abs(dividend)) {
                sum += Math.abs(divisor);
                quotient++;
            }
            if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
                count = quotient;
            }else {
                count = -quotient;
            }
        }
        return count;
    }*/
}
