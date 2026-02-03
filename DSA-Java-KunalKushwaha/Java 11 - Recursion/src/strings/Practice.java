package strings;

import java.sql.SQLOutput;

public class Practice {
    public static void main(String[] args) {
        String str = "aabcda";
        char ch = 'a';
        System.out.println(removeCharSB(str, ch));
        System.out.println(removeCharConcat(str,ch));
        System.out.println(practiceSkip(str,ch));

    }

    // 1. Using StringBuilder (most efficient)
    // Time complexity : O(n) | Space complexity : O(n)
    static String removeCharSB(String str, char ch) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != ch) {
                sb.append(current);
            }
        }
        return sb.toString();
    }
    // Usage : removeCharSB("aabcda",'a') = "bcd"



    // 2. Using String Concatenation (simple but inefficient)
    // Time complexity : O(n^2) {each + creates new String}  | Space Complexity : O(n)
    static String removeCharConcat(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != ch) {
                result += current;  // Creates new string each time
            }
        }
        return result;
    }


    // 3. Using Recursion
    // time complexity : O(n^2)  |  space complexity : O(n)
    static String removeCharRecursive(String str, char ch) {
        // Base case
        if (str.length() == 0) {
            return "";
        }

        // Check first character
        char first = str.charAt(0);
        String remaining = str.substring(1);

        // Recursive call
        if (first == ch) {
            return removeCharRecursive(remaining,ch);
        } else {
            return first + removeCharRecursive(remaining,ch);
        }
    }




    static String practiceSkip(String str, char ch) {
        StringBuilder words = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (current != ch) {
                words.append(current);
            }
        }
        return words.toString();
    }

}
