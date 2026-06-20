public class PracticeDigits {
    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(sum(n));

        int n = 1346;
//        int ans = digitsSum(n);
        int ans = digitProduct(n);
        System.out.println(ans);

        digitReverse(n);

    }


    static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n-1);
    }


    static int digitsSum(int n) {
        if (n == 0) return 0;
        return n%10 + digitsSum(n/10);
    }


    static int digitProduct(int n) {
        if (n == 0) return 1;
        return n%10 * digitProduct(n/10);
    }



    static void digitReverse(int n) {
        if (n == 0) return;
        System.out.print(n%10);  // print last digit first
        digitReverse(n/10);  // then process remaining digits
    }


}
