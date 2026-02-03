// https://leetcode.com/problems/find-smallest-letter-greater-than-target?envType=problem-list-v2&envId=binary-search

public class SmallestLetter {
    public static void main(String[] args) {
        // sorted array only
        char[] letters = {'c','f','j'};
        int target = 'f';
        int ans = smallestLetter(letters,target);
        System.out.println(ans);

    }

    // return the index : smallest number >= target
    static int smallestLetter(char[] letters, int target){

        int start = 0;
        int end = letters.length -1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2;
            // might be possible that (start + end) exceeds the rango of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
