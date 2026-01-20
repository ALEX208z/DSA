package Maths;

public class Prime {
    public static void main(String[] args){
        int n = 100;
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " " + prime(i));
        }
//        System.out.println(prime(n));
    }


    // Maths.Prime number : A number which has exactly 2 factors (1 & itself)
    static boolean prime(int n) {
        if (n < 2) return false;

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) return false;
            c++;
        }
        return true;
    }

}
