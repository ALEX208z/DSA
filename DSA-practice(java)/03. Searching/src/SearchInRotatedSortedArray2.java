// https://leetcode.com/problems/search-in-rotated-sorted-array-ii
// leetcode 81
// similar to leetcode 33 but here the problem might be
// nums[start] == nums[mid] == nums[end]
// eg. nums = [1,0,1,1,1]   target = 0


public class SearchInRotatedSortedArray2 {

    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return true;
            }
            // duplicate handling
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
                continue;  // why continue? as we are still not sure about another duplicates so safe measuere
            }
            // left sorted
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                // right sorted
            } else {
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return false;
    }
}
// Approach : Whenever there is this type of questions, try to first solve for unique and then handle testcase for duplicates


// In LeetCode 33 (no duplicate)
// - one side is always strictly sorted
// In LeetCode 81 (duplicates allowed)
// - duplicates destroy the "sorted side" guarantee, so we need duplicate handling step

// 🧾 One-line takeaway (MEMORIZE)
//In rotated arrays with duplicates, always handle start == mid == end.