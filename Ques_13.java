
class Ques_13 {
    public int romanToInt(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I')
                ans += 1;
            else if (s.charAt(i) == 'V')
                ans += 5;
            else if (s.charAt(i) == 'X')
                ans += 10;
            else if (s.charAt(i) == 'L')
                ans += 50;
            else if (s.charAt(i) == 'C')
                ans += 100;
            else if (s.charAt(i) == 'D')
                ans += 500;
            else if (s.charAt(i) == 'M')
                ans += 1000;
            if (i > 0) {
                if (s.charAt(i) == 'V' && s.charAt(i-1) == 'I')
                    ans -= 2;
                if (s.charAt(i) == 'X' && s.charAt(i-1) == 'I')
                    ans -= 2;
                if (s.charAt(i) == 'L' && s.charAt(i-1) == 'X')
                    ans -= 20;
                if (s.charAt(i) == 'C' && s.charAt(i-1) == 'X')
                    ans -= 20;
                if (s.charAt(i) == 'D' && s.charAt(i-1) == 'C')
                    ans -= 200;
                if (s.charAt(i) == 'M' && s.charAt(i-1) == 'C')
                    ans -= 200;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Ques_13 obj = new Ques_13();
        String s = "MCMXCIV";
        int result = obj.romanToInt(s);
        System.out.println("Roman numeral: " + s);
        System.out.println("Integer value: " + result);
    }
}
