public class EvenAfterOdd {

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        // Your code goes here
        if (head == null || head.next == null) {
            return head;
        }

        Node<Integer> oddHead = new Node<>(-1);
        Node<Integer> evenHead = new Node<>(-1);

        Node<Integer> oddCurrent = oddHead;
        Node<Integer> evenCurrent = evenHead;

        Node<Integer> current = head;

        while (current != null) {
            if (current.data % 2 != 0) {
                oddCurrent.next = current;
                oddCurrent = oddCurrent.next;
            } else {
                evenCurrent.next = current;
                evenCurrent = evenCurrent.next;
            }
            current = current.next;
        }

        oddCurrent.next = evenHead.next;
        evenCurrent.next = null;

        return oddHead.next;
    }

}
