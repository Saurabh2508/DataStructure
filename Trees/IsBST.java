package Saurabh.Trees;

public class IsBST {

    static class Node {

        int key;
        Node left, right;

        public Node(int data) {
            this.key = data;
            right = left = null;
        }
    }
    Node root = null;
    static int prev = Integer.MIN_VALUE;
    static boolean isBstUtil(Node root) {
        if (root != null) {
            if (!isBstUtil(root.left)) {
                return false;
            }
            if (root.key <= prev) {
                return false;
            }
            prev = root.key;
            return isBstUtil(root.right);
        }
        return true;
    }

    static boolean isBst(Node root) {
        return isBstUtil(root);
    }

    public static void main(String[] args) {
        IsBST tree = new IsBST();
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(15);
        root.left.left = new Node(1);
        root.left.right = new Node(4);
        if (isBst(root)) {
            System.out.println("Is Bst");
        } else {
            System.out.println("Not a Bst");
        }

    }
}
