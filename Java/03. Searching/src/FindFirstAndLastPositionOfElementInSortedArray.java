// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
// Leetcode 34
// similar question count occurrence



public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        if (nums == null || nums.length == 0) return result;

        // Find first position
        int first = firstOccurrence(nums, target);
        if (first == -1) return result;

        // Find last position
        int last = lastOccurrence(nums, target);

        result[0] = first;
        result[1] = last;
        return result;

    }

    private int firstOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }

    private int lastOccurrence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if(nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
}
