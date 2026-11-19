
class Ques_65 {
    public boolean isNumber(String s) {
        s = s.trim();
        boolean num = false;
        boolean dot = false;
        boolean exp = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                num = true;
            }
            else if (ch == '.') {
                if (dot || exp) {
                    return false;
                }
                dot = true;
            }
            else if (ch == 'e' || ch == 'E') {
                if (exp || !num) {
                    return false;
                }
                exp = true;
                num = false;
            }
            else if (ch == '+' || ch == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Ques_65 obj = new Ques_65();
        String s = "2e10";
        boolean result = obj.isNumber(s);
        System.out.println("Input: " + s);
        System.out.println("Is valid number? " + result);
    }
}
