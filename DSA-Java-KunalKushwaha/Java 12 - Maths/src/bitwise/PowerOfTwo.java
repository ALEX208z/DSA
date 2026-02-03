package bitwise;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 1; // note: fix for n = 0
        boolean ans = (n & (n - 1)) == 0; // it proves power of 2
        System.out.println(ans);
    }

}
