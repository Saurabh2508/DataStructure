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
public class PreOrderTraversal {
    class Node{
        int key;
        Node left,right;
        public Node(int key)
        {
            this.key=key;
            left=right=null;
        }
    }
    Node root=null;
    public void insert(int key)
    {
        root=insertRec(root,key);
    }
    Node insertRec(Node root,int key)
    {
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        if(key<root.key)
        {
            root.left=insertRec(root.left,key);
        }else if(key>root.key){
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    public void preOrder()
    {
        PreOrderRec(root);
    }
    void PreOrderRec(Node root)
    {
        if(root!=null)
        {
        System.out.print(root.key+" ");
        PreOrderRec(root.left);
        PreOrderRec(root.right);
        }
    }
    public static void main(String[] args) {
        PreOrderTraversal tree=new PreOrderTraversal();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
        
        tree.preOrder();
    }
}
