
import java.util.ArrayList;
import java.util.List;
class Ques_412 {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                ans.add("Fizz");
            }
            else if (i % 5 == 0) {
                ans.add("Buzz");
            }
            else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Ques_412 obj = new Ques_412();
        int n = 15;
        List<String> result = obj.fizzBuzz(n);
        System.out.println("Output: " + result);
    }
}
