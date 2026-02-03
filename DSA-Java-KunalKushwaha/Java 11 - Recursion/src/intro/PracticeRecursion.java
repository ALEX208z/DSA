package intro;

public class PracticeRecursion {
    public static void main(String[] args) {
        // print for one to ten using recursion
//        print(10);
        System.out.println(factorial(5));
    }

    static void print(int n) {
        if(n == 0) return;
        print(n - 1);
        System.out.println(n);
//        print(n - 1);
    }


    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;

        return n * factorial(n - 1);
    }
}
