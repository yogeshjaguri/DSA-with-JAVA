public class InsertNode {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data) {
        // Your code goes here
        Node newNode = new Node(data);

        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node current = head;
        int currentPos = 0;

        while (current != null && currentPos < pos - 1) {
            current = current.next;
            currentPos++;
        }

        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = LinkedListUse.createLinkedList();
        LinkedListUse.print(head);
        head = insert(head, 2, 100);
        LinkedListUse.print(head);
    }

}
