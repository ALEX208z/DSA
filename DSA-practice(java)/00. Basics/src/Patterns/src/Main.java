package Patterns.src;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello world");
        print8(5);
    }

    static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* "); // print and not println
            }
            System.out.println();  // adds lines after every row
        }
//        System.out.println(5); // anything after the for loop will print in the end just one time

        // output
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
        //* * * * *
    }


    static void print2(int n) {
        // Function to print pattern

        // Outer loop which will loop for the rows
        for(int i = 0; i < n; i++) {

            // Inner looop which loops for the columns
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            // As soon as stars for each iteration are printed, move to the next row and give a line break
            System.out.println();
        }
        // output
        //*
        //* *
        //* * *
        //* * * *
    }


    static void print3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // output
        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5
    }


    static void print4(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // output
        //1
        //2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5
    }


    static void print5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // output
        //* * * * *
        //* * * *
        //* * *
        //* *
        //*
    }


    static void print6(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        // output
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

    }


    static void print7(int n) {
        for (int i = 1; i <= n; i++) {
            // for space - leading space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= 2 * i - 1 ; j++) {
                System.out.print("*");
            }
//            // for space - trailing space
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
            System.out.println();
        }
        // Output
        //    *
        //   ***
        //  *****
        // *******
        //*********

    }


    static void print8(int n) {
        for (int i = 1; i <= n; i++) {
            // printing leading spaces
            for (int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            // print stars
            for (int j = 1; j <= 2 * (n - i) + 1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        // Output
        //*********
        // *******
        //  *****
        //   ***
        //    *

    }




}



