package Saurabh.Trees;

public class InsertionInBST {

    class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
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
        if (root.data > data) {
            root.left = insertRec(root.left, data);
        } else {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    void inOrder() {
        inOrderRec(root);
    }

    void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
    void insertNew(int data)
    {
        insertNewRec(root,data);
    }
    void insertNewRec(Node root,int data)
    {
        Node prev=null;
        while(root!=null)
        {
            prev=root;
            if(root.data==data)
            {
                System.out.println("This data is already present");
                return;
            }
            else if(root.data>data)
            {
                root=root.left;
            }
            else
            {
                root=root.right;
            }
        }
        if(data<prev.data)
        {
            prev.left=new Node(data);
        }
        else
        {
            prev.right=new Node(data);
        }
    }
    public static void main(String[] args) {
        InsertionInBST tree = new InsertionInBST();
        tree.insert(40);
        tree.insert(70);
//        tree.insert(20);
//        tree.insert(50);
        tree.insert(30);
        tree.insert(80);
        tree.insert(60);

        tree.inOrder();
        System.out.println();
        
        tree.insertNew(50);
        tree.insertNew(20);
        
        tree.inOrder();
    }
}
