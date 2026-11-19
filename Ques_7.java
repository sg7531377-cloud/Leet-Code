
class Ques_7 {
    public int reverse(int x) {
        long rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            x = x / 10;
        }
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) rev;
    }
    public static void main(String[] args) {
        Ques_7 obj = new Ques_7();
        int number = 123;
        int result = obj.reverse(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + result);
    }
}
