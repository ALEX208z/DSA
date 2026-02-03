public class Comparision {
    public static void main(String[] args) {
        String a = "Ayush";
        String b = "Ayush";

        // ==
        System.out.println(a == b);

        String name1 = new String ("Ayush");
        String name2 = new String ("Ayush");

        System.out.println(name1 == name2);  // for checking if ref variables are pointing to sasme object
        System.out.println(name1.equals(name2)); // for checking values

        System.out.println(name1.charAt(0));

    }
}
