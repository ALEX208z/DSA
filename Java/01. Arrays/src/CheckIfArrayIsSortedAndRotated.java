// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated
// Leetcode 1752

public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 1;

        if (n == 1) return true;

        for (int i = 1; i < 2 * n; i++) {
            if(nums[(i - 1) % n] <= nums[i % n]) {
                count++;
            } else {
                count = 1;
            }
            if(count == n) {
                return true;
            }
        }
        return false;
    }
}

// neetcode
// - When dealing with rotated problems, one common technique is to take the array and concatenate with itself.
// eg. nums = {3,4,5,5,1,2}  -> {3,4,5,5,1,2,3,4,5,5,1,2}
//   And now it can be solved with sort of sliding window  approach
// - i % n ; to solve the out of bound issue as original array is of size 6 only. This will reduce space compelxity from O(n) to O(1) as we not storing anything
//    eg. 8 % 6 = 2, now it will look in the 2nd index
// - in for loop ( i < 2 * n) to imitate array being concatenated with itself.