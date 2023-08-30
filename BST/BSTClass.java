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
        // Private instance variable to store the root node of the BST
        private Node root;
    
        // Private inner class representing a node in the BST
        private class Node {
            int data;
            Node left, right;
    
            // Constructor to initialize a node with given data
            Node(int data) {
                this.data = data;
            }
        }
    
        // Public method to insert a new element into the BST
        public void insert(int data) {
            // Update the root after inserting the element
            root = insert(root, data);
        }
    
        // Private recursive method to insert a new element into the BST
        private Node insert(Node root, int data) {
            // If the current node is null, create a new node with the given data
            if (root == null) {
                return new Node(data);
            }
    
            // Compare the data with the current node's data and insert accordingly
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
    
            // Return the updated root after insertion
            return root;
        }
    
        // Public method to remove an element from the BST
        public void remove(int data) {
            // Update the root after removing the element
            root = remove(root, data);
        }
    
        // Private recursive method to remove an element from the BST
        private Node remove(Node root, int data) {
            // If the current node is null, return null
            if (root == null) {
                return null;
            }
    
            // Compare the data with the current node's data and remove accordingly
            if (data < root.data) {
                root.left = remove(root.left, data);
            } else if (data > root.data) {
                root.right = remove(root.right, data);
            } else {
                // If the node has both children, replace with the minimum element from the right subtree
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
    
                // Find the minimum value in the right subtree
                root.data = findMinValue(root.right);
                // Remove the duplicate value from the right subtree
                root.right = remove(root.right, root.data);
            }
    
            // Return the updated root after removal
            return root;
        }
    
        // Private method to find the minimum value in a subtree
        private int findMinValue(Node root) {
            while (root.left != null) {
                root = root.left;
            }
            return root.data;
        }
    
        // Public method to print the BST in the specified format
        public void printTree() {
            // Print the tree starting from the root
            printTree(root);
        }
    
        // Private recursive method to print the BST in the specified format
        private void printTree(Node root) {
            // If the current node is null, return
            if (root == null) {
                return;
            }
    
            // Print the current node's data
            System.out.print(root.data + ":");
    
            // Print the left child's data if it exists
            if (root.left != null) {
                System.out.print("L:" + root.left.data + ",");
            }
    
            // Print the right child's data if it exists
            if (root.right != null) {
                System.out.print("R:" + root.right.data);
            }
    
            // Move to the next line
            System.out.println();
    
            // Recursively print the left and right subtrees
            printTree(root.left);
            printTree(root.right);
        }
    
        // Public method to search for an element in the BST
        public boolean search(int data) {
            // Start the search from the root
            return search(root, data);
        }
    
        // Private recursive method to search for an element in the BST
        private boolean search(Node root, int data) {
            // If the current node is null, return false
            if (root == null) {
                return false;
            }
    
            // Compare the data with the current node's data
            if (root.data == data) {
                return true;
            } else if (data < root.data) {
                // Search in the left subtree if the data is smaller
                return search(root.left, data);
            } else {
                // Search in the right subtree if the data is larger
                return search(root.right, data);
            }
        }
    }
    

    }

}
