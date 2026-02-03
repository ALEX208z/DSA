import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//        greeting();
//        String message = greeting2();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String personalised = greet(name);
        System.out.println(personalised);

    }
//    static void greeting() {
//        System.out.println("Hello World");
//    }

//    static String greeting2() {
//        String greeting =  "Hello World2";
//        return greeting;

    static String greet(String name) {
        String message = "Hello, " + name;
        return message;
    }
}
