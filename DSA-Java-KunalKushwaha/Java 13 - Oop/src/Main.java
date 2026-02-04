import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students : {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student Ayush;
//        Ayush = new Student();

        Student Ayush = new Student(15,"Anshuman Ayush",85.4f);
        Student Alex = new Student(11,"Alex Summers", 90.3f);

//        Ayush.rno = 13;
//        Ayush.name = "Anshuman Ayush";
//        Ayush.marks = 85.4f;

//         Ayush.changeName("Travel lover");
//         Ayush.greeting();


        System.out.println(Ayush.rno);
        System.out.println(Ayush.name);
        System.out.println(Ayush.marks);

        Student random = new Student ();
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);
    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 90;

    // we need a way to add the values of the above
    // properties object by object

    // we need one word to access every object

    void greeting() {
        System.out.println("Hello! My name is  " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student (Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }

    Student() {
        // this is how you call a constructor from another constructor
        // internally : new Student (13, "default person", 100.0f);
        this(13, "default person", 100.0f);

    }

        // Stundent aman = new Student (17, "Aman", 89.7f);
        // here, this will be replaced with aman
        Student (int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

}
