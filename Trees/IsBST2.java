package Saurabh.Trees;

class Node1 {

    int data;
    Node1 left, right;

    public Node1(int item) {
        this.data = item;
        left = right = null;
    }
}

public class IsBST2 {

    Node1 root;

    boolean isBST() {
        return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    boolean isBSTUtil(Node1 node, int min, int max) {
        if (node == null) {
            return true;
        }
        if (node.data < min || node.data > max) {
            return false;
        }

        return (isBSTUtil(node.left, min, node.data - 1)) && isBSTUtil(node.right, node.data + 1, max);
    }

    public static void main(String[] args) {
        IsBST2 tree = new IsBST2();
        tree.root = new Node1(4);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(5);
        tree.root.left.left = new Node1(1);
        tree.root.left.right = new Node1(3);

        if (tree.isBST()) {
            System.out.println("Is BST");
        } else {
            System.out.println("Not a BST");
        }
    }
}
