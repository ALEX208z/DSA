// https://leetcode.com/problems/sqrtx?envType=problem-list-v2&envId=binary-search
// Leetcode 69

public class SQRT {

    public int mySqrt(int x) {
        if (x < 2) return x;

        int start = 1;
        int end = x / 2;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;

            if (square == x) {
//                ans = mid; this is wrong !!!
                return mid;
            } else if (square < x) {
                ans = mid; // store best so far
                start = mid + 1; // try bigger
            } else {
                end = mid - 1; // go smaller
            }
        }
        return ans;
    }

    // If the value is valid, and you want maximum valid answer move right.
    // If condition is satisfied, store mid and move right; if exact match, return immediately
}
