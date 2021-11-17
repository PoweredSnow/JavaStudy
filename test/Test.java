public class Test {
    public int missingNumber(int[] nums) {
        if (nums[nums.length - 1] != nums.length) {
            return nums.length;
        }
        else if (nums[0] != 0) {
            return 0;
        }

        for (int i = 1; i < nums.length; i++) {
            int expectedNum = nums[i - 1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Test t = new Test();
        int[] nums = {0, 1, 2};
        System.out.println(t.missingNumber(nums));
    }
}
