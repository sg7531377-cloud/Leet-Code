
class Ques_43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';
                int mul = a * b;
                result[i + j + 1] += mul;
                result[i + j] += result[i + j + 1] / 10;
                result[i + j + 1] = result[i + j + 1] % 10;
            }
        }
        String ans = "";
        for (int i = 0; i < result.length; i++) {
            ans += result[i];
        }
        return ans.replaceFirst("^0+", "");
    }
    public static void main(String[] args) {
        Ques_43 obj = new Ques_43();
        String num1 = "12";
        String num2 = "13";
        String result = obj.multiply(num1, num2);
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Multiplication: " + result);
    }
}
