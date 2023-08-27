package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    public class Stack {
        private Queue<Integer> primaryQueue;
        private Queue<Integer> secondaryQueue;

        public Stack() {
            primaryQueue = new LinkedList<>();
            secondaryQueue = new LinkedList<>();
        }

        public int getSize() {
            return primaryQueue.size();
        }

        public boolean isEmpty() {
            return primaryQueue.isEmpty();
        }

        public void push(int element) {
            primaryQueue.add(element);
        }

        public int pop() {
            if (primaryQueue.isEmpty()) {
                return -1;
            }

            while (primaryQueue.size() > 1) {
                secondaryQueue.add(primaryQueue.remove());
            }

            int poppedData = primaryQueue.remove();

            Queue<Integer> temp = primaryQueue;
            primaryQueue = secondaryQueue;
            secondaryQueue = temp;

            return poppedData;
        }

        public int top() {
            if (primaryQueue.isEmpty()) {
                return -1;
            }

            while (primaryQueue.size() > 1) {
                secondaryQueue.add(primaryQueue.remove());
            }

            int topData = primaryQueue.peek();

            secondaryQueue.add(primaryQueue.remove());
            Queue<Integer> temp = primaryQueue;
            primaryQueue = secondaryQueue;
            secondaryQueue = temp;

            return topData;
        }

    }

}
