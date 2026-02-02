// 🔍
// https://leetcode.com/problems/koko-eating-bananas
// leetcode 875 ; different approach on leetcode


public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile,pile);
        }

        int start = 1;
        int end = maxPile;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (isPossible(piles, h, mid)) {
                end = mid; // try to minimize
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean isPossible(int[] piles, int h, int k) {
        int time = 0;
        for (int pile : piles) {
            time += (pile + k - 1) / k;  // Ceiling division

            // Early termination
            if (time > h) return false;
        }
        return true;
    }
}
