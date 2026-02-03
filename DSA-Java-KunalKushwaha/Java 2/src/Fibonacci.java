import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);



//        int n = in.nextInt();
//
//        if (n == 0) {
//            System.out.println(0);
//            return;
//        }
//
//        int a = 0, b = 1;
//
//        for (int i = 2; i <= n; i++) {
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//
//        System.out.println(b);

    }
}
