import javax.crypto.spec.HKDFParameterSpec;
import java.util.Arrays;

public class FindMin {
    public static void main(String[] args) {
      int[] arr = {18, 12, 7, 3, 14, 28};
      System.out.println(min(arr));
    }

    // find the min element in the array
    static int min(int[] arr) {

        // handler null {array doesn't exist} or empty {exist but empty} array
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int min = arr[0]; // mental model : Assume that the first element is the minimum and then try to disprove it.

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
