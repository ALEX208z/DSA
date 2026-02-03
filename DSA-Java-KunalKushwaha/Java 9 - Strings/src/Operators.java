import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));

        System.out.println("a" + 1);
        // integer will be converted to Integer that will call toString()
        // this is same as after a few steps: "a" + "1"

        System.out.println("Ayush" + new ArrayList<>());
        System.out.println("Ayush" + new Integer(45));

//        System.out.println(new ArrayList<>() = new Integer(45));
        // the operator '+' in java is only defined for primitives and when one the values is a string.
        String ans = new ArrayList<>() + "" + new Integer(45);
        System.out.println(ans);
    }
}
