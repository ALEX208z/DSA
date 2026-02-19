import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        System.out.println(subsetsWithDup(nums));
    }


    static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);   // Sort to handle duplicates
        backtrackWithDup(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrackWithDup(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i-1]) {
                continue;
            }
            current.add(nums[i]);
            backtrackWithDup(nums,i+1,current,result);
            current.removeLast();
        }

    }
}
