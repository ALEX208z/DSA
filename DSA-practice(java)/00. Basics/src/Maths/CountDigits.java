package Maths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 156;
        System.out.println(count(n));
    }

    static int count(int n) {
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;  // for extracting last digit
            count++;
            n /= 10;
        }
        return count;
    }
    // Time complexity = log(base10(n))
    // If the no. of iteration is based on division, time complexity will be logarithmic always

    // for negative numbers : remove the sign first
    // n = Maths.abs(n);

    // Using strings (not preferred in leetcode)
    // int digits = String.valueOf(Maths.abs(n)).length()
}
