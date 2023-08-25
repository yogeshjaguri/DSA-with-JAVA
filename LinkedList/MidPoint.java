public class MidPoint {

    public class Solution {

        public static Node<Integer> midPoint(Node<Integer> head) {
            // Your code goes here
            if (head == null) {
                return null;
            }

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

    }

}
