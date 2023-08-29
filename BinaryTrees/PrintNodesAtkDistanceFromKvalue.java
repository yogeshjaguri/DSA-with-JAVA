package BinaryTrees;

public class PrintNodesAtkDistanceFromKvalue {
    public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
        // Your code goes here
        printNodesAtDistanceK(root, node, k);
    }

    private static int printNodesAtDistanceK(BinaryTreeNode<Integer> node, int targetValue, int k) {
        if (node == null) {
            return -1;
        }

        if (node.data == targetValue) {
            printNodesAtKDistance(node, k);
            return 0;
        }

        int leftDistance = printNodesAtDistanceK(node.left, targetValue, k);

        if (leftDistance != -1) {
            if (leftDistance + 1 == k) {
                System.out.println(node.data);
            } else {
                printNodesAtKDistance(node.right, k - leftDistance - 2);
            }
            return leftDistance + 1;
        }

        int rightDistance = printNodesAtDistanceK(node.right, targetValue, k);

        if (rightDistance != -1) {
            if (rightDistance + 1 == k) {
                System.out.println(node.data);
            } else {
                printNodesAtKDistance(node.left, k - rightDistance - 2);
            }
            return rightDistance + 1;
        }

        return -1;
    }

    private static void printNodesAtKDistance(BinaryTreeNode<Integer> node, int k) {
        if (node == null || k < 0) {
            return;
        }

        if (k == 0) {
            System.out.println(node.data);
            return;
        }

        printNodesAtKDistance(node.left, k - 1);
        printNodesAtKDistance(node.right, k - 1);
    }

}
