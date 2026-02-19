package introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

//        Integer num = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b);

        System.out.println(a + " " + b);

//         final int bonus = 2;
//        bonus = 3;

        final A Ayush = new A("Anshuman Ayush");
        Ayush.name = "other name";

        // When a non primitive is final, you cannot reassign it.
//        Ayush = new A("new object");

        A obj = new A("Rfsjfnska");

        System.out.println(obj);



    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 18;
    String name;

    public A(String name) {
        System.out.println("object created");
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}
