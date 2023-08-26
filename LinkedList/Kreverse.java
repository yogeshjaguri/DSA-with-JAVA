public class Kreverse {
    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        // Your code goes here
        if (head == null || k <= 1) {
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> next = null;
        Node<Integer> prev = null;
        int count = 0;

        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (next != null) {
            head.next = kReverse(next, k);
        }

        return prev;

    }

}
