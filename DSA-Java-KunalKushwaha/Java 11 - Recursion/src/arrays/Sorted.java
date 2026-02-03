package arrays;

public class Sorted {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,15,6};
        System.out.println(isSorted(nums,0));

    }

    static boolean isSorted(int[] nums, int index) {
        // base condition
        if (index == nums.length - 1) {
            return true;
        }
        // recursive condition
        return nums[index] < nums[index + 1] && isSorted(nums, index+1);
    }

    // We are not changing nums, we are just updating the index as if in any recursion call you modify the array, the array will be modified for all the other recursion calls
}


