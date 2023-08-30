package BST;

public class BSTClass {
    /*
     * Binary Tree Node class
     * 
     * class BinaryTreeNode<T> {
     * T data;
     * BinaryTreeNode<T> left;
     * BinaryTreeNode<T> right;
     * public BinaryTreeNode(T data)
     * {
     * this.data = data;
     * }
     * }
     */

    /*
     * Main Method being used internally
     * public static void main(String[] args) throws IOException {
     * BinarySearchTree bst = new BinarySearchTree();
     * int choice, input;
     * int q = Integer.parseInt(br.readLine());
     * while (q-- > 0) {
     * st = new StringTokenizer(br.readLine());
     * choice = Integer.parseInt(st.nextToken());
     * switch (choice) {
     * case 1:
     * input = Integer.parseInt(st.nextToken());
     * bst.insert(input);
     * break;
     * case 2:
     * input = Integer.parseInt(st.nextToken());
     * bst.remove(input);
     * break;
     * case 3:
     * input = Integer.parseInt(st.nextToken());
     * System.out.println(bst.search(input));
     * break;
     * default:
     * bst.printTree();
     * break;
     * }
     * }
     * }
     */

    public class BinarySearchTree {

        private BinaryTreeNode<Integer> root;

        public void insert(int data) {
            root = insert(root, data);
        }

        private BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int data) {
            if (root == null) {
                return new BinaryTreeNode<>(data);
            }

            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }

            return root;
        }

        public void remove(int data) {
            root = remove(root, data);
        }

        private BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root, int data) {
            if (root == null) {
                return null;
            }

            if (data < root.data) {
                root.left = remove(root.left, data);
            } else if (data > root.data) {
                root.right = remove(root.right, data);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }

                root.data = findMinValue(root.right);
                root.right = remove(root.right, root.data);
            }

            return root;
        }

        private int findMinValue(BinaryTreeNode<Integer> root) {

            while (root.left != null) {
                root = root.left;
            }
            return root.data;
        }

        public void printTree() {
            printTree(root);
        }

        private void printTree(BinaryTreeNode<Integer> root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + ":");

            if (root.left != null) {
                System.out.print("L:" + root.left.data + ",");
            }

            if (root.right != null) {
                System.out.print("R:" + root.right.data);
            }

            System.out.println();

            printTree(root.left);
            printTree(root.right);
        }

        public boolean search(int data) {
            return search(root, data);
        }

        private boolean search(BinaryTreeNode<Integer> root, int data) {
            if (root == null) {
                return false;
            }

            if (root.data == data) {
                return true;
            } else if (data < root.data) {
                return search(root.left, data);
            } else {
                return search(root.right, data);
            }
        }

    }

}
