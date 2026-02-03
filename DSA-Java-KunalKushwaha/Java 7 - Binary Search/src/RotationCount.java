// https://www.geeksforgeeks.org/dsa/find-rotation-count-rotated-sorted-array/
// Q. Rotation Count in a Rotated Sorted array

public class RotationCount {
    public static void main(String[] args) {
//        int[] arr = {4,5,6,7,0,1,2};
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(countRotations(arr));

    }

    private static int countRotations(int[] arr) {
        int pivot = findPivot((arr));
//        if (pivot == -1) {
//            // array is not rotated
//            return 0;
//        }
        return pivot + 1;

    }


    // use this for non-duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            // Case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // Case 3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            }
            // Case 4
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
