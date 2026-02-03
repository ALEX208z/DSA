package src;

import java.util.Scanner;

public class TypeCasting {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        //  Type casing
        int num1 = (int)(65.34f);
//        System.out.println(num1);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);  // 257 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

//        int number = 'a';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (f/c) - (d*s);
        // float * int - double = double
        System.out.println((f*b) + " " + (f/c) + " " + (d*s));
        System.out.println(result);



    }
}
