package easy;

public class Concept {
    public static void main(String[] args) {
        fun(5);

    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        fun(n--);  // infinite recursion
        fun(--n);

        // n-- vs --n

        // n-- will pass the value of n first and then subtract it
        // --n will subtract first and then pass
    }

}
