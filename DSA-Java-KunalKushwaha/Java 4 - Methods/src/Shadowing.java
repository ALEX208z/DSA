public class Shadowing {
    static int x = 90; // this will be shadowed in line 7
    public static void main(String[] args) {

        System.out.println(x);  // 90
        int x; // the class variable at line 2 is shadowed by this
//        System.out.println(x);   // scope will begin when value is initialized
        x = 40;
        System.out.println(x);  // 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
