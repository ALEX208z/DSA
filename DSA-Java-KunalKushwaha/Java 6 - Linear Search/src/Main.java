public class Main {
    public static void main(String[] args) {
        int[] numbers = {23,45,87,567,1634};
        int target = 1634;
        int ans = linearSearch(numbers, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {
            if (arr == null || arr.length == 0) {
                return -1;
        }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
    }
}