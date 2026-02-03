import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        if (n <=1 ) {
            System.out.println("Neither prime not composite");
            return;
        }

        boolean isPrime = true;

        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime ");
        } else {
            System.out.println("Not Prime ");
        }
    }
}