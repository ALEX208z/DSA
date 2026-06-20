public class ValidPalindromeII {
    public static void main(String[] args) {

    }


    static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // When characters don't match
            if (s.charAt(left) != s.charAt(right)) {
                // Try deleting left character OR right character
                return isPalindrome(s,left+1,right) || isPalindrome(s,left,right-1);
            }
            // Character match, move pointer
            left++;
            right--;
        }
        // String is already palindrome
        return true;
    }

    // Helper method to check if substring is palindrome
    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
