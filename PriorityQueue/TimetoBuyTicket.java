package PriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TimetoBuyTicket {

    public static int buyTicket(int input[], int k) {
        /*
         * Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a); // Use max heap

        Queue<Integer> queue = new LinkedList<>();
        int n = input.length;

        for (int i = 0; i < n; i++) {
            maxHeap.add(input[i]);
            queue.add(i);
        }

        int time = 0;

        while (!maxHeap.isEmpty()) {
            int frontPriority = maxHeap.peek();
            int frontIndex = queue.peek();

            if (frontPriority == input[frontIndex]) {
                maxHeap.poll();
                queue.poll();
                time++;

                if (frontIndex == k) {
                    break;
                }
            } else {
                maxHeap.poll();
                maxHeap.add(frontPriority);
                queue.poll();
                queue.add(frontIndex);
            }
        }

        return time;

    }

}
