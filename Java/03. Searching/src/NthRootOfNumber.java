// REVIEW 🔍
// Striver


public class NthRootOfNumber {
    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        System.out.println(nthRoot(n, m));  // Should print 3
    }

    public static int nthRoot(int n, int m) {
        // Edge cases
        if (m == 0) return 0;
        if (m == 1) return 1;

        int low = 1;
        int high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Calculate mid^n with overflow check
            long ans = 1;
            boolean overflow = false;

            for (int i = 0; i < n; i++) {
                if (ans > m / mid) {  // Check for potential overflow
                    overflow = true;
                    break;
                }
                ans *= mid;
            }

            if (overflow || ans > m) {
                // mid^n is too large
                high = mid - 1;
            } else if (ans < m) {
                // mid^n is too small
                low = mid + 1;
            } else {
                // Found exact root
                return mid;
            }
        }

        return -1;
    }
}


// Whenever applying binary search on answers, whatever minimum value that be the starting answer assign it to start and whatever you think can be the highest answer assign that to high