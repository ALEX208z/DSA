public class BinarySearch {
    public static void main(String[] args) {
        // sorted array only
        int[] arr = {2,3,4,5,6,7,8,9,11,13,15,17,21};
        int target = 135;
        int ans = binarySearch(arr,target);
        System.out.println(ans);

    }

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}