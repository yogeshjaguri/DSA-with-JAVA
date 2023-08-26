public class SwapTwo {
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        // Your code goes here
        if (i == j || head == null || head.next == null) {
            return head;
        }

        Node<Integer> current = head;
        Node<Integer> prevI = null;
        Node<Integer> prevJ = null;
        Node<Integer> nodeI = null;
        Node<Integer> nodeJ = null;

        int index = 0;
        while (current != null) {
            if (index == i) {
                nodeI = current;
            } else if (index == j) {
                nodeJ = current;
            }

            if (nodeI == null) {
                prevI = current;
            }

            if (nodeJ == null) {
                prevJ = current;
            }

            current = current.next;
            index++;
        }

        if (nodeI == null || nodeJ == null) {
            return head;
        }

        if (prevI != null) {
            prevI.next = nodeJ;
        } else {
            head = nodeJ;
        }

        if (prevJ != null) {
            prevJ.next = nodeI;
        } else {
            head = nodeI;
        }

        Node<Integer> temp = nodeI.next;
        nodeI.next = nodeJ.next;
        nodeJ.next = temp;

        return head;
    }
}