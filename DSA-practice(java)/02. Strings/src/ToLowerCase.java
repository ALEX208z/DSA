// https://leetcode.com/problems/to-lower-case
// leetcode 709

public class ToLowerCase {
    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(toLowerCase(word));

    }


    static String toLowerCase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            // Check if character is uppercase A-Z
            if (c >= 'A' && c <= 'Z') {
                // Convert to lowercase by adding 32
                // 'A' = 65, 'a' = 97, difference = 32
                chars[i] = (char) (c + 32);
            }
        }
        return new String (chars);
    }

}
