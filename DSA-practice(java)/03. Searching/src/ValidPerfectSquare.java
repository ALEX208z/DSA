// https://leetcode.com/problems/valid-perfect-square
// Leetcode 367

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {

        if (num < 2) return true;

        int start = 1;
        int end = num / 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid; // prevent overflow

            if (square == num) {
                return true;
            } else if (square < num) {
                start = mid + 1; // move right
            } else {
                end = mid - 1; // move left
            }
        }
        return false;
    }
}
