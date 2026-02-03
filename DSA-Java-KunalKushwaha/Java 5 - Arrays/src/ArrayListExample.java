import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Syntax
       ArrayList<Integer> list = new ArrayList<>(5);

       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

        System.out.println(list.contains(7));
        System.out.println(list);
        list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        // input
        for (int i= 10; i < 15; i++) {
            list.add(i);
            System.out.println(list);
        }

    }
}
