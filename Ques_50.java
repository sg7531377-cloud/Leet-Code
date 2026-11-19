
class Ques_50 {
    public double myPow(double x, int n) {
        long exp = Math.abs((long) n);
        double result = 1.0;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result *= x;
            }
            x *= x;
            exp >>= 1;
        }
        return n < 0 ? 1.0 / result : result;
    }
    public static void main(String[] args) {
        Ques_50 obj = new Ques_50();
        double x = 2.0;
        int n = 10;
        double result = obj.myPow(x, n);
        System.out.println("Base: " + x);
        System.out.println("Power: " + n);
        System.out.println("Result: " + result);
    }
}
