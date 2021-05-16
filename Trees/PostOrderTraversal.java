/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Trees;

/**
 *
 * @author Saurabh Rajput
 */
public class PostOrderTraversal {

    class Node {

        int key;
        Node left, right;

        public Node(int key) {
            this.key = key;
            left = right = null;
        }
    }
    Node root = null;

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
    void postOrder()
    {
        postOrderRec(root);
    }
    void postOrderRec(Node root)
    {
        if(root!=null)
        {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.key+" ");
        }
    }
    public static void main(String[] args) {
        PostOrderTraversal tree=new PostOrderTraversal();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(70);
        tree.insert(40); 
        tree.insert(80);
        tree.insert(60);
        
        tree.postOrder();
    }
}
