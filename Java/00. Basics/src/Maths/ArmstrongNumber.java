package Maths;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 1634;
        System.out.println(armstrong(n));
    }

    static boolean armstrong(int n) {
        int original = n;
        int sum = 0;

        int digits = countDigits(n);

        while (n > 0) {
            int lastDigit = n % 10;
            sum += Math.pow(lastDigit, digits);
            n /= 10;
        }
        return original == sum;
        // Armstrong number (or narcissist number) is a number that equals the sum of its own digits, each raised to the power of the total number of digits in the numbers
    }

    static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}
