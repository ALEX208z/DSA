package easy;

public class Sum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(5));

    }

    static int sum(int n) {
        if (n == 1) return 1;  // base case

        return n + sum(n - 1);  // recursive case
    }
}
