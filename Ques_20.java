
import java.util.Stack;
class Ques_20 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if (st.isEmpty())
                    return false;
                char top = st.pop();
                if (ch == ')' && top != '(')
                    return false;
                if (ch == '}' && top != '{')
                    return false;
                if (ch == ']' && top != '[')
                    return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Ques_20 obj = new Ques_20();
        String s = "({[]})";
        boolean result = obj.isValid(s);
        System.out.println("Input: " + s);
        System.out.println("Is valid? \n" + result);
    }
}
