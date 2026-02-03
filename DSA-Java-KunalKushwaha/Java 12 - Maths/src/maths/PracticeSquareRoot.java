package maths;

public class PracticeSquareRoot {
    public static void main(String[] args) {
        int n = 49;
        System.out.println(squareRoot(n));

    }

    static int squareRoot(int n) {
        if (n < 2) return n;

        int start = 1;
        int end = n / 2;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long)mid * mid;

            if (square <= n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

}
