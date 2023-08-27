package Queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        // Your code goes here
        Stack<Integer> stack = new Stack<>();

        while (!input.isEmpty()) {
            stack.push(input.poll());
        }

        while (!stack.isEmpty()) {
            input.add(stack.pop());
        }
    }

}
