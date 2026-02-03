package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums, int low, int high) {
        if (low >= high) return; // base case

        int start = low;
        int end = high;
        int mid = start + (end - start) / 2; // Choosing pivot as mid
        int pivot = nums[mid];

        // also a reason why if its already sorted it will not swap

        // Partition Logic
        while (start <= end) {

            // Cannot use if because it checks only once whereas while keeps moving start and end till the condition is true

            // Find element on left that should be on right
            while (nums[start] < pivot) {
                start++;  // keep moving while true
            }
            // Find element on right that should be on left
            while (nums[end] > pivot) {
                end--;
            }

            // Swap them
            if (start <= end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, end);  // Sort left partition
        sort(nums,start, high);  // Sort right partition

        // After while(start <= end) loop finishes:
        // end has moved LEFT across the array
        // start has moved RIGHT across the array
        // They CROSS OVER each other!
    }
}

// Choose the middle element as pivot other time complexity can be worst case as if I choose the end element which may be largest, then it will be reduced to just (n-1) instead of n/2
// best case time complexity : O(n log n)
// worst case time complexity : O(n^2)



// Bottom Line:
//while for FINDING → Need continuous search
//if for DECIDING/DOING → Need one-time check/action