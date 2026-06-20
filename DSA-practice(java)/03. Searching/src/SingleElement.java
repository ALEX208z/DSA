// https://leetcode.com/problems/single-element-in-a-sorted-array
// Leetcode 540

public class SingleElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,3,3,4,4,5,5,6};
//        System.out.println(singleNonDuplicate(nums));
    }

    // Brute force - linear search , time complexity - O(n)
//    static int singleNonDuplicate(int[] nums) {
//
//        int n = nums.length;
//        if (n == 1) return nums[0];
//
//        for (int i = 0; i < n; i++) {
//
//            if (i == 0) {
//                if (nums[i] != nums[i + 1]) {
//                    return nums[i];
//                }
//            }
//            else if (i == n - 1){
//                if (nums[i] != nums[i - 1]) {
//                    return nums[i];
//                }
//            }
//            else {
//                if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
//                    return nums[i];
//                }
//            }
//        }
//        return -1;
//    }

    // binary search - time complexity O(log n)
    // Function to find the single non-duplicate element using binary search
    public int singleNonDuplicate(int[] nums) {
        // Get the size of the array
        int n = nums.length;

        // Edge case : only one element in the array
        if (n == 1) return nums[0];

        // Edge case : first element is the unique one
        if (nums[0] != nums[1]) return nums[0];

        // Edge case: last element is the unique one
        if (nums[n - 1] != nums[n - 2]) return nums[n -1];

        // Initialize the binary search bound (exclude first and last index)
        int start = 1;
        int end = n - 2;

        // Perform binary search
        while (start <= end) {
            // Calculate middle index
            int mid = start + (end - start) / 2;

            // Check if middle elemnet is the unique one
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // Even
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid - 1]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                // Odd
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    start =  mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // Dummy return (not reachable if input is valid)
        return -1;
    }
}

// perfect duplicates = even
// duplicates + single = odd
// if L & R are even, and the mid is matching to the previous element, then answer will definitely on the left side and vice versa
// if mid doesn't match with left and right element then it's the answer

// L&R = even   |  mid % 2 == 0 then this
// arr[m-1] == arr[m] -> left
// arr[m] == arr[m+1] -> right

// L&R = odd  | mid % 2 != 0  then this
// arr[m-1] == arr[m] -> right
// arr[m] == arr[m+1] -> left
