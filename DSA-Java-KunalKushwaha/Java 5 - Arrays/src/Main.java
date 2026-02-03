public class Main {
    public static void main(String[] args) {
        // Arrays
//        syntax:
//        datatype[] variable name = new datatype[size]
        int[] rnos = new int[5];
//        or directly
        int[] rnos2 = {23,12,45,32,15};

        int[] ros; // declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)
        System.out.println(ros[2]);

        String[] arr = new String[4];
        System.out.println(arr[2]);
    }
}