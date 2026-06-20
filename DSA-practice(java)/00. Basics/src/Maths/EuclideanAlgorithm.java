package Maths;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a = 40;
        int b = 20;
        System.out.println(gcd(a,b));
    }

    static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) a = a % b;
            else b = b % a;
        }
        if (a == 0) return b;
        return a;
    }

    // If one is number is 0, then the other is gcd\
    // a > b
    // gcd(a,b) == gcd(a - b, b) ........
    // gcd(a,b) == gcd(a % b, b)
    // greater % smaller till one of them is 0.
}
