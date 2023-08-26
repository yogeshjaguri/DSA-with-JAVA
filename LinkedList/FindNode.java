public class FindNode {

    public static int findNodeRec(Node<Integer> head, int n) {
        // Your code goes here
        return NodeIndexRec(head, n, 0);
    }

    public static int NodeIndexRec(Node<Integer> head, int n, int index) {
        if (head == null) {
            return -1;
        }

        if (head.data == n) {
            return index;
        }

        return NodeIndexRec(head.next, n, index + 1);

    }

}
