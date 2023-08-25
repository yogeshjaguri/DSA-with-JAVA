
public class DeleteNode {
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        if (head == null || pos < 0) {
            return head;
        }

        if (pos == 0) {
            return head.next;
        }

        head.next = deleteNodeRec(head.next, pos - 1);
        return head;
    }}

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static Node<Integer> takeInput() throws IOException {
        Node<Integer> head = null, tail = null;

        String[] datas = br.readLine().trim().split("\\s");

        int i = 0;
        while (i < datas.length && !datas[i].equals("-1")) {
            int data = Integer.parseInt(datas[i]);
            Node<Integer> newNode = new Node<Integer>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            i += 1;
        }

        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        int t = Integer.parseInt(br.readLine().trim());

        while (t > 0) {
            
            Node<Integer> head = takeInput();
            int pos = Integer.parseInt(br.readLine().trim());

            Node<Integer> newHead = Solution.deleteNodeRec(head, pos);
            print(newHead);
            
            t -= 1;
        }

    }
