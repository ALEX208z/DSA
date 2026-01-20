// Striver array easy

public class FindLargestElement {
    public static void main(String[] args) {
        int[] nums = {2,3,6,-8,5};
        System.out.println(findLargest(nums));
    }

    static int findLargest(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[0]) {
                max = arr[i];
            }
        }
        return max;
    }

}
