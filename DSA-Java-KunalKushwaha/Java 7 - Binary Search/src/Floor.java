public class Floor {
    public static void main(String[] args) {
        // sorted array only
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = floor(arr,target);
        System.out.println(ans);

    }

    // Leetcode 744
    // return the index : greatest no. <= target
    static int floor(int[] arr, int target){

        // but what if the target is smaller than the smallest number in the array
        if (target < arr[0]){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2;
            // might be possible that (start + end) exceeds the rango of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        // if the target element does not exist in the array
        return end;
    }
}