import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }

    // Selection sort
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {   // i <= n - 2  as if we swap for n-2 elements, the last element will automatically be sorted
            int minIndex = i;
            // Find minimum in unsorted array
            for (int j = i + 1; j <= n - 1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap minimum with first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    // Bubble sort

}
