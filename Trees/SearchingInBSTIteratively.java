/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Saurabh.Trees;

import java.util.Scanner;

/**
 *
 * @author Saurabh Rajput
 */
public class SearchingInBSTIteratively {
    class Node{
        int key;
        Node left,right;
        public Node(int data)
        {
            this.key=data;
            left=right=null;
        }
    }
    Node root=null;
    void insert(int data)
    {
        root=insertRec(root,data);
    }
    Node insertRec(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(root.key>data)
        {
            root.left=insertRec(root.left,data);
        }
        else if(root.key<data)
        {
            root.right=insertRec(root.right,data);
        }
        return root;
    }
    void inOrder()
    {
        inOrderRec(root);
    }
    void inOrderRec(Node root)
    {
        if(root!=null)
        {
            inOrderRec(root.left);
            System.out.print(root.key+" ");
            inOrderRec(root.right);
        }
    }
    boolean isPresent(int data)
    {
        return isPresentRec(root,data);
    }
    boolean isPresentRec(Node root, int data)
    {
        while(root!=null)
        {
        if(root.key==data)
        {
            return true;
        }
        else if(root.key>data)
        {
            root=root.left;
        }
        else
        {
            root=root.right;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        SearchingInBSTIteratively tree = new SearchingInBSTIteratively();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        tree.inOrder();
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
