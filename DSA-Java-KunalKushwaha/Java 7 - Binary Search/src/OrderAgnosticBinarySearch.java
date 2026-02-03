public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,6,7,8,9,11,13,15,17,21};
        int[] arr = {99, 80, 75, 22, 11, 5, 2, -3};
        int target = 567;
        int ans = orderAgnosticBinarySearch(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

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
