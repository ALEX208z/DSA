package arrays;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {1,0,3,7,4,5,3};
        System.out.println(isSorted(nums));

    }

    static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length;i++) {
            if (nums[i] < nums[i-1]) {
                return false; // found an element out of order
            }
        }
        return true; // All elements are in order
    }
}

// Correct logic should be :
// - Return false as soon as you find any element that breaks the sorted order
// - only return true if all elements are in order

// Mistakes I was doing was
// - ArrayIndexOutOfBoundException
// - Logical mistake - returning too early
