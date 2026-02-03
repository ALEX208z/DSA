package easy;

public class Palindrome {
    public static void main(String[] args) {
        int n = 1212;
        System.out.println(palindrome2(n));

    }

    static int rev(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }
    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits - 1)) + helper(n/10, digits-1);
    }

    static boolean palindrome(int n) {
        return n == rev(n);
    }


    // iterative approach
    static boolean palindrome2(int n) {
        int original = n;
        int rev = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev == original;
    }

}
