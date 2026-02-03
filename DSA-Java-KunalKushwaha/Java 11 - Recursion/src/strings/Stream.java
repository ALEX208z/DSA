package strings;

public class Stream {
    public static void main(String[] args) {
        skip("","baccdac");
        System.out.println(skip("baccadc"));
        System.out.println(skipApple("bacappleac"));
        System.out.println(skipAppNotApple("nagmamcappcdapple"));

    }

    // Approaches----------

    // 1. Pass the ans string in the argument
    static void skip(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        if (ch == 'a') {
            skip(processed,unprocessed.substring(1));
        } else {
            skip(processed + ch,unprocessed.substring(1));
        }
    }


    // 2. Create the ans variable in the function body
    static String skip(String unprocessed) {
        if (unprocessed.isEmpty()) {
            return "";
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'a') {
            return skip(unprocessed.substring(1));
        } else {
            return ch + skip(unprocessed.substring(1));
        }
    }


    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }


    static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
