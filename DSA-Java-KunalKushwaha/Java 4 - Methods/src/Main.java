import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        return type name (arguments) {
            //body
            return statement;
          }
         */

        Scanner input  = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter a number: ");
        num1 = input.nextInt();
        System.out.print("Enter another number: ");
        num2 = input.nextInt();
        sum = num1 + num2;
        System.out.println("The sum is : " + sum);

    }
}