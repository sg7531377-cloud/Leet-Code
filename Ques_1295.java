
class Ques_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (String.valueOf(n).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Ques_1295 obj = new Ques_1295();
        int[] nums = {12, 345, 2, 6, 7896};
        int result = obj.findNumbers(nums);
        System.out.println("Count of even digit numbers: " + result);
    }
}
