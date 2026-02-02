public class PracticeFactorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
        System.out.println(factorial2(n));
        System.out.println(factorial3(n));

    }


    // Print factorial using iteration
    static int factorial(int n) {
        int fact = 1;
        // multiply by each number from 1 to n
        for (int i = 1; i <= n; i++) {
            fact *= i; // multiply by i
        }
        return fact;
    }


    // printing factorial using loop
    static int factorial2(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }


    // printing factorial using recursion
    static int factorial3(int n) {
        if (n <= 1) return 1;            // base case
        return n * factorial3(n-1);   // recursive case
    }
}
