public class PracticeFibonacci {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibo1(n));
        System.out.println(fibo(n));
    }



    // printing Fibonacci using iteration
    static int fibo1(int n) {
        if (n == 0 || n == 1) return n;

        int previous = 0;  // F(0)
        int current = 1;   // F(1)

        for (int i = 2; i <=n; i++) {
            int next = previous + current; // f(i) = f(i-1) + f(i-2)
            previous = current;            // move forward
            current = next;
        }
        return current;
    }



    // printing Fibonacci using recursion
    static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n-1) + fibo(n-2);
    }
}
