package Maths;// look into this problem again...

import java.util.ArrayList;
import java.util.List;

public class PrintDivisors {
    public static void main(String[] args) {
        int n = 36;
        printDivisors(n);
    }


//    static void printDivisors(int n) {
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                System.out.print(i + " ");
//            }
//        }
//    }


    // function to get all the divisors
    static List<Integer> printDivisors(int n) {
        // optimal way to do it.

        // Create a list to store divisors
        List<Integer> res = new ArrayList<>();

        // Loop from 1 to square root of n
        for (int i = 1; i * i <= n; i++) {
            // Check if i divides n
            if (n % i == 0) {
                // Add i to result
                res.add(i);

                // If n/i is different from i and n/i too
                if (i != n/i) {
                    res.add(n/i);
                }
            }
        }
        // Return the list of divisors
        return res;

    }


}
