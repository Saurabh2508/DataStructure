package Saurabh.Trees;

public class AVLTree {

    class AVL {

        AVL left, right;
        int data;
        int height;

        public AVL(int data) {
            this.data = data;
            height = 1;
            left = right = null;
        }
    }

    class Stack {

        AVL[] arr = new AVL[10];
        int tos;
    }
    static AVL root = null;

    AVL append(AVL pr, int x) {
        AVL p = null;
        if (pr == null) {
            p = new AVL(x);
            return p;
        }
        if (x > pr.data) {
            pr.right = append(pr.right, x);
        } else {
            pr.left = append(pr.left, x);
        }
        pr.height = nodeHeight(pr);
        if (balanceFactor(pr) == 2 && balanceFactor(pr.left) == 1) {
            return LLrotation(pr);
        } else if (balanceFactor(pr) == 2 && balanceFactor(pr.left) == -1) {
            return LRrotation(pr);
        }
        return pr;
    }

    int nodeHeight(AVL p) {
        int hl, hr;
        hl = p != null && p.left != null ? p.left.height : 0;
        hr = p != null && p.right != null ? p.right.height : 0;
        return hl > hr ? hl + 1 : hr + 1;
    }

    int balanceFactor(AVL p) {
        int hl, hr;
        hl = p != null && p.left != null ? p.left.height : 0;
        hr = p != null && p.right != null ? p.right.height : 0;

        return hl - hr;
    }

    AVL LLrotation(AVL p) {
        AVL pl = p.left;
        AVL plr = pl.right;
        pl.right = p;
        p.left = plr;
        p.height = nodeHeight(p);
        p.height = nodeHeight(pl);
        if (root == p) {
            root = pl;
        }
        return pl;
    }

    AVL LRrotation(AVL p) {
        AVL pl = p.left;
        AVL plr = pl.right;
        pl.right = plr.left;
        p.left = plr.right;
        p.left = pl;
        plr.right = p;
        pl.height = nodeHeight(pl);
        p.height = nodeHeight(p);
        plr.height = nodeHeight(plr);
        if (root == p) {
            root = plr;
        }
        return plr;
    }

    void push(Stack p, AVL t) {
        p.tos++;
        p.arr[p.tos] = t;
    }

    AVL pop(Stack p) {
        if (p.tos == -1) {
            return null;
        }
        return p.arr[p.tos--];
    }

    void inOrder(AVL p) {
        Stack s = new Stack();
        s.tos = -1;
        while (p != null) {
            while (p != null) {
                push(s, p);
                p = p.left;
            }
            p = pop(s);
            while (p != null) {
                System.out.println("Data:"+p.data + ",Height:" + p.height);
                if (p.right != null) {
                    p = p.right;
                    break;
                }
                p = pop(s);
            }
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        root = tree.append(root, 20);
        tree.append(root, 11);
        tree.append(root, 5);
        tree.append(root, 3);
        tree.append(root, 19);
        tree.append(root, 17);

        tree.inOrder(root);

    }
}
