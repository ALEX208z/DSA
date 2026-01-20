package Maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 9877;
        System.out.println(reverse(n));
    }

    static int reverse(int n) {
        int reverseNumber = 0;
        while (n > 0) {
            int lastDigit = n % 10; // extraction of digits happens in reverse
            reverseNumber = (reverseNumber * 10) + lastDigit;
            n /= 10; // remove the last digit
        }

        return reverseNumber;
    }

}
