import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Ayush";
        char target = 'A';
        System.out.println(linearSearchString(name, target));
//        System.out.println(Arrays.toString(name.toCharArray()));
    }

    // using for each --------------------------
    static boolean linearSearchString(String str, char target){
        if (str == null || str.isEmpty()){
            return false;
        }
        for (char ch :  str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }


    // using traditional for loop ----------------
//    static boolean linearSearchString(String str, char target) {
//        if (str.length() == 0) {
//            return false;
//        }
//        for (int i = 0; i < str.length(); i++){
//            if (target == str.charAt(i)) {
//                return true;
//            }
//        }
//        return false;
//    }
}
