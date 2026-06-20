// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted
// Leetcode 167

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left <= right) {
            // +1 because problem wants 1-based indexing
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[] {left+1,right+1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] {-1,-1};
    }
}
