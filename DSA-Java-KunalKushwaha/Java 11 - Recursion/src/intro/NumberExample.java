package intro;

public class NumberExample {
    public static void main(String[] args) {
        // write a function that takes in a number and prints it
        // print first 5 numberss: 1 2 3 4 5
        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }
    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }
    // function body here changes
    static void print3(int n) {
        System.out.println(n);
    }
}
