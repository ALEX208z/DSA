public class UpperBound {

    // Upper bound algorithm finds the first or the smallest index in a sorted array where the value of that index is greater than the given key i.e x;

    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int x = 2;
        System.out.println(upperBound(nums,x));
    }

    static int upperBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length; // default to length if not found

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > x) {
                ans = mid; // stores current index as potential answer
                end = mid - 1; // move left
            } else {
                start = mid + 1; // move right
            }
        }
        return ans; // return final answer
    }
}
