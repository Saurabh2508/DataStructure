package Saurabh.Trees;

import java.util.Scanner;

public class SearchingInBST {

    class Node {

        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }
    Node root = null;

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.key) {
            root.left = insertRec(root.left, data);
        } else if (root.key < data) {
            root.right = insertRec(root.right, data);
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

    boolean isPresent(int data) {
        return isPresentRec(root, data);
    }

    boolean isPresentRec(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.key == data) {
            return true;
        } else if (root.key > data) {
            return isPresentRec(root.left, data);
        } else if (root.key < data) {
            return isPresentRec(root.right, data);
        }
        return false;
    }

    public static void main(String[] args) {
        SearchingInBST tree = new SearchingInBST();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();
        System.out.println();
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter value you want to search:");
        int n = kb.nextInt();
        if (tree.isPresent(n)) {
            System.out.println("data is present");
        } else {
            System.out.println("Not present");
        }
    }
}
