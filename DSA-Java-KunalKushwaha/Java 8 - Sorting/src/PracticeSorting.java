import java.util.Arrays;

public class PracticeSorting {
    public static void main(String[] args) {
        int[] arr = {-1, -5, 33 , 0, 99};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }



    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

}
