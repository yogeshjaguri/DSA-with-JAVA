package Stack;

import java.util.Stack;

public class BracketBalanced {
    public static boolean isBalanced(String expression) {
        // Your code goes here
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }

}
