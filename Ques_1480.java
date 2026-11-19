
class Ques_1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
    public static void main(String[] args) {
        Ques_1480 obj = new Ques_1480();
        int[] nums = {1, 2, 3, 4};
        int[] result = obj.runningSum(nums);
        System.out.print("Running Sum: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
