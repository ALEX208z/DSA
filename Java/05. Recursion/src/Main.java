// Recursion practice

public class Main {
    public static void main(String[] args) {
//        print1(5);
//        printRecursion1(5);
//        printRecursion2(1);
//        printNto1(5);

        mystery(3);
    }



    // print from 1 - N using iteration
    static void print1(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }
    }


    // print from 1 - N using recursion
    static void printRecursion1(int n) {
        if (n == 0) {  // base case       | it tells when to stop the recursive function.
            return;                    // return means exit the function immediately without doing anything else
        }
        printRecursion1(n-1);  // recursive case
        System.out.println(n);
//        printRecursion1(n-1);  // for print numbers in reverse from 5 we need to first print and after use recursive case with adjustments.
    }


    static void printRecursion2(int n) { // what if we want to print base case
        if (n == 5) {
            System.out.println(n);  // Print 5 before returning
            return;
        }
        System.out.println(n);
        printRecursion2(n+1);
    }


    static void printNto1 (int n) {
        if (n == 0) return;  // base case : stop at 0
        System.out.println(n); // print n first
        printNto1(n-1);     // then print (n-1)...
    }



    static void mystery(int n) {
        if (n == 0) return;     // base case
        mystery(n-1);        // first recursive call
        System.out.println(n);  // print current n
        mystery(n-1);        // second recursive call (same as first)
    }

    // mystery(3)
    //├── mystery(2)           ← FIRST call for n=3
    //│   ├── mystery(1)       ← FIRST call for n=2
    //│   │   ├── mystery(0)   ← FIRST call for n=1 → BASE CASE (returns)
    //│   │   │   └── return
    //│   │   ├── print(1)     ← Print 1
    //│   │   └── mystery(0)   ← SECOND call for n=1 → BASE CASE
    //│   │       └── return
    //│   ├── print(2)         ← Print 2
    //│   └── mystery(1)       ← SECOND call for n=2 (same as above!)
    //│       ├── mystery(0)   → return
    //│       ├── print(1)     ← Print 1 (again!)
    //│       └── mystery(0)   → return
    //├── print(3)             ← Print 3
    //└── mystery(2)           ← SECOND call for n=3 (same as first mystery(2) above!)
    //    ├── mystery(1)       → prints 1
    //    ├── print(2)         ← Print 2 (again!)
    //    └── mystery(1)       → prints 1


    // Binary tree structure:
    //       3
    //      / \
    //     2   2
    //    / \ / \
    //   1  1 1  1
    //
    //Print order (in-order traversal): 1 2 1 3 1 2 1
}
