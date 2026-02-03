package easy;

public class CountZeros {
    public static void main(String[] args) {
        int n = 30204;
//        System.out.println(countZeros(n));
        System.out.println(count(n));

    }

    // recursive approach
    static int count(int n){
        return helper(n,0);
    }
    // special pattern, how to pass a value to above calls
    private static int helper(int n, int c) {
        if (n==0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }


    // iterative approach
    static int countZeros(int n) {
        int count = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            if (lastDigit == 0) {
                count++;
            }
            n /= 10;
        }
        return count;
    }
}
