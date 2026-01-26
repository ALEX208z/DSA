// similar to leetcode 34
// Striver

public class CountOccurrenceOfElementInSortedArray {

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,8,8,11,13};
        int target = 8;
        int ans = count(arr, target);
        System.out.println(ans);
    }

   public static int firstOccurrence(int[] arr, int target) {
       int start = 0;
       int end = arr.length - 1;
       int first = -1;

       while (start <= end) {
           int mid = start + (end - start) / 2;
           // maybe an answer
           if (arr[mid] == target) {
               first = mid;
               // look for smaller index on the left
               end = mid - 1;
           } else if (arr[mid] < target) {
               start = mid + 1; // look on the right
           } else {
               end = mid - 1; // look on the left
           }
       }
       return first;
   }

   public static int lastOccurrence(int[] arr, int target) {
       int start = 0;
       int end = arr.length - 1;
       int last = -1;

       while (start <= end) {
           int mid = start + (end - start) / 2;
           // maybe an answer
           if (arr[mid] == target) {
               last = mid;
               // look for larger index on the right
               start = mid + 1;
           } else if(arr[mid] < target) {
               start = mid + 1; // look on the right
           } else {
               end = mid - 1; // look on the left
           }
       }
       return last;
   }

   public static int[] firstAndLastPosition(int[] arr, int target) {
       int first = firstOccurrence(arr, target);
       if (first == -1) return new int[] {-1,-1};
       int last = lastOccurrence(arr, target);
       return new int[] {first, last};
   }

   public static int count(int[] arr, int target) {
       int[] ans = firstAndLastPosition(arr, target);
       if (ans[0] == -1) return 0;
       return (ans[1] - ans[0] + 1);
   }
}
