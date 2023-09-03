package PriorityQueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Ksmallest {

    public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
        // Write your code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(input);

        for (int i = 0; i < k; i++) {
            pq.add(input[i]);
        }

        for (int i = k; i < n; i++) {
            if (input[i] < pq.peek()) {
                pq.poll();
                pq.add(input[i]);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }

}
