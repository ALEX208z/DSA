import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] num = {1,4,5,7,9};
        change(num);
        System.out.println(Arrays.toString(num));

    }
    static void change(int[] arr) {
        arr[0] = 99;  // if you make a change to the object via this ref variable, same object will be changed
    }
}
