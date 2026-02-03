// Striver

package sorting;

import java.util.ArrayList;
import java.util.List;

public class PracticeMergeSort {
    // Function to merge two halves - FIXED VERSION
    public void merge(int[] arr, int low, int mid, int high) {
        // Create temp array
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        // FIXED: Changed "mid <= high" to "right <= high"
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        // Add remaining left elements
        while (left <= mid) {
            temp.add(arr[left++]);
        }

        // Add remaining right elements
        while (right <= high) {
            temp.add(arr[right++]);
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    // Recursive merge sort - This is correct
    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        // Find mid-index - Better to avoid overflow
        int mid = low + (high - low) / 2;

        // Sort left half
        mergeSort(arr, low, mid);
        // Sort right half
        mergeSort(arr, mid + 1, high);

        // Merge both sides
        merge(arr, low, mid, high);
    }
}