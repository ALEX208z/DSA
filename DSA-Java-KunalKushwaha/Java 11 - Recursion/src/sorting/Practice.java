// Deepseek

package sorting;

public class Practice {
    public static void main(String[] args) {

    }

    // Public interface
    public static void sort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        int[] temp = new int[arr.length];
        sort(arr, temp, 0 , arr.length - 1);
    }

    private static void sort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return; // Base case

        int mid = left + (right - left) / 2;

        // Divide
        sort(arr, temp, left, mid);
        sort(arr,temp,mid+1,right);

        // Conquer (merge)
        merge(arr, temp, left, mid, right);
    }

    // Merge two sorted halves
    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // copy to temp array
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int i = left;     // Start of left half
        int j = mid + 1;  // Start of right half
        int k = left;     // Start of merged result

        // Merge in sorted order
        while (i <= mid && j <= right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++];
            } else {
                arr[k++] = temp[j++];
            }
        }

        // Copy remaining elements from left half
        while (i <= mid) {
            arr[k++] = temp[i++];
        }

        // Right half remaining elements are already in place
    }
}
