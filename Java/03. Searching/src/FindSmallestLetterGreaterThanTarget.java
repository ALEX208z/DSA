// https://leetcode.com/problems/find-smallest-letter-greater-than-target
// Leetcode 744

public class FindSmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';

        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1; // possible answer, go left
            } else {
                start = mid + 1; // too small, go right
            }
        }
//        if (start == letters.length) {
//            return letters[0];
//        }
//        return letters[start];
        // instead of above do this shortcut

        return letters[start % letters.length];


    }
    // 🧾 One-line takeaway (MEMORIZE)
    //This is an “upper bound” binary search with wrap-around using modulo.
}
