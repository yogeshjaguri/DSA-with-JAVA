package PriorityQueue;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static int kthLargest(int n, int[] input, int k) {
        // Write your code here
        // Arrays.sort(input);
        // return input[n-k];

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            if (input[i] > pq.peek()) {
                pq.poll();
                pq.add(input[i]);
            }
        }

        return pq.peek();

    }

}
