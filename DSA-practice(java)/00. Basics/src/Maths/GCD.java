package Maths;

public class GCD {
    public static void main(String[] args) {
       int a = 20;
       int b = 40;
       System.out.println(greatestCommonDivisor(a,b));
    }

    static int greatestCommonDivisor(int a, int b) {
        int gcd = 1;
//        for (int i = 1; i <= Math.min(a,b); i++) {
//            if (a % i == 0 && b % i == 0) {
//                gcd = i;
//            }
//        }

        // faster way
        for (int i = Math.min(a,b); i >= 1; i--){
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
}

// Euclidean Algorithm
