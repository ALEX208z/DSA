public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {18,12,-7,14,28,55,65,43,23,};
        int target = -7;
        int ans = searchInRange(nums,target,0,3);
        System.out.println(ans);
    }

    static int searchInRange(int[] arr,int target, int start, int end){
        if (arr == null || arr.length == 0){
            return -1;
        }
        // run the loop
        for (int index = start; index <= end; index++) {
            // check for the element at every index if it is target
            if (arr[index] == target) {
                return index ;
            }
        }
        return -1;
    }
}
