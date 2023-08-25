public class MergeSort {

    public static Node<Integer> mergeSort(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = findMiddle(head);
        Node secondHalf = mid.next;
        mid.next = null;

        Node sortedFirstHalf = mergeSort(head);
        Node sortedSecondHalf = mergeSort(secondHalf);

        return merge(sortedFirstHalf, sortedSecondHalf);
    }

    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static Node<Integer> merge(Node<Integer> l1, Node<Integer> l2) {
        Node<Integer> dummy = new Node<Integer>(-1);
        Node<Integer> current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        return dummy.next;
    }

}
