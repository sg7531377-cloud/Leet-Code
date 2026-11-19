
class Ques_29 {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long ans = 0;
        while (a >= b) {
            long temp = b;
            long count = 1;
            while (a >= (temp << 1)) {
                temp = temp << 1;
                count = count << 1;
            }
            a = a - temp;
            ans = ans + count;
        }
        if ((dividend < 0) != (divisor < 0)) {
            ans = -ans;
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        Ques_29 obj = new Ques_29();
        int dividend = 10;
        int divisor = 3;
        int result = obj.divide(dividend, divisor);
        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor: " + divisor);
        System.out.println("Result: " + result);
    }
}
