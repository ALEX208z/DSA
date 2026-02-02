// https://leetcode.com/problems/valid-palindrome
// leetcode 125

public class ValidPalindrome {
    public static void main(String[] args) {

    }

    static boolean isPalindrome(String s) {
        // Step 1: Initialize two pointers
        int left = 0;                  // Start from beginning
        int right = s.length() - 1;    // Start from end

        // Step 2: Continue until pointers meet or cross
        while (left < right) {         // Stop when left >= right

            // Step 3: Skip non-alphanumeric from LEFT
            // Keep moving left pointer rightwards until we find valid character
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;  // Skip this character, move to next
            }
            // After this loop: left points to valid alphanumeric character
            // OR left == right (pointers met)

            // Step 4: Skip non-alphanumeric from RIGHT
            // Keep moving right pointer leftwards until we find valid character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;  // Skip this character, move to previous
            }
            // After this loop: right points to valid alphanumeric character
            // OR left == right (pointers met)

            // Step 5: Compare the two valid characters
            // Convert both to lowercase for case-insensitive comparison
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;  // Not a palindrome
            }

            // Step 6: Move pointers inward for next comparison
            left++;   // Move left pointer rightwards
            right--;  // Move right pointer leftwards
        }

        // Step 7: If we reach here, all comparisons matched
        return true;  // It's a palindrome!
    }
}
