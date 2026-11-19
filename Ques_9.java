
class Ques_9 {
    public boolean isPalindrome(int x) {
        int originalnumber = x;
        int reversednumber = 0;
        while (x > 0) {
            int lastdigit = x % 10;
            reversednumber = reversednumber * 10 + lastdigit;
            x = x / 10;
        }
        return originalnumber == reversednumber;
    }
    public static void main(String[] args) {
        Ques_9 obj = new Ques_9();
        int number = 121;
        boolean result = obj.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? \n" + result);
    }
}
