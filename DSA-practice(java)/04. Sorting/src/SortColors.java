// Sort Colors
// LeetCode 75

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    // normal approach
    public void sortColors2(int[] nums) { // O(n)
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // O(n)
        for (int i = 0; i < nums.length; i++) {
           if (nums[i] == 0) count0++;
           else if (nums[i] == 1) count1++;
           else count2++;
        }

        // O(n)
        int index = 0;
        for (int i = 0; i < count0; i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < count1; i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < count2; i++) {
            nums[index++] = 2;
        }

    }


    // Optimal Approach - Dutch National Flag Algorithm
    public static void sortColors (int[] nums) {
        int low = 0;   // next position for 0
        int mid = 0;   // current element
        int high = nums.length -1;   // next position for 2

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap 0 to the beginning
                swap(nums,low,mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 stays in middle, just move forward
                mid++;
            } else { // nums[mid == 2
                // swap 2 to the end
                swap(nums, mid, high);
                high--;
                // Don't increment mid! Need to check swapped element
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
