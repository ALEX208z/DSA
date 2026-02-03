package easy;

public class Nto1 {
    public static void main(String[] args) {
        int n = 5;
        fun(n);
        funRev(n);
    }

    static void fun(int n) {
        if (n == 0) { // base case
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n) {
        if (n == 0) {
            return;
        }
        fun(n-1);
        System.out.println(n);
    }

    static void funBoth(int n) {
        if (n == 0) { // Base case
            return;
        }
        System.out.println(n);
        funBoth(n - 1);  // Recursive case
        System.out.println(n);
    }
}
