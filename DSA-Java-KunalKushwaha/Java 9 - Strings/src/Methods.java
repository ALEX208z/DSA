import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Anshuman Ayush";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.trim().length());
        System.out.println(name.replaceAll("\\s","").length());
    }
}
