package PriorityQueue;

import java.util.PriorityQueue;

import ArrayList.ArrayList;

public class KLargestElemnts {

    public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		PriorityQueue<Integer> pq = new PriorityQueue<>(k);
		  for (int i = 0; i < k; i++) {
            pq.offer(input[i]);
        }

        for (int i = k; i < input.length; i++) {
            if (input[i] > pq.peek()) {
                pq.poll();
                pq.offer(input[i]);
            }
        }

       ArrayList<Integer> result = new ArrayList()<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        return result;
		
	}

}
