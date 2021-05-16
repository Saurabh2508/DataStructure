package Saurabh.Trees;

public class BinarySearchTree {

    class Node {

        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void postOrder() {
        postOrderRec(root);
    }

    void postOrderRec(Node root) {
        if (root != null) {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key + " ");
        }
    }

    public void preOrder() {
        PreOrderRec(root);
    }

    void PreOrderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            PreOrderRec(root.left);
            PreOrderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("PreOrder Traversal:");
        tree.preOrder();
        System.out.println();

        System.out.println("InOrder Traversal:");
        tree.inorder();
        System.out.println();

        System.out.println("PostOrder Traversal:");
        tree.postOrder();
        System.out.println();

    }
}
