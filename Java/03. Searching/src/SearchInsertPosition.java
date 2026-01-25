// https://leetcode.com/problems/search-insert-position?envType=problem-list-v2&envId=binary-search
// Leetcode 35

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;

        // if the target is not found, then we exist loop and the start index is pointing to where the target wouldl be.
    }
}
