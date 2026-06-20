package Maths;

public class Palindrome {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(palindrome(n));

    }
    static boolean palindrome(int n) {
        if (n < 0) return false; // negative numbers are not palindromes

        int reverseNum = 0;
        int original = n; // as n becomes 0 at the end of extraction of digits, so we need to store original value in another variable
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n /= 10;

//          if (n == reverseNum) return true; // this is wrong as n is shrinking
        }

        return original == reverseNum;
    }
}
