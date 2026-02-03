// Find the target in a sorted array

public class Practice_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-3,-2,-1, 3, 4, 5, 6, 7, 8, 9, 11, 13, 15, 17, 21};
        int target = -2;
        int ans = binarySearch(arr, target);
        System.out.println(ans);

    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                // mid = target
                return mid;
            }
        }
        return -1;
    }
}
