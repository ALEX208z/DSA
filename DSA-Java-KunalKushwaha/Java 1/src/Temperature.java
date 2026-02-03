package src;

import java.util.Scanner;

public class Temperature {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temp in C: ");
        float tempC = input.nextFloat();

        float tempF = (tempC + 9/5) + 32;
        System.out.println("Temperature in F: " + tempF);
    }
}
