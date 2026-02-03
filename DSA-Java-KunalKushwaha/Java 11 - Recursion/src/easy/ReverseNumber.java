package easy;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        reverse1(n);
        System.out.println(sum);
    }

    // recursive approach
    static int sum = 0;
    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n/10);
    }

    static int reverse2(int n) {
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



    // iterative approach practice
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            rev = rev * 10 + lastDigit;
            n /= 10;
        }
        return rev;
    }
}

// Digit problems always follow this pattern:
//digit = n % 10
//n = n / 10