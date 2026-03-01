import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (!bracketsMatching(stack.peek(), ch)) {
                    return false;
                }

                stack.pop();   // brackets match so remove opening brackets
            }
        }
        return stack.isEmpty();
    }

    private boolean bracketsMatching(char c, char d) {
        return (c == '(' && d == ')') ||
                (c == '{' && d == '}') ||
                (c == '[' && d == ']');
    }
}
