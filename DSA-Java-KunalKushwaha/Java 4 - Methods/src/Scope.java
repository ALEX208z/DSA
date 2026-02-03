public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
//            int a = 70; already initialized outside the block in the same method, hence you cannot initialize again
            a = 70;  // reassign the original ref variable to some other value
            System.out.println(a);
            int c = 30;  // values initialized in this block will remain in block
        }
//        System.out.println(c);  // cannot use outside the block
    }
}
