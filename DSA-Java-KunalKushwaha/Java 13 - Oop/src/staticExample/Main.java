package staticExample;

public class Main {
    public static void main(String[] args) {
//        Human Ayush = new Human(22, "Ayush", 100000, false);
//        Human Amrit = new Human (24,"Amrit", 15000, false);
//        Human Bittu = new Human (26, "bittu",40000,true);
//
//        System.out.println(Human.population);
//        System.out.println(Human.population);
//        System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }

    // this is not dependent on objects
    static void fun() {
//        greeting();  // you can't use this because require an instance
        // but the function you are using it in does not depend on the instances

        // you cannot access non static stuff without referencing their instances in a static context

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {greeting();}

    // we know that somehow which is not static, belong to an object
    void greeting() {
        fun();
        System.out.println("Hello world");
    }
}
