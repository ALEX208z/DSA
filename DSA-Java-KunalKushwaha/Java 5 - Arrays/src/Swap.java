import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {12,1,2,4,3,5,9};
//        swap(arr,2, 3);
        reverse(arr);
    }
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
//        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;

            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }

}
