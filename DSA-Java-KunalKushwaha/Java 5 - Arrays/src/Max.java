public class Max {
    public static void main(String[] args) {
        int[] arr = {1,34,56,2,99};
        max(arr);
    }

    // imagine that arr is not empty
    static void max(int[] arr) {
//        int maxVal = arr[0];
//        for( int i = 1; i < arr.length; i++) {
//            if (arr[i] > maxVal) {
//                maxVal = arr[i];
//            }
//        }

        // if there's any negative integer
        if  (arr.length == 0) {
            return;
        }
        int maxVal = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > maxVal) {
                maxVal = x;
            }
        }
        System.out.println(maxVal);
    }
}
