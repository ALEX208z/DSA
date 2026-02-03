// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array
// Leetcode 448
// Google question

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        // Cyclic sort
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

        // Collect missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }
}
