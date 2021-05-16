package Saurabh.Trees;

class Node2 {

    int data;
    Node2 left, right;

    public Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

public class IsBST3 {

    Node2 root;

    Node2 prev;

    boolean isBST() {
        prev = null;
        return isBST(root);
    }

    boolean isBST(Node2 node) {
        if (node != null) {
            if (!isBST(node.left)) {
                return false;
            }
            if (prev != null && node.data <= prev.data) {
                return false;
            }

            prev = node;
            return isBST(node.right);
        }
        return true;
    }
    void inOrder()
    {
        inOrderRec(root);
    }
    void inOrderRec(Node2 root){
        if(root!=null)
        {
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }
    public static void main(String[] args) {
        IsBST3 tree = new IsBST3();
        tree.root = new Node2(4);
        tree.root.left = new Node2(2);
        tree.root.right = new Node2(5);
        tree.root.left.left = new Node2(1);
        tree.root.left.right = new Node2(3);
        
        
        if (tree.isBST()) {
            System.out.println("IS BST");
        } else {
            System.out.println("NOT A BST");
        }
        tree.inOrder();
    }
}
