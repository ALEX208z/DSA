import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));

    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        // STEP 1 : Add current subset to result
        result.add(new ArrayList<>(current));   // Add BEFORE including new element

        // STEP 2 : Try including each remaining element
        for (int i = start; i < nums.length; i++) {
            // STEP 3 : Include nums[i]
            current.add(nums[i]);

            // STEP 4 : Recurse with next index
            backtrack(nums, i + 1, current, result);

            // STEP 5 : Remove nums[i] (backtrack)
//            current.remove(current.size() - 1);
            current.removeLast();
        }
    }
}
