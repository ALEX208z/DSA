// https://leetcode.com/problems/find-in-mountain-array
// Leetcode 1095

public class SearchInMountain {

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBinarySearch(arr, target, peak+1,arr.length - 1);
    }




    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in the decreasing part of the array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in the ascending part of the array
                start = mid + 1; // because we know that mid + 1 element > mid element

            }
        }
        // In the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in teh above 2 checks
        // hence, when thou are pointing to just one element, this is the max one because that is what the checks say
        // more elaboration : at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of the above line that is hte best possible ans

        return start; // or return end as both are equal
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) / 2 ;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }


}
