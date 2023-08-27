package Queue;

public class ReverseKElements {
    if (input.isEmpty() || k <= 0 || k > input.size()) {
        return input; 
    }

    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < k; i++) {
        stack.push(input.poll());
    }

    while (!stack.isEmpty()) {
        input.add(stack.pop());
    }

    for (int i = 0; i < input.size() - k; i++) {
        input.add(input.poll());
    }

    return input;

}
