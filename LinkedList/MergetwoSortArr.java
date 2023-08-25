public class MergetwoSortArr {
    public static Node<Integer> mergeTwoSorteds(Node<Integer> head1, Node<Integer> head2) {
        // Your code goes here

        Node dummy = new Node(-1);
        Node current = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return dummy.next;
    }

    // if (head1 == null) {
    // return head2;
    // }
    // if (head2 == null) {
    // return head1;
    // }

    // Node merged;

    // if (head1.data <= head2.data) {
    // merged = head1;
    // merged.next = mergeTwoSorteds(head1.next, head2);
    // } else {
    // merged = head2;
    // merged.next = mergeTwoSorteds(head1, head2.next);
    // }

    // return merged;
    // }

}
