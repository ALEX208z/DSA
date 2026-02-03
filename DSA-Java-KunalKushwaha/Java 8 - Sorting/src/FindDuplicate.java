// https://leetcode.com/problems/find-the-duplicate-number
// Leetcode 287   - Amazon, Microsoft question

public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return nums[index]; // duplicate value ; return index will return index and not value
            }
        }
        return -1;
    }
}
