import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));

    }

    static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] newArr = new int[n];

        for (int i = 0; i < n; i++) {
            newArr[i] = nums[i];

        }
        return newArr;
    }
}
